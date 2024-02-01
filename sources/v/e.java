package v;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.a;
import java.util.HashMap;
import java.util.HashSet;

public abstract class e {

    /* renamed from: f  reason: collision with root package name */
    public static int f13910f = -1;

    /* renamed from: g  reason: collision with root package name */
    public static final String f13911g = "alpha";

    /* renamed from: h  reason: collision with root package name */
    public static final String f13912h = "elevation";

    /* renamed from: i  reason: collision with root package name */
    public static final String f13913i = "rotation";

    /* renamed from: j  reason: collision with root package name */
    public static final String f13914j = "rotationX";

    /* renamed from: k  reason: collision with root package name */
    public static final String f13915k = "rotationY";

    /* renamed from: l  reason: collision with root package name */
    public static final String f13916l = "transformPivotX";

    /* renamed from: m  reason: collision with root package name */
    public static final String f13917m = "transformPivotY";

    /* renamed from: n  reason: collision with root package name */
    public static final String f13918n = "transitionPathRotate";

    /* renamed from: o  reason: collision with root package name */
    public static final String f13919o = "scaleX";

    /* renamed from: p  reason: collision with root package name */
    public static final String f13920p = "scaleY";

    /* renamed from: q  reason: collision with root package name */
    public static final String f13921q = "wavePeriod";

    /* renamed from: r  reason: collision with root package name */
    public static final String f13922r = "waveOffset";

    /* renamed from: s  reason: collision with root package name */
    public static final String f13923s = "waveVariesBy";

    /* renamed from: t  reason: collision with root package name */
    public static final String f13924t = "translationX";

    /* renamed from: u  reason: collision with root package name */
    public static final String f13925u = "translationY";

    /* renamed from: v  reason: collision with root package name */
    public static final String f13926v = "translationZ";

    /* renamed from: w  reason: collision with root package name */
    public static final String f13927w = "progress";

    /* renamed from: x  reason: collision with root package name */
    public static final String f13928x = "CUSTOM";

    /* renamed from: a  reason: collision with root package name */
    public int f13929a;

    /* renamed from: b  reason: collision with root package name */
    public int f13930b;

    /* renamed from: c  reason: collision with root package name */
    public String f13931c = null;

    /* renamed from: d  reason: collision with root package name */
    public int f13932d;

    /* renamed from: e  reason: collision with root package name */
    public HashMap<String, a> f13933e;

    public e() {
        int i10 = f13910f;
        this.f13929a = i10;
        this.f13930b = i10;
    }

    public abstract void a(HashMap<String, t> hashMap);

    public abstract void b(HashSet<String> hashSet);

    public abstract void c(Context context, AttributeSet attributeSet);

    public boolean d(String str) {
        String str2 = this.f13931c;
        if (str2 == null || str == null) {
            return false;
        }
        return str.matches(str2);
    }

    public void e(HashMap<String, Integer> hashMap) {
    }

    public abstract void f(String str, Object obj);

    public boolean g(Object obj) {
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : Boolean.parseBoolean(obj.toString());
    }

    public float h(Object obj) {
        return obj instanceof Float ? ((Float) obj).floatValue() : Float.parseFloat(obj.toString());
    }

    public int i(Object obj) {
        return obj instanceof Integer ? ((Integer) obj).intValue() : Integer.parseInt(obj.toString());
    }
}
