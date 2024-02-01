package k;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.widget.b0;
import androidx.appcompat.widget.w0;
import d.h0;
import d.x0;
import f.a;
import f1.e0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import l.c;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@x0({x0.a.LIBRARY_GROUP_PREFIX})
public class g extends MenuInflater {

    /* renamed from: e  reason: collision with root package name */
    public static final String f9833e = "SupportMenuInflater";

    /* renamed from: f  reason: collision with root package name */
    public static final String f9834f = "menu";

    /* renamed from: g  reason: collision with root package name */
    public static final String f9835g = "group";

    /* renamed from: h  reason: collision with root package name */
    public static final String f9836h = "item";

    /* renamed from: i  reason: collision with root package name */
    public static final int f9837i = 0;

    /* renamed from: j  reason: collision with root package name */
    public static final Class<?>[] f9838j;

    /* renamed from: k  reason: collision with root package name */
    public static final Class<?>[] f9839k;

    /* renamed from: a  reason: collision with root package name */
    public final Object[] f9840a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f9841b;

    /* renamed from: c  reason: collision with root package name */
    public Context f9842c;

    /* renamed from: d  reason: collision with root package name */
    public Object f9843d;

    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c  reason: collision with root package name */
        public static final Class<?>[] f9844c = {MenuItem.class};

        /* renamed from: a  reason: collision with root package name */
        public Object f9845a;

        /* renamed from: b  reason: collision with root package name */
        public Method f9846b;

