package org.greenrobot.eventbus;

import android.os.Looper;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.greenrobot.eventbus.Logger;
import org.greenrobot.eventbus.MainThreadSupport;
import org.greenrobot.eventbus.meta.SubscriberInfoIndex;

public class EventBusBuilder {

    /* renamed from: n  reason: collision with root package name */
    public static final ExecutorService f21864n = Executors.newCachedThreadPool();

    /* renamed from: a  reason: collision with root package name */
    public boolean f21865a = true;

    /* renamed from: b  reason: collision with root package name */
    public boolean f21866b = true;

    /* renamed from: c  reason: collision with root package name */
    public boolean f21867c = true;

    /* renamed from: d  reason: collision with root package name */
    public boolean f21868d = true;

    /* renamed from: e  reason: collision with root package name */
    public boolean f21869e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f21870f = true;

    /* renamed from: g  reason: collision with root package name */
    public boolean f21871g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f21872h;

    /* renamed from: i  reason: collision with root package name */
    public ExecutorService f21873i = f21864n;

    /* renamed from: j  reason: collision with root package name */
    public List<Class<?>> f21874j;

    /* renamed from: k  reason: collision with root package name */
    public List<SubscriberInfoIndex> f21875k;

    /* renamed from: l  reason: collision with root package name */
    public Logger f21876l;

    /* renamed from: m  reason: collision with root package name */
    public MainThreadSupport f21877m;

    public Object a() {
        try {
            return Looper.getMainLooper();
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public EventBusBuilder addIndex(SubscriberInfoIndex subscriberInfoIndex) {
        if (this.f21875k == null) {
            this.f21875k = new ArrayList();
        }
        this.f21875k.add(subscriberInfoIndex);
        return this;
    }

    public Logger b() {
        Logger logger = this.f21876l;
        return logger != null ? logger : (!Logger.AndroidLogger.isAndroidLogAvailable() || a() == null) ? new Logger.SystemOutLogger() : new Logger.AndroidLogger("EventBus");
    }

    public EventBus build() {
        return new EventBus(this);
    }

    public MainThreadSupport c() {
        Object a10;
        MainThreadSupport mainThreadSupport = this.f21877m;
        if (mainThreadSupport != null) {
            return mainThreadSupport;
        }
        if (!Logger.AndroidLogger.isAndroidLogAvailable() || (a10 = a()) == null) {
            return null;
        }
        return new MainThreadSupport.AndroidHandlerMainThreadSupport((Looper) a10);
    }

    public EventBusBuilder eventInheritance(boolean z10) {
        this.f21870f = z10;
        return this;
    }

    public EventBusBuilder executorService(ExecutorService executorService) {
        this.f21873i = executorService;
        return this;
    }

    public EventBusBuilder ignoreGeneratedIndex(boolean z10) {
        this.f21871g = z10;
        return this;
    }

    public EventBus installDefaultEventBus() {
        EventBus eventBus;
        synchronized (EventBus.class) {
            if (EventBus.f21835s == null) {
                EventBus.f21835s = build();
                eventBus = EventBus.f21835s;
            } else {
                throw new EventBusException("Default instance already exists. It may be only set once before it's used the first time to ensure consistent behavior.");
            }
        }
        return eventBus;
    }

    public EventBusBuilder logNoSubscriberMessages(boolean z10) {
        this.f21866b = z10;
        return this;
    }

    public EventBusBuilder logSubscriberExceptions(boolean z10) {
        this.f21865a = z10;
        return this;
    }

    public EventBusBuilder logger(Logger logger) {
        this.f21876l = logger;
        return this;
    }

    public EventBusBuilder sendNoSubscriberEvent(boolean z10) {
        this.f21868d = z10;
        return this;
    }

    public EventBusBuilder sendSubscriberExceptionEvent(boolean z10) {
        this.f21867c = z10;
        return this;
    }

    public EventBusBuilder skipMethodVerificationFor(Class<?> cls) {
        if (this.f21874j == null) {
            this.f21874j = new ArrayList();
        }
        this.f21874j.add(cls);
        return this;
    }

    public EventBusBuilder strictMethodVerification(boolean z10) {
        this.f21872h = z10;
        return this;
    }

    public EventBusBuilder throwSubscriberException(boolean z10) {
        this.f21869e = z10;
        return this;
    }
}
