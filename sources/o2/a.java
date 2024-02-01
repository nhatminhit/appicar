package o2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import d.m0;
import java.util.ArrayList;
import java.util.HashMap;

public final class a {

    /* renamed from: f  reason: collision with root package name */
    public static final String f11035f = "LocalBroadcastManager";

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f11036g = false;

    /* renamed from: h  reason: collision with root package name */
    public static final int f11037h = 1;

    /* renamed from: i  reason: collision with root package name */
    public static final Object f11038i = new Object();

    /* renamed from: j  reason: collision with root package name */
    public static a f11039j;

    /* renamed from: a  reason: collision with root package name */
    public final Context f11040a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap<BroadcastReceiver, ArrayList<c>> f11041b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap<String, ArrayList<c>> f11042c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList<b> f11043d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    public final Handler f11044e;

    /* renamed from: o2.a$a  reason: collision with other inner class name */
    public class C0189a extends Handler {
        public C0189a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                a.this.a();
            }
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Intent f11046a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<c> f11047b;

        public b(Intent intent, ArrayList<c> arrayList) {
            this.f11046a = intent;
            this.f11047b = arrayList;
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final IntentFilter f11048a;

        /* renamed from: b  reason: collision with root package name */
        public final BroadcastReceiver f11049b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f11050c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f11051d;

        public c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f11048a = intentFilter;
            this.f11049b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(128);
            sb2.append("Receiver{");
            sb2.append(this.f11049b);
            sb2.append(" filter=");
            sb2.append(this.f11048a);
            if (this.f11051d) {
                sb2.append(" DEAD");
            }
            sb2.append(p7.a.f11639j);
            return sb2.toString();
        }
    }

    public a(Context context) {
        this.f11040a = context;
        this.f11044e = new C0189a(context.getMainLooper());
    }

    @m0
    public static a b(@m0 Context context) {
        a aVar;
        synchronized (f11038i) {
            if (f11039j == null) {
                f11039j = new a(context.getApplicationContext());
            }
            aVar = f11039j;
        }
        return aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        if (r3 >= r1) goto L_0x0000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        r4 = r2[r3];
        r5 = r4.f11047b.size();
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        if (r6 >= r5) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        r7 = r4.f11047b.get(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        if (r7.f11051d != false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        r7.f11049b.onReceive(r10.f11040a, r4.f11046a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        r3 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a() {
        /*
            r10 = this;
        L_0x0000:
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<o2.a$c>> r0 = r10.f11041b
            monitor-enter(r0)
            java.util.ArrayList<o2.a$b> r1 = r10.f11043d     // Catch:{ all -> 0x0044 }
            int r1 = r1.size()     // Catch:{ all -> 0x0044 }
            if (r1 > 0) goto L_0x000d
            monitor-exit(r0)     // Catch:{ all -> 0x0044 }
            return
        L_0x000d:
            o2.a$b[] r2 = new o2.a.b[r1]     // Catch:{ all -> 0x0044 }
            java.util.ArrayList<o2.a$b> r3 = r10.f11043d     // Catch:{ all -> 0x0044 }
            r3.toArray(r2)     // Catch:{ all -> 0x0044 }
            java.util.ArrayList<o2.a$b> r3 = r10.f11043d     // Catch:{ all -> 0x0044 }
            r3.clear()     // Catch:{ all -> 0x0044 }
            monitor-exit(r0)     // Catch:{ all -> 0x0044 }
            r0 = 0
            r3 = r0
        L_0x001c:
            if (r3 >= r1) goto L_0x0000
            r4 = r2[r3]
            java.util.ArrayList<o2.a$c> r5 = r4.f11047b
            int r5 = r5.size()
            r6 = r0
        L_0x0027:
            if (r6 >= r5) goto L_0x0041
            java.util.ArrayList<o2.a$c> r7 = r4.f11047b
            java.lang.Object r7 = r7.get(r6)
            o2.a$c r7 = (o2.a.c) r7
            boolean r8 = r7.f11051d
            if (r8 != 0) goto L_0x003e
            android.content.BroadcastReceiver r7 = r7.f11049b
            android.content.Context r8 = r10.f11040a
            android.content.Intent r9 = r4.f11046a
            r7.onReceive(r8, r9)
        L_0x003e:
            int r6 = r6 + 1
            goto L_0x0027
        L_0x0041:
            int r3 = r3 + 1
            goto L_0x001c
        L_0x0044:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0044 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.a.a():void");
    }

    public void c(@m0 BroadcastReceiver broadcastReceiver, @m0 IntentFilter intentFilter) {
        synchronized (this.f11041b) {
            c cVar = new c(intentFilter, broadcastReceiver);
            ArrayList arrayList = this.f11041b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                this.f11041b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(cVar);
            for (int i10 = 0; i10 < intentFilter.countActions(); i10++) {
                String action = intentFilter.getAction(i10);
                ArrayList arrayList2 = this.f11042c.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    this.f11042c.put(action, arrayList2);
                }
                arrayList2.add(cVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x013f, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0141, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean d(@d.m0 android.content.Intent r23) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            java.util.HashMap<android.content.BroadcastReceiver, java.util.ArrayList<o2.a$c>> r2 = r1.f11041b
            monitor-enter(r2)
            java.lang.String r10 = r23.getAction()     // Catch:{ all -> 0x0143 }
            android.content.Context r3 = r1.f11040a     // Catch:{ all -> 0x0143 }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ all -> 0x0143 }
            java.lang.String r11 = r0.resolveTypeIfNeeded(r3)     // Catch:{ all -> 0x0143 }
            android.net.Uri r12 = r23.getData()     // Catch:{ all -> 0x0143 }
            java.lang.String r13 = r23.getScheme()     // Catch:{ all -> 0x0143 }
            java.util.Set r14 = r23.getCategories()     // Catch:{ all -> 0x0143 }
            int r3 = r23.getFlags()     // Catch:{ all -> 0x0143 }
            r3 = r3 & 8
            r9 = 1
            if (r3 == 0) goto L_0x002d
            r16 = r9
            goto L_0x002f
        L_0x002d:
            r16 = 0
        L_0x002f:
            if (r16 == 0) goto L_0x004e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0143 }
            r3.<init>()     // Catch:{ all -> 0x0143 }
            java.lang.String r4 = "Resolving type "
            r3.append(r4)     // Catch:{ all -> 0x0143 }
            r3.append(r11)     // Catch:{ all -> 0x0143 }
            java.lang.String r4 = " scheme "
            r3.append(r4)     // Catch:{ all -> 0x0143 }
            r3.append(r13)     // Catch:{ all -> 0x0143 }
            java.lang.String r4 = " of intent "
            r3.append(r4)     // Catch:{ all -> 0x0143 }
            r3.append(r0)     // Catch:{ all -> 0x0143 }
        L_0x004e:
            java.util.HashMap<java.lang.String, java.util.ArrayList<o2.a$c>> r3 = r1.f11042c     // Catch:{ all -> 0x0143 }
            java.lang.String r4 = r23.getAction()     // Catch:{ all -> 0x0143 }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x0143 }
            r8 = r3
            java.util.ArrayList r8 = (java.util.ArrayList) r8     // Catch:{ all -> 0x0143 }
            if (r8 == 0) goto L_0x0140
            if (r16 == 0) goto L_0x006c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0143 }
            r3.<init>()     // Catch:{ all -> 0x0143 }
            java.lang.String r4 = "Action list: "
            r3.append(r4)     // Catch:{ all -> 0x0143 }
            r3.append(r8)     // Catch:{ all -> 0x0143 }
        L_0x006c:
            r3 = 0
            r7 = r3
            r6 = 0
        L_0x006f:
            int r3 = r8.size()     // Catch:{ all -> 0x0143 }
            if (r6 >= r3) goto L_0x0110
            java.lang.Object r3 = r8.get(r6)     // Catch:{ all -> 0x0143 }
            r5 = r3
            o2.a$c r5 = (o2.a.c) r5     // Catch:{ all -> 0x0143 }
            if (r16 == 0) goto L_0x008d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0143 }
            r3.<init>()     // Catch:{ all -> 0x0143 }
            java.lang.String r4 = "Matching against filter "
            r3.append(r4)     // Catch:{ all -> 0x0143 }
            android.content.IntentFilter r4 = r5.f11048a     // Catch:{ all -> 0x0143 }
            r3.append(r4)     // Catch:{ all -> 0x0143 }
        L_0x008d:
            boolean r3 = r5.f11050c     // Catch:{ all -> 0x0143 }
            if (r3 == 0) goto L_0x009d
            r18 = r6
            r20 = r8
            r19 = r10
            r21 = r11
            r10 = r7
            r11 = r9
            goto L_0x0104
        L_0x009d:
            android.content.IntentFilter r3 = r5.f11048a     // Catch:{ all -> 0x0143 }
            java.lang.String r17 = "LocalBroadcastManager"
            r4 = r10
            r15 = r5
            r5 = r11
            r18 = r6
            r6 = r13
            r19 = r10
            r10 = r7
            r7 = r12
            r20 = r8
            r8 = r14
            r21 = r11
            r11 = r9
            r9 = r17
            int r3 = r3.match(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0143 }
            if (r3 < 0) goto L_0x00db
            if (r16 == 0) goto L_0x00cc
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0143 }
            r4.<init>()     // Catch:{ all -> 0x0143 }
            java.lang.String r5 = "  Filter matched!  match=0x"
            r4.append(r5)     // Catch:{ all -> 0x0143 }
            java.lang.String r3 = java.lang.Integer.toHexString(r3)     // Catch:{ all -> 0x0143 }
            r4.append(r3)     // Catch:{ all -> 0x0143 }
        L_0x00cc:
            if (r10 != 0) goto L_0x00d4
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x0143 }
            r7.<init>()     // Catch:{ all -> 0x0143 }
            goto L_0x00d5
        L_0x00d4:
            r7 = r10
        L_0x00d5:
            r7.add(r15)     // Catch:{ all -> 0x0143 }
            r15.f11050c = r11     // Catch:{ all -> 0x0143 }
            goto L_0x0105
        L_0x00db:
            if (r16 == 0) goto L_0x0104
            r4 = -4
            if (r3 == r4) goto L_0x00f5
            r4 = -3
            if (r3 == r4) goto L_0x00f2
            r4 = -2
            if (r3 == r4) goto L_0x00ef
            r4 = -1
            if (r3 == r4) goto L_0x00ec
            java.lang.String r3 = "unknown reason"
            goto L_0x00f7
        L_0x00ec:
            java.lang.String r3 = "type"
            goto L_0x00f7
        L_0x00ef:
            java.lang.String r3 = "data"
            goto L_0x00f7
        L_0x00f2:
            java.lang.String r3 = "action"
            goto L_0x00f7
        L_0x00f5:
            java.lang.String r3 = "category"
        L_0x00f7:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0143 }
            r4.<init>()     // Catch:{ all -> 0x0143 }
            java.lang.String r5 = "  Filter did not match: "
            r4.append(r5)     // Catch:{ all -> 0x0143 }
            r4.append(r3)     // Catch:{ all -> 0x0143 }
        L_0x0104:
            r7 = r10
        L_0x0105:
            int r6 = r18 + 1
            r9 = r11
            r10 = r19
            r8 = r20
            r11 = r21
            goto L_0x006f
        L_0x0110:
            r10 = r7
            r11 = r9
            if (r10 == 0) goto L_0x0140
            r3 = 0
        L_0x0115:
            int r4 = r10.size()     // Catch:{ all -> 0x0143 }
            if (r3 >= r4) goto L_0x0127
            java.lang.Object r4 = r10.get(r3)     // Catch:{ all -> 0x0143 }
            o2.a$c r4 = (o2.a.c) r4     // Catch:{ all -> 0x0143 }
            r5 = 0
            r4.f11050c = r5     // Catch:{ all -> 0x0143 }
            int r3 = r3 + 1
            goto L_0x0115
        L_0x0127:
            java.util.ArrayList<o2.a$b> r3 = r1.f11043d     // Catch:{ all -> 0x0143 }
            o2.a$b r4 = new o2.a$b     // Catch:{ all -> 0x0143 }
            r4.<init>(r0, r10)     // Catch:{ all -> 0x0143 }
            r3.add(r4)     // Catch:{ all -> 0x0143 }
            android.os.Handler r0 = r1.f11044e     // Catch:{ all -> 0x0143 }
            boolean r0 = r0.hasMessages(r11)     // Catch:{ all -> 0x0143 }
            if (r0 != 0) goto L_0x013e
            android.os.Handler r0 = r1.f11044e     // Catch:{ all -> 0x0143 }
            r0.sendEmptyMessage(r11)     // Catch:{ all -> 0x0143 }
        L_0x013e:
            monitor-exit(r2)     // Catch:{ all -> 0x0143 }
            return r11
        L_0x0140:
            monitor-exit(r2)     // Catch:{ all -> 0x0143 }
            r0 = 0
            return r0
        L_0x0143:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0143 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.a.d(android.content.Intent):boolean");
    }

    public void e(@m0 Intent intent) {
        if (d(intent)) {
            a();
        }
    }

    public void f(@m0 BroadcastReceiver broadcastReceiver) {
        synchronized (this.f11041b) {
            ArrayList remove = this.f11041b.remove(broadcastReceiver);
            if (remove != null) {
                for (int size = remove.size() - 1; size >= 0; size--) {
                    c cVar = (c) remove.get(size);
                    cVar.f11051d = true;
                    for (int i10 = 0; i10 < cVar.f11048a.countActions(); i10++) {
                        String action = cVar.f11048a.getAction(i10);
                        ArrayList arrayList = this.f11042c.get(action);
                        if (arrayList != null) {
                            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                c cVar2 = (c) arrayList.get(size2);
                                if (cVar2.f11049b == broadcastReceiver) {
                                    cVar2.f11051d = true;
                                    arrayList.remove(size2);
                                }
                            }
                            if (arrayList.size() <= 0) {
                                this.f11042c.remove(action);
                            }
                        }
                    }
                }
            }
        }
    }
}
