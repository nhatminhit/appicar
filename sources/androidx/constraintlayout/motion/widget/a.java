package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.d;
import androidx.constraintlayout.widget.e;
import androidx.constraintlayout.widget.f;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import u.c;
import v.j;
import v.p;

public class a {
    public static final int A = -1;
    public static final int B = 0;
    public static final int C = 1;
    public static final int D = 0;
    public static final int E = 1;
    public static final int F = 2;
    public static final int G = 3;
    public static final int H = 4;
    public static final int I = 5;

    /* renamed from: u  reason: collision with root package name */
    public static final String f1658u = "MotionScene";

    /* renamed from: v  reason: collision with root package name */
    public static final boolean f1659v = false;

    /* renamed from: w  reason: collision with root package name */
    public static final int f1660w = 0;

    /* renamed from: x  reason: collision with root package name */
    public static final int f1661x = 1;

    /* renamed from: y  reason: collision with root package name */
    public static final int f1662y = -1;

    /* renamed from: z  reason: collision with root package name */
    public static final int f1663z = -2;

    /* renamed from: a  reason: collision with root package name */
    public final MotionLayout f1664a;

    /* renamed from: b  reason: collision with root package name */
    public f f1665b = null;

    /* renamed from: c  reason: collision with root package name */
    public b f1666c = null;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1667d = false;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList<b> f1668e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public b f1669f = null;

    /* renamed from: g  reason: collision with root package name */
    public ArrayList<b> f1670g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    public SparseArray<d> f1671h = new SparseArray<>();

    /* renamed from: i  reason: collision with root package name */
    public HashMap<String, Integer> f1672i = new HashMap<>();

    /* renamed from: j  reason: collision with root package name */
    public SparseIntArray f1673j = new SparseIntArray();

    /* renamed from: k  reason: collision with root package name */
    public boolean f1674k = false;

    /* renamed from: l  reason: collision with root package name */
    public int f1675l = 400;

    /* renamed from: m  reason: collision with root package name */
    public int f1676m = 0;

    /* renamed from: n  reason: collision with root package name */
    public MotionEvent f1677n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f1678o = false;

    /* renamed from: p  reason: collision with root package name */
    public boolean f1679p = false;

    /* renamed from: q  reason: collision with root package name */
    public MotionLayout.f f1680q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f1681r;

    /* renamed from: s  reason: collision with root package name */
    public float f1682s;

    /* renamed from: t  reason: collision with root package name */
    public float f1683t;

    /* renamed from: androidx.constraintlayout.motion.widget.a$a  reason: collision with other inner class name */
    public class C0025a implements Interpolator {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f1684a;

        public C0025a(c cVar) {
            this.f1684a = cVar;
        }

        public float getInterpolation(float f10) {
            return (float) this.f1684a.a((double) f10);
        }
    }

    public static class b {

        /* renamed from: s  reason: collision with root package name */
        public static final int f1686s = 0;

        /* renamed from: t  reason: collision with root package name */
        public static final int f1687t = 1;

        /* renamed from: u  reason: collision with root package name */
        public static final int f1688u = 2;

        /* renamed from: v  reason: collision with root package name */
        public static final int f1689v = 3;

        /* renamed from: w  reason: collision with root package name */
        public static final int f1690w = 4;

        /* renamed from: x  reason: collision with root package name */
        public static final int f1691x = 1;

        /* renamed from: a  reason: collision with root package name */
        public int f1692a = -1;

        /* renamed from: b  reason: collision with root package name */
        public boolean f1693b = false;

        /* renamed from: c  reason: collision with root package name */
        public int f1694c = -1;

        /* renamed from: d  reason: collision with root package name */
        public int f1695d = -1;

        /* renamed from: e  reason: collision with root package name */
        public int f1696e = 0;

        /* renamed from: f  reason: collision with root package name */
        public String f1697f = null;

        /* renamed from: g  reason: collision with root package name */
        public int f1698g = -1;

        /* renamed from: h  reason: collision with root package name */
        public int f1699h = 400;

        /* renamed from: i  reason: collision with root package name */
        public float f1700i = 0.0f;

        /* renamed from: j  reason: collision with root package name */
        public final a f1701j;

        /* renamed from: k  reason: collision with root package name */
        public ArrayList<j> f1702k = new ArrayList<>();

        /* renamed from: l  reason: collision with root package name */
        public b f1703l = null;

        /* renamed from: m  reason: collision with root package name */
        public ArrayList<C0026a> f1704m = new ArrayList<>();

        /* renamed from: n  reason: collision with root package name */
        public int f1705n = 0;

        /* renamed from: o  reason: collision with root package name */
        public boolean f1706o = false;

        /* renamed from: p  reason: collision with root package name */
        public int f1707p = -1;

        /* renamed from: q  reason: collision with root package name */
        public int f1708q = 0;

        /* renamed from: r  reason: collision with root package name */
        public int f1709r = 0;

        /* renamed from: androidx.constraintlayout.motion.widget.a$b$a  reason: collision with other inner class name */
        public static class C0026a implements View.OnClickListener {
            public static final int R = 1;
            public static final int S = 17;
            public static final int T = 16;
            public static final int U = 256;
            public static final int V = 4096;
            public final b O;
            public int P = -1;
            public int Q = 17;

            public C0026a(Context context, b bVar, XmlPullParser xmlPullParser) {
                this.O = bVar;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), e.m.OnClick);
                int indexCount = obtainStyledAttributes.getIndexCount();
                for (int i10 = 0; i10 < indexCount; i10++) {
                    int index = obtainStyledAttributes.getIndex(i10);
                    if (index == e.m.OnClick_targetId) {
                        this.P = obtainStyledAttributes.getResourceId(index, this.P);
                    } else if (index == e.m.OnClick_clickAction) {
                        this.Q = obtainStyledAttributes.getInt(index, this.Q);
                    }
                }
                obtainStyledAttributes.recycle();
            }

