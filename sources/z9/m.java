package z9;

import android.graphics.RectF;
import d.m0;
import d.v;
import java.util.Arrays;

public final class m implements d {

    /* renamed from: a  reason: collision with root package name */
    public final float f24926a;

    public m(@v(from = 0.0d, to = 1.0d) float f10) {
        this.f24926a = f10;
    }

    public float a(@m0 RectF rectF) {
        return this.f24926a * rectF.height();
    }

    @v(from = 0.0d, to = 1.0d)
    public float b() {
        return this.f24926a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        return this.f24926a == ((m) obj).f24926a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f24926a)});
    }
}
