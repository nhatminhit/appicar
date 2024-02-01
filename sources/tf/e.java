package tf;

import fh.g;
import fh.h;
import java.util.List;
import kotlin.Metadata;
import zd.a1;

@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\r\u0010\u0016R\u0017\u0010\u001d\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010!\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001f\u001a\u0004\b\u0019\u0010 R\u0019\u0010\"\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\t\u001a\u0004\b\u0014\u0010\nR\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128G¢\u0006\f\n\u0004\b#\u0010\u0015\u001a\u0004\b#\u0010\u0016¨\u0006)"}, d2 = {"Ltf/e;", "", "Lie/g;", "a", "Lie/g;", "()Lie/g;", "context", "Lle/e;", "b", "Lle/e;", "()Lle/e;", "creationStackBottom", "", "c", "J", "f", "()J", "sequenceNumber", "", "Ljava/lang/StackTraceElement;", "d", "Ljava/util/List;", "()Ljava/util/List;", "creationStackTrace", "", "e", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "state", "Ljava/lang/Thread;", "Ljava/lang/Thread;", "()Ljava/lang/Thread;", "lastObservedThread", "lastObservedFrame", "h", "lastObservedStackTrace", "Ltf/f;", "source", "<init>", "(Ltf/f;Lie/g;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@a1
public final class e {
    @g

    /* renamed from: a  reason: collision with root package name */
    public final ie.g f23190a;
    @h

    /* renamed from: b  reason: collision with root package name */
    public final le.e f23191b;

    /* renamed from: c  reason: collision with root package name */
    public final long f23192c;
    @g

    /* renamed from: d  reason: collision with root package name */
    public final List<StackTraceElement> f23193d;
    @g

    /* renamed from: e  reason: collision with root package name */
    public final String f23194e;
    @h

    /* renamed from: f  reason: collision with root package name */
    public final Thread f23195f;
    @h

    /* renamed from: g  reason: collision with root package name */
    public final le.e f23196g;
    @g

    /* renamed from: h  reason: collision with root package name */
    public final List<StackTraceElement> f23197h;

    public e(@g f fVar, @g ie.g gVar) {
        this.f23190a = gVar;
        this.f23191b = fVar.d();
        this.f23192c = fVar.f23199b;
        this.f23193d = fVar.e();
        this.f23194e = fVar.g();
        this.f23195f = fVar.f23202e;
        this.f23196g = fVar.f();
        this.f23197h = fVar.h();
    }

    @g
    public final ie.g a() {
        return this.f23190a;
    }

    @h
    public final le.e b() {
        return this.f23191b;
    }

    @g
    public final List<StackTraceElement> c() {
        return this.f23193d;
    }

    @h
    public final le.e d() {
        return this.f23196g;
    }

    @h
    public final Thread e() {
        return this.f23195f;
    }

    public final long f() {
        return this.f23192c;
    }

    @g
    public final String g() {
        return this.f23194e;
    }

    @g
    @ve.h(name = "lastObservedStackTrace")
    public final List<StackTraceElement> h() {
        return this.f23197h;
    }
}
