package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;
import d.m0;
import d.o0;
import e8.a;
import j8.q;
import j8.s;
import j8.w;
import w8.d0;

@a
@w
public abstract class FastSafeParcelableJsonResponse extends FastJsonResponse implements SafeParcelable {
    @a
    @m0
    public byte[] a0() {
        Parcel obtain = Parcel.obtain();
        writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    public final int describeContents() {
        return 0;
    }

    @o0
    @d0
    public Object e(@m0 String str) {
        return null;
    }

    @a
    public boolean equals(@o0 Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!getClass().isInstance(obj)) {
            return false;
        }
        FastJsonResponse fastJsonResponse = (FastJsonResponse) obj;
        for (FastJsonResponse.Field next : c().values()) {
            if (f(next)) {
                if (!fastJsonResponse.f(next) || !q.b(d(next), fastJsonResponse.d(next))) {
                    return false;
                }
            } else if (fastJsonResponse.f(next)) {
                return false;
            }
        }
        return true;
    }

    @d0
    public boolean g(@m0 String str) {
        return false;
    }

    @a
    public int hashCode() {
        int i10 = 0;
        for (FastJsonResponse.Field next : c().values()) {
            if (f(next)) {
                i10 = (i10 * 31) + s.l(d(next)).hashCode();
            }
        }
        return i10;
    }
}
