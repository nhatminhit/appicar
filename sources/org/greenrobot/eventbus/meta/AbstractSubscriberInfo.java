package org.greenrobot.eventbus.meta;

import org.greenrobot.eventbus.EventBusException;
import org.greenrobot.eventbus.SubscriberMethod;
import org.greenrobot.eventbus.ThreadMode;

public abstract class AbstractSubscriberInfo implements SubscriberInfo {

    /* renamed from: a  reason: collision with root package name */
    public final Class f21887a;

    /* renamed from: b  reason: collision with root package name */
    public final Class<? extends SubscriberInfo> f21888b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f21889c;

    public AbstractSubscriberInfo(Class cls, Class<? extends SubscriberInfo> cls2, boolean z10) {
        this.f21887a = cls;
        this.f21888b = cls2;
        this.f21889c = z10;
    }

    public SubscriberMethod createSubscriberMethod(String str, Class<?> cls) {
        return createSubscriberMethod(str, cls, ThreadMode.POSTING, 0, false);
    }

    public SubscriberMethod createSubscriberMethod(String str, Class<?> cls, ThreadMode threadMode) {
        return createSubscriberMethod(str, cls, threadMode, 0, false);
    }

    public SubscriberMethod createSubscriberMethod(String str, Class<?> cls, ThreadMode threadMode, int i10, boolean z10) {
        try {
            return new SubscriberMethod(this.f21887a.getDeclaredMethod(str, new Class[]{cls}), cls, threadMode, i10, z10);
        } catch (NoSuchMethodException e10) {
            throw new EventBusException("Could not find subscriber method in " + this.f21887a + ". Maybe a missing ProGuard rule?", e10);
        }
    }

    public Class getSubscriberClass() {
        return this.f21887a;
    }

    public SubscriberInfo getSuperSubscriberInfo() {
        Class<? extends SubscriberInfo> cls = this.f21888b;
        if (cls == null) {
            return null;
        }
        try {
            return (SubscriberInfo) cls.newInstance();
        } catch (InstantiationException e10) {
            throw new RuntimeException(e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException(e11);
        }
    }

    public boolean shouldCheckSuperclass() {
        return this.f21889c;
    }
}
