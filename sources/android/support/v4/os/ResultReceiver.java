package android.support.v4.os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.os.a;
import d.x0;

@x0({x0.a.Q})
@SuppressLint({"BanParcelableUsage"})
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new a();
    public final boolean O;
    public final Handler P;
    public a Q;

    public class a implements Parcelable.Creator<ResultReceiver> {
        /* renamed from: a */
        public ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        /* renamed from: b */
        public ResultReceiver[] newArray(int i10) {
            return new ResultReceiver[i10];
        }
    }

    public class b extends a.b {
        public b() {
        }

        public void U1(int i10, Bundle bundle) {
            ResultReceiver resultReceiver = ResultReceiver.this;
            Handler handler = resultReceiver.P;
            if (handler != null) {
                handler.post(new c(i10, bundle));
            } else {
                resultReceiver.a(i10, bundle);
            }
        }
    }

    public class c implements Runnable {
        public final int O;
        public final Bundle P;

        public c(int i10, Bundle bundle) {
            this.O = i10;
            this.P = bundle;
        }

        public void run() {
            ResultReceiver.this.a(this.O, this.P);
        }
    }

    public ResultReceiver(Handler handler) {
        this.O = true;
        this.P = handler;
    }

    public ResultReceiver(Parcel parcel) {
        this.O = false;
        this.P = null;
        this.Q = a.b.D(parcel.readStrongBinder());
    }

    public void a(int i10, Bundle bundle) {
    }

    public void b(int i10, Bundle bundle) {
        if (this.O) {
            Handler handler = this.P;
            if (handler != null) {
                handler.post(new c(i10, bundle));
            } else {
                a(i10, bundle);
            }
        } else {
            a aVar = this.Q;
            if (aVar != null) {
                try {
                    aVar.U1(i10, bundle);
                } catch (RemoteException unused) {
                }
            }
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        synchronized (this) {
            if (this.Q == null) {
                this.Q = new b();
            }
            parcel.writeStrongBinder(this.Q.asBinder());
        }
    }
}
