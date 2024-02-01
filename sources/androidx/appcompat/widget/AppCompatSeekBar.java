package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import d.m0;
import d.o0;
import f.a;

public class AppCompatSeekBar extends SeekBar {
    public final m O;

    public AppCompatSeekBar(@m0 Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatSeekBar(@m0 Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.seekBarStyle);
    }

    public AppCompatSeekBar(@m0 Context context, @o0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        r0.a(this, getContext());
        m mVar = new m(this);
        this.O = mVar;
        mVar.c(attributeSet, i10);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.O.h();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.O.l();
    }

    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.O.g(canvas);
    }
}
