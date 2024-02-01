package org.greenrobot.eventbus.meta;

import org.greenrobot.eventbus.ThreadMode;

public class SubscriberMethodInfo {

    /* renamed from: a  reason: collision with root package name */
    public final String f21891a;

    /* renamed from: b  reason: collision with root package name */
    public final ThreadMode f21892b;

    /* renamed from: c  reason: collision with root package name */
    public final Class<?> f21893c;

    /* renamed from: d  reason: collision with root package name */
    public final int f21894d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f21895e;

    public SubscriberMethodInfo(String str, Class<?> cls) {
        this(str, cls, ThreadMode.POSTING, 0, false);
    }

    public SubscriberMethodInfo(String str, Class<?> cls, ThreadMode threadMode) {
        this(str, cls, threadMode, 0, false);
    }

    public SubscriberMethodInfo(String str, Class<?> cls, ThreadMode threadMode, int i10, boolean z10) {
        this.f21891a = str;
        this.f21892b = threadMode;
        this.f21893c = cls;
        this.f21894d = i10;
        this.f21895e = z10;
    }
}
