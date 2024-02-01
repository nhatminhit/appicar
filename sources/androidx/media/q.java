package androidx.media;

import android.media.VolumeProvider;
import d.t0;

@t0(21)
public class q {

    public static class a extends VolumeProvider {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f3030a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(int i10, int i11, int i12, b bVar) {
            super(i10, i11, i12);
            this.f3030a = bVar;
        }

        public void onAdjustVolume(int i10) {
            this.f3030a.b(i10);
        }

        public void onSetVolumeTo(int i10) {
            this.f3030a.a(i10);
        }
    }

    public interface b {
        void a(int i10);

        void b(int i10);
    }

    public static Object a(int i10, int i11, int i12, b bVar) {
        return new a(i10, i11, i12, bVar);
    }

    public static void b(Object obj, int i10) {
        ((VolumeProvider) obj).setCurrentVolume(i10);
    }
}
