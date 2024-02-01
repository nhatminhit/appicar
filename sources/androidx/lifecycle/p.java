package androidx.lifecycle;

import d.j0;
import d.x0;
import fh.g;
import fh.h;
import java.util.concurrent.atomic.AtomicReference;
import ve.m;
import xe.l0;
import xe.w;

public abstract class p {
    @x0({x0.a.P})
    @g

    /* renamed from: a  reason: collision with root package name */
    public AtomicReference<Object> f2828a = new AtomicReference<>();

    public enum a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;
        
        @g
        public static final C0040a Companion = null;

        /* renamed from: androidx.lifecycle.p$a$a  reason: collision with other inner class name */
        public static final class C0040a {

            /* renamed from: androidx.lifecycle.p$a$a$a  reason: collision with other inner class name */
            public /* synthetic */ class C0041a {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f2829a = null;

                /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
                static {
                    /*
                        androidx.lifecycle.p$b[] r0 = androidx.lifecycle.p.b.values()
                        int r0 = r0.length
                        int[] r0 = new int[r0]
                        androidx.lifecycle.p$b r1 = androidx.lifecycle.p.b.CREATED     // Catch:{ NoSuchFieldError -> 0x0010 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                        r2 = 1
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                    L_0x0010:
                        androidx.lifecycle.p$b r1 = androidx.lifecycle.p.b.STARTED     // Catch:{ NoSuchFieldError -> 0x0019 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                        r2 = 2
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                    L_0x0019:
                        androidx.lifecycle.p$b r1 = androidx.lifecycle.p.b.RESUMED     // Catch:{ NoSuchFieldError -> 0x0022 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                        r2 = 3
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                    L_0x0022:
                        androidx.lifecycle.p$b r1 = androidx.lifecycle.p.b.DESTROYED     // Catch:{ NoSuchFieldError -> 0x002b }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                        r2 = 4
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                    L_0x002b:
                        androidx.lifecycle.p$b r1 = androidx.lifecycle.p.b.INITIALIZED     // Catch:{ NoSuchFieldError -> 0x0034 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                        r2 = 5
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                    L_0x0034:
                        f2829a = r0
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.p.a.C0040a.C0041a.<clinit>():void");
                }
            }

            public C0040a() {
            }

            public /* synthetic */ C0040a(w wVar) {
                this();
            }

            @m
            @h
            public final a a(@g b bVar) {
                l0.p(bVar, "state");
                int i10 = C0041a.f2829a[bVar.ordinal()];
                if (i10 == 1) {
                    return a.ON_DESTROY;
                }
                if (i10 == 2) {
                    return a.ON_STOP;
                }
                if (i10 != 3) {
                    return null;
                }
                return a.ON_PAUSE;
            }

            @m
            @h
            public final a b(@g b bVar) {
                l0.p(bVar, "state");
                int i10 = C0041a.f2829a[bVar.ordinal()];
                if (i10 == 1) {
                    return a.ON_STOP;
                }
                if (i10 == 2) {
                    return a.ON_PAUSE;
                }
                if (i10 != 4) {
                    return null;
                }
                return a.ON_DESTROY;
            }

            @m
            @h
            public final a c(@g b bVar) {
                l0.p(bVar, "state");
                int i10 = C0041a.f2829a[bVar.ordinal()];
                if (i10 == 1) {
                    return a.ON_START;
                }
                if (i10 == 2) {
                    return a.ON_RESUME;
                }
                if (i10 != 5) {
                    return null;
                }
                return a.ON_CREATE;
            }

            @m
            @h
            public final a d(@g b bVar) {
                l0.p(bVar, "state");
                int i10 = C0041a.f2829a[bVar.ordinal()];
                if (i10 == 1) {
                    return a.ON_CREATE;
                }
                if (i10 == 2) {
                    return a.ON_START;
                }
                if (i10 != 3) {
                    return null;
                }
                return a.ON_RESUME;
            }
        }

        public /* synthetic */ class b {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f2830a = null;

            /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|17) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
            static {
                /*
                    androidx.lifecycle.p$a[] r0 = androidx.lifecycle.p.a.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    androidx.lifecycle.p$a r1 = androidx.lifecycle.p.a.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    androidx.lifecycle.p$a r1 = androidx.lifecycle.p.a.ON_STOP     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    androidx.lifecycle.p$a r1 = androidx.lifecycle.p.a.ON_START     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    androidx.lifecycle.p$a r1 = androidx.lifecycle.p.a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    androidx.lifecycle.p$a r1 = androidx.lifecycle.p.a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0034 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                    r2 = 5
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                L_0x0034:
                    androidx.lifecycle.p$a r1 = androidx.lifecycle.p.a.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x003d }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                    r2 = 6
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
                L_0x003d:
                    androidx.lifecycle.p$a r1 = androidx.lifecycle.p.a.ON_ANY     // Catch:{ NoSuchFieldError -> 0x0046 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                    r2 = 7
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
                L_0x0046:
                    f2830a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.p.a.b.<clinit>():void");
            }
        }

        /* access modifiers changed from: public */
        static {
            Companion = new C0040a((w) null);
        }

        @m
        @h
        public static final a b(@g b bVar) {
            return Companion.a(bVar);
        }

        @m
        @h
        public static final a d(@g b bVar) {
            return Companion.b(bVar);
        }

        @m
        @h
        public static final a i(@g b bVar) {
            return Companion.c(bVar);
        }

        @m
        @h
        public static final a j(@g b bVar) {
            return Companion.d(bVar);
        }

        @g
        public final b e() {
            switch (b.f2830a[ordinal()]) {
                case 1:
                case 2:
                    return b.CREATED;
                case 3:
                case 4:
                    return b.STARTED;
                case 5:
                    return b.RESUMED;
                case 6:
                    return b.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    public enum b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public final boolean b(@g b bVar) {
            l0.p(bVar, "state");
            return compareTo(bVar) >= 0;
        }
    }

    @j0
    public abstract void a(@g x xVar);

    @g
    @j0
    public abstract b b();

    @g
    public final AtomicReference<Object> c() {
        return this.f2828a;
    }

    @j0
    public abstract void d(@g x xVar);

    public final void e(@g AtomicReference<Object> atomicReference) {
        l0.p(atomicReference, "<set-?>");
        this.f2828a = atomicReference;
    }
}
