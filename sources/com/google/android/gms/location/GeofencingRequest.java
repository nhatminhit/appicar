package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.location.zzdh;
import d.m0;
import d.o0;
import d9.f;
import d9.q0;
import j8.s;
import java.util.ArrayList;
import java.util.List;

@SafeParcelable.a(creator = "GeofencingRequestCreator")
@SafeParcelable.g({1000})
public class GeofencingRequest extends AbstractSafeParcelable {
    @m0
    public static final Parcelable.Creator<GeofencingRequest> CREATOR = new q0();
    public static final int S = 1;
    public static final int T = 2;
    public static final int U = 4;
    @SafeParcelable.c(getter = "getParcelableGeofences", id = 1)
    public final List O;
    @SafeParcelable.c(getter = "getInitialTrigger", id = 2)
    @b
    public final int P;
    @SafeParcelable.c(defaultValue = "", getter = "getTag", id = 3)
    public final String Q;
    @o0
    @SafeParcelable.c(getter = "getContextAttributionTag", id = 4)
    public final String R;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final List f5945a = new ArrayList();
        @b

        /* renamed from: b  reason: collision with root package name */
        public int f5946b = 5;

        /* renamed from: c  reason: collision with root package name */
        public String f5947c = "";

        @m0
        public a a(@m0 f fVar) {
            s.m(fVar, "geofence can't be null.");
            s.b(fVar instanceof zzdh, "Geofence must be created using Geofence.Builder.");
            this.f5945a.add((zzdh) fVar);
            return this;
        }

        @m0
        public a b(@m0 List<f> list) {
            if (list != null && !list.isEmpty()) {
                for (f next : list) {
                    if (next != null) {
                        a(next);
                    }
                }
            }
            return this;
        }

        @m0
        public GeofencingRequest c() {
            s.b(!this.f5945a.isEmpty(), "No geofence has been added to this request.");
            return new GeofencingRequest(this.f5945a, this.f5946b, this.f5947c, (String) null);
        }

        @m0
        public a d(@b int i10) {
            this.f5946b = i10 & 7;
            return this;
        }
    }

    public @interface b {
    }

    @SafeParcelable.b
    public GeofencingRequest(@SafeParcelable.e(id = 1) List list, @SafeParcelable.e(id = 2) @b int i10, @SafeParcelable.e(id = 3) String str, @SafeParcelable.e(id = 4) @o0 String str2) {
        this.O = list;
        this.P = i10;
        this.Q = str;
        this.R = str2;
    }

    @m0
    public List<f> X0() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.O);
        return arrayList;
    }

    @b
    public int Z0() {
        return this.P;
    }

    @m0
    public final GeofencingRequest f1(@o0 String str) {
        return new GeofencingRequest(this.O, this.P, this.Q, str);
    }

    @m0
    public String toString() {
        return "GeofencingRequest[geofences=" + this.O + ", initialTrigger=" + this.P + ", tag=" + this.Q + ", attributionTag=" + this.R + "]";
    }

    public void writeToParcel(@m0 Parcel parcel, int i10) {
        int a10 = l8.b.a(parcel);
        l8.b.d0(parcel, 1, this.O, false);
        l8.b.F(parcel, 2, Z0());
        l8.b.Y(parcel, 3, this.Q, false);
        l8.b.Y(parcel, 4, this.R, false);
        l8.b.b(parcel, a10);
    }
}
