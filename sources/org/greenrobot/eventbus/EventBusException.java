package org.greenrobot.eventbus;

public class EventBusException extends RuntimeException {
    public static final long O = -2912559384646531479L;

    public EventBusException(String str) {
        super(str);
    }

    public EventBusException(String str, Throwable th2) {
        super(str, th2);
    }

    public EventBusException(Throwable th2) {
        super(th2);
    }
}
