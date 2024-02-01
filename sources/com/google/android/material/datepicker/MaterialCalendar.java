package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x;
import com.google.android.material.button.MaterialButton;
import d.b1;
import d.g1;
import d.m0;
import d.o0;
import d.r0;
import d.x0;
import f1.w1;
import g1.z;
import i9.a;
import java.util.Calendar;
import java.util.Iterator;

@x0({x0.a.LIBRARY_GROUP})
public final class MaterialCalendar<S> extends j<S> {

    /* renamed from: j1  reason: collision with root package name */
    public static final String f16959j1 = "THEME_RES_ID_KEY";

    /* renamed from: k1  reason: collision with root package name */
    public static final String f16960k1 = "GRID_SELECTOR_KEY";

    /* renamed from: l1  reason: collision with root package name */
    public static final String f16961l1 = "CALENDAR_CONSTRAINTS_KEY";

    /* renamed from: m1  reason: collision with root package name */
    public static final String f16962m1 = "CURRENT_MONTH_KEY";

    /* renamed from: n1  reason: collision with root package name */
    public static final int f16963n1 = 3;
    @g1

    /* renamed from: o1  reason: collision with root package name */
    public static final Object f16964o1 = "MONTHS_VIEW_GROUP_TAG";
    @g1

    /* renamed from: p1  reason: collision with root package name */
    public static final Object f16965p1 = "NAVIGATION_PREV_TAG";
    @g1

    /* renamed from: q1  reason: collision with root package name */
    public static final Object f16966q1 = "NAVIGATION_NEXT_TAG";
    @g1

    /* renamed from: r1  reason: collision with root package name */
    public static final Object f16967r1 = "SELECTOR_TOGGLE_TAG";
    @b1
    public int Z0;
    @o0

    /* renamed from: a1  reason: collision with root package name */
    public DateSelector<S> f16968a1;
    @o0

    /* renamed from: b1  reason: collision with root package name */
    public CalendarConstraints f16969b1;
    @o0

    /* renamed from: c1  reason: collision with root package name */
    public Month f16970c1;

    /* renamed from: d1  reason: collision with root package name */
    public k f16971d1;

    /* renamed from: e1  reason: collision with root package name */
    public b f16972e1;

    /* renamed from: f1  reason: collision with root package name */
    public RecyclerView f16973f1;

    /* renamed from: g1  reason: collision with root package name */
    public RecyclerView f16974g1;

    /* renamed from: h1  reason: collision with root package name */
    public View f16975h1;

    /* renamed from: i1  reason: collision with root package name */
    public View f16976i1;

    public class a implements Runnable {
        public final /* synthetic */ int O;

        public a(int i10) {
            this.O = i10;
        }

        public void run() {
            MaterialCalendar.this.f16974g1.K1(this.O);
        }
    }

    public class b extends f1.a {
        public b() {
        }

        public void g(View view, @m0 z zVar) {
            super.g(view, zVar);
            zVar.W0((Object) null);
        }
    }

    public class c extends k {
        public final /* synthetic */ int P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Context context, int i10, boolean z10, int i11) {
            super(context, i10, z10);
            this.P = i11;
        }

