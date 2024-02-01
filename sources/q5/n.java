package q5;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public abstract class n {

    /* renamed from: b  reason: collision with root package name */
    public static final a6.b f11974b = new c();

    /* renamed from: a  reason: collision with root package name */
    public final Object f11975a;

    public static class a extends n {

        /* renamed from: c  reason: collision with root package name */
        public static final a f11976c = new a((Object) null);

        public a(Object obj) {
            super(obj);
        }

        public n a(Annotation annotation) {
            return new e(this.f11975a, annotation.annotationType(), annotation);
        }

        public p b() {
            return new p();
        }

        public a6.b c() {
            return n.f11974b;
        }

        public boolean h(Annotation annotation) {
            return false;
        }
    }

    public static class b extends n {

        /* renamed from: c  reason: collision with root package name */
        public final HashMap<Class<?>, Annotation> f11977c;

        public b(Object obj, Class<?> cls, Annotation annotation, Class<?> cls2, Annotation annotation2) {
            super(obj);
            HashMap<Class<?>, Annotation> hashMap = new HashMap<>();
            this.f11977c = hashMap;
            hashMap.put(cls, annotation);
            hashMap.put(cls2, annotation2);
        }

        public n a(Annotation annotation) {
            this.f11977c.put(annotation.annotationType(), annotation);
            return this;
        }

        public p b() {
            p pVar = new p();
            for (Annotation e10 : this.f11977c.values()) {
                pVar.e(e10);
            }
            return pVar;
        }

        public a6.b c() {
            if (this.f11977c.size() != 2) {
                return new p(this.f11977c);
            }
            Iterator<Map.Entry<Class<?>, Annotation>> it = this.f11977c.entrySet().iterator();
            Map.Entry next = it.next();
            Map.Entry next2 = it.next();
            return new f((Class) next.getKey(), (Annotation) next.getValue(), (Class) next2.getKey(), (Annotation) next2.getValue());
        }

        public boolean h(Annotation annotation) {
            return this.f11977c.containsKey(annotation.annotationType());
        }
    }

    public static class c implements a6.b, Serializable {
        public static final long O = 1;

        public <A extends Annotation> A a(Class<A> cls) {
            return null;
        }

        public boolean b(Class<?> cls) {
            return false;
        }

        public boolean c(Class<? extends Annotation>[] clsArr) {
            return false;
        }

        public int size() {
            return 0;
        }
    }

    public static class d implements a6.b, Serializable {
        public static final long Q = 1;
        public final Class<?> O;
        public final Annotation P;

        public d(Class<?> cls, Annotation annotation) {
            this.O = cls;
            this.P = annotation;
        }

        public <A extends Annotation> A a(Class<A> cls) {
            if (this.O == cls) {
                return this.P;
            }
            return null;
        }

        public boolean b(Class<?> cls) {
            return this.O == cls;
        }

        public boolean c(Class<? extends Annotation>[] clsArr) {
            for (Class<?> cls : clsArr) {
                if (cls == this.O) {
                    return true;
                }
            }
            return false;
        }

        public int size() {
            return 1;
        }
    }

    public static class e extends n {

        /* renamed from: c  reason: collision with root package name */
        public Class<?> f11978c;

        /* renamed from: d  reason: collision with root package name */
        public Annotation f11979d;

        public e(Object obj, Class<?> cls, Annotation annotation) {
            super(obj);
            this.f11978c = cls;
            this.f11979d = annotation;
        }

        public n a(Annotation annotation) {
            Class<? extends Annotation> annotationType = annotation.annotationType();
            Class<?> cls = this.f11978c;
            if (cls != annotationType) {
                return new b(this.f11975a, cls, this.f11979d, annotationType, annotation);
            }
            this.f11979d = annotation;
            return this;
        }

        public p b() {
            return p.i(this.f11978c, this.f11979d);
        }

        public a6.b c() {
            return new d(this.f11978c, this.f11979d);
        }

        public boolean h(Annotation annotation) {
            return annotation.annotationType() == this.f11978c;
        }
    }

    public static class f implements a6.b, Serializable {
        public static final long S = 1;
        public final Class<?> O;
        public final Class<?> P;
        public final Annotation Q;
        public final Annotation R;

        public f(Class<?> cls, Annotation annotation, Class<?> cls2, Annotation annotation2) {
            this.O = cls;
            this.Q = annotation;
            this.P = cls2;
            this.R = annotation2;
        }

        public <A extends Annotation> A a(Class<A> cls) {
            if (this.O == cls) {
                return this.Q;
            }
            if (this.P == cls) {
                return this.R;
            }
            return null;
        }

        public boolean b(Class<?> cls) {
            return this.O == cls || this.P == cls;
        }

        public boolean c(Class<? extends Annotation>[] clsArr) {
            for (Class<?> cls : clsArr) {
                if (cls == this.O || cls == this.P) {
                    return true;
                }
            }
            return false;
        }

        public int size() {
            return 2;
        }
    }

    public n(Object obj) {
        this.f11975a = obj;
    }

    public static a6.b d() {
        return f11974b;
    }

    public static n e() {
        return a.f11976c;
    }

    public static n f(Object obj) {
        return new a(obj);
    }

    public abstract n a(Annotation annotation);

    public abstract p b();

    public abstract a6.b c();

    public Object g() {
        return this.f11975a;
    }

    public abstract boolean h(Annotation annotation);
}
