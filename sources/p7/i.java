package p7;

import android.text.SpannableStringBuilder;
import h7.b;
import h7.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import w7.a;
import w7.q0;

public final class i implements e {
    public final List<e> O;
    public final int P;
    public final long[] Q;
    public final long[] R;

    public i(List<e> list) {
        this.O = list;
        int size = list.size();
        this.P = size;
        this.Q = new long[(size * 2)];
        for (int i10 = 0; i10 < this.P; i10++) {
            e eVar = list.get(i10);
            int i11 = i10 * 2;
            long[] jArr = this.Q;
            jArr[i11] = eVar.f11677n0;
            jArr[i11 + 1] = eVar.f11678o0;
        }
        long[] jArr2 = this.Q;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.R = copyOf;
        Arrays.sort(copyOf);
    }

    public int a(long j10) {
        int h10 = q0.h(this.R, j10, false, false);
        if (h10 < this.R.length) {
            return h10;
        }
        return -1;
    }

    public long b(int i10) {
        boolean z10 = true;
        a.a(i10 >= 0);
        if (i10 >= this.R.length) {
            z10 = false;
        }
        a.a(z10);
        return this.R[i10];
    }

    public List<b> d(long j10) {
        SpannableStringBuilder append;
        SpannableStringBuilder spannableStringBuilder = null;
        ArrayList arrayList = null;
        e eVar = null;
        for (int i10 = 0; i10 < this.P; i10++) {
            long[] jArr = this.Q;
            int i11 = i10 * 2;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                e eVar2 = this.O.get(i10);
                if (!eVar2.a()) {
                    arrayList.add(eVar2);
                } else if (eVar == null) {
                    eVar = eVar2;
                } else {
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        append = spannableStringBuilder.append(eVar.O).append("\n");
                    } else {
                        append = spannableStringBuilder.append("\n");
                    }
                    append.append(eVar2.O);
                }
            }
        }
        if (spannableStringBuilder != null) {
            arrayList.add(new e(spannableStringBuilder));
        } else if (eVar != null) {
            arrayList.add(eVar);
        }
        return arrayList != null ? arrayList : Collections.emptyList();
    }

    public int e() {
        return this.R.length;
    }
}
