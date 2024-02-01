package pg;

import java.util.concurrent.ThreadFactory;

public final /* synthetic */ class c implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f22063a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f22064b;

    public /* synthetic */ c(String str, boolean z10) {
        this.f22063a = str;
        this.f22064b = z10;
    }

    public final Thread newThread(Runnable runnable) {
        return e.C(this.f22063a, this.f22064b, runnable);
    }
}
