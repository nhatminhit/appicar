package b7;

import android.os.Handler;
import android.os.Message;

public final /* synthetic */ class k implements Handler.Callback {
    public final /* synthetic */ l O;

    public /* synthetic */ k(l lVar) {
        this.O = lVar;
    }

    public final boolean handleMessage(Message message) {
        return this.O.Y(message);
    }
}
