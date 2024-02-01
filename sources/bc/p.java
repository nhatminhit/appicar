package bc;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import bc.a;
import cc.d;
import d.x0;
import fh.g;
import java.util.Collection;
import lf.b0;
import xe.l0;
import xe.r1;
import xe.w;

@x0({x0.a.LIBRARY_GROUP})
@r1({"SMAP\nYouTubePlayerBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YouTubePlayerBridge.kt\ncom/pierfrancescosoffritti/androidyoutubeplayer/core/player/YouTubePlayerBridge\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,211:1\n1855#2,2:212\n1855#2,2:214\n1855#2,2:216\n1855#2,2:218\n1855#2,2:220\n1855#2,2:222\n1855#2,2:224\n1855#2,2:226\n1855#2,2:228\n1855#2,2:230\n*S KotlinDebug\n*F\n+ 1 YouTubePlayerBridge.kt\ncom/pierfrancescosoffritti/androidyoutubeplayer/core/player/YouTubePlayerBridge\n*L\n60#1:212,2\n68#1:214,2\n85#1:216,2\n94#1:218,2\n103#1:220,2\n109#1:222,2\n122#1:224,2\n137#1:226,2\n151#1:228,2\n157#1:230,2\n*E\n"})
public final class p {
    @g

    /* renamed from: c  reason: collision with root package name */
    public static final a f16184c = new a((w) null);
    @g

    /* renamed from: d  reason: collision with root package name */
    public static final String f16185d = "UNSTARTED";
    @g

    /* renamed from: e  reason: collision with root package name */
    public static final String f16186e = "ENDED";
    @g

    /* renamed from: f  reason: collision with root package name */
    public static final String f16187f = "PLAYING";
    @g

    /* renamed from: g  reason: collision with root package name */
    public static final String f16188g = "PAUSED";
    @g

    /* renamed from: h  reason: collision with root package name */
    public static final String f16189h = "BUFFERING";
    @g

    /* renamed from: i  reason: collision with root package name */
    public static final String f16190i = "CUED";
    @g

    /* renamed from: j  reason: collision with root package name */
    public static final String f16191j = "small";
    @g

    /* renamed from: k  reason: collision with root package name */
    public static final String f16192k = "medium";
    @g

    /* renamed from: l  reason: collision with root package name */
    public static final String f16193l = "large";
    @g

    /* renamed from: m  reason: collision with root package name */
    public static final String f16194m = "hd720";
    @g

    /* renamed from: n  reason: collision with root package name */
    public static final String f16195n = "hd1080";
    @g

    /* renamed from: o  reason: collision with root package name */
    public static final String f16196o = "highres";
    @g

    /* renamed from: p  reason: collision with root package name */
    public static final String f16197p = "default";
    @g

    /* renamed from: q  reason: collision with root package name */
    public static final String f16198q = "0.25";
    @g

    /* renamed from: r  reason: collision with root package name */
    public static final String f16199r = "0.5";
    @g

    /* renamed from: s  reason: collision with root package name */
    public static final String f16200s = "1";
    @g

    /* renamed from: t  reason: collision with root package name */
    public static final String f16201t = "1.5";
    @g

    /* renamed from: u  reason: collision with root package name */
    public static final String f16202u = "2";
    @g

    /* renamed from: v  reason: collision with root package name */
    public static final String f16203v = "2";
    @g

    /* renamed from: w  reason: collision with root package name */
    public static final String f16204w = "5";
    @g

    /* renamed from: x  reason: collision with root package name */
    public static final String f16205x = "100";
    @g

    /* renamed from: y  reason: collision with root package name */
    public static final String f16206y = "101";
    @g

    /* renamed from: z  reason: collision with root package name */
    public static final String f16207z = "150";
    @g

    /* renamed from: a  reason: collision with root package name */
    public final b f16208a;
    @g

