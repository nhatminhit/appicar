package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.b;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.c1;
import androidx.lifecycle.e1;
import d.b0;
import d.b1;
import d.h0;
import d.i;
import d.m0;
import d.o;
import d.o0;
import h0.a3;
import h0.v;
import k.b;
import y2.c;
import y2.f;

public class AppCompatActivity extends FragmentActivity implements d, a3.a, b.c {

    /* renamed from: h0  reason: collision with root package name */
    public static final String f720h0 = "androidx:appcompat";

    /* renamed from: f0  reason: collision with root package name */
    public e f721f0;

    /* renamed from: g0  reason: collision with root package name */
    public Resources f722g0;

    public class a implements c.C0245c {
        public a() {
        }

        @m0
        public Bundle a() {
            Bundle bundle = new Bundle();
            AppCompatActivity.this.o0().D(bundle);
            return bundle;
        }
    }

    public class b implements b.c {
        public b() {
        }

        public void a(@m0 Context context) {
            e o02 = AppCompatActivity.this.o0();
            o02.u();
            o02.z(AppCompatActivity.this.getSavedStateRegistry().b(AppCompatActivity.f720h0));
        }
    }

    public AppCompatActivity() {
        q0();
    }

    @o
    public AppCompatActivity(@h0 int i10) {
        super(i10);
        q0();
    }

    private void U() {
        c1.b(getWindow().getDecorView(), this);
        e1.b(getWindow().getDecorView(), this);
        f.b(getWindow().getDecorView(), this);
    }

    @Deprecated
    public void A0(boolean z10) {
    }

    @Deprecated
    public void B0(boolean z10) {
    }

    @o0
    public k.b C0(@m0 b.a aVar) {
        return o0().T(aVar);
    }

    public void D0(@m0 Intent intent) {
        v.g(this, intent);
    }

    public boolean E0(int i10) {
        return o0().I(i10);
    }

    public boolean F0(@m0 Intent intent) {
        return v.h(this, intent);
    }

    @o0
    public k.b H(@m0 b.a aVar) {
        return null;
    }

    @i
    public void M(@m0 k.b bVar) {
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        U();
        o0().d(view, layoutParams);
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(o0().h(context));
    }

    @o0
    public b.C0020b c() {
        return o0().p();
    }

    public void closeOptionsMenu() {
        a p02 = p0();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (p02 == null || !p02.l()) {
            super.closeOptionsMenu();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        a p02 = p0();
        if (keyCode != 82 || p02 == null || !p02.L(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    public <T extends View> T findViewById(@b0 int i10) {
        return o0().n(i10);
    }

    @m0
    public MenuInflater getMenuInflater() {
        return o0().r();
    }

    public Resources getResources() {
        if (this.f722g0 == null && androidx.appcompat.widget.c1.c()) {
            this.f722g0 = new androidx.appcompat.widget.c1(this, super.getResources());
        }
        Resources resources = this.f722g0;
        return resources == null ? super.getResources() : resources;
    }

    public void invalidateOptionsMenu() {
        o0().v();
    }

    @i
    public void j(@m0 k.b bVar) {
    }

    public void l0() {
        o0().v();
    }

    @m0
    public e o0() {
        if (this.f721f0 == null) {
            this.f721f0 = e.i(this, this);
        }
        return this.f721f0;
    }

    public void onConfigurationChanged(@m0 Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f722g0 != null) {
            this.f722g0.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        o0().y(configuration);
    }

    public void onContentChanged() {
        u0();
    }

    public void onDestroy() {
        super.onDestroy();
        o0().A();
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (w0(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    public final boolean onMenuItemSelected(int i10, @m0 MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        a p02 = p0();
        if (menuItem.getItemId() != 16908332 || p02 == null || (p02.p() & 4) == 0) {
            return false;
        }
        return v0();
    }

    public boolean onMenuOpened(int i10, Menu menu) {
        return super.onMenuOpened(i10, menu);
    }

    public void onPanelClosed(int i10, @m0 Menu menu) {
        super.onPanelClosed(i10, menu);
    }

    public void onPostCreate(@o0 Bundle bundle) {
        super.onPostCreate(bundle);
        o0().B(bundle);
    }

    public void onPostResume() {
        super.onPostResume();
        o0().C();
    }

    public void onStart() {
        super.onStart();
        o0().E();
    }

    public void onStop() {
        super.onStop();
        o0().F();
    }

    public void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        o0().S(charSequence);
    }

    public void openOptionsMenu() {
        a p02 = p0();
        if (!getWindow().hasFeature(0)) {
            return;
        }
        if (p02 == null || !p02.M()) {
            super.openOptionsMenu();
        }
    }

    @o0
    public a p0() {
        return o0().s();
    }

    public final void q0() {
        getSavedStateRegistry().j(f720h0, new a());
        C(new b());
    }

    public void r0(@m0 a3 a3Var) {
        a3Var.e(this);
    }

    public void s0(int i10) {
    }

    public void setContentView(@h0 int i10) {
        U();
        o0().K(i10);
    }

    public void setContentView(View view) {
        U();
        o0().L(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        U();
        o0().M(view, layoutParams);
    }

    public void setTheme(@b1 int i10) {
        super.setTheme(i10);
        o0().R(i10);
    }

    public void t0(@m0 a3 a3Var) {
    }

    @Deprecated
    public void u0() {
    }

    public boolean v0() {
        Intent w10 = w();
        if (w10 == null) {
            return false;
        }
        if (F0(w10)) {
            a3 i10 = a3.i(this);
            r0(i10);
            t0(i10);
            i10.r();
            try {
                h0.b.v(this);
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        } else {
            D0(w10);
            return true;
        }
    }

    @o0
    public Intent w() {
        return v.a(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r0 = getWindow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean w0(android.view.KeyEvent r3) {
        /*
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 >= r1) goto L_0x003e
            boolean r0 = r3.isCtrlPressed()
            if (r0 != 0) goto L_0x003e
            int r0 = r3.getMetaState()
            boolean r0 = android.view.KeyEvent.metaStateHasNoModifiers(r0)
            if (r0 != 0) goto L_0x003e
            int r0 = r3.getRepeatCount()
            if (r0 != 0) goto L_0x003e
            int r0 = r3.getKeyCode()
            boolean r0 = android.view.KeyEvent.isModifierKey(r0)
            if (r0 != 0) goto L_0x003e
            android.view.Window r0 = r2.getWindow()
            if (r0 == 0) goto L_0x003e
            android.view.View r1 = r0.getDecorView()
            if (r1 == 0) goto L_0x003e
            android.view.View r0 = r0.getDecorView()
            boolean r3 = r0.dispatchKeyShortcutEvent(r3)
            if (r3 == 0) goto L_0x003e
            r3 = 1
            return r3
        L_0x003e:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatActivity.w0(android.view.KeyEvent):boolean");
    }

    public void x0(@o0 Toolbar toolbar) {
        o0().Q(toolbar);
    }

    @Deprecated
    public void y0(int i10) {
    }

    @Deprecated
    public void z0(boolean z10) {
    }
}
