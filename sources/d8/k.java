package d8;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.google.errorprone.annotations.CheckReturnValue;
import com.google.errorprone.annotations.RestrictedInheritance;
import d.m0;
import e8.a;
import j8.s;
import j8.w;
import java.util.Set;
import javax.annotation.Nullable;

@RestrictedInheritance(allowedOnPath = ".*java.*/com/google/android/gms/common/testing/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
@a
@CheckReturnValue
@w
public class k {
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public static k f6618c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public static volatile Set f6619d;

    /* renamed from: a  reason: collision with root package name */
    public final Context f6620a;

    /* renamed from: b  reason: collision with root package name */
    public volatile String f6621b;

    public k(@m0 Context context) {
        this.f6620a = context.getApplicationContext();
    }

    @a
    @m0
    public static k a(@m0 Context context) {
        s.l(context);
        synchronized (k.class) {
            if (f6618c == null) {
                o0.e(context);
                f6618c = new k(context);
            }
        }
        return f6618c;
    }

    @Nullable
    public static final k0 e(PackageInfo packageInfo, k0... k0VarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length != 1) {
            return null;
        }
        l0 l0Var = new l0(packageInfo.signatures[0].toByteArray());
        for (int i10 = 0; i10 < k0VarArr.length; i10++) {
            if (k0VarArr[i10].equals(l0Var)) {
                return k0VarArr[i10];
            }
        }
        return null;
    }

    public static final boolean f(@m0 PackageInfo packageInfo, boolean z10) {
        if (z10 && packageInfo != null && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            z10 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
        }
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if ((z10 ? e(packageInfo, n0.f6624a) : e(packageInfo, n0.f6624a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    @a
    public boolean b(@m0 PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (f(packageInfo, false)) {
            return true;
        }
        return f(packageInfo, true) && j.k(this.f6620a);
    }

    @a
    @w
    public boolean c(@m0 String str) {
        v0 g10 = g(str, false, false);
        g10.e();
        return g10.f6658a;
    }

    @a
    @w
    public boolean d(int i10) {
        v0 v0Var;
        int length;
        String[] packagesForUid = this.f6620a.getPackageManager().getPackagesForUid(i10);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            v0Var = null;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    s.l(v0Var);
                    break;
                }
                v0Var = g(packagesForUid[i11], false, false);
                if (v0Var.f6658a) {
                    break;
                }
                i11++;
            }
        } else {
            v0Var = v0.c("no pkgs");
        }
        v0Var.e();
        return v0Var.f6658a;
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    public final v0 g(String str, boolean z10, boolean z11) {
        v0 v0Var;
        ApplicationInfo applicationInfo;
        String str2 = "null pkg";
        if (str == null) {
            return v0.c(str2);
        }
        if (str.equals(this.f6621b)) {
            return v0.b();
        }
        if (o0.g()) {
            v0Var = o0.b(str, j.k(this.f6620a), false, false);
        } else {
            try {
                PackageInfo packageInfo = this.f6620a.getPackageManager().getPackageInfo(str, 64);
                boolean k10 = j.k(this.f6620a);
                if (packageInfo != null) {
                    Signature[] signatureArr = packageInfo.signatures;
                    if (signatureArr == null || signatureArr.length != 1) {
                        str2 = "single cert required";
                    } else {
                        l0 l0Var = new l0(packageInfo.signatures[0].toByteArray());
                        String str3 = packageInfo.packageName;
                        v0 a10 = o0.a(str3, l0Var, k10, false);
                        if (!a10.f6658a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !o0.a(str3, l0Var, false, true).f6658a) {
                            v0Var = a10;
                        } else {
                            str2 = "debuggable release cert app rejected";
                        }
                    }
                }
                v0Var = v0.c(str2);
            } catch (PackageManager.NameNotFoundException e10) {
                return v0.d("no pkg ".concat(str), e10);
            }
        }
        if (v0Var.f6658a) {
            this.f6621b = str;
        }
        return v0Var;
    }
}
