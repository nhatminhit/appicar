package tf;

import be.g;
import fh.h;
import gf.v;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Metadata;
import we.p;
import xe.l0;
import xe.n0;
import xe.w;
import ye.g;
import zd.u2;
import zd.y;

@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010'\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0003(#\u001fB\u0011\u0012\b\b\u0002\u0010\u0019\u001a\u00020%¢\u0006\u0004\b&\u0010'J\u001a\u0010\u0006\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\t\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\u0007J\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ#\u0010\u0011\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u00002\b\u0010\b\u001a\u0004\u0018\u00018\u0001H\u0002¢\u0006\u0004\b\u0011\u0010\nJ\u001b\u0010\u0014\u001a\u00020\f2\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0019\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R&\u0010$\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"0\u001e8VX\u0004¢\u0006\u0006\u001a\u0004\b#\u0010 ¨\u0006)"}, d2 = {"Ltf/c;", "", "K", "V", "Lbe/g;", "key", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove", "Lzd/u2;", "clear", "()V", "o", "m", "n", "Ltf/l;", "w", "l", "(Ltf/l;)V", "Ljava/lang/ref/ReferenceQueue;", "O", "Ljava/lang/ref/ReferenceQueue;", "weakRefQueue", "", "e", "()I", "size", "", "c", "()Ljava/util/Set;", "keys", "", "b", "entries", "", "<init>", "(Z)V", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class c<K, V> extends g<K, V> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater P = AtomicIntegerFieldUpdater.newUpdater(c.class, "_size");
    @h
    public final ReferenceQueue<K> O;
    @fh.g
    private volatile /* synthetic */ int _size;
    @fh.g
    public volatile /* synthetic */ Object core;

    @Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001eB\u000f\u0012\u0006\u0010 \u001a\u00020\u0017¢\u0006\u0004\b#\u0010$J\u0017\u0010\u0003\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004J3\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\b\u0010\u0005\u001a\u0004\u0018\u00018\u00012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u00120\u0000R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u000e2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0006¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00020\u0014\"\u0004\b\u0002\u0010\u00112\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001f¨\u0006%"}, d2 = {"Ltf/c$a;", "", "key", "c", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "Ltf/l;", "weakKey0", "f", "(Ljava/lang/Object;Ljava/lang/Object;Ltf/l;)Ljava/lang/Object;", "Ltf/c;", "h", "()Ltf/c$a;", "weakRef", "Lzd/u2;", "b", "(Ltf/l;)V", "E", "Lkotlin/Function2;", "factory", "", "e", "(Lwe/p;)Ljava/util/Iterator;", "", "hash", "d", "(I)I", "index", "i", "(I)V", "a", "I", "allocated", "shift", "threshold", "<init>", "(Ltf/c;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public final class a {

        /* renamed from: g  reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f23178g = AtomicIntegerFieldUpdater.newUpdater(a.class, "load");

        /* renamed from: a  reason: collision with root package name */
        public final int f23179a;

        /* renamed from: b  reason: collision with root package name */
        public final int f23180b;

        /* renamed from: c  reason: collision with root package name */
        public final int f23181c;
        @fh.g

        /* renamed from: d  reason: collision with root package name */
        public /* synthetic */ AtomicReferenceArray f23182d;
        @fh.g

        /* renamed from: e  reason: collision with root package name */
        public /* synthetic */ AtomicReferenceArray f23183e;
        @fh.g
        private volatile /* synthetic */ int load = 0;

        @Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0004\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B!\u0012\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0005\u001a\u00028\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0002R&\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00028\u00008\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00028\u00018\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014¨\u0006\u001a"}, d2 = {"Ltf/c$a$a;", "E", "", "", "hasNext", "next", "()Ljava/lang/Object;", "", "b", "Lzd/u2;", "a", "Lkotlin/Function2;", "O", "Lwe/p;", "factory", "", "P", "I", "index", "Q", "Ljava/lang/Object;", "key", "R", "value", "<init>", "(Ltf/c$a;Lwe/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
        /* renamed from: tf.c$a$a  reason: collision with other inner class name */
        public final class C0425a<E> implements Iterator<E>, ye.d {
            @fh.g
            public final p<K, V, E> O;
            public int P = -1;
            public K Q;
            public V R;

            public C0425a(@fh.g p<? super K, ? super V, ? extends E> pVar) {
                this.O = pVar;
                a();
            }

            public final void a() {
                K k10;
                while (true) {
                    int i10 = this.P + 1;
                    this.P = i10;
                    if (i10 < a.this.f23179a) {
                        l lVar = (l) a.this.f23182d.get(this.P);
                        if (!(lVar == null || (k10 = lVar.get()) == null)) {
                            this.Q = k10;
                            V v10 = a.this.f23183e.get(this.P);
                            if (v10 instanceof m) {
                                v10 = ((m) v10).f23220a;
                            }
                            if (v10 != null) {
                                this.R = v10;
                                return;
                            }
                        }
                    } else {
                        return;
                    }
                }
            }

            @fh.g
            /* renamed from: b */
            public Void remove() {
                Void unused = d.e();
                throw new y();
            }

            public boolean hasNext() {
                return this.P < a.this.f23179a;
            }

            public E next() {
                if (this.P < a.this.f23179a) {
                    p<K, V, E> pVar = this.O;
                    K k10 = this.Q;
                    if (k10 == null) {
                        l0.S("key");
                        k10 = u2.f25116a;
                    }
                    V v10 = this.R;
                    if (v10 == null) {
                        l0.S("value");
                        v10 = u2.f25116a;
                    }
                    E g02 = pVar.g0(k10, v10);
                    a();
                    return g02;
                }
                throw new NoSuchElementException();
            }
        }

        public a(int i10) {
            this.f23179a = i10;
            this.f23180b = Integer.numberOfLeadingZeros(i10) + 1;
            this.f23181c = (i10 * 2) / 3;
            this.f23182d = new AtomicReferenceArray(i10);
            this.f23183e = new AtomicReferenceArray(i10);
        }

        public static /* synthetic */ Object g(a aVar, Object obj, Object obj2, l lVar, int i10, Object obj3) {
            if ((i10 & 4) != 0) {
                lVar = null;
            }
            return aVar.f(obj, obj2, lVar);
        }

        public final void b(@fh.g l<?> lVar) {
            int d10 = d(lVar.f23219a);
            while (true) {
                l<?> lVar2 = (l) this.f23182d.get(d10);
                if (lVar2 != null) {
                    if (lVar2 == lVar) {
                        i(d10);
                        return;
                    }
                    if (d10 == 0) {
                        d10 = this.f23179a;
                    }
                    d10--;
                } else {
                    return;
                }
            }
        }

        @h
        public final V c(@fh.g K k10) {
            int d10 = d(k10.hashCode());
            while (true) {
                l lVar = (l) this.f23182d.get(d10);
                if (lVar == null) {
                    return null;
                }
                Object obj = lVar.get();
                if (l0.g(k10, obj)) {
                    V v10 = this.f23183e.get(d10);
                    return v10 instanceof m ? ((m) v10).f23220a : v10;
                }
                if (obj == null) {
                    i(d10);
                }
                if (d10 == 0) {
                    d10 = this.f23179a;
                }
                d10--;
            }
        }

        public final int d(int i10) {
            return (i10 * -1640531527) >>> this.f23180b;
        }

        @fh.g
        public final <E> Iterator<E> e(@fh.g p<? super K, ? super V, ? extends E> pVar) {
            return new C0425a(pVar);
        }

        @h
        public final Object f(@fh.g K k10, @h V v10, @h l<K> lVar) {
            Object obj;
            int i10;
            int d10 = d(k10.hashCode());
            boolean z10 = false;
            while (true) {
                l lVar2 = (l) this.f23182d.get(d10);
                if (lVar2 == null) {
                    if (v10 != null) {
                        if (!z10) {
                            do {
                                i10 = this.load;
                                if (i10 >= this.f23181c) {
                                    return d.f23187c;
                                }
                            } while (!f23178g.compareAndSet(this, i10, i10 + 1));
                            z10 = true;
                        }
                        if (lVar == null) {
                            lVar = new l<>(k10, c.this.O);
                        }
                        if (b.a(this.f23182d, d10, (Object) null, lVar)) {
                            break;
                        }
                    } else {
                        return null;
                    }
                } else {
                    Object obj2 = lVar2.get();
                    if (!l0.g(k10, obj2)) {
                        if (obj2 == null) {
                            i(d10);
                        }
                        if (d10 == 0) {
                            d10 = this.f23179a;
                        }
                        d10--;
                    } else if (z10) {
                        f23178g.decrementAndGet(this);
                    }
                }
            }
            do {
                obj = this.f23183e.get(d10);
                if (obj instanceof m) {
                    return d.f23187c;
                }
            } while (!b.a(this.f23183e, d10, obj, v10));
            return obj;
        }

        @fh.g
        public final c<K, V>.a h() {
            Object obj;
            while (true) {
                c<K, V>.a aVar = new a(Integer.highestOneBit(v.u(c.this.size(), 4)) * 4);
                int i10 = 0;
                int i11 = this.f23179a;
                while (true) {
                    if (i10 >= i11) {
                        return aVar;
                    }
                    l lVar = (l) this.f23182d.get(i10);
                    Object obj2 = lVar != null ? lVar.get() : null;
                    if (lVar != null && obj2 == null) {
                        i(i10);
                    }
                    while (true) {
                        obj = this.f23183e.get(i10);
                        if (!(obj instanceof m)) {
                            if (b.a(this.f23183e, i10, obj, d.d(obj))) {
                                break;
                            }
                        } else {
                            obj = ((m) obj).f23220a;
                            break;
                        }
                    }
                    if (obj2 == null || obj == null || aVar.f(obj2, obj, lVar) != d.f23187c) {
                        i10++;
                    }
                }
            }
        }

        public final void i(int i10) {
            Object obj;
            do {
                obj = this.f23183e.get(i10);
                if (obj == null || (obj instanceof m)) {
                    return;
                }
            } while (!b.a(this.f23183e, i10, obj, (Object) null));
            c.this.m();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0002\b\u000e\b\u0002\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003B\u0017\u0012\u0006\u0010\u000b\u001a\u00028\u0002\u0012\u0006\u0010\u000e\u001a\u00028\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0005\u001a\u00028\u00032\u0006\u0010\u0004\u001a\u00028\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\u00028\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000e\u001a\u00028\u00038\u0016X\u0004¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\n¨\u0006\u0011"}, d2 = {"Ltf/c$b;", "K", "V", "", "newValue", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "O", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "key", "P", "getValue", "value", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class b<K, V> implements Map.Entry<K, V>, g.a {
        public final K O;
        public final V P;

        public b(K k10, V v10) {
            this.O = k10;
            this.P = v10;
        }

        public K getKey() {
            return this.O;
        }

        public V getValue() {
            return this.P;
        }

        public V setValue(V v10) {
            Void unused = d.e();
            throw new y();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0004\u0018\u0000*\u0004\b\u0002\u0010\u00012\b\u0012\u0004\u0012\u00028\u00020\u0002B!\u0012\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0007H\u0002R&\u0010\f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Ltf/c$c;", "E", "Lbe/h;", "element", "", "add", "(Ljava/lang/Object;)Z", "", "iterator", "Lkotlin/Function2;", "O", "Lwe/p;", "factory", "", "b", "()I", "size", "<init>", "(Ltf/c;Lwe/p;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* renamed from: tf.c$c  reason: collision with other inner class name */
    public final class C0426c<E> extends be.h<E> {
        @fh.g
        public final p<K, V, E> O;

        public C0426c(@fh.g p<? super K, ? super V, ? extends E> pVar) {
            this.O = pVar;
        }

        public boolean add(E e10) {
            Void unused = d.e();
            throw new y();
        }

        public int b() {
            return c.this.size();
        }

        @fh.g
        public Iterator<E> iterator() {
            return ((a) c.this.core).e(this.O);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010'\n\u0002\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "K", "V", "k", "v", "", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;"}, k = 3, mv = {1, 6, 0})
    public static final class d extends n0 implements p<K, V, Map.Entry<K, V>> {
        public static final d P = new d();

        public d() {
            super(2);
        }

        @fh.g
        /* renamed from: c */
        public final Map.Entry<K, V> g0(@fh.g K k10, @fh.g V v10) {
            return new b(k10, v10);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0006\u0010\u0005\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "K", "V", "k", "<anonymous parameter 1>", "g0", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0})
    public static final class e extends n0 implements p<K, V, K> {
        public static final e P = new e();

        public e() {
            super(2);
        }

        @fh.g
        public final K g0(@fh.g K k10, @fh.g V v10) {
            return k10;
        }
    }

    public c() {
        this(false, 1, (w) null);
    }

    public c(boolean z10) {
        this._size = 0;
        this.core = new a(16);
        this.O = z10 ? new ReferenceQueue<>() : null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(boolean z10, int i10, w wVar) {
        this((i10 & 1) != 0 ? false : z10);
    }

    @fh.g
    public Set<Map.Entry<K, V>> b() {
        return new C0426c(d.P);
    }

    @fh.g
    public Set<K> c() {
        return new C0426c(e.P);
    }

    public void clear() {
        for (Object remove : keySet()) {
            remove(remove);
        }
    }

    public int e() {
        return this._size;
    }

    @h
    public V get(@h Object obj) {
        if (obj == null) {
            return null;
        }
        return ((a) this.core).c(obj);
    }

    public final void l(l<?> lVar) {
        ((a) this.core).b(lVar);
    }

    public final void m() {
        P.decrementAndGet(this);
    }

    public final synchronized V n(K k10, V v10) {
        V g10;
        c<K, V>.a aVar = (a) this.core;
        while (true) {
            g10 = a.g(aVar, k10, v10, (l) null, 4, (Object) null);
            if (g10 == d.f23187c) {
                aVar = aVar.h();
                this.core = aVar;
            }
        }
        return g10;
    }

    public final void o() {
        if (this.O != null) {
            while (true) {
                try {
                    Reference<? extends K> remove = this.O.remove();
                    if (remove != null) {
                        l((l) remove);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.debug.internal.HashedWeakRef<*>");
                    }
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        } else {
            throw new IllegalStateException("Must be created with weakRefQueue = true".toString());
        }
    }

    @h
    public V put(@fh.g K k10, @fh.g V v10) {
        V g10 = a.g((a) this.core, k10, v10, (l) null, 4, (Object) null);
        if (g10 == d.f23187c) {
            g10 = n(k10, v10);
        }
        if (g10 == null) {
            P.incrementAndGet(this);
        }
        return g10;
    }

    @h
    public V remove(@h Object obj) {
        if (obj == null) {
            return null;
        }
        V g10 = a.g((a) this.core, obj, (Object) null, (l) null, 4, (Object) null);
        if (g10 == d.f23187c) {
            g10 = n(obj, (Object) null);
        }
        if (g10 != null) {
            P.decrementAndGet(this);
        }
        return g10;
    }
}
