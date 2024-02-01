package h6;

import android.media.MediaDrm;
import com.google.android.exoplayer2.drm.e;
import com.google.android.exoplayer2.drm.f;
import java.util.List;

public final /* synthetic */ class p implements MediaDrm.OnKeyStatusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f8866a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e.d f8867b;

    public /* synthetic */ p(f fVar, e.d dVar) {
        this.f8866a = fVar;
        this.f8867b = dVar;
    }

    public final void onKeyStatusChange(MediaDrm mediaDrm, byte[] bArr, List list, boolean z10) {
        this.f8866a.B(this.f8867b, mediaDrm, bArr, list, z10);
    }
}
