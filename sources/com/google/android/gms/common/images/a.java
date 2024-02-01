package com.google.android.gms.common.images;

import d.m0;
import d.o0;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f5757a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5758b;

    public a(int i10, int i11) {
        this.f5757a = i10;
        this.f5758b = i11;
    }

    @m0
    public static a c(@m0 String str) throws NumberFormatException {
        if (str != null) {
            int indexOf = str.indexOf(42);
            if (indexOf < 0) {
                indexOf = str.indexOf(120);
            }
            if (indexOf >= 0) {
                try {
                    return new a(Integer.parseInt(str.substring(0, indexOf)), Integer.parseInt(str.substring(indexOf + 1)));
                } catch (NumberFormatException unused) {
                    throw d(str);
                }
            } else {
                throw d(str);
            }
        } else {
            throw new IllegalArgumentException("string must not be null");
        }
    }

    public static NumberFormatException d(String str) {
        throw new NumberFormatException("Invalid Size: \"" + str + "\"");
    }

    public int a() {
        return this.f5758b;
    }

    public int b() {
        return this.f5757a;
    }

    public boolean equals(@o0 Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f5757a == aVar.f5757a && this.f5758b == aVar.f5758b;
        }
    }

    public int hashCode() {
        int i10 = this.f5758b;
        int i11 = this.f5757a;
        return i10 ^ ((i11 >>> 16) | (i11 << 16));
    }

    @m0
    public String toString() {
        int i10 = this.f5757a;
        int i11 = this.f5758b;
        return i10 + "x" + i11;
    }
}
