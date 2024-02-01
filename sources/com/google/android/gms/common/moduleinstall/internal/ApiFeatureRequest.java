package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import d.m0;
import d.o0;
import e8.a;
import f8.m;
import j8.q;
import j8.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import l8.b;
import p8.d;
import p8.e;

@a
@SafeParcelable.a(creator = "ApiFeatureRequestCreator")
public class ApiFeatureRequest extends AbstractSafeParcelable {
    @m0
    public static final Parcelable.Creator<ApiFeatureRequest> CREATOR = new e();
    public static final Comparator S = d.O;
    @SafeParcelable.c(getter = "getApiFeatures", id = 1)
    public final List O;
    @SafeParcelable.c(getter = "getIsUrgent", id = 2)
    public final boolean P;
    @o0
    @SafeParcelable.c(getter = "getFeatureRequestSessionId", id = 3)
    public final String Q;
    @o0
    @SafeParcelable.c(getter = "getCallingPackage", id = 4)
    public final String R;

    @SafeParcelable.b
    public ApiFeatureRequest(@SafeParcelable.e(id = 1) @m0 List list, @SafeParcelable.e(id = 2) boolean z10, @SafeParcelable.e(id = 3) @o0 String str, @SafeParcelable.e(id = 4) @o0 String str2) {
        s.l(list);
        this.O = list;
        this.P = z10;
        this.Q = str;
        this.R = str2;
    }

    @a
    @m0
    public static ApiFeatureRequest X0(@m0 o8.d dVar) {
        return f1(dVar.a(), true);
    }

    public static ApiFeatureRequest f1(List list, boolean z10) {
        TreeSet treeSet = new TreeSet(S);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Collections.addAll(treeSet, ((m) it.next()).a());
        }
        return new ApiFeatureRequest(new ArrayList(treeSet), z10, (String) null, (String) null);
    }

    @a
    @m0
    public List<Feature> Z0() {
        return this.O;
    }

    public final boolean equals(@o0 Object obj) {
        if (obj == null || !(obj instanceof ApiFeatureRequest)) {
            return false;
        }
        ApiFeatureRequest apiFeatureRequest = (ApiFeatureRequest) obj;
        return this.P == apiFeatureRequest.P && q.b(this.O, apiFeatureRequest.O) && q.b(this.Q, apiFeatureRequest.Q) && q.b(this.R, apiFeatureRequest.R);
    }

    public final int hashCode() {
        return q.c(Boolean.valueOf(this.P), this.O, this.Q, this.R);
    }

    public final void writeToParcel(@m0 Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.d0(parcel, 1, Z0(), false);
        b.g(parcel, 2, this.P);
        b.Y(parcel, 3, this.Q, false);
        b.Y(parcel, 4, this.R, false);
        b.b(parcel, a10);
    }
}
