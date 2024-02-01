package p5;

import i5.e0;
import i5.j;
import i5.l;
import i5.m;
import java.io.IOException;
import java.lang.reflect.Type;
import org.w3c.dom.Node;
import org.w3c.dom.bootstrap.DOMImplementationRegistry;
import org.w3c.dom.ls.DOMImplementationLS;
import s5.g;
import w4.h;
import w4.i;
import y5.m0;

public class d extends m0<Node> {
    public final DOMImplementationLS R;

    public d() {
        super(Node.class);
        try {
            this.R = (DOMImplementationLS) DOMImplementationRegistry.newInstance().getDOMImplementation("LS");
        } catch (Exception e10) {
            throw new IllegalStateException("Could not instantiate DOMImplementationRegistry: " + e10.getMessage(), e10);
        }
    }

    /* renamed from: M */
    public void m(Node node, i iVar, e0 e0Var) throws IOException, h {
        DOMImplementationLS dOMImplementationLS = this.R;
        if (dOMImplementationLS != null) {
            iVar.Z2(dOMImplementationLS.createLSSerializer().writeToString(node));
            return;
        }
        throw new IllegalStateException("Could not find DOM LS");
    }

    public m a(e0 e0Var, Type type) {
        return u("string", true);
    }

    public void e(g gVar, j jVar) throws l {
        if (gVar != null) {
            gVar.q(jVar);
        }
    }
}
