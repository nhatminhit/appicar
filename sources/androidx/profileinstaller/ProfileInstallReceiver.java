package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.profileinstaller.b;
import d.m0;
import d.o0;
import r2.e;

public class ProfileInstallReceiver extends BroadcastReceiver {
    @m0

    /* renamed from: a  reason: collision with root package name */
    public static final String f3036a = "androidx.profileinstaller.action.INSTALL_PROFILE";
    @m0

    /* renamed from: b  reason: collision with root package name */
    public static final String f3037b = "androidx.profileinstaller.action.SKIP_FILE";
    @m0

    /* renamed from: c  reason: collision with root package name */
    public static final String f3038c = "EXTRA_SKIP_FILE_OPERATION";
    @m0

    /* renamed from: d  reason: collision with root package name */
    public static final String f3039d = "WRITE_SKIP_FILE";
    @m0

    /* renamed from: e  reason: collision with root package name */
    public static final String f3040e = "DELETE_SKIP_FILE";

    public class a implements b.d {
        public a() {
        }

        public void a(int i10, @o0 Object obj) {
            b.f3061h.a(i10, obj);
        }

        public void b(int i10, @o0 Object obj) {
            b.f3061h.b(i10, obj);
            ProfileInstallReceiver.this.setResultCode(i10);
        }
    }

    public void onReceive(@m0 Context context, @o0 Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (f3036a.equals(action)) {
                b.n(context, new e(), new a(), true);
            } else if (f3037b.equals(action)) {
                String string = intent.getExtras().getString(f3038c);
                if (f3039d.equals(string)) {
                    b.o(context, new e(), new a());
                } else if (f3040e.equals(string)) {
                    b.d(context, new e(), new a());
                }
            }
        }
    }
}
