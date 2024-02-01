package ge;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import oe.f;
import ve.h;
import xe.i0;
import xe.l0;

@h(name = "LocksKt")
public final class a {
    @f
    public static final <T> T a(ReentrantReadWriteLock reentrantReadWriteLock, we.a<? extends T> aVar) {
        l0.p(reentrantReadWriteLock, "<this>");
        l0.p(aVar, "action");
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        readLock.lock();
        try {
            return aVar.n();
        } finally {
            i0.d(1);
            readLock.unlock();
            i0.c(1);
        }
    }

    @f
    public static final <T> T b(Lock lock, we.a<? extends T> aVar) {
        l0.p(lock, "<this>");
        l0.p(aVar, "action");
        lock.lock();
        try {
            return aVar.n();
        } finally {
            i0.d(1);
            lock.unlock();
            i0.c(1);
        }
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    @oe.f
    public static final <T> T c(java.util.concurrent.locks.ReentrantReadWriteLock r4, we.a<? extends T> r5) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r4, r0)
            java.lang.String r0 = "action"
            xe.l0.p(r5, r0)
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r4.readLock()
            int r1 = r4.getWriteHoldCount()
            r2 = 0
            if (r1 != 0) goto L_0x001a
            int r1 = r4.getReadHoldCount()
            goto L_0x001b
        L_0x001a:
            r1 = r2
        L_0x001b:
            r3 = r2
        L_0x001c:
            if (r3 >= r1) goto L_0x0024
            r0.unlock()
            int r3 = r3 + 1
            goto L_0x001c
        L_0x0024:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r4 = r4.writeLock()
            r4.lock()
            r3 = 1
            java.lang.Object r5 = r5.n()     // Catch:{ all -> 0x0042 }
            xe.i0.d(r3)
        L_0x0033:
            if (r2 >= r1) goto L_0x003b
            r0.lock()
            int r2 = r2 + 1
            goto L_0x0033
        L_0x003b:
            r4.unlock()
            xe.i0.c(r3)
            return r5
        L_0x0042:
            r5 = move-exception
            xe.i0.d(r3)
        L_0x0046:
            if (r2 >= r1) goto L_0x004e
            r0.lock()
            int r2 = r2 + 1
            goto L_0x0046
        L_0x004e:
            r4.unlock()
            xe.i0.c(r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ge.a.c(java.util.concurrent.locks.ReentrantReadWriteLock, we.a):java.lang.Object");
    }
}
