package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new a();
    public ArrayList<FragmentState> O;
    public ArrayList<String> P;
    public BackStackState[] Q;
    public int R;
    public String S = null;
    public ArrayList<String> T = new ArrayList<>();
    public ArrayList<Bundle> U = new ArrayList<>();
    public ArrayList<FragmentManager.LaunchedFragmentInfo> V;

    public class a implements Parcelable.Creator<FragmentManagerState> {
        /* renamed from: a */
        public FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        /* renamed from: b */
        public FragmentManagerState[] newArray(int i10) {
            return new FragmentManagerState[i10];
        }
    }

    public FragmentManagerState() {
    }

    public FragmentManagerState(Parcel parcel) {
        this.O = parcel.createTypedArrayList(FragmentState.CREATOR);
        this.P = parcel.createStringArrayList();
        this.Q = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
        this.R = parcel.readInt();
        this.S = parcel.readString();
        this.T = parcel.createStringArrayList();
        this.U = parcel.createTypedArrayList(Bundle.CREATOR);
        this.V = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeTypedList(this.O);
        parcel.writeStringList(this.P);
        parcel.writeTypedArray(this.Q, i10);
        parcel.writeInt(this.R);
        parcel.writeString(this.S);
        parcel.writeStringList(this.T);
        parcel.writeTypedList(this.U);
        parcel.writeTypedList(this.V);
    }
}
