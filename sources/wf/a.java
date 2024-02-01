package wf;

import be.o;
import fh.g;
import fh.h;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\t\u001a\u00020\u0004J\b\u0010\n\u001a\u00020\u0004H\u0002R\u001e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\fR\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000fR\u0011\u0010\u0015\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lwf/a;", "", "T", "element", "Lzd/u2;", "a", "(Ljava/lang/Object;)V", "e", "()Ljava/lang/Object;", "b", "c", "", "[Ljava/lang/Object;", "elements", "", "I", "head", "tail", "", "d", "()Z", "isEmpty", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public class a<T> {
    @g

    /* renamed from: a  reason: collision with root package name */
    public Object[] f24052a = new Object[16];

    /* renamed from: b  reason: collision with root package name */
    public int f24053b;

    /* renamed from: c  reason: collision with root package name */
    public int f24054c;

    public final void a(@g T t10) {
        Object[] objArr = this.f24052a;
        int i10 = this.f24054c;
        objArr[i10] = t10;
        int length = (objArr.length - 1) & (i10 + 1);
        this.f24054c = length;
        if (length == this.f24053b) {
            c();
        }
    }

    public final void b() {
        this.f24053b = 0;
        this.f24054c = 0;
        this.f24052a = new Object[this.f24052a.length];
    }

    public final void c() {
        Object[] objArr = this.f24052a;
        int length = objArr.length;
        Object[] objArr2 = new Object[(length << 1)];
        Object[] objArr3 = objArr2;
        o.l1(objArr, objArr3, 0, this.f24053b, 0, 10, (Object) null);
        Object[] objArr4 = this.f24052a;
        int length2 = objArr4.length;
        int i10 = this.f24053b;
        o.l1(objArr4, objArr2, length2 - i10, 0, i10, 4, (Object) null);
        this.f24052a = objArr3;
        this.f24053b = 0;
        this.f24054c = length;
    }

    public final boolean d() {
        return this.f24053b == this.f24054c;
    }

    @h
    public final T e() {
        int i10 = this.f24053b;
        if (i10 == this.f24054c) {
            return null;
        }
        T[] tArr = this.f24052a;
        T t10 = tArr[i10];
        tArr[i10] = null;
        this.f24053b = (i10 + 1) & (tArr.length - 1);
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException("null cannot be cast to non-null type T of kotlinx.coroutines.internal.ArrayQueue");
    }
}
