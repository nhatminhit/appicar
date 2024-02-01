package sf;

import android.annotation.SuppressLint;
import fh.g;
import fh.h;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;
import kotlin.Metadata;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import sun.misc.Signal;
import ve.m;
import xe.l0;
import zd.d1;
import zd.e1;

@SuppressLint({"all"})
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\b\u001a\u00020\u0006H\u0002R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\u000f"}, d2 = {"Lsf/b;", "", "", "args", "Ljava/lang/instrument/Instrumentation;", "instrumentation", "Lzd/u2;", "d", "b", "", "Z", "enableCreationStackTraces", "<init>", "()V", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
@IgnoreJRERequirement
public final class b {
    @g

    /* renamed from: a  reason: collision with root package name */
    public static final b f23000a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f23001b;

    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ:\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u000f"}, d2 = {"Lsf/b$a;", "Ljava/lang/instrument/ClassFileTransformer;", "Ljava/lang/ClassLoader;", "loader", "", "className", "Ljava/lang/Class;", "classBeingRedefined", "Ljava/security/ProtectionDomain;", "protectionDomain", "", "classfileBuffer", "a", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    public static final class a implements ClassFileTransformer {
        @g

        /* renamed from: a  reason: collision with root package name */
        public static final a f23002a = new a();

        @h
        public byte[] a(@g ClassLoader classLoader, @g String str, @h Class<?> cls, @g ProtectionDomain protectionDomain, @h byte[] bArr) {
            if (!l0.g(str, "kotlin/coroutines/jvm/internal/DebugProbesKt")) {
                return null;
            }
            tf.a.f23176a.b(true);
            return re.b.p(classLoader.getResourceAsStream("DebugProbesKt.bin"));
        }
    }

    static {
        Object obj;
        Boolean bool = null;
        try {
            d1.a aVar = d1.P;
            String property = System.getProperty("kotlinx.coroutines.debug.enable.creation.stack.trace");
            obj = d1.b(property != null ? Boolean.valueOf(Boolean.parseBoolean(property)) : null);
        } catch (Throwable th2) {
            d1.a aVar2 = d1.P;
            obj = d1.b(e1.a(th2));
        }
        if (!d1.i(obj)) {
            bool = obj;
        }
        Boolean bool2 = bool;
        f23001b = bool2 != null ? bool2.booleanValue() : tf.h.f23207a.u();
    }

    public static final void c(Signal signal) {
        tf.h hVar = tf.h.f23207a;
        if (hVar.z()) {
            hVar.f(System.out);
        } else {
            System.out.println("Cannot perform coroutines dump, debug probes are disabled");
        }
    }

    @m
    public static final void d(@h String str, @g Instrumentation instrumentation) {
        tf.a.f23176a.b(true);
        instrumentation.addTransformer(a.f23002a);
        tf.h hVar = tf.h.f23207a;
        hVar.K(f23001b);
        hVar.x();
        f23000a.b();
    }

    public final void b() {
        try {
            Signal.handle(new Signal("TRAP"), new a());
        } catch (Throwable unused) {
        }
    }
}
