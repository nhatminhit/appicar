package h0;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.os.Build;
import d.m0;
import d.o0;
import d.t0;
import e1.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class g0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f8386a;

    /* renamed from: b  reason: collision with root package name */
    public CharSequence f8387b;

    /* renamed from: c  reason: collision with root package name */
    public String f8388c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f8389d;

    /* renamed from: e  reason: collision with root package name */
    public List<c0> f8390e;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final g0 f8391a;

        public a(@m0 String str) {
            this.f8391a = new g0(str);
        }

        @m0
        public g0 a() {
            return this.f8391a;
        }

        @m0
        public a b(@o0 String str) {
            this.f8391a.f8388c = str;
            return this;
        }

        @m0
        public a c(@o0 CharSequence charSequence) {
            this.f8391a.f8387b = charSequence;
            return this;
        }
    }

    @t0(28)
    public g0(@m0 NotificationChannelGroup notificationChannelGroup) {
        this(notificationChannelGroup, Collections.emptyList());
    }

    @t0(26)
    public g0(@m0 NotificationChannelGroup notificationChannelGroup, @m0 List<NotificationChannel> list) {
        this(notificationChannelGroup.getId());
        List<c0> list2;
        this.f8387b = notificationChannelGroup.getName();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            this.f8388c = notificationChannelGroup.getDescription();
        }
        if (i10 >= 28) {
            this.f8389d = notificationChannelGroup.isBlocked();
            list2 = b(notificationChannelGroup.getChannels());
        } else {
            list2 = b(list);
        }
        this.f8390e = list2;
    }

    public g0(@m0 String str) {
        this.f8390e = Collections.emptyList();
        this.f8386a = (String) n.g(str);
    }

    @m0
    public List<c0> a() {
        return this.f8390e;
    }

    @t0(26)
    public final List<c0> b(List<NotificationChannel> list) {
        ArrayList arrayList = new ArrayList();
        for (NotificationChannel next : list) {
            if (this.f8386a.equals(next.getGroup())) {
                arrayList.add(new c0(next));
            }
        }
        return arrayList;
    }

    @o0
    public String c() {
        return this.f8388c;
    }

    @m0
    public String d() {
        return this.f8386a;
    }

    @o0
    public CharSequence e() {
        return this.f8387b;
    }

    public NotificationChannelGroup f() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            return null;
        }
        NotificationChannelGroup notificationChannelGroup = new NotificationChannelGroup(this.f8386a, this.f8387b);
        if (i10 >= 28) {
            notificationChannelGroup.setDescription(this.f8388c);
        }
        return notificationChannelGroup;
    }

    public boolean g() {
        return this.f8389d;
    }

    @m0
    public a h() {
        return new a(this.f8386a).c(this.f8387b).b(this.f8388c);
    }
}
