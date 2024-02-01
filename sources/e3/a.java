package e3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import android.widget.ImageView;
import f1.w1;
import i0.d;

public class a extends ImageView {
    public static final int Q = 503316480;
    public static final int R = 1023410176;
    public static final float S = 0.0f;
    public static final float T = 1.75f;
    public static final float U = 3.5f;
    public static final int V = 4;
    public Animation.AnimationListener O;
    public int P;

    /* renamed from: e3.a$a  reason: collision with other inner class name */
    public class C0111a extends OvalShape {
        public RadialGradient O;
        public Paint P = new Paint();

        public C0111a(int i10) {
            a.this.P = i10;
            a((int) rect().width());
        }

        public final void a(int i10) {
            float f10 = (float) (i10 / 2);
            RadialGradient radialGradient = new RadialGradient(f10, f10, (float) a.this.P, new int[]{a.R, 0}, (float[]) null, Shader.TileMode.CLAMP);
            this.O = radialGradient;
            this.P.setShader(radialGradient);
        }

        public void draw(Canvas canvas, Paint paint) {
            int width = a.this.getWidth() / 2;
            float f10 = (float) width;
            float height = (float) (a.this.getHeight() / 2);
            canvas.drawCircle(f10, height, f10, this.P);
            canvas.drawCircle(f10, height, (float) (width - a.this.P), paint);
        }

        public void onResize(float f10, float f11) {
            super.onResize(f10, f11);
            a((int) f10);
        }
    }

    public a(Context context, int i10) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f10 = getContext().getResources().getDisplayMetrics().density;
        int i11 = (int) (1.75f * f10);
        int i12 = (int) (0.0f * f10);
        this.P = (int) (3.5f * f10);
        if (a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            w1.L1(this, f10 * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C0111a(this.P));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer((float) this.P, (float) i12, (float) i11, Q);
            int i13 = this.P;
            setPadding(i13, i13, i13, i13);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(i10);
        w1.G1(this, shapeDrawable);
    }

    public final boolean a() {
        return true;
    }

    public void b(Animation.AnimationListener animationListener) {
        this.O = animationListener;
    }

    public void c(int i10) {
        setBackgroundColor(d.f(getContext(), i10));
    }

    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.O;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.O;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.P * 2), getMeasuredHeight() + (this.P * 2));
        }
    }

    public void setBackgroundColor(int i10) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i10);
        }
    }
}
