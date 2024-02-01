package gc;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import gc.b0;
import gc.v;
import java.io.IOException;

public class b extends b0 {

    /* renamed from: b  reason: collision with root package name */
    public static final String f18971b = "android_asset";

    /* renamed from: c  reason: collision with root package name */
    public static final int f18972c = 22;

    /* renamed from: a  reason: collision with root package name */
    public final AssetManager f18973a;

    public b(Context context) {
        this.f18973a = context.getAssets();
    }

    public static String j(z zVar) {
        return zVar.f19165d.toString().substring(f18972c);
    }

    public boolean c(z zVar) {
        Uri uri = zVar.f19165d;
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }

    public b0.a f(z zVar, int i10) throws IOException {
        return new b0.a(this.f18973a.open(j(zVar)), v.e.DISK);
    }
}
