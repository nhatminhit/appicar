package oj;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import cc.c;
import cd.b;
import cd.d;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import d.m0;

public abstract class b implements d, c {
    public static final String U = "BaseYoutubePlayer";
    public YouTubePlayerView O;
    public boolean P = false;
    public boolean Q = false;
    public cd.b R;
    public Context S;
    public boolean T = false;

    /* access modifiers changed from: private */
    public /* synthetic */ void s() {
        ad.d.a(U, "createYoutubePlayer");
        if (this.O != null) {
            ad.d.a(U, "youTubePlayerView != null");
            this.O.v();
        }
        YouTubePlayerView youTubePlayerView = new YouTubePlayerView(this.S);
        this.O = youTubePlayerView;
        youTubePlayerView.m(this);
        this.O.l(true);
        this.Q = true;
    }

    public /* synthetic */ void G(int i10) {
        cd.c.a(this, i10);
    }

    public void J(long j10) {
        if (!this.Q && !this.P && j10 >= 0 && j10 <= 200) {
            ad.d.a(U, "!isCreateYoutubePlayer && !isYoutubePlayer && timeOfPing >= 0 && timeOfPing <= 200");
            p();
        }
    }

    public void b(@m0 bc.c cVar) {
        ad.d.a(U, "onYouTubePlayer");
        this.P = true;
        o(cVar);
        this.R.o(U);
    }

    public void f(boolean z10) {
        ad.d.a(U, "onConnectivityChanged: " + z10);
        if (this.T != z10) {
            this.T = z10;
            if (z10) {
                if (!this.P && !this.Q) {
                    ad.d.a(U, "(!isYoutubePlayer && !isCreateYoutubePlayer");
                    p();
                }
            } else if (this.Q) {
                ad.d.a(U, "isCreateYoutubePlayer");
                this.Q = false;
            }
        }
    }

    public abstract void o(bc.c cVar);

    public void p() {
        new Handler(Looper.getMainLooper()).post(new a(this));
    }

    public YouTubePlayerView q() {
        return this.O;
    }

    public void r(Context context) {
        this.S = context;
        ad.d.a(U, "isYoutubePlayer");
        if (this.R == null) {
            cd.b bVar = new cd.b(context);
            this.R = bVar;
            boolean k10 = bVar.k();
            this.T = k10;
            if (k10) {
                ad.d.a(U, "isNetworkConnected");
                p();
            }
            this.R.c(new b.C0267b(U, this));
        }
    }
}
