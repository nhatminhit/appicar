package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public class ObservableBoolean extends b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableBoolean> CREATOR = new a();
    public static final long Q = 1;
    public boolean P;

    public class a implements Parcelable.Creator<ObservableBoolean> {
        /* renamed from: a */
        public ObservableBoolean createFromParcel(Parcel parcel) {
            boolean z10 = true;
            if (parcel.readInt() != 1) {
                z10 = false;
            }
            return new ObservableBoolean(z10);
        }

        /* renamed from: b */
        public ObservableBoolean[] newArray(int i10) {
            return new ObservableBoolean[i10];
        }
    }

    public ObservableBoolean() {
    }

    public ObservableBoolean(boolean z10) {
        this.P = z10;
    }

    public ObservableBoolean(u... uVarArr) {
        super(uVarArr);
    }

    public int describeContents() {
        return 0;
    }

    public boolean e() {
        return this.P;
    }

    public void f(boolean z10) {
        if (z10 != this.P) {
            this.P = z10;
            c();
        }
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.P ? 1 : 0);
    }
}
