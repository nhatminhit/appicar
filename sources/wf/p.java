package wf;

import kotlin.Metadata;
import zd.d1;
import zd.e1;

@Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0005\"\u001a\u0010\u0004\u001a\u00020\u00008\u0000X\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003¨\u0006\u0005"}, d2 = {"", "a", "Z", "()Z", "ANDROID_DETECTED", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f24114a;

    static {
        Object obj;
        try {
            d1.a aVar = d1.P;
            obj = d1.b(Class.forName("android.os.Build"));
        } catch (Throwable th2) {
            d1.a aVar2 = d1.P;
            obj = d1.b(e1.a(th2));
        }
        f24114a = d1.j(obj);
    }

    public static final boolean a() {
        return f24114a;
    }
}
