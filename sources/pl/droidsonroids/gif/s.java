package pl.droidsonroids.gif;

import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

public class s extends t {
    public s(e eVar) {
        super(eVar);
    }

    public void a() {
        e eVar = this.O;
        long B = eVar.U.B(eVar.T);
        if (B >= 0) {
            this.O.Q = SystemClock.uptimeMillis() + B;
            if (this.O.isVisible() && this.O.P) {
                e eVar2 = this.O;
                if (!eVar2.Z) {
                    eVar2.O.remove(this);
                    e eVar3 = this.O;
                    eVar3.f22110d0 = eVar3.O.schedule(this, B, TimeUnit.MILLISECONDS);
                }
            }
            if (!this.O.V.isEmpty() && this.O.j() == this.O.U.n() - 1) {
                e eVar4 = this.O;
                eVar4.f22107a0.sendEmptyMessageAtTime(eVar4.k(), this.O.Q);
            }
        } else {
            e eVar5 = this.O;
            eVar5.Q = Long.MIN_VALUE;
            eVar5.P = false;
        }
        if (this.O.isVisible() && !this.O.f22107a0.hasMessages(-1)) {
            this.O.f22107a0.sendEmptyMessageAtTime(-1, 0);
        }
    }
}
