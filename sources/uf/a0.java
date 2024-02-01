package uf;

import be.p0;
import kotlin.Metadata;
import vf.u;
import we.p;
import we.q;
import xe.k1;
import xe.l0;
import zd.i0;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001aO\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012$\b\u0004\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aO\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012$\b\u0004\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\b\u001a\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0006\b\u0000\u0010\n\u0018\u0001*\u0006\u0012\u0002\b\u00030\u0001H\b\u001a\"\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0000*\u00020\u0005*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001\u001ad\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u000123\b\u0004\u0010\u0010\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\b\u001aj\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\n*\u00020\u0005*\b\u0012\u0004\u0012\u00028\u00000\u000125\b\u0004\u0010\u0010\u001a/\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\bø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\b\u001a\"\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00130\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001aJ\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\u0016\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\b\u001a~\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0018\u001a\u00028\u00012H\b\u0001\u0010\u001b\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0019ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a~\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0018\u001a\u00028\u00012H\b\u0001\u0010\u001b\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0019ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001d\u001an\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012F\u0010\u001b\u001aB\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0019ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"T", "Luf/i;", "Lkotlin/Function2;", "Lie/d;", "", "", "predicate", "a", "(Luf/i;Lwe/p;)Luf/i;", "c", "R", "b", "d", "Lzd/v0;", "name", "value", "transform", "e", "f", "Lbe/p0;", "k", "Lzd/u2;", "action", "g", "initial", "Lkotlin/Function3;", "accumulator", "operation", "j", "(Luf/i;Ljava/lang/Object;Lwe/q;)Luf/i;", "h", "i", "(Luf/i;Lwe/q;)Luf/i;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/flow/FlowKt")
public final /* synthetic */ class a0 {

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Luf/i;", "Luf/j;", "collector", "Lzd/u2;", "a", "(Luf/j;Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core", "uf/t$g"}, k = 1, mv = {1, 6, 0})
    public static final class a implements i<T> {
        public final /* synthetic */ i O;
        public final /* synthetic */ p P;

        @i0(k = 3, mv = {1, 6, 0}, xi = 176)
        /* renamed from: uf.a0$a$a  reason: collision with other inner class name */
        public static final class C0429a extends le.d {
            public /* synthetic */ Object R;
            public int S;
            public final /* synthetic */ a T;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0429a(a aVar, ie.d dVar) {
                super(dVar);
                this.T = aVar;
            }

            @fh.h
            public final Object K(@fh.g Object obj) {
                this.R = obj;
                this.S |= Integer.MIN_VALUE;
                return this.T.a((j) null, this);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lzd/u2;", "d", "(Ljava/lang/Object;Lie/d;)Ljava/lang/Object;", "uf/t$h"}, k = 3, mv = {1, 6, 0})
        public static final class b<T> implements j {
            public final /* synthetic */ j O;
            public final /* synthetic */ p P;

            @le.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {0, 0}, l = {223, 223}, m = "emit", n = {"value", "$this$filter_u24lambda_u2d0"}, s = {"L$0", "L$1"})
            @i0(k = 3, mv = {1, 6, 0}, xi = 176)
            /* renamed from: uf.a0$a$b$a  reason: collision with other inner class name */
            public static final class C0430a extends le.d {
                public /* synthetic */ Object R;
                public int S;
                public final /* synthetic */ b T;
                public Object U;
                public Object V;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0430a(b bVar, ie.d dVar) {
                    super(dVar);
                    this.T = bVar;
                }

                @fh.h
                public final Object K(@fh.g Object obj) {
                    this.R = obj;
                    this.S |= Integer.MIN_VALUE;
                    return this.T.d(null, this);
                }
            }

            public b(j jVar, p pVar) {
                this.O = jVar;
                this.P = pVar;
            }

            @fh.h
            public final Object a(Object obj, @fh.g ie.d dVar) {
                xe.i0.e(4);
                new C0430a(this, dVar);
                xe.i0.e(5);
                j jVar = this.O;
                if (((Boolean) this.P.g0(obj, dVar)).booleanValue()) {
                    xe.i0.e(0);
                    jVar.d(obj, dVar);
                    xe.i0.e(1);
                }
                return u2.f25116a;
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x005e  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
            @fh.h
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object d(T r7, @fh.g ie.d<? super zd.u2> r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof uf.a0.a.b.C0430a
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    uf.a0$a$b$a r0 = (uf.a0.a.b.C0430a) r0
                    int r1 = r0.S
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.S = r1
                    goto L_0x0018
                L_0x0013:
                    uf.a0$a$b$a r0 = new uf.a0$a$b$a
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.R
                    java.lang.Object r1 = ke.d.h()
                    int r2 = r0.S
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L_0x003e
                    if (r2 == r4) goto L_0x0034
                    if (r2 != r3) goto L_0x002c
                    zd.e1.n(r8)
                    goto L_0x006c
                L_0x002c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x0034:
                    java.lang.Object r7 = r0.V
                    uf.j r7 = (uf.j) r7
                    java.lang.Object r2 = r0.U
                    zd.e1.n(r8)
                    goto L_0x0056
                L_0x003e:
                    zd.e1.n(r8)
                    uf.j r8 = r6.O
                    we.p r2 = r6.P
                    r0.U = r7
                    r0.V = r8
                    r0.S = r4
                    java.lang.Object r2 = r2.g0(r7, r0)
                    if (r2 != r1) goto L_0x0052
                    return r1
                L_0x0052:
                    r5 = r2
                    r2 = r7
                    r7 = r8
                    r8 = r5
                L_0x0056:
                    java.lang.Boolean r8 = (java.lang.Boolean) r8
                    boolean r8 = r8.booleanValue()
                    if (r8 == 0) goto L_0x006c
                    r8 = 0
                    r0.U = r8
                    r0.V = r8
                    r0.S = r3
                    java.lang.Object r7 = r7.d(r2, r0)
                    if (r7 != r1) goto L_0x006c
                    return r1
                L_0x006c:
                    zd.u2 r7 = zd.u2.f25116a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: uf.a0.a.b.d(java.lang.Object, ie.d):java.lang.Object");
            }
        }

        public a(i iVar, p pVar) {
            this.O = iVar;
            this.P = pVar;
        }

        @fh.h
        public Object a(@fh.g j jVar, @fh.g ie.d dVar) {
            Object a10 = this.O.a(new b(jVar, this.P), dVar);
            return a10 == ke.d.h() ? a10 : u2.f25116a;
        }

        @fh.h
        public Object e(@fh.g j jVar, @fh.g ie.d dVar) {
            xe.i0.e(4);
            new C0429a(this, dVar);
            xe.i0.e(5);
            i iVar = this.O;
            b bVar = new b(jVar, this.P);
            xe.i0.e(0);
            iVar.a(bVar, dVar);
            xe.i0.e(1);
            return u2.f25116a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Luf/i;", "Luf/j;", "collector", "Lzd/u2;", "a", "(Luf/j;Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core", "uf/a0$a"}, k = 1, mv = {1, 6, 0})
    public static final class b implements i<Object> {
        public final /* synthetic */ i O;

        @i0(k = 3, mv = {1, 6, 0}, xi = 176)
        public static final class a extends le.d {
            public /* synthetic */ Object R;
            public int S;
            public final /* synthetic */ b T;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(b bVar, ie.d dVar) {
                super(dVar);
                this.T = bVar;
            }

            @fh.h
            public final Object K(@fh.g Object obj) {
                this.R = obj;
                this.S |= Integer.MIN_VALUE;
                return this.T.a((j) null, this);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lzd/u2;", "d", "(Ljava/lang/Object;Lie/d;)Ljava/lang/Object;", "uf/a0$a$b"}, k = 3, mv = {1, 6, 0})
        /* renamed from: uf.a0$b$b  reason: collision with other inner class name */
        public static final class C0431b<T> implements j {
            public final /* synthetic */ j O;

            @le.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2", f = "Transform.kt", i = {}, l = {224}, m = "emit", n = {}, s = {})
            @i0(k = 3, mv = {1, 6, 0}, xi = 176)
            /* renamed from: uf.a0$b$b$a */
            public static final class a extends le.d {
                public /* synthetic */ Object R;
                public int S;
                public Object T;
                public Object U;
                public final /* synthetic */ C0431b V;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public a(C0431b bVar, ie.d dVar) {
                    super(dVar);
                    this.V = bVar;
                }

                @fh.h
                public final Object K(@fh.g Object obj) {
                    this.R = obj;
                    this.S |= Integer.MIN_VALUE;
                    return this.V.d((Object) null, this);
                }
            }

            public C0431b(j jVar) {
                this.O = jVar;
            }

            @fh.h
            public final Object a(Object obj, @fh.g ie.d dVar) {
                xe.i0.e(4);
                new a(this, dVar);
                xe.i0.e(5);
                j jVar = this.O;
                l0.y(3, "R");
                if (obj instanceof Object) {
                    xe.i0.e(0);
                    jVar.d(obj, dVar);
                    xe.i0.e(1);
                }
                return u2.f25116a;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            @fh.h
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object d(java.lang.Object r6, @fh.g ie.d r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof uf.a0.b.C0431b.a
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    uf.a0$b$b$a r0 = (uf.a0.b.C0431b.a) r0
                    int r1 = r0.S
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.S = r1
                    goto L_0x0018
                L_0x0013:
                    uf.a0$b$b$a r0 = new uf.a0$b$b$a
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.R
                    java.lang.Object r1 = ke.d.h()
                    int r2 = r0.S
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    zd.e1.n(r7)
                    goto L_0x0049
                L_0x0029:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x0031:
                    zd.e1.n(r7)
                    uf.j r7 = r5.O
                    r2 = 3
                    java.lang.String r4 = "R"
                    xe.l0.y(r2, r4)
                    boolean r2 = r6 instanceof java.lang.Object
                    if (r2 == 0) goto L_0x0049
                    r0.S = r3
                    java.lang.Object r6 = r7.d(r6, r0)
                    if (r6 != r1) goto L_0x0049
                    return r1
                L_0x0049:
                    zd.u2 r6 = zd.u2.f25116a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: uf.a0.b.C0431b.d(java.lang.Object, ie.d):java.lang.Object");
            }
        }

        public b(i iVar) {
            this.O = iVar;
        }

        @fh.h
        public Object a(@fh.g j jVar, @fh.g ie.d dVar) {
            i iVar = this.O;
            l0.w();
            Object a10 = iVar.a(new C0431b(jVar), dVar);
            return a10 == ke.d.h() ? a10 : u2.f25116a;
        }

        @fh.h
        public Object e(@fh.g j jVar, @fh.g ie.d dVar) {
            xe.i0.e(4);
            new a(this, dVar);
            xe.i0.e(5);
            i iVar = this.O;
            l0.w();
            C0431b bVar = new C0431b(jVar);
            xe.i0.e(0);
            iVar.a(bVar, dVar);
            xe.i0.e(1);
            return u2.f25116a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Luf/i;", "Luf/j;", "collector", "Lzd/u2;", "a", "(Luf/j;Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core", "uf/t$g"}, k = 1, mv = {1, 6, 0})
    public static final class c implements i<T> {
        public final /* synthetic */ i O;
        public final /* synthetic */ p P;

        @i0(k = 3, mv = {1, 6, 0}, xi = 176)
        public static final class a extends le.d {
            public /* synthetic */ Object R;
            public int S;
            public final /* synthetic */ c T;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(c cVar, ie.d dVar) {
                super(dVar);
                this.T = cVar;
            }

            @fh.h
            public final Object K(@fh.g Object obj) {
                this.R = obj;
                this.S |= Integer.MIN_VALUE;
                return this.T.a((j) null, this);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lzd/u2;", "d", "(Ljava/lang/Object;Lie/d;)Ljava/lang/Object;", "uf/t$h"}, k = 3, mv = {1, 6, 0})
        public static final class b<T> implements j {
            public final /* synthetic */ j O;
            public final /* synthetic */ p P;

            @le.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {0, 0}, l = {223, 223}, m = "emit", n = {"value", "$this$filterNot_u24lambda_u2d1"}, s = {"L$0", "L$1"})
            @i0(k = 3, mv = {1, 6, 0}, xi = 176)
            public static final class a extends le.d {
                public /* synthetic */ Object R;
                public int S;
                public final /* synthetic */ b T;
                public Object U;
                public Object V;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public a(b bVar, ie.d dVar) {
                    super(dVar);
                    this.T = bVar;
                }

                @fh.h
                public final Object K(@fh.g Object obj) {
                    this.R = obj;
                    this.S |= Integer.MIN_VALUE;
                    return this.T.d(null, this);
                }
            }

            public b(j jVar, p pVar) {
                this.O = jVar;
                this.P = pVar;
            }

            @fh.h
            public final Object a(Object obj, @fh.g ie.d dVar) {
                xe.i0.e(4);
                new a(this, dVar);
                xe.i0.e(5);
                j jVar = this.O;
                if (!((Boolean) this.P.g0(obj, dVar)).booleanValue()) {
                    xe.i0.e(0);
                    jVar.d(obj, dVar);
                    xe.i0.e(1);
                }
                return u2.f25116a;
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x005e  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
            @fh.h
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object d(T r7, @fh.g ie.d<? super zd.u2> r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof uf.a0.c.b.a
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    uf.a0$c$b$a r0 = (uf.a0.c.b.a) r0
                    int r1 = r0.S
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.S = r1
                    goto L_0x0018
                L_0x0013:
                    uf.a0$c$b$a r0 = new uf.a0$c$b$a
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.R
                    java.lang.Object r1 = ke.d.h()
                    int r2 = r0.S
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L_0x003e
                    if (r2 == r4) goto L_0x0034
                    if (r2 != r3) goto L_0x002c
                    zd.e1.n(r8)
                    goto L_0x006c
                L_0x002c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x0034:
                    java.lang.Object r7 = r0.V
                    uf.j r7 = (uf.j) r7
                    java.lang.Object r2 = r0.U
                    zd.e1.n(r8)
                    goto L_0x0056
                L_0x003e:
                    zd.e1.n(r8)
                    uf.j r8 = r6.O
                    we.p r2 = r6.P
                    r0.U = r7
                    r0.V = r8
                    r0.S = r4
                    java.lang.Object r2 = r2.g0(r7, r0)
                    if (r2 != r1) goto L_0x0052
                    return r1
                L_0x0052:
                    r5 = r2
                    r2 = r7
                    r7 = r8
                    r8 = r5
                L_0x0056:
                    java.lang.Boolean r8 = (java.lang.Boolean) r8
                    boolean r8 = r8.booleanValue()
                    if (r8 != 0) goto L_0x006c
                    r8 = 0
                    r0.U = r8
                    r0.V = r8
                    r0.S = r3
                    java.lang.Object r7 = r7.d(r2, r0)
                    if (r7 != r1) goto L_0x006c
                    return r1
                L_0x006c:
                    zd.u2 r7 = zd.u2.f25116a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: uf.a0.c.b.d(java.lang.Object, ie.d):java.lang.Object");
            }
        }

        public c(i iVar, p pVar) {
            this.O = iVar;
            this.P = pVar;
        }

        @fh.h
        public Object a(@fh.g j jVar, @fh.g ie.d dVar) {
            Object a10 = this.O.a(new b(jVar, this.P), dVar);
            return a10 == ke.d.h() ? a10 : u2.f25116a;
        }

        @fh.h
        public Object e(@fh.g j jVar, @fh.g ie.d dVar) {
            xe.i0.e(4);
            new a(this, dVar);
            xe.i0.e(5);
            i iVar = this.O;
            b bVar = new b(jVar, this.P);
            xe.i0.e(0);
            iVar.a(bVar, dVar);
            xe.i0.e(1);
            return u2.f25116a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Luf/i;", "Luf/j;", "collector", "Lzd/u2;", "a", "(Luf/j;Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core", "uf/t$g"}, k = 1, mv = {1, 6, 0})
    public static final class d implements i<T> {
        public final /* synthetic */ i O;

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lzd/u2;", "d", "(Ljava/lang/Object;Lie/d;)Ljava/lang/Object;", "uf/t$h"}, k = 3, mv = {1, 6, 0})
        public static final class a<T> implements j {
            public final /* synthetic */ j O;

            @le.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {}, l = {223}, m = "emit", n = {}, s = {})
            @i0(k = 3, mv = {1, 6, 0}, xi = 48)
            /* renamed from: uf.a0$d$a$a  reason: collision with other inner class name */
            public static final class C0432a extends le.d {
                public /* synthetic */ Object R;
                public int S;
                public final /* synthetic */ a T;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0432a(a aVar, ie.d dVar) {
                    super(dVar);
                    this.T = aVar;
                }

                @fh.h
                public final Object K(@fh.g Object obj) {
                    this.R = obj;
                    this.S |= Integer.MIN_VALUE;
                    return this.T.d(null, this);
                }
            }

            public a(j jVar) {
                this.O = jVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            @fh.h
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object d(T r5, @fh.g ie.d<? super zd.u2> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof uf.a0.d.a.C0432a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    uf.a0$d$a$a r0 = (uf.a0.d.a.C0432a) r0
                    int r1 = r0.S
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.S = r1
                    goto L_0x0018
                L_0x0013:
                    uf.a0$d$a$a r0 = new uf.a0$d$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.R
                    java.lang.Object r1 = ke.d.h()
                    int r2 = r0.S
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    zd.e1.n(r6)
                    goto L_0x0041
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    zd.e1.n(r6)
                    uf.j r6 = r4.O
                    if (r5 == 0) goto L_0x0041
                    r0.S = r3
                    java.lang.Object r5 = r6.d(r5, r0)
                    if (r5 != r1) goto L_0x0041
                    return r1
                L_0x0041:
                    zd.u2 r5 = zd.u2.f25116a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: uf.a0.d.a.d(java.lang.Object, ie.d):java.lang.Object");
            }
        }

        public d(i iVar) {
            this.O = iVar;
        }

        @fh.h
        public Object a(@fh.g j jVar, @fh.g ie.d dVar) {
            Object a10 = this.O.a(new a(jVar), dVar);
            return a10 == ke.d.h() ? a10 : u2.f25116a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Luf/i;", "Luf/j;", "collector", "Lzd/u2;", "a", "(Luf/j;Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core", "uf/t$g"}, k = 1, mv = {1, 6, 0})
    public static final class e implements i<R> {
        public final /* synthetic */ i O;
        public final /* synthetic */ p P;

        @i0(k = 3, mv = {1, 6, 0}, xi = 176)
        public static final class a extends le.d {
            public /* synthetic */ Object R;
            public int S;
            public final /* synthetic */ e T;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(e eVar, ie.d dVar) {
                super(dVar);
                this.T = eVar;
            }

            @fh.h
            public final Object K(@fh.g Object obj) {
                this.R = obj;
                this.S |= Integer.MIN_VALUE;
                return this.T.a((j) null, this);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lzd/u2;", "d", "(Ljava/lang/Object;Lie/d;)Ljava/lang/Object;", "uf/t$h"}, k = 3, mv = {1, 6, 0})
        public static final class b<T> implements j {
            public final /* synthetic */ j O;
            public final /* synthetic */ p P;

            @le.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {}, l = {223, 223}, m = "emit", n = {}, s = {})
            @i0(k = 3, mv = {1, 6, 0}, xi = 176)
            public static final class a extends le.d {
                public /* synthetic */ Object R;
                public int S;
                public final /* synthetic */ b T;
                public Object U;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public a(b bVar, ie.d dVar) {
                    super(dVar);
                    this.T = bVar;
                }

                @fh.h
                public final Object K(@fh.g Object obj) {
                    this.R = obj;
                    this.S |= Integer.MIN_VALUE;
                    return this.T.d(null, this);
                }
            }

            public b(j jVar, p pVar) {
                this.O = jVar;
                this.P = pVar;
            }

            @fh.h
            public final Object a(Object obj, @fh.g ie.d dVar) {
                xe.i0.e(4);
                new a(this, dVar);
                xe.i0.e(5);
                j jVar = this.O;
                Object g02 = this.P.g0(obj, dVar);
                xe.i0.e(0);
                jVar.d(g02, dVar);
                xe.i0.e(1);
                return u2.f25116a;
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x005c A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
            @fh.h
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object d(T r7, @fh.g ie.d<? super zd.u2> r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof uf.a0.e.b.a
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    uf.a0$e$b$a r0 = (uf.a0.e.b.a) r0
                    int r1 = r0.S
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.S = r1
                    goto L_0x0018
                L_0x0013:
                    uf.a0$e$b$a r0 = new uf.a0$e$b$a
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.R
                    java.lang.Object r1 = ke.d.h()
                    int r2 = r0.S
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L_0x003c
                    if (r2 == r4) goto L_0x0034
                    if (r2 != r3) goto L_0x002c
                    zd.e1.n(r8)
                    goto L_0x005d
                L_0x002c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x0034:
                    java.lang.Object r7 = r0.U
                    uf.j r7 = (uf.j) r7
                    zd.e1.n(r8)
                    goto L_0x0051
                L_0x003c:
                    zd.e1.n(r8)
                    uf.j r8 = r6.O
                    we.p r2 = r6.P
                    r0.U = r8
                    r0.S = r4
                    java.lang.Object r7 = r2.g0(r7, r0)
                    if (r7 != r1) goto L_0x004e
                    return r1
                L_0x004e:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L_0x0051:
                    r2 = 0
                    r0.U = r2
                    r0.S = r3
                    java.lang.Object r7 = r7.d(r8, r0)
                    if (r7 != r1) goto L_0x005d
                    return r1
                L_0x005d:
                    zd.u2 r7 = zd.u2.f25116a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: uf.a0.e.b.d(java.lang.Object, ie.d):java.lang.Object");
            }
        }

        public e(i iVar, p pVar) {
            this.O = iVar;
            this.P = pVar;
        }

        @fh.h
        public Object a(@fh.g j jVar, @fh.g ie.d dVar) {
            Object a10 = this.O.a(new b(jVar, this.P), dVar);
            return a10 == ke.d.h() ? a10 : u2.f25116a;
        }

        @fh.h
        public Object e(@fh.g j jVar, @fh.g ie.d dVar) {
            xe.i0.e(4);
            new a(this, dVar);
            xe.i0.e(5);
            i iVar = this.O;
            b bVar = new b(jVar, this.P);
            xe.i0.e(0);
            iVar.a(bVar, dVar);
            xe.i0.e(1);
            return u2.f25116a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Luf/i;", "Luf/j;", "collector", "Lzd/u2;", "a", "(Luf/j;Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core", "uf/t$g"}, k = 1, mv = {1, 6, 0})
    public static final class f implements i<R> {
        public final /* synthetic */ i O;
        public final /* synthetic */ p P;

        @i0(k = 3, mv = {1, 6, 0}, xi = 176)
        public static final class a extends le.d {
            public /* synthetic */ Object R;
            public int S;
            public final /* synthetic */ f T;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(f fVar, ie.d dVar) {
                super(dVar);
                this.T = fVar;
            }

            @fh.h
            public final Object K(@fh.g Object obj) {
                this.R = obj;
                this.S |= Integer.MIN_VALUE;
                return this.T.a((j) null, this);
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lzd/u2;", "d", "(Ljava/lang/Object;Lie/d;)Ljava/lang/Object;", "uf/t$h"}, k = 3, mv = {1, 6, 0})
        public static final class b<T> implements j {
            public final /* synthetic */ j O;
            public final /* synthetic */ p P;

            @le.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {0}, l = {223, 224}, m = "emit", n = {"$this$mapNotNull_u24lambda_u2d5"}, s = {"L$0"})
            @i0(k = 3, mv = {1, 6, 0}, xi = 176)
            public static final class a extends le.d {
                public /* synthetic */ Object R;
                public int S;
                public final /* synthetic */ b T;
                public Object U;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public a(b bVar, ie.d dVar) {
                    super(dVar);
                    this.T = bVar;
                }

                @fh.h
                public final Object K(@fh.g Object obj) {
                    this.R = obj;
                    this.S |= Integer.MIN_VALUE;
                    return this.T.d(null, this);
                }
            }

            public b(j jVar, p pVar) {
                this.O = jVar;
                this.P = pVar;
            }

            @fh.h
            public final Object a(Object obj, @fh.g ie.d dVar) {
                xe.i0.e(4);
                new a(this, dVar);
                xe.i0.e(5);
                j jVar = this.O;
                Object g02 = this.P.g0(obj, dVar);
                if (g02 != null) {
                    xe.i0.e(0);
                    jVar.d(g02, dVar);
                    xe.i0.e(1);
                }
                return u2.f25116a;
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
            /* JADX WARNING: Removed duplicated region for block: B:19:0x0054  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
            @fh.h
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object d(T r7, @fh.g ie.d<? super zd.u2> r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof uf.a0.f.b.a
                    if (r0 == 0) goto L_0x0013
                    r0 = r8
                    uf.a0$f$b$a r0 = (uf.a0.f.b.a) r0
                    int r1 = r0.S
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.S = r1
                    goto L_0x0018
                L_0x0013:
                    uf.a0$f$b$a r0 = new uf.a0$f$b$a
                    r0.<init>(r6, r8)
                L_0x0018:
                    java.lang.Object r8 = r0.R
                    java.lang.Object r1 = ke.d.h()
                    int r2 = r0.S
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L_0x003c
                    if (r2 == r4) goto L_0x0034
                    if (r2 != r3) goto L_0x002c
                    zd.e1.n(r8)
                    goto L_0x0060
                L_0x002c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L_0x0034:
                    java.lang.Object r7 = r0.U
                    uf.j r7 = (uf.j) r7
                    zd.e1.n(r8)
                    goto L_0x0051
                L_0x003c:
                    zd.e1.n(r8)
                    uf.j r8 = r6.O
                    we.p r2 = r6.P
                    r0.U = r8
                    r0.S = r4
                    java.lang.Object r7 = r2.g0(r7, r0)
                    if (r7 != r1) goto L_0x004e
                    return r1
                L_0x004e:
                    r5 = r8
                    r8 = r7
                    r7 = r5
                L_0x0051:
                    if (r8 != 0) goto L_0x0054
                    goto L_0x0060
                L_0x0054:
                    r2 = 0
                    r0.U = r2
                    r0.S = r3
                    java.lang.Object r7 = r7.d(r8, r0)
                    if (r7 != r1) goto L_0x0060
                    return r1
                L_0x0060:
                    zd.u2 r7 = zd.u2.f25116a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: uf.a0.f.b.d(java.lang.Object, ie.d):java.lang.Object");
            }
        }

        public f(i iVar, p pVar) {
            this.O = iVar;
            this.P = pVar;
        }

        @fh.h
        public Object a(@fh.g j jVar, @fh.g ie.d dVar) {
            Object a10 = this.O.a(new b(jVar, this.P), dVar);
            return a10 == ke.d.h() ? a10 : u2.f25116a;
        }

        @fh.h
        public Object e(@fh.g j jVar, @fh.g ie.d dVar) {
            xe.i0.e(4);
            new a(this, dVar);
            xe.i0.e(5);
            i iVar = this.O;
            b bVar = new b(jVar, this.P);
            xe.i0.e(0);
            iVar.a(bVar, dVar);
            xe.i0.e(1);
            return u2.f25116a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Luf/i;", "Luf/j;", "collector", "Lzd/u2;", "a", "(Luf/j;Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core", "uf/t$g"}, k = 1, mv = {1, 6, 0})
    public static final class g implements i<T> {
        public final /* synthetic */ i O;
        public final /* synthetic */ p P;

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lzd/u2;", "d", "(Ljava/lang/Object;Lie/d;)Ljava/lang/Object;", "uf/t$h"}, k = 3, mv = {1, 6, 0})
        public static final class a<T> implements j {
            public final /* synthetic */ j O;
            public final /* synthetic */ p P;

            @le.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", f = "Transform.kt", i = {0, 0}, l = {223, 224}, m = "emit", n = {"value", "$this$onEach_u24lambda_u2d7"}, s = {"L$0", "L$1"})
            @i0(k = 3, mv = {1, 6, 0}, xi = 48)
            /* renamed from: uf.a0$g$a$a  reason: collision with other inner class name */
            public static final class C0433a extends le.d {
                public /* synthetic */ Object R;
                public int S;
                public final /* synthetic */ a T;
                public Object U;
                public Object V;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0433a(a aVar, ie.d dVar) {
                    super(dVar);
                    this.T = aVar;
                }

                @fh.h
                public final Object K(@fh.g Object obj) {
                    this.R = obj;
                    this.S |= Integer.MIN_VALUE;
                    return this.T.d(null, this);
                }
            }

            public a(j jVar, p pVar) {
                this.O = jVar;
                this.P = pVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x0069 A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
            @fh.h
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object d(T r6, @fh.g ie.d<? super zd.u2> r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof uf.a0.g.a.C0433a
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    uf.a0$g$a$a r0 = (uf.a0.g.a.C0433a) r0
                    int r1 = r0.S
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.S = r1
                    goto L_0x0018
                L_0x0013:
                    uf.a0$g$a$a r0 = new uf.a0$g$a$a
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.R
                    java.lang.Object r1 = ke.d.h()
                    int r2 = r0.S
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L_0x003e
                    if (r2 == r4) goto L_0x0034
                    if (r2 != r3) goto L_0x002c
                    zd.e1.n(r7)
                    goto L_0x006a
                L_0x002c:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x0034:
                    java.lang.Object r6 = r0.V
                    uf.j r6 = (uf.j) r6
                    java.lang.Object r2 = r0.U
                    zd.e1.n(r7)
                    goto L_0x005c
                L_0x003e:
                    zd.e1.n(r7)
                    uf.j r7 = r5.O
                    we.p r2 = r5.P
                    r0.U = r6
                    r0.V = r7
                    r0.S = r4
                    r4 = 6
                    xe.i0.e(r4)
                    java.lang.Object r2 = r2.g0(r6, r0)
                    r4 = 7
                    xe.i0.e(r4)
                    if (r2 != r1) goto L_0x005a
                    return r1
                L_0x005a:
                    r2 = r6
                    r6 = r7
                L_0x005c:
                    r7 = 0
                    r0.U = r7
                    r0.V = r7
                    r0.S = r3
                    java.lang.Object r6 = r6.d(r2, r0)
                    if (r6 != r1) goto L_0x006a
                    return r1
                L_0x006a:
                    zd.u2 r6 = zd.u2.f25116a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: uf.a0.g.a.d(java.lang.Object, ie.d):java.lang.Object");
            }
        }

        public g(i iVar, p pVar) {
            this.O = iVar;
            this.P = pVar;
        }

        @fh.h
        public Object a(@fh.g j jVar, @fh.g ie.d dVar) {
            Object a10 = this.O.a(new a(jVar, this.P), dVar);
            return a10 == ke.d.h() ? a10 : u2.f25116a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"vf/x$b", "Luf/i;", "Luf/j;", "collector", "Lzd/u2;", "a", "(Luf/j;Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class h implements i<R> {
        public final /* synthetic */ Object O;
        public final /* synthetic */ i P;
        public final /* synthetic */ q Q;

        @le.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1", f = "Transform.kt", i = {0, 0, 0}, l = {114, 115}, m = "collect", n = {"this", "$this$runningFold_u24lambda_u2d8", "accumulator"}, s = {"L$0", "L$1", "L$2"})
        @i0(k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class a extends le.d {
            public /* synthetic */ Object R;
            public int S;
            public final /* synthetic */ h T;
            public Object U;
            public Object V;
            public Object W;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(h hVar, ie.d dVar) {
                super(dVar);
                this.T = hVar;
            }

            @fh.h
            public final Object K(@fh.g Object obj) {
                this.R = obj;
                this.S |= Integer.MIN_VALUE;
                return this.T.a((j) null, this);
            }
        }

        public h(Object obj, i iVar, q qVar) {
            this.O = obj;
            this.P = iVar;
            this.Q = qVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0044  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x007a A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object a(@fh.g uf.j<? super R> r7, @fh.g ie.d<? super zd.u2> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof uf.a0.h.a
                if (r0 == 0) goto L_0x0013
                r0 = r8
                uf.a0$h$a r0 = (uf.a0.h.a) r0
                int r1 = r0.S
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.S = r1
                goto L_0x0018
            L_0x0013:
                uf.a0$h$a r0 = new uf.a0$h$a
                r0.<init>(r6, r8)
            L_0x0018:
                java.lang.Object r8 = r0.R
                java.lang.Object r1 = ke.d.h()
                int r2 = r0.S
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x0044
                if (r2 == r4) goto L_0x0034
                if (r2 != r3) goto L_0x002c
                zd.e1.n(r8)
                goto L_0x007b
            L_0x002c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L_0x0034:
                java.lang.Object r7 = r0.W
                xe.k1$h r7 = (xe.k1.h) r7
                java.lang.Object r2 = r0.V
                uf.j r2 = (uf.j) r2
                java.lang.Object r4 = r0.U
                uf.a0$h r4 = (uf.a0.h) r4
                zd.e1.n(r8)
                goto L_0x0062
            L_0x0044:
                zd.e1.n(r8)
                xe.k1$h r8 = new xe.k1$h
                r8.<init>()
                java.lang.Object r2 = r6.O
                r8.O = r2
                r0.U = r6
                r0.V = r7
                r0.W = r8
                r0.S = r4
                java.lang.Object r2 = r7.d(r2, r0)
                if (r2 != r1) goto L_0x005f
                return r1
            L_0x005f:
                r4 = r6
                r2 = r7
                r7 = r8
            L_0x0062:
                uf.i r8 = r4.P
                uf.a0$i r5 = new uf.a0$i
                we.q r4 = r4.Q
                r5.<init>(r7, r4, r2)
                r7 = 0
                r0.U = r7
                r0.V = r7
                r0.W = r7
                r0.S = r3
                java.lang.Object r7 = r8.a(r5, r0)
                if (r7 != r1) goto L_0x007b
                return r1
            L_0x007b:
                zd.u2 r7 = zd.u2.f25116a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: uf.a0.h.a(uf.j, ie.d):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "Lzd/u2;", "d", "(Ljava/lang/Object;Lie/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    public static final class i<T> implements j {
        public final /* synthetic */ k1.h<R> O;
        public final /* synthetic */ q<R, T, ie.d<? super R>, Object> P;
        public final /* synthetic */ j<R> Q;

        @le.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1", f = "Transform.kt", i = {0}, l = {103, 104}, m = "emit", n = {"this"}, s = {"L$0"})
        @i0(k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class a extends le.d {
            public Object R;
            public Object S;
            public /* synthetic */ Object T;
            public final /* synthetic */ i<T> U;
            public int V;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(i<? super T> iVar, ie.d<? super a> dVar) {
                super(dVar);
                this.U = iVar;
            }

            @fh.h
            public final Object K(@fh.g Object obj) {
                this.T = obj;
                this.V |= Integer.MIN_VALUE;
                return this.U.d(null, this);
            }
        }

        public i(k1.h<R> hVar, q<? super R, ? super T, ? super ie.d<? super R>, ? extends Object> qVar, j<? super R> jVar) {
            this.O = hVar;
            this.P = qVar;
            this.Q = jVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x006f A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object d(T r8, @fh.g ie.d<? super zd.u2> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof uf.a0.i.a
                if (r0 == 0) goto L_0x0013
                r0 = r9
                uf.a0$i$a r0 = (uf.a0.i.a) r0
                int r1 = r0.V
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.V = r1
                goto L_0x0018
            L_0x0013:
                uf.a0$i$a r0 = new uf.a0$i$a
                r0.<init>(r7, r9)
            L_0x0018:
                java.lang.Object r9 = r0.T
                java.lang.Object r1 = ke.d.h()
                int r2 = r0.V
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x0040
                if (r2 == r4) goto L_0x0034
                if (r2 != r3) goto L_0x002c
                zd.e1.n(r9)
                goto L_0x0070
            L_0x002c:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L_0x0034:
                java.lang.Object r8 = r0.S
                xe.k1$h r8 = (xe.k1.h) r8
                java.lang.Object r2 = r0.R
                uf.a0$i r2 = (uf.a0.i) r2
                zd.e1.n(r9)
                goto L_0x005a
            L_0x0040:
                zd.e1.n(r9)
                xe.k1$h<R> r9 = r7.O
                we.q<R, T, ie.d<? super R>, java.lang.Object> r2 = r7.P
                T r5 = r9.O
                r0.R = r7
                r0.S = r9
                r0.V = r4
                java.lang.Object r8 = r2.y(r5, r8, r0)
                if (r8 != r1) goto L_0x0056
                return r1
            L_0x0056:
                r2 = r7
                r6 = r9
                r9 = r8
                r8 = r6
            L_0x005a:
                r8.O = r9
                uf.j<R> r8 = r2.Q
                xe.k1$h<R> r9 = r2.O
                T r9 = r9.O
                r2 = 0
                r0.R = r2
                r0.S = r2
                r0.V = r3
                java.lang.Object r8 = r8.d(r9, r0)
                if (r8 != r1) goto L_0x0070
                return r1
            L_0x0070:
                zd.u2 r8 = zd.u2.f25116a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: uf.a0.i.d(java.lang.Object, ie.d):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"vf/x$b", "Luf/i;", "Luf/j;", "collector", "Lzd/u2;", "a", "(Luf/j;Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class j implements i<T> {
        public final /* synthetic */ i O;
        public final /* synthetic */ q P;

        public j(i iVar, q qVar) {
            this.O = iVar;
            this.P = qVar;
        }

        @fh.h
        public Object a(@fh.g j<? super T> jVar, @fh.g ie.d<? super u2> dVar) {
            k1.h hVar = new k1.h();
            hVar.O = u.f23630a;
            Object a10 = this.O.a(new k(hVar, this.P, jVar), dVar);
            return a10 == ke.d.h() ? a10 : u2.f25116a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "value", "Lzd/u2;", "d", "(Ljava/lang/Object;Lie/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    public static final class k<T> implements j {
        public final /* synthetic */ k1.h<Object> O;
        public final /* synthetic */ q<T, T, ie.d<? super T>, Object> P;
        public final /* synthetic */ j<T> Q;

        @le.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1", f = "Transform.kt", i = {0}, l = {125, 127}, m = "emit", n = {"this"}, s = {"L$0"})
        @i0(k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class a extends le.d {
            public Object R;
            public Object S;
            public /* synthetic */ Object T;
            public final /* synthetic */ k<T> U;
            public int V;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(k<? super T> kVar, ie.d<? super a> dVar) {
                super(dVar);
                this.U = kVar;
            }

            @fh.h
            public final Object K(@fh.g Object obj) {
                this.T = obj;
                this.V |= Integer.MIN_VALUE;
                return this.U.d(null, this);
            }
        }

        public k(k1.h<Object> hVar, q<? super T, ? super T, ? super ie.d<? super T>, ? extends Object> qVar, j<? super T> jVar) {
            this.O = hVar;
            this.P = qVar;
            this.Q = jVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0078 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object d(T r8, @fh.g ie.d<? super zd.u2> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof uf.a0.k.a
                if (r0 == 0) goto L_0x0013
                r0 = r9
                uf.a0$k$a r0 = (uf.a0.k.a) r0
                int r1 = r0.V
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.V = r1
                goto L_0x0018
            L_0x0013:
                uf.a0$k$a r0 = new uf.a0$k$a
                r0.<init>(r7, r9)
            L_0x0018:
                java.lang.Object r9 = r0.T
                java.lang.Object r1 = ke.d.h()
                int r2 = r0.V
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x0040
                if (r2 == r4) goto L_0x0034
                if (r2 != r3) goto L_0x002c
                zd.e1.n(r9)
                goto L_0x0079
            L_0x002c:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L_0x0034:
                java.lang.Object r8 = r0.S
                xe.k1$h r8 = (xe.k1.h) r8
                java.lang.Object r2 = r0.R
                uf.a0$k r2 = (uf.a0.k) r2
                zd.e1.n(r9)
                goto L_0x0060
            L_0x0040:
                zd.e1.n(r9)
                xe.k1$h<java.lang.Object> r9 = r7.O
                T r2 = r9.O
                wf.r0 r5 = vf.u.f23630a
                if (r2 != r5) goto L_0x004d
                r2 = r7
                goto L_0x0063
            L_0x004d:
                we.q<T, T, ie.d<? super T>, java.lang.Object> r5 = r7.P
                r0.R = r7
                r0.S = r9
                r0.V = r4
                java.lang.Object r8 = r5.y(r2, r8, r0)
                if (r8 != r1) goto L_0x005c
                return r1
            L_0x005c:
                r2 = r7
                r6 = r9
                r9 = r8
                r8 = r6
            L_0x0060:
                r6 = r9
                r9 = r8
                r8 = r6
            L_0x0063:
                r9.O = r8
                uf.j<T> r8 = r2.Q
                xe.k1$h<java.lang.Object> r9 = r2.O
                T r9 = r9.O
                r2 = 0
                r0.R = r2
                r0.S = r2
                r0.V = r3
                java.lang.Object r8 = r8.d(r9, r0)
                if (r8 != r1) goto L_0x0079
                return r1
            L_0x0079:
                zd.u2 r8 = zd.u2.f25116a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: uf.a0.k.d(java.lang.Object, ie.d):java.lang.Object");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"vf/x$b", "Luf/i;", "Luf/j;", "collector", "Lzd/u2;", "a", "(Luf/j;Lie/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class l implements i<p0<? extends T>> {
        public final /* synthetic */ i O;

        public l(i iVar) {
            this.O = iVar;
        }

        @fh.h
        public Object a(@fh.g j<? super p0<? extends T>> jVar, @fh.g ie.d<? super u2> dVar) {
            Object a10 = this.O.a(new m(jVar, new k1.f()), dVar);
            return a10 == ke.d.h() ? a10 : u2.f25116a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "value", "Lzd/u2;", "d", "(Ljava/lang/Object;Lie/d;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    public static final class m<T> implements j {
        public final /* synthetic */ j<p0<? extends T>> O;
        public final /* synthetic */ k1.f P;

        @le.f(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$withIndex$1$1", f = "Transform.kt", i = {}, l = {65}, m = "emit", n = {}, s = {})
        @i0(k = 3, mv = {1, 6, 0}, xi = 48)
        public static final class a extends le.d {
            public /* synthetic */ Object R;
            public final /* synthetic */ m<T> S;
            public int T;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(m<? super T> mVar, ie.d<? super a> dVar) {
                super(dVar);
                this.S = mVar;
            }

            @fh.h
            public final Object K(@fh.g Object obj) {
                this.R = obj;
                this.T |= Integer.MIN_VALUE;
                return this.S.d(null, this);
            }
        }

        public m(j<? super p0<? extends T>> jVar, k1.f fVar) {
            this.O = jVar;
            this.P = fVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object d(T r8, @fh.g ie.d<? super zd.u2> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof uf.a0.m.a
                if (r0 == 0) goto L_0x0013
                r0 = r9
                uf.a0$m$a r0 = (uf.a0.m.a) r0
                int r1 = r0.T
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.T = r1
                goto L_0x0018
            L_0x0013:
                uf.a0$m$a r0 = new uf.a0$m$a
                r0.<init>(r7, r9)
            L_0x0018:
                java.lang.Object r9 = r0.R
                java.lang.Object r1 = ke.d.h()
                int r2 = r0.T
                r3 = 1
                if (r2 == 0) goto L_0x0031
                if (r2 != r3) goto L_0x0029
                zd.e1.n(r9)
                goto L_0x004e
            L_0x0029:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L_0x0031:
                zd.e1.n(r9)
                uf.j<be.p0<? extends T>> r9 = r7.O
                be.p0 r2 = new be.p0
                xe.k1$f r4 = r7.P
                int r5 = r4.O
                int r6 = r5 + 1
                r4.O = r6
                if (r5 < 0) goto L_0x0051
                r2.<init>(r5, r8)
                r0.T = r3
                java.lang.Object r8 = r9.d(r2, r0)
                if (r8 != r1) goto L_0x004e
                return r1
            L_0x004e:
                zd.u2 r8 = zd.u2.f25116a
                return r8
            L_0x0051:
                java.lang.ArithmeticException r8 = new java.lang.ArithmeticException
                java.lang.String r9 = "Index overflow has happened"
                r8.<init>(r9)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: uf.a0.m.d(java.lang.Object, ie.d):java.lang.Object");
        }
    }

    @fh.g
    public static final <T> i<T> a(@fh.g i<? extends T> iVar, @fh.g p<? super T, ? super ie.d<? super Boolean>, ? extends Object> pVar) {
        return new a(iVar, pVar);
    }

    @fh.g
    public static final <T> i<T> c(@fh.g i<? extends T> iVar, @fh.g p<? super T, ? super ie.d<? super Boolean>, ? extends Object> pVar) {
        return new c(iVar, pVar);
    }

    @fh.g
    public static final <T> i<T> d(@fh.g i<? extends T> iVar) {
        return new d(iVar);
    }

    @fh.g
    public static final <T, R> i<R> e(@fh.g i<? extends T> iVar, @fh.g p<? super T, ? super ie.d<? super R>, ? extends Object> pVar) {
        return new e(iVar, pVar);
    }

    @fh.g
    public static final <T, R> i<R> f(@fh.g i<? extends T> iVar, @fh.g p<? super T, ? super ie.d<? super R>, ? extends Object> pVar) {
        return new f(iVar, pVar);
    }

    @fh.g
    public static final <T> i<T> g(@fh.g i<? extends T> iVar, @fh.g p<? super T, ? super ie.d<? super u2>, ? extends Object> pVar) {
        return new g(iVar, pVar);
    }

    @fh.g
    public static final <T, R> i<R> h(@fh.g i<? extends T> iVar, R r10, @fh.g @zd.b q<? super R, ? super T, ? super ie.d<? super R>, ? extends Object> qVar) {
        return new h(r10, iVar, qVar);
    }

    @fh.g
    public static final <T> i<T> i(@fh.g i<? extends T> iVar, @fh.g q<? super T, ? super T, ? super ie.d<? super T>, ? extends Object> qVar) {
        return new j(iVar, qVar);
    }

    @fh.g
    public static final <T, R> i<R> j(@fh.g i<? extends T> iVar, R r10, @fh.g @zd.b q<? super R, ? super T, ? super ie.d<? super R>, ? extends Object> qVar) {
        return k.y1(iVar, r10, qVar);
    }

    @fh.g
    public static final <T> i<p0<T>> k(@fh.g i<? extends T> iVar) {
        return new l(iVar);
    }
}
