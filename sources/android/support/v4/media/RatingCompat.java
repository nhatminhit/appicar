package android.support.v4.media;

import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import d.x0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a();
    public static final String R = "Rating";
    public static final int S = 0;
    public static final int T = 1;
    public static final int U = 2;
    public static final int V = 3;
    public static final int W = 4;
    public static final int X = 5;
    public static final int Y = 6;
    public static final float Z = -1.0f;
    public final int O;
    public final float P;
    public Object Q;

    public static class a implements Parcelable.Creator<RatingCompat> {
        /* renamed from: a */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        /* renamed from: b */
        public RatingCompat[] newArray(int i10) {
            return new RatingCompat[i10];
        }
    }

    @x0({x0.a.P})
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    @x0({x0.a.P})
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    public RatingCompat(int i10, float f10) {
        this.O = i10;
        this.P = f10;
    }

    public static RatingCompat a(Object obj) {
        RatingCompat ratingCompat = null;
        if (obj != null) {
            Rating rating = (Rating) obj;
            int ratingStyle = rating.getRatingStyle();
            if (rating.isRated()) {
                switch (ratingStyle) {
                    case 1:
                        ratingCompat = j(rating.hasHeart());
                        break;
                    case 2:
                        ratingCompat = o(rating.isThumbUp());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        ratingCompat = n(ratingStyle, rating.getStarRating());
                        break;
                    case 6:
                        ratingCompat = l(rating.getPercentRating());
                        break;
                    default:
                        return null;
                }
            } else {
                ratingCompat = p(ratingStyle);
            }
            ratingCompat.Q = obj;
        }
        return ratingCompat;
    }

    public static RatingCompat j(boolean z10) {
        return new RatingCompat(1, z10 ? 1.0f : 0.0f);
    }

    public static RatingCompat l(float f10) {
        if (f10 < 0.0f || f10 > 100.0f) {
            return null;
        }
        return new RatingCompat(6, f10);
    }

    public static RatingCompat n(int i10, float f10) {
        float f11;
        if (i10 == 3) {
            f11 = 3.0f;
        } else if (i10 == 4) {
            f11 = 4.0f;
        } else if (i10 != 5) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Invalid rating style (");
            sb2.append(i10);
            sb2.append(") for a star rating");
            return null;
        } else {
            f11 = 5.0f;
        }
        if (f10 < 0.0f || f10 > f11) {
            return null;
        }
        return new RatingCompat(i10, f10);
    }

    public static RatingCompat o(boolean z10) {
        return new RatingCompat(2, z10 ? 1.0f : 0.0f);
    }

    public static RatingCompat p(int i10) {
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return new RatingCompat(i10, -1.0f);
            default:
                return null;
        }
    }

    public float b() {
        if (this.O != 6 || !g()) {
            return -1.0f;
        }
        return this.P;
    }

    public Object c() {
        Rating rating;
        if (this.Q == null) {
            if (g()) {
                int i10 = this.O;
                switch (i10) {
                    case 1:
                        rating = Rating.newHeartRating(f());
                        break;
                    case 2:
                        rating = Rating.newThumbRating(h());
                        break;
                    case 3:
                    case 4:
                    case 5:
                        rating = Rating.newStarRating(i10, e());
                        break;
                    case 6:
                        rating = Rating.newPercentageRating(b());
                        break;
                    default:
                        return null;
                }
            } else {
                rating = Rating.newUnratedRating(this.O);
            }
            this.Q = rating;
        }
        return this.Q;
    }

    public int d() {
        return this.O;
    }

    public int describeContents() {
        return this.O;
    }

    public float e() {
        int i10 = this.O;
        if ((i10 == 3 || i10 == 4 || i10 == 5) && g()) {
            return this.P;
        }
        return -1.0f;
    }

    public boolean f() {
        return this.O == 1 && this.P == 1.0f;
    }

    public boolean g() {
        return this.P >= 0.0f;
    }

    public boolean h() {
        return this.O == 2 && this.P == 1.0f;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Rating:style=");
        sb2.append(this.O);
        sb2.append(" rating=");
        float f10 = this.P;
        sb2.append(f10 < 0.0f ? "unrated" : String.valueOf(f10));
        return sb2.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.O);
        parcel.writeFloat(this.P);
    }
}
