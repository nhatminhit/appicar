package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.Rating;
import android.media.RemoteControlClient;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.b;
import android.support.v4.media.session.k;
import android.support.v4.media.session.m;
import android.support.v4.media.session.n;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.media.j;
import androidx.media.p;
import androidx.media.session.MediaButtonReceiver;
import d.m0;
import d.o0;
import d.t0;
import d.x0;
import h0.m;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import w7.s;

public class MediaSessionCompat {
    @x0({x0.a.O})
    public static final String A = "android.support.v4.media.session.action.ARGUMENT_QUERY";
    @x0({x0.a.O})
    public static final String B = "android.support.v4.media.session.action.ARGUMENT_URI";
    @x0({x0.a.O})
    public static final String C = "android.support.v4.media.session.action.ARGUMENT_RATING";
    @x0({x0.a.O})
    public static final String D = "android.support.v4.media.session.action.ARGUMENT_EXTRAS";
    @x0({x0.a.O})
    public static final String E = "android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED";
    @x0({x0.a.O})
    public static final String F = "android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE";
    @x0({x0.a.O})
    public static final String G = "android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE";
    @x0({x0.a.P})
    public static final String H = "android.support.v4.media.session.TOKEN";
    @x0({x0.a.O})
    public static final String I = "android.support.v4.media.session.EXTRA_BINDER";
    @x0({x0.a.P})
    public static final String J = "android.support.v4.media.session.SESSION_TOKEN2_BUNDLE";
    public static final int K = 320;
    public static final String L = "data_calling_pkg";
    public static final String M = "data_calling_pid";
    public static final String N = "data_calling_uid";
    public static final String O = "data_extras";
    public static int P = 0;

    /* renamed from: d  reason: collision with root package name */
    public static final String f438d = "MediaSessionCompat";

    /* renamed from: e  reason: collision with root package name */
    public static final int f439e = 1;

    /* renamed from: f  reason: collision with root package name */
    public static final int f440f = 2;

    /* renamed from: g  reason: collision with root package name */
    public static final int f441g = 4;

    /* renamed from: h  reason: collision with root package name */
    public static final String f442h = "android.support.v4.media.session.action.FLAG_AS_INAPPROPRIATE";

    /* renamed from: i  reason: collision with root package name */
    public static final String f443i = "android.support.v4.media.session.action.SKIP_AD";

    /* renamed from: j  reason: collision with root package name */
    public static final String f444j = "android.support.v4.media.session.action.FOLLOW";

    /* renamed from: k  reason: collision with root package name */
    public static final String f445k = "android.support.v4.media.session.action.UNFOLLOW";

    /* renamed from: l  reason: collision with root package name */
    public static final String f446l = "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE";

    /* renamed from: m  reason: collision with root package name */
    public static final String f447m = "android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE_VALUE";

    /* renamed from: n  reason: collision with root package name */
    public static final int f448n = 0;

    /* renamed from: o  reason: collision with root package name */
    public static final int f449o = 1;

    /* renamed from: p  reason: collision with root package name */
    public static final int f450p = 2;
    @x0({x0.a.O})

    /* renamed from: q  reason: collision with root package name */
    public static final String f451q = "android.support.v4.media.session.action.PLAY_FROM_URI";
    @x0({x0.a.O})

    /* renamed from: r  reason: collision with root package name */
    public static final String f452r = "android.support.v4.media.session.action.PREPARE";
    @x0({x0.a.O})

    /* renamed from: s  reason: collision with root package name */
    public static final String f453s = "android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID";
    @x0({x0.a.O})

    /* renamed from: t  reason: collision with root package name */
    public static final String f454t = "android.support.v4.media.session.action.PREPARE_FROM_SEARCH";
    @x0({x0.a.O})

    /* renamed from: u  reason: collision with root package name */
    public static final String f455u = "android.support.v4.media.session.action.PREPARE_FROM_URI";
    @x0({x0.a.O})

    /* renamed from: v  reason: collision with root package name */
    public static final String f456v = "android.support.v4.media.session.action.SET_CAPTIONING_ENABLED";
    @x0({x0.a.O})

    /* renamed from: w  reason: collision with root package name */
    public static final String f457w = "android.support.v4.media.session.action.SET_REPEAT_MODE";
    @x0({x0.a.O})

    /* renamed from: x  reason: collision with root package name */
    public static final String f458x = "android.support.v4.media.session.action.SET_SHUFFLE_MODE";
    @x0({x0.a.O})

    /* renamed from: y  reason: collision with root package name */
    public static final String f459y = "android.support.v4.media.session.action.SET_RATING";
    @x0({x0.a.O})

    /* renamed from: z  reason: collision with root package name */
    public static final String f460z = "android.support.v4.media.session.action.ARGUMENT_MEDIA_ID";

    /* renamed from: a  reason: collision with root package name */
    public final e f461a;

    /* renamed from: b  reason: collision with root package name */
    public final MediaControllerCompat f462b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList<k> f463c;

    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new a();
        public static final int R = -1;
        public final MediaDescriptionCompat O;
        public final long P;
        public Object Q;

        public static class a implements Parcelable.Creator<QueueItem> {
            /* renamed from: a */
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            /* renamed from: b */
            public QueueItem[] newArray(int i10) {
                return new QueueItem[i10];
            }
        }

        public QueueItem(Parcel parcel) {
            this.O = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.P = parcel.readLong();
        }

        public QueueItem(MediaDescriptionCompat mediaDescriptionCompat, long j10) {
            this((Object) null, mediaDescriptionCompat, j10);
        }

