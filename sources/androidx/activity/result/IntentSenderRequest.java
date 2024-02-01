package androidx.activity.result;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import d.m0;
import d.o0;

@SuppressLint({"BanParcelableUsage"})
public final class IntentSenderRequest implements Parcelable {
    @m0
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new a();
    @m0
    public final IntentSender O;
    @o0
    public final Intent P;
    public final int Q;
    public final int R;

    public class a implements Parcelable.Creator<IntentSenderRequest> {
        /* renamed from: a */
        public IntentSenderRequest createFromParcel(Parcel parcel) {
            return new IntentSenderRequest(parcel);
        }

        /* renamed from: b */
        public IntentSenderRequest[] newArray(int i10) {
            return new IntentSenderRequest[i10];
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public IntentSender f654a;

        /* renamed from: b  reason: collision with root package name */
        public Intent f655b;

        /* renamed from: c  reason: collision with root package name */
        public int f656c;

        /* renamed from: d  reason: collision with root package name */
        public int f657d;

        public b(@m0 PendingIntent pendingIntent) {
            this(pendingIntent.getIntentSender());
        }

        public b(@m0 IntentSender intentSender) {
            this.f654a = intentSender;
        }

        @m0
        public IntentSenderRequest a() {
            return new IntentSenderRequest(this.f654a, this.f655b, this.f656c, this.f657d);
        }

        @m0
        public b b(@o0 Intent intent) {
            this.f655b = intent;
            return this;
        }

        @m0
        public b c(int i10, int i11) {
            this.f657d = i10;
            this.f656c = i11;
            return this;
        }
    }

    public IntentSenderRequest(@m0 IntentSender intentSender, @o0 Intent intent, int i10, int i11) {
        this.O = intentSender;
        this.P = intent;
        this.Q = i10;
        this.R = i11;
    }

    public IntentSenderRequest(@m0 Parcel parcel) {
        this.O = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.P = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.Q = parcel.readInt();
        this.R = parcel.readInt();
    }

    @o0
    public Intent a() {
        return this.P;
    }

    public int b() {
        return this.Q;
    }

    public int c() {
        return this.R;
    }

    @m0
    public IntentSender d() {
        return this.O;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(@m0 Parcel parcel, int i10) {
        parcel.writeParcelable(this.O, i10);
        parcel.writeParcelable(this.P, i10);
        parcel.writeInt(this.Q);
        parcel.writeInt(this.R);
    }
}
