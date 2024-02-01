package r1;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import d.o0;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class c extends a {

    /* renamed from: c  reason: collision with root package name */
    public File f12059c;

    public c(@o0 a aVar, File file) {
        super(aVar);
        this.f12059c = file;
    }

    public static boolean w(File file) {
        File[] listFiles = file.listFiles();
        boolean z10 = true;
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    z10 &= w(file2);
                }
                if (!file2.delete()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Failed to delete ");
                    sb2.append(file2);
                    z10 = false;
                }
            }
        }
        return z10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r1 = android.webkit.MimeTypeMap.getSingleton().getMimeTypeFromExtension(r1.substring(r0 + 1).toLowerCase());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String x(java.lang.String r1) {
        /*
            r0 = 46
            int r0 = r1.lastIndexOf(r0)
            if (r0 < 0) goto L_0x001d
            int r0 = r0 + 1
            java.lang.String r1 = r1.substring(r0)
            java.lang.String r1 = r1.toLowerCase()
            android.webkit.MimeTypeMap r0 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r1 = r0.getMimeTypeFromExtension(r1)
            if (r1 == 0) goto L_0x001d
            return r1
        L_0x001d:
            java.lang.String r1 = "application/octet-stream"
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.c.x(java.lang.String):java.lang.String");
    }

    public boolean a() {
        return this.f12059c.canRead();
    }

    public boolean b() {
        return this.f12059c.canWrite();
    }

    @o0
    public a c(String str) {
        File file = new File(this.f12059c, str);
        if (file.isDirectory() || file.mkdir()) {
            return new c(this, file);
        }
        return null;
    }

    @o0
    public a d(String str, String str2) {
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
        if (extensionFromMimeType != null) {
            str2 = str2 + "." + extensionFromMimeType;
        }
        File file = new File(this.f12059c, str2);
        try {
            file.createNewFile();
            return new c(this, file);
        } catch (IOException e10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to createFile: ");
            sb2.append(e10);
            return null;
        }
    }

    public boolean e() {
        w(this.f12059c);
        return this.f12059c.delete();
    }

    public boolean f() {
        return this.f12059c.exists();
    }

    public String k() {
        return this.f12059c.getName();
    }

    @o0
    public String m() {
        if (this.f12059c.isDirectory()) {
            return null;
        }
        return x(this.f12059c.getName());
    }

    public Uri n() {
        return Uri.fromFile(this.f12059c);
    }

    public boolean o() {
        return this.f12059c.isDirectory();
    }

    public boolean q() {
        return this.f12059c.isFile();
    }

    public boolean r() {
        return false;
    }

    public long s() {
        return this.f12059c.lastModified();
    }

    public long t() {
        return this.f12059c.length();
    }

    public a[] u() {
        ArrayList arrayList = new ArrayList();
        File[] listFiles = this.f12059c.listFiles();
        if (listFiles != null) {
            for (File cVar : listFiles) {
                arrayList.add(new c(this, cVar));
            }
        }
        return (a[]) arrayList.toArray(new a[arrayList.size()]);
    }

    public boolean v(String str) {
        File file = new File(this.f12059c.getParentFile(), str);
        if (!this.f12059c.renameTo(file)) {
            return false;
        }
        this.f12059c = file;
        return true;
    }
}
