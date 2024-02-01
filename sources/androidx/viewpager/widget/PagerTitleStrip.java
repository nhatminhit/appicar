package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.core.widget.y;
import androidx.viewpager.widget.ViewPager;
import d.l;
import d.m0;
import d.o0;
import d.v;
import f1.w1;
import java.lang.ref.WeakReference;
import java.util.Locale;

@ViewPager.e
public class PagerTitleStrip extends ViewGroup {

    /* renamed from: f0  reason: collision with root package name */
    public static final int[] f3874f0 = {16842804, 16842901, 16842904, 16842927};

    /* renamed from: g0  reason: collision with root package name */
    public static final int[] f3875g0 = {16843660};

    /* renamed from: h0  reason: collision with root package name */
    public static final float f3876h0 = 0.6f;

    /* renamed from: i0  reason: collision with root package name */
    public static final int f3877i0 = 16;
    public ViewPager O;
    public TextView P;
    public TextView Q;
    public TextView R;
    public int S;
    public float T;
    public int U;
    public int V;
    public boolean W;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f3878a0;

    /* renamed from: b0  reason: collision with root package name */
    public final a f3879b0;

    /* renamed from: c0  reason: collision with root package name */
    public WeakReference<n3.a> f3880c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f3881d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f3882e0;

    public class a extends DataSetObserver implements ViewPager.j, ViewPager.i {

        /* renamed from: a  reason: collision with root package name */
        public int f3883a;

        public a() {
        }

        public void a(int i10, float f10, int i11) {
            if (f10 > 0.5f) {
                i10++;
            }
            PagerTitleStrip.this.d(i10, f10, false);
        }

        public void b(ViewPager viewPager, n3.a aVar, n3.a aVar2) {
            PagerTitleStrip.this.b(aVar, aVar2);
        }

        public void c(int i10) {
            this.f3883a = i10;
        }

        public void d(int i10) {
            if (this.f3883a == 0) {
                PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
                pagerTitleStrip.c(pagerTitleStrip.O.getCurrentItem(), PagerTitleStrip.this.O.getAdapter());
                PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
                float f10 = pagerTitleStrip2.T;
                if (f10 < 0.0f) {
                    f10 = 0.0f;
                }
                pagerTitleStrip2.d(pagerTitleStrip2.O.getCurrentItem(), f10, true);
            }
        }

        public void onChanged() {
            PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
            pagerTitleStrip.c(pagerTitleStrip.O.getCurrentItem(), PagerTitleStrip.this.O.getAdapter());
            PagerTitleStrip pagerTitleStrip2 = PagerTitleStrip.this;
            float f10 = pagerTitleStrip2.T;
            if (f10 < 0.0f) {
                f10 = 0.0f;
            }
            pagerTitleStrip2.d(pagerTitleStrip2.O.getCurrentItem(), f10, true);
        }
    }

    public static class b extends SingleLineTransformationMethod {
        public Locale O;

        public b(Context context) {
            this.O = context.getResources().getConfiguration().locale;
        }

