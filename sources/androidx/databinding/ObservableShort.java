package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public class ObservableShort extends b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableShort> CREATOR = new a();
    public static final long Q = 1;
    public short P;

    public class a implements Parcelable.Creator<ObservableShort> {
        /* renamed from: a */
        public ObservableShort createFromParcel(Parcel parcel) {
            return new ObservableShort((short) parcel.readInt());
        }

        /* renamed from: b */
        public ObservableShort[] newArray(int i10) {
            return new ObservableShort[i10];
        }
    }

    public ObservableShort() {
    }

    public ObservableShort(short s10) {
        this.P = s10;
    }

    public ObservableShort(u... uVarArr) {
        super(uVarArr);
    }

    public int describeContents() {
        return 0;
    }

    public short e() {
        return this.P;
    }

    public void f(short s10) {
        if (s10 != this.P) {
            this.P = s10;
            c();
        }
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.P);
    }
}
