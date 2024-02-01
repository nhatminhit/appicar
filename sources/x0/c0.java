package x0;

import fh.g;
import kotlin.Metadata;
import we.a;
import xe.i0;
import xe.l0;
import zd.b1;
import zd.k;

@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0007\n\u0005\b20\u0001¨\u0006\u0007"}, d2 = {"T", "", "sectionName", "Lkotlin/Function0;", "block", "a", "(Ljava/lang/String;Lwe/a;)Ljava/lang/Object;", "core-ktx_release"}, k = 2, mv = {1, 5, 1})
public final class c0 {
    @k(message = "Use androidx.tracing.Trace instead", replaceWith = @b1(expression = "trace(sectionName)", imports = {"androidx.tracing.trace"}))
    public static final <T> T a(@g String str, @g a<? extends T> aVar) {
        l0.p(str, "sectionName");
        l0.p(aVar, "block");
        b0.b(str);
        try {
            return aVar.n();
        } finally {
            i0.d(1);
            b0.d();
            i0.c(1);
        }
    }
}