        public void k2(@m0 RecyclerView.b0 b0Var, @m0 int[] iArr) {
            if (this.P == 0) {
                iArr[0] = MaterialCalendar.this.f16974g1.getWidth();
                iArr[1] = MaterialCalendar.this.f16974g1.getWidth();
                return;
            }
            iArr[0] = MaterialCalendar.this.f16974g1.getHeight();
            iArr[1] = MaterialCalendar.this.f16974g1.getHeight();
        }
    }

    public class d implements l {
        public d() {
        }

        public void a(long j10) {
            if (MaterialCalendar.this.f16969b1.f().k0(j10)) {
                MaterialCalendar.this.f16968a1.W0(j10);
                Iterator<i<S>> it = MaterialCalendar.this.Y0.iterator();
                while (it.hasNext()) {
                    it.next().b(MaterialCalendar.this.f16968a1.T0());
                }
                MaterialCalendar.this.f16974g1.getAdapter().j();
                if (MaterialCalendar.this.f16973f1 != null) {
                    MaterialCalendar.this.f16973f1.getAdapter().j();
                }
            }
        }
    }

    public class e extends RecyclerView.n {

        /* renamed from: a  reason: collision with root package name */
        public final Calendar f16979a = m.v();

        /* renamed from: b  reason: collision with root package name */
        public final Calendar f16980b = m.v();

        public e() {
        }

        public void i(@m0 Canvas canvas, @m0 RecyclerView recyclerView, @m0 RecyclerView.b0 b0Var) {
            if ((recyclerView.getAdapter() instanceof n) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                n nVar = (n) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (e1.j next : MaterialCalendar.this.f16968a1.k()) {
                    F f10 = next.f6732a;
                    if (!(f10 == null || next.f6733b == null)) {
                        this.f16979a.setTimeInMillis(((Long) f10).longValue());
                        this.f16980b.setTimeInMillis(((Long) next.f6733b).longValue());
                        int H = nVar.H(this.f16979a.get(1));
                        int H2 = nVar.H(this.f16980b.get(1));
                        View J = gridLayoutManager.J(H);
                        View J2 = gridLayoutManager.J(H2);
                        int H3 = H / gridLayoutManager.H3();
                        int H32 = H2 / gridLayoutManager.H3();
                        int i10 = H3;
                        while (i10 <= H32) {
                            View J3 = gridLayoutManager.J(gridLayoutManager.H3() * i10);
                            if (J3 != null) {
                                canvas.drawRect((float) (i10 == H3 ? J.getLeft() + (J.getWidth() / 2) : 0), (float) (J3.getTop() + MaterialCalendar.this.f16972e1.f17015d.e()), (float) (i10 == H32 ? J2.getLeft() + (J2.getWidth() / 2) : recyclerView.getWidth()), (float) (J3.getBottom() - MaterialCalendar.this.f16972e1.f17015d.b()), MaterialCalendar.this.f16972e1.f17019h);
                            }
                            i10++;
                        }
                    }
                }
            }
        }
    }

    public class f extends f1.a {
        public f() {
        }

        public void g(View view, @m0 z zVar) {
            MaterialCalendar materialCalendar;
            int i10;
            super.g(view, zVar);
            if (MaterialCalendar.this.f16976i1.getVisibility() == 0) {
                materialCalendar = MaterialCalendar.this;
                i10 = a.m.mtrl_picker_toggle_to_year_selection;
            } else {
                materialCalendar = MaterialCalendar.this;
                i10 = a.m.mtrl_picker_toggle_to_day_selection;
            }
            zVar.j1(materialCalendar.getString(i10));
        }
    }

    public class g extends RecyclerView.t {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ h f16983a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ MaterialButton f16984b;

        public g(h hVar, MaterialButton materialButton) {
            this.f16983a = hVar;
            this.f16984b = materialButton;
        }

        public void a(@m0 RecyclerView recyclerView, int i10) {
            if (i10 == 0) {
                recyclerView.announceForAccessibility(this.f16984b.getText());
            }
        }

        public void b(@m0 RecyclerView recyclerView, int i10, int i11) {
            LinearLayoutManager a12 = MaterialCalendar.this.a1();
            int y22 = i10 < 0 ? a12.y2() : a12.C2();
            Month unused = MaterialCalendar.this.f16970c1 = this.f16983a.G(y22);
            this.f16984b.setText(this.f16983a.H(y22));
        }
    }

    public class h implements View.OnClickListener {
        public h() {
        }

        public void onClick(View view) {
            MaterialCalendar.this.f1();
        }
    }

    public class i implements View.OnClickListener {
        public final /* synthetic */ h O;

        public i(h hVar) {
            this.O = hVar;
        }

        public void onClick(View view) {
            int y22 = MaterialCalendar.this.a1().y2() + 1;
            if (y22 < MaterialCalendar.this.f16974g1.getAdapter().e()) {
                MaterialCalendar.this.d1(this.O.G(y22));
            }
        }
    }

    public class j implements View.OnClickListener {
        public final /* synthetic */ h O;

        public j(h hVar) {
            this.O = hVar;
        }

        public void onClick(View view) {
            int C2 = MaterialCalendar.this.a1().C2() - 1;
            if (C2 >= 0) {
                MaterialCalendar.this.d1(this.O.G(C2));
            }
        }
    }

    public enum k {
        DAY,
        YEAR
    }

    public interface l {
        void a(long j10);
    }

    @r0
    public static int Z0(@m0 Context context) {
        return context.getResources().getDimensionPixelSize(a.f.mtrl_calendar_day_height);
    }

    @m0
    public static <T> MaterialCalendar<T> b1(@m0 DateSelector<T> dateSelector, @b1 int i10, @m0 CalendarConstraints calendarConstraints) {
        MaterialCalendar<T> materialCalendar = new MaterialCalendar<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable(f16960k1, dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable(f16962m1, calendarConstraints.j());
        materialCalendar.setArguments(bundle);
        return materialCalendar;
    }

    public boolean J0(@m0 i<S> iVar) {
        return super.J0(iVar);
    }

    @o0
    public DateSelector<S> L0() {
        return this.f16968a1;
    }

    public final void U0(@m0 View view, @m0 h hVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(a.h.month_navigation_fragment_toggle);
        materialButton.setTag(f16967r1);
        w1.z1(materialButton, new f());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(a.h.month_navigation_previous);
        materialButton2.setTag(f16965p1);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(a.h.month_navigation_next);
        materialButton3.setTag(f16966q1);
        this.f16975h1 = view.findViewById(a.h.mtrl_calendar_year_selector_frame);
        this.f16976i1 = view.findViewById(a.h.mtrl_calendar_day_selector_frame);
        e1(k.DAY);
        materialButton.setText(this.f16970c1.o(view.getContext()));
        this.f16974g1.r(new g(hVar, materialButton));
        materialButton.setOnClickListener(new h());
        materialButton3.setOnClickListener(new i(hVar));
        materialButton2.setOnClickListener(new j(hVar));
    }

    @m0
    public final RecyclerView.n V0() {
        return new e();
    }

    @o0
    public CalendarConstraints W0() {
        return this.f16969b1;
    }

    public b X0() {
        return this.f16972e1;
    }

    @o0
    public Month Y0() {
        return this.f16970c1;
    }

    @m0
    public LinearLayoutManager a1() {
        return (LinearLayoutManager) this.f16974g1.getLayoutManager();
    }

    public final void c1(int i10) {
        this.f16974g1.post(new a(i10));
    }

    public void d1(Month month) {
        RecyclerView recyclerView;
        int i10;
        h hVar = (h) this.f16974g1.getAdapter();
        int I = hVar.I(month);
        int I2 = I - hVar.I(this.f16970c1);
        boolean z10 = true;
        boolean z11 = Math.abs(I2) > 3;
        if (I2 <= 0) {
            z10 = false;
        }
        this.f16970c1 = month;
        if (!z11 || !z10) {
            if (z11) {
                recyclerView = this.f16974g1;
                i10 = I + 3;
            }
            c1(I);
        }
        recyclerView = this.f16974g1;
        i10 = I - 3;
        recyclerView.C1(i10);
        c1(I);
    }

    public void e1(k kVar) {
        this.f16971d1 = kVar;
        if (kVar == k.YEAR) {
            this.f16973f1.getLayoutManager().R1(((n) this.f16973f1.getAdapter()).H(this.f16970c1.Q));
            this.f16975h1.setVisibility(0);
            this.f16976i1.setVisibility(8);
        } else if (kVar == k.DAY) {
            this.f16975h1.setVisibility(8);
            this.f16976i1.setVisibility(0);
            d1(this.f16970c1);
        }
    }

    public void f1() {
        k kVar = this.f16971d1;
        k kVar2 = k.YEAR;
        if (kVar == kVar2) {
            e1(k.DAY);
        } else if (kVar == k.DAY) {
            e1(kVar2);
        }
    }

    public void onCreate(@o0 Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.Z0 = bundle.getInt("THEME_RES_ID_KEY");
        this.f16968a1 = (DateSelector) bundle.getParcelable(f16960k1);
        this.f16969b1 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f16970c1 = (Month) bundle.getParcelable(f16962m1);
    }

    @m0
    public View onCreateView(@m0 LayoutInflater layoutInflater, @o0 ViewGroup viewGroup, @o0 Bundle bundle) {
        int i10;
        int i11;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.Z0);
        this.f16972e1 = new b(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month l10 = this.f16969b1.l();
        if (MaterialDatePicker.n1(contextThemeWrapper)) {
            i11 = a.k.mtrl_calendar_vertical;
            i10 = 1;
        } else {
            i11 = a.k.mtrl_calendar_horizontal;
            i10 = 0;
        }
        View inflate = cloneInContext.inflate(i11, viewGroup, false);
        GridView gridView = (GridView) inflate.findViewById(a.h.mtrl_calendar_days_of_week);
        w1.z1(gridView, new b());
        gridView.setAdapter(new e());
        gridView.setNumColumns(l10.R);
        gridView.setEnabled(false);
        this.f16974g1 = (RecyclerView) inflate.findViewById(a.h.mtrl_calendar_months);
        this.f16974g1.setLayoutManager(new c(getContext(), i10, false, i10));
        this.f16974g1.setTag(f16964o1);
        h hVar = new h(contextThemeWrapper, this.f16968a1, this.f16969b1, new d());
        this.f16974g1.setAdapter(hVar);
        int integer = contextThemeWrapper.getResources().getInteger(a.i.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(a.h.mtrl_calendar_year_selector_frame);
        this.f16973f1 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f16973f1.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f16973f1.setAdapter(new n(this));
            this.f16973f1.n(V0());
        }
        if (inflate.findViewById(a.h.month_navigation_fragment_toggle) != null) {
            U0(inflate, hVar);
        }
        if (!MaterialDatePicker.n1(contextThemeWrapper)) {
            new x().b(this.f16974g1);
        }
        this.f16974g1.C1(hVar.I(this.f16970c1));
        return inflate;
    }

    public void onSaveInstanceState(@m0 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.Z0);
        bundle.putParcelable(f16960k1, this.f16968a1);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f16969b1);
        bundle.putParcelable(f16962m1, this.f16970c1);
    }
}
