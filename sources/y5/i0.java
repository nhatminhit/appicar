package y5;

import i5.e0;
import i5.j;
import i5.l;
import i5.m;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URL;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Currency;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import s5.g;
import w4.h;
import w4.i;
import w4.l;

public class i0 {

    public static class a extends l0<AtomicBoolean> {
        public a() {
            super(AtomicBoolean.class, false);
        }

        /* renamed from: M */
        public void m(AtomicBoolean atomicBoolean, i iVar, e0 e0Var) throws IOException, h {
            iVar.c2(atomicBoolean.get());
        }

        public m a(e0 e0Var, Type type) {
            return u("boolean", true);
        }

        public void e(g gVar, j jVar) throws l {
            gVar.n(jVar);
        }
    }

    public static class b extends l0<AtomicInteger> {
        public b() {
            super(AtomicInteger.class, false);
        }

        /* renamed from: M */
        public void m(AtomicInteger atomicInteger, i iVar, e0 e0Var) throws IOException, h {
            iVar.o2(atomicInteger.get());
        }

        public m a(e0 e0Var, Type type) {
            return u("integer", true);
        }

        public void e(g gVar, j jVar) throws l {
            G(gVar, jVar, l.b.INT);
        }
    }

    public static class c extends l0<AtomicLong> {
        public c() {
            super(AtomicLong.class, false);
        }

        /* renamed from: M */
        public void m(AtomicLong atomicLong, i iVar, e0 e0Var) throws IOException, h {
            iVar.p2(atomicLong.get());
        }

        public m a(e0 e0Var, Type type) {
            return u("integer", true);
        }

        public void e(g gVar, j jVar) throws i5.l {
            G(gVar, jVar, l.b.LONG);
        }
    }

    public static Collection<Map.Entry<Class<?>, Object>> a() {
        HashMap hashMap = new HashMap();
        hashMap.put(URL.class, new p0(URL.class));
        hashMap.put(URI.class, new p0(URI.class));
        hashMap.put(Currency.class, new p0(Currency.class));
        hashMap.put(UUID.class, new s0());
        hashMap.put(Pattern.class, new p0(Pattern.class));
        hashMap.put(Locale.class, new p0(Locale.class));
        hashMap.put(AtomicBoolean.class, a.class);
        hashMap.put(AtomicInteger.class, b.class);
        hashMap.put(AtomicLong.class, c.class);
        hashMap.put(File.class, o.class);
        hashMap.put(Class.class, i.class);
        w wVar = w.R;
        hashMap.put(Void.class, wVar);
        hashMap.put(Void.TYPE, wVar);
        try {
            hashMap.put(Timestamp.class, k.U);
            hashMap.put(Date.class, d0.class);
            hashMap.put(Time.class, e0.class);
        } catch (NoClassDefFoundError unused) {
        }
        return hashMap.entrySet();
    }
}
