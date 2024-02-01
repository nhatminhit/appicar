package gc;

import android.content.Context;
import gc.b0;
import gc.v;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import t7.t;

public class g extends b0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f19032a;

    public g(Context context) {
        this.f19032a = context;
    }

    public boolean c(z zVar) {
        return t.f13205o.equals(zVar.f19165d.getScheme());
    }

    public b0.a f(z zVar, int i10) throws IOException {
        return new b0.a(j(zVar), v.e.DISK);
    }

    public InputStream j(z zVar) throws FileNotFoundException {
        return this.f19032a.getContentResolver().openInputStream(zVar.f19165d);
    }
}
