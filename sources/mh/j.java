package mh;

import java.util.Iterator;
import jh.h;

public abstract class j extends d {

    /* renamed from: a  reason: collision with root package name */
    public d f21140a;

    public static class a extends j {
        public a(d dVar) {
            this.f21140a = dVar;
        }

        public boolean a(h hVar, h hVar2) {
            Iterator it = hVar2.Z0().iterator();
            while (it.hasNext()) {
                h hVar3 = (h) it.next();
                if (hVar3 != hVar2 && this.f21140a.a(hVar2, hVar3)) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return String.format(":has(%s)", new Object[]{this.f21140a});
        }
    }

    public static class b extends j {
        public b(d dVar) {
            this.f21140a = dVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0004, code lost:
            r4 = r4.U();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean a(jh.h r3, jh.h r4) {
            /*
                r2 = this;
                r0 = 0
                if (r3 != r4) goto L_0x0004
                return r0
            L_0x0004:
                jh.h r4 = r4.U()
                if (r4 == 0) goto L_0x0013
                mh.d r1 = r2.f21140a
                boolean r3 = r1.a(r3, r4)
                if (r3 == 0) goto L_0x0013
                r0 = 1
            L_0x0013:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: mh.j.b.a(jh.h, jh.h):boolean");
        }

        public String toString() {
            return String.format(":ImmediateParent%s", new Object[]{this.f21140a});
        }
    }

    public static class c extends j {
        public c(d dVar) {
            this.f21140a = dVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0004, code lost:
            r4 = r4.W1();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean a(jh.h r3, jh.h r4) {
            /*
                r2 = this;
                r0 = 0
                if (r3 != r4) goto L_0x0004
                return r0
            L_0x0004:
                jh.h r4 = r4.W1()
                if (r4 == 0) goto L_0x0013
                mh.d r1 = r2.f21140a
                boolean r3 = r1.a(r3, r4)
                if (r3 == 0) goto L_0x0013
                r0 = 1
            L_0x0013:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: mh.j.c.a(jh.h, jh.h):boolean");
        }

        public String toString() {
            return String.format(":prev%s", new Object[]{this.f21140a});
        }
    }

    public static class d extends j {
        public d(d dVar) {
            this.f21140a = dVar;
        }

        public boolean a(h hVar, h hVar2) {
            return !this.f21140a.a(hVar, hVar2);
        }

        public String toString() {
            return String.format(":not%s", new Object[]{this.f21140a});
        }
    }

    public static class e extends j {
        public e(d dVar) {
            this.f21140a = dVar;
        }

        public boolean a(h hVar, h hVar2) {
            if (hVar == hVar2) {
                return false;
            }
            do {
                hVar2 = hVar2.U();
                if (this.f21140a.a(hVar, hVar2)) {
                    return true;
                }
            } while (hVar2 != hVar);
            return false;
        }

        public String toString() {
            return String.format(":parent%s", new Object[]{this.f21140a});
        }
    }

    public static class f extends j {
        public f(d dVar) {
            this.f21140a = dVar;
        }

        public boolean a(h hVar, h hVar2) {
            if (hVar == hVar2) {
                return false;
            }
            do {
                hVar2 = hVar2.W1();
                if (hVar2 == null) {
                    return false;
                }
            } while (!this.f21140a.a(hVar, hVar2));
            return true;
        }

        public String toString() {
            return String.format(":prev*%s", new Object[]{this.f21140a});
        }
    }

    public static class g extends d {
        public boolean a(h hVar, h hVar2) {
            return hVar == hVar2;
        }
    }
}
