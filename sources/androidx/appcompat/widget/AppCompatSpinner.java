package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.AlertDialog;
import d.g1;
import d.m0;
import d.o0;
import d.u;
import d.x0;
import f.a;
import f1.w0;
import f1.w1;

public class AppCompatSpinner extends Spinner implements w0 {
    public static final int[] W = {16843505};

    /* renamed from: a0  reason: collision with root package name */
    public static final int f1090a0 = 15;

    /* renamed from: b0  reason: collision with root package name */
    public static final String f1091b0 = "AppCompatSpinner";

    /* renamed from: c0  reason: collision with root package name */
    public static final int f1092c0 = 0;

    /* renamed from: d0  reason: collision with root package name */
    public static final int f1093d0 = 1;

    /* renamed from: e0  reason: collision with root package name */
    public static final int f1094e0 = -1;
    public final d O;
    public final Context P;
    public e0 Q;
    public SpinnerAdapter R;
    public final boolean S;
    public f T;
    public int U;
    public final Rect V;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public boolean O;

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

        public SavedState(Parcel parcel) {
            super(parcel);
            this.O = parcel.readByte() != 0;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeByte(this.O ? (byte) 1 : 0);
        }
    }

    public class a extends e0 {
        public final /* synthetic */ e X;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view, e eVar) {
            super(view);
            this.X = eVar;
        }

        public l.f b() {
            return this.X;
        }

        @SuppressLint({"SyntheticAccessor"})
        public boolean c() {
            if (AppCompatSpinner.this.getInternalPopup().c()) {
                return true;
            }
            AppCompatSpinner.this.b();
            return true;
        }
    }

    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        public b() {
        }

        public void onGlobalLayout() {
            if (!AppCompatSpinner.this.getInternalPopup().c()) {
                AppCompatSpinner.this.b();
            }
            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    @g1
    public class c implements f, DialogInterface.OnClickListener {
        @g1
        public AlertDialog O;
        public ListAdapter P;
        public CharSequence Q;

        public c() {
        }

        public void b(Drawable drawable) {
        }

        public boolean c() {
            AlertDialog alertDialog = this.O;
            if (alertDialog != null) {
                return alertDialog.isShowing();
            }
            return false;
        }

        public int d() {
            return 0;
        }

        public void dismiss() {
            AlertDialog alertDialog = this.O;
            if (alertDialog != null) {
                alertDialog.dismiss();
                this.O = null;
            }
        }

        public void f(int i10) {
        }

        public CharSequence g() {
            return this.Q;
        }

        public Drawable i() {
            return null;
        }

        public void j(CharSequence charSequence) {
            this.Q = charSequence;
        }

        public void l(int i10) {
        }

        public void m(int i10) {
        }

        public void n(int i10, int i11) {
            if (this.P != null) {
                AlertDialog.a aVar = new AlertDialog.a(AppCompatSpinner.this.getPopupContext());
                CharSequence charSequence = this.Q;
                if (charSequence != null) {
                    aVar.K(charSequence);
                }
                AlertDialog a10 = aVar.H(this.P, AppCompatSpinner.this.getSelectedItemPosition(), this).a();
                this.O = a10;
                ListView g10 = a10.g();
                g10.setTextDirection(i10);
                g10.setTextAlignment(i11);
                this.O.show();
            }
        }

        public int o() {
            return 0;
        }

        public void onClick(DialogInterface dialogInterface, int i10) {
            AppCompatSpinner.this.setSelection(i10);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick((View) null, i10, this.P.getItemId(i10));
            }
            dismiss();
        }

        public int p() {
            return 0;
        }

        public void q(ListAdapter listAdapter) {
            this.P = listAdapter;
        }
    }

    public static class d implements ListAdapter, SpinnerAdapter {
        public SpinnerAdapter O;
        public ListAdapter P;

        public d(@o0 SpinnerAdapter spinnerAdapter, @o0 Resources.Theme theme) {
            this.O = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.P = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            } else if (spinnerAdapter instanceof s0) {
                s0 s0Var = (s0) spinnerAdapter;
                if (s0Var.getDropDownViewTheme() == null) {
                    s0Var.setDropDownViewTheme(theme);
                }
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.P;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.O;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.O;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i10, view, viewGroup);
        }

        public Object getItem(int i10) {
            SpinnerAdapter spinnerAdapter = this.O;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i10);
        }

        public long getItemId(int i10) {
            SpinnerAdapter spinnerAdapter = this.O;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i10);
        }

        public int getItemViewType(int i10) {
            return 0;
        }

        public View getView(int i10, View view, ViewGroup viewGroup) {
            return getDropDownView(i10, view, viewGroup);
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.O;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }

        public boolean isEnabled(int i10) {
            ListAdapter listAdapter = this.P;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i10);
            }
            return true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.O;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.O;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    @g1
    public class e extends i0 implements f {
        public CharSequence H0;
        public ListAdapter I0;
        public final Rect J0 = new Rect();
        public int K0;

        public class a implements AdapterView.OnItemClickListener {
            public final /* synthetic */ AppCompatSpinner O;

            public a(AppCompatSpinner appCompatSpinner) {
                this.O = appCompatSpinner;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                AppCompatSpinner.this.setSelection(i10);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    e eVar = e.this;
                    AppCompatSpinner.this.performItemClick(view, i10, eVar.I0.getItemId(i10));
                }
                e.this.dismiss();
            }
        }

        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            public void onGlobalLayout() {
                e eVar = e.this;
                if (!eVar.r0(AppCompatSpinner.this)) {
                    e.this.dismiss();
                    return;
                }
                e.this.q0();
                e.super.a();
            }
        }

        public class c implements PopupWindow.OnDismissListener {
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener O;

            public c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.O = onGlobalLayoutListener;
            }

            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.O);
                }
            }
        }

        public e(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            S(AppCompatSpinner.this);
            d0(true);
            j0(0);
            f0(new a(AppCompatSpinner.this));
        }

        public CharSequence g() {
            return this.H0;
        }

        public void j(CharSequence charSequence) {
            this.H0 = charSequence;
        }

        public void m(int i10) {
            this.K0 = i10;
        }

        public void n(int i10, int i11) {
            ViewTreeObserver viewTreeObserver;
            boolean c10 = c();
            q0();
            a0(2);
            super.a();
            ListView k10 = k();
            k10.setChoiceMode(1);
            k10.setTextDirection(i10);
            k10.setTextAlignment(i11);
            l0(AppCompatSpinner.this.getSelectedItemPosition());
            if (!c10 && (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) != null) {
                b bVar = new b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                e0(new c(bVar));
            }
        }

        public int p() {
            return this.K0;
        }

        public void q(ListAdapter listAdapter) {
            super.q(listAdapter);
            this.I0 = listAdapter;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x008d  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x009a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void q0() {
            /*
                r8 = this;
                android.graphics.drawable.Drawable r0 = r8.i()
                r1 = 0
                if (r0 == 0) goto L_0x0026
                androidx.appcompat.widget.AppCompatSpinner r1 = androidx.appcompat.widget.AppCompatSpinner.this
                android.graphics.Rect r1 = r1.V
                r0.getPadding(r1)
                androidx.appcompat.widget.AppCompatSpinner r0 = androidx.appcompat.widget.AppCompatSpinner.this
                boolean r0 = androidx.appcompat.widget.d1.b(r0)
                if (r0 == 0) goto L_0x001d
                androidx.appcompat.widget.AppCompatSpinner r0 = androidx.appcompat.widget.AppCompatSpinner.this
                android.graphics.Rect r0 = r0.V
                int r0 = r0.right
                goto L_0x0024
            L_0x001d:
                androidx.appcompat.widget.AppCompatSpinner r0 = androidx.appcompat.widget.AppCompatSpinner.this
                android.graphics.Rect r0 = r0.V
                int r0 = r0.left
                int r0 = -r0
            L_0x0024:
                r1 = r0
                goto L_0x002e
            L_0x0026:
                androidx.appcompat.widget.AppCompatSpinner r0 = androidx.appcompat.widget.AppCompatSpinner.this
                android.graphics.Rect r0 = r0.V
                r0.right = r1
                r0.left = r1
            L_0x002e:
                androidx.appcompat.widget.AppCompatSpinner r0 = androidx.appcompat.widget.AppCompatSpinner.this
                int r0 = r0.getPaddingLeft()
                androidx.appcompat.widget.AppCompatSpinner r2 = androidx.appcompat.widget.AppCompatSpinner.this
                int r2 = r2.getPaddingRight()
                androidx.appcompat.widget.AppCompatSpinner r3 = androidx.appcompat.widget.AppCompatSpinner.this
                int r3 = r3.getWidth()
                androidx.appcompat.widget.AppCompatSpinner r4 = androidx.appcompat.widget.AppCompatSpinner.this
                int r5 = r4.U
                r6 = -2
                if (r5 != r6) goto L_0x0078
                android.widget.ListAdapter r5 = r8.I0
                android.widget.SpinnerAdapter r5 = (android.widget.SpinnerAdapter) r5
                android.graphics.drawable.Drawable r6 = r8.i()
                int r4 = r4.a(r5, r6)
                androidx.appcompat.widget.AppCompatSpinner r5 = androidx.appcompat.widget.AppCompatSpinner.this
                android.content.Context r5 = r5.getContext()
                android.content.res.Resources r5 = r5.getResources()
                android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
                int r5 = r5.widthPixels
                androidx.appcompat.widget.AppCompatSpinner r6 = androidx.appcompat.widget.AppCompatSpinner.this
                android.graphics.Rect r6 = r6.V
                int r7 = r6.left
                int r5 = r5 - r7
                int r6 = r6.right
                int r5 = r5 - r6
                if (r4 <= r5) goto L_0x0070
                r4 = r5
            L_0x0070:
                int r5 = r3 - r0
                int r5 = r5 - r2
                int r4 = java.lang.Math.max(r4, r5)
                goto L_0x007e
            L_0x0078:
                r4 = -1
                if (r5 != r4) goto L_0x0082
                int r4 = r3 - r0
                int r4 = r4 - r2
            L_0x007e:
                r8.U(r4)
                goto L_0x0085
            L_0x0082:
                r8.U(r5)
            L_0x0085:
                androidx.appcompat.widget.AppCompatSpinner r4 = androidx.appcompat.widget.AppCompatSpinner.this
                boolean r4 = androidx.appcompat.widget.d1.b(r4)
                if (r4 == 0) goto L_0x009a
                int r3 = r3 - r2
                int r0 = r8.H()
                int r3 = r3 - r0
                int r0 = r8.p()
                int r3 = r3 - r0
                int r1 = r1 + r3
                goto L_0x00a0
            L_0x009a:
                int r2 = r8.p()
                int r0 = r0 + r2
                int r1 = r1 + r0
            L_0x00a0:
                r8.f(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.e.q0():void");
        }

        public boolean r0(View view) {
            return w1.N0(view) && view.getGlobalVisibleRect(this.J0);
        }
    }

    @g1
    public interface f {
        void b(Drawable drawable);

        boolean c();

        int d();

        void dismiss();

        void f(int i10);

        CharSequence g();

        Drawable i();

        void j(CharSequence charSequence);

        void l(int i10);

        void m(int i10);

        void n(int i10, int i11);

        int o();

        int p();

        void q(ListAdapter listAdapter);
    }

    public AppCompatSpinner(@m0 Context context) {
        this(context, (AttributeSet) null);
    }

    public AppCompatSpinner(@m0 Context context, int i10) {
        this(context, (AttributeSet) null, a.c.spinnerStyle, i10);
    }

    public AppCompatSpinner(@m0 Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.spinnerStyle);
    }

    public AppCompatSpinner(@m0 Context context, @o0 AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, -1);
    }

    public AppCompatSpinner(@m0 Context context, @o0 AttributeSet attributeSet, int i10, int i11) {
        this(context, attributeSet, i10, i11, (Resources.Theme) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005c, code lost:
        if (r10 != null) goto L_0x004d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003d A[SYNTHETIC, Splitter:B:10:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00cd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppCompatSpinner(@d.m0 android.content.Context r6, @d.o0 android.util.AttributeSet r7, int r8, int r9, android.content.res.Resources.Theme r10) {
        /*
            r5 = this;
            r5.<init>(r6, r7, r8)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r5.V = r0
            android.content.Context r0 = r5.getContext()
            androidx.appcompat.widget.r0.a(r5, r0)
            int[] r0 = f.a.n.Spinner
            r1 = 0
            androidx.appcompat.widget.w0 r0 = androidx.appcompat.widget.w0.G(r6, r7, r0, r8, r1)
            androidx.appcompat.widget.d r2 = new androidx.appcompat.widget.d
            r2.<init>(r5)
            r5.O = r2
            if (r10 == 0) goto L_0x0029
            k.d r2 = new k.d
            r2.<init>((android.content.Context) r6, (android.content.res.Resources.Theme) r10)
        L_0x0026:
            r5.P = r2
            goto L_0x0039
        L_0x0029:
            int r10 = f.a.n.Spinner_popupTheme
            int r10 = r0.u(r10, r1)
            if (r10 == 0) goto L_0x0037
            k.d r2 = new k.d
            r2.<init>((android.content.Context) r6, (int) r10)
            goto L_0x0026
        L_0x0037:
            r5.P = r6
        L_0x0039:
            r10 = -1
            r2 = 0
            if (r9 != r10) goto L_0x005f
            int[] r10 = W     // Catch:{ Exception -> 0x005b, all -> 0x0054 }
            android.content.res.TypedArray r10 = r6.obtainStyledAttributes(r7, r10, r8, r1)     // Catch:{ Exception -> 0x005b, all -> 0x0054 }
            boolean r3 = r10.hasValue(r1)     // Catch:{ Exception -> 0x005c, all -> 0x0051 }
            if (r3 == 0) goto L_0x004d
            int r9 = r10.getInt(r1, r1)     // Catch:{ Exception -> 0x005c, all -> 0x0051 }
        L_0x004d:
            r10.recycle()
            goto L_0x005f
        L_0x0051:
            r6 = move-exception
            r2 = r10
            goto L_0x0055
        L_0x0054:
            r6 = move-exception
        L_0x0055:
            if (r2 == 0) goto L_0x005a
            r2.recycle()
        L_0x005a:
            throw r6
        L_0x005b:
            r10 = r2
        L_0x005c:
            if (r10 == 0) goto L_0x005f
            goto L_0x004d
        L_0x005f:
            r10 = 1
            if (r9 == 0) goto L_0x009c
            if (r9 == r10) goto L_0x0065
            goto L_0x00ac
        L_0x0065:
            androidx.appcompat.widget.AppCompatSpinner$e r9 = new androidx.appcompat.widget.AppCompatSpinner$e
            android.content.Context r3 = r5.P
            r9.<init>(r3, r7, r8)
            android.content.Context r3 = r5.P
            int[] r4 = f.a.n.Spinner
            androidx.appcompat.widget.w0 r1 = androidx.appcompat.widget.w0.G(r3, r7, r4, r8, r1)
            int r3 = f.a.n.Spinner_android_dropDownWidth
            r4 = -2
            int r3 = r1.q(r3, r4)
            r5.U = r3
            int r3 = f.a.n.Spinner_android_popupBackground
            android.graphics.drawable.Drawable r3 = r1.h(r3)
            r9.b(r3)
            int r3 = f.a.n.Spinner_android_prompt
            java.lang.String r3 = r0.w(r3)
            r9.j(r3)
            r1.I()
            r5.T = r9
            androidx.appcompat.widget.AppCompatSpinner$a r1 = new androidx.appcompat.widget.AppCompatSpinner$a
            r1.<init>(r5, r9)
            r5.Q = r1
            goto L_0x00ac
        L_0x009c:
            androidx.appcompat.widget.AppCompatSpinner$c r9 = new androidx.appcompat.widget.AppCompatSpinner$c
            r9.<init>()
            r5.T = r9
            int r1 = f.a.n.Spinner_android_prompt
            java.lang.String r1 = r0.w(r1)
            r9.j(r1)
        L_0x00ac:
            int r9 = f.a.n.Spinner_android_entries
            java.lang.CharSequence[] r9 = r0.y(r9)
            if (r9 == 0) goto L_0x00c4
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r6, r3, r9)
            int r6 = f.a.k.support_simple_spinner_dropdown_item
            r1.setDropDownViewResource(r6)
            r5.setAdapter((android.widget.SpinnerAdapter) r1)
        L_0x00c4:
            r0.I()
            r5.S = r10
            android.widget.SpinnerAdapter r6 = r5.R
            if (r6 == 0) goto L_0x00d2
            r5.setAdapter((android.widget.SpinnerAdapter) r6)
            r5.R = r2
        L_0x00d2:
            androidx.appcompat.widget.d r6 = r5.O
            r6.e(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    public int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i10 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i11 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i11 = Math.max(i11, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i11;
        }
        drawable.getPadding(this.V);
        Rect rect = this.V;
        return i11 + rect.left + rect.right;
    }

    public void b() {
        this.T.n(getTextDirection(), getTextAlignment());
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.O;
        if (dVar != null) {
            dVar.b();
        }
    }

    public int getDropDownHorizontalOffset() {
        f fVar = this.T;
        return fVar != null ? fVar.d() : super.getDropDownHorizontalOffset();
    }

    public int getDropDownVerticalOffset() {
        f fVar = this.T;
        return fVar != null ? fVar.o() : super.getDropDownVerticalOffset();
    }

    public int getDropDownWidth() {
        return this.T != null ? this.U : super.getDropDownWidth();
    }

    @g1
    public final f getInternalPopup() {
        return this.T;
    }

    public Drawable getPopupBackground() {
        f fVar = this.T;
        return fVar != null ? fVar.i() : super.getPopupBackground();
    }

    public Context getPopupContext() {
        return this.P;
    }

    public CharSequence getPrompt() {
        f fVar = this.T;
        return fVar != null ? fVar.g() : super.getPrompt();
    }

    @x0({x0.a.Q})
    @o0
    public ColorStateList getSupportBackgroundTintList() {
        d dVar = this.O;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    @x0({x0.a.Q})
    @o0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        d dVar = this.O;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f fVar = this.T;
        if (fVar != null && fVar.c()) {
            this.T.dismiss();
        }
    }

    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.T != null && View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.O && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new b());
        }
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        f fVar = this.T;
        savedState.O = fVar != null && fVar.c();
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        e0 e0Var = this.Q;
        if (e0Var == null || !e0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        f fVar = this.T;
        if (fVar == null) {
            return super.performClick();
        }
        if (fVar.c()) {
            return true;
        }
        b();
        return true;
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.S) {
            this.R = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.T != null) {
            Context context = this.P;
            if (context == null) {
                context = getContext();
            }
            this.T.q(new d(spinnerAdapter, context.getTheme()));
        }
    }

    public void setBackgroundDrawable(@o0 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.O;
        if (dVar != null) {
            dVar.f(drawable);
        }
    }

    public void setBackgroundResource(@u int i10) {
        super.setBackgroundResource(i10);
        d dVar = this.O;
        if (dVar != null) {
            dVar.g(i10);
        }
    }

    public void setDropDownHorizontalOffset(int i10) {
        f fVar = this.T;
        if (fVar != null) {
            fVar.m(i10);
            this.T.f(i10);
            return;
        }
        super.setDropDownHorizontalOffset(i10);
    }

    public void setDropDownVerticalOffset(int i10) {
        f fVar = this.T;
        if (fVar != null) {
            fVar.l(i10);
        } else {
            super.setDropDownVerticalOffset(i10);
        }
    }

    public void setDropDownWidth(int i10) {
        if (this.T != null) {
            this.U = i10;
        } else {
            super.setDropDownWidth(i10);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        f fVar = this.T;
        if (fVar != null) {
            fVar.b(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(@u int i10) {
        setPopupBackgroundDrawable(g.a.d(getPopupContext(), i10));
    }

    public void setPrompt(CharSequence charSequence) {
        f fVar = this.T;
        if (fVar != null) {
            fVar.j(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @x0({x0.a.Q})
    public void setSupportBackgroundTintList(@o0 ColorStateList colorStateList) {
        d dVar = this.O;
        if (dVar != null) {
            dVar.i(colorStateList);
        }
    }

    @x0({x0.a.Q})
    public void setSupportBackgroundTintMode(@o0 PorterDuff.Mode mode) {
        d dVar = this.O;
        if (dVar != null) {
            dVar.j(mode);
        }
    }
}
