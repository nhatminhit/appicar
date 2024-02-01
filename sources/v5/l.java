package v5;

import i5.e;
import i5.j;
import java.io.IOException;
import k5.i;
import u5.d;
import v4.f0;
import z5.n;

public class l extends j {

    /* renamed from: e  reason: collision with root package name */
    public final String f14181e;

    /* renamed from: f  reason: collision with root package name */
    public final String f14182f;

    public l(j jVar, n nVar, d dVar) {
        super(jVar, nVar, dVar);
        String name = jVar.g().getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf < 0) {
            this.f14181e = "";
            this.f14182f = ".";
            return;
        }
        this.f14182f = name.substring(0, lastIndexOf + 1);
        this.f14181e = name.substring(0, lastIndexOf);
    }

    public static l l(j jVar, i<?> iVar, d dVar) {
        return new l(jVar, iVar.M(), dVar);
    }

    public String a(Object obj) {
        String name = obj.getClass().getName();
        return name.startsWith(this.f14182f) ? name.substring(this.f14182f.length() - 1) : name;
    }

    public f0.b f() {
        return f0.b.MINIMAL_CLASS;
    }

    public j i(String str, e eVar) throws IOException {
        if (str.startsWith(".")) {
            StringBuilder sb2 = new StringBuilder(str.length() + this.f14181e.length());
            if (this.f14181e.length() == 0) {
                str = str.substring(1);
            } else {
                sb2.append(this.f14181e);
            }
            sb2.append(str);
            str = sb2.toString();
        }
        return super.i(str, eVar);
    }
}
