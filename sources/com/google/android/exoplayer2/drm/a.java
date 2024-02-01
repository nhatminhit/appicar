package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.c;
import com.google.android.exoplayer2.drm.e;
import d.o0;
import h6.d;
import h6.g;
import h6.h;
import h6.j;
import h6.m;
import h6.q;
import h6.s;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import w7.i;
import w7.p;
import w7.q0;

@TargetApi(18)
public class a<T extends m> implements c<T> {
    public static final int A = 0;
    public static final int B = 1;
    public static final int C = 60;

    /* renamed from: z  reason: collision with root package name */
    public static final String f5085z = "DefaultDrmSession";
    @o0

    /* renamed from: f  reason: collision with root package name */
    public final List<DrmInitData.SchemeData> f5086f;

    /* renamed from: g  reason: collision with root package name */
    public final e<T> f5087g;

    /* renamed from: h  reason: collision with root package name */
    public final c<T> f5088h;

    /* renamed from: i  reason: collision with root package name */
    public final int f5089i;
    @o0

    /* renamed from: j  reason: collision with root package name */
    public final HashMap<String, String> f5090j;

    /* renamed from: k  reason: collision with root package name */
    public final i<j> f5091k;

    /* renamed from: l  reason: collision with root package name */
    public final int f5092l;

    /* renamed from: m  reason: collision with root package name */
    public final i f5093m;

    /* renamed from: n  reason: collision with root package name */
    public final UUID f5094n;

    /* renamed from: o  reason: collision with root package name */
    public final a<T>.b f5095o;

    /* renamed from: p  reason: collision with root package name */
    public int f5096p;

    /* renamed from: q  reason: collision with root package name */
    public int f5097q;

    /* renamed from: r  reason: collision with root package name */
    public HandlerThread f5098r;

    /* renamed from: s  reason: collision with root package name */
    public a<T>.a f5099s;
    @o0

    /* renamed from: t  reason: collision with root package name */
    public T f5100t;
    @o0

    /* renamed from: u  reason: collision with root package name */
    public c.a f5101u;

    /* renamed from: v  reason: collision with root package name */
    public byte[] f5102v;

    /* renamed from: w  reason: collision with root package name */
    public byte[] f5103w;
    @o0

    /* renamed from: x  reason: collision with root package name */
    public e.a f5104x;
    @o0

    /* renamed from: y  reason: collision with root package name */
    public e.C0086e f5105y;

    @SuppressLint({"HandlerLeak"})
    /* renamed from: com.google.android.exoplayer2.drm.a$a  reason: collision with other inner class name */
    public class C0084a extends Handler {
        public C0084a(Looper looper) {
            super(looper);
        }

        public final long a(int i10) {
            return (long) Math.min((i10 - 1) * 1000, 5000);
        }

        public final boolean b(Message message) {
            int i10;
            if (!(message.arg1 == 1) || (i10 = message.arg2 + 1) > a.this.f5092l) {
                return false;
            }
            Message obtain = Message.obtain(message);
            obtain.arg2 = i10;
            sendMessageDelayed(obtain, a(i10));
            return true;
        }

        public void c(int i10, Object obj, boolean z10) {
            obtainMessage(i10, z10 ? 1 : 0, 0, obj).sendToTarget();
        }

        public void handleMessage(Message message) {
            Object obj = message.obj;
            try {
                int i10 = message.what;
                if (i10 == 0) {
                    a aVar = a.this;
                    e = aVar.f5093m.b(aVar.f5094n, (e.C0086e) obj);
                } else if (i10 == 1) {
                    a aVar2 = a.this;
                    e = aVar2.f5093m.a(aVar2.f5094n, (e.a) obj);
                } else {
                    throw new RuntimeException();
                }
            } catch (Exception e10) {
                e = e10;
                if (b(message)) {
                    return;
                }
            }
            a.this.f5095o.obtainMessage(message.what, Pair.create(obj, e)).sendToTarget();
        }
    }

    @SuppressLint({"HandlerLeak"})
    public class b extends Handler {
        public b(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i10 = message.what;
            if (i10 == 0) {
                a.this.v(obj, obj2);
            } else if (i10 == 1) {
                a.this.p(obj, obj2);
            }
        }
    }

    public interface c<T extends m> {
        void b(a<T> aVar);

        void c(Exception exc);

        void e();
    }

    public a(UUID uuid, e<T> eVar, c<T> cVar, @o0 List<DrmInitData.SchemeData> list, int i10, @o0 byte[] bArr, @o0 HashMap<String, String> hashMap, i iVar, Looper looper, i<j> iVar2, int i11) {
        List<DrmInitData.SchemeData> list2;
        if (i10 == 1 || i10 == 3) {
            w7.a.g(bArr);
        }
        this.f5094n = uuid;
        this.f5088h = cVar;
        this.f5087g = eVar;
        this.f5089i = i10;
        if (bArr != null) {
            this.f5103w = bArr;
            list2 = null;
        } else {
            list2 = Collections.unmodifiableList((List) w7.a.g(list));
        }
        this.f5086f = list2;
        this.f5090j = hashMap;
        this.f5093m = iVar;
        this.f5092l = i11;
        this.f5091k = iVar2;
        this.f5096p = 2;
        this.f5095o = new b(looper);
        HandlerThread handlerThread = new HandlerThread("DrmRequestHandler");
        this.f5098r = handlerThread;
        handlerThread.start();
        this.f5099s = new C0084a(this.f5098r.getLooper());
    }

