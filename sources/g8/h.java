package g8;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import d.m0;
import d.o0;
import e8.a;

@a
public interface h {
    @a
    boolean f();

    @a
    void i(@m0 String str, @m0 LifecycleCallback lifecycleCallback);

    @a
    @o0
    <T extends LifecycleCallback> T o(@m0 String str, @m0 Class<T> cls);

    @a
    @o0
    Activity p();

    @a
    boolean s();

    @a
    void startActivityForResult(@m0 Intent intent, int i10);
}
