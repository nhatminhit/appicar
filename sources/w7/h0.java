package w7;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

public final class h0 implements n {

    /* renamed from: a  reason: collision with root package name */
    public final Handler f14731a;

    public h0(Handler handler) {
        this.f14731a = handler;
    }

    public Message a(int i10, int i11, int i12) {
        return this.f14731a.obtainMessage(i10, i11, i12);
    }

    public boolean b(Runnable runnable) {
        return this.f14731a.post(runnable);
    }

    public Message c(int i10) {
        return this.f14731a.obtainMessage(i10);
    }

    public boolean d(Runnable runnable, long j10) {
        return this.f14731a.postDelayed(runnable, j10);
    }

    public boolean e(int i10) {
        return this.f14731a.sendEmptyMessage(i10);
    }

    public Message f(int i10, int i11, int i12, Object obj) {
        return this.f14731a.obtainMessage(i10, i11, i12, obj);
    }

    public boolean g(int i10, long j10) {
        return this.f14731a.sendEmptyMessageAtTime(i10, j10);
    }

    public void h(int i10) {
        this.f14731a.removeMessages(i10);
    }

    public Message i(int i10, Object obj) {
        return this.f14731a.obtainMessage(i10, obj);
    }

    public void j(Object obj) {
        this.f14731a.removeCallbacksAndMessages(obj);
    }

    public Looper k() {
        return this.f14731a.getLooper();
    }
}
