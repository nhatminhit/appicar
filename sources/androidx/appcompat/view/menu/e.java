package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import d.m0;
import d.x0;
import f1.n2;
import i0.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@x0({x0.a.Q})
public class e implements s0.a {
    public static final String L = "MenuBuilder";
    public static final String M = "android:menu:presenters";
    public static final String N = "android:menu:actionviewstates";
    public static final String O = "android:menu:expandedactionview";
    public static final int[] P = {1, 4, 5, 3, 2, 0};
    public View A;
    public boolean B = false;
    public boolean C = false;
    public boolean D = false;
    public boolean E = false;
    public boolean F = false;
    public ArrayList<h> G = new ArrayList<>();
    public CopyOnWriteArrayList<WeakReference<j>> H = new CopyOnWriteArrayList<>();
    public h I;
    public boolean J = false;
    public boolean K;

    /* renamed from: l  reason: collision with root package name */
    public final Context f949l;

    /* renamed from: m  reason: collision with root package name */
    public final Resources f950m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f951n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f952o;

    /* renamed from: p  reason: collision with root package name */
    public a f953p;

    /* renamed from: q  reason: collision with root package name */
    public ArrayList<h> f954q;

    /* renamed from: r  reason: collision with root package name */
    public ArrayList<h> f955r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f956s;

    /* renamed from: t  reason: collision with root package name */
    public ArrayList<h> f957t;

    /* renamed from: u  reason: collision with root package name */
    public ArrayList<h> f958u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f959v;

    /* renamed from: w  reason: collision with root package name */
    public int f960w = 0;

    /* renamed from: x  reason: collision with root package name */
    public ContextMenu.ContextMenuInfo f961x;

    /* renamed from: y  reason: collision with root package name */
    public CharSequence f962y;

    /* renamed from: z  reason: collision with root package name */
    public Drawable f963z;

    @x0({x0.a.Q})
    public interface a {
        boolean a(@m0 e eVar, @m0 MenuItem menuItem);

        void b(@m0 e eVar);
    }

    @x0({x0.a.Q})
    public interface b {
        boolean a(h hVar);
    }

    public e(Context context) {
        this.f949l = context;
        this.f950m = context.getResources();
        this.f954q = new ArrayList<>();
        this.f955r = new ArrayList<>();
        this.f956s = true;
        this.f957t = new ArrayList<>();
        this.f958u = new ArrayList<>();
        this.f959v = true;
        k0(true);
    }

    public static int E(int i10) {
        int i11 = (-65536 & i10) >> 16;
        if (i11 >= 0) {
            int[] iArr = P;
            if (i11 < iArr.length) {
                return (i10 & 65535) | (iArr[i11] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public static int q(ArrayList<h> arrayList, int i10) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).i() <= i10) {
                return size + 1;
            }
        }
        return 0;
    }

    public CharSequence A() {
        return this.f962y;
    }

    public View B() {
        return this.A;
    }

    public ArrayList<h> C() {
        u();
        return this.f958u;
    }

    public boolean D() {
        return this.E;
    }

    public Resources F() {
        return this.f950m;
    }

    public e G() {
        return this;
    }

    @m0
    public ArrayList<h> H() {
        if (!this.f956s) {
            return this.f955r;
        }
        this.f955r.clear();
        int size = this.f954q.size();
        for (int i10 = 0; i10 < size; i10++) {
            h hVar = this.f954q.get(i10);
            if (hVar.isVisible()) {
                this.f955r.add(hVar);
            }
        }
        this.f956s = false;
        this.f959v = true;
        return this.f955r;
    }

    public boolean I() {
        return this.J;
    }

    public boolean J() {
        return this.f951n;
    }

    public boolean K() {
        return this.f952o;
    }

    public void L(h hVar) {
        this.f959v = true;
        N(true);
    }

    public void M(h hVar) {
        this.f956s = true;
        N(true);
    }

    public void N(boolean z10) {
        if (!this.B) {
            if (z10) {
                this.f956s = true;
                this.f959v = true;
            }
            j(z10);
            return;
        }
        this.C = true;
        if (z10) {
            this.D = true;
        }
    }

