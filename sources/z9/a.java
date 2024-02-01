package z9;

import android.graphics.RectF;
import d.m0;
import java.util.Arrays;

public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public final float f24871a;

    public a(float f10) {
        this.f24871a = f10;
    }

    public float a(@m0 RectF rectF) {
        return this.f24871a;
    }

    public float b() {
        return this.f24871a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        return this.f24871a == ((a) obj).f24871a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f24871a)});
    }
}
