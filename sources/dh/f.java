package dh;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.greenrobot.eventbus.EventBusException;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.SubscriberMethod;
import org.greenrobot.eventbus.meta.SubscriberInfo;
import org.greenrobot.eventbus.meta.SubscriberInfoIndex;

public class f {

    /* renamed from: d  reason: collision with root package name */
    public static final int f18381d = 64;

    /* renamed from: e  reason: collision with root package name */
    public static final int f18382e = 4096;

    /* renamed from: f  reason: collision with root package name */
    public static final int f18383f = 5192;

    /* renamed from: g  reason: collision with root package name */
    public static final Map<Class<?>, List<SubscriberMethod>> f18384g = new ConcurrentHashMap();

    /* renamed from: h  reason: collision with root package name */
    public static final int f18385h = 4;

    /* renamed from: i  reason: collision with root package name */
    public static final a[] f18386i = new a[4];

    /* renamed from: a  reason: collision with root package name */
    public List<SubscriberInfoIndex> f18387a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f18388b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f18389c;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final List<SubscriberMethod> f18390a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final Map<Class, Object> f18391b = new HashMap();

        /* renamed from: c  reason: collision with root package name */
        public final Map<String, Class> f18392c = new HashMap();

        /* renamed from: d  reason: collision with root package name */
        public final StringBuilder f18393d = new StringBuilder(128);

        /* renamed from: e  reason: collision with root package name */
        public Class<?> f18394e;

        /* renamed from: f  reason: collision with root package name */
        public Class<?> f18395f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f18396g;

        /* renamed from: h  reason: collision with root package name */
        public SubscriberInfo f18397h;

        public boolean a(Method method, Class<?> cls) {
            Object put = this.f18391b.put(cls, method);
            if (put == null) {
                return true;
            }
            if (put instanceof Method) {
                if (b((Method) put, cls)) {
                    this.f18391b.put(cls, this);
                } else {
                    throw new IllegalStateException();
                }
            }
            return b(method, cls);
        }

        public final boolean b(Method method, Class<?> cls) {
            this.f18393d.setLength(0);
            this.f18393d.append(method.getName());
            StringBuilder sb2 = this.f18393d;
            sb2.append('>');
            sb2.append(cls.getName());
            String sb3 = this.f18393d.toString();
            Class<?> declaringClass = method.getDeclaringClass();
            Class put = this.f18392c.put(sb3, declaringClass);
            if (put == null || put.isAssignableFrom(declaringClass)) {
                return true;
            }
            this.f18392c.put(sb3, put);
            return false;
        }

        public void c(Class<?> cls) {
            this.f18395f = cls;
            this.f18394e = cls;
            this.f18396g = false;
            this.f18397h = null;
        }

        public void d() {
            if (!this.f18396g) {
                Class<? super Object> superclass = this.f18395f.getSuperclass();
                this.f18395f = superclass;
                String name = superclass.getName();
                if (!name.startsWith("java.") && !name.startsWith("javax.") && !name.startsWith("android.")) {
                    return;
                }
            }
            this.f18395f = null;
        }

