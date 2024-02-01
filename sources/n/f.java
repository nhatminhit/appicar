package n;

import d.m0;
import d.x0;

@x0({x0.a.LIBRARY_GROUP_PREFIX})
public abstract class f {
    public abstract void a(@m0 Runnable runnable);

    public void b(@m0 Runnable runnable) {
        if (c()) {
            runnable.run();
        } else {
            d(runnable);
        }
    }

    public abstract boolean c();

    public abstract void d(@m0 Runnable runnable);
}
