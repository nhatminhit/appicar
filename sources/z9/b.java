package z9;

import android.graphics.RectF;
import d.m0;
import d.x0;
import java.util.Arrays;

@x0({x0.a.LIBRARY_GROUP})
public final class b implements d {

    /* renamed from: a  reason: collision with root package name */
    public final d f24872a;

    /* renamed from: b  reason: collision with root package name */
    public final float f24873b;

    public b(float f10, @m0 d dVar) {
        while (dVar instanceof b) {
            dVar = ((b) dVar).f24872a;
            f10 += ((b) dVar).f24873b;
        }
        this.f24872a = dVar;
        this.f24873b = f10;
    }

    public float a(@m0 RectF rectF) {
        return Math.max(0.0f, this.f24872a.a(rectF) + this.f24873b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f24872a.equals(bVar.f24872a) && this.f24873b == bVar.f24873b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f24872a, Float.valueOf(this.f24873b)});
    }
}
