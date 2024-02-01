package com.google.android.gms.internal.common;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Iterator;

public final class e extends b {
    public e() {
        super(4);
    }

    public e(int i10) {
        super(4);
    }

    @CanIgnoreReturnValue
    public final e c(Object obj) {
        super.a(obj);
        return this;
    }

    @CanIgnoreReturnValue
    public final e d(Iterator it) {
        while (it.hasNext()) {
            super.a(it.next());
        }
        return this;
    }
}
