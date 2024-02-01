package q5;

import a6.h;
import i5.b;
import i5.j;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import q5.b;

public final class e extends u {

    /* renamed from: d  reason: collision with root package name */
    public final d0 f11959d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f11960e;

    /* renamed from: f  reason: collision with root package name */
    public d f11961f;

    public e(b bVar, d0 d0Var, boolean z10) {
        super(bVar);
        this.f11959d = d0Var;
        this.f11960e = z10;
    }

    public static b.a o(i5.b bVar, d0 d0Var, j jVar, Class<?> cls, boolean z10) {
        return new e(bVar, d0Var, bVar != null && !h.W(jVar.g())).k(jVar, cls);
    }

    public static boolean s(Constructor<?> constructor) {
        return !constructor.isSynthetic();
    }

    public final List<d> i(j jVar, Class<?> cls) {
        ArrayList arrayList;
        h.a aVar;
        List<d> list;
        int i10;
        if (!jVar.p()) {
            aVar = null;
            arrayList = null;
            for (h.a aVar2 : h.D(jVar.g())) {
                if (s(aVar2.a())) {
                    if (aVar2.d() == 0) {
                        aVar = aVar2;
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(aVar2);
                    }
                }
            }
        } else {
            aVar = null;
            arrayList = null;
        }
        if (arrayList == null) {
            list = Collections.emptyList();
            if (aVar == null) {
                return list;
            }
            i10 = 0;
        } else {
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i11 = 0; i11 < size; i11++) {
                arrayList2.add((Object) null);
            }
            ArrayList arrayList3 = arrayList2;
            i10 = size;
            list = arrayList3;
        }
        if (cls != null) {
            x[] xVarArr = null;
            for (h.a aVar3 : h.D(cls)) {
                if (aVar3.d() == 0) {
                    if (aVar != null) {
                        this.f11961f = p(aVar, aVar3);
                        aVar = null;
                    }
                } else if (arrayList != null) {
                    if (xVarArr == null) {
                        xVarArr = new x[i10];
                        for (int i12 = 0; i12 < i10; i12++) {
                            xVarArr[i12] = new x(((h.a) arrayList.get(i12)).a());
                        }
                    }
                    x xVar = new x(aVar3.a());
                    int i13 = 0;
                    while (true) {
                        if (i13 >= i10) {
                            break;
                        } else if (xVar.equals(xVarArr[i13])) {
                            list.set(i13, r((h.a) arrayList.get(i13), aVar3));
                            break;
                        } else {
                            i13++;
                        }
                    }
                }
            }
        }
        if (aVar != null) {
            this.f11961f = p(aVar, (h.a) null);
        }
        for (int i14 = 0; i14 < i10; i14++) {
            if (list.get(i14) == null) {
                list.set(i14, r((h.a) arrayList.get(i14), (h.a) null));
            }
        }
        return list;
    }

    public final List<i> j(j jVar, Class<?> cls) {
        ArrayList arrayList = null;
        for (Method method : h.C(jVar.g())) {
            if (Modifier.isStatic(method.getModifiers())) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(method);
            }
        }
        if (arrayList == null) {
            return Collections.emptyList();
        }
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add((Object) null);
        }
        if (cls != null) {
            x[] xVarArr = null;
            for (Method method2 : cls.getDeclaredMethods()) {
                if (Modifier.isStatic(method2.getModifiers())) {
                    if (xVarArr == null) {
                        xVarArr = new x[size];
                        for (int i11 = 0; i11 < size; i11++) {
                            xVarArr[i11] = new x((Method) arrayList.get(i11));
                        }
                    }
                    x xVar = new x(method2);
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size) {
                            break;
                        } else if (xVar.equals(xVarArr[i12])) {
                            arrayList2.set(i12, q((Method) arrayList.get(i12), method2));
                            break;
                        } else {
                            i12++;
                        }
                    }
                }
            }
        }
        for (int i13 = 0; i13 < size; i13++) {
            if (((i) arrayList2.get(i13)) == null) {
                arrayList2.set(i13, q((Method) arrayList.get(i13), (Method) null));
            }
        }
        return arrayList2;
    }

    public b.a k(j jVar, Class<?> cls) {
        List<d> i10 = i(jVar, cls);
        List<i> j10 = j(jVar, cls);
        if (this.f11960e) {
            d dVar = this.f11961f;
            if (dVar != null && this.f11991a.B0(dVar)) {
                this.f11961f = null;
            }
            int size = i10.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else if (this.f11991a.B0(i10.get(size))) {
                    i10.remove(size);
                }
            }
            int size2 = j10.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    break;
                } else if (this.f11991a.B0(j10.get(size2))) {
                    j10.remove(size2);
                }
            }
        }
        return new b.a(this.f11961f, i10, j10);
    }

    public final p l(h.a aVar, h.a aVar2) {
        if (!this.f11960e) {
            return u.a();
        }
        n e10 = e(aVar.b());
        if (aVar2 != null) {
            e10 = d(e10, aVar2.b());
        }
        return e10.b();
    }

    public final p m(AnnotatedElement annotatedElement, AnnotatedElement annotatedElement2) {
        n e10 = e(annotatedElement.getDeclaredAnnotations());
        if (annotatedElement2 != null) {
            e10 = d(e10, annotatedElement2.getDeclaredAnnotations());
        }
        return e10.b();
    }

    public final p[] n(Annotation[][] annotationArr, Annotation[][] annotationArr2) {
        if (!this.f11960e) {
            return u.f11989b;
        }
        int length = annotationArr.length;
        p[] pVarArr = new p[length];
        for (int i10 = 0; i10 < length; i10++) {
            n d10 = d(n.e(), annotationArr[i10]);
            if (annotationArr2 != null) {
                d10 = d(d10, annotationArr2[i10]);
            }
            pVarArr[i10] = d10.b();
        }
        return pVarArr;
    }

    public d p(h.a aVar, h.a aVar2) {
        return new d(this.f11959d, aVar.a(), l(aVar, aVar2), u.f11989b);
    }

    public i q(Method method, Method method2) {
        Annotation[][] annotationArr;
        int length = method.getParameterTypes().length;
        if (this.f11991a == null) {
            return new i(this.f11959d, method, u.a(), u.b(length));
        }
        if (length == 0) {
            return new i(this.f11959d, method, m(method, method2), u.f11989b);
        }
        d0 d0Var = this.f11959d;
        p m10 = m(method, method2);
        Annotation[][] parameterAnnotations = method.getParameterAnnotations();
        if (method2 == null) {
            annotationArr = null;
            Annotation[][] annotationArr2 = null;
        } else {
            annotationArr = method2.getParameterAnnotations();
        }
        return new i(d0Var, method, m10, n(parameterAnnotations, annotationArr));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.annotation.Annotation[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: q5.p[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.annotation.Annotation[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: q5.p[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: q5.p[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: java.lang.annotation.Annotation[][]} */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public q5.d r(a6.h.a r9, a6.h.a r10) {
        /*
            r8 = this;
            int r0 = r9.d()
            i5.b r1 = r8.f11991a
            if (r1 != 0) goto L_0x001c
            q5.d r10 = new q5.d
            q5.d0 r1 = r8.f11959d
            java.lang.reflect.Constructor r9 = r9.a()
            q5.p r2 = q5.u.a()
            q5.p[] r0 = q5.u.b(r0)
            r10.<init>(r1, r9, r2, r0)
            return r10
        L_0x001c:
            if (r0 != 0) goto L_0x0030
            q5.d r0 = new q5.d
            q5.d0 r1 = r8.f11959d
            java.lang.reflect.Constructor r2 = r9.a()
            q5.p r9 = r8.l(r9, r10)
            q5.p[] r10 = q5.u.f11989b
            r0.<init>(r1, r2, r9, r10)
            return r0
        L_0x0030:
            java.lang.annotation.Annotation[][] r1 = r9.e()
            int r2 = r1.length
            r3 = 0
            if (r0 == r2) goto L_0x00a1
            java.lang.Class r2 = r9.c()
            boolean r4 = a6.h.V(r2)
            r5 = 0
            r6 = 1
            r7 = 2
            if (r4 == 0) goto L_0x005a
            int r4 = r1.length
            int r4 = r4 + r7
            if (r0 != r4) goto L_0x005a
            int r2 = r1.length
            int r2 = r2 + r7
            java.lang.annotation.Annotation[][] r2 = new java.lang.annotation.Annotation[r2][]
            int r4 = r1.length
            java.lang.System.arraycopy(r1, r5, r2, r7, r4)
            r1 = r3
            java.lang.annotation.Annotation[][] r1 = (java.lang.annotation.Annotation[][]) r1
            q5.p[] r3 = r8.n(r2, r3)
        L_0x0058:
            r1 = r2
            goto L_0x0078
        L_0x005a:
            boolean r2 = r2.isMemberClass()
            if (r2 == 0) goto L_0x0078
            int r2 = r1.length
            int r2 = r2 + r6
            if (r0 != r2) goto L_0x0078
            int r2 = r1.length
            int r2 = r2 + r6
            java.lang.annotation.Annotation[][] r2 = new java.lang.annotation.Annotation[r2][]
            int r4 = r1.length
            java.lang.System.arraycopy(r1, r5, r2, r6, r4)
            java.lang.annotation.Annotation[] r1 = q5.u.f11990c
            r2[r5] = r1
            r1 = r3
            java.lang.annotation.Annotation[][] r1 = (java.lang.annotation.Annotation[][]) r1
            q5.p[] r3 = r8.n(r2, r3)
            goto L_0x0058
        L_0x0078:
            if (r3 == 0) goto L_0x007b
            goto L_0x00af
        L_0x007b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Class r9 = r9.c()
            java.lang.String r9 = r9.getName()
            r2[r5] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            r2[r6] = r9
            int r9 = r1.length
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r2[r7] = r9
            java.lang.String r9 = "Internal error: constructor for %s has mismatch: %d parameters; %d sets of annotations"
            java.lang.String r9 = java.lang.String.format(r9, r2)
            r10.<init>(r9)
            throw r10
        L_0x00a1:
            if (r10 != 0) goto L_0x00a7
            r0 = r3
            java.lang.annotation.Annotation[][] r0 = (java.lang.annotation.Annotation[][]) r0
            goto L_0x00ab
        L_0x00a7:
            java.lang.annotation.Annotation[][] r3 = r10.e()
        L_0x00ab:
            q5.p[] r3 = r8.n(r1, r3)
        L_0x00af:
            q5.d r0 = new q5.d
            q5.d0 r1 = r8.f11959d
            java.lang.reflect.Constructor r2 = r9.a()
            q5.p r9 = r8.l(r9, r10)
            r0.<init>(r1, r2, r9, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q5.e.r(a6.h$a, a6.h$a):q5.d");
    }
}
