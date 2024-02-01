package androidx.customview.view;

import android.os.Parcel;
import android.os.Parcelable;
import d.m0;
import d.o0;

public abstract class AbsSavedState implements Parcelable {
    public static final Parcelable.Creator<AbsSavedState> CREATOR = new a();
    public static final AbsSavedState P = new AbsSavedState() {
    };
    public final Parcelable O;

    public static class a implements Parcelable.ClassLoaderCreator<AbsSavedState> {
        /* renamed from: a */
        public AbsSavedState createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, (ClassLoader) null);
        }

        /* renamed from: b */
        public AbsSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbsSavedState.P;
            }
            throw new IllegalStateException("superState must be null");
        }

        /* renamed from: c */
        public AbsSavedState[] newArray(int i10) {
            return new AbsSavedState[i10];
        }
    }

    public AbsSavedState() {
        this.O = null;
    }

    public AbsSavedState(@m0 Parcel parcel) {
        this(parcel, (ClassLoader) null);
    }

    public AbsSavedState(@m0 Parcel parcel, @o0 ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.O = readParcelable == null ? P : readParcelable;
    }

    public AbsSavedState(@m0 Parcelable parcelable) {
        if (parcelable != null) {
            this.O = parcelable == P ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    @o0
    public final Parcelable a() {
        return this.O;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.O, i10);
    }
}
