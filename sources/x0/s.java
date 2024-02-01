package x0;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
public final class s {

    public static class a<T> implements Parcelable.ClassLoaderCreator<T> {

        /* renamed from: a  reason: collision with root package name */
        public final t<T> f15019a;

        public a(t<T> tVar) {
            this.f15019a = tVar;
        }

        public T createFromParcel(Parcel parcel) {
            return this.f15019a.createFromParcel(parcel, (ClassLoader) null);
        }

        public T createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return this.f15019a.createFromParcel(parcel, classLoader);
        }

        public T[] newArray(int i10) {
            return this.f15019a.newArray(i10);
        }
    }

    @Deprecated
    public static <T> Parcelable.Creator<T> a(t<T> tVar) {
        return new a(tVar);
    }
}
