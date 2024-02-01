package com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views;

import ac.b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import bc.c;
import bc.p;
import be.e0;
import cc.b;
import cc.d;
import fc.e;
import fh.g;
import fh.h;
import j8.v;
import java.io.InputStream;
import java.util.Collection;
import lf.b0;
import we.l;
import xe.l0;
import xe.n0;
import xe.w;
import zd.u2;

public final class WebViewYouTubePlayer extends WebView implements p.b {
    @g
    public final b O;
    @g
    public final e P;
    public l<? super c, u2> Q;
    public boolean R;

    public static final class a extends WebChromeClient {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ WebViewYouTubePlayer f17757a;

        /* renamed from: com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.WebViewYouTubePlayer$a$a  reason: collision with other inner class name */
        public static final class C0289a extends n0 implements we.a<u2> {
            public final /* synthetic */ WebChromeClient.CustomViewCallback P;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0289a(WebChromeClient.CustomViewCallback customViewCallback) {
                super(0);
                this.P = customViewCallback;
            }

            public final void c() {
                this.P.onCustomViewHidden();
            }

            public /* bridge */ /* synthetic */ Object n() {
                c();
                return u2.f25116a;
            }
        }

        public a(WebViewYouTubePlayer webViewYouTubePlayer) {
            this.f17757a = webViewYouTubePlayer;
        }

        @h
        public Bitmap getDefaultVideoPoster() {
            Bitmap defaultVideoPoster = super.getDefaultVideoPoster();
            return defaultVideoPoster == null ? Bitmap.createBitmap(1, 1, Bitmap.Config.RGB_565) : defaultVideoPoster;
        }

        public void onHideCustomView() {
            super.onHideCustomView();
            this.f17757a.O.b();
        }

        public void onShowCustomView(@g View view, @g WebChromeClient.CustomViewCallback customViewCallback) {
            l0.p(view, "view");
            l0.p(customViewCallback, "callback");
            super.onShowCustomView(view, customViewCallback);
            this.f17757a.O.a(view, new C0289a(customViewCallback));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WebViewYouTubePlayer(@g Context context) {
        this(context, fc.a.f18886a, (AttributeSet) null, 0, 12, (w) null);
        l0.p(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WebViewYouTubePlayer(@g Context context, @g b bVar, @h AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        l0.p(context, "context");
        l0.p(bVar, v.a.f9806a);
        this.O = bVar;
        this.P = new e(this);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WebViewYouTubePlayer(Context context, b bVar, AttributeSet attributeSet, int i10, int i11, w wVar) {
        this(context, bVar, (i11 & 4) != 0 ? null : attributeSet, (i11 & 8) != 0 ? 0 : i10);
    }

    public void a() {
        l<? super c, u2> lVar = this.Q;
        if (lVar == null) {
            l0.S("youTubePlayerInitListener");
            lVar = null;
        }
        lVar.A(this.P);
    }

    public final boolean c(@g d dVar) {
        l0.p(dVar, v.a.f9806a);
        return this.P.d().add(dVar);
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public final void d(dc.a aVar) {
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setCacheMode(-1);
        getSettings().setDomStorageEnabled(true);
        addJavascriptInterface(new p(this), "YouTubePlayerBridge");
        InputStream openRawResource = getResources().openRawResource(b.c.ayp_youtube_player);
        l0.o(openRawResource, "resources.openRawResourc…R.raw.ayp_youtube_player)");
        loadDataWithBaseURL(aVar.b(), b0.l2(fc.b.a(openRawResource), "<<injectedPlayerVars>>", aVar.toString(), false, 4, (Object) null), "text/html", "utf-8", (String) null);
        setWebChromeClient(new a(this));
    }

    public void destroy() {
        this.P.h();
        super.destroy();
    }

    public final void e(@g l<? super c, u2> lVar, @h dc.a aVar) {
        l0.p(lVar, "initListener");
        this.Q = lVar;
        if (aVar == null) {
            aVar = dc.a.f17806b.a();
        }
        d(aVar);
    }

    public final boolean f() {
        return this.R;
    }

    public final boolean g(@g d dVar) {
        l0.p(dVar, v.a.f9806a);
        return this.P.d().remove(dVar);
    }

    @g
    public c getInstance() {
        return this.P;
    }

    @g
    public Collection<d> getListeners() {
        return e0.V5(this.P.d());
    }

    @g
    public final c getYoutubePlayer$core_release() {
        return this.P;
    }

    public void onWindowVisibilityChanged(int i10) {
        if (!this.R || !(i10 == 8 || i10 == 4)) {
            super.onWindowVisibilityChanged(i10);
        }
    }

    public final void setBackgroundPlaybackEnabled$core_release(boolean z10) {
        this.R = z10;
    }
}
