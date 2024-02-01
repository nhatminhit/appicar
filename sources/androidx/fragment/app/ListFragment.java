package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import d.m0;
import d.o0;

public class ListFragment extends Fragment {

    /* renamed from: j1  reason: collision with root package name */
    public static final int f2562j1 = 16711681;

    /* renamed from: k1  reason: collision with root package name */
    public static final int f2563k1 = 16711682;

    /* renamed from: l1  reason: collision with root package name */
    public static final int f2564l1 = 16711683;
    public final Handler Y0 = new Handler();
    public final Runnable Z0 = new a();

    /* renamed from: a1  reason: collision with root package name */
    public final AdapterView.OnItemClickListener f2565a1 = new b();

    /* renamed from: b1  reason: collision with root package name */
    public ListAdapter f2566b1;

    /* renamed from: c1  reason: collision with root package name */
    public ListView f2567c1;

    /* renamed from: d1  reason: collision with root package name */
    public View f2568d1;

    /* renamed from: e1  reason: collision with root package name */
    public TextView f2569e1;

    /* renamed from: f1  reason: collision with root package name */
    public View f2570f1;

    /* renamed from: g1  reason: collision with root package name */
    public View f2571g1;

    /* renamed from: h1  reason: collision with root package name */
    public CharSequence f2572h1;

    /* renamed from: i1  reason: collision with root package name */
    public boolean f2573i1;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            ListView listView = ListFragment.this.f2567c1;
            listView.focusableViewAvailable(listView);
        }
    }

    public class b implements AdapterView.OnItemClickListener {
        public b() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            ListFragment.this.O0((ListView) adapterView, view, i10, j10);
        }
    }

    public final void J0() {
        if (this.f2567c1 == null) {
            View view = getView();
            if (view != null) {
                if (view instanceof ListView) {
                    this.f2567c1 = (ListView) view;
                } else {
                    TextView textView = (TextView) view.findViewById(f2562j1);
                    this.f2569e1 = textView;
                    if (textView == null) {
                        this.f2568d1 = view.findViewById(16908292);
                    } else {
                        textView.setVisibility(8);
                    }
                    this.f2570f1 = view.findViewById(f2563k1);
                    this.f2571g1 = view.findViewById(f2564l1);
                    View findViewById = view.findViewById(16908298);
                    if (findViewById instanceof ListView) {
                        ListView listView = (ListView) findViewById;
                        this.f2567c1 = listView;
                        View view2 = this.f2568d1;
                        if (view2 == null) {
                            CharSequence charSequence = this.f2572h1;
                            if (charSequence != null) {
                                this.f2569e1.setText(charSequence);
                                listView = this.f2567c1;
                                view2 = this.f2569e1;
                            }
                        }
                        listView.setEmptyView(view2);
                    } else if (findViewById == null) {
                        throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                    } else {
                        throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                    }
                }
                this.f2573i1 = true;
                this.f2567c1.setOnItemClickListener(this.f2565a1);
                ListAdapter listAdapter = this.f2566b1;
                if (listAdapter != null) {
                    this.f2566b1 = null;
                    R0(listAdapter);
                } else if (this.f2570f1 != null) {
                    T0(false, false);
                }
                this.Y0.post(this.Z0);
                return;
            }
            throw new IllegalStateException("Content view not yet created");
        }
    }

    @o0
    public ListAdapter K0() {
        return this.f2566b1;
    }

    @m0
    public ListView L0() {
        J0();
        return this.f2567c1;
    }

    public long M0() {
        J0();
        return this.f2567c1.getSelectedItemId();
    }

    public int N0() {
        J0();
        return this.f2567c1.getSelectedItemPosition();
    }

    public void O0(@m0 ListView listView, @m0 View view, int i10, long j10) {
    }

    @m0
    public final ListAdapter P0() {
        ListAdapter K0 = K0();
        if (K0 != null) {
            return K0;
        }
        throw new IllegalStateException("ListFragment " + this + " does not have a ListAdapter.");
    }

    public void Q0(@o0 CharSequence charSequence) {
        J0();
        TextView textView = this.f2569e1;
        if (textView != null) {
            textView.setText(charSequence);
            if (this.f2572h1 == null) {
                this.f2567c1.setEmptyView(this.f2569e1);
            }
            this.f2572h1 = charSequence;
            return;
        }
        throw new IllegalStateException("Can't be used with a custom content view");
    }

    public void R0(@o0 ListAdapter listAdapter) {
        boolean z10 = false;
        boolean z11 = this.f2566b1 != null;
        this.f2566b1 = listAdapter;
        ListView listView = this.f2567c1;
        if (listView != null) {
            listView.setAdapter(listAdapter);
            if (!this.f2573i1 && !z11) {
                if (requireView().getWindowToken() != null) {
                    z10 = true;
                }
                T0(true, z10);
            }
        }
    }

    public void S0(boolean z10) {
        T0(z10, true);
    }

    public final void T0(boolean z10, boolean z11) {
        J0();
        View view = this.f2570f1;
        if (view == null) {
            throw new IllegalStateException("Can't be used with a custom content view");
        } else if (this.f2573i1 != z10) {
            this.f2573i1 = z10;
            if (z10) {
                if (z11) {
                    view.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432577));
                    this.f2571g1.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432576));
                } else {
                    view.clearAnimation();
                    this.f2571g1.clearAnimation();
                }
                this.f2570f1.setVisibility(8);
                this.f2571g1.setVisibility(0);
                return;
            }
            if (z11) {
                view.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432576));
                this.f2571g1.startAnimation(AnimationUtils.loadAnimation(getContext(), 17432577));
            } else {
                view.clearAnimation();
                this.f2571g1.clearAnimation();
            }
            this.f2570f1.setVisibility(0);
            this.f2571g1.setVisibility(8);
        }
    }

    public void U0(boolean z10) {
        T0(z10, false);
    }

    public void V0(int i10) {
        J0();
        this.f2567c1.setSelection(i10);
    }

    @o0
    public View onCreateView(@m0 LayoutInflater layoutInflater, @o0 ViewGroup viewGroup, @o0 Bundle bundle) {
        Context requireContext = requireContext();
        FrameLayout frameLayout = new FrameLayout(requireContext);
        LinearLayout linearLayout = new LinearLayout(requireContext);
        linearLayout.setId(f2563k1);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(requireContext, (AttributeSet) null, 16842874), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(requireContext);
        frameLayout2.setId(f2564l1);
        TextView textView = new TextView(requireContext);
        textView.setId(f2562j1);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(requireContext);
        listView.setId(16908298);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    public void onDestroyView() {
        this.Y0.removeCallbacks(this.Z0);
        this.f2567c1 = null;
        this.f2573i1 = false;
        this.f2571g1 = null;
        this.f2570f1 = null;
        this.f2568d1 = null;
        this.f2569e1 = null;
        super.onDestroyView();
    }

    public void onViewCreated(@m0 View view, @o0 Bundle bundle) {
        super.onViewCreated(view, bundle);
        J0();
    }
}
