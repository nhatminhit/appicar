package pf;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final /* synthetic */ class v3 implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f22031a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f22032b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f22033c;

    public /* synthetic */ v3(int i10, String str, AtomicInteger atomicInteger) {
        this.f22031a = i10;
        this.f22032b = str;
        this.f22033c = atomicInteger;
    }

    public final Thread newThread(Runnable runnable) {
        return w3.c(this.f22031a, this.f22032b, this.f22033c, runnable);
    }
}