    @RequiresNonNull({"sessionId", "offlineLicenseKeySetId"})
    public final boolean A() {
        try {
            this.f5087g.h(this.f5102v, this.f5103w);
            return true;
        } catch (Exception e10) {
            p.e(f5085z, "Error trying to restore Widevine keys.", e10);
            o(e10);
            return false;
        }
    }

    @o0
    public Map<String, String> a() {
        byte[] bArr = this.f5102v;
        if (bArr == null) {
            return null;
        }
        return this.f5087g.b(bArr);
    }

    @o0
    public final T b() {
        return this.f5100t;
    }

    @o0
    public byte[] c() {
        return this.f5103w;
    }

    @o0
    public final c.a d() {
        if (this.f5096p == 1) {
            return this.f5101u;
        }
        return null;
    }

    public final int getState() {
        return this.f5096p;
    }

    public void i() {
        int i10 = this.f5097q + 1;
        this.f5097q = i10;
        if (i10 == 1 && this.f5096p != 1 && w(true)) {
            j(true);
        }
    }

    @RequiresNonNull({"sessionId"})
    public final void j(boolean z10) {
        int i10 = this.f5089i;
        if (i10 == 0 || i10 == 1) {
            if (this.f5103w == null) {
                x(this.f5102v, 1, z10);
            } else if (this.f5096p == 4 || A()) {
                long k10 = k();
                if (this.f5089i == 0 && k10 <= 60) {
                    p.b(f5085z, "Offline license has expired or will expire soon. Remaining seconds: " + k10);
                    x(this.f5102v, 2, z10);
                } else if (k10 <= 0) {
                    o(new q());
                } else {
                    this.f5096p = 4;
                    this.f5091k.b(new h6.e());
                }
            }
        } else if (i10 != 2) {
            if (i10 == 3) {
                w7.a.g(this.f5103w);
                if (A()) {
                    x(this.f5103w, 3, z10);
                }
            }
        } else if (this.f5103w == null) {
            x(this.f5102v, 2, z10);
        } else if (A()) {
            x(this.f5102v, 2, z10);
        }
    }

