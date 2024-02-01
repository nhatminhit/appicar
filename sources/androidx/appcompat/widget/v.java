package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import d.g1;
import d.m0;
import d.o0;
import d.t0;
import d.x0;
import f.a;
import f1.w1;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

public class v {

    /* renamed from: l  reason: collision with root package name */
    public static final String f1465l = "ACTVAutoSizeHelper";

    /* renamed from: m  reason: collision with root package name */
    public static final RectF f1466m = new RectF();

    /* renamed from: n  reason: collision with root package name */
    public static final int f1467n = 12;

    /* renamed from: o  reason: collision with root package name */
    public static final int f1468o = 112;

    /* renamed from: p  reason: collision with root package name */
    public static final int f1469p = 1;
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: q  reason: collision with root package name */
    public static ConcurrentHashMap<String, Method> f1470q = new ConcurrentHashMap<>();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: r  reason: collision with root package name */
    public static ConcurrentHashMap<String, Field> f1471r = new ConcurrentHashMap<>();

    /* renamed from: s  reason: collision with root package name */
    public static final float f1472s = -1.0f;

    /* renamed from: t  reason: collision with root package name */
    public static final int f1473t = 1048576;

    /* renamed from: a  reason: collision with root package name */
    public int f1474a = 0;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1475b = false;

    /* renamed from: c  reason: collision with root package name */
    public float f1476c = -1.0f;

    /* renamed from: d  reason: collision with root package name */
    public float f1477d = -1.0f;

    /* renamed from: e  reason: collision with root package name */
    public float f1478e = -1.0f;

    /* renamed from: f  reason: collision with root package name */
    public int[] f1479f = new int[0];

    /* renamed from: g  reason: collision with root package name */
    public boolean f1480g = false;

    /* renamed from: h  reason: collision with root package name */
    public TextPaint f1481h;
    @m0

    /* renamed from: i  reason: collision with root package name */
    public final TextView f1482i;

    /* renamed from: j  reason: collision with root package name */
    public final Context f1483j;

    /* renamed from: k  reason: collision with root package name */
    public final c f1484k;

