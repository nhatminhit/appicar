package oj;

import android.content.Context;
import android.os.CountDownTimer;
import bc.a;
import cc.d;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import d.m0;

public class c extends b implements d {
    public static final String Z = "YoutubePlayerController";

    /* renamed from: a0  reason: collision with root package name */
    public static c f21820a0 = null;

    /* renamed from: b0  reason: collision with root package name */
    public static String f21821b0 = "";
    public bc.c V;
    public Context W;
    public b X;
    public int Y = 0;

    public class a extends CountDownTimer {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f21822a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ float f21823b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(long j10, long j11, String str, float f10) {
            super(j10, j11);
            this.f21822a = str;
            this.f21823b = f10;
        }

        public void onFinish() {
            start();
        }

        public void onTick(long j10) {
            if (c.this.V != null) {
                c.this.V.A(this.f21822a, this.f21823b);
                cancel();
            }
        }
    }

    public interface b {
        void a(@m0 bc.c cVar, float f10);

        void c(@m0 bc.c cVar, @m0 String str);

        void d(@m0 bc.c cVar, float f10);

        void e(@m0 bc.c cVar, @m0 a.d dVar);

        void g(@m0 bc.c cVar, @m0 a.c cVar2);

        void n(YouTubePlayerView youTubePlayerView);
    }

    public c(Context context) {
        this.W = context;
        r(context);
    }

    public static c v(Context context) {
        if (f21820a0 == null) {
            f21820a0 = new c(context);
        }
        return f21820a0;
    }

    public void a(@m0 bc.c cVar, float f10) {
        b bVar = this.X;
        if (bVar != null) {
            bVar.a(cVar, f10);
        }
    }

    public void c(@m0 bc.c cVar, @m0 String str) {
        b bVar = this.X;
        if (bVar != null) {
            bVar.c(cVar, str);
        }
    }

    public void d(@m0 bc.c cVar, float f10) {
        b bVar = this.X;
        if (bVar != null) {
            bVar.d(cVar, f10);
        }
    }

    public void e(@m0 bc.c cVar, @m0 a.d dVar) {
        b bVar = this.X;
        if (bVar != null) {
            bVar.e(cVar, dVar);
        }
    }

    public void g(@m0 bc.c cVar, @m0 a.c cVar2) {
        b bVar = this.X;
        if (bVar != null) {
            bVar.g(cVar, cVar2);
        }
    }

    public void h(@m0 bc.c cVar) {
    }

    public void i(@m0 bc.c cVar, float f10) {
    }

    public void j(@m0 bc.c cVar, @m0 a.C0258a aVar) {
    }

    public void k(@m0 bc.c cVar, @m0 String str) {
    }

    public void l(@m0 bc.c cVar, @m0 a.b bVar) {
    }

    public void m(@m0 bc.c cVar) {
    }

    public void o(bc.c cVar) {
        this.V = cVar;
        q().k(this);
        b bVar = this.X;
        if (bVar != null) {
            bVar.n(q());
        }
    }

    public void u() {
        f21820a0 = null;
    }

    public void w(String str, float f10) {
        bc.c cVar = this.V;
        if (cVar == null) {
            new a(10000, 100, str, f10).start();
        } else {
            cVar.A(str, f10);
        }
    }

    public void x(String str) {
        f21821b0 = str;
    }

    public bc.c y() {
        return this.V;
    }

    public void z(b bVar) {
        this.X = bVar;
    }
}
