package g1;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import d.m0;
import d.x0;

public final class a extends ClickableSpan {
    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    public static final String R = "ACCESSIBILITY_CLICKABLE_SPAN_ID";
    public final int O;
    public final z P;
    public final int Q;

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    public a(int i10, z zVar, int i11) {
        this.O = i10;
        this.P = zVar;
        this.Q = i11;
    }

    public void onClick(@m0 View view) {
        Bundle bundle = new Bundle();
        bundle.putInt(R, this.O);
        this.P.G0(this.Q, bundle);
    }
}
