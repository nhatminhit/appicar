package i7;

import android.text.Layout;
import d.m0;

public final class b extends h7.b implements Comparable<b> {

    /* renamed from: o0  reason: collision with root package name */
    public static final int f9225o0 = -1;

    /* renamed from: n0  reason: collision with root package name */
    public final int f9226n0;

    public b(CharSequence charSequence, Layout.Alignment alignment, float f10, int i10, int i11, float f11, int i12, float f12, boolean z10, int i13, int i14) {
        super(charSequence, alignment, f10, i10, i11, f11, i12, f12, z10, i13);
        this.f9226n0 = i14;
    }

    /* renamed from: a */
    public int compareTo(@m0 b bVar) {
        int i10 = bVar.f9226n0;
        int i11 = this.f9226n0;
        if (i10 < i11) {
            return -1;
        }
        return i10 > i11 ? 1 : 0;
    }
}
