package rh;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import og.k0;
import og.m0;
import rh.f;
import th.w;
import zd.u2;

public final class a extends f.a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f22597a = true;

    /* renamed from: rh.a$a  reason: collision with other inner class name */
    public static final class C0414a implements f<m0, m0> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0414a f22598a = new C0414a();

        /* renamed from: b */
        public m0 a(m0 m0Var) throws IOException {
            try {
                return z.a(m0Var);
            } finally {
                m0Var.close();
            }
        }
    }

    public static final class b implements f<k0, k0> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f22599a = new b();

        /* renamed from: b */
        public k0 a(k0 k0Var) {
            return k0Var;
        }
    }

    public static final class c implements f<m0, m0> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f22600a = new c();

        /* renamed from: b */
        public m0 a(m0 m0Var) {
            return m0Var;
        }
    }

    public static final class d implements f<Object, String> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f22601a = new d();

        /* renamed from: b */
        public String a(Object obj) {
            return obj.toString();
        }
    }

    public static final class e implements f<m0, u2> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f22602a = new e();

        /* renamed from: b */
        public u2 a(m0 m0Var) {
            m0Var.close();
            return u2.f25116a;
        }
    }

    public static final class f implements f<m0, Void> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f22603a = new f();

        /* renamed from: b */
        public Void a(m0 m0Var) {
            m0Var.close();
            return null;
        }
    }

    @Nullable
    public f<?, k0> c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, v vVar) {
        if (k0.class.isAssignableFrom(z.h(type))) {
            return b.f22599a;
        }
        return null;
    }

    @Nullable
    public f<m0, ?> d(Type type, Annotation[] annotationArr, v vVar) {
        if (type == m0.class) {
            return z.l(annotationArr, w.class) ? c.f22600a : C0414a.f22598a;
        }
        if (type == Void.class) {
            return f.f22603a;
        }
        if (!this.f22597a || type != u2.class) {
            return null;
        }
        try {
            return e.f22602a;
        } catch (NoClassDefFoundError unused) {
            this.f22597a = false;
            return null;
        }
    }
}
