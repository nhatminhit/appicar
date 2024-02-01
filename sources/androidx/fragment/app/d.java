package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import d.b0;
import d.m0;
import d.o0;

public abstract class d {
    @Deprecated
    @m0
    public Fragment b(@m0 Context context, @m0 String str, @o0 Bundle bundle) {
        return Fragment.instantiate(context, str, bundle);
    }

    @o0
    public abstract View c(@b0 int i10);

    public abstract boolean d();
}
