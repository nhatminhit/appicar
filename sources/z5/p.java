package z5;

import a6.h;
import i5.j;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class p implements Serializable {
    public static final long P = 1;
    public final n O;

    public static final class a extends StringTokenizer {

        /* renamed from: a  reason: collision with root package name */
        public final String f15901a;

        /* renamed from: b  reason: collision with root package name */
        public int f15902b;

        /* renamed from: c  reason: collision with root package name */
        public String f15903c;

        public a(String str) {
            super(str, "<,>", true);
            this.f15901a = str;
        }

        public String a() {
            return this.f15901a;
        }

        public String b() {
            return this.f15901a.substring(this.f15902b);
        }

        public void c(String str) {
            this.f15903c = str;
        }

        public boolean hasMoreTokens() {
            return this.f15903c != null || super.hasMoreTokens();
        }

        public String nextToken() {
            String str = this.f15903c;
            if (str != null) {
                this.f15903c = null;
                return str;
            }
            String nextToken = super.nextToken();
            this.f15902b += nextToken.length();
            return nextToken.trim();
        }
    }

    public p(n nVar) {
        this.O = nVar;
    }

    public IllegalArgumentException a(a aVar, String str) {
        return new IllegalArgumentException(String.format("Failed to parse type '%s' (remaining: '%s'): %s", new Object[]{aVar.a(), aVar.b(), str}));
    }

    public Class<?> b(String str, a aVar) {
        try {
            return this.O.d0(str);
        } catch (Exception e10) {
            h.q0(e10);
            throw a(aVar, "Cannot locate class '" + str + "', problem: " + e10.getMessage());
        }
    }

    public j c(String str) throws IllegalArgumentException {
        a aVar = new a(str.trim());
        j d10 = d(aVar);
        if (!aVar.hasMoreTokens()) {
            return d10;
        }
        throw a(aVar, "Unexpected tokens after complete type");
    }

    public j d(a aVar) throws IllegalArgumentException {
        if (aVar.hasMoreTokens()) {
            Class<?> b10 = b(aVar.nextToken(), aVar);
            if (aVar.hasMoreTokens()) {
                String nextToken = aVar.nextToken();
                if ("<".equals(nextToken)) {
                    return this.O.h((c) null, b10, m.d(b10, e(aVar)));
                }
                aVar.c(nextToken);
            }
            return this.O.h((c) null, b10, m.h());
        }
        throw a(aVar, "Unexpected end-of-string");
    }

    public List<j> e(a aVar) throws IllegalArgumentException {
        ArrayList arrayList = new ArrayList();
        while (aVar.hasMoreTokens()) {
            arrayList.add(d(aVar));
            if (!aVar.hasMoreTokens()) {
                break;
            }
            String nextToken = aVar.nextToken();
            if (">".equals(nextToken)) {
                return arrayList;
            }
            if (!",".equals(nextToken)) {
                throw a(aVar, "Unexpected token '" + nextToken + "', expected ',' or '>')");
            }
        }
        throw a(aVar, "Unexpected end-of-string");
    }

    public p f(n nVar) {
        return nVar == this.O ? this : new p(nVar);
    }
}
