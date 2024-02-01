package org.greenrobot.eventbus;

import java.lang.reflect.Method;

public class SubscriberMethod {

    /* renamed from: a  reason: collision with root package name */
    public final Method f21881a;

    /* renamed from: b  reason: collision with root package name */
    public final ThreadMode f21882b;

    /* renamed from: c  reason: collision with root package name */
    public final Class<?> f21883c;

    /* renamed from: d  reason: collision with root package name */
    public final int f21884d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f21885e;

    /* renamed from: f  reason: collision with root package name */
    public String f21886f;

    public SubscriberMethod(Method method, Class<?> cls, ThreadMode threadMode, int i10, boolean z10) {
        this.f21881a = method;
        this.f21882b = threadMode;
        this.f21883c = cls;
        this.f21884d = i10;
        this.f21885e = z10;
    }

    public final synchronized void a() {
        if (this.f21886f == null) {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append(this.f21881a.getDeclaringClass().getName());
            sb2.append('#');
            sb2.append(this.f21881a.getName());
            sb2.append('(');
            sb2.append(this.f21883c.getName());
            this.f21886f = sb2.toString();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SubscriberMethod)) {
            return false;
        }
        a();
        SubscriberMethod subscriberMethod = (SubscriberMethod) obj;
        subscriberMethod.a();
        return this.f21886f.equals(subscriberMethod.f21886f);
    }

    public int hashCode() {
        return this.f21881a.hashCode();
    }
}
