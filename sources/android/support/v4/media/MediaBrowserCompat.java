package android.support.v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.media.browse.MediaBrowser;
import android.os.BadParcelableException;
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
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.b;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.media.MediaBrowserServiceCompat;
import d.m0;
import d.o0;
import d.t0;
import d.x0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class MediaBrowserCompat {

    /* renamed from: b  reason: collision with root package name */
    public static final String f289b = "MediaBrowserCompat";

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f290c = Log.isLoggable(f289b, 3);

    /* renamed from: d  reason: collision with root package name */
    public static final String f291d = "android.media.browse.extra.PAGE";

    /* renamed from: e  reason: collision with root package name */
    public static final String f292e = "android.media.browse.extra.PAGE_SIZE";

    /* renamed from: f  reason: collision with root package name */
    public static final String f293f = "android.media.browse.extra.MEDIA_ID";

    /* renamed from: g  reason: collision with root package name */
    public static final String f294g = "android.media.browse.extra.DOWNLOAD_PROGRESS";

    /* renamed from: h  reason: collision with root package name */
    public static final String f295h = "android.support.v4.media.action.DOWNLOAD";

    /* renamed from: i  reason: collision with root package name */
    public static final String f296i = "android.support.v4.media.action.REMOVE_DOWNLOADED_FILE";

    /* renamed from: a  reason: collision with root package name */
    public final e f297a;

    public static class CustomActionResultReceiver extends ResultReceiver {
        public final String R;
        public final Bundle S;
        public final c T;

        public CustomActionResultReceiver(String str, Bundle bundle, c cVar, Handler handler) {
            super(handler);
            this.R = str;
            this.S = bundle;
            this.T = cVar;
        }

        public void a(int i10, Bundle bundle) {
            if (this.T != null) {
                MediaSessionCompat.b(bundle);
                if (i10 == -1) {
                    this.T.a(this.R, this.S, bundle);
                } else if (i10 == 0) {
                    this.T.c(this.R, this.S, bundle);
                } else if (i10 != 1) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unknown result code: ");
                    sb2.append(i10);
                    sb2.append(" (extras=");
                    sb2.append(this.S);
                    sb2.append(", resultData=");
                    sb2.append(bundle);
                    sb2.append(")");
                } else {
                    this.T.b(this.R, this.S, bundle);
                }
            }
        }
    }

    public static class ItemReceiver extends ResultReceiver {
        public final String R;
        public final d S;

        public ItemReceiver(String str, d dVar, Handler handler) {
            super(handler);
            this.R = str;
            this.S = dVar;
        }

        public void a(int i10, Bundle bundle) {
            MediaSessionCompat.b(bundle);
            if (i10 != 0 || bundle == null || !bundle.containsKey(MediaBrowserServiceCompat.X)) {
                this.S.a(this.R);
                return;
            }
            Parcelable parcelable = bundle.getParcelable(MediaBrowserServiceCompat.X);
            if (parcelable == null || (parcelable instanceof MediaItem)) {
                this.S.b((MediaItem) parcelable);
            } else {
                this.S.a(this.R);
            }
        }
    }

    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new a();
        public static final int Q = 1;
        public static final int R = 2;
        public final int O;
        public final MediaDescriptionCompat P;

        public static class a implements Parcelable.Creator<MediaItem> {
            /* renamed from: a */
            public MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            /* renamed from: b */
            public MediaItem[] newArray(int i10) {
                return new MediaItem[i10];
            }
        }

        @x0({x0.a.P})
        @Retention(RetentionPolicy.SOURCE)
        public @interface b {
        }

        public MediaItem(Parcel parcel) {
            this.O = parcel.readInt();
            this.P = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }

        public MediaItem(@m0 MediaDescriptionCompat mediaDescriptionCompat, int i10) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            } else if (!TextUtils.isEmpty(mediaDescriptionCompat.g())) {
                this.O = i10;
                this.P = mediaDescriptionCompat;
            } else {
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
        }

        public static MediaItem a(Object obj) {
            if (obj == null) {
                return null;
            }
            MediaBrowser.MediaItem mediaItem = (MediaBrowser.MediaItem) obj;
            return new MediaItem(MediaDescriptionCompat.a(mediaItem.getDescription()), mediaItem.getFlags());
        }

        public static List<MediaItem> b(List<?> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (Object a10 : list) {
                arrayList.add(a(a10));
            }
            return arrayList;
        }

        @m0
        public MediaDescriptionCompat c() {
            return this.P;
        }

        public int d() {
            return this.O;
        }

        public int describeContents() {
            return 0;
        }

        @o0
        public String e() {
            return this.P.g();
        }

        public boolean f() {
            return (this.O & 1) != 0;
        }

        public boolean g() {
            return (this.O & 2) != 0;
        }

        public String toString() {
            return "MediaItem{" + "mFlags=" + this.O + ", mDescription=" + this.P + '}';
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.O);
            this.P.writeToParcel(parcel, i10);
        }
    }

    public static class SearchResultReceiver extends ResultReceiver {
        public final String R;
        public final Bundle S;
        public final k T;

        public SearchResultReceiver(String str, Bundle bundle, k kVar, Handler handler) {
            super(handler);
            this.R = str;
            this.S = bundle;
            this.T = kVar;
        }

        public void a(int i10, Bundle bundle) {
            MediaSessionCompat.b(bundle);
            if (i10 != 0 || bundle == null || !bundle.containsKey(MediaBrowserServiceCompat.Y)) {
                this.T.a(this.R, this.S);
                return;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray(MediaBrowserServiceCompat.Y);
            ArrayList arrayList = null;
            if (parcelableArray != null) {
                arrayList = new ArrayList();
                for (Parcelable parcelable : parcelableArray) {
                    arrayList.add((MediaItem) parcelable);
                }
            }
            this.T.b(this.R, this.S, arrayList);
        }
    }

    public static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<j> f298a;

        /* renamed from: b  reason: collision with root package name */
        public WeakReference<Messenger> f299b;

        public a(j jVar) {
            this.f298a = new WeakReference<>(jVar);
        }

        public void a(Messenger messenger) {
            this.f299b = new WeakReference<>(messenger);
        }

        public void handleMessage(Message message) {
            WeakReference<Messenger> weakReference = this.f299b;
            if (weakReference != null && weakReference.get() != null && this.f298a.get() != null) {
                Bundle data = message.getData();
                MediaSessionCompat.b(data);
                j jVar = this.f298a.get();
                Messenger messenger = this.f299b.get();
                try {
                    int i10 = message.what;
                    if (i10 == 1) {
                        Bundle bundle = data.getBundle(androidx.media.c.f2980k);
                        MediaSessionCompat.b(bundle);
                        jVar.f(messenger, data.getString(androidx.media.c.f2973d), (MediaSessionCompat.Token) data.getParcelable(androidx.media.c.f2975f), bundle);
                    } else if (i10 == 2) {
                        jVar.m(messenger);
                    } else if (i10 != 3) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Unhandled message: ");
                        sb2.append(message);
                        sb2.append("\n  Client version: ");
                        sb2.append(1);
                        sb2.append("\n  Service version: ");
                        sb2.append(message.arg1);
                    } else {
                        Bundle bundle2 = data.getBundle(androidx.media.c.f2976g);
                        MediaSessionCompat.b(bundle2);
                        Bundle bundle3 = data.getBundle(androidx.media.c.f2977h);
                        MediaSessionCompat.b(bundle3);
                        jVar.h(messenger, data.getString(androidx.media.c.f2973d), data.getParcelableArrayList(androidx.media.c.f2974e), bundle2, bundle3);
                    }
                } catch (BadParcelableException unused) {
                    if (message.what == 1) {
                        jVar.m(messenger);
                    }
                }
            }
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final MediaBrowser.ConnectionCallback f300a = new a();

        /* renamed from: b  reason: collision with root package name */
        public C0007b f301b;

        @t0(21)
        public class a extends MediaBrowser.ConnectionCallback {
            public a() {
            }

            public void onConnected() {
                C0007b bVar = b.this.f301b;
                if (bVar != null) {
                    bVar.c();
                }
                b.this.a();
            }

            public void onConnectionFailed() {
                C0007b bVar = b.this.f301b;
                if (bVar != null) {
                    bVar.n();
                }
                b.this.b();
            }

            public void onConnectionSuspended() {
                C0007b bVar = b.this.f301b;
                if (bVar != null) {
                    bVar.j();
                }
                b.this.c();
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$b$b  reason: collision with other inner class name */
        public interface C0007b {
            void c();

            void j();

            void n();
        }

        public void a() {
        }

        public void b() {
        }

        public void c() {
        }

        public void d(C0007b bVar) {
            this.f301b = bVar;
        }
    }

    public static abstract class c {
        public void a(String str, Bundle bundle, Bundle bundle2) {
        }

        public void b(String str, Bundle bundle, Bundle bundle2) {
        }

        public void c(String str, Bundle bundle, Bundle bundle2) {
        }
    }

    public static abstract class d {

        /* renamed from: a  reason: collision with root package name */
        public final MediaBrowser.ItemCallback f303a = new a();

        @t0(23)
        public class a extends MediaBrowser.ItemCallback {
            public a() {
            }

            public void onError(@m0 String str) {
                d.this.a(str);
            }

            public void onItemLoaded(MediaBrowser.MediaItem mediaItem) {
                d.this.b(MediaItem.a(mediaItem));
            }
        }

        public void a(@m0 String str) {
        }

        public void b(MediaItem mediaItem) {
        }
    }

    public interface e {
        boolean a();

        @m0
        MediaSessionCompat.Token b();

        void d();

        void e(@m0 String str, Bundle bundle, @o0 c cVar);

        ComponentName g();

        @o0
        Bundle getExtras();

        @m0
        String getRoot();

        void i(@m0 String str, @m0 d dVar);

        void k();

        void l(@m0 String str, @o0 Bundle bundle, @m0 n nVar);

        void o(@m0 String str, n nVar);

        void p(@m0 String str, Bundle bundle, @m0 k kVar);

        @o0
        Bundle q();
    }

    @t0(21)
    public static class f implements e, j, b.C0007b {

        /* renamed from: a  reason: collision with root package name */
        public final Context f305a;

        /* renamed from: b  reason: collision with root package name */
        public final MediaBrowser f306b;

        /* renamed from: c  reason: collision with root package name */
        public final Bundle f307c;

        /* renamed from: d  reason: collision with root package name */
        public final a f308d = new a(this);

        /* renamed from: e  reason: collision with root package name */
        public final androidx.collection.a<String, m> f309e = new androidx.collection.a<>();

        /* renamed from: f  reason: collision with root package name */
        public int f310f;

        /* renamed from: g  reason: collision with root package name */
        public l f311g;

        /* renamed from: h  reason: collision with root package name */
        public Messenger f312h;

        /* renamed from: i  reason: collision with root package name */
        public MediaSessionCompat.Token f313i;

        /* renamed from: j  reason: collision with root package name */
        public Bundle f314j;

        public class a implements Runnable {
            public final /* synthetic */ d O;
            public final /* synthetic */ String P;

            public a(d dVar, String str) {
                this.O = dVar;
                this.P = str;
            }

            public void run() {
                this.O.a(this.P);
            }
        }

        public class b implements Runnable {
            public final /* synthetic */ d O;
            public final /* synthetic */ String P;

            public b(d dVar, String str) {
                this.O = dVar;
                this.P = str;
            }

            public void run() {
                this.O.a(this.P);
            }
        }

        public class c implements Runnable {
            public final /* synthetic */ d O;
            public final /* synthetic */ String P;

            public c(d dVar, String str) {
                this.O = dVar;
                this.P = str;
            }

            public void run() {
                this.O.a(this.P);
            }
        }

        public class d implements Runnable {
            public final /* synthetic */ k O;
            public final /* synthetic */ String P;
            public final /* synthetic */ Bundle Q;

            public d(k kVar, String str, Bundle bundle) {
                this.O = kVar;
                this.P = str;
                this.Q = bundle;
            }

            public void run() {
                this.O.a(this.P, this.Q);
            }
        }

        public class e implements Runnable {
            public final /* synthetic */ k O;
            public final /* synthetic */ String P;
            public final /* synthetic */ Bundle Q;

            public e(k kVar, String str, Bundle bundle) {
                this.O = kVar;
                this.P = str;
                this.Q = bundle;
            }

            public void run() {
                this.O.a(this.P, this.Q);
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$f$f  reason: collision with other inner class name */
        public class C0008f implements Runnable {
            public final /* synthetic */ c O;
            public final /* synthetic */ String P;
            public final /* synthetic */ Bundle Q;

            public C0008f(c cVar, String str, Bundle bundle) {
                this.O = cVar;
                this.P = str;
                this.Q = bundle;
            }

            public void run() {
                this.O.a(this.P, this.Q, (Bundle) null);
            }
        }

        public class g implements Runnable {
            public final /* synthetic */ c O;
            public final /* synthetic */ String P;
            public final /* synthetic */ Bundle Q;

            public g(c cVar, String str, Bundle bundle) {
                this.O = cVar;
                this.P = str;
                this.Q = bundle;
            }

            public void run() {
                this.O.a(this.P, this.Q, (Bundle) null);
            }
        }

        public f(Context context, ComponentName componentName, b bVar, Bundle bundle) {
            Bundle bundle2;
            this.f305a = context;
            if (bundle == null) {
                bundle2 = new Bundle();
            }
            this.f307c = bundle2;
            bundle2.putInt(androidx.media.c.f2985p, 1);
            bVar.d(this);
            this.f306b = new MediaBrowser(context, componentName, bVar.f300a, bundle2);
        }

        public boolean a() {
            return this.f306b.isConnected();
        }

        @m0
        public MediaSessionCompat.Token b() {
            if (this.f313i == null) {
                this.f313i = MediaSessionCompat.Token.b(this.f306b.getSessionToken());
            }
            return this.f313i;
        }

        public void c() {
            try {
                Bundle extras = this.f306b.getExtras();
                if (extras != null) {
                    this.f310f = extras.getInt(androidx.media.c.f2986q, 0);
                    IBinder a10 = h0.m.a(extras, androidx.media.c.f2987r);
                    if (a10 != null) {
                        this.f311g = new l(a10, this.f307c);
                        Messenger messenger = new Messenger(this.f308d);
                        this.f312h = messenger;
                        this.f308d.a(messenger);
                        try {
                            this.f311g.e(this.f305a, this.f312h);
                        } catch (RemoteException unused) {
                        }
                    }
                    android.support.v4.media.session.b D = b.a.D(h0.m.a(extras, androidx.media.c.f2988s));
                    if (D != null) {
                        this.f313i = MediaSessionCompat.Token.c(this.f306b.getSessionToken(), D);
                    }
                }
            } catch (IllegalStateException unused2) {
            }
        }

        public void d() {
            Messenger messenger;
            l lVar = this.f311g;
            if (!(lVar == null || (messenger = this.f312h) == null)) {
                try {
                    lVar.j(messenger);
                } catch (RemoteException unused) {
                }
            }
            this.f306b.disconnect();
        }

        public void e(@m0 String str, Bundle bundle, @o0 c cVar) {
            if (a()) {
                if (this.f311g == null && cVar != null) {
                    this.f308d.post(new C0008f(cVar, str, bundle));
                }
                try {
                    this.f311g.h(str, bundle, new CustomActionResultReceiver(str, bundle, cVar, this.f308d), this.f312h);
                } catch (RemoteException unused) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Remote error sending a custom action: action=");
                    sb2.append(str);
                    sb2.append(", extras=");
                    sb2.append(bundle);
                    if (cVar != null) {
                        this.f308d.post(new g(cVar, str, bundle));
                    }
                }
            } else {
                throw new IllegalStateException("Cannot send a custom action (" + str + ") with " + "extras " + bundle + " because the browser is not connected to the " + "service.");
            }
        }

        public void f(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
        }

        public ComponentName g() {
            return this.f306b.getServiceComponent();
        }

        @o0
        public Bundle getExtras() {
            return this.f306b.getExtras();
        }

        @m0
        public String getRoot() {
            return this.f306b.getRoot();
        }

        public void h(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
            if (this.f312h == messenger) {
                m mVar = this.f309e.get(str);
                if (mVar != null) {
                    n a10 = mVar.a(bundle);
                    if (a10 != null) {
                        if (bundle == null) {
                            if (list == null) {
                                a10.c(str);
                                return;
                            } else {
                                this.f314j = bundle2;
                                a10.a(str, list);
                            }
                        } else if (list == null) {
                            a10.d(str, bundle);
                            return;
                        } else {
                            this.f314j = bundle2;
                            a10.b(str, list, bundle);
                        }
                        this.f314j = null;
                    }
                } else if (MediaBrowserCompat.f290c) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("onLoadChildren for id that isn't subscribed id=");
                    sb2.append(str);
                }
            }
        }

        public void i(@m0 String str, @m0 d dVar) {
            a aVar;
            Runnable bVar;
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("mediaId is empty");
            } else if (dVar != null) {
                if (!this.f306b.isConnected()) {
                    aVar = this.f308d;
                    bVar = new a(dVar, str);
                } else if (this.f311g == null) {
                    aVar = this.f308d;
                    bVar = new b(dVar, str);
                } else {
                    try {
                        this.f311g.d(str, new ItemReceiver(str, dVar, this.f308d), this.f312h);
                        return;
                    } catch (RemoteException unused) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Remote error getting media item: ");
                        sb2.append(str);
                        this.f308d.post(new c(dVar, str));
                        return;
                    }
                }
                aVar.post(bVar);
            } else {
                throw new IllegalArgumentException("cb is null");
            }
        }

        public void j() {
            this.f311g = null;
            this.f312h = null;
            this.f313i = null;
            this.f308d.a((Messenger) null);
        }

        public void k() {
            this.f306b.connect();
        }

        public void l(@m0 String str, Bundle bundle, @m0 n nVar) {
            m mVar = this.f309e.get(str);
            if (mVar == null) {
                mVar = new m();
                this.f309e.put(str, mVar);
            }
            nVar.e(mVar);
            Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
            mVar.e(bundle2, nVar);
            l lVar = this.f311g;
            if (lVar == null) {
                this.f306b.subscribe(str, nVar.f338a);
                return;
            }
            try {
                lVar.a(str, nVar.f339b, bundle2, this.f312h);
            } catch (RemoteException unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Remote error subscribing media item: ");
                sb2.append(str);
            }
        }

        public void m(Messenger messenger) {
        }

        public void n() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
            if (r1.size() == 0) goto L_0x0011;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void o(@d.m0 java.lang.String r8, android.support.v4.media.MediaBrowserCompat.n r9) {
            /*
                r7 = this;
                androidx.collection.a<java.lang.String, android.support.v4.media.MediaBrowserCompat$m> r0 = r7.f309e
                java.lang.Object r0 = r0.get(r8)
                android.support.v4.media.MediaBrowserCompat$m r0 = (android.support.v4.media.MediaBrowserCompat.m) r0
                if (r0 != 0) goto L_0x000b
                return
            L_0x000b:
                android.support.v4.media.MediaBrowserCompat$l r1 = r7.f311g
                if (r1 != 0) goto L_0x003d
                if (r9 != 0) goto L_0x0017
            L_0x0011:
                android.media.browse.MediaBrowser r1 = r7.f306b
                r1.unsubscribe(r8)
                goto L_0x007b
            L_0x0017:
                java.util.List r1 = r0.b()
                java.util.List r2 = r0.c()
                int r3 = r1.size()
                int r3 = r3 + -1
            L_0x0025:
                if (r3 < 0) goto L_0x0036
                java.lang.Object r4 = r1.get(r3)
                if (r4 != r9) goto L_0x0033
                r1.remove(r3)
                r2.remove(r3)
            L_0x0033:
                int r3 = r3 + -1
                goto L_0x0025
            L_0x0036:
                int r1 = r1.size()
                if (r1 != 0) goto L_0x007b
                goto L_0x0011
            L_0x003d:
                if (r9 != 0) goto L_0x0046
                r2 = 0
                android.os.Messenger r3 = r7.f312h     // Catch:{ RemoteException -> 0x006e }
                r1.f(r8, r2, r3)     // Catch:{ RemoteException -> 0x006e }
                goto L_0x007b
            L_0x0046:
                java.util.List r1 = r0.b()     // Catch:{ RemoteException -> 0x006e }
                java.util.List r2 = r0.c()     // Catch:{ RemoteException -> 0x006e }
                int r3 = r1.size()     // Catch:{ RemoteException -> 0x006e }
                int r3 = r3 + -1
            L_0x0054:
                if (r3 < 0) goto L_0x007b
                java.lang.Object r4 = r1.get(r3)     // Catch:{ RemoteException -> 0x006e }
                if (r4 != r9) goto L_0x006b
                android.support.v4.media.MediaBrowserCompat$l r4 = r7.f311g     // Catch:{ RemoteException -> 0x006e }
                android.os.IBinder r5 = r9.f339b     // Catch:{ RemoteException -> 0x006e }
                android.os.Messenger r6 = r7.f312h     // Catch:{ RemoteException -> 0x006e }
                r4.f(r8, r5, r6)     // Catch:{ RemoteException -> 0x006e }
                r1.remove(r3)     // Catch:{ RemoteException -> 0x006e }
                r2.remove(r3)     // Catch:{ RemoteException -> 0x006e }
            L_0x006b:
                int r3 = r3 + -1
                goto L_0x0054
            L_0x006e:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "removeSubscription failed with RemoteException parentId="
                r1.append(r2)
                r1.append(r8)
            L_0x007b:
                boolean r0 = r0.d()
                if (r0 != 0) goto L_0x0083
                if (r9 != 0) goto L_0x0088
            L_0x0083:
                androidx.collection.a<java.lang.String, android.support.v4.media.MediaBrowserCompat$m> r9 = r7.f309e
                r9.remove(r8)
            L_0x0088:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaBrowserCompat.f.o(java.lang.String, android.support.v4.media.MediaBrowserCompat$n):void");
        }

        public void p(@m0 String str, Bundle bundle, @m0 k kVar) {
            if (!a()) {
                throw new IllegalStateException("search() called while not connected");
            } else if (this.f311g == null) {
                this.f308d.post(new d(kVar, str, bundle));
            } else {
                try {
                    this.f311g.g(str, bundle, new SearchResultReceiver(str, bundle, kVar, this.f308d), this.f312h);
                } catch (RemoteException unused) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Remote error searching items with query: ");
                    sb2.append(str);
                    this.f308d.post(new e(kVar, str, bundle));
                }
            }
        }

        public Bundle q() {
            return this.f314j;
        }
    }

    @t0(23)
    public static class g extends f {
        public g(Context context, ComponentName componentName, b bVar, Bundle bundle) {
            super(context, componentName, bVar, bundle);
        }

        public void i(@m0 String str, @m0 d dVar) {
            if (this.f311g == null) {
                this.f306b.getItem(str, dVar.f303a);
            } else {
                super.i(str, dVar);
            }
        }
    }

    @t0(26)
    public static class h extends g {
        public h(Context context, ComponentName componentName, b bVar, Bundle bundle) {
            super(context, componentName, bVar, bundle);
        }

        public void l(@m0 String str, @o0 Bundle bundle, @m0 n nVar) {
            if (this.f311g != null && this.f310f >= 2) {
                super.l(str, bundle, nVar);
            } else if (bundle == null) {
                this.f306b.subscribe(str, nVar.f338a);
            } else {
                this.f306b.subscribe(str, bundle, nVar.f338a);
            }
        }

        public void o(@m0 String str, n nVar) {
            if (this.f311g != null && this.f310f >= 2) {
                super.o(str, nVar);
            } else if (nVar == null) {
                this.f306b.unsubscribe(str);
            } else {
                this.f306b.unsubscribe(str, nVar.f338a);
            }
        }
    }

    public static class i implements e, j {

        /* renamed from: o  reason: collision with root package name */
        public static final int f315o = 0;

        /* renamed from: p  reason: collision with root package name */
        public static final int f316p = 1;

        /* renamed from: q  reason: collision with root package name */
        public static final int f317q = 2;

        /* renamed from: r  reason: collision with root package name */
        public static final int f318r = 3;

        /* renamed from: s  reason: collision with root package name */
        public static final int f319s = 4;

        /* renamed from: a  reason: collision with root package name */
        public final Context f320a;

        /* renamed from: b  reason: collision with root package name */
        public final ComponentName f321b;

        /* renamed from: c  reason: collision with root package name */
        public final b f322c;

        /* renamed from: d  reason: collision with root package name */
        public final Bundle f323d;

        /* renamed from: e  reason: collision with root package name */
        public final a f324e = new a(this);

        /* renamed from: f  reason: collision with root package name */
        public final androidx.collection.a<String, m> f325f = new androidx.collection.a<>();

        /* renamed from: g  reason: collision with root package name */
        public int f326g = 1;

        /* renamed from: h  reason: collision with root package name */
        public g f327h;

        /* renamed from: i  reason: collision with root package name */
        public l f328i;

        /* renamed from: j  reason: collision with root package name */
        public Messenger f329j;

        /* renamed from: k  reason: collision with root package name */
        public String f330k;

        /* renamed from: l  reason: collision with root package name */
        public MediaSessionCompat.Token f331l;

        /* renamed from: m  reason: collision with root package name */
        public Bundle f332m;

        /* renamed from: n  reason: collision with root package name */
        public Bundle f333n;

        public class a implements Runnable {
            public a() {
            }

            public void run() {
                i iVar = i.this;
                if (iVar.f326g != 0) {
                    iVar.f326g = 2;
                    if (MediaBrowserCompat.f290c && iVar.f327h != null) {
                        throw new RuntimeException("mServiceConnection should be null. Instead it is " + i.this.f327h);
                    } else if (iVar.f328i != null) {
                        throw new RuntimeException("mServiceBinderWrapper should be null. Instead it is " + i.this.f328i);
                    } else if (iVar.f329j == null) {
                        Intent intent = new Intent(MediaBrowserServiceCompat.W);
                        intent.setComponent(i.this.f321b);
                        i iVar2 = i.this;
                        iVar2.f327h = new g();
                        boolean z10 = false;
                        try {
                            i iVar3 = i.this;
                            z10 = iVar3.f320a.bindService(intent, iVar3.f327h, 1);
                        } catch (Exception unused) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Failed binding to service ");
                            sb2.append(i.this.f321b);
                        }
                        if (!z10) {
                            i.this.j();
                            i.this.f322c.b();
                        }
                        if (MediaBrowserCompat.f290c) {
                            i.this.c();
                        }
                    } else {
                        throw new RuntimeException("mCallbacksMessenger should be null. Instead it is " + i.this.f329j);
                    }
                }
            }
        }

        public class b implements Runnable {
            public b() {
            }

            public void run() {
                i iVar = i.this;
                Messenger messenger = iVar.f329j;
                if (messenger != null) {
                    try {
                        iVar.f328i.c(messenger);
                    } catch (RemoteException unused) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("RemoteException during connect for ");
                        sb2.append(i.this.f321b);
                    }
                }
                i iVar2 = i.this;
                int i10 = iVar2.f326g;
                iVar2.j();
                if (i10 != 0) {
                    i.this.f326g = i10;
                }
                if (MediaBrowserCompat.f290c) {
                    i.this.c();
                }
            }
        }

        public class c implements Runnable {
            public final /* synthetic */ d O;
            public final /* synthetic */ String P;

            public c(d dVar, String str) {
                this.O = dVar;
                this.P = str;
            }

            public void run() {
                this.O.a(this.P);
            }
        }

        public class d implements Runnable {
            public final /* synthetic */ d O;
            public final /* synthetic */ String P;

            public d(d dVar, String str) {
                this.O = dVar;
                this.P = str;
            }

            public void run() {
                this.O.a(this.P);
            }
        }

        public class e implements Runnable {
            public final /* synthetic */ k O;
            public final /* synthetic */ String P;
            public final /* synthetic */ Bundle Q;

            public e(k kVar, String str, Bundle bundle) {
                this.O = kVar;
                this.P = str;
                this.Q = bundle;
            }

            public void run() {
                this.O.a(this.P, this.Q);
            }
        }

        public class f implements Runnable {
            public final /* synthetic */ c O;
            public final /* synthetic */ String P;
            public final /* synthetic */ Bundle Q;

            public f(c cVar, String str, Bundle bundle) {
                this.O = cVar;
                this.P = str;
                this.Q = bundle;
            }

            public void run() {
                this.O.a(this.P, this.Q, (Bundle) null);
            }
        }

        public class g implements ServiceConnection {

            public class a implements Runnable {
                public final /* synthetic */ ComponentName O;
                public final /* synthetic */ IBinder P;

                public a(ComponentName componentName, IBinder iBinder) {
                    this.O = componentName;
                    this.P = iBinder;
                }

                public void run() {
                    boolean z10 = MediaBrowserCompat.f290c;
                    if (z10) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("MediaServiceConnection.onServiceConnected name=");
                        sb2.append(this.O);
                        sb2.append(" binder=");
                        sb2.append(this.P);
                        i.this.c();
                    }
                    if (g.this.a("onServiceConnected")) {
                        i iVar = i.this;
                        iVar.f328i = new l(this.P, iVar.f323d);
                        i.this.f329j = new Messenger(i.this.f324e);
                        i iVar2 = i.this;
                        iVar2.f324e.a(iVar2.f329j);
                        i.this.f326g = 2;
                        if (z10) {
                            try {
                                i.this.c();
                            } catch (RemoteException unused) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("RemoteException during connect for ");
                                sb3.append(i.this.f321b);
                                if (MediaBrowserCompat.f290c) {
                                    i.this.c();
                                    return;
                                }
                                return;
                            }
                        }
                        i iVar3 = i.this;
                        iVar3.f328i.b(iVar3.f320a, iVar3.f329j);
                    }
                }
            }

            public class b implements Runnable {
                public final /* synthetic */ ComponentName O;

                public b(ComponentName componentName) {
                    this.O = componentName;
                }

                public void run() {
                    if (MediaBrowserCompat.f290c) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("MediaServiceConnection.onServiceDisconnected name=");
                        sb2.append(this.O);
                        sb2.append(" this=");
                        sb2.append(this);
                        sb2.append(" mServiceConnection=");
                        sb2.append(i.this.f327h);
                        i.this.c();
                    }
                    if (g.this.a("onServiceDisconnected")) {
                        i iVar = i.this;
                        iVar.f328i = null;
                        iVar.f329j = null;
                        iVar.f324e.a((Messenger) null);
                        i iVar2 = i.this;
                        iVar2.f326g = 4;
                        iVar2.f322c.c();
                    }
                }
            }

            public g() {
            }

            public boolean a(String str) {
                int i10;
                i iVar = i.this;
                if (iVar.f327h == this && (i10 = iVar.f326g) != 0 && i10 != 1) {
                    return true;
                }
                int i11 = iVar.f326g;
                if (i11 == 0 || i11 == 1) {
                    return false;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" for ");
                sb2.append(i.this.f321b);
                sb2.append(" with mServiceConnection=");
                sb2.append(i.this.f327h);
                sb2.append(" this=");
                sb2.append(this);
                return false;
            }

            public final void b(Runnable runnable) {
                if (Thread.currentThread() == i.this.f324e.getLooper().getThread()) {
                    runnable.run();
                } else {
                    i.this.f324e.post(runnable);
                }
            }

            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                b(new a(componentName, iBinder));
            }

            public void onServiceDisconnected(ComponentName componentName) {
                b(new b(componentName));
            }
        }

        public i(Context context, ComponentName componentName, b bVar, Bundle bundle) {
            if (context == null) {
                throw new IllegalArgumentException("context must not be null");
            } else if (componentName == null) {
                throw new IllegalArgumentException("service component must not be null");
            } else if (bVar != null) {
                this.f320a = context;
                this.f321b = componentName;
                this.f322c = bVar;
                this.f323d = bundle == null ? null : new Bundle(bundle);
            } else {
                throw new IllegalArgumentException("connection callback must not be null");
            }
        }

        public static String n(int i10) {
            if (i10 == 0) {
                return "CONNECT_STATE_DISCONNECTING";
            }
            if (i10 == 1) {
                return "CONNECT_STATE_DISCONNECTED";
            }
            if (i10 == 2) {
                return "CONNECT_STATE_CONNECTING";
            }
            if (i10 == 3) {
                return "CONNECT_STATE_CONNECTED";
            }
            if (i10 == 4) {
                return "CONNECT_STATE_SUSPENDED";
            }
            return "UNKNOWN/" + i10;
        }

        public boolean a() {
            return this.f326g == 3;
        }

        @m0
        public MediaSessionCompat.Token b() {
            if (a()) {
                return this.f331l;
            }
            throw new IllegalStateException("getSessionToken() called while not connected(state=" + this.f326g + ")");
        }

        public void c() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("  mServiceComponent=");
            sb2.append(this.f321b);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("  mCallback=");
            sb3.append(this.f322c);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("  mRootHints=");
            sb4.append(this.f323d);
            StringBuilder sb5 = new StringBuilder();
            sb5.append("  mState=");
            sb5.append(n(this.f326g));
            StringBuilder sb6 = new StringBuilder();
            sb6.append("  mServiceConnection=");
            sb6.append(this.f327h);
            StringBuilder sb7 = new StringBuilder();
            sb7.append("  mServiceBinderWrapper=");
            sb7.append(this.f328i);
            StringBuilder sb8 = new StringBuilder();
            sb8.append("  mCallbacksMessenger=");
            sb8.append(this.f329j);
            StringBuilder sb9 = new StringBuilder();
            sb9.append("  mRootId=");
            sb9.append(this.f330k);
            StringBuilder sb10 = new StringBuilder();
            sb10.append("  mMediaSessionToken=");
            sb10.append(this.f331l);
        }

        public void d() {
            this.f326g = 0;
            this.f324e.post(new b());
        }

        public void e(@m0 String str, Bundle bundle, @o0 c cVar) {
            if (a()) {
                try {
                    this.f328i.h(str, bundle, new CustomActionResultReceiver(str, bundle, cVar, this.f324e), this.f329j);
                } catch (RemoteException unused) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Remote error sending a custom action: action=");
                    sb2.append(str);
                    sb2.append(", extras=");
                    sb2.append(bundle);
                    if (cVar != null) {
                        this.f324e.post(new f(cVar, str, bundle));
                    }
                }
            } else {
                throw new IllegalStateException("Cannot send a custom action (" + str + ") with " + "extras " + bundle + " because the browser is not connected to the " + "service.");
            }
        }

        public void f(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
            if (r(messenger, "onConnect")) {
                if (this.f326g != 2) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("onConnect from service while mState=");
                    sb2.append(n(this.f326g));
                    sb2.append("... ignoring");
                    return;
                }
                this.f330k = str;
                this.f331l = token;
                this.f332m = bundle;
                this.f326g = 3;
                if (MediaBrowserCompat.f290c) {
                    c();
                }
                this.f322c.a();
                try {
                    for (Map.Entry next : this.f325f.entrySet()) {
                        String str2 = (String) next.getKey();
                        m mVar = (m) next.getValue();
                        List<n> b10 = mVar.b();
                        List<Bundle> c10 = mVar.c();
                        for (int i10 = 0; i10 < b10.size(); i10++) {
                            this.f328i.a(str2, b10.get(i10).f339b, c10.get(i10), this.f329j);
                        }
                    }
                } catch (RemoteException unused) {
                }
            }
        }

        @m0
        public ComponentName g() {
            if (a()) {
                return this.f321b;
            }
            throw new IllegalStateException("getServiceComponent() called while not connected (state=" + this.f326g + ")");
        }

        @o0
        public Bundle getExtras() {
            if (a()) {
                return this.f332m;
            }
            throw new IllegalStateException("getExtras() called while not connected (state=" + n(this.f326g) + ")");
        }

        @m0
        public String getRoot() {
            if (a()) {
                return this.f330k;
            }
            throw new IllegalStateException("getRoot() called while not connected(state=" + n(this.f326g) + ")");
        }

        public void h(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
            if (r(messenger, "onLoadChildren")) {
                boolean z10 = MediaBrowserCompat.f290c;
                if (z10) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("onLoadChildren for ");
                    sb2.append(this.f321b);
                    sb2.append(" id=");
                    sb2.append(str);
                }
                m mVar = this.f325f.get(str);
                if (mVar != null) {
                    n a10 = mVar.a(bundle);
                    if (a10 != null) {
                        if (bundle == null) {
                            if (list == null) {
                                a10.c(str);
                                return;
                            } else {
                                this.f333n = bundle2;
                                a10.a(str, list);
                            }
                        } else if (list == null) {
                            a10.d(str, bundle);
                            return;
                        } else {
                            this.f333n = bundle2;
                            a10.b(str, list, bundle);
                        }
                        this.f333n = null;
                    }
                } else if (z10) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("onLoadChildren for id that isn't subscribed id=");
                    sb3.append(str);
                }
            }
        }

        public void i(@m0 String str, @m0 d dVar) {
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("mediaId is empty");
            } else if (dVar == null) {
                throw new IllegalArgumentException("cb is null");
            } else if (!a()) {
                this.f324e.post(new c(dVar, str));
            } else {
                try {
                    this.f328i.d(str, new ItemReceiver(str, dVar, this.f324e), this.f329j);
                } catch (RemoteException unused) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Remote error getting media item: ");
                    sb2.append(str);
                    this.f324e.post(new d(dVar, str));
                }
            }
        }

        public void j() {
            g gVar = this.f327h;
            if (gVar != null) {
                this.f320a.unbindService(gVar);
            }
            this.f326g = 1;
            this.f327h = null;
            this.f328i = null;
            this.f329j = null;
            this.f324e.a((Messenger) null);
            this.f330k = null;
            this.f331l = null;
        }

        public void k() {
            int i10 = this.f326g;
            if (i10 == 0 || i10 == 1) {
                this.f326g = 2;
                this.f324e.post(new a());
                return;
            }
            throw new IllegalStateException("connect() called while neigther disconnecting nor disconnected (state=" + n(this.f326g) + ")");
        }

        public void l(@m0 String str, Bundle bundle, @m0 n nVar) {
            m mVar = this.f325f.get(str);
            if (mVar == null) {
                mVar = new m();
                this.f325f.put(str, mVar);
            }
            Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
            mVar.e(bundle2, nVar);
            if (a()) {
                try {
                    this.f328i.a(str, nVar.f339b, bundle2, this.f329j);
                } catch (RemoteException unused) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("addSubscription failed with RemoteException parentId=");
                    sb2.append(str);
                }
            }
        }

        public void m(Messenger messenger) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onConnectFailed for ");
            sb2.append(this.f321b);
            if (r(messenger, "onConnectFailed")) {
                if (this.f326g != 2) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("onConnect from service while mState=");
                    sb3.append(n(this.f326g));
                    sb3.append("... ignoring");
                    return;
                }
                j();
                this.f322c.b();
            }
        }

        public void o(@m0 String str, n nVar) {
            m mVar = this.f325f.get(str);
            if (mVar != null) {
                if (nVar == null) {
                    try {
                        if (a()) {
                            this.f328i.f(str, (IBinder) null, this.f329j);
                        }
                    } catch (RemoteException unused) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("removeSubscription failed with RemoteException parentId=");
                        sb2.append(str);
                    }
                } else {
                    List<n> b10 = mVar.b();
                    List<Bundle> c10 = mVar.c();
                    for (int size = b10.size() - 1; size >= 0; size--) {
                        if (b10.get(size) == nVar) {
                            if (a()) {
                                this.f328i.f(str, nVar.f339b, this.f329j);
                            }
                            b10.remove(size);
                            c10.remove(size);
                        }
                    }
                }
                if (mVar.d() || nVar == null) {
                    this.f325f.remove(str);
                }
            }
        }

        public void p(@m0 String str, Bundle bundle, @m0 k kVar) {
            if (a()) {
                try {
                    this.f328i.g(str, bundle, new SearchResultReceiver(str, bundle, kVar, this.f324e), this.f329j);
                } catch (RemoteException unused) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Remote error searching items with query: ");
                    sb2.append(str);
                    this.f324e.post(new e(kVar, str, bundle));
                }
            } else {
                throw new IllegalStateException("search() called while not connected (state=" + n(this.f326g) + ")");
            }
        }

        public Bundle q() {
            return this.f333n;
        }

        public final boolean r(Messenger messenger, String str) {
            int i10;
            if (this.f329j == messenger && (i10 = this.f326g) != 0 && i10 != 1) {
                return true;
            }
            int i11 = this.f326g;
            if (i11 == 0 || i11 == 1) {
                return false;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(" for ");
            sb2.append(this.f321b);
            sb2.append(" with mCallbacksMessenger=");
            sb2.append(this.f329j);
            sb2.append(" this=");
            sb2.append(this);
            return false;
        }
    }

    public interface j {
        void f(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);

        void h(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2);

        void m(Messenger messenger);
    }

    public static abstract class k {
        public void a(@m0 String str, Bundle bundle) {
        }

        public void b(@m0 String str, Bundle bundle, @m0 List<MediaItem> list) {
        }
    }

    public static class l {

        /* renamed from: a  reason: collision with root package name */
        public Messenger f334a;

        /* renamed from: b  reason: collision with root package name */
        public Bundle f335b;

        public l(IBinder iBinder, Bundle bundle) {
            this.f334a = new Messenger(iBinder);
            this.f335b = bundle;
        }

        public void a(String str, IBinder iBinder, Bundle bundle, Messenger messenger) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString(androidx.media.c.f2973d, str);
            h0.m.b(bundle2, androidx.media.c.f2970a, iBinder);
            bundle2.putBundle(androidx.media.c.f2976g, bundle);
            i(3, bundle2, messenger);
        }

        public void b(Context context, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString(androidx.media.c.f2978i, context.getPackageName());
            bundle.putBundle(androidx.media.c.f2980k, this.f335b);
            i(1, bundle, messenger);
        }

        public void c(Messenger messenger) throws RemoteException {
            i(2, (Bundle) null, messenger);
        }

        public void d(String str, ResultReceiver resultReceiver, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString(androidx.media.c.f2973d, str);
            bundle.putParcelable(androidx.media.c.f2979j, resultReceiver);
            i(5, bundle, messenger);
        }

        public void e(Context context, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString(androidx.media.c.f2978i, context.getPackageName());
            bundle.putBundle(androidx.media.c.f2980k, this.f335b);
            i(6, bundle, messenger);
        }

        public void f(String str, IBinder iBinder, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString(androidx.media.c.f2973d, str);
            h0.m.b(bundle, androidx.media.c.f2970a, iBinder);
            i(4, bundle, messenger);
        }

        public void g(String str, Bundle bundle, ResultReceiver resultReceiver, Messenger messenger) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString(androidx.media.c.f2982m, str);
            bundle2.putBundle(androidx.media.c.f2981l, bundle);
            bundle2.putParcelable(androidx.media.c.f2979j, resultReceiver);
            i(8, bundle2, messenger);
        }

        public void h(String str, Bundle bundle, ResultReceiver resultReceiver, Messenger messenger) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString(androidx.media.c.f2983n, str);
            bundle2.putBundle(androidx.media.c.f2984o, bundle);
            bundle2.putParcelable(androidx.media.c.f2979j, resultReceiver);
            i(9, bundle2, messenger);
        }

        public final void i(int i10, Bundle bundle, Messenger messenger) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = i10;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.f334a.send(obtain);
        }

        public void j(Messenger messenger) throws RemoteException {
            i(7, (Bundle) null, messenger);
        }
    }

    public static class m {

        /* renamed from: a  reason: collision with root package name */
        public final List<n> f336a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final List<Bundle> f337b = new ArrayList();

        public n a(Bundle bundle) {
            for (int i10 = 0; i10 < this.f337b.size(); i10++) {
                if (androidx.media.b.a(this.f337b.get(i10), bundle)) {
                    return this.f336a.get(i10);
                }
            }
            return null;
        }

        public List<n> b() {
            return this.f336a;
        }

        public List<Bundle> c() {
            return this.f337b;
        }

        public boolean d() {
            return this.f336a.isEmpty();
        }

        public void e(Bundle bundle, n nVar) {
            for (int i10 = 0; i10 < this.f337b.size(); i10++) {
                if (androidx.media.b.a(this.f337b.get(i10), bundle)) {
                    this.f336a.set(i10, nVar);
                    return;
                }
            }
            this.f336a.add(nVar);
            this.f337b.add(bundle);
        }
    }

    public static abstract class n {

        /* renamed from: a  reason: collision with root package name */
        public final MediaBrowser.SubscriptionCallback f338a;

        /* renamed from: b  reason: collision with root package name */
        public final IBinder f339b = new Binder();

        /* renamed from: c  reason: collision with root package name */
        public WeakReference<m> f340c;

        @t0(21)
        public class a extends MediaBrowser.SubscriptionCallback {
            public a() {
            }

            public List<MediaItem> a(List<MediaItem> list, Bundle bundle) {
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

            public void onChildrenLoaded(@m0 String str, List<MediaBrowser.MediaItem> list) {
                WeakReference<m> weakReference = n.this.f340c;
                m mVar = weakReference == null ? null : weakReference.get();
                if (mVar == null) {
                    n.this.a(str, MediaItem.b(list));
                    return;
                }
                List<MediaItem> b10 = MediaItem.b(list);
                List<n> b11 = mVar.b();
                List<Bundle> c10 = mVar.c();
                for (int i10 = 0; i10 < b11.size(); i10++) {
                    Bundle bundle = c10.get(i10);
                    if (bundle == null) {
                        n.this.a(str, b10);
                    } else {
                        n.this.b(str, a(b10, bundle), bundle);
                    }
                }
            }

            public void onError(@m0 String str) {
                n.this.c(str);
            }
        }

        @t0(26)
        public class b extends a {
            public b() {
                super();
            }

            public void onChildrenLoaded(@m0 String str, List<MediaBrowser.MediaItem> list, @m0 Bundle bundle) {
                MediaSessionCompat.b(bundle);
                n.this.b(str, MediaItem.b(list), bundle);
            }

            public void onError(@m0 String str, @m0 Bundle bundle) {
                MediaSessionCompat.b(bundle);
                n.this.d(str, bundle);
            }
        }

        public n() {
            this.f338a = Build.VERSION.SDK_INT >= 26 ? new b() : new a();
        }

        public void a(@m0 String str, @m0 List<MediaItem> list) {
        }

        public void b(@m0 String str, @m0 List<MediaItem> list, @m0 Bundle bundle) {
        }

        public void c(@m0 String str) {
        }

        public void d(@m0 String str, @m0 Bundle bundle) {
        }

        public void e(m mVar) {
            this.f340c = new WeakReference<>(mVar);
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, b bVar, Bundle bundle) {
        this.f297a = Build.VERSION.SDK_INT >= 26 ? new h(context, componentName, bVar, bundle) : new g(context, componentName, bVar, bundle);
    }

    public void a() {
        this.f297a.k();
    }

    public void b() {
        this.f297a.d();
    }

    @o0
    public Bundle c() {
        return this.f297a.getExtras();
    }

    public void d(@m0 String str, @m0 d dVar) {
        this.f297a.i(str, dVar);
    }

    @x0({x0.a.O})
    @o0
    public Bundle e() {
        return this.f297a.q();
    }

    @m0
    public String f() {
        return this.f297a.getRoot();
    }

    @m0
    public ComponentName g() {
        return this.f297a.g();
    }

    @m0
    public MediaSessionCompat.Token h() {
        return this.f297a.b();
    }

    public boolean i() {
        return this.f297a.a();
    }

    public void j(@m0 String str, Bundle bundle, @m0 k kVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("query cannot be empty");
        } else if (kVar != null) {
            this.f297a.p(str, bundle, kVar);
        } else {
            throw new IllegalArgumentException("callback cannot be null");
        }
    }

    public void k(@m0 String str, Bundle bundle, @o0 c cVar) {
        if (!TextUtils.isEmpty(str)) {
            this.f297a.e(str, bundle, cVar);
            return;
        }
        throw new IllegalArgumentException("action cannot be empty");
    }

    public void l(@m0 String str, @m0 Bundle bundle, @m0 n nVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        } else if (nVar == null) {
            throw new IllegalArgumentException("callback is null");
        } else if (bundle != null) {
            this.f297a.l(str, bundle, nVar);
        } else {
            throw new IllegalArgumentException("options are null");
        }
    }

    public void m(@m0 String str, @m0 n nVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        } else if (nVar != null) {
            this.f297a.l(str, (Bundle) null, nVar);
        } else {
            throw new IllegalArgumentException("callback is null");
        }
    }

    public void n(@m0 String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f297a.o(str, (n) null);
            return;
        }
        throw new IllegalArgumentException("parentId is empty");
    }

    public void o(@m0 String str, @m0 n nVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("parentId is empty");
        } else if (nVar != null) {
            this.f297a.o(str, nVar);
        } else {
            throw new IllegalArgumentException("callback is null");
        }
    }
}
