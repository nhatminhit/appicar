package a4;

import a4.d;
import android.content.Context;
import d.o0;
import java.io.File;

public final class g extends d {

    public class a implements d.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f162a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f163b;

        public a(Context context, String str) {
            this.f162a = context;
            this.f163b = str;
        }

        public File a() {
            File externalCacheDir;
            File b10 = b();
            return ((b10 == null || !b10.exists()) && (externalCacheDir = this.f162a.getExternalCacheDir()) != null && externalCacheDir.canWrite()) ? this.f163b != null ? new File(externalCacheDir, this.f163b) : externalCacheDir : b10;
        }

        @o0
        public final File b() {
            File cacheDir = this.f162a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f163b != null ? new File(cacheDir, this.f163b) : cacheDir;
        }
    }

    public g(Context context) {
        this(context, "image_manager_disk_cache", 262144000);
    }

    public g(Context context, long j10) {
        this(context, "image_manager_disk_cache", j10);
    }

    public g(Context context, String str, long j10) {
        super((d.c) new a(context, str), j10);
    }
}