            public void a(MotionLayout motionLayout, int i10, b bVar) {
                int i11 = this.P;
                View view = motionLayout;
                if (i11 != -1) {
                    view = motionLayout.findViewById(i11);
                }
                if (view == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("OnClick could not find id ");
                    sb2.append(this.P);
                    return;
                }
                int c10 = bVar.f1695d;
                int a10 = bVar.f1694c;
                if (c10 == -1) {
                    view.setOnClickListener(this);
                    return;
                }
                int i12 = this.Q;
                boolean z10 = false;
                boolean z11 = ((i12 & 1) != 0 && i10 == c10) | ((i12 & 1) != 0 && i10 == c10) | ((i12 & 256) != 0 && i10 == c10) | ((i12 & 16) != 0 && i10 == a10);
                if ((i12 & 4096) != 0 && i10 == a10) {
                    z10 = true;
                }
                if (z11 || z10) {
                    view.setOnClickListener(this);
                }
            }

            public boolean b(b bVar, MotionLayout motionLayout) {
                b bVar2 = this.O;
                if (bVar2 == bVar) {
                    return true;
                }
                int a10 = bVar2.f1694c;
                int c10 = this.O.f1695d;
                int i10 = motionLayout.B0;
                return c10 == -1 ? i10 != a10 : i10 == c10 || i10 == a10;
            }

            public void c(MotionLayout motionLayout) {
                int i10 = this.P;
                if (i10 != -1) {
                    View findViewById = motionLayout.findViewById(i10);
                    if (findViewById == null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(" (*)  could not find id ");
                        sb2.append(this.P);
                        return;
                    }
                    findViewById.setOnClickListener((View.OnClickListener) null);
                }
            }

