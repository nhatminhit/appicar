package u1;

import android.util.FloatProperty;
import d.t0;

public abstract class d<T> {

    /* renamed from: a  reason: collision with root package name */
    public final String f13455a;

    public static class a extends d<T> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ FloatProperty f13456b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, FloatProperty floatProperty) {
            super(str);
            this.f13456b = floatProperty;
        }

        public float b(T t10) {
            return ((Float) this.f13456b.get(t10)).floatValue();
        }

        public void c(T t10, float f10) {
            this.f13456b.setValue(t10, f10);
        }
    }

    public d(String str) {
        this.f13455a = str;
    }

    @t0(24)
    public static <T> d<T> a(FloatProperty floatProperty) {
        return new a(floatProperty.getName(), floatProperty);
    }

    public abstract float b(T t10);

    public abstract void c(T t10, float f10);
}
