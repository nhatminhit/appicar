package u5;

import i5.j;
import i5.l;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import k5.i;
import u5.d;

public class a extends d.a implements Serializable {
    public static final long U = 1;
    public final Set<Class<?>> Q;
    public final c[] R;
    public final b[] S;
    public final c[] T;

    /* renamed from: u5.a$a  reason: collision with other inner class name */
    public static class C0230a {

        /* renamed from: a  reason: collision with root package name */
        public Set<Class<?>> f13733a;

        /* renamed from: b  reason: collision with root package name */
        public List<c> f13734b;

        /* renamed from: c  reason: collision with root package name */
        public List<b> f13735c;

        /* renamed from: d  reason: collision with root package name */
        public List<c> f13736d;

        /* renamed from: u5.a$a$a  reason: collision with other inner class name */
        public class C0231a extends c {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Class f13737a;

            public C0231a(Class cls) {
                this.f13737a = cls;
            }

            public boolean a(i<?> iVar, Class<?> cls) {
                return this.f13737a.isAssignableFrom(cls);
            }
        }

        /* renamed from: u5.a$a$b */
        public class b extends c {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Pattern f13739a;

            public b(Pattern pattern) {
                this.f13739a = pattern;
            }

            public boolean a(i<?> iVar, Class<?> cls) {
                return this.f13739a.matcher(cls.getName()).matches();
            }
        }

        /* renamed from: u5.a$a$c */
        public class c extends c {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f13741a;

            public c(String str) {
                this.f13741a = str;
            }

            public boolean a(i<?> iVar, Class<?> cls) {
                return cls.getName().startsWith(this.f13741a);
            }
        }

        /* renamed from: u5.a$a$d */
        public class d extends c {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Class f13743a;

            public d(Class cls) {
                this.f13743a = cls;
            }

            public boolean a(i<?> iVar, Class<?> cls) {
                return this.f13743a.isAssignableFrom(cls);
            }
        }

        /* renamed from: u5.a$a$e */
        public class e extends b {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Pattern f13745a;

            public e(Pattern pattern) {
                this.f13745a = pattern;
            }

            public boolean a(i<?> iVar, String str) {
                return this.f13745a.matcher(str).matches();
            }
        }

        /* renamed from: u5.a$a$f */
        public class f extends b {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f13747a;

            public f(String str) {
                this.f13747a = str;
            }

            public boolean a(i<?> iVar, String str) {
                return str.startsWith(this.f13747a);
            }
        }

        /* renamed from: u5.a$a$g */
        public class g extends c {
            public g() {
            }

            public boolean a(i<?> iVar, Class<?> cls) {
                return cls.isArray();
            }
        }

        public C0230a a(c cVar) {
            if (this.f13734b == null) {
                this.f13734b = new ArrayList();
            }
            this.f13734b.add(cVar);
            return this;
        }

        public C0230a b(c cVar) {
            if (this.f13736d == null) {
                this.f13736d = new ArrayList();
            }
            this.f13736d.add(cVar);
            return this;
        }

        public C0230a c(b bVar) {
            if (this.f13735c == null) {
                this.f13735c = new ArrayList();
            }
            this.f13735c.add(bVar);
            return this;
        }

        public C0230a d(Class<?> cls) {
            return a(new C0231a(cls));
        }

        public C0230a e(String str) {
            return a(new c(str));
        }

        public C0230a f(Pattern pattern) {
            return a(new b(pattern));
        }

        public C0230a g(c cVar) {
            return a(cVar);
        }

        public C0230a h(Class<?> cls) {
            return b(new d(cls));
        }

        public C0230a i(String str) {
            return c(new f(str));
        }

        public C0230a j(Pattern pattern) {
            return c(new e(pattern));
        }

        public C0230a k(c cVar) {
            return b(cVar);
        }

        public C0230a l() {
            return b(new g());
        }

        public a m() {
            Set<Class<?>> set = this.f13733a;
            List<c> list = this.f13734b;
            c[] cVarArr = null;
            c[] cVarArr2 = list == null ? null : (c[]) list.toArray(new c[0]);
            List<b> list2 = this.f13735c;
            b[] bVarArr = list2 == null ? null : (b[]) list2.toArray(new b[0]);
            List<c> list3 = this.f13736d;
            if (list3 != null) {
                cVarArr = (c[]) list3.toArray(new c[0]);
            }
            return new a(set, cVarArr2, bVarArr, cVarArr);
        }

        public C0230a n(Class<?> cls) {
            if (this.f13733a == null) {
                this.f13733a = new HashSet();
            }
            this.f13733a.add(cls);
            return this;
        }
    }

    public static abstract class b {
        public abstract boolean a(i<?> iVar, String str);
    }

    public static abstract class c {
        public abstract boolean a(i<?> iVar, Class<?> cls);
    }

    public a(Set<Class<?>> set, c[] cVarArr, b[] bVarArr, c[] cVarArr2) {
        this.Q = set;
        this.R = cVarArr;
        this.S = bVarArr;
        this.T = cVarArr2;
    }

    public static C0230a d() {
        return new C0230a();
    }

    public d.b a(i<?> iVar, j jVar) {
        Class<?> g10 = jVar.g();
        Set<Class<?>> set = this.Q;
        if (set != null && set.contains(g10)) {
            return d.b.DENIED;
        }
        c[] cVarArr = this.R;
        if (cVarArr != null) {
            for (c a10 : cVarArr) {
                if (a10.a(iVar, g10)) {
                    return d.b.ALLOWED;
                }
            }
        }
        return d.b.INDETERMINATE;
    }

    public d.b b(i<?> iVar, j jVar, String str) throws l {
        b[] bVarArr = this.S;
        if (bVarArr != null) {
            for (b a10 : bVarArr) {
                if (a10.a(iVar, str)) {
                    return d.b.ALLOWED;
                }
            }
        }
        return d.b.INDETERMINATE;
    }

    public d.b c(i<?> iVar, j jVar, j jVar2) throws l {
        if (this.T != null) {
            Class<?> g10 = jVar2.g();
            for (c a10 : this.T) {
                if (a10.a(iVar, g10)) {
                    return d.b.ALLOWED;
                }
            }
        }
        return d.b.INDETERMINATE;
    }
}
