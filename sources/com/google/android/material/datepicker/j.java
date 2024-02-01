package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

public abstract class j<S> extends Fragment {
    public final LinkedHashSet<i<S>> Y0 = new LinkedHashSet<>();

    public boolean J0(i<S> iVar) {
        return this.Y0.add(iVar);
    }

    public void K0() {
        this.Y0.clear();
    }

    public abstract DateSelector<S> L0();

    public boolean M0(i<S> iVar) {
        return this.Y0.remove(iVar);
    }
}
