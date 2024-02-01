package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public class ObservableByte extends b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableByte> CREATOR = new a();
    public static final long Q = 1;
    public byte P;

    public class a implements Parcelable.Creator<ObservableByte> {
        /* renamed from: a */
        public ObservableByte createFromParcel(Parcel parcel) {
            return new ObservableByte(parcel.readByte());
        }

        /* renamed from: b */
        public ObservableByte[] newArray(int i10) {
            return new ObservableByte[i10];
        }
    }

    public ObservableByte() {
    }

    public ObservableByte(byte b10) {
        this.P = b10;
    }

    public ObservableByte(u... uVarArr) {
        super(uVarArr);
    }

    public int describeContents() {
        return 0;
    }

    public byte e() {
        return this.P;
    }

    public void f(byte b10) {
        if (b10 != this.P) {
            this.P = b10;
            c();
        }
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByte(this.P);
    }
}
