package g6;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class i extends g {
    public final h<?, i, ?> R;
    public ByteBuffer S;

    public i(h<?, i, ?> hVar) {
        this.R = hVar;
    }

    public void j() {
        super.j();
        ByteBuffer byteBuffer = this.S;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public void q() {
        this.R.s(this);
    }

    public ByteBuffer r(long j10, int i10) {
        this.P = j10;
        ByteBuffer byteBuffer = this.S;
        if (byteBuffer == null || byteBuffer.capacity() < i10) {
            this.S = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        }
        this.S.position(0);
        this.S.limit(i10);
        return this.S;
    }
}
