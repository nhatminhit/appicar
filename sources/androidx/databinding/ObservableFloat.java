package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public class ObservableFloat extends b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableFloat> CREATOR = new a();
    public static final long Q = 1;
    public float P;

    public class a implements Parcelable.Creator<ObservableFloat> {
        /* renamed from: a */
        public ObservableFloat createFromParcel(Parcel parcel) {
            return new ObservableFloat(parcel.readFloat());
        }

        /* renamed from: b */
        public ObservableFloat[] newArray(int i10) {
            return new ObservableFloat[i10];
        }
    }

    public ObservableFloat() {
    }

    public ObservableFloat(float f10) {
        this.P = f10;
    }

    public ObservableFloat(u... uVarArr) {
        super(uVarArr);
    }

    public int describeContents() {
        return 0;
    }

    public float e() {
        return this.P;
    }

    public void f(float f10) {
        if (f10 != this.P) {
            this.P = f10;
            c();
        }
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.P);
    }
}
