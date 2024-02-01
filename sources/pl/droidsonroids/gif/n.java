package pl.droidsonroids.gif;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import d.m0;
import java.lang.ref.WeakReference;
import java.util.Iterator;

public class n extends Handler {

    /* renamed from: b  reason: collision with root package name */
    public static final int f22153b = -1;

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<e> f22154a;

    public n(e eVar) {
        super(Looper.getMainLooper());
        this.f22154a = new WeakReference<>(eVar);
    }

    public void handleMessage(@m0 Message message) {
        e eVar = this.f22154a.get();
        if (eVar != null) {
            if (message.what == -1) {
                eVar.invalidateSelf();
                return;
            }
            Iterator<a> it = eVar.V.iterator();
            while (it.hasNext()) {
                it.next().a(message.what);
            }
        }
    }
}
