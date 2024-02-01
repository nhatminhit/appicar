package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.collection.i;
import androidx.lifecycle.a1;
import androidx.lifecycle.b1;
import d.m0;
import d.o0;
import e1.n;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import l2.a;

public class e {

    /* renamed from: a  reason: collision with root package name */
    public final g<?> f2627a;

    public e(g<?> gVar) {
        this.f2627a = gVar;
    }

    @m0
    public static e b(@m0 g<?> gVar) {
        return new e((g) n.h(gVar, "callbacks == null"));
    }

    @o0
    public Fragment A(@m0 String str) {
        return this.f2627a.S.r0(str);
    }

    @m0
    public List<Fragment> B(@SuppressLint({"UnknownNullness"}) List<Fragment> list) {
        return this.f2627a.S.x0();
    }

    public int C() {
        return this.f2627a.S.w0();
    }

    @m0
    public FragmentManager D() {
        return this.f2627a.S;
    }

    @SuppressLint({"UnknownNullness"})
    @Deprecated
    public a E() {
        throw new UnsupportedOperationException("Loaders are managed separately from FragmentController, use LoaderManager.getInstance() to obtain a LoaderManager.");
    }

    public void F() {
        this.f2627a.S.h1();
    }

    @o0
    public View G(@o0 View view, @m0 String str, @m0 Context context, @m0 AttributeSet attributeSet) {
        return this.f2627a.S.I0().onCreateView(view, str, context, attributeSet);
    }

    @Deprecated
    public void H() {
    }

    @Deprecated
    public void I(@o0 Parcelable parcelable, @o0 k kVar) {
        this.f2627a.S.D1(parcelable, kVar);
    }

    @Deprecated
    public void J(@o0 Parcelable parcelable, @o0 List<Fragment> list) {
        this.f2627a.S.D1(parcelable, new k(list, (Map<String, k>) null, (Map<String, a1>) null));
    }

    @Deprecated
    public void K(@SuppressLint({"UnknownNullness"}) i<String, a> iVar) {
    }

    public void L(@o0 Parcelable parcelable) {
        g<?> gVar = this.f2627a;
        if (gVar instanceof b1) {
            gVar.S.E1(parcelable);
            return;
        }
        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
    }

    @o0
    @Deprecated
    public i<String, a> M() {
        return null;
    }

    @o0
    @Deprecated
    public k N() {
        return this.f2627a.S.F1();
    }

    @o0
    @Deprecated
    public List<Fragment> O() {
        k F1 = this.f2627a.S.F1();
        if (F1 == null || F1.b() == null) {
            return null;
        }
        return new ArrayList(F1.b());
    }

    @o0
    public Parcelable P() {
        return this.f2627a.S.H1();
    }

    public void a(@o0 Fragment fragment) {
        g<?> gVar = this.f2627a;
        gVar.S.p(gVar, gVar, fragment);
    }

    public void c() {
        this.f2627a.S.D();
    }

    public void d(@m0 Configuration configuration) {
        this.f2627a.S.F(configuration);
    }

    public boolean e(@m0 MenuItem menuItem) {
        return this.f2627a.S.G(menuItem);
    }

    public void f() {
        this.f2627a.S.H();
    }

    public boolean g(@m0 Menu menu, @m0 MenuInflater menuInflater) {
        return this.f2627a.S.I(menu, menuInflater);
    }

    public void h() {
        this.f2627a.S.J();
    }

    public void i() {
        this.f2627a.S.K();
    }

    public void j() {
        this.f2627a.S.L();
    }

    public void k(boolean z10) {
        this.f2627a.S.M(z10);
    }

    public boolean l(@m0 MenuItem menuItem) {
        return this.f2627a.S.O(menuItem);
    }

    public void m(@m0 Menu menu) {
        this.f2627a.S.P(menu);
    }

    public void n() {
        this.f2627a.S.R();
    }

    public void o(boolean z10) {
        this.f2627a.S.S(z10);
    }

    public boolean p(@m0 Menu menu) {
        return this.f2627a.S.T(menu);
    }

    @Deprecated
    public void q() {
    }

    public void r() {
        this.f2627a.S.V();
    }

    public void s() {
        this.f2627a.S.W();
    }

    public void t() {
        this.f2627a.S.Y();
    }

    @Deprecated
    public void u() {
    }

    @Deprecated
    public void v() {
    }

    @Deprecated
    public void w() {
    }

    @Deprecated
    public void x(boolean z10) {
    }

    @Deprecated
    public void y(@m0 String str, @o0 FileDescriptor fileDescriptor, @m0 PrintWriter printWriter, @o0 String[] strArr) {
    }

    public boolean z() {
        return this.f2627a.S.h0(true);
    }
}
