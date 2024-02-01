package r7;

import android.annotation.SuppressLint;
import android.os.Looper;
import android.widget.TextView;
import b6.i;
import b6.l0;
import b6.n0;
import b6.o0;
import b6.w0;
import b6.x0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroupArray;
import g6.e;
import java.util.Locale;
import q7.m;
import w7.a;

public class b implements n0.d, Runnable {
    public static final int R = 1000;
    public final w0 O;
    public final TextView P;
    public boolean Q;

    public b(w0 w0Var, TextView textView) {
        a.a(w0Var.u0() == Looper.getMainLooper());
        this.O = w0Var;
        this.P = textView;
    }

    public static String f(e eVar) {
        if (eVar == null) {
            return "";
        }
        eVar.a();
        return " sib:" + eVar.f8062d + " sb:" + eVar.f8064f + " rb:" + eVar.f8063e + " db:" + eVar.f8065g + " mcdb:" + eVar.f8066h + " dk:" + eVar.f8067i;
    }

    public static String g(float f10) {
        if (f10 == -1.0f || f10 == 1.0f) {
            return "";
        }
        return " par:" + String.format(Locale.US, "%.02f", new Object[]{Float.valueOf(f10)});
    }

    public final void A(boolean z10, int i10) {
        n();
    }

    public /* synthetic */ void C(int i10) {
        o0.f(this, i10);
    }

    public /* synthetic */ void K(TrackGroupArray trackGroupArray, m mVar) {
        o0.j(this, trackGroupArray, mVar);
    }

    public /* synthetic */ void N(i iVar) {
        o0.c(this, iVar);
    }

    public String a() {
        Format l12 = this.O.l1();
        e k12 = this.O.k1();
        if (l12 == null || k12 == null) {
            return "";
        }
        return "\n" + l12.W + "(id:" + l12.O + " hz:" + l12.f5078k0 + " ch:" + l12.f5077j0 + f(k12) + ")";
    }

    public /* synthetic */ void b(l0 l0Var) {
        o0.b(this, l0Var);
    }

    public String c() {
        return h() + j() + a();
    }

    public /* synthetic */ void d(boolean z10) {
        o0.a(this, z10);
    }

    public final void e(int i10) {
        n();
    }

    public String h() {
        int e10 = this.O.e();
        return String.format("playWhenReady:%s playbackState:%s window:%s", new Object[]{Boolean.valueOf(this.O.q()), e10 != 1 ? e10 != 2 ? e10 != 3 ? e10 != 4 ? x0.e.f15004b : "ended" : "ready" : "buffering" : "idle", Integer.valueOf(this.O.Q())});
    }

    public /* synthetic */ void i() {
        o0.g(this);
    }

    public String j() {
        Format o12 = this.O.o1();
        e n12 = this.O.n1();
        if (o12 == null || n12 == null) {
            return "";
        }
        return "\n" + o12.W + "(id:" + o12.O + " r:" + o12.f5069b0 + "x" + o12.f5070c0 + g(o12.f5073f0) + f(n12) + ")";
    }

    public /* synthetic */ void k(x0 x0Var, Object obj, int i10) {
        o0.i(this, x0Var, obj, i10);
    }

    public final void l() {
        if (!this.Q) {
            this.Q = true;
            this.O.P(this);
            n();
        }
    }

    public final void m() {
        if (this.Q) {
            this.Q = false;
            this.O.J(this);
            this.P.removeCallbacks(this);
        }
    }

    @SuppressLint({"SetTextI18n"})
    public final void n() {
        this.P.setText(c());
        this.P.removeCallbacks(this);
        this.P.postDelayed(this, 1000);
    }

    public final void run() {
        n();
    }

    public /* synthetic */ void t(boolean z10) {
        o0.h(this, z10);
    }
}
