package uj;

import android.media.AudioManager;
import vn.icar.entertaiment.view.fragment.TvFragment;

public final /* synthetic */ class c implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TvFragment f23426a;

    public /* synthetic */ c(TvFragment tvFragment) {
        this.f23426a = tvFragment;
    }

    public final void onAudioFocusChange(int i10) {
        this.f23426a.x1(i10);
    }
}
