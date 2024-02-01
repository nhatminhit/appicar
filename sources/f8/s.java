package f8;

import android.app.Activity;
import android.content.IntentSender;
import com.google.android.gms.common.api.Status;
import d.m0;
import e8.a;
import f8.u;

public abstract class s<R extends u> extends w<R> {

    /* renamed from: a  reason: collision with root package name */
    public final Activity f7496a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7497b;

    public s(@m0 Activity activity, int i10) {
        j8.s.m(activity, "Activity must not be null");
        this.f7496a = activity;
        this.f7497b = i10;
    }

    @a
    public final void b(@m0 Status status) {
        if (status.h1()) {
            try {
                status.A1(this.f7496a, this.f7497b);
            } catch (IntentSender.SendIntentException unused) {
                d(new Status(8));
            }
        } else {
            d(status);
        }
    }

    public abstract void c(@m0 R r10);

    public abstract void d(@m0 Status status);
}
