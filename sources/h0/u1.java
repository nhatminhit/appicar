package h0;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.collection.b;
import androidx.core.graphics.drawable.IconCompat;
import d.o0;
import d.x0;
import h0.u0;
import i0.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@x0({x0.a.LIBRARY_GROUP_PREFIX})
public class u1 implements w {

    /* renamed from: a  reason: collision with root package name */
    public final Context f8726a;

    /* renamed from: b  reason: collision with root package name */
    public final Notification.Builder f8727b;

    /* renamed from: c  reason: collision with root package name */
    public final u0.g f8728c;

    /* renamed from: d  reason: collision with root package name */
    public RemoteViews f8729d;

    /* renamed from: e  reason: collision with root package name */
    public RemoteViews f8730e;

    /* renamed from: f  reason: collision with root package name */
    public final List<Bundle> f8731f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public final Bundle f8732g = new Bundle();

    /* renamed from: h  reason: collision with root package name */
    public int f8733h;

    /* renamed from: i  reason: collision with root package name */
    public RemoteViews f8734i;

    public u1(u0.g gVar) {
        this.f8728c = gVar;
        this.f8726a = gVar.f8617a;
        this.f8727b = Build.VERSION.SDK_INT >= 26 ? new Notification.Builder(gVar.f8617a, gVar.L) : new Notification.Builder(gVar.f8617a);
        Notification notification = gVar.T;
        this.f8727b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, gVar.f8625i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(gVar.f8621e).setContentText(gVar.f8622f).setContentInfo(gVar.f8627k).setContentIntent(gVar.f8623g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(gVar.f8624h, (notification.flags & 128) != 0).setLargeIcon(gVar.f8626j).setNumber(gVar.f8628l).setProgress(gVar.f8637u, gVar.f8638v, gVar.f8639w);
        this.f8727b.setSubText(gVar.f8634r).setUsesChronometer(gVar.f8631o).setPriority(gVar.f8629m);
        Iterator<u0.b> it = gVar.f8618b.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
        Bundle bundle = gVar.E;
        if (bundle != null) {
            this.f8732g.putAll(bundle);
        }
        int i10 = Build.VERSION.SDK_INT;
        this.f8729d = gVar.I;
        this.f8730e = gVar.J;
        this.f8727b.setShowWhen(gVar.f8630n);
        this.f8727b.setLocalOnly(gVar.A).setGroup(gVar.f8640x).setGroupSummary(gVar.f8641y).setSortKey(gVar.f8642z);
        this.f8733h = gVar.Q;
        this.f8727b.setCategory(gVar.D).setColor(gVar.F).setVisibility(gVar.G).setPublicVersion(gVar.H).setSound(notification.sound, notification.audioAttributes);
        List<String> e10 = i10 < 28 ? e(g(gVar.f8619c), gVar.W) : gVar.W;
        if (e10 != null && !e10.isEmpty()) {
            for (String addPerson : e10) {
                this.f8727b.addPerson(addPerson);
            }
        }
        this.f8734i = gVar.K;
        if (gVar.f8620d.size() > 0) {
            Bundle bundle2 = gVar.t().getBundle(u0.h.f8643d);
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i11 = 0; i11 < gVar.f8620d.size(); i11++) {
                bundle4.putBundle(Integer.toString(i11), w1.j(gVar.f8620d.get(i11)));
            }
            bundle2.putBundle(u0.h.f8647h, bundle4);
            bundle3.putBundle(u0.h.f8647h, bundle4);
            gVar.t().putBundle(u0.h.f8643d, bundle2);
            this.f8732g.putBundle(u0.h.f8643d, bundle3);
        }
        int i12 = Build.VERSION.SDK_INT;
        Icon icon = gVar.V;
        if (icon != null) {
            this.f8727b.setSmallIcon(icon);
        }
        if (i12 >= 24) {
            Notification.Builder unused = this.f8727b.setExtras(gVar.E).setRemoteInputHistory(gVar.f8636t);
            RemoteViews remoteViews = gVar.I;
            if (remoteViews != null) {
                Notification.Builder unused2 = this.f8727b.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = gVar.J;
            if (remoteViews2 != null) {
                Notification.Builder unused3 = this.f8727b.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = gVar.K;
            if (remoteViews3 != null) {
                Notification.Builder unused4 = this.f8727b.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (i12 >= 26) {
            Notification.Builder unused5 = this.f8727b.setBadgeIconType(gVar.M).setSettingsText(gVar.f8635s).setShortcutId(gVar.N).setTimeoutAfter(gVar.P).setGroupAlertBehavior(gVar.Q);
            if (gVar.C) {
                Notification.Builder unused6 = this.f8727b.setColorized(gVar.B);
            }
            if (!TextUtils.isEmpty(gVar.L)) {
                this.f8727b.setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
            }
        }
        if (i12 >= 28) {
            Iterator<l2> it2 = gVar.f8619c.iterator();
            while (it2.hasNext()) {
                Notification.Builder unused7 = this.f8727b.addPerson(it2.next().k());
            }
        }
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 29) {
            Notification.Builder unused8 = this.f8727b.setAllowSystemGeneratedContextualActions(gVar.R);
            Notification.Builder unused9 = this.f8727b.setBubbleMetadata(u0.f.k(gVar.S));
            m mVar = gVar.O;
            if (mVar != null) {
                Notification.Builder unused10 = this.f8727b.setLocusId(mVar.c());
            }
        }
        if (gVar.U) {
            if (this.f8728c.f8641y) {
                this.f8733h = 2;
            } else {
                this.f8733h = 1;
            }
            this.f8727b.setVibrate((long[]) null);
            this.f8727b.setSound((Uri) null);
            int i14 = notification.defaults & -2 & -3;
            notification.defaults = i14;
            this.f8727b.setDefaults(i14);
            if (i13 >= 26) {
                if (TextUtils.isEmpty(this.f8728c.f8640x)) {
                    this.f8727b.setGroup(u0.N0);
                }
                Notification.Builder unused11 = this.f8727b.setGroupAlertBehavior(this.f8733h);
            }
        }
    }

    @o0
    public static List<String> e(@o0 List<String> list, @o0 List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        b bVar = new b(list.size() + list2.size());
        bVar.addAll(list);
        bVar.addAll(list2);
        return new ArrayList(bVar);
    }

    @o0
    public static List<String> g(@o0 List<l2> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (l2 j10 : list) {
            arrayList.add(j10.j());
        }
        return arrayList;
    }

    public Notification.Builder a() {
        return this.f8727b;
    }

    public final void b(u0.b bVar) {
        IconCompat f10 = bVar.f();
        Notification.Action.Builder builder = new Notification.Action.Builder(f10 != null ? f10.Q() : null, bVar.j(), bVar.a());
        if (bVar.g() != null) {
            for (RemoteInput addRemoteInput : v2.d(bVar.g())) {
                builder.addRemoteInput(addRemoteInput);
            }
        }
        Bundle bundle = bVar.d() != null ? new Bundle(bVar.d()) : new Bundle();
        bundle.putBoolean(w1.f8769c, bVar.b());
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 24) {
            Notification.Action.Builder unused = builder.setAllowGeneratedReplies(bVar.b());
        }
        bundle.putInt(u0.b.f8561x, bVar.h());
        if (i10 >= 28) {
            Notification.Action.Builder unused2 = builder.setSemanticAction(bVar.h());
        }
        if (i10 >= 29) {
            Notification.Action.Builder unused3 = builder.setContextual(bVar.k());
        }
        bundle.putBoolean(u0.b.f8560w, bVar.i());
        builder.addExtras(bundle);
        this.f8727b.addAction(builder.build());
    }

    public Notification c() {
        Bundle n10;
        RemoteViews x10;
        RemoteViews v10;
        u0.p pVar = this.f8728c.f8633q;
        if (pVar != null) {
            pVar.b(this);
        }
        RemoteViews w10 = pVar != null ? pVar.w(this) : null;
        Notification d10 = d();
        if (!(w10 == null && (w10 = this.f8728c.I) == null)) {
            d10.contentView = w10;
        }
        if (!(pVar == null || (v10 = pVar.v(this)) == null)) {
            d10.bigContentView = v10;
        }
        if (!(pVar == null || (x10 = this.f8728c.f8633q.x(this)) == null)) {
            d10.headsUpContentView = x10;
        }
        if (!(pVar == null || (n10 = u0.n(d10)) == null)) {
            pVar.a(n10);
        }
        return d10;
    }

    public Notification d() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            return this.f8727b.build();
        }
        if (i10 >= 24) {
            Notification build = this.f8727b.build();
            if (this.f8733h != 0) {
                if (!(build.getGroup() == null || (build.flags & 512) == 0 || this.f8733h != 2)) {
                    h(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && this.f8733h == 1) {
                    h(build);
                }
            }
            return build;
        }
        this.f8727b.setExtras(this.f8732g);
        Notification build2 = this.f8727b.build();
        RemoteViews remoteViews = this.f8729d;
        if (remoteViews != null) {
            build2.contentView = remoteViews;
        }
        RemoteViews remoteViews2 = this.f8730e;
        if (remoteViews2 != null) {
            build2.bigContentView = remoteViews2;
        }
        RemoteViews remoteViews3 = this.f8734i;
        if (remoteViews3 != null) {
            build2.headsUpContentView = remoteViews3;
        }
        if (this.f8733h != 0) {
            if (!(build2.getGroup() == null || (build2.flags & 512) == 0 || this.f8733h != 2)) {
                h(build2);
            }
            if (build2.getGroup() != null && (build2.flags & 512) == 0 && this.f8733h == 1) {
                h(build2);
            }
        }
        return build2;
    }

    public Context f() {
        return this.f8726a;
    }

    public final void h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults = notification.defaults & -2 & -3;
    }
}
