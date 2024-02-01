package com.google.android.gms.internal.common;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;

public class b extends c {

    /* renamed from: a  reason: collision with root package name */
    public Object[] f5833a = new Object[4];

    /* renamed from: b  reason: collision with root package name */
    public int f5834b = 0;

    /* renamed from: c  reason: collision with root package name */
    public boolean f5835c;

    public b(int i10) {
    }

    @CanIgnoreReturnValue
    public final b a(Object obj) {
        obj.getClass();
        b(this.f5834b + 1);
        Object[] objArr = this.f5833a;
        int i10 = this.f5834b;
        this.f5834b = i10 + 1;
        objArr[i10] = obj;
        return this;
    }

    public final void b(int i10) {
        Object[] objArr = this.f5833a;
        int length = objArr.length;
        if (length < i10) {
            int i11 = length + (length >> 1) + 1;
            if (i11 < i10) {
                int highestOneBit = Integer.highestOneBit(i10 - 1);
                i11 = highestOneBit + highestOneBit;
            }
            if (i11 < 0) {
                i11 = Integer.MAX_VALUE;
            }
            this.f5833a = Arrays.copyOf(objArr, i11);
        } else if (this.f5835c) {
            this.f5833a = (Object[]) objArr.clone();
        } else {
            return;
        }
        this.f5835c = false;
    }
}
