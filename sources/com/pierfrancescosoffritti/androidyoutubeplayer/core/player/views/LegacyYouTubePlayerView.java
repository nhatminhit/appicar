package com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import bc.a;
import d.h0;
import ec.c;
import fh.g;
import fh.h;
import g3.j0;
import j8.v;
import java.util.LinkedHashSet;
import java.util.Set;
import we.l;
import xe.l0;
import xe.n0;
import xe.r1;
import xe.w;
import zd.k0;
import zd.u2;

public final class LegacyYouTubePlayerView extends SixteenByNineFrameLayout {
    @g
    public final WebViewYouTubePlayer O;
    @g
    public final ec.c P;
    @g
    public final ec.g Q;
    public boolean R;
    @g
    public we.a<u2> S;
    @g
    public final Set<cc.c> T;
    public boolean U;

    public static final class a extends cc.a {
        public final /* synthetic */ LegacyYouTubePlayerView O;

        public a(LegacyYouTubePlayerView legacyYouTubePlayerView) {
            this.O = legacyYouTubePlayerView;
        }

        public void e(@g bc.c cVar, @g a.d dVar) {
            l0.p(cVar, "youTubePlayer");
            l0.p(dVar, "state");
            if (dVar == a.d.PLAYING && !this.O.q()) {
                cVar.pause();
            }
        }

        public void k(@g bc.c cVar, @g String str) {
            l0.p(cVar, j0.D0);
            l0.p(str, "quality");
            throw new k0("An operation is not implemented: " + "Not yet implemented");
        }
    }

    @r1({"SMAP\nLegacyYouTubePlayerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyYouTubePlayerView.kt\ncom/pierfrancescosoffritti/androidyoutubeplayer/core/player/views/LegacyYouTubePlayerView$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,209:1\n1855#2,2:210\n*S KotlinDebug\n*F\n+ 1 LegacyYouTubePlayerView.kt\ncom/pierfrancescosoffritti/androidyoutubeplayer/core/player/views/LegacyYouTubePlayerView$2\n*L\n68#1:210,2\n*E\n"})
    public static final class b extends cc.a {
        public final /* synthetic */ LegacyYouTubePlayerView O;

        public b(LegacyYouTubePlayerView legacyYouTubePlayerView) {
            this.O = legacyYouTubePlayerView;
        }

        public void h(@g bc.c cVar) {
            l0.p(cVar, "youTubePlayer");
            this.O.setYouTubePlayerReady$core_release(true);
            for (cc.c b10 : this.O.T) {
                b10.b(cVar);
            }
            this.O.T.clear();
            cVar.w(this);
        }

        public void k(@g bc.c cVar, @g String str) {
            l0.p(cVar, j0.D0);
            l0.p(str, "quality");
            throw new k0("An operation is not implemented: " + "Not yet implemented");
        }
    }

    public static final class c implements c.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LegacyYouTubePlayerView f17756a;

        public c(LegacyYouTubePlayerView legacyYouTubePlayerView) {
            this.f17756a = legacyYouTubePlayerView;
        }

        public void a() {
            if (!this.f17756a.r()) {
                this.f17756a.S.n();
            } else {
                this.f17756a.Q.n(this.f17756a.getWebViewYouTubePlayer$core_release().getYoutubePlayer$core_release());
            }
        }

