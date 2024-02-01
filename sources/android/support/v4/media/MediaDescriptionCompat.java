package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.c;
import android.support.v4.media.d;
import android.text.TextUtils;
import d.o0;
import d.x0;

public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();
    public static final String X = "android.media.extra.BT_FOLDER_TYPE";
    public static final long Y = 0;
    public static final long Z = 1;

    /* renamed from: a0  reason: collision with root package name */
    public static final long f343a0 = 2;

    /* renamed from: b0  reason: collision with root package name */
    public static final long f344b0 = 3;

    /* renamed from: c0  reason: collision with root package name */
    public static final long f345c0 = 4;

    /* renamed from: d0  reason: collision with root package name */
    public static final long f346d0 = 5;

    /* renamed from: e0  reason: collision with root package name */
    public static final long f347e0 = 6;

    /* renamed from: f0  reason: collision with root package name */
    public static final String f348f0 = "android.media.extra.DOWNLOAD_STATUS";

    /* renamed from: g0  reason: collision with root package name */
    public static final long f349g0 = 0;

    /* renamed from: h0  reason: collision with root package name */
    public static final long f350h0 = 1;

    /* renamed from: i0  reason: collision with root package name */
    public static final long f351i0 = 2;
    @x0({x0.a.P})

    /* renamed from: j0  reason: collision with root package name */
    public static final String f352j0 = "android.support.v4.media.description.MEDIA_URI";
    @x0({x0.a.P})

    /* renamed from: k0  reason: collision with root package name */
    public static final String f353k0 = "android.support.v4.media.description.NULL_BUNDLE_FLAG";
    public final String O;
    public final CharSequence P;
    public final CharSequence Q;
    public final CharSequence R;
    public final Bitmap S;
    public final Uri T;
    public final Bundle U;
    public final Uri V;
    public Object W;

    public static class a implements Parcelable.Creator<MediaDescriptionCompat> {
        /* renamed from: a */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.a(c.a(parcel));
        }

        /* renamed from: b */
        public MediaDescriptionCompat[] newArray(int i10) {
            return new MediaDescriptionCompat[i10];
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public String f354a;

        /* renamed from: b  reason: collision with root package name */
        public CharSequence f355b;

        /* renamed from: c  reason: collision with root package name */
        public CharSequence f356c;

        /* renamed from: d  reason: collision with root package name */
        public CharSequence f357d;

        /* renamed from: e  reason: collision with root package name */
        public Bitmap f358e;

        /* renamed from: f  reason: collision with root package name */
        public Uri f359f;

        /* renamed from: g  reason: collision with root package name */
        public Bundle f360g;

        /* renamed from: h  reason: collision with root package name */
        public Uri f361h;

        public MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.f354a, this.f355b, this.f356c, this.f357d, this.f358e, this.f359f, this.f360g, this.f361h);
        }

        public b b(@o0 CharSequence charSequence) {
            this.f357d = charSequence;
            return this;
        }

        public b c(@o0 Bundle bundle) {
            this.f360g = bundle;
            return this;
        }

        public b d(@o0 Bitmap bitmap) {
            this.f358e = bitmap;
            return this;
        }

        public b e(@o0 Uri uri) {
            this.f359f = uri;
            return this;
        }

        public b f(@o0 String str) {
            this.f354a = str;
            return this;
        }

        public b g(@o0 Uri uri) {
            this.f361h = uri;
            return this;
        }

        public b h(@o0 CharSequence charSequence) {
            this.f356c = charSequence;
            return this;
        }

        public b i(@o0 CharSequence charSequence) {
            this.f355b = charSequence;
            return this;
        }
    }

    public MediaDescriptionCompat(Parcel parcel) {
        this.O = parcel.readString();
        this.P = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.Q = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.R = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.S = (Bitmap) parcel.readParcelable(classLoader);
        this.T = (Uri) parcel.readParcelable(classLoader);
        this.U = parcel.readBundle(classLoader);
        this.V = (Uri) parcel.readParcelable(classLoader);
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.O = str;
        this.P = charSequence;
        this.Q = charSequence2;
        this.R = charSequence3;
        this.S = bitmap;
        this.T = uri;
        this.U = bundle;
        this.V = uri2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0067  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.support.v4.media.MediaDescriptionCompat a(java.lang.Object r8) {
        /*
            r0 = 0
            if (r8 == 0) goto L_0x0074
            android.support.v4.media.MediaDescriptionCompat$b r1 = new android.support.v4.media.MediaDescriptionCompat$b
            r1.<init>()
            java.lang.String r2 = android.support.v4.media.c.f(r8)
            r1.f(r2)
            java.lang.CharSequence r2 = android.support.v4.media.c.h(r8)
            r1.i(r2)
            java.lang.CharSequence r2 = android.support.v4.media.c.g(r8)
            r1.h(r2)
            java.lang.CharSequence r2 = android.support.v4.media.c.b(r8)
            r1.b(r2)
            android.graphics.Bitmap r2 = android.support.v4.media.c.d(r8)
            r1.d(r2)
            android.net.Uri r2 = android.support.v4.media.c.e(r8)
            r1.e(r2)
            android.os.Bundle r2 = android.support.v4.media.c.c(r8)
            java.lang.String r3 = "android.support.v4.media.description.MEDIA_URI"
            if (r2 == 0) goto L_0x0044
            android.support.v4.media.session.MediaSessionCompat.b(r2)
            android.os.Parcelable r4 = r2.getParcelable(r3)
            android.net.Uri r4 = (android.net.Uri) r4
            goto L_0x0045
        L_0x0044:
            r4 = r0
        L_0x0045:
            if (r4 == 0) goto L_0x005d
            java.lang.String r5 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r6 = r2.containsKey(r5)
            if (r6 == 0) goto L_0x0057
            int r6 = r2.size()
            r7 = 2
            if (r6 != r7) goto L_0x0057
            goto L_0x005e
        L_0x0057:
            r2.remove(r3)
            r2.remove(r5)
        L_0x005d:
            r0 = r2
        L_0x005e:
            r1.c(r0)
            if (r4 == 0) goto L_0x0067
            r1.g(r4)
            goto L_0x006e
        L_0x0067:
            android.net.Uri r0 = android.support.v4.media.d.a(r8)
            r1.g(r0)
        L_0x006e:
            android.support.v4.media.MediaDescriptionCompat r0 = r1.a()
            r0.W = r8
        L_0x0074:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    @o0
    public CharSequence b() {
        return this.R;
    }

    @o0
    public Bundle c() {
        return this.U;
    }

    @o0
    public Bitmap d() {
        return this.S;
    }

    public int describeContents() {
        return 0;
    }

    @o0
    public Uri e() {
        return this.T;
    }

    public Object f() {
        Object obj = this.W;
        if (obj != null) {
            return obj;
        }
        Object b10 = c.a.b();
        c.a.g(b10, this.O);
        c.a.i(b10, this.P);
        c.a.h(b10, this.Q);
        c.a.c(b10, this.R);
        c.a.e(b10, this.S);
        c.a.f(b10, this.T);
        c.a.d(b10, this.U);
        d.a.a(b10, this.V);
        Object a10 = c.a.a(b10);
        this.W = a10;
        return a10;
    }

    @o0
    public String g() {
        return this.O;
    }

    @o0
    public Uri h() {
        return this.V;
    }

    @o0
    public CharSequence j() {
        return this.Q;
    }

    @o0
    public CharSequence l() {
        return this.P;
    }

    public String toString() {
        return this.P + ", " + this.Q + ", " + this.R;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        c.i(f(), parcel, i10);
    }
}
