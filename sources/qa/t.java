package qa;

import za.a;

public class t {

    /* renamed from: a  reason: collision with root package name */
    public final float f22196a;

    /* renamed from: b  reason: collision with root package name */
    public final float f22197b;

    public t(float f10, float f11) {
        this.f22196a = f10;
        this.f22197b = f11;
    }

    public static float a(t tVar, t tVar2, t tVar3) {
        float f10 = tVar2.f22196a;
        float f11 = tVar2.f22197b;
        return ((tVar3.f22196a - f10) * (tVar.f22197b - f11)) - ((tVar3.f22197b - f11) * (tVar.f22196a - f10));
    }

    public static float b(t tVar, t tVar2) {
        return a.a(tVar.f22196a, tVar.f22197b, tVar2.f22196a, tVar2.f22197b);
    }

    public static void e(t[] tVarArr) {
        t tVar;
        t tVar2;
        t tVar3;
        float b10 = b(tVarArr[0], tVarArr[1]);
        float b11 = b(tVarArr[1], tVarArr[2]);
        float b12 = b(tVarArr[0], tVarArr[2]);
        if (b11 >= b10 && b11 >= b12) {
            tVar3 = tVarArr[0];
            tVar2 = tVarArr[1];
            tVar = tVarArr[2];
        } else if (b12 < b11 || b12 < b10) {
            tVar3 = tVarArr[2];
            tVar2 = tVarArr[0];
            tVar = tVarArr[1];
        } else {
            tVar3 = tVarArr[1];
            tVar2 = tVarArr[0];
            tVar = tVarArr[2];
        }
        if (a(tVar2, tVar3, tVar) < 0.0f) {
            t tVar4 = tVar;
            tVar = tVar2;
            tVar2 = tVar4;
        }
        tVarArr[0] = tVar2;
        tVarArr[1] = tVar3;
        tVarArr[2] = tVar;
    }

    public final float c() {
        return this.f22196a;
    }

    public final float d() {
        return this.f22197b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            t tVar = (t) obj;
            return this.f22196a == tVar.f22196a && this.f22197b == tVar.f22197b;
        }
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f22196a) * 31) + Float.floatToIntBits(this.f22197b);
    }

    public final String toString() {
        return "(" + this.f22196a + ',' + this.f22197b + ')';
    }
}
