package qc;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f22260a = Executors.newSingleThreadExecutor();

    /* renamed from: b  reason: collision with root package name */
    public final Handler f22261b = new Handler(Looper.getMainLooper());

    public interface a<R> {
        void a(R r10);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void e(Callable callable, a aVar) {
        try {
            this.f22261b.post(new a(aVar, callable.call()));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public <R> void c(Callable<R> callable, a<R> aVar) {
        this.f22260a.execute(new b(this, callable, aVar));
    }

    public void f() {
        this.f22260a.shutdown();
        this.f22260a.shutdownNow();
    }
}
