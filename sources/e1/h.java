package e1;

import android.util.LruCache;
import fh.g;
import kotlin.Metadata;
import we.l;
import we.p;
import we.r;
import xe.l0;
import xe.n0;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aû\u0001\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u000328\b\u0006\u0010\n\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00030\u00052%\b\u0006\u0010\f\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u000b2d\b\u0006\u0010\u0013\u001a^\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0010\u0012\u0015\u0012\u0013\u0018\u00018\u0001¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\rH\bø\u0001\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006\u0016"}, d2 = {"", "K", "V", "", "maxSize", "Lkotlin/Function2;", "Lzd/v0;", "name", "key", "value", "sizeOf", "Lkotlin/Function1;", "create", "Lkotlin/Function4;", "", "evicted", "oldValue", "newValue", "Lzd/u2;", "onEntryRemoved", "Landroid/util/LruCache;", "a", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
public final class h {

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u0001H\n"}, d2 = {"", "K", "V", "<anonymous parameter 0>", "<anonymous parameter 1>", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends n0 implements p<Object, Object, Integer> {
        public static final a P = new a();

        public a() {
            super(2);
        }

        public final int c(@g Object obj, @g Object obj2) {
            l0.p(obj, "$noName_0");
            l0.p(obj2, "$noName_1");
            return 1;
        }

        public /* bridge */ /* synthetic */ Object g0(Object obj, Object obj2) {
            return Integer.valueOf(c(obj, obj2));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0004\u001a\u0004\u0018\u00018\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0003\u001a\u00028\u0000H\n"}, d2 = {"", "K", "V", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends n0 implements l<Object, Object> {
        public static final b P = new b();

        public b() {
            super(1);
        }

        @fh.h
        public final Object A(@g Object obj) {
            l0.p(obj, "it");
            return null;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u00012\b\u0010\u0007\u001a\u0004\u0018\u00018\u0001H\n"}, d2 = {"", "K", "V", "", "<anonymous parameter 0>", "<anonymous parameter 1>", "<anonymous parameter 2>", "<anonymous parameter 3>", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends n0 implements r<Boolean, Object, Object, Object, u2> {
        public static final c P = new c();

        public c() {
            super(4);
        }

        public /* bridge */ /* synthetic */ Object M(Object obj, Object obj2, Object obj3, Object obj4) {
            c(((Boolean) obj).booleanValue(), obj2, obj3, obj4);
            return u2.f25116a;
        }

        public final void c(boolean z10, @g Object obj, @g Object obj2, @fh.h Object obj3) {
            l0.p(obj, "$noName_1");
            l0.p(obj2, "$noName_2");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u00012\b\u0010\f\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"e1/h$d", "Landroid/util/LruCache;", "key", "value", "", "sizeOf", "(Ljava/lang/Object;Ljava/lang/Object;)I", "create", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "evicted", "oldValue", "newValue", "Lzd/u2;", "entryRemoved", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "core-ktx_release"}, k = 1, mv = {1, 5, 1})
    public static final class d extends LruCache<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ p<K, V, Integer> f6728a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ l<K, V> f6729b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ r<Boolean, K, V, V, u2> f6730c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ int f6731d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(p<? super K, ? super V, Integer> pVar, l<? super K, ? extends V> lVar, r<? super Boolean, ? super K, ? super V, ? super V, u2> rVar, int i10) {
            super(i10);
            this.f6728a = pVar;
            this.f6729b = lVar;
            this.f6730c = rVar;
            this.f6731d = i10;
        }

        @fh.h
        public V create(@g K k10) {
            l0.p(k10, "key");
            return this.f6729b.A(k10);
        }

        public void entryRemoved(boolean z10, @g K k10, @g V v10, @fh.h V v11) {
            l0.p(k10, "key");
            l0.p(v10, "oldValue");
            this.f6730c.M(Boolean.valueOf(z10), k10, v10, v11);
        }

        public int sizeOf(@g K k10, @g V v10) {
            l0.p(k10, "key");
            l0.p(v10, "value");
            return this.f6728a.g0(k10, v10).intValue();
        }
    }

    @g
    public static final <K, V> LruCache<K, V> a(int i10, @g p<? super K, ? super V, Integer> pVar, @g l<? super K, ? extends V> lVar, @g r<? super Boolean, ? super K, ? super V, ? super V, u2> rVar) {
        l0.p(pVar, "sizeOf");
        l0.p(lVar, "create");
        l0.p(rVar, "onEntryRemoved");
        return new d(pVar, lVar, rVar, i10);
    }

    public static /* synthetic */ LruCache b(int i10, p pVar, l lVar, r rVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            pVar = a.P;
        }
        if ((i11 & 4) != 0) {
            lVar = b.P;
        }
        if ((i11 & 8) != 0) {
            rVar = c.P;
        }
        l0.p(pVar, "sizeOf");
        l0.p(lVar, "create");
        l0.p(rVar, "onEntryRemoved");
        return new d(pVar, lVar, rVar, i10);
    }
}
