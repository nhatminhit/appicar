package ef;

import fh.g;
import java.util.Random;
import xe.l0;
import xe.w;

public final class c extends Random {
    @g
    public static final a Q = new a((w) null);
    @Deprecated
    public static final long R = 0;
    @g
    public final f O;
    public boolean P;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }
    }

    public c(@g f fVar) {
        l0.p(fVar, "impl");
        this.O = fVar;
    }

    @g
    public final f a() {
        return this.O;
    }

    public int next(int i10) {
        return this.O.b(i10);
    }

    public boolean nextBoolean() {
        return this.O.c();
    }

    public void nextBytes(@g byte[] bArr) {
        l0.p(bArr, "bytes");
        this.O.e(bArr);
    }

    public double nextDouble() {
        return this.O.h();
    }

    public float nextFloat() {
        return this.O.k();
    }

    public int nextInt() {
        return this.O.l();
    }

    public int nextInt(int i10) {
        return this.O.m(i10);
    }

    public long nextLong() {
        return this.O.o();
    }

    public void setSeed(long j10) {
        if (!this.P) {
            this.P = true;
            return;
        }
        throw new UnsupportedOperationException("Setting seed is not supported.");
    }
}
