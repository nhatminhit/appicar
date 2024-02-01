package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import d.o0;
import f.a;
import f1.w1;
import java.lang.ref.WeakReference;

public class AlertController {
    public NestedScrollView A;
    public int B = 0;
    public Drawable C;
    public ImageView D;
    public TextView E;
    public TextView F;
    public View G;
    public ListAdapter H;
    public int I = -1;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public boolean P;
    public int Q = 0;
    public Handler R;
    public final View.OnClickListener S = new a();

    /* renamed from: a  reason: collision with root package name */
    public final Context f658a;

    /* renamed from: b  reason: collision with root package name */
    public final AppCompatDialog f659b;

    /* renamed from: c  reason: collision with root package name */
    public final Window f660c;

    /* renamed from: d  reason: collision with root package name */
    public final int f661d;

    /* renamed from: e  reason: collision with root package name */
    public CharSequence f662e;

    /* renamed from: f  reason: collision with root package name */
    public CharSequence f663f;

    /* renamed from: g  reason: collision with root package name */
    public ListView f664g;

    /* renamed from: h  reason: collision with root package name */
    public View f665h;

    /* renamed from: i  reason: collision with root package name */
    public int f666i;

    /* renamed from: j  reason: collision with root package name */
    public int f667j;

    /* renamed from: k  reason: collision with root package name */
    public int f668k;

    /* renamed from: l  reason: collision with root package name */
    public int f669l;

    /* renamed from: m  reason: collision with root package name */
    public int f670m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f671n = false;

    /* renamed from: o  reason: collision with root package name */
    public Button f672o;

    /* renamed from: p  reason: collision with root package name */
    public CharSequence f673p;

    /* renamed from: q  reason: collision with root package name */
    public Message f674q;

    /* renamed from: r  reason: collision with root package name */
    public Drawable f675r;

    /* renamed from: s  reason: collision with root package name */
    public Button f676s;

    /* renamed from: t  reason: collision with root package name */
    public CharSequence f677t;

    /* renamed from: u  reason: collision with root package name */
    public Message f678u;

    /* renamed from: v  reason: collision with root package name */
    public Drawable f679v;

    /* renamed from: w  reason: collision with root package name */
    public Button f680w;

    /* renamed from: x  reason: collision with root package name */
    public CharSequence f681x;

    /* renamed from: y  reason: collision with root package name */
    public Message f682y;

    /* renamed from: z  reason: collision with root package name */
    public Drawable f683z;

    public static class RecycleListView extends ListView {
        public final int O;
        public final int P;

        public RecycleListView(Context context) {
            this(context, (AttributeSet) null);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.n.RecycleListView);
            this.P = obtainStyledAttributes.getDimensionPixelOffset(a.n.RecycleListView_paddingBottomNoButtons, -1);
            this.O = obtainStyledAttributes.getDimensionPixelOffset(a.n.RecycleListView_paddingTopNoTitle, -1);
        }

