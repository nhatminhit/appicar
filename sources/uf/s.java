package uf;

import fh.g;
import fh.h;
import kotlin.Metadata;
import we.l;
import we.p;
import xe.l0;
import xe.n0;
import xe.u1;

@Metadata(bv = {}, d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\u001a\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001aT\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000126\u0010\t\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003\u001a6\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f\u001aw\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f2:\u0010\t\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u0011\"*\u0010\u0015\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f8\u0002X\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0012\u0012\u0004\b\u0013\u0010\u0014\"0\u0010\u0018\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\b0\u00038\u0002X\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u0012\u0004\b\u0017\u0010\u0014¨\u0006\u0019"}, d2 = {"T", "Luf/i;", "a", "Lkotlin/Function2;", "Lzd/v0;", "name", "old", "new", "", "areEquivalent", "b", "K", "Lkotlin/Function1;", "keySelector", "c", "", "d", "(Luf/i;Lwe/l;Lwe/p;)Luf/i;", "Lwe/l;", "getDefaultKeySelector$annotations$FlowKt__DistinctKt", "()V", "defaultKeySelector", "Lwe/p;", "getDefaultAreEquivalent$annotations$FlowKt__DistinctKt", "defaultAreEquivalent", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class s {
    @g

    /* renamed from: a  reason: collision with root package name */
    public static final l<Object, Object> f23362a = b.P;
    @g

    /* renamed from: b  reason: collision with root package name */
    public static final p<Object, Object, Boolean> f23363b = a.P;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "old", "new", "", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0})
    public static final class a extends n0 implements p<Object, Object, Boolean> {
        public static final a P = new a();

        public a() {
            super(2);
        }

        @g
        /* renamed from: c */
        public final Boolean g0(@h Object obj, @h Object obj2) {
            return Boolean.valueOf(l0.g(obj, obj2));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "A", "(Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    public static final class b extends n0 implements l<Object, Object> {
        public static final b P = new b();

        public b() {
            super(1);
        }

        @h
        public final Object A(@h Object obj) {
            return obj;
        }
    }

    @g
    public static final <T> i<T> a(@g i<? extends T> iVar) {
        return iVar instanceof t0 ? iVar : d(iVar, f23362a, f23363b);
    }

    @g
    public static final <T> i<T> b(@g i<? extends T> iVar, @g p<? super T, ? super T, Boolean> pVar) {
        return d(iVar, f23362a, (p) u1.q(pVar, 2));
    }

    @g
    public static final <T, K> i<T> c(@g i<? extends T> iVar, @g l<? super T, ? extends K> lVar) {
        return d(iVar, lVar, f23363b);
    }

    public static final <T> i<T> d(i<? extends T> iVar, l<? super T, ? extends Object> lVar, p<Object, Object, Boolean> pVar) {
        if (iVar instanceof g) {
            g gVar = (g) iVar;
            if (gVar.P == lVar && gVar.Q == pVar) {
                return iVar;
            }
        }
        return new g(iVar, lVar, pVar);
    }

    public static /* synthetic */ void e() {
    }

    public static /* synthetic */ void f() {
    }
}
