package com.google.android.exoplayer2.scheduler;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import h0.u0;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import w7.q0;

public final class Requirements implements Parcelable {
    public static final Parcelable.Creator<Requirements> CREATOR = new a();
    public static final int P = 1;
    public static final int Q = 2;
    public static final int R = 4;
    public static final int S = 8;
    public final int O;

    public static class a implements Parcelable.Creator<Requirements> {
        /* renamed from: a */
        public Requirements createFromParcel(Parcel parcel) {
            return new Requirements(parcel.readInt());
        }

        /* renamed from: b */
        public Requirements[] newArray(int i10) {
            return new Requirements[i10];
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public Requirements(int i10) {
        this.O = (i10 & 2) != 0 ? i10 | 1 : i10;
    }

    public static boolean j(ConnectivityManager connectivityManager) {
        if (q0.f14786a < 23) {
            return true;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        boolean z10 = false;
        if (activeNetwork == null) {
            return false;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities == null || !networkCapabilities.hasCapability(16)) {
            z10 = true;
        }
        return !z10;
    }

    public boolean a(Context context) {
        return c(context) == 0;
    }

    public final int b(Context context) {
        if (!l()) {
            return 0;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) w7.a.g(connectivityManager)).getActiveNetworkInfo();
        return (activeNetworkInfo == null || !activeNetworkInfo.isConnected() || !j(connectivityManager)) ? this.O & 3 : (!n() || !connectivityManager.isActiveNetworkMetered()) ? 0 : 2;
    }

    public int c(Context context) {
        int b10 = b(context);
        if (e() && !f(context)) {
            b10 |= 8;
        }
        return (!h() || g(context)) ? b10 : b10 | 4;
    }

    public int d() {
        return this.O;
    }

    public int describeContents() {
        return 0;
    }

    public boolean e() {
        return (this.O & 8) != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Requirements.class != obj.getClass()) {
            return false;
        }
        return this.O == ((Requirements) obj).O;
    }

    public final boolean f(Context context) {
        Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return false;
        }
        int intExtra = registerReceiver.getIntExtra(u0.C0, -1);
        return intExtra == 2 || intExtra == 5;
    }

    public final boolean g(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        int i10 = q0.f14786a;
        if (i10 >= 23) {
            return powerManager.isDeviceIdleMode();
        }
        if (i10 >= 20) {
            if (!powerManager.isInteractive()) {
                return true;
            }
        } else if (!powerManager.isScreenOn()) {
            return true;
        }
        return false;
    }

    public boolean h() {
        return (this.O & 4) != 0;
    }

    public int hashCode() {
        return this.O;
    }

    public boolean l() {
        return (this.O & 1) != 0;
    }

    public boolean n() {
        return (this.O & 2) != 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.O);
    }
}
