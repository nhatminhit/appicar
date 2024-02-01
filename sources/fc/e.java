package fc;

import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import bc.a;
import bc.b;
import bc.c;
import be.e0;
import cc.d;
import dc.a;
import fh.g;
import j8.v;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import we.l;
import xe.l0;
import xe.r1;

@r1({"SMAP\nWebViewYouTubePlayer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebViewYouTubePlayer.kt\ncom/pierfrancescosoffritti/androidyoutubeplayer/core/player/views/YouTubePlayerImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,171:1\n1#2:172\n11335#3:173\n11670#3,3:174\n*S KotlinDebug\n*F\n+ 1 WebViewYouTubePlayer.kt\ncom/pierfrancescosoffritti/androidyoutubeplayer/core/player/views/YouTubePlayerImpl\n*L\n62#1:173\n62#1:174,3\n*E\n"})
public final class e implements c {
    @g

    /* renamed from: a  reason: collision with root package name */
    public final WebView f18887a;
    @g

    /* renamed from: b  reason: collision with root package name */
    public final Handler f18888b = new Handler(Looper.getMainLooper());
    @g

    /* renamed from: c  reason: collision with root package name */
    public final Set<d> f18889c = new LinkedHashSet();

    public e(@g WebView webView) {
        l0.p(webView, "webView");
        this.f18887a = webView;
    }

    public static final void g(WebView webView, String str, List list) {
        l0.p(webView, "$this_invoke");
        l0.p(str, "$function");
        l0.p(list, "$stringArgs");
        webView.loadUrl("javascript:" + str + '(' + e0.h3(list, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null) + ')');
    }

    public static final void i(e eVar, String str) {
        l0.p(eVar, "this$0");
        l0.p(str, "$quality");
        WebView webView = eVar.f18887a;
        webView.loadUrl("javascript:setPlaybackQuality('" + str + "')");
    }

    public void A(@g String str, float f10) {
        l0.p(str, "videoId");
        e(this.f18887a, "loadVideo", str, Float.valueOf(f10));
    }

    public void b(int i10) {
        if (i10 >= 0 && i10 < 101) {
            e(this.f18887a, "setVolume", Integer.valueOf(i10));
            return;
        }
        throw new IllegalArgumentException("Volume must be between 0 and 100".toString());
    }

    @g
    public final Set<d> d() {
        return this.f18889c;
    }

    public final void e(WebView webView, String str, Object... objArr) {
        String str2;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            if (obj instanceof String) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append('\'');
                sb2.append(obj);
                sb2.append('\'');
                str2 = sb2.toString();
            } else {
                str2 = obj.toString();
            }
            arrayList.add(str2);
        }
        this.f18888b.post(new d(webView, str, arrayList));
    }

    public void f() {
        e(this.f18887a, "playVideo", new Object[0]);
    }

    public final void h() {
        this.f18889c.clear();
        this.f18888b.removeCallbacksAndMessages((Object) null);
    }

    public void m() {
        e(this.f18887a, a.C0292a.f17811d, new Object[0]);
    }

    public void n() {
        e(this.f18887a, "nextVideo", new Object[0]);
    }

    public void o(boolean z10) {
        e(this.f18887a, "setLoop", Boolean.valueOf(z10));
    }

    public void p(boolean z10) {
        e(this.f18887a, "setShuffle", Boolean.valueOf(z10));
    }

    public void pause() {
        e(this.f18887a, "pauseVideo", new Object[0]);
    }

    public void q() {
        e(this.f18887a, "previousVideo", new Object[0]);
    }

    public void r() {
        e(this.f18887a, "toggleFullscreen", new Object[0]);
    }

    public boolean s(@g d dVar) {
        l0.p(dVar, v.a.f9806a);
        return this.f18889c.add(dVar);
    }

    public void t(@g String str, float f10) {
        l0.p(str, "videoId");
        e(this.f18887a, "cueVideo", str, Float.valueOf(f10));
    }

    public void u(float f10) {
        e(this.f18887a, "seekTo", Float.valueOf(f10));
    }

    public void v(int i10) {
        e(this.f18887a, "playVideoAt", Integer.valueOf(i10));
    }

    public boolean w(@g d dVar) {
        l0.p(dVar, v.a.f9806a);
        return this.f18889c.remove(dVar);
    }

    public void x(@g a.b bVar) {
        l0.p(bVar, "playbackRate");
        e(this.f18887a, "setPlaybackRate", Float.valueOf(b.a(bVar)));
    }

    public void y() {
        e(this.f18887a, "unMute", new Object[0]);
    }

    public void z(@g String str) {
        l0.p(str, "quality");
        this.f18888b.post(new c(this, str));
    }
}
