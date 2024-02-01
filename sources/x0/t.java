package x0;

import android.os.Parcel;

@Deprecated
public interface t<T> {
    T createFromParcel(Parcel parcel, ClassLoader classLoader);

    T[] newArray(int i10);
}
