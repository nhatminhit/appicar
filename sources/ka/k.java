package ka;

import ha.d;
import ha.e;
import ha.u;
import ha.y;
import ha.z;
import ja.m;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class k implements z {
    public final ja.c O;
    public final d P;
    public final ja.d Q;
    public final e R;
    public final ma.b S = ma.b.a();

    public class a extends c {

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ Field f20030d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ boolean f20031e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ y f20032f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ e f20033g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ oa.a f20034h;

        /* renamed from: i  reason: collision with root package name */
        public final /* synthetic */ boolean f20035i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, boolean z10, boolean z11, Field field, boolean z12, y yVar, e eVar, oa.a aVar, boolean z13) {
            super(str, z10, z11);
            this.f20030d = field;
            this.f20031e = z12;
            this.f20032f = yVar;
            this.f20033g = eVar;
            this.f20034h = aVar;
            this.f20035i = z13;
        }

        public void a(pa.a aVar, Object obj) throws IOException, IllegalAccessException {
            Object e10 = this.f20032f.e(aVar);
            if (e10 != null || !this.f20035i) {
                this.f20030d.set(obj, e10);
            }
        }

        public void b(pa.d dVar, Object obj) throws IOException, IllegalAccessException {
            (this.f20031e ? this.f20032f : new m(this.f20033g, this.f20032f, this.f20034h.h())).i(dVar, this.f20030d.get(obj));
        }

        public boolean c(Object obj) throws IOException, IllegalAccessException {
            return this.f20040b && this.f20030d.get(obj) != obj;
        }
    }

    public static final class b<T> extends y<T> {

        /* renamed from: a  reason: collision with root package name */
        public final ja.k<T> f20037a;

        /* renamed from: b  reason: collision with root package name */
        public final Map<String, c> f20038b;

        public b(ja.k<T> kVar, Map<String, c> map) {
            this.f20037a = kVar;
            this.f20038b = map;
        }

        public T e(pa.a aVar) throws IOException {
            if (aVar.z0() == pa.c.NULL) {
                aVar.c0();
                return null;
            }
            T a10 = this.f20037a.a();
            try {
                aVar.f();
                while (aVar.o()) {
                    c cVar = this.f20038b.get(aVar.Y());
                    if (cVar != null) {
                        if (cVar.f20041c) {
                            cVar.a(aVar, a10);
                        }
                    }
                    aVar.p1();
                }
                aVar.l();
                return a10;
            } catch (IllegalStateException e10) {
                throw new u((Throwable) e10);
            } catch (IllegalAccessException e11) {
                throw new AssertionError(e11);
            }
        }

        public void i(pa.d dVar, T t10) throws IOException {
            if (t10 == null) {
                dVar.N();
                return;
            }
            dVar.h();
            try {
                for (c next : this.f20038b.values()) {
                    if (next.c(t10)) {
                        dVar.w(next.f20039a);
                        next.b(dVar, t10);
                    }
                }
                dVar.l();
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public final String f20039a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f20040b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f20041c;

        public c(String str, boolean z10, boolean z11) {
            this.f20039a = str;
            this.f20040b = z10;
            this.f20041c = z11;
        }

        public abstract void a(pa.a aVar, Object obj) throws IOException, IllegalAccessException;

        public abstract void b(pa.d dVar, Object obj) throws IOException, IllegalAccessException;

        public abstract boolean c(Object obj) throws IOException, IllegalAccessException;
    }

    public k(ja.c cVar, d dVar, ja.d dVar2, e eVar) {
        this.O = cVar;
        this.P = dVar;
        this.Q = dVar2;
        this.R = eVar;
    }

    public static boolean d(Field field, boolean z10, ja.d dVar) {
        return !dVar.i(field.getType(), z10) && !dVar.m(field, z10);
    }

    public <T> y<T> a(e eVar, oa.a<T> aVar) {
        Class<? super T> f10 = aVar.f();
        if (!Object.class.isAssignableFrom(f10)) {
            return null;
        }
        return new b(this.O.a(aVar), e(eVar, aVar, f10));
    }

    public final c b(e eVar, Field field, String str, oa.a<?> aVar, boolean z10, boolean z11) {
        e eVar2 = eVar;
        oa.a<?> aVar2 = aVar;
        boolean a10 = m.a(aVar.f());
        Field field2 = field;
        ia.b bVar = (ia.b) field.getAnnotation(ia.b.class);
        y<?> b10 = bVar != null ? this.R.b(this.O, eVar, aVar2, bVar) : null;
        boolean z12 = b10 != null;
        if (b10 == null) {
            b10 = eVar.q(aVar2);
        }
        return new a(str, z10, z11, field, z12, b10, eVar, aVar, a10);
    }

    public boolean c(Field field, boolean z10) {
        return d(field, z10, this.Q);
    }

    public final Map<String, c> e(e eVar, oa.a<?> aVar, Class<?> cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type h10 = aVar.h();
        oa.a<?> aVar2 = aVar;
        Class<? super Object> cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            int length = declaredFields.length;
            boolean z10 = false;
            int i10 = 0;
            while (i10 < length) {
                Field field = declaredFields[i10];
                boolean c10 = c(field, true);
                boolean c11 = c(field, z10);
                if (c10 || c11) {
                    this.S.b(field);
                    Type p10 = ja.b.p(aVar2.h(), cls2, field.getGenericType());
                    List<String> f10 = f(field);
                    int size = f10.size();
                    c cVar = null;
                    int i11 = z10;
                    while (i11 < size) {
                        String str = f10.get(i11);
                        boolean z11 = i11 != 0 ? z10 : c10;
                        String str2 = str;
                        int i12 = i11;
                        c cVar2 = cVar;
                        int i13 = size;
                        List<String> list = f10;
                        Field field2 = field;
                        cVar = cVar2 == null ? (c) linkedHashMap.put(str2, b(eVar, field, str2, oa.a.c(p10), z11, c11)) : cVar2;
                        i11 = i12 + 1;
                        c10 = z11;
                        f10 = list;
                        size = i13;
                        field = field2;
                        z10 = false;
                    }
                    c cVar3 = cVar;
                    if (cVar3 != null) {
                        throw new IllegalArgumentException(h10 + " declares multiple JSON fields named " + cVar3.f20039a);
                    }
                }
                i10++;
                z10 = false;
            }
            aVar2 = oa.a.c(ja.b.p(aVar2.h(), cls2, cls2.getGenericSuperclass()));
            cls2 = aVar2.f();
        }
        return linkedHashMap;
    }

    public final List<String> f(Field field) {
        ia.c cVar = (ia.c) field.getAnnotation(ia.c.class);
        if (cVar == null) {
            return Collections.singletonList(this.P.a(field));
        }
        String value = cVar.value();
        String[] alternate = cVar.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        for (String add : alternate) {
            arrayList.add(add);
        }
        return arrayList;
    }
}
