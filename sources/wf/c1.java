package wf;

import fh.g;
import fh.h;
import kotlin.Metadata;
import pf.s3;
import ve.e;
import xe.l0;

@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0017J\u001c\u0010\u0006\u001a\u00020\u00052\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\nR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\fR$\u0010\u0010\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lwf/c1;", "", "Lpf/s3;", "element", "value", "Lzd/u2;", "a", "Lie/g;", "context", "b", "Lie/g;", "", "[Ljava/lang/Object;", "values", "c", "[Lpf/s3;", "elements", "", "d", "I", "i", "n", "<init>", "(Lie/g;I)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public final class c1 {
    @g
    @e

    /* renamed from: a  reason: collision with root package name */
    public final ie.g f24084a;
    @g

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f24085b;
    @g

    /* renamed from: c  reason: collision with root package name */
    public final s3<Object>[] f24086c;

    /* renamed from: d  reason: collision with root package name */
    public int f24087d;

    public c1(@g ie.g gVar, int i10) {
        this.f24084a = gVar;
        this.f24085b = new Object[i10];
        this.f24086c = new s3[i10];
    }

    public final void a(@g s3<?> s3Var, @h Object obj) {
        Object[] objArr = this.f24085b;
        int i10 = this.f24087d;
        objArr[i10] = obj;
        s3<Object>[] s3VarArr = this.f24086c;
        this.f24087d = i10 + 1;
        s3VarArr[i10] = s3Var;
    }

    public final void b(@g ie.g gVar) {
        int length = this.f24086c.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                s3<Object> s3Var = this.f24086c[length];
                l0.m(s3Var);
                s3Var.Z0(gVar, this.f24085b[length]);
                if (i10 >= 0) {
                    length = i10;
                } else {
                    return;
                }
            }
        }
    }
}
