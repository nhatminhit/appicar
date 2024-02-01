package androidx.media;

import android.content.Context;
import android.media.session.MediaSessionManager;
import android.media.session.MediaSessionManager$RemoteUserInfo;
import androidx.media.j;
import d.t0;
import e1.i;

@t0(28)
public class m extends k {

    /* renamed from: h  reason: collision with root package name */
    public MediaSessionManager f3009h;

    public static final class a implements j.c {

        /* renamed from: a  reason: collision with root package name */
        public final MediaSessionManager$RemoteUserInfo f3010a;

        public a(MediaSessionManager$RemoteUserInfo mediaSessionManager$RemoteUserInfo) {
            this.f3010a = mediaSessionManager$RemoteUserInfo;
        }

        public a(String str, int i10, int i11) {
            this.f3010a = new MediaSessionManager$RemoteUserInfo(str, i10, i11);
        }

        public int b() {
            return this.f3010a.getUid();
        }

        public int c() {
            return this.f3010a.getPid();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            return this.f3010a.equals(((a) obj).f3010a);
        }

        public int hashCode() {
            return i.b(this.f3010a);
        }

        public String n() {
            return this.f3010a.getPackageName();
        }
    }

    public m(Context context) {
        super(context);
        this.f3009h = (MediaSessionManager) context.getSystemService("media_session");
    }

    public boolean a(j.c cVar) {
        if (cVar instanceof a) {
            return this.f3009h.isTrustedForMediaControl(((a) cVar).f3010a);
        }
        return false;
    }
}
