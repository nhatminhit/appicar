package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.d;
import com.google.android.exoplayer2.ui.d;
import d.f;
import d.o0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import r7.k;

public class TrackSelectionView extends LinearLayout {
    public final int O;
    public final LayoutInflater P;
    public final CheckedTextView Q;
    public final CheckedTextView R;
    public final b S;
    public final SparseArray<DefaultTrackSelector.SelectionOverride> T;
    public boolean U;
    public boolean V;
    public k W;

    /* renamed from: a0  reason: collision with root package name */
    public CheckedTextView[][] f5525a0;

    /* renamed from: b0  reason: collision with root package name */
    public d.a f5526b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f5527c0;

    /* renamed from: d0  reason: collision with root package name */
    public TrackGroupArray f5528d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f5529e0;
    @o0

    /* renamed from: f0  reason: collision with root package name */
    public c f5530f0;

    public class b implements View.OnClickListener {
        public b() {
        }

        public void onClick(View view) {
            TrackSelectionView.this.e(view);
        }
    }

    public interface c {
        void a(boolean z10, List<DefaultTrackSelector.SelectionOverride> list);
    }

    public TrackSelectionView(Context context) {
        this(context, (AttributeSet) null);
    }

    public TrackSelectionView(Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrackSelectionView(Context context, @o0 AttributeSet attributeSet, @f int i10) {
        super(context, attributeSet, i10);
        setOrientation(1);
        this.T = new SparseArray<>();
        setSaveFromParentEnabled(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16843534});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        this.O = resourceId;
        obtainStyledAttributes.recycle();
        LayoutInflater from = LayoutInflater.from(context);
        this.P = from;
        b bVar = new b();
        this.S = bVar;
        this.W = new a(getResources());
        this.f5528d0 = TrackGroupArray.R;
        CheckedTextView checkedTextView = (CheckedTextView) from.inflate(17367055, this, false);
        this.Q = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(d.h.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(bVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(from.inflate(d.g.exo_list_divider, this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) from.inflate(17367055, this, false);
        this.R = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(d.h.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(bVar);
        addView(checkedTextView2);
    }

    public static int[] b(int[] iArr, int i10) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length + 1);
        copyOf[copyOf.length - 1] = i10;
        return copyOf;
    }

    public static int[] c(int[] iArr, int i10) {
        int[] iArr2 = new int[(iArr.length - 1)];
        int i11 = 0;
        for (int i12 : iArr) {
            if (i12 != i10) {
                iArr2[i11] = i12;
                i11++;
            }
        }
        return iArr2;
    }

    public void d(d.a aVar, int i10, boolean z10, List<DefaultTrackSelector.SelectionOverride> list, @o0 c cVar) {
        this.f5526b0 = aVar;
        this.f5527c0 = i10;
        this.f5529e0 = z10;
        this.f5530f0 = cVar;
        int size = this.V ? list.size() : Math.min(list.size(), 1);
        for (int i11 = 0; i11 < size; i11++) {
            DefaultTrackSelector.SelectionOverride selectionOverride = list.get(i11);
            this.T.put(selectionOverride.O, selectionOverride);
        }
        l();
    }

    public final void e(View view) {
        if (view == this.Q) {
            g();
        } else if (view == this.R) {
            f();
        } else {
            h(view);
        }
        k();
        c cVar = this.f5530f0;
        if (cVar != null) {
            cVar.a(getIsDisabled(), getOverrides());
        }
    }

    public final void f() {
        this.f5529e0 = false;
        this.T.clear();
    }

    public final void g() {
        this.f5529e0 = true;
        this.T.clear();
    }

    public boolean getIsDisabled() {
        return this.f5529e0;
    }

    public List<DefaultTrackSelector.SelectionOverride> getOverrides() {
        ArrayList arrayList = new ArrayList(this.T.size());
        for (int i10 = 0; i10 < this.T.size(); i10++) {
            arrayList.add(this.T.valueAt(i10));
        }
        return arrayList;
    }

    public final void h(View view) {
        DefaultTrackSelector.SelectionOverride selectionOverride;
        SparseArray<DefaultTrackSelector.SelectionOverride> sparseArray;
        SparseArray<DefaultTrackSelector.SelectionOverride> sparseArray2;
        DefaultTrackSelector.SelectionOverride selectionOverride2;
        this.f5529e0 = false;
        Pair pair = (Pair) view.getTag();
        int intValue = ((Integer) pair.first).intValue();
        int intValue2 = ((Integer) pair.second).intValue();
        DefaultTrackSelector.SelectionOverride selectionOverride3 = this.T.get(intValue);
        w7.a.g(this.f5526b0);
        if (selectionOverride3 == null) {
            if (!this.V && this.T.size() > 0) {
                this.T.clear();
            }
            sparseArray2 = this.T;
            selectionOverride2 = new DefaultTrackSelector.SelectionOverride(intValue, intValue2);
        } else {
            int i10 = selectionOverride3.Q;
            int[] iArr = selectionOverride3.P;
            boolean isChecked = ((CheckedTextView) view).isChecked();
            boolean i11 = i(intValue);
            boolean z10 = i11 || j();
            if (!isChecked || !z10) {
                if (isChecked) {
                    return;
                }
                if (i11) {
                    int[] b10 = b(iArr, intValue2);
                    sparseArray = this.T;
                    selectionOverride = new DefaultTrackSelector.SelectionOverride(intValue, b10);
                } else {
                    sparseArray2 = this.T;
                    selectionOverride2 = new DefaultTrackSelector.SelectionOverride(intValue, intValue2);
                }
            } else if (i10 == 1) {
                this.T.remove(intValue);
                return;
            } else {
                int[] c10 = c(iArr, intValue2);
                sparseArray = this.T;
                selectionOverride = new DefaultTrackSelector.SelectionOverride(intValue, c10);
            }
            sparseArray.put(intValue, selectionOverride);
            return;
        }
        sparseArray2.put(intValue, selectionOverride2);
    }

    @RequiresNonNull({"mappedTrackInfo"})
    public final boolean i(int i10) {
        return this.U && this.f5528d0.a(i10).O > 1 && this.f5526b0.a(this.f5527c0, i10, false) != 0;
    }

    public final boolean j() {
        return this.V && this.f5528d0.O > 1;
    }

    public final void k() {
        this.Q.setChecked(this.f5529e0);
        this.R.setChecked(!this.f5529e0 && this.T.size() == 0);
        for (int i10 = 0; i10 < this.f5525a0.length; i10++) {
            DefaultTrackSelector.SelectionOverride selectionOverride = this.T.get(i10);
            int i11 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.f5525a0[i10];
                if (i11 >= checkedTextViewArr.length) {
                    break;
                }
                checkedTextViewArr[i11].setChecked(selectionOverride != null && selectionOverride.a(i11));
                i11++;
            }
        }
    }

    public final void l() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        if (this.f5526b0 == null) {
            this.Q.setEnabled(false);
            this.R.setEnabled(false);
            return;
        }
        this.Q.setEnabled(true);
        this.R.setEnabled(true);
        TrackGroupArray g10 = this.f5526b0.g(this.f5527c0);
        this.f5528d0 = g10;
        this.f5525a0 = new CheckedTextView[g10.O][];
        boolean j10 = j();
        int i10 = 0;
        while (true) {
            TrackGroupArray trackGroupArray = this.f5528d0;
            if (i10 < trackGroupArray.O) {
                TrackGroup a10 = trackGroupArray.a(i10);
                boolean i11 = i(i10);
                this.f5525a0[i10] = new CheckedTextView[a10.O];
                for (int i12 = 0; i12 < a10.O; i12++) {
                    if (i12 == 0) {
                        addView(this.P.inflate(d.g.exo_list_divider, this, false));
                    }
                    CheckedTextView checkedTextView = (CheckedTextView) this.P.inflate((i11 || j10) ? 17367056 : 17367055, this, false);
                    checkedTextView.setBackgroundResource(this.O);
                    checkedTextView.setText(this.W.a(a10.a(i12)));
                    if (this.f5526b0.h(this.f5527c0, i10, i12) == 4) {
                        checkedTextView.setFocusable(true);
                        checkedTextView.setTag(Pair.create(Integer.valueOf(i10), Integer.valueOf(i12)));
                        checkedTextView.setOnClickListener(this.S);
                    } else {
                        checkedTextView.setFocusable(false);
                        checkedTextView.setEnabled(false);
                    }
                    this.f5525a0[i10][i12] = checkedTextView;
                    addView(checkedTextView);
                }
                i10++;
            } else {
                k();
                return;
            }
        }
    }

    public void setAllowAdaptiveSelections(boolean z10) {
        if (this.U != z10) {
            this.U = z10;
            l();
        }
    }

    public void setAllowMultipleOverrides(boolean z10) {
        if (this.V != z10) {
            this.V = z10;
            if (!z10 && this.T.size() > 1) {
                for (int size = this.T.size() - 1; size > 0; size--) {
                    this.T.remove(size);
                }
            }
            l();
        }
    }

    public void setShowDisableOption(boolean z10) {
        this.Q.setVisibility(z10 ? 0 : 8);
    }

    public void setTrackNameProvider(k kVar) {
        this.W = (k) w7.a.g(kVar);
        l();
    }
}
