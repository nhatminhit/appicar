package q4;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bumptech.glide.l;
import d.m0;
import d.o0;
import r4.f;

public final class m<Z> extends e<Z> {
    public static final int S = 1;
    public static final Handler T = new Handler(Looper.getMainLooper(), new a());
    public final l R;

    public class a implements Handler.Callback {
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((m) message.obj).c();
            return true;
        }
    }

    public m(l lVar, int i10, int i11) {
        super(i10, i11);
        this.R = lVar;
    }

    public static <Z> m<Z> d(l lVar, int i10, int i11) {
        return new m<>(lVar, i10, i11);
    }

    public void c() {
        this.R.B(this);
    }

    public void r(@o0 Drawable drawable) {
    }

    public void s(@m0 Z z10, @o0 f<? super Z> fVar) {
        T.obtainMessage(1, this).sendToTarget();
    }
}
