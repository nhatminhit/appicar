package be;

import fh.g;
import fh.h;
import gf.v;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import oe.f;
import xe.l0;
import xe.w;
import zd.h1;
import zd.r;
import zd.y2;

@h1(version = "1.4")
@y2(markerClass = {r.class})
public final class k<E> extends f<E> {
    @g
    public static final a R = new a((w) null);
    @g
    public static final Object[] S = new Object[0];
    public static final int T = 2147483639;
    public static final int U = 10;
    public int O;
    @g
    public Object[] P;
    public int Q;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }

        public final int a(int i10, int i11) {
            int i12 = i10 + (i10 >> 1);
            if (i12 - i11 < 0) {
                i12 = i11;
            }
            if (i12 - k.T <= 0) {
                return i12;
            }
            if (i11 > 2147483639) {
                return Integer.MAX_VALUE;
            }
            return k.T;
        }
    }

    public k() {
        this.P = S;
    }

    public k(int i10) {
        Object[] objArr;
        if (i10 == 0) {
            objArr = S;
        } else if (i10 > 0) {
            objArr = new Object[i10];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + i10);
        }
        this.P = objArr;
    }

    public k(@g Collection<? extends E> collection) {
        l0.p(collection, "elements");
        boolean z10 = false;
        Object[] array = collection.toArray(new Object[0]);
        this.P = array;
        this.Q = array.length;
        if (array.length == 0 ? true : z10) {
            this.P = S;
        }
    }

    public void add(int i10, E e10) {
        c.O.c(i10, size());
        if (i10 == size()) {
            addLast(e10);
        } else if (i10 == 0) {
            addFirst(e10);
        } else {
            l(size() + 1);
            int u10 = u(this.O + i10);
            if (i10 < ((size() + 1) >> 1)) {
                int h10 = h(u10);
                int h11 = h(this.O);
                int i11 = this.O;
                if (h10 >= i11) {
                    Object[] objArr = this.P;
                    objArr[h11] = objArr[i11];
                    o.c1(objArr, objArr, i11, i11 + 1, h10 + 1);
                } else {
                    Object[] objArr2 = this.P;
                    o.c1(objArr2, objArr2, i11 - 1, i11, objArr2.length);
                    Object[] objArr3 = this.P;
                    objArr3[objArr3.length - 1] = objArr3[0];
                    o.c1(objArr3, objArr3, 0, 1, h10 + 1);
                }
                this.P[h10] = e10;
                this.O = h11;
            } else {
                int u11 = u(this.O + size());
                Object[] objArr4 = this.P;
                if (u10 < u11) {
                    o.c1(objArr4, objArr4, u10 + 1, u10, u11);
                } else {
                    o.c1(objArr4, objArr4, 1, 0, u11);
                    Object[] objArr5 = this.P;
                    objArr5[0] = objArr5[objArr5.length - 1];
                    o.c1(objArr5, objArr5, u10 + 1, u10, objArr5.length - 1);
                }
                this.P[u10] = e10;
            }
            this.Q = size() + 1;
        }
    }

    public boolean add(E e10) {
        addLast(e10);
        return true;
    }

    public boolean addAll(int i10, @g Collection<? extends E> collection) {
        l0.p(collection, "elements");
        c.O.c(i10, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i10 == size()) {
            return addAll(collection);
        }
        l(size() + collection.size());
        int u10 = u(this.O + size());
        int u11 = u(this.O + i10);
        int size = collection.size();
        if (i10 < ((size() + 1) >> 1)) {
            int i11 = this.O;
            int i12 = i11 - size;
            if (u11 < i11) {
                Object[] objArr = this.P;
                o.c1(objArr, objArr, i12, i11, objArr.length);
                Object[] objArr2 = this.P;
                if (size >= u11) {
                    o.c1(objArr2, objArr2, objArr2.length - size, 0, u11);
                } else {
                    o.c1(objArr2, objArr2, objArr2.length - size, 0, size);
                    Object[] objArr3 = this.P;
                    o.c1(objArr3, objArr3, 0, size, u11);
                }
            } else if (i12 >= 0) {
                Object[] objArr4 = this.P;
                o.c1(objArr4, objArr4, i12, i11, u11);
            } else {
                Object[] objArr5 = this.P;
                i12 += objArr5.length;
                int i13 = u11 - i11;
                int length = objArr5.length - i12;
                if (length >= i13) {
                    o.c1(objArr5, objArr5, i12, i11, u11);
                } else {
                    o.c1(objArr5, objArr5, i12, i11, i11 + length);
                    Object[] objArr6 = this.P;
                    o.c1(objArr6, objArr6, 0, this.O + length, u11);
                }
            }
            this.O = i12;
            e(t(u11 - size), collection);
        } else {
            int i14 = u11 + size;
            if (u11 < u10) {
                int i15 = size + u10;
                Object[] objArr7 = this.P;
                if (i15 > objArr7.length) {
                    if (i14 >= objArr7.length) {
                        i14 -= objArr7.length;
                    } else {
                        int length2 = u10 - (i15 - objArr7.length);
                        o.c1(objArr7, objArr7, 0, length2, u10);
                        Object[] objArr8 = this.P;
                        o.c1(objArr8, objArr8, i14, u11, length2);
                    }
                }
                o.c1(objArr7, objArr7, i14, u11, u10);
            } else {
                Object[] objArr9 = this.P;
                o.c1(objArr9, objArr9, size, 0, u10);
                Object[] objArr10 = this.P;
                if (i14 >= objArr10.length) {
                    o.c1(objArr10, objArr10, i14 - objArr10.length, u11, objArr10.length);
                } else {
                    o.c1(objArr10, objArr10, 0, objArr10.length - size, objArr10.length);
                    Object[] objArr11 = this.P;
                    o.c1(objArr11, objArr11, i14, u11, objArr11.length - size);
                }
            }
            e(u11, collection);
        }
        return true;
    }

    public boolean addAll(@g Collection<? extends E> collection) {
        l0.p(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        l(size() + collection.size());
        e(u(this.O + size()), collection);
        return true;
    }

    public final void addFirst(E e10) {
        l(size() + 1);
        int h10 = h(this.O);
        this.O = h10;
        this.P[h10] = e10;
        this.Q = size() + 1;
    }

    public final void addLast(E e10) {
        l(size() + 1);
        this.P[u(this.O + size())] = e10;
        this.Q = size() + 1;
    }

    public int b() {
        return this.Q;
    }

    public E c(int i10) {
        c.O.b(i10, size());
        if (i10 == w.G(this)) {
            return removeLast();
        }
        if (i10 == 0) {
            return removeFirst();
        }
        int u10 = u(this.O + i10);
        E e10 = this.P[u10];
        if (i10 < (size() >> 1)) {
            int i11 = this.O;
            if (u10 >= i11) {
                Object[] objArr = this.P;
                o.c1(objArr, objArr, i11 + 1, i11, u10);
            } else {
                Object[] objArr2 = this.P;
                o.c1(objArr2, objArr2, 1, 0, u10);
                Object[] objArr3 = this.P;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i12 = this.O;
                o.c1(objArr3, objArr3, i12 + 1, i12, objArr3.length - 1);
            }
            Object[] objArr4 = this.P;
            int i13 = this.O;
            objArr4[i13] = null;
            this.O = o(i13);
        } else {
            int u11 = u(this.O + w.G(this));
            Object[] objArr5 = this.P;
            if (u10 <= u11) {
                o.c1(objArr5, objArr5, u10, u10 + 1, u11 + 1);
            } else {
                o.c1(objArr5, objArr5, u10, u10 + 1, objArr5.length);
                Object[] objArr6 = this.P;
                objArr6[objArr6.length - 1] = objArr6[0];
                o.c1(objArr6, objArr6, 0, 1, u11 + 1);
            }
            this.P[u11] = null;
        }
        this.Q = size() - 1;
        return e10;
    }

    public void clear() {
        int u10 = u(this.O + size());
        int i10 = this.O;
        if (i10 < u10) {
            o.n2(this.P, null, i10, u10);
        } else if (!isEmpty()) {
            Object[] objArr = this.P;
            o.n2(objArr, null, this.O, objArr.length);
            o.n2(this.P, null, 0, u10);
        }
        this.O = 0;
        this.Q = 0;
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void e(int i10, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.P.length;
        while (i10 < length && it.hasNext()) {
            this.P[i10] = it.next();
            i10++;
        }
        int i11 = this.O;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.P[i12] = it.next();
        }
        this.Q = size() + collection.size();
    }

    public final void f(int i10) {
        Object[] objArr = new Object[i10];
        Object[] objArr2 = this.P;
        o.c1(objArr2, objArr, 0, this.O, objArr2.length);
        Object[] objArr3 = this.P;
        int length = objArr3.length;
        int i11 = this.O;
        o.c1(objArr3, objArr, length - i11, 0, i11);
        this.O = 0;
        this.P = objArr;
    }

    public final E first() {
        if (!isEmpty()) {
            return this.P[this.O];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public E get(int i10) {
        c.O.b(i10, size());
        return this.P[u(this.O + i10)];
    }

    public final int h(int i10) {
        return i10 == 0 ? p.Xe(this.P) : i10 - 1;
    }

    public int indexOf(Object obj) {
        int u10 = u(this.O + size());
        int i10 = this.O;
        if (i10 < u10) {
            while (i10 < u10) {
                if (!l0.g(obj, this.P[i10])) {
                    i10++;
                }
            }
            return -1;
        } else if (i10 < u10) {
            return -1;
        } else {
            int length = this.P.length;
            while (true) {
                if (i10 >= length) {
                    int i11 = 0;
                    while (i11 < u10) {
                        if (l0.g(obj, this.P[i11])) {
                            i10 = i11 + this.P.length;
                        } else {
                            i11++;
                        }
                    }
                    return -1;
                } else if (l0.g(obj, this.P[i10])) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        return i10 - this.O;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public final void l(int i10) {
        if (i10 >= 0) {
            Object[] objArr = this.P;
            if (i10 > objArr.length) {
                if (objArr == S) {
                    this.P = new Object[v.u(i10, 10)];
                } else {
                    f(R.a(objArr.length, i10));
                }
            }
        } else {
            throw new IllegalStateException("Deque is too big.");
        }
    }

    public final E last() {
        if (!isEmpty()) {
            return this.P[u(this.O + w.G(this))];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public int lastIndexOf(Object obj) {
        int i10;
        int u10 = u(this.O + size());
        int i11 = this.O;
        if (i11 < u10) {
            i10 = u10 - 1;
            if (i11 <= i10) {
                while (!l0.g(obj, this.P[i10])) {
                    if (i10 != i11) {
                        i10--;
                    }
                }
            }
            return -1;
        }
        if (i11 > u10) {
            int i12 = u10 - 1;
            while (true) {
                if (-1 >= i12) {
                    int Xe = p.Xe(this.P);
                    int i13 = this.O;
                    if (i13 <= Xe) {
                        while (!l0.g(obj, this.P[i10])) {
                            if (i10 != i13) {
                                Xe = i10 - 1;
                            }
                        }
                    }
                } else if (l0.g(obj, this.P[i12])) {
                    i10 = i12 + this.P.length;
                    break;
                } else {
                    i12--;
                }
            }
        }
        return -1;
        return i10 - this.O;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m(we.l<? super E, java.lang.Boolean> r12) {
        /*
            r11 = this;
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x00a0
            java.lang.Object[] r0 = r11.P
            int r0 = r0.length
            r2 = 1
            if (r0 != 0) goto L_0x000f
            r0 = r2
            goto L_0x0010
        L_0x000f:
            r0 = r1
        L_0x0010:
            if (r0 == 0) goto L_0x0014
            goto L_0x00a0
        L_0x0014:
            int r0 = r11.O
            int r3 = r11.size()
            int r0 = r0 + r3
            int r0 = r11.u(r0)
            int r3 = r11.O
            r4 = 0
            if (r3 >= r0) goto L_0x0049
            r5 = r3
        L_0x0025:
            if (r3 >= r0) goto L_0x0043
            java.lang.Object[] r6 = r11.P
            r6 = r6[r3]
            java.lang.Object r7 = r12.A(r6)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x003f
            java.lang.Object[] r7 = r11.P
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L_0x0040
        L_0x003f:
            r1 = r2
        L_0x0040:
            int r3 = r3 + 1
            goto L_0x0025
        L_0x0043:
            java.lang.Object[] r12 = r11.P
            be.o.n2(r12, r4, r5, r0)
            goto L_0x0095
        L_0x0049:
            java.lang.Object[] r5 = r11.P
            int r5 = r5.length
            r7 = r1
            r6 = r3
        L_0x004e:
            if (r3 >= r5) goto L_0x006e
            java.lang.Object[] r8 = r11.P
            r9 = r8[r3]
            r8[r3] = r4
            java.lang.Object r8 = r12.A(r9)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x006a
            java.lang.Object[] r8 = r11.P
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L_0x006b
        L_0x006a:
            r7 = r2
        L_0x006b:
            int r3 = r3 + 1
            goto L_0x004e
        L_0x006e:
            int r3 = r11.u(r6)
            r5 = r3
        L_0x0073:
            if (r1 >= r0) goto L_0x0094
            java.lang.Object[] r3 = r11.P
            r6 = r3[r1]
            r3[r1] = r4
            java.lang.Object r3 = r12.A(r6)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x0090
            java.lang.Object[] r3 = r11.P
            r3[r5] = r6
            int r5 = r11.o(r5)
            goto L_0x0091
        L_0x0090:
            r7 = r2
        L_0x0091:
            int r1 = r1 + 1
            goto L_0x0073
        L_0x0094:
            r1 = r7
        L_0x0095:
            if (r1 == 0) goto L_0x00a0
            int r12 = r11.O
            int r5 = r5 - r12
            int r12 = r11.t(r5)
            r11.Q = r12
        L_0x00a0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: be.k.m(we.l):boolean");
    }

    @h
    public final E n() {
        if (isEmpty()) {
            return null;
        }
        return this.P[this.O];
    }

    public final int o(int i10) {
        if (i10 == p.Xe(this.P)) {
            return 0;
        }
        return i10 + 1;
    }

    @f
    public final E p(int i10) {
        return this.P[i10];
    }

    @f
    public final int q(int i10) {
        return u(this.O + i10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0016, code lost:
        r1 = r2.O;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void r(@fh.g we.p<? super java.lang.Integer, ? super java.lang.Object[], zd.u2> r3) {
        /*
            r2 = this;
            java.lang.String r0 = "structure"
            xe.l0.p(r3, r0)
            int r0 = r2.O
            int r1 = r2.size()
            int r0 = r0 + r1
            int r0 = r2.u(r0)
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x0020
            int r1 = r2.O
            if (r1 >= r0) goto L_0x001b
            goto L_0x0020
        L_0x001b:
            java.lang.Object[] r0 = r2.P
            int r0 = r0.length
            int r1 = r1 - r0
            goto L_0x0022
        L_0x0020:
            int r1 = r2.O
        L_0x0022:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = r2.toArray()
            r3.g0(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: be.k.r(we.p):void");
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean removeAll(@fh.g java.util.Collection<? extends java.lang.Object> r12) {
        /*
            r11 = this;
            java.lang.String r0 = "elements"
            xe.l0.p(r12, r0)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0096
            java.lang.Object[] r0 = r11.P
            int r0 = r0.length
            r2 = 1
            if (r0 != 0) goto L_0x0014
            r0 = r2
            goto L_0x0015
        L_0x0014:
            r0 = r1
        L_0x0015:
            if (r0 == 0) goto L_0x0019
            goto L_0x0096
        L_0x0019:
            int r0 = r11.O
            int r3 = r11.size()
            int r0 = r0 + r3
            int r0 = r11.u(r0)
            int r3 = r11.O
            r4 = 0
            if (r3 >= r0) goto L_0x0049
            r5 = r3
        L_0x002a:
            if (r3 >= r0) goto L_0x0043
            java.lang.Object[] r6 = r11.P
            r6 = r6[r3]
            boolean r7 = r12.contains(r6)
            r7 = r7 ^ r2
            if (r7 == 0) goto L_0x003f
            java.lang.Object[] r7 = r11.P
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L_0x0040
        L_0x003f:
            r1 = r2
        L_0x0040:
            int r3 = r3 + 1
            goto L_0x002a
        L_0x0043:
            java.lang.Object[] r12 = r11.P
            be.o.n2(r12, r4, r5, r0)
            goto L_0x008b
        L_0x0049:
            java.lang.Object[] r5 = r11.P
            int r5 = r5.length
            r7 = r1
            r6 = r3
        L_0x004e:
            if (r3 >= r5) goto L_0x0069
            java.lang.Object[] r8 = r11.P
            r9 = r8[r3]
            r8[r3] = r4
            boolean r8 = r12.contains(r9)
            r8 = r8 ^ r2
            if (r8 == 0) goto L_0x0065
            java.lang.Object[] r8 = r11.P
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L_0x0066
        L_0x0065:
            r7 = r2
        L_0x0066:
            int r3 = r3 + 1
            goto L_0x004e
        L_0x0069:
            int r3 = r11.u(r6)
            r5 = r3
        L_0x006e:
            if (r1 >= r0) goto L_0x008a
            java.lang.Object[] r3 = r11.P
            r6 = r3[r1]
            r3[r1] = r4
            boolean r3 = r12.contains(r6)
            r3 = r3 ^ r2
            if (r3 == 0) goto L_0x0086
            java.lang.Object[] r3 = r11.P
            r3[r5] = r6
            int r5 = r11.o(r5)
            goto L_0x0087
        L_0x0086:
            r7 = r2
        L_0x0087:
            int r1 = r1 + 1
            goto L_0x006e
        L_0x008a:
            r1 = r7
        L_0x008b:
            if (r1 == 0) goto L_0x0096
            int r12 = r11.O
            int r5 = r5 - r12
            int r12 = r11.t(r5)
            r11.Q = r12
        L_0x0096:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: be.k.removeAll(java.util.Collection):boolean");
    }

    public final E removeFirst() {
        if (!isEmpty()) {
            E[] eArr = this.P;
            int i10 = this.O;
            E e10 = eArr[i10];
            eArr[i10] = null;
            this.O = o(i10);
            this.Q = size() - 1;
            return e10;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final E removeLast() {
        if (!isEmpty()) {
            int u10 = u(this.O + w.G(this));
            E[] eArr = this.P;
            E e10 = eArr[u10];
            eArr[u10] = null;
            this.Q = size() - 1;
            return e10;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean retainAll(@fh.g java.util.Collection<? extends java.lang.Object> r12) {
        /*
            r11 = this;
            java.lang.String r0 = "elements"
            xe.l0.p(r12, r0)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0093
            java.lang.Object[] r0 = r11.P
            int r0 = r0.length
            r2 = 1
            if (r0 != 0) goto L_0x0014
            r0 = r2
            goto L_0x0015
        L_0x0014:
            r0 = r1
        L_0x0015:
            if (r0 == 0) goto L_0x0019
            goto L_0x0093
        L_0x0019:
            int r0 = r11.O
            int r3 = r11.size()
            int r0 = r0 + r3
            int r0 = r11.u(r0)
            int r3 = r11.O
            r4 = 0
            if (r3 >= r0) goto L_0x0048
            r5 = r3
        L_0x002a:
            if (r3 >= r0) goto L_0x0042
            java.lang.Object[] r6 = r11.P
            r6 = r6[r3]
            boolean r7 = r12.contains(r6)
            if (r7 == 0) goto L_0x003e
            java.lang.Object[] r7 = r11.P
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L_0x003f
        L_0x003e:
            r1 = r2
        L_0x003f:
            int r3 = r3 + 1
            goto L_0x002a
        L_0x0042:
            java.lang.Object[] r12 = r11.P
            be.o.n2(r12, r4, r5, r0)
            goto L_0x0088
        L_0x0048:
            java.lang.Object[] r5 = r11.P
            int r5 = r5.length
            r7 = r1
            r6 = r3
        L_0x004d:
            if (r3 >= r5) goto L_0x0067
            java.lang.Object[] r8 = r11.P
            r9 = r8[r3]
            r8[r3] = r4
            boolean r8 = r12.contains(r9)
            if (r8 == 0) goto L_0x0063
            java.lang.Object[] r8 = r11.P
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L_0x0064
        L_0x0063:
            r7 = r2
        L_0x0064:
            int r3 = r3 + 1
            goto L_0x004d
        L_0x0067:
            int r3 = r11.u(r6)
            r5 = r3
        L_0x006c:
            if (r1 >= r0) goto L_0x0087
            java.lang.Object[] r3 = r11.P
            r6 = r3[r1]
            r3[r1] = r4
            boolean r3 = r12.contains(r6)
            if (r3 == 0) goto L_0x0083
            java.lang.Object[] r3 = r11.P
            r3[r5] = r6
            int r5 = r11.o(r5)
            goto L_0x0084
        L_0x0083:
            r7 = r2
        L_0x0084:
            int r1 = r1 + 1
            goto L_0x006c
        L_0x0087:
            r1 = r7
        L_0x0088:
            if (r1 == 0) goto L_0x0093
            int r12 = r11.O
            int r5 = r5 - r12
            int r12 = r11.t(r5)
            r11.Q = r12
        L_0x0093:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: be.k.retainAll(java.util.Collection):boolean");
    }

    @h
    public final E s() {
        if (isEmpty()) {
            return null;
        }
        return this.P[u(this.O + w.G(this))];
    }

    public E set(int i10, E e10) {
        c.O.b(i10, size());
        int u10 = u(this.O + i10);
        E[] eArr = this.P;
        E e11 = eArr[u10];
        eArr[u10] = e10;
        return e11;
    }

    public final int t(int i10) {
        return i10 < 0 ? i10 + this.P.length : i10;
    }

    @g
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    @g
    public <T> T[] toArray(@g T[] tArr) {
        l0.p(tArr, "array");
        if (tArr.length < size()) {
            tArr = m.a(tArr, size());
        }
        int u10 = u(this.O + size());
        int i10 = this.O;
        if (i10 < u10) {
            o.l1(this.P, tArr, 0, i10, u10, 2, (Object) null);
        } else if (!isEmpty()) {
            Object[] objArr = this.P;
            o.c1(objArr, tArr, 0, this.O, objArr.length);
            Object[] objArr2 = this.P;
            o.c1(objArr2, tArr, objArr2.length - this.O, 0, u10);
        }
        if (tArr.length > size()) {
            tArr[size()] = null;
        }
        return tArr;
    }

    public final int u(int i10) {
        Object[] objArr = this.P;
        return i10 >= objArr.length ? i10 - objArr.length : i10;
    }

    @h
    public final E v() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    @h
    public final E w() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    @g
    public final Object[] x() {
        return toArray();
    }

    @g
    public final <T> T[] y(@g T[] tArr) {
        l0.p(tArr, "array");
        return toArray(tArr);
    }
}
