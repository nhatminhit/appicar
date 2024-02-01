package r2;

import android.content.Context;
import androidx.profileinstaller.ProfileInstallerInitializer;

public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ ProfileInstallerInitializer O;
    public final /* synthetic */ Context P;

    public /* synthetic */ i(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.O = profileInstallerInitializer;
        this.P = context;
    }

    public final void run() {
        this.O.i(this.P);
    }
}
