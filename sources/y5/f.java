package y5;

import g5.c;
import i5.e0;
import i5.j;
import i5.l;
import i5.m;
import j5.a;
import java.io.IOException;
import java.lang.reflect.Type;
import s5.b;
import s5.d;
import s5.g;
import w4.i;
import w4.p;

@a
public class f extends m0<byte[]> {
    public static final long R = 1;

    public f() {
        super(byte[].class);
    }

    /* renamed from: M */
    public boolean h(e0 e0Var, byte[] bArr) {
        return bArr.length == 0;
    }

    /* renamed from: N */
    public void m(byte[] bArr, i iVar, e0 e0Var) throws IOException {
        iVar.Y1(e0Var.q().o(), bArr, 0, bArr.length);
    }

    /* renamed from: O */
    public void n(byte[] bArr, i iVar, e0 e0Var, u5.i iVar2) throws IOException {
        c o10 = iVar2.o(iVar, iVar2.g(bArr, p.VALUE_EMBEDDED_OBJECT));
        iVar.Y1(e0Var.q().o(), bArr, 0, bArr.length);
        iVar2.v(iVar, o10);
    }

    public m a(e0 e0Var, Type type) {
        return u("array", true).n2("items", t("byte"));
    }

    public void e(g gVar, j jVar) throws l {
        b m10 = gVar.m(jVar);
        if (m10 != null) {
            m10.i(d.INTEGER);
        }
    }
}
