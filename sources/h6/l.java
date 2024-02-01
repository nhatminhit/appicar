package h6;

import android.os.Looper;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.c;
import h6.m;

public interface l<T extends m> {
    c<T> a(Looper looper, DrmInitData drmInitData);

    boolean d(DrmInitData drmInitData);

    void f(c<T> cVar);
}
