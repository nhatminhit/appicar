package com.google.android.gms.common.internal.safeparcel;

import android.os.Parcelable;
import d.m0;

public interface SafeParcelable extends Parcelable {
    @m0
    public static final String NULL = "SAFE_PARCELABLE_NULL_STRING";

    public @interface a {
        @m0
        String creator();

        boolean doNotParcelTypeDefaultValues() default false;

        boolean validate() default false;
    }

    public @interface b {
    }

    public @interface c {
        @m0
        String defaultValue() default "SAFE_PARCELABLE_NULL_STRING";

        @m0
        String defaultValueUnchecked() default "SAFE_PARCELABLE_NULL_STRING";

        @m0
        String getter() default "SAFE_PARCELABLE_NULL_STRING";

        int id();

        @m0
        String type() default "SAFE_PARCELABLE_NULL_STRING";
    }

    public @interface d {
        @m0
        String getter() default "SAFE_PARCELABLE_NULL_STRING";
    }

    public @interface e {
        int id();
    }

    public @interface f {
        @m0
        String defaultValue() default "SAFE_PARCELABLE_NULL_STRING";

        @m0
        String defaultValueUnchecked() default "SAFE_PARCELABLE_NULL_STRING";

        int id();
    }

    public @interface g {
        @m0
        int[] value();
    }

    public @interface h {
        @m0
        String getter() default "SAFE_PARCELABLE_NULL_STRING";

        int id();

        @m0
        String type() default "SAFE_PARCELABLE_NULL_STRING";
    }
}
