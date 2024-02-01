package rh;

import java.lang.annotation.Annotation;

public final class y implements x {

    /* renamed from: t0  reason: collision with root package name */
    public static final x f22755t0 = new y();

    public static Annotation[] a(Annotation[] annotationArr) {
        if (z.l(annotationArr, x.class)) {
            return annotationArr;
        }
        Annotation[] annotationArr2 = new Annotation[(annotationArr.length + 1)];
        annotationArr2[0] = f22755t0;
        System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    public Class<? extends Annotation> annotationType() {
        return x.class;
    }

    public boolean equals(Object obj) {
        return obj instanceof x;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "@" + x.class.getName() + "()";
    }
}
