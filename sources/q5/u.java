package q5;

import a6.h;
import i5.b;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

public class u {

    /* renamed from: b  reason: collision with root package name */
    public static final p[] f11989b = new p[0];

    /* renamed from: c  reason: collision with root package name */
    public static final Annotation[] f11990c = new Annotation[0];

    /* renamed from: a  reason: collision with root package name */
    public final b f11991a;

    public u(b bVar) {
        this.f11991a = bVar;
    }

    public static p a() {
        return new p();
    }

    public static p[] b(int i10) {
        if (i10 == 0) {
            return f11989b;
        }
        p[] pVarArr = new p[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            pVarArr[i11] = a();
        }
        return pVarArr;
    }

    public static final boolean c(Annotation annotation) {
        return (annotation instanceof Target) || (annotation instanceof Retention);
    }

    public final n d(n nVar, Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            nVar = nVar.a(annotation);
            if (this.f11991a.D0(annotation)) {
                nVar = h(nVar, annotation);
            }
        }
        return nVar;
    }

    public final n e(Annotation[] annotationArr) {
        n e10 = n.e();
        for (Annotation annotation : annotationArr) {
            e10 = e10.a(annotation);
            if (this.f11991a.D0(annotation)) {
                e10 = h(e10, annotation);
            }
        }
        return e10;
    }

    public final n f(n nVar, Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            if (!nVar.h(annotation)) {
                nVar = nVar.a(annotation);
                if (this.f11991a.D0(annotation)) {
                    nVar = g(nVar, annotation);
                }
            }
        }
        return nVar;
    }

    public final n g(n nVar, Annotation annotation) {
        for (Annotation annotation2 : h.p(annotation.annotationType())) {
            if (!c(annotation2) && !nVar.h(annotation2)) {
                nVar = nVar.a(annotation2);
                if (this.f11991a.D0(annotation2)) {
                    nVar = h(nVar, annotation2);
                }
            }
        }
        return nVar;
    }

    public final n h(n nVar, Annotation annotation) {
        for (Annotation annotation2 : h.p(annotation.annotationType())) {
            if (!c(annotation2)) {
                if (!this.f11991a.D0(annotation2)) {
                    nVar = nVar.a(annotation2);
                } else if (!nVar.h(annotation2)) {
                    nVar = h(nVar.a(annotation2), annotation2);
                }
            }
        }
        return nVar;
    }
}
