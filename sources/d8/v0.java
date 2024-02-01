package d8;

import android.util.Log;
import com.google.errorprone.annotations.CheckReturnValue;
import d.m0;
import javax.annotation.Nullable;

@CheckReturnValue
public class v0 {

    /* renamed from: e  reason: collision with root package name */
    public static final v0 f6657e = new v0(true, 3, 1, (String) null, (Throwable) null);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f6658a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final String f6659b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public final Throwable f6660c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6661d;

    public v0(boolean z10, int i10, int i11, @Nullable String str, @Nullable Throwable th2) {
        this.f6658a = z10;
        this.f6661d = i10;
        this.f6659b = str;
        this.f6660c = th2;
    }

    public /* synthetic */ v0(boolean z10, int i10, int i11, String str, Throwable th2, u0 u0Var) {
        this(false, 1, 5, (String) null, (Throwable) null);
    }

    @Deprecated
    public static v0 b() {
        return f6657e;
    }

    public static v0 c(@m0 String str) {
        return new v0(false, 1, 5, str, (Throwable) null);
    }

    public static v0 d(@m0 String str, @m0 Throwable th2) {
        return new v0(false, 1, 5, str, th2);
    }

    public static v0 f(int i10) {
        return new v0(true, i10, 1, (String) null, (Throwable) null);
    }

    public static v0 g(int i10, int i11, @m0 String str, @Nullable Throwable th2) {
        return new v0(false, i10, i11, str, th2);
    }

    @Nullable
    public String a() {
        return this.f6659b;
    }

    public final void e() {
        if (!this.f6658a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            Throwable th2 = this.f6660c;
            a();
        }
    }
}
