package c5;

import java.io.DataOutput;
import java.io.IOException;
import java.io.OutputStream;

public class c extends OutputStream {
    public final DataOutput O;

    public c(DataOutput dataOutput) {
        this.O = dataOutput;
    }

    public void write(int i10) throws IOException {
        this.O.write(i10);
    }

    public void write(byte[] bArr) throws IOException {
        this.O.write(bArr, 0, bArr.length);
    }

    public void write(byte[] bArr, int i10, int i11) throws IOException {
        this.O.write(bArr, i10, i11);
    }
}
