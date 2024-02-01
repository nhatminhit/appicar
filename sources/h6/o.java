package h6;

import android.media.MediaDrm;
import com.google.android.exoplayer2.drm.e;
import com.google.android.exoplayer2.drm.f;

public final /* synthetic */ class o implements MediaDrm.OnEventListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f8864a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e.c f8865b;

    public /* synthetic */ o(f fVar, e.c cVar) {
        this.f8864a = fVar;
        this.f8865b = cVar;
    }

    public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
        this.f8864a.A(this.f8865b, mediaDrm, bArr, i10, i11, bArr2);
    }
}
