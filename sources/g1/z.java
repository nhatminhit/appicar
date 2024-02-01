package g1;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo$TouchDelegateInfo;
import d.e0;
import d.m0;
import d.o0;
import d.x0;
import e0.a;
import g1.c0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class z {
    public static final int A = 256;
    public static final int B = 512;
    public static final int C = 1024;
    public static final int D = 2048;
    public static final int E = 4096;
    public static final int F = 8192;
    public static final int G = 16384;
    public static final int H = 32768;
    public static final int I = 65536;
    public static final int J = 131072;
    public static final int K = 262144;
    public static final int L = 524288;
    public static final int M = 1048576;
    public static final int N = 2097152;
    public static final String O = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT";
    public static final String P = "ACTION_ARGUMENT_HTML_ELEMENT_STRING";
    public static final String Q = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN";
    public static final String R = "ACTION_ARGUMENT_SELECTION_START_INT";
    public static final String S = "ACTION_ARGUMENT_SELECTION_END_INT";
    public static final String T = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE";
    public static final String U = "android.view.accessibility.action.ARGUMENT_ROW_INT";
    public static final String V = "android.view.accessibility.action.ARGUMENT_COLUMN_INT";
    public static final String W = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE";
    public static final String X = "ACTION_ARGUMENT_MOVE_WINDOW_X";
    public static final String Y = "ACTION_ARGUMENT_MOVE_WINDOW_Y";
    @SuppressLint({"ActionValue"})
    public static final String Z = "android.view.accessibility.action.ARGUMENT_PRESS_AND_HOLD_DURATION_MILLIS_INT";

    /* renamed from: a0  reason: collision with root package name */
    public static final int f7564a0 = 1;

    /* renamed from: b0  reason: collision with root package name */
    public static final int f7565b0 = 2;

    /* renamed from: c0  reason: collision with root package name */
    public static final int f7566c0 = 1;

    /* renamed from: d  reason: collision with root package name */
    public static final String f7567d = "AccessibilityNodeInfo.roleDescription";

    /* renamed from: d0  reason: collision with root package name */
    public static final int f7568d0 = 2;

    /* renamed from: e  reason: collision with root package name */
    public static final String f7569e = "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY";

    /* renamed from: e0  reason: collision with root package name */
    public static final int f7570e0 = 4;

    /* renamed from: f  reason: collision with root package name */
    public static final String f7571f = "androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY";

    /* renamed from: f0  reason: collision with root package name */
    public static final int f7572f0 = 8;

    /* renamed from: g  reason: collision with root package name */
    public static final String f7573g = "androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY";

    /* renamed from: g0  reason: collision with root package name */
    public static final int f7574g0 = 16;

    /* renamed from: h  reason: collision with root package name */
    public static final String f7575h = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY";

    /* renamed from: h0  reason: collision with root package name */
    public static int f7576h0 = 0;

    /* renamed from: i  reason: collision with root package name */
    public static final String f7577i = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY";

    /* renamed from: j  reason: collision with root package name */
    public static final String f7578j = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY";

    /* renamed from: k  reason: collision with root package name */
    public static final String f7579k = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY";

    /* renamed from: l  reason: collision with root package name */
    public static final String f7580l = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY";

    /* renamed from: m  reason: collision with root package name */
    public static final String f7581m = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY";

    /* renamed from: n  reason: collision with root package name */
    public static final String f7582n = "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY";

    /* renamed from: o  reason: collision with root package name */
    public static final int f7583o = 1;

    /* renamed from: p  reason: collision with root package name */
    public static final int f7584p = 2;

    /* renamed from: q  reason: collision with root package name */
    public static final int f7585q = 4;

    /* renamed from: r  reason: collision with root package name */
    public static final int f7586r = 8;

    /* renamed from: s  reason: collision with root package name */
    public static final int f7587s = 1;

    /* renamed from: t  reason: collision with root package name */
    public static final int f7588t = 2;

    /* renamed from: u  reason: collision with root package name */
    public static final int f7589u = 4;

    /* renamed from: v  reason: collision with root package name */
    public static final int f7590v = 8;

    /* renamed from: w  reason: collision with root package name */
    public static final int f7591w = 16;

    /* renamed from: x  reason: collision with root package name */
    public static final int f7592x = 32;

    /* renamed from: y  reason: collision with root package name */
    public static final int f7593y = 64;

    /* renamed from: z  reason: collision with root package name */
    public static final int f7594z = 128;

    /* renamed from: a  reason: collision with root package name */
    public final AccessibilityNodeInfo f7595a;
    @x0({x0.a.LIBRARY_GROUP_PREFIX})

    /* renamed from: b  reason: collision with root package name */
    public int f7596b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f7597c = -1;

    public static class a {
        public static final a A = new a(2097152, (CharSequence) null, (Class<? extends c0.a>) c0.h.class);
        public static final a B = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, (CharSequence) null, (c0) null, (Class<? extends c0.a>) null);
        public static final a C = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, (CharSequence) null, (c0) null, c0.e.class);
        public static final a D = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, (CharSequence) null, (c0) null, (Class<? extends c0.a>) null);
        public static final a E = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, (CharSequence) null, (c0) null, (Class<? extends c0.a>) null);
        public static final a F = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, (CharSequence) null, (c0) null, (Class<? extends c0.a>) null);
        public static final a G = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, (CharSequence) null, (c0) null, (Class<? extends c0.a>) null);
        @m0
        public static final a H;
        @m0
        public static final a I;
        @m0
        public static final a J;
        @m0
        public static final a K;
        public static final a L = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, (CharSequence) null, (c0) null, (Class<? extends c0.a>) null);
        public static final a M;
        public static final a N;
        public static final a O;
        public static final a P;
        @m0
        public static final a Q;
        @m0
        public static final a R;

        /* renamed from: e  reason: collision with root package name */
        public static final String f7598e = "A11yActionCompat";

        /* renamed from: f  reason: collision with root package name */
        public static final a f7599f = new a(1, (CharSequence) null);

        /* renamed from: g  reason: collision with root package name */
        public static final a f7600g = new a(2, (CharSequence) null);

        /* renamed from: h  reason: collision with root package name */
        public static final a f7601h = new a(4, (CharSequence) null);

        /* renamed from: i  reason: collision with root package name */
        public static final a f7602i = new a(8, (CharSequence) null);

        /* renamed from: j  reason: collision with root package name */
        public static final a f7603j = new a(16, (CharSequence) null);

        /* renamed from: k  reason: collision with root package name */
        public static final a f7604k = new a(32, (CharSequence) null);

        /* renamed from: l  reason: collision with root package name */
        public static final a f7605l = new a(64, (CharSequence) null);

        /* renamed from: m  reason: collision with root package name */
        public static final a f7606m = new a(128, (CharSequence) null);

        /* renamed from: n  reason: collision with root package name */
        public static final a f7607n;

        /* renamed from: o  reason: collision with root package name */
        public static final a f7608o;

        /* renamed from: p  reason: collision with root package name */
        public static final a f7609p;

        /* renamed from: q  reason: collision with root package name */
        public static final a f7610q;

        /* renamed from: r  reason: collision with root package name */
        public static final a f7611r = new a(4096, (CharSequence) null);

        /* renamed from: s  reason: collision with root package name */
        public static final a f7612s = new a(8192, (CharSequence) null);

        /* renamed from: t  reason: collision with root package name */
        public static final a f7613t = new a(16384, (CharSequence) null);

        /* renamed from: u  reason: collision with root package name */
        public static final a f7614u = new a(32768, (CharSequence) null);

        /* renamed from: v  reason: collision with root package name */
        public static final a f7615v = new a(65536, (CharSequence) null);

        /* renamed from: w  reason: collision with root package name */
        public static final a f7616w = new a(131072, (CharSequence) null, (Class<? extends c0.a>) c0.g.class);

        /* renamed from: x  reason: collision with root package name */
        public static final a f7617x = new a(262144, (CharSequence) null);

        /* renamed from: y  reason: collision with root package name */
        public static final a f7618y = new a(524288, (CharSequence) null);

        /* renamed from: z  reason: collision with root package name */
        public static final a f7619z = new a(1048576, (CharSequence) null);

        /* renamed from: a  reason: collision with root package name */
        public final Object f7620a;

        /* renamed from: b  reason: collision with root package name */
        public final int f7621b;

        /* renamed from: c  reason: collision with root package name */
        public final Class<? extends c0.a> f7622c;
        @x0({x0.a.LIBRARY_GROUP_PREFIX})

        /* renamed from: d  reason: collision with root package name */
        public final c0 f7623d;

        static {
            Class<c0.c> cls = c0.c.class;
            Class<c0.b> cls2 = c0.b.class;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
            f7607n = new a(256, (CharSequence) null, (Class<? extends c0.a>) cls2);
            f7608o = new a(512, (CharSequence) null, (Class<? extends c0.a>) cls2);
            f7609p = new a(1024, (CharSequence) null, (Class<? extends c0.a>) cls);
            f7610q = new a(2048, (CharSequence) null, (Class<? extends c0.a>) cls);
            int i10 = Build.VERSION.SDK_INT;
            H = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, (CharSequence) null, (c0) null, (Class<? extends c0.a>) null);
            I = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, (CharSequence) null, (c0) null, (Class<? extends c0.a>) null);
            J = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, (CharSequence) null, (c0) null, (Class<? extends c0.a>) null);
            K = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, (CharSequence) null, (c0) null, (Class<? extends c0.a>) null);
            M = new a(i10 >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, (CharSequence) null, (c0) null, c0.f.class);
            N = new a(i10 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, (CharSequence) null, (c0) null, c0.d.class);
            O = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, (CharSequence) null, (c0) null, (Class<? extends c0.a>) null);
            P = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, 16908357, (CharSequence) null, (c0) null, (Class<? extends c0.a>) null);
            Q = new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, 16908362, (CharSequence) null, (c0) null, (Class<? extends c0.a>) null);
            if (i10 >= 30) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            }
            R = new a(accessibilityAction, 16908372, (CharSequence) null, (c0) null, (Class<? extends c0.a>) null);
        }

        public a(int i10, CharSequence charSequence) {
            this((Object) null, i10, charSequence, (c0) null, (Class<? extends c0.a>) null);
        }

        @x0({x0.a.LIBRARY_GROUP_PREFIX})
        public a(int i10, CharSequence charSequence, c0 c0Var) {
            this((Object) null, i10, charSequence, c0Var, (Class<? extends c0.a>) null);
        }

        public a(int i10, CharSequence charSequence, Class<? extends c0.a> cls) {
            this((Object) null, i10, charSequence, (c0) null, cls);
        }

        public a(Object obj) {
            this(obj, 0, (CharSequence) null, (c0) null, (Class<? extends c0.a>) null);
        }

        public a(Object obj, int i10, CharSequence charSequence, c0 c0Var, Class<? extends c0.a> cls) {
            this.f7621b = i10;
            this.f7623d = c0Var;
            this.f7620a = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i10, charSequence) : obj;
            this.f7622c = cls;
        }

        @x0({x0.a.LIBRARY_GROUP_PREFIX})
        public a a(CharSequence charSequence, c0 c0Var) {
            return new a((Object) null, this.f7621b, charSequence, c0Var, this.f7622c);
        }

        public int b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f7620a).getId();
        }

        public CharSequence c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f7620a).getLabel();
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0022  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0025  */
        @d.x0({d.x0.a.LIBRARY_GROUP_PREFIX})
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean d(android.view.View r5, android.os.Bundle r6) {
            /*
                r4 = this;
                g1.c0 r0 = r4.f7623d
                r1 = 0
                if (r0 == 0) goto L_0x003d
                r0 = 0
                java.lang.Class<? extends g1.c0$a> r2 = r4.f7622c
                if (r2 == 0) goto L_0x0036
                java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x001e }
                java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch:{ Exception -> 0x001e }
                java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x001e }
                java.lang.Object r1 = r2.newInstance(r1)     // Catch:{ Exception -> 0x001e }
                g1.c0$a r1 = (g1.c0.a) r1     // Catch:{ Exception -> 0x001e }
                r1.a(r6)     // Catch:{ Exception -> 0x001d }
                r0 = r1
                goto L_0x0036
            L_0x001d:
                r0 = r1
            L_0x001e:
                java.lang.Class<? extends g1.c0$a> r6 = r4.f7622c
                if (r6 != 0) goto L_0x0025
                java.lang.String r6 = "null"
                goto L_0x0029
            L_0x0025:
                java.lang.String r6 = r6.getName()
            L_0x0029:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Failed to execute command with argument class ViewCommandArgument: "
                r1.append(r2)
                r1.append(r6)
            L_0x0036:
                g1.c0 r6 = r4.f7623d
                boolean r5 = r6.a(r5, r0)
                return r5
            L_0x003d:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: g1.z.a.d(android.view.View, android.os.Bundle):boolean");
        }

        public boolean equals(@o0 Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            Object obj2 = this.f7620a;
            Object obj3 = ((a) obj).f7620a;
            return obj2 == null ? obj3 == null : obj2.equals(obj3);
        }

        public int hashCode() {
            Object obj = this.f7620a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
    }

    public static class b {

        /* renamed from: b  reason: collision with root package name */
        public static final int f7624b = 0;

        /* renamed from: c  reason: collision with root package name */
        public static final int f7625c = 1;

        /* renamed from: d  reason: collision with root package name */
        public static final int f7626d = 2;

        /* renamed from: a  reason: collision with root package name */
        public final Object f7627a;

        public b(Object obj) {
            this.f7627a = obj;
        }

        public static b e(int i10, int i11, boolean z10) {
            return new b(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10));
        }

        public static b f(int i10, int i11, boolean z10, int i12) {
            return new b(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10, i12));
        }

        public int a() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f7627a).getColumnCount();
        }

        public int b() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f7627a).getRowCount();
        }

        public int c() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f7627a).getSelectionMode();
        }

        public boolean d() {
            return ((AccessibilityNodeInfo.CollectionInfo) this.f7627a).isHierarchical();
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final Object f7628a;

        public c(Object obj) {
            this.f7628a = obj;
        }

        public static c g(int i10, int i11, int i12, int i13, boolean z10) {
            return new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10));
        }

        public static c h(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
            return new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10, z11));
        }

        public int a() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f7628a).getColumnIndex();
        }

        public int b() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f7628a).getColumnSpan();
        }

        public int c() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f7628a).getRowIndex();
        }

        public int d() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f7628a).getRowSpan();
        }

        @Deprecated
        public boolean e() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f7628a).isHeading();
        }

        public boolean f() {
            return ((AccessibilityNodeInfo.CollectionItemInfo) this.f7628a).isSelected();
        }
    }

    public static class d {

        /* renamed from: b  reason: collision with root package name */
        public static final int f7629b = 0;

        /* renamed from: c  reason: collision with root package name */
        public static final int f7630c = 1;

        /* renamed from: d  reason: collision with root package name */
        public static final int f7631d = 2;

        /* renamed from: a  reason: collision with root package name */
        public final Object f7632a;

        public d(Object obj) {
            this.f7632a = obj;
        }

        public static d e(int i10, float f10, float f11, float f12) {
            return new d(AccessibilityNodeInfo.RangeInfo.obtain(i10, f10, f11, f12));
        }

        public float a() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f7632a).getCurrent();
        }

        public float b() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f7632a).getMax();
        }

        public float c() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f7632a).getMin();
        }

        public int d() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f7632a).getType();
        }
    }

    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final AccessibilityNodeInfo$TouchDelegateInfo f7633a;

        public e(@m0 AccessibilityNodeInfo$TouchDelegateInfo accessibilityNodeInfo$TouchDelegateInfo) {
            this.f7633a = accessibilityNodeInfo$TouchDelegateInfo;
        }

        public e(@m0 Map<Region, View> map) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f7633a = new AccessibilityNodeInfo$TouchDelegateInfo(map);
            } else {
                this.f7633a = null;
            }
        }

        @o0
        public Region a(@e0(from = 0) int i10) {
            if (Build.VERSION.SDK_INT >= 29) {
                return this.f7633a.getRegionAt(i10);
            }
            return null;
        }

        @e0(from = 0)
        public int b() {
            if (Build.VERSION.SDK_INT >= 29) {
                return this.f7633a.getRegionCount();
            }
            return 0;
        }

        @o0
        public z c(@m0 Region region) {
            AccessibilityNodeInfo targetForRegion;
            if (Build.VERSION.SDK_INT < 29 || (targetForRegion = this.f7633a.getTargetForRegion(region)) == null) {
                return null;
            }
            return z.V1(targetForRegion);
        }
    }

    public z(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f7595a = accessibilityNodeInfo;
    }

    @Deprecated
    public z(Object obj) {
        this.f7595a = (AccessibilityNodeInfo) obj;
    }

    public static z B0() {
        return V1(AccessibilityNodeInfo.obtain());
    }

    public static z C0(View view) {
        return V1(AccessibilityNodeInfo.obtain(view));
    }

    public static z D0(View view, int i10) {
        return W1(AccessibilityNodeInfo.obtain(view, i10));
    }

    public static z E0(z zVar) {
        return V1(AccessibilityNodeInfo.obtain(zVar.f7595a));
    }

    public static z V1(@m0 AccessibilityNodeInfo accessibilityNodeInfo) {
        return new z(accessibilityNodeInfo);
    }

    public static z W1(Object obj) {
        if (obj != null) {
            return new z(obj);
        }
        return null;
    }

    public static String o(int i10) {
        if (i10 == 1) {
            return "ACTION_FOCUS";
        }
        if (i10 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i10) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case 16908354:
                return "ACTION_MOVE_WINDOW";
            case 16908372:
                return "ACTION_IME_ENTER";
            default:
                switch (i10) {
                    case 16908342:
                        return "ACTION_SHOW_ON_SCREEN";
                    case 16908343:
                        return "ACTION_SCROLL_TO_POSITION";
                    case 16908344:
                        return "ACTION_SCROLL_UP";
                    case 16908345:
                        return "ACTION_SCROLL_LEFT";
                    case 16908346:
                        return "ACTION_SCROLL_DOWN";
                    case 16908347:
                        return "ACTION_SCROLL_RIGHT";
                    case 16908348:
                        return "ACTION_CONTEXT_CLICK";
                    case 16908349:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i10) {
                            case 16908356:
                                return "ACTION_SHOW_TOOLTIP";
                            case 16908357:
                                return "ACTION_HIDE_TOOLTIP";
                            case 16908358:
                                return "ACTION_PAGE_UP";
                            case 16908359:
                                return "ACTION_PAGE_DOWN";
                            case 16908360:
                                return "ACTION_PAGE_LEFT";
                            case 16908361:
                                return "ACTION_PAGE_RIGHT";
                            case 16908362:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                return "ACTION_UNKNOWN";
                        }
                }
        }
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    public static ClickableSpan[] w(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public int A() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.f7595a.getDrawingOrder();
        }
        return 0;
    }

    public boolean A0() {
        return this.f7595a.isVisibleToUser();
    }

    public void A1(d dVar) {
        this.f7595a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) dVar.f7632a);
    }

    public CharSequence B() {
        return this.f7595a.getError();
    }

    public void B1(@o0 CharSequence charSequence) {
        this.f7595a.getExtras().putCharSequence(f7567d, charSequence);
    }

    public Bundle C() {
        return this.f7595a.getExtras();
    }

    public void C1(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f7595a.setScreenReaderFocusable(z10);
        } else {
            O0(1, z10);
        }
    }

    @o0
    public CharSequence D() {
        return Build.VERSION.SDK_INT >= 26 ? this.f7595a.getHintText() : this.f7595a.getExtras().getCharSequence(f7573g);
    }

    public void D1(boolean z10) {
        this.f7595a.setScrollable(z10);
    }

    @Deprecated
    public Object E() {
        return this.f7595a;
    }

    public void E1(boolean z10) {
        this.f7595a.setSelected(z10);
    }

    public int F() {
        return this.f7595a.getInputType();
    }

    public boolean F0(int i10) {
        return this.f7595a.performAction(i10);
    }

    public void F1(boolean z10) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f7595a.setShowingHintText(z10);
        } else {
            O0(4, z10);
        }
    }

    public z G() {
        return W1(this.f7595a.getLabelFor());
    }

    public boolean G0(int i10, Bundle bundle) {
        return this.f7595a.performAction(i10, bundle);
    }

    public void G1(View view) {
        this.f7597c = -1;
        this.f7595a.setSource(view);
    }

    public z H() {
        return W1(this.f7595a.getLabeledBy());
    }

    public void H0() {
        this.f7595a.recycle();
    }

    public void H1(View view, int i10) {
        this.f7597c = i10;
        this.f7595a.setSource(view, i10);
    }

    public int I() {
        return this.f7595a.getLiveRegion();
    }

    public boolean I0() {
        return this.f7595a.refresh();
    }

    public void I1(@o0 CharSequence charSequence) {
        if (x0.a.h()) {
            this.f7595a.setStateDescription(charSequence);
        } else {
            this.f7595a.getExtras().putCharSequence(f7582n, charSequence);
        }
    }

    public int J() {
        return this.f7595a.getMaxTextLength();
    }

    public boolean J0(a aVar) {
        return this.f7595a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f7620a);
    }

    public void J1(CharSequence charSequence) {
        this.f7595a.setText(charSequence);
    }

    public int K() {
        return this.f7595a.getMovementGranularities();
    }

    public boolean K0(View view) {
        return this.f7595a.removeChild(view);
    }

    public void K1(boolean z10) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f7595a.setTextEntryKey(z10);
        } else {
            O0(8, z10);
        }
    }

    public final SparseArray<WeakReference<ClickableSpan>> L(View view) {
        SparseArray<WeakReference<ClickableSpan>> R2 = R(view);
        if (R2 != null) {
            return R2;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(a.e.tag_accessibility_clickable_spans, sparseArray);
        return sparseArray;
    }

    public boolean L0(View view, int i10) {
        return this.f7595a.removeChild(view, i10);
    }

    public void L1(int i10, int i11) {
        this.f7595a.setTextSelection(i10, i11);
    }

    public CharSequence M() {
        return this.f7595a.getPackageName();
    }

    public final void M0(View view) {
        SparseArray<WeakReference<ClickableSpan>> R2 = R(view);
        if (R2 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < R2.size(); i10++) {
                if (R2.valueAt(i10).get() == null) {
                    arrayList.add(Integer.valueOf(i10));
                }
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                R2.remove(((Integer) arrayList.get(i11)).intValue());
            }
        }
    }

    public void M1(@o0 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f7595a.setTooltipText(charSequence);
        } else {
            this.f7595a.getExtras().putCharSequence(f7571f, charSequence);
        }
    }

    @o0
    public CharSequence N() {
        return Build.VERSION.SDK_INT >= 28 ? this.f7595a.getPaneTitle() : this.f7595a.getExtras().getCharSequence(f7569e);
    }

    public void N0(boolean z10) {
        this.f7595a.setAccessibilityFocused(z10);
    }

    public void N1(@m0 e eVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f7595a.setTouchDelegateInfo(eVar.f7633a);
        }
    }

    public z O() {
        return W1(this.f7595a.getParent());
    }

    public final void O0(int i10, boolean z10) {
        Bundle C2 = C();
        if (C2 != null) {
            int i11 = C2.getInt(f7575h, 0) & (~i10);
            if (!z10) {
                i10 = 0;
            }
            C2.putInt(f7575h, i10 | i11);
        }
    }

    public void O1(View view) {
        this.f7595a.setTraversalAfter(view);
    }

    public d P() {
        AccessibilityNodeInfo.RangeInfo rangeInfo = this.f7595a.getRangeInfo();
        if (rangeInfo != null) {
            return new d(rangeInfo);
        }
        return null;
    }

    @Deprecated
    public void P0(Rect rect) {
        this.f7595a.setBoundsInParent(rect);
    }

    public void P1(View view, int i10) {
        this.f7595a.setTraversalAfter(view, i10);
    }

    @o0
    public CharSequence Q() {
        return this.f7595a.getExtras().getCharSequence(f7567d);
    }

    public void Q0(Rect rect) {
        this.f7595a.setBoundsInScreen(rect);
    }

    public void Q1(View view) {
        this.f7595a.setTraversalBefore(view);
    }

    public final SparseArray<WeakReference<ClickableSpan>> R(View view) {
        return (SparseArray) view.getTag(a.e.tag_accessibility_clickable_spans);
    }

    public void R0(boolean z10) {
        this.f7595a.setCanOpenPopup(z10);
    }

    public void R1(View view, int i10) {
        this.f7595a.setTraversalBefore(view, i10);
    }

    @o0
    public CharSequence S() {
        return x0.a.h() ? this.f7595a.getStateDescription() : this.f7595a.getExtras().getCharSequence(f7582n);
    }

    public void S0(boolean z10) {
        this.f7595a.setCheckable(z10);
    }

    public void S1(String str) {
        this.f7595a.setViewIdResourceName(str);
    }

    public CharSequence T() {
        if (!d0()) {
            return this.f7595a.getText();
        }
        List<Integer> i10 = i(f7578j);
        List<Integer> i11 = i(f7579k);
        List<Integer> i12 = i(f7580l);
        List<Integer> i13 = i(f7577i);
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f7595a.getText(), 0, this.f7595a.getText().length()));
        for (int i14 = 0; i14 < i10.size(); i14++) {
            spannableString.setSpan(new a(i13.get(i14).intValue(), this, C().getInt(f7581m)), i10.get(i14).intValue(), i11.get(i14).intValue(), i12.get(i14).intValue());
        }
        return spannableString;
    }

    public void T0(boolean z10) {
        this.f7595a.setChecked(z10);
    }

    public void T1(boolean z10) {
        this.f7595a.setVisibleToUser(z10);
    }

    public int U() {
        return this.f7595a.getTextSelectionEnd();
    }

    public void U0(CharSequence charSequence) {
        this.f7595a.setClassName(charSequence);
    }

    public AccessibilityNodeInfo U1() {
        return this.f7595a;
    }

    public int V() {
        return this.f7595a.getTextSelectionStart();
    }

    public void V0(boolean z10) {
        this.f7595a.setClickable(z10);
    }

    @o0
    public CharSequence W() {
        return Build.VERSION.SDK_INT >= 28 ? this.f7595a.getTooltipText() : this.f7595a.getExtras().getCharSequence(f7571f);
    }

    public void W0(Object obj) {
        this.f7595a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((b) obj).f7627a);
    }

    @o0
    public e X() {
        AccessibilityNodeInfo$TouchDelegateInfo a10;
        if (Build.VERSION.SDK_INT < 29 || (a10 = this.f7595a.getTouchDelegateInfo()) == null) {
            return null;
        }
        return new e(a10);
    }

    public void X0(Object obj) {
        this.f7595a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((c) obj).f7628a);
    }

    public z Y() {
        return W1(this.f7595a.getTraversalAfter());
    }

    public void Y0(CharSequence charSequence) {
        this.f7595a.setContentDescription(charSequence);
    }

    public z Z() {
        return W1(this.f7595a.getTraversalBefore());
    }

    public void Z0(boolean z10) {
        this.f7595a.setContentInvalid(z10);
    }

    public void a(int i10) {
        this.f7595a.addAction(i10);
    }

    public String a0() {
        return this.f7595a.getViewIdResourceName();
    }

    public void a1(boolean z10) {
        this.f7595a.setContextClickable(z10);
    }

    public void b(a aVar) {
        this.f7595a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f7620a);
    }

    public f0 b0() {
        return f0.r(this.f7595a.getWindow());
    }

    public void b1(boolean z10) {
        this.f7595a.setDismissable(z10);
    }

    public void c(View view) {
        this.f7595a.addChild(view);
    }

    public int c0() {
        return this.f7595a.getWindowId();
    }

    public void c1(int i10) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f7595a.setDrawingOrder(i10);
        }
    }

    public void d(View view, int i10) {
        this.f7595a.addChild(view, i10);
    }

    public final boolean d0() {
        return !i(f7578j).isEmpty();
    }

    public void d1(boolean z10) {
        this.f7595a.setEditable(z10);
    }

    public final void e(ClickableSpan clickableSpan, Spanned spanned, int i10) {
        i(f7578j).add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        i(f7579k).add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        i(f7580l).add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        i(f7577i).add(Integer.valueOf(i10));
    }

    public final int e0(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                if (clickableSpan.equals((ClickableSpan) sparseArray.valueAt(i10).get())) {
                    return sparseArray.keyAt(i10);
                }
            }
        }
        int i11 = f7576h0;
        f7576h0 = i11 + 1;
        return i11;
    }

    public void e1(boolean z10) {
        this.f7595a.setEnabled(z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f7595a;
        if (accessibilityNodeInfo == null) {
            if (zVar.f7595a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(zVar.f7595a)) {
            return false;
        }
        return this.f7597c == zVar.f7597c && this.f7596b == zVar.f7596b;
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    public void f(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            h();
            M0(view);
            ClickableSpan[] w10 = w(charSequence);
            if (w10 != null && w10.length > 0) {
                C().putInt(f7581m, a.e.accessibility_action_clickable_span);
                SparseArray<WeakReference<ClickableSpan>> L2 = L(view);
                for (int i10 = 0; i10 < w10.length; i10++) {
                    int e02 = e0(w10[i10], L2);
                    L2.put(e02, new WeakReference(w10[i10]));
                    e(w10[i10], (Spanned) charSequence, e02);
                }
            }
        }
    }

    public boolean f0() {
        return this.f7595a.isAccessibilityFocused();
    }

    public void f1(CharSequence charSequence) {
        this.f7595a.setError(charSequence);
    }

    public boolean g() {
        return this.f7595a.canOpenPopup();
    }

    public boolean g0() {
        return this.f7595a.isCheckable();
    }

    public void g1(boolean z10) {
        this.f7595a.setFocusable(z10);
    }

    public final void h() {
        this.f7595a.getExtras().remove(f7578j);
        this.f7595a.getExtras().remove(f7579k);
        this.f7595a.getExtras().remove(f7580l);
        this.f7595a.getExtras().remove(f7577i);
    }

    public boolean h0() {
        return this.f7595a.isChecked();
    }

    public void h1(boolean z10) {
        this.f7595a.setFocused(z10);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f7595a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final List<Integer> i(String str) {
        ArrayList<Integer> integerArrayList = this.f7595a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList arrayList = new ArrayList();
        this.f7595a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public boolean i0() {
        return this.f7595a.isClickable();
    }

    public void i1(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f7595a.setHeading(z10);
        } else {
            O0(2, z10);
        }
    }

    public List<z> j(String str) {
        ArrayList arrayList = new ArrayList();
        List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText = this.f7595a.findAccessibilityNodeInfosByText(str);
        int size = findAccessibilityNodeInfosByText.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(V1(findAccessibilityNodeInfosByText.get(i10)));
        }
        return arrayList;
    }

    public boolean j0() {
        return this.f7595a.isContentInvalid();
    }

    public void j1(@o0 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f7595a.setHintText(charSequence);
        } else {
            this.f7595a.getExtras().putCharSequence(f7573g, charSequence);
        }
    }

    public List<z> k(String str) {
        List<AccessibilityNodeInfo> findAccessibilityNodeInfosByViewId = this.f7595a.findAccessibilityNodeInfosByViewId(str);
        ArrayList arrayList = new ArrayList();
        for (AccessibilityNodeInfo V1 : findAccessibilityNodeInfosByViewId) {
            arrayList.add(V1(V1));
        }
        return arrayList;
    }

    public boolean k0() {
        return this.f7595a.isContextClickable();
    }

    public void k1(boolean z10) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f7595a.setImportantForAccessibility(z10);
        }
    }

    public z l(int i10) {
        return W1(this.f7595a.findFocus(i10));
    }

    public boolean l0() {
        return this.f7595a.isDismissable();
    }

    public void l1(int i10) {
        this.f7595a.setInputType(i10);
    }

    public z m(int i10) {
        return W1(this.f7595a.focusSearch(i10));
    }

    public boolean m0() {
        return this.f7595a.isEditable();
    }

    public void m1(View view) {
        this.f7595a.setLabelFor(view);
    }

    public List<a> n() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f7595a.getActionList();
        if (actionList == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new a(actionList.get(i10)));
        }
        return arrayList;
    }

    public boolean n0() {
        return this.f7595a.isEnabled();
    }

    public void n1(View view, int i10) {
        this.f7595a.setLabelFor(view, i10);
    }

    public boolean o0() {
        return this.f7595a.isFocusable();
    }

    public void o1(View view) {
        this.f7595a.setLabeledBy(view);
    }

    public int p() {
        return this.f7595a.getActions();
    }

    public boolean p0() {
        return this.f7595a.isFocused();
    }

    public void p1(View view, int i10) {
        this.f7595a.setLabeledBy(view, i10);
    }

    public final boolean q(int i10) {
        Bundle C2 = C();
        return C2 != null && (C2.getInt(f7575h, 0) & i10) == i10;
    }

    public boolean q0() {
        if (Build.VERSION.SDK_INT >= 28) {
            return this.f7595a.isHeading();
        }
        if (q(2)) {
            return true;
        }
        c y10 = y();
        return y10 != null && y10.e();
    }

    public void q1(int i10) {
        this.f7595a.setLiveRegion(i10);
    }

    @Deprecated
    public void r(Rect rect) {
        this.f7595a.getBoundsInParent(rect);
    }

    public boolean r0() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.f7595a.isImportantForAccessibility();
        }
        return true;
    }

    public void r1(boolean z10) {
        this.f7595a.setLongClickable(z10);
    }

    public void s(Rect rect) {
        this.f7595a.getBoundsInScreen(rect);
    }

    public boolean s0() {
        return this.f7595a.isLongClickable();
    }

    public void s1(int i10) {
        this.f7595a.setMaxTextLength(i10);
    }

    public z t(int i10) {
        return W1(this.f7595a.getChild(i10));
    }

    public boolean t0() {
        return this.f7595a.isMultiLine();
    }

    public void t1(int i10) {
        this.f7595a.setMovementGranularities(i10);
    }

    @m0
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        r(rect);
        sb2.append("; boundsInParent: " + rect);
        s(rect);
        sb2.append("; boundsInScreen: " + rect);
        sb2.append("; packageName: ");
        sb2.append(M());
        sb2.append("; className: ");
        sb2.append(v());
        sb2.append("; text: ");
        sb2.append(T());
        sb2.append("; contentDescription: ");
        sb2.append(z());
        sb2.append("; viewId: ");
        sb2.append(a0());
        sb2.append("; checkable: ");
        sb2.append(g0());
        sb2.append("; checked: ");
        sb2.append(h0());
        sb2.append("; focusable: ");
        sb2.append(o0());
        sb2.append("; focused: ");
        sb2.append(p0());
        sb2.append("; selected: ");
        sb2.append(x0());
        sb2.append("; clickable: ");
        sb2.append(i0());
        sb2.append("; longClickable: ");
        sb2.append(s0());
        sb2.append("; enabled: ");
        sb2.append(n0());
        sb2.append("; password: ");
        sb2.append(u0());
        sb2.append("; scrollable: " + w0());
        sb2.append("; [");
        List<a> n10 = n();
        for (int i10 = 0; i10 < n10.size(); i10++) {
            a aVar = n10.get(i10);
            String o10 = o(aVar.b());
            if (o10.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                o10 = aVar.c().toString();
            }
            sb2.append(o10);
            if (i10 != n10.size() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public int u() {
        return this.f7595a.getChildCount();
    }

    public boolean u0() {
        return this.f7595a.isPassword();
    }

    public void u1(boolean z10) {
        this.f7595a.setMultiLine(z10);
    }

    public CharSequence v() {
        return this.f7595a.getClassName();
    }

    public boolean v0() {
        return Build.VERSION.SDK_INT >= 28 ? this.f7595a.isScreenReaderFocusable() : q(1);
    }

    public void v1(CharSequence charSequence) {
        this.f7595a.setPackageName(charSequence);
    }

    public boolean w0() {
        return this.f7595a.isScrollable();
    }

    public void w1(@o0 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f7595a.setPaneTitle(charSequence);
        } else {
            this.f7595a.getExtras().putCharSequence(f7569e, charSequence);
        }
    }

    public b x() {
        AccessibilityNodeInfo.CollectionInfo collectionInfo = this.f7595a.getCollectionInfo();
        if (collectionInfo != null) {
            return new b(collectionInfo);
        }
        return null;
    }

    public boolean x0() {
        return this.f7595a.isSelected();
    }

    public void x1(View view) {
        this.f7596b = -1;
        this.f7595a.setParent(view);
    }

    public c y() {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = this.f7595a.getCollectionItemInfo();
        if (collectionItemInfo != null) {
            return new c(collectionItemInfo);
        }
        return null;
    }

    public boolean y0() {
        return Build.VERSION.SDK_INT >= 26 ? this.f7595a.isShowingHintText() : q(4);
    }

    public void y1(View view, int i10) {
        this.f7596b = i10;
        this.f7595a.setParent(view, i10);
    }

    public CharSequence z() {
        return this.f7595a.getContentDescription();
    }

    public boolean z0() {
        return Build.VERSION.SDK_INT >= 29 ? this.f7595a.isTextEntryKey() : q(8);
    }

    public void z1(boolean z10) {
        this.f7595a.setPassword(z10);
    }
}