        public void e() {
            this.f18390a.clear();
            this.f18391b.clear();
            this.f18392c.clear();
            this.f18393d.setLength(0);
            this.f18394e = null;
            this.f18395f = null;
            this.f18396g = false;
            this.f18397h = null;
        }
    }

    public f(List<SubscriberInfoIndex> list, boolean z10, boolean z11) {
        this.f18387a = list;
        this.f18388b = z10;
        this.f18389c = z11;
    }

    public static void a() {
        f18384g.clear();
    }

    public List<SubscriberMethod> b(Class<?> cls) {
        Map<Class<?>, List<SubscriberMethod>> map = f18384g;
        List<SubscriberMethod> list = map.get(cls);
        if (list != null) {
            return list;
        }
        List<SubscriberMethod> d10 = this.f18389c ? d(cls) : c(cls);
        if (!d10.isEmpty()) {
            map.put(cls, d10);
            return d10;
        }
        throw new EventBusException("Subscriber " + cls + " and its super classes have no public methods with the @Subscribe annotation");
    }

    public final List<SubscriberMethod> c(Class<?> cls) {
        a h10 = h();
        h10.c(cls);
        while (h10.f18395f != null) {
            SubscriberInfo g10 = g(h10);
            h10.f18397h = g10;
            if (g10 != null) {
                for (SubscriberMethod subscriberMethod : g10.getSubscriberMethods()) {
                    if (h10.a(subscriberMethod.f21881a, subscriberMethod.f21883c)) {
                        h10.f18390a.add(subscriberMethod);
                    }
                }
            } else {
                e(h10);
            }
            h10.d();
        }
        return f(h10);
    }

    public final List<SubscriberMethod> d(Class<?> cls) {
        a h10 = h();
        h10.c(cls);
        while (h10.f18395f != null) {
            e(h10);
            h10.d();
        }
        return f(h10);
    }

    public final void e(a aVar) {
        Method[] methodArr;
        try {
            methodArr = aVar.f18395f.getDeclaredMethods();
        } catch (Throwable unused) {
            methodArr = aVar.f18395f.getMethods();
            aVar.f18396g = true;
        }
        for (Method method : methodArr) {
            int modifiers = method.getModifiers();
            if ((modifiers & 1) != 0 && (modifiers & f18383f) == 0) {
                Class[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1) {
                    Subscribe subscribe = (Subscribe) method.getAnnotation(Subscribe.class);
                    if (subscribe != null) {
                        Class cls = parameterTypes[0];
                        if (aVar.a(method, cls)) {
                            aVar.f18390a.add(new SubscriberMethod(method, cls, subscribe.threadMode(), subscribe.priority(), subscribe.sticky()));
                        }
                    }
                } else if (this.f18388b && method.isAnnotationPresent(Subscribe.class)) {
                    throw new EventBusException("@Subscribe method " + (method.getDeclaringClass().getName() + "." + method.getName()) + "must have exactly 1 parameter but has " + parameterTypes.length);
                }
            } else if (this.f18388b && method.isAnnotationPresent(Subscribe.class)) {
                throw new EventBusException((method.getDeclaringClass().getName() + "." + method.getName()) + " is a illegal @Subscribe method: must be public, non-static, and non-abstract");
            }
        }
    }

    public final List<SubscriberMethod> f(a aVar) {
        ArrayList arrayList = new ArrayList(aVar.f18390a);
        aVar.e();
        synchronized (f18386i) {
            int i10 = 0;
            while (true) {
                if (i10 >= 4) {
                    break;
                }
                a[] aVarArr = f18386i;
                if (aVarArr[i10] == null) {
                    aVarArr[i10] = aVar;
                    break;
                }
                i10++;
            }
        }
        return arrayList;
    }

    public final SubscriberInfo g(a aVar) {
        SubscriberInfo subscriberInfo = aVar.f18397h;
        if (!(subscriberInfo == null || subscriberInfo.getSuperSubscriberInfo() == null)) {
            SubscriberInfo superSubscriberInfo = aVar.f18397h.getSuperSubscriberInfo();
            if (aVar.f18395f == superSubscriberInfo.getSubscriberClass()) {
                return superSubscriberInfo;
            }
        }
        List<SubscriberInfoIndex> list = this.f18387a;
        if (list == null) {
            return null;
        }
        for (SubscriberInfoIndex subscriberInfo2 : list) {
            SubscriberInfo subscriberInfo3 = subscriberInfo2.getSubscriberInfo(aVar.f18395f);
            if (subscriberInfo3 != null) {
                return subscriberInfo3;
            }
        }
        return null;
    }

    public final a h() {
        synchronized (f18386i) {
            for (int i10 = 0; i10 < 4; i10++) {
                a[] aVarArr = f18386i;
                a aVar = aVarArr[i10];
                if (aVar != null) {
                    aVarArr[i10] = null;
                    return aVar;
                }
            }
            return new a();
        }
    }
}
