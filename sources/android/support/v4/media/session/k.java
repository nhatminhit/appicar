package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.AudioAttributes;
import android.media.MediaDescription;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.VolumeProvider;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.os.ResultReceiver;
import d.t0;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@t0(21)
public class k {

    /* renamed from: a  reason: collision with root package name */
    public static final String f617a = "MediaSessionCompatApi21";

    public interface a {
        void a();

        void d();

        void e();

        void f();

        void g(String str, Bundle bundle, ResultReceiver resultReceiver);

        void h(long j10);

        void i(Object obj);

        void j();

        void k();

        boolean l(Intent intent);

        void n(Object obj, Bundle bundle);

        void o(String str, Bundle bundle);

        void p(String str, Bundle bundle);

        void q();

        void r(long j10);

        void s(String str, Bundle bundle);
    }

    public static class b<T extends a> extends MediaSession.Callback {

        /* renamed from: a  reason: collision with root package name */
        public final T f618a;

        public b(T t10) {
            this.f618a = t10;
        }

        public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
            MediaSessionCompat.b(bundle);
            this.f618a.g(str, bundle, resultReceiver);
        }

        public void onCustomAction(String str, Bundle bundle) {
            MediaSessionCompat.b(bundle);
            this.f618a.s(str, bundle);
        }

        public void onFastForward() {
            this.f618a.q();
        }

        public boolean onMediaButtonEvent(Intent intent) {
            return this.f618a.l(intent) || super.onMediaButtonEvent(intent);
        }

        public void onPause() {
            this.f618a.d();
        }

        public void onPlay() {
            this.f618a.j();
        }

        public void onPlayFromMediaId(String str, Bundle bundle) {
            MediaSessionCompat.b(bundle);
            this.f618a.p(str, bundle);
        }

        public void onPlayFromSearch(String str, Bundle bundle) {
            MediaSessionCompat.b(bundle);
            this.f618a.o(str, bundle);
        }

        public void onRewind() {
            this.f618a.f();
        }

        public void onSeekTo(long j10) {
            this.f618a.r(j10);
        }

        public void onSetRating(Rating rating) {
            this.f618a.i(rating);
        }

        public void onSkipToNext() {
            this.f618a.e();
        }

        public void onSkipToPrevious() {
            this.f618a.k();
        }

        public void onSkipToQueueItem(long j10) {
            this.f618a.h(j10);
        }

        public void onStop() {
            this.f618a.a();
        }
    }

    public static class c {
        public static Object a(Object obj, long j10) {
            return new MediaSession.QueueItem((MediaDescription) obj, j10);
        }

        public static Object b(Object obj) {
            return ((MediaSession.QueueItem) obj).getDescription();
        }

        public static long c(Object obj) {
            return ((MediaSession.QueueItem) obj).getQueueId();
        }
    }

    public static Object a(a aVar) {
        return new b(aVar);
    }

    public static Object b(Context context, String str) {
        return new MediaSession(context, str);
    }

    public static Parcelable c(Object obj) {
        return ((MediaSession) obj).getSessionToken();
    }

    public static boolean d(Object obj) {
        try {
            Field declaredField = obj.getClass().getDeclaredField("mCallback");
            if (declaredField == null) {
                return false;
            }
            declaredField.setAccessible(true);
            return declaredField.get(obj) != null;
        } catch (IllegalAccessException | NoSuchFieldException unused) {
            return false;
        }
    }

    public static boolean e(Object obj) {
        return ((MediaSession) obj).isActive();
    }

    public static void f(Object obj) {
        ((MediaSession) obj).release();
    }

    public static void g(Object obj, String str, Bundle bundle) {
        ((MediaSession) obj).sendSessionEvent(str, bundle);
    }

    public static void h(Object obj, boolean z10) {
        ((MediaSession) obj).setActive(z10);
    }

    public static void i(Object obj, Object obj2, Handler handler) {
        ((MediaSession) obj).setCallback((MediaSession.Callback) obj2, handler);
    }

    public static void j(Object obj, Bundle bundle) {
        ((MediaSession) obj).setExtras(bundle);
    }

    public static void k(Object obj, int i10) {
        ((MediaSession) obj).setFlags(i10);
    }

    public static void l(Object obj, PendingIntent pendingIntent) {
        ((MediaSession) obj).setMediaButtonReceiver(pendingIntent);
    }

    public static void m(Object obj, Object obj2) {
        ((MediaSession) obj).setMetadata((MediaMetadata) obj2);
    }

    public static void n(Object obj, Object obj2) {
        ((MediaSession) obj).setPlaybackState((PlaybackState) obj2);
    }

    public static void o(Object obj, int i10) {
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setLegacyStreamType(i10);
        ((MediaSession) obj).setPlaybackToLocal(builder.build());
    }

    public static void p(Object obj, Object obj2) {
        ((MediaSession) obj).setPlaybackToRemote((VolumeProvider) obj2);
    }

    public static void q(Object obj, List<Object> list) {
        if (list == null) {
            ((MediaSession) obj).setQueue((List) null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((MediaSession.QueueItem) it.next());
        }
        ((MediaSession) obj).setQueue(arrayList);
    }

    public static void r(Object obj, CharSequence charSequence) {
        ((MediaSession) obj).setQueueTitle(charSequence);
    }

    public static void s(Object obj, PendingIntent pendingIntent) {
        ((MediaSession) obj).setSessionActivity(pendingIntent);
    }

    public static Object t(Object obj) {
        if (obj instanceof MediaSession) {
            return obj;
        }
        throw new IllegalArgumentException("mediaSession is not a valid MediaSession object");
    }

    public static Object u(Object obj) {
        if (obj instanceof MediaSession.Token) {
            return obj;
        }
        throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
    }
}
