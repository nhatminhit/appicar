package x8;

import d.m0;
import e8.a;
import j8.s;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

@a
public class b implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final String f15203a;

    /* renamed from: b  reason: collision with root package name */
    public final ThreadFactory f15204b = Executors.defaultThreadFactory();

    @a
    public b(@m0 String str) {
        s.m(str, "Name must not be null");
        this.f15203a = str;
    }

    @m0
    public final Thread newThread(@m0 Runnable runnable) {
        Thread newThread = this.f15204b.newThread(new d(runnable, 0));
        newThread.setName(this.f15203a);
        return newThread;
    }
}
