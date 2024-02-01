package h0;

import android.app.Notification;
import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import d.m0;
import d.o0;
import d.t0;
import e1.n;

public class c0 {

    /* renamed from: s  reason: collision with root package name */
    public static final String f8361s = "miscellaneous";

    /* renamed from: t  reason: collision with root package name */
    public static final boolean f8362t = true;

    /* renamed from: u  reason: collision with root package name */
    public static final int f8363u = 0;
    @m0

    /* renamed from: a  reason: collision with root package name */
    public final String f8364a;

    /* renamed from: b  reason: collision with root package name */
    public CharSequence f8365b;

    /* renamed from: c  reason: collision with root package name */
    public int f8366c;

    /* renamed from: d  reason: collision with root package name */
    public String f8367d;

    /* renamed from: e  reason: collision with root package name */
    public String f8368e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f8369f;

    /* renamed from: g  reason: collision with root package name */
    public Uri f8370g;

    /* renamed from: h  reason: collision with root package name */
    public AudioAttributes f8371h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f8372i;

    /* renamed from: j  reason: collision with root package name */
    public int f8373j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f8374k;

    /* renamed from: l  reason: collision with root package name */
    public long[] f8375l;

    /* renamed from: m  reason: collision with root package name */
    public String f8376m;

    /* renamed from: n  reason: collision with root package name */
    public String f8377n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f8378o;

    /* renamed from: p  reason: collision with root package name */
    public int f8379p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f8380q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f8381r;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final c0 f8382a;

        public a(@m0 String str, int i10) {
            this.f8382a = new c0(str, i10);
        }

        @m0
        public c0 a() {
            return this.f8382a;
        }

        @m0
        public a b(@m0 String str, @m0 String str2) {
            if (Build.VERSION.SDK_INT >= 30) {
                c0 c0Var = this.f8382a;
                c0Var.f8376m = str;
                c0Var.f8377n = str2;
            }
            return this;
        }

        @m0
        public a c(@o0 String str) {
            this.f8382a.f8367d = str;
            return this;
        }

        @m0
        public a d(@o0 String str) {
            this.f8382a.f8368e = str;
            return this;
        }

        @m0
        public a e(int i10) {
            this.f8382a.f8366c = i10;
            return this;
        }

        @m0
        public a f(int i10) {
            this.f8382a.f8373j = i10;
            return this;
        }

        @m0
        public a g(boolean z10) {
            this.f8382a.f8372i = z10;
            return this;
        }

        @m0
        public a h(@o0 CharSequence charSequence) {
            this.f8382a.f8365b = charSequence;
            return this;
        }

        @m0
        public a i(boolean z10) {
            this.f8382a.f8369f = z10;
            return this;
        }

        @m0
        public a j(@o0 Uri uri, @o0 AudioAttributes audioAttributes) {
            c0 c0Var = this.f8382a;
            c0Var.f8370g = uri;
            c0Var.f8371h = audioAttributes;
            return this;
        }

        @m0
        public a k(boolean z10) {
            this.f8382a.f8374k = z10;
            return this;
        }

        @m0
        public a l(@o0 long[] jArr) {
            c0 c0Var = this.f8382a;
            c0Var.f8374k = jArr != null && jArr.length > 0;
            c0Var.f8375l = jArr;
            return this;
        }
    }

    @t0(26)
    public c0(@m0 NotificationChannel notificationChannel) {
        this(notificationChannel.getId(), notificationChannel.getImportance());
        this.f8365b = notificationChannel.getName();
        this.f8367d = notificationChannel.getDescription();
        this.f8368e = notificationChannel.getGroup();
        this.f8369f = notificationChannel.canShowBadge();
        this.f8370g = notificationChannel.getSound();
        this.f8371h = notificationChannel.getAudioAttributes();
        this.f8372i = notificationChannel.shouldShowLights();
        this.f8373j = notificationChannel.getLightColor();
        this.f8374k = notificationChannel.shouldVibrate();
        this.f8375l = notificationChannel.getVibrationPattern();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f8376m = notificationChannel.getParentChannelId();
            this.f8377n = notificationChannel.getConversationId();
        }
        this.f8378o = notificationChannel.canBypassDnd();
        this.f8379p = notificationChannel.getLockscreenVisibility();
        if (i10 >= 29) {
            this.f8380q = notificationChannel.canBubble();
        }
        if (i10 >= 30) {
            this.f8381r = notificationChannel.isImportantConversation();
        }
    }

    public c0(@m0 String str, int i10) {
        this.f8369f = true;
        this.f8370g = Settings.System.DEFAULT_NOTIFICATION_URI;
        this.f8373j = 0;
        this.f8364a = (String) n.g(str);
        this.f8366c = i10;
        this.f8371h = Notification.AUDIO_ATTRIBUTES_DEFAULT;
    }

    public boolean a() {
        return this.f8380q;
    }

    public boolean b() {
        return this.f8378o;
    }

    public boolean c() {
        return this.f8369f;
    }

    @o0
    public AudioAttributes d() {
        return this.f8371h;
    }

    @o0
    public String e() {
        return this.f8377n;
    }

    @o0
    public String f() {
        return this.f8367d;
    }

    @o0
    public String g() {
        return this.f8368e;
    }

    @m0
    public String h() {
        return this.f8364a;
    }

    public int i() {
        return this.f8366c;
    }

    public int j() {
        return this.f8373j;
    }

    public int k() {
        return this.f8379p;
    }

    @o0
    public CharSequence l() {
        return this.f8365b;
    }

    public NotificationChannel m() {
        String str;
        String str2;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            return null;
        }
        NotificationChannel notificationChannel = new NotificationChannel(this.f8364a, this.f8365b, this.f8366c);
        notificationChannel.setDescription(this.f8367d);
        notificationChannel.setGroup(this.f8368e);
        notificationChannel.setShowBadge(this.f8369f);
        notificationChannel.setSound(this.f8370g, this.f8371h);
        notificationChannel.enableLights(this.f8372i);
        notificationChannel.setLightColor(this.f8373j);
        notificationChannel.setVibrationPattern(this.f8375l);
        notificationChannel.enableVibration(this.f8374k);
        if (!(i10 < 30 || (str = this.f8376m) == null || (str2 = this.f8377n) == null)) {
            notificationChannel.setConversationId(str, str2);
        }
        return notificationChannel;
    }

    @o0
    public String n() {
        return this.f8376m;
    }

    @o0
    public Uri o() {
        return this.f8370g;
    }

    @o0
    public long[] p() {
        return this.f8375l;
    }

    public boolean q() {
        return this.f8381r;
    }

    public boolean r() {
        return this.f8372i;
    }

    public boolean s() {
        return this.f8374k;
    }

    @m0
    public a t() {
        return new a(this.f8364a, this.f8366c).h(this.f8365b).c(this.f8367d).d(this.f8368e).i(this.f8369f).j(this.f8370g, this.f8371h).g(this.f8372i).f(this.f8373j).k(this.f8374k).l(this.f8375l).b(this.f8376m, this.f8377n);
    }
}
