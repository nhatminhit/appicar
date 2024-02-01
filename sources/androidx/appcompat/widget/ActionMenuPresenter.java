package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionMenuView;
import d.m0;
import d.o0;
import f.a;
import f1.b;
import java.util.ArrayList;

public class ActionMenuPresenter extends androidx.appcompat.view.menu.a implements b.a {

    /* renamed from: s0  reason: collision with root package name */
    public static final String f1042s0 = "ActionMenuPresenter";
    public d Y;
    public Drawable Z;

    /* renamed from: a0  reason: collision with root package name */
    public boolean f1043a0;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f1044b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f1045c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f1046d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f1047e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f1048f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f1049g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f1050h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f1051i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f1052j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f1053k0;

    /* renamed from: l0  reason: collision with root package name */
    public final SparseBooleanArray f1054l0 = new SparseBooleanArray();

    /* renamed from: m0  reason: collision with root package name */
    public e f1055m0;

    /* renamed from: n0  reason: collision with root package name */
    public a f1056n0;

    /* renamed from: o0  reason: collision with root package name */
    public c f1057o0;

    /* renamed from: p0  reason: collision with root package name */
    public b f1058p0;

    /* renamed from: q0  reason: collision with root package name */
    public final f f1059q0 = new f();

    /* renamed from: r0  reason: collision with root package name */
    public int f1060r0;

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int O;

