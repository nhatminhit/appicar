package m5;

import i5.f;
import i5.g;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l5.y;
import n5.p;
import w4.j;

public abstract class k {

    public static class a extends y.a implements Serializable {
        public static final long Q = 2;
        public static final a R = new a();

        public a() {
            super((Class<?>) ArrayList.class);
        }

        public boolean i() {
            return true;
        }

        public boolean k() {
            return true;
        }

        public Object t(g gVar) throws IOException {
            return new ArrayList();
        }
    }

    public static class b extends y.a implements Serializable {
        public static final long R = 2;
        public final Object Q;

        public b(Object obj) {
            super(obj.getClass());
            this.Q = obj;
        }

        public boolean i() {
            return true;
        }

        public boolean k() {
            return true;
        }

        public Object t(g gVar) throws IOException {
            return this.Q;
        }
    }

    public static class c extends y.a implements Serializable {
        public static final long Q = 2;
        public static final c R = new c();

        public c() {
            super((Class<?>) HashMap.class);
        }

        public boolean i() {
            return true;
        }

        public boolean k() {
            return true;
        }

        public Object t(g gVar) throws IOException {
            return new HashMap();
        }
    }

    public static class d extends y.a implements Serializable {
        public static final long Q = 2;
        public static final d R = new d();

        public d() {
            super((Class<?>) LinkedHashMap.class);
        }

        public boolean i() {
            return true;
        }

        public boolean k() {
            return true;
        }

        public Object t(g gVar) throws IOException {
            return new LinkedHashMap();
        }
    }

    public static y a(f fVar, Class<?> cls) {
        if (cls == j.class) {
            return new p();
        }
        if (Collection.class.isAssignableFrom(cls)) {
            if (cls == ArrayList.class) {
                return a.R;
            }
            Set set = Collections.EMPTY_SET;
            if (set.getClass() == cls) {
                return new b(set);
            }
            List list = Collections.EMPTY_LIST;
            if (list.getClass() == cls) {
                return new b(list);
            }
            return null;
        } else if (!Map.class.isAssignableFrom(cls)) {
            return null;
        } else {
            if (cls == LinkedHashMap.class) {
                return d.R;
            }
            if (cls == HashMap.class) {
                return c.R;
            }
            if (Collections.EMPTY_MAP.getClass() == cls) {
                return new b(Collections.EMPTY_MAP);
            }
            return null;
        }
    }
}