    public final long k() {
        if (!b6.c.A1.equals(this.f5094n)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) w7.a.g(s.b(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    public boolean l(byte[] bArr) {
        return Arrays.equals(this.f5102v, bArr);
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    public final boolean m() {
        int i10 = this.f5096p;
        return i10 == 3 || i10 == 4;
    }

    public final void o(Exception exc) {
        this.f5101u = new c.a(exc);
        this.f5091k.b(new h(exc));
        if (this.f5096p != 4) {
            this.f5096p = 1;
        }
    }

    public final void p(Object obj, Object obj2) {
        i<j> iVar;
        i.a aVar;
        if (obj == this.f5104x && m()) {
            this.f5104x = null;
            if (obj2 instanceof Exception) {
                q((Exception) obj2);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f5089i == 3) {
                    this.f5087g.m((byte[]) q0.l(this.f5103w), bArr);
                    iVar = this.f5091k;
                    new h6.e
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0030: CONSTRUCTOR  (r3v7 ? I:h6.e) =  call: h6.e.<init>():void type: CONSTRUCTOR in method: com.google.android.exoplayer2.drm.a.p(java.lang.Object, java.lang.Object):void, dex: classes.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.util.ArrayList.forEach(ArrayList.java:1259)
                        	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                        	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                        	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r3v7 ?
                        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	... 48 more
                        */
                    /*
                        this = this;
                        com.google.android.exoplayer2.drm.e$a r0 = r1.f5104x
                        if (r2 != r0) goto L_0x0060
                        boolean r2 = r1.m()
                        if (r2 != 0) goto L_0x000b
                        goto L_0x0060
                    L_0x000b:
                        r2 = 0
                        r1.f5104x = r2
                        boolean r2 = r3 instanceof java.lang.Exception
                        if (r2 == 0) goto L_0x0018
                        java.lang.Exception r3 = (java.lang.Exception) r3
                        r1.q(r3)
                        return
                    L_0x0018:
                        byte[] r3 = (byte[]) r3     // Catch:{ Exception -> 0x005c }
                        int r2 = r1.f5089i     // Catch:{ Exception -> 0x005c }
                        r0 = 3
                        if (r2 != r0) goto L_0x0037
                        com.google.android.exoplayer2.drm.e<T> r2 = r1.f5087g     // Catch:{ Exception -> 0x005c }
                        byte[] r0 = r1.f5103w     // Catch:{ Exception -> 0x005c }
                        java.lang.Object r0 = w7.q0.l(r0)     // Catch:{ Exception -> 0x005c }
                        byte[] r0 = (byte[]) r0     // Catch:{ Exception -> 0x005c }
                        r2.m(r0, r3)     // Catch:{ Exception -> 0x005c }
                        w7.i<h6.j> r2 = r1.f5091k     // Catch:{ Exception -> 0x005c }
                        h6.e r3 = new h6.e     // Catch:{ Exception -> 0x005c }
                        r3.<init>()     // Catch:{ Exception -> 0x005c }
                    L_0x0033:
                        r2.b(r3)     // Catch:{ Exception -> 0x005c }
                        goto L_0x0060
                    L_0x0037:
                        com.google.android.exoplayer2.drm.e<T> r2 = r1.f5087g     // Catch:{ Exception -> 0x005c }
                        byte[] r0 = r1.f5102v     // Catch:{ Exception -> 0x005c }
                        byte[] r2 = r2.m(r0, r3)     // Catch:{ Exception -> 0x005c }
                        int r3 = r1.f5089i     // Catch:{ Exception -> 0x005c }
                        r0 = 2
                        if (r3 == r0) goto L_0x004a
                        if (r3 != 0) goto L_0x0051
                        byte[] r3 = r1.f5103w     // Catch:{ Exception -> 0x005c }
                        if (r3 == 0) goto L_0x0051
                    L_0x004a:
                        if (r2 == 0) goto L_0x0051
                        int r3 = r2.length     // Catch:{ Exception -> 0x005c }
                        if (r3 == 0) goto L_0x0051
                        r1.f5103w = r2     // Catch:{ Exception -> 0x005c }
                    L_0x0051:
                        r2 = 4
                        r1.f5096p = r2     // Catch:{ Exception -> 0x005c }
                        w7.i<h6.j> r2 = r1.f5091k     // Catch:{ Exception -> 0x005c }
                        h6.f r3 = new h6.f     // Catch:{ Exception -> 0x005c }
                        r3.<init>()     // Catch:{ Exception -> 0x005c }
                        goto L_0x0033
                    L_0x005c:
                        r2 = move-exception
                        r1.q(r2)
                    L_0x0060:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.a.p(java.lang.Object, java.lang.Object):void");
                }

                public final void q(Exception exc) {
                    if (exc instanceof NotProvisionedException) {
                        this.f5088h.b(this);
                    } else {
                        o(exc);
                    }
                }

                public final void r() {
                    if (this.f5089i == 0 && this.f5096p == 4) {
                        q0.l(this.f5102v);
                        j(false);
                    }
                }

                public void s(int i10) {
                    if (i10 == 2) {
                        r();
                    }
                }

                public void t() {
                    if (w(false)) {
                        j(true);
                    }
                }

                public void u(Exception exc) {
                    o(exc);
                }

                public final void v(Object obj, Object obj2) {
                    if (obj != this.f5105y) {
                        return;
                    }
                    if (this.f5096p == 2 || m()) {
                        this.f5105y = null;
                        if (obj2 instanceof Exception) {
                            this.f5088h.c((Exception) obj2);
                            return;
                        }
                        try {
                            this.f5087g.n((byte[]) obj2);
                            this.f5088h.e();
                        } catch (Exception e10) {
                            this.f5088h.c(e10);
                        }
                    }
                }

                @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
                public final boolean w(boolean z10) {
                    if (m()) {
                        return true;
                    }
                    try {
                        this.f5102v = this.f5087g.g();
                        this.f5091k.b(new d());
                        this.f5100t = this.f5087g.e(this.f5102v);
                        this.f5096p = 3;
                        return true;
                    } catch (NotProvisionedException e10) {
                        if (z10) {
                            this.f5088h.b(this);
                            return false;
                        }
                        o(e10);
                        return false;
                    } catch (Exception e11) {
                        o(e11);
                        return false;
                    }
                }

                public final void x(byte[] bArr, int i10, boolean z10) {
                    try {
                        e.a o10 = this.f5087g.o(bArr, this.f5086f, i10, this.f5090j);
                        this.f5104x = o10;
                        this.f5099s.c(1, o10, z10);
                    } catch (Exception e10) {
                        q(e10);
                    }
                }

                public void y() {
                    e.C0086e f10 = this.f5087g.f();
                    this.f5105y = f10;
                    this.f5099s.c(0, f10, true);
                }

                public boolean z() {
                    int i10 = this.f5097q - 1;
                    this.f5097q = i10;
                    if (i10 != 0) {
                        return false;
                    }
                    this.f5096p = 0;
                    this.f5095o.removeCallbacksAndMessages((Object) null);
                    this.f5099s.removeCallbacksAndMessages((Object) null);
                    this.f5099s = null;
                    this.f5098r.quit();
                    this.f5098r = null;
                    this.f5100t = null;
                    this.f5101u = null;
                    this.f5104x = null;
                    this.f5105y = null;
                    byte[] bArr = this.f5102v;
                    if (bArr != null) {
                        this.f5087g.j(bArr);
                        this.f5102v = null;
                        this.f5091k.b(new g());
                    }
                    return true;
                }
            }
