package wf;

import fh.g;
import fh.h;
import ie.d;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.Metadata;
import le.e;
import lf.b0;
import pf.i2;
import pf.m0;
import xe.l0;
import zd.d1;
import zd.e1;
import zd.r1;
import zd.u0;

@Metadata(bv = {}, d1 = {"\u0000`\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\u001a!\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\u0005\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0004\u001a.\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\b¢\u0006\u0004\b\b\u0010\t\u001a-\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\n\u0010\u0007\u001a\u00060\nj\u0002`\u000bH\u0002¢\u0006\u0004\b\f\u0010\r\u001a#\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u0004\u001a;\u0010\u0015\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00028\u00002\u0010\u0010\u0014\u001a\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a3\u0010\u0019\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u00180\u0017\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u0000H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a3\u0010\u001d\u001a\u00020\u001c2\u0010\u0010\u001b\u001a\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u00182\u0010\u0010\u0010\u001a\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u0011H\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001b\u0010 \u001a\u00020\u001f2\u0006\u0010\u0002\u001a\u00020\u0000HHø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a\"\u0010\"\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\b¢\u0006\u0004\b\"\u0010\u0004\u001a!\u0010#\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0000¢\u0006\u0004\b#\u0010\u0004\u001a\u001e\u0010$\u001a\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u00112\n\u0010\u0007\u001a\u00060\nj\u0002`\u000bH\u0002\u001a\u0014\u0010'\u001a\u00060\u0012j\u0002`\u00132\u0006\u0010&\u001a\u00020%H\u0007\u001a\u0010\u0010)\u001a\u00020(*\u00060\u0012j\u0002`\u0013H\u0000\u001a%\u0010,\u001a\u00020+*\f\u0012\b\u0012\u00060\u0012j\u0002`\u00130\u00182\u0006\u0010*\u001a\u00020%H\u0002¢\u0006\u0004\b,\u0010-\u001a\u001c\u0010.\u001a\u00020(*\u00060\u0012j\u0002`\u00132\n\u0010\u0019\u001a\u00060\u0012j\u0002`\u0013H\u0002\u001a\u0014\u0010/\u001a\u00020\u001c*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0000H\u0000\"\u0014\u00102\u001a\u00020%8\u0002XT¢\u0006\u0006\n\u0004\b0\u00101\"\u0014\u00104\u001a\u00020%8\u0002XT¢\u0006\u0006\n\u0004\b3\u00101\"\u001c\u00107\u001a\n 5*\u0004\u0018\u00010%0%8\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00101\"\u001c\u00108\u001a\n 5*\u0004\u0018\u00010%0%8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u00101*\f\b\u0000\u00109\"\u00020\n2\u00020\n*\f\b\u0000\u0010:\"\u00020\u00122\u00020\u0012\u0002\u0004\n\u0002\b\u0019¨\u0006;"}, d2 = {"", "E", "exception", "p", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "r", "Lie/d;", "continuation", "q", "(Ljava/lang/Throwable;Lie/d;)Ljava/lang/Throwable;", "Lle/e;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "o", "(Ljava/lang/Throwable;Lle/e;)Ljava/lang/Throwable;", "s", "cause", "result", "Ljava/util/ArrayDeque;", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "resultStackTrace", "f", "(Ljava/lang/Throwable;Ljava/lang/Throwable;Ljava/util/ArrayDeque;)Ljava/lang/Throwable;", "Lzd/u0;", "", "e", "(Ljava/lang/Throwable;)Lzd/u0;", "recoveredStacktrace", "Lzd/u2;", "l", "([Ljava/lang/StackTraceElement;Ljava/util/ArrayDeque;)V", "", "m", "(Ljava/lang/Throwable;Lie/d;)Ljava/lang/Object;", "t", "u", "g", "", "message", "d", "", "k", "methodName", "", "i", "([Ljava/lang/StackTraceElement;Ljava/lang/String;)I", "h", "j", "a", "Ljava/lang/String;", "baseContinuationImplClass", "b", "stackTraceRecoveryClass", "kotlin.jvm.PlatformType", "c", "baseContinuationImplClassName", "stackTraceRecoveryClassName", "CoroutineStackFrame", "StackTraceElement", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class q0 {
    @g

    /* renamed from: a  reason: collision with root package name */
    public static final String f24117a = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
    @g

    /* renamed from: b  reason: collision with root package name */
    public static final String f24118b = "kotlinx.coroutines.internal.StackTraceRecoveryKt";

    /* renamed from: c  reason: collision with root package name */
    public static final String f24119c;

    /* renamed from: d  reason: collision with root package name */
    public static final String f24120d;

    static {
        Object obj;
        Object obj2;
        try {
            d1.a aVar = d1.P;
            obj = d1.b(Class.forName("le.a").getCanonicalName());
        } catch (Throwable th2) {
            d1.a aVar2 = d1.P;
            obj = d1.b(e1.a(th2));
        }
        if (d1.e(obj) != null) {
            obj = f24117a;
        }
        f24119c = (String) obj;
        try {
            d1.a aVar3 = d1.P;
            obj2 = d1.b(q0.class.getCanonicalName());
        } catch (Throwable th3) {
            d1.a aVar4 = d1.P;
            obj2 = d1.b(e1.a(th3));
        }
        if (d1.e(obj2) != null) {
            obj2 = f24118b;
        }
        f24120d = (String) obj2;
    }

    public static /* synthetic */ void a() {
    }

    public static /* synthetic */ void b() {
    }

    @g
    @i2
    public static final StackTraceElement d(@g String str) {
        return new StackTraceElement("\b\b\b(" + str, "\b", "\b", -1);
    }

    public static final <E extends Throwable> u0<E, StackTraceElement[]> e(E e10) {
        boolean z10;
        Throwable cause = e10.getCause();
        if (cause == null || !l0.g(cause.getClass(), e10.getClass())) {
            return r1.a(e10, new StackTraceElement[0]);
        }
        StackTraceElement[] stackTrace = e10.getStackTrace();
        int length = stackTrace.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                z10 = false;
                break;
            } else if (k(stackTrace[i10])) {
                z10 = true;
                break;
            } else {
                i10++;
            }
        }
        return z10 ? r1.a(cause, stackTrace) : r1.a(e10, new StackTraceElement[0]);
    }

    public static final <E extends Throwable> E f(E e10, E e11, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(d("Coroutine boundary"));
        StackTraceElement[] stackTrace = e10.getStackTrace();
        int i10 = i(stackTrace, f24119c);
        int i11 = 0;
        if (i10 == -1) {
            Object[] array = arrayDeque.toArray(new StackTraceElement[0]);
            if (array != null) {
                e11.setStackTrace((StackTraceElement[]) array);
                return e11;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[(arrayDeque.size() + i10)];
        for (int i12 = 0; i12 < i10; i12++) {
            stackTraceElementArr[i12] = stackTrace[i12];
        }
        Iterator<StackTraceElement> it = arrayDeque.iterator();
        while (it.hasNext()) {
            stackTraceElementArr[i11 + i10] = it.next();
            i11++;
        }
        e11.setStackTrace(stackTraceElementArr);
        return e11;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0015  */
    public static final java.util.ArrayDeque<java.lang.StackTraceElement> g(le.e r2) {
        /*
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            java.lang.StackTraceElement r1 = r2.R()
            if (r1 == 0) goto L_0x000e
        L_0x000b:
            r0.add(r1)
        L_0x000e:
            le.e r2 = r2.u()
            if (r2 != 0) goto L_0x0015
            return r0
        L_0x0015:
            java.lang.StackTraceElement r1 = r2.R()
            if (r1 == 0) goto L_0x000e
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: wf.q0.g(le.e):java.util.ArrayDeque");
    }

    public static final boolean h(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        return stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && l0.g(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && l0.g(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) && l0.g(stackTraceElement.getClassName(), stackTraceElement2.getClassName());
    }

    public static final int i(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (l0.g(str, stackTraceElementArr[i10].getClassName())) {
                return i10;
            }
        }
        return -1;
    }

    public static final void j(@g Throwable th2, @g Throwable th3) {
        th2.initCause(th3);
    }

    public static final boolean k(@g StackTraceElement stackTraceElement) {
        return b0.v2(stackTraceElement.getClassName(), "\b\b\b", false, 2, (Object) null);
    }

    public static final void l(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            } else if (k(stackTraceElementArr[i10])) {
                break;
            } else {
                i10++;
            }
        }
        int i11 = i10 + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (i11 <= length2) {
            while (true) {
                if (h(stackTraceElementArr[length2], arrayDeque.getLast())) {
                    arrayDeque.removeLast();
                }
                arrayDeque.addFirst(stackTraceElementArr[length2]);
                if (length2 != i11) {
                    length2--;
                } else {
                    return;
                }
            }
        }
    }

    @h
    public static final Object m(@g Throwable th2, @g d<?> dVar) {
        throw th2;
    }

    public static final Object n(Throwable th2, d<?> dVar) {
        throw th2;
    }

    public static final <E extends Throwable> E o(E e10, e eVar) {
        u0 e11 = e(e10);
        E e12 = (Throwable) e11.a();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) e11.b();
        Throwable s10 = s(e12);
        if (s10 == null) {
            return e10;
        }
        ArrayDeque g10 = g(eVar);
        if (g10.isEmpty()) {
            return e10;
        }
        if (e12 != e10) {
            l(stackTraceElementArr, g10);
        }
        return f(e12, s10, g10);
    }

    @g
    public static final <E extends Throwable> E p(@g E e10) {
        return e10;
    }

    @g
    public static final <E extends Throwable> E q(@g E e10, @g d<?> dVar) {
        return e10;
    }

    public static final <E extends Throwable> E r(E e10) {
        StackTraceElement[] stackTrace = e10.getStackTrace();
        int length = stackTrace.length;
        int i10 = i(stackTrace, f24120d);
        int i11 = i10 + 1;
        int i12 = i(stackTrace, f24119c);
        int i13 = 0;
        int i14 = (length - i10) - (i12 == -1 ? 0 : length - i12);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i14];
        while (i13 < i14) {
            stackTraceElementArr[i13] = i13 == 0 ? d("Coroutine boundary") : stackTrace[(i11 + i13) - 1];
            i13++;
        }
        e10.setStackTrace(stackTraceElementArr);
        return e10;
    }

    public static final <E extends Throwable> E s(E e10) {
        E h10 = n.h(e10);
        if (h10 == null) {
            return null;
        }
        if ((e10 instanceof m0) || l0.g(h10.getMessage(), e10.getMessage())) {
            return h10;
        }
        return null;
    }

    @g
    public static final <E extends Throwable> E t(@g E e10) {
        return e10;
    }

    @g
    public static final <E extends Throwable> E u(@g E e10) {
        E cause = e10.getCause();
        if (cause != null && l0.g(cause.getClass(), e10.getClass())) {
            StackTraceElement[] stackTrace = e10.getStackTrace();
            int length = stackTrace.length;
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                } else if (k(stackTrace[i10])) {
                    z10 = true;
                    break;
                } else {
                    i10++;
                }
            }
            if (z10) {
                return cause;
            }
        }
        return e10;
    }
}
