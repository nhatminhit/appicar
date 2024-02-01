package a5;

import java.io.IOException;
import w4.i;
import w4.n;
import w4.o;
import w4.p;

public class e extends o {

    /* renamed from: f  reason: collision with root package name */
    public final e f199f;

    /* renamed from: g  reason: collision with root package name */
    public e f200g;

    /* renamed from: h  reason: collision with root package name */
    public String f201h;

    /* renamed from: i  reason: collision with root package name */
    public d f202i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f203j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f204k = false;

    public e(int i10, e eVar, d dVar, boolean z10) {
        this.f14648a = i10;
        this.f199f = eVar;
        this.f202i = dVar;
        this.f14649b = -1;
        this.f203j = z10;
    }

    public static e y(d dVar) {
        return new e(0, (e) null, dVar, true);
    }

    public d A() {
        return this.f202i;
    }

    /* renamed from: B */
    public final e e() {
        return this.f199f;
    }

    public boolean C() {
        return this.f203j;
    }

    public p D() {
        if (!this.f203j) {
            this.f203j = true;
            return this.f14648a == 2 ? p.START_OBJECT : p.START_ARRAY;
        } else if (!this.f204k || this.f14648a != 2) {
            return null;
        } else {
            this.f204k = false;
            return p.FIELD_NAME;
        }
    }

    public e E(int i10, d dVar, boolean z10) {
        this.f14648a = i10;
        this.f202i = dVar;
        this.f14649b = -1;
        this.f201h = null;
        this.f203j = z10;
        this.f204k = false;
        return this;
    }

    public d F(String str) throws n {
        this.f201h = str;
        this.f204k = true;
        return this.f202i;
    }

    public void G() {
        this.f202i = null;
        for (e eVar = this.f199f; eVar != null; eVar = eVar.f199f) {
            this.f199f.f202i = null;
        }
    }

    public void H(i iVar) throws IOException {
        d dVar = this.f202i;
        if (dVar != null && dVar != d.f198a) {
            if (!this.f203j) {
                this.f203j = true;
                int i10 = this.f14648a;
                if (i10 == 2) {
                    iVar.V2();
                    if (!this.f204k) {
                        return;
                    }
                } else if (i10 == 1) {
                    iVar.R2();
                    return;
                } else {
                    return;
                }
            } else if (!this.f204k) {
                return;
            }
            iVar.i2(this.f201h);
        }
    }

    public void I(i iVar) throws IOException {
        d dVar = this.f202i;
        if (dVar != null && dVar != d.f198a) {
            e eVar = this.f199f;
            if (eVar != null) {
                eVar.r(iVar);
            }
            if (!this.f203j) {
                this.f203j = true;
                int i10 = this.f14648a;
                if (i10 == 2) {
                    iVar.V2();
                } else if (i10 == 1) {
                    iVar.R2();
                    return;
                } else {
                    return;
                }
            } else if (!this.f204k) {
                return;
            }
            iVar.i2(this.f201h);
        }
    }

    public final String b() {
        return this.f201h;
    }

    public Object c() {
        return null;
    }

    public boolean i() {
        return this.f201h != null;
    }

    public void p(Object obj) {
    }

    public final void r(i iVar) throws IOException {
        d dVar = this.f202i;
        if (dVar != null && dVar != d.f198a) {
            e eVar = this.f199f;
            if (eVar != null) {
                eVar.r(iVar);
            }
            if (!this.f203j) {
                this.f203j = true;
                int i10 = this.f14648a;
                if (i10 == 2) {
                    iVar.V2();
                    if (!this.f204k) {
                        return;
                    }
                } else if (i10 == 1) {
                    iVar.R2();
                    return;
                } else {
                    return;
                }
            } else if (!this.f204k) {
                return;
            }
            this.f204k = false;
            iVar.i2(this.f201h);
        }
    }

    public void s(StringBuilder sb2) {
        char c10;
        char c11;
        e eVar = this.f199f;
        if (eVar != null) {
            eVar.s(sb2);
        }
        int i10 = this.f14648a;
        if (i10 == 2) {
            sb2.append('{');
            if (this.f201h != null) {
                c11 = '\"';
                sb2.append('\"');
                sb2.append(this.f201h);
            } else {
                c11 = '?';
            }
            sb2.append(c11);
            c10 = '}';
        } else if (i10 == 1) {
            sb2.append('[');
            sb2.append(a());
            c10 = ']';
        } else {
            sb2.append("/");
            return;
        }
        sb2.append(c10);
    }

    public d t(d dVar) {
        int i10 = this.f14648a;
        if (i10 == 2) {
            return dVar;
        }
        int i11 = this.f14649b + 1;
        this.f14649b = i11;
        return i10 == 1 ? dVar.h(i11) : dVar.s(i11);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        s(sb2);
        return sb2.toString();
    }

    public e u(i iVar) throws IOException {
        if (this.f203j) {
            iVar.f2();
        }
        d dVar = this.f202i;
        if (!(dVar == null || dVar == d.f198a)) {
            dVar.b();
        }
        return this.f199f;
    }

    public e v(i iVar) throws IOException {
        if (this.f203j) {
            iVar.g2();
        }
        d dVar = this.f202i;
        if (!(dVar == null || dVar == d.f198a)) {
            dVar.c();
        }
        return this.f199f;
    }

    public e w(d dVar, boolean z10) {
        e eVar = this.f200g;
        if (eVar != null) {
            return eVar.E(1, dVar, z10);
        }
        e eVar2 = new e(1, this, dVar, z10);
        this.f200g = eVar2;
        return eVar2;
    }

    public e x(d dVar, boolean z10) {
        e eVar = this.f200g;
        if (eVar != null) {
            return eVar.E(2, dVar, z10);
        }
        e eVar2 = new e(2, this, dVar, z10);
        this.f200g = eVar2;
        return eVar2;
    }

    public e z(e eVar) {
        e eVar2 = this.f199f;
        if (eVar2 == eVar) {
            return this;
        }
        while (eVar2 != null) {
            e eVar3 = eVar2.f199f;
            if (eVar3 == eVar) {
                return eVar2;
            }
            eVar2 = eVar3;
        }
        return null;
    }
}
