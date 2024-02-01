package d6;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public interface l {

    /* renamed from: a  reason: collision with root package name */
    public static final ByteBuffer f6434a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    public static final class a extends Exception {
        public a(int i10, int i11, int i12) {
            super("Unhandled format: " + i10 + " Hz, " + i11 + " channels in encoding " + i12);
        }
    }

    boolean a();

    ByteBuffer b();

    boolean c();

    void d(ByteBuffer byteBuffer);

    int e();

    int f();

    void flush();

    int g();

    void h();

    boolean i(int i10, int i11, int i12) throws a;

    void reset();
}
