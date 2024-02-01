package android.support.v4.media.session;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.view.KeyEvent;
import d.t0;
import java.util.ArrayList;
import java.util.List;

@t0(21)
public class c {

    public interface a {
        void A();

        void a(Object obj);

        void b(int i10, int i11, int i12, int i13, int i14);

        void c(Object obj);

        void d(String str, Bundle bundle);

        void s(Bundle bundle);

        void u(List<?> list);

        void z(CharSequence charSequence);
    }

    public static class b<T extends a> extends MediaController.Callback {

        /* renamed from: a  reason: collision with root package name */
        public final T f613a;

        public b(T t10) {
            this.f613a = t10;
        }

        public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
            this.f613a.b(playbackInfo.getPlaybackType(), C0014c.c(playbackInfo), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
        }

        public void onExtrasChanged(Bundle bundle) {
            MediaSessionCompat.b(bundle);
            this.f613a.s(bundle);
        }

        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            this.f613a.a(mediaMetadata);
        }

        public void onPlaybackStateChanged(PlaybackState playbackState) {
            this.f613a.c(playbackState);
        }

        public void onQueueChanged(List<MediaSession.QueueItem> list) {
            this.f613a.u(list);
        }

        public void onQueueTitleChanged(CharSequence charSequence) {
            this.f613a.z(charSequence);
        }

        public void onSessionDestroyed() {
            this.f613a.A();
        }

        public void onSessionEvent(String str, Bundle bundle) {
            MediaSessionCompat.b(bundle);
            this.f613a.d(str, bundle);
        }
    }

    /* renamed from: android.support.v4.media.session.c$c  reason: collision with other inner class name */
    public static class C0014c {

        /* renamed from: a  reason: collision with root package name */
        public static final int f614a = 4;

        /* renamed from: b  reason: collision with root package name */
        public static final int f615b = 6;

        /* renamed from: c  reason: collision with root package name */
        public static final int f616c = 7;

        public static AudioAttributes a(Object obj) {
            return ((MediaController.PlaybackInfo) obj).getAudioAttributes();
        }

        public static int b(Object obj) {
            return ((MediaController.PlaybackInfo) obj).getCurrentVolume();
        }

        public static int c(Object obj) {
            return g(a(obj));
        }

        public static int d(Object obj) {
            return ((MediaController.PlaybackInfo) obj).getMaxVolume();
        }

        public static int e(Object obj) {
            return ((MediaController.PlaybackInfo) obj).getPlaybackType();
        }

        public static int f(Object obj) {
            return ((MediaController.PlaybackInfo) obj).getVolumeControl();
        }

        public static int g(AudioAttributes audioAttributes) {
            if ((audioAttributes.getFlags() & 1) == 1) {
                return 7;
            }
            if ((audioAttributes.getFlags() & 4) == 4) {
                return 6;
            }
            int usage = audioAttributes.getUsage();
            if (usage == 13) {
                return 1;
            }
            switch (usage) {
                case 2:
                    return 0;
                case 3:
                    return 8;
                case 4:
                    return 4;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    return 5;
                case 6:
                    return 2;
                default:
                    return 3;
            }
        }
    }

    public static class d {
        public static void a(Object obj) {
            ((MediaController.TransportControls) obj).fastForward();
        }

        public static void b(Object obj) {
            ((MediaController.TransportControls) obj).pause();
        }

        public static void c(Object obj) {
            ((MediaController.TransportControls) obj).play();
        }

        public static void d(Object obj, String str, Bundle bundle) {
            ((MediaController.TransportControls) obj).playFromMediaId(str, bundle);
        }

        public static void e(Object obj, String str, Bundle bundle) {
            ((MediaController.TransportControls) obj).playFromSearch(str, bundle);
        }

        public static void f(Object obj) {
            ((MediaController.TransportControls) obj).rewind();
        }

        public static void g(Object obj, long j10) {
            ((MediaController.TransportControls) obj).seekTo(j10);
        }

        public static void h(Object obj, String str, Bundle bundle) {
            ((MediaController.TransportControls) obj).sendCustomAction(str, bundle);
        }

        public static void i(Object obj, Object obj2) {
            ((MediaController.TransportControls) obj).setRating((Rating) obj2);
        }

        public static void j(Object obj) {
            ((MediaController.TransportControls) obj).skipToNext();
        }

        public static void k(Object obj) {
            ((MediaController.TransportControls) obj).skipToPrevious();
        }

        public static void l(Object obj, long j10) {
            ((MediaController.TransportControls) obj).skipToQueueItem(j10);
        }

        public static void m(Object obj) {
            ((MediaController.TransportControls) obj).stop();
        }
    }

    public static void a(Object obj, int i10, int i11) {
        ((MediaController) obj).adjustVolume(i10, i11);
    }

    public static Object b(a aVar) {
        return new b(aVar);
    }

    public static boolean c(Object obj, KeyEvent keyEvent) {
        return ((MediaController) obj).dispatchMediaButtonEvent(keyEvent);
    }

    public static Object d(Context context, Object obj) {
        return new MediaController(context, (MediaSession.Token) obj);
    }

    public static Bundle e(Object obj) {
        return ((MediaController) obj).getExtras();
    }

    public static long f(Object obj) {
        return ((MediaController) obj).getFlags();
    }

    public static Object g(Activity activity) {
        return activity.getMediaController();
    }

    public static Object h(Object obj) {
        return ((MediaController) obj).getMetadata();
    }

    public static String i(Object obj) {
        return ((MediaController) obj).getPackageName();
    }

    public static Object j(Object obj) {
        return ((MediaController) obj).getPlaybackInfo();
    }

    public static Object k(Object obj) {
        return ((MediaController) obj).getPlaybackState();
    }

    public static List<Object> l(Object obj) {
        List<MediaSession.QueueItem> queue = ((MediaController) obj).getQueue();
        if (queue == null) {
            return null;
        }
        return new ArrayList(queue);
    }

    public static CharSequence m(Object obj) {
        return ((MediaController) obj).getQueueTitle();
    }

    public static int n(Object obj) {
        return ((MediaController) obj).getRatingType();
    }

    public static PendingIntent o(Object obj) {
        return ((MediaController) obj).getSessionActivity();
    }

    public static Object p(Object obj) {
        return ((MediaController) obj).getSessionToken();
    }

    public static Object q(Object obj) {
        return ((MediaController) obj).getTransportControls();
    }

    public static void r(Object obj, Object obj2, Handler handler) {
        ((MediaController) obj).registerCallback((MediaController.Callback) obj2, handler);
    }

    public static void s(Object obj, String str, Bundle bundle, ResultReceiver resultReceiver) {
        ((MediaController) obj).sendCommand(str, bundle, resultReceiver);
    }

    public static void t(Activity activity, Object obj) {
        activity.setMediaController((MediaController) obj);
    }

    public static void u(Object obj, int i10, int i11) {
        ((MediaController) obj).setVolumeTo(i10, i11);
    }

    public static void v(Object obj, Object obj2) {
        ((MediaController) obj).unregisterCallback((MediaController.Callback) obj2);
    }
}
