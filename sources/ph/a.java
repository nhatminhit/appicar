package ph;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import ph.e;

public class a implements e.a {

    /* renamed from: a  reason: collision with root package name */
    public static final int f22077a = 5;

    /* renamed from: b  reason: collision with root package name */
    public static final int f22078b = 4096;

    /* renamed from: ph.a$a  reason: collision with other inner class name */
    public static class C0389a {

        /* renamed from: a  reason: collision with root package name */
        public ZipFile f22079a;

        /* renamed from: b  reason: collision with root package name */
        public ZipEntry f22080b;

        public C0389a(ZipFile zipFile, ZipEntry zipEntry) {
            this.f22079a = zipFile;
            this.f22080b = zipEntry;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: ph.a$a} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00ad A[SYNTHETIC, Splitter:B:73:0x00ad] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.content.Context r10, java.lang.String[] r11, java.lang.String r12, java.io.File r13, ph.f r14) {
        /*
            r9 = this;
            r0 = 0
            ph.a$a r1 = r9.d(r10, r11, r12, r14)     // Catch:{ all -> 0x00aa }
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0092
            r10 = r2
        L_0x000a:
            int r11 = r10 + 1
            r4 = 5
            if (r10 >= r4) goto L_0x0085
            java.lang.String r10 = "Found %s! Extracting..."
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x0097 }
            r4[r2] = r12     // Catch:{ all -> 0x0097 }
            r14.m(r10, r4)     // Catch:{ all -> 0x0097 }
            boolean r10 = r13.exists()     // Catch:{ IOException -> 0x0083 }
            if (r10 != 0) goto L_0x0026
            boolean r10 = r13.createNewFile()     // Catch:{ IOException -> 0x0083 }
            if (r10 != 0) goto L_0x0026
            goto L_0x0083
        L_0x0026:
            java.util.zip.ZipFile r10 = r1.f22079a     // Catch:{ FileNotFoundException -> 0x007d, IOException -> 0x0077, all -> 0x006e }
            java.util.zip.ZipEntry r4 = r1.f22080b     // Catch:{ FileNotFoundException -> 0x007d, IOException -> 0x0077, all -> 0x006e }
            java.io.InputStream r10 = r10.getInputStream(r4)     // Catch:{ FileNotFoundException -> 0x007d, IOException -> 0x0077, all -> 0x006e }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x006c, IOException -> 0x006a, all -> 0x0066 }
            r4.<init>(r13)     // Catch:{ FileNotFoundException -> 0x006c, IOException -> 0x006a, all -> 0x0066 }
            long r5 = r9.c(r10, r4)     // Catch:{ FileNotFoundException -> 0x007f, IOException -> 0x0079, all -> 0x0064 }
            java.io.FileDescriptor r7 = r4.getFD()     // Catch:{ FileNotFoundException -> 0x007f, IOException -> 0x0079, all -> 0x0064 }
            r7.sync()     // Catch:{ FileNotFoundException -> 0x007f, IOException -> 0x0079, all -> 0x0064 }
            long r7 = r13.length()     // Catch:{ FileNotFoundException -> 0x007f, IOException -> 0x0079, all -> 0x0064 }
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x004d
            r9.b(r10)     // Catch:{ all -> 0x0097 }
        L_0x0049:
            r9.b(r4)     // Catch:{ all -> 0x0097 }
            goto L_0x0083
        L_0x004d:
            r9.b(r10)     // Catch:{ all -> 0x0097 }
            r9.b(r4)     // Catch:{ all -> 0x0097 }
            r13.setReadable(r3, r2)     // Catch:{ all -> 0x0097 }
            r13.setExecutable(r3, r2)     // Catch:{ all -> 0x0097 }
            r13.setWritable(r3)     // Catch:{ all -> 0x0097 }
            java.util.zip.ZipFile r10 = r1.f22079a     // Catch:{ IOException -> 0x0063 }
            if (r10 == 0) goto L_0x0063
            r10.close()     // Catch:{ IOException -> 0x0063 }
        L_0x0063:
            return
        L_0x0064:
            r11 = move-exception
            goto L_0x0068
        L_0x0066:
            r11 = move-exception
            r4 = r0
        L_0x0068:
            r0 = r10
            goto L_0x0070
        L_0x006a:
            r4 = r0
            goto L_0x0079
        L_0x006c:
            r4 = r0
            goto L_0x007f
        L_0x006e:
            r11 = move-exception
            r4 = r0
        L_0x0070:
            r9.b(r0)     // Catch:{ all -> 0x0097 }
            r9.b(r4)     // Catch:{ all -> 0x0097 }
            throw r11     // Catch:{ all -> 0x0097 }
        L_0x0077:
            r10 = r0
            r4 = r10
        L_0x0079:
            r9.b(r10)     // Catch:{ all -> 0x0097 }
            goto L_0x0049
        L_0x007d:
            r10 = r0
            r4 = r10
        L_0x007f:
            r9.b(r10)     // Catch:{ all -> 0x0097 }
            goto L_0x0049
        L_0x0083:
            r10 = r11
            goto L_0x000a
        L_0x0085:
            java.lang.String r10 = "FATAL! Couldn't extract the library from the APK!"
            r14.l(r10)     // Catch:{ all -> 0x0097 }
            java.util.zip.ZipFile r10 = r1.f22079a     // Catch:{ IOException -> 0x0091 }
            if (r10 == 0) goto L_0x0091
            r10.close()     // Catch:{ IOException -> 0x0091 }
        L_0x0091:
            return
        L_0x0092:
            java.lang.String[] r10 = r9.e(r10, r12)     // Catch:{ Exception -> 0x009a }
            goto L_0x00a4
        L_0x0097:
            r10 = move-exception
            r0 = r1
            goto L_0x00ab
        L_0x009a:
            r10 = move-exception
            java.lang.String[] r13 = new java.lang.String[r3]     // Catch:{ all -> 0x0097 }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x0097 }
            r13[r2] = r10     // Catch:{ all -> 0x0097 }
            r10 = r13
        L_0x00a4:
            ph.c r13 = new ph.c     // Catch:{ all -> 0x0097 }
            r13.<init>(r12, r11, r10)     // Catch:{ all -> 0x0097 }
            throw r13     // Catch:{ all -> 0x0097 }
        L_0x00aa:
            r10 = move-exception
        L_0x00ab:
            if (r0 == 0) goto L_0x00b4
            java.util.zip.ZipFile r11 = r0.f22079a     // Catch:{ IOException -> 0x00b4 }
            if (r11 == 0) goto L_0x00b4
            r11.close()     // Catch:{ IOException -> 0x00b4 }
        L_0x00b4:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ph.a.a(android.content.Context, java.lang.String[], java.lang.String, java.io.File, ph.f):void");
    }

    public final void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public final long c(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        long j10 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                outputStream.flush();
                return j10;
            }
            outputStream.write(bArr, 0, read);
            j10 += (long) read;
        }
    }

    public final C0389a d(Context context, String[] strArr, String str, f fVar) {
        String[] strArr2 = strArr;
        String[] f10 = f(context);
        int length = f10.length;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            ZipFile zipFile = null;
            if (i11 >= length) {
                return null;
            }
            String str2 = f10[i11];
            int i12 = i10;
            while (true) {
                int i13 = i12 + 1;
                if (i12 >= 5) {
                    break;
                }
                try {
                    zipFile = new ZipFile(new File(str2), 1);
                    break;
                } catch (IOException unused) {
                    i12 = i13;
                }
            }
            if (zipFile == null) {
                String str3 = str;
                f fVar2 = fVar;
            } else {
                int i14 = i10;
                while (true) {
                    int i15 = i14 + 1;
                    if (i14 < 5) {
                        int length2 = strArr2.length;
                        int i16 = i10;
                        while (i16 < length2) {
                            String str4 = f.f22087g + File.separatorChar + strArr2[i16] + File.separatorChar + str;
                            Object[] objArr = new Object[2];
                            objArr[i10] = str4;
                            objArr[1] = str2;
                            fVar.m("Looking for %s in APK %s...", objArr);
                            ZipEntry entry = zipFile.getEntry(str4);
                            if (entry != null) {
                                return new C0389a(zipFile, entry);
                            }
                            i16++;
                            i10 = 0;
                        }
                        String str5 = str;
                        f fVar3 = fVar;
                        i14 = i15;
                        i10 = 0;
                    } else {
                        String str6 = str;
                        f fVar4 = fVar;
                        try {
                            zipFile.close();
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
            i11++;
            i10 = 0;
        }
    }

    public final String[] e(Context context, String str) {
        Pattern compile = Pattern.compile(f.f22087g + File.separatorChar + "([^\\" + File.separatorChar + "]*)" + File.separatorChar + str);
        HashSet hashSet = new HashSet();
        for (String file : f(context)) {
            try {
                Enumeration<? extends ZipEntry> entries = new ZipFile(new File(file), 1).entries();
                while (entries.hasMoreElements()) {
                    Matcher matcher = compile.matcher(((ZipEntry) entries.nextElement()).getName());
                    if (matcher.matches()) {
                        hashSet.add(matcher.group(1));
                    }
                }
            } catch (IOException unused) {
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public final String[] f(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr == null || strArr.length == 0) {
            return new String[]{applicationInfo.sourceDir};
        }
        String[] strArr2 = new String[(strArr.length + 1)];
        strArr2[0] = applicationInfo.sourceDir;
        System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
        return strArr2;
    }
}
