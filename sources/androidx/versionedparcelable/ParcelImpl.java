package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import d.x0;
import k3.f;
import k3.h;

@x0({x0.a.O})
@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new a();
    public final h O;

    public static class a implements Parcelable.Creator<ParcelImpl> {
        /* renamed from: a */
        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        /* renamed from: b */
        public ParcelImpl[] newArray(int i10) {
            return new ParcelImpl[i10];
        }
    }

    public ParcelImpl(Parcel parcel) {
        this.O = new f(parcel).g0();
    }

    public ParcelImpl(h hVar) {
        this.O = hVar;
    }

    public <T extends h> T a() {
        return this.O;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        new f(parcel).l1(this.O);
    }
}
