package g8;

import com.google.android.gms.common.api.Status;
import d.m0;
import f8.b;
import h9.c;
import h9.m;

public final class c2 implements c {
    public final /* bridge */ /* synthetic */ Object a(@m0 m mVar) throws Exception {
        if (((Boolean) mVar.r()).booleanValue()) {
            return null;
        }
        throw new b(new Status(13, "listener already unregistered"));
    }
}
