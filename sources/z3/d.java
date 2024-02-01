package z3;

import java.util.Queue;
import z3.m;

public abstract class d<T extends m> {

    /* renamed from: b  reason: collision with root package name */
    public static final int f15799b = 20;

    /* renamed from: a  reason: collision with root package name */
    public final Queue<T> f15800a = t4.m.f(20);

    public abstract T a();

    public T b() {
        T t10 = (m) this.f15800a.poll();
        return t10 == null ? a() : t10;
    }

    public void c(T t10) {
        if (this.f15800a.size() < 20) {
            this.f15800a.offer(t10);
        }
    }
}
