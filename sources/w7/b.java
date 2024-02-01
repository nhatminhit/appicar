package w7;

import d.m0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class b {

    /* renamed from: c  reason: collision with root package name */
    public static final String f14692c = "AtomicFile";

    /* renamed from: a  reason: collision with root package name */
    public final File f14693a;

    /* renamed from: b  reason: collision with root package name */
    public final File f14694b;

    public static final class a extends OutputStream {
        public final FileOutputStream O;
        public boolean P = false;

        public a(File file) throws FileNotFoundException {
            this.O = new FileOutputStream(file);
        }

        public void close() throws IOException {
            if (!this.P) {
                this.P = true;
                flush();
                try {
                    this.O.getFD().sync();
                } catch (IOException e10) {
                    p.m("AtomicFile", "Failed to sync file descriptor:", e10);
                }
                this.O.close();
            }
        }

        public void flush() throws IOException {
            this.O.flush();
        }

        public void write(int i10) throws IOException {
            this.O.write(i10);
        }

        public void write(@m0 byte[] bArr) throws IOException {
            this.O.write(bArr);
        }

        public void write(@m0 byte[] bArr, int i10, int i11) throws IOException {
            this.O.write(bArr, i10, i11);
        }
    }

    public b(File file) {
        this.f14693a = file;
        this.f14694b = new File(file.getPath() + ".bak");
    }

    public void a() {
        this.f14693a.delete();
        this.f14694b.delete();
    }

    public void b(OutputStream outputStream) throws IOException {
        outputStream.close();
        this.f14694b.delete();
    }

    public boolean c() {
        return this.f14693a.exists() || this.f14694b.exists();
    }

    public InputStream d() throws FileNotFoundException {
        e();
        return new FileInputStream(this.f14693a);
    }

    public final void e() {
        if (this.f14694b.exists()) {
            this.f14693a.delete();
            this.f14694b.renameTo(this.f14693a);
        }
    }

    public OutputStream f() throws IOException {
        if (this.f14693a.exists()) {
            if (this.f14694b.exists()) {
                this.f14693a.delete();
            } else if (!this.f14693a.renameTo(this.f14694b)) {
                p.l("AtomicFile", "Couldn't rename file " + this.f14693a + " to backup file " + this.f14694b);
            }
        }
        try {
            return new a(this.f14693a);
        } catch (FileNotFoundException e10) {
            File parentFile = this.f14693a.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create directory " + this.f14693a, e10);
            }
            try {
                return new a(this.f14693a);
            } catch (FileNotFoundException e11) {
                throw new IOException("Couldn't create " + this.f14693a, e11);
            }
        }
    }
}
