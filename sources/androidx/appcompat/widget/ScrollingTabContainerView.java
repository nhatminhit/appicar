package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.LinearLayoutCompat;
import d.m0;
import d.x0;
import f.a;

@x0({x0.a.Q})
public class ScrollingTabContainerView extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: c0  reason: collision with root package name */
    public static final String f1117c0 = "ScrollingTabContainerView";

    /* renamed from: d0  reason: collision with root package name */
    public static final Interpolator f1118d0 = new DecelerateInterpolator();

    /* renamed from: e0  reason: collision with root package name */
    public static final int f1119e0 = 200;
    public Runnable O;
    public c P;
    public LinearLayoutCompat Q;
    public Spinner R;
    public boolean S;
    public int T;
    public int U;
    public int V;
    public int W;

    /* renamed from: a0  reason: collision with root package name */
    public ViewPropertyAnimator f1120a0;

    /* renamed from: b0  reason: collision with root package name */
    public final e f1121b0 = new e();

    public class a implements Runnable {
        public final /* synthetic */ View O;

        public a(View view) {
            this.O = view;
        }

        public void run() {
            ScrollingTabContainerView.this.smoothScrollTo(this.O.getLeft() - ((ScrollingTabContainerView.this.getWidth() - this.O.getWidth()) / 2), 0);
            ScrollingTabContainerView.this.O = null;
        }
    }

    public class b extends BaseAdapter {
        public b() {
        }

        public int getCount() {
            return ScrollingTabContainerView.this.Q.getChildCount();
        }

        public Object getItem(int i10) {
            return ((d) ScrollingTabContainerView.this.Q.getChildAt(i10)).b();
        }

        public long getItemId(int i10) {
            return (long) i10;
        }

        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                return ScrollingTabContainerView.this.g((a.f) getItem(i10), true);
            }
            ((d) view).a((a.f) getItem(i10));
            return view;
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        public void onClick(View view) {
            ((d) view).b().g();
            int childCount = ScrollingTabContainerView.this.Q.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = ScrollingTabContainerView.this.Q.getChildAt(i10);
                childAt.setSelected(childAt == view);
            }
        }
    }

    public class d extends LinearLayout {
        public static final String U = "androidx.appcompat.app.ActionBar$Tab";
        public final int[] O;
        public a.f P;
        public TextView Q;
        public ImageView R;
        public View S;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public d(android.content.Context r6, androidx.appcompat.app.a.f r7, boolean r8) {
            /*
                r4 = this;
                androidx.appcompat.widget.ScrollingTabContainerView.this = r5
                int r5 = f.a.c.actionBarTabStyle
                r0 = 0
                r4.<init>(r6, r0, r5)
                r1 = 1
                int[] r1 = new int[r1]
                r2 = 16842964(0x10100d4, float:2.3694152E-38)
                r3 = 0
                r1[r3] = r2
                r4.O = r1
                r4.P = r7
                androidx.appcompat.widget.w0 r5 = androidx.appcompat.widget.w0.G(r6, r0, r1, r5, r3)
                boolean r6 = r5.C(r3)
                if (r6 == 0) goto L_0x0026
                android.graphics.drawable.Drawable r6 = r5.h(r3)
                r4.setBackgroundDrawable(r6)
            L_0x0026:
                r5.I()
                if (r8 == 0) goto L_0x0031
                r5 = 8388627(0x800013, float:1.175497E-38)
                r4.setGravity(r5)
            L_0x0031:
                r4.c()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ScrollingTabContainerView.d.<init>(androidx.appcompat.widget.ScrollingTabContainerView, android.content.Context, androidx.appcompat.app.a$f, boolean):void");
        }

        public void a(a.f fVar) {
            this.P = fVar;
            c();
        }

        public a.f b() {
            return this.P;
        }

        public void c() {
            a.f fVar = this.P;
            View b10 = fVar.b();
            CharSequence charSequence = null;
            if (b10 != null) {
                ViewParent parent = b10.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b10);
                    }
                    addView(b10);
                }
                this.S = b10;
                TextView textView = this.Q;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.R;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.R.setImageDrawable((Drawable) null);
                    return;
                }
                return;
            }
            View view = this.S;
            if (view != null) {
                removeView(view);
                this.S = null;
            }
            Drawable c10 = fVar.c();
            CharSequence f10 = fVar.f();
            if (c10 != null) {
                if (this.R == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.R = appCompatImageView;
                }
                this.R.setImageDrawable(c10);
                this.R.setVisibility(0);
            } else {
                ImageView imageView2 = this.R;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.R.setImageDrawable((Drawable) null);
                }
            }
            boolean z10 = !TextUtils.isEmpty(f10);
            if (z10) {
                if (this.Q == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), (AttributeSet) null, a.c.actionBarTabTextStyle);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.Q = appCompatTextView;
                }
                this.Q.setText(f10);
                this.Q.setVisibility(0);
            } else {
                TextView textView2 = this.Q;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.Q.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.R;
            if (imageView3 != null) {
                imageView3.setContentDescription(fVar.a());
            }
            if (!z10) {
                charSequence = fVar.a();
            }
            z0.a(this, charSequence);
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(U);
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(U);
        }

        public void onMeasure(int i10, int i11) {
            int i12;
            super.onMeasure(i10, i11);
            if (ScrollingTabContainerView.this.T > 0 && getMeasuredWidth() > (i12 = ScrollingTabContainerView.this.T)) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
            }
        }

        public void setSelected(boolean z10) {
            boolean z11 = isSelected() != z10;
            super.setSelected(z10);
            if (z11 && z10) {
                sendAccessibilityEvent(4);
            }
        }
    }

    public class e extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public boolean f1122a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f1123b;

        public e() {
        }

        public e a(ViewPropertyAnimator viewPropertyAnimator, int i10) {
            this.f1123b = i10;
            ScrollingTabContainerView.this.f1120a0 = viewPropertyAnimator;
            return this;
        }

        public void onAnimationCancel(Animator animator) {
            this.f1122a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f1122a) {
                ScrollingTabContainerView scrollingTabContainerView = ScrollingTabContainerView.this;
                scrollingTabContainerView.f1120a0 = null;
                scrollingTabContainerView.setVisibility(this.f1123b);
            }
        }

        public void onAnimationStart(Animator animator) {
            ScrollingTabContainerView.this.setVisibility(0);
            this.f1122a = false;
        }
    }

    public ScrollingTabContainerView(@m0 Context context) {
        super(context);
        setHorizontalScrollBarEnabled(false);
        k.a b10 = k.a.b(context);
        setContentHeight(b10.f());
        this.U = b10.e();
        LinearLayoutCompat f10 = f();
        this.Q = f10;
        addView(f10, new ViewGroup.LayoutParams(-2, -1));
    }

    public void a(a.f fVar, int i10, boolean z10) {
        d g10 = g(fVar, false);
        this.Q.addView(g10, i10, new LinearLayoutCompat.b(0, -1, 1.0f));
        Spinner spinner = this.R;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z10) {
            g10.setSelected(true);
        }
        if (this.S) {
            requestLayout();
        }
    }

    public void b(a.f fVar, boolean z10) {
        d g10 = g(fVar, false);
        this.Q.addView(g10, new LinearLayoutCompat.b(0, -1, 1.0f));
        Spinner spinner = this.R;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (z10) {
            g10.setSelected(true);
        }
        if (this.S) {
            requestLayout();
        }
    }

    public void c(int i10) {
        View childAt = this.Q.getChildAt(i10);
        Runnable runnable = this.O;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.O = aVar;
        post(aVar);
    }

    public void d(int i10) {
        ViewPropertyAnimator viewPropertyAnimator;
        ViewPropertyAnimator viewPropertyAnimator2 = this.f1120a0;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
        }
        if (i10 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            viewPropertyAnimator = animate().alpha(1.0f);
        } else {
            viewPropertyAnimator = animate().alpha(0.0f);
        }
        viewPropertyAnimator.setDuration(200);
        viewPropertyAnimator.setInterpolator(f1118d0);
        viewPropertyAnimator.setListener(this.f1121b0.a(viewPropertyAnimator, i10));
        viewPropertyAnimator.start();
    }

    public final Spinner e() {
        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), (AttributeSet) null, a.c.actionDropDownStyle);
        appCompatSpinner.setLayoutParams(new LinearLayoutCompat.b(-2, -1));
        appCompatSpinner.setOnItemSelectedListener(this);
        return appCompatSpinner;
    }

    public final LinearLayoutCompat f() {
        LinearLayoutCompat linearLayoutCompat = new LinearLayoutCompat(getContext(), (AttributeSet) null, a.c.actionBarTabBarStyle);
        linearLayoutCompat.setMeasureWithLargestChildEnabled(true);
        linearLayoutCompat.setGravity(17);
        linearLayoutCompat.setLayoutParams(new LinearLayoutCompat.b(-2, -1));
        return linearLayoutCompat;
    }

    public d g(a.f fVar, boolean z10) {
        d dVar = new d(getContext(), fVar, z10);
        if (z10) {
            dVar.setBackgroundDrawable((Drawable) null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.V));
        } else {
            dVar.setFocusable(true);
            if (this.P == null) {
                this.P = new c();
            }
            dVar.setOnClickListener(this.P);
        }
        return dVar;
    }

    public final boolean h() {
        Spinner spinner = this.R;
        return spinner != null && spinner.getParent() == this;
    }

    public final void i() {
        if (!h()) {
            if (this.R == null) {
                this.R = e();
            }
            removeView(this.Q);
            addView(this.R, new ViewGroup.LayoutParams(-2, -1));
            if (this.R.getAdapter() == null) {
                this.R.setAdapter(new b());
            }
            Runnable runnable = this.O;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.O = null;
            }
            this.R.setSelection(this.W);
        }
    }

    public final boolean j() {
        if (!h()) {
            return false;
        }
        removeView(this.R);
        addView(this.Q, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.R.getSelectedItemPosition());
        return false;
    }

    public void k() {
        this.Q.removeAllViews();
        Spinner spinner = this.R;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.S) {
            requestLayout();
        }
    }

    public void l(int i10) {
        this.Q.removeViewAt(i10);
        Spinner spinner = this.R;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.S) {
            requestLayout();
        }
    }

    public void m(int i10) {
        ((d) this.Q.getChildAt(i10)).c();
        Spinner spinner = this.R;
        if (spinner != null) {
            ((b) spinner.getAdapter()).notifyDataSetChanged();
        }
        if (this.S) {
            requestLayout();
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.O;
        if (runnable != null) {
            post(runnable);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        k.a b10 = k.a.b(getContext());
        setContentHeight(b10.f());
        this.U = b10.e();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.O;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
        ((d) view).b().g();
    }

    public void onMeasure(int i10, int i11) {
        int i12;
        int mode = View.MeasureSpec.getMode(i10);
        boolean z10 = true;
        boolean z11 = mode == 1073741824;
        setFillViewport(z11);
        int childCount = this.Q.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            i12 = -1;
        } else {
            if (childCount > 2) {
                this.T = (int) (((float) View.MeasureSpec.getSize(i10)) * 0.4f);
            } else {
                this.T = View.MeasureSpec.getSize(i10) / 2;
            }
            i12 = Math.min(this.T, this.U);
        }
        this.T = i12;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.V, 1073741824);
        if (z11 || !this.S) {
            z10 = false;
        }
        if (z10) {
            this.Q.measure(0, makeMeasureSpec);
            if (this.Q.getMeasuredWidth() > View.MeasureSpec.getSize(i10)) {
                i();
                int measuredWidth = getMeasuredWidth();
                super.onMeasure(i10, makeMeasureSpec);
                int measuredWidth2 = getMeasuredWidth();
                if (z11 && measuredWidth != measuredWidth2) {
                    setTabSelected(this.W);
                    return;
                }
            }
        }
        j();
        int measuredWidth3 = getMeasuredWidth();
        super.onMeasure(i10, makeMeasureSpec);
        int measuredWidth22 = getMeasuredWidth();
        if (z11) {
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z10) {
        this.S = z10;
    }

    public void setContentHeight(int i10) {
        this.V = i10;
        requestLayout();
    }

    public void setTabSelected(int i10) {
        this.W = i10;
        int childCount = this.Q.getChildCount();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = this.Q.getChildAt(i11);
            boolean z10 = i11 == i10;
            childAt.setSelected(z10);
            if (z10) {
                c(i10);
            }
            i11++;
        }
        Spinner spinner = this.R;
        if (spinner != null && i10 >= 0) {
            spinner.setSelection(i10);
        }
    }
}
