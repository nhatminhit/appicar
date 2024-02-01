package u2;

import a3.c;
import a3.f;
import a3.h;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import android.util.Pair;
import d.m0;
import d.t0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import u2.n2;

public final class w1 implements c {
    public final c O;
    public final n2.f P;
    public final Executor Q;

    public w1(@m0 c cVar, @m0 n2.f fVar, @m0 Executor executor) {
        this.O = cVar;
        this.P = fVar;
        this.Q = executor;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A() {
        this.P.a("BEGIN EXCLUSIVE TRANSACTION", Collections.emptyList());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void H0() {
        this.P.a("TRANSACTION SUCCESSFUL", Collections.emptyList());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void N() {
        this.P.a("BEGIN DEFERRED TRANSACTION", Collections.emptyList());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void P() {
        this.P.a("BEGIN EXCLUSIVE TRANSACTION", Collections.emptyList());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void Q() {
        this.P.a("BEGIN DEFERRED TRANSACTION", Collections.emptyList());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void Y() {
        this.P.a("END TRANSACTION", Collections.emptyList());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a0(String str) {
        this.P.a(str, new ArrayList(0));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c0(String str, List list) {
        this.P.a(str, list);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e0(String str) {
        this.P.a(str, Collections.emptyList());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void k0(String str, List list) {
        this.P.a(str, list);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void m0(f fVar, z1 z1Var) {
        this.P.a(fVar.f(), z1Var.c());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void z0(f fVar, z1 z1Var) {
        this.P.a(fVar.f(), z1Var.c());
    }

    public void C(int i10) {
        this.O.C(i10);
    }

    public int C1() {
        return this.O.C1();
    }

    @t0(api = 16)
    public void D() {
        this.O.D();
    }

    public void E(@m0 String str) throws SQLException {
        this.Q.execute(new l1(this, str));
        this.O.E(str);
    }

    public boolean F0() {
        return this.O.F0();
    }

    @m0
    public Cursor G(@m0 f fVar) {
        z1 z1Var = new z1();
        fVar.g(z1Var);
        this.Q.execute(new r1(this, fVar, z1Var));
        return this.O.G(fVar);
    }

    @m0
    public Cursor G0(@m0 String str) {
        this.Q.execute(new t1(this, str));
        return this.O.G0(str);
    }

    public boolean I() {
        return this.O.I();
    }

    public long J0(@m0 String str, int i10, @m0 ContentValues contentValues) throws SQLException {
        return this.O.J0(str, i10, contentValues);
    }

    public void K0(@m0 SQLiteTransactionListener sQLiteTransactionListener) {
        this.Q.execute(new m1(this));
        this.O.K0(sQLiteTransactionListener);
    }

    @m0
    public h L(@m0 String str) {
        return new f2(this.O.L(str), this.P, str, this.Q);
    }

    public boolean L0() {
        return this.O.L0();
    }

    public void M0() {
        this.Q.execute(new u1(this));
        this.O.M0();
    }

    public boolean S0(int i10) {
        return this.O.S0(i10);
    }

    @m0
    public Cursor Y0(@m0 f fVar, @m0 CancellationSignal cancellationSignal) {
        z1 z1Var = new z1();
        fVar.g(z1Var);
        this.Q.execute(new n1(this, fVar, z1Var));
        return this.O.G(fVar);
    }

    public boolean b0() {
        return this.O.b0();
    }

    public void c1(@m0 Locale locale) {
        this.O.c1(locale);
    }

    public void close() throws IOException {
        this.O.close();
    }

    public void i1(@m0 SQLiteTransactionListener sQLiteTransactionListener) {
        this.Q.execute(new q1(this));
        this.O.i1(sQLiteTransactionListener);
    }

    public boolean isOpen() {
        return this.O.isOpen();
    }

    @m0
    public String j1() {
        return this.O.j1();
    }

    @t0(api = 16)
    public void l0(boolean z10) {
        this.O.l0(z10);
    }

    public long n0() {
        return this.O.n0();
    }

    public boolean n1() {
        return this.O.n1();
    }

    public int p(@m0 String str, @m0 String str2, @m0 Object[] objArr) {
        return this.O.p(str, str2, objArr);
    }

    public boolean r0() {
        return this.O.r0();
    }

    public void s() {
        this.Q.execute(new s1(this));
        this.O.s();
    }

    public void s0() {
        this.Q.execute(new p1(this));
        this.O.s0();
    }

    public void u0(@m0 String str, @m0 Object[] objArr) throws SQLException {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(objArr));
        this.Q.execute(new v1(this, str, arrayList));
        this.O.u0(str, arrayList.toArray());
    }

    @t0(api = 16)
    public boolean u1() {
        return this.O.u1();
    }

    public boolean v(long j10) {
        return this.O.v(j10);
    }

    public long v0() {
        return this.O.v0();
    }

    public void w0() {
        this.Q.execute(new k1(this));
        this.O.w0();
    }

    public void w1(int i10) {
        this.O.w1(i10);
    }

    public int x0(@m0 String str, int i10, @m0 ContentValues contentValues, @m0 String str2, @m0 Object[] objArr) {
        return this.O.x0(str, i10, contentValues, str2, objArr);
    }

    public void x1(long j10) {
        this.O.x1(j10);
    }

    @m0
    public Cursor y(@m0 String str, @m0 Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(objArr));
        this.Q.execute(new o1(this, str, arrayList));
        return this.O.y(str, objArr);
    }

    public long y0(long j10) {
        return this.O.y0(j10);
    }

    @m0
    public List<Pair<String, String>> z() {
        return this.O.z();
    }
}
