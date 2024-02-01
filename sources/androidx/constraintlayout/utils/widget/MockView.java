package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.e;

public class MockView extends View {
    public Paint O = new Paint();
    public Paint P = new Paint();
    public Paint Q = new Paint();
    public boolean R = true;
    public boolean S = true;
    public String T = null;
    public Rect U = new Rect();
    public int V = Color.argb(255, 0, 0, 0);
    public int W = Color.argb(255, 200, 200, 200);

    /* renamed from: a0  reason: collision with root package name */
    public int f1755a0 = Color.argb(255, 50, 50, 50);

    /* renamed from: b0  reason: collision with root package name */
    public int f1756b0 = 4;

    public MockView(Context context) {
        super(context);
        a(context, (AttributeSet) null);
    }

    public MockView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public MockView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a(context, attributeSet);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.m.MockView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == e.m.MockView_mock_label) {
                    this.T = obtainStyledAttributes.getString(index);
                } else if (index == e.m.MockView_mock_showDiagonals) {
                    this.R = obtainStyledAttributes.getBoolean(index, this.R);
                } else if (index == e.m.MockView_mock_diagonalsColor) {
                    this.V = obtainStyledAttributes.getColor(index, this.V);
                } else if (index == e.m.MockView_mock_labelBackgroundColor) {
                    this.f1755a0 = obtainStyledAttributes.getColor(index, this.f1755a0);
                } else if (index == e.m.MockView_mock_labelColor) {
                    this.W = obtainStyledAttributes.getColor(index, this.W);
                } else if (index == e.m.MockView_mock_showLabel) {
                    this.S = obtainStyledAttributes.getBoolean(index, this.S);
                }
            }
            obtainStyledAttributes.recycle();
        }
        if (this.T == null) {
            try {
                this.T = context.getResources().getResourceEntryName(getId());
            } catch (Exception unused) {
            }
        }
        this.O.setColor(this.V);
        this.O.setAntiAlias(true);
        this.P.setColor(this.W);
        this.P.setAntiAlias(true);
        this.Q.setColor(this.f1755a0);
        this.f1756b0 = Math.round(((float) this.f1756b0) * (getResources().getDisplayMetrics().xdpi / 160.0f));
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.R) {
            width--;
            height--;
            float f10 = (float) width;
            float f11 = (float) height;
            canvas.drawLine(0.0f, 0.0f, f10, f11, this.O);
            Canvas canvas2 = canvas;
            float f12 = f10;
            canvas2.drawLine(0.0f, f11, f12, 0.0f, this.O);
            canvas2.drawLine(0.0f, 0.0f, f12, 0.0f, this.O);
            float f13 = f10;
            float f14 = f11;
            canvas2.drawLine(f13, 0.0f, f12, f14, this.O);
            float f15 = f11;
            canvas2.drawLine(f13, f15, 0.0f, f14, this.O);
            canvas2.drawLine(0.0f, f15, 0.0f, 0.0f, this.O);
        }
        String str = this.T;
        if (str != null && this.S) {
            this.P.getTextBounds(str, 0, str.length(), this.U);
            float width2 = ((float) (width - this.U.width())) / 2.0f;
            float height2 = (((float) (height - this.U.height())) / 2.0f) + ((float) this.U.height());
            this.U.offset((int) width2, (int) height2);
            Rect rect = this.U;
            int i10 = rect.left;
            int i11 = this.f1756b0;
            rect.set(i10 - i11, rect.top - i11, rect.right + i11, rect.bottom + i11);
            canvas.drawRect(this.U, this.Q);
            canvas.drawText(this.T, width2, height2, this.P);
        }
    }
}
