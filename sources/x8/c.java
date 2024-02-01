package x8;

import d.m0;
import e8.a;
import j8.s;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@a
public class c implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final String f15205a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicInteger f15206b = new AtomicInteger();

    /* renamed from: c  reason: collision with root package name */
    public final ThreadFactory f15207c = Executors.defaultThreadFactory();

    @a
    public c(@m0 String str) {
        s.m(str, "Name must not be null");
        this.f15205a = str;
    }

    @m0
    public final Thread newThread(@m0 Runnable runnable) {
        Thread newThread = this.f15207c.newThread(new d(runnable, 0));
        String str = this.f15205a;
        int andIncrement = this.f15206b.getAndIncrement();
        newThread.setName(str + "[" + andIncrement + "]");
        return newThread;
    }
}
