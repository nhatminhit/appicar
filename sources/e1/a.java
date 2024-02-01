package e1;

import d.m0;
import d.o0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class a {

    /* renamed from: d  reason: collision with root package name */
    public static final String f6724d = "AtomicFile";

    /* renamed from: a  reason: collision with root package name */
    public final File f6725a;

    /* renamed from: b  reason: collision with root package name */
    public final File f6726b;

    /* renamed from: c  reason: collision with root package name */
    public final File f6727c;

    public a(@m0 File file) {
        this.f6725a = file;
        this.f6726b = new File(file.getPath() + ".new");
        this.f6727c = new File(file.getPath() + ".bak");
    }

    public static void g(@m0 File file, @m0 File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to delete file which is a directory ");
            sb2.append(file2);
        }
        if (!file.renameTo(file2)) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Failed to rename ");
            sb3.append(file);
            sb3.append(" to ");
            sb3.append(file2);
        }
    }

    public static boolean i(@m0 FileOutputStream fileOutputStream) {
        try {
            fileOutputStream.getFD().sync();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public void a() {
        this.f6725a.delete();
        this.f6726b.delete();
        this.f6727c.delete();
    }

    public void b(@o0 FileOutputStream fileOutputStream) {
        if (fileOutputStream != null) {
            i(fileOutputStream);
            try {
                fileOutputStream.close();
            } catch (IOException unused) {
            }
            if (!this.f6726b.delete()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to delete new file ");
                sb2.append(this.f6726b);
            }
        }
    }

    public void c(@o0 FileOutputStream fileOutputStream) {
        if (fileOutputStream != null) {
            i(fileOutputStream);
            try {
                fileOutputStream.close();
            } catch (IOException unused) {
            }
            g(this.f6726b, this.f6725a);
        }
    }

    @m0
    public File d() {
        return this.f6725a;
    }

    @m0
    public FileInputStream e() throws FileNotFoundException {
        if (this.f6727c.exists()) {
            g(this.f6727c, this.f6725a);
        }
        if (this.f6726b.exists() && this.f6725a.exists() && !this.f6726b.delete()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to delete outdated new file ");
            sb2.append(this.f6726b);
        }
        return new FileInputStream(this.f6725a);
    }

    @m0
    public byte[] f() throws IOException {
        FileInputStream e10 = e();
        try {
            byte[] bArr = new byte[e10.available()];
            int i10 = 0;
            while (true) {
                int read = e10.read(bArr, i10, bArr.length - i10);
                if (read <= 0) {
                    return bArr;
                }
                i10 += read;
                int available = e10.available();
                if (available > bArr.length - i10) {
                    byte[] bArr2 = new byte[(available + i10)];
                    System.arraycopy(bArr, 0, bArr2, 0, i10);
                    bArr = bArr2;
                }
            }
        } finally {
            e10.close();
        }
    }

    @m0
    public FileOutputStream h() throws IOException {
        if (this.f6727c.exists()) {
            g(this.f6727c, this.f6725a);
        }
        try {
            return new FileOutputStream(this.f6726b);
        } catch (FileNotFoundException unused) {
            if (this.f6726b.getParentFile().mkdirs()) {
                try {
                    return new FileOutputStream(this.f6726b);
                } catch (FileNotFoundException e10) {
                    throw new IOException("Failed to create new file " + this.f6726b, e10);
                }
            } else {
                throw new IOException("Failed to create directory for " + this.f6726b);
            }
        }
    }
}
