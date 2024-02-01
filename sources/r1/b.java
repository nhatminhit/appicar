package r1;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import d.o0;
import d.t0;

@t0(19)
public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final String f12057a = "DocumentFile";

    /* renamed from: b  reason: collision with root package name */
    public static final int f12058b = 512;

    public static boolean a(Context context, Uri uri) {
        return context.checkCallingOrSelfUriPermission(uri, 1) == 0 && !TextUtils.isEmpty(g(context, uri));
    }

    public static boolean b(Context context, Uri uri) {
        if (context.checkCallingOrSelfUriPermission(uri, 2) != 0) {
            return false;
        }
        String g10 = g(context, uri);
        int n10 = n(context, uri, "flags", 0);
        if (TextUtils.isEmpty(g10)) {
            return false;
        }
        if ((n10 & 4) != 0) {
            return true;
        }
        if (!"vnd.android.document/directory".equals(g10) || (n10 & 8) == 0) {
            return !TextUtils.isEmpty(g10) && (n10 & 2) != 0;
        }
        return true;
    }

    public static void c(@o0 AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    public static boolean d(Context context, Uri uri) {
        ContentResolver contentResolver = context.getContentResolver();
        boolean z10 = false;
        Cursor cursor = null;
        try {
            cursor = contentResolver.query(uri, new String[]{"document_id"}, (String) null, (String[]) null, (String) null);
            if (cursor.getCount() > 0) {
                z10 = true;
            }
            return z10;
        } catch (Exception e10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed query: ");
            sb2.append(e10);
            return false;
        } finally {
            c(cursor);
        }
    }

    public static long e(Context context, Uri uri) {
        return o(context, uri, "flags", 0);
    }

    @o0
    public static String f(Context context, Uri uri) {
        return p(context, uri, "_display_name", (String) null);
    }

    @o0
    public static String g(Context context, Uri uri) {
        return p(context, uri, "mime_type", (String) null);
    }

    @o0
    public static String h(Context context, Uri uri) {
        String g10 = g(context, uri);
        if ("vnd.android.document/directory".equals(g10)) {
            return null;
        }
        return g10;
    }

    public static boolean i(Context context, Uri uri) {
        return "vnd.android.document/directory".equals(g(context, uri));
    }

    public static boolean j(Context context, Uri uri) {
        String g10 = g(context, uri);
        return !"vnd.android.document/directory".equals(g10) && !TextUtils.isEmpty(g10);
    }

    public static boolean k(Context context, Uri uri) {
        return DocumentsContract.isDocumentUri(context, uri) && (e(context, uri) & 512) != 0;
    }

    public static long l(Context context, Uri uri) {
        return o(context, uri, "last_modified", 0);
    }

    public static long m(Context context, Uri uri) {
        return o(context, uri, "_size", 0);
    }

    public static int n(Context context, Uri uri, String str, int i10) {
        return (int) o(context, uri, str, (long) i10);
    }

    public static long o(Context context, Uri uri, String str, long j10) {
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(uri, new String[]{str}, (String) null, (String[]) null, (String) null);
            if (cursor.moveToFirst() && !cursor.isNull(0)) {
                return cursor.getLong(0);
            }
            c(cursor);
            return j10;
        } catch (Exception e10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed query: ");
            sb2.append(e10);
            return j10;
        } finally {
            c(cursor);
        }
    }

    @o0
    public static String p(Context context, Uri uri, String str, @o0 String str2) {
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(uri, new String[]{str}, (String) null, (String[]) null, (String) null);
            if (cursor.moveToFirst() && !cursor.isNull(0)) {
                return cursor.getString(0);
            }
            c(cursor);
            return str2;
        } catch (Exception e10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed query: ");
            sb2.append(e10);
            return str2;
        } finally {
            c(cursor);
        }
    }
}
