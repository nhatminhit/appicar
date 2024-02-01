package org.greenrobot.eventbus.meta;

import org.greenrobot.eventbus.SubscriberMethod;

public class SimpleSubscriberInfo extends AbstractSubscriberInfo {

    /* renamed from: d  reason: collision with root package name */
    public final SubscriberMethodInfo[] f21890d;

    public SimpleSubscriberInfo(Class cls, boolean z10, SubscriberMethodInfo[] subscriberMethodInfoArr) {
        super(cls, (Class<? extends SubscriberInfo>) null, z10);
        this.f21890d = subscriberMethodInfoArr;
    }

    public synchronized SubscriberMethod[] getSubscriberMethods() {
        SubscriberMethod[] subscriberMethodArr;
        int length = this.f21890d.length;
        subscriberMethodArr = new SubscriberMethod[length];
        for (int i10 = 0; i10 < length; i10++) {
            SubscriberMethodInfo subscriberMethodInfo = this.f21890d[i10];
            subscriberMethodArr[i10] = createSubscriberMethod(subscriberMethodInfo.f21891a, subscriberMethodInfo.f21893c, subscriberMethodInfo.f21892b, subscriberMethodInfo.f21894d, subscriberMethodInfo.f21895e);
        }
        return subscriberMethodArr;
    }
}
