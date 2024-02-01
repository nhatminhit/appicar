package z6;

import android.os.Handler;
import android.os.Message;
import com.google.android.exoplayer2.offline.b;

public final /* synthetic */ class o implements Handler.Callback {
    public final /* synthetic */ b O;

    public /* synthetic */ o(b bVar) {
        this.O = bVar;
    }

    public final boolean handleMessage(Message message) {
        return this.O.m(message);
    }
}
