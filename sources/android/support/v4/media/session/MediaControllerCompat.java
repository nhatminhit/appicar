package android.support.v4.media.session;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.a;
import android.support.v4.media.session.b;
import android.support.v4.media.session.c;
import android.support.v4.media.session.d;
import android.support.v4.media.session.i;
import android.text.TextUtils;
import android.view.KeyEvent;
import androidx.core.app.ComponentActivity;
import d.m0;
import d.o0;
import d.t0;
import d.x0;
import d.z;
import h0.m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public final class MediaControllerCompat {

    /* renamed from: d  reason: collision with root package name */
    public static final String f390d = "MediaControllerCompat";
    @x0({x0.a.O})

    /* renamed from: e  reason: collision with root package name */
    public static final String f391e = "android.support.v4.media.session.command.GET_EXTRA_BINDER";
    @x0({x0.a.O})

    /* renamed from: f  reason: collision with root package name */
    public static final String f392f = "android.support.v4.media.session.command.ADD_QUEUE_ITEM";
    @x0({x0.a.O})

    /* renamed from: g  reason: collision with root package name */
    public static final String f393g = "android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT";
    @x0({x0.a.O})

    /* renamed from: h  reason: collision with root package name */
    public static final String f394h = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM";
    @x0({x0.a.O})

    /* renamed from: i  reason: collision with root package name */
    public static final String f395i = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT";
    @x0({x0.a.O})

    /* renamed from: j  reason: collision with root package name */
    public static final String f396j = "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION";
    @x0({x0.a.O})

    /* renamed from: k  reason: collision with root package name */
    public static final String f397k = "android.support.v4.media.session.command.ARGUMENT_INDEX";

    /* renamed from: a  reason: collision with root package name */
    public final c f398a;

    /* renamed from: b  reason: collision with root package name */
    public final MediaSessionCompat.Token f399b;

    /* renamed from: c  reason: collision with root package name */
    public final HashSet<a> f400c = new HashSet<>();

    @t0(21)
    public static class MediaControllerImplApi21 implements c {

        /* renamed from: a  reason: collision with root package name */
        public final Object f401a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f402b = new Object();
        @z("mLock")

        /* renamed from: c  reason: collision with root package name */
        public final List<a> f403c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        public HashMap<a, a> f404d = new HashMap<>();

        /* renamed from: e  reason: collision with root package name */
        public final MediaSessionCompat.Token f405e;

        public static class ExtraBinderRequestResultReceiver extends ResultReceiver {
            public WeakReference<MediaControllerImplApi21> O;

            public ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super((Handler) null);
                this.O = new WeakReference<>(mediaControllerImplApi21);
            }

            public void onReceiveResult(int i10, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = this.O.get();
                if (mediaControllerImplApi21 != null && bundle != null) {
                    synchronized (mediaControllerImplApi21.f402b) {
                        mediaControllerImplApi21.f405e.g(b.a.D(m.a(bundle, MediaSessionCompat.I)));
                        mediaControllerImplApi21.f405e.h(bundle.getBundle(MediaSessionCompat.J));
                        mediaControllerImplApi21.u();
                    }
                }
            }
        }

        public static class a extends a.c {
            public a(a aVar) {
                super(aVar);
            }

            public void A() throws RemoteException {
                throw new AssertionError();
            }

            public void W1(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                throw new AssertionError();
            }

            public void e1(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                throw new AssertionError();
            }

            public void s(Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            public void u(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                throw new AssertionError();
            }

            public void z(CharSequence charSequence) throws RemoteException {
                throw new AssertionError();
            }
        }

        public MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) throws RemoteException {
            this.f405e = token;
            Object d10 = c.d(context, token.f());
            this.f401a = d10;
            if (d10 == null) {
                throw new RemoteException();
            } else if (token.d() == null) {
                w();
            }
        }

        public int E() {
            if (this.f405e.d() == null) {
                return -1;
            }
            try {
                return this.f405e.d().E();
            } catch (RemoteException unused) {
                return -1;
            }
        }

        public boolean F() {
            if (this.f405e.d() == null) {
                return false;
            }
            try {
                return this.f405e.d().F();
            } catch (RemoteException unused) {
                return false;
            }
        }

        public List<MediaSessionCompat.QueueItem> G() {
            List<Object> l10 = c.l(this.f401a);
            if (l10 != null) {
                return MediaSessionCompat.QueueItem.b(l10);
            }
            return null;
        }

        public g a() {
            Object j10 = c.j(this.f401a);
            if (j10 != null) {
                return new g(c.C0014c.e(j10), c.C0014c.c(j10), c.C0014c.f(j10), c.C0014c.d(j10), c.C0014c.b(j10));
            }
            return null;
        }

        public void b(int i10, int i11) {
            c.a(this.f401a, i10, i11);
        }

        public final void c(a aVar) {
            c.v(this.f401a, aVar.f406a);
            synchronized (this.f402b) {
                if (this.f405e.d() != null) {
                    try {
                        a remove = this.f404d.remove(aVar);
                        if (remove != null) {
                            aVar.f408c = null;
                            this.f405e.d().y0(remove);
                        }
                    } catch (RemoteException unused) {
                    }
                } else {
                    this.f403c.remove(aVar);
                }
            }
        }

        public MediaMetadataCompat d() {
            Object h10 = c.h(this.f401a);
            if (h10 != null) {
                return MediaMetadataCompat.b(h10);
            }
            return null;
        }

        public PlaybackStateCompat e() {
            if (this.f405e.d() != null) {
                try {
                    return this.f405e.d().e();
                } catch (RemoteException unused) {
                }
            }
            Object k10 = c.k(this.f401a);
            if (k10 != null) {
                return PlaybackStateCompat.a(k10);
            }
            return null;
        }

        public boolean f(KeyEvent keyEvent) {
            return c.c(this.f401a, keyEvent);
        }

        public void g(int i10, int i11) {
            c.u(this.f401a, i10, i11);
        }

        public Bundle getExtras() {
            return c.e(this.f401a);
        }

        public void h(MediaDescriptionCompat mediaDescriptionCompat, int i10) {
            if ((j() & 4) != 0) {
                Bundle bundle = new Bundle();
                bundle.putParcelable(MediaControllerCompat.f396j, mediaDescriptionCompat);
                bundle.putInt(MediaControllerCompat.f397k, i10);
                i(MediaControllerCompat.f393g, bundle, (ResultReceiver) null);
                return;
            }
            throw new UnsupportedOperationException("This session doesn't support queue management operations");
        }

        public void i(String str, Bundle bundle, ResultReceiver resultReceiver) {
            c.s(this.f401a, str, bundle, resultReceiver);
        }

        public long j() {
            return c.f(this.f401a);
        }

        public int k() {
            if (this.f405e.d() == null) {
                return -1;
            }
            try {
                return this.f405e.d().k();
            } catch (RemoteException unused) {
                return -1;
            }
        }

        public boolean l() {
            return this.f405e.d() != null;
        }

        public PendingIntent m() {
            return c.o(this.f401a);
        }

        public String n() {
            return c.i(this.f401a);
        }

        public h o() {
            Object q10 = c.q(this.f401a);
            if (q10 != null) {
                return new i(q10);
            }
            return null;
        }

        public void p(MediaDescriptionCompat mediaDescriptionCompat) {
            if ((j() & 4) != 0) {
                Bundle bundle = new Bundle();
                bundle.putParcelable(MediaControllerCompat.f396j, mediaDescriptionCompat);
                i(MediaControllerCompat.f394h, bundle, (ResultReceiver) null);
                return;
            }
            throw new UnsupportedOperationException("This session doesn't support queue management operations");
        }

        public void q(MediaDescriptionCompat mediaDescriptionCompat) {
            if ((j() & 4) != 0) {
                Bundle bundle = new Bundle();
                bundle.putParcelable(MediaControllerCompat.f396j, mediaDescriptionCompat);
                i(MediaControllerCompat.f392f, bundle, (ResultReceiver) null);
                return;
            }
            throw new UnsupportedOperationException("This session doesn't support queue management operations");
        }

        public int r() {
            return c.n(this.f401a);
        }

        public Object s() {
            return this.f401a;
        }

        public final void t(a aVar, Handler handler) {
            c.r(this.f401a, aVar.f406a, handler);
            synchronized (this.f402b) {
                if (this.f405e.d() != null) {
                    a aVar2 = new a(aVar);
                    this.f404d.put(aVar, aVar2);
                    aVar.f408c = aVar2;
                    try {
                        this.f405e.d().N(aVar2);
                        aVar.n(13, (Object) null, (Bundle) null);
                    } catch (RemoteException unused) {
                    }
                } else {
                    aVar.f408c = null;
                    this.f403c.add(aVar);
                }
            }
        }

        @z("mLock")
        public void u() {
            if (this.f405e.d() != null) {
                for (a next : this.f403c) {
                    a aVar = new a(next);
                    this.f404d.put(next, aVar);
                    next.f408c = aVar;
                    try {
                        this.f405e.d().N(aVar);
                        next.n(13, (Object) null, (Bundle) null);
                    } catch (RemoteException unused) {
                    }
                }
                this.f403c.clear();
            }
        }

        public CharSequence v() {
            return c.m(this.f401a);
        }

        public final void w() {
            i(MediaControllerCompat.f391e, (Bundle) null, new ExtraBinderRequestResultReceiver(this));
        }
    }

    public static abstract class a implements IBinder.DeathRecipient {

        /* renamed from: a  reason: collision with root package name */
        public final Object f406a = c.b(new b(this));

        /* renamed from: b  reason: collision with root package name */
        public C0009a f407b;

        /* renamed from: c  reason: collision with root package name */
        public a f408c;

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$a  reason: collision with other inner class name */
        public class C0009a extends Handler {

            /* renamed from: c  reason: collision with root package name */
            public static final int f409c = 1;

            /* renamed from: d  reason: collision with root package name */
            public static final int f410d = 2;

            /* renamed from: e  reason: collision with root package name */
            public static final int f411e = 3;

            /* renamed from: f  reason: collision with root package name */
            public static final int f412f = 4;

            /* renamed from: g  reason: collision with root package name */
            public static final int f413g = 5;

            /* renamed from: h  reason: collision with root package name */
            public static final int f414h = 6;

            /* renamed from: i  reason: collision with root package name */
            public static final int f415i = 7;

            /* renamed from: j  reason: collision with root package name */
            public static final int f416j = 8;

            /* renamed from: k  reason: collision with root package name */
            public static final int f417k = 9;

            /* renamed from: l  reason: collision with root package name */
            public static final int f418l = 11;

            /* renamed from: m  reason: collision with root package name */
            public static final int f419m = 12;

            /* renamed from: n  reason: collision with root package name */
            public static final int f420n = 13;

            /* renamed from: a  reason: collision with root package name */
            public boolean f421a = false;

            public C0009a(Looper looper) {
                super(looper);
            }

            public void handleMessage(Message message) {
                if (this.f421a) {
                    switch (message.what) {
                        case 1:
                            Bundle data = message.getData();
                            MediaSessionCompat.b(data);
                            a.this.k((String) message.obj, data);
                            return;
                        case 2:
                            a.this.f((PlaybackStateCompat) message.obj);
                            return;
                        case 3:
                            a.this.e((MediaMetadataCompat) message.obj);
                            return;
                        case 4:
                            a.this.b((g) message.obj);
                            return;
                        case 5:
                            a.this.g((List) message.obj);
                            return;
                        case 6:
                            a.this.h((CharSequence) message.obj);
                            return;
                        case 7:
                            Bundle bundle = (Bundle) message.obj;
                            MediaSessionCompat.b(bundle);
                            a.this.d(bundle);
                            return;
                        case 8:
                            a.this.j();
                            return;
                        case 9:
                            a.this.i(((Integer) message.obj).intValue());
                            return;
                        case 11:
                            a.this.c(((Boolean) message.obj).booleanValue());
                            return;
                        case 12:
                            a.this.m(((Integer) message.obj).intValue());
                            return;
                        case 13:
                            a.this.l();
                            return;
                        default:
                            return;
                    }
                }
            }
        }

        public static class b implements c.a {

            /* renamed from: a  reason: collision with root package name */
            public final WeakReference<a> f423a;

            public b(a aVar) {
                this.f423a = new WeakReference<>(aVar);
            }

            public void A() {
                a aVar = this.f423a.get();
                if (aVar != null) {
                    aVar.j();
                }
            }

            public void a(Object obj) {
                a aVar = this.f423a.get();
                if (aVar != null) {
                    aVar.e(MediaMetadataCompat.b(obj));
                }
            }

            public void b(int i10, int i11, int i12, int i13, int i14) {
                a aVar = this.f423a.get();
                if (aVar != null) {
                    aVar.b(new g(i10, i11, i12, i13, i14));
                }
            }

            public void c(Object obj) {
                a aVar = this.f423a.get();
                if (aVar != null && aVar.f408c == null) {
                    aVar.f(PlaybackStateCompat.a(obj));
                }
            }

            public void d(String str, Bundle bundle) {
                a aVar = this.f423a.get();
                if (aVar != null) {
                    a aVar2 = aVar.f408c;
                    aVar.k(str, bundle);
                }
            }

            public void s(Bundle bundle) {
                a aVar = this.f423a.get();
                if (aVar != null) {
                    aVar.d(bundle);
                }
            }

            public void u(List<?> list) {
                a aVar = this.f423a.get();
                if (aVar != null) {
                    aVar.g(MediaSessionCompat.QueueItem.b(list));
                }
            }

            public void z(CharSequence charSequence) {
                a aVar = this.f423a.get();
                if (aVar != null) {
                    aVar.h(charSequence);
                }
            }
        }

        public static class c extends a.C0011a {

            /* renamed from: c0  reason: collision with root package name */
            public final WeakReference<a> f424c0;

            public c(a aVar) {
                this.f424c0 = new WeakReference<>(aVar);
            }

            public void A() throws RemoteException {
                a aVar = this.f424c0.get();
                if (aVar != null) {
                    aVar.n(8, (Object) null, (Bundle) null);
                }
            }

            public void C(int i10) throws RemoteException {
                a aVar = this.f424c0.get();
                if (aVar != null) {
                    aVar.n(9, Integer.valueOf(i10), (Bundle) null);
                }
            }

            public void N0(boolean z10) throws RemoteException {
                a aVar = this.f424c0.get();
                if (aVar != null) {
                    aVar.n(11, Boolean.valueOf(z10), (Bundle) null);
                }
            }

            public void R1(PlaybackStateCompat playbackStateCompat) throws RemoteException {
                a aVar = this.f424c0.get();
                if (aVar != null) {
                    aVar.n(2, playbackStateCompat, (Bundle) null);
                }
            }

            public void S1(String str, Bundle bundle) throws RemoteException {
                a aVar = this.f424c0.get();
                if (aVar != null) {
                    aVar.n(1, str, bundle);
                }
            }

            public void V0(boolean z10) throws RemoteException {
            }

            public void W1(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                a aVar = this.f424c0.get();
                if (aVar != null) {
                    aVar.n(4, parcelableVolumeInfo != null ? new g(parcelableVolumeInfo.O, parcelableVolumeInfo.P, parcelableVolumeInfo.Q, parcelableVolumeInfo.R, parcelableVolumeInfo.S) : null, (Bundle) null);
                }
            }

            public void e1(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                a aVar = this.f424c0.get();
                if (aVar != null) {
                    aVar.n(3, mediaMetadataCompat, (Bundle) null);
                }
            }

            public void i0() throws RemoteException {
                a aVar = this.f424c0.get();
                if (aVar != null) {
                    aVar.n(13, (Object) null, (Bundle) null);
                }
            }

            public void s(Bundle bundle) throws RemoteException {
                a aVar = this.f424c0.get();
                if (aVar != null) {
                    aVar.n(7, bundle, (Bundle) null);
                }
            }

            public void t1(int i10) throws RemoteException {
                a aVar = this.f424c0.get();
                if (aVar != null) {
                    aVar.n(12, Integer.valueOf(i10), (Bundle) null);
                }
            }

            public void u(List<MediaSessionCompat.QueueItem> list) throws RemoteException {
                a aVar = this.f424c0.get();
                if (aVar != null) {
                    aVar.n(5, list, (Bundle) null);
                }
            }

            public void z(CharSequence charSequence) throws RemoteException {
                a aVar = this.f424c0.get();
                if (aVar != null) {
                    aVar.n(6, charSequence, (Bundle) null);
                }
            }
        }

        @x0({x0.a.O})
        public a a() {
            return this.f408c;
        }

        public void b(g gVar) {
        }

        public void binderDied() {
            n(8, (Object) null, (Bundle) null);
        }

        public void c(boolean z10) {
        }

        public void d(Bundle bundle) {
        }

        public void e(MediaMetadataCompat mediaMetadataCompat) {
        }

        public void f(PlaybackStateCompat playbackStateCompat) {
        }

        public void g(List<MediaSessionCompat.QueueItem> list) {
        }

        public void h(CharSequence charSequence) {
        }

        public void i(int i10) {
        }

        public void j() {
        }

        public void k(String str, Bundle bundle) {
        }

        public void l() {
        }

        public void m(int i10) {
        }

        public void n(int i10, Object obj, Bundle bundle) {
            C0009a aVar = this.f407b;
            if (aVar != null) {
                Message obtainMessage = aVar.obtainMessage(i10, obj);
                obtainMessage.setData(bundle);
                obtainMessage.sendToTarget();
            }
        }

        public void o(Handler handler) {
            if (handler == null) {
                C0009a aVar = this.f407b;
                if (aVar != null) {
                    aVar.f421a = false;
                    aVar.removeCallbacksAndMessages((Object) null);
                    this.f407b = null;
                    return;
                }
                return;
            }
            C0009a aVar2 = new C0009a(handler.getLooper());
            this.f407b = aVar2;
            aVar2.f421a = true;
        }
    }

    public static class b extends ComponentActivity.a {

        /* renamed from: a  reason: collision with root package name */
        public final MediaControllerCompat f425a;

        public b(MediaControllerCompat mediaControllerCompat) {
            this.f425a = mediaControllerCompat;
        }

        public MediaControllerCompat a() {
            return this.f425a;
        }
    }

    public interface c {
        int E();

        boolean F();

        List<MediaSessionCompat.QueueItem> G();

        g a();

        void b(int i10, int i11);

        void c(a aVar);

        MediaMetadataCompat d();

        PlaybackStateCompat e();

        boolean f(KeyEvent keyEvent);

        void g(int i10, int i11);

        Bundle getExtras();

        void h(MediaDescriptionCompat mediaDescriptionCompat, int i10);

        void i(String str, Bundle bundle, ResultReceiver resultReceiver);

        long j();

        int k();

        boolean l();

        PendingIntent m();

        String n();

        h o();

        void p(MediaDescriptionCompat mediaDescriptionCompat);

        void q(MediaDescriptionCompat mediaDescriptionCompat);

        int r();

        Object s();

        void t(a aVar, Handler handler);

        CharSequence v();
    }

    @t0(23)
    public static class d extends MediaControllerImplApi21 {
        public d(Context context, MediaSessionCompat.Token token) throws RemoteException {
            super(context, token);
        }

        public h o() {
            Object q10 = c.q(this.f401a);
            if (q10 != null) {
                return new j(q10);
            }
            return null;
        }
    }

    @t0(24)
    public static class e extends d {
        public e(Context context, MediaSessionCompat.Token token) throws RemoteException {
            super(context, token);
        }

        public h o() {
            Object q10 = c.q(this.f401a);
            if (q10 != null) {
                return new k(q10);
            }
            return null;
        }
    }

    public static class f implements c {

        /* renamed from: a  reason: collision with root package name */
        public b f426a;

        /* renamed from: b  reason: collision with root package name */
        public h f427b;

        public f(MediaSessionCompat.Token token) {
            this.f426a = b.a.D((IBinder) token.f());
        }

        public int E() {
            try {
                return this.f426a.E();
            } catch (RemoteException unused) {
                return -1;
            }
        }

        public boolean F() {
            try {
                return this.f426a.F();
            } catch (RemoteException unused) {
                return false;
            }
        }

        public List<MediaSessionCompat.QueueItem> G() {
            try {
                return this.f426a.G();
            } catch (RemoteException unused) {
                return null;
            }
        }

        public g a() {
            try {
                ParcelableVolumeInfo H1 = this.f426a.H1();
                return new g(H1.O, H1.P, H1.Q, H1.R, H1.S);
            } catch (RemoteException unused) {
                return null;
            }
        }

        public void b(int i10, int i11) {
            try {
                this.f426a.Y0(i10, i11, (String) null);
            } catch (RemoteException unused) {
            }
        }

        public void c(a aVar) {
            if (aVar != null) {
                try {
                    this.f426a.y0((a) aVar.f406a);
                    this.f426a.asBinder().unlinkToDeath(aVar, 0);
                } catch (RemoteException unused) {
                }
            } else {
                throw new IllegalArgumentException("callback may not be null.");
            }
        }

        public MediaMetadataCompat d() {
            try {
                return this.f426a.d();
            } catch (RemoteException unused) {
                return null;
            }
        }

        public PlaybackStateCompat e() {
            try {
                return this.f426a.e();
            } catch (RemoteException unused) {
                return null;
            }
        }

        public boolean f(KeyEvent keyEvent) {
            if (keyEvent != null) {
                try {
                    this.f426a.T0(keyEvent);
                    return false;
                } catch (RemoteException unused) {
                    return false;
                }
            } else {
                throw new IllegalArgumentException("event may not be null.");
            }
        }

        public void g(int i10, int i11) {
            try {
                this.f426a.T(i10, i11, (String) null);
            } catch (RemoteException unused) {
            }
        }

        public Bundle getExtras() {
            try {
                return this.f426a.getExtras();
            } catch (RemoteException unused) {
                return null;
            }
        }

        public void h(MediaDescriptionCompat mediaDescriptionCompat, int i10) {
            try {
                if ((this.f426a.j() & 4) != 0) {
                    this.f426a.d1(mediaDescriptionCompat, i10);
                    return;
                }
                throw new UnsupportedOperationException("This session doesn't support queue management operations");
            } catch (RemoteException unused) {
            }
        }

        public void i(String str, Bundle bundle, ResultReceiver resultReceiver) {
            try {
                this.f426a.w1(str, bundle, new MediaSessionCompat.ResultReceiverWrapper(resultReceiver));
            } catch (RemoteException unused) {
            }
        }

        public long j() {
            try {
                return this.f426a.j();
            } catch (RemoteException unused) {
                return 0;
            }
        }

        public int k() {
            try {
                return this.f426a.k();
            } catch (RemoteException unused) {
                return -1;
            }
        }

        public boolean l() {
            return true;
        }

        public PendingIntent m() {
            try {
                return this.f426a.Z();
            } catch (RemoteException unused) {
                return null;
            }
        }

        public String n() {
            try {
                return this.f426a.n();
            } catch (RemoteException unused) {
                return null;
            }
        }

        public h o() {
            if (this.f427b == null) {
                this.f427b = new l(this.f426a);
            }
            return this.f427b;
        }

        public void p(MediaDescriptionCompat mediaDescriptionCompat) {
            try {
                if ((this.f426a.j() & 4) != 0) {
                    this.f426a.p(mediaDescriptionCompat);
                    return;
                }
                throw new UnsupportedOperationException("This session doesn't support queue management operations");
            } catch (RemoteException unused) {
            }
        }

        public void q(MediaDescriptionCompat mediaDescriptionCompat) {
            try {
                if ((this.f426a.j() & 4) != 0) {
                    this.f426a.q(mediaDescriptionCompat);
                    return;
                }
                throw new UnsupportedOperationException("This session doesn't support queue management operations");
            } catch (RemoteException unused) {
            }
        }

        public int r() {
            try {
                return this.f426a.r();
            } catch (RemoteException unused) {
                return 0;
            }
        }

        public Object s() {
            return null;
        }

        public void t(a aVar, Handler handler) {
            if (aVar != null) {
                try {
                    this.f426a.asBinder().linkToDeath(aVar, 0);
                    this.f426a.N((a) aVar.f406a);
                    aVar.n(13, (Object) null, (Bundle) null);
                } catch (RemoteException unused) {
                    aVar.n(8, (Object) null, (Bundle) null);
                }
            } else {
                throw new IllegalArgumentException("callback may not be null.");
            }
        }

        public CharSequence v() {
            try {
                return this.f426a.v();
            } catch (RemoteException unused) {
                return null;
            }
        }
    }

    public static final class g {

        /* renamed from: f  reason: collision with root package name */
        public static final int f428f = 1;

        /* renamed from: g  reason: collision with root package name */
        public static final int f429g = 2;

        /* renamed from: a  reason: collision with root package name */
        public final int f430a;

        /* renamed from: b  reason: collision with root package name */
        public final int f431b;

        /* renamed from: c  reason: collision with root package name */
        public final int f432c;

        /* renamed from: d  reason: collision with root package name */
        public final int f433d;

        /* renamed from: e  reason: collision with root package name */
        public final int f434e;

        public g(int i10, int i11, int i12, int i13, int i14) {
            this.f430a = i10;
            this.f431b = i11;
            this.f432c = i12;
            this.f433d = i13;
            this.f434e = i14;
        }

        public int a() {
            return this.f431b;
        }

        public int b() {
            return this.f434e;
        }

        public int c() {
            return this.f433d;
        }

        public int d() {
            return this.f430a;
        }

        public int e() {
            return this.f432c;
        }
    }

    public static abstract class h {

        /* renamed from: a  reason: collision with root package name */
        public static final String f435a = "android.media.session.extra.LEGACY_STREAM_TYPE";

        public abstract void a();

        public abstract void b();

        public abstract void c();

        public abstract void d(String str, Bundle bundle);

        public abstract void e(String str, Bundle bundle);

        public abstract void f(Uri uri, Bundle bundle);

        public abstract void g();

        public abstract void h(String str, Bundle bundle);

        public abstract void i(String str, Bundle bundle);

        public abstract void j(Uri uri, Bundle bundle);

        public abstract void k();

        public abstract void l(long j10);

        public abstract void m(PlaybackStateCompat.CustomAction customAction, Bundle bundle);

        public abstract void n(String str, Bundle bundle);

        public abstract void o(boolean z10);

        public abstract void p(RatingCompat ratingCompat);

        public abstract void q(RatingCompat ratingCompat, Bundle bundle);

        public abstract void r(int i10);

        public abstract void s(int i10);

        public abstract void t();

        public abstract void u();

        public abstract void v(long j10);

        public abstract void w();
    }

    public static class i extends h {

        /* renamed from: b  reason: collision with root package name */
        public final Object f436b;

        public i(Object obj) {
            this.f436b = obj;
        }

        public void a() {
            c.d.a(this.f436b);
        }

        public void b() {
            c.d.b(this.f436b);
        }

        public void c() {
            c.d.c(this.f436b);
        }

        public void d(String str, Bundle bundle) {
            c.d.d(this.f436b, str, bundle);
        }

        public void e(String str, Bundle bundle) {
            c.d.e(this.f436b, str, bundle);
        }

        public void f(Uri uri, Bundle bundle) {
            if (uri == null || Uri.EMPTY.equals(uri)) {
                throw new IllegalArgumentException("You must specify a non-empty Uri for playFromUri.");
            }
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable(MediaSessionCompat.B, uri);
            bundle2.putBundle(MediaSessionCompat.D, bundle);
            n(MediaSessionCompat.f451q, bundle2);
        }

        public void g() {
            n(MediaSessionCompat.f452r, (Bundle) null);
        }

        public void h(String str, Bundle bundle) {
            Bundle bundle2 = new Bundle();
            bundle2.putString(MediaSessionCompat.f460z, str);
            bundle2.putBundle(MediaSessionCompat.D, bundle);
            n(MediaSessionCompat.f453s, bundle2);
        }

        public void i(String str, Bundle bundle) {
            Bundle bundle2 = new Bundle();
            bundle2.putString(MediaSessionCompat.A, str);
            bundle2.putBundle(MediaSessionCompat.D, bundle);
            n(MediaSessionCompat.f454t, bundle2);
        }

        public void j(Uri uri, Bundle bundle) {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable(MediaSessionCompat.B, uri);
            bundle2.putBundle(MediaSessionCompat.D, bundle);
            n(MediaSessionCompat.f455u, bundle2);
        }

        public void k() {
            c.d.f(this.f436b);
        }

        public void l(long j10) {
            c.d.g(this.f436b, j10);
        }

        public void m(PlaybackStateCompat.CustomAction customAction, Bundle bundle) {
            MediaControllerCompat.F(customAction.b(), bundle);
            c.d.h(this.f436b, customAction.b(), bundle);
        }

        public void n(String str, Bundle bundle) {
            MediaControllerCompat.F(str, bundle);
            c.d.h(this.f436b, str, bundle);
        }

        public void o(boolean z10) {
            Bundle bundle = new Bundle();
            bundle.putBoolean(MediaSessionCompat.E, z10);
            n(MediaSessionCompat.f456v, bundle);
        }

        public void p(RatingCompat ratingCompat) {
            c.d.i(this.f436b, ratingCompat != null ? ratingCompat.c() : null);
        }

        public void q(RatingCompat ratingCompat, Bundle bundle) {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable(MediaSessionCompat.C, ratingCompat);
            bundle2.putBundle(MediaSessionCompat.D, bundle);
            n(MediaSessionCompat.f459y, bundle2);
        }

        public void r(int i10) {
            Bundle bundle = new Bundle();
            bundle.putInt(MediaSessionCompat.F, i10);
            n(MediaSessionCompat.f457w, bundle);
        }

        public void s(int i10) {
            Bundle bundle = new Bundle();
            bundle.putInt(MediaSessionCompat.G, i10);
            n(MediaSessionCompat.f458x, bundle);
        }

        public void t() {
            c.d.j(this.f436b);
        }

        public void u() {
            c.d.k(this.f436b);
        }

        public void v(long j10) {
            c.d.l(this.f436b, j10);
        }

        public void w() {
            c.d.m(this.f436b);
        }
    }

    @t0(23)
    public static class j extends i {
        public j(Object obj) {
            super(obj);
        }

        public void f(Uri uri, Bundle bundle) {
            d.a.a(this.f436b, uri, bundle);
        }
    }

    @t0(24)
    public static class k extends j {
        public k(Object obj) {
            super(obj);
        }

        public void g() {
            i.a.a(this.f436b);
        }

        public void h(String str, Bundle bundle) {
            i.a.b(this.f436b, str, bundle);
        }

        public void i(String str, Bundle bundle) {
            i.a.c(this.f436b, str, bundle);
        }

        public void j(Uri uri, Bundle bundle) {
            i.a.d(this.f436b, uri, bundle);
        }
    }

    public static class l extends h {

        /* renamed from: b  reason: collision with root package name */
        public b f437b;

        public l(b bVar) {
            this.f437b = bVar;
        }

        public void a() {
            try {
                this.f437b.I0();
            } catch (RemoteException unused) {
            }
        }

        public void b() {
            try {
                this.f437b.pause();
            } catch (RemoteException unused) {
            }
        }

        public void c() {
            try {
                this.f437b.f();
            } catch (RemoteException unused) {
            }
        }

        public void d(String str, Bundle bundle) {
            try {
                this.f437b.B0(str, bundle);
            } catch (RemoteException unused) {
            }
        }

        public void e(String str, Bundle bundle) {
            try {
                this.f437b.F0(str, bundle);
            } catch (RemoteException unused) {
            }
        }

        public void f(Uri uri, Bundle bundle) {
            try {
                this.f437b.L0(uri, bundle);
            } catch (RemoteException unused) {
            }
        }

        public void g() {
            try {
                this.f437b.g0();
            } catch (RemoteException unused) {
            }
        }

        public void h(String str, Bundle bundle) {
            try {
                this.f437b.x0(str, bundle);
            } catch (RemoteException unused) {
            }
        }

        public void i(String str, Bundle bundle) {
            try {
                this.f437b.e0(str, bundle);
            } catch (RemoteException unused) {
            }
        }

        public void j(Uri uri, Bundle bundle) {
            try {
                this.f437b.V(uri, bundle);
            } catch (RemoteException unused) {
            }
        }

        public void k() {
            try {
                this.f437b.x1();
            } catch (RemoteException unused) {
            }
        }

        public void l(long j10) {
            try {
                this.f437b.x(j10);
            } catch (RemoteException unused) {
            }
        }

        public void m(PlaybackStateCompat.CustomAction customAction, Bundle bundle) {
            n(customAction.b(), bundle);
        }

        public void n(String str, Bundle bundle) {
            MediaControllerCompat.F(str, bundle);
            try {
                this.f437b.L(str, bundle);
            } catch (RemoteException unused) {
            }
        }

        public void o(boolean z10) {
            try {
                this.f437b.B(z10);
            } catch (RemoteException unused) {
            }
        }

        public void p(RatingCompat ratingCompat) {
            try {
                this.f437b.R(ratingCompat);
            } catch (RemoteException unused) {
            }
        }

        public void q(RatingCompat ratingCompat, Bundle bundle) {
            try {
                this.f437b.b1(ratingCompat, bundle);
            } catch (RemoteException unused) {
            }
        }

        public void r(int i10) {
            try {
                this.f437b.i(i10);
            } catch (RemoteException unused) {
            }
        }

        public void s(int i10) {
            try {
                this.f437b.I(i10);
            } catch (RemoteException unused) {
            }
        }

        public void t() {
            try {
                this.f437b.next();
            } catch (RemoteException unused) {
            }
        }

        public void u() {
            try {
                this.f437b.previous();
            } catch (RemoteException unused) {
            }
        }

        public void v(long j10) {
            try {
                this.f437b.E1(j10);
            } catch (RemoteException unused) {
            }
        }

        public void w() {
            try {
                this.f437b.stop();
            } catch (RemoteException unused) {
            }
        }
    }

    public MediaControllerCompat(Context context, @m0 MediaSessionCompat.Token token) throws RemoteException {
        if (token != null) {
            this.f399b = token;
            this.f398a = Build.VERSION.SDK_INT >= 24 ? new e(context, token) : new d(context, token);
            return;
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }

    public MediaControllerCompat(Context context, @m0 MediaSessionCompat mediaSessionCompat) {
        if (mediaSessionCompat != null) {
            MediaSessionCompat.Token i10 = mediaSessionCompat.i();
            this.f399b = i10;
            c cVar = null;
            try {
                cVar = Build.VERSION.SDK_INT >= 24 ? new e(context, i10) : new d(context, i10);
            } catch (RemoteException unused) {
            }
            this.f398a = cVar;
            return;
        }
        throw new IllegalArgumentException("session must not be null");
    }

    public static void C(@m0 Activity activity, MediaControllerCompat mediaControllerCompat) {
        if (activity instanceof ComponentActivity) {
            ((ComponentActivity) activity).Q(new b(mediaControllerCompat));
        }
        Object obj = null;
        if (mediaControllerCompat != null) {
            obj = c.d(activity, mediaControllerCompat.r().f());
        }
        c.t(activity, obj);
    }

    public static void F(String str, Bundle bundle) {
        if (str != null) {
            if (!str.equals(MediaSessionCompat.f444j) && !str.equals(MediaSessionCompat.f445k)) {
                return;
            }
            if (bundle == null || !bundle.containsKey(MediaSessionCompat.f446l)) {
                throw new IllegalArgumentException("An extra field android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE is required for this action " + str + ".");
            }
        }
    }

    public static MediaControllerCompat g(@m0 Activity activity) {
        if (activity instanceof ComponentActivity) {
            b bVar = (b) ((ComponentActivity) activity).P(b.class);
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }
        Object g10 = c.g(activity);
        if (g10 == null) {
            return null;
        }
        try {
            return new MediaControllerCompat((Context) activity, MediaSessionCompat.Token.b(c.p(g10)));
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Deprecated
    public void A(int i10) {
        MediaSessionCompat.QueueItem queueItem;
        List<MediaSessionCompat.QueueItem> m10 = m();
        if (m10 != null && i10 >= 0 && i10 < m10.size() && (queueItem = m10.get(i10)) != null) {
            z(queueItem.c());
        }
    }

    public void B(@m0 String str, Bundle bundle, ResultReceiver resultReceiver) {
        if (!TextUtils.isEmpty(str)) {
            this.f398a.i(str, bundle, resultReceiver);
            return;
        }
        throw new IllegalArgumentException("command must neither be null nor empty");
    }

    public void D(int i10, int i11) {
        this.f398a.g(i10, i11);
    }

    public void E(@m0 a aVar) {
        if (aVar != null) {
            try {
                this.f400c.remove(aVar);
                this.f398a.c(aVar);
            } finally {
                aVar.o((Handler) null);
            }
        } else {
            throw new IllegalArgumentException("callback must not be null");
        }
    }

    public void a(MediaDescriptionCompat mediaDescriptionCompat) {
        this.f398a.q(mediaDescriptionCompat);
    }

    public void b(MediaDescriptionCompat mediaDescriptionCompat, int i10) {
        this.f398a.h(mediaDescriptionCompat, i10);
    }

    public void c(int i10, int i11) {
        this.f398a.b(i10, i11);
    }

    public boolean d(KeyEvent keyEvent) {
        if (keyEvent != null) {
            return this.f398a.f(keyEvent);
        }
        throw new IllegalArgumentException("KeyEvent may not be null");
    }

    public Bundle e() {
        return this.f398a.getExtras();
    }

    public long f() {
        return this.f398a.j();
    }

    public Object h() {
        return this.f398a.s();
    }

    public MediaMetadataCompat i() {
        return this.f398a.d();
    }

    public String j() {
        return this.f398a.n();
    }

    public g k() {
        return this.f398a.a();
    }

    public PlaybackStateCompat l() {
        return this.f398a.e();
    }

    public List<MediaSessionCompat.QueueItem> m() {
        return this.f398a.G();
    }

    public CharSequence n() {
        return this.f398a.v();
    }

    public int o() {
        return this.f398a.r();
    }

    public int p() {
        return this.f398a.k();
    }

    public PendingIntent q() {
        return this.f398a.m();
    }

    public MediaSessionCompat.Token r() {
        return this.f399b;
    }

    @x0({x0.a.P})
    @o0
    public Bundle s() {
        return this.f399b.e();
    }

    public int t() {
        return this.f398a.E();
    }

    public h u() {
        return this.f398a.o();
    }

    public boolean v() {
        return this.f398a.F();
    }

    public boolean w() {
        return this.f398a.l();
    }

    public void x(@m0 a aVar) {
        y(aVar, (Handler) null);
    }

    public void y(@m0 a aVar, Handler handler) {
        if (aVar != null) {
            if (handler == null) {
                handler = new Handler();
            }
            aVar.o(handler);
            this.f398a.t(aVar, handler);
            this.f400c.add(aVar);
            return;
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    public void z(MediaDescriptionCompat mediaDescriptionCompat) {
        this.f398a.p(mediaDescriptionCompat);
    }
}
