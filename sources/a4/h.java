package a4;

import a4.d;
import android.content.Context;
import java.io.File;

public final class h extends d {

    public class a implements d.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f164a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f165b;

        public a(Context context, String str) {
            this.f164a = context;
            this.f165b = str;
        }

        public File a() {
            File cacheDir = this.f164a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f165b != null ? new File(cacheDir, this.f165b) : cacheDir;
        }
    }

    public h(Context context) {
        this(context, "image_manager_disk_cache", 262144000);
    }

    public h(Context context, long j10) {
        this(context, "image_manager_disk_cache", j10);
    }

    public h(Context context, String str, long j10) {
        super((d.c) new a(context, str), j10);
    }
}
