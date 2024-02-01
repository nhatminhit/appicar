package org.greenrobot.eventbus;

import dh.e;
import dh.f;
import dh.g;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.logging.Level;
import org.greenrobot.eventbus.meta.SubscriberInfoIndex;

public class EventBus {
    public static String TAG = "EventBus";

    /* renamed from: s  reason: collision with root package name */
    public static volatile EventBus f21835s;

    /* renamed from: t  reason: collision with root package name */
    public static final EventBusBuilder f21836t = new EventBusBuilder();

    /* renamed from: u  reason: collision with root package name */
    public static final Map<Class<?>, List<Class<?>>> f21837u = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class<?>, CopyOnWriteArrayList<g>> f21838a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Object, List<Class<?>>> f21839b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<Class<?>, Object> f21840c;

    /* renamed from: d  reason: collision with root package name */
    public final ThreadLocal<d> f21841d;

    /* renamed from: e  reason: collision with root package name */
    public final MainThreadSupport f21842e;

    /* renamed from: f  reason: collision with root package name */
    public final e f21843f;

    /* renamed from: g  reason: collision with root package name */
    public final dh.b f21844g;

    /* renamed from: h  reason: collision with root package name */
    public final dh.a f21845h;

    /* renamed from: i  reason: collision with root package name */
    public final f f21846i;

    /* renamed from: j  reason: collision with root package name */
    public final ExecutorService f21847j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f21848k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f21849l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f21850m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f21851n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f21852o;

    /* renamed from: p  reason: collision with root package name */
    public final boolean f21853p;

    /* renamed from: q  reason: collision with root package name */
    public final int f21854q;

    /* renamed from: r  reason: collision with root package name */
    public final Logger f21855r;

    public class a extends ThreadLocal<d> {
        public a() {
        }

