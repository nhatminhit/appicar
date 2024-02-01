package a4;

import a4.a;
import a4.d;
import android.content.Context;
import java.io.File;

@Deprecated
public final class f extends d {

    public class a implements d.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f160a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f161b;

        public a(Context context, String str) {
            this.f160a = context;
            this.f161b = str;
        }

        public File a() {
            File externalCacheDir = this.f160a.getExternalCacheDir();
            if (externalCacheDir == null) {
                return null;
            }
            return this.f161b != null ? new File(externalCacheDir, this.f161b) : externalCacheDir;
        }
    }

    public f(Context context) {
        this(context, "image_manager_disk_cache", a.C0004a.f138a);
    }

    public f(Context context, int i10) {
        this(context, "image_manager_disk_cache", i10);
    }

    public f(Context context, String str, int i10) {
        super((d.c) new a(context, str), (long) i10);
    }
}
