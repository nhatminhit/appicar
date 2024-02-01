package u;

import v.t;

public class i {

    /* renamed from: g  reason: collision with root package name */
    public static String f13356g = "VelocityMatrix";

    /* renamed from: a  reason: collision with root package name */
    public float f13357a;

    /* renamed from: b  reason: collision with root package name */
    public float f13358b;

    /* renamed from: c  reason: collision with root package name */
    public float f13359c;

    /* renamed from: d  reason: collision with root package name */
    public float f13360d;

    /* renamed from: e  reason: collision with root package name */
    public float f13361e;

    /* renamed from: f  reason: collision with root package name */
    public float f13362f;

    public void a(float f10, float f11, int i10, int i11, float[] fArr) {
        int i12 = i10;
        float f12 = fArr[0];
        float f13 = fArr[1];
        float f14 = (f10 - 0.5f) * 2.0f;
        float f15 = (f11 - 0.5f) * 2.0f;
        float f16 = f12 + this.f13359c;
        float f17 = f13 + this.f13360d;
        float f18 = f16 + (this.f13357a * f14);
        float f19 = f17 + (this.f13358b * f15);
        float radians = (float) Math.toRadians((double) this.f13361e);
        double radians2 = (double) ((float) Math.toRadians((double) this.f13362f));
        double d10 = (double) (((float) i11) * f15);
        fArr[0] = f18 + (((float) ((((double) (((float) (-i12)) * f14)) * Math.sin(radians2)) - (Math.cos(radians2) * d10))) * radians);
        fArr[1] = f19 + (radians * ((float) ((((double) (((float) i12) * f14)) * Math.cos(radians2)) - (d10 * Math.sin(radians2)))));
    }

    public void b() {
        this.f13361e = 0.0f;
        this.f13360d = 0.0f;
        this.f13359c = 0.0f;
        this.f13358b = 0.0f;
        this.f13357a = 0.0f;
    }

    public void c(v.i iVar, float f10) {
        if (iVar != null) {
            this.f13361e = iVar.c(f10);
        }
    }

    public void d(t tVar, float f10) {
        if (tVar != null) {
            this.f13361e = tVar.c(f10);
            this.f13362f = tVar.a(f10);
        }
    }

    public void e(v.i iVar, v.i iVar2, float f10) {
        if (iVar != null || iVar2 != null) {
            if (iVar == null) {
                this.f13357a = iVar.c(f10);
            }
            if (iVar2 == null) {
                this.f13358b = iVar2.c(f10);
            }
        }
    }

    public void f(t tVar, t tVar2, float f10) {
        if (tVar != null) {
            this.f13357a = tVar.c(f10);
        }
        if (tVar2 != null) {
            this.f13358b = tVar2.c(f10);
        }
    }

    public void g(v.i iVar, v.i iVar2, float f10) {
        if (iVar != null) {
            this.f13359c = iVar.c(f10);
        }
        if (iVar2 != null) {
            this.f13360d = iVar2.c(f10);
        }
    }

    public void h(t tVar, t tVar2, float f10) {
        if (tVar != null) {
            this.f13359c = tVar.c(f10);
        }
        if (tVar2 != null) {
            this.f13360d = tVar2.c(f10);
        }
    }
}
