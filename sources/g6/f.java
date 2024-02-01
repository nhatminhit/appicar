package g6;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

public class f extends a {
    public static final int T = 0;
    public static final int U = 1;
    public static final int V = 2;
    public final b P = new b();
    public ByteBuffer Q;
    public long R;
    public final int S;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public f(int i10) {
        this.S = i10;
    }

    public static f v() {
        return new f(0);
    }

    public void j() {
        super.j();
        ByteBuffer byteBuffer = this.Q;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public final ByteBuffer q(int i10) {
        int i11 = this.S;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.Q;
        int capacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        throw new IllegalStateException("Buffer too small (" + capacity + " < " + i10 + ")");
    }

    public void r(int i10) {
        ByteBuffer byteBuffer = this.Q;
        if (byteBuffer == null) {
            this.Q = q(i10);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = this.Q.position();
        int i11 = i10 + position;
        if (capacity < i11) {
            ByteBuffer q10 = q(i11);
            if (position > 0) {
                this.Q.position(0);
                this.Q.limit(position);
                q10.put(this.Q);
            }
            this.Q = q10;
        }
    }

    public final void s() {
        this.Q.flip();
    }

    public final boolean t() {
        return l(1073741824);
    }

    public final boolean u() {
        return this.Q == null && this.S == 0;
    }
}
