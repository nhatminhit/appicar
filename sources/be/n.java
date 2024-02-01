package be;

import ee.c;
import fh.g;
import gf.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import oe.f;
import ve.h;
import xe.l0;
import zd.a1;
import zd.b2;
import zd.f2;
import zd.h1;
import zd.k2;
import zd.q2;
import zd.r1;
import zd.u0;

public class n extends m {
    @h1(version = "1.3")
    @a1
    @h(name = "contentDeepEquals")
    public static final <T> boolean g(@fh.h T[] tArr, @fh.h T[] tArr2) {
        if (tArr == tArr2) {
            return true;
        }
        if (tArr == null || tArr2 == null || tArr.length != tArr2.length) {
            return false;
        }
        int length = tArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            T t10 = tArr[i10];
            T t11 = tArr2[i10];
            if (t10 != t11) {
                if (t10 == null || t11 == null) {
                    return false;
                }
                if (!(t10 instanceof Object[]) || !(t11 instanceof Object[])) {
                    if (!(t10 instanceof byte[]) || !(t11 instanceof byte[])) {
                        if (!(t10 instanceof short[]) || !(t11 instanceof short[])) {
                            if (!(t10 instanceof int[]) || !(t11 instanceof int[])) {
                                if (!(t10 instanceof long[]) || !(t11 instanceof long[])) {
                                    if (!(t10 instanceof float[]) || !(t11 instanceof float[])) {
                                        if (!(t10 instanceof double[]) || !(t11 instanceof double[])) {
                                            if (!(t10 instanceof char[]) || !(t11 instanceof char[])) {
                                                if (!(t10 instanceof boolean[]) || !(t11 instanceof boolean[])) {
                                                    if (!(t10 instanceof b2) || !(t11 instanceof b2)) {
                                                        if (!(t10 instanceof q2) || !(t11 instanceof q2)) {
                                                            if (!(t10 instanceof f2) || !(t11 instanceof f2)) {
                                                                if (!(t10 instanceof k2) || !(t11 instanceof k2)) {
                                                                    if (!l0.g(t10, t11)) {
                                                                        return false;
                                                                    }
                                                                } else if (!c.X0(((k2) t10).y(), ((k2) t11).y())) {
                                                                    return false;
                                                                }
                                                            } else if (!c.T0(((f2) t10).y(), ((f2) t11).y())) {
                                                                return false;
                                                            }
                                                        } else if (!c.S0(((q2) t10).y(), ((q2) t11).y())) {
                                                            return false;
                                                        }
                                                    } else if (!c.V0(((b2) t10).y(), ((b2) t11).y())) {
                                                        return false;
                                                    }
                                                } else if (!Arrays.equals((boolean[]) t10, (boolean[]) t11)) {
                                                    return false;
                                                }
                                            } else if (!Arrays.equals((char[]) t10, (char[]) t11)) {
                                                return false;
                                            }
                                        } else if (!Arrays.equals((double[]) t10, (double[]) t11)) {
                                            return false;
                                        }
                                    } else if (!Arrays.equals((float[]) t10, (float[]) t11)) {
                                        return false;
                                    }
                                } else if (!Arrays.equals((long[]) t10, (long[]) t11)) {
                                    return false;
                                }
                            } else if (!Arrays.equals((int[]) t10, (int[]) t11)) {
                                return false;
                            }
                        } else if (!Arrays.equals((short[]) t10, (short[]) t11)) {
                            return false;
                        }
                    } else if (!Arrays.equals((byte[]) t10, (byte[]) t11)) {
                        return false;
                    }
                } else if (!g((Object[]) t10, (Object[]) t11)) {
                    return false;
                }
            }
        }
        return true;
    }

    @h1(version = "1.3")
    @a1
    @g
    @h(name = "contentDeepToString")
    public static final <T> String h(@fh.h T[] tArr) {
        if (tArr == null) {
            return "null";
        }
        StringBuilder sb2 = new StringBuilder((v.B(tArr.length, 429496729) * 5) + 2);
        i(tArr, sb2, new ArrayList());
        String sb3 = sb2.toString();
        l0.o(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }

    public static final <T> void i(T[] tArr, StringBuilder sb2, List<Object[]> list) {
        String j12;
        if (list.contains(tArr)) {
            sb2.append("[...]");
            return;
        }
        list.add(tArr);
        sb2.append('[');
        int length = tArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (i10 != 0) {
                sb2.append(", ");
            }
            T t10 = tArr[i10];
            if (t10 == null) {
                j12 = "null";
            } else if (t10 instanceof Object[]) {
                i((Object[]) t10, sb2, list);
            } else {
                if (t10 instanceof byte[]) {
                    j12 = Arrays.toString((byte[]) t10);
                } else if (t10 instanceof short[]) {
                    j12 = Arrays.toString((short[]) t10);
                } else if (t10 instanceof int[]) {
                    j12 = Arrays.toString((int[]) t10);
                } else if (t10 instanceof long[]) {
                    j12 = Arrays.toString((long[]) t10);
                } else if (t10 instanceof float[]) {
                    j12 = Arrays.toString((float[]) t10);
                } else if (t10 instanceof double[]) {
                    j12 = Arrays.toString((double[]) t10);
                } else if (t10 instanceof char[]) {
                    j12 = Arrays.toString((char[]) t10);
                } else if (t10 instanceof boolean[]) {
                    j12 = Arrays.toString((boolean[]) t10);
                } else {
                    j12 = t10 instanceof b2 ? c.j1(((b2) t10).y()) : t10 instanceof q2 ? c.n1(((q2) t10).y()) : t10 instanceof f2 ? c.m1(((f2) t10).y()) : t10 instanceof k2 ? c.p1(((k2) t10).y()) : t10.toString();
                }
                l0.o(j12, "toString(this)");
            }
            sb2.append(j12);
        }
        sb2.append(']');
        list.remove(w.G(list));
    }

    @g
    public static final <T> List<T> j(@g T[][] tArr) {
        l0.p(tArr, "<this>");
        int i10 = 0;
        for (T[] length : tArr) {
            i10 += length.length;
        }
        ArrayList arrayList = new ArrayList(i10);
        for (T[] p02 : tArr) {
            b0.p0(arrayList, p02);
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [R, C] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @zd.h1(version = "1.3")
    @oe.f
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <C extends java.lang.Object & R, R> R k(C r1, we.a<? extends R> r2) {
        /*
            java.lang.String r0 = "defaultValue"
            xe.l0.p(r2, r0)
            int r0 = r1.length
            if (r0 != 0) goto L_0x000a
            r0 = 1
            goto L_0x000b
        L_0x000a:
            r0 = 0
        L_0x000b:
            if (r0 == 0) goto L_0x0011
            java.lang.Object r1 = r2.n()
        L_0x0011:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: be.n.k(java.lang.Object[], we.a):java.lang.Object");
    }

    @h1(version = "1.3")
    @f
    public static final boolean l(Object[] objArr) {
        if (objArr != null) {
            if (!(objArr.length == 0)) {
                return false;
            }
        }
        return true;
    }

    @g
    public static final <T, R> u0<List<T>, List<R>> m(@g u0<? extends T, ? extends R>[] u0VarArr) {
        l0.p(u0VarArr, "<this>");
        ArrayList arrayList = new ArrayList(u0VarArr.length);
        ArrayList arrayList2 = new ArrayList(u0VarArr.length);
        for (u0<? extends T, ? extends R> u0Var : u0VarArr) {
            arrayList.add(u0Var.e());
            arrayList2.add(u0Var.f());
        }
        return r1.a(arrayList, arrayList2);
    }
}
