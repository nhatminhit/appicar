package d8;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import com.google.android.gms.common.zzo;
import com.google.android.gms.common.zzq;
import com.google.android.gms.common.zzs;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.errorprone.annotations.CheckReturnValue;
import j8.h1;
import j8.i1;
import j8.s;
import java.security.MessageDigest;
import w8.a;
import w8.n;
import z8.f;

@CheckReturnValue
public final class o0 {

    /* renamed from: a  reason: collision with root package name */
    public static final m0 f6629a = new g0(k0.J("0\u0005È0\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010e\bsù/Qí"));

    /* renamed from: b  reason: collision with root package name */
    public static final m0 f6630b = new h0(k0.J("0\u0006\u00040\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²­×árÊkì"));

    /* renamed from: c  reason: collision with root package name */
    public static final m0 f6631c = new i0(k0.J("0\u0004C0\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000ÂàFdJ00"));

    /* renamed from: d  reason: collision with root package name */
    public static final m0 f6632d = new j0(k0.J("0\u0004¨0\u0003 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ¸l}ÓNõ0"));

    /* renamed from: e  reason: collision with root package name */
    public static volatile i1 f6633e;

    /* renamed from: f  reason: collision with root package name */
    public static final Object f6634f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public static Context f6635g;

    public static v0 a(String str, k0 k0Var, boolean z10, boolean z11) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return h(str, k0Var, z10, z11);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public static v0 b(String str, boolean z10, boolean z11, boolean z12) {
        return i(str, z10, false, false, true);
    }

    public static v0 c(String str, boolean z10, boolean z11, boolean z12) {
        return i(str, z10, false, false, false);
    }

    public static /* synthetic */ String d(boolean z10, String str, k0 k0Var) throws Exception {
        String str2 = true != (!z10 && h(str, k0Var, true, false).f6658a) ? "not allowed" : "debug cert rejected";
        MessageDigest b10 = a.b("SHA-256");
        s.l(b10);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", new Object[]{str2, str, n.a(b10.digest(k0Var.b0())), Boolean.valueOf(z10), "12451000.false"});
    }

    public static synchronized void e(Context context) {
        synchronized (o0.class) {
            if (f6635g != null) {
                return;
            }
            if (context != null) {
                f6635g = context.getApplicationContext();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public static boolean f() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            j();
            boolean y10 = f6633e.y();
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return y10;
        } catch (RemoteException | DynamiteModule.a unused) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return false;
        } catch (Throwable th2) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th2;
        }
    }

    /* JADX INFO: finally extract failed */
    public static boolean g() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            j();
            boolean t10 = f6633e.t();
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return t10;
        } catch (RemoteException | DynamiteModule.a unused) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return false;
        } catch (Throwable th2) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th2;
        }
    }

    public static v0 h(String str, k0 k0Var, boolean z10, boolean z11) {
        try {
            j();
            s.l(f6635g);
            try {
                return f6633e.M0(new zzs(str, k0Var, z10, z11), f.b0(f6635g.getPackageManager())) ? v0.b() : new t0(new f0(z10, str, k0Var), (s0) null);
            } catch (RemoteException e10) {
                return v0.d("module call", e10);
            }
        } catch (DynamiteModule.a e11) {
            return v0.d("module init: ".concat(String.valueOf(e11.getMessage())), e11);
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [z8.d, android.os.IBinder] */
    public static v0 i(String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        v0 v0Var;
        String concat;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            s.l(f6635g);
            try {
                j();
                zzo zzo = new zzo(str, z10, false, f.b0(f6635g), false);
                zzq O0 = z13 ? f6633e.O0(zzo) : f6633e.Z0(zzo);
                if (O0.Z0()) {
                    v0Var = v0.f(O0.f1());
                } else {
                    String X0 = O0.X0();
                    PackageManager.NameNotFoundException nameNotFoundException = O0.g1() == 4 ? new PackageManager.NameNotFoundException() : null;
                    if (X0 == null) {
                        X0 = "error checking package certificate";
                    }
                    v0Var = v0.g(O0.f1(), O0.g1(), X0, nameNotFoundException);
                }
            } catch (DynamiteModule.a e10) {
                e = e10;
                concat = "module init: ".concat(String.valueOf(e.getMessage()));
                v0Var = v0.d(concat, e);
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return v0Var;
            }
        } catch (RemoteException e11) {
            e = e11;
            concat = "module call";
            v0Var = v0.d(concat, e);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return v0Var;
        } catch (Throwable th2) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th2;
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
        return v0Var;
    }

    public static void j() throws DynamiteModule.a {
        if (f6633e == null) {
            s.l(f6635g);
            synchronized (f6634f) {
                if (f6633e == null) {
                    f6633e = h1.H(DynamiteModule.e(f6635g, DynamiteModule.f5815j, "com.google.android.gms.googlecertificates").d("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            }
        }
    }
}
