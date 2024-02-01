package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import d.x0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Set;

public final class MediaMetadataCompat implements Parcelable {
    public static final int A0 = 3;
    public static final androidx.collection.a<String, Integer> B0;
    public static final String[] C0 = {S, T, V, f368g0, X, W, Y};
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR = new a();
    public static final String[] D0 = {f378q0, f369h0, f371j0};
    public static final String[] E0 = {f379r0, f370i0, f372k0};
    public static final String R = "MediaMetadata";
    public static final String S = "android.media.metadata.TITLE";
    public static final String T = "android.media.metadata.ARTIST";
    public static final String U = "android.media.metadata.DURATION";
    public static final String V = "android.media.metadata.ALBUM";
    public static final String W = "android.media.metadata.AUTHOR";
    public static final String X = "android.media.metadata.WRITER";
    public static final String Y = "android.media.metadata.COMPOSER";
    public static final String Z = "android.media.metadata.COMPILATION";

    /* renamed from: a0  reason: collision with root package name */
    public static final String f362a0 = "android.media.metadata.DATE";

    /* renamed from: b0  reason: collision with root package name */
    public static final String f363b0 = "android.media.metadata.YEAR";

    /* renamed from: c0  reason: collision with root package name */
    public static final String f364c0 = "android.media.metadata.GENRE";

    /* renamed from: d0  reason: collision with root package name */
    public static final String f365d0 = "android.media.metadata.TRACK_NUMBER";

    /* renamed from: e0  reason: collision with root package name */
    public static final String f366e0 = "android.media.metadata.NUM_TRACKS";

    /* renamed from: f0  reason: collision with root package name */
    public static final String f367f0 = "android.media.metadata.DISC_NUMBER";

    /* renamed from: g0  reason: collision with root package name */
    public static final String f368g0 = "android.media.metadata.ALBUM_ARTIST";

    /* renamed from: h0  reason: collision with root package name */
    public static final String f369h0 = "android.media.metadata.ART";

    /* renamed from: i0  reason: collision with root package name */
    public static final String f370i0 = "android.media.metadata.ART_URI";

    /* renamed from: j0  reason: collision with root package name */
    public static final String f371j0 = "android.media.metadata.ALBUM_ART";

    /* renamed from: k0  reason: collision with root package name */
    public static final String f372k0 = "android.media.metadata.ALBUM_ART_URI";

    /* renamed from: l0  reason: collision with root package name */
    public static final String f373l0 = "android.media.metadata.USER_RATING";

    /* renamed from: m0  reason: collision with root package name */
    public static final String f374m0 = "android.media.metadata.RATING";

    /* renamed from: n0  reason: collision with root package name */
    public static final String f375n0 = "android.media.metadata.DISPLAY_TITLE";

    /* renamed from: o0  reason: collision with root package name */
    public static final String f376o0 = "android.media.metadata.DISPLAY_SUBTITLE";

    /* renamed from: p0  reason: collision with root package name */
    public static final String f377p0 = "android.media.metadata.DISPLAY_DESCRIPTION";

    /* renamed from: q0  reason: collision with root package name */
    public static final String f378q0 = "android.media.metadata.DISPLAY_ICON";

    /* renamed from: r0  reason: collision with root package name */
    public static final String f379r0 = "android.media.metadata.DISPLAY_ICON_URI";

    /* renamed from: s0  reason: collision with root package name */
    public static final String f380s0 = "android.media.metadata.MEDIA_ID";

    /* renamed from: t0  reason: collision with root package name */
    public static final String f381t0 = "android.media.metadata.MEDIA_URI";

    /* renamed from: u0  reason: collision with root package name */
    public static final String f382u0 = "android.media.metadata.BT_FOLDER_TYPE";

    /* renamed from: v0  reason: collision with root package name */
    public static final String f383v0 = "android.media.metadata.ADVERTISEMENT";

    /* renamed from: w0  reason: collision with root package name */
    public static final String f384w0 = "android.media.metadata.DOWNLOAD_STATUS";

    /* renamed from: x0  reason: collision with root package name */
    public static final int f385x0 = 0;

    /* renamed from: y0  reason: collision with root package name */
    public static final int f386y0 = 1;

    /* renamed from: z0  reason: collision with root package name */
    public static final int f387z0 = 2;
    public final Bundle O;
    public Object P;
    public MediaDescriptionCompat Q;

