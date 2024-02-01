package j8;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import d.o0;
import t7.t;

public final class y1 {

    /* renamed from: f  reason: collision with root package name */
    public static final Uri f9815f = new Uri.Builder().scheme(t.f13205o).authority("com.google.android.gms.chimera").build();
    @o0

    /* renamed from: a  reason: collision with root package name */
    public final String f9816a;
    @o0

    /* renamed from: b  reason: collision with root package name */
    public final String f9817b;
    @o0

    /* renamed from: c  reason: collision with root package name */
    public final ComponentName f9818c;

    /* renamed from: d  reason: collision with root package name */
    public final int f9819d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f9820e;

    public y1(ComponentName componentName, int i10) {
        this.f9816a = null;
        this.f9817b = null;
        s.l(componentName);
        this.f9818c = componentName;
        this.f9819d = i10;
        this.f9820e = false;
    }

    public y1(String str, int i10, boolean z10) {
        this(str, "com.google.android.gms", i10, false);
    }

    public y1(String str, String str2, int i10, boolean z10) {
        s.h(str);
        this.f9816a = str;
        s.h(str2);
        this.f9817b = str2;
        this.f9818c = null;
        this.f9819d = i10;
        this.f9820e = z10;
    }

    public final int a() {
        return this.f9819d;
    }

    @o0
    public final ComponentName b() {
        return this.f9818c;
    }

    public final Intent c(Context context) {
        Bundle bundle;
        if (this.f9816a == null) {
            return new Intent().setComponent(this.f9818c);
        }
        Intent intent = null;
        if (this.f9820e) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", this.f9816a);
            try {
                bundle = context.getContentResolver().call(f9815f, "serviceIntentCall", (String) null, bundle2);
            } catch (IllegalArgumentException e10) {
                "Dynamic intent resolution failed: ".concat(e10.toString());
                bundle = null;
            }
            if (bundle != null) {
                intent = (Intent) bundle.getParcelable("serviceResponseIntentKey");
            }
            if (intent == null) {
                "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.f9816a));
            }
        }
        return intent != null ? intent : new Intent(this.f9816a).setPackage(this.f9817b);
    }

    @o0
    public final String d() {
        return this.f9817b;
    }

    public final boolean equals(@o0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj;
        return q.b(this.f9816a, y1Var.f9816a) && q.b(this.f9817b, y1Var.f9817b) && q.b(this.f9818c, y1Var.f9818c) && this.f9819d == y1Var.f9819d && this.f9820e == y1Var.f9820e;
    }

    public final int hashCode() {
        return q.c(this.f9816a, this.f9817b, this.f9818c, Integer.valueOf(this.f9819d), Boolean.valueOf(this.f9820e));
    }

    public final String toString() {
        String str = this.f9816a;
        if (str != null) {
            return str;
        }
        s.l(this.f9818c);
        return this.f9818c.flattenToString();
    }
}
