package i6;

import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import b6.n0;
import b7.l;
import b7.y;
import d.m0;
import d.o0;
import i6.b;
import java.util.List;
import w7.q0;

public final class e implements b.j, b.C0154b {

    /* renamed from: h  reason: collision with root package name */
    public static final String f9171h = "exo_move_window";

    /* renamed from: i  reason: collision with root package name */
    public static final String f9172i = "from_index";

    /* renamed from: j  reason: collision with root package name */
    public static final String f9173j = "to_index";

    /* renamed from: c  reason: collision with root package name */
    public final MediaControllerCompat f9174c;

    /* renamed from: d  reason: collision with root package name */
    public final d f9175d;

    /* renamed from: e  reason: collision with root package name */
    public final c f9176e;

    /* renamed from: f  reason: collision with root package name */
    public final a f9177f;

    /* renamed from: g  reason: collision with root package name */
    public final l f9178g;

    public interface a {
        boolean a(MediaDescriptionCompat mediaDescriptionCompat, MediaDescriptionCompat mediaDescriptionCompat2);
    }

    public static final class b implements a {
        public boolean a(MediaDescriptionCompat mediaDescriptionCompat, MediaDescriptionCompat mediaDescriptionCompat2) {
            return q0.e(mediaDescriptionCompat.g(), mediaDescriptionCompat2.g());
        }
    }

    public interface c {
        @o0
        y a(MediaDescriptionCompat mediaDescriptionCompat);
    }

    public interface d {
        void a(int i10, MediaDescriptionCompat mediaDescriptionCompat);

        void b(int i10, int i11);

        void remove(int i10);
    }

    public e(@m0 MediaControllerCompat mediaControllerCompat, @m0 l lVar, @m0 d dVar, @m0 c cVar) {
        this(mediaControllerCompat, lVar, dVar, cVar, new b());
    }

    public e(@m0 MediaControllerCompat mediaControllerCompat, @m0 l lVar, @m0 d dVar, @m0 c cVar, @m0 a aVar) {
        this.f9174c = mediaControllerCompat;
        this.f9178g = lVar;
        this.f9175d = dVar;
        this.f9176e = cVar;
        this.f9177f = aVar;
    }

    public void i(n0 n0Var, MediaDescriptionCompat mediaDescriptionCompat) {
        List<MediaSessionCompat.QueueItem> m10 = this.f9174c.m();
        for (int i10 = 0; i10 < m10.size(); i10++) {
            if (this.f9177f.a(m10.get(i10).c(), mediaDescriptionCompat)) {
                this.f9175d.remove(i10);
                this.f9178g.f0(i10);
                return;
            }
        }
    }

    public boolean n(n0 n0Var, b6.d dVar, String str, Bundle bundle, ResultReceiver resultReceiver) {
        if (!f9171h.equals(str)) {
            return false;
        }
        int i10 = bundle.getInt(f9172i, -1);
        int i11 = bundle.getInt(f9173j, -1);
        if (i10 == -1 || i11 == -1) {
            return true;
        }
        this.f9175d.b(i10, i11);
        this.f9178g.a0(i10, i11);
        return true;
    }

    public void o(n0 n0Var, MediaDescriptionCompat mediaDescriptionCompat) {
        p(n0Var, mediaDescriptionCompat, n0Var.t0().q());
    }

    public void p(n0 n0Var, MediaDescriptionCompat mediaDescriptionCompat, int i10) {
        y a10 = this.f9176e.a(mediaDescriptionCompat);
        if (a10 != null) {
            this.f9175d.a(i10, mediaDescriptionCompat);
            this.f9178g.A(i10, a10);
        }
    }
}
