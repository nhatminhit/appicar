package v4;

import java.util.UUID;
import v4.l0;

public class m0 {

    public static abstract class a<T> extends l0<T> {
        public final Class<?> O;

        public a(Class<?> cls) {
            this.O = cls;
        }

        public boolean a(l0<?> l0Var) {
            return l0Var.getClass() == getClass() && l0Var.d() == this.O;
        }

        public abstract T c(Object obj);

        public final Class<?> d() {
            return this.O;
        }
    }

    public static final class b extends a<Integer> {
        public static final long Q = 1;
        public transient int P;

        public b() {
            this(Object.class, -1);
        }

        public b(Class<?> cls, int i10) {
            super(cls);
            this.P = i10;
        }

        public /* bridge */ /* synthetic */ boolean a(l0 l0Var) {
            return super.a(l0Var);
        }

        public l0<Integer> b(Class<?> cls) {
            return this.O == cls ? this : new b(cls, this.P);
        }

        public l0.a f(Object obj) {
            if (obj == null) {
                return null;
            }
            return new l0.a(b.class, this.O, obj);
        }

        public l0<Integer> h(Object obj) {
            return new b(this.O, j());
        }

        /* renamed from: i */
        public Integer c(Object obj) {
            if (obj == null) {
                return null;
            }
            int i10 = this.P;
            this.P = i10 + 1;
            return Integer.valueOf(i10);
        }

        public int j() {
            return 1;
        }
    }

    public static abstract class c extends l0<Object> {
    }

    public static abstract class d extends a<Object> {
        public static final long P = 1;

        public d(Class<?> cls) {
            super(cls);
        }

        public /* bridge */ /* synthetic */ boolean a(l0 l0Var) {
            return super.a(l0Var);
        }
    }

    public static final class e extends a<String> {
        public static final long P = 1;

        public e() {
            this(Object.class);
        }

        public e(Class<?> cls) {
            super(Object.class);
        }

        public boolean a(l0<?> l0Var) {
            return l0Var instanceof e;
        }

        public l0<String> b(Class<?> cls) {
            return this;
        }

        public l0.a f(Object obj) {
            if (obj == null) {
                return null;
            }
            return new l0.a(e.class, (Class<?>) null, obj);
        }

        public l0<String> h(Object obj) {
            return this;
        }

        /* renamed from: i */
        public String c(Object obj) {
            return UUID.randomUUID().toString();
        }
    }

    public static final class f extends a<UUID> {
        public static final long P = 1;

        public f() {
            this(Object.class);
        }

        public f(Class<?> cls) {
            super(Object.class);
        }

        public boolean a(l0<?> l0Var) {
            return l0Var.getClass() == f.class;
        }

        public l0<UUID> b(Class<?> cls) {
            return this;
        }

        public l0.a f(Object obj) {
            if (obj == null) {
                return null;
            }
            return new l0.a(f.class, (Class<?>) null, obj);
        }

        public l0<UUID> h(Object obj) {
            return this;
        }

        /* renamed from: i */
        public UUID c(Object obj) {
            return UUID.randomUUID();
        }
    }
}
