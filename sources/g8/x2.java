package g8;

import com.google.android.gms.common.api.internal.l;

public final class x2 implements Runnable {
    public final /* synthetic */ l O;

    public x2(l lVar) {
        this.O = lVar;
    }

    public final void run() {
        this.O.f5683a0.lock();
        try {
            l.C(this.O);
        } finally {
            this.O.f5683a0.unlock();
        }
    }
}
