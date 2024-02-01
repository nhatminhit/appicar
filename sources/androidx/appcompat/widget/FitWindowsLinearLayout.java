package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.d0;
import d.m0;
import d.o0;
import d.x0;

@x0({x0.a.Q})
public class FitWindowsLinearLayout extends LinearLayout implements d0 {
    public d0.a O;

    public FitWindowsLinearLayout(@m0 Context context) {
        super(context);
    }

    public FitWindowsLinearLayout(@m0 Context context, @o0 AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean fitSystemWindows(Rect rect) {
        d0.a aVar = this.O;
        if (aVar != null) {
            aVar.a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(d0.a aVar) {
        this.O = aVar;
    }
}
