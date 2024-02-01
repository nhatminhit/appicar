package z6;

import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.SparseIntArray;
import b6.i;
import b6.s0;
import b6.u0;
import b6.x0;
import b7.o0;
import b7.w;
import b7.y;
import com.google.android.exoplayer2.offline.DownloadRequest;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.d;
import com.google.android.exoplayer2.trackselection.f;
import d.o0;
import h6.n;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import q7.o;
import t7.d;
import t7.l;
import t7.p;
import t7.r0;
import w7.q0;

public final class l {

    /* renamed from: p  reason: collision with root package name */
    public static final DefaultTrackSelector.Parameters f15952p = new DefaultTrackSelector.d().w(true).a();

    /* renamed from: q  reason: collision with root package name */
    public static final f f15953q = z("com.google.android.exoplayer2.source.dash.DashMediaSource$Factory");

    /* renamed from: r  reason: collision with root package name */
    public static final f f15954r = z("com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource$Factory");

    /* renamed from: s  reason: collision with root package name */
    public static final f f15955s = z("com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory");

    /* renamed from: a  reason: collision with root package name */
    public final String f15956a;

    /* renamed from: b  reason: collision with root package name */
    public final Uri f15957b;
    @o0

    /* renamed from: c  reason: collision with root package name */
    public final String f15958c;
    @o0

    /* renamed from: d  reason: collision with root package name */
    public final y f15959d;

    /* renamed from: e  reason: collision with root package name */
    public final DefaultTrackSelector f15960e;

    /* renamed from: f  reason: collision with root package name */
    public final s0[] f15961f;

    /* renamed from: g  reason: collision with root package name */
    public final SparseIntArray f15962g = new SparseIntArray();

    /* renamed from: h  reason: collision with root package name */
    public final Handler f15963h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f15964i;

    /* renamed from: j  reason: collision with root package name */
    public b f15965j;

    /* renamed from: k  reason: collision with root package name */
    public e f15966k;

    /* renamed from: l  reason: collision with root package name */
    public TrackGroupArray[] f15967l;

    /* renamed from: m  reason: collision with root package name */
    public d.a[] f15968m;

    /* renamed from: n  reason: collision with root package name */
    public List<com.google.android.exoplayer2.trackselection.f>[][] f15969n;

    /* renamed from: o  reason: collision with root package name */
    public List<com.google.android.exoplayer2.trackselection.f>[][] f15970o;

    public interface b {
        void a(l lVar);

        void b(l lVar, IOException iOException);
    }

    public static final class c extends q7.a {

        public static final class a implements f.b {
            public a() {
            }

            public com.google.android.exoplayer2.trackselection.f[] a(f.a[] aVarArr, t7.d dVar) {
                com.google.android.exoplayer2.trackselection.f[] fVarArr = new com.google.android.exoplayer2.trackselection.f[aVarArr.length];
                for (int i10 = 0; i10 < aVarArr.length; i10++) {
                    f.a aVar = aVarArr[i10];
                    fVarArr[i10] = aVar == null ? null : new c(aVar.f5442a, aVar.f5443b);
                }
                return fVarArr;
            }

            public /* synthetic */ com.google.android.exoplayer2.trackselection.f b(TrackGroup trackGroup, t7.d dVar, int... iArr) {
                return q7.l.a(this, trackGroup, dVar, iArr);
            }
        }

        public c(TrackGroup trackGroup, int[] iArr) {
            super(trackGroup, iArr);
        }

        public int b() {
            return 0;
        }

        public int m() {
            return 0;
        }

        @o0
        public Object p() {
            return null;
        }
    }

    public static final class d implements t7.d {
        public d() {
        }

        public void b(Handler handler, d.a aVar) {
        }

        @o0
        public r0 e() {
            return null;
        }

        public void f(d.a aVar) {
        }

        public long g() {
            return 0;
        }
    }