    public boolean O(MenuItem menuItem, int i10) {
        return P(menuItem, (j) null, i10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if (r1 != false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        if ((r9 & 1) == 0) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0068, code lost:
        if (r1 == false) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean P(android.view.MenuItem r7, androidx.appcompat.view.menu.j r8, int r9) {
        /*
            r6 = this;
            androidx.appcompat.view.menu.h r7 = (androidx.appcompat.view.menu.h) r7
            r0 = 0
            if (r7 == 0) goto L_0x006c
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto L_0x000c
            goto L_0x006c
        L_0x000c:
            boolean r1 = r7.n()
            f1.b r2 = r7.a()
            r3 = 1
            if (r2 == 0) goto L_0x001f
            boolean r4 = r2.b()
            if (r4 == 0) goto L_0x001f
            r4 = r3
            goto L_0x0020
        L_0x001f:
            r4 = r0
        L_0x0020:
            boolean r5 = r7.m()
            if (r5 == 0) goto L_0x0031
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L_0x006b
        L_0x002d:
            r6.f(r3)
            goto L_0x006b
        L_0x0031:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L_0x003f
            if (r4 == 0) goto L_0x003a
            goto L_0x003f
        L_0x003a:
            r7 = r9 & 1
            if (r7 != 0) goto L_0x006b
            goto L_0x002d
        L_0x003f:
            r9 = r9 & 4
            if (r9 != 0) goto L_0x0046
            r6.f(r0)
        L_0x0046:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L_0x0058
            androidx.appcompat.view.menu.m r9 = new androidx.appcompat.view.menu.m
            android.content.Context r0 = r6.x()
            r9.<init>(r0, r6, r7)
            r7.A(r9)
        L_0x0058:
            android.view.SubMenu r7 = r7.getSubMenu()
            androidx.appcompat.view.menu.m r7 = (androidx.appcompat.view.menu.m) r7
            if (r4 == 0) goto L_0x0063
            r2.g(r7)
        L_0x0063:
            boolean r7 = r6.m(r7, r8)
            r1 = r1 | r7
            if (r1 != 0) goto L_0x006b
            goto L_0x002d
        L_0x006b:
            return r1
        L_0x006c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.e.P(android.view.MenuItem, androidx.appcompat.view.menu.j, int):boolean");
    }

    public void Q(int i10) {
        R(i10, true);
    }

    public final void R(int i10, boolean z10) {
        if (i10 >= 0 && i10 < this.f954q.size()) {
            this.f954q.remove(i10);
            if (z10) {
                N(true);
            }
        }
    }

    public void S(j jVar) {
        Iterator<WeakReference<j>> it = this.H.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            j jVar2 = (j) next.get();
            if (jVar2 == null || jVar2 == jVar) {
                this.H.remove(next);
            }
        }
    }

    public void T(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(w());
            int size = size();
            for (int i10 = 0; i10 < size; i10++) {
                MenuItem item = getItem(i10);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((m) item.getSubMenu()).T(bundle);
                }
            }
            int i11 = bundle.getInt(O);
            if (i11 > 0 && (findItem = findItem(i11)) != null) {
                findItem.expandActionView();
            }
        }
    }

    public void U(Bundle bundle) {
        k(bundle);
    }

    public void V(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt(O, item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((m) item.getSubMenu()).V(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(w(), sparseArray);
        }
    }

    public void W(Bundle bundle) {
        l(bundle);
    }

    public void X(a aVar) {
        this.f953p = aVar;
    }

    public void Y(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f961x = contextMenuInfo;
    }

    public e Z(int i10) {
        this.f960w = i10;
        return this;
    }

    public MenuItem a(int i10, int i11, int i12, CharSequence charSequence) {
        int E2 = E(i12);
        h h10 = h(i10, i11, i12, E2, charSequence, this.f960w);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f961x;
        if (contextMenuInfo != null) {
            h10.y(contextMenuInfo);
        }
        ArrayList<h> arrayList = this.f954q;
        arrayList.add(q(arrayList, E2), h10);
        N(true);
        return h10;
    }

    public void a0(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f954q.size();
        m0();
        for (int i10 = 0; i10 < size; i10++) {
            h hVar = this.f954q.get(i10);
            if (hVar.getGroupId() == groupId && hVar.p() && hVar.isCheckable()) {
                hVar.v(hVar == menuItem);
            }
        }
        l0();
    }

    public MenuItem add(int i10) {
        return a(0, 0, 0, this.f950m.getString(i10));
    }

    public MenuItem add(int i10, int i11, int i12, int i13) {
        return a(i10, i11, i12, this.f950m.getString(i13));
    }

    public MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return a(i10, i11, i12, charSequence);
    }

    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        PackageManager packageManager = this.f949l.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i15 = 0; i15 < size; i15++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i15);
            int i16 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i16 < 0 ? intent : intentArr[i16]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i10, i11, i12, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = intent3;
            }
        }
        return size;
    }

    public SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f950m.getString(i10));
    }

    public SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, (CharSequence) this.f950m.getString(i13));
    }

    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        h hVar = (h) a(i10, i11, i12, charSequence);
        m mVar = new m(this.f949l, this, hVar);
        hVar.A(mVar);
        return mVar;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(j jVar) {
        c(jVar, this.f949l);
    }

    public e b0(int i10) {
        d0(0, (CharSequence) null, i10, (Drawable) null, (View) null);
        return this;
    }

    public void c(j jVar, Context context) {
        this.H.add(new WeakReference(jVar));
        jVar.i(context, this);
        this.f959v = true;
    }

    public e c0(Drawable drawable) {
        d0(0, (CharSequence) null, 0, drawable, (View) null);
        return this;
    }

    public void clear() {
        h hVar = this.I;
        if (hVar != null) {
            g(hVar);
        }
        this.f954q.clear();
        N(true);
    }

    public void clearHeader() {
        this.f963z = null;
        this.f962y = null;
        this.A = null;
        N(false);
    }

    public void close() {
        f(true);
    }

    public void d() {
        a aVar = this.f953p;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    public final void d0(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        Resources F2 = F();
        if (view != null) {
            this.A = view;
            this.f962y = null;
            this.f963z = null;
        } else {
            if (i10 > 0) {
                this.f962y = F2.getText(i10);
            } else if (charSequence != null) {
                this.f962y = charSequence;
            }
            if (i11 > 0) {
                this.f963z = d.i(x(), i11);
            } else if (drawable != null) {
                this.f963z = drawable;
            }
            this.A = null;
        }
        N(false);
    }

    public void e() {
        this.B = true;
        clear();
        clearHeader();
        this.H.clear();
        this.B = false;
        this.C = false;
        this.D = false;
        N(true);
    }

    public e e0(int i10) {
        d0(i10, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }

    public final void f(boolean z10) {
        if (!this.F) {
            this.F = true;
            Iterator<WeakReference<j>> it = this.H.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                j jVar = (j) next.get();
                if (jVar == null) {
                    this.H.remove(next);
                } else {
                    jVar.b(this, z10);
                }
            }
            this.F = false;
        }
    }

    public e f0(CharSequence charSequence) {
        d0(0, charSequence, 0, (Drawable) null, (View) null);
        return this;
    }

    public MenuItem findItem(int i10) {
        MenuItem findItem;
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            h hVar = this.f954q.get(i11);
            if (hVar.getItemId() == i10) {
                return hVar;
            }
            if (hVar.hasSubMenu() && (findItem = hVar.getSubMenu().findItem(i10)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public boolean g(h hVar) {
        boolean z10 = false;
        if (!this.H.isEmpty() && this.I == hVar) {
            m0();
            Iterator<WeakReference<j>> it = this.H.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                j jVar = (j) next.get();
                if (jVar == null) {
                    this.H.remove(next);
                } else {
                    z10 = jVar.f(this, hVar);
                    if (z10) {
                        break;
                    }
                }
            }
            l0();
            if (z10) {
                this.I = null;
            }
        }
        return z10;
    }

    public e g0(View view) {
        d0(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    public MenuItem getItem(int i10) {
        return this.f954q.get(i10);
    }

    public final h h(int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        return new h(this, i10, i11, i12, i13, charSequence, i14);
    }

    public void h0(boolean z10) {
        this.E = z10;
    }

    public boolean hasVisibleItems() {
        if (this.K) {
            return true;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f954q.get(i10).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public boolean i(@m0 e eVar, @m0 MenuItem menuItem) {
        a aVar = this.f953p;
        return aVar != null && aVar.a(eVar, menuItem);
    }

    public void i0(boolean z10) {
        this.K = z10;
    }

    public boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return s(i10, keyEvent) != null;
    }

    public final void j(boolean z10) {
        if (!this.H.isEmpty()) {
            m0();
            Iterator<WeakReference<j>> it = this.H.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                j jVar = (j) next.get();
                if (jVar == null) {
                    this.H.remove(next);
                } else {
                    jVar.d(z10);
                }
            }
            l0();
        }
    }

    public void j0(boolean z10) {
        if (this.f952o != z10) {
            k0(z10);
            N(false);
        }
    }

    public final void k(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(M);
        if (sparseParcelableArray != null && !this.H.isEmpty()) {
            Iterator<WeakReference<j>> it = this.H.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                j jVar = (j) next.get();
                if (jVar == null) {
                    this.H.remove(next);
                } else {
                    int id2 = jVar.getId();
                    if (id2 > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id2)) != null) {
                        jVar.j(parcelable);
                    }
                }
            }
        }
    }

    public final void k0(boolean z10) {
        boolean z11 = true;
        if (!z10 || this.f950m.getConfiguration().keyboard == 1 || !n2.g(ViewConfiguration.get(this.f949l), this.f949l)) {
            z11 = false;
        }
        this.f952o = z11;
    }

    public final void l(Bundle bundle) {
        Parcelable n10;
        if (!this.H.isEmpty()) {
            SparseArray sparseArray = new SparseArray();
            Iterator<WeakReference<j>> it = this.H.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                j jVar = (j) next.get();
                if (jVar == null) {
                    this.H.remove(next);
                } else {
                    int id2 = jVar.getId();
                    if (id2 > 0 && (n10 = jVar.n()) != null) {
                        sparseArray.put(id2, n10);
                    }
                }
            }
            bundle.putSparseParcelableArray(M, sparseArray);
        }
    }

    public void l0() {
        this.B = false;
        if (this.C) {
            this.C = false;
            N(this.D);
        }
    }

    public final boolean m(m mVar, j jVar) {
        boolean z10 = false;
        if (this.H.isEmpty()) {
            return false;
        }
        if (jVar != null) {
            z10 = jVar.l(mVar);
        }
        Iterator<WeakReference<j>> it = this.H.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            j jVar2 = (j) next.get();
            if (jVar2 == null) {
                this.H.remove(next);
            } else if (!z10) {
                z10 = jVar2.l(mVar);
            }
        }
        return z10;
    }

    public void m0() {
        if (!this.B) {
            this.B = true;
            this.C = false;
            this.D = false;
        }
    }

    public boolean n(h hVar) {
        boolean z10 = false;
        if (this.H.isEmpty()) {
            return false;
        }
        m0();
        Iterator<WeakReference<j>> it = this.H.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            j jVar = (j) next.get();
            if (jVar == null) {
                this.H.remove(next);
            } else {
                z10 = jVar.g(this, hVar);
                if (z10) {
                    break;
                }
            }
        }
        l0();
        if (z10) {
            this.I = hVar;
        }
        return z10;
    }

    public int o(int i10) {
        return p(i10, 0);
    }

    public int p(int i10, int i11) {
        int size = size();
        if (i11 < 0) {
            i11 = 0;
        }
        while (i11 < size) {
            if (this.f954q.get(i11).getGroupId() == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    public boolean performIdentifierAction(int i10, int i11) {
        return O(findItem(i10), i11);
    }

    public boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        h s10 = s(i10, keyEvent);
        boolean O2 = s10 != null ? O(s10, i11) : false;
        if ((i11 & 2) != 0) {
            f(true);
        }
        return O2;
    }

    public int r(int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.f954q.get(i11).getItemId() == i10) {
                return i11;
            }
        }
        return -1;
    }

    public void removeGroup(int i10) {
        int o10 = o(i10);
        if (o10 >= 0) {
            int size = this.f954q.size() - o10;
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if (i11 >= size || this.f954q.get(o10).getGroupId() != i10) {
                    N(true);
                } else {
                    R(o10, false);
                    i11 = i12;
                }
            }
            N(true);
        }
    }

    public void removeItem(int i10) {
        R(r(i10), true);
    }

    public h s(int i10, KeyEvent keyEvent) {
        ArrayList<h> arrayList = this.G;
        arrayList.clear();
        t(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean J2 = J();
        for (int i11 = 0; i11 < size; i11++) {
            h hVar = arrayList.get(i11);
            char alphabeticShortcut = J2 ? hVar.getAlphabeticShortcut() : hVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (J2 && alphabeticShortcut == 8 && i10 == 67))) {
                return hVar;
            }
        }
        return null;
    }

    public void setGroupCheckable(int i10, boolean z10, boolean z11) {
        int size = this.f954q.size();
        for (int i11 = 0; i11 < size; i11++) {
            h hVar = this.f954q.get(i11);
            if (hVar.getGroupId() == i10) {
                hVar.w(z11);
                hVar.setCheckable(z10);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z10) {
        this.J = z10;
    }

    public void setGroupEnabled(int i10, boolean z10) {
        int size = this.f954q.size();
        for (int i11 = 0; i11 < size; i11++) {
            h hVar = this.f954q.get(i11);
            if (hVar.getGroupId() == i10) {
                hVar.setEnabled(z10);
            }
        }
    }

    public void setGroupVisible(int i10, boolean z10) {
        int size = this.f954q.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            h hVar = this.f954q.get(i11);
            if (hVar.getGroupId() == i10 && hVar.B(z10)) {
                z11 = true;
            }
        }
        if (z11) {
            N(true);
        }
    }

    public void setQwertyMode(boolean z10) {
        this.f951n = z10;
        N(false);
    }

    public int size() {
        return this.f954q.size();
    }

    public void t(List<h> list, int i10, KeyEvent keyEvent) {
        boolean J2 = J();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            int size = this.f954q.size();
            for (int i11 = 0; i11 < size; i11++) {
                h hVar = this.f954q.get(i11);
                if (hVar.hasSubMenu()) {
                    ((e) hVar.getSubMenu()).t(list, i10, keyEvent);
                }
                char alphabeticShortcut = J2 ? hVar.getAlphabeticShortcut() : hVar.getNumericShortcut();
                if (((modifiers & s0.a.f12614e) == ((J2 ? hVar.getAlphabeticModifiers() : hVar.getNumericModifiers()) & s0.a.f12614e)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (J2 && alphabeticShortcut == 8 && i10 == 67)) && hVar.isEnabled()) {
                        list.add(hVar);
                    }
                }
            }
        }
    }

    public void u() {
        ArrayList<h> H2 = H();
        if (this.f959v) {
            Iterator<WeakReference<j>> it = this.H.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                WeakReference next = it.next();
                j jVar = (j) next.get();
                if (jVar == null) {
                    this.H.remove(next);
                } else {
                    z10 |= jVar.e();
                }
            }
            if (z10) {
                this.f957t.clear();
                this.f958u.clear();
                int size = H2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    h hVar = H2.get(i10);
                    (hVar.o() ? this.f957t : this.f958u).add(hVar);
                }
            } else {
                this.f957t.clear();
                this.f958u.clear();
                this.f958u.addAll(H());
            }
            this.f959v = false;
        }
    }

    public ArrayList<h> v() {
        u();
        return this.f957t;
    }

    public String w() {
        return N;
    }

    public Context x() {
        return this.f949l;
    }

    public h y() {
        return this.I;
    }

    public Drawable z() {
        return this.f963z;
    }
}
