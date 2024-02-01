package dh;

import org.greenrobot.eventbus.SubscriberMethod;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final Object f18398a;

    /* renamed from: b  reason: collision with root package name */
    public final SubscriberMethod f18399b;

    /* renamed from: c  reason: collision with root package name */
    public volatile boolean f18400c = true;

    public g(Object obj, SubscriberMethod subscriberMethod) {
        this.f18398a = obj;
        this.f18399b = subscriberMethod;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f18398a == gVar.f18398a && this.f18399b.equals(gVar.f18399b);
    }

    public int hashCode() {
        return this.f18398a.hashCode() + this.f18399b.f21886f.hashCode();
    }
}
