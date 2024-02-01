package r2;

import android.content.Context;
import androidx.profileinstaller.ProfileInstallerInitializer;

public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ Context O;

    public /* synthetic */ h(Context context) {
        this.O = context;
    }

    public final void run() {
        ProfileInstallerInitializer.l(this.O);
    }
}
