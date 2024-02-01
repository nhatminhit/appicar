package d7;

import java.util.NoSuchElementException;

public abstract class b implements m {

    /* renamed from: b  reason: collision with root package name */
    public final long f6509b;

    /* renamed from: c  reason: collision with root package name */
    public final long f6510c;

    /* renamed from: d  reason: collision with root package name */
    public long f6511d;

    public b(long j10, long j11) {
        this.f6509b = j10;
        this.f6510c = j11;
        reset();
    }

    public boolean a() {
        return this.f6511d > this.f6510c;
    }

    public final void e() {
        long j10 = this.f6511d;
        if (j10 < this.f6509b || j10 > this.f6510c) {
            throw new NoSuchElementException();
        }
    }

    public final long f() {
        return this.f6511d;
    }

    public boolean next() {
        this.f6511d++;
        return !a();
    }

    public void reset() {
        this.f6511d = this.f6509b - 1;
    }
}
