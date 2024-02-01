package org.greenrobot.eventbus.util;

import java.lang.reflect.Constructor;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import org.greenrobot.eventbus.EventBus;

public class AsyncExecutor {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f21896a;

    /* renamed from: b  reason: collision with root package name */
    public final Constructor<?> f21897b;

    /* renamed from: c  reason: collision with root package name */
    public final EventBus f21898c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f21899d;

    public static class Builder {

        /* renamed from: a  reason: collision with root package name */
        public Executor f21900a;

        /* renamed from: b  reason: collision with root package name */
        public Class<?> f21901b;

        /* renamed from: c  reason: collision with root package name */
        public EventBus f21902c;

        public Builder() {
        }

        public /* synthetic */ Builder(a aVar) {
            this();
        }

        public AsyncExecutor build() {
            return buildForScope((Object) null);
        }

        public AsyncExecutor buildForScope(Object obj) {
            if (this.f21902c == null) {
                this.f21902c = EventBus.getDefault();
            }
            if (this.f21900a == null) {
                this.f21900a = Executors.newCachedThreadPool();
            }
            if (this.f21901b == null) {
                this.f21901b = ThrowableFailureEvent.class;
            }
            return new AsyncExecutor(this.f21900a, this.f21902c, this.f21901b, obj, (a) null);
        }

        public Builder eventBus(EventBus eventBus) {
            this.f21902c = eventBus;
            return this;
        }

        public Builder failureEventType(Class<?> cls) {
            this.f21901b = cls;
            return this;
        }

        public Builder threadPool(Executor executor) {
            this.f21900a = executor;
            return this;
        }
    }

    public interface RunnableEx {
        void run() throws Exception;
    }

    public class a implements Runnable {
        public final /* synthetic */ RunnableEx O;

        public a(RunnableEx runnableEx) {
            this.O = runnableEx;
        }

        public void run() {
            try {
                this.O.run();
            } catch (Exception e10) {
                try {
                    Object newInstance = AsyncExecutor.this.f21897b.newInstance(new Object[]{e10});
                    if (newInstance instanceof HasExecutionScope) {
                        ((HasExecutionScope) newInstance).setExecutionScope(AsyncExecutor.this.f21899d);
                    }
                    AsyncExecutor.this.f21898c.post(newInstance);
                } catch (Exception e11) {
                    AsyncExecutor.this.f21898c.getLogger().log(Level.SEVERE, "Original exception:", e10);
                    throw new RuntimeException("Could not create failure event", e11);
                }
            }
        }
    }

    public AsyncExecutor(Executor executor, EventBus eventBus, Class<?> cls, Object obj) {
        this.f21896a = executor;
        this.f21898c = eventBus;
        this.f21899d = obj;
        try {
            this.f21897b = cls.getConstructor(new Class[]{Throwable.class});
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException("Failure event class must have a constructor with one parameter of type Throwable", e10);
        }
    }

    public /* synthetic */ AsyncExecutor(Executor executor, EventBus eventBus, Class cls, Object obj, a aVar) {
        this(executor, eventBus, cls, obj);
    }

    public static Builder builder() {
        return new Builder((a) null);
    }

    public static AsyncExecutor create() {
        return new Builder((a) null).build();
    }

    public void execute(RunnableEx runnableEx) {
        this.f21896a.execute(new a(runnableEx));
    }
}
