package com.fasterxml.jackson.databind.node;

import a6.w;
import com.fasterxml.jackson.databind.node.f;
import i5.m;
import java.math.BigDecimal;
import java.math.BigInteger;
import w4.p;

public abstract class f<T extends f<T>> extends b implements l {
    public static final long Q = 1;
    public final m P;

    public f() {
        this.P = null;
    }

    public f(m mVar) {
        this.P = mVar;
    }

    public final u A() {
        return this.P.A();
    }

    /* renamed from: A1 */
    public final t I(int i10) {
        return this.P.I(i10);
    }

    /* renamed from: B1 */
    public final t M(long j10) {
        return this.P.M(j10);
    }

    /* renamed from: C1 */
    public final t Q(short s10) {
        return this.P.Q(s10);
    }

    public abstract T D1();

    public final z E(Short sh2) {
        return this.P.E(sh2);
    }

    /* renamed from: E1 */
    public final x c(String str) {
        return this.P.c(str);
    }

    /* renamed from: F0 */
    public abstract m get(int i10);

    public final z G(Float f10) {
        return this.P.G(f10);
    }

    /* renamed from: G0 */
    public abstract m g(String str);

    public final z R(Byte b10) {
        return this.P.R(b10);
    }

    public final z S(Integer num) {
        return this.P.S(num);
    }

    public final z f(BigInteger bigInteger) {
        return this.P.f(bigInteger);
    }

    public String g0() {
        return "";
    }

    public final z i(Long l10) {
        return this.P.i(l10);
    }

    public final z j(BigDecimal bigDecimal) {
        return this.P.j(bigDecimal);
    }

    public final z n(w wVar) {
        return this.P.n(wVar);
    }

    public final z o(Object obj) {
        return this.P.o(obj);
    }

    /* renamed from: s1 */
    public final d s(byte[] bArr) {
        return this.P.s(bArr);
    }

    public abstract int size();

    /* renamed from: t1 */
    public final d m(byte[] bArr, int i10, int i11) {
        return this.P.m(bArr, i10, i11);
    }

    /* renamed from: u1 */
    public final e C(boolean z10) {
        return this.P.C(z10);
    }

    public final a v(int i10) {
        return this.P.v(i10);
    }

    public m v1() {
        return this.P.h();
    }

    public abstract p w();

    /* renamed from: w1 */
    public final s b() {
        return this.P.b();
    }

    public final z x(Double d10) {
        return this.P.x(d10);
    }

    /* renamed from: x1 */
    public final t J(byte b10) {
        return this.P.J(b10);
    }

    /* renamed from: y1 */
    public final t L(double d10) {
        return this.P.L(d10);
    }

    public final a z() {
        return this.P.z();
    }

    /* renamed from: z1 */
    public final t H(float f10) {
        return this.P.H(f10);
    }
}
