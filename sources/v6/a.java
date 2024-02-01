package v6;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import java.nio.ByteBuffer;
import java.util.Arrays;
import u6.c;
import w7.p;
import w7.q0;
import w7.w;

public final class a implements u6.a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f14198a = "EventMessageDecoder";

    public Metadata a(c cVar) {
        ByteBuffer byteBuffer = cVar.Q;
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        w wVar = new w(array, limit);
        String str = (String) w7.a.g(wVar.x());
        String str2 = (String) w7.a.g(wVar.x());
        long F = wVar.F();
        long F2 = wVar.F();
        if (F2 != 0) {
            p.l(f14198a, "Ignoring non-zero presentation_time_delta: " + F2);
        }
        return new Metadata(new EventMessage(str, str2, q0.L0(wVar.F(), 1000, F), wVar.F(), Arrays.copyOfRange(array, wVar.c(), limit)));
    }
}
