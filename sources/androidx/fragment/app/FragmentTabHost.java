package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;
import d.m0;
import d.o0;
import java.util.ArrayList;

@Deprecated
public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {
    public final ArrayList<b> O = new ArrayList<>();
    public FrameLayout P;
    public Context Q;
    public FragmentManager R;
    public int S;
    public TabHost.OnTabChangeListener T;
    public b U;
    public boolean V;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public String O;

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
            this.O = parcel.readString();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @m0
        public String toString() {
            return "FragmentTabHost.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " curTab=" + this.O + p7.a.f11639j;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.O);
        }
    }

    public static class a implements TabHost.TabContentFactory {

        /* renamed from: a  reason: collision with root package name */
        public final Context f2557a;

        public a(Context context) {
            this.f2557a = context;
        }

        public View createTabContent(String str) {
            View view = new View(this.f2557a);
            view.setMinimumWidth(0);
            view.setMinimumHeight(0);
            return view;
        }
    }

    public static final class b {
        @m0

        /* renamed from: a  reason: collision with root package name */
        public final String f2558a;
        @m0

        /* renamed from: b  reason: collision with root package name */
        public final Class<?> f2559b;
        @o0

        /* renamed from: c  reason: collision with root package name */
        public final Bundle f2560c;

        /* renamed from: d  reason: collision with root package name */
        public Fragment f2561d;

        public b(@m0 String str, @m0 Class<?> cls, @o0 Bundle bundle) {
            this.f2558a = str;
            this.f2559b = cls;
            this.f2560c = bundle;
        }
    }

    @Deprecated
    public FragmentTabHost(@m0 Context context) {
        super(context, (AttributeSet) null);
        f(context, (AttributeSet) null);
    }

    @Deprecated
    public FragmentTabHost(@m0 Context context, @o0 AttributeSet attributeSet) {
        super(context, attributeSet);
        f(context, attributeSet);
    }

    @Deprecated
    public void a(@m0 TabHost.TabSpec tabSpec, @m0 Class<?> cls, @o0 Bundle bundle) {
        tabSpec.setContent(new a(this.Q));
        String tag = tabSpec.getTag();
        b bVar = new b(tag, cls, bundle);
        if (this.V) {
            Fragment q02 = this.R.q0(tag);
            bVar.f2561d = q02;
            if (q02 != null && !q02.isDetached()) {
                u r10 = this.R.r();
                r10.r(bVar.f2561d);
                r10.m();
            }
        }
        this.O.add(bVar);
        addTab(tabSpec);
    }

    @o0
    public final u b(@o0 String str, @o0 u uVar) {
        Fragment fragment;
        b e10 = e(str);
        if (this.U != e10) {
            if (uVar == null) {
                uVar = this.R.r();
            }
            b bVar = this.U;
            if (!(bVar == null || (fragment = bVar.f2561d) == null)) {
                uVar.r(fragment);
            }
            if (e10 != null) {
                Fragment fragment2 = e10.f2561d;
                if (fragment2 == null) {
                    Fragment a10 = this.R.E0().a(this.Q.getClassLoader(), e10.f2559b.getName());
                    e10.f2561d = a10;
                    a10.setArguments(e10.f2560c);
                    uVar.c(this.S, e10.f2561d, e10.f2558a);
                } else {
                    uVar.l(fragment2);
                }
            }
            this.U = e10;
        }
        return uVar;
    }

    public final void c() {
        if (this.P == null) {
            FrameLayout frameLayout = (FrameLayout) findViewById(this.S);
            this.P = frameLayout;
            if (frameLayout == null) {
                throw new IllegalStateException("No tab content FrameLayout found for id " + this.S);
            }
        }
    }

    public final void d(Context context) {
        if (findViewById(16908307) == null) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
            TabWidget tabWidget = new TabWidget(context);
            tabWidget.setId(16908307);
            tabWidget.setOrientation(0);
            linearLayout.addView(tabWidget, new LinearLayout.LayoutParams(-1, -2, 0.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(16908305);
            linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(0, 0, 0.0f));
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.P = frameLayout2;
            frameLayout2.setId(this.S);
            linearLayout.addView(frameLayout2, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
    }

    @o0
    public final b e(String str) {
        int size = this.O.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.O.get(i10);
            if (bVar.f2558a.equals(str)) {
                return bVar;
            }
        }
        return null;
    }

    public final void f(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842995}, 0, 0);
        this.S = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    @Deprecated
    public void g(@m0 Context context, @m0 FragmentManager fragmentManager) {
        d(context);
        super.setup();
        this.Q = context;
        this.R = fragmentManager;
        c();
    }

    @Deprecated
    public void h(@m0 Context context, @m0 FragmentManager fragmentManager, int i10) {
        d(context);
        super.setup();
        this.Q = context;
        this.R = fragmentManager;
        this.S = i10;
        c();
        this.P.setId(i10);
        if (getId() == -1) {
            setId(16908306);
        }
    }

    @Deprecated
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        int size = this.O.size();
        u uVar = null;
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.O.get(i10);
            Fragment q02 = this.R.q0(bVar.f2558a);
            bVar.f2561d = q02;
            if (q02 != null && !q02.isDetached()) {
                if (bVar.f2558a.equals(currentTabTag)) {
                    this.U = bVar;
                } else {
                    if (uVar == null) {
                        uVar = this.R.r();
                    }
                    uVar.r(bVar.f2561d);
                }
            }
        }
        this.V = true;
        u b10 = b(currentTabTag, uVar);
        if (b10 != null) {
            b10.m();
            this.R.l0();
        }
    }

    @Deprecated
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.V = false;
    }

    @Deprecated
    public void onRestoreInstanceState(@SuppressLint({"UnknownNullness"}) Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.O);
    }

    @Deprecated
    @m0
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.O = getCurrentTabTag();
        return savedState;
    }

    @Deprecated
    public void onTabChanged(@o0 String str) {
        u b10;
        if (this.V && (b10 = b(str, (u) null)) != null) {
            b10.m();
        }
        TabHost.OnTabChangeListener onTabChangeListener = this.T;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    @Deprecated
    public void setOnTabChangedListener(@o0 TabHost.OnTabChangeListener onTabChangeListener) {
        this.T = onTabChangeListener;
    }

    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }
}