        public void b() {
        }
    }

    public static final class d extends n0 implements we.a<u2> {
        public static final d P = new d();

        public d() {
            super(0);
        }

        public final void c() {
        }

        public /* bridge */ /* synthetic */ Object n() {
            c();
            return u2.f25116a;
        }
    }

    public static final class e extends n0 implements we.a<u2> {
        public final /* synthetic */ LegacyYouTubePlayerView P;
        public final /* synthetic */ dc.a Q;
        public final /* synthetic */ cc.d R;

        public static final class a extends n0 implements l<bc.c, u2> {
            public final /* synthetic */ cc.d P;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(cc.d dVar) {
                super(1);
                this.P = dVar;
            }

            public /* bridge */ /* synthetic */ Object A(Object obj) {
                c((bc.c) obj);
                return u2.f25116a;
            }

            public final void c(@g bc.c cVar) {
                l0.p(cVar, "it");
                cVar.s(this.P);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(LegacyYouTubePlayerView legacyYouTubePlayerView, dc.a aVar, cc.d dVar) {
            super(0);
            this.P = legacyYouTubePlayerView;
            this.Q = aVar;
            this.R = dVar;
        }

        public final void c() {
            this.P.getWebViewYouTubePlayer$core_release().e(new a(this.R), this.Q);
        }

        public /* bridge */ /* synthetic */ Object n() {
            c();
            return u2.f25116a;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LegacyYouTubePlayerView(@g Context context) {
        this(context, fc.a.f18886a, (AttributeSet) null, 0);
        l0.p(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LegacyYouTubePlayerView(@g Context context, @g cc.b bVar, @h AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        l0.p(context, "context");
        l0.p(bVar, v.a.f9806a);
        WebViewYouTubePlayer webViewYouTubePlayer = new WebViewYouTubePlayer(context, bVar, (AttributeSet) null, 0, 12, (w) null);
        this.O = webViewYouTubePlayer;
        Context applicationContext = context.getApplicationContext();
        l0.o(applicationContext, "context.applicationContext");
        ec.c cVar = new ec.c(applicationContext);
        this.P = cVar;
        ec.g gVar = new ec.g();
        this.Q = gVar;
        this.S = d.P;
        this.T = new LinkedHashSet();
        this.U = true;
        addView(webViewYouTubePlayer, new FrameLayout.LayoutParams(-1, -1));
        webViewYouTubePlayer.c(gVar);
        webViewYouTubePlayer.c(new a(this));
        webViewYouTubePlayer.c(new b(this));
        cVar.d().add(new c(this));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LegacyYouTubePlayerView(Context context, cc.b bVar, AttributeSet attributeSet, int i10, int i11, w wVar) {
        this(context, bVar, (i11 & 4) != 0 ? null : attributeSet, (i11 & 8) != 0 ? 0 : i10);
    }

    public final boolean getCanPlay$core_release() {
        return this.U;
    }

    @g
    public final WebViewYouTubePlayer getWebViewYouTubePlayer$core_release() {
        return this.O;
    }

    public final void k(boolean z10) {
        this.O.setBackgroundPlaybackEnabled$core_release(z10);
    }

    public final void l(@g cc.c cVar) {
        l0.p(cVar, "youTubePlayerCallback");
        if (this.R) {
            cVar.b(this.O.getYoutubePlayer$core_release());
        } else {
            this.T.add(cVar);
        }
    }

    @g
    public final View m(@h0 int i10) {
        removeViews(1, getChildCount() - 1);
        View inflate = View.inflate(getContext(), i10, this);
        l0.o(inflate, "inflate(context, layoutId, this)");
        return inflate;
    }

    public final void n(@g cc.d dVar) {
        l0.p(dVar, "youTubePlayerListener");
        o(dVar, true);
    }

    public final void o(@g cc.d dVar, boolean z10) {
        l0.p(dVar, "youTubePlayerListener");
        p(dVar, z10, dc.a.f17806b.a());
    }

    public final void p(@g cc.d dVar, boolean z10, @g dc.a aVar) {
        l0.p(dVar, "youTubePlayerListener");
        l0.p(aVar, "playerOptions");
        if (!this.R) {
            if (z10) {
                this.P.e();
            }
            e eVar = new e(this, aVar, dVar);
            this.S = eVar;
            if (!z10) {
                eVar.n();
                return;
            }
            return;
        }
        throw new IllegalStateException("This YouTubePlayerView has already been initialized.");
    }

    public final boolean q() {
        return this.U || this.O.f();
    }

    public final boolean r() {
        return this.R;
    }

    public final void s() {
        this.Q.b();
        this.U = true;
    }

    public final void setCustomPlayerUi(@g View view) {
        l0.p(view, "view");
        removeViews(1, getChildCount() - 1);
        addView(view);
    }

    public final void setYouTubePlayerReady$core_release(boolean z10) {
        this.R = z10;
    }

    public final void t() {
        this.O.getYoutubePlayer$core_release().pause();
        this.Q.f();
        this.U = false;
    }

    public final void u() {
        this.P.a();
        removeView(this.O);
        this.O.removeAllViews();
        this.O.destroy();
    }
}
