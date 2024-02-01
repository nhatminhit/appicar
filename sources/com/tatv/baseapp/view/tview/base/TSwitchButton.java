package com.tatv.baseapp.view.tview.base;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.tatv.baseapp.a;
import d.o0;

public class TSwitchButton extends AppCompatImageView implements View.OnClickListener {
    public boolean Q;
    public a R;

    public interface a {
        void a(View view, boolean z10);
    }

    public TSwitchButton(Context context) {
        super(context);
        b();
    }

    public TSwitchButton(Context context, @o0 AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public TSwitchButton(Context context, @o0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        b();
    }

    public TSwitchButton(Context context, boolean z10) {
        super(context);
        d(z10);
    }

    public final void b() {
        setOnClickListener(this);
        e();
    }

    public final void d(boolean z10) {
        this.Q = z10;
        b();
    }

    @SuppressLint({"UseCompatLoadingForDrawables"})
    public final void e() {
        setImageDrawable(getContext().getDrawable(this.Q ? a.g.ic_switch_on : a.g.ic_switch_off));
        invalidate();
    }

    public void onClick(View view) {
        this.Q = !this.Q;
        e();
        a aVar = this.R;
        if (aVar != null) {
            aVar.a(this, this.Q);
        }
    }

    public void setEnabled(boolean z10) {
        this.Q = z10;
        e();
    }

    public void setSwitchOnClickListener(a aVar) {
        this.R = aVar;
    }
}
