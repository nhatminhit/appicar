package p4;

public interface e {

    public enum a {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);
        
        public final boolean O;

        /* access modifiers changed from: public */
        a(boolean z10) {
            this.O = z10;
        }

        public boolean a() {
            return this.O;
        }
    }

    boolean a();

    boolean b(d dVar);

    void c(d dVar);

    boolean d(d dVar);

    boolean e(d dVar);

    e getRoot();

    void j(d dVar);
}
