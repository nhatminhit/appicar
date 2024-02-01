package pl.droidsonroids.gif;

import d.e0;
import d.o0;

public class i {

    /* renamed from: a  reason: collision with root package name */
    public char f22131a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f22132b;

    public i() {
        a();
    }

    public final void a() {
        this.f22131a = 1;
        this.f22132b = false;
    }

    public void b(@o0 i iVar) {
        if (iVar == null) {
            a();
            return;
        }
        this.f22132b = iVar.f22132b;
        this.f22131a = iVar.f22131a;
    }

    public void c(boolean z10) {
        this.f22132b = z10;
    }

    public void d(@e0(from = 1, to = 65535) int i10) {
        if (i10 < 1 || i10 > 65535) {
            this.f22131a = 1;
        } else {
            this.f22131a = (char) i10;
        }
    }
}
