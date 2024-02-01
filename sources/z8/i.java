package z8;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import d.m0;
import d.o0;
import e8.a;
import j8.s;
import z8.c;

@a
public final class i extends c.a {
    public Fragment O;

    public i(Fragment fragment) {
        this.O = fragment;
    }

    @a
    @o0
    public static i J(@o0 Fragment fragment) {
        if (fragment != null) {
            return new i(fragment);
        }
        return null;
    }

    public final void A0(@m0 Intent intent, int i10) {
        this.O.startActivityForResult(intent, i10);
    }

    @o0
    public final String A1() {
        return this.O.getTag();
    }

    public final void E0(@m0 d dVar) {
        View view = (View) f.J(dVar);
        Fragment fragment = this.O;
        s.l(view);
        fragment.unregisterForContextMenu(view);
    }

    public final boolean G1() {
        return this.O.getRetainInstance();
    }

    public final void I1(boolean z10) {
        this.O.setUserVisibleHint(z10);
    }

    public final void K(boolean z10) {
        this.O.setHasOptionsMenu(z10);
    }

    public final boolean Q0() {
        return this.O.isInLayout();
    }

    public final boolean S() {
        return this.O.isRemoving();
    }

    public final boolean T1() {
        return this.O.isVisible();
    }

    @m0
    public final d W() {
        return f.b0(this.O.getResources());
    }

    public final void X(boolean z10) {
        this.O.setMenuVisibility(z10);
    }

    public final boolean X1() {
        return this.O.getUserVisibleHint();
    }

    @o0
    public final Bundle c() {
        return this.O.getArguments();
    }

    public final boolean c0() {
        return this.O.isResumed();
    }

    @o0
    public final c h() {
        return J(this.O.getParentFragment());
    }

    public final boolean h1() {
        return this.O.isAdded();
    }

    public final int l() {
        return this.O.getId();
    }

    public final void l0(boolean z10) {
        this.O.setRetainInstance(z10);
    }

    public final int o() {
        return this.O.getTargetRequestCode();
    }

    public final boolean s1() {
        return this.O.isDetached();
    }

    @m0
    public final d t() {
        return f.b0(this.O.getView());
    }

    public final void v1(@m0 d dVar) {
        View view = (View) f.J(dVar);
        Fragment fragment = this.O;
        s.l(view);
        fragment.registerForContextMenu(view);
    }

    @o0
    public final c w() {
        return J(this.O.getTargetFragment());
    }

    public final void w0(@m0 Intent intent) {
        this.O.startActivity(intent);
    }

    @m0
    public final d y() {
        return f.b0(this.O.getActivity());
    }

    public final boolean z0() {
        return this.O.isHidden();
    }
}