    public static class a implements Parcelable.Creator<MediaMetadataCompat> {
        /* renamed from: a */
        public MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        /* renamed from: b */
        public MediaMetadataCompat[] newArray(int i10) {
            return new MediaMetadataCompat[i10];
        }
    }

    @x0({x0.a.P})
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final Bundle f388a;

        public c() {
            this.f388a = new Bundle();
        }

        public c(MediaMetadataCompat mediaMetadataCompat) {
            Bundle bundle = new Bundle(mediaMetadataCompat.O);
            this.f388a = bundle;
            MediaSessionCompat.b(bundle);
        }

        @x0({x0.a.P})
        public c(MediaMetadataCompat mediaMetadataCompat, int i10) {
            this(mediaMetadataCompat);
            for (String next : this.f388a.keySet()) {
                Object obj = this.f388a.get(next);
                if (obj instanceof Bitmap) {
                    Bitmap bitmap = (Bitmap) obj;
                    if (bitmap.getHeight() > i10 || bitmap.getWidth() > i10) {
                        b(next, g(bitmap, i10));
                    }
                }
            }
        }

        public MediaMetadataCompat a() {
            return new MediaMetadataCompat(this.f388a);
        }

        public c b(String str, Bitmap bitmap) {
            androidx.collection.a<String, Integer> aVar = MediaMetadataCompat.B0;
            if (!aVar.containsKey(str) || aVar.get(str).intValue() == 2) {
                this.f388a.putParcelable(str, bitmap);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a Bitmap");
        }

        public c c(String str, long j10) {
            androidx.collection.a<String, Integer> aVar = MediaMetadataCompat.B0;
            if (!aVar.containsKey(str) || aVar.get(str).intValue() == 0) {
                this.f388a.putLong(str, j10);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a long");
        }

        public c d(String str, RatingCompat ratingCompat) {
            androidx.collection.a<String, Integer> aVar = MediaMetadataCompat.B0;
            if (!aVar.containsKey(str) || aVar.get(str).intValue() == 3) {
                this.f388a.putParcelable(str, (Parcelable) ratingCompat.c());
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a Rating");
        }

        public c e(String str, String str2) {
            androidx.collection.a<String, Integer> aVar = MediaMetadataCompat.B0;
            if (!aVar.containsKey(str) || aVar.get(str).intValue() == 1) {
                this.f388a.putCharSequence(str, str2);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a String");
        }

        public c f(String str, CharSequence charSequence) {
            androidx.collection.a<String, Integer> aVar = MediaMetadataCompat.B0;
            if (!aVar.containsKey(str) || aVar.get(str).intValue() == 1) {
                this.f388a.putCharSequence(str, charSequence);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a CharSequence");
        }

        public final Bitmap g(Bitmap bitmap, int i10) {
            float f10 = (float) i10;
            float min = Math.min(f10 / ((float) bitmap.getWidth()), f10 / ((float) bitmap.getHeight()));
            return Bitmap.createScaledBitmap(bitmap, (int) (((float) bitmap.getWidth()) * min), (int) (((float) bitmap.getHeight()) * min), true);
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

    static {
        androidx.collection.a<String, Integer> aVar = new androidx.collection.a<>();
        B0 = aVar;
        aVar.put(S, 1);
        aVar.put(T, 1);
        aVar.put(U, 0);
        aVar.put(V, 1);
        aVar.put(W, 1);
        aVar.put(X, 1);
        aVar.put(Y, 1);
        aVar.put(Z, 1);
        aVar.put(f362a0, 1);
        aVar.put(f363b0, 0);
        aVar.put(f364c0, 1);
        aVar.put(f365d0, 0);
        aVar.put(f366e0, 0);
        aVar.put(f367f0, 0);
        aVar.put(f368g0, 1);
        aVar.put(f369h0, 2);
        aVar.put(f370i0, 1);
        aVar.put(f371j0, 2);
        aVar.put(f372k0, 1);
        aVar.put(f373l0, 3);
        aVar.put(f374m0, 3);
        aVar.put(f375n0, 1);
        aVar.put(f376o0, 1);
        aVar.put(f377p0, 1);
        aVar.put(f378q0, 2);
        aVar.put(f379r0, 1);
        aVar.put(f380s0, 1);
        aVar.put(f382u0, 0);
        aVar.put(f381t0, 1);
        aVar.put(f383v0, 0);
        aVar.put(f384w0, 0);
    }

    public MediaMetadataCompat(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.O = bundle2;
        MediaSessionCompat.b(bundle2);
    }

    public MediaMetadataCompat(Parcel parcel) {
        this.O = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    public static MediaMetadataCompat b(Object obj) {
        if (obj == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        e.g(obj, obtain, 0);
        obtain.setDataPosition(0);
        MediaMetadataCompat createFromParcel = CREATOR.createFromParcel(obtain);
        obtain.recycle();
        createFromParcel.P = obj;
        return createFromParcel;
    }

    public boolean a(String str) {
        return this.O.containsKey(str);
    }

    public Bitmap c(String str) {
        try {
            return (Bitmap) this.O.getParcelable(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public Bundle d() {
        return new Bundle(this.O);
    }

    public int describeContents() {
        return 0;
    }

    public MediaDescriptionCompat e() {
        Uri uri;
        Bitmap bitmap;
        Uri uri2;
        MediaDescriptionCompat mediaDescriptionCompat = this.Q;
        if (mediaDescriptionCompat != null) {
            return mediaDescriptionCompat;
        }
        String j10 = j(f380s0);
        CharSequence[] charSequenceArr = new CharSequence[3];
        CharSequence l10 = l(f375n0);
        if (TextUtils.isEmpty(l10)) {
            int i10 = 0;
            int i11 = 0;
            while (i10 < 3) {
                String[] strArr = C0;
                if (i11 >= strArr.length) {
                    break;
                }
                int i12 = i11 + 1;
                CharSequence l11 = l(strArr[i11]);
                if (!TextUtils.isEmpty(l11)) {
                    charSequenceArr[i10] = l11;
                    i10++;
                }
                i11 = i12;
            }
        } else {
            charSequenceArr[0] = l10;
            charSequenceArr[1] = l(f376o0);
            charSequenceArr[2] = l(f377p0);
        }
        int i13 = 0;
        while (true) {
            String[] strArr2 = D0;
            uri = null;
            if (i13 >= strArr2.length) {
                bitmap = null;
                break;
            }
            bitmap = c(strArr2[i13]);
            if (bitmap != null) {
                break;
            }
            i13++;
        }
        int i14 = 0;
        while (true) {
            String[] strArr3 = E0;
            if (i14 >= strArr3.length) {
                uri2 = null;
                break;
            }
            String j11 = j(strArr3[i14]);
            if (!TextUtils.isEmpty(j11)) {
                uri2 = Uri.parse(j11);
                break;
            }
            i14++;
        }
        String j12 = j(f381t0);
        if (!TextUtils.isEmpty(j12)) {
            uri = Uri.parse(j12);
        }
        MediaDescriptionCompat.b bVar = new MediaDescriptionCompat.b();
        bVar.f(j10);
        bVar.i(charSequenceArr[0]);
        bVar.h(charSequenceArr[1]);
        bVar.b(charSequenceArr[2]);
        bVar.d(bitmap);
        bVar.e(uri2);
        bVar.g(uri);
        Bundle bundle = new Bundle();
        if (this.O.containsKey(f382u0)) {
            bundle.putLong(MediaDescriptionCompat.X, f(f382u0));
        }
        if (this.O.containsKey(f384w0)) {
            bundle.putLong(MediaDescriptionCompat.f348f0, f(f384w0));
        }
        if (!bundle.isEmpty()) {
            bVar.c(bundle);
        }
        MediaDescriptionCompat a10 = bVar.a();
        this.Q = a10;
        return a10;
    }

    public long f(String str) {
        return this.O.getLong(str, 0);
    }

    public Object g() {
        if (this.P == null) {
            Parcel obtain = Parcel.obtain();
            writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            this.P = e.a(obtain);
            obtain.recycle();
        }
        return this.P;
    }

    public RatingCompat h(String str) {
        try {
            return RatingCompat.a(this.O.getParcelable(str));
        } catch (Exception unused) {
            return null;
        }
    }

    public String j(String str) {
        CharSequence charSequence = this.O.getCharSequence(str);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public CharSequence l(String str) {
        return this.O.getCharSequence(str);
    }

    public Set<String> n() {
        return this.O.keySet();
    }

    public int o() {
        return this.O.size();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeBundle(this.O);
    }
}
