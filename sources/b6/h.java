package b6;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import d.o0;
import d6.t;
import h6.l;
import h6.n;
import h7.k;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import t6.c;
import u6.d;
import u6.e;
import w7.p;
import x7.q;
import y7.b;

public class h implements u0 {

    /* renamed from: h  reason: collision with root package name */
    public static final long f4357h = 5000;

    /* renamed from: i  reason: collision with root package name */
    public static final int f4358i = 0;

    /* renamed from: j  reason: collision with root package name */
    public static final int f4359j = 1;

    /* renamed from: k  reason: collision with root package name */
    public static final int f4360k = 2;

    /* renamed from: l  reason: collision with root package name */
    public static final String f4361l = "DefaultRenderersFactory";

    /* renamed from: m  reason: collision with root package name */
    public static final int f4362m = 50;

    /* renamed from: a  reason: collision with root package name */
    public final Context f4363a;
    @o0

    /* renamed from: b  reason: collision with root package name */
    public l<n> f4364b;

    /* renamed from: c  reason: collision with root package name */
    public int f4365c;

    /* renamed from: d  reason: collision with root package name */
    public long f4366d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4367e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4368f;

    /* renamed from: g  reason: collision with root package name */
    public c f4369g;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public h(Context context) {
        this.f4363a = context;
        this.f4365c = 0;
        this.f4366d = f4357h;
        this.f4369g = c.f13023a;
    }

    @Deprecated
    public h(Context context, int i10) {
        this(context, i10, (long) f4357h);
    }

    @Deprecated
    public h(Context context, int i10, long j10) {
        this(context, (l<n>) null, i10, j10);
    }

    @Deprecated
    public h(Context context, @o0 l<n> lVar) {
        this(context, lVar, 0);
    }

    @Deprecated
    public h(Context context, @o0 l<n> lVar, int i10) {
        this(context, lVar, i10, f4357h);
    }

    @Deprecated
    public h(Context context, @o0 l<n> lVar, int i10, long j10) {
        this.f4363a = context;
        this.f4365c = i10;
        this.f4366d = j10;
        this.f4364b = lVar;
        this.f4369g = c.f13023a;
    }

    public r0[] a(Handler handler, q qVar, t tVar, k kVar, d dVar, @o0 l<n> lVar) {
        l<n> lVar2 = lVar == null ? this.f4364b : lVar;
        ArrayList arrayList = new ArrayList();
        l<n> lVar3 = lVar2;
        h(this.f4363a, this.f4365c, this.f4369g, lVar3, this.f4367e, this.f4368f, handler, qVar, this.f4366d, arrayList);
        c(this.f4363a, this.f4365c, this.f4369g, lVar3, this.f4367e, this.f4368f, b(), handler, tVar, arrayList);
        ArrayList arrayList2 = arrayList;
        g(this.f4363a, kVar, handler.getLooper(), this.f4365c, arrayList2);
        e(this.f4363a, dVar, handler.getLooper(), this.f4365c, arrayList2);
        d(this.f4363a, this.f4365c, arrayList);
        f(this.f4363a, handler, this.f4365c, arrayList);
        return (r0[]) arrayList.toArray(new r0[0]);
    }

