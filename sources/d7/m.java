package d7;

import java.util.NoSuchElementException;
import t7.o;

public interface m {

    /* renamed from: a  reason: collision with root package name */
    public static final m f6558a = new a();

    public static class a implements m {
        public boolean a() {
            return true;
        }

        public long b() {
            throw new NoSuchElementException();
        }

        public o c() {
            throw new NoSuchElementException();
        }

        public long d() {
            throw new NoSuchElementException();
        }

        public boolean next() {
            return false;
        }

        public void reset() {
        }
    }

    boolean a();

    long b();

    o c();

    long d();

    boolean next();

    void reset();
}
