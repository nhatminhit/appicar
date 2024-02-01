package com.google.android.gms.common.stats;

import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import d.m0;

@e8.a
@Deprecated
public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {

    @e8.a
    public interface a {
        @e8.a

        /* renamed from: a  reason: collision with root package name */
        public static final int f5801a = 7;
        @e8.a

        /* renamed from: b  reason: collision with root package name */
        public static final int f5802b = 8;
    }

    public abstract int X0();

    public abstract long Z0();

    public abstract long f1();

    @m0
    public abstract String g1();

    @m0
    public final String toString() {
        long f12 = f1();
        int X0 = X0();
        long Z0 = Z0();
        String g12 = g1();
        return f12 + "\t" + X0 + "\t" + Z0 + g12;
    }
}
