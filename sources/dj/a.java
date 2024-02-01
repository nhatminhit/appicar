package dj;

import android.content.Context;
import com.syu.remote.ConnEvent;
import com.syu.remote.Message;
import com.syu.remote.Remote;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public Context f18406a;

    /* renamed from: b  reason: collision with root package name */
    public C0295a f18407b;

    /* renamed from: c  reason: collision with root package name */
    public Remote f18408c;

    /* renamed from: d  reason: collision with root package name */
    public int f18409d;

    /* renamed from: e  reason: collision with root package name */
    public int f18410e;

    /* renamed from: dj.a$a  reason: collision with other inner class name */
    public interface C0295a {
        void a(int i10);
    }

    public a(Context context, C0295a aVar) {
        this.f18406a = context;
        this.f18407b = aVar;
        EventBus.getDefault().register(this);
        this.f18408c = Remote.getAutoTools(context);
    }

    public void a(int i10) {
        this.f18408c.command(4, 0, i10);
    }

    @Subscribe(threadMode = ThreadMode.BACKGROUND)
    public void b(ConnEvent connEvent) {
        Remote remote;
        if ("conn".equals(connEvent.type) && connEvent.success && (remote = this.f18408c) != null) {
            remote.observe(4, 2, 3);
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void c(Message message) {
        int[] iArr;
        C0295a aVar;
        if (message.module == 4) {
            int i10 = message.code;
            if (i10 == 2) {
                int[] iArr2 = message.ints;
                if (iArr2 != null && iArr2.length > 0) {
                    int i11 = iArr2[0];
                    this.f18410e = i11;
                    C0295a aVar2 = this.f18407b;
                    if (aVar2 != null) {
                        aVar2.a(i11);
                    }
                }
            } else if (i10 == 3 && (iArr = message.ints) != null && iArr.length > 0) {
                int i12 = iArr[0];
                this.f18409d = i12;
                if (i12 == 0) {
                    aVar = this.f18407b;
                    if (aVar == null) {
                        return;
                    }
                } else {
                    aVar = this.f18407b;
                    if (aVar == null) {
                        return;
                    }
                }
                aVar.a(this.f18410e);
            }
        }
    }
}
