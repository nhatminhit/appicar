package z6;

import android.os.Handler;
import android.os.Message;
import z6.l;

public final /* synthetic */ class m implements Handler.Callback {
    public final /* synthetic */ l.e O;

    public /* synthetic */ m(l.e eVar) {
        this.O = eVar;
    }

    public final boolean handleMessage(Message message) {
        return this.O.c(message);
    }
}
