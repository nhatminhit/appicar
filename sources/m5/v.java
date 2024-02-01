package m5;

import i5.f;
import i5.g;
import i5.l;
import i5.q;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import l5.y;

public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final int f10447a;

    /* renamed from: b  reason: collision with root package name */
    public final y f10448b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap<String, l5.v> f10449c;

    /* renamed from: d  reason: collision with root package name */
    public final l5.v[] f10450d;

    public static class a extends HashMap<String, l5.v> {
        public static final long P = 1;
        public final Locale O;

        @Deprecated
        public a() {
            this(Locale.getDefault());
        }

        public a(Locale locale) {
            this.O = locale;
        }

        public static a g(Locale locale) {
            return new a(locale);
        }

        /* renamed from: k */
        public l5.v get(Object obj) {
            return (l5.v) super.get(((String) obj).toLowerCase(this.O));
        }

        /* renamed from: m */
        public l5.v put(String str, l5.v vVar) {
            return (l5.v) super.put(str.toLowerCase(this.O), vVar);
        }
    }

    public v(g gVar, y yVar, l5.v[] vVarArr, boolean z10, boolean z11) {
        this.f10448b = yVar;
        this.f10449c = z10 ? a.g(gVar.q().H()) : new HashMap<>();
        int length = vVarArr.length;
        this.f10447a = length;
        this.f10450d = new l5.v[length];
        if (z11) {
            f T = gVar.q();
            for (l5.v vVar : vVarArr) {
                if (!vVar.J()) {
                    List<i5.y> p10 = vVar.p(T);
                    if (!p10.isEmpty()) {
                        for (i5.y d10 : p10) {
                            this.f10449c.put(d10.d(), vVar);
                        }
                    }
                }
            }
        }
        for (int i10 = 0; i10 < length; i10++) {
            l5.v vVar2 = vVarArr[i10];
            this.f10450d[i10] = vVar2;
            if (!vVar2.J()) {
                this.f10449c.put(vVar2.getName(), vVar2);
            }
        }
    }

    @Deprecated
    public static v b(g gVar, y yVar, l5.v[] vVarArr) throws l {
        return d(gVar, yVar, vVarArr, gVar.w(q.ACCEPT_CASE_INSENSITIVE_PROPERTIES));
    }

    public static v c(g gVar, y yVar, l5.v[] vVarArr, c cVar) throws l {
        int length = vVarArr.length;
        l5.v[] vVarArr2 = new l5.v[length];
        for (int i10 = 0; i10 < length; i10++) {
            l5.v vVar = vVarArr[i10];
            if (!vVar.G() && !vVar.K()) {
                vVar = vVar.V(gVar.L(vVar.e(), vVar));
            }
            vVarArr2[i10] = vVar;
        }
        return new v(gVar, yVar, vVarArr2, cVar.z(), true);
    }

    public static v d(g gVar, y yVar, l5.v[] vVarArr, boolean z10) throws l {
        int length = vVarArr.length;
        l5.v[] vVarArr2 = new l5.v[length];
        for (int i10 = 0; i10 < length; i10++) {
            l5.v vVar = vVarArr[i10];
            if (!vVar.G()) {
                vVar = vVar.V(gVar.L(vVar.e(), vVar));
            }
            vVarArr2[i10] = vVar;
        }
        return new v(gVar, yVar, vVarArr2, z10, false);
    }

    public Object a(g gVar, y yVar) throws IOException {
        Object q10 = this.f10448b.q(gVar, this.f10450d, yVar);
        if (q10 != null) {
            q10 = yVar.i(gVar, q10);
            for (x f10 = yVar.f(); f10 != null; f10 = f10.f10451a) {
                f10.a(q10);
            }
        }
        return q10;
    }

    public l5.v e(int i10) {
        for (l5.v next : this.f10449c.values()) {
            if (next.D() == i10) {
                return next;
            }
        }
        return null;
    }

    public l5.v f(String str) {
        return this.f10449c.get(str);
    }

    public Collection<l5.v> g() {
        return this.f10449c.values();
    }

    public y h(w4.l lVar, g gVar, s sVar) {
        return new y(lVar, gVar, this.f10447a, sVar);
    }
}
