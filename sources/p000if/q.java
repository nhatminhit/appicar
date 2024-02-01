package p000if;

import fh.g;
import ie.d;
import java.util.Iterator;
import ke.c;
import we.p;
import xe.l0;
import zd.b;
import zd.h1;
import zd.u2;

/* renamed from: if.q  reason: invalid package */
public class q {

    /* renamed from: a  reason: collision with root package name */
    public static final int f19717a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final int f19718b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static final int f19719c = 2;

    /* renamed from: d  reason: collision with root package name */
    public static final int f19720d = 3;

    /* renamed from: e  reason: collision with root package name */
    public static final int f19721e = 4;

    /* renamed from: f  reason: collision with root package name */
    public static final int f19722f = 5;

    /* renamed from: if.q$a */
    public static final class a implements m<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p f19723a;

        public a(p pVar) {
            this.f19723a = pVar;
        }

        @g
        public Iterator<T> iterator() {
            return q.a(this.f19723a);
        }
    }

    @g
    @h1(version = "1.3")
    public static final <T> Iterator<T> a(@g @b p<? super o<? super T>, ? super d<? super u2>, ? extends Object> pVar) {
        l0.p(pVar, "block");
        n nVar = new n();
        nVar.o(c.c(pVar, nVar, nVar));
        return nVar;
    }

    @g
    @h1(version = "1.3")
    public static final <T> m<T> b(@g @b p<? super o<? super T>, ? super d<? super u2>, ? extends Object> pVar) {
        l0.p(pVar, "block");
        return new a(pVar);
    }
}