            /* JADX WARNING: Removed duplicated region for block: B:39:0x00a3  */
            /* JADX WARNING: Removed duplicated region for block: B:56:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onClick(android.view.View r8) {
                /*
                    r7 = this;
                    androidx.constraintlayout.motion.widget.a$b r8 = r7.O
                    androidx.constraintlayout.motion.widget.a r8 = r8.f1701j
                    androidx.constraintlayout.motion.widget.MotionLayout r8 = r8.f1664a
                    boolean r0 = r8.z0()
                    if (r0 != 0) goto L_0x0011
                    return
                L_0x0011:
                    androidx.constraintlayout.motion.widget.a$b r0 = r7.O
                    int r0 = r0.f1695d
                    r1 = -1
                    if (r0 != r1) goto L_0x004a
                    int r0 = r8.getCurrentState()
                    if (r0 != r1) goto L_0x002a
                    androidx.constraintlayout.motion.widget.a$b r0 = r7.O
                    int r0 = r0.f1694c
                    r8.N0(r0)
                    return
                L_0x002a:
                    androidx.constraintlayout.motion.widget.a$b r1 = new androidx.constraintlayout.motion.widget.a$b
                    androidx.constraintlayout.motion.widget.a$b r2 = r7.O
                    androidx.constraintlayout.motion.widget.a r2 = r2.f1701j
                    androidx.constraintlayout.motion.widget.a$b r3 = r7.O
                    r1.<init>(r2, r3)
                    int unused = r1.f1695d = r0
                    androidx.constraintlayout.motion.widget.a$b r0 = r7.O
                    int r0 = r0.f1694c
                    int unused = r1.f1694c = r0
                    r8.setTransition((androidx.constraintlayout.motion.widget.a.b) r1)
                    r8.L0()
                    return
                L_0x004a:
                    androidx.constraintlayout.motion.widget.a$b r0 = r7.O
                    androidx.constraintlayout.motion.widget.a r0 = r0.f1701j
                    androidx.constraintlayout.motion.widget.a$b r0 = r0.f1666c
                    int r1 = r7.Q
                    r2 = r1 & 1
                    r3 = 0
                    r4 = 1
                    if (r2 != 0) goto L_0x0061
                    r2 = r1 & 256(0x100, float:3.59E-43)
                    if (r2 == 0) goto L_0x005f
                    goto L_0x0061
                L_0x005f:
                    r2 = r3
                    goto L_0x0062
                L_0x0061:
                    r2 = r4
                L_0x0062:
                    r5 = r1 & 16
                    if (r5 != 0) goto L_0x006d
                    r1 = r1 & 4096(0x1000, float:5.74E-42)
                    if (r1 == 0) goto L_0x006b
                    goto L_0x006d
                L_0x006b:
                    r1 = r3
                    goto L_0x006e
                L_0x006d:
                    r1 = r4
                L_0x006e:
                    if (r2 == 0) goto L_0x0074
                    if (r1 == 0) goto L_0x0074
                    r5 = r4
                    goto L_0x0075
                L_0x0074:
                    r5 = r3
                L_0x0075:
                    if (r5 == 0) goto L_0x009c
                    androidx.constraintlayout.motion.widget.a$b r5 = r7.O
                    androidx.constraintlayout.motion.widget.a r5 = r5.f1701j
                    androidx.constraintlayout.motion.widget.a$b r5 = r5.f1666c
                    androidx.constraintlayout.motion.widget.a$b r6 = r7.O
                    if (r5 == r6) goto L_0x0086
                    r8.setTransition((androidx.constraintlayout.motion.widget.a.b) r6)
                L_0x0086:
                    int r5 = r8.getCurrentState()
                    int r6 = r8.getEndState()
                    if (r5 == r6) goto L_0x009d
                    float r5 = r8.getProgress()
                    r6 = 1056964608(0x3f000000, float:0.5)
                    int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
                    if (r5 <= 0) goto L_0x009b
                    goto L_0x009d
                L_0x009b:
                    r1 = r3
                L_0x009c:
                    r3 = r2
                L_0x009d:
                    boolean r0 = r7.b(r0, r8)
                    if (r0 == 0) goto L_0x00e6
                    if (r3 == 0) goto L_0x00b3
                    int r0 = r7.Q
                    r0 = r0 & r4
                    if (r0 == 0) goto L_0x00b3
                    androidx.constraintlayout.motion.widget.a$b r0 = r7.O
                    r8.setTransition((androidx.constraintlayout.motion.widget.a.b) r0)
                    r8.L0()
                    goto L_0x00e6
                L_0x00b3:
                    if (r1 == 0) goto L_0x00c4
                    int r0 = r7.Q
                    r0 = r0 & 16
                    if (r0 == 0) goto L_0x00c4
                    androidx.constraintlayout.motion.widget.a$b r0 = r7.O
                    r8.setTransition((androidx.constraintlayout.motion.widget.a.b) r0)
                    r8.M0()
                    goto L_0x00e6
                L_0x00c4:
                    if (r3 == 0) goto L_0x00d7
                    int r0 = r7.Q
                    r0 = r0 & 256(0x100, float:3.59E-43)
                    if (r0 == 0) goto L_0x00d7
                    androidx.constraintlayout.motion.widget.a$b r0 = r7.O
                    r8.setTransition((androidx.constraintlayout.motion.widget.a.b) r0)
                    r0 = 1065353216(0x3f800000, float:1.0)
                L_0x00d3:
                    r8.setProgress(r0)
                    goto L_0x00e6
                L_0x00d7:
                    if (r1 == 0) goto L_0x00e6
                    int r0 = r7.Q
                    r0 = r0 & 4096(0x1000, float:5.74E-42)
                    if (r0 == 0) goto L_0x00e6
                    androidx.constraintlayout.motion.widget.a$b r0 = r7.O
                    r8.setTransition((androidx.constraintlayout.motion.widget.a.b) r0)
                    r0 = 0
                    goto L_0x00d3
                L_0x00e6:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.a.b.C0026a.onClick(android.view.View):void");
            }
        }

        public b(int i10, a aVar, int i11, int i12) {
            this.f1692a = i10;
            this.f1701j = aVar;
            this.f1695d = i11;
            this.f1694c = i12;
            this.f1699h = aVar.f1675l;
            this.f1708q = aVar.f1676m;
        }

        public b(a aVar, Context context, XmlPullParser xmlPullParser) {
            this.f1699h = aVar.f1675l;
            this.f1708q = aVar.f1676m;
            this.f1701j = aVar;
            w(aVar, context, Xml.asAttributeSet(xmlPullParser));
        }

        public b(a aVar, b bVar) {
            this.f1701j = aVar;
            if (bVar != null) {
                this.f1707p = bVar.f1707p;
                this.f1696e = bVar.f1696e;
                this.f1697f = bVar.f1697f;
                this.f1698g = bVar.f1698g;
                this.f1699h = bVar.f1699h;
                this.f1702k = bVar.f1702k;
                this.f1700i = bVar.f1700i;
                this.f1708q = bVar.f1708q;
            }
        }

        public int A() {
            return this.f1692a;
        }

        public List<j> B() {
            return this.f1702k;
        }

        public int C() {
            return this.f1708q;
        }

        public List<C0026a> D() {
            return this.f1704m;
        }

        public int E() {
            return this.f1707p;
        }

        public float F() {
            return this.f1700i;
        }

        public int G() {
            return this.f1695d;
        }

        public b H() {
            return this.f1703l;
        }

        public boolean I() {
            return !this.f1706o;
        }

        public boolean J(int i10) {
            return (i10 & this.f1709r) != 0;
        }

        public void K(int i10) {
            this.f1705n = i10;
        }

        public void L(int i10) {
            this.f1699h = i10;
        }

        public void M(boolean z10) {
            this.f1706o = !z10;
        }

        public void N(int i10) {
            this.f1707p = i10;
        }

        public void O(float f10) {
            this.f1700i = f10;
        }

        public void t(Context context, XmlPullParser xmlPullParser) {
            this.f1704m.add(new C0026a(context, this, xmlPullParser));
        }

        public String u(Context context) {
            String resourceEntryName = this.f1695d == -1 ? "null" : context.getResources().getResourceEntryName(this.f1695d);
            if (this.f1694c == -1) {
                return resourceEntryName + " -> null";
            }
            return resourceEntryName + " -> " + context.getResources().getResourceEntryName(this.f1694c);
        }

        public final void v(a aVar, Context context, TypedArray typedArray) {
            d dVar;
            SparseArray b10;
            int i10;
            int indexCount = typedArray.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArray.getIndex(i11);
                if (index == e.m.Transition_constraintSetEnd) {
                    this.f1694c = typedArray.getResourceId(index, this.f1694c);
                    if (n7.b.f10954v.equals(context.getResources().getResourceTypeName(this.f1694c))) {
                        dVar = new d();
                        dVar.n0(context, this.f1694c);
                        b10 = aVar.f1671h;
                        i10 = this.f1694c;
                    }
                } else {
                    if (index == e.m.Transition_constraintSetStart) {
                        this.f1695d = typedArray.getResourceId(index, this.f1695d);
                        if (n7.b.f10954v.equals(context.getResources().getResourceTypeName(this.f1695d))) {
                            dVar = new d();
                            dVar.n0(context, this.f1695d);
                            b10 = aVar.f1671h;
                            i10 = this.f1695d;
                        }
                    } else if (index == e.m.Transition_motionInterpolator) {
                        int i12 = typedArray.peekValue(index).type;
                        if (i12 == 1) {
                            int resourceId = typedArray.getResourceId(index, -1);
                            this.f1698g = resourceId;
                            if (resourceId == -1) {
                            }
                        } else if (i12 == 3) {
                            String string = typedArray.getString(index);
                            this.f1697f = string;
                            if (string.indexOf("/") > 0) {
                                this.f1698g = typedArray.getResourceId(index, -1);
                            } else {
                                this.f1696e = -1;
                            }
                        } else {
                            this.f1696e = typedArray.getInteger(index, this.f1696e);
                        }
                        this.f1696e = -2;
                    } else if (index == e.m.Transition_duration) {
                        this.f1699h = typedArray.getInt(index, this.f1699h);
                    } else if (index == e.m.Transition_staggered) {
                        this.f1700i = typedArray.getFloat(index, this.f1700i);
                    } else if (index == e.m.Transition_autoTransition) {
                        this.f1705n = typedArray.getInteger(index, this.f1705n);
                    } else if (index == e.m.Transition_android_id) {
                        this.f1692a = typedArray.getResourceId(index, this.f1692a);
                    } else if (index == e.m.Transition_transitionDisable) {
                        this.f1706o = typedArray.getBoolean(index, this.f1706o);
                    } else if (index == e.m.Transition_pathMotionArc) {
                        this.f1707p = typedArray.getInteger(index, -1);
                    } else if (index == e.m.Transition_layoutDuringTransition) {
                        this.f1708q = typedArray.getInteger(index, 0);
                    } else if (index == e.m.Transition_transitionFlags) {
                        this.f1709r = typedArray.getInteger(index, 0);
                    }
                }
                b10.append(i10, dVar);
            }
            if (this.f1695d == -1) {
                this.f1693b = true;
            }
        }

        public final void w(a aVar, Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.m.Transition);
            v(aVar, context, obtainStyledAttributes);
            obtainStyledAttributes.recycle();
        }

        public int x() {
            return this.f1705n;
        }

        public int y() {
            return this.f1699h;
        }

        public int z() {
            return this.f1694c;
        }
    }

    public a(Context context, MotionLayout motionLayout, int i10) {
        this.f1664a = motionLayout;
        K(context, i10);
        SparseArray<d> sparseArray = this.f1671h;
        int i11 = e.g.motion_base;
        sparseArray.put(i11, new d());
        this.f1672i.put("motion_base", Integer.valueOf(i11));
    }

    public a(MotionLayout motionLayout) {
        this.f1664a = motionLayout;
    }

    public static String d0(String str) {
        if (str == null) {
            return "";
        }
        int indexOf = str.indexOf(47);
        return indexOf < 0 ? str : str.substring(indexOf + 1);
    }

    public float A(float f10, float f11) {
        b bVar = this.f1666c;
        if (bVar == null || bVar.f1703l == null) {
            return 0.0f;
        }
        return this.f1666c.f1703l.k(f10, f11);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.e(r3, -1, -1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int B(int r3) {
        /*
            r2 = this;
            androidx.constraintlayout.widget.f r0 = r2.f1665b
            if (r0 == 0) goto L_0x000c
            r1 = -1
            int r0 = r0.e(r3, r1, r1)
            if (r0 == r1) goto L_0x000c
            return r0
        L_0x000c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.a.B(int):int");
    }

    public float C() {
        b bVar = this.f1666c;
        if (bVar != null) {
            return bVar.f1700i;
        }
        return 0.0f;
    }

    public int D() {
        b bVar = this.f1666c;
        if (bVar == null) {
            return -1;
        }
        return bVar.f1695d;
    }

    public b E(int i10) {
        Iterator<b> it = this.f1668e.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.f1692a == i10) {
                return next;
            }
        }
        return null;
    }

    public int F(int i10) {
        Iterator<b> it = this.f1668e.iterator();
        while (it.hasNext()) {
            if (it.next().f1695d == i10) {
                return 0;
            }
        }
        return 1;
    }

    public List<b> G(int i10) {
        int B2 = B(i10);
        ArrayList arrayList = new ArrayList();
        Iterator<b> it = this.f1668e.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.f1695d == B2 || next.f1694c == B2) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public final boolean H(int i10) {
        int i11 = this.f1673j.get(i10);
        int size = this.f1673j.size();
        while (i11 > 0) {
            if (i11 == i10) {
                return true;
            }
            int i12 = size - 1;
            if (size < 0) {
                return true;
            }
            i11 = this.f1673j.get(i11);
            size = i12;
        }
        return false;
    }

    public boolean I(View view, int i10) {
        b bVar = this.f1666c;
        if (bVar == null) {
            return false;
        }
        Iterator it = bVar.f1702k.iterator();
        while (it.hasNext()) {
            Iterator<v.e> it2 = ((j) it.next()).c(view.getId()).iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (it2.next().f13929a == i10) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean J() {
        return this.f1680q != null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void K(android.content.Context r9, int r10) {
        /*
            r8 = this;
            android.content.res.Resources r0 = r9.getResources()
            android.content.res.XmlResourceParser r0 = r0.getXml(r10)
            r1 = 0
            int r2 = r0.getEventType()     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
        L_0x000d:
            r3 = 1
            if (r2 == r3) goto L_0x0143
            if (r2 == 0) goto L_0x0131
            r4 = 2
            if (r2 == r4) goto L_0x0017
            goto L_0x0134
        L_0x0017:
            java.lang.String r2 = r0.getName()     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
            boolean r5 = r8.f1674k     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
            if (r5 == 0) goto L_0x0035
            java.io.PrintStream r5 = java.lang.System.out     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
            r6.<init>()     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
            java.lang.String r7 = "parsing = "
            r6.append(r7)     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
            r6.append(r2)     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
            java.lang.String r6 = r6.toString()     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
            r5.println(r6)     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
        L_0x0035:
            int r5 = r2.hashCode()     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
            r6 = -1
            switch(r5) {
                case -1349929691: goto L_0x0079;
                case -1239391468: goto L_0x006f;
                case 269306229: goto L_0x0066;
                case 312750793: goto L_0x005c;
                case 327855227: goto L_0x0052;
                case 793277014: goto L_0x0048;
                case 1382829617: goto L_0x003e;
                default: goto L_0x003d;
            }     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
        L_0x003d:
            goto L_0x0083
        L_0x003e:
            java.lang.String r3 = "StateSet"
            boolean r3 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
            if (r3 == 0) goto L_0x0083
            r3 = 4
            goto L_0x0084
        L_0x0048:
            java.lang.String r3 = "MotionScene"
            boolean r3 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
            if (r3 == 0) goto L_0x0083
            r3 = 0
            goto L_0x0084
        L_0x0052:
            java.lang.String r3 = "OnSwipe"
            boolean r3 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
            if (r3 == 0) goto L_0x0083
            r3 = r4
            goto L_0x0084
        L_0x005c:
            java.lang.String r3 = "OnClick"
            boolean r3 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
            if (r3 == 0) goto L_0x0083
            r3 = 3
            goto L_0x0084
        L_0x0066:
            java.lang.String r4 = "Transition"
            boolean r4 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
            if (r4 == 0) goto L_0x0083
            goto L_0x0084
        L_0x006f:
            java.lang.String r3 = "KeyFrameSet"
            boolean r3 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
            if (r3 == 0) goto L_0x0083
            r3 = 6
            goto L_0x0084
        L_0x0079:
            java.lang.String r3 = "ConstraintSet"
            boolean r3 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
            if (r3 == 0) goto L_0x0083
            r3 = 5
            goto L_0x0084
        L_0x0083:
            r3 = r6
        L_0x0084:
            switch(r3) {
                case 0: goto L_0x011f;
                case 1: goto L_0x00dd;
                case 2: goto L_0x00aa;
                case 3: goto L_0x00a5;
                case 4: goto L_0x009c;
                case 5: goto L_0x0097;
                case 6: goto L_0x0089;
                default: goto L_0x0087;
            }     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
        L_0x0087:
            goto L_0x0123
        L_0x0089:
            v.j r2 = new v.j     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
            r2.<init>(r9, r0)     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
            java.util.ArrayList r3 = r1.f1702k     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
            r3.add(r2)     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
            goto L_0x0134
        L_0x0097:
            r8.O(r9, r0)     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
            goto L_0x0134
        L_0x009c:
            androidx.constraintlayout.widget.f r2 = new androidx.constraintlayout.widget.f     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
            r2.<init>(r9, r0)     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
            r8.f1665b = r2     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
            goto L_0x0134
        L_0x00a5:
            r1.t(r9, r0)     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
            goto L_0x0134
        L_0x00aa:
            if (r1 != 0) goto L_0x00d2
            android.content.res.Resources r2 = r9.getResources()     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
            java.lang.String r2 = r2.getResourceEntryName(r10)     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
            int r3 = r0.getLineNumber()     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
            r4.<init>()     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
            java.lang.String r5 = " OnSwipe ("
            r4.append(r5)     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
            r4.append(r2)     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
            java.lang.String r2 = ".xml:"
            r4.append(r2)     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
            r4.append(r3)     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
            java.lang.String r2 = ")"
            r4.append(r2)     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
        L_0x00d2:
            androidx.constraintlayout.motion.widget.b r2 = new androidx.constraintlayout.motion.widget.b     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r8.f1664a     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
            r2.<init>(r9, r3, r0)     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
            androidx.constraintlayout.motion.widget.b unused = r1.f1703l = r2     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
            goto L_0x0134
        L_0x00dd:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.a$b> r1 = r8.f1668e     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
            androidx.constraintlayout.motion.widget.a$b r2 = new androidx.constraintlayout.motion.widget.a$b     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
            r2.<init>(r8, r9, r0)     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
            r1.add(r2)     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
            androidx.constraintlayout.motion.widget.a$b r1 = r8.f1666c     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
            if (r1 != 0) goto L_0x0104
            boolean r1 = r2.f1693b     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
            if (r1 != 0) goto L_0x0104
            r8.f1666c = r2     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
            androidx.constraintlayout.motion.widget.b r1 = r2.f1703l     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
            if (r1 == 0) goto L_0x0104
            androidx.constraintlayout.motion.widget.a$b r1 = r8.f1666c     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
            androidx.constraintlayout.motion.widget.b r1 = r1.f1703l     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
            boolean r3 = r8.f1681r     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
            r1.u(r3)     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
        L_0x0104:
            boolean r1 = r2.f1693b     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
            if (r1 == 0) goto L_0x011d
            int r1 = r2.f1694c     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
            if (r1 != r6) goto L_0x0113
            r8.f1669f = r2     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
            goto L_0x0118
        L_0x0113:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.a$b> r1 = r8.f1670g     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
            r1.add(r2)     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
        L_0x0118:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.a$b> r1 = r8.f1668e     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
            r1.remove(r2)     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
        L_0x011d:
            r1 = r2
            goto L_0x0134
        L_0x011f:
            r8.P(r9, r0)     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
            goto L_0x0134
        L_0x0123:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
            r3.<init>()     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
            java.lang.String r4 = "WARNING UNKNOWN ATTRIBUTE "
            r3.append(r4)     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
            r3.append(r2)     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
            goto L_0x0134
        L_0x0131:
            r0.getName()     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
        L_0x0134:
            int r2 = r0.next()     // Catch:{ XmlPullParserException -> 0x013f, IOException -> 0x013a }
            goto L_0x000d
        L_0x013a:
            r9 = move-exception
            r9.printStackTrace()
            goto L_0x0143
        L_0x013f:
            r9 = move-exception
            r9.printStackTrace()
        L_0x0143:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.a.K(android.content.Context, int):void");
    }

    public int L(String str) {
        return this.f1672i.get(str).intValue();
    }

    public String M(int i10) {
        for (Map.Entry next : this.f1672i.entrySet()) {
            if (((Integer) next.getValue()).intValue() == i10) {
                return (String) next.getKey();
            }
        }
        return null;
    }

    public void N(boolean z10, int i10, int i11, int i12, int i13) {
    }

    public final void O(Context context, XmlPullParser xmlPullParser) {
        d dVar = new d();
        dVar.J0(false);
        int attributeCount = xmlPullParser.getAttributeCount();
        int i10 = -1;
        int i11 = -1;
        for (int i12 = 0; i12 < attributeCount; i12++) {
            String attributeName = xmlPullParser.getAttributeName(i12);
            String attributeValue = xmlPullParser.getAttributeValue(i12);
            if (this.f1674k) {
                System.out.println("id string = " + attributeValue);
            }
            attributeName.hashCode();
            if (attributeName.equals("deriveConstraintsFrom")) {
                i11 = r(context, attributeValue);
            } else if (attributeName.equals("id")) {
                i10 = r(context, attributeValue);
                this.f1672i.put(d0(attributeValue), Integer.valueOf(i10));
            }
        }
        if (i10 != -1) {
            if (this.f1664a.T0 != 0) {
                dVar.h1(true);
            }
            dVar.o0(context, xmlPullParser);
            if (i11 != -1) {
                this.f1673j.put(i10, i11);
            }
            this.f1671h.put(i10, dVar);
        }
    }

    public final void P(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), e.m.MotionScene);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            if (index == e.m.MotionScene_defaultDuration) {
                this.f1675l = obtainStyledAttributes.getInt(index, this.f1675l);
            } else if (index == e.m.MotionScene_layoutDuringTransition) {
                this.f1676m = obtainStyledAttributes.getInteger(index, 0);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public void Q(float f10, float f11) {
        b bVar = this.f1666c;
        if (bVar != null && bVar.f1703l != null) {
            this.f1666c.f1703l.o(f10, f11);
        }
    }

    public void R(float f10, float f11) {
        b bVar = this.f1666c;
        if (bVar != null && bVar.f1703l != null) {
            this.f1666c.f1703l.p(f10, f11);
        }
    }

    public void S(MotionEvent motionEvent, int i10, MotionLayout motionLayout) {
        MotionLayout.f fVar;
        MotionEvent motionEvent2;
        RectF rectF = new RectF();
        if (this.f1680q == null) {
            this.f1680q = this.f1664a.B0();
        }
        this.f1680q.e(motionEvent);
        if (i10 != -1) {
            int action = motionEvent.getAction();
            boolean z10 = false;
            if (action == 0) {
                this.f1682s = motionEvent.getRawX();
                this.f1683t = motionEvent.getRawY();
                this.f1677n = motionEvent;
                this.f1678o = false;
                if (this.f1666c.f1703l != null) {
                    RectF f10 = this.f1666c.f1703l.f(this.f1664a, rectF);
                    if (f10 == null || f10.contains(this.f1677n.getX(), this.f1677n.getY())) {
                        RectF l10 = this.f1666c.f1703l.l(this.f1664a, rectF);
                        if (l10 == null || l10.contains(this.f1677n.getX(), this.f1677n.getY())) {
                            this.f1679p = false;
                        } else {
                            this.f1679p = true;
                        }
                        this.f1666c.f1703l.r(this.f1682s, this.f1683t);
                        return;
                    }
                    this.f1677n = null;
                    this.f1678o = true;
                    return;
                }
                return;
            } else if (action == 2 && !this.f1678o) {
                float rawY = motionEvent.getRawY() - this.f1683t;
                float rawX = motionEvent.getRawX() - this.f1682s;
                if ((((double) rawX) != 0.0d || ((double) rawY) != 0.0d) && (motionEvent2 = this.f1677n) != null) {
                    b h10 = h(i10, rawX, rawY, motionEvent2);
                    if (h10 != null) {
                        motionLayout.setTransition(h10);
                        RectF l11 = this.f1666c.f1703l.l(this.f1664a, rectF);
                        if (l11 != null && !l11.contains(this.f1677n.getX(), this.f1677n.getY())) {
                            z10 = true;
                        }
                        this.f1679p = z10;
                        this.f1666c.f1703l.w(this.f1682s, this.f1683t);
                    }
                } else {
                    return;
                }
            }
        }
        if (!this.f1678o) {
            b bVar = this.f1666c;
            if (!(bVar == null || bVar.f1703l == null || this.f1679p)) {
                this.f1666c.f1703l.n(motionEvent, this.f1680q, i10, this);
            }
            this.f1682s = motionEvent.getRawX();
            this.f1683t = motionEvent.getRawY();
            if (motionEvent.getAction() == 1 && (fVar = this.f1680q) != null) {
                fVar.a();
                this.f1680q = null;
                int i11 = motionLayout.B0;
                if (i11 != -1) {
                    g(motionLayout, i11);
                }
            }
        }
    }

    public final void T(int i10) {
        int i11 = this.f1673j.get(i10);
        if (i11 > 0) {
            T(this.f1673j.get(i10));
            d dVar = this.f1671h.get(i10);
            d dVar2 = this.f1671h.get(i11);
            if (dVar2 == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("ERROR! invalid deriveConstraintsFrom: @id/");
                sb2.append(v.c.i(this.f1664a.getContext(), i11));
                return;
            }
            dVar.w0(dVar2);
            this.f1673j.put(i10, -1);
        }
    }

    public void U(MotionLayout motionLayout) {
        int i10 = 0;
        while (i10 < this.f1671h.size()) {
            int keyAt = this.f1671h.keyAt(i10);
            if (!H(keyAt)) {
                T(keyAt);
                i10++;
            } else {
                return;
            }
        }
        for (int i11 = 0; i11 < this.f1671h.size(); i11++) {
            this.f1671h.valueAt(i11).v0(motionLayout);
        }
    }

    public void V(b bVar) {
        int s10 = s(bVar);
        if (s10 != -1) {
            this.f1668e.remove(s10);
        }
    }

    public void W(int i10, d dVar) {
        this.f1671h.put(i10, dVar);
    }

    public void X(int i10) {
        b bVar = this.f1666c;
        if (bVar != null) {
            bVar.L(i10);
        } else {
            this.f1675l = i10;
        }
    }

    public void Y(View view, int i10, String str, Object obj) {
        b bVar = this.f1666c;
        if (bVar != null) {
            Iterator it = bVar.f1702k.iterator();
            while (it.hasNext()) {
                Iterator<v.e> it2 = ((j) it.next()).c(view.getId()).iterator();
                while (it2.hasNext()) {
                    if (it2.next().f13929a == i10) {
                        if (obj != null) {
                            ((Float) obj).floatValue();
                        }
                        str.equalsIgnoreCase("app:PerpendicularPath_percent");
                    }
                }
            }
        }
    }

    public void Z(boolean z10) {
        this.f1681r = z10;
        b bVar = this.f1666c;
        if (bVar != null && bVar.f1703l != null) {
            this.f1666c.f1703l.u(this.f1681r);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        if (r2 != -1) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a0(int r7, int r8) {
        /*
            r6 = this;
            androidx.constraintlayout.widget.f r0 = r6.f1665b
            r1 = -1
            if (r0 == 0) goto L_0x0016
            int r0 = r0.e(r7, r1, r1)
            if (r0 == r1) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r0 = r7
        L_0x000d:
            androidx.constraintlayout.widget.f r2 = r6.f1665b
            int r2 = r2.e(r8, r1, r1)
            if (r2 == r1) goto L_0x0017
            goto L_0x0018
        L_0x0016:
            r0 = r7
        L_0x0017:
            r2 = r8
        L_0x0018:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.a$b> r3 = r6.f1668e
            java.util.Iterator r3 = r3.iterator()
        L_0x001e:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0058
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.a$b r4 = (androidx.constraintlayout.motion.widget.a.b) r4
            int r5 = r4.f1694c
            if (r5 != r2) goto L_0x0036
            int r5 = r4.f1695d
            if (r5 == r0) goto L_0x0042
        L_0x0036:
            int r5 = r4.f1694c
            if (r5 != r8) goto L_0x001e
            int r5 = r4.f1695d
            if (r5 != r7) goto L_0x001e
        L_0x0042:
            r6.f1666c = r4
            if (r4 == 0) goto L_0x0057
            androidx.constraintlayout.motion.widget.b r7 = r4.f1703l
            if (r7 == 0) goto L_0x0057
            androidx.constraintlayout.motion.widget.a$b r7 = r6.f1666c
            androidx.constraintlayout.motion.widget.b r7 = r7.f1703l
            boolean r8 = r6.f1681r
            r7.u(r8)
        L_0x0057:
            return
        L_0x0058:
            androidx.constraintlayout.motion.widget.a$b r7 = r6.f1669f
            java.util.ArrayList<androidx.constraintlayout.motion.widget.a$b> r3 = r6.f1670g
            java.util.Iterator r3 = r3.iterator()
        L_0x0060:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0074
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.a$b r4 = (androidx.constraintlayout.motion.widget.a.b) r4
            int r5 = r4.f1694c
            if (r5 != r8) goto L_0x0060
            r7 = r4
            goto L_0x0060
        L_0x0074:
            androidx.constraintlayout.motion.widget.a$b r8 = new androidx.constraintlayout.motion.widget.a$b
            r8.<init>(r6, r7)
            int unused = r8.f1695d = r0
            int unused = r8.f1694c = r2
            if (r0 == r1) goto L_0x0086
            java.util.ArrayList<androidx.constraintlayout.motion.widget.a$b> r7 = r6.f1668e
            r7.add(r8)
        L_0x0086:
            r6.f1666c = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.a.a0(int, int):void");
    }

    public void b0(b bVar) {
        this.f1666c = bVar;
        if (bVar != null && bVar.f1703l != null) {
            this.f1666c.f1703l.u(this.f1681r);
        }
    }

    public void c0() {
        b bVar = this.f1666c;
        if (bVar != null && bVar.f1703l != null) {
            this.f1666c.f1703l.x();
        }
    }

    public void e(MotionLayout motionLayout, int i10) {
        Iterator<b> it = this.f1668e.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.f1704m.size() > 0) {
                Iterator it2 = next.f1704m.iterator();
                while (it2.hasNext()) {
                    ((b.C0026a) it2.next()).c(motionLayout);
                }
            }
        }
        Iterator<b> it3 = this.f1670g.iterator();
        while (it3.hasNext()) {
            b next2 = it3.next();
            if (next2.f1704m.size() > 0) {
                Iterator it4 = next2.f1704m.iterator();
                while (it4.hasNext()) {
                    ((b.C0026a) it4.next()).c(motionLayout);
                }
            }
        }
        Iterator<b> it5 = this.f1668e.iterator();
        while (it5.hasNext()) {
            b next3 = it5.next();
            if (next3.f1704m.size() > 0) {
                Iterator it6 = next3.f1704m.iterator();
                while (it6.hasNext()) {
                    ((b.C0026a) it6.next()).a(motionLayout, i10, next3);
                }
            }
        }
        Iterator<b> it7 = this.f1670g.iterator();
        while (it7.hasNext()) {
            b next4 = it7.next();
            if (next4.f1704m.size() > 0) {
                Iterator it8 = next4.f1704m.iterator();
                while (it8.hasNext()) {
                    ((b.C0026a) it8.next()).a(motionLayout, i10, next4);
                }
            }
        }
    }

    public boolean e0() {
        Iterator<b> it = this.f1668e.iterator();
        while (it.hasNext()) {
            if (it.next().f1703l != null) {
                return true;
            }
        }
        b bVar = this.f1666c;
        return (bVar == null || bVar.f1703l == null) ? false : true;
    }

    public void f(b bVar) {
        int s10 = s(bVar);
        if (s10 == -1) {
            this.f1668e.add(bVar);
        } else {
            this.f1668e.set(s10, bVar);
        }
    }

    public boolean f0(MotionLayout motionLayout) {
        return motionLayout == this.f1664a && motionLayout.f1607x0 == this;
    }

    public boolean g(MotionLayout motionLayout, int i10) {
        if (J() || this.f1667d) {
            return false;
        }
        Iterator<b> it = this.f1668e.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (!(next.f1705n == 0 || this.f1666c == next)) {
                if (i10 == next.f1695d && (next.f1705n == 4 || next.f1705n == 2)) {
                    MotionLayout.j jVar = MotionLayout.j.FINISHED;
                    motionLayout.setState(jVar);
                    motionLayout.setTransition(next);
                    if (next.f1705n == 4) {
                        motionLayout.L0();
                        motionLayout.setState(MotionLayout.j.SETUP);
                        motionLayout.setState(MotionLayout.j.MOVING);
                    } else {
                        motionLayout.setProgress(1.0f);
                        motionLayout.l0(true);
                        motionLayout.setState(MotionLayout.j.SETUP);
                        motionLayout.setState(MotionLayout.j.MOVING);
                        motionLayout.setState(jVar);
                        motionLayout.C0();
                    }
                    return true;
                } else if (i10 == next.f1694c && (next.f1705n == 3 || next.f1705n == 1)) {
                    MotionLayout.j jVar2 = MotionLayout.j.FINISHED;
                    motionLayout.setState(jVar2);
                    motionLayout.setTransition(next);
                    if (next.f1705n == 3) {
                        motionLayout.M0();
                        motionLayout.setState(MotionLayout.j.SETUP);
                        motionLayout.setState(MotionLayout.j.MOVING);
                    } else {
                        motionLayout.setProgress(0.0f);
                        motionLayout.l0(true);
                        motionLayout.setState(MotionLayout.j.SETUP);
                        motionLayout.setState(MotionLayout.j.MOVING);
                        motionLayout.setState(jVar2);
                        motionLayout.C0();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public b h(int i10, float f10, float f11, MotionEvent motionEvent) {
        RectF l10;
        if (i10 == -1) {
            return this.f1666c;
        }
        List<b> G2 = G(i10);
        float f12 = 0.0f;
        b bVar = null;
        RectF rectF = new RectF();
        for (b next : G2) {
            if (!next.f1706o && next.f1703l != null) {
                next.f1703l.u(this.f1681r);
                RectF l11 = next.f1703l.l(this.f1664a, rectF);
                if ((l11 == null || motionEvent == null || l11.contains(motionEvent.getX(), motionEvent.getY())) && ((l10 = next.f1703l.l(this.f1664a, rectF)) == null || motionEvent == null || l10.contains(motionEvent.getX(), motionEvent.getY()))) {
                    float a10 = next.f1703l.a(f10, f11) * (next.f1694c == i10 ? -1.0f : 1.1f);
                    if (a10 > f12) {
                        bVar = next;
                        f12 = a10;
                    }
                }
            }
        }
        return bVar;
    }

    public void i(boolean z10) {
        this.f1667d = z10;
    }

    public int j() {
        b bVar = this.f1666c;
        if (bVar != null) {
            return bVar.f1707p;
        }
        return -1;
    }

    public d k(int i10) {
        return l(i10, -1, -1);
    }

    public d l(int i10, int i11, int i12) {
        Object obj;
        int e10;
        if (this.f1674k) {
            PrintStream printStream = System.out;
            printStream.println("id " + i10);
            PrintStream printStream2 = System.out;
            printStream2.println("size " + this.f1671h.size());
        }
        f fVar = this.f1665b;
        if (!(fVar == null || (e10 = fVar.e(i10, i11, i12)) == -1)) {
            i10 = e10;
        }
        if (this.f1671h.get(i10) == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Warning could not find ConstraintSet id/");
            sb2.append(v.c.i(this.f1664a.getContext(), i10));
            sb2.append(" In MotionScene");
            SparseArray sparseArray = this.f1671h;
            obj = sparseArray.get(sparseArray.keyAt(0));
        } else {
            obj = this.f1671h.get(i10);
        }
        return (d) obj;
    }

    public d m(Context context, String str) {
        if (this.f1674k) {
            PrintStream printStream = System.out;
            printStream.println("id " + str);
            PrintStream printStream2 = System.out;
            printStream2.println("size " + this.f1671h.size());
        }
        for (int i10 = 0; i10 < this.f1671h.size(); i10++) {
            int keyAt = this.f1671h.keyAt(i10);
            String resourceName = context.getResources().getResourceName(keyAt);
            if (this.f1674k) {
                PrintStream printStream3 = System.out;
                printStream3.println("Id for <" + i10 + "> is <" + resourceName + "> looking for <" + str + ">");
            }
            if (str.equals(resourceName)) {
                return this.f1671h.get(keyAt);
            }
        }
        return null;
    }

    public int[] n() {
        int size = this.f1671h.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = this.f1671h.keyAt(i10);
        }
        return iArr;
    }

    public ArrayList<b> o() {
        return this.f1668e;
    }

    public int p() {
        b bVar = this.f1666c;
        return bVar != null ? bVar.f1699h : this.f1675l;
    }

    public int q() {
        b bVar = this.f1666c;
        if (bVar == null) {
            return -1;
        }
        return bVar.f1694c;
    }

    public final int r(Context context, String str) {
        int i10;
        if (str.contains("/")) {
            i10 = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
            if (this.f1674k) {
                System.out.println("id getMap res = " + i10);
            }
        } else {
            i10 = -1;
        }
        return (i10 != -1 || str.length() <= 1) ? i10 : Integer.parseInt(str.substring(1));
    }

    public final int s(b bVar) {
        int o10 = bVar.f1692a;
        if (o10 != -1) {
            for (int i10 = 0; i10 < this.f1668e.size(); i10++) {
                if (this.f1668e.get(i10).f1692a == o10) {
                    return i10;
                }
            }
            return -1;
        }
        throw new IllegalArgumentException("The transition must have an id");
    }

    public Interpolator t() {
        int g10 = this.f1666c.f1696e;
        if (g10 == -2) {
            return AnimationUtils.loadInterpolator(this.f1664a.getContext(), this.f1666c.f1698g);
        }
        if (g10 == -1) {
            return new C0025a(c.c(this.f1666c.f1697f));
        }
        if (g10 == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (g10 == 1) {
            return new AccelerateInterpolator();
        }
        if (g10 == 2) {
            return new DecelerateInterpolator();
        }
        if (g10 == 4) {
            return new AnticipateInterpolator();
        }
        if (g10 != 5) {
            return null;
        }
        return new BounceInterpolator();
    }

    public v.e u(Context context, int i10, int i11, int i12) {
        b bVar = this.f1666c;
        if (bVar == null) {
            return null;
        }
        Iterator it = bVar.f1702k.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            Iterator<Integer> it2 = jVar.d().iterator();
            while (true) {
                if (it2.hasNext()) {
                    Integer next = it2.next();
                    if (i11 == next.intValue()) {
                        Iterator<v.e> it3 = jVar.c(next.intValue()).iterator();
                        while (it3.hasNext()) {
                            v.e next2 = it3.next();
                            if (next2.f13929a == i12 && next2.f13932d == i10) {
                                return next2;
                            }
                        }
                        continue;
                    }
                }
            }
        }
        return null;
    }

    public void v(p pVar) {
        b bVar = this.f1666c;
        if (bVar == null) {
            b bVar2 = this.f1669f;
            if (bVar2 != null) {
                Iterator it = bVar2.f1702k.iterator();
                while (it.hasNext()) {
                    ((j) it.next()).a(pVar);
                }
                return;
            }
            return;
        }
        Iterator it2 = bVar.f1702k.iterator();
        while (it2.hasNext()) {
            ((j) it2.next()).a(pVar);
        }
    }

    public float w() {
        b bVar = this.f1666c;
        if (bVar == null || bVar.f1703l == null) {
            return 0.0f;
        }
        return this.f1666c.f1703l.h();
    }

    public float x() {
        b bVar = this.f1666c;
        if (bVar == null || bVar.f1703l == null) {
            return 0.0f;
        }
        return this.f1666c.f1703l.i();
    }

    public boolean y() {
        b bVar = this.f1666c;
        if (bVar == null || bVar.f1703l == null) {
            return false;
        }
        return this.f1666c.f1703l.j();
    }

    public float z(View view, int i10) {
        return 0.0f;
    }
}