        public CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.O);
            }
            return null;
        }
    }

    public PagerTitleStrip(@m0 Context context) {
        this(context, (AttributeSet) null);
    }

    public PagerTitleStrip(@m0 Context context, @o0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.S = -1;
        this.T = -1.0f;
        this.f3879b0 = new a();
        TextView textView = new TextView(context);
        this.P = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.Q = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.R = textView3;
        addView(textView3);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3874f0);
        boolean z10 = false;
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            y.E(this.P, resourceId);
            y.E(this.Q, resourceId);
            y.E(this.R, resourceId);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            a(0, (float) dimensionPixelSize);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            int color = obtainStyledAttributes.getColor(2, 0);
            this.P.setTextColor(color);
            this.Q.setTextColor(color);
            this.R.setTextColor(color);
        }
        this.V = obtainStyledAttributes.getInteger(3, 80);
        obtainStyledAttributes.recycle();
        this.f3882e0 = this.Q.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(0.6f);
        this.P.setEllipsize(TextUtils.TruncateAt.END);
        this.Q.setEllipsize(TextUtils.TruncateAt.END);
        this.R.setEllipsize(TextUtils.TruncateAt.END);
        if (resourceId != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, f3875g0);
            z10 = obtainStyledAttributes2.getBoolean(0, false);
            obtainStyledAttributes2.recycle();
        }
        TextView textView4 = this.P;
        if (z10) {
            setSingleLineAllCaps(textView4);
            setSingleLineAllCaps(this.Q);
            setSingleLineAllCaps(this.R);
        } else {
            textView4.setSingleLine();
            this.Q.setSingleLine();
            this.R.setSingleLine();
        }
        this.U = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }

    private static void setSingleLineAllCaps(TextView textView) {
        textView.setTransformationMethod(new b(textView.getContext()));
    }

    public void a(int i10, float f10) {
        this.P.setTextSize(i10, f10);
        this.Q.setTextSize(i10, f10);
        this.R.setTextSize(i10, f10);
    }

    public void b(n3.a aVar, n3.a aVar2) {
        if (aVar != null) {
            aVar.u(this.f3879b0);
            this.f3880c0 = null;
        }
        if (aVar2 != null) {
            aVar2.m(this.f3879b0);
            this.f3880c0 = new WeakReference<>(aVar2);
        }
        ViewPager viewPager = this.O;
        if (viewPager != null) {
            this.S = -1;
            this.T = -1.0f;
            c(viewPager.getCurrentItem(), aVar2);
            requestLayout();
        }
    }

    public void c(int i10, n3.a aVar) {
        int e10 = aVar != null ? aVar.e() : 0;
        this.W = true;
        CharSequence charSequence = null;
        this.P.setText((i10 < 1 || aVar == null) ? null : aVar.g(i10 - 1));
        this.Q.setText((aVar == null || i10 >= e10) ? null : aVar.g(i10));
        int i11 = i10 + 1;
        if (i11 < e10 && aVar != null) {
            charSequence = aVar.g(i11);
        }
        this.R.setText(charSequence);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((float) ((getWidth() - getPaddingLeft()) - getPaddingRight())) * 0.8f)), Integer.MIN_VALUE);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        this.P.measure(makeMeasureSpec, makeMeasureSpec2);
        this.Q.measure(makeMeasureSpec, makeMeasureSpec2);
        this.R.measure(makeMeasureSpec, makeMeasureSpec2);
        this.S = i10;
        if (!this.f3878a0) {
            d(i10, this.T, false);
        }
        this.W = false;
    }

    public void d(int i10, float f10, boolean z10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = i10;
        float f11 = f10;
        if (i15 != this.S) {
            c(i15, this.O.getAdapter());
        } else if (!z10 && f11 == this.T) {
            return;
        }
        this.f3878a0 = true;
        int measuredWidth = this.P.getMeasuredWidth();
        int measuredWidth2 = this.Q.getMeasuredWidth();
        int measuredWidth3 = this.R.getMeasuredWidth();
        int i16 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i17 = paddingRight + i16;
        int i18 = (width - (paddingLeft + i16)) - i17;
        float f12 = 0.5f + f11;
        if (f12 > 1.0f) {
            f12 -= 1.0f;
        }
        int i19 = ((width - i17) - ((int) (((float) i18) * f12))) - i16;
        int i20 = measuredWidth2 + i19;
        int baseline = this.P.getBaseline();
        int baseline2 = this.Q.getBaseline();
        int baseline3 = this.R.getBaseline();
        int max = Math.max(Math.max(baseline, baseline2), baseline3);
        int i21 = max - baseline;
        int i22 = max - baseline2;
        int i23 = max - baseline3;
        int i24 = measuredWidth3;
        int max2 = Math.max(Math.max(this.P.getMeasuredHeight() + i21, this.Q.getMeasuredHeight() + i22), this.R.getMeasuredHeight() + i23);
        int i25 = this.V & 112;
        if (i25 == 16) {
            i14 = (((height - paddingTop) - paddingBottom) - max2) / 2;
        } else if (i25 != 80) {
            i13 = i21 + paddingTop;
            i11 = i22 + paddingTop;
            i12 = paddingTop + i23;
            TextView textView = this.Q;
            textView.layout(i19, i11, i20, textView.getMeasuredHeight() + i11);
            int min = Math.min(paddingLeft, (i19 - this.U) - measuredWidth);
            TextView textView2 = this.P;
            textView2.layout(min, i13, measuredWidth + min, textView2.getMeasuredHeight() + i13);
            int max3 = Math.max((width - paddingRight) - i24, i20 + this.U);
            TextView textView3 = this.R;
            textView3.layout(max3, i12, max3 + i24, textView3.getMeasuredHeight() + i12);
            this.T = f10;
            this.f3878a0 = false;
        } else {
            i14 = (height - paddingBottom) - max2;
        }
        i13 = i21 + i14;
        i11 = i22 + i14;
        i12 = i14 + i23;
        TextView textView4 = this.Q;
        textView4.layout(i19, i11, i20, textView4.getMeasuredHeight() + i11);
        int min2 = Math.min(paddingLeft, (i19 - this.U) - measuredWidth);
        TextView textView22 = this.P;
        textView22.layout(min2, i13, measuredWidth + min2, textView22.getMeasuredHeight() + i13);
        int max32 = Math.max((width - paddingRight) - i24, i20 + this.U);
        TextView textView32 = this.R;
        textView32.layout(max32, i12, max32 + i24, textView32.getMeasuredHeight() + i12);
        this.T = f10;
        this.f3878a0 = false;
    }

    public int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public int getTextSpacing() {
        return this.U;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof ViewPager) {
            ViewPager viewPager = (ViewPager) parent;
            n3.a adapter = viewPager.getAdapter();
            viewPager.V(this.f3879b0);
            viewPager.b(this.f3879b0);
            this.O = viewPager;
            WeakReference<n3.a> weakReference = this.f3880c0;
            b(weakReference != null ? weakReference.get() : null, adapter);
            return;
        }
        throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.O;
        if (viewPager != null) {
            b(viewPager.getAdapter(), (n3.a) null);
            this.O.V((ViewPager.j) null);
            this.O.N(this.f3879b0);
            this.O = null;
        }
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.O != null) {
            float f10 = this.T;
            if (f10 < 0.0f) {
                f10 = 0.0f;
            }
            d(this.S, f10, true);
        }
    }

    public void onMeasure(int i10, int i11) {
        int i12;
        if (View.MeasureSpec.getMode(i10) == 1073741824) {
            int paddingTop = getPaddingTop() + getPaddingBottom();
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingTop, -2);
            int size = View.MeasureSpec.getSize(i10);
            int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i10, (int) (((float) size) * 0.2f), -2);
            this.P.measure(childMeasureSpec2, childMeasureSpec);
            this.Q.measure(childMeasureSpec2, childMeasureSpec);
            this.R.measure(childMeasureSpec2, childMeasureSpec);
            if (View.MeasureSpec.getMode(i11) == 1073741824) {
                i12 = View.MeasureSpec.getSize(i11);
            } else {
                i12 = Math.max(getMinHeight(), this.Q.getMeasuredHeight() + paddingTop);
            }
            setMeasuredDimension(size, View.resolveSizeAndState(i12, i11, this.Q.getMeasuredState() << 16));
            return;
        }
        throw new IllegalStateException("Must measure with an exact width");
    }

    public void requestLayout() {
        if (!this.W) {
            super.requestLayout();
        }
    }

    public void setGravity(int i10) {
        this.V = i10;
        requestLayout();
    }

    public void setNonPrimaryAlpha(@v(from = 0.0d, to = 1.0d) float f10) {
        int i10 = ((int) (f10 * 255.0f)) & 255;
        this.f3881d0 = i10;
        int i11 = (i10 << 24) | (this.f3882e0 & w1.f7299s);
        this.P.setTextColor(i11);
        this.R.setTextColor(i11);
    }

    public void setTextColor(@l int i10) {
        this.f3882e0 = i10;
        this.Q.setTextColor(i10);
        int i11 = (this.f3881d0 << 24) | (this.f3882e0 & w1.f7299s);
        this.P.setTextColor(i11);
        this.R.setTextColor(i11);
    }

    public void setTextSpacing(int i10) {
        this.U = i10;
        requestLayout();
    }
}
