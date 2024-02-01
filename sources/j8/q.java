package j8;

import android.os.Bundle;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import d.m0;
import d.o0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import w7.l;

@e8.a
public final class q {

    @e8.a
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final List f9790a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final Object f9791b;

        public /* synthetic */ a(Object obj, k1 k1Var) {
            s.l(obj);
            this.f9791b = obj;
        }

        @e8.a
        @CanIgnoreReturnValue
        @m0
        public a a(@m0 String str, @o0 Object obj) {
            List list = this.f9790a;
            s.l(str);
            String valueOf = String.valueOf(obj);
            list.add(str + l.f14755k + valueOf);
            return this;
        }

        @e8.a
        @m0
        public String toString() {
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append(this.f9791b.getClass().getSimpleName());
            sb2.append('{');
            int size = this.f9790a.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append((String) this.f9790a.get(i10));
                if (i10 < size - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append('}');
            return sb2.toString();
        }
    }

    public q() {
        throw new AssertionError("Uninstantiable");
    }

    @e8.a
    public static boolean a(@m0 Bundle bundle, @m0 Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return bundle == bundle2;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        Set<String> keySet = bundle.keySet();
        if (!keySet.containsAll(bundle2.keySet())) {
            return false;
        }
        for (String next : keySet) {
            if (!b(bundle.get(next), bundle2.get(next))) {
                return false;
            }
        }
        return true;
    }

    @e8.a
    public static boolean b(@o0 Object obj, @o0 Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    @e8.a
    public static int c(@m0 Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @e8.a
    @m0
    public static a d(@m0 Object obj) {
        return new a(obj, (k1) null);
    }
}
