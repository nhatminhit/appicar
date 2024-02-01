package d8;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import b9.u;

@SuppressLint({"HandlerLeak"})
public final class v extends u {

    /* renamed from: a  reason: collision with root package name */
    public final Context f6655a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f6656b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v(e eVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f6656b = eVar;
        this.f6655a = context.getApplicationContext();
    }

    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Don't know how to handle this message: ");
            sb2.append(i10);
            return;
        }
        int j10 = this.f6656b.j(this.f6655a);
        if (this.f6656b.o(j10)) {
            this.f6656b.C(this.f6655a, j10);
        }
    }
}
