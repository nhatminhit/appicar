package androidx.viewpager.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import d.l;
import d.m0;
import d.n;
import d.o0;
import d.u;
import f1.w1;
import i0.d;

public class PagerTabStrip extends PagerTitleStrip {
    public static final int A0 = 3;
    public static final int B0 = 6;
    public static final int C0 = 16;
    public static final int D0 = 32;
    public static final int E0 = 64;
    public static final int F0 = 1;
    public static final int G0 = 32;

    /* renamed from: z0  reason: collision with root package name */
    public static final String f3857z0 = "PagerTabStrip";

    /* renamed from: j0  reason: collision with root package name */
    public int f3858j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f3859k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f3860l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f3861m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f3862n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f3863o0;

    /* renamed from: p0  reason: collision with root package name */
    public final Paint f3864p0;

    /* renamed from: q0  reason: collision with root package name */
    public final Rect f3865q0;

    /* renamed from: r0  reason: collision with root package name */
    public int f3866r0;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f3867s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f3868t0;

    /* renamed from: u0  reason: collision with root package name */
    public int f3869u0;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f3870v0;

    /* renamed from: w0  reason: collision with root package name */
    public float f3871w0;

    /* renamed from: x0  reason: collision with root package name */
    public float f3872x0;

    /* renamed from: y0  reason: collision with root package name */
    public int f3873y0;

    public class a implements View.OnClickListener {
        public a() {
        }

        public void onClick(View view) {
            ViewPager viewPager = PagerTabStrip.this.O;
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        public void onClick(View view) {
            ViewPager viewPager = PagerTabStrip.this.O;
            viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
        }
    }

    public PagerTabStrip(@m0 Context context) {
        this(context, (AttributeSet) null);
    }

    public PagerTabStrip(@m0 Context context, @o0 AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f3864p0 = paint;
        this.f3865q0 = new Rect();
        this.f3866r0 = 255;
        this.f3867s0 = false;
        this.f3868t0 = false;
        int i10 = this.f3882e0;
        this.f3858j0 = i10;
        paint.setColor(i10);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f3859k0 = (int) ((3.0f * f10) + 0.5f);
        this.f3860l0 = (int) ((6.0f * f10) + 0.5f);
        this.f3861m0 = (int) (64.0f * f10);
        this.f3863o0 = (int) ((16.0f * f10) + 0.5f);
        this.f3869u0 = (int) ((1.0f * f10) + 0.5f);
        this.f3862n0 = (int) ((f10 * 32.0f) + 0.5f);
        this.f3873y0 = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.P.setFocusable(true);
        this.P.setOnClickListener(new a());
        this.R.setFocusable(true);
        this.R.setOnClickListener(new b());
        if (getBackground() == null) {
            this.f3867s0 = true;
        }
    }

    public void d(int i10, float f10, boolean z10) {
        Rect rect = this.f3865q0;
        int height = getHeight();
        int left = this.Q.getLeft() - this.f3863o0;
        int right = this.Q.getRight() + this.f3863o0;
        int i11 = height - this.f3859k0;
        rect.set(left, i11, right, height);
        super.d(i10, f10, z10);
        this.f3866r0 = (int) (Math.abs(f10 - 0.5f) * 2.0f * 255.0f);
        rect.union(this.Q.getLeft() - this.f3863o0, i11, this.Q.getRight() + this.f3863o0, height);
        invalidate(rect);
    }

    public boolean getDrawFullUnderline() {
        return this.f3867s0;
    }

    public int getMinHeight() {
        return Math.max(super.getMinHeight(), this.f3862n0);
    }

    @l
    public int getTabIndicatorColor() {
        return this.f3858j0;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = this.Q.getLeft() - this.f3863o0;
        int right = this.Q.getRight() + this.f3863o0;
        this.f3864p0.setColor((this.f3866r0 << 24) | (this.f3858j0 & w1.f7299s));
        float f10 = (float) height;
        canvas.drawRect((float) left, (float) (height - this.f3859k0), (float) right, f10, this.f3864p0);
        if (this.f3867s0) {
            this.f3864p0.setColor(-16777216 | (this.f3858j0 & w1.f7299s));
            canvas.drawRect((float) getPaddingLeft(), (float) (height - this.f3869u0), (float) (getWidth() - getPaddingRight()), f10, this.f3864p0);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewPager viewPager;
        int currentItem;
        int action = motionEvent.getAction();
        if (action != 0 && this.f3870v0) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        if (action == 0) {
            this.f3871w0 = x10;
            this.f3872x0 = y10;
            this.f3870v0 = false;
        } else if (action == 1) {
            if (x10 < ((float) (this.Q.getLeft() - this.f3863o0))) {
                viewPager = this.O;
                currentItem = viewPager.getCurrentItem() - 1;
            } else if (x10 > ((float) (this.Q.getRight() + this.f3863o0))) {
                viewPager = this.O;
                currentItem = viewPager.getCurrentItem() + 1;
            }
            viewPager.setCurrentItem(currentItem);
        } else if (action == 2 && (Math.abs(x10 - this.f3871w0) > ((float) this.f3873y0) || Math.abs(y10 - this.f3872x0) > ((float) this.f3873y0))) {
            this.f3870v0 = true;
        }
        return true;
    }

    public void setBackgroundColor(@l int i10) {
        super.setBackgroundColor(i10);
        if (!this.f3868t0) {
            this.f3867s0 = (i10 & -16777216) == 0;
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (!this.f3868t0) {
            this.f3867s0 = drawable == null;
        }
    }

    public void setBackgroundResource(@u int i10) {
        super.setBackgroundResource(i10);
        if (!this.f3868t0) {
            this.f3867s0 = i10 == 0;
        }
    }

    public void setDrawFullUnderline(boolean z10) {
        this.f3867s0 = z10;
        this.f3868t0 = true;
        invalidate();
    }

    public void setPadding(int i10, int i11, int i12, int i13) {
        int i14 = this.f3860l0;
        if (i13 < i14) {
            i13 = i14;
        }
        super.setPadding(i10, i11, i12, i13);
    }

    public void setTabIndicatorColor(@l int i10) {
        this.f3858j0 = i10;
        this.f3864p0.setColor(i10);
        invalidate();
    }

    public void setTabIndicatorColorResource(@n int i10) {
        setTabIndicatorColor(d.f(getContext(), i10));
    }

    public void setTextSpacing(int i10) {
        int i11 = this.f3861m0;
        if (i10 < i11) {
            i10 = i11;
        }
        super.setTextSpacing(i10);
    }
}
