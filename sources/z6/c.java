package z6;

import android.net.Uri;
import com.google.android.exoplayer2.offline.DownloadRequest;
import com.google.android.exoplayer2.offline.d;
import d.o0;
import f7.a;
import java.lang.reflect.Constructor;
import java.util.List;

public class c implements v {
    @o0

    /* renamed from: b  reason: collision with root package name */
    public static final Constructor<? extends com.google.android.exoplayer2.offline.c> f15930b;
    @o0

    /* renamed from: c  reason: collision with root package name */
    public static final Constructor<? extends com.google.android.exoplayer2.offline.c> f15931c;
    @o0

    /* renamed from: d  reason: collision with root package name */
    public static final Constructor<? extends com.google.android.exoplayer2.offline.c> f15932d;

    /* renamed from: a  reason: collision with root package name */
    public final u f15933a;

    static {
        Constructor<? extends com.google.android.exoplayer2.offline.c> constructor;
        Constructor<? extends com.google.android.exoplayer2.offline.c> constructor2;
        Constructor<? extends com.google.android.exoplayer2.offline.c> constructor3 = null;
        try {
            constructor = c(Class.forName("com.google.android.exoplayer2.source.dash.offline.DashDownloader"));
        } catch (ClassNotFoundException unused) {
            constructor = null;
        }
        f15930b = constructor;
        try {
            constructor2 = c(a.class);
        } catch (ClassNotFoundException unused2) {
            constructor2 = null;
        }
        f15931c = constructor2;
        try {
            constructor3 = c(Class.forName("com.google.android.exoplayer2.source.smoothstreaming.offline.SsDownloader"));
        } catch (ClassNotFoundException unused3) {
        }
        f15932d = constructor3;
    }

    public c(u uVar) {
        this.f15933a = uVar;
    }

    public static Constructor<? extends com.google.android.exoplayer2.offline.c> c(Class<?> cls) {
        try {
            return cls.asSubclass(com.google.android.exoplayer2.offline.c.class).getConstructor(new Class[]{Uri.class, List.class, u.class});
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException("Downloader constructor missing", e10);
        }
    }

    public com.google.android.exoplayer2.offline.c a(DownloadRequest downloadRequest) {
        Constructor<? extends com.google.android.exoplayer2.offline.c> constructor;
        String str = downloadRequest.P;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 3680:
                if (str.equals(DownloadRequest.X)) {
                    c10 = 0;
                    break;
                }
                break;
            case 103407:
                if (str.equals(DownloadRequest.W)) {
                    c10 = 1;
                    break;
                }
                break;
            case 3075986:
                if (str.equals(DownloadRequest.V)) {
                    c10 = 2;
                    break;
                }
                break;
            case 1131547531:
                if (str.equals(DownloadRequest.U)) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                constructor = f15932d;
                break;
            case 1:
                constructor = f15931c;
                break;
            case 2:
                constructor = f15930b;
                break;
            case 3:
                return new d(downloadRequest.Q, downloadRequest.S, this.f15933a);
            default:
                throw new IllegalArgumentException("Unsupported type: " + downloadRequest.P);
        }
        return b(downloadRequest, constructor);
    }

    public final com.google.android.exoplayer2.offline.c b(DownloadRequest downloadRequest, @o0 Constructor<? extends com.google.android.exoplayer2.offline.c> constructor) {
        if (constructor != null) {
            try {
                return (com.google.android.exoplayer2.offline.c) constructor.newInstance(new Object[]{downloadRequest.Q, downloadRequest.R, this.f15933a});
            } catch (Exception e10) {
                throw new RuntimeException("Failed to instantiate downloader for: " + downloadRequest.P, e10);
            }
        } else {
            throw new IllegalStateException("Module missing for: " + downloadRequest.P);
        }
    }
}
