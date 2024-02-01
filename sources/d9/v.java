package d9;

import android.os.WorkSource;
import com.google.android.gms.location.zzb;
import j8.s;
import j8.w;

@w
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public long f6723a = Long.MIN_VALUE;

    public final v a(long j10) {
        s.b(j10 >= 0, "intervalMillis can't be negative.");
        this.f6723a = j10;
        return this;
    }

    public final zzb b() {
        s.s(this.f6723a != Long.MIN_VALUE, "Must set intervalMillis.");
        return new zzb(this.f6723a, true, (WorkSource) null, (String) null, (int[]) null, false, (String) null, 0, (String) null);
    }
}
