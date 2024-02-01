package wf;

import fh.g;
import fh.h;
import ie.g;
import kotlin.Metadata;
import pf.s3;
import ve.e;
import we.p;
import xe.l0;
import xe.n0;

@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0000\u001a\u001a\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0000\"\u0014\u0010\u000b\u001a\u00020\t8\u0000X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n\"*\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000e\"2\u0010\u0011\u001a \u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0010\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00100\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000e\"&\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00120\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000e¨\u0006\u0015"}, d2 = {"Lie/g;", "context", "", "b", "countOrElement", "c", "oldState", "Lzd/u2;", "a", "Lwf/r0;", "Lwf/r0;", "NO_THREAD_ELEMENTS", "Lkotlin/Function2;", "Lie/g$b;", "Lwe/p;", "countAll", "Lpf/s3;", "findOne", "Lwf/c1;", "d", "updateState", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class w0 {
    @g
    @e

    /* renamed from: a  reason: collision with root package name */
    public static final r0 f24123a = new r0("NO_THREAD_ELEMENTS");
    @g

    /* renamed from: b  reason: collision with root package name */
    public static final p<Object, g.b, Object> f24124b = a.P;
    @fh.g

    /* renamed from: c  reason: collision with root package name */
    public static final p<s3<?>, g.b, s3<?>> f24125c = b.P;
    @fh.g

    /* renamed from: d  reason: collision with root package name */
    public static final p<c1, g.b, c1> f24126d = c.P;

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "countOrElement", "Lie/g$b;", "element", "c", "(Ljava/lang/Object;Lie/g$b;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    public static final class a extends n0 implements p<Object, g.b, Object> {
        public static final a P = new a();

        public a() {
            super(2);
        }

        @h
        /* renamed from: c */
        public final Object g0(@h Object obj, @fh.g g.b bVar) {
            if (!(bVar instanceof s3)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int intValue = num != null ? num.intValue() : 1;
            return intValue == 0 ? bVar : Integer.valueOf(intValue + 1);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00002\f\u0010\u0001\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lpf/s3;", "found", "Lie/g$b;", "element", "c", "(Lpf/s3;Lie/g$b;)Lpf/s3;"}, k = 3, mv = {1, 6, 0})
    public static final class b extends n0 implements p<s3<?>, g.b, s3<?>> {
        public static final b P = new b();

        public b() {
            super(2);
        }

        @h
        /* renamed from: c */
        public final s3<?> g0(@h s3<?> s3Var, @fh.g g.b bVar) {
            if (s3Var != null) {
                return s3Var;
            }
            if (bVar instanceof s3) {
                return (s3) bVar;
            }
            return null;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lwf/c1;", "state", "Lie/g$b;", "element", "c", "(Lwf/c1;Lie/g$b;)Lwf/c1;"}, k = 3, mv = {1, 6, 0})
    public static final class c extends n0 implements p<c1, g.b, c1> {
        public static final c P = new c();

        public c() {
            super(2);
        }

        @fh.g
        /* renamed from: c */
        public final c1 g0(@fh.g c1 c1Var, @fh.g g.b bVar) {
            if (bVar instanceof s3) {
                s3 s3Var = (s3) bVar;
                c1Var.a(s3Var, s3Var.z0(c1Var.f24084a));
            }
            return c1Var;
        }
    }

    public static final void a(@fh.g ie.g gVar, @h Object obj) {
        if (obj != f24123a) {
            if (obj instanceof c1) {
                ((c1) obj).b(gVar);
                return;
            }
            Object o10 = gVar.o(null, f24125c);
            if (o10 != null) {
                ((s3) o10).Z0(gVar, obj);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        }
    }

    @fh.g
    public static final Object b(@fh.g ie.g gVar) {
        Object o10 = gVar.o(0, f24124b);
        l0.m(o10);
        return o10;
    }

    @h
    public static final Object c(@fh.g ie.g gVar, @h Object obj) {
        if (obj == null) {
            obj = b(gVar);
        }
        return obj == 0 ? f24123a : obj instanceof Integer ? gVar.o(new c1(gVar, ((Number) obj).intValue()), f24126d) : ((s3) obj).z0(gVar);
    }
}
