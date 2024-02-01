package e7;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import j6.i;
import j6.j;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import w7.j0;

public interface g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f6915a = new d();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final i f6916a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f6917b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f6918c;

        public a(i iVar, boolean z10, boolean z11) {
            this.f6916a = iVar;
            this.f6917b = z10;
            this.f6918c = z11;
        }
    }

    a a(i iVar, Uri uri, Format format, List<Format> list, DrmInitData drmInitData, j0 j0Var, Map<String, List<String>> map, j jVar) throws InterruptedException, IOException;
}
