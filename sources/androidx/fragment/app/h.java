package androidx.fragment.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import d.m0;
import d.o0;

public class h implements LayoutInflater.Factory2 {
    public static final String P = "FragmentManager";
    public final FragmentManager O;

    public class a implements View.OnAttachStateChangeListener {
        public final /* synthetic */ q O;

        public a(q qVar) {
            this.O = qVar;
        }

        public void onViewAttachedToWindow(View view) {
            Fragment k10 = this.O.k();
            this.O.m();
            a0.n((ViewGroup) k10.f2461v0.getParent(), h.this.O).j();
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    public h(FragmentManager fragmentManager) {
        this.O = fragmentManager;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0161  */
    @d.o0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onCreateView(@d.o0 android.view.View r8, @d.m0 java.lang.String r9, @d.m0 android.content.Context r10, @d.m0 android.util.AttributeSet r11) {
        /*
            r7 = this;
            java.lang.Class<androidx.fragment.app.FragmentContainerView> r0 = androidx.fragment.app.FragmentContainerView.class
            java.lang.String r0 = r0.getName()
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x0014
            androidx.fragment.app.FragmentContainerView r8 = new androidx.fragment.app.FragmentContainerView
            androidx.fragment.app.FragmentManager r9 = r7.O
            r8.<init>((android.content.Context) r10, (android.util.AttributeSet) r11, (androidx.fragment.app.FragmentManager) r9)
            return r8
        L_0x0014:
            java.lang.String r0 = "fragment"
            boolean r9 = r0.equals(r9)
            r0 = 0
            if (r9 != 0) goto L_0x001e
            return r0
        L_0x001e:
            java.lang.String r9 = "class"
            java.lang.String r9 = r11.getAttributeValue(r0, r9)
            int[] r1 = x1.a.l.Fragment
            android.content.res.TypedArray r1 = r10.obtainStyledAttributes(r11, r1)
            if (r9 != 0) goto L_0x0032
            int r9 = x1.a.l.Fragment_android_name
            java.lang.String r9 = r1.getString(r9)
        L_0x0032:
            int r2 = x1.a.l.Fragment_android_id
            r3 = -1
            int r2 = r1.getResourceId(r2, r3)
            int r4 = x1.a.l.Fragment_android_tag
            java.lang.String r4 = r1.getString(r4)
            r1.recycle()
            if (r9 == 0) goto L_0x01b9
            java.lang.ClassLoader r1 = r10.getClassLoader()
            boolean r1 = androidx.fragment.app.f.b(r1, r9)
            if (r1 != 0) goto L_0x0050
            goto L_0x01b9
        L_0x0050:
            if (r8 == 0) goto L_0x0057
            int r1 = r8.getId()
            goto L_0x0058
        L_0x0057:
            r1 = 0
        L_0x0058:
            if (r1 != r3) goto L_0x007d
            if (r2 != r3) goto L_0x007d
            if (r4 == 0) goto L_0x005f
            goto L_0x007d
        L_0x005f:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = r11.getPositionDescription()
            r10.append(r11)
            java.lang.String r11 = ": Must specify unique android:id, android:tag, or have a parent with an id for "
            r10.append(r11)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        L_0x007d:
            if (r2 == r3) goto L_0x0085
            androidx.fragment.app.FragmentManager r0 = r7.O
            androidx.fragment.app.Fragment r0 = r0.p0(r2)
        L_0x0085:
            if (r0 != 0) goto L_0x008f
            if (r4 == 0) goto L_0x008f
            androidx.fragment.app.FragmentManager r0 = r7.O
            androidx.fragment.app.Fragment r0 = r0.q0(r4)
        L_0x008f:
            if (r0 != 0) goto L_0x0099
            if (r1 == r3) goto L_0x0099
            androidx.fragment.app.FragmentManager r0 = r7.O
            androidx.fragment.app.Fragment r0 = r0.p0(r1)
        L_0x0099:
            java.lang.String r3 = "Fragment "
            r5 = 2
            r6 = 1
            if (r0 != 0) goto L_0x00f9
            androidx.fragment.app.FragmentManager r0 = r7.O
            androidx.fragment.app.f r0 = r0.E0()
            java.lang.ClassLoader r10 = r10.getClassLoader()
            androidx.fragment.app.Fragment r0 = r0.a(r10, r9)
            r0.f2441b0 = r6
            if (r2 == 0) goto L_0x00b3
            r10 = r2
            goto L_0x00b4
        L_0x00b3:
            r10 = r1
        L_0x00b4:
            r0.f2450k0 = r10
            r0.f2451l0 = r1
            r0.f2452m0 = r4
            r0.f2442c0 = r6
            androidx.fragment.app.FragmentManager r10 = r7.O
            r0.f2446g0 = r10
            androidx.fragment.app.g r10 = r10.H0()
            r0.f2447h0 = r10
            androidx.fragment.app.FragmentManager r10 = r7.O
            androidx.fragment.app.g r10 = r10.H0()
            android.content.Context r10 = r10.f()
            android.os.Bundle r1 = r0.P
            r0.onInflate((android.content.Context) r10, (android.util.AttributeSet) r11, (android.os.Bundle) r1)
            androidx.fragment.app.FragmentManager r10 = r7.O
            androidx.fragment.app.q r10 = r10.k(r0)
            boolean r11 = androidx.fragment.app.FragmentManager.T0(r5)
            if (r11 == 0) goto L_0x0134
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r3)
            r11.append(r0)
            java.lang.String r1 = " has been inflated via the <fragment> tag: id=0x"
        L_0x00ee:
            r11.append(r1)
            java.lang.String r1 = java.lang.Integer.toHexString(r2)
            r11.append(r1)
            goto L_0x0134
        L_0x00f9:
            boolean r10 = r0.f2442c0
            if (r10 != 0) goto L_0x017b
            r0.f2442c0 = r6
            androidx.fragment.app.FragmentManager r10 = r7.O
            r0.f2446g0 = r10
            androidx.fragment.app.g r10 = r10.H0()
            r0.f2447h0 = r10
            androidx.fragment.app.FragmentManager r10 = r7.O
            androidx.fragment.app.g r10 = r10.H0()
            android.content.Context r10 = r10.f()
            android.os.Bundle r1 = r0.P
            r0.onInflate((android.content.Context) r10, (android.util.AttributeSet) r11, (android.os.Bundle) r1)
            androidx.fragment.app.FragmentManager r10 = r7.O
            androidx.fragment.app.q r10 = r10.A(r0)
            boolean r11 = androidx.fragment.app.FragmentManager.T0(r5)
            if (r11 == 0) goto L_0x0134
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r1 = "Retained Fragment "
            r11.append(r1)
            r11.append(r0)
            java.lang.String r1 = " has been re-attached via the <fragment> tag: id=0x"
            goto L_0x00ee
        L_0x0134:
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            r0.f2460u0 = r8
            r10.m()
            r10.j()
            android.view.View r8 = r0.f2461v0
            if (r8 == 0) goto L_0x0161
            if (r2 == 0) goto L_0x0147
            r8.setId(r2)
        L_0x0147:
            android.view.View r8 = r0.f2461v0
            java.lang.Object r8 = r8.getTag()
            if (r8 != 0) goto L_0x0154
            android.view.View r8 = r0.f2461v0
            r8.setTag(r4)
        L_0x0154:
            android.view.View r8 = r0.f2461v0
            androidx.fragment.app.h$a r9 = new androidx.fragment.app.h$a
            r9.<init>(r10)
            r8.addOnAttachStateChangeListener(r9)
            android.view.View r8 = r0.f2461v0
            return r8
        L_0x0161:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r3)
            r10.append(r9)
            java.lang.String r9 = " did not create a view."
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        L_0x017b:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = r11.getPositionDescription()
            r10.append(r11)
            java.lang.String r11 = ": Duplicate id 0x"
            r10.append(r11)
            java.lang.String r11 = java.lang.Integer.toHexString(r2)
            r10.append(r11)
            java.lang.String r11 = ", tag "
            r10.append(r11)
            r10.append(r4)
            java.lang.String r11 = ", or parent id 0x"
            r10.append(r11)
            java.lang.String r11 = java.lang.Integer.toHexString(r1)
            r10.append(r11)
            java.lang.String r11 = " with another fragment for "
            r10.append(r11)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.<init>(r9)
            throw r8
        L_0x01b9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.h.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    @o0
    public View onCreateView(@m0 String str, @m0 Context context, @m0 AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }
}
