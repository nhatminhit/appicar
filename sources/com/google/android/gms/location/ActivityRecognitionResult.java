package com.google.android.gms.location;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import d.m0;
import d.o0;
import d9.g0;
import j8.q;
import j8.s;
import j8.w;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.List;
import l8.b;
import l8.c;
import w8.d0;

@SafeParcelable.a(creator = "ActivityRecognitionResultCreator")
@SafeParcelable.g({1000})
public class ActivityRecognitionResult extends AbstractSafeParcelable implements ReflectedParcelable {
    @m0
    public static final Parcelable.Creator<ActivityRecognitionResult> CREATOR = new g0();
    @SafeParcelable.c(id = 1)
    public List O;
    @SafeParcelable.c(id = 2)
    public long P;
    @SafeParcelable.c(id = 3)
    public long Q;
    @SafeParcelable.c(id = 4)
    public int R;
    @o0
    @SafeParcelable.c(id = 5)
    public Bundle S;

    @d0
    public ActivityRecognitionResult(@m0 DetectedActivity detectedActivity, long j10, long j11) {
        this(Collections.singletonList(detectedActivity), j10, j11, 0, (Bundle) null);
    }

    public ActivityRecognitionResult(@m0 List<DetectedActivity> list, long j10, long j11) {
        this(list, j10, j11, 0, (Bundle) null);
    }

    @SafeParcelable.b
    @w
    public ActivityRecognitionResult(@SafeParcelable.e(id = 1) @m0 List list, @SafeParcelable.e(id = 2) long j10, @SafeParcelable.e(id = 3) long j11, @SafeParcelable.e(id = 4) int i10, @SafeParcelable.e(id = 5) @o0 Bundle bundle) {
        boolean z10 = true;
        s.b(list != null && list.size() > 0, "Must have at least 1 detected activity");
        s.b((j10 <= 0 || j11 <= 0) ? false : z10, "Must set times");
        this.O = list;
        this.P = j10;
        this.Q = j11;
        this.R = i10;
        this.S = bundle;
    }

    public static boolean A1(@o0 Bundle bundle, @o0 Bundle bundle2) {
        int length;
        if (bundle == null) {
            return bundle2 == null;
        }
        if (bundle2 == null || bundle.size() != bundle2.size()) {
            return false;
        }
        for (String next : bundle.keySet()) {
            if (!bundle2.containsKey(next)) {
                return false;
            }
            Object obj = bundle.get(next);
            Object obj2 = bundle2.get(next);
            if (obj == null) {
                if (obj2 != null) {
                    return false;
                }
            } else if (obj instanceof Bundle) {
                if (!A1(bundle.getBundle(next), bundle2.getBundle(next))) {
                    return false;
                }
            } else if (obj.getClass().isArray()) {
                if (obj2 != null && obj2.getClass().isArray() && (length = Array.getLength(obj)) == Array.getLength(obj2)) {
                    int i10 = 0;
                    while (i10 < length) {
                        if (q.b(Array.get(obj, i10), Array.get(obj2, i10))) {
                            i10++;
                        }
                    }
                    continue;
                }
                return false;
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        if ((r0 instanceof com.google.android.gms.location.ActivityRecognitionResult) != false) goto L_0x0022;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002d  */
    @d.o0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.location.ActivityRecognitionResult X0(@d.m0 android.content.Intent r3) {
        /*
            boolean r0 = p1(r3)
            r1 = 0
            if (r0 != 0) goto L_0x0009
        L_0x0007:
            r0 = r1
            goto L_0x002a
        L_0x0009:
            android.os.Bundle r0 = r3.getExtras()
            if (r0 != 0) goto L_0x0010
            goto L_0x0007
        L_0x0010:
            java.lang.String r2 = "com.google.android.location.internal.EXTRA_ACTIVITY_RESULT"
            java.lang.Object r0 = r0.get(r2)
            boolean r2 = r0 instanceof byte[]
            if (r2 == 0) goto L_0x0025
            byte[] r0 = (byte[]) r0
            android.os.Parcelable$Creator<com.google.android.gms.location.ActivityRecognitionResult> r2 = CREATOR
            com.google.android.gms.common.internal.safeparcel.SafeParcelable r0 = l8.c.a(r0, r2)
        L_0x0022:
            com.google.android.gms.location.ActivityRecognitionResult r0 = (com.google.android.gms.location.ActivityRecognitionResult) r0
            goto L_0x002a
        L_0x0025:
            boolean r2 = r0 instanceof com.google.android.gms.location.ActivityRecognitionResult
            if (r2 == 0) goto L_0x0007
            goto L_0x0022
        L_0x002a:
            if (r0 == 0) goto L_0x002d
            return r0
        L_0x002d:
            java.util.List r3 = r1(r3)
            if (r3 == 0) goto L_0x0047
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x003a
            goto L_0x0047
        L_0x003a:
            int r0 = r3.size()
            int r0 = r0 + -1
            java.lang.Object r3 = r3.get(r0)
            com.google.android.gms.location.ActivityRecognitionResult r3 = (com.google.android.gms.location.ActivityRecognitionResult) r3
            return r3
        L_0x0047:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.ActivityRecognitionResult.X0(android.content.Intent):com.google.android.gms.location.ActivityRecognitionResult");
    }

    public static boolean p1(@o0 Intent intent) {
        if (intent == null) {
            return false;
        }
        if (intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT")) {
            return true;
        }
        List r12 = r1(intent);
        return r12 != null && !r12.isEmpty();
    }

    @o0
    public static List r1(@m0 Intent intent) {
        if (intent != null && intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST")) {
            return c.g(intent, "com.google.android.location.internal.EXTRA_ACTIVITY_RESULT_LIST", CREATOR);
        }
        return null;
    }

    public int Z0(int i10) {
        for (DetectedActivity detectedActivity : this.O) {
            if (detectedActivity.Z0() == i10) {
                return detectedActivity.X0();
            }
        }
        return 0;
    }

    @w
    public final boolean equals(@o0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) obj;
            return this.P == activityRecognitionResult.P && this.Q == activityRecognitionResult.Q && this.R == activityRecognitionResult.R && q.b(this.O, activityRecognitionResult.O) && A1(this.S, activityRecognitionResult.S);
        }
    }

    public long f1() {
        return this.Q;
    }

    @m0
    public DetectedActivity g1() {
        return (DetectedActivity) this.O.get(0);
    }

    @m0
    public List<DetectedActivity> h1() {
        return this.O;
    }

    @w
    public final int hashCode() {
        return q.c(Long.valueOf(this.P), Long.valueOf(this.Q), Integer.valueOf(this.R), this.O, this.S);
    }

    public long m1() {
        return this.P;
    }

    @m0
    public String toString() {
        String valueOf = String.valueOf(this.O);
        long j10 = this.P;
        long j11 = this.Q;
        return "ActivityRecognitionResult [probableActivities=" + valueOf + ", timeMillis=" + j10 + ", elapsedRealtimeMillis=" + j11 + "]";
    }

    public void writeToParcel(@m0 Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.d0(parcel, 1, this.O, false);
        b.K(parcel, 2, this.P);
        b.K(parcel, 3, this.Q);
        b.F(parcel, 4, this.R);
        b.k(parcel, 5, this.S, false);
        b.b(parcel, a10);
    }
}
