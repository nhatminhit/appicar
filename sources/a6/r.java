package a6;

public final class r<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f257a;

    /* renamed from: b  reason: collision with root package name */
    public r<T> f258b;

    public r(T t10, r<T> rVar) {
        this.f257a = t10;
        this.f258b = rVar;
    }

    public static <ST> boolean a(r<ST> rVar, ST st) {
        while (rVar != null) {
            if (rVar.d() == st) {
                return true;
            }
            rVar = rVar.c();
        }
        return false;
    }

    public void b(r<T> rVar) {
        if (this.f258b == null) {
            this.f258b = rVar;
            return;
        }
        throw new IllegalStateException();
    }

    public r<T> c() {
        return this.f258b;
    }

    public T d() {
        return this.f257a;
    }
}
