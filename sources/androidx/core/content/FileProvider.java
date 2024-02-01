package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import b6.c;
import d.m0;
import d.o0;
import d.z;
import i0.d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;
import t7.t;
import zb.r;

public class FileProvider extends ContentProvider {
    public static final String[] P = {"_display_name", "_size"};
    public static final String Q = "android.support.FILE_PROVIDER_PATHS";
    public static final String R = "root-path";
    public static final String S = "files-path";
    public static final String T = "cache-path";
    public static final String U = "external-path";
    public static final String V = "external-files-path";
    public static final String W = "external-cache-path";
    public static final String X = "external-media-path";
    public static final String Y = "name";
    public static final String Z = "path";

    /* renamed from: a0  reason: collision with root package name */
    public static final String f2197a0 = "displayName";

    /* renamed from: b0  reason: collision with root package name */
    public static final File f2198b0 = new File("/");
    @z("sCache")

    /* renamed from: c0  reason: collision with root package name */
    public static HashMap<String, a> f2199c0 = new HashMap<>();
    public a O;

    public interface a {
        File a(Uri uri);

        Uri b(File file);
    }

    public static class b implements a {

        /* renamed from: a  reason: collision with root package name */
        public final String f2200a;

        /* renamed from: b  reason: collision with root package name */
        public final HashMap<String, File> f2201b = new HashMap<>();

        public b(String str) {
            this.f2200a = str;
        }

        public File a(Uri uri) {
            String encodedPath = uri.getEncodedPath();
            int indexOf = encodedPath.indexOf(47, 1);
            String decode = Uri.decode(encodedPath.substring(1, indexOf));
            String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
            File file = this.f2201b.get(decode);
            if (file != null) {
                File file2 = new File(file, decode2);
                try {
                    File canonicalFile = file2.getCanonicalFile();
                    if (canonicalFile.getPath().startsWith(file.getPath())) {
                        return canonicalFile;
                    }
                    throw new SecurityException("Resolved path jumped beyond configured root");
                } catch (IOException unused) {
                    throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
                }
            } else {
                throw new IllegalArgumentException("Unable to find configured root for " + uri);
            }
        }

        public Uri b(File file) {
            try {
                String canonicalPath = file.getCanonicalPath();
                Map.Entry entry = null;
                for (Map.Entry next : this.f2201b.entrySet()) {
                    String path = ((File) next.getValue()).getPath();
                    if (canonicalPath.startsWith(path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                        entry = next;
                    }
                }
                if (entry != null) {
                    String path2 = ((File) entry.getValue()).getPath();
                    boolean endsWith = path2.endsWith("/");
                    int length = path2.length();
                    if (!endsWith) {
                        length++;
                    }
                    String substring = canonicalPath.substring(length);
                    return new Uri.Builder().scheme(t.f13205o).authority(this.f2200a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(substring, "/")).build();
                }
                throw new IllegalArgumentException("Failed to find configured root that contains " + canonicalPath);
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }

        public void c(String str, File file) {
            if (!TextUtils.isEmpty(str)) {
                try {
                    this.f2201b.put(str, file.getCanonicalFile());
                } catch (IOException e10) {
                    throw new IllegalArgumentException("Failed to resolve canonical path for " + file, e10);
                }
            } else {
                throw new IllegalArgumentException("Name must not be empty");
            }
        }
    }

    public static File a(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    public static Object[] b(Object[] objArr, int i10) {
        Object[] objArr2 = new Object[i10];
        System.arraycopy(objArr, 0, objArr2, 0, i10);
        return objArr2;
    }

    public static String[] c(String[] strArr, int i10) {
        String[] strArr2 = new String[i10];
        System.arraycopy(strArr, 0, strArr2, 0, i10);
        return strArr2;
    }

    public static a d(Context context, String str) {
        a aVar;
        synchronized (f2199c0) {
            aVar = f2199c0.get(str);
            if (aVar == null) {
                try {
                    aVar = h(context, str);
                    f2199c0.put(str, aVar);
                } catch (IOException e10) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e10);
                } catch (XmlPullParserException e11) {
                    throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e11);
                }
            }
        }
        return aVar;
    }

    public static Uri e(@m0 Context context, @m0 String str, @m0 File file) {
        return d(context, str).b(file);
    }

    @SuppressLint({"StreamFiles"})
    @m0
    public static Uri f(@m0 Context context, @m0 String str, @m0 File file, @m0 String str2) {
        return e(context, str, file).buildUpon().appendQueryParameter(f2197a0, str2).build();
    }

