package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import d.m0;
import d.o0;
import d.x0;
import f.a;
import f1.w1;
import i1.e;
import java.lang.ref.WeakReference;
import k0.g;

public class u {

    /* renamed from: n  reason: collision with root package name */
    public static final int f1440n = -1;

    /* renamed from: o  reason: collision with root package name */
    public static final int f1441o = 1;

    /* renamed from: p  reason: collision with root package name */
    public static final int f1442p = 2;

    /* renamed from: q  reason: collision with root package name */
    public static final int f1443q = 3;
    @m0

    /* renamed from: a  reason: collision with root package name */
    public final TextView f1444a;

    /* renamed from: b  reason: collision with root package name */
    public u0 f1445b;

    /* renamed from: c  reason: collision with root package name */
    public u0 f1446c;

    /* renamed from: d  reason: collision with root package name */
    public u0 f1447d;

    /* renamed from: e  reason: collision with root package name */
    public u0 f1448e;

    /* renamed from: f  reason: collision with root package name */
    public u0 f1449f;

    /* renamed from: g  reason: collision with root package name */
    public u0 f1450g;

    /* renamed from: h  reason: collision with root package name */
    public u0 f1451h;
    @m0

    /* renamed from: i  reason: collision with root package name */
    public final v f1452i;

    /* renamed from: j  reason: collision with root package name */
    public int f1453j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f1454k = -1;

    /* renamed from: l  reason: collision with root package name */
    public Typeface f1455l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1456m;

    public class a extends g.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f1457a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f1458b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ WeakReference f1459c;

        public a(int i10, int i11, WeakReference weakReference) {
            this.f1457a = i10;
            this.f1458b = i11;
            this.f1459c = weakReference;
        }

        public void d(int i10) {
        }

