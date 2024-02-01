package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public class ObservableDouble extends b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableDouble> CREATOR = new a();
    public static final long Q = 1;
    public double P;

    public class a implements Parcelable.Creator<ObservableDouble> {
        /* renamed from: a */
        public ObservableDouble createFromParcel(Parcel parcel) {
            return new ObservableDouble(parcel.readDouble());
        }

        /* renamed from: b */
        public ObservableDouble[] newArray(int i10) {
            return new ObservableDouble[i10];
        }
    }

    public ObservableDouble() {
    }

    public ObservableDouble(double d10) {
        this.P = d10;
    }

    public ObservableDouble(u... uVarArr) {
        super(uVarArr);
    }

    public int describeContents() {
        return 0;
    }

    public double e() {
        return this.P;
    }

    public void f(double d10) {
        if (d10 != this.P) {
            this.P = d10;
            c();
        }
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeDouble(this.P);
    }
}
