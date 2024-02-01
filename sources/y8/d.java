package y8;

import android.annotation.TargetApi;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Process;
import d.m0;
import e1.j;
import e8.a;
import w8.v;

@a
public class d {
    @m0

    /* renamed from: a  reason: collision with root package name */
    public final Context f15579a;

    public d(@m0 Context context) {
        this.f15579a = context;
    }

    @a
    public int a(@m0 String str) {
        return this.f15579a.checkCallingOrSelfPermission(str);
    }

    @a
    public int b(@m0 String str, @m0 String str2) {
        return this.f15579a.getPackageManager().checkPermission(str, str2);
    }

    @a
    @m0
    public ApplicationInfo c(@m0 String str, int i10) throws PackageManager.NameNotFoundException {
        return this.f15579a.getPackageManager().getApplicationInfo(str, i10);
    }

    @a
    @m0
    public CharSequence d(@m0 String str) throws PackageManager.NameNotFoundException {
        return this.f15579a.getPackageManager().getApplicationLabel(this.f15579a.getPackageManager().getApplicationInfo(str, 0));
    }

    @a
    @m0
    public j<CharSequence, Drawable> e(@m0 String str) throws PackageManager.NameNotFoundException {
        ApplicationInfo applicationInfo = this.f15579a.getPackageManager().getApplicationInfo(str, 0);
        return j.a(this.f15579a.getPackageManager().getApplicationLabel(applicationInfo), this.f15579a.getPackageManager().getApplicationIcon(applicationInfo));
    }

    @a
    @m0
    public PackageInfo f(@m0 String str, int i10) throws PackageManager.NameNotFoundException {
        return this.f15579a.getPackageManager().getPackageInfo(str, i10);
    }

    @a
    public boolean g() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return b.a(this.f15579a);
        }
        if (!v.n() || (nameForUid = this.f15579a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.f15579a.getPackageManager().isInstantApp(nameForUid);
    }

    @TargetApi(19)
    public final boolean h(int i10, @m0 String str) {
        if (v.h()) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) this.f15579a.getSystemService("appops");
                if (appOpsManager != null) {
                    appOpsManager.checkPackage(i10, str);
                    return true;
                }
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            } catch (SecurityException unused) {
                return false;
            }
        } else {
            String[] packagesForUid = this.f15579a.getPackageManager().getPackagesForUid(i10);
            if (!(str == null || packagesForUid == null)) {
                for (String equals : packagesForUid) {
                    if (str.equals(equals)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }
}
