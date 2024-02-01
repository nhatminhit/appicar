package g8;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import w8.d0;

public final class i2 {

    /* renamed from: c  reason: collision with root package name */
    public static final Status f8225c = new Status(8, "The connection to Google Play services was lost");
    @d0

    /* renamed from: a  reason: collision with root package name */
    public final Set f8226a = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));

    /* renamed from: b  reason: collision with root package name */
    public final h2 f8227b = new h2(this);

    public final void a(BasePendingResult basePendingResult) {
        this.f8226a.add(basePendingResult);
        basePendingResult.v(this.f8227b);
    }

    public final void b() {
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.f8226a.toArray(new BasePendingResult[0])) {
            basePendingResult.v((h2) null);
            if (basePendingResult.u()) {
                this.f8226a.remove(basePendingResult);
            }
        }
    }
}
