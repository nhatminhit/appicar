package androidx.appcompat.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.c;
import d.m0;
import d.o0;
import d.x0;
import f.a;
import f1.w1;
import g1.z;

@x0({x0.a.Q})
public class ActivityChooserView extends ViewGroup implements c.a {
    public final f O;
    public final g P;
    public final View Q;
    public final Drawable R;
    public final FrameLayout S;
    public final ImageView T;
    public final FrameLayout U;
    public final ImageView V;
    public final int W;

    /* renamed from: a0  reason: collision with root package name */
    public f1.b f1078a0;

    /* renamed from: b0  reason: collision with root package name */
    public final DataSetObserver f1079b0;

    /* renamed from: c0  reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f1080c0;

    /* renamed from: d0  reason: collision with root package name */
    public i0 f1081d0;

    /* renamed from: e0  reason: collision with root package name */
    public PopupWindow.OnDismissListener f1082e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f1083f0;

    /* renamed from: g0  reason: collision with root package name */
    public int f1084g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f1085h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f1086i0;

    @x0({x0.a.Q})
    public static class InnerLayout extends LinearLayout {
        public static final int[] O = {16842964};

        public InnerLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            w0 F = w0.F(context, attributeSet, O);
            setBackgroundDrawable(F.h(0));
            F.I();
        }
    }

    public class a extends DataSetObserver {
        public a() {
        }

        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.O.notifyDataSetChanged();
        }

        public void onInvalidated() {
            super.onInvalidated();
            ActivityChooserView.this.O.notifyDataSetInvalidated();
        }
    }

    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        public void onGlobalLayout() {
            if (!ActivityChooserView.this.b()) {
                return;
            }
            if (!ActivityChooserView.this.isShown()) {
                ActivityChooserView.this.getListPopupWindow().dismiss();
                return;
            }
            ActivityChooserView.this.getListPopupWindow().a();
            f1.b bVar = ActivityChooserView.this.f1078a0;
            if (bVar != null) {
                bVar.m(true);
            }
        }
    }

    public class c extends View.AccessibilityDelegate {
        public c() {
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            z.V1(accessibilityNodeInfo).R0(true);
        }
    }

    public class d extends e0 {
        public d(View view) {
            super(view);
        }

        public l.f b() {
            return ActivityChooserView.this.getListPopupWindow();
        }

        public boolean c() {
            ActivityChooserView.this.c();
            return true;
        }

        public boolean d() {
            ActivityChooserView.this.a();
            return true;
        }
    }

    public class e extends DataSetObserver {
        public e() {
        }

        public void onChanged() {
            super.onChanged();
            ActivityChooserView.this.e();
        }
    }

    public class f extends BaseAdapter {
        public static final int U = Integer.MAX_VALUE;
        public static final int V = 4;
        public static final int W = 0;
        public static final int X = 1;
        public static final int Y = 3;
        public c O;
        public int P = 4;
        public boolean Q;
        public boolean R;
        public boolean S;

        public f() {
        }

        public int a() {
            return this.O.f();
        }

        public c b() {
            return this.O;
        }

        public ResolveInfo c() {
            return this.O.h();
        }

        public int d() {
            return this.O.j();
        }

        public boolean e() {
            return this.Q;
        }

        public int f() {
            int i10 = this.P;
            this.P = Integer.MAX_VALUE;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
            int count = getCount();
            int i11 = 0;
            View view = null;
            for (int i12 = 0; i12 < count; i12++) {
                view = getView(i12, view, (ViewGroup) null);
                view.measure(makeMeasureSpec, makeMeasureSpec2);
                i11 = Math.max(i11, view.getMeasuredWidth());
            }
            this.P = i10;
            return i11;
        }

        public void g(c cVar) {
            c b10 = ActivityChooserView.this.O.b();
            if (b10 != null && ActivityChooserView.this.isShown()) {
                b10.unregisterObserver(ActivityChooserView.this.f1079b0);
            }
            this.O = cVar;
            if (cVar != null && ActivityChooserView.this.isShown()) {
                cVar.registerObserver(ActivityChooserView.this.f1079b0);
            }
            notifyDataSetChanged();
        }

        public int getCount() {
            int f10 = this.O.f();
            if (!this.Q && this.O.h() != null) {
                f10--;
            }
            int min = Math.min(f10, this.P);
            return this.S ? min + 1 : min;
        }

        public Object getItem(int i10) {
            int itemViewType = getItemViewType(i10);
            if (itemViewType == 0) {
                if (!this.Q && this.O.h() != null) {
                    i10++;
                }
                return this.O.e(i10);
            } else if (itemViewType == 1) {
                return null;
            } else {
                throw new IllegalArgumentException();
            }
        }

        public long getItemId(int i10) {
            return (long) i10;
        }

        public int getItemViewType(int i10) {
            return (!this.S || i10 != getCount() - 1) ? 0 : 1;
        }

        public View getView(int i10, View view, ViewGroup viewGroup) {
            int itemViewType = getItemViewType(i10);
            if (itemViewType == 0) {
                if (view == null || view.getId() != a.h.list_item) {
                    view = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(a.k.abc_activity_chooser_view_list_item, viewGroup, false);
                }
                PackageManager packageManager = ActivityChooserView.this.getContext().getPackageManager();
                ResolveInfo resolveInfo = (ResolveInfo) getItem(i10);
                ((ImageView) view.findViewById(a.h.icon)).setImageDrawable(resolveInfo.loadIcon(packageManager));
                ((TextView) view.findViewById(a.h.title)).setText(resolveInfo.loadLabel(packageManager));
                if (!this.Q || i10 != 0 || !this.R) {
                    view.setActivated(false);
                } else {
                    view.setActivated(true);
                }
                return view;
            } else if (itemViewType != 1) {
                throw new IllegalArgumentException();
            } else if (view != null && view.getId() == 1) {
                return view;
            } else {
                View inflate = LayoutInflater.from(ActivityChooserView.this.getContext()).inflate(a.k.abc_activity_chooser_view_list_item, viewGroup, false);
                inflate.setId(1);
                ((TextView) inflate.findViewById(a.h.title)).setText(ActivityChooserView.this.getContext().getString(a.l.abc_activity_chooser_view_see_all));
                return inflate;
            }
        }

        public int getViewTypeCount() {
            return 3;
        }

        public void h(int i10) {
            if (this.P != i10) {
                this.P = i10;
                notifyDataSetChanged();
            }
        }

        public void i(boolean z10, boolean z11) {
            if (this.Q != z10 || this.R != z11) {
                this.Q = z10;
                this.R = z11;
                notifyDataSetChanged();
            }
        }

        public void j(boolean z10) {
            if (this.S != z10) {
                this.S = z10;
                notifyDataSetChanged();
            }
        }
    }

    public class g implements AdapterView.OnItemClickListener, View.OnClickListener, View.OnLongClickListener, PopupWindow.OnDismissListener {
        public g() {
        }

        public final void a() {
            PopupWindow.OnDismissListener onDismissListener = ActivityChooserView.this.f1082e0;
            if (onDismissListener != null) {
                onDismissListener.onDismiss();
            }
        }

        public void onClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.U) {
                activityChooserView.a();
                Intent b10 = ActivityChooserView.this.O.b().b(ActivityChooserView.this.O.b().g(ActivityChooserView.this.O.c()));
                if (b10 != null) {
                    b10.addFlags(524288);
                    ActivityChooserView.this.getContext().startActivity(b10);
                }
            } else if (view == activityChooserView.S) {
                activityChooserView.f1083f0 = false;
                activityChooserView.d(activityChooserView.f1084g0);
            } else {
                throw new IllegalArgumentException();
            }
        }

        public void onDismiss() {
            a();
            f1.b bVar = ActivityChooserView.this.f1078a0;
            if (bVar != null) {
                bVar.m(false);
            }
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            int itemViewType = ((f) adapterView.getAdapter()).getItemViewType(i10);
            if (itemViewType == 0) {
                ActivityChooserView.this.a();
                ActivityChooserView activityChooserView = ActivityChooserView.this;
                if (!activityChooserView.f1083f0) {
                    if (!activityChooserView.O.e()) {
                        i10++;
                    }
                    Intent b10 = ActivityChooserView.this.O.b().b(i10);
                    if (b10 != null) {
                        b10.addFlags(524288);
                        ActivityChooserView.this.getContext().startActivity(b10);
                    }
                } else if (i10 > 0) {
                    activityChooserView.O.b().r(i10);
                }
            } else if (itemViewType == 1) {
                ActivityChooserView.this.d(Integer.MAX_VALUE);
            } else {
                throw new IllegalArgumentException();
            }
        }

        public boolean onLongClick(View view) {
            ActivityChooserView activityChooserView = ActivityChooserView.this;
            if (view == activityChooserView.U) {
                if (activityChooserView.O.getCount() > 0) {
                    ActivityChooserView activityChooserView2 = ActivityChooserView.this;
                    activityChooserView2.f1083f0 = true;
                    activityChooserView2.d(activityChooserView2.f1084g0);
                }
                return true;
            }
            throw new IllegalArgumentException();
        }
    }

    public ActivityChooserView(@m0 Context context) {
        this(context, (AttributeSet) null);
    }

    public ActivityChooserView(@m0 Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActivityChooserView(@m0 Context context, @o0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1079b0 = new a();
        this.f1080c0 = new b();
        this.f1084g0 = 4;
        int[] iArr = a.n.ActivityChooserView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        w1.x1(this, context, iArr, attributeSet, obtainStyledAttributes, i10, 0);
        this.f1084g0 = obtainStyledAttributes.getInt(a.n.ActivityChooserView_initialActivityCount, 4);
        Drawable drawable = obtainStyledAttributes.getDrawable(a.n.ActivityChooserView_expandActivityOverflowButtonDrawable);
        obtainStyledAttributes.recycle();
        LayoutInflater.from(getContext()).inflate(a.k.abc_activity_chooser_view, this, true);
        g gVar = new g();
        this.P = gVar;
        View findViewById = findViewById(a.h.activity_chooser_view_content);
        this.Q = findViewById;
        this.R = findViewById.getBackground();
        FrameLayout frameLayout = (FrameLayout) findViewById(a.h.default_activity_button);
        this.U = frameLayout;
        frameLayout.setOnClickListener(gVar);
        frameLayout.setOnLongClickListener(gVar);
        int i11 = a.h.image;
        this.V = (ImageView) frameLayout.findViewById(i11);
        FrameLayout frameLayout2 = (FrameLayout) findViewById(a.h.expand_activities_button);
        frameLayout2.setOnClickListener(gVar);
        frameLayout2.setAccessibilityDelegate(new c());
        frameLayout2.setOnTouchListener(new d(frameLayout2));
        this.S = frameLayout2;
        ImageView imageView = (ImageView) frameLayout2.findViewById(i11);
        this.T = imageView;
        imageView.setImageDrawable(drawable);
        f fVar = new f();
        this.O = fVar;
        fVar.registerDataSetObserver(new e());
        Resources resources = context.getResources();
        this.W = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(a.f.abc_config_prefDialogWidth));
    }

    public boolean a() {
        if (!b()) {
            return true;
        }
        getListPopupWindow().dismiss();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        viewTreeObserver.removeGlobalOnLayoutListener(this.f1080c0);
        return true;
    }

    public boolean b() {
        return getListPopupWindow().c();
    }

    public boolean c() {
        if (b() || !this.f1085h0) {
            return false;
        }
        this.f1083f0 = false;
        d(this.f1084g0);
        return true;
    }

    public void d(int i10) {
        f fVar;
        if (this.O.b() != null) {
            getViewTreeObserver().addOnGlobalLayoutListener(this.f1080c0);
            boolean z10 = this.U.getVisibility() == 0;
            int a10 = this.O.a();
            if (i10 == Integer.MAX_VALUE || a10 <= i10 + (z10 ? 1 : 0)) {
                this.O.j(false);
                fVar = this.O;
            } else {
                this.O.j(true);
                fVar = this.O;
                i10--;
            }
            fVar.h(i10);
            i0 listPopupWindow = getListPopupWindow();
            if (!listPopupWindow.c()) {
                if (this.f1083f0 || !z10) {
                    this.O.i(true, z10);
                } else {
                    this.O.i(false, false);
                }
                listPopupWindow.U(Math.min(this.O.f(), this.W));
                listPopupWindow.a();
                f1.b bVar = this.f1078a0;
                if (bVar != null) {
                    bVar.m(true);
                }
                listPopupWindow.k().setContentDescription(getContext().getString(a.l.abc_activitychooserview_choose_application));
                listPopupWindow.k().setSelector(new ColorDrawable(0));
                return;
            }
            return;
        }
        throw new IllegalStateException("No data model. Did you call #setDataModel?");
    }

    public void e() {
        Drawable drawable;
        View view;
        if (this.O.getCount() > 0) {
            this.S.setEnabled(true);
        } else {
            this.S.setEnabled(false);
        }
        int a10 = this.O.a();
        int d10 = this.O.d();
        if (a10 == 1 || (a10 > 1 && d10 > 0)) {
            this.U.setVisibility(0);
            ResolveInfo c10 = this.O.c();
            PackageManager packageManager = getContext().getPackageManager();
            this.V.setImageDrawable(c10.loadIcon(packageManager));
            if (this.f1086i0 != 0) {
                CharSequence loadLabel = c10.loadLabel(packageManager);
                this.U.setContentDescription(getContext().getString(this.f1086i0, new Object[]{loadLabel}));
            }
        } else {
            this.U.setVisibility(8);
        }
        if (this.U.getVisibility() == 0) {
            view = this.Q;
            drawable = this.R;
        } else {
            view = this.Q;
            drawable = null;
        }
        view.setBackgroundDrawable(drawable);
    }

    @x0({x0.a.O})
    public c getDataModel() {
        return this.O.b();
    }

    public i0 getListPopupWindow() {
        if (this.f1081d0 == null) {
            i0 i0Var = new i0(getContext());
            this.f1081d0 = i0Var;
            i0Var.q(this.O);
            this.f1081d0.S(this);
            this.f1081d0.d0(true);
            this.f1081d0.f0(this.P);
            this.f1081d0.e0(this.P);
        }
        return this.f1081d0;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        c b10 = this.O.b();
        if (b10 != null) {
            b10.registerObserver(this.f1079b0);
        }
        this.f1085h0 = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c b10 = this.O.b();
        if (b10 != null) {
            b10.unregisterObserver(this.f1079b0);
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f1080c0);
        }
        if (b()) {
            a();
        }
        this.f1085h0 = false;
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.Q.layout(0, 0, i12 - i10, i13 - i11);
        if (!b()) {
            a();
        }
    }

    public void onMeasure(int i10, int i11) {
        View view = this.Q;
        if (this.U.getVisibility() != 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824);
        }
        measureChild(view, i10, i11);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @x0({x0.a.O})
    public void setActivityChooserModel(c cVar) {
        this.O.g(cVar);
        if (b()) {
            a();
            c();
        }
    }

    public void setDefaultActionButtonContentDescription(int i10) {
        this.f1086i0 = i10;
    }

    public void setExpandActivityOverflowButtonContentDescription(int i10) {
        this.T.setContentDescription(getContext().getString(i10));
    }

    public void setExpandActivityOverflowButtonDrawable(Drawable drawable) {
        this.T.setImageDrawable(drawable);
    }

    public void setInitialActivityCount(int i10) {
        this.f1084g0 = i10;
    }

    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f1082e0 = onDismissListener;
    }

    @x0({x0.a.Q})
    public void setProvider(f1.b bVar) {
        this.f1078a0 = bVar;
    }
}
