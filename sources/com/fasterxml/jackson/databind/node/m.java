package com.fasterxml.jackson.databind.node;

import a6.w;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

public class m implements Serializable, l {
    public static final long P = 1;
    public static final m Q;
    public static final m R = new m(true);
    public static final m S;
    public final boolean O;

    static {
        m mVar = new m(false);
        Q = mVar;
        S = mVar;
    }

    public m() {
        this(false);
    }

    public m(boolean z10) {
        this.O = z10;
    }

    public static m y(boolean z10) {
        return z10 ? R : Q;
    }

    public u A() {
        return new u(this);
    }

    public z E(Short sh2) {
        return sh2 == null ? b() : w.u1(sh2.shortValue());
    }

    public z G(Float f10) {
        return f10 == null ? b() : i.u1(f10.floatValue());
    }

    public z R(Byte b10) {
        return b10 == null ? b() : j.u1(b10.intValue());
    }

    public z S(Integer num) {
        return num == null ? b() : j.u1(num.intValue());
    }

    public boolean a(long j10) {
        return ((long) ((int) j10)) == j10;
    }

    /* renamed from: d */
    public d s(byte[] bArr) {
        return d.t1(bArr);
    }

    /* renamed from: e */
    public d m(byte[] bArr, int i10, int i11) {
        return d.u1(bArr, i10, i11);
    }

    public z f(BigInteger bigInteger) {
        return bigInteger == null ? b() : c.u1(bigInteger);
    }

    /* renamed from: g */
    public e C(boolean z10) {
        return z10 ? e.u1() : e.t1();
    }

    public i5.m h() {
        return p.t1();
    }

    public z i(Long l10) {
        return l10 == null ? b() : o.u1(l10.longValue());
    }

    public z j(BigDecimal bigDecimal) {
        return bigDecimal == null ? b() : this.O ? g.u1(bigDecimal) : bigDecimal.compareTo(BigDecimal.ZERO) == 0 ? g.S : g.u1(bigDecimal.stripTrailingZeros());
    }

    /* renamed from: k */
    public s b() {
        return s.t1();
    }

    /* renamed from: l */
    public t J(byte b10) {
        return j.u1(b10);
    }

    public z n(w wVar) {
        return new v(wVar);
    }

    public z o(Object obj) {
        return new v(obj);
    }

    /* renamed from: p */
    public t L(double d10) {
        return h.u1(d10);
    }

    /* renamed from: q */
    public t H(float f10) {
        return i.u1(f10);
    }

    /* renamed from: r */
    public t I(int i10) {
        return j.u1(i10);
    }

    /* renamed from: t */
    public t M(long j10) {
        return o.u1(j10);
    }

    /* renamed from: u */
    public t Q(short s10) {
        return w.u1(s10);
    }

    public a v(int i10) {
        return new a(this, i10);
    }

    /* renamed from: w */
    public x c(String str) {
        return x.v1(str);
    }

    public z x(Double d10) {
        return d10 == null ? b() : h.u1(d10.doubleValue());
    }

    public a z() {
        return new a(this);
    }
}
