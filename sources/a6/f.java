package a6;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class f extends InputStream {
    public final ByteBuffer O;

    public f(ByteBuffer byteBuffer) {
        this.O = byteBuffer;
    }

    public int available() {
        return this.O.remaining();
    }

    public int read() throws IOException {
        if (this.O.hasRemaining()) {
            return this.O.get() & 255;
        }
        return -1;
    }

    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (!this.O.hasRemaining()) {
            return -1;
        }
        int min = Math.min(i11, this.O.remaining());
        this.O.get(bArr, i10, min);
        return min;
    }
}
