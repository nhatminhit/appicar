package r7;

import android.content.DialogInterface;
import com.google.android.exoplayer2.ui.TrackSelectionView;
import com.google.android.exoplayer2.ui.f;

public final /* synthetic */ class l implements DialogInterface.OnClickListener {
    public final /* synthetic */ f O;
    public final /* synthetic */ TrackSelectionView P;

    public /* synthetic */ l(f fVar, TrackSelectionView trackSelectionView) {
        this.O = fVar;
        this.P = trackSelectionView;
    }

    public final void onClick(DialogInterface dialogInterface, int i10) {
        this.O.d(this.P, dialogInterface, i10);
    }
}
