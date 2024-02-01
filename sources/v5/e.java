package v5;

import i5.d;
import java.io.IOException;
import u5.g;
import v4.f0;
import w4.i;

public class e extends s {

    /* renamed from: c  reason: collision with root package name */
    public final String f14177c;

    public e(g gVar, d dVar, String str) {
        super(gVar, dVar);
        this.f14177c = str;
    }

    public final void D(Object obj, i iVar) throws IOException {
        iVar.R2();
    }

    public final void E(Object obj, i iVar, String str) throws IOException {
        iVar.f2();
        if (str != null) {
            iVar.c3(this.f14177c, str);
        }
    }

    public final void F(Object obj, i iVar) throws IOException {
        iVar.V2();
    }

    public final void G(Object obj, i iVar, String str) throws IOException {
        iVar.g2();
        if (str != null) {
            iVar.c3(this.f14177c, str);
        }
    }

    public final void H(Object obj, i iVar) throws IOException {
    }

    public final void I(Object obj, i iVar, String str) throws IOException {
        if (str != null) {
            iVar.c3(this.f14177c, str);
        }
    }

    /* renamed from: J */
    public e b(d dVar) {
        return this.f14197b == dVar ? this : new e(this.f14196a, dVar, this.f14177c);
    }

    public String c() {
        return this.f14177c;
    }

    public f0.a e() {
        return f0.a.EXTERNAL_PROPERTY;
    }
}
