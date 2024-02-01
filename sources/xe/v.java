package xe;

import fh.g;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import ve.h;

@h(name = "CollectionToArray")
public final class v {
    @g

    /* renamed from: a  reason: collision with root package name */
    public static final Object[] f24566a = new Object[0];

    /* renamed from: b  reason: collision with root package name */
    public static final int f24567b = 2147483645;

    @g
    @h(name = "toArray")
    public static final Object[] a(@g Collection<?> collection) {
        l0.p(collection, "collection");
        int size = collection.size();
        if (size != 0) {
            Iterator<?> it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArr = new Object[size];
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    objArr[i10] = it.next();
                    if (i11 >= objArr.length) {
                        if (!it.hasNext()) {
                            return objArr;
                        }
                        int i12 = ((i11 * 3) + 1) >>> 1;
                        if (i12 <= i11) {
                            if (i11 < 2147483645) {
                                i12 = 2147483645;
                            } else {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr = Arrays.copyOf(objArr, i12);
                        l0.o(objArr, "copyOf(result, newSize)");
                    } else if (!it.hasNext()) {
                        Object[] copyOf = Arrays.copyOf(objArr, i11);
                        l0.o(copyOf, "copyOf(result, size)");
                        return copyOf;
                    }
                    i10 = i11;
                }
            }
        }
        return f24566a;
    }

    @g
    @h(name = "toArray")
    public static final Object[] b(@g Collection<?> collection, @fh.h Object[] objArr) {
        Object[] objArr2;
        l0.p(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i10 = 0;
        if (size != 0) {
            Iterator<?> it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArr2 = objArr;
                } else {
                    Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    l0.n(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                    objArr2 = (Object[]) newInstance;
                }
                while (true) {
                    int i11 = i10 + 1;
                    objArr2[i10] = it.next();
                    if (i11 >= objArr2.length) {
                        if (!it.hasNext()) {
                            return objArr2;
                        }
                        int i12 = ((i11 * 3) + 1) >>> 1;
                        if (i12 <= i11) {
                            if (i11 < 2147483645) {
                                i12 = 2147483645;
                            } else {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i12);
                        l0.o(objArr2, "copyOf(result, newSize)");
                    } else if (!it.hasNext()) {
                        if (objArr2 == objArr) {
                            objArr[i11] = null;
                            return objArr;
                        }
                        Object[] copyOf = Arrays.copyOf(objArr2, i11);
                        l0.o(copyOf, "copyOf(result, size)");
                        return copyOf;
                    }
                    i10 = i11;
                }
            } else if (objArr.length <= 0) {
                return objArr;
            } else {
                objArr[0] = null;
                return objArr;
            }
        } else if (objArr.length <= 0) {
            return objArr;
        } else {
            objArr[0] = null;
            return objArr;
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [we.a<java.lang.Object[]>, we.a] */
    /* JADX WARNING: type inference failed for: r5v0, types: [we.p, we.p<? super java.lang.Object[], ? super java.lang.Integer, java.lang.Object[]>] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object[] c(java.util.Collection<?> r2, we.a<java.lang.Object[]> r3, we.l<? super java.lang.Integer, java.lang.Object[]> r4, we.p<? super java.lang.Object[], ? super java.lang.Integer, java.lang.Object[]> r5) {
        /*
            int r0 = r2.size()
            if (r0 != 0) goto L_0x000d
        L_0x0006:
            java.lang.Object r2 = r3.n()
        L_0x000a:
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            return r2
        L_0x000d:
            java.util.Iterator r2 = r2.iterator()
            boolean r1 = r2.hasNext()
            if (r1 != 0) goto L_0x0018
            goto L_0x0006
        L_0x0018:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.Object r3 = r4.A(r3)
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            r4 = 0
        L_0x0023:
            int r0 = r4 + 1
            java.lang.Object r1 = r2.next()
            r3[r4] = r1
            int r4 = r3.length
            if (r0 < r4) goto L_0x0054
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto L_0x0035
            return r3
        L_0x0035:
            int r4 = r0 * 3
            int r4 = r4 + 1
            int r4 = r4 >>> 1
            r1 = 2147483645(0x7ffffffd, float:NaN)
            if (r4 > r0) goto L_0x004a
            if (r0 >= r1) goto L_0x0044
            r4 = r1
            goto L_0x004a
        L_0x0044:
            java.lang.OutOfMemoryError r2 = new java.lang.OutOfMemoryError
            r2.<init>()
            throw r2
        L_0x004a:
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)
            java.lang.String r4 = "copyOf(result, newSize)"
            xe.l0.o(r3, r4)
            goto L_0x0063
        L_0x0054:
            boolean r4 = r2.hasNext()
            if (r4 != 0) goto L_0x0063
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Object r2 = r5.g0(r3, r2)
            goto L_0x000a
        L_0x0063:
            r4 = r0
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: xe.v.c(java.util.Collection, we.a, we.l, we.p):java.lang.Object[]");
    }
}
