package androidx.core.widget;

import android.widget.ListView;
import d.m0;

public class l extends a {

    /* renamed from: w0  reason: collision with root package name */
    public final ListView f2294w0;

    public l(@m0 ListView listView) {
        super(listView);
        this.f2294w0 = listView;
    }

    public boolean a(int i10) {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean b(int r8) {
        /*
            r7 = this;
            android.widget.ListView r0 = r7.f2294w0
            int r1 = r0.getCount()
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            int r3 = r0.getChildCount()
            int r4 = r0.getFirstVisiblePosition()
            int r5 = r4 + r3
            r6 = 1
            if (r8 <= 0) goto L_0x0029
            if (r5 < r1) goto L_0x0038
            int r3 = r3 - r6
            android.view.View r8 = r0.getChildAt(r3)
            int r8 = r8.getBottom()
            int r0 = r0.getHeight()
            if (r8 > r0) goto L_0x0038
            return r2
        L_0x0029:
            if (r8 >= 0) goto L_0x0039
            if (r4 > 0) goto L_0x0038
            android.view.View r8 = r0.getChildAt(r2)
            int r8 = r8.getTop()
            if (r8 < 0) goto L_0x0038
            return r2
        L_0x0038:
            return r6
        L_0x0039:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.l.b(int):boolean");
    }

    public void l(int i10, int i11) {
        m.b(this.f2294w0, i11);
    }
}