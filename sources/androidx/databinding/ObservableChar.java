package androidx.databinding;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

public class ObservableChar extends b implements Parcelable, Serializable {
    public static final Parcelable.Creator<ObservableChar> CREATOR = new a();
    public static final long Q = 1;
    public char P;

    public class a implements Parcelable.Creator<ObservableChar> {
        /* renamed from: a */
        public ObservableChar createFromParcel(Parcel parcel) {
            return new ObservableChar((char) parcel.readInt());
        }

        /* renamed from: b */
        public ObservableChar[] newArray(int i10) {
            return new ObservableChar[i10];
        }
    }

    public ObservableChar() {
    }

    public ObservableChar(char c10) {
        this.P = c10;
    }

    public ObservableChar(u... uVarArr) {
        super(uVarArr);
    }

    public int describeContents() {
        return 0;
    }

    public char e() {
        return this.P;
    }

    public void f(char c10) {
        if (c10 != this.P) {
            this.P = c10;
            c();
        }
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.P);
    }
}
