package pg;

public abstract class b implements Runnable {
    public final String O;

    public b(String str, Object... objArr) {
        this.O = e.r(str, objArr);
    }

    public abstract void l();

    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.O);
        try {
            l();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
