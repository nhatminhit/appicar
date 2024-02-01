package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;
import dg.a;
import z.e;

public class Placeholder extends View {
    public int O = -1;
    public View P = null;
    public int Q = 4;

    public Placeholder(Context context) {
        super(context);
        a((AttributeSet) null);
    }

    public Placeholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet);
    }

    public Placeholder(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a(attributeSet);
    }

    public Placeholder(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10);
        a(attributeSet);
    }

    public final void a(AttributeSet attributeSet) {
        super.setVisibility(this.Q);
        this.O = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e.m.ConstraintLayout_placeholder);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == e.m.ConstraintLayout_placeholder_content) {
                    this.O = obtainStyledAttributes.getResourceId(index, this.O);
                } else if (index == e.m.ConstraintLayout_placeholder_placeholder_emptyVisibility) {
                    this.Q = obtainStyledAttributes.getInt(index, this.Q);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void b(ConstraintLayout constraintLayout) {
        if (this.P != null) {
            ConstraintLayout.b bVar = (ConstraintLayout.b) getLayoutParams();
            ConstraintLayout.b bVar2 = (ConstraintLayout.b) this.P.getLayoutParams();
            bVar2.f1836n0.G1(0);
            e.b H = bVar.f1836n0.H();
            e.b bVar3 = e.b.FIXED;
            if (H != bVar3) {
                bVar.f1836n0.H1(bVar2.f1836n0.j0());
            }
            if (bVar.f1836n0.g0() != bVar3) {
                bVar.f1836n0.d1(bVar2.f1836n0.D());
            }
            bVar2.f1836n0.G1(8);
        }
    }

    public void c(ConstraintLayout constraintLayout) {
        if (this.O == -1 && !isInEditMode()) {
            setVisibility(this.Q);
        }
        View findViewById = constraintLayout.findViewById(this.O);
        this.P = findViewById;
        if (findViewById != null) {
            ((ConstraintLayout.b) findViewById.getLayoutParams()).f1812b0 = true;
            this.P.setVisibility(0);
            setVisibility(0);
        }
    }

    public View getContent() {
        return this.P;
    }

    public int getEmptyVisibility() {
        return this.Q;
    }

    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(a.Af, a.Af, a.Af);
            Paint paint = new Paint();
            paint.setARGB(255, a.f17952ff, a.f17952ff, a.f17952ff);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize((float) rect.height());
            int height = rect.height();
            int width = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((((float) width) / 2.0f) - (((float) rect.width()) / 2.0f)) - ((float) rect.left), ((((float) height) / 2.0f) + (((float) rect.height()) / 2.0f)) - ((float) rect.bottom), paint);
        }
    }

    public void setContentId(int i10) {
        View findViewById;
        if (this.O != i10) {
            View view = this.P;
            if (view != null) {
                view.setVisibility(0);
                ((ConstraintLayout.b) this.P.getLayoutParams()).f1812b0 = false;
                this.P = null;
            }
            this.O = i10;
            if (i10 != -1 && (findViewById = ((View) getParent()).findViewById(i10)) != null) {
                findViewById.setVisibility(8);
            }
        }
    }

    public void setEmptyVisibility(int i10) {
        this.Q = i10;
    }
}
