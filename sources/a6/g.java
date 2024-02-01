package a6;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

public class g extends OutputStream {
    public final ByteBuffer O;

    public g(ByteBuffer byteBuffer) {
        this.O = byteBuffer;
    }

    public void write(int i10) throws IOException {
        this.O.put((byte) i10);
    }

    public void write(byte[] bArr, int i10, int i11) throws IOException {
        this.O.put(bArr, i10, i11);
    }
}
