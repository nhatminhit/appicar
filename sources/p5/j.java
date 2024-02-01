package p5;

import g5.c;
import i5.e0;
import java.io.IOException;
import java.nio.file.Path;
import w4.i;
import w4.p;
import y5.l0;

public class j extends l0<Path> {
    public static final long R = 1;

    public j() {
        super(Path.class);
    }

    /* renamed from: M */
    public void m(Path path, i iVar, e0 e0Var) throws IOException {
        iVar.Z2(path.toUri().toString());
    }

    /* renamed from: N */
    public void n(Path path, i iVar, e0 e0Var, u5.i iVar2) throws IOException {
        c o10 = iVar2.o(iVar, iVar2.f(path, Path.class, p.VALUE_STRING));
        m(path, iVar, e0Var);
        iVar2.v(iVar, o10);
    }
}
