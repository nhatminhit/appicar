package ge;

import fh.g;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import oe.f;
import ve.h;
import we.l;
import xe.l0;
import zd.a1;
import zd.u2;

@h(name = "TimersKt")
public final class c {

    public static final class a extends TimerTask {
        public final /* synthetic */ l<TimerTask, u2> O;

        public a(l<? super TimerTask, u2> lVar) {
            this.O = lVar;
        }

        public void run() {
            this.O.A(this);
        }
    }

    @f
    public static final Timer a(String str, boolean z10, long j10, long j11, l<? super TimerTask, u2> lVar) {
        l0.p(lVar, "action");
        Timer k10 = k(str, z10);
        k10.scheduleAtFixedRate(new a(lVar), j10, j11);
        return k10;
    }

    @f
    public static final Timer b(String str, boolean z10, Date date, long j10, l<? super TimerTask, u2> lVar) {
        l0.p(date, "startAt");
        l0.p(lVar, "action");
        Timer k10 = k(str, z10);
        k10.scheduleAtFixedRate(new a(lVar), date, j10);
        return k10;
    }

    public static /* synthetic */ Timer c(String str, boolean z10, long j10, long j11, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            j10 = 0;
        }
        l0.p(lVar, "action");
        Timer k10 = k(str, z10);
        Timer timer = k10;
        timer.scheduleAtFixedRate(new a(lVar), j10, j11);
        return k10;
    }

    public static /* synthetic */ Timer d(String str, boolean z10, Date date, long j10, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        l0.p(date, "startAt");
        l0.p(lVar, "action");
        Timer k10 = k(str, z10);
        k10.scheduleAtFixedRate(new a(lVar), date, j10);
        return k10;
    }

    @f
    public static final TimerTask e(Timer timer, long j10, long j11, l<? super TimerTask, u2> lVar) {
        l0.p(timer, "<this>");
        l0.p(lVar, "action");
        a aVar = new a(lVar);
        timer.schedule(aVar, j10, j11);
        return aVar;
    }

    @f
    public static final TimerTask f(Timer timer, long j10, l<? super TimerTask, u2> lVar) {
        l0.p(timer, "<this>");
        l0.p(lVar, "action");
        a aVar = new a(lVar);
        timer.schedule(aVar, j10);
        return aVar;
    }

    @f
    public static final TimerTask g(Timer timer, Date date, long j10, l<? super TimerTask, u2> lVar) {
        l0.p(timer, "<this>");
        l0.p(date, "time");
        l0.p(lVar, "action");
        a aVar = new a(lVar);
        timer.schedule(aVar, date, j10);
        return aVar;
    }

    @f
    public static final TimerTask h(Timer timer, Date date, l<? super TimerTask, u2> lVar) {
        l0.p(timer, "<this>");
        l0.p(date, "time");
        l0.p(lVar, "action");
        a aVar = new a(lVar);
        timer.schedule(aVar, date);
        return aVar;
    }

    @f
    public static final TimerTask i(Timer timer, long j10, long j11, l<? super TimerTask, u2> lVar) {
        l0.p(timer, "<this>");
        l0.p(lVar, "action");
        a aVar = new a(lVar);
        timer.scheduleAtFixedRate(aVar, j10, j11);
        return aVar;
    }

    @f
    public static final TimerTask j(Timer timer, Date date, long j10, l<? super TimerTask, u2> lVar) {
        l0.p(timer, "<this>");
        l0.p(date, "time");
        l0.p(lVar, "action");
        a aVar = new a(lVar);
        timer.scheduleAtFixedRate(aVar, date, j10);
        return aVar;
    }

    @g
    @a1
    public static final Timer k(@fh.h String str, boolean z10) {
        return str == null ? new Timer(z10) : new Timer(str, z10);
    }

    @f
    public static final Timer l(String str, boolean z10, long j10, long j11, l<? super TimerTask, u2> lVar) {
        l0.p(lVar, "action");
        Timer k10 = k(str, z10);
        k10.schedule(new a(lVar), j10, j11);
        return k10;
    }

    @f
    public static final Timer m(String str, boolean z10, Date date, long j10, l<? super TimerTask, u2> lVar) {
        l0.p(date, "startAt");
        l0.p(lVar, "action");
        Timer k10 = k(str, z10);
        k10.schedule(new a(lVar), date, j10);
        return k10;
    }

    public static /* synthetic */ Timer n(String str, boolean z10, long j10, long j11, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            j10 = 0;
        }
        l0.p(lVar, "action");
        Timer k10 = k(str, z10);
        Timer timer = k10;
        timer.schedule(new a(lVar), j10, j11);
        return k10;
    }

    public static /* synthetic */ Timer o(String str, boolean z10, Date date, long j10, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        l0.p(date, "startAt");
        l0.p(lVar, "action");
        Timer k10 = k(str, z10);
        k10.schedule(new a(lVar), date, j10);
        return k10;
    }

    @f
    public static final TimerTask p(l<? super TimerTask, u2> lVar) {
        l0.p(lVar, "action");
        return new a(lVar);
    }
}
