package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.h;
import d.m0;
import d.o0;
import d.x0;
import java.lang.reflect.Method;

@x0({x0.a.Q})
public class MenuPopupWindow extends i0 implements j0 {
    public static final String I0 = "MenuPopupWindow";
    public static Method J0;
    public j0 H0;

    @x0({x0.a.Q})
    public static class MenuDropDownListView extends c0 {

        /* renamed from: h0  reason: collision with root package name */
        public final int f1113h0;

        /* renamed from: i0  reason: collision with root package name */
        public final int f1114i0;

        /* renamed from: j0  reason: collision with root package name */
        public j0 f1115j0;

        /* renamed from: k0  reason: collision with root package name */
        public MenuItem f1116k0;

        public MenuDropDownListView(Context context, boolean z10) {
            super(context, z10);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.f1113h0 = 21;
                this.f1114i0 = 22;
                return;
            }
            this.f1113h0 = 22;
            this.f1114i0 = 21;
        }

        public /* bridge */ /* synthetic */ int d(int i10, boolean z10) {
            return super.d(i10, z10);
        }

        public /* bridge */ /* synthetic */ int e(int i10, int i11, int i12, int i13, int i14) {
            return super.e(i10, i11, i12, i13, i14);
        }

        public /* bridge */ /* synthetic */ boolean f(MotionEvent motionEvent, int i10) {
            return super.f(motionEvent, i10);
        }

        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        public void m() {
            setSelection(-1);
        }

        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i10;
            int pointToPosition;
            int i11;
            if (this.f1115j0 != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i10 = headerViewListAdapter.getHeadersCount();
                    adapter = headerViewListAdapter.getWrappedAdapter();
                } else {
                    i10 = 0;
                }
                d dVar = (d) adapter;
                h hVar = null;
                if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i11 = pointToPosition - i10) >= 0 && i11 < dVar.getCount()) {
                    hVar = dVar.getItem(i11);
                }
                MenuItem menuItem = this.f1116k0;
                if (menuItem != hVar) {
                    e b10 = dVar.b();
                    if (menuItem != null) {
                        this.f1115j0.h(b10, menuItem);
                    }
                    this.f1116k0 = hVar;
                    if (hVar != null) {
                        this.f1115j0.e(b10, hVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        public boolean onKeyDown(int i10, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i10 == this.f1113h0) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i10 != this.f1114i0) {
                return super.onKeyDown(i10, keyEvent);
            } else {
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
                }
                ((d) adapter).b().f(false);
                return true;
            }
        }

        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(j0 j0Var) {
            this.f1115j0 = j0Var;
        }

        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                J0 = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    public MenuPopupWindow(@m0 Context context, @o0 AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    public void e(@m0 e eVar, @m0 MenuItem menuItem) {
        j0 j0Var = this.H0;
        if (j0Var != null) {
            j0Var.e(eVar, menuItem);
        }
    }

    public void h(@m0 e eVar, @m0 MenuItem menuItem) {
        j0 j0Var = this.H0;
        if (j0Var != null) {
            j0Var.h(eVar, menuItem);
        }
    }

    public void p0(Object obj) {
        this.f1338t0.setEnterTransition((Transition) obj);
    }

    public void q0(Object obj) {
        this.f1338t0.setExitTransition((Transition) obj);
    }

    public void r0(j0 j0Var) {
        this.H0 = j0Var;
    }

    public void s0(boolean z10) {
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = J0;
            if (method != null) {
                try {
                    method.invoke(this.f1338t0, new Object[]{Boolean.valueOf(z10)});
                } catch (Exception unused) {
                }
            }
        } else {
            this.f1338t0.setTouchModal(z10);
        }
    }

    @m0
    public c0 u(Context context, boolean z10) {
        MenuDropDownListView menuDropDownListView = new MenuDropDownListView(context, z10);
        menuDropDownListView.setHoverListener(this);
        return menuDropDownListView;
    }
}
