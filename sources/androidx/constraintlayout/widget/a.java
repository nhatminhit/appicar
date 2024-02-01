package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.widget.e;
import f1.w1;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import v.c;

public class a {

    /* renamed from: h  reason: collision with root package name */
    public static final String f1887h = "TransitionLayout";

    /* renamed from: a  reason: collision with root package name */
    public String f1888a;

    /* renamed from: b  reason: collision with root package name */
    public b f1889b;

    /* renamed from: c  reason: collision with root package name */
    public int f1890c;

    /* renamed from: d  reason: collision with root package name */
    public float f1891d;

    /* renamed from: e  reason: collision with root package name */
    public String f1892e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1893f;

    /* renamed from: g  reason: collision with root package name */
    public int f1894g;

    /* renamed from: androidx.constraintlayout.widget.a$a  reason: collision with other inner class name */
    public static /* synthetic */ class C0028a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f1895a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.constraintlayout.widget.a$b[] r0 = androidx.constraintlayout.widget.a.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1895a = r0
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.a.b.COLOR_TYPE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1895a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.a.b.COLOR_DRAWABLE_TYPE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f1895a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.a.b.INT_TYPE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f1895a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.a.b.FLOAT_TYPE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f1895a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.a.b.STRING_TYPE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f1895a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.a.b.BOOLEAN_TYPE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f1895a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.constraintlayout.widget.a$b r1 = androidx.constraintlayout.widget.a.b.DIMENSION_TYPE     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.a.C0028a.<clinit>():void");
        }
    }

    public enum b {
        INT_TYPE,
        FLOAT_TYPE,
        COLOR_TYPE,
        COLOR_DRAWABLE_TYPE,
        STRING_TYPE,
        BOOLEAN_TYPE,
        DIMENSION_TYPE
    }

    public a(a aVar, Object obj) {
        this.f1888a = aVar.f1888a;
        this.f1889b = aVar.f1889b;
        o(obj);
    }

    public a(String str, b bVar) {
        this.f1888a = str;
        this.f1889b = bVar;
    }

    public a(String str, b bVar, Object obj) {
        this.f1888a = str;
        this.f1889b = bVar;
        o(obj);
    }

    public static int a(int i10) {
        int i11 = (i10 & (~(i10 >> 31))) - 255;
        return (i11 & (i11 >> 31)) + 255;
    }

    public static HashMap<String, a> c(HashMap<String, a> hashMap, View view) {
        a aVar;
        HashMap<String, a> hashMap2 = new HashMap<>();
        Class<?> cls = view.getClass();
        for (String next : hashMap.keySet()) {
            a aVar2 = hashMap.get(next);
            try {
                if (next.equals("BackgroundColor")) {
                    aVar = new a(aVar2, (Object) Integer.valueOf(((ColorDrawable) view.getBackground()).getColor()));
                } else {
                    aVar = new a(aVar2, cls.getMethod("getMap" + next, new Class[0]).invoke(view, new Object[0]));
                }
                hashMap2.put(next, aVar);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
                e10.printStackTrace();
            }
        }
        return hashMap2;
    }

    public static void h(Context context, XmlPullParser xmlPullParser, HashMap<String, a> hashMap) {
        b bVar;
        Object string;
        int integer;
        b bVar2;
        float f10;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), e.m.CustomAttribute);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        Object obj = null;
        b bVar3 = null;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            if (index == e.m.CustomAttribute_attributeName) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == e.m.CustomAttribute_customBoolean) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                bVar3 = b.BOOLEAN_TYPE;
            } else {
                if (index == e.m.CustomAttribute_customColorValue) {
                    bVar = b.COLOR_TYPE;
                } else if (index == e.m.CustomAttribute_customColorDrawableValue) {
                    bVar = b.COLOR_DRAWABLE_TYPE;
                } else {
                    if (index == e.m.CustomAttribute_customPixelDimension) {
                        bVar2 = b.DIMENSION_TYPE;
                        f10 = TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics());
                    } else if (index == e.m.CustomAttribute_customDimension) {
                        bVar2 = b.DIMENSION_TYPE;
                        f10 = obtainStyledAttributes.getDimension(index, 0.0f);
                    } else if (index == e.m.CustomAttribute_customFloatValue) {
                        bVar2 = b.FLOAT_TYPE;
                        f10 = obtainStyledAttributes.getFloat(index, Float.NaN);
                    } else if (index == e.m.CustomAttribute_customIntegerValue) {
                        bVar = b.INT_TYPE;
                        integer = obtainStyledAttributes.getInteger(index, -1);
                        string = Integer.valueOf(integer);
                        Object obj2 = string;
                        bVar3 = bVar;
                        obj = obj2;
                    } else if (index == e.m.CustomAttribute_customStringValue) {
                        bVar = b.STRING_TYPE;
                        string = obtainStyledAttributes.getString(index);
                        Object obj22 = string;
                        bVar3 = bVar;
                        obj = obj22;
                    }
                    string = Float.valueOf(f10);
                    Object obj222 = string;
                    bVar3 = bVar;
                    obj = obj222;
                }
                integer = obtainStyledAttributes.getColor(index, 0);
                string = Integer.valueOf(integer);
                Object obj2222 = string;
                bVar3 = bVar;
                obj = obj2222;
            }
        }
        if (!(str == null || obj == null)) {
            hashMap.put(str, new a(str, bVar3, obj));
        }
        obtainStyledAttributes.recycle();
    }

    public static void i(View view, HashMap<String, a> hashMap) {
        StringBuilder sb2;
        Class<?> cls = view.getClass();
        for (String next : hashMap.keySet()) {
            a aVar = hashMap.get(next);
            String str = "set" + next;
            try {
                switch (C0028a.f1895a[aVar.f1889b.ordinal()]) {
                    case 1:
                        cls.getMethod(str, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(aVar.f1894g)});
                        break;
                    case 2:
                        Method method = cls.getMethod(str, new Class[]{Drawable.class});
                        ColorDrawable colorDrawable = new ColorDrawable();
                        colorDrawable.setColor(aVar.f1894g);
                        method.invoke(view, new Object[]{colorDrawable});
                        break;
                    case 3:
                        cls.getMethod(str, new Class[]{Integer.TYPE}).invoke(view, new Object[]{Integer.valueOf(aVar.f1890c)});
                        break;
                    case 4:
                        cls.getMethod(str, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(aVar.f1891d)});
                        break;
                    case 5:
                        cls.getMethod(str, new Class[]{CharSequence.class}).invoke(view, new Object[]{aVar.f1892e});
                        break;
                    case 6:
                        cls.getMethod(str, new Class[]{Boolean.TYPE}).invoke(view, new Object[]{Boolean.valueOf(aVar.f1893f)});
                        break;
                    case 7:
                        cls.getMethod(str, new Class[]{Float.TYPE}).invoke(view, new Object[]{Float.valueOf(aVar.f1891d)});
                        break;
                }
            } catch (NoSuchMethodException e10) {
                e10.getMessage();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(" Custom Attribute \"");
                sb3.append(next);
                sb3.append("\" not found on ");
                sb3.append(cls.getName());
                StringBuilder sb4 = new StringBuilder();
                sb4.append(cls.getName());
                sb4.append(" must have a method ");
                sb4.append(str);
            } catch (IllegalAccessException e11) {
                e = e11;
                sb2 = new StringBuilder();
                sb2.append(" Custom Attribute \"");
                sb2.append(next);
                sb2.append("\" not found on ");
                sb2.append(cls.getName());
                e.printStackTrace();
            } catch (InvocationTargetException e12) {
                e = e12;
                sb2 = new StringBuilder();
                sb2.append(" Custom Attribute \"");
                sb2.append(next);
                sb2.append("\" not found on ");
                sb2.append(cls.getName());
                e.printStackTrace();
            }
        }
    }

    public boolean b(a aVar) {
        b bVar;
        if (aVar == null || (bVar = this.f1889b) != aVar.f1889b) {
            return false;
        }
        switch (C0028a.f1895a[bVar.ordinal()]) {
            case 1:
            case 2:
                return this.f1894g == aVar.f1894g;
            case 3:
                return this.f1890c == aVar.f1890c;
            case 4:
                return this.f1891d == aVar.f1891d;
            case 5:
                return this.f1890c == aVar.f1890c;
            case 6:
                return this.f1893f == aVar.f1893f;
            case 7:
                return this.f1891d == aVar.f1891d;
            default:
                return false;
        }
    }

    public b d() {
        return this.f1889b;
    }

    public float e() {
        switch (C0028a.f1895a[this.f1889b.ordinal()]) {
            case 1:
            case 2:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 3:
                return (float) this.f1890c;
            case 4:
                return this.f1891d;
            case 5:
                throw new RuntimeException("Cannot interpolate String");
            case 6:
                return this.f1893f ? 1.0f : 0.0f;
            case 7:
                return this.f1891d;
            default:
                return Float.NaN;
        }
    }

    public void f(float[] fArr) {
        switch (C0028a.f1895a[this.f1889b.ordinal()]) {
            case 1:
            case 2:
                int i10 = this.f1894g;
                float pow = (float) Math.pow((double) (((float) ((i10 >> 16) & 255)) / 255.0f), 2.2d);
                float pow2 = (float) Math.pow((double) (((float) ((i10 >> 8) & 255)) / 255.0f), 2.2d);
                fArr[0] = pow;
                fArr[1] = pow2;
                fArr[2] = (float) Math.pow((double) (((float) (i10 & 255)) / 255.0f), 2.2d);
                fArr[3] = ((float) ((i10 >> 24) & 255)) / 255.0f;
                return;
            case 3:
                fArr[0] = (float) this.f1890c;
                return;
            case 4:
                fArr[0] = this.f1891d;
                return;
            case 5:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 6:
                fArr[0] = this.f1893f ? 1.0f : 0.0f;
                return;
            case 7:
                fArr[0] = this.f1891d;
                return;
            default:
                return;
        }
    }

    public int g() {
        int i10 = C0028a.f1895a[this.f1889b.ordinal()];
        return (i10 == 1 || i10 == 2) ? 4 : 1;
    }

    public void j(int i10) {
        this.f1894g = i10;
    }

    public void k(float f10) {
        this.f1891d = f10;
    }

    public void l(int i10) {
        this.f1890c = i10;
    }

    public void m(View view, float[] fArr) {
        String str;
        StringBuilder sb2;
        View view2 = view;
        Class<?> cls = view.getClass();
        String str2 = "set" + this.f1888a;
        try {
            boolean z10 = true;
            switch (C0028a.f1895a[this.f1889b.ordinal()]) {
                case 1:
                    cls.getMethod(str2, new Class[]{Integer.TYPE}).invoke(view2, new Object[]{Integer.valueOf((a((int) (((float) Math.pow((double) fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (a((int) (fArr[3] * 255.0f)) << 24) | (a((int) (((float) Math.pow((double) fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | a((int) (((float) Math.pow((double) fArr[2], 0.45454545454545453d)) * 255.0f)))});
                    return;
                case 2:
                    Method method = cls.getMethod(str2, new Class[]{Drawable.class});
                    int a10 = a((int) (((float) Math.pow((double) fArr[0], 0.45454545454545453d)) * 255.0f));
                    int a11 = a((int) (((float) Math.pow((double) fArr[1], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable colorDrawable = new ColorDrawable();
                    colorDrawable.setColor((a10 << 16) | (a((int) (fArr[3] * 255.0f)) << 24) | (a11 << 8) | a((int) (((float) Math.pow((double) fArr[2], 0.45454545454545453d)) * 255.0f)));
                    method.invoke(view2, new Object[]{colorDrawable});
                    return;
                case 3:
                    cls.getMethod(str2, new Class[]{Integer.TYPE}).invoke(view2, new Object[]{Integer.valueOf((int) fArr[0])});
                    return;
                case 4:
                    cls.getMethod(str2, new Class[]{Float.TYPE}).invoke(view2, new Object[]{Float.valueOf(fArr[0])});
                    return;
                case 5:
                    throw new RuntimeException("unable to interpolate strings " + this.f1888a);
                case 6:
                    Method method2 = cls.getMethod(str2, new Class[]{Boolean.TYPE});
                    Object[] objArr = new Object[1];
                    if (fArr[0] <= 0.5f) {
                        z10 = false;
                    }
                    objArr[0] = Boolean.valueOf(z10);
                    method2.invoke(view2, objArr);
                    return;
                case 7:
                    cls.getMethod(str2, new Class[]{Float.TYPE}).invoke(view2, new Object[]{Float.valueOf(fArr[0])});
                    return;
                default:
                    return;
            }
        } catch (NoSuchMethodException e10) {
            e = e10;
            sb2 = new StringBuilder();
            str = "no method ";
            sb2.append(str);
            sb2.append(str2);
            sb2.append("on View \"");
            sb2.append(c.k(view));
            sb2.append("\"");
            e.printStackTrace();
        } catch (IllegalAccessException e11) {
            e = e11;
            sb2 = new StringBuilder();
            str = "cannot access method ";
            sb2.append(str);
            sb2.append(str2);
            sb2.append("on View \"");
            sb2.append(c.k(view));
            sb2.append("\"");
            e.printStackTrace();
        } catch (InvocationTargetException e12) {
            e = e12;
            e.printStackTrace();
        }
    }

    public void n(String str) {
        this.f1892e = str;
    }

    public void o(Object obj) {
        switch (C0028a.f1895a[this.f1889b.ordinal()]) {
            case 1:
            case 2:
                this.f1894g = ((Integer) obj).intValue();
                return;
            case 3:
                this.f1890c = ((Integer) obj).intValue();
                return;
            case 4:
            case 7:
                this.f1891d = ((Float) obj).floatValue();
                return;
            case 5:
                this.f1892e = (String) obj;
                return;
            case 6:
                this.f1893f = ((Boolean) obj).booleanValue();
                return;
            default:
                return;
        }
    }

    public void p(float[] fArr) {
        float f10;
        boolean z10 = false;
        switch (C0028a.f1895a[this.f1889b.ordinal()]) {
            case 1:
            case 2:
                int HSVToColor = Color.HSVToColor(fArr);
                this.f1894g = HSVToColor;
                this.f1894g = (a((int) (fArr[3] * 255.0f)) << 24) | (HSVToColor & w1.f7299s);
                return;
            case 3:
                this.f1890c = (int) fArr[0];
                return;
            case 4:
                f10 = fArr[0];
                break;
            case 5:
                throw new RuntimeException("Color does not have a single color to interpolate");
            case 6:
                if (((double) fArr[0]) > 0.5d) {
                    z10 = true;
                }
                this.f1893f = z10;
                return;
            case 7:
                f10 = fArr[0];
                break;
            default:
                return;
        }
        this.f1891d = f10;
    }
}
