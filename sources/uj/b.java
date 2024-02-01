package uj;

import android.media.AudioManager;
import vn.icar.entertaiment.view.fragment.OfflineFragment;

public final /* synthetic */ class b implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ OfflineFragment f23425a;

    public /* synthetic */ b(OfflineFragment offlineFragment) {
        this.f23425a = offlineFragment;
    }

    public final void onAudioFocusChange(int i10) {
        this.f23425a.s1(i10);
    }
}