        public void e(@m0 Typeface typeface) {
            int i10;
            if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f1457a) != -1) {
                typeface = Typeface.create(typeface, i10, (this.f1458b & 2) != 0);
            }
            u.this.n(this.f1459c, typeface);
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ TextView O;
        public final /* synthetic */ Typeface P;
        public final /* synthetic */ int Q;

        public b(TextView textView, Typeface typeface, int i10) {
            this.O = textView;
            this.P = typeface;
            this.Q = i10;
        }

        public void run() {
            this.O.setTypeface(this.P, this.Q);
        }
    }

    public u(@m0 TextView textView) {
        this.f1444a = textView;
        this.f1452i = new v(textView);
    }

    public static u0 d(Context context, f fVar, int i10) {
        ColorStateList f10 = fVar.f(context, i10);
        if (f10 == null) {
            return null;
        }
        u0 u0Var = new u0();
        u0Var.f1464d = true;
        u0Var.f1461a = f10;
        return u0Var;
    }

    @x0({x0.a.Q})
    public void A(int i10, float f10) {
        if (!androidx.core.widget.b.f2286a && !l()) {
            B(i10, f10);
        }
    }

    public final void B(int i10, float f10) {
        this.f1452i.y(i10, f10);
    }

    public final void C(Context context, w0 w0Var) {
        String w10;
        Typeface typeface;
        Typeface typeface2;
        this.f1453j = w0Var.o(a.n.TextAppearance_android_textStyle, this.f1453j);
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = false;
        if (i10 >= 28) {
            int o10 = w0Var.o(a.n.TextAppearance_android_textFontWeight, -1);
            this.f1454k = o10;
            if (o10 != -1) {
                this.f1453j = (this.f1453j & 2) | 0;
            }
        }
        int i11 = a.n.TextAppearance_android_fontFamily;
        if (w0Var.C(i11) || w0Var.C(a.n.TextAppearance_fontFamily)) {
            this.f1455l = null;
            int i12 = a.n.TextAppearance_fontFamily;
            if (w0Var.C(i12)) {
                i11 = i12;
            }
            int i13 = this.f1454k;
            int i14 = this.f1453j;
            if (!context.isRestricted()) {
                try {
                    Typeface k10 = w0Var.k(i11, this.f1453j, new a(i13, i14, new WeakReference(this.f1444a)));
                    if (k10 != null) {
                        if (i10 >= 28 && this.f1454k != -1) {
                            k10 = Typeface.create(Typeface.create(k10, 0), this.f1454k, (this.f1453j & 2) != 0);
                        }
                        this.f1455l = k10;
                    }
                    this.f1456m = this.f1455l == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f1455l == null && (w10 = w0Var.w(i11)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.f1454k == -1) {
                    typeface = Typeface.create(w10, this.f1453j);
                } else {
                    Typeface create = Typeface.create(w10, 0);
                    int i15 = this.f1454k;
                    if ((this.f1453j & 2) != 0) {
                        z10 = true;
                    }
                    typeface = Typeface.create(create, i15, z10);
                }
                this.f1455l = typeface;
                return;
            }
            return;
        }
        int i16 = a.n.TextAppearance_android_typeface;
        if (w0Var.C(i16)) {
            this.f1456m = false;
            int o11 = w0Var.o(i16, 1);
            if (o11 == 1) {
                typeface2 = Typeface.SANS_SERIF;
            } else if (o11 == 2) {
                typeface2 = Typeface.SERIF;
            } else if (o11 == 3) {
                typeface2 = Typeface.MONOSPACE;
            } else {
                return;
            }
            this.f1455l = typeface2;
        }
    }

    public final void a(Drawable drawable, u0 u0Var) {
        if (drawable != null && u0Var != null) {
            f.j(drawable, u0Var, this.f1444a.getDrawableState());
        }
    }

    public void b() {
        if (!(this.f1445b == null && this.f1446c == null && this.f1447d == null && this.f1448e == null)) {
            Drawable[] compoundDrawables = this.f1444a.getCompoundDrawables();
            a(compoundDrawables[0], this.f1445b);
            a(compoundDrawables[1], this.f1446c);
            a(compoundDrawables[2], this.f1447d);
            a(compoundDrawables[3], this.f1448e);
        }
        if (this.f1449f != null || this.f1450g != null) {
            Drawable[] compoundDrawablesRelative = this.f1444a.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f1449f);
            a(compoundDrawablesRelative[2], this.f1450g);
        }
    }

    @x0({x0.a.Q})
    public void c() {
        this.f1452i.b();
    }

    public int e() {
        return this.f1452i.j();
    }

    public int f() {
        return this.f1452i.k();
    }

    public int g() {
        return this.f1452i.l();
    }

    public int[] h() {
        return this.f1452i.m();
    }

    public int i() {
        return this.f1452i.n();
    }

    @o0
    public ColorStateList j() {
        u0 u0Var = this.f1451h;
        if (u0Var != null) {
            return u0Var.f1461a;
        }
        return null;
    }

    @o0
    public PorterDuff.Mode k() {
        u0 u0Var = this.f1451h;
        if (u0Var != null) {
            return u0Var.f1462b;
        }
        return null;
    }

    @x0({x0.a.Q})
    public boolean l() {
        return this.f1452i.s();
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0236  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x026c  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0273  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01f5  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x020a  */
    @android.annotation.SuppressLint({"NewApi"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m(@d.o0 android.util.AttributeSet r20, int r21) {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            r9 = r21
            android.widget.TextView r0 = r7.f1444a
            android.content.Context r10 = r0.getContext()
            androidx.appcompat.widget.f r11 = androidx.appcompat.widget.f.b()
            int[] r2 = f.a.n.AppCompatTextHelper
            r12 = 0
            androidx.appcompat.widget.w0 r13 = androidx.appcompat.widget.w0.G(r10, r8, r2, r9, r12)
            android.widget.TextView r0 = r7.f1444a
            android.content.Context r1 = r0.getContext()
            android.content.res.TypedArray r4 = r13.B()
            r6 = 0
            r3 = r20
            r5 = r21
            f1.w1.x1(r0, r1, r2, r3, r4, r5, r6)
            int r0 = f.a.n.AppCompatTextHelper_android_textAppearance
            r14 = -1
            int r0 = r13.u(r0, r14)
            int r1 = f.a.n.AppCompatTextHelper_android_drawableLeft
            boolean r2 = r13.C(r1)
            if (r2 == 0) goto L_0x0042
            int r1 = r13.u(r1, r12)
            androidx.appcompat.widget.u0 r1 = d(r10, r11, r1)
            r7.f1445b = r1
        L_0x0042:
            int r1 = f.a.n.AppCompatTextHelper_android_drawableTop
            boolean r2 = r13.C(r1)
            if (r2 == 0) goto L_0x0054
            int r1 = r13.u(r1, r12)
            androidx.appcompat.widget.u0 r1 = d(r10, r11, r1)
            r7.f1446c = r1
        L_0x0054:
            int r1 = f.a.n.AppCompatTextHelper_android_drawableRight
            boolean r2 = r13.C(r1)
            if (r2 == 0) goto L_0x0066
            int r1 = r13.u(r1, r12)
            androidx.appcompat.widget.u0 r1 = d(r10, r11, r1)
            r7.f1447d = r1
        L_0x0066:
            int r1 = f.a.n.AppCompatTextHelper_android_drawableBottom
            boolean r2 = r13.C(r1)
            if (r2 == 0) goto L_0x0078
            int r1 = r13.u(r1, r12)
            androidx.appcompat.widget.u0 r1 = d(r10, r11, r1)
            r7.f1448e = r1
        L_0x0078:
            int r1 = android.os.Build.VERSION.SDK_INT
            int r2 = f.a.n.AppCompatTextHelper_android_drawableStart
            boolean r3 = r13.C(r2)
            if (r3 == 0) goto L_0x008c
            int r2 = r13.u(r2, r12)
            androidx.appcompat.widget.u0 r2 = d(r10, r11, r2)
            r7.f1449f = r2
        L_0x008c:
            int r2 = f.a.n.AppCompatTextHelper_android_drawableEnd
            boolean r3 = r13.C(r2)
            if (r3 == 0) goto L_0x009e
            int r2 = r13.u(r2, r12)
            androidx.appcompat.widget.u0 r2 = d(r10, r11, r2)
            r7.f1450g = r2
        L_0x009e:
            r13.I()
            android.widget.TextView r2 = r7.f1444a
            android.text.method.TransformationMethod r2 = r2.getTransformationMethod()
            boolean r2 = r2 instanceof android.text.method.PasswordTransformationMethod
            r3 = 26
            if (r0 == r14) goto L_0x00ea
            int[] r5 = f.a.n.TextAppearance
            androidx.appcompat.widget.w0 r0 = androidx.appcompat.widget.w0.E(r10, r0, r5)
            if (r2 != 0) goto L_0x00c3
            int r5 = f.a.n.TextAppearance_textAllCaps
            boolean r6 = r0.C(r5)
            if (r6 == 0) goto L_0x00c3
            boolean r5 = r0.a(r5, r12)
            r6 = 1
            goto L_0x00c5
        L_0x00c3:
            r5 = r12
            r6 = r5
        L_0x00c5:
            r7.C(r10, r0)
            int r15 = f.a.n.TextAppearance_textLocale
            boolean r16 = r0.C(r15)
            if (r16 == 0) goto L_0x00d5
            java.lang.String r15 = r0.w(r15)
            goto L_0x00d6
        L_0x00d5:
            r15 = 0
        L_0x00d6:
            if (r1 < r3) goto L_0x00e5
            int r4 = f.a.n.TextAppearance_fontVariationSettings
            boolean r17 = r0.C(r4)
            if (r17 == 0) goto L_0x00e5
            java.lang.String r4 = r0.w(r4)
            goto L_0x00e6
        L_0x00e5:
            r4 = 0
        L_0x00e6:
            r0.I()
            goto L_0x00ee
        L_0x00ea:
            r5 = r12
            r6 = r5
            r4 = 0
            r15 = 0
        L_0x00ee:
            int[] r0 = f.a.n.TextAppearance
            androidx.appcompat.widget.w0 r0 = androidx.appcompat.widget.w0.G(r10, r8, r0, r9, r12)
            if (r2 != 0) goto L_0x0105
            int r13 = f.a.n.TextAppearance_textAllCaps
            boolean r18 = r0.C(r13)
            if (r18 == 0) goto L_0x0105
            boolean r5 = r0.a(r13, r12)
            r16 = 1
            goto L_0x0107
        L_0x0105:
            r16 = r6
        L_0x0107:
            int r6 = f.a.n.TextAppearance_textLocale
            boolean r13 = r0.C(r6)
            if (r13 == 0) goto L_0x0113
            java.lang.String r15 = r0.w(r6)
        L_0x0113:
            if (r1 < r3) goto L_0x0121
            int r3 = f.a.n.TextAppearance_fontVariationSettings
            boolean r6 = r0.C(r3)
            if (r6 == 0) goto L_0x0121
            java.lang.String r4 = r0.w(r3)
        L_0x0121:
            r3 = 28
            if (r1 < r3) goto L_0x0139
            int r3 = f.a.n.TextAppearance_android_textSize
            boolean r6 = r0.C(r3)
            if (r6 == 0) goto L_0x0139
            int r3 = r0.g(r3, r14)
            if (r3 != 0) goto L_0x0139
            android.widget.TextView r3 = r7.f1444a
            r6 = 0
            r3.setTextSize(r12, r6)
        L_0x0139:
            r7.C(r10, r0)
            r0.I()
            if (r2 != 0) goto L_0x0146
            if (r16 == 0) goto L_0x0146
            r7.s(r5)
        L_0x0146:
            android.graphics.Typeface r0 = r7.f1455l
            if (r0 == 0) goto L_0x015b
            int r2 = r7.f1454k
            if (r2 != r14) goto L_0x0156
            android.widget.TextView r2 = r7.f1444a
            int r3 = r7.f1453j
            r2.setTypeface(r0, r3)
            goto L_0x015b
        L_0x0156:
            android.widget.TextView r2 = r7.f1444a
            r2.setTypeface(r0)
        L_0x015b:
            if (r4 == 0) goto L_0x0162
            android.widget.TextView r0 = r7.f1444a
            boolean unused = r0.setFontVariationSettings(r4)
        L_0x0162:
            if (r15 == 0) goto L_0x0185
            r0 = 24
            if (r1 < r0) goto L_0x0172
            android.widget.TextView r0 = r7.f1444a
            android.os.LocaleList r1 = android.os.LocaleList.forLanguageTags(r15)
            r0.setTextLocales(r1)
            goto L_0x0185
        L_0x0172:
            r0 = 44
            int r0 = r15.indexOf(r0)
            java.lang.String r0 = r15.substring(r12, r0)
            android.widget.TextView r1 = r7.f1444a
            java.util.Locale r0 = java.util.Locale.forLanguageTag(r0)
            r1.setTextLocale(r0)
        L_0x0185:
            androidx.appcompat.widget.v r0 = r7.f1452i
            r0.t(r8, r9)
            boolean r0 = androidx.core.widget.b.f2286a
            if (r0 == 0) goto L_0x01c9
            androidx.appcompat.widget.v r0 = r7.f1452i
            int r0 = r0.n()
            if (r0 == 0) goto L_0x01c9
            androidx.appcompat.widget.v r0 = r7.f1452i
            int[] r0 = r0.m()
            int r1 = r0.length
            if (r1 <= 0) goto L_0x01c9
            android.widget.TextView r1 = r7.f1444a
            int r1 = r1.getAutoSizeStepGranularity()
            float r1 = (float) r1
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x01c4
            android.widget.TextView r0 = r7.f1444a
            androidx.appcompat.widget.v r1 = r7.f1452i
            int r1 = r1.k()
            androidx.appcompat.widget.v r2 = r7.f1452i
            int r2 = r2.j()
            androidx.appcompat.widget.v r3 = r7.f1452i
            int r3 = r3.l()
            r0.setAutoSizeTextTypeUniformWithConfiguration(r1, r2, r3, r12)
            goto L_0x01c9
        L_0x01c4:
            android.widget.TextView r1 = r7.f1444a
            r1.setAutoSizeTextTypeUniformWithPresetSizes(r0, r12)
        L_0x01c9:
            int[] r0 = f.a.n.AppCompatTextView
            androidx.appcompat.widget.w0 r8 = androidx.appcompat.widget.w0.F(r10, r8, r0)
            int r0 = f.a.n.AppCompatTextView_drawableLeftCompat
            int r0 = r8.u(r0, r14)
            if (r0 == r14) goto L_0x01dd
            android.graphics.drawable.Drawable r0 = r11.c(r10, r0)
            r1 = r0
            goto L_0x01de
        L_0x01dd:
            r1 = 0
        L_0x01de:
            int r0 = f.a.n.AppCompatTextView_drawableTopCompat
            int r0 = r8.u(r0, r14)
            if (r0 == r14) goto L_0x01ec
            android.graphics.drawable.Drawable r0 = r11.c(r10, r0)
            r2 = r0
            goto L_0x01ed
        L_0x01ec:
            r2 = 0
        L_0x01ed:
            int r0 = f.a.n.AppCompatTextView_drawableRightCompat
            int r0 = r8.u(r0, r14)
            if (r0 == r14) goto L_0x01fb
            android.graphics.drawable.Drawable r0 = r11.c(r10, r0)
            r3 = r0
            goto L_0x01fc
        L_0x01fb:
            r3 = 0
        L_0x01fc:
            int r0 = f.a.n.AppCompatTextView_drawableBottomCompat
            int r0 = r8.u(r0, r14)
            if (r0 == r14) goto L_0x020a
            android.graphics.drawable.Drawable r0 = r11.c(r10, r0)
            r4 = r0
            goto L_0x020b
        L_0x020a:
            r4 = 0
        L_0x020b:
            int r0 = f.a.n.AppCompatTextView_drawableStartCompat
            int r0 = r8.u(r0, r14)
            if (r0 == r14) goto L_0x0219
            android.graphics.drawable.Drawable r0 = r11.c(r10, r0)
            r5 = r0
            goto L_0x021a
        L_0x0219:
            r5 = 0
        L_0x021a:
            int r0 = f.a.n.AppCompatTextView_drawableEndCompat
            int r0 = r8.u(r0, r14)
            if (r0 == r14) goto L_0x0228
            android.graphics.drawable.Drawable r0 = r11.c(r10, r0)
            r6 = r0
            goto L_0x0229
        L_0x0228:
            r6 = 0
        L_0x0229:
            r0 = r19
            r0.y(r1, r2, r3, r4, r5, r6)
            int r0 = f.a.n.AppCompatTextView_drawableTint
            boolean r1 = r8.C(r0)
            if (r1 == 0) goto L_0x023f
            android.content.res.ColorStateList r0 = r8.d(r0)
            android.widget.TextView r1 = r7.f1444a
            androidx.core.widget.y.u(r1, r0)
        L_0x023f:
            int r0 = f.a.n.AppCompatTextView_drawableTintMode
            boolean r1 = r8.C(r0)
            if (r1 == 0) goto L_0x0255
            int r0 = r8.o(r0, r14)
            r1 = 0
            android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.b0.e(r0, r1)
            android.widget.TextView r1 = r7.f1444a
            androidx.core.widget.y.v(r1, r0)
        L_0x0255:
            int r0 = f.a.n.AppCompatTextView_firstBaselineToTopHeight
            int r0 = r8.g(r0, r14)
            int r1 = f.a.n.AppCompatTextView_lastBaselineToBottomHeight
            int r1 = r8.g(r1, r14)
            int r2 = f.a.n.AppCompatTextView_lineHeight
            int r2 = r8.g(r2, r14)
            r8.I()
            if (r0 == r14) goto L_0x0271
            android.widget.TextView r3 = r7.f1444a
            androidx.core.widget.y.A(r3, r0)
        L_0x0271:
            if (r1 == r14) goto L_0x0278
            android.widget.TextView r0 = r7.f1444a
            androidx.core.widget.y.B(r0, r1)
        L_0x0278:
            if (r2 == r14) goto L_0x027f
            android.widget.TextView r0 = r7.f1444a
            androidx.core.widget.y.C(r0, r2)
        L_0x027f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.u.m(android.util.AttributeSet, int):void");
    }

    public void n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f1456m) {
            this.f1455l = typeface;
            TextView textView = weakReference.get();
            if (textView == null) {
                return;
            }
            if (w1.N0(textView)) {
                textView.post(new b(textView, typeface, this.f1453j));
            } else {
                textView.setTypeface(typeface, this.f1453j);
            }
        }
    }

    @x0({x0.a.Q})
    public void o(boolean z10, int i10, int i11, int i12, int i13) {
        if (!androidx.core.widget.b.f2286a) {
            c();
        }
    }

    public void p() {
        b();
    }

    public void q(Context context, int i10) {
        String w10;
        w0 E = w0.E(context, i10, a.n.TextAppearance);
        int i11 = a.n.TextAppearance_textAllCaps;
        if (E.C(i11)) {
            s(E.a(i11, false));
        }
        int i12 = Build.VERSION.SDK_INT;
        int i13 = a.n.TextAppearance_android_textSize;
        if (E.C(i13) && E.g(i13, -1) == 0) {
            this.f1444a.setTextSize(0, 0.0f);
        }
        C(context, E);
        if (i12 >= 26) {
            int i14 = a.n.TextAppearance_fontVariationSettings;
            if (E.C(i14) && (w10 = E.w(i14)) != null) {
                boolean unused = this.f1444a.setFontVariationSettings(w10);
            }
        }
        E.I();
        Typeface typeface = this.f1455l;
        if (typeface != null) {
            this.f1444a.setTypeface(typeface, this.f1453j);
        }
    }

    public void r(@m0 TextView textView, @o0 InputConnection inputConnection, @m0 EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT < 30 && inputConnection != null) {
            e.j(editorInfo, textView.getText());
        }
    }

    public void s(boolean z10) {
        this.f1444a.setAllCaps(z10);
    }

    public void t(int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        this.f1452i.u(i10, i11, i12, i13);
    }

    public void u(@m0 int[] iArr, int i10) throws IllegalArgumentException {
        this.f1452i.v(iArr, i10);
    }

    public void v(int i10) {
        this.f1452i.w(i10);
    }

    public void w(@o0 ColorStateList colorStateList) {
        if (this.f1451h == null) {
            this.f1451h = new u0();
        }
        u0 u0Var = this.f1451h;
        u0Var.f1461a = colorStateList;
        u0Var.f1464d = colorStateList != null;
        z();
    }

    public void x(@o0 PorterDuff.Mode mode) {
        if (this.f1451h == null) {
            this.f1451h = new u0();
        }
        u0 u0Var = this.f1451h;
        u0Var.f1462b = mode;
        u0Var.f1463c = mode != null;
        z();
    }

    public final void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.f1444a.getCompoundDrawablesRelative();
            TextView textView = this.f1444a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
        } else if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
            Drawable[] compoundDrawablesRelative2 = this.f1444a.getCompoundDrawablesRelative();
            Drawable drawable7 = compoundDrawablesRelative2[0];
            if (drawable7 == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = this.f1444a.getCompoundDrawables();
                TextView textView2 = this.f1444a;
                if (drawable == null) {
                    drawable = compoundDrawables[0];
                }
                if (drawable2 == null) {
                    drawable2 = compoundDrawables[1];
                }
                if (drawable3 == null) {
                    drawable3 = compoundDrawables[2];
                }
                if (drawable4 == null) {
                    drawable4 = compoundDrawables[3];
                }
                textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                return;
            }
            TextView textView3 = this.f1444a;
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            Drawable drawable8 = compoundDrawablesRelative2[2];
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            textView3.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
        }
    }

    public final void z() {
        u0 u0Var = this.f1451h;
        this.f1445b = u0Var;
        this.f1446c = u0Var;
        this.f1447d = u0Var;
        this.f1448e = u0Var;
        this.f1449f = u0Var;
        this.f1450g = u0Var;
    }
}