    @t0(23)
    public static class a extends c {
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) v.r(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    @t0(29)
    public static class b extends a {
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        public boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    public static class c {
        public void a(StaticLayout.Builder builder, TextView textView) {
        }

        public boolean b(TextView textView) {
            return ((Boolean) v.r(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    public v(@m0 TextView textView) {
        this.f1482i = textView;
        this.f1483j = textView.getContext();
        this.f1484k = Build.VERSION.SDK_INT >= 29 ? new b() : new a();
    }

    public static <T> T a(@m0 Object obj, @m0 String str, @m0 T t10) {
        try {
            Field o10 = o(str);
            return o10 == null ? t10 : o10.get(obj);
        } catch (IllegalAccessException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to access TextView#");
            sb2.append(str);
            sb2.append(" member");
            return t10;
        }
    }

    @o0
    public static Field o(@m0 String str) {
        try {
            Field field = f1471r.get(str);
            if (field == null && (field = TextView.class.getDeclaredField(str)) != null) {
                field.setAccessible(true);
                f1471r.put(str, field);
            }
            return field;
        } catch (NoSuchFieldException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to access TextView#");
            sb2.append(str);
            sb2.append(" member");
            return null;
        }
    }

    @o0
    public static Method p(@m0 String str) {
        try {
            Method method = f1470q.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                f1470q.put(str, method);
            }
            return method;
        } catch (Exception unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to retrieve TextView#");
            sb2.append(str);
            sb2.append("() method");
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
        r2 = new java.lang.StringBuilder();
        r2.append("Failed to invoke TextView#");
        r2.append(r3);
        r2.append("() method");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        return r4;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> T r(@d.m0 java.lang.Object r2, @d.m0 java.lang.String r3, @d.m0 T r4) {
        /*
            java.lang.reflect.Method r0 = p(r3)     // Catch:{ Exception -> 0x000e }
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x000e }
            java.lang.Object r4 = r0.invoke(r2, r1)     // Catch:{ Exception -> 0x000e }
            goto L_0x0020
        L_0x000c:
            r2 = move-exception
            goto L_0x0021
        L_0x000e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x000c }
            r2.<init>()     // Catch:{ all -> 0x000c }
            java.lang.String r0 = "Failed to invoke TextView#"
            r2.append(r0)     // Catch:{ all -> 0x000c }
            r2.append(r3)     // Catch:{ all -> 0x000c }
            java.lang.String r3 = "() method"
            r2.append(r3)     // Catch:{ all -> 0x000c }
        L_0x0020:
            return r4
        L_0x0021:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.v.r(java.lang.Object, java.lang.String, java.lang.Object):java.lang.Object");
    }

    public final void A(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = typedArray.getDimensionPixelSize(i10, -1);
            }
            this.f1479f = c(iArr);
            B();
        }
    }

    public final boolean B() {
        int[] iArr = this.f1479f;
        int length = iArr.length;
        boolean z10 = length > 0;
        this.f1480g = z10;
        if (z10) {
            this.f1474a = 1;
            this.f1477d = (float) iArr[0];
            this.f1478e = (float) iArr[length - 1];
            this.f1476c = -1.0f;
        }
        return z10;
    }

    public final boolean C(int i10, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f1482i.getText();
        TransformationMethod transformationMethod = this.f1482i.getTransformationMethod();
        if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, this.f1482i)) == null)) {
            text = transformation;
        }
        int maxLines = this.f1482i.getMaxLines();
        q(i10);
        StaticLayout e10 = e(text, (Layout.Alignment) r(this.f1482i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (e10.getLineCount() <= maxLines && e10.getLineEnd(e10.getLineCount() - 1) == text.length())) && ((float) e10.getHeight()) <= rectF.bottom;
    }

    public final boolean D() {
        return !(this.f1482i instanceof AppCompatEditText);
    }

    public final void E(float f10, float f11, float f12) throws IllegalArgumentException {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
        } else if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        } else if (f12 > 0.0f) {
            this.f1474a = 1;
            this.f1477d = f10;
            this.f1478e = f11;
            this.f1476c = f12;
            this.f1480g = false;
        } else {
            throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
        }
    }

    @x0({x0.a.Q})
    public void b() {
        if (s()) {
            if (this.f1475b) {
                if (this.f1482i.getMeasuredHeight() > 0 && this.f1482i.getMeasuredWidth() > 0) {
                    int measuredWidth = this.f1484k.b(this.f1482i) ? 1048576 : (this.f1482i.getMeasuredWidth() - this.f1482i.getTotalPaddingLeft()) - this.f1482i.getTotalPaddingRight();
                    int height = (this.f1482i.getHeight() - this.f1482i.getCompoundPaddingBottom()) - this.f1482i.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        RectF rectF = f1466m;
                        synchronized (rectF) {
                            rectF.setEmpty();
                            rectF.right = (float) measuredWidth;
                            rectF.bottom = (float) height;
                            float i10 = (float) i(rectF);
                            if (i10 != this.f1482i.getTextSize()) {
                                y(0, i10);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f1475b = true;
        }
    }

    public final int[] c(int[] iArr) {
        if (r0 == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 : iArr) {
            if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        if (r0 == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
        }
        return iArr2;
    }

    public final void d() {
        this.f1474a = 0;
        this.f1477d = -1.0f;
        this.f1478e = -1.0f;
        this.f1476c = -1.0f;
        this.f1479f = new int[0];
        this.f1475b = false;
    }

    @g1
    public StaticLayout e(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11) {
        return f(charSequence, alignment, i10, i11);
    }

    @t0(23)
    public final StaticLayout f(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f1481h, i10);
        StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(this.f1482i.getLineSpacingExtra(), this.f1482i.getLineSpacingMultiplier()).setIncludePad(this.f1482i.getIncludeFontPadding()).setBreakStrategy(this.f1482i.getBreakStrategy()).setHyphenationFrequency(this.f1482i.getHyphenationFrequency());
        if (i11 == -1) {
            i11 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i11);
        try {
            this.f1484k.a(obtain, this.f1482i);
        } catch (ClassCastException unused) {
        }
        return obtain.build();
    }

    public final StaticLayout g(CharSequence charSequence, Layout.Alignment alignment, int i10) {
        return new StaticLayout(charSequence, this.f1481h, i10, alignment, ((Float) a(this.f1482i, "mSpacingMult", Float.valueOf(1.0f))).floatValue(), ((Float) a(this.f1482i, "mSpacingAdd", Float.valueOf(0.0f))).floatValue(), ((Boolean) a(this.f1482i, "mIncludePad", Boolean.TRUE)).booleanValue());
    }

    @t0(16)
    public final StaticLayout h(CharSequence charSequence, Layout.Alignment alignment, int i10) {
        return new StaticLayout(charSequence, this.f1481h, i10, alignment, this.f1482i.getLineSpacingMultiplier(), this.f1482i.getLineSpacingExtra(), this.f1482i.getIncludeFontPadding());
    }

    public final int i(RectF rectF) {
        int length = this.f1479f.length;
        if (length != 0) {
            int i10 = 0;
            int i11 = 1;
            int i12 = length - 1;
            while (true) {
                int i13 = i11;
                int i14 = i10;
                i10 = i13;
                while (i10 <= i12) {
                    int i15 = (i10 + i12) / 2;
                    if (C(this.f1479f[i15], rectF)) {
                        i11 = i15 + 1;
                    } else {
                        i14 = i15 - 1;
                        i12 = i14;
                    }
                }
                return this.f1479f[i14];
            }
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    @x0({x0.a.Q})
    public int j() {
        return Math.round(this.f1478e);
    }

    @x0({x0.a.Q})
    public int k() {
        return Math.round(this.f1477d);
    }

    @x0({x0.a.Q})
    public int l() {
        return Math.round(this.f1476c);
    }

    @x0({x0.a.Q})
    public int[] m() {
        return this.f1479f;
    }

    @x0({x0.a.Q})
    public int n() {
        return this.f1474a;
    }

    @g1
    public void q(int i10) {
        TextPaint textPaint = this.f1481h;
        if (textPaint == null) {
            this.f1481h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f1481h.set(this.f1482i.getPaint());
        this.f1481h.setTextSize((float) i10);
    }

    @x0({x0.a.Q})
    public boolean s() {
        return D() && this.f1474a != 0;
    }

    public void t(@o0 AttributeSet attributeSet, int i10) {
        int resourceId;
        Context context = this.f1483j;
        int[] iArr = a.n.AppCompatTextView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        TextView textView = this.f1482i;
        w1.x1(textView, textView.getContext(), iArr, attributeSet, obtainStyledAttributes, i10, 0);
        int i11 = a.n.AppCompatTextView_autoSizeTextType;
        if (obtainStyledAttributes.hasValue(i11)) {
            this.f1474a = obtainStyledAttributes.getInt(i11, 0);
        }
        int i12 = a.n.AppCompatTextView_autoSizeStepGranularity;
        float dimension = obtainStyledAttributes.hasValue(i12) ? obtainStyledAttributes.getDimension(i12, -1.0f) : -1.0f;
        int i13 = a.n.AppCompatTextView_autoSizeMinTextSize;
        float dimension2 = obtainStyledAttributes.hasValue(i13) ? obtainStyledAttributes.getDimension(i13, -1.0f) : -1.0f;
        int i14 = a.n.AppCompatTextView_autoSizeMaxTextSize;
        float dimension3 = obtainStyledAttributes.hasValue(i14) ? obtainStyledAttributes.getDimension(i14, -1.0f) : -1.0f;
        int i15 = a.n.AppCompatTextView_autoSizePresetSizes;
        if (obtainStyledAttributes.hasValue(i15) && (resourceId = obtainStyledAttributes.getResourceId(i15, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            A(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!D()) {
            this.f1474a = 0;
        } else if (this.f1474a == 1) {
            if (!this.f1480g) {
                DisplayMetrics displayMetrics = this.f1483j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                E(dimension2, dimension3, dimension);
            }
            z();
        }
    }

    @x0({x0.a.Q})
    public void u(int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        if (D()) {
            DisplayMetrics displayMetrics = this.f1483j.getResources().getDisplayMetrics();
            E(TypedValue.applyDimension(i13, (float) i10, displayMetrics), TypedValue.applyDimension(i13, (float) i11, displayMetrics), TypedValue.applyDimension(i13, (float) i12, displayMetrics));
            if (z()) {
                b();
            }
        }
    }

    @x0({x0.a.Q})
    public void v(@m0 int[] iArr, int i10) throws IllegalArgumentException {
        if (D()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i10 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f1483j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArr2[i11] = Math.round(TypedValue.applyDimension(i10, (float) iArr[i11], displayMetrics));
                    }
                }
                this.f1479f = c(iArr2);
                if (!B()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f1480g = false;
            }
            if (z()) {
                b();
            }
        }
    }

    @x0({x0.a.Q})
    public void w(int i10) {
        if (!D()) {
            return;
        }
        if (i10 == 0) {
            d();
        } else if (i10 == 1) {
            DisplayMetrics displayMetrics = this.f1483j.getResources().getDisplayMetrics();
            E(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (z()) {
                b();
            }
        } else {
            throw new IllegalArgumentException("Unknown auto-size text type: " + i10);
        }
    }

    public final void x(float f10) {
        if (f10 != this.f1482i.getPaint().getTextSize()) {
            this.f1482i.getPaint().setTextSize(f10);
            boolean isInLayout = this.f1482i.isInLayout();
            if (this.f1482i.getLayout() != null) {
                this.f1475b = false;
                try {
                    Method p10 = p("nullLayouts");
                    if (p10 != null) {
                        p10.invoke(this.f1482i, new Object[0]);
                    }
                } catch (Exception unused) {
                }
                if (!isInLayout) {
                    this.f1482i.requestLayout();
                } else {
                    this.f1482i.forceLayout();
                }
                this.f1482i.invalidate();
            }
        }
    }

    @x0({x0.a.Q})
    public void y(int i10, float f10) {
        Context context = this.f1483j;
        x(TypedValue.applyDimension(i10, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    public final boolean z() {
        if (!D() || this.f1474a != 1) {
            this.f1475b = false;
        } else {
            if (!this.f1480g || this.f1479f.length == 0) {
                int floor = ((int) Math.floor((double) ((this.f1478e - this.f1477d) / this.f1476c))) + 1;
                int[] iArr = new int[floor];
                for (int i10 = 0; i10 < floor; i10++) {
                    iArr[i10] = Math.round(this.f1477d + (((float) i10) * this.f1476c));
                }
                this.f1479f = c(iArr);
            }
            this.f1475b = true;
        }
        return this.f1475b;
    }
}
