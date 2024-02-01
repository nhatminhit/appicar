package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.q;

public class k extends LinearLayoutManager {
    public static final float O = 100.0f;

    public class a extends q {
        public a(Context context) {
            super(context);
        }

        public float w(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }
    }

    public k(Context context, int i10, boolean z10) {
        super(context, i10, z10);
    }

    public void f2(RecyclerView recyclerView, RecyclerView.b0 b0Var, int i10) {
        a aVar = new a(recyclerView.getContext());
        aVar.q(i10);
        g2(aVar);
    }
}
