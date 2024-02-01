package ka;

import ha.y;
import ha.z;
import ia.b;
import ja.c;
import oa.a;

public final class e implements z {
    public final c O;

    public e(c cVar) {
        this.O = cVar;
    }

    public <T> y<T> a(ha.e eVar, a<T> aVar) {
        b bVar = (b) aVar.f().getAnnotation(b.class);
        if (bVar == null) {
            return null;
        }
        return b(this.O, eVar, aVar, bVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: ka.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: ha.y<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: ha.y} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: ka.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: ka.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: ka.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ha.y<?> b(ja.c r9, ha.e r10, oa.a<?> r11, ia.b r12) {
        /*
            r8 = this;
            java.lang.Class r0 = r12.value()
            oa.a r0 = oa.a.b(r0)
            ja.k r9 = r9.a(r0)
            java.lang.Object r9 = r9.a()
            boolean r0 = r9 instanceof ha.y
            if (r0 == 0) goto L_0x0017
            ha.y r9 = (ha.y) r9
            goto L_0x0075
        L_0x0017:
            boolean r0 = r9 instanceof ha.z
            if (r0 == 0) goto L_0x0022
            ha.z r9 = (ha.z) r9
            ha.y r9 = r9.a(r10, r11)
            goto L_0x0075
        L_0x0022:
            boolean r0 = r9 instanceof ha.s
            if (r0 != 0) goto L_0x005b
            boolean r1 = r9 instanceof ha.j
            if (r1 == 0) goto L_0x002b
            goto L_0x005b
        L_0x002b:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "Invalid attempt to bind an instance of "
            r12.append(r0)
            java.lang.Class r9 = r9.getClass()
            java.lang.String r9 = r9.getName()
            r12.append(r9)
            java.lang.String r9 = " as a @JsonAdapter for "
            r12.append(r9)
            java.lang.String r9 = r11.toString()
            r12.append(r9)
            java.lang.String r9 = ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            r10.<init>(r9)
            throw r10
        L_0x005b:
            r1 = 0
            if (r0 == 0) goto L_0x0063
            r0 = r9
            ha.s r0 = (ha.s) r0
            r3 = r0
            goto L_0x0064
        L_0x0063:
            r3 = r1
        L_0x0064:
            boolean r0 = r9 instanceof ha.j
            if (r0 == 0) goto L_0x006b
            r1 = r9
            ha.j r1 = (ha.j) r1
        L_0x006b:
            r4 = r1
            ka.l r9 = new ka.l
            r7 = 0
            r2 = r9
            r5 = r10
            r6 = r11
            r2.<init>(r3, r4, r5, r6, r7)
        L_0x0075:
            if (r9 == 0) goto L_0x0081
            boolean r10 = r12.nullSafe()
            if (r10 == 0) goto L_0x0081
            ha.y r9 = r9.d()
        L_0x0081:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ka.e.b(ja.c, ha.e, oa.a, ia.b):ha.y");
    }
}