    public d6.l[] b() {
        return new d6.l[0];
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0072, code lost:
        throw new java.lang.RuntimeException("Error instantiating Opus extension", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ab, code lost:
        throw new java.lang.RuntimeException("Error instantiating FLAC extension", r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x006a A[ExcHandler: Exception (r0v7 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:7:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a3 A[ExcHandler: Exception (r0v6 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:20:0x0076] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(android.content.Context r17, int r18, t6.c r19, @d.o0 h6.l<h6.n> r20, boolean r21, boolean r22, d6.l[] r23, android.os.Handler r24, d6.t r25, java.util.ArrayList<b6.r0> r26) {
        /*
            r16 = this;
            r0 = r18
            r1 = r23
            r11 = r26
            java.lang.String r12 = "DefaultRenderersFactory"
            java.lang.Class<d6.l[]> r13 = d6.l[].class
            java.lang.Class<d6.t> r14 = d6.t.class
            d6.d0 r15 = new d6.d0
            d6.a0 r10 = new d6.a0
            d6.d r2 = d6.d.b(r17)
            r10.<init>(r2, r1)
            r2 = r15
            r3 = r17
            r4 = r19
            r5 = r20
            r6 = r21
            r7 = r22
            r8 = r24
            r9 = r25
            r2.<init>((android.content.Context) r3, (t6.c) r4, (h6.l<h6.n>) r5, (boolean) r6, (boolean) r7, (android.os.Handler) r8, (d6.t) r9, (d6.u) r10)
            r11.add(r15)
            if (r0 != 0) goto L_0x002f
            return
        L_0x002f:
            int r2 = r26.size()
            r3 = 2
            if (r0 != r3) goto L_0x0038
            int r2 = r2 + -1
        L_0x0038:
            r0 = 0
            r4 = 3
            r5 = 1
            java.lang.String r6 = "com.google.android.exoplayer2.ext.opus.LibopusAudioRenderer"
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ ClassNotFoundException -> 0x0073, Exception -> 0x006a }
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException -> 0x0073, Exception -> 0x006a }
            java.lang.Class<android.os.Handler> r8 = android.os.Handler.class
            r7[r0] = r8     // Catch:{ ClassNotFoundException -> 0x0073, Exception -> 0x006a }
            r7[r5] = r14     // Catch:{ ClassNotFoundException -> 0x0073, Exception -> 0x006a }
            r7[r3] = r13     // Catch:{ ClassNotFoundException -> 0x0073, Exception -> 0x006a }
            java.lang.reflect.Constructor r6 = r6.getConstructor(r7)     // Catch:{ ClassNotFoundException -> 0x0073, Exception -> 0x006a }
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ ClassNotFoundException -> 0x0073, Exception -> 0x006a }
            r7[r0] = r24     // Catch:{ ClassNotFoundException -> 0x0073, Exception -> 0x006a }
            r7[r5] = r25     // Catch:{ ClassNotFoundException -> 0x0073, Exception -> 0x006a }
            r7[r3] = r1     // Catch:{ ClassNotFoundException -> 0x0073, Exception -> 0x006a }
            java.lang.Object r6 = r6.newInstance(r7)     // Catch:{ ClassNotFoundException -> 0x0073, Exception -> 0x006a }
            b6.r0 r6 = (b6.r0) r6     // Catch:{ ClassNotFoundException -> 0x0073, Exception -> 0x006a }
            int r7 = r2 + 1
            r11.add(r2, r6)     // Catch:{ ClassNotFoundException -> 0x0068, Exception -> 0x006a }
            java.lang.String r2 = "Loaded LibopusAudioRenderer."
            w7.p.h(r12, r2)     // Catch:{ ClassNotFoundException -> 0x0068, Exception -> 0x006a }
            goto L_0x0074
        L_0x0068:
            r2 = r7
            goto L_0x0073
        L_0x006a:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error instantiating Opus extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x0073:
            r7 = r2
        L_0x0074:
            java.lang.String r2 = "com.google.android.exoplayer2.ext.flac.LibflacAudioRenderer"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException -> 0x00ac, Exception -> 0x00a3 }
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException -> 0x00ac, Exception -> 0x00a3 }
            java.lang.Class<android.os.Handler> r8 = android.os.Handler.class
            r6[r0] = r8     // Catch:{ ClassNotFoundException -> 0x00ac, Exception -> 0x00a3 }
            r6[r5] = r14     // Catch:{ ClassNotFoundException -> 0x00ac, Exception -> 0x00a3 }
            r6[r3] = r13     // Catch:{ ClassNotFoundException -> 0x00ac, Exception -> 0x00a3 }
            java.lang.reflect.Constructor r2 = r2.getConstructor(r6)     // Catch:{ ClassNotFoundException -> 0x00ac, Exception -> 0x00a3 }
            java.lang.Object[] r6 = new java.lang.Object[r4]     // Catch:{ ClassNotFoundException -> 0x00ac, Exception -> 0x00a3 }
            r6[r0] = r24     // Catch:{ ClassNotFoundException -> 0x00ac, Exception -> 0x00a3 }
            r6[r5] = r25     // Catch:{ ClassNotFoundException -> 0x00ac, Exception -> 0x00a3 }
            r6[r3] = r1     // Catch:{ ClassNotFoundException -> 0x00ac, Exception -> 0x00a3 }
            java.lang.Object r2 = r2.newInstance(r6)     // Catch:{ ClassNotFoundException -> 0x00ac, Exception -> 0x00a3 }
            b6.r0 r2 = (b6.r0) r2     // Catch:{ ClassNotFoundException -> 0x00ac, Exception -> 0x00a3 }
            int r6 = r7 + 1
            r11.add(r7, r2)     // Catch:{ ClassNotFoundException -> 0x00a1, Exception -> 0x00a3 }
            java.lang.String r2 = "Loaded LibflacAudioRenderer."
            w7.p.h(r12, r2)     // Catch:{ ClassNotFoundException -> 0x00a1, Exception -> 0x00a3 }
            goto L_0x00ad
        L_0x00a1:
            r7 = r6
            goto L_0x00ac
        L_0x00a3:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error instantiating FLAC extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x00ac:
            r6 = r7
        L_0x00ad:
            java.lang.String r2 = "com.google.android.exoplayer2.ext.ffmpeg.FfmpegAudioRenderer"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException -> 0x00e1, Exception -> 0x00d8 }
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException -> 0x00e1, Exception -> 0x00d8 }
            java.lang.Class<android.os.Handler> r8 = android.os.Handler.class
            r7[r0] = r8     // Catch:{ ClassNotFoundException -> 0x00e1, Exception -> 0x00d8 }
            r7[r5] = r14     // Catch:{ ClassNotFoundException -> 0x00e1, Exception -> 0x00d8 }
            r7[r3] = r13     // Catch:{ ClassNotFoundException -> 0x00e1, Exception -> 0x00d8 }
            java.lang.reflect.Constructor r2 = r2.getConstructor(r7)     // Catch:{ ClassNotFoundException -> 0x00e1, Exception -> 0x00d8 }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ ClassNotFoundException -> 0x00e1, Exception -> 0x00d8 }
            r4[r0] = r24     // Catch:{ ClassNotFoundException -> 0x00e1, Exception -> 0x00d8 }
            r4[r5] = r25     // Catch:{ ClassNotFoundException -> 0x00e1, Exception -> 0x00d8 }
            r4[r3] = r1     // Catch:{ ClassNotFoundException -> 0x00e1, Exception -> 0x00d8 }
            java.lang.Object r0 = r2.newInstance(r4)     // Catch:{ ClassNotFoundException -> 0x00e1, Exception -> 0x00d8 }
            b6.r0 r0 = (b6.r0) r0     // Catch:{ ClassNotFoundException -> 0x00e1, Exception -> 0x00d8 }
            r11.add(r6, r0)     // Catch:{ ClassNotFoundException -> 0x00e1, Exception -> 0x00d8 }
            java.lang.String r0 = "Loaded FfmpegAudioRenderer."
            w7.p.h(r12, r0)     // Catch:{ ClassNotFoundException -> 0x00e1, Exception -> 0x00d8 }
            goto L_0x00e1
        L_0x00d8:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Error instantiating FFmpeg extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x00e1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.h.c(android.content.Context, int, t6.c, h6.l, boolean, boolean, d6.l[], android.os.Handler, d6.t, java.util.ArrayList):void");
    }

    public void d(Context context, int i10, ArrayList<r0> arrayList) {
        arrayList.add(new b());
    }

    public void e(Context context, d dVar, Looper looper, int i10, ArrayList<r0> arrayList) {
        arrayList.add(new e(dVar, looper));
    }

    public void f(Context context, Handler handler, int i10, ArrayList<r0> arrayList) {
    }

    public void g(Context context, k kVar, Looper looper, int i10, ArrayList<r0> arrayList) {
        arrayList.add(new h7.l(kVar, looper));
    }

    public void h(Context context, int i10, c cVar, @o0 l<n> lVar, boolean z10, boolean z11, Handler handler, q qVar, long j10, ArrayList<r0> arrayList) {
        int i11 = i10;
        ArrayList<r0> arrayList2 = arrayList;
        arrayList2.add(new x7.d(context, cVar, j10, lVar, z10, z11, handler, qVar, 50));
        if (i11 != 0) {
            int size = arrayList.size();
            if (i11 == 2) {
                size--;
            }
            try {
                arrayList2.add(size, (r0) Class.forName("com.google.android.exoplayer2.ext.vp9.LibvpxVideoRenderer").getConstructor(new Class[]{Long.TYPE, Handler.class, q.class, Integer.TYPE}).newInstance(new Object[]{Long.valueOf(j10), handler, qVar, 50}));
                p.h(f4361l, "Loaded LibvpxVideoRenderer.");
            } catch (ClassNotFoundException unused) {
            } catch (Exception e10) {
                throw new RuntimeException("Error instantiating VP9 extension", e10);
            }
        }
    }

    public h i(long j10) {
        this.f4366d = j10;
        return this;
    }

    public h j(boolean z10) {
        this.f4368f = z10;
        return this;
    }

    public h k(int i10) {
        this.f4365c = i10;
        return this;
    }

    public h l(c cVar) {
        this.f4369g = cVar;
        return this;
    }

    public h m(boolean z10) {
        this.f4367e = z10;
        return this;
    }
}
