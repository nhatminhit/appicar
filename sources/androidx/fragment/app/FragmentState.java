package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import d.m0;

@SuppressLint({"BanParcelableUsage"})
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new a();
    public final String O;
    public final String P;
    public final boolean Q;
    public final int R;
    public final int S;
    public final String T;
    public final boolean U;
    public final boolean V;
    public final boolean W;
    public final Bundle X;
    public final boolean Y;
    public final int Z;

    /* renamed from: a0  reason: collision with root package name */
    public Bundle f2556a0;

    public class a implements Parcelable.Creator<FragmentState> {
        /* renamed from: a */
        public FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        /* renamed from: b */
        public FragmentState[] newArray(int i10) {
            return new FragmentState[i10];
        }
    }

    public FragmentState(Parcel parcel) {
        this.O = parcel.readString();
        this.P = parcel.readString();
        boolean z10 = true;
        this.Q = parcel.readInt() != 0;
        this.R = parcel.readInt();
        this.S = parcel.readInt();
        this.T = parcel.readString();
        this.U = parcel.readInt() != 0;
        this.V = parcel.readInt() != 0;
        this.W = parcel.readInt() != 0;
        this.X = parcel.readBundle();
        this.Y = parcel.readInt() == 0 ? false : z10;
        this.f2556a0 = parcel.readBundle();
        this.Z = parcel.readInt();
    }

    public FragmentState(Fragment fragment) {
        this.O = fragment.getClass().getName();
        this.P = fragment.T;
        this.Q = fragment.f2441b0;
        this.R = fragment.f2450k0;
        this.S = fragment.f2451l0;
        this.T = fragment.f2452m0;
        this.U = fragment.f2455p0;
        this.V = fragment.f2440a0;
        this.W = fragment.f2454o0;
        this.X = fragment.U;
        this.Y = fragment.f2453n0;
        this.Z = fragment.F0.ordinal();
    }

    public int describeContents() {
        return 0;
    }

    @m0
    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.O);
        sb2.append(" (");
        sb2.append(this.P);
        sb2.append(")}:");
        if (this.Q) {
            sb2.append(" fromLayout");
        }
        if (this.S != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.S));
        }
        String str = this.T;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(this.T);
        }
        if (this.U) {
            sb2.append(" retainInstance");
        }
        if (this.V) {
            sb2.append(" removing");
        }
        if (this.W) {
            sb2.append(" detached");
        }
        if (this.Y) {
            sb2.append(" hidden");
        }
        return sb2.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.O);
        parcel.writeString(this.P);
        parcel.writeInt(this.Q ? 1 : 0);
        parcel.writeInt(this.R);
        parcel.writeInt(this.S);
        parcel.writeString(this.T);
        parcel.writeInt(this.U ? 1 : 0);
        parcel.writeInt(this.V ? 1 : 0);
        parcel.writeInt(this.W ? 1 : 0);
        parcel.writeBundle(this.X);
        parcel.writeInt(this.Y ? 1 : 0);
        parcel.writeBundle(this.f2556a0);
        parcel.writeInt(this.Z);
    }
}
