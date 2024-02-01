package ja;

import ha.b;
import ha.e;
import ha.y;
import ha.z;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class d implements z, Cloneable {
    public static final double U = -1.0d;
    public static final d V = new d();
    public double O = -1.0d;
    public int P = 136;
    public boolean Q = true;
    public boolean R;
    public List<ha.a> S = Collections.emptyList();
    public List<ha.a> T = Collections.emptyList();

    public class a extends y<T> {

        /* renamed from: a  reason: collision with root package name */
        public y<T> f19878a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ boolean f19879b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ boolean f19880c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ e f19881d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ oa.a f19882e;

        public a(boolean z10, boolean z11, e eVar, oa.a aVar) {
            this.f19879b = z10;
            this.f19880c = z11;
            this.f19881d = eVar;
            this.f19882e = aVar;
        }

        public T e(pa.a aVar) throws IOException {
            if (!this.f19879b) {
                return j().e(aVar);
            }
            aVar.p1();
            return null;
        }

        public void i(pa.d dVar, T t10) throws IOException {
            if (this.f19880c) {
                dVar.N();
            } else {
                j().i(dVar, t10);
            }
        }

        public final y<T> j() {
            y<T> yVar = this.f19878a;
            if (yVar != null) {
                return yVar;
            }
            y<T> r10 = this.f19881d.r(d.this, this.f19882e);
            this.f19878a = r10;
            return r10;
        }
    }

    public <T> y<T> a(e eVar, oa.a<T> aVar) {
        Class<? super T> f10 = aVar.f();
        boolean j10 = j(f10);
        boolean z10 = j10 || k(f10, true);
        boolean z11 = j10 || k(f10, false);
        if (z10 || z11) {
            return new a(z11, z10, eVar, aVar);
        }
        return null;
    }

    /* renamed from: d */
    public d clone() {
        try {
            return (d) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public d g() {
        d d10 = clone();
        d10.Q = false;
        return d10;
    }

    public boolean i(Class<?> cls, boolean z10) {
        return j(cls) || k(cls, z10);
    }

    public final boolean j(Class<?> cls) {
        if (this.O == -1.0d || u((ia.d) cls.getAnnotation(ia.d.class), (ia.e) cls.getAnnotation(ia.e.class))) {
            return (!this.Q && q(cls)) || p(cls);
        }
        return true;
    }

    public final boolean k(Class<?> cls, boolean z10) {
        for (ha.a a10 : z10 ? this.S : this.T) {
            if (a10.a(cls)) {
                return true;
            }
        }
        return false;
    }

    public boolean m(Field field, boolean z10) {
        ia.a aVar;
        if ((this.P & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.O != -1.0d && !u((ia.d) field.getAnnotation(ia.d.class), (ia.e) field.getAnnotation(ia.e.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.R && ((aVar = (ia.a) field.getAnnotation(ia.a.class)) == null || (!z10 ? !aVar.deserialize() : !aVar.serialize()))) {
            return true;
        }
        if ((!this.Q && q(field.getType())) || p(field.getType())) {
            return true;
        }
        List<ha.a> list = z10 ? this.S : this.T;
        if (list.isEmpty()) {
            return false;
        }
        b bVar = new b(field);
        for (ha.a b10 : list) {
            if (b10.b(bVar)) {
                return true;
            }
        }
        return false;
    }

    public d n() {
        d d10 = clone();
        d10.R = true;
        return d10;
    }

    public final boolean p(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && !r(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    public final boolean q(Class<?> cls) {
        return cls.isMemberClass() && !r(cls);
    }

    public final boolean r(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    public final boolean s(ia.d dVar) {
        return dVar == null || dVar.value() <= this.O;
    }

    public final boolean t(ia.e eVar) {
        return eVar == null || eVar.value() > this.O;
    }

    public final boolean u(ia.d dVar, ia.e eVar) {
        return s(dVar) && t(eVar);
    }

    public d v(ha.a aVar, boolean z10, boolean z11) {
        d d10 = clone();
        if (z10) {
            ArrayList arrayList = new ArrayList(this.S);
            d10.S = arrayList;
            arrayList.add(aVar);
        }
        if (z11) {
            ArrayList arrayList2 = new ArrayList(this.T);
            d10.T = arrayList2;
            arrayList2.add(aVar);
        }
        return d10;
    }

    public d w(int... iArr) {
        d d10 = clone();
        d10.P = 0;
        for (int i10 : iArr) {
            d10.P = i10 | d10.P;
        }
        return d10;
    }

    public d x(double d10) {
        d d11 = clone();
        d11.O = d10;
        return d11;
    }
}
