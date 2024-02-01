package y3;

public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public static final j f15392a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final j f15393b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final j f15394c = new c();

    /* renamed from: d  reason: collision with root package name */
    public static final j f15395d = new d();

    /* renamed from: e  reason: collision with root package name */
    public static final j f15396e = new e();

    public class a extends j {
        public boolean a() {
            return true;
        }

        public boolean b() {
            return true;
        }

        public boolean c(v3.a aVar) {
            return aVar == v3.a.REMOTE;
        }

        public boolean d(boolean z10, v3.a aVar, v3.c cVar) {
            return (aVar == v3.a.RESOURCE_DISK_CACHE || aVar == v3.a.MEMORY_CACHE) ? false : true;
        }
    }

    public class b extends j {
        public boolean a() {
            return false;
        }

        public boolean b() {
            return false;
        }

        public boolean c(v3.a aVar) {
            return false;
        }

        public boolean d(boolean z10, v3.a aVar, v3.c cVar) {
            return false;
        }
    }

    public class c extends j {
        public boolean a() {
            return true;
        }

        public boolean b() {
            return false;
        }

        public boolean c(v3.a aVar) {
            return (aVar == v3.a.DATA_DISK_CACHE || aVar == v3.a.MEMORY_CACHE) ? false : true;
        }

        public boolean d(boolean z10, v3.a aVar, v3.c cVar) {
            return false;
        }
    }

    public class d extends j {
        public boolean a() {
            return false;
        }

        public boolean b() {
            return true;
        }

        public boolean c(v3.a aVar) {
            return false;
        }

        public boolean d(boolean z10, v3.a aVar, v3.c cVar) {
            return (aVar == v3.a.RESOURCE_DISK_CACHE || aVar == v3.a.MEMORY_CACHE) ? false : true;
        }
    }

    public class e extends j {
        public boolean a() {
            return true;
        }

        public boolean b() {
            return true;
        }

        public boolean c(v3.a aVar) {
            return aVar == v3.a.REMOTE;
        }

        public boolean d(boolean z10, v3.a aVar, v3.c cVar) {
            return ((z10 && aVar == v3.a.DATA_DISK_CACHE) || aVar == v3.a.LOCAL) && cVar == v3.c.TRANSFORMED;
        }
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(v3.a aVar);

    public abstract boolean d(boolean z10, v3.a aVar, v3.c cVar);
}