        /* renamed from: a */
        public d initialValue() {
            return new d();
        }
    }

    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f21857a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                org.greenrobot.eventbus.ThreadMode[] r0 = org.greenrobot.eventbus.ThreadMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f21857a = r0
                org.greenrobot.eventbus.ThreadMode r1 = org.greenrobot.eventbus.ThreadMode.POSTING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f21857a     // Catch:{ NoSuchFieldError -> 0x001d }
                org.greenrobot.eventbus.ThreadMode r1 = org.greenrobot.eventbus.ThreadMode.MAIN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f21857a     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.greenrobot.eventbus.ThreadMode r1 = org.greenrobot.eventbus.ThreadMode.MAIN_ORDERED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f21857a     // Catch:{ NoSuchFieldError -> 0x0033 }
                org.greenrobot.eventbus.ThreadMode r1 = org.greenrobot.eventbus.ThreadMode.BACKGROUND     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f21857a     // Catch:{ NoSuchFieldError -> 0x003e }
                org.greenrobot.eventbus.ThreadMode r1 = org.greenrobot.eventbus.ThreadMode.ASYNC     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.greenrobot.eventbus.EventBus.b.<clinit>():void");
        }
    }

    public interface c {
        void a(List<SubscriberExceptionEvent> list);
    }

    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final List<Object> f21858a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public boolean f21859b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f21860c;

        /* renamed from: d  reason: collision with root package name */
        public g f21861d;

        /* renamed from: e  reason: collision with root package name */
        public Object f21862e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f21863f;
    }

    public EventBus() {
        this(f21836t);
    }

    public EventBus(EventBusBuilder eventBusBuilder) {
        this.f21841d = new a();
        this.f21855r = eventBusBuilder.b();
        this.f21838a = new HashMap();
        this.f21839b = new HashMap();
        this.f21840c = new ConcurrentHashMap();
        MainThreadSupport c10 = eventBusBuilder.c();
        this.f21842e = c10;
        this.f21843f = c10 != null ? c10.createPoster(this) : null;
        this.f21844g = new dh.b(this);
        this.f21845h = new dh.a(this);
        List<SubscriberInfoIndex> list = eventBusBuilder.f21875k;
        this.f21854q = list != null ? list.size() : 0;
        this.f21846i = new f(eventBusBuilder.f21875k, eventBusBuilder.f21872h, eventBusBuilder.f21871g);
        this.f21849l = eventBusBuilder.f21865a;
        this.f21850m = eventBusBuilder.f21866b;
        this.f21851n = eventBusBuilder.f21867c;
        this.f21852o = eventBusBuilder.f21868d;
        this.f21848k = eventBusBuilder.f21869e;
        this.f21853p = eventBusBuilder.f21870f;
        this.f21847j = eventBusBuilder.f21873i;
    }

    public static void a(List<Class<?>> list, Class<?>[] clsArr) {
        for (Class<?> cls : clsArr) {
            if (!list.contains(cls)) {
                list.add(cls);
                a(list, cls.getInterfaces());
            }
        }
    }

    public static EventBusBuilder builder() {
        return new EventBusBuilder();
    }

    public static void clearCaches() {
        f.a();
        f21837u.clear();
    }

    public static EventBus getDefault() {
        if (f21835s == null) {
            synchronized (EventBus.class) {
                if (f21835s == null) {
                    f21835s = new EventBus();
                }
            }
        }
        return f21835s;
    }

    public static List<Class<?>> h(Class<?> cls) {
        List<Class<?>> list;
        Map<Class<?>, List<Class<?>>> map = f21837u;
        synchronized (map) {
            list = map.get(cls);
            if (list == null) {
                list = new ArrayList<>();
                for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
                    list.add(cls2);
                    a(list, cls2.getInterfaces());
                }
                f21837u.put(cls, list);
            }
        }
        return list;
    }

    public final void b(g gVar, Object obj) {
        if (obj != null) {
            k(gVar, obj, g());
        }
    }

    public ExecutorService c() {
        return this.f21847j;
    }

    public void cancelEventDelivery(Object obj) {
        d dVar = this.f21841d.get();
        if (!dVar.f21859b) {
            throw new EventBusException("This method may only be called from inside event handling methods on the posting thread");
        } else if (obj == null) {
            throw new EventBusException("Event may not be null");
        } else if (dVar.f21862e != obj) {
            throw new EventBusException("Only the currently handled event may be aborted");
        } else if (dVar.f21861d.f18399b.f21882b == ThreadMode.POSTING) {
            dVar.f21863f = true;
        } else {
            throw new EventBusException(" event handlers may only abort the incoming event");
        }
    }

    public final void d(g gVar, Object obj, Throwable th2) {
        if (obj instanceof SubscriberExceptionEvent) {
            if (this.f21849l) {
                Logger logger = this.f21855r;
                Level level = Level.SEVERE;
                logger.log(level, "SubscriberExceptionEvent subscriber " + gVar.f18398a.getClass() + " threw an exception", th2);
                SubscriberExceptionEvent subscriberExceptionEvent = (SubscriberExceptionEvent) obj;
                Logger logger2 = this.f21855r;
                logger2.log(level, "Initial event " + subscriberExceptionEvent.causingEvent + " caused exception in " + subscriberExceptionEvent.causingSubscriber, subscriberExceptionEvent.throwable);
            }
        } else if (!this.f21848k) {
            if (this.f21849l) {
                Logger logger3 = this.f21855r;
                Level level2 = Level.SEVERE;
                logger3.log(level2, "Could not dispatch event: " + obj.getClass() + " to subscribing class " + gVar.f18398a.getClass(), th2);
            }
            if (this.f21851n) {
                post(new SubscriberExceptionEvent(this, th2, obj, gVar.f18398a));
            }
        } else {
            throw new EventBusException("Invoking subscriber failed", th2);
        }
    }

    public void e(dh.c cVar) {
        Object obj = cVar.f18376a;
        g gVar = cVar.f18377b;
        dh.c.b(cVar);
        if (gVar.f18400c) {
            f(gVar, obj);
        }
    }

    public void f(g gVar, Object obj) {
        try {
            gVar.f18399b.f21881a.invoke(gVar.f18398a, new Object[]{obj});
        } catch (InvocationTargetException e10) {
            d(gVar, obj, e10.getCause());
        } catch (IllegalAccessException e11) {
            throw new IllegalStateException("Unexpected exception", e11);
        }
    }

    public final boolean g() {
        MainThreadSupport mainThreadSupport = this.f21842e;
        if (mainThreadSupport != null) {
            return mainThreadSupport.isMainThread();
        }
        return true;
    }

    public Logger getLogger() {
        return this.f21855r;
    }

    public <T> T getStickyEvent(Class<T> cls) {
        T cast;
        synchronized (this.f21840c) {
            cast = cls.cast(this.f21840c.get(cls));
        }
        return cast;
    }

    public boolean hasSubscriberForEvent(Class<?> cls) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        List<Class<?>> h10 = h(cls);
        if (h10 != null) {
            int size = h10.size();
            for (int i10 = 0; i10 < size; i10++) {
                Class cls2 = h10.get(i10);
                synchronized (this) {
                    copyOnWriteArrayList = this.f21838a.get(cls2);
                }
                if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void i(Object obj, d dVar) throws Error {
        boolean z10;
        Class<?> cls = obj.getClass();
        if (this.f21853p) {
            List<Class<?>> h10 = h(cls);
            int size = h10.size();
            z10 = false;
            for (int i10 = 0; i10 < size; i10++) {
                z10 |= j(obj, dVar, h10.get(i10));
            }
        } else {
            z10 = j(obj, dVar, cls);
        }
        if (!z10) {
            if (this.f21850m) {
                this.f21855r.log(Level.FINE, "No subscribers registered for event " + cls);
            }
            if (this.f21852o && cls != NoSubscriberEvent.class && cls != SubscriberExceptionEvent.class) {
                post(new NoSubscriberEvent(this, obj));
            }
        }
    }

    public synchronized boolean isRegistered(Object obj) {
        return this.f21839b.containsKey(obj);
    }

    public final boolean j(Object obj, d dVar, Class<?> cls) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = this.f21838a.get(cls);
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            dVar.f21862e = obj;
            dVar.f21861d = gVar;
            try {
                k(gVar, obj, dVar.f21860c);
                if (dVar.f21863f) {
                    return true;
                }
            } finally {
                dVar.f21862e = null;
                dVar.f21861d = null;
                dVar.f21863f = false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0046, code lost:
        if (r5 != null) goto L_0x004e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k(dh.g r3, java.lang.Object r4, boolean r5) {
        /*
            r2 = this;
            int[] r0 = org.greenrobot.eventbus.EventBus.b.f21857a
            org.greenrobot.eventbus.SubscriberMethod r1 = r3.f18399b
            org.greenrobot.eventbus.ThreadMode r1 = r1.f21882b
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L_0x0052
            r1 = 2
            if (r0 == r1) goto L_0x0049
            r1 = 3
            if (r0 == r1) goto L_0x0044
            r1 = 4
            if (r0 == r1) goto L_0x003c
            r5 = 5
            if (r0 != r5) goto L_0x0021
            dh.a r5 = r2.f21845h
            r5.enqueue(r3, r4)
            goto L_0x0055
        L_0x0021:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Unknown thread mode: "
            r5.append(r0)
            org.greenrobot.eventbus.SubscriberMethod r3 = r3.f18399b
            org.greenrobot.eventbus.ThreadMode r3 = r3.f21882b
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3)
            throw r4
        L_0x003c:
            if (r5 == 0) goto L_0x0052
            dh.b r5 = r2.f21844g
            r5.enqueue(r3, r4)
            goto L_0x0055
        L_0x0044:
            dh.e r5 = r2.f21843f
            if (r5 == 0) goto L_0x0052
            goto L_0x004e
        L_0x0049:
            if (r5 == 0) goto L_0x004c
            goto L_0x0052
        L_0x004c:
            dh.e r5 = r2.f21843f
        L_0x004e:
            r5.enqueue(r3, r4)
            goto L_0x0055
        L_0x0052:
            r2.f(r3, r4)
        L_0x0055:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.greenrobot.eventbus.EventBus.k(dh.g, java.lang.Object, boolean):void");
    }

    public final void l(Object obj, SubscriberMethod subscriberMethod) {
        Class<?> cls = subscriberMethod.f21883c;
        g gVar = new g(obj, subscriberMethod);
        CopyOnWriteArrayList copyOnWriteArrayList = this.f21838a.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            this.f21838a.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(gVar)) {
            throw new EventBusException("Subscriber " + obj.getClass() + " already registered to event " + cls);
        }
        int size = copyOnWriteArrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 > size) {
                break;
            } else if (i10 == size || subscriberMethod.f21884d > ((g) copyOnWriteArrayList.get(i10)).f18399b.f21884d) {
                copyOnWriteArrayList.add(i10, gVar);
            } else {
                i10++;
            }
        }
        copyOnWriteArrayList.add(i10, gVar);
        List list = this.f21839b.get(obj);
        if (list == null) {
            list = new ArrayList();
            this.f21839b.put(obj, list);
        }
        list.add(cls);
        if (!subscriberMethod.f21885e) {
            return;
        }
        if (this.f21853p) {
            for (Map.Entry next : this.f21840c.entrySet()) {
                if (cls.isAssignableFrom((Class) next.getKey())) {
                    b(gVar, next.getValue());
                }
            }
            return;
        }
        b(gVar, this.f21840c.get(cls));
    }

    public final void m(Object obj, Class<?> cls) {
        List list = this.f21838a.get(cls);
        if (list != null) {
            int size = list.size();
            int i10 = 0;
            while (i10 < size) {
                g gVar = (g) list.get(i10);
                if (gVar.f18398a == obj) {
                    gVar.f18400c = false;
                    list.remove(i10);
                    i10--;
                    size--;
                }
                i10++;
            }
        }
    }

    public void post(Object obj) {
        d dVar = this.f21841d.get();
        List<Object> list = dVar.f21858a;
        list.add(obj);
        if (!dVar.f21859b) {
            dVar.f21860c = g();
            dVar.f21859b = true;
            if (!dVar.f21863f) {
                while (!list.isEmpty()) {
                    try {
                        i(list.remove(0), dVar);
                    } finally {
                        dVar.f21859b = false;
                        dVar.f21860c = false;
                    }
                }
                return;
            }
            throw new EventBusException("Internal error. Abort state was not reset");
        }
    }

    public void postSticky(Object obj) {
        synchronized (this.f21840c) {
            this.f21840c.put(obj.getClass(), obj);
        }
        post(obj);
    }

    public void register(Object obj) {
        List<SubscriberMethod> b10 = this.f21846i.b(obj.getClass());
        synchronized (this) {
            for (SubscriberMethod l10 : b10) {
                l(obj, l10);
            }
        }
    }

    public void removeAllStickyEvents() {
        synchronized (this.f21840c) {
            this.f21840c.clear();
        }
    }

    public <T> T removeStickyEvent(Class<T> cls) {
        T cast;
        synchronized (this.f21840c) {
            cast = cls.cast(this.f21840c.remove(cls));
        }
        return cast;
    }

    public boolean removeStickyEvent(Object obj) {
        synchronized (this.f21840c) {
            Class<?> cls = obj.getClass();
            if (!obj.equals(this.f21840c.get(cls))) {
                return false;
            }
            this.f21840c.remove(cls);
            return true;
        }
    }

    public String toString() {
        return "EventBus[indexCount=" + this.f21854q + ", eventInheritance=" + this.f21853p + "]";
    }

    public synchronized void unregister(Object obj) {
        List<Class> list = this.f21839b.get(obj);
        if (list != null) {
            for (Class m10 : list) {
                m(obj, m10);
            }
            this.f21839b.remove(obj);
        } else {
            Logger logger = this.f21855r;
            Level level = Level.WARNING;
            logger.log(level, "Subscriber to unregister was not registered before: " + obj.getClass());
        }
    }
}
