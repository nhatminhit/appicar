package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.media.session.o;
import android.text.TextUtils;
import d.o0;
import d.x0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

public final class PlaybackStateCompat implements Parcelable {
    public static final int A0 = 4;
    public static final int B0 = 5;
    public static final int C0 = 6;
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();
    public static final int D0 = 7;
    public static final int E0 = 8;
    public static final int F0 = 9;
    public static final int G0 = 10;
    public static final int H0 = 11;
    public static final long I0 = -1;
    public static final int J0 = -1;
    public static final int K0 = 0;
    public static final int L0 = 1;
    public static final int M0 = 2;
    public static final int N0 = 3;
    public static final int O0 = -1;
    public static final int P0 = 0;
    public static final int Q0 = 1;
    public static final int R0 = 2;
    public static final int S0 = 0;
    public static final int T0 = 1;
    public static final int U0 = 2;
    public static final int V0 = 3;
    public static final int W0 = 4;
    public static final int X0 = 5;
    public static final int Y0 = 6;
    public static final int Z0 = 7;

    /* renamed from: a0  reason: collision with root package name */
    public static final long f538a0 = 1;

    /* renamed from: a1  reason: collision with root package name */
    public static final int f539a1 = 8;

    /* renamed from: b0  reason: collision with root package name */
    public static final long f540b0 = 2;

    /* renamed from: b1  reason: collision with root package name */
    public static final int f541b1 = 9;

    /* renamed from: c0  reason: collision with root package name */
    public static final long f542c0 = 4;

    /* renamed from: c1  reason: collision with root package name */
    public static final int f543c1 = 10;

    /* renamed from: d0  reason: collision with root package name */
    public static final long f544d0 = 8;

    /* renamed from: d1  reason: collision with root package name */
    public static final int f545d1 = 11;

    /* renamed from: e0  reason: collision with root package name */
    public static final long f546e0 = 16;

    /* renamed from: e1  reason: collision with root package name */
    public static final int f547e1 = 127;

    /* renamed from: f0  reason: collision with root package name */
    public static final long f548f0 = 32;

    /* renamed from: f1  reason: collision with root package name */
    public static final int f549f1 = 126;

    /* renamed from: g0  reason: collision with root package name */
    public static final long f550g0 = 64;

    /* renamed from: h0  reason: collision with root package name */
    public static final long f551h0 = 128;

    /* renamed from: i0  reason: collision with root package name */
    public static final long f552i0 = 256;

    /* renamed from: j0  reason: collision with root package name */
    public static final long f553j0 = 512;

    /* renamed from: k0  reason: collision with root package name */
    public static final long f554k0 = 1024;

    /* renamed from: l0  reason: collision with root package name */
    public static final long f555l0 = 2048;

    /* renamed from: m0  reason: collision with root package name */
    public static final long f556m0 = 4096;

    /* renamed from: n0  reason: collision with root package name */
    public static final long f557n0 = 8192;

    /* renamed from: o0  reason: collision with root package name */
    public static final long f558o0 = 16384;

    /* renamed from: p0  reason: collision with root package name */
    public static final long f559p0 = 32768;

    /* renamed from: q0  reason: collision with root package name */
    public static final long f560q0 = 65536;

    /* renamed from: r0  reason: collision with root package name */
    public static final long f561r0 = 131072;

    /* renamed from: s0  reason: collision with root package name */
    public static final long f562s0 = 262144;
    @Deprecated

    /* renamed from: t0  reason: collision with root package name */
    public static final long f563t0 = 524288;

    /* renamed from: u0  reason: collision with root package name */
    public static final long f564u0 = 1048576;

    /* renamed from: v0  reason: collision with root package name */
    public static final long f565v0 = 2097152;

    /* renamed from: w0  reason: collision with root package name */
    public static final int f566w0 = 0;

    /* renamed from: x0  reason: collision with root package name */
    public static final int f567x0 = 1;

    /* renamed from: y0  reason: collision with root package name */
    public static final int f568y0 = 2;

    /* renamed from: z0  reason: collision with root package name */
    public static final int f569z0 = 3;
    public final int O;
    public final long P;
    public final long Q;
    public final float R;
    public final long S;
    public final int T;
    public final CharSequence U;
    public final long V;
    public List<CustomAction> W;
    public final long X;
    public final Bundle Y;
    public Object Z;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();
        public final String O;
        public final CharSequence P;
        public final int Q;
        public final Bundle R;
        public Object S;

        public static class a implements Parcelable.Creator<CustomAction> {
            /* renamed from: a */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            /* renamed from: b */
            public CustomAction[] newArray(int i10) {
                return new CustomAction[i10];
            }
        }

        public static final class b {

            /* renamed from: a  reason: collision with root package name */
            public final String f570a;

            /* renamed from: b  reason: collision with root package name */
            public final CharSequence f571b;

            /* renamed from: c  reason: collision with root package name */
            public final int f572c;

            /* renamed from: d  reason: collision with root package name */
            public Bundle f573d;

