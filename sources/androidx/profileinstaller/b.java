package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import d.h1;
import d.m0;
import d.o0;
import d.x0;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Executor;
import r2.f;
import r2.g;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public static final String f3054a = "ProfileInstaller";

    /* renamed from: b  reason: collision with root package name */
    public static final String f3055b = "/data/misc/profiles/cur/0";

    /* renamed from: c  reason: collision with root package name */
    public static final String f3056c = "primary.prof";

    /* renamed from: d  reason: collision with root package name */
    public static final String f3057d = "dexopt/baseline.prof";

    /* renamed from: e  reason: collision with root package name */
    public static final String f3058e = "dexopt/baseline.profm";

    /* renamed from: f  reason: collision with root package name */
    public static final String f3059f = "profileinstaller_profileWrittenFor_lastUpdateTime.dat";

    /* renamed from: g  reason: collision with root package name */
    public static final d f3060g = new a();
    @m0

    /* renamed from: h  reason: collision with root package name */
    public static final d f3061h = new C0045b();

    /* renamed from: i  reason: collision with root package name */
    public static final int f3062i = 1;

    /* renamed from: j  reason: collision with root package name */
    public static final int f3063j = 2;

    /* renamed from: k  reason: collision with root package name */
    public static final int f3064k = 3;

    /* renamed from: l  reason: collision with root package name */
    public static final int f3065l = 4;

    /* renamed from: m  reason: collision with root package name */
    public static final int f3066m = 1;

    /* renamed from: n  reason: collision with root package name */
    public static final int f3067n = 2;

    /* renamed from: o  reason: collision with root package name */
    public static final int f3068o = 3;

    /* renamed from: p  reason: collision with root package name */
    public static final int f3069p = 4;

    /* renamed from: q  reason: collision with root package name */
    public static final int f3070q = 5;

    /* renamed from: r  reason: collision with root package name */
    public static final int f3071r = 6;

    /* renamed from: s  reason: collision with root package name */
    public static final int f3072s = 7;

    /* renamed from: t  reason: collision with root package name */
    public static final int f3073t = 8;

    /* renamed from: u  reason: collision with root package name */
    public static final int f3074u = 9;

    /* renamed from: v  reason: collision with root package name */
    public static final int f3075v = 10;

    /* renamed from: w  reason: collision with root package name */
    public static final int f3076w = 11;

    public class a implements d {
        public void a(int i10, @o0 Object obj) {
        }

        public void b(int i10, @o0 Object obj) {
        }
    }

    /* renamed from: androidx.profileinstaller.b$b  reason: collision with other inner class name */
    public class C0045b implements d {

        /* renamed from: a  reason: collision with root package name */
        public static final String f3077a = "ProfileInstaller";

        public void a(int i10, @o0 Object obj) {
        }

        public void b(int i10, @o0 Object obj) {
            switch (i10) {
            }
            if (i10 == 6 || i10 == 7 || i10 == 8) {
                Throwable th2 = (Throwable) obj;
            }
        }
    }

    @x0({x0.a.O})
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    public interface d {
        void a(int i10, @o0 Object obj);

        void b(int i10, @o0 Object obj);
    }

    @x0({x0.a.O})
    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    @x0({x0.a.O})
    public static boolean c(@m0 File file) {
        return new File(file, f3059f).delete();
    }

    @h1
    public static void d(@m0 Context context, @m0 Executor executor, @m0 d dVar) {
        c(context.getFilesDir());
        j(executor, dVar, 11, (Object) null);
    }

    public static void e(@m0 Executor executor, @m0 d dVar, int i10, @o0 Object obj) {
        executor.execute(new g(dVar, i10, obj));
    }

    @x0({x0.a.O})
    @h1
    public static boolean f(PackageInfo packageInfo, File file, d dVar) {
        DataInputStream dataInputStream;
        File file2 = new File(file, f3059f);
        boolean z10 = false;
        if (!file2.exists()) {
            return false;
        }
        try {
            dataInputStream = new DataInputStream(new FileInputStream(file2));
            long readLong = dataInputStream.readLong();
            dataInputStream.close();
            if (readLong == packageInfo.lastUpdateTime) {
                z10 = true;
            }
            if (z10) {
                dVar.b(2, (Object) null);
            }
            return z10;
        } catch (IOException unused) {
            return false;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    @x0({x0.a.O})
    public static void i(@m0 PackageInfo packageInfo, @m0 File file) {
        DataOutputStream dataOutputStream;
        try {
            dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, f3059f)));
            dataOutputStream.writeLong(packageInfo.lastUpdateTime);
            dataOutputStream.close();
            return;
        } catch (IOException unused) {
            return;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    public static void j(@m0 Executor executor, @m0 d dVar, int i10, @o0 Object obj) {
        executor.execute(new f(dVar, i10, obj));
    }

    public static void k(@m0 AssetManager assetManager, @m0 String str, @m0 PackageInfo packageInfo, @m0 File file, @m0 String str2, @m0 Executor executor, @m0 d dVar) {
        a aVar = new a(assetManager, executor, dVar, str2, f3057d, f3058e, new File(new File(f3055b, str), f3056c));
        if (aVar.d() && aVar.f().i().j()) {
            i(packageInfo, file);
        }
    }

    @h1
    public static void l(@m0 Context context) {
        m(context, new r2.e(), f3060g);
    }

    @h1
    public static void m(@m0 Context context, @m0 Executor executor, @m0 d dVar) {
        n(context, executor, dVar, false);
    }

    @h1
    public static void n(@m0 Context context, @m0 Executor executor, @m0 d dVar, boolean z10) {
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (z10 || !f(packageInfo, filesDir, dVar)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Installing profile for ");
                sb2.append(context.getPackageName());
                k(assets, packageName, packageInfo, filesDir, name, executor, dVar);
                return;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Skipping profile installation for ");
            sb3.append(context.getPackageName());
        } catch (PackageManager.NameNotFoundException e10) {
            dVar.b(7, e10);
        }
    }

    @h1
    public static void o(@m0 Context context, @m0 Executor executor, @m0 d dVar) {
        try {
            i(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
            j(executor, dVar, 10, (Object) null);
        } catch (PackageManager.NameNotFoundException e10) {
            j(executor, dVar, 7, e10);
        }
    }
}
