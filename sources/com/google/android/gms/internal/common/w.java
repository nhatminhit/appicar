package com.google.android.gms.internal.common;

import kh.j;

public final class w extends v {

    /* renamed from: a  reason: collision with root package name */
    public final char f5844a;

    public w(char c10) {
        this.f5844a = c10;
    }

    public final boolean a(char c10) {
        return c10 == this.f5844a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("CharMatcher.is('");
        int i10 = this.f5844a;
        char[] cArr = {j.f20323c, 'u', 0, 0, 0, 0};
        for (int i11 = 0; i11 < 4; i11++) {
            cArr[5 - i11] = "0123456789ABCDEF".charAt(i10 & 15);
            i10 >>= 4;
        }
        sb2.append(String.copyValueOf(cArr));
        sb2.append("')");
        return sb2.toString();
    }
}