        public void a(boolean z10, boolean z11) {
            if (!z11 || !z10) {
                setPadding(getPaddingLeft(), z10 ? getPaddingTop() : this.O, getPaddingRight(), z11 ? getPaddingBottom() : this.P);
            }
        }
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
            r3 = r0.f682y;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r3) {
            /*
                r2 = this;
                androidx.appcompat.app.AlertController r0 = androidx.appcompat.app.AlertController.this
                android.widget.Button r1 = r0.f672o
                if (r3 != r1) goto L_0x000f
                android.os.Message r1 = r0.f674q
                if (r1 == 0) goto L_0x000f
            L_0x000a:
                android.os.Message r3 = android.os.Message.obtain(r1)
                goto L_0x0026
            L_0x000f:
                android.widget.Button r1 = r0.f676s
                if (r3 != r1) goto L_0x0018
                android.os.Message r1 = r0.f678u
                if (r1 == 0) goto L_0x0018
                goto L_0x000a
            L_0x0018:
                android.widget.Button r1 = r0.f680w
                if (r3 != r1) goto L_0x0025
                android.os.Message r3 = r0.f682y
                if (r3 == 0) goto L_0x0025
                android.os.Message r3 = android.os.Message.obtain(r3)
                goto L_0x0026
            L_0x0025:
                r3 = 0
            L_0x0026:
                if (r3 == 0) goto L_0x002b
                r3.sendToTarget()
            L_0x002b:
                androidx.appcompat.app.AlertController r3 = androidx.appcompat.app.AlertController.this
                android.os.Handler r0 = r3.R
                r1 = 1
                androidx.appcompat.app.AppCompatDialog r3 = r3.f659b
                android.os.Message r3 = r0.obtainMessage(r1, r3)
                r3.sendToTarget()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.a.onClick(android.view.View):void");
        }
    }

    public class b implements NestedScrollView.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f684a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f685b;

        public b(View view, View view2) {
            this.f684a = view;
            this.f685b = view2;
        }

        public void a(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13) {
            AlertController.g(nestedScrollView, this.f684a, this.f685b);
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ View O;
        public final /* synthetic */ View P;

        public c(View view, View view2) {
            this.O = view;
            this.P = view2;
        }

        public void run() {
            AlertController.g(AlertController.this.A, this.O, this.P);
        }
    }

    public class d implements AbsListView.OnScrollListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f687a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f688b;

        public d(View view, View view2) {
            this.f687a = view;
            this.f688b = view2;
        }

        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
            AlertController.g(absListView, this.f687a, this.f688b);
        }

        public void onScrollStateChanged(AbsListView absListView, int i10) {
        }
    }

    public class e implements Runnable {
        public final /* synthetic */ View O;
        public final /* synthetic */ View P;

        public e(View view, View view2) {
            this.O = view;
            this.P = view2;
        }

        public void run() {
            AlertController.g(AlertController.this.f664g, this.O, this.P);
        }
    }

    public static class f {
        public int A;
        public int B;
        public int C;
        public int D;
        public boolean E = false;
        public boolean[] F;
        public boolean G;
        public boolean H;
        public int I = -1;
        public DialogInterface.OnMultiChoiceClickListener J;
        public Cursor K;
        public String L;
        public String M;
        public boolean N;
        public AdapterView.OnItemSelectedListener O;
        public e P;
        public boolean Q = true;

        /* renamed from: a  reason: collision with root package name */
        public final Context f690a;

        /* renamed from: b  reason: collision with root package name */
        public final LayoutInflater f691b;

        /* renamed from: c  reason: collision with root package name */
        public int f692c = 0;

        /* renamed from: d  reason: collision with root package name */
        public Drawable f693d;

        /* renamed from: e  reason: collision with root package name */
        public int f694e = 0;

        /* renamed from: f  reason: collision with root package name */
        public CharSequence f695f;

        /* renamed from: g  reason: collision with root package name */
        public View f696g;

        /* renamed from: h  reason: collision with root package name */
        public CharSequence f697h;

        /* renamed from: i  reason: collision with root package name */
        public CharSequence f698i;

        /* renamed from: j  reason: collision with root package name */
        public Drawable f699j;

        /* renamed from: k  reason: collision with root package name */
        public DialogInterface.OnClickListener f700k;

        /* renamed from: l  reason: collision with root package name */
        public CharSequence f701l;

        /* renamed from: m  reason: collision with root package name */
        public Drawable f702m;

        /* renamed from: n  reason: collision with root package name */
        public DialogInterface.OnClickListener f703n;

        /* renamed from: o  reason: collision with root package name */
        public CharSequence f704o;

        /* renamed from: p  reason: collision with root package name */
        public Drawable f705p;

        /* renamed from: q  reason: collision with root package name */
        public DialogInterface.OnClickListener f706q;

        /* renamed from: r  reason: collision with root package name */
        public boolean f707r;

        /* renamed from: s  reason: collision with root package name */
        public DialogInterface.OnCancelListener f708s;

        /* renamed from: t  reason: collision with root package name */
        public DialogInterface.OnDismissListener f709t;

        /* renamed from: u  reason: collision with root package name */
        public DialogInterface.OnKeyListener f710u;

        /* renamed from: v  reason: collision with root package name */
        public CharSequence[] f711v;

        /* renamed from: w  reason: collision with root package name */
        public ListAdapter f712w;

        /* renamed from: x  reason: collision with root package name */
        public DialogInterface.OnClickListener f713x;

        /* renamed from: y  reason: collision with root package name */
        public int f714y;

        /* renamed from: z  reason: collision with root package name */
        public View f715z;

        public class a extends ArrayAdapter<CharSequence> {
            public final /* synthetic */ RecycleListView O;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(Context context, int i10, int i11, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i10, i11, charSequenceArr);
                this.O = recycleListView;
            }

            public View getView(int i10, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i10, view, viewGroup);
                boolean[] zArr = f.this.F;
                if (zArr != null && zArr[i10]) {
                    this.O.setItemChecked(i10, true);
                }
                return view2;
            }
        }

        public class b extends CursorAdapter {
            public final int O;
            public final int P;
            public final /* synthetic */ RecycleListView Q;
            public final /* synthetic */ AlertController R;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(Context context, Cursor cursor, boolean z10, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z10);
                this.Q = recycleListView;
                this.R = alertController;
                Cursor cursor2 = getCursor();
                this.O = cursor2.getColumnIndexOrThrow(f.this.L);
                this.P = cursor2.getColumnIndexOrThrow(f.this.M);
            }

            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(16908308)).setText(cursor.getString(this.O));
                RecycleListView recycleListView = this.Q;
                int position = cursor.getPosition();
                boolean z10 = true;
                if (cursor.getInt(this.P) != 1) {
                    z10 = false;
                }
                recycleListView.setItemChecked(position, z10);
            }

            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return f.this.f691b.inflate(this.R.M, viewGroup, false);
            }
        }

        public class c implements AdapterView.OnItemClickListener {
            public final /* synthetic */ AlertController O;

            public c(AlertController alertController) {
                this.O = alertController;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                f.this.f713x.onClick(this.O.f659b, i10);
                if (!f.this.H) {
                    this.O.f659b.dismiss();
                }
            }
        }

        public class d implements AdapterView.OnItemClickListener {
            public final /* synthetic */ RecycleListView O;
            public final /* synthetic */ AlertController P;

            public d(RecycleListView recycleListView, AlertController alertController) {
                this.O = recycleListView;
                this.P = alertController;
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
                boolean[] zArr = f.this.F;
                if (zArr != null) {
                    zArr[i10] = this.O.isItemChecked(i10);
                }
                f.this.J.onClick(this.P.f659b, i10, this.O.isItemChecked(i10));
            }
        }

        public interface e {
            void a(ListView listView);
        }

        public f(Context context) {
            this.f690a = context;
            this.f707r = true;
            this.f691b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        public void a(AlertController alertController) {
            View view = this.f696g;
            if (view != null) {
                alertController.n(view);
            } else {
                CharSequence charSequence = this.f695f;
                if (charSequence != null) {
                    alertController.s(charSequence);
                }
                Drawable drawable = this.f693d;
                if (drawable != null) {
                    alertController.p(drawable);
                }
                int i10 = this.f692c;
                if (i10 != 0) {
                    alertController.o(i10);
                }
                int i11 = this.f694e;
                if (i11 != 0) {
                    alertController.o(alertController.d(i11));
                }
            }
            CharSequence charSequence2 = this.f697h;
            if (charSequence2 != null) {
                alertController.q(charSequence2);
            }
            CharSequence charSequence3 = this.f698i;
            if (!(charSequence3 == null && this.f699j == null)) {
                alertController.l(-1, charSequence3, this.f700k, (Message) null, this.f699j);
            }
            CharSequence charSequence4 = this.f701l;
            if (!(charSequence4 == null && this.f702m == null)) {
                alertController.l(-2, charSequence4, this.f703n, (Message) null, this.f702m);
            }
            CharSequence charSequence5 = this.f704o;
            if (!(charSequence5 == null && this.f705p == null)) {
                alertController.l(-3, charSequence5, this.f706q, (Message) null, this.f705p);
            }
            if (!(this.f711v == null && this.K == null && this.f712w == null)) {
                b(alertController);
            }
            View view2 = this.f715z;
            if (view2 == null) {
                int i12 = this.f714y;
                if (i12 != 0) {
                    alertController.t(i12);
                }
            } else if (this.E) {
                alertController.v(view2, this.A, this.B, this.C, this.D);
            } else {
                alertController.u(view2);
            }
        }

        /* JADX WARNING: type inference failed for: r9v0, types: [android.widget.ListAdapter] */
        /* JADX WARNING: type inference failed for: r9v3 */
        /* JADX WARNING: type inference failed for: r9v4 */
        /* JADX WARNING: type inference failed for: r2v5, types: [android.widget.SimpleCursorAdapter] */
        /* JADX WARNING: type inference failed for: r1v24, types: [androidx.appcompat.app.AlertController$f$b] */
        /* JADX WARNING: type inference failed for: r1v25, types: [androidx.appcompat.app.AlertController$f$a] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0093  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x009a  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x009e  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(androidx.appcompat.app.AlertController r11) {
            /*
                r10 = this;
                android.view.LayoutInflater r0 = r10.f691b
                int r1 = r11.L
                r2 = 0
                android.view.View r0 = r0.inflate(r1, r2)
                androidx.appcompat.app.AlertController$RecycleListView r0 = (androidx.appcompat.app.AlertController.RecycleListView) r0
                boolean r1 = r10.G
                r8 = 1
                if (r1 == 0) goto L_0x0035
                android.database.Cursor r1 = r10.K
                if (r1 != 0) goto L_0x0026
                androidx.appcompat.app.AlertController$f$a r9 = new androidx.appcompat.app.AlertController$f$a
                android.content.Context r3 = r10.f690a
                int r4 = r11.M
                r5 = 16908308(0x1020014, float:2.3877285E-38)
                java.lang.CharSequence[] r6 = r10.f711v
                r1 = r9
                r2 = r10
                r7 = r0
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x006b
            L_0x0026:
                androidx.appcompat.app.AlertController$f$b r9 = new androidx.appcompat.app.AlertController$f$b
                android.content.Context r3 = r10.f690a
                android.database.Cursor r4 = r10.K
                r5 = 0
                r1 = r9
                r2 = r10
                r6 = r0
                r7 = r11
                r1.<init>(r3, r4, r5, r6, r7)
                goto L_0x006b
            L_0x0035:
                boolean r1 = r10.H
                if (r1 == 0) goto L_0x003c
                int r1 = r11.N
                goto L_0x003e
            L_0x003c:
                int r1 = r11.O
            L_0x003e:
                r4 = r1
                android.database.Cursor r1 = r10.K
                r2 = 16908308(0x1020014, float:2.3877285E-38)
                if (r1 == 0) goto L_0x005d
                android.widget.SimpleCursorAdapter r9 = new android.widget.SimpleCursorAdapter
                android.content.Context r3 = r10.f690a
                android.database.Cursor r5 = r10.K
                java.lang.String[] r6 = new java.lang.String[r8]
                java.lang.String r1 = r10.L
                r7 = 0
                r6[r7] = r1
                int[] r1 = new int[r8]
                r1[r7] = r2
                r2 = r9
                r7 = r1
                r2.<init>(r3, r4, r5, r6, r7)
                goto L_0x006b
            L_0x005d:
                android.widget.ListAdapter r9 = r10.f712w
                if (r9 == 0) goto L_0x0062
                goto L_0x006b
            L_0x0062:
                androidx.appcompat.app.AlertController$h r9 = new androidx.appcompat.app.AlertController$h
                android.content.Context r1 = r10.f690a
                java.lang.CharSequence[] r3 = r10.f711v
                r9.<init>(r1, r4, r2, r3)
            L_0x006b:
                androidx.appcompat.app.AlertController$f$e r1 = r10.P
                if (r1 == 0) goto L_0x0072
                r1.a(r0)
            L_0x0072:
                r11.H = r9
                int r1 = r10.I
                r11.I = r1
                android.content.DialogInterface$OnClickListener r1 = r10.f713x
                if (r1 == 0) goto L_0x0085
                androidx.appcompat.app.AlertController$f$c r1 = new androidx.appcompat.app.AlertController$f$c
                r1.<init>(r11)
            L_0x0081:
                r0.setOnItemClickListener(r1)
                goto L_0x008f
            L_0x0085:
                android.content.DialogInterface$OnMultiChoiceClickListener r1 = r10.J
                if (r1 == 0) goto L_0x008f
                androidx.appcompat.app.AlertController$f$d r1 = new androidx.appcompat.app.AlertController$f$d
                r1.<init>(r0, r11)
                goto L_0x0081
            L_0x008f:
                android.widget.AdapterView$OnItemSelectedListener r1 = r10.O
                if (r1 == 0) goto L_0x0096
                r0.setOnItemSelectedListener(r1)
            L_0x0096:
                boolean r1 = r10.H
                if (r1 == 0) goto L_0x009e
                r0.setChoiceMode(r8)
                goto L_0x00a6
            L_0x009e:
                boolean r1 = r10.G
                if (r1 == 0) goto L_0x00a6
                r1 = 2
                r0.setChoiceMode(r1)
            L_0x00a6:
                r11.f664g = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertController.f.b(androidx.appcompat.app.AlertController):void");
        }
    }

    public static final class g extends Handler {

        /* renamed from: b  reason: collision with root package name */
        public static final int f716b = 1;

        /* renamed from: a  reason: collision with root package name */
        public WeakReference<DialogInterface> f717a;

        public g(DialogInterface dialogInterface) {
            this.f717a = new WeakReference<>(dialogInterface);
        }

        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == -3 || i10 == -2 || i10 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f717a.get(), message.what);
            } else if (i10 == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    public static class h extends ArrayAdapter<CharSequence> {
        public h(Context context, int i10, int i11, CharSequence[] charSequenceArr) {
            super(context, i10, i11, charSequenceArr);
        }

        public long getItemId(int i10) {
            return (long) i10;
        }

        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, AppCompatDialog appCompatDialog, Window window) {
        this.f658a = context;
        this.f659b = appCompatDialog;
        this.f660c = window;
        this.R = new g(appCompatDialog);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, a.n.AlertDialog, a.c.alertDialogStyle, 0);
        this.J = obtainStyledAttributes.getResourceId(a.n.AlertDialog_android_layout, 0);
        this.K = obtainStyledAttributes.getResourceId(a.n.AlertDialog_buttonPanelSideLayout, 0);
        this.L = obtainStyledAttributes.getResourceId(a.n.AlertDialog_listLayout, 0);
        this.M = obtainStyledAttributes.getResourceId(a.n.AlertDialog_multiChoiceItemLayout, 0);
        this.N = obtainStyledAttributes.getResourceId(a.n.AlertDialog_singleChoiceItemLayout, 0);
        this.O = obtainStyledAttributes.getResourceId(a.n.AlertDialog_listItemLayout, 0);
        this.P = obtainStyledAttributes.getBoolean(a.n.AlertDialog_showTitle, true);
        this.f661d = obtainStyledAttributes.getDimensionPixelSize(a.n.AlertDialog_buttonIconDimen, 0);
        obtainStyledAttributes.recycle();
        appCompatDialog.e(1);
    }

    public static boolean B(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(a.c.alertDialogCenterButtons, typedValue, true);
        return typedValue.data != 0;
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static void g(View view, View view2, View view3) {
        int i10 = 0;
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i10 = 4;
            }
            view3.setVisibility(i10);
        }
    }

    public final void A() {
        ListAdapter listAdapter;
        View findViewById;
        View findViewById2;
        View findViewById3 = this.f660c.findViewById(a.h.parentPanel);
        int i10 = a.h.topPanel;
        View findViewById4 = findViewById3.findViewById(i10);
        int i11 = a.h.contentPanel;
        View findViewById5 = findViewById3.findViewById(i11);
        int i12 = a.h.buttonPanel;
        View findViewById6 = findViewById3.findViewById(i12);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(a.h.customPanel);
        y(viewGroup);
        View findViewById7 = viewGroup.findViewById(i10);
        View findViewById8 = viewGroup.findViewById(i11);
        View findViewById9 = viewGroup.findViewById(i12);
        ViewGroup j10 = j(findViewById7, findViewById4);
        ViewGroup j11 = j(findViewById8, findViewById5);
        ViewGroup j12 = j(findViewById9, findViewById6);
        x(j11);
        w(j12);
        z(j10);
        char c10 = 0;
        boolean z10 = viewGroup.getVisibility() != 8;
        boolean z11 = (j10 == null || j10.getVisibility() == 8) ? false : true;
        boolean z12 = (j12 == null || j12.getVisibility() == 8) ? false : true;
        if (!(z12 || j11 == null || (findViewById2 = j11.findViewById(a.h.textSpacerNoButtons)) == null)) {
            findViewById2.setVisibility(0);
        }
        if (z11) {
            NestedScrollView nestedScrollView = this.A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View view = null;
            if (!(this.f663f == null && this.f664g == null)) {
                view = j10.findViewById(a.h.titleDividerNoCustom);
            }
            if (view != null) {
                view.setVisibility(0);
            }
        } else if (!(j11 == null || (findViewById = j11.findViewById(a.h.textSpacerNoTitle)) == null)) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f664g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z11, z12);
        }
        if (!z10) {
            View view2 = this.f664g;
            if (view2 == null) {
                view2 = this.A;
            }
            if (view2 != null) {
                if (z12) {
                    c10 = 2;
                }
                r(j11, view2, z11 | c10 ? 1 : 0, 3);
            }
        }
        ListView listView2 = this.f664g;
        if (listView2 != null && (listAdapter = this.H) != null) {
            listView2.setAdapter(listAdapter);
            int i13 = this.I;
            if (i13 > -1) {
                listView2.setItemChecked(i13, true);
                listView2.setSelection(i13);
            }
        }
    }

    public final void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    public Button c(int i10) {
        if (i10 == -3) {
            return this.f680w;
        }
        if (i10 == -2) {
            return this.f676s;
        }
        if (i10 != -1) {
            return null;
        }
        return this.f672o;
    }

    public int d(int i10) {
        TypedValue typedValue = new TypedValue();
        this.f658a.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView e() {
        return this.f664g;
    }

    public void f() {
        this.f659b.setContentView(k());
        A();
    }

    public boolean h(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.p(keyEvent);
    }

    public boolean i(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.p(keyEvent);
    }

    @o0
    public final ViewGroup j(@o0 View view, @o0 View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final int k() {
        int i10 = this.K;
        return i10 == 0 ? this.J : this.Q == 1 ? i10 : this.J;
    }

    public void l(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.R.obtainMessage(i10, onClickListener);
        }
        if (i10 == -3) {
            this.f681x = charSequence;
            this.f682y = message;
            this.f683z = drawable;
        } else if (i10 == -2) {
            this.f677t = charSequence;
            this.f678u = message;
            this.f679v = drawable;
        } else if (i10 == -1) {
            this.f673p = charSequence;
            this.f674q = message;
            this.f675r = drawable;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }

    public void m(int i10) {
        this.Q = i10;
    }

    public void n(View view) {
        this.G = view;
    }

    public void o(int i10) {
        this.C = null;
        this.B = i10;
        ImageView imageView = this.D;
        if (imageView == null) {
            return;
        }
        if (i10 != 0) {
            imageView.setVisibility(0);
            this.D.setImageResource(this.B);
            return;
        }
        imageView.setVisibility(8);
    }

    public void p(Drawable drawable) {
        this.C = drawable;
        this.B = 0;
        ImageView imageView = this.D;
        if (imageView == null) {
            return;
        }
        if (drawable != null) {
            imageView.setVisibility(0);
            this.D.setImageDrawable(drawable);
            return;
        }
        imageView.setVisibility(8);
    }

    public void q(CharSequence charSequence) {
        this.f663f = charSequence;
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final void r(ViewGroup viewGroup, View view, int i10, int i11) {
        View findViewById = this.f660c.findViewById(a.h.scrollIndicatorUp);
        View findViewById2 = this.f660c.findViewById(a.h.scrollIndicatorDown);
        w1.n2(view, i10, i11);
        if (findViewById != null) {
            viewGroup.removeView(findViewById);
        }
        if (findViewById2 != null) {
            viewGroup.removeView(findViewById2);
        }
    }

    public void s(CharSequence charSequence) {
        this.f662e = charSequence;
        TextView textView = this.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void t(int i10) {
        this.f665h = null;
        this.f666i = i10;
        this.f671n = false;
    }

    public void u(View view) {
        this.f665h = view;
        this.f666i = 0;
        this.f671n = false;
    }

    public void v(View view, int i10, int i11, int i12, int i13) {
        this.f665h = view;
        this.f666i = 0;
        this.f671n = true;
        this.f667j = i10;
        this.f668k = i11;
        this.f669l = i12;
        this.f670m = i13;
    }

    public final void w(ViewGroup viewGroup) {
        boolean z10;
        Button button;
        Button button2 = (Button) viewGroup.findViewById(16908313);
        this.f672o = button2;
        button2.setOnClickListener(this.S);
        boolean z11 = true;
        if (!TextUtils.isEmpty(this.f673p) || this.f675r != null) {
            this.f672o.setText(this.f673p);
            Drawable drawable = this.f675r;
            if (drawable != null) {
                int i10 = this.f661d;
                drawable.setBounds(0, 0, i10, i10);
                this.f672o.setCompoundDrawables(this.f675r, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f672o.setVisibility(0);
            z10 = true;
        } else {
            this.f672o.setVisibility(8);
            z10 = false;
        }
        Button button3 = (Button) viewGroup.findViewById(16908314);
        this.f676s = button3;
        button3.setOnClickListener(this.S);
        if (!TextUtils.isEmpty(this.f677t) || this.f679v != null) {
            this.f676s.setText(this.f677t);
            Drawable drawable2 = this.f679v;
            if (drawable2 != null) {
                int i11 = this.f661d;
                drawable2.setBounds(0, 0, i11, i11);
                this.f676s.setCompoundDrawables(this.f679v, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f676s.setVisibility(0);
            z10 |= true;
        } else {
            this.f676s.setVisibility(8);
        }
        Button button4 = (Button) viewGroup.findViewById(16908315);
        this.f680w = button4;
        button4.setOnClickListener(this.S);
        if (!TextUtils.isEmpty(this.f681x) || this.f683z != null) {
            this.f680w.setText(this.f681x);
            Drawable drawable3 = this.f683z;
            if (drawable3 != null) {
                int i12 = this.f661d;
                drawable3.setBounds(0, 0, i12, i12);
                this.f680w.setCompoundDrawables(this.f683z, (Drawable) null, (Drawable) null, (Drawable) null);
            }
            this.f680w.setVisibility(0);
            z10 |= true;
        } else {
            this.f680w.setVisibility(8);
        }
        if (B(this.f658a)) {
            if (z10) {
                button = this.f672o;
            } else if (z10) {
                button = this.f676s;
            } else if (z10) {
                button = this.f680w;
            }
            b(button);
        }
        if (!z10) {
            z11 = false;
        }
        if (!z11) {
            viewGroup.setVisibility(8);
        }
    }

    public final void x(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f660c.findViewById(a.h.scrollView);
        this.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(16908299);
        this.F = textView;
        if (textView != null) {
            CharSequence charSequence = this.f663f;
            if (charSequence != null) {
                textView.setText(charSequence);
                return;
            }
            textView.setVisibility(8);
            this.A.removeView(this.F);
            if (this.f664g != null) {
                ViewGroup viewGroup2 = (ViewGroup) this.A.getParent();
                int indexOfChild = viewGroup2.indexOfChild(this.A);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(this.f664g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                return;
            }
            viewGroup.setVisibility(8);
        }
    }

    public final void y(ViewGroup viewGroup) {
        View view = this.f665h;
        boolean z10 = false;
        if (view == null) {
            view = this.f666i != 0 ? LayoutInflater.from(this.f658a).inflate(this.f666i, viewGroup, false) : null;
        }
        if (view != null) {
            z10 = true;
        }
        if (!z10 || !a(view)) {
            this.f660c.setFlags(131072, 131072);
        }
        if (z10) {
            FrameLayout frameLayout = (FrameLayout) this.f660c.findViewById(a.h.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.f671n) {
                frameLayout.setPadding(this.f667j, this.f668k, this.f669l, this.f670m);
            }
            if (this.f664g != null) {
                ((LinearLayoutCompat.b) viewGroup.getLayoutParams()).weight = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    public final void z(ViewGroup viewGroup) {
        View view;
        if (this.G != null) {
            viewGroup.addView(this.G, 0, new ViewGroup.LayoutParams(-1, -2));
            view = this.f660c.findViewById(a.h.title_template);
        } else {
            this.D = (ImageView) this.f660c.findViewById(16908294);
            if (!(!TextUtils.isEmpty(this.f662e)) || !this.P) {
                this.f660c.findViewById(a.h.title_template).setVisibility(8);
                this.D.setVisibility(8);
                view = viewGroup;
            } else {
                TextView textView = (TextView) this.f660c.findViewById(a.h.alertTitle);
                this.E = textView;
                textView.setText(this.f662e);
                int i10 = this.B;
                if (i10 != 0) {
                    this.D.setImageResource(i10);
                    return;
                }
                Drawable drawable = this.C;
                if (drawable != null) {
                    this.D.setImageDrawable(drawable);
                    return;
                }
                this.E.setPadding(this.D.getPaddingLeft(), this.D.getPaddingTop(), this.D.getPaddingRight(), this.D.getPaddingBottom());
                this.D.setVisibility(8);
                return;
            }
        }
        view.setVisibility(8);
    }
}
