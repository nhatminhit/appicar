package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import d.m0;
import d.o0;

@SuppressLint({"BanParcelableUsage"})
public final class ActivityResult implements Parcelable {
    @m0
    public static final Parcelable.Creator<ActivityResult> CREATOR = new a();
    public final int O;
    @o0
    public final Intent P;

    public class a implements Parcelable.Creator<ActivityResult> {
        /* renamed from: a */
        public ActivityResult createFromParcel(@m0 Parcel parcel) {
            return new ActivityResult(parcel);
        }

        /* renamed from: b */
        public ActivityResult[] newArray(int i10) {
            return new ActivityResult[i10];
        }
    }

    public ActivityResult(int i10, @o0 Intent intent) {
        this.O = i10;
        this.P = intent;
    }

    public ActivityResult(Parcel parcel) {
        this.O = parcel.readInt();
        this.P = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }

    @m0
    public static String c(int i10) {
        return i10 != -1 ? i10 != 0 ? String.valueOf(i10) : "RESULT_CANCELED" : "RESULT_OK";
    }

    @o0
    public Intent a() {
        return this.P;
    }

    public int b() {
        return this.O;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + c(this.O) + ", data=" + this.P + '}';
    }

    public void writeToParcel(@m0 Parcel parcel, int i10) {
        parcel.writeInt(this.O);
        parcel.writeInt(this.P == null ? 0 : 1);
        Intent intent = this.P;
        if (intent != null) {
            intent.writeToParcel(parcel, i10);
        }
    }
}
