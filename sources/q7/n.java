package q7;

import b6.i;
import b6.s0;
import b6.x0;
import b7.y;
import com.google.android.exoplayer2.source.TrackGroupArray;
import d.o0;
import t7.d;

public abstract class n {
    @o0

    /* renamed from: a  reason: collision with root package name */
    public a f12034a;
    @o0

    /* renamed from: b  reason: collision with root package name */
    public d f12035b;

    public interface a {
        void c();
    }

    public final d a() {
        return (d) w7.a.g(this.f12035b);
    }

    public final void b(a aVar, d dVar) {
        this.f12034a = aVar;
        this.f12035b = dVar;
    }

    public final void c() {
        a aVar = this.f12034a;
        if (aVar != null) {
            aVar.c();
        }
    }

    public abstract void d(Object obj);

    public abstract o e(s0[] s0VarArr, TrackGroupArray trackGroupArray, y.a aVar, x0 x0Var) throws i;
}