    /* renamed from: b  reason: collision with root package name */
    public final Handler f16209b = new Handler(Looper.getMainLooper());

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }
    }

    public interface b {
        void a();

        @g
        c getInstance();

        @g
        Collection<d> getListeners();
    }

    public p(@g b bVar) {
        l0.p(bVar, "youTubePlayerOwner");
        this.f16208a = bVar;
    }

    public static final void A(p pVar, String str) {
        l0.p(pVar, "this$0");
        l0.p(str, "$quality");
        for (d k10 : pVar.f16208a.getListeners()) {
            k10.k(pVar.f16208a.getInstance(), str);
        }
    }

    public static final void B(p pVar) {
        l0.p(pVar, "this$0");
        pVar.f16208a.a();
    }

    public static final void q(p pVar) {
        l0.p(pVar, "this$0");
        for (d m10 : pVar.f16208a.getListeners()) {
            m10.m(pVar.f16208a.getInstance());
        }
    }

    public static final void r(p pVar, a.c cVar) {
        l0.p(pVar, "this$0");
        l0.p(cVar, "$playerError");
        for (d g10 : pVar.f16208a.getListeners()) {
            g10.g(pVar.f16208a.getInstance(), cVar);
        }
    }

    public static final void s(p pVar, a.C0258a aVar) {
        l0.p(pVar, "this$0");
        l0.p(aVar, "$playbackQuality");
        for (d j10 : pVar.f16208a.getListeners()) {
            j10.j(pVar.f16208a.getInstance(), aVar);
        }
    }

    public static final void t(p pVar, a.b bVar) {
        l0.p(pVar, "this$0");
        l0.p(bVar, "$playbackRate");
        for (d l10 : pVar.f16208a.getListeners()) {
            l10.l(pVar.f16208a.getInstance(), bVar);
        }
    }

    public static final void u(p pVar) {
        l0.p(pVar, "this$0");
        for (d h10 : pVar.f16208a.getListeners()) {
            h10.h(pVar.f16208a.getInstance());
        }
    }

    public static final void v(p pVar, a.d dVar) {
        l0.p(pVar, "this$0");
        l0.p(dVar, "$playerState");
        for (d e10 : pVar.f16208a.getListeners()) {
            e10.e(pVar.f16208a.getInstance(), dVar);
        }
    }

    public static final void w(p pVar, float f10) {
        l0.p(pVar, "this$0");
        for (d d10 : pVar.f16208a.getListeners()) {
            d10.d(pVar.f16208a.getInstance(), f10);
        }
    }

    public static final void x(p pVar, float f10) {
        l0.p(pVar, "this$0");
        for (d a10 : pVar.f16208a.getListeners()) {
            a10.a(pVar.f16208a.getInstance(), f10);
        }
    }

    public static final void y(p pVar, String str) {
        l0.p(pVar, "this$0");
        l0.p(str, "$videoId");
        for (d c10 : pVar.f16208a.getListeners()) {
            c10.c(pVar.f16208a.getInstance(), str);
        }
    }

    public static final void z(p pVar, float f10) {
        l0.p(pVar, "this$0");
        for (d i10 : pVar.f16208a.getListeners()) {
            i10.i(pVar.f16208a.getInstance(), f10);
        }
    }

    public final a.C0258a m(String str) {
        return b0.L1(str, f16191j, true) ? a.C0258a.SMALL : b0.L1(str, f16192k, true) ? a.C0258a.MEDIUM : b0.L1(str, f16193l, true) ? a.C0258a.LARGE : b0.L1(str, f16194m, true) ? a.C0258a.HD720 : b0.L1(str, f16195n, true) ? a.C0258a.HD1080 : b0.L1(str, f16196o, true) ? a.C0258a.HIGH_RES : b0.L1(str, f16197p, true) ? a.C0258a.DEFAULT : a.C0258a.UNKNOWN;
    }

    public final a.b n(String str) {
        return b0.L1(str, f16198q, true) ? a.b.RATE_0_25 : b0.L1(str, f16199r, true) ? a.b.RATE_0_5 : b0.L1(str, "1", true) ? a.b.RATE_1 : b0.L1(str, f16201t, true) ? a.b.RATE_1_5 : b0.L1(str, "2", true) ? a.b.RATE_2 : a.b.UNKNOWN;
    }

    public final a.c o(String str) {
        return b0.L1(str, "2", true) ? a.c.INVALID_PARAMETER_IN_REQUEST : b0.L1(str, f16204w, true) ? a.c.HTML_5_PLAYER : b0.L1(str, f16205x, true) ? a.c.VIDEO_NOT_FOUND : (!b0.L1(str, f16206y, true) && !b0.L1(str, f16207z, true)) ? a.c.UNKNOWN : a.c.VIDEO_NOT_PLAYABLE_IN_EMBEDDED_PLAYER;
    }

    public final a.d p(String str) {
        return b0.L1(str, f16185d, true) ? a.d.UNSTARTED : b0.L1(str, f16186e, true) ? a.d.ENDED : b0.L1(str, f16187f, true) ? a.d.PLAYING : b0.L1(str, f16188g, true) ? a.d.PAUSED : b0.L1(str, f16189h, true) ? a.d.BUFFERING : b0.L1(str, f16190i, true) ? a.d.VIDEO_CUED : a.d.UNKNOWN;
    }

    @JavascriptInterface
    public final boolean sendApiChange() {
        return this.f16209b.post(new i(this));
    }

    @JavascriptInterface
    public final void sendError(@g String str) {
        l0.p(str, "error");
        this.f16209b.post(new f(this, o(str)));
    }

    @JavascriptInterface
    public final void sendPlaybackQualityChange(@g String str) {
        l0.p(str, "quality");
        this.f16209b.post(new g(this, m(str)));
    }

    @JavascriptInterface
    public final void sendPlaybackRateChange(@g String str) {
        l0.p(str, "rate");
        this.f16209b.post(new m(this, n(str)));
    }

    @JavascriptInterface
    public final boolean sendReady() {
        return this.f16209b.post(new h(this));
    }

    @JavascriptInterface
    public final void sendStateChange(@g String str) {
        l0.p(str, "state");
        this.f16209b.post(new e(this, p(str)));
    }

    @JavascriptInterface
    public final void sendVideoCurrentTime(@g String str) {
        l0.p(str, "seconds");
        try {
            this.f16209b.post(new j(this, Float.parseFloat(str)));
        } catch (NumberFormatException e10) {
            e10.printStackTrace();
        }
    }

    @JavascriptInterface
    public final void sendVideoDuration(@g String str) {
        l0.p(str, "seconds");
        try {
            if (TextUtils.isEmpty(str)) {
                str = "0";
            }
            this.f16209b.post(new o(this, Float.parseFloat(str)));
        } catch (NumberFormatException e10) {
            e10.printStackTrace();
        }
    }

    @JavascriptInterface
    public final boolean sendVideoId(@g String str) {
        l0.p(str, "videoId");
        return this.f16209b.post(new k(this, str));
    }

    @JavascriptInterface
    public final void sendVideoLoadedFraction(@g String str) {
        l0.p(str, "fraction");
        try {
            this.f16209b.post(new d(this, Float.parseFloat(str)));
        } catch (NumberFormatException e10) {
            e10.printStackTrace();
        }
    }

    @JavascriptInterface
    public final void sendVideoQuality(@g String str) {
        l0.p(str, "quality");
        this.f16209b.post(new n(this, str));
    }

    @JavascriptInterface
    public final boolean sendYouTubeIFrameAPIReady() {
        return this.f16209b.post(new l(this));
    }
}
