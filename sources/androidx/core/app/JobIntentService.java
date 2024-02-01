package androidx.core.app;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import d.m0;
import d.o0;
import d.t0;
import h0.t;
import java.util.ArrayList;
import java.util.HashMap;

@Deprecated
public abstract class JobIntentService extends Service {
    public static final String V = "JobIntentService";
    public static final boolean W = false;
    public static final Object X = new Object();
    public static final HashMap<ComponentName, h> Y = new HashMap<>();
    public b O;
    public h P;
    public a Q;
    public boolean R = false;
    public boolean S = false;
    public boolean T = false;
    public final ArrayList<d> U;

    public final class a extends AsyncTask<Void, Void, Void> {
        public a() {
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            while (true) {
                e a10 = JobIntentService.this.a();
                if (a10 == null) {
                    return null;
                }
                JobIntentService.this.h(a10.getIntent());
                a10.k();
            }
        }

        /* renamed from: b */
        public void onCancelled(Void voidR) {
            JobIntentService.this.j();
        }

        /* renamed from: c */
        public void onPostExecute(Void voidR) {
            JobIntentService.this.j();
        }
    }

    public interface b {
        IBinder a();

        e b();
    }

    public static final class c extends h {

        /* renamed from: d  reason: collision with root package name */
        public final Context f2171d;

        /* renamed from: e  reason: collision with root package name */
        public final PowerManager.WakeLock f2172e;

        /* renamed from: f  reason: collision with root package name */
        public final PowerManager.WakeLock f2173f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f2174g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f2175h;

        public c(Context context, ComponentName componentName) {
            super(componentName);
            this.f2171d = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f2172e = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f2173f = newWakeLock2;
            newWakeLock2.setReferenceCounted(false);
        }

        public void a(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.f2188a);
            if (this.f2171d.startService(intent2) != null) {
                synchronized (this) {
                    if (!this.f2174g) {
                        this.f2174g = true;
                        if (!this.f2175h) {
                            this.f2172e.acquire(60000);
                        }
                    }
                }
            }
        }

        public void c() {
            synchronized (this) {
                if (this.f2175h) {
                    if (this.f2174g) {
                        this.f2172e.acquire(60000);
                    }
                    this.f2175h = false;
                    this.f2173f.release();
                }
            }
        }

        public void d() {
            synchronized (this) {
                if (!this.f2175h) {
                    this.f2175h = true;
                    this.f2173f.acquire(600000);
                    this.f2172e.release();
                }
            }
        }

