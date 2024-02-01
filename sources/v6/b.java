package v6;

import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import d.o0;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final ByteArrayOutputStream f14199a;

    /* renamed from: b  reason: collision with root package name */
    public final DataOutputStream f14200b;

    public b() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f14199a = byteArrayOutputStream;
        this.f14200b = new DataOutputStream(byteArrayOutputStream);
    }

    public static void b(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public static void c(DataOutputStream dataOutputStream, long j10) throws IOException {
        dataOutputStream.writeByte(((int) (j10 >>> 24)) & 255);
        dataOutputStream.writeByte(((int) (j10 >>> 16)) & 255);
        dataOutputStream.writeByte(((int) (j10 >>> 8)) & 255);
        dataOutputStream.writeByte(((int) j10) & 255);
    }

    @o0
    public byte[] a(EventMessage eventMessage) {
        this.f14199a.reset();
        try {
            b(this.f14200b, eventMessage.O);
            String str = eventMessage.P;
            if (str == null) {
                str = "";
            }
            b(this.f14200b, str);
            c(this.f14200b, 1000);
            c(this.f14200b, 0);
            c(this.f14200b, eventMessage.Q);
            c(this.f14200b, eventMessage.R);
            this.f14200b.write(eventMessage.S);
            this.f14200b.flush();
            return this.f14199a.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