    public static final class e implements y.b, w.a, Handler.Callback {
        public static final int Z = 0;

        /* renamed from: a0  reason: collision with root package name */
        public static final int f15971a0 = 1;

        /* renamed from: b0  reason: collision with root package name */
        public static final int f15972b0 = 2;

        /* renamed from: c0  reason: collision with root package name */
        public static final int f15973c0 = 3;

        /* renamed from: d0  reason: collision with root package name */
        public static final int f15974d0 = 0;

        /* renamed from: e0  reason: collision with root package name */
        public static final int f15975e0 = 1;
        public final y O;
        public final l P;
        public final t7.b Q = new p(true, 65536);
        public final ArrayList<w> R = new ArrayList<>();
        public final Handler S = q0.y(new m(this));
        public final HandlerThread T;
        public final Handler U;
        @o0
        public Object V;
        public x0 W;
        public w[] X;
        public boolean Y;

        public e(y yVar, l lVar) {
            this.O = yVar;
            this.P = lVar;
            HandlerThread handlerThread = new HandlerThread("DownloadHelper");
            this.T = handlerThread;
            handlerThread.start();
            Handler z10 = q0.z(handlerThread.getLooper(), this);
            this.U = z10;
            z10.sendEmptyMessage(0);
        }

        public final boolean c(Message message) {
            if (this.Y) {
                return false;
            }
            int i10 = message.what;
            if (i10 == 0) {
                this.P.I();
                return true;
            } else if (i10 != 1) {
                return false;
            } else {
                e();
                this.P.H((IOException) q0.l(message.obj));
                return true;
            }
        }

        /* renamed from: d */
        public void k(w wVar) {
            if (this.R.contains(wVar)) {
                this.U.obtainMessage(2, wVar).sendToTarget();
            }
        }

