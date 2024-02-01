package q0;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import d.m0;
import d.o0;
import d.t0;
import d.w0;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

@Deprecated
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final Context f11755a;

    /* renamed from: q0.a$a  reason: collision with other inner class name */
    public class C0199a extends FingerprintManager.AuthenticationCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f11756a;

        public C0199a(b bVar) {
            this.f11756a = bVar;
        }

        public void onAuthenticationError(int i10, CharSequence charSequence) {
            this.f11756a.a(i10, charSequence);
        }

        public void onAuthenticationFailed() {
            this.f11756a.b();
        }

        public void onAuthenticationHelp(int i10, CharSequence charSequence) {
            this.f11756a.c(i10, charSequence);
        }

        public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult authenticationResult) {
            this.f11756a.d(new c(a.f(authenticationResult.getCryptoObject())));
        }
    }

    public static abstract class b {
        public void a(int i10, CharSequence charSequence) {
        }

        public void b() {
        }

        public void c(int i10, CharSequence charSequence) {
        }

        public void d(c cVar) {
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final d f11757a;

        public c(d dVar) {
            this.f11757a = dVar;
        }

        public d a() {
            return this.f11757a;
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final Signature f11758a;

        /* renamed from: b  reason: collision with root package name */
        public final Cipher f11759b;

        /* renamed from: c  reason: collision with root package name */
        public final Mac f11760c;

        public d(@m0 Signature signature) {
            this.f11758a = signature;
            this.f11759b = null;
            this.f11760c = null;
        }

        public d(@m0 Cipher cipher) {
            this.f11759b = cipher;
            this.f11758a = null;
            this.f11760c = null;
        }

        public d(@m0 Mac mac) {
            this.f11760c = mac;
            this.f11759b = null;
            this.f11758a = null;
        }

        @o0
        public Cipher a() {
            return this.f11759b;
        }

        @o0
        public Mac b() {
            return this.f11760c;
        }

        @o0
        public Signature c() {
            return this.f11758a;
        }
    }

    public a(Context context) {
        this.f11755a = context;
    }

    @m0
    public static a b(@m0 Context context) {
        return new a(context);
    }

    @t0(23)
    @o0
    public static FingerprintManager c(@m0 Context context) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 != 23 && (i10 <= 23 || !context.getPackageManager().hasSystemFeature("android.hardware.fingerprint"))) {
            return null;
        }
        return (FingerprintManager) context.getSystemService(FingerprintManager.class);
    }

    @t0(23)
    public static d f(FingerprintManager.CryptoObject cryptoObject) {
        if (cryptoObject == null) {
            return null;
        }
        if (cryptoObject.getCipher() != null) {
            return new d(cryptoObject.getCipher());
        }
        if (cryptoObject.getSignature() != null) {
            return new d(cryptoObject.getSignature());
        }
        if (cryptoObject.getMac() != null) {
            return new d(cryptoObject.getMac());
        }
        return null;
    }

    @t0(23)
    public static FingerprintManager.AuthenticationCallback g(b bVar) {
        return new C0199a(bVar);
    }

    @t0(23)
    public static FingerprintManager.CryptoObject h(d dVar) {
        if (dVar == null) {
            return null;
        }
        if (dVar.a() != null) {
            return new FingerprintManager.CryptoObject(dVar.a());
        }
        if (dVar.c() != null) {
            return new FingerprintManager.CryptoObject(dVar.c());
        }
        if (dVar.b() != null) {
            return new FingerprintManager.CryptoObject(dVar.b());
        }
        return null;
    }

    @w0("android.permission.USE_FINGERPRINT")
    public void a(@o0 d dVar, int i10, @o0 x0.c cVar, @m0 b bVar, @o0 Handler handler) {
        FingerprintManager c10 = c(this.f11755a);
        if (c10 != null) {
            c10.authenticate(h(dVar), cVar != null ? (CancellationSignal) cVar.b() : null, i10, g(bVar), handler);
        }
    }

    @w0("android.permission.USE_FINGERPRINT")
    public boolean d() {
        FingerprintManager c10 = c(this.f11755a);
        return c10 != null && c10.hasEnrolledFingerprints();
    }

    @w0("android.permission.USE_FINGERPRINT")
    public boolean e() {
        FingerprintManager c10 = c(this.f11755a);
        return c10 != null && c10.isHardwareDetected();
    }
}
