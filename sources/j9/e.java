package j9;

import android.graphics.drawable.Drawable;
import android.util.Property;
import d.m0;
import d.o0;
import java.util.WeakHashMap;

public class e extends Property<Drawable, Integer> {

    /* renamed from: b  reason: collision with root package name */
    public static final Property<Drawable, Integer> f19835b = new e();

    /* renamed from: a  reason: collision with root package name */
    public final WeakHashMap<Drawable, Integer> f19836a = new WeakHashMap<>();

    public e() {
        super(Integer.class, "drawableAlphaCompat");
    }

    @o0
    /* renamed from: a */
    public Integer get(@m0 Drawable drawable) {
        return Integer.valueOf(drawable.getAlpha());
    }

    /* renamed from: b */
    public void set(@m0 Drawable drawable, @m0 Integer num) {
        drawable.setAlpha(num.intValue());
    }
}