        public void e() {
            if (!this.Y) {
                this.Y = true;
                this.U.sendEmptyMessage(3);
            }
        }

        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 != 0) {
                int i11 = 0;
                if (i10 == 1) {
                    try {
                        if (this.X == null) {
                            this.O.h();
                        } else {
                            while (i11 < this.R.size()) {
                                this.R.get(i11).o();
                                i11++;
                            }
                        }
                        this.U.sendEmptyMessageDelayed(1, 100);
                    } catch (IOException e10) {
                        this.S.obtainMessage(1, e10).sendToTarget();
                    }
                    return true;
                } else if (i10 == 2) {
                    w wVar = (w) message.obj;
                    if (this.R.contains(wVar)) {
                        wVar.d(0);
                    }
                    return true;
                } else if (i10 != 3) {
                    return false;
                } else {
                    w[] wVarArr = this.X;
                    if (wVarArr != null) {
                        int length = wVarArr.length;
                        while (i11 < length) {
                            this.O.i(wVarArr[i11]);
                            i11++;
                        }
                    }
                    this.O.b(this);
                    this.U.removeCallbacksAndMessages((Object) null);
                    this.T.quit();
                    return true;
                }
            } else {
                this.O.e(this, (r0) null);
                this.U.sendEmptyMessage(1);
                return true;
            }
        }

        public void i(w wVar) {
            this.R.remove(wVar);
            if (this.R.isEmpty()) {
                this.U.removeMessages(1);
                this.S.sendEmptyMessage(0);
            }
        }

        public void j(y yVar, x0 x0Var, @o0 Object obj) {
            w[] wVarArr;
            if (this.W == null) {
                this.W = x0Var;
                this.V = obj;
                this.X = new w[x0Var.i()];
                int i10 = 0;
                while (true) {
                    wVarArr = this.X;
                    if (i10 >= wVarArr.length) {
                        break;
                    }
                    w c10 = this.O.c(new y.a(x0Var.m(i10)), this.Q, 0);
                    this.X[i10] = c10;
                    this.R.add(c10);
                    i10++;
                }
                for (w n10 : wVarArr) {
                    n10.n(this, 0);
                }
            }
        }
    }

    public static final class f {
        @o0

        /* renamed from: a  reason: collision with root package name */
        public final Constructor<?> f15976a;
        @o0

        /* renamed from: b  reason: collision with root package name */
        public final Method f15977b;
        @o0

        /* renamed from: c  reason: collision with root package name */
        public final Method f15978c;

        public f(@o0 Constructor<?> constructor, @o0 Method method, @o0 Method method2) {
            this.f15976a = constructor;
            this.f15977b = method;
            this.f15978c = method2;
        }

        public final y b(Uri uri, l.a aVar, @o0 List<StreamKey> list) {
            Constructor<?> constructor = this.f15976a;
            if (constructor == null || this.f15977b == null || this.f15978c == null) {
                throw new IllegalStateException("Module missing to create media source.");
            }
            try {
                Object newInstance = constructor.newInstance(new Object[]{aVar});
                if (list != null) {
                    this.f15977b.invoke(newInstance, new Object[]{list});
                }
                return (y) w7.a.g(this.f15978c.invoke(newInstance, new Object[]{uri}));
            } catch (Exception e10) {
                throw new IllegalStateException("Failed to instantiate media source.", e10);
            }
        }
    }

    public l(String str, Uri uri, @o0 String str2, @o0 y yVar, DefaultTrackSelector.Parameters parameters, s0[] s0VarArr) {
        this.f15956a = str;
        this.f15957b = uri;
        this.f15958c = str2;
        this.f15959d = yVar;
        DefaultTrackSelector defaultTrackSelector = new DefaultTrackSelector((f.b) new c.a());
        this.f15960e = defaultTrackSelector;
        this.f15961f = s0VarArr;
        defaultTrackSelector.S(parameters);
        defaultTrackSelector.b(new h(), new d());
        this.f15963h = new Handler(q0.U());
    }

    public static /* synthetic */ void D() {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void E(IOException iOException) {
        ((b) w7.a.g(this.f15965j)).b(this, iOException);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void F() {
        ((b) w7.a.g(this.f15965j)).a(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void G(b bVar) {
        bVar.a(this);
    }

    public static y m(DownloadRequest downloadRequest, l.a aVar) {
        f fVar;
        String str = downloadRequest.P;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case 3680:
                if (str.equals(DownloadRequest.X)) {
                    c10 = 0;
                    break;
                }
                break;
            case 103407:
                if (str.equals(DownloadRequest.W)) {
                    c10 = 1;
                    break;
                }
                break;
            case 3075986:
                if (str.equals(DownloadRequest.V)) {
                    c10 = 2;
                    break;
                }
                break;
            case 1131547531:
                if (str.equals(DownloadRequest.U)) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                fVar = f15954r;
                break;
            case 1:
                fVar = f15955s;
                break;
            case 2:
                fVar = f15953q;
                break;
            case 3:
                return new o0.a(aVar).b(downloadRequest.Q);
            default:
                throw new IllegalStateException("Unsupported type: " + downloadRequest.P);
        }
        return fVar.b(downloadRequest.Q, aVar, downloadRequest.R);
    }

    public static l n(Uri uri, l.a aVar, u0 u0Var) {
        return o(uri, aVar, u0Var, (h6.l<n>) null, f15952p);
    }

    public static l o(Uri uri, l.a aVar, u0 u0Var, @d.o0 h6.l<n> lVar, DefaultTrackSelector.Parameters parameters) {
        return new l(DownloadRequest.V, uri, (String) null, f15953q.b(uri, aVar, (List<StreamKey>) null), parameters, q0.d0(u0Var, lVar));
    }

    public static l p(Uri uri, l.a aVar, u0 u0Var) {
        return q(uri, aVar, u0Var, (h6.l<n>) null, f15952p);
    }

    public static l q(Uri uri, l.a aVar, u0 u0Var, @d.o0 h6.l<n> lVar, DefaultTrackSelector.Parameters parameters) {
        return new l(DownloadRequest.W, uri, (String) null, f15955s.b(uri, aVar, (List<StreamKey>) null), parameters, q0.d0(u0Var, lVar));
    }

    public static l r(Uri uri) {
        return s(uri, (String) null);
    }

    public static l s(Uri uri, @d.o0 String str) {
        return new l(DownloadRequest.U, uri, str, (y) null, f15952p, new s0[0]);
    }

    public static l t(Uri uri, l.a aVar, u0 u0Var) {
        return u(uri, aVar, u0Var, (h6.l<n>) null, f15952p);
    }

    public static l u(Uri uri, l.a aVar, u0 u0Var, @d.o0 h6.l<n> lVar, DefaultTrackSelector.Parameters parameters) {
        return new l(DownloadRequest.X, uri, (String) null, f15954r.b(uri, aVar, (List<StreamKey>) null), parameters, q0.d0(u0Var, lVar));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0034, code lost:
        throw new java.lang.IllegalStateException(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002a, code lost:
        r3 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c A[ExcHandler: NoSuchMethodException | SecurityException (r7v2 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x0001] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static z6.l.f z(java.lang.String r7) {
        /*
            r0 = 0
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ ClassNotFoundException -> 0x0035, NoSuchMethodException -> 0x002e, SecurityException -> 0x002c }
            r1 = 1
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException -> 0x0035, NoSuchMethodException -> 0x002e, SecurityException -> 0x002c }
            java.lang.Class<t7.l$a> r3 = t7.l.a.class
            r4 = 0
            r2[r4] = r3     // Catch:{ ClassNotFoundException -> 0x0035, NoSuchMethodException -> 0x002e, SecurityException -> 0x002c }
            java.lang.reflect.Constructor r2 = r7.getConstructor(r2)     // Catch:{ ClassNotFoundException -> 0x0035, NoSuchMethodException -> 0x002e, SecurityException -> 0x002c }
            java.lang.String r3 = "setStreamKeys"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException -> 0x002a, NoSuchMethodException -> 0x002e, SecurityException -> 0x002c }
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r5[r4] = r6     // Catch:{ ClassNotFoundException -> 0x002a, NoSuchMethodException -> 0x002e, SecurityException -> 0x002c }
            java.lang.reflect.Method r3 = r7.getMethod(r3, r5)     // Catch:{ ClassNotFoundException -> 0x002a, NoSuchMethodException -> 0x002e, SecurityException -> 0x002c }
            java.lang.String r5 = "createMediaSource"
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch:{ ClassNotFoundException -> 0x0037, NoSuchMethodException -> 0x002e, SecurityException -> 0x002c }
            java.lang.Class<android.net.Uri> r6 = android.net.Uri.class
            r1[r4] = r6     // Catch:{ ClassNotFoundException -> 0x0037, NoSuchMethodException -> 0x002e, SecurityException -> 0x002c }
            java.lang.reflect.Method r0 = r7.getMethod(r5, r1)     // Catch:{ ClassNotFoundException -> 0x0037, NoSuchMethodException -> 0x002e, SecurityException -> 0x002c }
            goto L_0x0037
        L_0x002a:
            r3 = r0
            goto L_0x0037
        L_0x002c:
            r7 = move-exception
            goto L_0x002f
        L_0x002e:
            r7 = move-exception
        L_0x002f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r7)
            throw r0
        L_0x0035:
            r2 = r0
            r3 = r2
        L_0x0037:
            z6.l$f r7 = new z6.l$f
            r7.<init>(r2, r3, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: z6.l.z(java.lang.String):z6.l$f");
    }

    public int A() {
        if (this.f15959d == null) {
            return 0;
        }
        k();
        return this.f15967l.length;
    }

    public TrackGroupArray B(int i10) {
        k();
        return this.f15967l[i10];
    }

    public List<com.google.android.exoplayer2.trackselection.f> C(int i10, int i11) {
        k();
        return this.f15970o[i10][i11];
    }

    public final void H(IOException iOException) {
        ((Handler) w7.a.g(this.f15963h)).post(new i(this, iOException));
    }

    public final void I() {
        w7.a.g(this.f15966k);
        w7.a.g(this.f15966k.X);
        w7.a.g(this.f15966k.W);
        int length = this.f15966k.X.length;
        int length2 = this.f15961f.length;
        int[] iArr = new int[2];
        iArr[1] = length2;
        iArr[0] = length;
        this.f15969n = (List[][]) Array.newInstance(List.class, iArr);
        int[] iArr2 = new int[2];
        iArr2[1] = length2;
        iArr2[0] = length;
        this.f15970o = (List[][]) Array.newInstance(List.class, iArr2);
        for (int i10 = 0; i10 < length; i10++) {
            for (int i11 = 0; i11 < length2; i11++) {
                this.f15969n[i10][i11] = new ArrayList();
                this.f15970o[i10][i11] = Collections.unmodifiableList(this.f15969n[i10][i11]);
            }
        }
        this.f15967l = new TrackGroupArray[length];
        this.f15968m = new d.a[length];
        for (int i12 = 0; i12 < length; i12++) {
            this.f15967l[i12] = this.f15966k.X[i12].t();
            this.f15960e.d(M(i12).f12039d);
            this.f15968m[i12] = (d.a) w7.a.g(this.f15960e.g());
        }
        N();
        ((Handler) w7.a.g(this.f15963h)).post(new j(this));
    }

    public void J(b bVar) {
        w7.a.i(this.f15965j == null);
        this.f15965j = bVar;
        y yVar = this.f15959d;
        if (yVar != null) {
            this.f15966k = new e(yVar, this);
        } else {
            this.f15963h.post(new k(this, bVar));
        }
    }

    public void K() {
        e eVar = this.f15966k;
        if (eVar != null) {
            eVar.e();
        }
    }

    public void L(int i10, DefaultTrackSelector.Parameters parameters) {
        l(i10);
        i(i10, parameters);
    }

    @RequiresNonNull({"trackGroupArrays", "trackSelectionsByPeriodAndRenderer", "mediaPreparer", "mediaPreparer.timeline"})
    public final o M(int i10) {
        boolean z10;
        try {
            o e10 = this.f15960e.e(this.f15961f, this.f15967l[i10], new y.a(this.f15966k.W.m(i10)), this.f15966k.W);
            for (int i11 = 0; i11 < e10.f12036a; i11++) {
                com.google.android.exoplayer2.trackselection.f a10 = e10.f12038c.a(i11);
                if (a10 != null) {
                    List<com.google.android.exoplayer2.trackselection.f> list = this.f15969n[i10][i11];
                    int i12 = 0;
                    while (true) {
                        if (i12 >= list.size()) {
                            z10 = false;
                            break;
                        }
                        com.google.android.exoplayer2.trackselection.f fVar = list.get(i12);
                        if (fVar.a() == a10.a()) {
                            this.f15962g.clear();
                            for (int i13 = 0; i13 < fVar.length(); i13++) {
                                this.f15962g.put(fVar.h(i13), 0);
                            }
                            for (int i14 = 0; i14 < a10.length(); i14++) {
                                this.f15962g.put(a10.h(i14), 0);
                            }
                            int[] iArr = new int[this.f15962g.size()];
                            for (int i15 = 0; i15 < this.f15962g.size(); i15++) {
                                iArr[i15] = this.f15962g.keyAt(i15);
                            }
                            list.set(i12, new c(fVar.a(), iArr));
                            z10 = true;
                        } else {
                            i12++;
                        }
                    }
                    if (!z10) {
                        list.add(a10);
                    }
                }
            }
            return e10;
        } catch (i e11) {
            throw new UnsupportedOperationException(e11);
        }
    }

    @RequiresNonNull({"trackGroupArrays", "mappedTrackInfos", "trackSelectionsByPeriodAndRenderer", "immutableTrackSelectionsByPeriodAndRenderer", "mediaPreparer", "mediaPreparer.timeline", "mediaPreparer.mediaPeriods"})
    public final void N() {
        this.f15964i = true;
    }

    public void g(String... strArr) {
        k();
        for (int i10 = 0; i10 < this.f15968m.length; i10++) {
            DefaultTrackSelector.d g10 = f15952p.a();
            d.a aVar = this.f15968m[i10];
            int c10 = aVar.c();
            for (int i11 = 0; i11 < c10; i11++) {
                if (aVar.e(i11) != 1) {
                    g10.G(i11, true);
                }
            }
            for (String E : strArr) {
                g10.c(E);
                i(i10, g10.a());
            }
        }
    }

    public void h(boolean z10, String... strArr) {
        k();
        for (int i10 = 0; i10 < this.f15968m.length; i10++) {
            DefaultTrackSelector.d g10 = f15952p.a();
            d.a aVar = this.f15968m[i10];
            int c10 = aVar.c();
            for (int i11 = 0; i11 < c10; i11++) {
                if (aVar.e(i11) != 3) {
                    g10.G(i11, true);
                }
            }
            g10.e(z10);
            for (String F : strArr) {
                g10.d(F);
                i(i10, g10.a());
            }
        }
    }

    public void i(int i10, DefaultTrackSelector.Parameters parameters) {
        k();
        this.f15960e.S(parameters);
        M(i10);
    }

    public void j(int i10, int i11, DefaultTrackSelector.Parameters parameters, List<DefaultTrackSelector.SelectionOverride> list) {
        k();
        DefaultTrackSelector.d g10 = parameters.a();
        int i12 = 0;
        while (i12 < this.f15968m[i10].c()) {
            g10.G(i12, i12 != i11);
            i12++;
        }
        if (list.isEmpty()) {
            i(i10, g10.a());
            return;
        }
        TrackGroupArray g11 = this.f15968m[i10].g(i11);
        for (int i13 = 0; i13 < list.size(); i13++) {
            g10.I(i11, g11, list.get(i13));
            i(i10, g10.a());
        }
    }

    @EnsuresNonNull({"trackGroupArrays", "mappedTrackInfos", "trackSelectionsByPeriodAndRenderer", "immutableTrackSelectionsByPeriodAndRenderer", "mediaPreparer", "mediaPreparer.timeline", "mediaPreparer.mediaPeriods"})
    public final void k() {
        w7.a.i(this.f15964i);
    }

    public void l(int i10) {
        k();
        for (int i11 = 0; i11 < this.f15961f.length; i11++) {
            this.f15969n[i10][i11].clear();
        }
    }

    public DownloadRequest v(String str, @d.o0 byte[] bArr) {
        if (this.f15959d == null) {
            return new DownloadRequest(str, this.f15956a, this.f15957b, Collections.emptyList(), this.f15958c, bArr);
        }
        k();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int length = this.f15969n.length;
        for (int i10 = 0; i10 < length; i10++) {
            arrayList2.clear();
            for (List<com.google.android.exoplayer2.trackselection.f> addAll : this.f15969n[i10]) {
                arrayList2.addAll(addAll);
            }
            arrayList.addAll(this.f15966k.X[i10].m(arrayList2));
        }
        return new DownloadRequest(str, this.f15956a, this.f15957b, arrayList, this.f15958c, bArr);
    }

    public DownloadRequest w(@d.o0 byte[] bArr) {
        return v(this.f15957b.toString(), bArr);
    }

    @d.o0
    public Object x() {
        if (this.f15959d == null) {
            return null;
        }
        k();
        return this.f15966k.V;
    }

    public d.a y(int i10) {
        k();
        return this.f15968m[i10];
    }
}