        public QueueItem(Object obj, MediaDescriptionCompat mediaDescriptionCompat, long j10) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null.");
            } else if (j10 != -1) {
                this.O = mediaDescriptionCompat;
                this.P = j10;
                this.Q = obj;
            } else {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
        }

        public static QueueItem a(Object obj) {
            if (obj != null) {
                return new QueueItem(obj, MediaDescriptionCompat.a(k.c.b(obj)), k.c.c(obj));
            }
            return null;
        }

        public static List<QueueItem> b(List<?> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object a10 : list) {
                arrayList.add(a(a10));
            }
            return arrayList;
        }

        public MediaDescriptionCompat c() {
            return this.O;
        }

        public long d() {
            return this.P;
        }

        public int describeContents() {
            return 0;
        }

        public Object e() {
            Object obj = this.Q;
            if (obj != null) {
                return obj;
            }
            Object a10 = k.c.a(this.O.f(), this.P);
            this.Q = a10;
            return a10;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.O + ", Id=" + this.P + " }";
        }

        public void writeToParcel(Parcel parcel, int i10) {
            this.O.writeToParcel(parcel, i10);
            parcel.writeLong(this.P);
        }
    }

    @x0({x0.a.O})
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new a();
        public ResultReceiver O;

        public static class a implements Parcelable.Creator<ResultReceiverWrapper> {
            /* renamed from: a */
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            /* renamed from: b */
            public ResultReceiverWrapper[] newArray(int i10) {
                return new ResultReceiverWrapper[i10];
            }
        }

        public ResultReceiverWrapper(Parcel parcel) {
            this.O = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public ResultReceiverWrapper(ResultReceiver resultReceiver) {
            this.O = resultReceiver;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            this.O.writeToParcel(parcel, i10);
        }
    }

    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new a();
        public final Object O;
        public b P;
        public Bundle Q;

        public static class a implements Parcelable.Creator<Token> {
            /* renamed from: a */
            public Token createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable((ClassLoader) null));
            }

            /* renamed from: b */
            public Token[] newArray(int i10) {
                return new Token[i10];
            }
        }

        public Token(Object obj) {
            this(obj, (b) null, (Bundle) null);
        }

        public Token(Object obj, b bVar) {
            this(obj, bVar, (Bundle) null);
        }

        public Token(Object obj, b bVar, Bundle bundle) {
            this.O = obj;
            this.P = bVar;
            this.Q = bundle;
        }

        @x0({x0.a.P})
        public static Token a(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            b D = b.a.D(m.a(bundle, MediaSessionCompat.I));
            Bundle bundle2 = bundle.getBundle(MediaSessionCompat.J);
            Token token = (Token) bundle.getParcelable(MediaSessionCompat.H);
            if (token == null) {
                return null;
            }
            return new Token(token.O, D, bundle2);
        }

        public static Token b(Object obj) {
            return c(obj, (b) null);
        }

        @x0({x0.a.P})
        public static Token c(Object obj, b bVar) {
            if (obj != null) {
                return new Token(k.u(obj), bVar);
            }
            return null;
        }

        @x0({x0.a.P})
        public b d() {
            return this.P;
        }

        public int describeContents() {
            return 0;
        }

        @x0({x0.a.P})
        public Bundle e() {
            return this.Q;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Object obj2 = this.O;
            Object obj3 = ((Token) obj).O;
            if (obj2 == null) {
                return obj3 == null;
            }
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        public Object f() {
            return this.O;
        }

        @x0({x0.a.P})
        public void g(b bVar) {
            this.P = bVar;
        }

        @x0({x0.a.P})
        public void h(Bundle bundle) {
            this.Q = bundle;
        }

        public int hashCode() {
            Object obj = this.O;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        @x0({x0.a.P})
        public Bundle j() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(MediaSessionCompat.H, this);
            b bVar = this.P;
            if (bVar != null) {
                m.b(bundle, MediaSessionCompat.I, bVar.asBinder());
            }
            Bundle bundle2 = this.Q;
            if (bundle2 != null) {
                bundle.putBundle(MediaSessionCompat.J, bundle2);
            }
            return bundle;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable((Parcelable) this.O, i10);
        }
    }

    public class a extends d {
        public a() {
        }
    }

    public class b extends d {
        public b() {
        }
    }

    public class c extends d {
        public c() {
        }
    }

    public static abstract class d {
        public final Object O;
        public WeakReference<e> P;
        public a Q = null;
        public boolean R;

        public class a extends Handler {

            /* renamed from: b  reason: collision with root package name */
            public static final int f464b = 1;

            public a(Looper looper) {
                super(looper);
            }

            public void handleMessage(Message message) {
                if (message.what == 1) {
                    d.this.a((j.b) message.obj);
                }
            }
        }

        @t0(21)
        public class b implements k.a {
            public b() {
            }

            public void a() {
                d.this.L();
            }

            public void d() {
                d.this.m();
            }

            public void e() {
                d.this.H();
            }

            public void f() {
                d.this.y();
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: android.support.v4.media.session.MediaSessionCompat$QueueItem} */
            /* JADX WARNING: type inference failed for: r1v0 */
            /* JADX WARNING: type inference failed for: r1v4, types: [android.os.IBinder] */
            /* JADX WARNING: type inference failed for: r1v6 */
            /* JADX WARNING: type inference failed for: r1v7 */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void g(java.lang.String r5, android.os.Bundle r6, android.os.ResultReceiver r7) {
                /*
                    r4 = this;
                    java.lang.String r0 = "android.support.v4.media.session.command.GET_EXTRA_BINDER"
                    boolean r0 = r5.equals(r0)     // Catch:{ BadParcelableException -> 0x00bf }
                    r1 = 0
                    if (r0 == 0) goto L_0x003d
                    android.support.v4.media.session.MediaSessionCompat$d r5 = android.support.v4.media.session.MediaSessionCompat.d.this     // Catch:{ BadParcelableException -> 0x00bf }
                    java.lang.ref.WeakReference<android.support.v4.media.session.MediaSessionCompat$e> r5 = r5.P     // Catch:{ BadParcelableException -> 0x00bf }
                    java.lang.Object r5 = r5.get()     // Catch:{ BadParcelableException -> 0x00bf }
                    android.support.v4.media.session.MediaSessionCompat$h r5 = (android.support.v4.media.session.MediaSessionCompat.h) r5     // Catch:{ BadParcelableException -> 0x00bf }
                    if (r5 == 0) goto L_0x00bf
                    android.os.Bundle r6 = new android.os.Bundle     // Catch:{ BadParcelableException -> 0x00bf }
                    r6.<init>()     // Catch:{ BadParcelableException -> 0x00bf }
                    android.support.v4.media.session.MediaSessionCompat$Token r5 = r5.b()     // Catch:{ BadParcelableException -> 0x00bf }
                    android.support.v4.media.session.b r0 = r5.d()     // Catch:{ BadParcelableException -> 0x00bf }
                    java.lang.String r2 = "android.support.v4.media.session.EXTRA_BINDER"
                    if (r0 != 0) goto L_0x0027
                    goto L_0x002b
                L_0x0027:
                    android.os.IBinder r1 = r0.asBinder()     // Catch:{ BadParcelableException -> 0x00bf }
                L_0x002b:
                    h0.m.b(r6, r2, r1)     // Catch:{ BadParcelableException -> 0x00bf }
                    android.os.Bundle r5 = r5.e()     // Catch:{ BadParcelableException -> 0x00bf }
                    java.lang.String r0 = "android.support.v4.media.session.SESSION_TOKEN2_BUNDLE"
                    r6.putBundle(r0, r5)     // Catch:{ BadParcelableException -> 0x00bf }
                    r5 = 0
                    r7.send(r5, r6)     // Catch:{ BadParcelableException -> 0x00bf }
                    goto L_0x00bf
                L_0x003d:
                    java.lang.String r0 = "android.support.v4.media.session.command.ADD_QUEUE_ITEM"
                    boolean r0 = r5.equals(r0)     // Catch:{ BadParcelableException -> 0x00bf }
                    java.lang.String r2 = "android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"
                    if (r0 == 0) goto L_0x0053
                    android.support.v4.media.session.MediaSessionCompat$d r5 = android.support.v4.media.session.MediaSessionCompat.d.this     // Catch:{ BadParcelableException -> 0x00bf }
                    android.os.Parcelable r6 = r6.getParcelable(r2)     // Catch:{ BadParcelableException -> 0x00bf }
                    android.support.v4.media.MediaDescriptionCompat r6 = (android.support.v4.media.MediaDescriptionCompat) r6     // Catch:{ BadParcelableException -> 0x00bf }
                    r5.c(r6)     // Catch:{ BadParcelableException -> 0x00bf }
                    goto L_0x00bf
                L_0x0053:
                    java.lang.String r0 = "android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT"
                    boolean r0 = r5.equals(r0)     // Catch:{ BadParcelableException -> 0x00bf }
                    java.lang.String r3 = "android.support.v4.media.session.command.ARGUMENT_INDEX"
                    if (r0 == 0) goto L_0x006d
                    android.support.v4.media.session.MediaSessionCompat$d r5 = android.support.v4.media.session.MediaSessionCompat.d.this     // Catch:{ BadParcelableException -> 0x00bf }
                    android.os.Parcelable r7 = r6.getParcelable(r2)     // Catch:{ BadParcelableException -> 0x00bf }
                    android.support.v4.media.MediaDescriptionCompat r7 = (android.support.v4.media.MediaDescriptionCompat) r7     // Catch:{ BadParcelableException -> 0x00bf }
                    int r6 = r6.getInt(r3)     // Catch:{ BadParcelableException -> 0x00bf }
                    r5.f(r7, r6)     // Catch:{ BadParcelableException -> 0x00bf }
                    goto L_0x00bf
                L_0x006d:
                    java.lang.String r0 = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM"
                    boolean r0 = r5.equals(r0)     // Catch:{ BadParcelableException -> 0x00bf }
                    if (r0 == 0) goto L_0x0081
                    android.support.v4.media.session.MediaSessionCompat$d r5 = android.support.v4.media.session.MediaSessionCompat.d.this     // Catch:{ BadParcelableException -> 0x00bf }
                    android.os.Parcelable r6 = r6.getParcelable(r2)     // Catch:{ BadParcelableException -> 0x00bf }
                    android.support.v4.media.MediaDescriptionCompat r6 = (android.support.v4.media.MediaDescriptionCompat) r6     // Catch:{ BadParcelableException -> 0x00bf }
                L_0x007d:
                    r5.w(r6)     // Catch:{ BadParcelableException -> 0x00bf }
                    goto L_0x00bf
                L_0x0081:
                    java.lang.String r0 = "android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT"
                    boolean r0 = r5.equals(r0)     // Catch:{ BadParcelableException -> 0x00bf }
                    if (r0 == 0) goto L_0x00ba
                    android.support.v4.media.session.MediaSessionCompat$d r5 = android.support.v4.media.session.MediaSessionCompat.d.this     // Catch:{ BadParcelableException -> 0x00bf }
                    java.lang.ref.WeakReference<android.support.v4.media.session.MediaSessionCompat$e> r5 = r5.P     // Catch:{ BadParcelableException -> 0x00bf }
                    java.lang.Object r5 = r5.get()     // Catch:{ BadParcelableException -> 0x00bf }
                    android.support.v4.media.session.MediaSessionCompat$h r5 = (android.support.v4.media.session.MediaSessionCompat.h) r5     // Catch:{ BadParcelableException -> 0x00bf }
                    if (r5 == 0) goto L_0x00bf
                    java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r7 = r5.f476f     // Catch:{ BadParcelableException -> 0x00bf }
                    if (r7 == 0) goto L_0x00bf
                    r7 = -1
                    int r6 = r6.getInt(r3, r7)     // Catch:{ BadParcelableException -> 0x00bf }
                    if (r6 < 0) goto L_0x00b1
                    java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r7 = r5.f476f     // Catch:{ BadParcelableException -> 0x00bf }
                    int r7 = r7.size()     // Catch:{ BadParcelableException -> 0x00bf }
                    if (r6 >= r7) goto L_0x00b1
                    java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r5 = r5.f476f     // Catch:{ BadParcelableException -> 0x00bf }
                    java.lang.Object r5 = r5.get(r6)     // Catch:{ BadParcelableException -> 0x00bf }
                    r1 = r5
                    android.support.v4.media.session.MediaSessionCompat$QueueItem r1 = (android.support.v4.media.session.MediaSessionCompat.QueueItem) r1     // Catch:{ BadParcelableException -> 0x00bf }
                L_0x00b1:
                    if (r1 == 0) goto L_0x00bf
                    android.support.v4.media.session.MediaSessionCompat$d r5 = android.support.v4.media.session.MediaSessionCompat.d.this     // Catch:{ BadParcelableException -> 0x00bf }
                    android.support.v4.media.MediaDescriptionCompat r6 = r1.c()     // Catch:{ BadParcelableException -> 0x00bf }
                    goto L_0x007d
                L_0x00ba:
                    android.support.v4.media.session.MediaSessionCompat$d r0 = android.support.v4.media.session.MediaSessionCompat.d.this     // Catch:{ BadParcelableException -> 0x00bf }
                    r0.g(r5, r6, r7)     // Catch:{ BadParcelableException -> 0x00bf }
                L_0x00bf:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat.d.b.g(java.lang.String, android.os.Bundle, android.os.ResultReceiver):void");
            }

            public void h(long j10) {
                d.this.J(j10);
            }

            public void i(Object obj) {
                d.this.D(RatingCompat.a(obj));
            }

            public void j() {
                d.this.n();
            }

            public void k() {
                d.this.I();
            }

            public boolean l(Intent intent) {
                return d.this.l(intent);
            }

            public void n(Object obj, Bundle bundle) {
            }

            public void o(String str, Bundle bundle) {
                d.this.p(str, bundle);
            }

            public void p(String str, Bundle bundle) {
                d.this.o(str, bundle);
            }

            public void q() {
                d.this.j();
            }

            public void r(long j10) {
                d.this.z(j10);
            }

            public void s(String str, Bundle bundle) {
                Bundle bundle2 = bundle.getBundle(MediaSessionCompat.D);
                MediaSessionCompat.b(bundle2);
                if (str.equals(MediaSessionCompat.f451q)) {
                    d.this.q((Uri) bundle.getParcelable(MediaSessionCompat.B), bundle2);
                } else if (str.equals(MediaSessionCompat.f452r)) {
                    d.this.r();
                } else if (str.equals(MediaSessionCompat.f453s)) {
                    d.this.s(bundle.getString(MediaSessionCompat.f460z), bundle2);
                } else if (str.equals(MediaSessionCompat.f454t)) {
                    d.this.u(bundle.getString(MediaSessionCompat.A), bundle2);
                } else if (str.equals(MediaSessionCompat.f455u)) {
                    d.this.v((Uri) bundle.getParcelable(MediaSessionCompat.B), bundle2);
                } else if (str.equals(MediaSessionCompat.f456v)) {
                    d.this.B(bundle.getBoolean(MediaSessionCompat.E));
                } else if (str.equals(MediaSessionCompat.f457w)) {
                    d.this.F(bundle.getInt(MediaSessionCompat.F));
                } else if (str.equals(MediaSessionCompat.f458x)) {
                    d.this.G(bundle.getInt(MediaSessionCompat.G));
                } else if (str.equals(MediaSessionCompat.f459y)) {
                    d.this.E((RatingCompat) bundle.getParcelable(MediaSessionCompat.C), bundle2);
                } else {
                    d.this.h(str, bundle);
                }
            }
        }

        @t0(23)
        public class c extends b implements m.a {
            public c() {
                super();
            }

            public void u(Uri uri, Bundle bundle) {
                d.this.q(uri, bundle);
            }
        }

        @t0(24)
        /* renamed from: android.support.v4.media.session.MediaSessionCompat$d$d  reason: collision with other inner class name */
        public class C0010d extends c implements n.a {
            public C0010d() {
                super();
            }

            public void b(String str, Bundle bundle) {
                d.this.s(str, bundle);
            }

            public void c() {
                d.this.r();
            }

            public void m(Uri uri, Bundle bundle) {
                d.this.v(uri, bundle);
            }

            public void t(String str, Bundle bundle) {
                d.this.u(str, bundle);
            }
        }

        public d() {
            this.O = Build.VERSION.SDK_INT >= 24 ? n.a(new C0010d()) : m.a(new c());
        }

        public void B(boolean z10) {
        }

        public void D(RatingCompat ratingCompat) {
        }

        public void E(RatingCompat ratingCompat, Bundle bundle) {
        }

        public void F(int i10) {
        }

        public void G(int i10) {
        }

        public void H() {
        }

        public void I() {
        }

        public void J(long j10) {
        }

        public void L() {
        }

        public void M(e eVar, Handler handler) {
            this.P = new WeakReference<>(eVar);
            a aVar = this.Q;
            if (aVar != null) {
                aVar.removeCallbacksAndMessages((Object) null);
            }
            this.Q = new a(handler.getLooper());
        }

        public void a(j.b bVar) {
            if (this.R) {
                boolean z10 = false;
                this.R = false;
                this.Q.removeMessages(1);
                e eVar = this.P.get();
                if (eVar != null) {
                    PlaybackStateCompat e10 = eVar.e();
                    long b10 = e10 == null ? 0 : e10.b();
                    boolean z11 = e10 != null && e10.q() == 3;
                    boolean z12 = (516 & b10) != 0;
                    if ((b10 & 514) != 0) {
                        z10 = true;
                    }
                    eVar.s(bVar);
                    if (z11 && z10) {
                        m();
                    } else if (!z11 && z12) {
                        n();
                    }
                    eVar.s((j.b) null);
                }
            }
        }

        public void c(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        public void f(MediaDescriptionCompat mediaDescriptionCompat, int i10) {
        }

        public void g(String str, Bundle bundle, ResultReceiver resultReceiver) {
        }

        public void h(String str, Bundle bundle) {
        }

        public void j() {
        }

        public boolean l(Intent intent) {
            e eVar;
            KeyEvent keyEvent;
            if (Build.VERSION.SDK_INT >= 27 || (eVar = this.P.get()) == null || this.Q == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
                return false;
            }
            j.b w10 = eVar.w();
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 79 || keyCode == 85) {
                if (keyEvent.getRepeatCount() > 0) {
                    a(w10);
                } else if (this.R) {
                    this.Q.removeMessages(1);
                    this.R = false;
                    PlaybackStateCompat e10 = eVar.e();
                    if (((e10 == null ? 0 : e10.b()) & 32) != 0) {
                        H();
                    }
                } else {
                    this.R = true;
                    a aVar = this.Q;
                    aVar.sendMessageDelayed(aVar.obtainMessage(1, w10), (long) ViewConfiguration.getDoubleTapTimeout());
                }
                return true;
            }
            a(w10);
            return false;
        }

        public void m() {
        }

        public void n() {
        }

        public void o(String str, Bundle bundle) {
        }

        public void p(String str, Bundle bundle) {
        }

        public void q(Uri uri, Bundle bundle) {
        }

        public void r() {
        }

        public void s(String str, Bundle bundle) {
        }

        public void u(String str, Bundle bundle) {
        }

        public void v(Uri uri, Bundle bundle) {
        }

        public void w(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        @Deprecated
        public void x(int i10) {
        }

        public void y() {
        }

        public void z(long j10) {
        }
    }

    public interface e {
        void B(boolean z10);

        void I(int i10);

        void a();

        Token b();

        boolean c();

        void d(String str, Bundle bundle);

        PlaybackStateCompat e();

        String f();

        void g(PendingIntent pendingIntent);

        void h(d dVar, Handler handler);

        void i(int i10);

        void j(int i10);

        void k(CharSequence charSequence);

        void l(MediaMetadataCompat mediaMetadataCompat);

        void m(PendingIntent pendingIntent);

        void n(int i10);

        void o(int i10);

        void p(List<QueueItem> list);

        Object q();

        void r(boolean z10);

        void s(j.b bVar);

        void setExtras(Bundle bundle);

        void t(PlaybackStateCompat playbackStateCompat);

        Object u();

        void v(p pVar);

        j.b w();
    }

    @t0(18)
    public static class f extends j {
        public static boolean I = true;

        public class a implements RemoteControlClient.OnPlaybackPositionUpdateListener {
            public a() {
            }

            public void onPlaybackPositionUpdate(long j10) {
                f.this.C(18, -1, -1, Long.valueOf(j10), (Bundle) null);
            }
        }

        public f(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
            super(context, str, componentName, pendingIntent);
        }

        public int A(long j10) {
            int A = super.A(j10);
            return (j10 & 256) != 0 ? A | 256 : A;
        }

        public void D(PendingIntent pendingIntent, ComponentName componentName) {
            if (I) {
                try {
                    this.f489h.registerMediaButtonEventReceiver(pendingIntent);
                } catch (NullPointerException unused) {
                    I = false;
                }
            }
            if (!I) {
                super.D(pendingIntent, componentName);
            }
        }

        public void Q(PlaybackStateCompat playbackStateCompat) {
            long p10 = playbackStateCompat.p();
            float n10 = playbackStateCompat.n();
            long l10 = playbackStateCompat.l();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (playbackStateCompat.q() == 3) {
                long j10 = 0;
                if (p10 > 0) {
                    if (l10 > 0) {
                        j10 = elapsedRealtime - l10;
                        if (n10 > 0.0f && n10 != 1.0f) {
                            j10 = (long) (((float) j10) * n10);
                        }
                    }
                    p10 += j10;
                }
            }
            this.f490i.setPlaybackState(z(playbackStateCompat.q()), p10, n10);
        }

        public void S(PendingIntent pendingIntent, ComponentName componentName) {
            if (I) {
                this.f489h.unregisterMediaButtonEventReceiver(pendingIntent);
            } else {
                super.S(pendingIntent, componentName);
            }
        }

        public void h(d dVar, Handler handler) {
            super.h(dVar, handler);
            if (dVar == null) {
                this.f490i.setPlaybackPositionUpdateListener((RemoteControlClient.OnPlaybackPositionUpdateListener) null);
                return;
            }
            this.f490i.setPlaybackPositionUpdateListener(new a());
        }
    }

    @t0(19)
    public static class g extends f {

        public class a implements RemoteControlClient.OnMetadataUpdateListener {
            public a() {
            }

            public void onMetadataUpdate(int i10, Object obj) {
                if (i10 == 268435457 && (obj instanceof Rating)) {
                    g.this.C(19, -1, -1, RatingCompat.a(obj), (Bundle) null);
                }
            }
        }

        public g(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
            super(context, str, componentName, pendingIntent);
        }

        public int A(long j10) {
            int A = super.A(j10);
            return (j10 & 128) != 0 ? A | 512 : A;
        }

        public void h(d dVar, Handler handler) {
            super.h(dVar, handler);
            if (dVar == null) {
                this.f490i.setMetadataUpdateListener((RemoteControlClient.OnMetadataUpdateListener) null);
                return;
            }
            this.f490i.setMetadataUpdateListener(new a());
        }

        public RemoteControlClient.MetadataEditor y(Bundle bundle) {
            RemoteControlClient.MetadataEditor y10 = super.y(bundle);
            PlaybackStateCompat playbackStateCompat = this.f502u;
            if (((playbackStateCompat == null ? 0 : playbackStateCompat.b()) & 128) != 0) {
                y10.addEditableKey(268435457);
            }
            if (bundle == null) {
                return y10;
            }
            if (bundle.containsKey(MediaMetadataCompat.f363b0)) {
                y10.putLong(8, bundle.getLong(MediaMetadataCompat.f363b0));
            }
            if (bundle.containsKey(MediaMetadataCompat.f374m0)) {
                y10.putObject(101, bundle.getParcelable(MediaMetadataCompat.f374m0));
            }
            if (bundle.containsKey(MediaMetadataCompat.f373l0)) {
                y10.putObject(268435457, bundle.getParcelable(MediaMetadataCompat.f373l0));
            }
            return y10;
        }
    }

    @t0(21)
    public static class h implements e {

        /* renamed from: a  reason: collision with root package name */
        public final Object f471a;

        /* renamed from: b  reason: collision with root package name */
        public final Token f472b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f473c = false;

        /* renamed from: d  reason: collision with root package name */
        public final RemoteCallbackList<a> f474d = new RemoteCallbackList<>();

        /* renamed from: e  reason: collision with root package name */
        public PlaybackStateCompat f475e;

        /* renamed from: f  reason: collision with root package name */
        public List<QueueItem> f476f;

        /* renamed from: g  reason: collision with root package name */
        public MediaMetadataCompat f477g;

        /* renamed from: h  reason: collision with root package name */
        public int f478h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f479i;

        /* renamed from: j  reason: collision with root package name */
        public int f480j;

        /* renamed from: k  reason: collision with root package name */
        public int f481k;

        public class a extends b.a {
            public a() {
            }

            public void B(boolean z10) throws RemoteException {
                throw new AssertionError();
            }

            public void B0(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            public int E() {
                return h.this.f481k;
            }

            public void E1(long j10) {
                throw new AssertionError();
            }

            public boolean F() {
                return h.this.f479i;
            }

            public void F0(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            public void F1(boolean z10) throws RemoteException {
            }

            public List<QueueItem> G() {
                return null;
            }

            public ParcelableVolumeInfo H1() {
                throw new AssertionError();
            }

            public void I(int i10) throws RemoteException {
                throw new AssertionError();
            }

            public void I0() throws RemoteException {
                throw new AssertionError();
            }

            public void L(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            public void L0(Uri uri, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            public void N(a aVar) {
                h hVar = h.this;
                if (!hVar.f473c) {
                    String f10 = hVar.f();
                    if (f10 == null) {
                        f10 = j.b.f3007b;
                    }
                    h.this.f474d.register(aVar, new j.b(f10, Binder.getCallingPid(), Binder.getCallingUid()));
                }
            }

            public boolean Q() {
                return false;
            }

            public void R(RatingCompat ratingCompat) throws RemoteException {
                throw new AssertionError();
            }

            public void T(int i10, int i11, String str) {
                throw new AssertionError();
            }

            public boolean T0(KeyEvent keyEvent) {
                throw new AssertionError();
            }

            public void V(Uri uri, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            public boolean Y() {
                throw new AssertionError();
            }

            public void Y0(int i10, int i11, String str) {
                throw new AssertionError();
            }

            public PendingIntent Z() {
                throw new AssertionError();
            }

            public void b1(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            public MediaMetadataCompat d() {
                throw new AssertionError();
            }

            public void d1(MediaDescriptionCompat mediaDescriptionCompat, int i10) {
                throw new AssertionError();
            }

            public PlaybackStateCompat e() {
                h hVar = h.this;
                return MediaSessionCompat.j(hVar.f475e, hVar.f477g);
            }

            public void e0(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            public void f() throws RemoteException {
                throw new AssertionError();
            }

            public String g() {
                throw new AssertionError();
            }

            public void g0() throws RemoteException {
                throw new AssertionError();
            }

            public Bundle getExtras() {
                throw new AssertionError();
            }

            public void i(int i10) throws RemoteException {
                throw new AssertionError();
            }

            public long j() {
                throw new AssertionError();
            }

            public int k() {
                return h.this.f480j;
            }

            public void l1(int i10) {
                throw new AssertionError();
            }

            public String n() {
                throw new AssertionError();
            }

            public void next() throws RemoteException {
                throw new AssertionError();
            }

            public void p(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            public void pause() throws RemoteException {
                throw new AssertionError();
            }

            public void previous() throws RemoteException {
                throw new AssertionError();
            }

            public void q(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            public int r() {
                return h.this.f478h;
            }

            public void stop() throws RemoteException {
                throw new AssertionError();
            }

            public CharSequence v() {
                throw new AssertionError();
            }

            public void w1(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                throw new AssertionError();
            }

            public void x(long j10) throws RemoteException {
                throw new AssertionError();
            }

            public void x0(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            public void x1() throws RemoteException {
                throw new AssertionError();
            }

            public void y0(a aVar) {
                h.this.f474d.unregister(aVar);
            }
        }

        public h(Context context, String str, Bundle bundle) {
            Object b10 = k.b(context, str);
            this.f471a = b10;
            this.f472b = new Token(k.c(b10), new a(), bundle);
        }

        public h(Object obj) {
            Object t10 = k.t(obj);
            this.f471a = t10;
            this.f472b = new Token(k.c(t10), new a());
        }

        public void B(boolean z10) {
            if (this.f479i != z10) {
                this.f479i = z10;
                for (int beginBroadcast = this.f474d.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.f474d.getBroadcastItem(beginBroadcast).N0(z10);
                    } catch (RemoteException unused) {
                    }
                }
                this.f474d.finishBroadcast();
            }
        }

        public void I(int i10) {
            if (this.f481k != i10) {
                this.f481k = i10;
                for (int beginBroadcast = this.f474d.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.f474d.getBroadcastItem(beginBroadcast).t1(i10);
                    } catch (RemoteException unused) {
                    }
                }
                this.f474d.finishBroadcast();
            }
        }

        public void a() {
            this.f473c = true;
            k.f(this.f471a);
        }

        public Token b() {
            return this.f472b;
        }

        public boolean c() {
            return k.e(this.f471a);
        }

        public void d(String str, Bundle bundle) {
            k.g(this.f471a, str, bundle);
        }

        public PlaybackStateCompat e() {
            return this.f475e;
        }

        public String f() {
            if (Build.VERSION.SDK_INT < 24) {
                return null;
            }
            return n.b(this.f471a);
        }

        public void g(PendingIntent pendingIntent) {
            k.s(this.f471a, pendingIntent);
        }

        public void h(d dVar, Handler handler) {
            k.i(this.f471a, dVar == null ? null : dVar.O, handler);
            if (dVar != null) {
                dVar.M(this, handler);
            }
        }

        public void i(int i10) {
            if (this.f480j != i10) {
                this.f480j = i10;
                for (int beginBroadcast = this.f474d.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.f474d.getBroadcastItem(beginBroadcast).C(i10);
                    } catch (RemoteException unused) {
                    }
                }
                this.f474d.finishBroadcast();
            }
        }

        public void j(int i10) {
            k.o(this.f471a, i10);
        }

        public void k(CharSequence charSequence) {
            k.r(this.f471a, charSequence);
        }

        public void l(MediaMetadataCompat mediaMetadataCompat) {
            this.f477g = mediaMetadataCompat;
            k.m(this.f471a, mediaMetadataCompat == null ? null : mediaMetadataCompat.g());
        }

        public void m(PendingIntent pendingIntent) {
            k.l(this.f471a, pendingIntent);
        }

        public void n(int i10) {
            l.a(this.f471a, i10);
        }

        public void o(int i10) {
            k.k(this.f471a, i10);
        }

        public void p(List<QueueItem> list) {
            ArrayList arrayList;
            this.f476f = list;
            if (list != null) {
                arrayList = new ArrayList();
                for (QueueItem e10 : list) {
                    arrayList.add(e10.e());
                }
            } else {
                arrayList = null;
            }
            k.q(this.f471a, arrayList);
        }

        public Object q() {
            return null;
        }

        public void r(boolean z10) {
            k.h(this.f471a, z10);
        }

        public void s(j.b bVar) {
        }

        public void setExtras(Bundle bundle) {
            k.j(this.f471a, bundle);
        }

        public void t(PlaybackStateCompat playbackStateCompat) {
            this.f475e = playbackStateCompat;
            for (int beginBroadcast = this.f474d.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f474d.getBroadcastItem(beginBroadcast).R1(playbackStateCompat);
                } catch (RemoteException unused) {
                }
            }
            this.f474d.finishBroadcast();
            k.n(this.f471a, playbackStateCompat == null ? null : playbackStateCompat.o());
        }

        public Object u() {
            return this.f471a;
        }

        public void v(p pVar) {
            k.p(this.f471a, pVar.d());
        }

        public j.b w() {
            return null;
        }
    }

    @t0(28)
    public static class i extends h {
        public i(Context context, String str, Bundle bundle) {
            super(context, str, bundle);
        }

        public i(Object obj) {
            super(obj);
        }

        public void s(j.b bVar) {
        }

        @m0
        public final j.b w() {
            return new j.b(((MediaSession) this.f471a).getCurrentControllerInfo());
        }
    }

    public static class j implements e {
        public static final int H = 0;
        public int A;
        public int B;
        public Bundle C;
        public int D;
        public int E;
        public p F;
        public p.b G = new a();

        /* renamed from: a  reason: collision with root package name */
        public final Context f482a;

        /* renamed from: b  reason: collision with root package name */
        public final ComponentName f483b;

        /* renamed from: c  reason: collision with root package name */
        public final PendingIntent f484c;

        /* renamed from: d  reason: collision with root package name */
        public final c f485d;

        /* renamed from: e  reason: collision with root package name */
        public final Token f486e;

        /* renamed from: f  reason: collision with root package name */
        public final String f487f;

        /* renamed from: g  reason: collision with root package name */
        public final String f488g;

        /* renamed from: h  reason: collision with root package name */
        public final AudioManager f489h;

        /* renamed from: i  reason: collision with root package name */
        public final RemoteControlClient f490i;

        /* renamed from: j  reason: collision with root package name */
        public final Object f491j = new Object();

        /* renamed from: k  reason: collision with root package name */
        public final RemoteCallbackList<a> f492k = new RemoteCallbackList<>();

        /* renamed from: l  reason: collision with root package name */
        public d f493l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f494m = false;

        /* renamed from: n  reason: collision with root package name */
        public boolean f495n = false;

        /* renamed from: o  reason: collision with root package name */
        public boolean f496o = false;

        /* renamed from: p  reason: collision with root package name */
        public boolean f497p = false;

        /* renamed from: q  reason: collision with root package name */
        public volatile d f498q;

        /* renamed from: r  reason: collision with root package name */
        public j.b f499r;

        /* renamed from: s  reason: collision with root package name */
        public int f500s;

        /* renamed from: t  reason: collision with root package name */
        public MediaMetadataCompat f501t;

        /* renamed from: u  reason: collision with root package name */
        public PlaybackStateCompat f502u;

        /* renamed from: v  reason: collision with root package name */
        public PendingIntent f503v;

        /* renamed from: w  reason: collision with root package name */
        public List<QueueItem> f504w;

        /* renamed from: x  reason: collision with root package name */
        public CharSequence f505x;

        /* renamed from: y  reason: collision with root package name */
        public int f506y;

        /* renamed from: z  reason: collision with root package name */
        public boolean f507z;

        public class a extends p.b {
            public a() {
            }

            public void a(p pVar) {
                if (j.this.F == pVar) {
                    j jVar = j.this;
                    j.this.P(new ParcelableVolumeInfo(jVar.D, jVar.E, pVar.c(), pVar.b(), pVar.a()));
                }
            }
        }

        public static final class b {

            /* renamed from: a  reason: collision with root package name */
            public final String f509a;

            /* renamed from: b  reason: collision with root package name */
            public final Bundle f510b;

            /* renamed from: c  reason: collision with root package name */
            public final ResultReceiver f511c;

            public b(String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f509a = str;
                this.f510b = bundle;
                this.f511c = resultReceiver;
            }
        }

        public class c extends b.a {
            public c() {
            }

            public void B(boolean z10) throws RemoteException {
                b0(29, Boolean.valueOf(z10));
            }

            public void B0(String str, Bundle bundle) throws RemoteException {
                Z1(8, str, bundle);
            }

            public int E() {
                return j.this.B;
            }

            public void E1(long j10) {
                b0(11, Long.valueOf(j10));
            }

            public boolean F() {
                return j.this.f507z;
            }

            public void F0(String str, Bundle bundle) throws RemoteException {
                Z1(9, str, bundle);
            }

            public void F1(boolean z10) throws RemoteException {
            }

            public List<QueueItem> G() {
                List<QueueItem> list;
                synchronized (j.this.f491j) {
                    list = j.this.f504w;
                }
                return list;
            }

            public void H(int i10) {
                j.this.C(i10, 0, 0, (Object) null, (Bundle) null);
            }

            public ParcelableVolumeInfo H1() {
                int i10;
                int i11;
                int i12;
                int i13;
                int i14;
                synchronized (j.this.f491j) {
                    j jVar = j.this;
                    i10 = jVar.D;
                    i11 = jVar.E;
                    p pVar = jVar.F;
                    i12 = 2;
                    if (i10 == 2) {
                        int c10 = pVar.c();
                        int b10 = pVar.b();
                        i13 = pVar.a();
                        i14 = b10;
                        i12 = c10;
                    } else {
                        i14 = jVar.f489h.getStreamMaxVolume(i11);
                        i13 = j.this.f489h.getStreamVolume(i11);
                    }
                }
                return new ParcelableVolumeInfo(i10, i11, i12, i14, i13);
            }

            public void I(int i10) throws RemoteException {
                J(30, i10);
            }

            public void I0() throws RemoteException {
                H(16);
            }

            public void J(int i10, int i11) {
                j.this.C(i10, i11, 0, (Object) null, (Bundle) null);
            }

            public void L(String str, Bundle bundle) throws RemoteException {
                Z1(20, str, bundle);
            }

            public void L0(Uri uri, Bundle bundle) throws RemoteException {
                Z1(10, uri, bundle);
            }

            public void N(a aVar) {
                if (j.this.f494m) {
                    try {
                        aVar.A();
                    } catch (Exception unused) {
                    }
                } else {
                    j.this.f492k.register(aVar, new j.b(j.b.f3007b, Binder.getCallingPid(), Binder.getCallingUid()));
                }
            }

            public boolean Q() {
                return false;
            }

            public void R(RatingCompat ratingCompat) throws RemoteException {
                b0(19, ratingCompat);
            }

            public void T(int i10, int i11, String str) {
                j.this.R(i10, i11);
            }

            public boolean T0(KeyEvent keyEvent) {
                boolean z10 = true;
                if ((j.this.f500s & 1) == 0) {
                    z10 = false;
                }
                if (z10) {
                    b0(21, keyEvent);
                }
                return z10;
            }

            public void V(Uri uri, Bundle bundle) throws RemoteException {
                Z1(6, uri, bundle);
            }

            public boolean Y() {
                return (j.this.f500s & 2) != 0;
            }

            public void Y0(int i10, int i11, String str) {
                j.this.x(i10, i11);
            }

            public void Y1(int i10, Object obj, int i11) {
                j.this.C(i10, i11, 0, obj, (Bundle) null);
            }

            public PendingIntent Z() {
                PendingIntent pendingIntent;
                synchronized (j.this.f491j) {
                    pendingIntent = j.this.f503v;
                }
                return pendingIntent;
            }

            public void Z1(int i10, Object obj, Bundle bundle) {
                j.this.C(i10, 0, 0, obj, bundle);
            }

            public void b0(int i10, Object obj) {
                j.this.C(i10, 0, 0, obj, (Bundle) null);
            }

            public void b1(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {
                Z1(31, ratingCompat, bundle);
            }

            public MediaMetadataCompat d() {
                return j.this.f501t;
            }

            public void d1(MediaDescriptionCompat mediaDescriptionCompat, int i10) {
                Y1(26, mediaDescriptionCompat, i10);
            }

            public PlaybackStateCompat e() {
                PlaybackStateCompat playbackStateCompat;
                MediaMetadataCompat mediaMetadataCompat;
                synchronized (j.this.f491j) {
                    j jVar = j.this;
                    playbackStateCompat = jVar.f502u;
                    mediaMetadataCompat = jVar.f501t;
                }
                return MediaSessionCompat.j(playbackStateCompat, mediaMetadataCompat);
            }

            public void e0(String str, Bundle bundle) throws RemoteException {
                Z1(5, str, bundle);
            }

            public void f() throws RemoteException {
                H(7);
            }

            public String g() {
                return j.this.f488g;
            }

            public void g0() throws RemoteException {
                H(3);
            }

            public Bundle getExtras() {
                Bundle bundle;
                synchronized (j.this.f491j) {
                    bundle = j.this.C;
                }
                return bundle;
            }

            public void i(int i10) throws RemoteException {
                J(23, i10);
            }

            public long j() {
                long j10;
                synchronized (j.this.f491j) {
                    j10 = (long) j.this.f500s;
                }
                return j10;
            }

            public int k() {
                return j.this.A;
            }

            public void l1(int i10) {
                J(28, i10);
            }

            public String n() {
                return j.this.f487f;
            }

            public void next() throws RemoteException {
                H(14);
            }

            public void p(MediaDescriptionCompat mediaDescriptionCompat) {
                b0(27, mediaDescriptionCompat);
            }

            public void pause() throws RemoteException {
                H(12);
            }

            public void previous() throws RemoteException {
                H(15);
            }

            public void q(MediaDescriptionCompat mediaDescriptionCompat) {
                b0(25, mediaDescriptionCompat);
            }

            public int r() {
                return j.this.f506y;
            }

            public void stop() throws RemoteException {
                H(13);
            }

            public CharSequence v() {
                return j.this.f505x;
            }

            public void w1(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                b0(1, new b(str, bundle, resultReceiverWrapper.O));
            }

            public void x(long j10) throws RemoteException {
                b0(18, Long.valueOf(j10));
            }

            public void x0(String str, Bundle bundle) throws RemoteException {
                Z1(4, str, bundle);
            }

            public void x1() throws RemoteException {
                H(17);
            }

            public void y0(a aVar) {
                j.this.f492k.unregister(aVar);
            }
        }

        public class d extends Handler {
            public static final int A = 26;
            public static final int B = 27;
            public static final int C = 28;
            public static final int D = 29;
            public static final int E = 30;
            public static final int F = 127;
            public static final int G = 126;

            /* renamed from: b  reason: collision with root package name */
            public static final int f512b = 1;

            /* renamed from: c  reason: collision with root package name */
            public static final int f513c = 2;

            /* renamed from: d  reason: collision with root package name */
            public static final int f514d = 3;

            /* renamed from: e  reason: collision with root package name */
            public static final int f515e = 4;

            /* renamed from: f  reason: collision with root package name */
            public static final int f516f = 5;

            /* renamed from: g  reason: collision with root package name */
            public static final int f517g = 6;

            /* renamed from: h  reason: collision with root package name */
            public static final int f518h = 7;

            /* renamed from: i  reason: collision with root package name */
            public static final int f519i = 8;

            /* renamed from: j  reason: collision with root package name */
            public static final int f520j = 9;

            /* renamed from: k  reason: collision with root package name */
            public static final int f521k = 10;

            /* renamed from: l  reason: collision with root package name */
            public static final int f522l = 11;

            /* renamed from: m  reason: collision with root package name */
            public static final int f523m = 12;

            /* renamed from: n  reason: collision with root package name */
            public static final int f524n = 13;

            /* renamed from: o  reason: collision with root package name */
            public static final int f525o = 14;

            /* renamed from: p  reason: collision with root package name */
            public static final int f526p = 15;

            /* renamed from: q  reason: collision with root package name */
            public static final int f527q = 16;

            /* renamed from: r  reason: collision with root package name */
            public static final int f528r = 17;

            /* renamed from: s  reason: collision with root package name */
            public static final int f529s = 18;

            /* renamed from: t  reason: collision with root package name */
            public static final int f530t = 19;

            /* renamed from: u  reason: collision with root package name */
            public static final int f531u = 31;

            /* renamed from: v  reason: collision with root package name */
            public static final int f532v = 20;

            /* renamed from: w  reason: collision with root package name */
            public static final int f533w = 21;

            /* renamed from: x  reason: collision with root package name */
            public static final int f534x = 22;

            /* renamed from: y  reason: collision with root package name */
            public static final int f535y = 23;

            /* renamed from: z  reason: collision with root package name */
            public static final int f536z = 25;

            public d(Looper looper) {
                super(looper);
            }

            public final void a(KeyEvent keyEvent, d dVar) {
                if (keyEvent != null && keyEvent.getAction() == 0) {
                    PlaybackStateCompat playbackStateCompat = j.this.f502u;
                    long b10 = playbackStateCompat == null ? 0 : playbackStateCompat.b();
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode != 126) {
                        if (keyCode != 127) {
                            switch (keyCode) {
                                case 86:
                                    if ((b10 & 1) != 0) {
                                        dVar.L();
                                        return;
                                    }
                                    return;
                                case 87:
                                    if ((b10 & 32) != 0) {
                                        dVar.H();
                                        return;
                                    }
                                    return;
                                case 88:
                                    if ((b10 & 16) != 0) {
                                        dVar.I();
                                        return;
                                    }
                                    return;
                                case 89:
                                    if ((b10 & 8) != 0) {
                                        dVar.y();
                                        return;
                                    }
                                    return;
                                case 90:
                                    if ((b10 & 64) != 0) {
                                        dVar.j();
                                        return;
                                    }
                                    return;
                                default:
                                    return;
                            }
                        } else if ((b10 & 2) != 0) {
                            dVar.m();
                        }
                    } else if ((b10 & 4) != 0) {
                        dVar.n();
                    }
                }
            }

            /* JADX WARNING: Can't fix incorrect switch cases order */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void handleMessage(android.os.Message r8) {
                /*
                    r7 = this;
                    android.support.v4.media.session.MediaSessionCompat$j r0 = android.support.v4.media.session.MediaSessionCompat.j.this
                    android.support.v4.media.session.MediaSessionCompat$d r0 = r0.f498q
                    if (r0 != 0) goto L_0x0007
                    return
                L_0x0007:
                    android.os.Bundle r1 = r8.getData()
                    android.support.v4.media.session.MediaSessionCompat.b(r1)
                    android.support.v4.media.session.MediaSessionCompat$j r2 = android.support.v4.media.session.MediaSessionCompat.j.this
                    androidx.media.j$b r3 = new androidx.media.j$b
                    java.lang.String r4 = "data_calling_pkg"
                    java.lang.String r4 = r1.getString(r4)
                    java.lang.String r5 = "data_calling_pid"
                    int r5 = r1.getInt(r5)
                    java.lang.String r6 = "data_calling_uid"
                    int r6 = r1.getInt(r6)
                    r3.<init>(r4, r5, r6)
                    r2.s(r3)
                    java.lang.String r2 = "data_extras"
                    android.os.Bundle r1 = r1.getBundle(r2)
                    android.support.v4.media.session.MediaSessionCompat.b(r1)
                    r2 = 0
                    int r3 = r8.what     // Catch:{ all -> 0x015f }
                    r4 = 0
                    switch(r3) {
                        case 1: goto L_0x014c;
                        case 2: goto L_0x0144;
                        case 3: goto L_0x0140;
                        case 4: goto L_0x0138;
                        case 5: goto L_0x0130;
                        case 6: goto L_0x0128;
                        case 7: goto L_0x0124;
                        case 8: goto L_0x011c;
                        case 9: goto L_0x0114;
                        case 10: goto L_0x010c;
                        case 11: goto L_0x0100;
                        case 12: goto L_0x00fc;
                        case 13: goto L_0x00f8;
                        case 14: goto L_0x00f4;
                        case 15: goto L_0x00ef;
                        case 16: goto L_0x00ea;
                        case 17: goto L_0x00e5;
                        case 18: goto L_0x00d8;
                        case 19: goto L_0x00cf;
                        case 20: goto L_0x00c6;
                        case 21: goto L_0x00ab;
                        case 22: goto L_0x00a2;
                        case 23: goto L_0x009b;
                        case 24: goto L_0x003a;
                        case 25: goto L_0x0092;
                        case 26: goto L_0x0087;
                        case 27: goto L_0x0082;
                        case 28: goto L_0x0059;
                        case 29: goto L_0x004c;
                        case 30: goto L_0x0045;
                        case 31: goto L_0x003c;
                        default: goto L_0x003a;
                    }     // Catch:{ all -> 0x015f }
                L_0x003a:
                    goto L_0x0159
                L_0x003c:
                    java.lang.Object r8 = r8.obj     // Catch:{ all -> 0x015f }
                    android.support.v4.media.RatingCompat r8 = (android.support.v4.media.RatingCompat) r8     // Catch:{ all -> 0x015f }
                    r0.E(r8, r1)     // Catch:{ all -> 0x015f }
                    goto L_0x0159
                L_0x0045:
                    int r8 = r8.arg1     // Catch:{ all -> 0x015f }
                    r0.G(r8)     // Catch:{ all -> 0x015f }
                    goto L_0x0159
                L_0x004c:
                    java.lang.Object r8 = r8.obj     // Catch:{ all -> 0x015f }
                    java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x015f }
                    boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x015f }
                    r0.B(r8)     // Catch:{ all -> 0x015f }
                    goto L_0x0159
                L_0x0059:
                    android.support.v4.media.session.MediaSessionCompat$j r1 = android.support.v4.media.session.MediaSessionCompat.j.this     // Catch:{ all -> 0x015f }
                    java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r1 = r1.f504w     // Catch:{ all -> 0x015f }
                    if (r1 == 0) goto L_0x0159
                    int r3 = r8.arg1     // Catch:{ all -> 0x015f }
                    if (r3 < 0) goto L_0x0076
                    int r1 = r1.size()     // Catch:{ all -> 0x015f }
                    if (r3 >= r1) goto L_0x0076
                    android.support.v4.media.session.MediaSessionCompat$j r1 = android.support.v4.media.session.MediaSessionCompat.j.this     // Catch:{ all -> 0x015f }
                    java.util.List<android.support.v4.media.session.MediaSessionCompat$QueueItem> r1 = r1.f504w     // Catch:{ all -> 0x015f }
                    int r8 = r8.arg1     // Catch:{ all -> 0x015f }
                    java.lang.Object r8 = r1.get(r8)     // Catch:{ all -> 0x015f }
                    android.support.v4.media.session.MediaSessionCompat$QueueItem r8 = (android.support.v4.media.session.MediaSessionCompat.QueueItem) r8     // Catch:{ all -> 0x015f }
                    goto L_0x0077
                L_0x0076:
                    r8 = r2
                L_0x0077:
                    if (r8 == 0) goto L_0x0159
                    android.support.v4.media.MediaDescriptionCompat r8 = r8.c()     // Catch:{ all -> 0x015f }
                L_0x007d:
                    r0.w(r8)     // Catch:{ all -> 0x015f }
                    goto L_0x0159
                L_0x0082:
                    java.lang.Object r8 = r8.obj     // Catch:{ all -> 0x015f }
                    android.support.v4.media.MediaDescriptionCompat r8 = (android.support.v4.media.MediaDescriptionCompat) r8     // Catch:{ all -> 0x015f }
                    goto L_0x007d
                L_0x0087:
                    java.lang.Object r1 = r8.obj     // Catch:{ all -> 0x015f }
                    android.support.v4.media.MediaDescriptionCompat r1 = (android.support.v4.media.MediaDescriptionCompat) r1     // Catch:{ all -> 0x015f }
                    int r8 = r8.arg1     // Catch:{ all -> 0x015f }
                    r0.f(r1, r8)     // Catch:{ all -> 0x015f }
                    goto L_0x0159
                L_0x0092:
                    java.lang.Object r8 = r8.obj     // Catch:{ all -> 0x015f }
                    android.support.v4.media.MediaDescriptionCompat r8 = (android.support.v4.media.MediaDescriptionCompat) r8     // Catch:{ all -> 0x015f }
                    r0.c(r8)     // Catch:{ all -> 0x015f }
                    goto L_0x0159
                L_0x009b:
                    int r8 = r8.arg1     // Catch:{ all -> 0x015f }
                    r0.F(r8)     // Catch:{ all -> 0x015f }
                    goto L_0x0159
                L_0x00a2:
                    android.support.v4.media.session.MediaSessionCompat$j r0 = android.support.v4.media.session.MediaSessionCompat.j.this     // Catch:{ all -> 0x015f }
                    int r8 = r8.arg1     // Catch:{ all -> 0x015f }
                    r0.R(r8, r4)     // Catch:{ all -> 0x015f }
                    goto L_0x0159
                L_0x00ab:
                    java.lang.Object r8 = r8.obj     // Catch:{ all -> 0x015f }
                    android.view.KeyEvent r8 = (android.view.KeyEvent) r8     // Catch:{ all -> 0x015f }
                    android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x015f }
                    java.lang.String r3 = "android.intent.action.MEDIA_BUTTON"
                    r1.<init>(r3)     // Catch:{ all -> 0x015f }
                    java.lang.String r3 = "android.intent.extra.KEY_EVENT"
                    r1.putExtra(r3, r8)     // Catch:{ all -> 0x015f }
                    boolean r1 = r0.l(r1)     // Catch:{ all -> 0x015f }
                    if (r1 != 0) goto L_0x0159
                    r7.a(r8, r0)     // Catch:{ all -> 0x015f }
                    goto L_0x0159
                L_0x00c6:
                    java.lang.Object r8 = r8.obj     // Catch:{ all -> 0x015f }
                    java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x015f }
                    r0.h(r8, r1)     // Catch:{ all -> 0x015f }
                    goto L_0x0159
                L_0x00cf:
                    java.lang.Object r8 = r8.obj     // Catch:{ all -> 0x015f }
                    android.support.v4.media.RatingCompat r8 = (android.support.v4.media.RatingCompat) r8     // Catch:{ all -> 0x015f }
                    r0.D(r8)     // Catch:{ all -> 0x015f }
                    goto L_0x0159
                L_0x00d8:
                    java.lang.Object r8 = r8.obj     // Catch:{ all -> 0x015f }
                    java.lang.Long r8 = (java.lang.Long) r8     // Catch:{ all -> 0x015f }
                    long r3 = r8.longValue()     // Catch:{ all -> 0x015f }
                    r0.z(r3)     // Catch:{ all -> 0x015f }
                    goto L_0x0159
                L_0x00e5:
                    r0.y()     // Catch:{ all -> 0x015f }
                    goto L_0x0159
                L_0x00ea:
                    r0.j()     // Catch:{ all -> 0x015f }
                    goto L_0x0159
                L_0x00ef:
                    r0.I()     // Catch:{ all -> 0x015f }
                    goto L_0x0159
                L_0x00f4:
                    r0.H()     // Catch:{ all -> 0x015f }
                    goto L_0x0159
                L_0x00f8:
                    r0.L()     // Catch:{ all -> 0x015f }
                    goto L_0x0159
                L_0x00fc:
                    r0.m()     // Catch:{ all -> 0x015f }
                    goto L_0x0159
                L_0x0100:
                    java.lang.Object r8 = r8.obj     // Catch:{ all -> 0x015f }
                    java.lang.Long r8 = (java.lang.Long) r8     // Catch:{ all -> 0x015f }
                    long r3 = r8.longValue()     // Catch:{ all -> 0x015f }
                    r0.J(r3)     // Catch:{ all -> 0x015f }
                    goto L_0x0159
                L_0x010c:
                    java.lang.Object r8 = r8.obj     // Catch:{ all -> 0x015f }
                    android.net.Uri r8 = (android.net.Uri) r8     // Catch:{ all -> 0x015f }
                    r0.q(r8, r1)     // Catch:{ all -> 0x015f }
                    goto L_0x0159
                L_0x0114:
                    java.lang.Object r8 = r8.obj     // Catch:{ all -> 0x015f }
                    java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x015f }
                    r0.p(r8, r1)     // Catch:{ all -> 0x015f }
                    goto L_0x0159
                L_0x011c:
                    java.lang.Object r8 = r8.obj     // Catch:{ all -> 0x015f }
                    java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x015f }
                    r0.o(r8, r1)     // Catch:{ all -> 0x015f }
                    goto L_0x0159
                L_0x0124:
                    r0.n()     // Catch:{ all -> 0x015f }
                    goto L_0x0159
                L_0x0128:
                    java.lang.Object r8 = r8.obj     // Catch:{ all -> 0x015f }
                    android.net.Uri r8 = (android.net.Uri) r8     // Catch:{ all -> 0x015f }
                    r0.v(r8, r1)     // Catch:{ all -> 0x015f }
                    goto L_0x0159
                L_0x0130:
                    java.lang.Object r8 = r8.obj     // Catch:{ all -> 0x015f }
                    java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x015f }
                    r0.u(r8, r1)     // Catch:{ all -> 0x015f }
                    goto L_0x0159
                L_0x0138:
                    java.lang.Object r8 = r8.obj     // Catch:{ all -> 0x015f }
                    java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x015f }
                    r0.s(r8, r1)     // Catch:{ all -> 0x015f }
                    goto L_0x0159
                L_0x0140:
                    r0.r()     // Catch:{ all -> 0x015f }
                    goto L_0x0159
                L_0x0144:
                    android.support.v4.media.session.MediaSessionCompat$j r0 = android.support.v4.media.session.MediaSessionCompat.j.this     // Catch:{ all -> 0x015f }
                    int r8 = r8.arg1     // Catch:{ all -> 0x015f }
                    r0.x(r8, r4)     // Catch:{ all -> 0x015f }
                    goto L_0x0159
                L_0x014c:
                    java.lang.Object r8 = r8.obj     // Catch:{ all -> 0x015f }
                    android.support.v4.media.session.MediaSessionCompat$j$b r8 = (android.support.v4.media.session.MediaSessionCompat.j.b) r8     // Catch:{ all -> 0x015f }
                    java.lang.String r1 = r8.f509a     // Catch:{ all -> 0x015f }
                    android.os.Bundle r3 = r8.f510b     // Catch:{ all -> 0x015f }
                    android.os.ResultReceiver r8 = r8.f511c     // Catch:{ all -> 0x015f }
                    r0.g(r1, r3, r8)     // Catch:{ all -> 0x015f }
                L_0x0159:
                    android.support.v4.media.session.MediaSessionCompat$j r8 = android.support.v4.media.session.MediaSessionCompat.j.this
                    r8.s(r2)
                    return
                L_0x015f:
                    r8 = move-exception
                    android.support.v4.media.session.MediaSessionCompat$j r0 = android.support.v4.media.session.MediaSessionCompat.j.this
                    r0.s(r2)
                    throw r8
                */
                throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat.j.d.handleMessage(android.os.Message):void");
            }
        }

        public j(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
            if (componentName != null) {
                this.f482a = context;
                this.f487f = context.getPackageName();
                this.f489h = (AudioManager) context.getSystemService(s.f14801b);
                this.f488g = str;
                this.f483b = componentName;
                this.f484c = pendingIntent;
                c cVar = new c();
                this.f485d = cVar;
                this.f486e = new Token(cVar);
                this.f506y = 0;
                this.D = 1;
                this.E = 3;
                this.f490i = new RemoteControlClient(pendingIntent);
                return;
            }
            throw new IllegalArgumentException("MediaButtonReceiver component may not be null.");
        }

        public int A(long j10) {
            int i10 = (1 & j10) != 0 ? 32 : 0;
            if ((2 & j10) != 0) {
                i10 |= 16;
            }
            if ((4 & j10) != 0) {
                i10 |= 4;
            }
            if ((8 & j10) != 0) {
                i10 |= 2;
            }
            if ((16 & j10) != 0) {
                i10 |= 1;
            }
            if ((32 & j10) != 0) {
                i10 |= 128;
            }
            if ((64 & j10) != 0) {
                i10 |= 64;
            }
            return (j10 & 512) != 0 ? i10 | 8 : i10;
        }

        public void B(boolean z10) {
            if (this.f507z != z10) {
                this.f507z = z10;
                E(z10);
            }
        }

        public void C(int i10, int i11, int i12, Object obj, Bundle bundle) {
            synchronized (this.f491j) {
                d dVar = this.f493l;
                if (dVar != null) {
                    Message obtainMessage = dVar.obtainMessage(i10, i11, i12, obj);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(MediaSessionCompat.L, j.b.f3007b);
                    bundle2.putInt("data_calling_pid", Binder.getCallingPid());
                    bundle2.putInt("data_calling_uid", Binder.getCallingUid());
                    if (bundle != null) {
                        bundle2.putBundle(MediaSessionCompat.O, bundle);
                    }
                    obtainMessage.setData(bundle2);
                    obtainMessage.sendToTarget();
                }
            }
        }

        public void D(PendingIntent pendingIntent, ComponentName componentName) {
            this.f489h.registerMediaButtonEventReceiver(componentName);
        }

        public final void E(boolean z10) {
            for (int beginBroadcast = this.f492k.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f492k.getBroadcastItem(beginBroadcast).N0(z10);
                } catch (RemoteException unused) {
                }
            }
            this.f492k.finishBroadcast();
        }

        public final void F(String str, Bundle bundle) {
            for (int beginBroadcast = this.f492k.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f492k.getBroadcastItem(beginBroadcast).S1(str, bundle);
                } catch (RemoteException unused) {
                }
            }
            this.f492k.finishBroadcast();
        }

        public final void G(Bundle bundle) {
            for (int beginBroadcast = this.f492k.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f492k.getBroadcastItem(beginBroadcast).s(bundle);
                } catch (RemoteException unused) {
                }
            }
            this.f492k.finishBroadcast();
        }

        public final void H(MediaMetadataCompat mediaMetadataCompat) {
            for (int beginBroadcast = this.f492k.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f492k.getBroadcastItem(beginBroadcast).e1(mediaMetadataCompat);
                } catch (RemoteException unused) {
                }
            }
            this.f492k.finishBroadcast();
        }

        public void I(int i10) {
            if (this.B != i10) {
                this.B = i10;
                N(i10);
            }
        }

        public final void J(List<QueueItem> list) {
            for (int beginBroadcast = this.f492k.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f492k.getBroadcastItem(beginBroadcast).u(list);
                } catch (RemoteException unused) {
                }
            }
            this.f492k.finishBroadcast();
        }

        public final void K(CharSequence charSequence) {
            for (int beginBroadcast = this.f492k.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f492k.getBroadcastItem(beginBroadcast).z(charSequence);
                } catch (RemoteException unused) {
                }
            }
            this.f492k.finishBroadcast();
        }

        public final void L(int i10) {
            for (int beginBroadcast = this.f492k.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f492k.getBroadcastItem(beginBroadcast).C(i10);
                } catch (RemoteException unused) {
                }
            }
            this.f492k.finishBroadcast();
        }

        public final void M() {
            for (int beginBroadcast = this.f492k.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f492k.getBroadcastItem(beginBroadcast).A();
                } catch (RemoteException unused) {
                }
            }
            this.f492k.finishBroadcast();
            this.f492k.kill();
        }

        public final void N(int i10) {
            for (int beginBroadcast = this.f492k.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f492k.getBroadcastItem(beginBroadcast).t1(i10);
                } catch (RemoteException unused) {
                }
            }
            this.f492k.finishBroadcast();
        }

        public final void O(PlaybackStateCompat playbackStateCompat) {
            for (int beginBroadcast = this.f492k.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f492k.getBroadcastItem(beginBroadcast).R1(playbackStateCompat);
                } catch (RemoteException unused) {
                }
            }
            this.f492k.finishBroadcast();
        }

        public void P(ParcelableVolumeInfo parcelableVolumeInfo) {
            for (int beginBroadcast = this.f492k.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    this.f492k.getBroadcastItem(beginBroadcast).W1(parcelableVolumeInfo);
                } catch (RemoteException unused) {
                }
            }
            this.f492k.finishBroadcast();
        }

        public void Q(PlaybackStateCompat playbackStateCompat) {
            this.f490i.setPlaybackState(z(playbackStateCompat.q()));
        }

        public void R(int i10, int i11) {
            if (this.D == 2) {
                p pVar = this.F;
                if (pVar != null) {
                    pVar.f(i10);
                    return;
                }
                return;
            }
            this.f489h.setStreamVolume(this.E, i10, i11);
        }

        public void S(PendingIntent pendingIntent, ComponentName componentName) {
            this.f489h.unregisterMediaButtonEventReceiver(componentName);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0043, code lost:
            if ((r4.f500s & 2) == 0) goto L_0x0057;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0055, code lost:
            if (r4.f497p != false) goto L_0x0057;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean T() {
            /*
                r4 = this;
                boolean r0 = r4.f495n
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L_0x0046
                boolean r0 = r4.f496o
                if (r0 != 0) goto L_0x0019
                int r3 = r4.f500s
                r3 = r3 & r1
                if (r3 == 0) goto L_0x0019
                android.app.PendingIntent r0 = r4.f484c
                android.content.ComponentName r3 = r4.f483b
                r4.D(r0, r3)
                r4.f496o = r1
                goto L_0x0029
            L_0x0019:
                if (r0 == 0) goto L_0x0029
                int r0 = r4.f500s
                r0 = r0 & r1
                if (r0 != 0) goto L_0x0029
                android.app.PendingIntent r0 = r4.f484c
                android.content.ComponentName r3 = r4.f483b
                r4.S(r0, r3)
                r4.f496o = r2
            L_0x0029:
                boolean r0 = r4.f497p
                if (r0 != 0) goto L_0x003d
                int r3 = r4.f500s
                r3 = r3 & 2
                if (r3 == 0) goto L_0x003d
                android.media.AudioManager r0 = r4.f489h
                android.media.RemoteControlClient r2 = r4.f490i
                r0.registerRemoteControlClient(r2)
                r4.f497p = r1
                goto L_0x0066
            L_0x003d:
                if (r0 == 0) goto L_0x0065
                int r0 = r4.f500s
                r0 = r0 & 2
                if (r0 != 0) goto L_0x0065
                goto L_0x0057
            L_0x0046:
                boolean r0 = r4.f496o
                if (r0 == 0) goto L_0x0053
                android.app.PendingIntent r0 = r4.f484c
                android.content.ComponentName r1 = r4.f483b
                r4.S(r0, r1)
                r4.f496o = r2
            L_0x0053:
                boolean r0 = r4.f497p
                if (r0 == 0) goto L_0x0065
            L_0x0057:
                android.media.RemoteControlClient r0 = r4.f490i
                r0.setPlaybackState(r2)
                android.media.AudioManager r0 = r4.f489h
                android.media.RemoteControlClient r1 = r4.f490i
                r0.unregisterRemoteControlClient(r1)
                r4.f497p = r2
            L_0x0065:
                r1 = r2
            L_0x0066:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat.j.T():boolean");
        }

        public void a() {
            this.f495n = false;
            this.f494m = true;
            T();
            M();
        }

        public Token b() {
            return this.f486e;
        }

        public boolean c() {
            return this.f495n;
        }

        public void d(String str, Bundle bundle) {
            F(str, bundle);
        }

        public PlaybackStateCompat e() {
            PlaybackStateCompat playbackStateCompat;
            synchronized (this.f491j) {
                playbackStateCompat = this.f502u;
            }
            return playbackStateCompat;
        }

        public String f() {
            return null;
        }

        public void g(PendingIntent pendingIntent) {
            synchronized (this.f491j) {
                this.f503v = pendingIntent;
            }
        }

        public void h(d dVar, Handler handler) {
            this.f498q = dVar;
            if (dVar != null) {
                if (handler == null) {
                    handler = new Handler();
                }
                synchronized (this.f491j) {
                    d dVar2 = this.f493l;
                    if (dVar2 != null) {
                        dVar2.removeCallbacksAndMessages((Object) null);
                    }
                    this.f493l = new d(handler.getLooper());
                    this.f498q.M(this, handler);
                }
            }
        }

        public void i(int i10) {
            if (this.A != i10) {
                this.A = i10;
                L(i10);
            }
        }

        public void j(int i10) {
            p pVar = this.F;
            if (pVar != null) {
                pVar.g((p.b) null);
            }
            this.E = i10;
            this.D = 1;
            int i11 = this.D;
            int i12 = this.E;
            P(new ParcelableVolumeInfo(i11, i12, 2, this.f489h.getStreamMaxVolume(i12), this.f489h.getStreamVolume(this.E)));
        }

        public void k(CharSequence charSequence) {
            this.f505x = charSequence;
            K(charSequence);
        }

        public void l(MediaMetadataCompat mediaMetadataCompat) {
            if (mediaMetadataCompat != null) {
                mediaMetadataCompat = new MediaMetadataCompat.c(mediaMetadataCompat, MediaSessionCompat.P).a();
            }
            synchronized (this.f491j) {
                this.f501t = mediaMetadataCompat;
            }
            H(mediaMetadataCompat);
            if (this.f495n) {
                y(mediaMetadataCompat == null ? null : mediaMetadataCompat.d()).apply();
            }
        }

        public void m(PendingIntent pendingIntent) {
        }

        public void n(int i10) {
            this.f506y = i10;
        }

        public void o(int i10) {
            synchronized (this.f491j) {
                this.f500s = i10;
            }
            T();
        }

        public void p(List<QueueItem> list) {
            this.f504w = list;
            J(list);
        }

        public Object q() {
            return null;
        }

        public void r(boolean z10) {
            if (z10 != this.f495n) {
                this.f495n = z10;
                if (T()) {
                    l(this.f501t);
                    t(this.f502u);
                }
            }
        }

        public void s(j.b bVar) {
            synchronized (this.f491j) {
                this.f499r = bVar;
            }
        }

        public void setExtras(Bundle bundle) {
            this.C = bundle;
            G(bundle);
        }

        public void t(PlaybackStateCompat playbackStateCompat) {
            synchronized (this.f491j) {
                this.f502u = playbackStateCompat;
            }
            O(playbackStateCompat);
            if (this.f495n) {
                if (playbackStateCompat == null) {
                    this.f490i.setPlaybackState(0);
                    this.f490i.setTransportControlFlags(0);
                    return;
                }
                Q(playbackStateCompat);
                this.f490i.setTransportControlFlags(A(playbackStateCompat.b()));
            }
        }

        public Object u() {
            return null;
        }

        public void v(p pVar) {
            if (pVar != null) {
                p pVar2 = this.F;
                if (pVar2 != null) {
                    pVar2.g((p.b) null);
                }
                this.D = 2;
                this.F = pVar;
                P(new ParcelableVolumeInfo(this.D, this.E, this.F.c(), this.F.b(), this.F.a()));
                pVar.g(this.G);
                return;
            }
            throw new IllegalArgumentException("volumeProvider may not be null");
        }

        public j.b w() {
            j.b bVar;
            synchronized (this.f491j) {
                bVar = this.f499r;
            }
            return bVar;
        }

        public void x(int i10, int i11) {
            if (this.D == 2) {
                p pVar = this.F;
                if (pVar != null) {
                    pVar.e(i10);
                    return;
                }
                return;
            }
            this.f489h.adjustStreamVolume(this.E, i10, i11);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0037, code lost:
            if (r2 != null) goto L_0x001d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
            if (r2 != null) goto L_0x001d;
         */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0042  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0051  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0062  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0072  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0082  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0093  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00a3  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00b3  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00c4  */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x00d5  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x00e5  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x00f5  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x0104  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.media.RemoteControlClient.MetadataEditor y(android.os.Bundle r7) {
            /*
                r6 = this;
                android.media.RemoteControlClient r0 = r6.f490i
                r1 = 1
                android.media.RemoteControlClient$MetadataEditor r0 = r0.editMetadata(r1)
                if (r7 != 0) goto L_0x000a
                return r0
            L_0x000a:
                java.lang.String r2 = "android.media.metadata.ART"
                boolean r3 = r7.containsKey(r2)
                r4 = 100
                r5 = 0
                if (r3 == 0) goto L_0x0029
                android.os.Parcelable r2 = r7.getParcelable(r2)
                android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
                if (r2 == 0) goto L_0x0025
            L_0x001d:
                android.graphics.Bitmap$Config r3 = r2.getConfig()
                android.graphics.Bitmap r2 = r2.copy(r3, r5)
            L_0x0025:
                r0.putBitmap(r4, r2)
                goto L_0x003a
            L_0x0029:
                java.lang.String r2 = "android.media.metadata.ALBUM_ART"
                boolean r3 = r7.containsKey(r2)
                if (r3 == 0) goto L_0x003a
                android.os.Parcelable r2 = r7.getParcelable(r2)
                android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
                if (r2 == 0) goto L_0x0025
                goto L_0x001d
            L_0x003a:
                java.lang.String r2 = "android.media.metadata.ALBUM"
                boolean r3 = r7.containsKey(r2)
                if (r3 == 0) goto L_0x0049
                java.lang.String r2 = r7.getString(r2)
                r0.putString(r1, r2)
            L_0x0049:
                java.lang.String r1 = "android.media.metadata.ALBUM_ARTIST"
                boolean r2 = r7.containsKey(r1)
                if (r2 == 0) goto L_0x005a
                r2 = 13
                java.lang.String r1 = r7.getString(r1)
                r0.putString(r2, r1)
            L_0x005a:
                java.lang.String r1 = "android.media.metadata.ARTIST"
                boolean r2 = r7.containsKey(r1)
                if (r2 == 0) goto L_0x006a
                r2 = 2
                java.lang.String r1 = r7.getString(r1)
                r0.putString(r2, r1)
            L_0x006a:
                java.lang.String r1 = "android.media.metadata.AUTHOR"
                boolean r2 = r7.containsKey(r1)
                if (r2 == 0) goto L_0x007a
                r2 = 3
                java.lang.String r1 = r7.getString(r1)
                r0.putString(r2, r1)
            L_0x007a:
                java.lang.String r1 = "android.media.metadata.COMPILATION"
                boolean r2 = r7.containsKey(r1)
                if (r2 == 0) goto L_0x008b
                r2 = 15
                java.lang.String r1 = r7.getString(r1)
                r0.putString(r2, r1)
            L_0x008b:
                java.lang.String r1 = "android.media.metadata.COMPOSER"
                boolean r2 = r7.containsKey(r1)
                if (r2 == 0) goto L_0x009b
                r2 = 4
                java.lang.String r1 = r7.getString(r1)
                r0.putString(r2, r1)
            L_0x009b:
                java.lang.String r1 = "android.media.metadata.DATE"
                boolean r2 = r7.containsKey(r1)
                if (r2 == 0) goto L_0x00ab
                r2 = 5
                java.lang.String r1 = r7.getString(r1)
                r0.putString(r2, r1)
            L_0x00ab:
                java.lang.String r1 = "android.media.metadata.DISC_NUMBER"
                boolean r2 = r7.containsKey(r1)
                if (r2 == 0) goto L_0x00bc
                r2 = 14
                long r3 = r7.getLong(r1)
                r0.putLong(r2, r3)
            L_0x00bc:
                java.lang.String r1 = "android.media.metadata.DURATION"
                boolean r2 = r7.containsKey(r1)
                if (r2 == 0) goto L_0x00cd
                r2 = 9
                long r3 = r7.getLong(r1)
                r0.putLong(r2, r3)
            L_0x00cd:
                java.lang.String r1 = "android.media.metadata.GENRE"
                boolean r2 = r7.containsKey(r1)
                if (r2 == 0) goto L_0x00dd
                r2 = 6
                java.lang.String r1 = r7.getString(r1)
                r0.putString(r2, r1)
            L_0x00dd:
                java.lang.String r1 = "android.media.metadata.TITLE"
                boolean r2 = r7.containsKey(r1)
                if (r2 == 0) goto L_0x00ed
                r2 = 7
                java.lang.String r1 = r7.getString(r1)
                r0.putString(r2, r1)
            L_0x00ed:
                java.lang.String r1 = "android.media.metadata.TRACK_NUMBER"
                boolean r2 = r7.containsKey(r1)
                if (r2 == 0) goto L_0x00fc
                long r1 = r7.getLong(r1)
                r0.putLong(r5, r1)
            L_0x00fc:
                java.lang.String r1 = "android.media.metadata.WRITER"
                boolean r2 = r7.containsKey(r1)
                if (r2 == 0) goto L_0x010d
                r2 = 11
                java.lang.String r7 = r7.getString(r1)
                r0.putString(r2, r7)
            L_0x010d:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat.j.y(android.os.Bundle):android.media.RemoteControlClient$MetadataEditor");
        }

        public int z(int i10) {
            switch (i10) {
                case 0:
                    return 0;
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
                case 5:
                    return 5;
                case 6:
                case 8:
                    return 8;
                case 7:
                    return 9;
                case 9:
                    return 7;
                case 10:
                case 11:
                    return 6;
                default:
                    return -1;
            }
        }
    }

    public interface k {
        void a();
    }

    @x0({x0.a.P})
    @Retention(RetentionPolicy.SOURCE)
    public @interface l {
    }

    public MediaSessionCompat(Context context, e eVar) {
        this.f463c = new ArrayList<>();
        this.f461a = eVar;
        if (!k.d(eVar.u())) {
            p(new c());
        }
        this.f462b = new MediaControllerCompat(context, this);
    }

    public MediaSessionCompat(Context context, String str) {
        this(context, str, (ComponentName) null, (PendingIntent) null);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        this(context, str, componentName, pendingIntent, (Bundle) null);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        e hVar;
        d bVar;
        this.f463c = new ArrayList<>();
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        } else if (!TextUtils.isEmpty(str)) {
            componentName = componentName == null ? MediaButtonReceiver.c(context) : componentName;
            if (componentName != null && pendingIntent == null) {
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                intent.setComponent(componentName);
                pendingIntent = PendingIntent.getBroadcast(context, 0, intent, 0);
            }
            if (Build.VERSION.SDK_INT >= 28) {
                hVar = new i(context, str, bundle);
                this.f461a = hVar;
                bVar = new a();
            } else {
                hVar = new h(context, str, bundle);
                this.f461a = hVar;
                bVar = new b();
            }
            p(bVar);
            hVar.m(pendingIntent);
            this.f462b = new MediaControllerCompat(context, this);
            if (P == 0) {
                P = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
            }
        } else {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
    }

    @x0({x0.a.P})
    public MediaSessionCompat(Context context, String str, Bundle bundle) {
        this(context, str, (ComponentName) null, (PendingIntent) null, bundle);
    }

    @x0({x0.a.P})
    public static void b(@o0 Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    public static MediaSessionCompat c(Context context, Object obj) {
        if (context == null || obj == null) {
            return null;
        }
        return new MediaSessionCompat(context, (e) new h(obj));
    }

    public static PlaybackStateCompat j(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat) {
        if (playbackStateCompat == null) {
            return playbackStateCompat;
        }
        long j10 = -1;
        if (playbackStateCompat.p() == -1) {
            return playbackStateCompat;
        }
        if (playbackStateCompat.q() != 3 && playbackStateCompat.q() != 4 && playbackStateCompat.q() != 5) {
            return playbackStateCompat;
        }
        long l10 = playbackStateCompat.l();
        if (l10 <= 0) {
            return playbackStateCompat;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long n10 = ((long) (playbackStateCompat.n() * ((float) (elapsedRealtime - l10)))) + playbackStateCompat.p();
        if (mediaMetadataCompat != null && mediaMetadataCompat.a(MediaMetadataCompat.U)) {
            j10 = mediaMetadataCompat.f(MediaMetadataCompat.U);
        }
        return new PlaybackStateCompat.c(playbackStateCompat).k(playbackStateCompat.q(), (j10 < 0 || n10 <= j10) ? n10 < 0 ? 0 : n10 : j10, playbackStateCompat.n(), elapsedRealtime).c();
    }

    public void A(CharSequence charSequence) {
        this.f461a.k(charSequence);
    }

    public void B(int i10) {
        this.f461a.n(i10);
    }

    public void C(int i10) {
        this.f461a.i(i10);
    }

    public void D(PendingIntent pendingIntent) {
        this.f461a.g(pendingIntent);
    }

    public void E(int i10) {
        this.f461a.I(i10);
    }

    public void a(k kVar) {
        if (kVar != null) {
            this.f463c.add(kVar);
            return;
        }
        throw new IllegalArgumentException("Listener may not be null");
    }

    @x0({x0.a.P})
    public String d() {
        return this.f461a.f();
    }

    public MediaControllerCompat e() {
        return this.f462b;
    }

    @m0
    public final j.b f() {
        return this.f461a.w();
    }

    public Object g() {
        return this.f461a.u();
    }

    public Object h() {
        return this.f461a.q();
    }

    public Token i() {
        return this.f461a.b();
    }

    public boolean k() {
        return this.f461a.c();
    }

    public void l() {
        this.f461a.a();
    }

    public void m(k kVar) {
        if (kVar != null) {
            this.f463c.remove(kVar);
            return;
        }
        throw new IllegalArgumentException("Listener may not be null");
    }

    public void n(String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f461a.d(str, bundle);
            return;
        }
        throw new IllegalArgumentException("event cannot be null or empty");
    }

    public void o(boolean z10) {
        this.f461a.r(z10);
        Iterator<k> it = this.f463c.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public void p(d dVar) {
        q(dVar, (Handler) null);
    }

    public void q(d dVar, Handler handler) {
        if (dVar == null) {
            this.f461a.h((d) null, (Handler) null);
            return;
        }
        e eVar = this.f461a;
        if (handler == null) {
            handler = new Handler();
        }
        eVar.h(dVar, handler);
    }

    public void r(boolean z10) {
        this.f461a.B(z10);
    }

    public void s(Bundle bundle) {
        this.f461a.setExtras(bundle);
    }

    public void t(int i10) {
        this.f461a.o(i10);
    }

    public void u(PendingIntent pendingIntent) {
        this.f461a.m(pendingIntent);
    }

    public void v(MediaMetadataCompat mediaMetadataCompat) {
        this.f461a.l(mediaMetadataCompat);
    }

    public void w(PlaybackStateCompat playbackStateCompat) {
        this.f461a.t(playbackStateCompat);
    }

    public void x(int i10) {
        this.f461a.j(i10);
    }

    public void y(p pVar) {
        if (pVar != null) {
            this.f461a.v(pVar);
            return;
        }
        throw new IllegalArgumentException("volumeProvider may not be null!");
    }

    public void z(List<QueueItem> list) {
        this.f461a.p(list);
    }
}
