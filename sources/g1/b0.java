package g1;

import android.os.Parcelable;
import android.view.View;
import android.view.accessibility.AccessibilityRecord;
import d.m0;
import java.util.List;

public class b0 {

    /* renamed from: a  reason: collision with root package name */
    public final AccessibilityRecord f7553a;

    @Deprecated
    public b0(Object obj) {
        this.f7553a = (AccessibilityRecord) obj;
    }

    @Deprecated
    public static b0 A(b0 b0Var) {
        return new b0(AccessibilityRecord.obtain(b0Var.f7553a));
    }

    public static void N(AccessibilityRecord accessibilityRecord, int i10) {
        accessibilityRecord.setMaxScrollX(i10);
    }

    public static void P(AccessibilityRecord accessibilityRecord, int i10) {
        accessibilityRecord.setMaxScrollY(i10);
    }

    public static void Y(@m0 AccessibilityRecord accessibilityRecord, View view, int i10) {
        accessibilityRecord.setSource(view, i10);
    }

    public static int j(AccessibilityRecord accessibilityRecord) {
        return accessibilityRecord.getMaxScrollX();
    }

    public static int l(AccessibilityRecord accessibilityRecord) {
        return accessibilityRecord.getMaxScrollY();
    }

    @Deprecated
    public static b0 z() {
        return new b0(AccessibilityRecord.obtain());
    }

    @Deprecated
    public void B() {
        this.f7553a.recycle();
    }

    @Deprecated
    public void C(int i10) {
        this.f7553a.setAddedCount(i10);
    }

    @Deprecated
    public void D(CharSequence charSequence) {
        this.f7553a.setBeforeText(charSequence);
    }

    @Deprecated
    public void E(boolean z10) {
        this.f7553a.setChecked(z10);
    }

    @Deprecated
    public void F(CharSequence charSequence) {
        this.f7553a.setClassName(charSequence);
    }

    @Deprecated
    public void G(CharSequence charSequence) {
        this.f7553a.setContentDescription(charSequence);
    }

    @Deprecated
    public void H(int i10) {
        this.f7553a.setCurrentItemIndex(i10);
    }

    @Deprecated
    public void I(boolean z10) {
        this.f7553a.setEnabled(z10);
    }

    @Deprecated
    public void J(int i10) {
        this.f7553a.setFromIndex(i10);
    }

    @Deprecated
    public void K(boolean z10) {
        this.f7553a.setFullScreen(z10);
    }

    @Deprecated
    public void L(int i10) {
        this.f7553a.setItemCount(i10);
    }

    @Deprecated
    public void M(int i10) {
        N(this.f7553a, i10);
    }

    @Deprecated
    public void O(int i10) {
        P(this.f7553a, i10);
    }

    @Deprecated
    public void Q(Parcelable parcelable) {
        this.f7553a.setParcelableData(parcelable);
    }

    @Deprecated
    public void R(boolean z10) {
        this.f7553a.setPassword(z10);
    }

    @Deprecated
    public void S(int i10) {
        this.f7553a.setRemovedCount(i10);
    }

    @Deprecated
    public void T(int i10) {
        this.f7553a.setScrollX(i10);
    }

    @Deprecated
    public void U(int i10) {
        this.f7553a.setScrollY(i10);
    }

    @Deprecated
    public void V(boolean z10) {
        this.f7553a.setScrollable(z10);
    }

    @Deprecated
    public void W(View view) {
        this.f7553a.setSource(view);
    }

    @Deprecated
    public void X(View view, int i10) {
        Y(this.f7553a, view, i10);
    }

    @Deprecated
    public void Z(int i10) {
        this.f7553a.setToIndex(i10);
    }

    @Deprecated
    public int a() {
        return this.f7553a.getAddedCount();
    }

    @Deprecated
    public CharSequence b() {
        return this.f7553a.getBeforeText();
    }

    @Deprecated
    public CharSequence c() {
        return this.f7553a.getClassName();
    }

    @Deprecated
    public CharSequence d() {
        return this.f7553a.getContentDescription();
    }

    @Deprecated
    public int e() {
        return this.f7553a.getCurrentItemIndex();
    }

    @Deprecated
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        AccessibilityRecord accessibilityRecord = this.f7553a;
        AccessibilityRecord accessibilityRecord2 = ((b0) obj).f7553a;
        if (accessibilityRecord == null) {
            if (accessibilityRecord2 != null) {
                return false;
            }
        } else if (!accessibilityRecord.equals(accessibilityRecord2)) {
            return false;
        }
        return true;
    }

    @Deprecated
    public int f() {
        return this.f7553a.getFromIndex();
    }

    @Deprecated
    public Object g() {
        return this.f7553a;
    }

    @Deprecated
    public int h() {
        return this.f7553a.getItemCount();
    }

    @Deprecated
    public int hashCode() {
        AccessibilityRecord accessibilityRecord = this.f7553a;
        if (accessibilityRecord == null) {
            return 0;
        }
        return accessibilityRecord.hashCode();
    }

    @Deprecated
    public int i() {
        return j(this.f7553a);
    }

    @Deprecated
    public int k() {
        return l(this.f7553a);
    }

    @Deprecated
    public Parcelable m() {
        return this.f7553a.getParcelableData();
    }

    @Deprecated
    public int n() {
        return this.f7553a.getRemovedCount();
    }

    @Deprecated
    public int o() {
        return this.f7553a.getScrollX();
    }

    @Deprecated
    public int p() {
        return this.f7553a.getScrollY();
    }

    @Deprecated
    public z q() {
        return z.W1(this.f7553a.getSource());
    }

    @Deprecated
    public List<CharSequence> r() {
        return this.f7553a.getText();
    }

    @Deprecated
    public int s() {
        return this.f7553a.getToIndex();
    }

    @Deprecated
    public int t() {
        return this.f7553a.getWindowId();
    }

    @Deprecated
    public boolean u() {
        return this.f7553a.isChecked();
    }

    @Deprecated
    public boolean v() {
        return this.f7553a.isEnabled();
    }

    @Deprecated
    public boolean w() {
        return this.f7553a.isFullScreen();
    }

    @Deprecated
    public boolean x() {
        return this.f7553a.isPassword();
    }

    @Deprecated
    public boolean y() {
        return this.f7553a.isScrollable();
    }
}
