package jh;

import gh.e;
import java.io.IOException;
import jh.f;

public class c extends p {
    public c(String str) {
        super(str);
    }

    public String A0() {
        return u0();
    }

    /* renamed from: C0 */
    public c z() {
        return (c) super.z();
    }

    public String N() {
        return "#cdata";
    }

    public void R(Appendable appendable, int i10, f.a aVar) throws IOException {
        appendable.append("<![CDATA[").append(u0());
    }

    public void S(Appendable appendable, int i10, f.a aVar) {
        try {
            appendable.append("]]>");
        } catch (IOException e10) {
            throw new e(e10);
        }
    }
}
