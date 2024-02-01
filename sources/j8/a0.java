package j8;

import android.os.Bundle;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import d.m0;
import d.o0;
import f8.a;

@e8.a
public class a0 implements a.d.f {
    @m0
    public static final a0 P = a().a();
    @o0
    public final String O;

    @e8.a
    public static class a {
        @o0

        /* renamed from: a  reason: collision with root package name */
        public String f9697a;

        public a() {
        }

        public /* synthetic */ a(e0 e0Var) {
        }

        @e8.a
        @m0
        public a0 a() {
            return new a0(this.f9697a, (f0) null);
        }

        @e8.a
        @CanIgnoreReturnValue
        @m0
        public a b(@o0 String str) {
            this.f9697a = str;
            return this;
        }
    }

    public /* synthetic */ a0(String str, f0 f0Var) {
        this.O = str;
    }

    @e8.a
    @m0
    public static a a() {
        return new a((e0) null);
    }

    @m0
    public final Bundle b() {
        Bundle bundle = new Bundle();
        String str = this.O;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(@o0 Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        return q.b(this.O, ((a0) obj).O);
    }

    public final int hashCode() {
        return q.c(this.O);
    }
}
