package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import d.m0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import l8.b;
import o8.f;

@SafeParcelable.a(creator = "ModuleAvailabilityResponseCreator")
public class ModuleAvailabilityResponse extends AbstractSafeParcelable {
    @m0
    public static final Parcelable.Creator<ModuleAvailabilityResponse> CREATOR = new f();
    @SafeParcelable.c(getter = "areModulesAvailable", id = 1)
    public final boolean O;
    @SafeParcelable.c(getter = "getAvailabilityStatus", id = 2)
    public final int P;

    @Retention(RetentionPolicy.CLASS)
    public @interface a {

        /* renamed from: a  reason: collision with root package name */
        public static final int f5768a = 0;

        /* renamed from: b  reason: collision with root package name */
        public static final int f5769b = 1;

        /* renamed from: c  reason: collision with root package name */
        public static final int f5770c = 2;
    }

    @e8.a
    @SafeParcelable.b
    public ModuleAvailabilityResponse(@SafeParcelable.e(id = 1) boolean z10, @SafeParcelable.e(id = 2) int i10) {
        this.O = z10;
        this.P = i10;
    }

    public boolean X0() {
        return this.O;
    }

    @a
    public int Z0() {
        return this.P;
    }

    public void writeToParcel(@m0 Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.g(parcel, 1, X0());
        b.F(parcel, 2, Z0());
        b.b(parcel, a10);
    }
}