    public static int g(String str) {
        if (r.f25096b.equals(str)) {
            return c.A;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException("Invalid mode: " + str);
    }

    public static a h(Context context, String str) throws IOException, XmlPullParserException {
        b bVar = new b(str);
        ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(str, 128);
        if (resolveContentProvider != null) {
            XmlResourceParser loadXmlMetaData = resolveContentProvider.loadXmlMetaData(context.getPackageManager(), Q);
            if (loadXmlMetaData != null) {
                while (true) {
                    int next = loadXmlMetaData.next();
                    if (next == 1) {
                        return bVar;
                    }
                    if (next == 2) {
                        String name = loadXmlMetaData.getName();
                        File file = null;
                        String attributeValue = loadXmlMetaData.getAttributeValue((String) null, "name");
                        String attributeValue2 = loadXmlMetaData.getAttributeValue((String) null, "path");
                        if (R.equals(name)) {
                            file = f2198b0;
                        } else if (S.equals(name)) {
                            file = context.getFilesDir();
                        } else if (T.equals(name)) {
                            file = context.getCacheDir();
                        } else if (U.equals(name)) {
                            file = Environment.getExternalStorageDirectory();
                        } else if (V.equals(name)) {
                            File[] k10 = d.k(context, (String) null);
                            if (k10.length > 0) {
                                file = k10[0];
                            }
                        } else if (W.equals(name)) {
                            File[] j10 = d.j(context);
                            if (j10.length > 0) {
                                file = j10[0];
                            }
                        } else if (X.equals(name)) {
                            File[] externalMediaDirs = context.getExternalMediaDirs();
                            if (externalMediaDirs.length > 0) {
                                file = externalMediaDirs[0];
                            }
                        }
                        if (file != null) {
                            bVar.c(attributeValue, a(file, attributeValue2));
                        }
                    }
                }
            } else {
                throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
            }
        } else {
            throw new IllegalArgumentException("Couldn't find meta-data for provider with authority " + str);
        }
    }

    public void attachInfo(@m0 Context context, @m0 ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        } else if (providerInfo.grantUriPermissions) {
            this.O = d(context, providerInfo.authority.split(";")[0]);
        } else {
            throw new SecurityException("Provider must grant uri permissions");
        }
    }

    public int delete(@m0 Uri uri, @o0 String str, @o0 String[] strArr) {
        return this.O.a(uri).delete() ? 1 : 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0012, code lost:
        r3 = android.webkit.MimeTypeMap.getSingleton().getMimeTypeFromExtension(r3.getName().substring(r0 + 1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getType(@d.m0 android.net.Uri r3) {
        /*
            r2 = this;
            androidx.core.content.FileProvider$a r0 = r2.O
            java.io.File r3 = r0.a(r3)
            java.lang.String r0 = r3.getName()
            r1 = 46
            int r0 = r0.lastIndexOf(r1)
            if (r0 < 0) goto L_0x0027
            java.lang.String r3 = r3.getName()
            int r0 = r0 + 1
            java.lang.String r3 = r3.substring(r0)
            android.webkit.MimeTypeMap r0 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r3 = r0.getMimeTypeFromExtension(r3)
            if (r3 == 0) goto L_0x0027
            return r3
        L_0x0027:
            java.lang.String r3 = "application/octet-stream"
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.FileProvider.getType(android.net.Uri):java.lang.String");
    }

    public Uri insert(@m0 Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    public boolean onCreate() {
        return true;
    }

    @SuppressLint({"UnknownNullness"})
    public ParcelFileDescriptor openFile(@m0 Uri uri, @m0 String str) throws FileNotFoundException {
        return ParcelFileDescriptor.open(this.O.a(uri), g(str));
    }

    public Cursor query(@m0 Uri uri, @o0 String[] strArr, @o0 String str, @o0 String[] strArr2, @o0 String str2) {
        int i10;
        File a10 = this.O.a(uri);
        String queryParameter = uri.getQueryParameter(f2197a0);
        if (strArr == null) {
            strArr = P;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i11 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i11] = "_display_name";
                i10 = i11 + 1;
                objArr[i11] = queryParameter == null ? a10.getName() : queryParameter;
            } else if ("_size".equals(str3)) {
                strArr3[i11] = "_size";
                i10 = i11 + 1;
                objArr[i11] = Long.valueOf(a10.length());
            }
            i11 = i10;
        }
        String[] c10 = c(strArr3, i11);
        Object[] b10 = b(objArr, i11);
        MatrixCursor matrixCursor = new MatrixCursor(c10, 1);
        matrixCursor.addRow(b10);
        return matrixCursor;
    }

    public int update(@m0 Uri uri, ContentValues contentValues, @o0 String str, @o0 String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}
