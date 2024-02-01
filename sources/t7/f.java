package t7;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import w7.a;
import y4.c;

public final class f implements j {

    /* renamed from: a  reason: collision with root package name */
    public ByteArrayOutputStream f13066a;

    public void a(o oVar) throws IOException {
        long j10 = oVar.f13136g;
        if (j10 == -1) {
            this.f13066a = new ByteArrayOutputStream();
            return;
        }
        a.a(j10 <= c.M0);
        this.f13066a = new ByteArrayOutputStream((int) oVar.f13136g);
    }

    public byte[] b() {
        ByteArrayOutputStream byteArrayOutputStream = this.f13066a;
        if (byteArrayOutputStream == null) {
            return null;
        }
        return byteArrayOutputStream.toByteArray();
    }

    public void close() throws IOException {
        this.f13066a.close();
    }

    public void write(byte[] bArr, int i10, int i11) throws IOException {
        this.f13066a.write(bArr, i10, i11);
    }
}
