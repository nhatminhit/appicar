package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public class ObservableLong extends b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableLong> CREATOR = new a();
    public static final long Q = 1;
    public long P;

    public class a implements Parcelable.Creator<ObservableLong> {
        /* renamed from: a */
        public ObservableLong createFromParcel(Parcel parcel) {
            return new ObservableLong(parcel.readLong());
        }

        /* renamed from: b */
        public ObservableLong[] newArray(int i10) {
            return new ObservableLong[i10];
        }
    }

    public ObservableLong() {
    }

    public ObservableLong(long j10) {
        this.P = j10;
    }

    public ObservableLong(u... uVarArr) {
        super(uVarArr);
    }

    public int describeContents() {
        return 0;
    }

    public long e() {
        return this.P;
    }

    public void f(long j10) {
        if (j10 != this.P) {
            this.P = j10;
            c();
        }
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.P);
    }
}
