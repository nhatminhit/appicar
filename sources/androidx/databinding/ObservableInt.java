package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public class ObservableInt extends b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableInt> CREATOR = new a();
    public static final long Q = 1;
    public int P;

    public class a implements Parcelable.Creator<ObservableInt> {
        /* renamed from: a */
        public ObservableInt createFromParcel(Parcel parcel) {
            return new ObservableInt(parcel.readInt());
        }

        /* renamed from: b */
        public ObservableInt[] newArray(int i10) {
            return new ObservableInt[i10];
        }
    }

    public ObservableInt() {
    }

    public ObservableInt(int i10) {
        this.P = i10;
    }

    public ObservableInt(u... uVarArr) {
        super(uVarArr);
    }

    public int describeContents() {
        return 0;
    }

    public int e() {
        return this.P;
    }

    public void f(int i10) {
        if (i10 != this.P) {
            this.P = i10;
            c();
        }
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.P);
    }
}
