package r7;

import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.ui.f;
import java.util.List;

public final /* synthetic */ class m implements f.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ DefaultTrackSelector f12606a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ DefaultTrackSelector.Parameters f12607b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f12608c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ TrackGroupArray f12609d;

    public /* synthetic */ m(DefaultTrackSelector defaultTrackSelector, DefaultTrackSelector.Parameters parameters, int i10, TrackGroupArray trackGroupArray) {
        this.f12606a = defaultTrackSelector;
        this.f12607b = parameters;
        this.f12608c = i10;
        this.f12609d = trackGroupArray;
    }

    public final void a(boolean z10, List list) {
        f.e(this.f12606a, this.f12607b, this.f12608c, this.f12609d, z10, list);
    }
}
