package zf;

import fh.g;
import ie.d;
import kotlin.Metadata;
import pf.c2;
import we.l;
import we.p;
import zd.i0;

@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J5\u0010\b\u001a\u00020\u0007*\u00020\u00032\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004H¦\u0002ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJG\u0010\r\u001a\u00020\u0007\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u00028\u00010\u000b2\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\fH¦\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ[\u0010\u0012\u001a\u00020\u0007\"\u0004\b\u0001\u0010\u000f\"\u0004\b\u0002\u0010\n*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00102\u0006\u0010\u0011\u001a\u00028\u00012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\fH¦\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013JU\u0010\u0014\u001a\u00020\u0007\"\u0004\b\u0001\u0010\u000f\"\u0004\b\u0002\u0010\n*\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\u0004\u0012\u00028\u00020\u00102\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J8\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004H'ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lzf/a;", "R", "", "Lzf/c;", "Lkotlin/Function1;", "Lie/d;", "block", "Lzd/u2;", "J", "(Lzf/c;Lwe/l;)V", "Q", "Lzf/d;", "Lkotlin/Function2;", "c0", "(Lzf/d;Lwe/p;)V", "P", "Lzf/e;", "param", "r0", "(Lzf/e;Ljava/lang/Object;Lwe/p;)V", "h", "(Lzf/e;Lwe/p;)V", "", "timeMillis", "L", "(JLwe/l;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public interface a<R> {

    @i0(k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: zf.a$a  reason: collision with other inner class name */
    public static final class C0497a {
        public static <R, P, Q> void a(@g a<? super R> aVar, @g e<? super P, ? extends Q> eVar, @g p<? super Q, ? super d<? super R>, ? extends Object> pVar) {
            aVar.r0(eVar, null, pVar);
        }
    }

    void J(@g c cVar, @g l<? super d<? super R>, ? extends Object> lVar);

    @c2
    void L(long j10, @g l<? super d<? super R>, ? extends Object> lVar);

    <Q> void c0(@g d<? extends Q> dVar, @g p<? super Q, ? super d<? super R>, ? extends Object> pVar);

    <P, Q> void h(@g e<? super P, ? extends Q> eVar, @g p<? super Q, ? super d<? super R>, ? extends Object> pVar);

    <P, Q> void r0(@g e<? super P, ? extends Q> eVar, P p10, @g p<? super Q, ? super d<? super R>, ? extends Object> pVar);
}
