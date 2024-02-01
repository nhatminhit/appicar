package g3;

import android.os.IBinder;

public class u1 implements w1 {

    /* renamed from: a  reason: collision with root package name */
    public final IBinder f7889a;

    public u1(IBinder iBinder) {
        this.f7889a = iBinder;
    }

    public boolean equals(Object obj) {
        return (obj instanceof u1) && ((u1) obj).f7889a.equals(this.f7889a);
    }

    public int hashCode() {
        return this.f7889a.hashCode();
    }
}
