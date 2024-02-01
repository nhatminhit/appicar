package kh;

import hh.d;
import java.io.Reader;
import java.io.StringReader;
import java.util.List;
import jh.b;
import jh.c;
import jh.f;
import jh.g;
import jh.h;
import jh.m;
import jh.p;
import kh.i;

public class n extends m {

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f20395a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                kh.i$j[] r0 = kh.i.j.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20395a = r0
                kh.i$j r1 = kh.i.j.StartTag     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f20395a     // Catch:{ NoSuchFieldError -> 0x001d }
                kh.i$j r1 = kh.i.j.EndTag     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f20395a     // Catch:{ NoSuchFieldError -> 0x0028 }
                kh.i$j r1 = kh.i.j.Comment     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f20395a     // Catch:{ NoSuchFieldError -> 0x0033 }
                kh.i$j r1 = kh.i.j.Character     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f20395a     // Catch:{ NoSuchFieldError -> 0x003e }
                kh.i$j r1 = kh.i.j.Doctype     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f20395a     // Catch:{ NoSuchFieldError -> 0x0049 }
                kh.i$j r1 = kh.i.j.EOF     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kh.n.a.<clinit>():void");
        }
    }

    public f b() {
        return f.f20293d;
    }

    public void d(Reader reader, String str, g gVar) {
        super.d(reader, str, gVar);
        this.f20389e.add(this.f20388d);
        this.f20388d.I2().w(f.a.C0340a.xml);
    }

    public List<m> f(String str, h hVar, String str2, g gVar) {
        return s(str, str2, gVar);
    }

    public boolean g(i iVar) {
        switch (a.f20395a[iVar.f20304a.ordinal()]) {
            case 1:
                l(iVar.e());
                return true;
            case 2:
                t(iVar.d());
                return true;
            case 3:
                n(iVar.b());
                return true;
            case 4:
                m(iVar.a());
                return true;
            case 5:
                o(iVar.c());
                return true;
            case 6:
                return true;
            default:
                d.a("Unexpected token type: " + iVar.f20304a);
                return true;
        }
    }

    public /* bridge */ /* synthetic */ boolean j(String str, b bVar) {
        return super.j(str, bVar);
    }

    public h l(i.h hVar) {
        h x10 = h.x(hVar.B(), this.f20392h);
        b bVar = hVar.f20322j;
        if (bVar != null) {
            bVar.y(this.f20392h);
        }
        h hVar2 = new h(x10, (String) null, this.f20392h.b(hVar.f20322j));
        p(hVar2);
        if (!hVar.A()) {
            this.f20389e.add(hVar2);
        } else if (!x10.p()) {
            x10.v();
        }
        return hVar2;
    }

    public void m(i.c cVar) {
        String q10 = cVar.q();
        p(cVar.f() ? new c(q10) : new p(q10));
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [jh.q] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void n(kh.i.d r3) {
        /*
            r2 = this;
            jh.d r0 = new jh.d
            java.lang.String r1 = r3.s()
            r0.<init>(r1)
            boolean r3 = r3.f20308d
            if (r3 == 0) goto L_0x001a
            boolean r3 = r0.v0()
            if (r3 == 0) goto L_0x001a
            jh.q r3 = r0.s0()
            if (r3 == 0) goto L_0x001a
            r0 = r3
        L_0x001a:
            r2.p(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kh.n.n(kh.i$d):void");
    }

    public void o(i.e eVar) {
        g gVar = new g(this.f20392h.c(eVar.p()), eVar.r(), eVar.s());
        gVar.v0(eVar.q());
        p(gVar);
    }

    public final void p(m mVar) {
        a().v0(mVar);
    }

    public f q(Reader reader, String str) {
        return e(reader, str, new g(this));
    }

    public f r(String str, String str2) {
        return e(new StringReader(str), str2, new g(this));
    }

    public List<m> s(String str, String str2, g gVar) {
        d(new StringReader(str), str2, gVar);
        k();
        return this.f20388d.v();
    }

    public final void t(i.g gVar) {
        h hVar;
        String c10 = this.f20392h.c(gVar.f20314b);
        int size = this.f20389e.size() - 1;
        while (true) {
            if (size < 0) {
                hVar = null;
                break;
            }
            hVar = this.f20389e.get(size);
            if (hVar.N().equals(c10)) {
                break;
            }
            size--;
        }
        if (hVar != null) {
            int size2 = this.f20389e.size() - 1;
            while (size2 >= 0) {
                h hVar2 = this.f20389e.get(size2);
                this.f20389e.remove(size2);
                if (hVar2 != hVar) {
                    size2--;
                } else {
                    return;
                }
            }
        }
    }
}
