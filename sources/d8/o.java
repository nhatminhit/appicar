package d8;

import com.google.errorprone.annotations.CheckReturnValue;
import d.m0;
import javax.annotation.Nullable;

@CheckReturnValue
public class o {

    /* renamed from: a  reason: collision with root package name */
    public final String f6625a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f6626b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public final String f6627c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public final Throwable f6628d;

    public o(String str, int i10, boolean z10, @Nullable String str2, @Nullable Throwable th2) {
        this.f6625a = str;
        this.f6626b = z10;
        this.f6627c = str2;
        this.f6628d = th2;
    }

    @m0
    public static o a(@m0 String str, @m0 String str2, @Nullable Throwable th2) {
        return new o(str, 1, false, str2, th2);
    }

    @m0
    public static o d(@m0 String str, int i10) {
        return new o(str, i10, true, (String) null, (Throwable) null);
    }

    public final void b() {
        if (!this.f6626b) {
            String concat = "PackageVerificationRslt: ".concat(String.valueOf(this.f6627c));
            Throwable th2 = this.f6628d;
            if (th2 != null) {
                throw new SecurityException(concat, th2);
            }
            throw new SecurityException(concat);
        }
    }

    public final boolean c() {
        return this.f6626b;
    }
}
