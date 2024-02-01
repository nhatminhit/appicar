package androidx.media;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.media.e;
import androidx.media.f;
import androidx.media.i;
import androidx.media.j;
import d.m0;
import d.o0;
import d.t0;
import d.x0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public abstract class MediaBrowserServiceCompat extends Service {
    public static final String T = "MBServiceCompat";
    public static final boolean U = Log.isLoggable(T, 3);
    public static final float V = 1.0E-5f;
    public static final String W = "android.media.browse.MediaBrowserService";
    @x0({x0.a.O})
    public static final String X = "media_item";
    @x0({x0.a.O})
    public static final String Y = "search_results";
    public static final int Z = 1;

    /* renamed from: a0  reason: collision with root package name */
    public static final int f2914a0 = 2;

    /* renamed from: b0  reason: collision with root package name */
    public static final int f2915b0 = 4;
    @x0({x0.a.O})

    /* renamed from: c0  reason: collision with root package name */
    public static final int f2916c0 = -1;
    @x0({x0.a.O})

    /* renamed from: d0  reason: collision with root package name */
    public static final int f2917d0 = 0;
    @x0({x0.a.O})

    /* renamed from: e0  reason: collision with root package name */
    public static final int f2918e0 = 1;
    public g O;
    public final androidx.collection.a<IBinder, f> P = new androidx.collection.a<>();
    public f Q;
    public final q R = new q();
    public MediaSessionCompat.Token S;

    public class a extends m<List<MediaBrowserCompat.MediaItem>> {

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ f f2919g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ String f2920h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ Bundle f2921i;

        /* renamed from: j  reason: collision with root package name */
        public final /* synthetic */ Bundle f2922j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Object obj, f fVar, String str, Bundle bundle, Bundle bundle2) {
            super(obj);
            this.f2919g = fVar;
            this.f2920h = str;
            this.f2921i = bundle;
            this.f2922j = bundle2;
        }

        /* renamed from: l */
        public void g(List<MediaBrowserCompat.MediaItem> list) {
            if (MediaBrowserServiceCompat.this.P.get(this.f2919g.f2941f.asBinder()) == this.f2919g) {
                if ((c() & 1) != 0) {
                    list = MediaBrowserServiceCompat.this.b(list, this.f2921i);
                }
                try {
                    this.f2919g.f2941f.a(this.f2920h, list, this.f2921i, this.f2922j);
                } catch (RemoteException unused) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Calling onLoadChildren() failed for id=");
                    sb2.append(this.f2920h);
                    sb2.append(" package=");
                    sb2.append(this.f2919g.f2936a);
                }
            } else if (MediaBrowserServiceCompat.U) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Not sending onLoadChildren result for connection that has been disconnected. pkg=");
                sb3.append(this.f2919g.f2936a);
                sb3.append(" id=");
                sb3.append(this.f2920h);
            }
        }
    }

    public class b extends m<MediaBrowserCompat.MediaItem> {

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ ResultReceiver f2924g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.f2924g = resultReceiver;
        }

        /* renamed from: l */
        public void g(MediaBrowserCompat.MediaItem mediaItem) {
            if ((c() & 2) != 0) {
                this.f2924g.b(-1, (Bundle) null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable(MediaBrowserServiceCompat.X, mediaItem);
            this.f2924g.b(0, bundle);
        }
    }

    public class c extends m<List<MediaBrowserCompat.MediaItem>> {

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ ResultReceiver f2926g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.f2926g = resultReceiver;
        }

        /* renamed from: l */
        public void g(List<MediaBrowserCompat.MediaItem> list) {
            if ((c() & 4) != 0 || list == null) {
                this.f2926g.b(-1, (Bundle) null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArray(MediaBrowserServiceCompat.Y, (Parcelable[]) list.toArray(new MediaBrowserCompat.MediaItem[0]));
            this.f2926g.b(0, bundle);
        }
    }

    public class d extends m<Bundle> {

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ ResultReceiver f2928g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(Object obj, ResultReceiver resultReceiver) {
            super(obj);
            this.f2928g = resultReceiver;
        }

        public void e(Bundle bundle) {
            this.f2928g.b(-1, bundle);
        }

        public void f(Bundle bundle) {
            this.f2928g.b(1, bundle);
        }

        /* renamed from: l */
        public void g(Bundle bundle) {
            this.f2928g.b(0, bundle);
        }
    }

    public static final class e {

        /* renamed from: c  reason: collision with root package name */
        public static final String f2930c = "android.service.media.extra.RECENT";

        /* renamed from: d  reason: collision with root package name */
        public static final String f2931d = "android.service.media.extra.OFFLINE";

        /* renamed from: e  reason: collision with root package name */
        public static final String f2932e = "android.service.media.extra.SUGGESTED";
        @Deprecated

        /* renamed from: f  reason: collision with root package name */
        public static final String f2933f = "android.service.media.extra.SUGGESTION_KEYWORDS";

        /* renamed from: a  reason: collision with root package name */
        public final String f2934a;

        /* renamed from: b  reason: collision with root package name */
        public final Bundle f2935b;

        public e(@m0 String str, @o0 Bundle bundle) {
            if (str != null) {
                this.f2934a = str;
                this.f2935b = bundle;
                return;
            }
            throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead.");
        }

        public Bundle a() {
            return this.f2935b;
        }

        public String b() {
            return this.f2934a;
        }
    }

    public class f implements IBinder.DeathRecipient {

        /* renamed from: a  reason: collision with root package name */
        public final String f2936a;

        /* renamed from: b  reason: collision with root package name */
        public final int f2937b;

        /* renamed from: c  reason: collision with root package name */
        public final int f2938c;

        /* renamed from: d  reason: collision with root package name */
        public final j.b f2939d;

        /* renamed from: e  reason: collision with root package name */
        public final Bundle f2940e;

        /* renamed from: f  reason: collision with root package name */
        public final o f2941f;

        /* renamed from: g  reason: collision with root package name */
        public final HashMap<String, List<e1.j<IBinder, Bundle>>> f2942g = new HashMap<>();

        /* renamed from: h  reason: collision with root package name */
        public e f2943h;

        public class a implements Runnable {
            public a() {
            }

            public void run() {
                f fVar = f.this;
                MediaBrowserServiceCompat.this.P.remove(fVar.f2941f.asBinder());
            }
        }

        public f(String str, int i10, int i11, Bundle bundle, o oVar) {
            this.f2936a = str;
            this.f2937b = i10;
            this.f2938c = i11;
            this.f2939d = new j.b(str, i10, i11);
            this.f2940e = bundle;
            this.f2941f = oVar;
        }

        public void binderDied() {
            MediaBrowserServiceCompat.this.R.post(new a());
        }
    }

    public interface g {
        Bundle b();

        void c(j.b bVar, String str, Bundle bundle);

        j.b e();

        IBinder f(Intent intent);

        void i(String str, Bundle bundle);

        void j(MediaSessionCompat.Token token);

        void onCreate();
    }

    @t0(21)
    public class h implements g, e.d {

        /* renamed from: a  reason: collision with root package name */
        public final List<Bundle> f2945a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public Object f2946b;

        /* renamed from: c  reason: collision with root package name */
        public Messenger f2947c;

        public class a implements Runnable {
            public final /* synthetic */ MediaSessionCompat.Token O;

            public a(MediaSessionCompat.Token token) {
                this.O = token;
            }

            public void run() {
                if (!h.this.f2945a.isEmpty()) {
                    android.support.v4.media.session.b d10 = this.O.d();
                    if (d10 != null) {
                        for (Bundle b10 : h.this.f2945a) {
                            h0.m.b(b10, c.f2988s, d10.asBinder());
                        }
                    }
                    h.this.f2945a.clear();
                }
                e.e(h.this.f2946b, this.O.f());
            }
        }

        public class b extends m<List<MediaBrowserCompat.MediaItem>> {

            /* renamed from: g  reason: collision with root package name */
            public final /* synthetic */ e.c f2949g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(Object obj, e.c cVar) {
                super(obj);
                this.f2949g = cVar;
            }

            public void b() {
                this.f2949g.a();
            }

            /* renamed from: l */
            public void g(List<MediaBrowserCompat.MediaItem> list) {
                ArrayList arrayList;
                if (list != null) {
                    arrayList = new ArrayList();
                    for (MediaBrowserCompat.MediaItem writeToParcel : list) {
                        Parcel obtain = Parcel.obtain();
                        writeToParcel.writeToParcel(obtain, 0);
                        arrayList.add(obtain);
                    }
                } else {
                    arrayList = null;
                }
                this.f2949g.c(arrayList);
            }
        }

        public class c implements Runnable {
            public final /* synthetic */ String O;
            public final /* synthetic */ Bundle P;

            public c(String str, Bundle bundle) {
                this.O = str;
                this.P = bundle;
            }

            public void run() {
                for (IBinder iBinder : MediaBrowserServiceCompat.this.P.keySet()) {
                    androidx.collection.a<IBinder, f> aVar = MediaBrowserServiceCompat.this.P;
                    h.this.m(aVar.get(iBinder), this.O, this.P);
                }
            }
        }

        public class d implements Runnable {
            public final /* synthetic */ j.b O;
            public final /* synthetic */ String P;
            public final /* synthetic */ Bundle Q;

            public d(j.b bVar, String str, Bundle bundle) {
                this.O = bVar;
                this.P = str;
                this.Q = bundle;
            }

            public void run() {
                for (int i10 = 0; i10 < MediaBrowserServiceCompat.this.P.size(); i10++) {
                    f q10 = MediaBrowserServiceCompat.this.P.q(i10);
                    if (q10.f2939d.equals(this.O)) {
                        h.this.m(q10, this.P, this.Q);
                    }
                }
            }
        }

        public h() {
        }

        public Bundle b() {
            if (this.f2947c == null) {
                return null;
            }
            f fVar = MediaBrowserServiceCompat.this.Q;
            if (fVar == null) {
                throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
            } else if (fVar.f2940e == null) {
                return null;
            } else {
                return new Bundle(MediaBrowserServiceCompat.this.Q.f2940e);
            }
        }

        public void c(j.b bVar, String str, Bundle bundle) {
            k(bVar, str, bundle);
        }

        public void d(String str, e.c<List<Parcel>> cVar) {
            MediaBrowserServiceCompat.this.m(str, new b(str, cVar));
        }

        public j.b e() {
            f fVar = MediaBrowserServiceCompat.this.Q;
            if (fVar != null) {
                return fVar.f2939d;
            }
            throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }

        public IBinder f(Intent intent) {
            return e.c(this.f2946b, intent);
        }

        public e.a h(String str, int i10, Bundle bundle) {
            Bundle bundle2;
            if (bundle == null || bundle.getInt(c.f2985p, 0) == 0) {
                bundle2 = null;
            } else {
                bundle.remove(c.f2985p);
                this.f2947c = new Messenger(MediaBrowserServiceCompat.this.R);
                bundle2 = new Bundle();
                bundle2.putInt(c.f2986q, 2);
                h0.m.b(bundle2, c.f2987r, this.f2947c.getBinder());
                MediaSessionCompat.Token token = MediaBrowserServiceCompat.this.S;
                if (token != null) {
                    android.support.v4.media.session.b d10 = token.d();
                    h0.m.b(bundle2, c.f2988s, d10 == null ? null : d10.asBinder());
                } else {
                    this.f2945a.add(bundle2);
                }
            }
            MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
            mediaBrowserServiceCompat.Q = new f(str, -1, i10, bundle, (o) null);
            e l10 = MediaBrowserServiceCompat.this.l(str, i10, bundle);
            MediaBrowserServiceCompat.this.Q = null;
            if (l10 == null) {
                return null;
            }
            if (bundle2 == null) {
                bundle2 = l10.a();
            } else if (l10.a() != null) {
                bundle2.putAll(l10.a());
            }
            return new e.a(l10.b(), bundle2);
        }

        public void i(String str, Bundle bundle) {
            n(str, bundle);
            l(str, bundle);
        }

        public void j(MediaSessionCompat.Token token) {
            MediaBrowserServiceCompat.this.R.a(new a(token));
        }

        public void k(j.b bVar, String str, Bundle bundle) {
            MediaBrowserServiceCompat.this.R.post(new d(bVar, str, bundle));
        }

        public void l(String str, Bundle bundle) {
            MediaBrowserServiceCompat.this.R.post(new c(str, bundle));
        }

        public void m(f fVar, String str, Bundle bundle) {
            List<e1.j> list = fVar.f2942g.get(str);
            if (list != null) {
                for (e1.j jVar : list) {
                    if (b.b(bundle, (Bundle) jVar.f6733b)) {
                        MediaBrowserServiceCompat.this.t(str, fVar, (Bundle) jVar.f6733b, bundle);
                    }
                }
            }
        }

        public void n(String str, Bundle bundle) {
            e.b(this.f2946b, str);
        }

        public void onCreate() {
            Object a10 = e.a(MediaBrowserServiceCompat.this, this);
            this.f2946b = a10;
            e.d(a10);
        }
    }

    @t0(23)
    public class i extends h implements f.b {

        public class a extends m<MediaBrowserCompat.MediaItem> {

            /* renamed from: g  reason: collision with root package name */
            public final /* synthetic */ e.c f2952g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(Object obj, e.c cVar) {
                super(obj);
                this.f2952g = cVar;
            }

            public void b() {
                this.f2952g.a();
            }

            /* renamed from: l */
            public void g(MediaBrowserCompat.MediaItem mediaItem) {
                e.c cVar;
                Parcel parcel;
                if (mediaItem == null) {
                    cVar = this.f2952g;
                    parcel = null;
                } else {
                    parcel = Parcel.obtain();
                    mediaItem.writeToParcel(parcel, 0);
                    cVar = this.f2952g;
                }
                cVar.c(parcel);
            }
        }

        public i() {
            super();
        }

        public void a(String str, e.c<Parcel> cVar) {
            MediaBrowserServiceCompat.this.o(str, new a(str, cVar));
        }

        public void onCreate() {
            Object a10 = f.a(MediaBrowserServiceCompat.this, this);
            this.f2946b = a10;
            e.d(a10);
        }
    }

    @t0(26)
    public class j extends i implements i.c {

        public class a extends m<List<MediaBrowserCompat.MediaItem>> {

            /* renamed from: g  reason: collision with root package name */
            public final /* synthetic */ i.b f2955g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(Object obj, i.b bVar) {
                super(obj);
                this.f2955g = bVar;
            }

            public void b() {
                this.f2955g.a();
            }

            /* renamed from: l */
            public void g(List<MediaBrowserCompat.MediaItem> list) {
                ArrayList arrayList;
                if (list != null) {
                    arrayList = new ArrayList();
                    for (MediaBrowserCompat.MediaItem writeToParcel : list) {
                        Parcel obtain = Parcel.obtain();
                        writeToParcel.writeToParcel(obtain, 0);
                        arrayList.add(obtain);
                    }
                } else {
                    arrayList = null;
                }
                this.f2955g.c(arrayList, c());
            }
        }

        public j() {
            super();
        }

        public Bundle b() {
            f fVar = MediaBrowserServiceCompat.this.Q;
            if (fVar == null) {
                return i.b(this.f2946b);
            }
            if (fVar.f2940e == null) {
                return null;
            }
            return new Bundle(MediaBrowserServiceCompat.this.Q.f2940e);
        }

        public void g(String str, i.b bVar, Bundle bundle) {
            MediaBrowserServiceCompat.this.n(str, new a(str, bVar), bundle);
        }

        public void n(String str, Bundle bundle) {
            if (bundle != null) {
                i.c(this.f2946b, str, bundle);
            } else {
                super.n(str, bundle);
            }
        }

        public void onCreate() {
            Object a10 = i.a(MediaBrowserServiceCompat.this, this);
            this.f2946b = a10;
            e.d(a10);
        }
    }

    @t0(28)
    public class k extends j {
        public k() {
            super();
        }

        public j.b e() {
            f fVar = MediaBrowserServiceCompat.this.Q;
            return fVar != null ? fVar.f2939d : new j.b(((MediaBrowserService) this.f2946b).getCurrentBrowserInfo());
        }
    }

    public class l implements g {

        /* renamed from: a  reason: collision with root package name */
        public Messenger f2958a;

        public class a implements Runnable {
            public final /* synthetic */ MediaSessionCompat.Token O;

            public a(MediaSessionCompat.Token token) {
                this.O = token;
            }

            public void run() {
                Iterator<f> it = MediaBrowserServiceCompat.this.P.values().iterator();
                while (it.hasNext()) {
                    f next = it.next();
                    try {
                        next.f2941f.c(next.f2943h.b(), this.O, next.f2943h.a());
                    } catch (RemoteException unused) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Connection for ");
                        sb2.append(next.f2936a);
                        sb2.append(" is no longer valid.");
                        it.remove();
                    }
                }
            }
        }

        public class b implements Runnable {
            public final /* synthetic */ String O;
            public final /* synthetic */ Bundle P;

            public b(String str, Bundle bundle) {
                this.O = str;
                this.P = bundle;
            }

            public void run() {
                for (IBinder iBinder : MediaBrowserServiceCompat.this.P.keySet()) {
                    androidx.collection.a<IBinder, f> aVar = MediaBrowserServiceCompat.this.P;
                    l.this.a(aVar.get(iBinder), this.O, this.P);
                }
            }
        }

        public class c implements Runnable {
            public final /* synthetic */ j.b O;
            public final /* synthetic */ String P;
            public final /* synthetic */ Bundle Q;

            public c(j.b bVar, String str, Bundle bundle) {
                this.O = bVar;
                this.P = str;
                this.Q = bundle;
            }

            public void run() {
                for (int i10 = 0; i10 < MediaBrowserServiceCompat.this.P.size(); i10++) {
                    f q10 = MediaBrowserServiceCompat.this.P.q(i10);
                    if (q10.f2939d.equals(this.O)) {
                        l.this.a(q10, this.P, this.Q);
                        return;
                    }
                }
            }
        }

        public l() {
        }

        public void a(f fVar, String str, Bundle bundle) {
            List<e1.j> list = fVar.f2942g.get(str);
            if (list != null) {
                for (e1.j jVar : list) {
                    if (b.b(bundle, (Bundle) jVar.f6733b)) {
                        MediaBrowserServiceCompat.this.t(str, fVar, (Bundle) jVar.f6733b, bundle);
                    }
                }
            }
        }

        public Bundle b() {
            f fVar = MediaBrowserServiceCompat.this.Q;
            if (fVar == null) {
                throw new IllegalStateException("This should be called inside of onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
            } else if (fVar.f2940e == null) {
                return null;
            } else {
                return new Bundle(MediaBrowserServiceCompat.this.Q.f2940e);
            }
        }

        public void c(@m0 j.b bVar, @m0 String str, Bundle bundle) {
            MediaBrowserServiceCompat.this.R.post(new c(bVar, str, bundle));
        }

        public j.b e() {
            f fVar = MediaBrowserServiceCompat.this.Q;
            if (fVar != null) {
                return fVar.f2939d;
            }
            throw new IllegalStateException("This should be called inside of onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }

        public IBinder f(Intent intent) {
            if (MediaBrowserServiceCompat.W.equals(intent.getAction())) {
                return this.f2958a.getBinder();
            }
            return null;
        }

        public void i(@m0 String str, Bundle bundle) {
            MediaBrowserServiceCompat.this.R.post(new b(str, bundle));
        }

        public void j(MediaSessionCompat.Token token) {
            MediaBrowserServiceCompat.this.R.post(new a(token));
        }

        public void onCreate() {
            this.f2958a = new Messenger(MediaBrowserServiceCompat.this.R);
        }
    }

    public static class m<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Object f2960a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f2961b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f2962c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f2963d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f2964e;

        /* renamed from: f  reason: collision with root package name */
        public int f2965f;

        public m(Object obj) {
            this.f2960a = obj;
        }

        public final void a(Bundle bundle) {
            if (bundle != null && bundle.containsKey(MediaBrowserCompat.f294g)) {
                float f10 = bundle.getFloat(MediaBrowserCompat.f294g);
                if (f10 < -1.0E-5f || f10 > 1.00001f) {
                    throw new IllegalArgumentException("The value of the EXTRA_DOWNLOAD_PROGRESS field must be a float number within [0.0, 1.0].");
                }
            }
        }

        public void b() {
            if (this.f2961b) {
                throw new IllegalStateException("detach() called when detach() had already been called for: " + this.f2960a);
            } else if (this.f2962c) {
                throw new IllegalStateException("detach() called when sendResult() had already been called for: " + this.f2960a);
            } else if (!this.f2964e) {
                this.f2961b = true;
            } else {
                throw new IllegalStateException("detach() called when sendError() had already been called for: " + this.f2960a);
            }
        }

        public int c() {
            return this.f2965f;
        }

        public boolean d() {
            return this.f2961b || this.f2962c || this.f2964e;
        }

        public void e(Bundle bundle) {
            throw new UnsupportedOperationException("It is not supported to send an error for " + this.f2960a);
        }

        public void f(Bundle bundle) {
            throw new UnsupportedOperationException("It is not supported to send an interim update for " + this.f2960a);
        }

        public void g(T t10) {
        }

        public void h(Bundle bundle) {
            if (this.f2962c || this.f2964e) {
                throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + this.f2960a);
            }
            this.f2964e = true;
            e(bundle);
        }

        public void i(Bundle bundle) {
            if (this.f2962c || this.f2964e) {
                throw new IllegalStateException("sendProgressUpdate() called when either sendResult() or sendError() had already been called for: " + this.f2960a);
            }
            a(bundle);
            this.f2963d = true;
            f(bundle);
        }

        public void j(T t10) {
            if (this.f2962c || this.f2964e) {
                throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.f2960a);
            }
            this.f2962c = true;
            g(t10);
        }

        public void k(int i10) {
            this.f2965f = i10;
        }
    }

    public class n {

        public class a implements Runnable {
            public final /* synthetic */ o O;
            public final /* synthetic */ String P;
            public final /* synthetic */ int Q;
            public final /* synthetic */ int R;
            public final /* synthetic */ Bundle S;

            public a(o oVar, String str, int i10, int i11, Bundle bundle) {
                this.O = oVar;
                this.P = str;
                this.Q = i10;
                this.R = i11;
                this.S = bundle;
            }

            public void run() {
                IBinder asBinder = this.O.asBinder();
                MediaBrowserServiceCompat.this.P.remove(asBinder);
                f fVar = new f(this.P, this.Q, this.R, this.S, this.O);
                MediaBrowserServiceCompat mediaBrowserServiceCompat = MediaBrowserServiceCompat.this;
                mediaBrowserServiceCompat.Q = fVar;
                e l10 = mediaBrowserServiceCompat.l(this.P, this.R, this.S);
                fVar.f2943h = l10;
                MediaBrowserServiceCompat mediaBrowserServiceCompat2 = MediaBrowserServiceCompat.this;
                mediaBrowserServiceCompat2.Q = null;
                if (l10 == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("No root for client ");
                    sb2.append(this.P);
                    sb2.append(" from service ");
                    sb2.append(getClass().getName());
                    try {
                        this.O.b();
                    } catch (RemoteException unused) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("Calling onConnectFailed() failed. Ignoring. pkg=");
                        sb3.append(this.P);
                    }
                } else {
                    try {
                        mediaBrowserServiceCompat2.P.put(asBinder, fVar);
                        asBinder.linkToDeath(fVar, 0);
                        if (MediaBrowserServiceCompat.this.S != null) {
                            this.O.c(fVar.f2943h.b(), MediaBrowserServiceCompat.this.S, fVar.f2943h.a());
                        }
                    } catch (RemoteException unused2) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Calling onConnect() failed. Dropping client. pkg=");
                        sb4.append(this.P);
                        MediaBrowserServiceCompat.this.P.remove(asBinder);
                    }
                }
            }
        }

        public class b implements Runnable {
            public final /* synthetic */ o O;

            public b(o oVar) {
                this.O = oVar;
            }

            public void run() {
                f remove = MediaBrowserServiceCompat.this.P.remove(this.O.asBinder());
                if (remove != null) {
                    remove.f2941f.asBinder().unlinkToDeath(remove, 0);
                }
            }
        }

        public class c implements Runnable {
            public final /* synthetic */ o O;
            public final /* synthetic */ String P;
            public final /* synthetic */ IBinder Q;
            public final /* synthetic */ Bundle R;

            public c(o oVar, String str, IBinder iBinder, Bundle bundle) {
                this.O = oVar;
                this.P = str;
                this.Q = iBinder;
                this.R = bundle;
            }

            public void run() {
                f fVar = MediaBrowserServiceCompat.this.P.get(this.O.asBinder());
                if (fVar == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("addSubscription for callback that isn't registered id=");
                    sb2.append(this.P);
                    return;
                }
                MediaBrowserServiceCompat.this.a(this.P, fVar, this.Q, this.R);
            }
        }

        public class d implements Runnable {
            public final /* synthetic */ o O;
            public final /* synthetic */ String P;
            public final /* synthetic */ IBinder Q;

            public d(o oVar, String str, IBinder iBinder) {
                this.O = oVar;
                this.P = str;
                this.Q = iBinder;
            }

            public void run() {
                f fVar = MediaBrowserServiceCompat.this.P.get(this.O.asBinder());
                if (fVar == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("removeSubscription for callback that isn't registered id=");
                    sb2.append(this.P);
                } else if (!MediaBrowserServiceCompat.this.w(this.P, fVar, this.Q)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("removeSubscription called for ");
                    sb3.append(this.P);
                    sb3.append(" which is not subscribed");
                }
            }
        }

        public class e implements Runnable {
            public final /* synthetic */ o O;
            public final /* synthetic */ String P;
            public final /* synthetic */ ResultReceiver Q;

            public e(o oVar, String str, ResultReceiver resultReceiver) {
                this.O = oVar;
                this.P = str;
                this.Q = resultReceiver;
            }

            public void run() {
                f fVar = MediaBrowserServiceCompat.this.P.get(this.O.asBinder());
                if (fVar == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("getMediaItem for callback that isn't registered id=");
                    sb2.append(this.P);
                    return;
                }
                MediaBrowserServiceCompat.this.u(this.P, fVar, this.Q);
            }
        }

        public class f implements Runnable {
            public final /* synthetic */ o O;
            public final /* synthetic */ String P;
            public final /* synthetic */ int Q;
            public final /* synthetic */ int R;
            public final /* synthetic */ Bundle S;

            public f(o oVar, String str, int i10, int i11, Bundle bundle) {
                this.O = oVar;
                this.P = str;
                this.Q = i10;
                this.R = i11;
                this.S = bundle;
            }

            public void run() {
                IBinder asBinder = this.O.asBinder();
                MediaBrowserServiceCompat.this.P.remove(asBinder);
                f fVar = new f(this.P, this.Q, this.R, this.S, this.O);
                MediaBrowserServiceCompat.this.P.put(asBinder, fVar);
                try {
                    asBinder.linkToDeath(fVar, 0);
                } catch (RemoteException unused) {
                }
            }
        }

        public class g implements Runnable {
            public final /* synthetic */ o O;

            public g(o oVar) {
                this.O = oVar;
            }

            public void run() {
                IBinder asBinder = this.O.asBinder();
                f remove = MediaBrowserServiceCompat.this.P.remove(asBinder);
                if (remove != null) {
                    asBinder.unlinkToDeath(remove, 0);
                }
            }
        }

        public class h implements Runnable {
            public final /* synthetic */ o O;
            public final /* synthetic */ String P;
            public final /* synthetic */ Bundle Q;
            public final /* synthetic */ ResultReceiver R;

            public h(o oVar, String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.O = oVar;
                this.P = str;
                this.Q = bundle;
                this.R = resultReceiver;
            }

            public void run() {
                f fVar = MediaBrowserServiceCompat.this.P.get(this.O.asBinder());
                if (fVar == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("search for callback that isn't registered query=");
                    sb2.append(this.P);
                    return;
                }
                MediaBrowserServiceCompat.this.v(this.P, this.Q, fVar, this.R);
            }
        }

        public class i implements Runnable {
            public final /* synthetic */ o O;
            public final /* synthetic */ String P;
            public final /* synthetic */ Bundle Q;
            public final /* synthetic */ ResultReceiver R;

            public i(o oVar, String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.O = oVar;
                this.P = str;
                this.Q = bundle;
                this.R = resultReceiver;
            }

            public void run() {
                f fVar = MediaBrowserServiceCompat.this.P.get(this.O.asBinder());
                if (fVar == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("sendCustomAction for callback that isn't registered action=");
                    sb2.append(this.P);
                    sb2.append(", extras=");
                    sb2.append(this.Q);
                    return;
                }
                MediaBrowserServiceCompat.this.s(this.P, this.Q, fVar, this.R);
            }
        }

        public n() {
        }

        public void a(String str, IBinder iBinder, Bundle bundle, o oVar) {
            MediaBrowserServiceCompat.this.R.a(new c(oVar, str, iBinder, bundle));
        }

        public void b(String str, int i10, int i11, Bundle bundle, o oVar) {
            if (MediaBrowserServiceCompat.this.g(str, i11)) {
                MediaBrowserServiceCompat.this.R.a(new a(oVar, str, i10, i11, bundle));
                return;
            }
            throw new IllegalArgumentException("Package/uid mismatch: uid=" + i11 + " package=" + str);
        }

        public void c(o oVar) {
            MediaBrowserServiceCompat.this.R.a(new b(oVar));
        }

        public void d(String str, ResultReceiver resultReceiver, o oVar) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                MediaBrowserServiceCompat.this.R.a(new e(oVar, str, resultReceiver));
            }
        }

        public void e(o oVar, String str, int i10, int i11, Bundle bundle) {
            MediaBrowserServiceCompat.this.R.a(new f(oVar, str, i10, i11, bundle));
        }

        public void f(String str, IBinder iBinder, o oVar) {
            MediaBrowserServiceCompat.this.R.a(new d(oVar, str, iBinder));
        }

        public void g(String str, Bundle bundle, ResultReceiver resultReceiver, o oVar) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                MediaBrowserServiceCompat.this.R.a(new h(oVar, str, bundle, resultReceiver));
            }
        }

        public void h(String str, Bundle bundle, ResultReceiver resultReceiver, o oVar) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                MediaBrowserServiceCompat.this.R.a(new i(oVar, str, bundle, resultReceiver));
            }
        }

        public void i(o oVar) {
            MediaBrowserServiceCompat.this.R.a(new g(oVar));
        }
    }

    public interface o {
        void a(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException;

        IBinder asBinder();

        void b() throws RemoteException;

        void c(String str, MediaSessionCompat.Token token, Bundle bundle) throws RemoteException;
    }

    public static class p implements o {

        /* renamed from: a  reason: collision with root package name */
        public final Messenger f2967a;

        public p(Messenger messenger) {
            this.f2967a = messenger;
        }

        public void a(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException {
            Bundle bundle3 = new Bundle();
            bundle3.putString(c.f2973d, str);
            bundle3.putBundle(c.f2976g, bundle);
            bundle3.putBundle(c.f2977h, bundle2);
            if (list != null) {
                bundle3.putParcelableArrayList(c.f2974e, list instanceof ArrayList ? (ArrayList) list : new ArrayList(list));
            }
            d(3, bundle3);
        }

        public IBinder asBinder() {
            return this.f2967a.getBinder();
        }

        public void b() throws RemoteException {
            d(2, (Bundle) null);
        }

        public void c(String str, MediaSessionCompat.Token token, Bundle bundle) throws RemoteException {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putInt(c.f2986q, 2);
            Bundle bundle2 = new Bundle();
            bundle2.putString(c.f2973d, str);
            bundle2.putParcelable(c.f2975f, token);
            bundle2.putBundle(c.f2980k, bundle);
            d(1, bundle2);
        }

        public final void d(int i10, Bundle bundle) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = i10;
            obtain.arg1 = 2;
            obtain.setData(bundle);
            this.f2967a.send(obtain);
        }
    }

    public final class q extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public final n f2968a;

        public q() {
            this.f2968a = new n();
        }

        public void a(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        public void handleMessage(Message message) {
            Bundle data = message.getData();
            switch (message.what) {
                case 1:
                    Bundle bundle = data.getBundle(c.f2980k);
                    MediaSessionCompat.b(bundle);
                    this.f2968a.b(data.getString(c.f2978i), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle, new p(message.replyTo));
                    return;
                case 2:
                    this.f2968a.c(new p(message.replyTo));
                    return;
                case 3:
                    Bundle bundle2 = data.getBundle(c.f2976g);
                    MediaSessionCompat.b(bundle2);
                    this.f2968a.a(data.getString(c.f2973d), h0.m.a(data, c.f2970a), bundle2, new p(message.replyTo));
                    return;
                case 4:
                    this.f2968a.f(data.getString(c.f2973d), h0.m.a(data, c.f2970a), new p(message.replyTo));
                    return;
                case 5:
                    this.f2968a.d(data.getString(c.f2973d), (ResultReceiver) data.getParcelable(c.f2979j), new p(message.replyTo));
                    return;
                case 6:
                    Bundle bundle3 = data.getBundle(c.f2980k);
                    MediaSessionCompat.b(bundle3);
                    n nVar = this.f2968a;
                    p pVar = new p(message.replyTo);
                    nVar.e(pVar, data.getString(c.f2978i), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle3);
                    return;
                case 7:
                    this.f2968a.i(new p(message.replyTo));
                    return;
                case 8:
                    Bundle bundle4 = data.getBundle(c.f2981l);
                    MediaSessionCompat.b(bundle4);
                    this.f2968a.g(data.getString(c.f2982m), bundle4, (ResultReceiver) data.getParcelable(c.f2979j), new p(message.replyTo));
                    return;
                case 9:
                    Bundle bundle5 = data.getBundle(c.f2984o);
                    MediaSessionCompat.b(bundle5);
                    this.f2968a.h(data.getString(c.f2983n), bundle5, (ResultReceiver) data.getParcelable(c.f2979j), new p(message.replyTo));
                    return;
                default:
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unhandled message: ");
                    sb2.append(message);
                    sb2.append("\n  Service version: ");
                    sb2.append(2);
                    sb2.append("\n  Client version: ");
                    sb2.append(message.arg1);
                    return;
            }
        }

        public boolean sendMessageAtTime(Message message, long j10) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            data.putInt("data_calling_pid", Binder.getCallingPid());
            return super.sendMessageAtTime(message, j10);
        }
    }

    public void a(String str, f fVar, IBinder iBinder, Bundle bundle) {
        List<e1.j> list = fVar.f2942g.get(str);
        if (list == null) {
            list = new ArrayList<>();
        }
        for (e1.j jVar : list) {
            if (iBinder == jVar.f6732a && b.a(bundle, (Bundle) jVar.f6733b)) {
                return;
            }
        }
        list.add(new e1.j(iBinder, bundle));
        fVar.f2942g.put(str, list);
        t(str, fVar, bundle, (Bundle) null);
        this.Q = fVar;
        q(str, bundle);
        this.Q = null;
    }

    public List<MediaBrowserCompat.MediaItem> b(List<MediaBrowserCompat.MediaItem> list, Bundle bundle) {
        if (list == null) {
            return null;
        }
        int i10 = bundle.getInt(MediaBrowserCompat.f291d, -1);
        int i11 = bundle.getInt(MediaBrowserCompat.f292e, -1);
        if (i10 == -1 && i11 == -1) {
            return list;
        }
        int i12 = i11 * i10;
        int i13 = i12 + i11;
        if (i10 < 0 || i11 < 1 || i12 >= list.size()) {
            return Collections.emptyList();
        }
        if (i13 > list.size()) {
            i13 = list.size();
        }
        return list.subList(i12, i13);
    }

    @x0({x0.a.O})
    public void c(Context context) {
        attachBaseContext(context);
    }

    public final Bundle d() {
        return this.O.b();
    }

    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @m0
    public final j.b e() {
        return this.O.e();
    }

    @o0
    public MediaSessionCompat.Token f() {
        return this.S;
    }

    public boolean g(String str, int i10) {
        if (str == null) {
            return false;
        }
        for (String equals : getPackageManager().getPackagesForUid(i10)) {
            if (equals.equals(str)) {
                return true;
            }
        }
        return false;
    }

    @x0({x0.a.P})
    public void h(@m0 j.b bVar, @m0 String str, @m0 Bundle bundle) {
        if (bVar == null) {
            throw new IllegalArgumentException("remoteUserInfo cannot be null in notifyChildrenChanged");
        } else if (str == null) {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        } else if (bundle != null) {
            this.O.c(bVar, str, bundle);
        } else {
            throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
        }
    }

    public void i(@m0 String str) {
        if (str != null) {
            this.O.i(str, (Bundle) null);
            return;
        }
        throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
    }

    public void j(@m0 String str, @m0 Bundle bundle) {
        if (str == null) {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        } else if (bundle != null) {
            this.O.i(str, bundle);
        } else {
            throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
        }
    }

    public void k(@m0 String str, Bundle bundle, @m0 m<Bundle> mVar) {
        mVar.h((Bundle) null);
    }

    @o0
    public abstract e l(@m0 String str, int i10, @o0 Bundle bundle);

    public abstract void m(@m0 String str, @m0 m<List<MediaBrowserCompat.MediaItem>> mVar);

    public void n(@m0 String str, @m0 m<List<MediaBrowserCompat.MediaItem>> mVar, @m0 Bundle bundle) {
        mVar.k(1);
        m(str, mVar);
    }

    public void o(String str, @m0 m<MediaBrowserCompat.MediaItem> mVar) {
        mVar.k(2);
        mVar.j(null);
    }

    public IBinder onBind(Intent intent) {
        return this.O.f(intent);
    }

    public void onCreate() {
        super.onCreate();
        int i10 = Build.VERSION.SDK_INT;
        this.O = i10 >= 28 ? new k() : i10 >= 26 ? new j() : new i();
        this.O.onCreate();
    }

    public void p(@m0 String str, Bundle bundle, @m0 m<List<MediaBrowserCompat.MediaItem>> mVar) {
        mVar.k(4);
        mVar.j(null);
    }

    @x0({x0.a.P})
    public void q(String str, Bundle bundle) {
    }

    @x0({x0.a.P})
    public void r(String str) {
    }

    public void s(String str, Bundle bundle, f fVar, ResultReceiver resultReceiver) {
        d dVar = new d(str, resultReceiver);
        this.Q = fVar;
        k(str, bundle, dVar);
        this.Q = null;
        if (!dVar.d()) {
            throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + str + " extras=" + bundle);
        }
    }

    public void t(String str, f fVar, Bundle bundle, Bundle bundle2) {
        a aVar = new a(str, fVar, str, bundle, bundle2);
        this.Q = fVar;
        if (bundle == null) {
            m(str, aVar);
        } else {
            n(str, aVar, bundle);
        }
        this.Q = null;
        if (!aVar.d()) {
            throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + fVar.f2936a + " id=" + str);
        }
    }

    public void u(String str, f fVar, ResultReceiver resultReceiver) {
        b bVar = new b(str, resultReceiver);
        this.Q = fVar;
        o(str, bVar);
        this.Q = null;
        if (!bVar.d()) {
            throw new IllegalStateException("onLoadItem must call detach() or sendResult() before returning for id=" + str);
        }
    }

    public void v(String str, Bundle bundle, f fVar, ResultReceiver resultReceiver) {
        c cVar = new c(str, resultReceiver);
        this.Q = fVar;
        p(str, bundle, cVar);
        this.Q = null;
        if (!cVar.d()) {
            throw new IllegalStateException("onSearch must call detach() or sendResult() before returning for query=" + str);
        }
    }

    public boolean w(String str, f fVar, IBinder iBinder) {
        boolean z10 = true;
        boolean z11 = false;
        if (iBinder == null) {
            try {
                if (fVar.f2942g.remove(str) == null) {
                    z10 = false;
                }
                return z10;
            } finally {
                this.Q = fVar;
                r(str);
                this.Q = null;
            }
        } else {
            List list = fVar.f2942g.get(str);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (iBinder == ((e1.j) it.next()).f6732a) {
                        it.remove();
                        z11 = true;
                    }
                }
                if (list.size() == 0) {
                    fVar.f2942g.remove(str);
                }
            }
            this.Q = fVar;
            r(str);
            this.Q = null;
            return z11;
        }
    }

    public void x(MediaSessionCompat.Token token) {
        if (token == null) {
            throw new IllegalArgumentException("Session token may not be null.");
        } else if (this.S == null) {
            this.S = token;
            this.O.j(token);
        } else {
            throw new IllegalStateException("The session token has already been set.");
        }
    }
}
