package xg;

import ch.a0;
import ch.p;
import ch.z;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public interface a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f24580a = new C0489a();

    /* renamed from: xg.a$a  reason: collision with other inner class name */
    public class C0489a implements a {
        public a0 a(File file) throws FileNotFoundException {
            return p.k(file);
        }

        public z b(File file) throws FileNotFoundException {
            try {
                return p.f(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return p.f(file);
            }
        }

        public void c(File file) throws IOException {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                int length = listFiles.length;
                int i10 = 0;
                while (i10 < length) {
                    File file2 = listFiles[i10];
                    if (file2.isDirectory()) {
                        c(file2);
                    }
                    if (file2.delete()) {
                        i10++;
                    } else {
                        throw new IOException("failed to delete " + file2);
                    }
                }
                return;
            }
            throw new IOException("not a readable directory: " + file);
        }

        public boolean d(File file) {
            return file.exists();
        }

        public void e(File file, File file2) throws IOException {
            f(file2);
            if (!file.renameTo(file2)) {
                throw new IOException("failed to rename " + file + " to " + file2);
            }
        }

        public void f(File file) throws IOException {
            if (!file.delete() && file.exists()) {
                throw new IOException("failed to delete " + file);
            }
        }

        public z g(File file) throws FileNotFoundException {
            try {
                return p.a(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return p.a(file);
            }
        }

        public long h(File file) {
            return file.length();
        }
    }

    a0 a(File file) throws FileNotFoundException;

    z b(File file) throws FileNotFoundException;

    void c(File file) throws IOException;

    boolean d(File file);

    void e(File file, File file2) throws IOException;

    void f(File file) throws IOException;

    z g(File file) throws FileNotFoundException;

    long h(File file);
}
