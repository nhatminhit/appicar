package com.google.android.exoplayer2.scheduler;

import a7.c;
import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import d.w0;
import w7.a;
import w7.q0;

@TargetApi(21)
public final class PlatformScheduler implements c {

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f5278d = false;

    /* renamed from: e  reason: collision with root package name */
    public static final String f5279e = "PlatformScheduler";

    /* renamed from: f  reason: collision with root package name */
    public static final String f5280f = "service_action";

    /* renamed from: g  reason: collision with root package name */
    public static final String f5281g = "service_package";

    /* renamed from: h  reason: collision with root package name */
    public static final String f5282h = "requirements";

    /* renamed from: a  reason: collision with root package name */
    public final int f5283a;

    /* renamed from: b  reason: collision with root package name */
    public final ComponentName f5284b;

    /* renamed from: c  reason: collision with root package name */
    public final JobScheduler f5285c;

    public static final class PlatformSchedulerService extends JobService {
        public boolean onStartJob(JobParameters jobParameters) {
            PlatformScheduler.d("PlatformSchedulerService started");
            PersistableBundle extras = jobParameters.getExtras();
            if (new Requirements(extras.getInt("requirements")).a(this)) {
                PlatformScheduler.d("Requirements are met");
                String string = extras.getString(PlatformScheduler.f5280f);
                String string2 = extras.getString(PlatformScheduler.f5281g);
                Intent intent = new Intent((String) a.g(string)).setPackage(string2);
                PlatformScheduler.d("Starting service action: " + string + " package: " + string2);
                q0.U0(this, intent);
                return false;
            }
            PlatformScheduler.d("Requirements are not met");
            jobFinished(jobParameters, true);
            return false;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            return false;
        }
    }

    @w0("android.permission.RECEIVE_BOOT_COMPLETED")
    public PlatformScheduler(Context context, int i10) {
        this.f5283a = i10;
        this.f5284b = new ComponentName(context, PlatformSchedulerService.class);
        this.f5285c = (JobScheduler) context.getSystemService("jobscheduler");
    }

    public static JobInfo c(int i10, ComponentName componentName, Requirements requirements, String str, String str2) {
        JobInfo.Builder builder = new JobInfo.Builder(i10, componentName);
        if (requirements.n()) {
            builder.setRequiredNetworkType(2);
        } else if (requirements.l()) {
            builder.setRequiredNetworkType(1);
        }
        builder.setRequiresDeviceIdle(requirements.h());
        builder.setRequiresCharging(requirements.e());
        builder.setPersisted(true);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString(f5280f, str);
        persistableBundle.putString(f5281g, str2);
        persistableBundle.putInt("requirements", requirements.d());
        builder.setExtras(persistableBundle);
        return builder.build();
    }

    public static void d(String str) {
    }

    public boolean a(Requirements requirements, String str, String str2) {
        int schedule = this.f5285c.schedule(c(this.f5283a, this.f5284b, requirements, str2, str));
        d("Scheduling job: " + this.f5283a + " result: " + schedule);
        return schedule == 1;
    }

    public boolean cancel() {
        d("Canceling job: " + this.f5283a);
        this.f5285c.cancel(this.f5283a);
        return true;
    }
}
