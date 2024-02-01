package com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views;

import ac.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.p;
import androidx.lifecycle.u;
import androidx.lifecycle.y;
import cc.d;
import d.h0;
import ec.i;
import fc.f;
import fh.g;
import fh.h;
import g3.j0;
import h0.u0;
import java.util.ArrayList;
import java.util.List;
import xe.l0;
import xe.r1;
import xe.w;
import zd.k0;
import zd.u2;

public final class YouTubePlayerView extends SixteenByNineFrameLayout implements u {
    @g
    public final List<cc.b> O;
    @g
    public final b P;
    @g
    public final LegacyYouTubePlayerView Q;
    public boolean R;

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f17758a;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|17) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                androidx.lifecycle.p$a[] r0 = androidx.lifecycle.p.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.lifecycle.p$a r1 = androidx.lifecycle.p.a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.lifecycle.p$a r1 = androidx.lifecycle.p.a.ON_STOP     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.lifecycle.p$a r1 = androidx.lifecycle.p.a.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                androidx.lifecycle.p$a r1 = androidx.lifecycle.p.a.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                androidx.lifecycle.p$a r1 = androidx.lifecycle.p.a.ON_START     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                androidx.lifecycle.p$a r1 = androidx.lifecycle.p.a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                androidx.lifecycle.p$a r1 = androidx.lifecycle.p.a.ON_ANY     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                f17758a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView.a.<clinit>():void");
        }
    }

    @r1({"SMAP\nYouTubePlayerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YouTubePlayerView.kt\ncom/pierfrancescosoffritti/androidyoutubeplayer/core/player/views/YouTubePlayerView$webViewFullscreenListener$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,244:1\n1855#2,2:245\n1855#2,2:247\n*S KotlinDebug\n*F\n+ 1 YouTubePlayerView.kt\ncom/pierfrancescosoffritti/androidyoutubeplayer/core/player/views/YouTubePlayerView$webViewFullscreenListener$1\n*L\n47#1:245,2\n54#1:247,2\n*E\n"})
    public static final class b implements cc.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ YouTubePlayerView f17759a;

        public b(YouTubePlayerView youTubePlayerView) {
            this.f17759a = youTubePlayerView;
        }

        public void a(@g View view, @g we.a<u2> aVar) {
            l0.p(view, "fullscreenView");
            l0.p(aVar, "exitFullscreen");
            if (!this.f17759a.O.isEmpty()) {
                for (cc.b a10 : this.f17759a.O) {
                    a10.a(view, aVar);
                }
                return;
            }
            throw new IllegalStateException("To enter fullscreen you need to first register a FullscreenListener.");
        }

        public void b() {
            if (!this.f17759a.O.isEmpty()) {
                for (cc.b b10 : this.f17759a.O) {
                    b10.b();
                }
                return;
            }
            throw new IllegalStateException("To enter fullscreen you need to first register a FullscreenListener.");
        }
    }

    public static final class c extends cc.a {
        public final /* synthetic */ String O;
        public final /* synthetic */ YouTubePlayerView P;
        public final /* synthetic */ boolean Q;

        public c(String str, YouTubePlayerView youTubePlayerView, boolean z10) {
            this.O = str;
            this.P = youTubePlayerView;
            this.Q = z10;
        }

        public void h(@g bc.c cVar) {
            l0.p(cVar, "youTubePlayer");
            String str = this.O;
            if (str != null) {
                i.b(cVar, this.P.Q.getCanPlay$core_release() && this.Q, str, 0.0f);
            }
            cVar.w(this);
        }

        public void k(@g bc.c cVar, @g String str) {
            l0.p(cVar, j0.D0);
            l0.p(str, "quality");
            throw new k0("An operation is not implemented: " + "Not yet implemented");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public YouTubePlayerView(@g Context context) {
        this(context, (AttributeSet) null, 0);
        l0.p(context, "context");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public YouTubePlayerView(@g Context context, @h AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        l0.p(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public YouTubePlayerView(@g Context context, @h AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        l0.p(context, "context");
        this.O = new ArrayList();
        b bVar = new b(this);
        this.P = bVar;
        LegacyYouTubePlayerView legacyYouTubePlayerView = new LegacyYouTubePlayerView(context, bVar, (AttributeSet) null, 0, 12, (w) null);
        this.Q = legacyYouTubePlayerView;
        addView(legacyYouTubePlayerView, f.b());
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, b.d.YouTubePlayerView, 0, 0);
        l0.o(obtainStyledAttributes, "context.theme.obtainStyl….YouTubePlayerView, 0, 0)");
        this.R = obtainStyledAttributes.getBoolean(b.d.YouTubePlayerView_enableAutomaticInitialization, true);
        boolean z10 = obtainStyledAttributes.getBoolean(b.d.YouTubePlayerView_autoPlay, false);
        boolean z11 = obtainStyledAttributes.getBoolean(b.d.YouTubePlayerView_handleNetworkEvents, true);
        String string = obtainStyledAttributes.getString(b.d.YouTubePlayerView_videoId);
        obtainStyledAttributes.recycle();
        if (!z10 || string != null) {
            c cVar = new c(string, this, z10);
            if (this.R) {
                legacyYouTubePlayerView.p(cVar, z11, dc.a.f17806b.a());
                return;
            }
            return;
        }
        throw new IllegalStateException("YouTubePlayerView: videoId is not set but autoPlay is set to true. This combination is not allowed.");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ YouTubePlayerView(Context context, AttributeSet attributeSet, int i10, int i11, w wVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ YouTubePlayerView(Context context, AttributeSet attributeSet, int i10, w wVar) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    public void d(@g y yVar, @g p.a aVar) {
        l0.p(yVar, b4.a.P);
        l0.p(aVar, u0.f8532r0);
        int i10 = a.f17758a[aVar.ordinal()];
        if (i10 == 1) {
            t();
        } else if (i10 == 2) {
            u();
        } else if (i10 == 3) {
            v();
        }
    }

    public final boolean getEnableAutomaticInitialization() {
        return this.R;
    }

    public final boolean j(@g cc.b bVar) {
        l0.p(bVar, "fullscreenListener");
        return this.O.add(bVar);
    }

    public final boolean k(@g d dVar) {
        l0.p(dVar, "youTubePlayerListener");
        return this.Q.getWebViewYouTubePlayer$core_release().c(dVar);
    }

    public final void l(boolean z10) {
        this.Q.k(z10);
    }

    public final void m(@g cc.c cVar) {
        l0.p(cVar, "youTubePlayerCallback");
        this.Q.l(cVar);
    }

    @g
    public final View n(@h0 int i10) {
        return this.Q.m(i10);
    }

    public final void o(@g d dVar) {
        l0.p(dVar, "youTubePlayerListener");
        if (!this.R) {
            this.Q.o(dVar, true);
            return;
        }
        throw new IllegalStateException(f.f18890a);
    }

    public final void p(@g d dVar, @g dc.a aVar) {
        l0.p(dVar, "youTubePlayerListener");
        l0.p(aVar, "playerOptions");
        if (!this.R) {
            this.Q.p(dVar, true, aVar);
            return;
        }
        throw new IllegalStateException(f.f18890a);
    }

    public final void q(@g d dVar, boolean z10) {
        l0.p(dVar, "youTubePlayerListener");
        if (!this.R) {
            this.Q.p(dVar, z10, dc.a.f17806b.a());
            return;
        }
        throw new IllegalStateException(f.f18890a);
    }

    public final void r(@g d dVar, boolean z10, @g dc.a aVar) {
        l0.p(dVar, "youTubePlayerListener");
        l0.p(aVar, "playerOptions");
        if (!this.R) {
            this.Q.p(dVar, z10, aVar);
            return;
        }
        throw new IllegalStateException(f.f18890a);
    }

    public final void s() {
        y(-1, -1);
    }

    public final void setCustomPlayerUi(@g View view) {
        l0.p(view, "view");
        this.Q.setCustomPlayerUi(view);
    }

    public final void setEnableAutomaticInitialization(boolean z10) {
        this.R = z10;
    }

    public final void t() {
        this.Q.s();
    }

    public final void u() {
        this.Q.t();
    }

    public final void v() {
        this.Q.u();
    }

    public final boolean w(@g cc.b bVar) {
        l0.p(bVar, "fullscreenListener");
        return this.O.remove(bVar);
    }

    public final boolean x(@g d dVar) {
        l0.p(dVar, "youTubePlayerListener");
        return this.Q.getWebViewYouTubePlayer$core_release().g(dVar);
    }

    public final void y(int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = i10;
        layoutParams.height = i11;
        setLayoutParams(layoutParams);
    }

    public final void z() {
        y(-1, -2);
    }
}
