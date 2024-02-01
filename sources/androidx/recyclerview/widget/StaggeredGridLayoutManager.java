package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import d.m0;
import d.o0;
import d.x0;
import g1.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class StaggeredGridLayoutManager extends RecyclerView.o implements RecyclerView.a0.b {
    public static final String Q = "StaggeredGridLManager";
    public static final boolean R = false;
    public static final int S = 0;
    public static final int T = 1;
    public static final int U = 0;
    @Deprecated
    public static final int V = 1;
    public static final int W = 2;
    public static final int X = Integer.MIN_VALUE;
    public static final float Y = 0.33333334f;
    public boolean A = false;
    public BitSet B;
    public int C = -1;
    public int D = Integer.MIN_VALUE;
    public LazySpanLookup E = new LazySpanLookup();
    public int F = 2;
    public boolean G;
    public boolean H;
    public SavedState I;
    public int J;
    public final Rect K = new Rect();
    public final b L = new b();
    public boolean M = false;
    public boolean N = true;
    public int[] O;
    public final Runnable P = new a();

    /* renamed from: s  reason: collision with root package name */
    public int f3308s = -1;

    /* renamed from: t  reason: collision with root package name */
    public d[] f3309t;
    @m0

    /* renamed from: u  reason: collision with root package name */
    public w f3310u;
    @m0

    /* renamed from: v  reason: collision with root package name */
    public w f3311v;

    /* renamed from: w  reason: collision with root package name */
    public int f3312w;

    /* renamed from: x  reason: collision with root package name */
    public int f3313x;
    @m0

    /* renamed from: y  reason: collision with root package name */
    public final p f3314y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f3315z = false;

    public static class LazySpanLookup {

        /* renamed from: c  reason: collision with root package name */
        public static final int f3316c = 10;

        /* renamed from: a  reason: collision with root package name */
        public int[] f3317a;

        /* renamed from: b  reason: collision with root package name */
        public List<FullSpanItem> f3318b;

        @SuppressLint({"BanParcelableUsage"})
        public static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new a();
            public int O;
            public int P;
            public int[] Q;
            public boolean R;

            public static class a implements Parcelable.Creator<FullSpanItem> {
                /* renamed from: a */
                public FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                /* renamed from: b */
                public FullSpanItem[] newArray(int i10) {
                    return new FullSpanItem[i10];
                }
            }

            public FullSpanItem() {
            }

            public FullSpanItem(Parcel parcel) {
                this.O = parcel.readInt();
                this.P = parcel.readInt();
                this.R = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.Q = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            public int a(int i10) {
                int[] iArr = this.Q;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i10];
            }

            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.O + ", mGapDir=" + this.P + ", mHasUnwantedGapAfter=" + this.R + ", mGapPerSpan=" + Arrays.toString(this.Q) + '}';
            }

            public void writeToParcel(Parcel parcel, int i10) {
                parcel.writeInt(this.O);
                parcel.writeInt(this.P);
                parcel.writeInt(this.R ? 1 : 0);
                int[] iArr = this.Q;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.Q);
            }
        }

        public void a(FullSpanItem fullSpanItem) {
            if (this.f3318b == null) {
                this.f3318b = new ArrayList();
            }
            int size = this.f3318b.size();
            for (int i10 = 0; i10 < size; i10++) {
                FullSpanItem fullSpanItem2 = this.f3318b.get(i10);
                if (fullSpanItem2.O == fullSpanItem.O) {
                    this.f3318b.remove(i10);
                }
                if (fullSpanItem2.O >= fullSpanItem.O) {
                    this.f3318b.add(i10, fullSpanItem);
                    return;
                }
            }
            this.f3318b.add(fullSpanItem);
        }

        public void b() {
            int[] iArr = this.f3317a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f3318b = null;
        }

        public void c(int i10) {
            int[] iArr = this.f3317a;
            if (iArr == null) {
                int[] iArr2 = new int[(Math.max(i10, 10) + 1)];
                this.f3317a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i10 >= iArr.length) {
                int[] iArr3 = new int[o(i10)];
                this.f3317a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f3317a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public int d(int i10) {
            List<FullSpanItem> list = this.f3318b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f3318b.get(size).O >= i10) {
                        this.f3318b.remove(size);
                    }
                }
            }
            return h(i10);
        }

        public FullSpanItem e(int i10, int i11, int i12, boolean z10) {
            List<FullSpanItem> list = this.f3318b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                FullSpanItem fullSpanItem = this.f3318b.get(i13);
                int i14 = fullSpanItem.O;
                if (i14 >= i11) {
                    return null;
                }
                if (i14 >= i10 && (i12 == 0 || fullSpanItem.P == i12 || (z10 && fullSpanItem.R))) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        public FullSpanItem f(int i10) {
            List<FullSpanItem> list = this.f3318b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f3318b.get(size);
                if (fullSpanItem.O == i10) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        public int g(int i10) {
            int[] iArr = this.f3317a;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            return iArr[i10];
        }

        public int h(int i10) {
            int[] iArr = this.f3317a;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            int i11 = i(i10);
            if (i11 == -1) {
                int[] iArr2 = this.f3317a;
                Arrays.fill(iArr2, i10, iArr2.length, -1);
                return this.f3317a.length;
            }
            int i12 = i11 + 1;
            Arrays.fill(this.f3317a, i10, i12, -1);
            return i12;
        }

        public final int i(int i10) {
            if (this.f3318b == null) {
                return -1;
            }
            FullSpanItem f10 = f(i10);
            if (f10 != null) {
                this.f3318b.remove(f10);
            }
            int size = this.f3318b.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    i11 = -1;
                    break;
                } else if (this.f3318b.get(i11).O >= i10) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 == -1) {
                return -1;
            }
            this.f3318b.remove(i11);
            return this.f3318b.get(i11).O;
        }

        public void j(int i10, int i11) {
            int[] iArr = this.f3317a;
            if (iArr != null && i10 < iArr.length) {
                int i12 = i10 + i11;
                c(i12);
                int[] iArr2 = this.f3317a;
                System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
                Arrays.fill(this.f3317a, i10, i12, -1);
                l(i10, i11);
            }
        }

        public void k(int i10, int i11) {
            int[] iArr = this.f3317a;
            if (iArr != null && i10 < iArr.length) {
                int i12 = i10 + i11;
                c(i12);
                int[] iArr2 = this.f3317a;
                System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
                int[] iArr3 = this.f3317a;
                Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
                m(i10, i11);
            }
        }

        public final void l(int i10, int i11) {
            List<FullSpanItem> list = this.f3318b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    FullSpanItem fullSpanItem = this.f3318b.get(size);
                    int i12 = fullSpanItem.O;
                    if (i12 >= i10) {
                        fullSpanItem.O = i12 + i11;
                    }
                }
            }
        }

        public final void m(int i10, int i11) {
            List<FullSpanItem> list = this.f3318b;
            if (list != null) {
                int i12 = i10 + i11;
                for (int size = list.size() - 1; size >= 0; size--) {
                    FullSpanItem fullSpanItem = this.f3318b.get(size);
                    int i13 = fullSpanItem.O;
                    if (i13 >= i10) {
                        if (i13 < i12) {
                            this.f3318b.remove(size);
                        } else {
                            fullSpanItem.O = i13 - i11;
                        }
                    }
                }
            }
        }

        public void n(int i10, d dVar) {
            c(i10);
            this.f3317a[i10] = dVar.f3334e;
        }

        public int o(int i10) {
            int length = this.f3317a.length;
            while (length <= i10) {
                length *= 2;
            }
            return length;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    @x0({x0.a.O})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int O;
        public int P;
        public int Q;
        public int[] R;
        public int S;
        public int[] T;
        public List<LazySpanLookup.FullSpanItem> U;
        public boolean V;
        public boolean W;
        public boolean X;

        public static class a implements Parcelable.Creator<SavedState> {
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
            this.P = parcel.readInt();
            int readInt = parcel.readInt();
            this.Q = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.R = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.S = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.T = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z10 = false;
            this.V = parcel.readInt() == 1;
            this.W = parcel.readInt() == 1;
            this.X = parcel.readInt() == 1 ? true : z10;
            this.U = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.Q = savedState.Q;
            this.O = savedState.O;
            this.P = savedState.P;
            this.R = savedState.R;
            this.S = savedState.S;
            this.T = savedState.T;
            this.V = savedState.V;
            this.W = savedState.W;
            this.X = savedState.X;
            this.U = savedState.U;
        }

        public void a() {
            this.R = null;
            this.Q = 0;
            this.O = -1;
            this.P = -1;
        }

        public void b() {
            this.R = null;
            this.Q = 0;
            this.S = 0;
            this.T = null;
            this.U = null;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.O);
            parcel.writeInt(this.P);
            parcel.writeInt(this.Q);
            if (this.Q > 0) {
                parcel.writeIntArray(this.R);
            }
            parcel.writeInt(this.S);
            if (this.S > 0) {
                parcel.writeIntArray(this.T);
            }
            parcel.writeInt(this.V ? 1 : 0);
            parcel.writeInt(this.W ? 1 : 0);
            parcel.writeInt(this.X ? 1 : 0);
            parcel.writeList(this.U);
        }
    }

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            StaggeredGridLayoutManager.this.q2();
        }
    }

    public class b {

        /* renamed from: a  reason: collision with root package name */
        public int f3319a;

        /* renamed from: b  reason: collision with root package name */
        public int f3320b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f3321c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f3322d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f3323e;

        /* renamed from: f  reason: collision with root package name */
        public int[] f3324f;

        public b() {
            c();
        }

        public void a() {
            this.f3320b = this.f3321c ? StaggeredGridLayoutManager.this.f3310u.i() : StaggeredGridLayoutManager.this.f3310u.n();
        }

        public void b(int i10) {
            this.f3320b = this.f3321c ? StaggeredGridLayoutManager.this.f3310u.i() - i10 : StaggeredGridLayoutManager.this.f3310u.n() + i10;
        }

        public void c() {
            this.f3319a = -1;
            this.f3320b = Integer.MIN_VALUE;
            this.f3321c = false;
            this.f3322d = false;
            this.f3323e = false;
            int[] iArr = this.f3324f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        public void d(d[] dVarArr) {
            int length = dVarArr.length;
            int[] iArr = this.f3324f;
            if (iArr == null || iArr.length < length) {
                this.f3324f = new int[StaggeredGridLayoutManager.this.f3309t.length];
            }
            for (int i10 = 0; i10 < length; i10++) {
                this.f3324f[i10] = dVarArr[i10].u(Integer.MIN_VALUE);
            }
        }
    }

    public static class c extends RecyclerView.p {

        /* renamed from: g  reason: collision with root package name */
        public static final int f3326g = -1;

        /* renamed from: e  reason: collision with root package name */
        public d f3327e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f3328f;

        public c(int i10, int i11) {
            super(i10, i11);
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(RecyclerView.p pVar) {
            super(pVar);
        }

        public final int h() {
            d dVar = this.f3327e;
            if (dVar == null) {
                return -1;
            }
            return dVar.f3334e;
        }

        public boolean i() {
            return this.f3328f;
        }

        public void j(boolean z10) {
            this.f3328f = z10;
        }
    }

    public class d {

        /* renamed from: g  reason: collision with root package name */
        public static final int f3329g = Integer.MIN_VALUE;

        /* renamed from: a  reason: collision with root package name */
        public ArrayList<View> f3330a = new ArrayList<>();

        /* renamed from: b  reason: collision with root package name */
        public int f3331b = Integer.MIN_VALUE;

        /* renamed from: c  reason: collision with root package name */
        public int f3332c = Integer.MIN_VALUE;

        /* renamed from: d  reason: collision with root package name */
        public int f3333d = 0;

        /* renamed from: e  reason: collision with root package name */
        public final int f3334e;

        public d(int i10) {
            this.f3334e = i10;
        }

        public void A(int i10) {
            this.f3331b = i10;
            this.f3332c = i10;
        }

        public void a(View view) {
            c s10 = s(view);
            s10.f3327e = this;
            this.f3330a.add(view);
            this.f3332c = Integer.MIN_VALUE;
            if (this.f3330a.size() == 1) {
                this.f3331b = Integer.MIN_VALUE;
            }
            if (s10.e() || s10.d()) {
                this.f3333d += StaggeredGridLayoutManager.this.f3310u.e(view);
            }
        }

        public void b(boolean z10, int i10) {
            int q10 = z10 ? q(Integer.MIN_VALUE) : u(Integer.MIN_VALUE);
            e();
            if (q10 != Integer.MIN_VALUE) {
                if (z10 && q10 < StaggeredGridLayoutManager.this.f3310u.i()) {
                    return;
                }
                if (z10 || q10 <= StaggeredGridLayoutManager.this.f3310u.n()) {
                    if (i10 != Integer.MIN_VALUE) {
                        q10 += i10;
                    }
                    this.f3332c = q10;
                    this.f3331b = q10;
                }
            }
        }

        public void c() {
            LazySpanLookup.FullSpanItem f10;
            ArrayList<View> arrayList = this.f3330a;
            View view = arrayList.get(arrayList.size() - 1);
            c s10 = s(view);
            this.f3332c = StaggeredGridLayoutManager.this.f3310u.d(view);
            if (s10.f3328f && (f10 = StaggeredGridLayoutManager.this.E.f(s10.b())) != null && f10.P == 1) {
                this.f3332c += f10.a(this.f3334e);
            }
        }

        public void d() {
            LazySpanLookup.FullSpanItem f10;
            View view = this.f3330a.get(0);
            c s10 = s(view);
            this.f3331b = StaggeredGridLayoutManager.this.f3310u.g(view);
            if (s10.f3328f && (f10 = StaggeredGridLayoutManager.this.E.f(s10.b())) != null && f10.P == -1) {
                this.f3331b -= f10.a(this.f3334e);
            }
        }

        public void e() {
            this.f3330a.clear();
            v();
            this.f3333d = 0;
        }

        public int f() {
            int i10;
            int i11;
            if (StaggeredGridLayoutManager.this.f3315z) {
                i11 = this.f3330a.size() - 1;
                i10 = -1;
            } else {
                i11 = 0;
                i10 = this.f3330a.size();
            }
            return n(i11, i10, true);
        }

        public int g() {
            int i10;
            int i11;
            if (StaggeredGridLayoutManager.this.f3315z) {
                i11 = this.f3330a.size() - 1;
                i10 = -1;
            } else {
                i11 = 0;
                i10 = this.f3330a.size();
            }
            return m(i11, i10, true);
        }

        public int h() {
            return StaggeredGridLayoutManager.this.f3315z ? n(this.f3330a.size() - 1, -1, false) : n(0, this.f3330a.size(), false);
        }

        public int i() {
            int i10;
            int i11;
            if (StaggeredGridLayoutManager.this.f3315z) {
                i11 = 0;
                i10 = this.f3330a.size();
            } else {
                i11 = this.f3330a.size() - 1;
                i10 = -1;
            }
            return n(i11, i10, true);
        }

        public int j() {
            int i10;
            int i11;
            if (StaggeredGridLayoutManager.this.f3315z) {
                i11 = 0;
                i10 = this.f3330a.size();
            } else {
                i11 = this.f3330a.size() - 1;
                i10 = -1;
            }
            return m(i11, i10, true);
        }

        public int k() {
            return StaggeredGridLayoutManager.this.f3315z ? n(0, this.f3330a.size(), false) : n(this.f3330a.size() - 1, -1, false);
        }

        public int l(int i10, int i11, boolean z10, boolean z11, boolean z12) {
            int n10 = StaggeredGridLayoutManager.this.f3310u.n();
            int i12 = StaggeredGridLayoutManager.this.f3310u.i();
            int i13 = i11 > i10 ? 1 : -1;
            while (i10 != i11) {
                View view = this.f3330a.get(i10);
                int g10 = StaggeredGridLayoutManager.this.f3310u.g(view);
                int d10 = StaggeredGridLayoutManager.this.f3310u.d(view);
                boolean z13 = false;
                boolean z14 = !z12 ? g10 < i12 : g10 <= i12;
                if (!z12 ? d10 > n10 : d10 >= n10) {
                    z13 = true;
                }
                if (z14 && z13) {
                    if (!z10 || !z11) {
                        if (!z11 && g10 >= n10 && d10 <= i12) {
                        }
                    } else if (g10 >= n10 && d10 <= i12) {
                    }
                    return StaggeredGridLayoutManager.this.s0(view);
                }
                i10 += i13;
            }
            return -1;
        }

        public int m(int i10, int i11, boolean z10) {
            return l(i10, i11, false, false, z10);
        }

        public int n(int i10, int i11, boolean z10) {
            return l(i10, i11, z10, true, false);
        }

        public int o() {
            return this.f3333d;
        }

        public int p() {
            int i10 = this.f3332c;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            c();
            return this.f3332c;
        }

        public int q(int i10) {
            int i11 = this.f3332c;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f3330a.size() == 0) {
                return i10;
            }
            c();
            return this.f3332c;
        }

        public View r(int i10, int i11) {
            View view = null;
            if (i11 != -1) {
                int size = this.f3330a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f3330a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f3315z && staggeredGridLayoutManager.s0(view2) >= i10) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f3315z && staggeredGridLayoutManager2.s0(view2) <= i10) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f3330a.size();
                int i12 = 0;
                while (i12 < size2) {
                    View view3 = this.f3330a.get(i12);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f3315z && staggeredGridLayoutManager3.s0(view3) <= i10) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f3315z && staggeredGridLayoutManager4.s0(view3) >= i10) || !view3.hasFocusable()) {
                        break;
                    }
                    i12++;
                    view = view3;
                }
            }
            return view;
        }

        public c s(View view) {
            return (c) view.getLayoutParams();
        }

        public int t() {
            int i10 = this.f3331b;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            d();
            return this.f3331b;
        }

        public int u(int i10) {
            int i11 = this.f3331b;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f3330a.size() == 0) {
                return i10;
            }
            d();
            return this.f3331b;
        }

        public void v() {
            this.f3331b = Integer.MIN_VALUE;
            this.f3332c = Integer.MIN_VALUE;
        }

        public void w(int i10) {
            int i11 = this.f3331b;
            if (i11 != Integer.MIN_VALUE) {
                this.f3331b = i11 + i10;
            }
            int i12 = this.f3332c;
            if (i12 != Integer.MIN_VALUE) {
                this.f3332c = i12 + i10;
            }
        }

        public void x() {
            int size = this.f3330a.size();
            View remove = this.f3330a.remove(size - 1);
            c s10 = s(remove);
            s10.f3327e = null;
            if (s10.e() || s10.d()) {
                this.f3333d -= StaggeredGridLayoutManager.this.f3310u.e(remove);
            }
            if (size == 1) {
                this.f3331b = Integer.MIN_VALUE;
            }
            this.f3332c = Integer.MIN_VALUE;
        }

        public void y() {
            View remove = this.f3330a.remove(0);
            c s10 = s(remove);
            s10.f3327e = null;
            if (this.f3330a.size() == 0) {
                this.f3332c = Integer.MIN_VALUE;
            }
            if (s10.e() || s10.d()) {
                this.f3333d -= StaggeredGridLayoutManager.this.f3310u.e(remove);
            }
            this.f3331b = Integer.MIN_VALUE;
        }

        public void z(View view) {
            c s10 = s(view);
            s10.f3327e = this;
            this.f3330a.add(0, view);
            this.f3331b = Integer.MIN_VALUE;
            if (this.f3330a.size() == 1) {
                this.f3332c = Integer.MIN_VALUE;
            }
            if (s10.e() || s10.d()) {
                this.f3333d += StaggeredGridLayoutManager.this.f3310u.e(view);
            }
        }
    }

    public StaggeredGridLayoutManager(int i10, int i11) {
        this.f3312w = i11;
        r3(i10);
        this.f3314y = new p();
        y2();
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        RecyclerView.o.d t02 = RecyclerView.o.t0(context, attributeSet, i10, i11);
        p3(t02.f3282a);
        r3(t02.f3283b);
        q3(t02.f3284c);
        this.f3314y = new p();
        y2();
    }

    public int[] A2(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f3308s];
        } else if (iArr.length < this.f3308s) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f3308s + ", array size:" + iArr.length);
        }
        for (int i10 = 0; i10 < this.f3308s; i10++) {
            iArr[i10] = this.f3309t[i10].f();
        }
        return iArr;
    }

    public final int B2(int i10) {
        int Q2 = Q();
        for (int i11 = 0; i11 < Q2; i11++) {
            int s02 = s0(P(i11));
            if (s02 >= 0 && s02 < i10) {
                return s02;
            }
        }
        return 0;
    }

    public View C2(boolean z10) {
        int n10 = this.f3310u.n();
        int i10 = this.f3310u.i();
        View view = null;
        for (int Q2 = Q() - 1; Q2 >= 0; Q2--) {
            View P2 = P(Q2);
            int g10 = this.f3310u.g(P2);
            int d10 = this.f3310u.d(P2);
            if (d10 > n10 && g10 < i10) {
                if (d10 <= i10 || !z10) {
                    return P2;
                }
                if (view == null) {
                    view = P2;
                }
            }
        }
        return view;
    }

    public View D2(boolean z10) {
        int n10 = this.f3310u.n();
        int i10 = this.f3310u.i();
        int Q2 = Q();
        View view = null;
        for (int i11 = 0; i11 < Q2; i11++) {
            View P2 = P(i11);
            int g10 = this.f3310u.g(P2);
            if (this.f3310u.d(P2) > n10 && g10 < i10) {
                if (g10 >= n10 || !z10) {
                    return P2;
                }
                if (view == null) {
                    view = P2;
                }
            }
        }
        return view;
    }

    public int E2() {
        View C2 = this.A ? C2(true) : D2(true);
        if (C2 == null) {
            return -1;
        }
        return s0(C2);
    }

    public boolean F0() {
        return this.F != 0;
    }

    public int[] F2(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f3308s];
        } else if (iArr.length < this.f3308s) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f3308s + ", array size:" + iArr.length);
        }
        for (int i10 = 0; i10 < this.f3308s; i10++) {
            iArr[i10] = this.f3309t[i10].h();
        }
        return iArr;
    }

    public int[] G2(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f3308s];
        } else if (iArr.length < this.f3308s) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f3308s + ", array size:" + iArr.length);
        }
        for (int i10 = 0; i10 < this.f3308s; i10++) {
            iArr[i10] = this.f3309t[i10].i();
        }
        return iArr;
    }

    public final int H2(int i10) {
        for (int Q2 = Q() - 1; Q2 >= 0; Q2--) {
            int s02 = s0(P(Q2));
            if (s02 >= 0 && s02 < i10) {
                return s02;
            }
        }
        return 0;
    }

    public int[] I2(int[] iArr) {
        if (iArr == null) {
            iArr = new int[this.f3308s];
        } else if (iArr.length < this.f3308s) {
            throw new IllegalArgumentException("Provided int[]'s size must be more than or equal to span count. Expected:" + this.f3308s + ", array size:" + iArr.length);
        }
        for (int i10 = 0; i10 < this.f3308s; i10++) {
            iArr[i10] = this.f3309t[i10].k();
        }
        return iArr;
    }

    public final void J2(RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z10) {
        int i10;
        int O2 = O2(Integer.MIN_VALUE);
        if (O2 != Integer.MIN_VALUE && (i10 = this.f3310u.i() - O2) > 0) {
            int i11 = i10 - (-l3(-i10, wVar, b0Var));
            if (z10 && i11 > 0) {
                this.f3310u.t(i11);
            }
        }
    }

    public RecyclerView.p K() {
        return this.f3312w == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    public final void K2(RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z10) {
        int n10;
        int R2 = R2(Integer.MAX_VALUE);
        if (R2 != Integer.MAX_VALUE && (n10 = R2 - this.f3310u.n()) > 0) {
            int l32 = n10 - l3(n10, wVar, b0Var);
            if (z10 && l32 > 0) {
                this.f3310u.t(-l32);
            }
        }
    }

    public RecyclerView.p L(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    public int L2() {
        if (Q() == 0) {
            return 0;
        }
        return s0(P(0));
    }

    public RecyclerView.p M(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    public int M2() {
        return this.F;
    }

    public int N2() {
        int Q2 = Q();
        if (Q2 == 0) {
            return 0;
        }
        return s0(P(Q2 - 1));
    }

    public final int O2(int i10) {
        int q10 = this.f3309t[0].q(i10);
        for (int i11 = 1; i11 < this.f3308s; i11++) {
            int q11 = this.f3309t[i11].q(i10);
            if (q11 > q10) {
                q10 = q11;
            }
        }
        return q10;
    }

    public final int P2(int i10) {
        int u10 = this.f3309t[0].u(i10);
        for (int i11 = 1; i11 < this.f3308s; i11++) {
            int u11 = this.f3309t[i11].u(i10);
            if (u11 > u10) {
                u10 = u11;
            }
        }
        return u10;
    }

    public int Q1(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        return l3(i10, wVar, b0Var);
    }

    public final int Q2(int i10) {
        int q10 = this.f3309t[0].q(i10);
        for (int i11 = 1; i11 < this.f3308s; i11++) {
            int q11 = this.f3309t[i11].q(i10);
            if (q11 < q10) {
                q10 = q11;
            }
        }
        return q10;
    }

    public void R1(int i10) {
        SavedState savedState = this.I;
        if (!(savedState == null || savedState.O == i10)) {
            savedState.a();
        }
        this.C = i10;
        this.D = Integer.MIN_VALUE;
        N1();
    }

    public final int R2(int i10) {
        int u10 = this.f3309t[0].u(i10);
        for (int i11 = 1; i11 < this.f3308s; i11++) {
            int u11 = this.f3309t[i11].u(i10);
            if (u11 < u10) {
                u10 = u11;
            }
        }
        return u10;
    }

    public int S1(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        return l3(i10, wVar, b0Var);
    }

    public final d S2(p pVar) {
        int i10;
        int i11;
        int i12 = -1;
        if (d3(pVar.f3672e)) {
            i11 = this.f3308s - 1;
            i10 = -1;
        } else {
            i11 = 0;
            i12 = this.f3308s;
            i10 = 1;
        }
        d dVar = null;
        if (pVar.f3672e == 1) {
            int i13 = Integer.MAX_VALUE;
            int n10 = this.f3310u.n();
            while (i11 != i12) {
                d dVar2 = this.f3309t[i11];
                int q10 = dVar2.q(n10);
                if (q10 < i13) {
                    dVar = dVar2;
                    i13 = q10;
                }
                i11 += i10;
            }
            return dVar;
        }
        int i14 = Integer.MIN_VALUE;
        int i15 = this.f3310u.i();
        while (i11 != i12) {
            d dVar3 = this.f3309t[i11];
            int u10 = dVar3.u(i15);
            if (u10 > i14) {
                dVar = dVar3;
                i14 = u10;
            }
            i11 += i10;
        }
        return dVar;
    }

    public void T0(int i10) {
        super.T0(i10);
        for (int i11 = 0; i11 < this.f3308s; i11++) {
            this.f3309t[i11].w(i10);
        }
    }

    public int T2() {
        return this.f3312w;
    }

    public void U0(int i10) {
        super.U0(i10);
        for (int i11 = 0; i11 < this.f3308s; i11++) {
            this.f3309t[i11].w(i10);
        }
    }

    public boolean U2() {
        return this.f3315z;
    }

    public int V(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        return this.f3312w == 1 ? this.f3308s : super.V(wVar, b0Var);
    }

    public int V2() {
        return this.f3308s;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void W2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.A
            if (r0 == 0) goto L_0x0009
            int r0 = r6.N2()
            goto L_0x000d
        L_0x0009:
            int r0 = r6.L2()
        L_0x000d:
            r1 = 8
            if (r9 != r1) goto L_0x001a
            if (r7 >= r8) goto L_0x0016
            int r2 = r8 + 1
            goto L_0x001c
        L_0x0016:
            int r2 = r7 + 1
            r3 = r8
            goto L_0x001d
        L_0x001a:
            int r2 = r7 + r8
        L_0x001c:
            r3 = r7
        L_0x001d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r6.E
            r4.h(r3)
            r4 = 1
            if (r9 == r4) goto L_0x003c
            r5 = 2
            if (r9 == r5) goto L_0x0036
            if (r9 == r1) goto L_0x002b
            goto L_0x0041
        L_0x002b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.E
            r9.k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r7 = r6.E
            r7.j(r8, r4)
            goto L_0x0041
        L_0x0036:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.E
            r9.k(r7, r8)
            goto L_0x0041
        L_0x003c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.E
            r9.j(r7, r8)
        L_0x0041:
            if (r2 > r0) goto L_0x0044
            return
        L_0x0044:
            boolean r7 = r6.A
            if (r7 == 0) goto L_0x004d
            int r7 = r6.L2()
            goto L_0x0051
        L_0x004d:
            int r7 = r6.N2()
        L_0x0051:
            if (r3 > r7) goto L_0x0056
            r6.N1()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.W2(int, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0086, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008a, code lost:
        r10 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View X2() {
        /*
            r12 = this;
            int r0 = r12.Q()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f3308s
            r2.<init>(r3)
            int r3 = r12.f3308s
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f3312w
            r5 = -1
            if (r3 != r1) goto L_0x0020
            boolean r3 = r12.Z2()
            if (r3 == 0) goto L_0x0020
            r3 = r1
            goto L_0x0021
        L_0x0020:
            r3 = r5
        L_0x0021:
            boolean r6 = r12.A
            if (r6 == 0) goto L_0x0027
            r6 = r5
            goto L_0x002b
        L_0x0027:
            int r0 = r0 + 1
            r6 = r0
            r0 = r4
        L_0x002b:
            if (r0 >= r6) goto L_0x002e
            r5 = r1
        L_0x002e:
            if (r0 == r6) goto L_0x00ab
            android.view.View r7 = r12.P(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.f3327e
            int r9 = r9.f3334e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L_0x0054
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.f3327e
            boolean r9 = r12.r2(r9)
            if (r9 == 0) goto L_0x004d
            return r7
        L_0x004d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r8.f3327e
            int r9 = r9.f3334e
            r2.clear(r9)
        L_0x0054:
            boolean r9 = r8.f3328f
            if (r9 == 0) goto L_0x0059
            goto L_0x00a9
        L_0x0059:
            int r9 = r0 + r5
            if (r9 == r6) goto L_0x00a9
            android.view.View r9 = r12.P(r9)
            boolean r10 = r12.A
            if (r10 == 0) goto L_0x0077
            androidx.recyclerview.widget.w r10 = r12.f3310u
            int r10 = r10.d(r7)
            androidx.recyclerview.widget.w r11 = r12.f3310u
            int r11 = r11.d(r9)
            if (r10 >= r11) goto L_0x0074
            return r7
        L_0x0074:
            if (r10 != r11) goto L_0x008a
            goto L_0x0088
        L_0x0077:
            androidx.recyclerview.widget.w r10 = r12.f3310u
            int r10 = r10.g(r7)
            androidx.recyclerview.widget.w r11 = r12.f3310u
            int r11 = r11.g(r9)
            if (r10 <= r11) goto L_0x0086
            return r7
        L_0x0086:
            if (r10 != r11) goto L_0x008a
        L_0x0088:
            r10 = r1
            goto L_0x008b
        L_0x008a:
            r10 = r4
        L_0x008b:
            if (r10 == 0) goto L_0x00a9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r8 = r8.f3327e
            int r8 = r8.f3334e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r9.f3327e
            int r9 = r9.f3334e
            int r8 = r8 - r9
            if (r8 >= 0) goto L_0x00a0
            r8 = r1
            goto L_0x00a1
        L_0x00a0:
            r8 = r4
        L_0x00a1:
            if (r3 >= 0) goto L_0x00a5
            r9 = r1
            goto L_0x00a6
        L_0x00a5:
            r9 = r4
        L_0x00a6:
            if (r8 == r9) goto L_0x00a9
            return r7
        L_0x00a9:
            int r0 = r0 + r5
            goto L_0x002e
        L_0x00ab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.X2():android.view.View");
    }

    public void Y1(Rect rect, int i10, int i11) {
        int i12;
        int i13;
        int o02 = o0() + p0();
        int r02 = r0() + m0();
        if (this.f3312w == 1) {
            i13 = RecyclerView.o.q(i11, rect.height() + r02, k0());
            i12 = RecyclerView.o.q(i10, (this.f3313x * this.f3308s) + o02, l0());
        } else {
            i12 = RecyclerView.o.q(i10, rect.width() + o02, l0());
            i13 = RecyclerView.o.q(i11, (this.f3313x * this.f3308s) + r02, k0());
        }
        X1(i12, i13);
    }

    public void Y2() {
        this.E.b();
        N1();
    }

    public void Z0(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.Z0(recyclerView, wVar);
        H1(this.P);
        for (int i10 = 0; i10 < this.f3308s; i10++) {
            this.f3309t[i10].e();
        }
        recyclerView.requestLayout();
    }

    public boolean Z2() {
        return i0() == 1;
    }

    public PointF a(int i10) {
        int p22 = p2(i10);
        PointF pointF = new PointF();
        if (p22 == 0) {
            return null;
        }
        if (this.f3312w == 0) {
            pointF.x = (float) p22;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) p22;
        }
        return pointF;
    }

    @o0
    public View a1(View view, int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        View I2;
        View r10;
        if (Q() == 0 || (I2 = I(view)) == null) {
            return null;
        }
        k3();
        int v22 = v2(i10);
        if (v22 == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) I2.getLayoutParams();
        boolean z10 = cVar.f3328f;
        d dVar = cVar.f3327e;
        int N2 = v22 == 1 ? N2() : L2();
        w3(N2, b0Var);
        o3(v22);
        p pVar = this.f3314y;
        pVar.f3670c = pVar.f3671d + N2;
        pVar.f3669b = (int) (((float) this.f3310u.o()) * 0.33333334f);
        p pVar2 = this.f3314y;
        pVar2.f3675h = true;
        pVar2.f3668a = false;
        z2(wVar, pVar2, b0Var);
        this.G = this.A;
        if (!z10 && (r10 = dVar.r(N2, v22)) != null && r10 != I2) {
            return r10;
        }
        if (d3(v22)) {
            for (int i11 = this.f3308s - 1; i11 >= 0; i11--) {
                View r11 = this.f3309t[i11].r(N2, v22);
                if (r11 != null && r11 != I2) {
                    return r11;
                }
            }
        } else {
            for (int i12 = 0; i12 < this.f3308s; i12++) {
                View r12 = this.f3309t[i12].r(N2, v22);
                if (r12 != null && r12 != I2) {
                    return r12;
                }
            }
        }
        boolean z11 = (this.f3315z ^ true) == (v22 == -1);
        if (!z10) {
            View J2 = J(z11 ? dVar.g() : dVar.j());
            if (!(J2 == null || J2 == I2)) {
                return J2;
            }
        }
        if (d3(v22)) {
            for (int i13 = this.f3308s - 1; i13 >= 0; i13--) {
                if (i13 != dVar.f3334e) {
                    d[] dVarArr = this.f3309t;
                    View J3 = J(z11 ? dVarArr[i13].g() : dVarArr[i13].j());
                    if (!(J3 == null || J3 == I2)) {
                        return J3;
                    }
                }
            }
        } else {
            for (int i14 = 0; i14 < this.f3308s; i14++) {
                d[] dVarArr2 = this.f3309t;
                View J4 = J(z11 ? dVarArr2[i14].g() : dVarArr2[i14].j());
                if (J4 != null && J4 != I2) {
                    return J4;
                }
            }
        }
        return null;
    }

    public final void a3(View view, int i10, int i11, boolean z10) {
        m(view, this.K);
        c cVar = (c) view.getLayoutParams();
        int i12 = cVar.leftMargin;
        Rect rect = this.K;
        int z32 = z3(i10, i12 + rect.left, cVar.rightMargin + rect.right);
        int i13 = cVar.topMargin;
        Rect rect2 = this.K;
        int z33 = z3(i11, i13 + rect2.top, cVar.bottomMargin + rect2.bottom);
        if (z10 ? e2(view, z32, z33, cVar) : c2(view, z32, z33, cVar)) {
            view.measure(z32, z33);
        }
    }

    public void b1(AccessibilityEvent accessibilityEvent) {
        super.b1(accessibilityEvent);
        if (Q() > 0) {
            View D2 = D2(false);
            View C2 = C2(false);
            if (D2 != null && C2 != null) {
                int s02 = s0(D2);
                int s03 = s0(C2);
                if (s02 < s03) {
                    accessibilityEvent.setFromIndex(s02);
                    accessibilityEvent.setToIndex(s03);
                    return;
                }
                accessibilityEvent.setFromIndex(s03);
                accessibilityEvent.setToIndex(s02);
            }
        }
    }

    public final void b3(View view, c cVar, boolean z10) {
        int i10;
        int i11;
        if (cVar.f3328f) {
            if (this.f3312w == 1) {
                i11 = this.J;
            } else {
                a3(view, RecyclerView.o.R(z0(), A0(), o0() + p0(), cVar.width, true), this.J, z10);
                return;
            }
        } else if (this.f3312w == 1) {
            i11 = RecyclerView.o.R(this.f3313x, A0(), 0, cVar.width, false);
        } else {
            i11 = RecyclerView.o.R(z0(), A0(), o0() + p0(), cVar.width, true);
            i10 = RecyclerView.o.R(this.f3313x, f0(), 0, cVar.height, false);
            a3(view, i11, i10, z10);
        }
        i10 = RecyclerView.o.R(e0(), f0(), r0() + m0(), cVar.height, true);
        a3(view, i11, i10, z10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x014b, code lost:
        if (q2() != false) goto L_0x014f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c3(androidx.recyclerview.widget.RecyclerView.w r9, androidx.recyclerview.widget.RecyclerView.b0 r10, boolean r11) {
        /*
            r8 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r0 = r8.L
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r1 = r8.I
            r2 = -1
            if (r1 != 0) goto L_0x000b
            int r1 = r8.C
            if (r1 == r2) goto L_0x0018
        L_0x000b:
            int r1 = r10.d()
            if (r1 != 0) goto L_0x0018
            r8.D1(r9)
            r0.c()
            return
        L_0x0018:
            boolean r1 = r0.f3323e
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0029
            int r1 = r8.C
            if (r1 != r2) goto L_0x0029
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r1 = r8.I
            if (r1 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r1 = r3
            goto L_0x002a
        L_0x0029:
            r1 = r4
        L_0x002a:
            if (r1 == 0) goto L_0x0043
            r0.c()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r5 = r8.I
            if (r5 == 0) goto L_0x0037
            r8.l2(r0)
            goto L_0x003e
        L_0x0037:
            r8.k3()
            boolean r5 = r8.A
            r0.f3321c = r5
        L_0x003e:
            r8.v3(r10, r0)
            r0.f3323e = r4
        L_0x0043:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r5 = r8.I
            if (r5 != 0) goto L_0x0060
            int r5 = r8.C
            if (r5 != r2) goto L_0x0060
            boolean r5 = r0.f3321c
            boolean r6 = r8.G
            if (r5 != r6) goto L_0x0059
            boolean r5 = r8.Z2()
            boolean r6 = r8.H
            if (r5 == r6) goto L_0x0060
        L_0x0059:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r5 = r8.E
            r5.b()
            r0.f3322d = r4
        L_0x0060:
            int r5 = r8.Q()
            if (r5 <= 0) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r5 = r8.I
            if (r5 == 0) goto L_0x006e
            int r5 = r5.Q
            if (r5 >= r4) goto L_0x00c9
        L_0x006e:
            boolean r5 = r0.f3322d
            if (r5 == 0) goto L_0x008e
            r1 = r3
        L_0x0073:
            int r5 = r8.f3308s
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r5 = r8.f3309t
            r5 = r5[r1]
            r5.e()
            int r5 = r0.f3320b
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r6) goto L_0x008b
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r6 = r8.f3309t
            r6 = r6[r1]
            r6.A(r5)
        L_0x008b:
            int r1 = r1 + 1
            goto L_0x0073
        L_0x008e:
            if (r1 != 0) goto L_0x00af
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r8.L
            int[] r1 = r1.f3324f
            if (r1 != 0) goto L_0x0097
            goto L_0x00af
        L_0x0097:
            r1 = r3
        L_0x0098:
            int r5 = r8.f3308s
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r5 = r8.f3309t
            r5 = r5[r1]
            r5.e()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r6 = r8.L
            int[] r6 = r6.f3324f
            r6 = r6[r1]
            r5.A(r6)
            int r1 = r1 + 1
            goto L_0x0098
        L_0x00af:
            r1 = r3
        L_0x00b0:
            int r5 = r8.f3308s
            if (r1 >= r5) goto L_0x00c2
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r5 = r8.f3309t
            r5 = r5[r1]
            boolean r6 = r8.A
            int r7 = r0.f3320b
            r5.b(r6, r7)
            int r1 = r1 + 1
            goto L_0x00b0
        L_0x00c2:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r8.L
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d[] r5 = r8.f3309t
            r1.d(r5)
        L_0x00c9:
            r8.z(r9)
            androidx.recyclerview.widget.p r1 = r8.f3314y
            r1.f3668a = r3
            r8.M = r3
            androidx.recyclerview.widget.w r1 = r8.f3311v
            int r1 = r1.o()
            r8.x3(r1)
            int r1 = r0.f3319a
            r8.w3(r1, r10)
            boolean r1 = r0.f3321c
            if (r1 == 0) goto L_0x00f0
            r8.o3(r2)
            androidx.recyclerview.widget.p r1 = r8.f3314y
            r8.z2(r9, r1, r10)
            r8.o3(r4)
            goto L_0x00fb
        L_0x00f0:
            r8.o3(r4)
            androidx.recyclerview.widget.p r1 = r8.f3314y
            r8.z2(r9, r1, r10)
            r8.o3(r2)
        L_0x00fb:
            androidx.recyclerview.widget.p r1 = r8.f3314y
            int r2 = r0.f3319a
            int r5 = r1.f3671d
            int r2 = r2 + r5
            r1.f3670c = r2
            r8.z2(r9, r1, r10)
            r8.j3()
            int r1 = r8.Q()
            if (r1 <= 0) goto L_0x0121
            boolean r1 = r8.A
            if (r1 == 0) goto L_0x011b
            r8.J2(r9, r10, r4)
            r8.K2(r9, r10, r3)
            goto L_0x0121
        L_0x011b:
            r8.K2(r9, r10, r4)
            r8.J2(r9, r10, r3)
        L_0x0121:
            if (r11 == 0) goto L_0x014e
            boolean r11 = r10.j()
            if (r11 != 0) goto L_0x014e
            int r11 = r8.F
            if (r11 == 0) goto L_0x013f
            int r11 = r8.Q()
            if (r11 <= 0) goto L_0x013f
            boolean r11 = r8.M
            if (r11 != 0) goto L_0x013d
            android.view.View r11 = r8.X2()
            if (r11 == 0) goto L_0x013f
        L_0x013d:
            r11 = r4
            goto L_0x0140
        L_0x013f:
            r11 = r3
        L_0x0140:
            if (r11 == 0) goto L_0x014e
            java.lang.Runnable r11 = r8.P
            r8.H1(r11)
            boolean r11 = r8.q2()
            if (r11 == 0) goto L_0x014e
            goto L_0x014f
        L_0x014e:
            r4 = r3
        L_0x014f:
            boolean r11 = r10.j()
            if (r11 == 0) goto L_0x015a
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r11 = r8.L
            r11.c()
        L_0x015a:
            boolean r11 = r0.f3321c
            r8.G = r11
            boolean r11 = r8.Z2()
            r8.H = r11
            if (r4 == 0) goto L_0x016e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r11 = r8.L
            r11.c()
            r8.c3(r9, r10, r3)
        L_0x016e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.c3(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$b0, boolean):void");
    }

    public final boolean d3(int i10) {
        if (this.f3312w == 0) {
            return (i10 == -1) != this.A;
        }
        return ((i10 == -1) == this.A) == Z2();
    }

    public void e3(int i10, RecyclerView.b0 b0Var) {
        int i11;
        int i12;
        if (i10 > 0) {
            i12 = N2();
            i11 = 1;
        } else {
            i11 = -1;
            i12 = L2();
        }
        this.f3314y.f3668a = true;
        w3(i12, b0Var);
        o3(i11);
        p pVar = this.f3314y;
        pVar.f3670c = i12 + pVar.f3671d;
        pVar.f3669b = Math.abs(i10);
    }

    public void f2(RecyclerView recyclerView, RecyclerView.b0 b0Var, int i10) {
        q qVar = new q(recyclerView.getContext());
        qVar.q(i10);
        g2(qVar);
    }

    public final void f3(View view) {
        for (int i10 = this.f3308s - 1; i10 >= 0; i10--) {
            this.f3309t[i10].z(view);
        }
    }

    public void g1(RecyclerView.w wVar, RecyclerView.b0 b0Var, View view, z zVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c)) {
            super.f1(view, zVar);
            return;
        }
        c cVar = (c) layoutParams;
        int i14 = 1;
        if (this.f3312w == 0) {
            i13 = cVar.h();
            if (cVar.f3328f) {
                i14 = this.f3308s;
            }
            i12 = i14;
            i11 = -1;
            i10 = -1;
        } else {
            i13 = -1;
            i12 = -1;
            i11 = cVar.h();
            if (cVar.f3328f) {
                i14 = this.f3308s;
            }
            i10 = i14;
        }
        zVar.X0(z.c.h(i13, i12, i11, i10, false, false));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        if (r4.f3672e == -1) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g3(androidx.recyclerview.widget.RecyclerView.w r3, androidx.recyclerview.widget.p r4) {
        /*
            r2 = this;
            boolean r0 = r4.f3668a
            if (r0 == 0) goto L_0x004d
            boolean r0 = r4.f3676i
            if (r0 == 0) goto L_0x0009
            goto L_0x004d
        L_0x0009:
            int r0 = r4.f3669b
            r1 = -1
            if (r0 != 0) goto L_0x001e
            int r0 = r4.f3672e
            if (r0 != r1) goto L_0x0018
        L_0x0012:
            int r4 = r4.f3674g
        L_0x0014:
            r2.h3(r3, r4)
            goto L_0x004d
        L_0x0018:
            int r4 = r4.f3673f
        L_0x001a:
            r2.i3(r3, r4)
            goto L_0x004d
        L_0x001e:
            int r0 = r4.f3672e
            if (r0 != r1) goto L_0x0037
            int r0 = r4.f3673f
            int r1 = r2.P2(r0)
            int r0 = r0 - r1
            if (r0 >= 0) goto L_0x002c
            goto L_0x0012
        L_0x002c:
            int r1 = r4.f3674g
            int r4 = r4.f3669b
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r1 - r4
            goto L_0x0014
        L_0x0037:
            int r0 = r4.f3674g
            int r0 = r2.Q2(r0)
            int r1 = r4.f3674g
            int r0 = r0 - r1
            if (r0 >= 0) goto L_0x0043
            goto L_0x0018
        L_0x0043:
            int r1 = r4.f3673f
            int r4 = r4.f3669b
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r4 + r1
            goto L_0x001a
        L_0x004d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.g3(androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.p):void");
    }

    public final void h3(RecyclerView.w wVar, int i10) {
        int Q2 = Q() - 1;
        while (Q2 >= 0) {
            View P2 = P(Q2);
            if (this.f3310u.g(P2) >= i10 && this.f3310u.r(P2) >= i10) {
                c cVar = (c) P2.getLayoutParams();
                if (cVar.f3328f) {
                    int i11 = 0;
                    while (i11 < this.f3308s) {
                        if (this.f3309t[i11].f3330a.size() != 1) {
                            i11++;
                        } else {
                            return;
                        }
                    }
                    for (int i12 = 0; i12 < this.f3308s; i12++) {
                        this.f3309t[i12].x();
                    }
                } else if (cVar.f3327e.f3330a.size() != 1) {
                    cVar.f3327e.x();
                } else {
                    return;
                }
                F1(P2, wVar);
                Q2--;
            } else {
                return;
            }
        }
    }

    public void i(String str) {
        if (this.I == null) {
            super.i(str);
        }
    }

    public void i1(RecyclerView recyclerView, int i10, int i11) {
        W2(i10, i11, 1);
    }

    public final void i3(RecyclerView.w wVar, int i10) {
        while (Q() > 0) {
            View P2 = P(0);
            if (this.f3310u.d(P2) <= i10 && this.f3310u.q(P2) <= i10) {
                c cVar = (c) P2.getLayoutParams();
                if (cVar.f3328f) {
                    int i11 = 0;
                    while (i11 < this.f3308s) {
                        if (this.f3309t[i11].f3330a.size() != 1) {
                            i11++;
                        } else {
                            return;
                        }
                    }
                    for (int i12 = 0; i12 < this.f3308s; i12++) {
                        this.f3309t[i12].y();
                    }
                } else if (cVar.f3327e.f3330a.size() != 1) {
                    cVar.f3327e.y();
                } else {
                    return;
                }
                F1(P2, wVar);
            } else {
                return;
            }
        }
    }

    public void j1(RecyclerView recyclerView) {
        this.E.b();
        N1();
    }

    public boolean j2() {
        return this.I == null;
    }

    public final void j3() {
        if (this.f3311v.l() != 1073741824) {
            float f10 = 0.0f;
            int Q2 = Q();
            for (int i10 = 0; i10 < Q2; i10++) {
                View P2 = P(i10);
                float e10 = (float) this.f3311v.e(P2);
                if (e10 >= f10) {
                    if (((c) P2.getLayoutParams()).i()) {
                        e10 = (e10 * 1.0f) / ((float) this.f3308s);
                    }
                    f10 = Math.max(f10, e10);
                }
            }
            int i11 = this.f3313x;
            int round = Math.round(f10 * ((float) this.f3308s));
            if (this.f3311v.l() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f3311v.o());
            }
            x3(round);
            if (this.f3313x != i11) {
                for (int i12 = 0; i12 < Q2; i12++) {
                    View P3 = P(i12);
                    c cVar = (c) P3.getLayoutParams();
                    if (!cVar.f3328f) {
                        if (!Z2() || this.f3312w != 1) {
                            int i13 = cVar.f3327e.f3334e;
                            int i14 = this.f3312w;
                            int i15 = (this.f3313x * i13) - (i13 * i11);
                            if (i14 == 1) {
                                P3.offsetLeftAndRight(i15);
                            } else {
                                P3.offsetTopAndBottom(i15);
                            }
                        } else {
                            int i16 = this.f3308s;
                            int i17 = cVar.f3327e.f3334e;
                            P3.offsetLeftAndRight(((-((i16 - 1) - i17)) * this.f3313x) - ((-((i16 - 1) - i17)) * i11));
                        }
                    }
                }
            }
        }
    }

    public void k1(RecyclerView recyclerView, int i10, int i11, int i12) {
        W2(i10, i11, 8);
    }

    public final void k2(View view) {
        for (int i10 = this.f3308s - 1; i10 >= 0; i10--) {
            this.f3309t[i10].a(view);
        }
    }

    public final void k3() {
        this.A = (this.f3312w == 1 || !Z2()) ? this.f3315z : !this.f3315z;
    }

    public void l1(RecyclerView recyclerView, int i10, int i11) {
        W2(i10, i11, 2);
    }

    public final void l2(b bVar) {
        boolean z10;
        SavedState savedState = this.I;
        int i10 = savedState.Q;
        if (i10 > 0) {
            if (i10 == this.f3308s) {
                for (int i11 = 0; i11 < this.f3308s; i11++) {
                    this.f3309t[i11].e();
                    SavedState savedState2 = this.I;
                    int i12 = savedState2.R[i11];
                    if (i12 != Integer.MIN_VALUE) {
                        i12 += savedState2.W ? this.f3310u.i() : this.f3310u.n();
                    }
                    this.f3309t[i11].A(i12);
                }
            } else {
                savedState.b();
                SavedState savedState3 = this.I;
                savedState3.O = savedState3.P;
            }
        }
        SavedState savedState4 = this.I;
        this.H = savedState4.X;
        q3(savedState4.V);
        k3();
        SavedState savedState5 = this.I;
        int i13 = savedState5.O;
        if (i13 != -1) {
            this.C = i13;
            z10 = savedState5.W;
        } else {
            z10 = this.A;
        }
        bVar.f3321c = z10;
        if (savedState5.S > 1) {
            LazySpanLookup lazySpanLookup = this.E;
            lazySpanLookup.f3317a = savedState5.T;
            lazySpanLookup.f3318b = savedState5.U;
        }
    }

    public int l3(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (Q() == 0 || i10 == 0) {
            return 0;
        }
        e3(i10, b0Var);
        int z22 = z2(wVar, this.f3314y, b0Var);
        if (this.f3314y.f3669b >= z22) {
            i10 = i10 < 0 ? -z22 : z22;
        }
        this.f3310u.t(-i10);
        this.G = this.A;
        p pVar = this.f3314y;
        pVar.f3669b = 0;
        g3(wVar, pVar);
        return i10;
    }

    public boolean m2() {
        int q10 = this.f3309t[0].q(Integer.MIN_VALUE);
        for (int i10 = 1; i10 < this.f3308s; i10++) {
            if (this.f3309t[i10].q(Integer.MIN_VALUE) != q10) {
                return false;
            }
        }
        return true;
    }

    public void m3(int i10, int i11) {
        SavedState savedState = this.I;
        if (savedState != null) {
            savedState.a();
        }
        this.C = i10;
        this.D = i11;
        N1();
    }

    public boolean n() {
        return this.f3312w == 0;
    }

    public void n1(RecyclerView recyclerView, int i10, int i11, Object obj) {
        W2(i10, i11, 4);
    }

    public boolean n2() {
        int u10 = this.f3309t[0].u(Integer.MIN_VALUE);
        for (int i10 = 1; i10 < this.f3308s; i10++) {
            if (this.f3309t[i10].u(Integer.MIN_VALUE) != u10) {
                return false;
            }
        }
        return true;
    }

    public void n3(int i10) {
        i((String) null);
        if (i10 != this.F) {
            if (i10 == 0 || i10 == 2) {
                this.F = i10;
                N1();
                return;
            }
            throw new IllegalArgumentException("invalid gap strategy. Must be GAP_HANDLING_NONE or GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS");
        }
    }

    public boolean o() {
        return this.f3312w == 1;
    }

    public void o1(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        c3(wVar, b0Var, true);
    }

    public final void o2(View view, c cVar, p pVar) {
        if (pVar.f3672e == 1) {
            if (cVar.f3328f) {
                k2(view);
            } else {
                cVar.f3327e.a(view);
            }
        } else if (cVar.f3328f) {
            f3(view);
        } else {
            cVar.f3327e.z(view);
        }
    }

    public final void o3(int i10) {
        p pVar = this.f3314y;
        pVar.f3672e = i10;
        int i11 = 1;
        if (this.A != (i10 == -1)) {
            i11 = -1;
        }
        pVar.f3671d = i11;
    }

    public boolean p(RecyclerView.p pVar) {
        return pVar instanceof c;
    }

    public void p1(RecyclerView.b0 b0Var) {
        super.p1(b0Var);
        this.C = -1;
        this.D = Integer.MIN_VALUE;
        this.I = null;
        this.L.c();
    }

    public final int p2(int i10) {
        if (Q() == 0) {
            return this.A ? 1 : -1;
        }
        return (i10 < L2()) != this.A ? -1 : 1;
    }

    public void p3(int i10) {
        if (i10 == 0 || i10 == 1) {
            i((String) null);
            if (i10 != this.f3312w) {
                this.f3312w = i10;
                w wVar = this.f3310u;
                this.f3310u = this.f3311v;
                this.f3311v = wVar;
                N1();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    public boolean q2() {
        int i10;
        int i11;
        if (Q() == 0 || this.F == 0 || !E0()) {
            return false;
        }
        if (this.A) {
            i11 = N2();
            i10 = L2();
        } else {
            i11 = L2();
            i10 = N2();
        }
        if (i11 == 0 && X2() != null) {
            this.E.b();
        } else if (!this.M) {
            return false;
        } else {
            int i12 = this.A ? -1 : 1;
            int i13 = i10 + 1;
            LazySpanLookup.FullSpanItem e10 = this.E.e(i11, i13, i12, true);
            if (e10 == null) {
                this.M = false;
                this.E.d(i13);
                return false;
            }
            LazySpanLookup.FullSpanItem e11 = this.E.e(i11, e10.O, i12 * -1, true);
            if (e11 == null) {
                this.E.d(e10.O);
            } else {
                this.E.d(e11.O + 1);
            }
        }
        O1();
        N1();
        return true;
    }

    public void q3(boolean z10) {
        i((String) null);
        SavedState savedState = this.I;
        if (!(savedState == null || savedState.V == z10)) {
            savedState.V = z10;
        }
        this.f3315z = z10;
        N1();
    }

    @x0({x0.a.O})
    public void r(int i10, int i11, RecyclerView.b0 b0Var, RecyclerView.o.c cVar) {
        int i12;
        int i13;
        if (this.f3312w != 0) {
            i10 = i11;
        }
        if (Q() != 0 && i10 != 0) {
            e3(i10, b0Var);
            int[] iArr = this.O;
            if (iArr == null || iArr.length < this.f3308s) {
                this.O = new int[this.f3308s];
            }
            int i14 = 0;
            for (int i15 = 0; i15 < this.f3308s; i15++) {
                p pVar = this.f3314y;
                if (pVar.f3671d == -1) {
                    i13 = pVar.f3673f;
                    i12 = this.f3309t[i15].u(i13);
                } else {
                    i13 = this.f3309t[i15].q(pVar.f3674g);
                    i12 = this.f3314y.f3674g;
                }
                int i16 = i13 - i12;
                if (i16 >= 0) {
                    this.O[i14] = i16;
                    i14++;
                }
            }
            Arrays.sort(this.O, 0, i14);
            for (int i17 = 0; i17 < i14 && this.f3314y.a(b0Var); i17++) {
                cVar.a(this.f3314y.f3670c, this.O[i17]);
                p pVar2 = this.f3314y;
                pVar2.f3670c += pVar2.f3671d;
            }
        }
    }

    public final boolean r2(d dVar) {
        if (this.A) {
            if (dVar.p() < this.f3310u.i()) {
                ArrayList<View> arrayList = dVar.f3330a;
                return !dVar.s(arrayList.get(arrayList.size() - 1)).f3328f;
            }
        } else if (dVar.t() > this.f3310u.n()) {
            return !dVar.s(dVar.f3330a.get(0)).f3328f;
        }
        return false;
    }

    public void r3(int i10) {
        i((String) null);
        if (i10 != this.f3308s) {
            Y2();
            this.f3308s = i10;
            this.B = new BitSet(this.f3308s);
            this.f3309t = new d[this.f3308s];
            for (int i11 = 0; i11 < this.f3308s; i11++) {
                this.f3309t[i11] = new d(i11);
            }
            N1();
        }
    }

    public final int s2(RecyclerView.b0 b0Var) {
        if (Q() == 0) {
            return 0;
        }
        return z.a(b0Var, this.f3310u, D2(!this.N), C2(!this.N), this, this.N);
    }

    public final void s3(int i10, int i11) {
        for (int i12 = 0; i12 < this.f3308s; i12++) {
            if (!this.f3309t[i12].f3330a.isEmpty()) {
                y3(this.f3309t[i12], i10, i11);
            }
        }
    }

    public int t(RecyclerView.b0 b0Var) {
        return s2(b0Var);
    }

    public void t1(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.I = (SavedState) parcelable;
            N1();
        }
    }

    public final int t2(RecyclerView.b0 b0Var) {
        if (Q() == 0) {
            return 0;
        }
        return z.b(b0Var, this.f3310u, D2(!this.N), C2(!this.N), this, this.N, this.A);
    }

    public final boolean t3(RecyclerView.b0 b0Var, b bVar) {
        boolean z10 = this.G;
        int d10 = b0Var.d();
        bVar.f3319a = z10 ? H2(d10) : B2(d10);
        bVar.f3320b = Integer.MIN_VALUE;
        return true;
    }

    public int u(RecyclerView.b0 b0Var) {
        return t2(b0Var);
    }

    public Parcelable u1() {
        int i10;
        int i11;
        int[] iArr;
        if (this.I != null) {
            return new SavedState(this.I);
        }
        SavedState savedState = new SavedState();
        savedState.V = this.f3315z;
        savedState.W = this.G;
        savedState.X = this.H;
        LazySpanLookup lazySpanLookup = this.E;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.f3317a) == null) {
            savedState.S = 0;
        } else {
            savedState.T = iArr;
            savedState.S = iArr.length;
            savedState.U = lazySpanLookup.f3318b;
        }
        if (Q() > 0) {
            savedState.O = this.G ? N2() : L2();
            savedState.P = E2();
            int i12 = this.f3308s;
            savedState.Q = i12;
            savedState.R = new int[i12];
            for (int i13 = 0; i13 < this.f3308s; i13++) {
                if (this.G) {
                    i10 = this.f3309t[i13].q(Integer.MIN_VALUE);
                    if (i10 != Integer.MIN_VALUE) {
                        i11 = this.f3310u.i();
                    } else {
                        savedState.R[i13] = i10;
                    }
                } else {
                    i10 = this.f3309t[i13].u(Integer.MIN_VALUE);
                    if (i10 != Integer.MIN_VALUE) {
                        i11 = this.f3310u.n();
                    } else {
                        savedState.R[i13] = i10;
                    }
                }
                i10 -= i11;
                savedState.R[i13] = i10;
            }
        } else {
            savedState.O = -1;
            savedState.P = -1;
            savedState.Q = 0;
        }
        return savedState;
    }

    public final int u2(RecyclerView.b0 b0Var) {
        if (Q() == 0) {
            return 0;
        }
        return z.c(b0Var, this.f3310u, D2(!this.N), C2(!this.N), this, this.N);
    }

    public boolean u3(RecyclerView.b0 b0Var, b bVar) {
        int i10;
        int i11;
        int i12;
        boolean z10 = false;
        if (!b0Var.j() && (i10 = this.C) != -1) {
            if (i10 < 0 || i10 >= b0Var.d()) {
                this.C = -1;
                this.D = Integer.MIN_VALUE;
            } else {
                SavedState savedState = this.I;
                if (savedState == null || savedState.O == -1 || savedState.Q < 1) {
                    View J2 = J(this.C);
                    if (J2 != null) {
                        bVar.f3319a = this.A ? N2() : L2();
                        if (this.D != Integer.MIN_VALUE) {
                            if (bVar.f3321c) {
                                i12 = this.f3310u.i() - this.D;
                                i11 = this.f3310u.d(J2);
                            } else {
                                i12 = this.f3310u.n() + this.D;
                                i11 = this.f3310u.g(J2);
                            }
                            bVar.f3320b = i12 - i11;
                            return true;
                        } else if (this.f3310u.e(J2) > this.f3310u.o()) {
                            bVar.f3320b = bVar.f3321c ? this.f3310u.i() : this.f3310u.n();
                            return true;
                        } else {
                            int g10 = this.f3310u.g(J2) - this.f3310u.n();
                            if (g10 < 0) {
                                bVar.f3320b = -g10;
                                return true;
                            }
                            int i13 = this.f3310u.i() - this.f3310u.d(J2);
                            if (i13 < 0) {
                                bVar.f3320b = i13;
                                return true;
                            }
                            bVar.f3320b = Integer.MIN_VALUE;
                        }
                    } else {
                        int i14 = this.C;
                        bVar.f3319a = i14;
                        int i15 = this.D;
                        if (i15 == Integer.MIN_VALUE) {
                            if (p2(i14) == 1) {
                                z10 = true;
                            }
                            bVar.f3321c = z10;
                            bVar.a();
                        } else {
                            bVar.b(i15);
                        }
                        bVar.f3322d = true;
                    }
                } else {
                    bVar.f3320b = Integer.MIN_VALUE;
                    bVar.f3319a = this.C;
                }
                return true;
            }
        }
        return false;
    }

    public int v(RecyclerView.b0 b0Var) {
        return u2(b0Var);
    }

    public int v0(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        return this.f3312w == 0 ? this.f3308s : super.v0(wVar, b0Var);
    }

    public void v1(int i10) {
        if (i10 == 0) {
            q2();
        }
    }

    public final int v2(int i10) {
        if (i10 == 1) {
            return (this.f3312w != 1 && Z2()) ? 1 : -1;
        }
        if (i10 == 2) {
            return (this.f3312w != 1 && Z2()) ? -1 : 1;
        }
        if (i10 == 17) {
            return this.f3312w == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 == 33) {
            return this.f3312w == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 == 66) {
            return this.f3312w == 0 ? 1 : Integer.MIN_VALUE;
        }
        if (i10 != 130) {
            return Integer.MIN_VALUE;
        }
        return this.f3312w == 1 ? 1 : Integer.MIN_VALUE;
    }

    public void v3(RecyclerView.b0 b0Var, b bVar) {
        if (!u3(b0Var, bVar) && !t3(b0Var, bVar)) {
            bVar.a();
            bVar.f3319a = 0;
        }
    }

    public int w(RecyclerView.b0 b0Var) {
        return s2(b0Var);
    }

    public final LazySpanLookup.FullSpanItem w2(int i10) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.Q = new int[this.f3308s];
        for (int i11 = 0; i11 < this.f3308s; i11++) {
            fullSpanItem.Q[i11] = i10 - this.f3309t[i11].q(i10);
        }
        return fullSpanItem;
    }

    public final void w3(int i10, RecyclerView.b0 b0Var) {
        int i11;
        int i12;
        int g10;
        p pVar = this.f3314y;
        boolean z10 = false;
        pVar.f3669b = 0;
        pVar.f3670c = i10;
        if (!M0() || (g10 = b0Var.g()) == -1) {
            i12 = 0;
            i11 = 0;
        } else {
            if (this.A == (g10 < i10)) {
                i12 = this.f3310u.o();
                i11 = 0;
            } else {
                i11 = this.f3310u.o();
                i12 = 0;
            }
        }
        if (U()) {
            this.f3314y.f3673f = this.f3310u.n() - i11;
            this.f3314y.f3674g = this.f3310u.i() + i12;
        } else {
            this.f3314y.f3674g = this.f3310u.h() + i12;
            this.f3314y.f3673f = -i11;
        }
        p pVar2 = this.f3314y;
        pVar2.f3675h = false;
        pVar2.f3668a = true;
        if (this.f3310u.l() == 0 && this.f3310u.h() == 0) {
            z10 = true;
        }
        pVar2.f3676i = z10;
    }

    public int x(RecyclerView.b0 b0Var) {
        return t2(b0Var);
    }

    public final LazySpanLookup.FullSpanItem x2(int i10) {
        LazySpanLookup.FullSpanItem fullSpanItem = new LazySpanLookup.FullSpanItem();
        fullSpanItem.Q = new int[this.f3308s];
        for (int i11 = 0; i11 < this.f3308s; i11++) {
            fullSpanItem.Q[i11] = this.f3309t[i11].u(i10) - i10;
        }
        return fullSpanItem;
    }

    public void x3(int i10) {
        this.f3313x = i10 / this.f3308s;
        this.J = View.MeasureSpec.makeMeasureSpec(i10, this.f3311v.l());
    }

    public int y(RecyclerView.b0 b0Var) {
        return u2(b0Var);
    }

    public final void y2() {
        this.f3310u = w.b(this, this.f3312w);
        this.f3311v = w.b(this, 1 - this.f3312w);
    }

    public final void y3(d dVar, int i10, int i11) {
        int o10 = dVar.o();
        if (i10 == -1) {
            if (dVar.t() + o10 > i11) {
                return;
            }
        } else if (dVar.p() - o10 < i11) {
            return;
        }
        this.B.set(dVar.f3334e, false);
    }

    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r9v5 */
    public final int z2(RecyclerView.w wVar, p pVar, RecyclerView.b0 b0Var) {
        d dVar;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        View view;
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        boolean z10;
        RecyclerView.w wVar2 = wVar;
        p pVar2 = pVar;
        ? r92 = 0;
        this.B.set(0, this.f3308s, true);
        int i16 = this.f3314y.f3676i ? pVar2.f3672e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : pVar2.f3672e == 1 ? pVar2.f3674g + pVar2.f3669b : pVar2.f3673f - pVar2.f3669b;
        s3(pVar2.f3672e, i16);
        int i17 = this.A ? this.f3310u.i() : this.f3310u.n();
        boolean z11 = false;
        while (pVar.a(b0Var) && (this.f3314y.f3676i || !this.B.isEmpty())) {
            View b10 = pVar2.b(wVar2);
            c cVar = (c) b10.getLayoutParams();
            int b11 = cVar.b();
            int g10 = this.E.g(b11);
            boolean z12 = g10 == -1 ? true : r92;
            if (z12) {
                dVar = cVar.f3328f ? this.f3309t[r92] : S2(pVar2);
                this.E.n(b11, dVar);
            } else {
                dVar = this.f3309t[g10];
            }
            d dVar2 = dVar;
            cVar.f3327e = dVar2;
            if (pVar2.f3672e == 1) {
                e(b10);
            } else {
                f(b10, r92);
            }
            b3(b10, cVar, r92);
            if (pVar2.f3672e == 1) {
                int O2 = cVar.f3328f ? O2(i17) : dVar2.q(i17);
                int e10 = this.f3310u.e(b10) + O2;
                if (z12 && cVar.f3328f) {
                    LazySpanLookup.FullSpanItem w22 = w2(O2);
                    w22.P = -1;
                    w22.O = b11;
                    this.E.a(w22);
                }
                i10 = e10;
                i11 = O2;
            } else {
                int R2 = cVar.f3328f ? R2(i17) : dVar2.u(i17);
                i11 = R2 - this.f3310u.e(b10);
                if (z12 && cVar.f3328f) {
                    LazySpanLookup.FullSpanItem x22 = x2(R2);
                    x22.P = 1;
                    x22.O = b11;
                    this.E.a(x22);
                }
                i10 = R2;
            }
            if (cVar.f3328f && pVar2.f3671d == -1) {
                if (!z12) {
                    if (!(pVar2.f3672e == 1 ? m2() : n2())) {
                        LazySpanLookup.FullSpanItem f10 = this.E.f(b11);
                        if (f10 != null) {
                            f10.R = true;
                        }
                    }
                }
                this.M = true;
            }
            o2(b10, cVar, pVar2);
            if (!Z2() || this.f3312w != 1) {
                int n10 = cVar.f3328f ? this.f3311v.n() : (dVar2.f3334e * this.f3313x) + this.f3311v.n();
                i13 = n10;
                i12 = this.f3311v.e(b10) + n10;
            } else {
                int i18 = cVar.f3328f ? this.f3311v.i() : this.f3311v.i() - (((this.f3308s - 1) - dVar2.f3334e) * this.f3313x);
                i12 = i18;
                i13 = i18 - this.f3311v.e(b10);
            }
            if (this.f3312w == 1) {
                staggeredGridLayoutManager = this;
                view = b10;
                i15 = i13;
                i13 = i11;
                i14 = i12;
            } else {
                staggeredGridLayoutManager = this;
                view = b10;
                i15 = i11;
                i14 = i10;
                i10 = i12;
            }
            staggeredGridLayoutManager.P0(view, i15, i13, i14, i10);
            if (cVar.f3328f) {
                s3(this.f3314y.f3672e, i16);
            } else {
                y3(dVar2, this.f3314y.f3672e, i16);
            }
            g3(wVar2, this.f3314y);
            if (this.f3314y.f3675h && b10.hasFocusable()) {
                if (cVar.f3328f) {
                    this.B.clear();
                } else {
                    z10 = false;
                    this.B.set(dVar2.f3334e, false);
                    r92 = z10;
                    z11 = true;
                }
            }
            z10 = false;
            r92 = z10;
            z11 = true;
        }
        int i19 = r92;
        if (!z11) {
            g3(wVar2, this.f3314y);
        }
        int n11 = this.f3314y.f3672e == -1 ? this.f3310u.n() - R2(this.f3310u.n()) : O2(this.f3310u.i()) - this.f3310u.i();
        return n11 > 0 ? Math.min(pVar2.f3669b, n11) : i19;
    }

    public final int z3(int i10, int i11, int i12) {
        if (i11 == 0 && i12 == 0) {
            return i10;
        }
        int mode = View.MeasureSpec.getMode(i10);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - i11) - i12), mode) : i10;
    }
}
