package s4;

import android.content.Context;
import d.m0;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import t4.m;
import v3.f;

public final class a implements f {

    /* renamed from: c  reason: collision with root package name */
    public final int f12621c;

    /* renamed from: d  reason: collision with root package name */
    public final f f12622d;

    public a(int i10, f fVar) {
        this.f12621c = i10;
        this.f12622d = fVar;
    }

    @m0
    public static f c(@m0 Context context) {
        return new a(context.getResources().getConfiguration().uiMode & 48, b.c(context));
    }

    public void a(@m0 MessageDigest messageDigest) {
        this.f12622d.a(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f12621c).array());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f12621c == aVar.f12621c && this.f12622d.equals(aVar.f12622d);
    }

    public int hashCode() {
        return m.p(this.f12622d, this.f12621c);
    }
}
