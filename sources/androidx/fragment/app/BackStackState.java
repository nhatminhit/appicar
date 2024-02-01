package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.u;
import androidx.lifecycle.p;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
final class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new a();

    /* renamed from: c0  reason: collision with root package name */
    public static final String f2415c0 = "FragmentManager";
    public final int[] O;
    public final ArrayList<String> P;
    public final int[] Q;
    public final int[] R;
    public final int S;
    public final String T;
    public final int U;
    public final int V;
    public final CharSequence W;
    public final int X;
    public final CharSequence Y;
    public final ArrayList<String> Z;

    /* renamed from: a0  reason: collision with root package name */
    public final ArrayList<String> f2416a0;

    /* renamed from: b0  reason: collision with root package name */
    public final boolean f2417b0;

    public class a implements Parcelable.Creator<BackStackState> {
        /* renamed from: a */
        public BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        /* renamed from: b */
        public BackStackState[] newArray(int i10) {
            return new BackStackState[i10];
        }
    }

    public BackStackState(Parcel parcel) {
        this.O = parcel.createIntArray();
        this.P = parcel.createStringArrayList();
        this.Q = parcel.createIntArray();
        this.R = parcel.createIntArray();
        this.S = parcel.readInt();
        this.T = parcel.readString();
        this.U = parcel.readInt();
        this.V = parcel.readInt();
        this.W = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.X = parcel.readInt();
        this.Y = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.Z = parcel.createStringArrayList();
        this.f2416a0 = parcel.createStringArrayList();
        this.f2417b0 = parcel.readInt() != 0;
    }

    public BackStackState(a aVar) {
        int size = aVar.f2690c.size();
        this.O = new int[(size * 5)];
        if (aVar.f2696i) {
            this.P = new ArrayList<>(size);
            this.Q = new int[size];
            this.R = new int[size];
            int i10 = 0;
            int i11 = 0;
            while (i10 < size) {
                u.a aVar2 = aVar.f2690c.get(i10);
                int i12 = i11 + 1;
                this.O[i11] = aVar2.f2707a;
                ArrayList<String> arrayList = this.P;
                Fragment fragment = aVar2.f2708b;
                arrayList.add(fragment != null ? fragment.T : null);
                int[] iArr = this.O;
                int i13 = i12 + 1;
                iArr[i12] = aVar2.f2709c;
                int i14 = i13 + 1;
                iArr[i13] = aVar2.f2710d;
                int i15 = i14 + 1;
                iArr[i14] = aVar2.f2711e;
                iArr[i15] = aVar2.f2712f;
                this.Q[i10] = aVar2.f2713g.ordinal();
                this.R[i10] = aVar2.f2714h.ordinal();
                i10++;
                i11 = i15 + 1;
            }
            this.S = aVar.f2695h;
            this.T = aVar.f2698k;
            this.U = aVar.N;
            this.V = aVar.f2699l;
            this.W = aVar.f2700m;
            this.X = aVar.f2701n;
            this.Y = aVar.f2702o;
            this.Z = aVar.f2703p;
            this.f2416a0 = aVar.f2704q;
            this.f2417b0 = aVar.f2705r;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public a a(FragmentManager fragmentManager) {
        a aVar = new a(fragmentManager);
        int i10 = 0;
        int i11 = 0;
        while (i10 < this.O.length) {
            u.a aVar2 = new u.a();
            int i12 = i10 + 1;
            aVar2.f2707a = this.O[i10];
            if (FragmentManager.T0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Instantiate ");
                sb2.append(aVar);
                sb2.append(" op #");
                sb2.append(i11);
                sb2.append(" base fragment #");
                sb2.append(this.O[i12]);
            }
            String str = this.P.get(i11);
            aVar2.f2708b = str != null ? fragmentManager.n0(str) : null;
            aVar2.f2713g = p.b.values()[this.Q[i11]];
            aVar2.f2714h = p.b.values()[this.R[i11]];
            int[] iArr = this.O;
            int i13 = i12 + 1;
            int i14 = iArr[i12];
            aVar2.f2709c = i14;
            int i15 = i13 + 1;
            int i16 = iArr[i13];
            aVar2.f2710d = i16;
            int i17 = i15 + 1;
            int i18 = iArr[i15];
            aVar2.f2711e = i18;
            int i19 = iArr[i17];
            aVar2.f2712f = i19;
            aVar.f2691d = i14;
            aVar.f2692e = i16;
            aVar.f2693f = i18;
            aVar.f2694g = i19;
            aVar.i(aVar2);
            i11++;
            i10 = i17 + 1;
        }
        aVar.f2695h = this.S;
        aVar.f2698k = this.T;
        aVar.N = this.U;
        aVar.f2696i = true;
        aVar.f2699l = this.V;
        aVar.f2700m = this.W;
        aVar.f2701n = this.X;
        aVar.f2702o = this.Y;
        aVar.f2703p = this.Z;
        aVar.f2704q = this.f2416a0;
        aVar.f2705r = this.f2417b0;
        aVar.Q(1);
        return aVar;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.O);
        parcel.writeStringList(this.P);
        parcel.writeIntArray(this.Q);
        parcel.writeIntArray(this.R);
        parcel.writeInt(this.S);
        parcel.writeString(this.T);
        parcel.writeInt(this.U);
        parcel.writeInt(this.V);
        TextUtils.writeToParcel(this.W, parcel, 0);
        parcel.writeInt(this.X);
        TextUtils.writeToParcel(this.Y, parcel, 0);
        parcel.writeStringList(this.Z);
        parcel.writeStringList(this.f2416a0);
        parcel.writeInt(this.f2417b0 ? 1 : 0);
    }
}