            public b(String str, CharSequence charSequence, int i10) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException("You must specify an action to build a CustomAction.");
                } else if (TextUtils.isEmpty(charSequence)) {
                    throw new IllegalArgumentException("You must specify a name to build a CustomAction.");
                } else if (i10 != 0) {
                    this.f570a = str;
                    this.f571b = charSequence;
                    this.f572c = i10;
                } else {
                    throw new IllegalArgumentException("You must specify an icon resource id to build a CustomAction.");
                }
            }

            public CustomAction a() {
                return new CustomAction(this.f570a, this.f571b, this.f572c, this.f573d);
            }

            public b b(Bundle bundle) {
                this.f573d = bundle;
                return this;
            }
        }

        public CustomAction(Parcel parcel) {
            this.O = parcel.readString();
            this.P = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.Q = parcel.readInt();
            this.R = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        public CustomAction(String str, CharSequence charSequence, int i10, Bundle bundle) {
            this.O = str;
            this.P = charSequence;
            this.Q = i10;
            this.R = bundle;
        }

        public static CustomAction a(Object obj) {
            if (obj == null) {
                return null;
            }
            CustomAction customAction = new CustomAction(o.a.a(obj), o.a.d(obj), o.a.c(obj), o.a.b(obj));
            customAction.S = obj;
            return customAction;
        }

        public String b() {
            return this.O;
        }

        public Object c() {
            Object obj = this.S;
            if (obj != null) {
                return obj;
            }
            Object e10 = o.a.e(this.O, this.P, this.Q, this.R);
            this.S = e10;
            return e10;
        }

        public Bundle d() {
            return this.R;
        }

        public int describeContents() {
            return 0;
        }

        public int e() {
            return this.Q;
        }

        public CharSequence f() {
            return this.P;
        }

        public String toString() {
            return "Action:mName='" + this.P + ", mIcon=" + this.Q + ", mExtras=" + this.R;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.O);
            TextUtils.writeToParcel(this.P, parcel, i10);
            parcel.writeInt(this.Q);
            parcel.writeBundle(this.R);
        }
    }

    public static class a implements Parcelable.Creator<PlaybackStateCompat> {
        /* renamed from: a */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        /* renamed from: b */
        public PlaybackStateCompat[] newArray(int i10) {
            return new PlaybackStateCompat[i10];
        }
    }

    @x0({x0.a.P})
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final List<CustomAction> f574a;

        /* renamed from: b  reason: collision with root package name */
        public int f575b;

        /* renamed from: c  reason: collision with root package name */
        public long f576c;

        /* renamed from: d  reason: collision with root package name */
        public long f577d;

        /* renamed from: e  reason: collision with root package name */
        public float f578e;

        /* renamed from: f  reason: collision with root package name */
        public long f579f;

        /* renamed from: g  reason: collision with root package name */
        public int f580g;

        /* renamed from: h  reason: collision with root package name */
        public CharSequence f581h;

        /* renamed from: i  reason: collision with root package name */
        public long f582i;

        /* renamed from: j  reason: collision with root package name */
        public long f583j;

        /* renamed from: k  reason: collision with root package name */
        public Bundle f584k;

        public c() {
            this.f574a = new ArrayList();
            this.f583j = -1;
        }

        public c(PlaybackStateCompat playbackStateCompat) {
            ArrayList arrayList = new ArrayList();
            this.f574a = arrayList;
            this.f583j = -1;
            this.f575b = playbackStateCompat.O;
            this.f576c = playbackStateCompat.P;
            this.f578e = playbackStateCompat.R;
            this.f582i = playbackStateCompat.V;
            this.f577d = playbackStateCompat.Q;
            this.f579f = playbackStateCompat.S;
            this.f580g = playbackStateCompat.T;
            this.f581h = playbackStateCompat.U;
            List<CustomAction> list = playbackStateCompat.W;
            if (list != null) {
                arrayList.addAll(list);
            }
            this.f583j = playbackStateCompat.X;
            this.f584k = playbackStateCompat.Y;
        }

        public c a(CustomAction customAction) {
            if (customAction != null) {
                this.f574a.add(customAction);
                return this;
            }
            throw new IllegalArgumentException("You may not add a null CustomAction to PlaybackStateCompat.");
        }

        public c b(String str, String str2, int i10) {
            return a(new CustomAction(str, str2, i10, (Bundle) null));
        }

        public PlaybackStateCompat c() {
            return new PlaybackStateCompat(this.f575b, this.f576c, this.f577d, this.f578e, this.f579f, this.f580g, this.f581h, this.f582i, this.f574a, this.f583j, this.f584k);
        }

        public c d(long j10) {
            this.f579f = j10;
            return this;
        }

        public c e(long j10) {
            this.f583j = j10;
            return this;
        }

        public c f(long j10) {
            this.f577d = j10;
            return this;
        }

        public c g(int i10, CharSequence charSequence) {
            this.f580g = i10;
            this.f581h = charSequence;
            return this;
        }

        public c h(CharSequence charSequence) {
            this.f581h = charSequence;
            return this;
        }

        public c i(Bundle bundle) {
            this.f584k = bundle;
            return this;
        }

        public c j(int i10, long j10, float f10) {
            return k(i10, j10, f10, SystemClock.elapsedRealtime());
        }

        public c k(int i10, long j10, float f10, long j11) {
            this.f575b = i10;
            this.f576c = j10;
            this.f582i = j11;
            this.f578e = f10;
            return this;
        }
    }

    @x0({x0.a.P})
    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    @x0({x0.a.P})
    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    @x0({x0.a.P})
    @Retention(RetentionPolicy.SOURCE)
    public @interface f {
    }

    @x0({x0.a.P})
    @Retention(RetentionPolicy.SOURCE)
    public @interface g {
    }

    @x0({x0.a.P})
    @Retention(RetentionPolicy.SOURCE)
    public @interface h {
    }

    public PlaybackStateCompat(int i10, long j10, long j11, float f10, long j12, int i11, CharSequence charSequence, long j13, List<CustomAction> list, long j14, Bundle bundle) {
        this.O = i10;
        this.P = j10;
        this.Q = j11;
        this.R = f10;
        this.S = j12;
        this.T = i11;
        this.U = charSequence;
        this.V = j13;
        this.W = new ArrayList(list);
        this.X = j14;
        this.Y = bundle;
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.O = parcel.readInt();
        this.P = parcel.readLong();
        this.R = parcel.readFloat();
        this.V = parcel.readLong();
        this.Q = parcel.readLong();
        this.S = parcel.readLong();
        this.U = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.W = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.X = parcel.readLong();
        this.Y = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.T = parcel.readInt();
    }

    public static PlaybackStateCompat a(Object obj) {
        Object obj2 = obj;
        ArrayList arrayList = null;
        if (obj2 == null) {
            return null;
        }
        List<Object> d10 = o.d(obj);
        if (d10 != null) {
            arrayList = new ArrayList(d10.size());
            for (Object a10 : d10) {
                arrayList.add(CustomAction.a(a10));
            }
        }
        Bundle a11 = p.a(obj);
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(o.i(obj), o.h(obj), o.c(obj), o.g(obj), o.a(obj), 0, o.e(obj), o.f(obj), arrayList, o.b(obj), a11);
        playbackStateCompat.Z = obj2;
        return playbackStateCompat;
    }

    public static int r(long j10) {
        if (j10 == 4) {
            return 126;
        }
        if (j10 == 2) {
            return 127;
        }
        if (j10 == 32) {
            return 87;
        }
        if (j10 == 16) {
            return 88;
        }
        if (j10 == 1) {
            return 86;
        }
        if (j10 == 64) {
            return 90;
        }
        if (j10 == 8) {
            return 89;
        }
        return j10 == 512 ? 85 : 0;
    }

    public long b() {
        return this.S;
    }

    public long c() {
        return this.X;
    }

    public long d() {
        return this.Q;
    }

    public int describeContents() {
        return 0;
    }

    @x0({x0.a.P})
    public long e(Long l10) {
        return Math.max(0, this.P + ((long) (this.R * ((float) (l10 != null ? l10.longValue() : SystemClock.elapsedRealtime() - this.V)))));
    }

    public List<CustomAction> f() {
        return this.W;
    }

    public int g() {
        return this.T;
    }

    public CharSequence h() {
        return this.U;
    }

    @o0
    public Bundle j() {
        return this.Y;
    }

    public long l() {
        return this.V;
    }

    public float n() {
        return this.R;
    }

    public Object o() {
        if (this.Z == null) {
            ArrayList arrayList = null;
            if (this.W != null) {
                arrayList = new ArrayList(this.W.size());
                for (CustomAction c10 : this.W) {
                    arrayList.add(c10.c());
                }
            }
            int i10 = this.O;
            long j10 = this.P;
            long j11 = this.Q;
            float f10 = this.R;
            long j12 = this.S;
            CharSequence charSequence = this.U;
            long j13 = this.V;
            this.Z = p.b(i10, j10, j11, f10, j12, charSequence, j13, arrayList, this.X, this.Y);
        }
        return this.Z;
    }

    public long p() {
        return this.P;
    }

    public int q() {
        return this.O;
    }

    public String toString() {
        return "PlaybackState {" + "state=" + this.O + ", position=" + this.P + ", buffered position=" + this.Q + ", speed=" + this.R + ", updated=" + this.V + ", actions=" + this.S + ", error code=" + this.T + ", error message=" + this.U + ", custom actions=" + this.W + ", active item id=" + this.X + p7.a.f11639j;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.O);
        parcel.writeLong(this.P);
        parcel.writeFloat(this.R);
        parcel.writeLong(this.V);
        parcel.writeLong(this.Q);
        parcel.writeLong(this.S);
        TextUtils.writeToParcel(this.U, parcel, i10);
        parcel.writeTypedList(this.W);
        parcel.writeLong(this.X);
        parcel.writeBundle(this.Y);
        parcel.writeInt(this.T);
    }
}
