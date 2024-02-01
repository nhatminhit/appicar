package o5;

import a6.h;
import i5.g;
import i5.j;
import i5.y;

public class d extends f {
    public static final long W = 1;
    public final y V;

    public d(g gVar, String str, y yVar) {
        super(gVar.Z(), str);
        this.V = yVar;
    }

    public static d E(g gVar, y yVar, j jVar) {
        d dVar = new d(gVar, String.format("Invalid `null` value encountered for property %s", new Object[]{h.j0(yVar, "<UNKNOWN>")}), yVar);
        if (jVar != null) {
            dVar.D(jVar);
        }
        return dVar;
    }

    public y F() {
        return this.V;
    }
}
