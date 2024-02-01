package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import d.m0;
import d9.c1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import l8.b;

@SafeParcelable.a(creator = "LocationSettingsRequestCreator")
@SafeParcelable.g({4, 5, 1000})
public final class LocationSettingsRequest extends AbstractSafeParcelable {
    @m0
    public static final Parcelable.Creator<LocationSettingsRequest> CREATOR = new c1();
    @SafeParcelable.c(getter = "getLocationRequests", id = 1)
    public final List O;
    @SafeParcelable.c(defaultValue = "false", getter = "alwaysShow", id = 2)
    public final boolean P;
    @SafeParcelable.c(getter = "needBle", id = 3)
    public final boolean Q;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList f5977a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public boolean f5978b = false;

        /* renamed from: c  reason: collision with root package name */
        public boolean f5979c = false;

        @m0
        public a a(@m0 Collection<LocationRequest> collection) {
            for (LocationRequest next : collection) {
                if (next != null) {
                    this.f5977a.add(next);
                }
            }
            return this;
        }

        @m0
        public a b(@m0 LocationRequest locationRequest) {
            if (locationRequest != null) {
                this.f5977a.add(locationRequest);
            }
            return this;
        }

        @m0
        public LocationSettingsRequest c() {
            return new LocationSettingsRequest(this.f5977a, this.f5978b, this.f5979c);
        }

        @m0
        public a d(boolean z10) {
            this.f5978b = z10;
            return this;
        }

        @m0
        public a e(boolean z10) {
            this.f5979c = z10;
            return this;
        }
    }

    @SafeParcelable.b
    public LocationSettingsRequest(@SafeParcelable.e(id = 1) List list, @SafeParcelable.e(id = 2) boolean z10, @SafeParcelable.e(id = 3) boolean z11) {
        this.O = list;
        this.P = z10;
        this.Q = z11;
    }

    public void writeToParcel(@m0 Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.d0(parcel, 1, Collections.unmodifiableList(this.O), false);
        b.g(parcel, 2, this.P);
        b.g(parcel, 3, this.Q);
        b.b(parcel, a10);
    }
}
