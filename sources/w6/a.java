package w6;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyInfo;
import d.g1;
import d.o0;
import java.nio.ByteBuffer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import u6.c;
import w7.p;
import w7.q0;

public final class a implements u6.a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f14685a = "IcyDecoder";

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f14686b = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: c  reason: collision with root package name */
    public static final String f14687c = "streamtitle";

    /* renamed from: d  reason: collision with root package name */
    public static final String f14688d = "streamurl";

    @o0
    public Metadata a(c cVar) {
        ByteBuffer byteBuffer = cVar.Q;
        return b(q0.G(byteBuffer.array(), 0, byteBuffer.limit()));
    }

    @o0
    @g1
    public Metadata b(String str) {
        Matcher matcher = f14686b.matcher(str);
        String str2 = null;
        String str3 = null;
        for (int i10 = 0; matcher.find(i10); i10 = matcher.end()) {
            String Y0 = q0.Y0(matcher.group(1));
            String group = matcher.group(2);
            Y0.hashCode();
            if (Y0.equals(f14688d)) {
                str3 = group;
            } else if (!Y0.equals(f14687c)) {
                p.l(f14685a, "Unrecognized ICY tag: " + str2);
            } else {
                str2 = group;
            }
        }
        if (str2 == null && str3 == null) {
            return null;
        }
        return new Metadata(new IcyInfo(str2, str3));
    }
}
