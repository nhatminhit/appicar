package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.customview.view.AbsSavedState;
import d.m0;
import d.o0;
import d.x0;
import f.a;
import f1.w1;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class SearchView extends LinearLayoutCompat implements k.c {

    /* renamed from: q1  reason: collision with root package name */
    public static final boolean f1125q1 = false;

    /* renamed from: r1  reason: collision with root package name */
    public static final String f1126r1 = "SearchView";

    /* renamed from: s1  reason: collision with root package name */
    public static final String f1127s1 = "nm";

    /* renamed from: t1  reason: collision with root package name */
    public static final n f1128t1 = (Build.VERSION.SDK_INT < 29 ? new n() : null);
    public final View A0;
    public o B0;
    public Rect C0;
    public Rect D0;
    public int[] E0;
    public int[] F0;
    public final ImageView G0;
    public final Drawable H0;
    public final int I0;
    public final int J0;
    public final Intent K0;
    public final Intent L0;
    public final CharSequence M0;
    public l N0;
    public k O0;
    public View.OnFocusChangeListener P0;
    public m Q0;
    public View.OnClickListener R0;
    public boolean S0;
    public boolean T0;
    public k1.a U0;
    public boolean V0;
    public CharSequence W0;
    public boolean X0;
    public boolean Y0;
    public int Z0;

    /* renamed from: a1  reason: collision with root package name */
    public boolean f1129a1;

    /* renamed from: b1  reason: collision with root package name */
    public CharSequence f1130b1;

    /* renamed from: c1  reason: collision with root package name */
    public CharSequence f1131c1;

    /* renamed from: d1  reason: collision with root package name */
    public boolean f1132d1;

    /* renamed from: e1  reason: collision with root package name */
    public int f1133e1;

    /* renamed from: f1  reason: collision with root package name */
    public SearchableInfo f1134f1;

    /* renamed from: g1  reason: collision with root package name */
    public Bundle f1135g1;

    /* renamed from: h1  reason: collision with root package name */
    public final Runnable f1136h1;

    /* renamed from: i1  reason: collision with root package name */
    public Runnable f1137i1;

    /* renamed from: j1  reason: collision with root package name */
    public final WeakHashMap<String, Drawable.ConstantState> f1138j1;

    /* renamed from: k1  reason: collision with root package name */
    public final View.OnClickListener f1139k1;

    /* renamed from: l1  reason: collision with root package name */
    public View.OnKeyListener f1140l1;

    /* renamed from: m1  reason: collision with root package name */
    public final TextView.OnEditorActionListener f1141m1;

    /* renamed from: n1  reason: collision with root package name */
    public final AdapterView.OnItemClickListener f1142n1;

    /* renamed from: o1  reason: collision with root package name */
    public final AdapterView.OnItemSelectedListener f1143o1;

    /* renamed from: p1  reason: collision with root package name */
    public TextWatcher f1144p1;

    /* renamed from: s0  reason: collision with root package name */
    public final SearchAutoComplete f1145s0;

    /* renamed from: t0  reason: collision with root package name */
    public final View f1146t0;

    /* renamed from: u0  reason: collision with root package name */
    public final View f1147u0;

    /* renamed from: v0  reason: collision with root package name */
    public final View f1148v0;

    /* renamed from: w0  reason: collision with root package name */
    public final ImageView f1149w0;

    /* renamed from: x0  reason: collision with root package name */
    public final ImageView f1150x0;

    /* renamed from: y0  reason: collision with root package name */
    public final ImageView f1151y0;

    /* renamed from: z0  reason: collision with root package name */
    public final ImageView f1152z0;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public boolean Q;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: c */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.Q = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.Q + p7.a.f11639j;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeValue(Boolean.valueOf(this.Q));
        }
    }

    @x0({x0.a.Q})
    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {
        public int R;
        public SearchView S;
        public boolean T;
        public final Runnable U;

        public class a implements Runnable {
            public a() {
            }

            public void run() {
                SearchAutoComplete.this.c();
            }
        }

        public SearchAutoComplete(Context context) {
            this(context, (AttributeSet) null);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, a.c.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.U = new a();
            this.R = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 >= 960 && i11 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i10 < 600) {
                return (i10 < 640 || i11 < 480) ? 160 : 192;
            }
            return 192;
        }

        public void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                setInputMethodMode(1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            SearchView.f1128t1.c(this);
        }

        public boolean b() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        public void c() {
            if (this.T) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.T = false;
            }
        }

        public boolean enoughToFilter() {
            return this.R <= 0 || super.enoughToFilter();
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.T) {
                removeCallbacks(this.U);
                post(this.U);
            }
            return onCreateInputConnection;
        }

        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        public void onFocusChanged(boolean z10, int i10, Rect rect) {
            super.onFocusChanged(z10, i10, rect);
            this.S.e0();
        }

        public boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.S.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i10, keyEvent);
        }

        public void onWindowFocusChanged(boolean z10) {
            super.onWindowFocusChanged(z10);
            if (z10 && this.S.hasFocus() && getVisibility() == 0) {
                this.T = true;
                if (SearchView.P(getContext())) {
                    a();
                }
            }
        }

        public void performCompletion() {
        }

        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z10) {
                this.T = false;
                removeCallbacks(this.U);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.T = false;
                removeCallbacks(this.U);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.T = true;
            }
        }

        public void setSearchView(SearchView searchView) {
            this.S = searchView;
        }

        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.R = i10;
        }
    }

    public class a implements TextWatcher {
        public a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            SearchView.this.d0(charSequence);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            SearchView.this.k0();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public void run() {
            k1.a aVar = SearchView.this.U0;
            if (aVar instanceof q0) {
                aVar.a((Cursor) null);
            }
        }
    }

    public class d implements View.OnFocusChangeListener {
        public d() {
        }

        public void onFocusChange(View view, boolean z10) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.P0;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z10);
            }
        }
    }

    public class e implements View.OnLayoutChangeListener {
        public e() {
        }

        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            SearchView.this.D();
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f1149w0) {
                searchView.a0();
            } else if (view == searchView.f1151y0) {
                searchView.W();
            } else if (view == searchView.f1150x0) {
                searchView.b0();
            } else if (view == searchView.f1152z0) {
                searchView.f0();
            } else if (view == searchView.f1145s0) {
                searchView.J();
            }
        }
    }

    public class g implements View.OnKeyListener {
        public g() {
        }

        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f1134f1 == null) {
                return false;
            }
            if (searchView.f1145s0.isPopupShowing() && SearchView.this.f1145s0.getListSelection() != -1) {
                return SearchView.this.c0(view, i10, keyEvent);
            }
            if (SearchView.this.f1145s0.b() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i10 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.U(0, (String) null, searchView2.f1145s0.getText().toString());
            return true;
        }
    }

    public class h implements TextView.OnEditorActionListener {
        public h() {
        }

        public boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
            SearchView.this.b0();
            return true;
        }
    }

    public class i implements AdapterView.OnItemClickListener {
        public i() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.X(i10, 0, (String) null);
        }
    }

    public class j implements AdapterView.OnItemSelectedListener {
        public j() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            SearchView.this.Y(i10);
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public interface k {
        boolean onClose();
    }

    public interface l {
        boolean onQueryTextChange(String str);

        boolean onQueryTextSubmit(String str);
    }

    public interface m {
        boolean onSuggestionClick(int i10);

        boolean onSuggestionSelect(int i10);
    }

    public static class n {

        /* renamed from: a  reason: collision with root package name */
        public Method f1153a = null;

        /* renamed from: b  reason: collision with root package name */
        public Method f1154b = null;

        /* renamed from: c  reason: collision with root package name */
        public Method f1155c = null;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        public n() {
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f1153a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f1154b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            Class<AutoCompleteTextView> cls = AutoCompleteTextView.class;
            try {
                Method method = cls.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.f1155c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        public static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        public void a(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f1154b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        public void b(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f1153a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        public void c(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f1155c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[]{Boolean.TRUE});
                } catch (Exception unused) {
                }
            }
        }
    }

    public static class o extends TouchDelegate {

        /* renamed from: a  reason: collision with root package name */
        public final View f1156a;

        /* renamed from: b  reason: collision with root package name */
        public final Rect f1157b = new Rect();

        /* renamed from: c  reason: collision with root package name */
        public final Rect f1158c = new Rect();

        /* renamed from: d  reason: collision with root package name */
        public final Rect f1159d = new Rect();

        /* renamed from: e  reason: collision with root package name */
        public final int f1160e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f1161f;

        public o(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f1160e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            a(rect, rect2);
            this.f1156a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f1157b.set(rect);
            this.f1159d.set(rect);
            Rect rect3 = this.f1159d;
            int i10 = this.f1160e;
            rect3.inset(-i10, -i10);
            this.f1158c.set(rect2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0043  */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r9) {
            /*
                r8 = this;
                float r0 = r9.getX()
                int r0 = (int) r0
                float r1 = r9.getY()
                int r1 = (int) r1
                int r2 = r9.getAction()
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L_0x0033
                if (r2 == r4) goto L_0x0020
                if (r2 == r3) goto L_0x0020
                r6 = 3
                if (r2 == r6) goto L_0x001b
                goto L_0x003f
            L_0x001b:
                boolean r2 = r8.f1161f
                r8.f1161f = r5
                goto L_0x002f
            L_0x0020:
                boolean r2 = r8.f1161f
                if (r2 == 0) goto L_0x002f
                android.graphics.Rect r6 = r8.f1159d
                boolean r6 = r6.contains(r0, r1)
                if (r6 != 0) goto L_0x002f
                r4 = r2
                r2 = r5
                goto L_0x0041
            L_0x002f:
                r7 = r4
                r4 = r2
                r2 = r7
                goto L_0x0041
            L_0x0033:
                android.graphics.Rect r2 = r8.f1157b
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x003f
                r8.f1161f = r4
                r2 = r4
                goto L_0x0041
            L_0x003f:
                r2 = r4
                r4 = r5
            L_0x0041:
                if (r4 == 0) goto L_0x0070
                if (r2 == 0) goto L_0x005d
                android.graphics.Rect r2 = r8.f1158c
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L_0x005d
                android.view.View r0 = r8.f1156a
                int r0 = r0.getWidth()
                int r0 = r0 / r3
                float r0 = (float) r0
                android.view.View r1 = r8.f1156a
                int r1 = r1.getHeight()
                int r1 = r1 / r3
                goto L_0x0066
            L_0x005d:
                android.graphics.Rect r2 = r8.f1158c
                int r3 = r2.left
                int r0 = r0 - r3
                float r0 = (float) r0
                int r2 = r2.top
                int r1 = r1 - r2
            L_0x0066:
                float r1 = (float) r1
                r9.setLocation(r0, r1)
                android.view.View r0 = r8.f1156a
                boolean r5 = r0.dispatchTouchEvent(r9)
            L_0x0070:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.o.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public SearchView(@m0 Context context) {
        this(context, (AttributeSet) null);
    }

    public SearchView(@m0 Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.searchViewStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchView(@m0 Context context, @o0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.C0 = new Rect();
        this.D0 = new Rect();
        this.E0 = new int[2];
        this.F0 = new int[2];
        this.f1136h1 = new b();
        this.f1137i1 = new c();
        this.f1138j1 = new WeakHashMap<>();
        f fVar = new f();
        this.f1139k1 = fVar;
        this.f1140l1 = new g();
        h hVar = new h();
        this.f1141m1 = hVar;
        i iVar = new i();
        this.f1142n1 = iVar;
        j jVar = new j();
        this.f1143o1 = jVar;
        this.f1144p1 = new a();
        w0 G = w0.G(context, attributeSet, a.n.SearchView, i10, 0);
        LayoutInflater.from(context).inflate(G.u(a.n.SearchView_layout, a.k.abc_search_view), this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(a.h.search_src_text);
        this.f1145s0 = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f1146t0 = findViewById(a.h.search_edit_frame);
        View findViewById = findViewById(a.h.search_plate);
        this.f1147u0 = findViewById;
        View findViewById2 = findViewById(a.h.submit_area);
        this.f1148v0 = findViewById2;
        ImageView imageView = (ImageView) findViewById(a.h.search_button);
        this.f1149w0 = imageView;
        ImageView imageView2 = (ImageView) findViewById(a.h.search_go_btn);
        this.f1150x0 = imageView2;
        ImageView imageView3 = (ImageView) findViewById(a.h.search_close_btn);
        this.f1151y0 = imageView3;
        ImageView imageView4 = (ImageView) findViewById(a.h.search_voice_btn);
        this.f1152z0 = imageView4;
        ImageView imageView5 = (ImageView) findViewById(a.h.search_mag_icon);
        this.G0 = imageView5;
        w1.G1(findViewById, G.h(a.n.SearchView_queryBackground));
        w1.G1(findViewById2, G.h(a.n.SearchView_submitBackground));
        int i11 = a.n.SearchView_searchIcon;
        imageView.setImageDrawable(G.h(i11));
        imageView2.setImageDrawable(G.h(a.n.SearchView_goIcon));
        imageView3.setImageDrawable(G.h(a.n.SearchView_closeIcon));
        imageView4.setImageDrawable(G.h(a.n.SearchView_voiceIcon));
        imageView5.setImageDrawable(G.h(i11));
        this.H0 = G.h(a.n.SearchView_searchHintIcon);
        z0.a(imageView, getResources().getString(a.l.abc_searchview_description_search));
        this.I0 = G.u(a.n.SearchView_suggestionRowLayout, a.k.abc_search_dropdown_item_icons_2line);
        this.J0 = G.u(a.n.SearchView_commitIcon, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f1144p1);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f1140l1);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(G.a(a.n.SearchView_iconifiedByDefault, true));
        int g10 = G.g(a.n.SearchView_android_maxWidth, -1);
        if (g10 != -1) {
            setMaxWidth(g10);
        }
        this.M0 = G.x(a.n.SearchView_defaultQueryHint);
        this.W0 = G.x(a.n.SearchView_queryHint);
        int o10 = G.o(a.n.SearchView_android_imeOptions, -1);
        if (o10 != -1) {
            setImeOptions(o10);
        }
        int o11 = G.o(a.n.SearchView_android_inputType, -1);
        if (o11 != -1) {
            setInputType(o11);
        }
        setFocusable(G.a(a.n.SearchView_android_focusable, true));
        G.I();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.K0 = intent;
        intent.addFlags(b6.c.A);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.L0 = intent2;
        intent2.addFlags(b6.c.A);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.A0 = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        p0(this.S0);
        l0();
    }

    public static boolean P(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(a.f.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(a.f.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        this.f1145s0.setText(charSequence);
        this.f1145s0.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public void D() {
        if (this.A0.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f1147u0.getPaddingLeft();
            Rect rect = new Rect();
            boolean b10 = d1.b(this);
            int dimensionPixelSize = this.S0 ? resources.getDimensionPixelSize(a.f.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(a.f.abc_dropdownitem_text_padding_left) : 0;
            this.f1145s0.getDropDownBackground().getPadding(rect);
            int i10 = rect.left;
            this.f1145s0.setDropDownHorizontalOffset(b10 ? -i10 : paddingLeft - (i10 + dimensionPixelSize));
            this.f1145s0.setDropDownWidth((((this.A0.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    public final Intent E(String str, Uri uri, String str2, String str3, int i10, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(b6.c.A);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1131c1);
        if (str3 != null) {
            intent.putExtra(z7.d.f16008b, str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f1135g1;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i10 != 0) {
            intent.putExtra("action_key", i10);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f1134f1.getSearchActivity());
        return intent;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:19|20|23|24) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r10 = r10.getPosition();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0066, code lost:
        r10 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0067, code lost:
        r11 = new java.lang.StringBuilder();
        r11.append("Search suggestions cursor at row ");
        r11.append(r10);
        r11.append(" returned exception.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0079, code lost:
        return null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0061 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.Intent F(android.database.Cursor r10, int r11, java.lang.String r12) {
        /*
            r9 = this;
            r0 = 0
            java.lang.String r1 = "suggest_intent_action"
            java.lang.String r1 = androidx.appcompat.widget.q0.t(r10, r1)     // Catch:{ RuntimeException -> 0x0061 }
            if (r1 != 0) goto L_0x000f
            android.app.SearchableInfo r1 = r9.f1134f1     // Catch:{ RuntimeException -> 0x0061 }
            java.lang.String r1 = r1.getSuggestIntentAction()     // Catch:{ RuntimeException -> 0x0061 }
        L_0x000f:
            if (r1 != 0) goto L_0x0013
            java.lang.String r1 = "android.intent.action.SEARCH"
        L_0x0013:
            r3 = r1
            java.lang.String r1 = "suggest_intent_data"
            java.lang.String r1 = androidx.appcompat.widget.q0.t(r10, r1)     // Catch:{ RuntimeException -> 0x0061 }
            if (r1 != 0) goto L_0x0022
            android.app.SearchableInfo r1 = r9.f1134f1     // Catch:{ RuntimeException -> 0x0061 }
            java.lang.String r1 = r1.getSuggestIntentData()     // Catch:{ RuntimeException -> 0x0061 }
        L_0x0022:
            if (r1 == 0) goto L_0x0044
            java.lang.String r2 = "suggest_intent_data_id"
            java.lang.String r2 = androidx.appcompat.widget.q0.t(r10, r2)     // Catch:{ RuntimeException -> 0x0061 }
            if (r2 == 0) goto L_0x0044
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x0061 }
            r4.<init>()     // Catch:{ RuntimeException -> 0x0061 }
            r4.append(r1)     // Catch:{ RuntimeException -> 0x0061 }
            java.lang.String r1 = "/"
            r4.append(r1)     // Catch:{ RuntimeException -> 0x0061 }
            java.lang.String r1 = android.net.Uri.encode(r2)     // Catch:{ RuntimeException -> 0x0061 }
            r4.append(r1)     // Catch:{ RuntimeException -> 0x0061 }
            java.lang.String r1 = r4.toString()     // Catch:{ RuntimeException -> 0x0061 }
        L_0x0044:
            if (r1 != 0) goto L_0x0048
            r4 = r0
            goto L_0x004d
        L_0x0048:
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch:{ RuntimeException -> 0x0061 }
            r4 = r1
        L_0x004d:
            java.lang.String r1 = "suggest_intent_query"
            java.lang.String r6 = androidx.appcompat.widget.q0.t(r10, r1)     // Catch:{ RuntimeException -> 0x0061 }
            java.lang.String r1 = "suggest_intent_extra_data"
            java.lang.String r5 = androidx.appcompat.widget.q0.t(r10, r1)     // Catch:{ RuntimeException -> 0x0061 }
            r2 = r9
            r7 = r11
            r8 = r12
            android.content.Intent r10 = r2.E(r3, r4, r5, r6, r7, r8)     // Catch:{ RuntimeException -> 0x0061 }
            return r10
        L_0x0061:
            int r10 = r10.getPosition()     // Catch:{ RuntimeException -> 0x0066 }
            goto L_0x0067
        L_0x0066:
            r10 = -1
        L_0x0067:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Search suggestions cursor at row "
            r11.append(r12)
            r11.append(r10)
            java.lang.String r10 = " returned exception."
            r11.append(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.F(android.database.Cursor, int, java.lang.String):android.content.Intent");
    }

    public final Intent G(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1135g1;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        int i10 = 1;
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String str = null;
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i10 = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i10);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final Intent H(Intent intent, SearchableInfo searchableInfo) {
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        intent2.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
        return intent2;
    }

    public final void I() {
        this.f1145s0.dismissDropDown();
    }

    public void J() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.f1145s0.refreshAutoCompleteResults();
            return;
        }
        n nVar = f1128t1;
        nVar.b(this.f1145s0);
        nVar.a(this.f1145s0);
    }

    public final void K(View view, Rect rect) {
        view.getLocationInWindow(this.E0);
        getLocationInWindow(this.F0);
        int[] iArr = this.E0;
        int i10 = iArr[1];
        int[] iArr2 = this.F0;
        int i11 = i10 - iArr2[1];
        int i12 = iArr[0] - iArr2[0];
        rect.set(i12, i11, view.getWidth() + i12, view.getHeight() + i11);
    }

    public final CharSequence L(CharSequence charSequence) {
        if (!this.S0 || this.H0 == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.f1145s0.getTextSize()) * 1.25d);
        this.H0.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.H0), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    public final boolean M() {
        SearchableInfo searchableInfo = this.f1134f1;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.f1134f1.getVoiceSearchLaunchWebSearch()) {
            intent = this.K0;
        } else if (this.f1134f1.getVoiceSearchLaunchRecognizer()) {
            intent = this.L0;
        }
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    public boolean N() {
        return this.S0;
    }

    public boolean O() {
        return this.T0;
    }

    public boolean Q() {
        return this.X0;
    }

    public final boolean R() {
        return (this.V0 || this.f1129a1) && !O();
    }

    public boolean S() {
        return this.V0;
    }

    public final void T(Intent intent) {
        if (intent != null) {
            try {
                getContext().startActivity(intent);
            } catch (RuntimeException unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed launch activity: ");
                sb2.append(intent);
            }
        }
    }

    public void U(int i10, String str, String str2) {
        getContext().startActivity(E("android.intent.action.SEARCH", (Uri) null, (String) null, str2, i10, str));
    }

    public final boolean V(int i10, int i11, String str) {
        Cursor b10 = this.U0.b();
        if (b10 == null || !b10.moveToPosition(i10)) {
            return false;
        }
        T(F(b10, i11, str));
        return true;
    }

    public void W() {
        if (!TextUtils.isEmpty(this.f1145s0.getText())) {
            this.f1145s0.setText("");
            this.f1145s0.requestFocus();
            this.f1145s0.setImeVisibility(true);
        } else if (this.S0) {
            k kVar = this.O0;
            if (kVar == null || !kVar.onClose()) {
                clearFocus();
                p0(true);
            }
        }
    }

    public boolean X(int i10, int i11, String str) {
        m mVar = this.Q0;
        if (mVar != null && mVar.onSuggestionClick(i10)) {
            return false;
        }
        V(i10, 0, (String) null);
        this.f1145s0.setImeVisibility(false);
        I();
        return true;
    }

    public boolean Y(int i10) {
        m mVar = this.Q0;
        if (mVar != null && mVar.onSuggestionSelect(i10)) {
            return false;
        }
        h0(i10);
        return true;
    }

    public void Z(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public void a0() {
        p0(false);
        this.f1145s0.requestFocus();
        this.f1145s0.setImeVisibility(true);
        View.OnClickListener onClickListener = this.R0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void b0() {
        Editable text = this.f1145s0.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            l lVar = this.N0;
            if (lVar == null || !lVar.onQueryTextSubmit(text.toString())) {
                if (this.f1134f1 != null) {
                    U(0, (String) null, text.toString());
                }
                this.f1145s0.setImeVisibility(false);
                I();
            }
        }
    }

    public boolean c0(View view, int i10, KeyEvent keyEvent) {
        if (this.f1134f1 != null && this.U0 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i10 == 66 || i10 == 84 || i10 == 61) {
                return X(this.f1145s0.getListSelection(), 0, (String) null);
            }
            if (i10 == 21 || i10 == 22) {
                this.f1145s0.setSelection(i10 == 21 ? 0 : this.f1145s0.length());
                this.f1145s0.setListSelection(0);
                this.f1145s0.clearListSelection();
                this.f1145s0.a();
                return true;
            } else if (i10 == 19) {
                this.f1145s0.getListSelection();
                return false;
            }
        }
        return false;
    }

    public void clearFocus() {
        this.Y0 = true;
        super.clearFocus();
        this.f1145s0.clearFocus();
        this.f1145s0.setImeVisibility(false);
        this.Y0 = false;
    }

    public void d0(CharSequence charSequence) {
        Editable text = this.f1145s0.getText();
        this.f1131c1 = text;
        boolean z10 = !TextUtils.isEmpty(text);
        o0(z10);
        q0(!z10);
        j0();
        n0();
        if (this.N0 != null && !TextUtils.equals(charSequence, this.f1130b1)) {
            this.N0.onQueryTextChange(charSequence.toString());
        }
        this.f1130b1 = charSequence.toString();
    }

    public void e0() {
        p0(O());
        g0();
        if (this.f1145s0.hasFocus()) {
            J();
        }
    }

    public void f0() {
        Intent G;
        SearchableInfo searchableInfo = this.f1134f1;
        if (searchableInfo != null) {
            try {
                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    G = H(this.K0, searchableInfo);
                } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    G = G(this.L0, searchableInfo);
                } else {
                    return;
                }
                getContext().startActivity(G);
            } catch (ActivityNotFoundException unused) {
            }
        }
    }

    public final void g0() {
        post(this.f1136h1);
    }

    public int getImeOptions() {
        return this.f1145s0.getImeOptions();
    }

    public int getInputType() {
        return this.f1145s0.getInputType();
    }

    public int getMaxWidth() {
        return this.Z0;
    }

    public CharSequence getQuery() {
        return this.f1145s0.getText();
    }

    @o0
    public CharSequence getQueryHint() {
        CharSequence charSequence = this.W0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f1134f1;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.M0 : getContext().getText(this.f1134f1.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.J0;
    }

    public int getSuggestionRowLayout() {
        return this.I0;
    }

    public k1.a getSuggestionsAdapter() {
        return this.U0;
    }

    public final void h0(int i10) {
        CharSequence convertToString;
        Editable text = this.f1145s0.getText();
        Cursor b10 = this.U0.b();
        if (b10 != null) {
            if (!b10.moveToPosition(i10) || (convertToString = this.U0.convertToString(b10)) == null) {
                setQuery(text);
            } else {
                setQuery(convertToString);
            }
        }
    }

    public void i0(CharSequence charSequence, boolean z10) {
        this.f1145s0.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f1145s0;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f1131c1 = charSequence;
        }
        if (z10 && !TextUtils.isEmpty(charSequence)) {
            b0();
        }
    }

    public final void j0() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f1145s0.getText());
        int i10 = 0;
        if (!z11 && (!this.S0 || this.f1132d1)) {
            z10 = false;
        }
        ImageView imageView = this.f1151y0;
        if (!z10) {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        Drawable drawable = this.f1151y0.getDrawable();
        if (drawable != null) {
            drawable.setState(z11 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public void k0() {
        int[] iArr = this.f1145s0.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.f1147u0.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f1148v0.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void l0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f1145s0;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(L(queryHint));
    }

    public final void m0() {
        this.f1145s0.setThreshold(this.f1134f1.getSuggestThreshold());
        this.f1145s0.setImeOptions(this.f1134f1.getImeOptions());
        int inputType = this.f1134f1.getInputType();
        int i10 = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f1134f1.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.f1145s0.setInputType(inputType);
        k1.a aVar = this.U0;
        if (aVar != null) {
            aVar.a((Cursor) null);
        }
        if (this.f1134f1.getSuggestAuthority() != null) {
            q0 q0Var = new q0(getContext(), this, this.f1134f1, this.f1138j1);
            this.U0 = q0Var;
            this.f1145s0.setAdapter(q0Var);
            q0 q0Var2 = (q0) this.U0;
            if (this.X0) {
                i10 = 2;
            }
            q0Var2.D(i10);
        }
    }

    public final void n0() {
        this.f1148v0.setVisibility((!R() || !(this.f1150x0.getVisibility() == 0 || this.f1152z0.getVisibility() == 0)) ? 8 : 0);
    }

    public final void o0(boolean z10) {
        this.f1150x0.setVisibility((!this.V0 || !R() || !hasFocus() || (!z10 && this.f1129a1)) ? 8 : 0);
    }

    public void onActionViewCollapsed() {
        i0("", false);
        clearFocus();
        p0(true);
        this.f1145s0.setImeOptions(this.f1133e1);
        this.f1132d1 = false;
    }

    public void onActionViewExpanded() {
        if (!this.f1132d1) {
            this.f1132d1 = true;
            int imeOptions = this.f1145s0.getImeOptions();
            this.f1133e1 = imeOptions;
            this.f1145s0.setImeOptions(imeOptions | 33554432);
            this.f1145s0.setText("");
            setIconified(false);
        }
    }

    public void onDetachedFromWindow() {
        removeCallbacks(this.f1136h1);
        post(this.f1137i1);
        super.onDetachedFromWindow();
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            K(this.f1145s0, this.C0);
            Rect rect = this.D0;
            Rect rect2 = this.C0;
            rect.set(rect2.left, 0, rect2.right, i13 - i11);
            o oVar = this.B0;
            if (oVar == null) {
                o oVar2 = new o(this.D0, this.C0, this.f1145s0);
                this.B0 = oVar2;
                setTouchDelegate(oVar2);
                return;
            }
            oVar.a(this.D0, this.C0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r0 <= 0) goto L_0x0039;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r4, int r5) {
        /*
            r3 = this;
            boolean r0 = r3.O()
            if (r0 == 0) goto L_0x000a
            super.onMeasure(r4, r5)
            return
        L_0x000a:
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L_0x002c
            if (r0 == 0) goto L_0x0022
            if (r0 == r2) goto L_0x001d
            goto L_0x0039
        L_0x001d:
            int r0 = r3.Z0
            if (r0 <= 0) goto L_0x0039
            goto L_0x0030
        L_0x0022:
            int r4 = r3.Z0
            if (r4 <= 0) goto L_0x0027
            goto L_0x0039
        L_0x0027:
            int r4 = r3.getPreferredWidth()
            goto L_0x0039
        L_0x002c:
            int r0 = r3.Z0
            if (r0 <= 0) goto L_0x0031
        L_0x0030:
            goto L_0x0035
        L_0x0031:
            int r0 = r3.getPreferredWidth()
        L_0x0035:
            int r4 = java.lang.Math.min(r0, r4)
        L_0x0039:
            int r0 = android.view.View.MeasureSpec.getMode(r5)
            int r5 = android.view.View.MeasureSpec.getSize(r5)
            if (r0 == r1) goto L_0x004b
            if (r0 == 0) goto L_0x0046
            goto L_0x0053
        L_0x0046:
            int r5 = r3.getPreferredHeight()
            goto L_0x0053
        L_0x004b:
            int r0 = r3.getPreferredHeight()
            int r5 = java.lang.Math.min(r0, r5)
        L_0x0053:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            super.onMeasure(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.onMeasure(int, int):void");
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        p0(savedState.Q);
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.Q = O();
        return savedState;
    }

    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        g0();
    }

    public final void p0(boolean z10) {
        this.T0 = z10;
        int i10 = 0;
        int i11 = z10 ? 0 : 8;
        boolean z11 = !TextUtils.isEmpty(this.f1145s0.getText());
        this.f1149w0.setVisibility(i11);
        o0(z11);
        this.f1146t0.setVisibility(z10 ? 8 : 0);
        if (this.G0.getDrawable() == null || this.S0) {
            i10 = 8;
        }
        this.G0.setVisibility(i10);
        j0();
        q0(!z11);
        n0();
    }

    public final void q0(boolean z10) {
        int i10 = 8;
        if (this.f1129a1 && !O() && z10) {
            this.f1150x0.setVisibility(8);
            i10 = 0;
        }
        this.f1152z0.setVisibility(i10);
    }

    public boolean requestFocus(int i10, Rect rect) {
        if (this.Y0 || !isFocusable()) {
            return false;
        }
        if (O()) {
            return super.requestFocus(i10, rect);
        }
        boolean requestFocus = this.f1145s0.requestFocus(i10, rect);
        if (requestFocus) {
            p0(false);
        }
        return requestFocus;
    }

    @x0({x0.a.Q})
    public void setAppSearchData(Bundle bundle) {
        this.f1135g1 = bundle;
    }

    public void setIconified(boolean z10) {
        if (z10) {
            W();
        } else {
            a0();
        }
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.S0 != z10) {
            this.S0 = z10;
            p0(z10);
            l0();
        }
    }

    public void setImeOptions(int i10) {
        this.f1145s0.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.f1145s0.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.Z0 = i10;
        requestLayout();
    }

    public void setOnCloseListener(k kVar) {
        this.O0 = kVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.P0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(l lVar) {
        this.N0 = lVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.R0 = onClickListener;
    }

    public void setOnSuggestionListener(m mVar) {
        this.Q0 = mVar;
    }

    public void setQueryHint(@o0 CharSequence charSequence) {
        this.W0 = charSequence;
        l0();
    }

    public void setQueryRefinementEnabled(boolean z10) {
        this.X0 = z10;
        k1.a aVar = this.U0;
        if (aVar instanceof q0) {
            ((q0) aVar).D(z10 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f1134f1 = searchableInfo;
        if (searchableInfo != null) {
            m0();
            l0();
        }
        boolean M = M();
        this.f1129a1 = M;
        if (M) {
            this.f1145s0.setPrivateImeOptions(f1127s1);
        }
        p0(O());
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.V0 = z10;
        p0(O());
    }

    public void setSuggestionsAdapter(k1.a aVar) {
        this.U0 = aVar;
        this.f1145s0.setAdapter(aVar);
    }
}