        public class a implements Parcelable.Creator<SavedState> {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            this.O = parcel.readInt();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.O);
        }
    }

    public class a extends i {
        public a(Context context, m mVar, View view) {
            super(context, mVar, view, false, a.c.actionOverflowMenuStyle);
            if (!((h) mVar.getItem()).o()) {
                View view2 = ActionMenuPresenter.this.Y;
                h(view2 == null ? (View) ActionMenuPresenter.this.W : view2);
            }
            a(ActionMenuPresenter.this.f1059q0);
        }

        public void g() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.f1056n0 = null;
            actionMenuPresenter.f1060r0 = 0;
            super.g();
        }
    }

    public class b extends ActionMenuItemView.b {
        public b() {
        }

        public l.f a() {
            a aVar = ActionMenuPresenter.this.f1056n0;
            if (aVar != null) {
                return aVar.e();
            }
            return null;
        }
    }

    public class c implements Runnable {
        public e O;

        public c(e eVar) {
            this.O = eVar;
        }

        public void run() {
            if (ActionMenuPresenter.this.Q != null) {
                ActionMenuPresenter.this.Q.d();
            }
            View view = (View) ActionMenuPresenter.this.W;
            if (!(view == null || view.getWindowToken() == null || !this.O.o())) {
                ActionMenuPresenter.this.f1055m0 = this.O;
            }
            ActionMenuPresenter.this.f1057o0 = null;
        }
    }

    public class d extends AppCompatImageView implements ActionMenuView.a {

        public class a extends e0 {
            public final /* synthetic */ ActionMenuPresenter X;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(View view, ActionMenuPresenter actionMenuPresenter) {
                super(view);
                this.X = actionMenuPresenter;
            }

            public l.f b() {
                e eVar = ActionMenuPresenter.this.f1055m0;
                if (eVar == null) {
                    return null;
                }
                return eVar.e();
            }

            public boolean c() {
                ActionMenuPresenter.this.Q();
                return true;
            }

            public boolean d() {
                ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                if (actionMenuPresenter.f1057o0 != null) {
                    return false;
                }
                actionMenuPresenter.E();
                return true;
            }
        }

        public d(Context context) {
            super(context, (AttributeSet) null, a.c.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            z0.a(this, getContentDescription());
            setOnTouchListener(new a(this, ActionMenuPresenter.this));
        }

        public boolean a() {
            return false;
        }

        public boolean c() {
            return false;
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.Q();
            return true;
        }

        public boolean setFrame(int i10, int i11, int i12, int i13) {
            boolean frame = super.setFrame(i10, i11, i12, i13);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                o0.d.l(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    public class e extends i {
        public e(Context context, androidx.appcompat.view.menu.e eVar, View view, boolean z10) {
            super(context, eVar, view, z10, a.c.actionOverflowMenuStyle);
            j(8388613);
            a(ActionMenuPresenter.this.f1059q0);
        }

        public void g() {
            if (ActionMenuPresenter.this.Q != null) {
                ActionMenuPresenter.this.Q.close();
            }
            ActionMenuPresenter.this.f1055m0 = null;
            super.g();
        }
    }

    public class f implements j.a {
        public f() {
        }

        public void b(@m0 androidx.appcompat.view.menu.e eVar, boolean z10) {
            if (eVar instanceof m) {
                eVar.G().f(false);
            }
            j.a q10 = ActionMenuPresenter.this.q();
            if (q10 != null) {
                q10.b(eVar, z10);
            }
        }

        public boolean c(@m0 androidx.appcompat.view.menu.e eVar) {
            if (eVar == ActionMenuPresenter.this.Q) {
                return false;
            }
            ActionMenuPresenter.this.f1060r0 = ((m) eVar).getItem().getItemId();
            j.a q10 = ActionMenuPresenter.this.q();
            if (q10 != null) {
                return q10.c(eVar);
            }
            return false;
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, a.k.abc_action_menu_layout, a.k.abc_action_menu_item_layout);
    }

    public boolean B() {
        return E() | F();
    }

    public final View C(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.W;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof k.a) && ((k.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public Drawable D() {
        d dVar = this.Y;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f1043a0) {
            return this.Z;
        }
        return null;
    }

    public boolean E() {
        k kVar;
        c cVar = this.f1057o0;
        if (cVar == null || (kVar = this.W) == null) {
            e eVar = this.f1055m0;
            if (eVar == null) {
                return false;
            }
            eVar.dismiss();
            return true;
        }
        ((View) kVar).removeCallbacks(cVar);
        this.f1057o0 = null;
        return true;
    }

    public boolean F() {
        a aVar = this.f1056n0;
        if (aVar == null) {
            return false;
        }
        aVar.dismiss();
        return true;
    }

    public boolean G() {
        return this.f1057o0 != null || H();
    }

    public boolean H() {
        e eVar = this.f1055m0;
        return eVar != null && eVar.f();
    }

    public boolean I() {
        return this.f1044b0;
    }

    public void J(Configuration configuration) {
        if (!this.f1049g0) {
            this.f1048f0 = k.a.b(this.P).d();
        }
        androidx.appcompat.view.menu.e eVar = this.Q;
        if (eVar != null) {
            eVar.N(true);
        }
    }

    public void K(boolean z10) {
        this.f1052j0 = z10;
    }

    public void L(int i10) {
        this.f1048f0 = i10;
        this.f1049g0 = true;
    }

    public void M(ActionMenuView actionMenuView) {
        this.W = actionMenuView;
        actionMenuView.e(this.Q);
    }

    public void N(Drawable drawable) {
        d dVar = this.Y;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        this.f1043a0 = true;
        this.Z = drawable;
    }

    public void O(boolean z10) {
        this.f1044b0 = z10;
        this.f1045c0 = true;
    }

    public void P(int i10, boolean z10) {
        this.f1046d0 = i10;
        this.f1050h0 = z10;
        this.f1051i0 = true;
    }

    public boolean Q() {
        androidx.appcompat.view.menu.e eVar;
        if (!this.f1044b0 || H() || (eVar = this.Q) == null || this.W == null || this.f1057o0 != null || eVar.C().isEmpty()) {
            return false;
        }
        c cVar = new c(new e(this.P, this.Q, this.Y, true));
        this.f1057o0 = cVar;
        ((View) this.W).post(cVar);
        return true;
    }

    public void a(boolean z10) {
        if (z10) {
            super.l((m) null);
            return;
        }
        androidx.appcompat.view.menu.e eVar = this.Q;
        if (eVar != null) {
            eVar.f(false);
        }
    }

    public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
        B();
        super.b(eVar, z10);
    }

    public void d(boolean z10) {
        k kVar;
        super.d(z10);
        ((View) this.W).requestLayout();
        androidx.appcompat.view.menu.e eVar = this.Q;
        boolean z11 = false;
        if (eVar != null) {
            ArrayList<h> v10 = eVar.v();
            int size = v10.size();
            for (int i10 = 0; i10 < size; i10++) {
                f1.b a10 = v10.get(i10).a();
                if (a10 != null) {
                    a10.k(this);
                }
            }
        }
        androidx.appcompat.view.menu.e eVar2 = this.Q;
        ArrayList<h> C = eVar2 != null ? eVar2.C() : null;
        if (this.f1044b0 && C != null) {
            int size2 = C.size();
            if (size2 == 1) {
                z11 = !C.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z11 = true;
            }
        }
        d dVar = this.Y;
        if (z11) {
            if (dVar == null) {
                this.Y = new d(this.O);
            }
            ViewGroup viewGroup = (ViewGroup) this.Y.getParent();
            if (viewGroup != this.W) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.Y);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.W;
                actionMenuView.addView(this.Y, actionMenuView.H());
            }
        } else if (dVar != null && dVar.getParent() == (kVar = this.W)) {
            ((ViewGroup) kVar).removeView(this.Y);
        }
        ((ActionMenuView) this.W).setOverflowReserved(this.f1044b0);
    }

    public boolean e() {
        int i10;
        ArrayList<h> arrayList;
        int i11;
        int i12;
        int i13;
        boolean z10;
        ActionMenuPresenter actionMenuPresenter = this;
        androidx.appcompat.view.menu.e eVar = actionMenuPresenter.Q;
        View view = null;
        boolean z11 = false;
        if (eVar != null) {
            arrayList = eVar.H();
            i10 = arrayList.size();
        } else {
            arrayList = null;
            i10 = 0;
        }
        int i14 = actionMenuPresenter.f1048f0;
        int i15 = actionMenuPresenter.f1047e0;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.W;
        boolean z12 = false;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < i10; i18++) {
            h hVar = arrayList.get(i18);
            if (hVar.d()) {
                i16++;
            } else if (hVar.q()) {
                i17++;
            } else {
                z12 = true;
            }
            if (actionMenuPresenter.f1052j0 && hVar.isActionViewExpanded()) {
                i14 = 0;
            }
        }
        if (actionMenuPresenter.f1044b0 && (z12 || i17 + i16 > i14)) {
            i14--;
        }
        int i19 = i14 - i16;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.f1054l0;
        sparseBooleanArray.clear();
        if (actionMenuPresenter.f1050h0) {
            int i20 = actionMenuPresenter.f1053k0;
            i11 = i15 / i20;
            i12 = i20 + ((i15 % i20) / i11);
        } else {
            i12 = 0;
            i11 = 0;
        }
        int i21 = 0;
        int i22 = 0;
        while (i21 < i10) {
            h hVar2 = arrayList.get(i21);
            if (hVar2.d()) {
                View r10 = actionMenuPresenter.r(hVar2, view, viewGroup);
                if (actionMenuPresenter.f1050h0) {
                    i11 -= ActionMenuView.N(r10, i12, i11, makeMeasureSpec, z11 ? 1 : 0);
                } else {
                    r10.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = r10.getMeasuredWidth();
                i15 -= measuredWidth;
                if (i22 == 0) {
                    i22 = measuredWidth;
                }
                int groupId = hVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                hVar2.x(true);
                z10 = z11;
                i13 = i10;
            } else if (hVar2.q()) {
                int groupId2 = hVar2.getGroupId();
                boolean z13 = sparseBooleanArray.get(groupId2);
                boolean z14 = (i19 > 0 || z13) && i15 > 0 && (!actionMenuPresenter.f1050h0 || i11 > 0);
                boolean z15 = z14;
                i13 = i10;
                if (z14) {
                    View r11 = actionMenuPresenter.r(hVar2, (View) null, viewGroup);
                    if (actionMenuPresenter.f1050h0) {
                        int N = ActionMenuView.N(r11, i12, i11, makeMeasureSpec, 0);
                        i11 -= N;
                        if (N == 0) {
                            z15 = false;
                        }
                    } else {
                        r11.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z16 = z15;
                    int measuredWidth2 = r11.getMeasuredWidth();
                    i15 -= measuredWidth2;
                    if (i22 == 0) {
                        i22 = measuredWidth2;
                    }
                    z14 = z16 & (!actionMenuPresenter.f1050h0 ? i15 + i22 > 0 : i15 >= 0);
                }
                if (z14 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z13) {
                    sparseBooleanArray.put(groupId2, false);
                    int i23 = 0;
                    while (i23 < i21) {
                        h hVar3 = arrayList.get(i23);
                        if (hVar3.getGroupId() == groupId2) {
                            if (hVar3.o()) {
                                i19++;
                            }
                            hVar3.x(false);
                        }
                        i23++;
                    }
                }
                if (z14) {
                    i19--;
                }
                hVar2.x(z14);
                z10 = false;
            } else {
                z10 = z11;
                i13 = i10;
                hVar2.x(z10);
            }
            i21++;
            z11 = z10;
            i10 = i13;
            view = null;
            actionMenuPresenter = this;
        }
        return true;
    }

    public void i(@m0 Context context, @o0 androidx.appcompat.view.menu.e eVar) {
        super.i(context, eVar);
        Resources resources = context.getResources();
        k.a b10 = k.a.b(context);
        if (!this.f1045c0) {
            this.f1044b0 = b10.h();
        }
        if (!this.f1051i0) {
            this.f1046d0 = b10.c();
        }
        if (!this.f1049g0) {
            this.f1048f0 = b10.d();
        }
        int i10 = this.f1046d0;
        if (this.f1044b0) {
            if (this.Y == null) {
                d dVar = new d(this.O);
                this.Y = dVar;
                if (this.f1043a0) {
                    dVar.setImageDrawable(this.Z);
                    this.Z = null;
                    this.f1043a0 = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.Y.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i10 -= this.Y.getMeasuredWidth();
        } else {
            this.Y = null;
        }
        this.f1047e0 = i10;
        this.f1053k0 = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    public void j(Parcelable parcelable) {
        int i10;
        MenuItem findItem;
        if ((parcelable instanceof SavedState) && (i10 = ((SavedState) parcelable).O) > 0 && (findItem = this.Q.findItem(i10)) != null) {
            l((m) findItem.getSubMenu());
        }
    }

    public void k(h hVar, k.a aVar) {
        aVar.g(hVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.W);
        if (this.f1058p0 == null) {
            this.f1058p0 = new b();
        }
        actionMenuItemView.setPopupCallback(this.f1058p0);
    }

    public boolean l(m mVar) {
        boolean z10 = false;
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        m mVar2 = mVar;
        while (mVar2.n0() != this.Q) {
            mVar2 = (m) mVar2.n0();
        }
        View C = C(mVar2.getItem());
        if (C == null) {
            return false;
        }
        this.f1060r0 = mVar.getItem().getItemId();
        int size = mVar.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            MenuItem item = mVar.getItem(i10);
            if (item.isVisible() && item.getIcon() != null) {
                z10 = true;
                break;
            }
            i10++;
        }
        a aVar = new a(this.P, mVar, C);
        this.f1056n0 = aVar;
        aVar.i(z10);
        this.f1056n0.l();
        super.l(mVar);
        return true;
    }

    public k m(ViewGroup viewGroup) {
        k kVar = this.W;
        k m10 = super.m(viewGroup);
        if (kVar != m10) {
            ((ActionMenuView) m10).setPresenter(this);
        }
        return m10;
    }

    public Parcelable n() {
        SavedState savedState = new SavedState();
        savedState.O = this.f1060r0;
        return savedState;
    }

    public boolean p(ViewGroup viewGroup, int i10) {
        if (viewGroup.getChildAt(i10) == this.Y) {
            return false;
        }
        return super.p(viewGroup, i10);
    }

    public View r(h hVar, View view, ViewGroup viewGroup) {
        View actionView = hVar.getActionView();
        if (actionView == null || hVar.m()) {
            actionView = super.r(hVar, view, viewGroup);
        }
        actionView.setVisibility(hVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.o(layoutParams));
        }
        return actionView;
    }

    public boolean t(int i10, h hVar) {
        return hVar.o();
    }
}