        public a(Object obj, String str) {
            this.f9845a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f9846b = cls.getMethod(str, f9844c);
            } catch (Exception e10) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e10);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f9846b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f9846b.invoke(this.f9845a, new Object[]{menuItem})).booleanValue();
                }
                this.f9846b.invoke(this.f9845a, new Object[]{menuItem});
                return true;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public class b {
        public static final int G = 0;
        public static final int H = 0;
        public static final int I = 0;
        public static final int J = 0;
        public static final int K = 0;
        public static final boolean L = false;
        public static final boolean M = true;
        public static final boolean N = true;
        public f1.b A;
        public CharSequence B;
        public CharSequence C;
        public ColorStateList D = null;
        public PorterDuff.Mode E = null;

        /* renamed from: a  reason: collision with root package name */
        public Menu f9847a;

        /* renamed from: b  reason: collision with root package name */
        public int f9848b;

        /* renamed from: c  reason: collision with root package name */
        public int f9849c;

        /* renamed from: d  reason: collision with root package name */
        public int f9850d;

        /* renamed from: e  reason: collision with root package name */
        public int f9851e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f9852f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f9853g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f9854h;

        /* renamed from: i  reason: collision with root package name */
        public int f9855i;

        /* renamed from: j  reason: collision with root package name */
        public int f9856j;

        /* renamed from: k  reason: collision with root package name */
        public CharSequence f9857k;

        /* renamed from: l  reason: collision with root package name */
        public CharSequence f9858l;

        /* renamed from: m  reason: collision with root package name */
        public int f9859m;

        /* renamed from: n  reason: collision with root package name */
        public char f9860n;

        /* renamed from: o  reason: collision with root package name */
        public int f9861o;

        /* renamed from: p  reason: collision with root package name */
        public char f9862p;

        /* renamed from: q  reason: collision with root package name */
        public int f9863q;

        /* renamed from: r  reason: collision with root package name */
        public int f9864r;

        /* renamed from: s  reason: collision with root package name */
        public boolean f9865s;

        /* renamed from: t  reason: collision with root package name */
        public boolean f9866t;

        /* renamed from: u  reason: collision with root package name */
        public boolean f9867u;

        /* renamed from: v  reason: collision with root package name */
        public int f9868v;

        /* renamed from: w  reason: collision with root package name */
        public int f9869w;

        /* renamed from: x  reason: collision with root package name */
        public String f9870x;

        /* renamed from: y  reason: collision with root package name */
        public String f9871y;

        /* renamed from: z  reason: collision with root package name */
        public String f9872z;

        public b(Menu menu) {
            this.f9847a = menu;
            h();
        }

        public void a() {
            this.f9854h = true;
            i(this.f9847a.add(this.f9848b, this.f9855i, this.f9856j, this.f9857k));
        }

        public SubMenu b() {
            this.f9854h = true;
            SubMenu addSubMenu = this.f9847a.addSubMenu(this.f9848b, this.f9855i, this.f9856j, this.f9857k);
            i(addSubMenu.getItem());
            return addSubMenu;
        }

        public final char c(String str) {
            if (str == null) {
                return 0;
            }
            return str.charAt(0);
        }

        public boolean d() {
            return this.f9854h;
        }

        public final <T> T e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f9842c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Cannot instantiate class: ");
                sb2.append(str);
                return null;
            }
        }

        public void f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = g.this.f9842c.obtainStyledAttributes(attributeSet, a.n.MenuGroup);
            this.f9848b = obtainStyledAttributes.getResourceId(a.n.MenuGroup_android_id, 0);
            this.f9849c = obtainStyledAttributes.getInt(a.n.MenuGroup_android_menuCategory, 0);
            this.f9850d = obtainStyledAttributes.getInt(a.n.MenuGroup_android_orderInCategory, 0);
            this.f9851e = obtainStyledAttributes.getInt(a.n.MenuGroup_android_checkableBehavior, 0);
            this.f9852f = obtainStyledAttributes.getBoolean(a.n.MenuGroup_android_visible, true);
            this.f9853g = obtainStyledAttributes.getBoolean(a.n.MenuGroup_android_enabled, true);
            obtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            w0 F2 = w0.F(g.this.f9842c, attributeSet, a.n.MenuItem);
            this.f9855i = F2.u(a.n.MenuItem_android_id, 0);
            this.f9856j = (F2.o(a.n.MenuItem_android_menuCategory, this.f9849c) & s0.a.f12612c) | (F2.o(a.n.MenuItem_android_orderInCategory, this.f9850d) & 65535);
            this.f9857k = F2.x(a.n.MenuItem_android_title);
            this.f9858l = F2.x(a.n.MenuItem_android_titleCondensed);
            this.f9859m = F2.u(a.n.MenuItem_android_icon, 0);
            this.f9860n = c(F2.w(a.n.MenuItem_android_alphabeticShortcut));
            this.f9861o = F2.o(a.n.MenuItem_alphabeticModifiers, 4096);
            this.f9862p = c(F2.w(a.n.MenuItem_android_numericShortcut));
            this.f9863q = F2.o(a.n.MenuItem_numericModifiers, 4096);
            int i10 = a.n.MenuItem_android_checkable;
            this.f9864r = F2.C(i10) ? F2.a(i10, false) : this.f9851e;
            this.f9865s = F2.a(a.n.MenuItem_android_checked, false);
            this.f9866t = F2.a(a.n.MenuItem_android_visible, this.f9852f);
            this.f9867u = F2.a(a.n.MenuItem_android_enabled, this.f9853g);
            this.f9868v = F2.o(a.n.MenuItem_showAsAction, -1);
            this.f9872z = F2.w(a.n.MenuItem_android_onClick);
            this.f9869w = F2.u(a.n.MenuItem_actionLayout, 0);
            this.f9870x = F2.w(a.n.MenuItem_actionViewClass);
            String w10 = F2.w(a.n.MenuItem_actionProviderClass);
            this.f9871y = w10;
            if ((w10 != null) && this.f9869w == 0 && this.f9870x == null) {
                this.A = (f1.b) e(w10, g.f9839k, g.this.f9841b);
            } else {
                this.A = null;
            }
            this.B = F2.x(a.n.MenuItem_contentDescription);
            this.C = F2.x(a.n.MenuItem_tooltipText);
            int i11 = a.n.MenuItem_iconTintMode;
            if (F2.C(i11)) {
                this.E = b0.e(F2.o(i11, -1), this.E);
            } else {
                this.E = null;
            }
            int i12 = a.n.MenuItem_iconTint;
            if (F2.C(i12)) {
                this.D = F2.d(i12);
            } else {
                this.D = null;
            }
            F2.I();
            this.f9854h = false;
        }

        public void h() {
            this.f9848b = 0;
            this.f9849c = 0;
            this.f9850d = 0;
            this.f9851e = 0;
            this.f9852f = true;
            this.f9853g = true;
        }

        public final void i(MenuItem menuItem) {
            boolean z10 = false;
            menuItem.setChecked(this.f9865s).setVisible(this.f9866t).setEnabled(this.f9867u).setCheckable(this.f9864r >= 1).setTitleCondensed(this.f9858l).setIcon(this.f9859m);
            int i10 = this.f9868v;
            if (i10 >= 0) {
                menuItem.setShowAsAction(i10);
            }
            if (this.f9872z != null) {
                if (!g.this.f9842c.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.f9872z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f9864r >= 2) {
                if (menuItem instanceof h) {
                    ((h) menuItem).w(true);
                } else if (menuItem instanceof c) {
                    ((c) menuItem).j(true);
                }
            }
            String str = this.f9870x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f9838j, g.this.f9840a));
                z10 = true;
            }
            int i11 = this.f9869w;
            if (i11 > 0 && !z10) {
                menuItem.setActionView(i11);
            }
            f1.b bVar = this.A;
            if (bVar != null) {
                e0.l(menuItem, bVar);
            }
            e0.p(menuItem, this.B);
            e0.w(menuItem, this.C);
            e0.o(menuItem, this.f9860n, this.f9861o);
            e0.s(menuItem, this.f9862p, this.f9863q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                e0.r(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                e0.q(menuItem, colorStateList);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            f9838j = r0
            f9839k = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k.g.<clinit>():void");
    }

    public g(Context context) {
        super(context);
        this.f9842c = context;
        Object[] objArr = {context};
        this.f9840a = objArr;
        this.f9841b = objArr;
    }

    public final Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public Object b() {
        if (this.f9843d == null) {
            this.f9843d = a(this.f9842c);
        }
        return this.f9843d;
    }

    public final void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (name.equals(f9834f)) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got " + name);
                }
            }
        }
        String str = null;
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            if (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z11 && name2.equals(str)) {
                            str = null;
                            z11 = false;
                        } else if (name2.equals("group")) {
                            bVar.h();
                        } else if (name2.equals("item")) {
                            if (!bVar.d()) {
                                f1.b bVar2 = bVar.A;
                                if (bVar2 == null || !bVar2.b()) {
                                    bVar.a();
                                } else {
                                    bVar.b();
                                }
                            }
                        } else if (name2.equals(f9834f)) {
                            z10 = true;
                        }
                    }
                } else if (!z11) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        bVar.f(attributeSet);
                    } else if (name3.equals("item")) {
                        bVar.g(attributeSet);
                    } else if (name3.equals(f9834f)) {
                        c(xmlPullParser, attributeSet, bVar.b());
                    } else {
                        str = name3;
                        z11 = true;
                    }
                }
                eventType = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    public void inflate(@h0 int i10, Menu menu) {
        if (!(menu instanceof s0.a)) {
            super.inflate(i10, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.f9842c.getResources().getLayout(i10);
            c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        } catch (XmlPullParserException e10) {
            throw new InflateException("Error inflating menu XML", e10);
        } catch (IOException e11) {
            throw new InflateException("Error inflating menu XML", e11);
        } catch (Throwable th2) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th2;
        }
    }
}
