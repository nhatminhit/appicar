package l2;

import android.os.Bundle;
import androidx.lifecycle.b1;
import androidx.lifecycle.y;
import d.j0;
import d.m0;
import d.o0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import m2.c;

public abstract class a {

    /* renamed from: l2.a$a  reason: collision with other inner class name */
    public interface C0172a<D> {
        @j0
        void a(@m0 c<D> cVar);

        @j0
        void b(@m0 c<D> cVar, D d10);

        @j0
        @m0
        c<D> c(int i10, @o0 Bundle bundle);
    }

    public static void c(boolean z10) {
        b.f10096d = z10;
    }

    @m0
    public static <T extends y & b1> a d(@m0 T t10) {
        return new b(t10, ((b1) t10).getViewModelStore());
    }

    @j0
    public abstract void a(int i10);

    @Deprecated
    public abstract void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    @o0
    public abstract <D> c<D> e(int i10);

    public boolean f() {
        return false;
    }

    @j0
    @m0
    public abstract <D> c<D> g(int i10, @o0 Bundle bundle, @m0 C0172a<D> aVar);

    public abstract void h();

    @j0
    @m0
    public abstract <D> c<D> i(int i10, @o0 Bundle bundle, @m0 C0172a<D> aVar);
}
