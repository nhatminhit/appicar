package org.greenrobot.eventbus;

public final class SubscriberExceptionEvent {
    public final Object causingEvent;
    public final Object causingSubscriber;
    public final EventBus eventBus;
    public final Throwable throwable;

    public SubscriberExceptionEvent(EventBus eventBus2, Throwable th2, Object obj, Object obj2) {
        this.eventBus = eventBus2;
        this.throwable = th2;
        this.causingEvent = obj;
        this.causingSubscriber = obj2;
    }
}
