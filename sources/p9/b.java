package p9;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertDialog;
import d.a1;
import d.b1;
import d.e;
import d.f;
import d.m0;
import d.o0;
import d.q;
import d.r0;
import d.u;
import f1.w1;
import i9.a;
import k.d;
import z9.j;

public class b extends AlertDialog.a {
    @f

    /* renamed from: e  reason: collision with root package name */
    public static final int f21914e = a.c.alertDialogStyle;
    @b1

    /* renamed from: f  reason: collision with root package name */
    public static final int f21915f = a.n.MaterialAlertDialog_MaterialComponents;
    @f

    /* renamed from: g  reason: collision with root package name */
    public static final int f21916g = a.c.materialAlertDialogTheme;
    @o0

    /* renamed from: c  reason: collision with root package name */
    public Drawable f21917c;
    @q
    @m0

    /* renamed from: d  reason: collision with root package name */
    public final Rect f21918d;

    public b(@m0 Context context) {
        this(context, 0);
    }

    public b(@m0 Context context, int i10) {
        super(P(context), S(context, i10));
        Context b10 = b();
        Resources.Theme theme = b10.getTheme();
        int i11 = f21914e;
        int i12 = f21915f;
        this.f21918d = c.a(b10, i11, i12);
        int c10 = o9.a.c(b10, a.c.colorSurface, getClass().getCanonicalName());
        j jVar = new j(b10, (AttributeSet) null, i11, i12);
        jVar.Y(b10);
        jVar.n0(ColorStateList.valueOf(c10));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(16844145, typedValue, true);
            float dimension = typedValue.getDimension(b().getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                jVar.j0(dimension);
            }
        }
        this.f21917c = jVar;
    }

    public static Context P(@m0 Context context) {
        int R = R(context);
        Context c10 = ca.a.c(context, (AttributeSet) null, f21914e, f21915f);
        return R == 0 ? c10 : new d(c10, R);
    }

    public static int R(@m0 Context context) {
        TypedValue a10 = w9.b.a(context, f21916g);
        if (a10 == null) {
            return 0;
        }
        return a10.data;
    }

    public static int S(@m0 Context context, int i10) {
        return i10 == 0 ? R(context) : i10;
    }

    @m0
    /* renamed from: A0 */
    public b G(@o0 Cursor cursor, int i10, @m0 String str, @o0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.G(cursor, i10, str, onClickListener);
    }

    @m0
    /* renamed from: B0 */
    public b H(@o0 ListAdapter listAdapter, int i10, @o0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.H(listAdapter, i10, onClickListener);
    }

    @m0
    /* renamed from: C0 */
    public b I(@o0 CharSequence[] charSequenceArr, int i10, @o0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.I(charSequenceArr, i10, onClickListener);
    }

    @m0
    /* renamed from: D0 */
    public b J(@a1 int i10) {
        return (b) super.J(i10);
    }

    @m0
    /* renamed from: E0 */
    public b K(@o0 CharSequence charSequence) {
        return (b) super.K(charSequence);
    }

    @m0
    /* renamed from: F0 */
    public b L(int i10) {
        return (b) super.L(i10);
    }

    @m0
    /* renamed from: G0 */
    public b M(@o0 View view) {
        return (b) super.M(view);
    }

    @o0
    public Drawable Q() {
        return this.f21917c;
    }

    @m0
    /* renamed from: T */
    public b c(@o0 ListAdapter listAdapter, @o0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.c(listAdapter, onClickListener);
    }

    @m0
    public b U(@o0 Drawable drawable) {
        this.f21917c = drawable;
        return this;
    }

    @m0
    public b V(@r0 int i10) {
        this.f21918d.bottom = i10;
        return this;
    }

    @m0
    public b W(@r0 int i10) {
        if (b().getResources().getConfiguration().getLayoutDirection() == 1) {
            this.f21918d.left = i10;
        } else {
            this.f21918d.right = i10;
        }
        return this;
    }

    @m0
    public b X(@r0 int i10) {
        if (b().getResources().getConfiguration().getLayoutDirection() == 1) {
            this.f21918d.right = i10;
        } else {
            this.f21918d.left = i10;
        }
        return this;
    }

    @m0
    public b Y(@r0 int i10) {
        this.f21918d.top = i10;
        return this;
    }

    @m0
    /* renamed from: Z */
    public b d(boolean z10) {
        return (b) super.d(z10);
    }

    @m0
    public AlertDialog a() {
        AlertDialog a10 = super.a();
        Window window = a10.getWindow();
        View decorView = window.getDecorView();
        Drawable drawable = this.f21917c;
        if (drawable instanceof j) {
            ((j) drawable).m0(w1.P(decorView));
        }
        window.setBackgroundDrawable(c.b(this.f21917c, this.f21918d));
        decorView.setOnTouchListener(new a(a10, this.f21918d));
        return a10;
    }

    @m0
    /* renamed from: a0 */
    public b e(@o0 Cursor cursor, @o0 DialogInterface.OnClickListener onClickListener, @m0 String str) {
        return (b) super.e(cursor, onClickListener, str);
    }

    @m0
    /* renamed from: b0 */
    public b f(@o0 View view) {
        return (b) super.f(view);
    }

    @m0
    /* renamed from: c0 */
    public b g(@u int i10) {
        return (b) super.g(i10);
    }

    @m0
    /* renamed from: d0 */
    public b h(@o0 Drawable drawable) {
        return (b) super.h(drawable);
    }

    @m0
    /* renamed from: e0 */
    public b i(@f int i10) {
        return (b) super.i(i10);
    }

    @m0
    /* renamed from: f0 */
    public b k(@e int i10, @o0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.k(i10, onClickListener);
    }

    @m0
    /* renamed from: g0 */
    public b l(@o0 CharSequence[] charSequenceArr, @o0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.l(charSequenceArr, onClickListener);
    }

    @m0
    /* renamed from: h0 */
    public b m(@a1 int i10) {
        return (b) super.m(i10);
    }

    @m0
    /* renamed from: i0 */
    public b n(@o0 CharSequence charSequence) {
        return (b) super.n(charSequence);
    }

    @m0
    /* renamed from: j0 */
    public b o(@e int i10, @o0 boolean[] zArr, @o0 DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (b) super.o(i10, zArr, onMultiChoiceClickListener);
    }

    @m0
    /* renamed from: k0 */
    public b p(@o0 Cursor cursor, @m0 String str, @m0 String str2, @o0 DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (b) super.p(cursor, str, str2, onMultiChoiceClickListener);
    }

    @m0
    /* renamed from: l0 */
    public b q(@o0 CharSequence[] charSequenceArr, @o0 boolean[] zArr, @o0 DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        return (b) super.q(charSequenceArr, zArr, onMultiChoiceClickListener);
    }

    @m0
    /* renamed from: m0 */
    public b r(@a1 int i10, @o0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.r(i10, onClickListener);
    }

    @m0
    /* renamed from: n0 */
    public b s(@o0 CharSequence charSequence, @o0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.s(charSequence, onClickListener);
    }

    @m0
    /* renamed from: o0 */
    public b t(@o0 Drawable drawable) {
        return (b) super.t(drawable);
    }

    @m0
    /* renamed from: p0 */
    public b u(@a1 int i10, @o0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.u(i10, onClickListener);
    }

    @m0
    /* renamed from: q0 */
    public b v(@o0 CharSequence charSequence, @o0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.v(charSequence, onClickListener);
    }

    @m0
    /* renamed from: r0 */
    public b w(@o0 Drawable drawable) {
        return (b) super.w(drawable);
    }

    @m0
    /* renamed from: s0 */
    public b x(@o0 DialogInterface.OnCancelListener onCancelListener) {
        return (b) super.x(onCancelListener);
    }

    @m0
    /* renamed from: t0 */
    public b y(@o0 DialogInterface.OnDismissListener onDismissListener) {
        return (b) super.y(onDismissListener);
    }

    @m0
    /* renamed from: u0 */
    public b z(@o0 AdapterView.OnItemSelectedListener onItemSelectedListener) {
        return (b) super.z(onItemSelectedListener);
    }

    @m0
    /* renamed from: v0 */
    public b A(@o0 DialogInterface.OnKeyListener onKeyListener) {
        return (b) super.A(onKeyListener);
    }

    @m0
    /* renamed from: w0 */
    public b B(@a1 int i10, @o0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.B(i10, onClickListener);
    }

    @m0
    /* renamed from: x0 */
    public b C(@o0 CharSequence charSequence, @o0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.C(charSequence, onClickListener);
    }

    @m0
    /* renamed from: y0 */
    public b D(@o0 Drawable drawable) {
        return (b) super.D(drawable);
    }

    @m0
    /* renamed from: z0 */
    public b F(@e int i10, int i11, @o0 DialogInterface.OnClickListener onClickListener) {
        return (b) super.F(i10, i11, onClickListener);
    }
}
