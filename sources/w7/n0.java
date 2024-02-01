package w7;

import java.util.concurrent.ThreadFactory;

public final /* synthetic */ class n0 implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f14771a;

    public /* synthetic */ n0(String str) {
        this.f14771a = str;
    }

    public final Thread newThread(Runnable runnable) {
        return q0.y0(this.f14771a, runnable);
    }
}