        public void e() {
            synchronized (this) {
                this.f2174g = false;
            }
        }
    }

    public final class d implements e {

        /* renamed from: a  reason: collision with root package name */
        public final Intent f2176a;

        /* renamed from: b  reason: collision with root package name */
        public final int f2177b;

        public d(Intent intent, int i10) {
            this.f2176a = intent;
            this.f2177b = i10;
        }

        public Intent getIntent() {
            return this.f2176a;
        }

        public void k() {
            JobIntentService.this.stopSelf(this.f2177b);
        }
    }

    public interface e {
        Intent getIntent();

        void k();
    }

    @t0(26)
    public static final class f extends JobServiceEngine implements b {

        /* renamed from: d  reason: collision with root package name */
        public static final String f2179d = "JobServiceEngineImpl";

        /* renamed from: e  reason: collision with root package name */
        public static final boolean f2180e = false;

        /* renamed from: a  reason: collision with root package name */
        public final JobIntentService f2181a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f2182b = new Object();

        /* renamed from: c  reason: collision with root package name */
        public JobParameters f2183c;

        public final class a implements e {

            /* renamed from: a  reason: collision with root package name */
            public final JobWorkItem f2184a;

            public a(JobWorkItem jobWorkItem) {
                this.f2184a = jobWorkItem;
            }

            public Intent getIntent() {
                return this.f2184a.getIntent();
            }

            public void k() {
                synchronized (f.this.f2182b) {
                    JobParameters jobParameters = f.this.f2183c;
                    if (jobParameters != null) {
                        t.a(jobParameters, this.f2184a);
                    }
                }
            }
        }

        public f(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.f2181a = jobIntentService;
        }

        public IBinder a() {
            return getBinder();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
            r1.getIntent().setExtrasClassLoader(r3.f2181a.getClassLoader());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
            return new androidx.core.app.JobIntentService.f.a(r3, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
            return null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
            if (r1 == null) goto L_0x0024;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.core.app.JobIntentService.e b() {
            /*
                r3 = this;
                java.lang.Object r0 = r3.f2182b
                monitor-enter(r0)
                android.app.job.JobParameters r1 = r3.f2183c     // Catch:{ all -> 0x0025 }
                r2 = 0
                if (r1 != 0) goto L_0x000a
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                return r2
            L_0x000a:
                android.app.job.JobWorkItem r1 = r1.dequeueWork()     // Catch:{ all -> 0x0025 }
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                if (r1 == 0) goto L_0x0024
                android.content.Intent r0 = r1.getIntent()
                androidx.core.app.JobIntentService r2 = r3.f2181a
                java.lang.ClassLoader r2 = r2.getClassLoader()
                r0.setExtrasClassLoader(r2)
                androidx.core.app.JobIntentService$f$a r0 = new androidx.core.app.JobIntentService$f$a
                r0.<init>(r1)
                return r0
            L_0x0024:
                return r2
            L_0x0025:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.JobIntentService.f.b():androidx.core.app.JobIntentService$e");
        }

        public boolean onStartJob(JobParameters jobParameters) {
            this.f2183c = jobParameters;
            this.f2181a.e(false);
            return true;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            boolean b10 = this.f2181a.b();
            synchronized (this.f2182b) {
                this.f2183c = null;
            }
            return b10;
        }
    }

    @t0(26)
    public static final class g extends h {

        /* renamed from: d  reason: collision with root package name */
        public final JobInfo f2186d;

        /* renamed from: e  reason: collision with root package name */
        public final JobScheduler f2187e;

        public g(Context context, ComponentName componentName, int i10) {
            super(componentName);
            b(i10);
            this.f2186d = new JobInfo.Builder(i10, this.f2188a).setOverrideDeadline(0).build();
            this.f2187e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        public void a(Intent intent) {
            int unused = this.f2187e.enqueue(this.f2186d, new JobWorkItem(intent));
        }
    }

    public static abstract class h {

        /* renamed from: a  reason: collision with root package name */
        public final ComponentName f2188a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f2189b;

        /* renamed from: c  reason: collision with root package name */
        public int f2190c;

        public h(ComponentName componentName) {
            this.f2188a = componentName;
        }

        public abstract void a(Intent intent);

        public void b(int i10) {
            if (!this.f2189b) {
                this.f2189b = true;
                this.f2190c = i10;
            } else if (this.f2190c != i10) {
                throw new IllegalArgumentException("Given job ID " + i10 + " is different than previous " + this.f2190c);
            }
        }

        public void c() {
        }

        public void d() {
        }

        public void e() {
        }
    }

    public JobIntentService() {
        this.U = Build.VERSION.SDK_INT >= 26 ? null : new ArrayList<>();
    }

    public static void c(@m0 Context context, @m0 ComponentName componentName, int i10, @m0 Intent intent) {
        if (intent != null) {
            synchronized (X) {
                h f10 = f(context, componentName, true, i10);
                f10.b(i10);
                f10.a(intent);
            }
            return;
        }
        throw new IllegalArgumentException("work must not be null");
    }

    public static void d(@m0 Context context, @m0 Class<?> cls, int i10, @m0 Intent intent) {
        c(context, new ComponentName(context, cls), i10, intent);
    }

    public static h f(Context context, ComponentName componentName, boolean z10, int i10) {
        h hVar;
        HashMap<ComponentName, h> hashMap = Y;
        h hVar2 = hashMap.get(componentName);
        if (hVar2 != null) {
            return hVar2;
        }
        if (Build.VERSION.SDK_INT < 26) {
            hVar = new c(context, componentName);
        } else if (z10) {
            hVar = new g(context, componentName, i10);
        } else {
            throw new IllegalArgumentException("Can't be here without a job id");
        }
        h hVar3 = hVar;
        hashMap.put(componentName, hVar3);
        return hVar3;
    }

    public e a() {
        b bVar = this.O;
        if (bVar != null) {
            return bVar.b();
        }
        synchronized (this.U) {
            if (this.U.size() <= 0) {
                return null;
            }
            e remove = this.U.remove(0);
            return remove;
        }
    }

    public boolean b() {
        a aVar = this.Q;
        if (aVar != null) {
            aVar.cancel(this.R);
        }
        this.S = true;
        return i();
    }

    public void e(boolean z10) {
        if (this.Q == null) {
            this.Q = new a();
            h hVar = this.P;
            if (hVar != null && z10) {
                hVar.d();
            }
            this.Q.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public boolean g() {
        return this.S;
    }

    public abstract void h(@m0 Intent intent);

    public boolean i() {
        return true;
    }

    public void j() {
        ArrayList<d> arrayList = this.U;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.Q = null;
                ArrayList<d> arrayList2 = this.U;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    e(false);
                } else if (!this.T) {
                    this.P.c();
                }
            }
        }
    }

    public void k(boolean z10) {
        this.R = z10;
    }

    public IBinder onBind(@m0 Intent intent) {
        b bVar = this.O;
        if (bVar != null) {
            return bVar.a();
        }
        return null;
    }

    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.O = new f(this);
            this.P = null;
            return;
        }
        this.O = null;
        this.P = f(this, new ComponentName(this, getClass()), false, 0);
    }

    public void onDestroy() {
        super.onDestroy();
        ArrayList<d> arrayList = this.U;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.T = true;
                this.P.c();
            }
        }
    }

    public int onStartCommand(@o0 Intent intent, int i10, int i11) {
        if (this.U == null) {
            return 2;
        }
        this.P.e();
        synchronized (this.U) {
            ArrayList<d> arrayList = this.U;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new d(intent, i11));
            e(true);
        }
        return 3;
    }
}
