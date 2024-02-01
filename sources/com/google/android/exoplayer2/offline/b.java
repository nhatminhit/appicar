package com.google.android.exoplayer2.offline;

import a7.a;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import b6.h;
import com.google.android.exoplayer2.offline.c;
import com.google.android.exoplayer2.scheduler.Requirements;
import d.j;
import d.o0;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import t7.l;
import w7.p;
import w7.q0;
import z6.f;
import z6.n;
import z6.o;
import z6.q;
import z6.s;
import z6.u;
import z6.v;
import z6.y;

public final class b {
    public static final int A = 5;
    public static final int B = 6;
    public static final int C = 7;
    public static final int D = 8;
    public static final int E = 9;
    public static final int F = 10;
    public static final int G = 11;
    public static final int H = 12;
    public static final String I = "DownloadManager";

    /* renamed from: p  reason: collision with root package name */
    public static final int f5214p = 3;

    /* renamed from: q  reason: collision with root package name */
    public static final int f5215q = 5;

    /* renamed from: r  reason: collision with root package name */
    public static final Requirements f5216r = new Requirements(1);

    /* renamed from: s  reason: collision with root package name */
    public static final int f5217s = 0;

    /* renamed from: t  reason: collision with root package name */
    public static final int f5218t = 1;

    /* renamed from: u  reason: collision with root package name */
    public static final int f5219u = 2;

    /* renamed from: v  reason: collision with root package name */
    public static final int f5220v = 0;

    /* renamed from: w  reason: collision with root package name */
    public static final int f5221w = 1;

    /* renamed from: x  reason: collision with root package name */
    public static final int f5222x = 2;

    /* renamed from: y  reason: collision with root package name */
    public static final int f5223y = 3;

    /* renamed from: z  reason: collision with root package name */
    public static final int f5224z = 4;

    /* renamed from: a  reason: collision with root package name */
    public final Context f5225a;

    /* renamed from: b  reason: collision with root package name */
    public final y f5226b;

    /* renamed from: c  reason: collision with root package name */
    public final Handler f5227c;

    /* renamed from: d  reason: collision with root package name */
    public final c f5228d;

    /* renamed from: e  reason: collision with root package name */
    public final a.d f5229e;

    /* renamed from: f  reason: collision with root package name */
    public final CopyOnWriteArraySet<d> f5230f;

    /* renamed from: g  reason: collision with root package name */
    public int f5231g;

    /* renamed from: h  reason: collision with root package name */
    public int f5232h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f5233i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f5234j;

    /* renamed from: k  reason: collision with root package name */
    public int f5235k;

    /* renamed from: l  reason: collision with root package name */
    public int f5236l;

    /* renamed from: m  reason: collision with root package name */
    public int f5237m;

    /* renamed from: n  reason: collision with root package name */
    public List<z6.d> f5238n;

    /* renamed from: o  reason: collision with root package name */
    public a7.a f5239o;

    /* renamed from: com.google.android.exoplayer2.offline.b$b  reason: collision with other inner class name */
    public static final class C0087b {

        /* renamed from: a  reason: collision with root package name */
        public final z6.d f5240a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f5241b;

        /* renamed from: c  reason: collision with root package name */
        public final List<z6.d> f5242c;

        public C0087b(z6.d dVar, boolean z10, List<z6.d> list) {
            this.f5240a = dVar;
            this.f5241b = z10;
            this.f5242c = list;
        }
    }

    public static final class c extends Handler {

        /* renamed from: m  reason: collision with root package name */
        public static final int f5243m = 5000;

        /* renamed from: a  reason: collision with root package name */
        public boolean f5244a;

        /* renamed from: b  reason: collision with root package name */
        public final HandlerThread f5245b;

        /* renamed from: c  reason: collision with root package name */
        public final y f5246c;

        /* renamed from: d  reason: collision with root package name */
        public final v f5247d;

        /* renamed from: e  reason: collision with root package name */
        public final Handler f5248e;

        /* renamed from: f  reason: collision with root package name */
        public final ArrayList<z6.d> f5249f = new ArrayList<>();

        /* renamed from: g  reason: collision with root package name */
        public final HashMap<String, e> f5250g = new HashMap<>();

        /* renamed from: h  reason: collision with root package name */
        public int f5251h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f5252i;

        /* renamed from: j  reason: collision with root package name */
        public int f5253j;

        /* renamed from: k  reason: collision with root package name */
        public int f5254k;

        /* renamed from: l  reason: collision with root package name */
        public int f5255l;

        public c(HandlerThread handlerThread, y yVar, v vVar, Handler handler, int i10, int i11, boolean z10) {
            super(handlerThread.getLooper());
            this.f5245b = handlerThread;
            this.f5246c = yVar;
            this.f5247d = vVar;
            this.f5248e = handler;
            this.f5253j = i10;
            this.f5254k = i11;
            this.f5252i = z10;
        }

        public static int d(z6.d dVar, z6.d dVar2) {
            return q0.s(dVar.f15946c, dVar2.f15946c);
        }

        public static z6.d e(z6.d dVar, int i10) {
            return new z6.d(dVar.f15944a, i10, dVar.f15946c, System.currentTimeMillis(), dVar.f15948e, 0, 0, dVar.f15951h);
        }

        public final void A(@o0 e eVar) {
            if (eVar != null) {
                w7.a.i(!eVar.R);
                eVar.g(false);
            }
        }

        public final void B() {
            int i10 = 0;
            for (int i11 = 0; i11 < this.f5249f.size(); i11++) {
                z6.d dVar = this.f5249f.get(i11);
                e eVar = this.f5250g.get(dVar.f15944a.O);
                int i12 = dVar.f15945b;
                if (i12 == 0) {
                    eVar = y(eVar, dVar);
                } else if (i12 == 1) {
                    A(eVar);
                } else if (i12 == 2) {
                    w7.a.g(eVar);
                    x(eVar, dVar, i10);
                } else if (i12 == 5 || i12 == 7) {
                    z(eVar, dVar);
                } else {
                    throw new IllegalStateException();
                }
                if (eVar != null && !eVar.R) {
                    i10++;
                }
            }
        }

        public final void C() {
            for (int i10 = 0; i10 < this.f5249f.size(); i10++) {
                z6.d dVar = this.f5249f.get(i10);
                if (dVar.f15945b == 2) {
                    try {
                        this.f5246c.a(dVar);
                    } catch (IOException e10) {
                        p.e(b.I, "Failed to update index.", e10);
                    }
                }
            }
            sendEmptyMessageDelayed(11, h.f4357h);
        }

        public final void b(DownloadRequest downloadRequest, int i10) {
            int i11 = 1;
            z6.d f10 = f(downloadRequest.O, true);
            long currentTimeMillis = System.currentTimeMillis();
            if (f10 != null) {
                m(b.q(f10, downloadRequest, i10, currentTimeMillis));
            } else {
                if (i10 == 0) {
                    i11 = 0;
                }
                m(new z6.d(downloadRequest, i11, currentTimeMillis, currentTimeMillis, -1, i10, 0));
            }
            B();
        }

        public final boolean c() {
            return !this.f5252i && this.f5251h == 0;
        }

        @o0
        public final z6.d f(String str, boolean z10) {
            int g10 = g(str);
            if (g10 != -1) {
                return this.f5249f.get(g10);
            }
            if (!z10) {
                return null;
            }
            try {
                return this.f5246c.f(str);
            } catch (IOException e10) {
                p.e(b.I, "Failed to load download: " + str, e10);
                return null;
            }
        }

        public final int g(String str) {
            for (int i10 = 0; i10 < this.f5249f.size(); i10++) {
                if (this.f5249f.get(i10).f15944a.O.equals(str)) {
                    return i10;
                }
            }
            return -1;
        }

        public final void h(int i10) {
            this.f5251h = i10;
            f fVar = null;
            try {
                this.f5246c.e();
                fVar = this.f5246c.b(0, 1, 2, 5, 7);
                while (fVar.moveToNext()) {
                    this.f5249f.add(fVar.s1());
                }
            } catch (IOException e10) {
                p.e(b.I, "Failed to load index.", e10);
                this.f5249f.clear();
            } catch (Throwable th2) {
                q0.q((Closeable) null);
                throw th2;
            }
            q0.q(fVar);
            this.f5248e.obtainMessage(0, new ArrayList(this.f5249f)).sendToTarget();
            B();
        }

        public void handleMessage(Message message) {
            boolean z10 = false;
            switch (message.what) {
                case 0:
                    h(message.arg1);
                    break;
                case 1:
                    if (message.arg1 != 0) {
                        z10 = true;
                    }
                    r(z10);
                    break;
                case 2:
                    u(message.arg1);
                    break;
                case 3:
                    v((String) message.obj, message.arg1);
                    break;
                case 4:
                    s(message.arg1);
                    break;
                case 5:
                    t(message.arg1);
                    break;
                case 6:
                    b((DownloadRequest) message.obj, message.arg1);
                    break;
                case 7:
                    q((String) message.obj);
                    break;
                case 8:
                    p();
                    break;
                case 9:
                    l((e) message.obj);
                    break;
                case 10:
                    i((e) message.obj);
                    return;
                case 11:
                    C();
                    return;
                case 12:
                    o();
                    return;
                default:
                    throw new IllegalStateException();
            }
            z10 = true;
            this.f5248e.obtainMessage(1, z10 ? 1 : 0, this.f5250g.size()).sendToTarget();
        }

        public final void i(e eVar) {
            String str = eVar.O.O;
            long d10 = eVar.W;
            z6.d dVar = (z6.d) w7.a.g(f(str, false));
            if (d10 != dVar.f15948e && d10 != -1) {
                m(new z6.d(dVar.f15944a, dVar.f15945b, dVar.f15946c, System.currentTimeMillis(), d10, dVar.f15949f, dVar.f15950g, dVar.f15951h));
            }
        }

        public final void j(z6.d dVar, @o0 Throwable th2) {
            z6.d dVar2 = dVar;
            z6.d dVar3 = new z6.d(dVar2.f15944a, th2 == null ? 3 : 4, dVar2.f15946c, System.currentTimeMillis(), dVar2.f15948e, dVar2.f15949f, th2 == null ? 0 : 1, dVar2.f15951h);
            this.f5249f.remove(g(dVar3.f15944a.O));
            try {
                this.f5246c.a(dVar3);
            } catch (IOException e10) {
                p.e(b.I, "Failed to update index.", e10);
            }
            this.f5248e.obtainMessage(2, new C0087b(dVar3, false, new ArrayList(this.f5249f))).sendToTarget();
        }

        public final void k(z6.d dVar) {
            int i10 = 1;
            if (dVar.f15945b == 7) {
                if (dVar.f15949f == 0) {
                    i10 = 0;
                }
                n(dVar, i10);
                B();
                return;
            }
            this.f5249f.remove(g(dVar.f15944a.O));
            try {
                this.f5246c.g(dVar.f15944a.O);
            } catch (IOException unused) {
                p.d(b.I, "Failed to remove from database");
            }
            this.f5248e.obtainMessage(2, new C0087b(dVar, true, new ArrayList(this.f5249f))).sendToTarget();
        }

        public final void l(e eVar) {
            String str = eVar.O.O;
            this.f5250g.remove(str);
            boolean b10 = eVar.R;
            if (!b10) {
                int i10 = this.f5255l - 1;
                this.f5255l = i10;
                if (i10 == 0) {
                    removeMessages(11);
                }
            }
            if (eVar.U) {
                B();
                return;
            }
            Throwable f10 = eVar.V;
            if (f10 != null) {
                p.e(b.I, "Task failed: " + eVar.O + ", " + b10, f10);
            }
            z6.d dVar = (z6.d) w7.a.g(f(str, false));
            int i11 = dVar.f15945b;
            if (i11 == 2) {
                w7.a.i(!b10);
                j(dVar, f10);
            } else if (i11 == 5 || i11 == 7) {
                w7.a.i(b10);
                k(dVar);
            } else {
                throw new IllegalStateException();
            }
            B();
        }

        public final z6.d m(z6.d dVar) {
            ArrayList<z6.d> arrayList;
            Comparator comparator;
            int i10 = dVar.f15945b;
            boolean z10 = true;
            w7.a.i((i10 == 3 || i10 == 4) ? false : true);
            int g10 = g(dVar.f15944a.O);
            if (g10 == -1) {
                this.f5249f.add(dVar);
                arrayList = this.f5249f;
                new q
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0024: CONSTRUCTOR  (r1v8 ? I:z6.q) =  call: z6.q.<init>():void type: CONSTRUCTOR in method: com.google.android.exoplayer2.offline.b.c.m(z6.d):z6.d, dex: classes.dex
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
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
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
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r1v8 ?
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	... 49 more
                    */
                /*
                    this = this;
                    int r0 = r8.f15945b
                    r1 = 1
                    r2 = 0
                    r3 = 3
                    if (r0 == r3) goto L_0x000c
                    r3 = 4
                    if (r0 == r3) goto L_0x000c
                    r0 = r1
                    goto L_0x000d
                L_0x000c:
                    r0 = r2
                L_0x000d:
                    w7.a.i(r0)
                    com.google.android.exoplayer2.offline.DownloadRequest r0 = r8.f15944a
                    java.lang.String r0 = r0.O
                    int r0 = r7.g(r0)
                    r3 = -1
                    if (r0 != r3) goto L_0x002b
                    java.util.ArrayList<z6.d> r0 = r7.f5249f
                    r0.add(r8)
                    java.util.ArrayList<z6.d> r0 = r7.f5249f
                    z6.q r1 = new z6.q
                    r1.<init>()
                L_0x0027:
                    java.util.Collections.sort(r0, r1)
                    goto L_0x004c
                L_0x002b:
                    long r3 = r8.f15946c
                    java.util.ArrayList<z6.d> r5 = r7.f5249f
                    java.lang.Object r5 = r5.get(r0)
                    z6.d r5 = (z6.d) r5
                    long r5 = r5.f15946c
                    int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                    if (r3 == 0) goto L_0x003c
                    goto L_0x003d
                L_0x003c:
                    r1 = r2
                L_0x003d:
                    java.util.ArrayList<z6.d> r3 = r7.f5249f
                    r3.set(r0, r8)
                    if (r1 == 0) goto L_0x004c
                    java.util.ArrayList<z6.d> r0 = r7.f5249f
                    z6.q r1 = new z6.q
                    r1.<init>()
                    goto L_0x0027
                L_0x004c:
                    z6.y r0 = r7.f5246c     // Catch:{ IOException -> 0x0052 }
                    r0.a(r8)     // Catch:{ IOException -> 0x0052 }
                    goto L_0x005a
                L_0x0052:
                    r0 = move-exception
                    java.lang.String r1 = "DownloadManager"
                    java.lang.String r3 = "Failed to update index."
                    w7.p.e(r1, r3, r0)
                L_0x005a:
                    com.google.android.exoplayer2.offline.b$b r0 = new com.google.android.exoplayer2.offline.b$b
                    java.util.ArrayList r1 = new java.util.ArrayList
                    java.util.ArrayList<z6.d> r3 = r7.f5249f
                    r1.<init>(r3)
                    r0.<init>(r8, r2, r1)
                    android.os.Handler r1 = r7.f5248e
                    r2 = 2
                    android.os.Message r0 = r1.obtainMessage(r2, r0)
                    r0.sendToTarget()
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.offline.b.c.m(z6.d):z6.d");
            }

            public final z6.d n(z6.d dVar, int i10) {
                boolean z10 = true;
                if (i10 == 3 || i10 == 4 || i10 == 1) {
                    z10 = false;
                }
                w7.a.i(z10);
                return m(e(dVar, i10));
            }

            public final void o() {
                for (e g10 : this.f5250g.values()) {
                    g10.g(true);
                }
                try {
                    this.f5246c.e();
                } catch (IOException e10) {
                    p.e(b.I, "Failed to update index.", e10);
                }
                this.f5249f.clear();
                this.f5245b.quit();
                synchronized (this) {
                    this.f5244a = true;
                    notifyAll();
                }
            }

            /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
                r6 = move-exception;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
                if (r4 != null) goto L_0x002f;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
                r4.close();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
                throw r6;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void p() {
                /*
                    r8 = this;
                    java.lang.String r0 = "DownloadManager"
                    java.util.ArrayList r1 = new java.util.ArrayList
                    r1.<init>()
                    r2 = 2
                    r3 = 0
                    z6.y r4 = r8.f5246c     // Catch:{ IOException -> 0x0038 }
                    int[] r5 = new int[r2]     // Catch:{ IOException -> 0x0038 }
                    r6 = 3
                    r5[r3] = r6     // Catch:{ IOException -> 0x0038 }
                    r6 = 4
                    r7 = 1
                    r5[r7] = r6     // Catch:{ IOException -> 0x0038 }
                    z6.f r4 = r4.b(r5)     // Catch:{ IOException -> 0x0038 }
                L_0x0018:
                    boolean r5 = r4.moveToNext()     // Catch:{ all -> 0x002a }
                    if (r5 == 0) goto L_0x0026
                    z6.d r5 = r4.s1()     // Catch:{ all -> 0x002a }
                    r1.add(r5)     // Catch:{ all -> 0x002a }
                    goto L_0x0018
                L_0x0026:
                    r4.close()     // Catch:{ IOException -> 0x0038 }
                    goto L_0x003d
                L_0x002a:
                    r5 = move-exception
                    throw r5     // Catch:{ all -> 0x002c }
                L_0x002c:
                    r6 = move-exception
                    if (r4 == 0) goto L_0x0037
                    r4.close()     // Catch:{ all -> 0x0033 }
                    goto L_0x0037
                L_0x0033:
                    r4 = move-exception
                    r5.addSuppressed(r4)     // Catch:{ IOException -> 0x0038 }
                L_0x0037:
                    throw r6     // Catch:{ IOException -> 0x0038 }
                L_0x0038:
                    java.lang.String r4 = "Failed to load downloads."
                    w7.p.d(r0, r4)
                L_0x003d:
                    r4 = r3
                L_0x003e:
                    java.util.ArrayList<z6.d> r5 = r8.f5249f
                    int r5 = r5.size()
                    r6 = 5
                    if (r4 >= r5) goto L_0x0059
                    java.util.ArrayList<z6.d> r5 = r8.f5249f
                    java.lang.Object r7 = r5.get(r4)
                    z6.d r7 = (z6.d) r7
                    z6.d r6 = e(r7, r6)
                    r5.set(r4, r6)
                    int r4 = r4 + 1
                    goto L_0x003e
                L_0x0059:
                    r4 = r3
                L_0x005a:
                    int r5 = r1.size()
                    if (r4 >= r5) goto L_0x0072
                    java.util.ArrayList<z6.d> r5 = r8.f5249f
                    java.lang.Object r7 = r1.get(r4)
                    z6.d r7 = (z6.d) r7
                    z6.d r7 = e(r7, r6)
                    r5.add(r7)
                    int r4 = r4 + 1
                    goto L_0x005a
                L_0x0072:
                    java.util.ArrayList<z6.d> r1 = r8.f5249f
                    z6.q r4 = new z6.q
                    r4.<init>()
                    java.util.Collections.sort(r1, r4)
                    z6.y r1 = r8.f5246c     // Catch:{ IOException -> 0x0082 }
                    r1.c()     // Catch:{ IOException -> 0x0082 }
                    goto L_0x0088
                L_0x0082:
                    r1 = move-exception
                    java.lang.String r4 = "Failed to update index."
                    w7.p.e(r0, r4, r1)
                L_0x0088:
                    java.util.ArrayList r0 = new java.util.ArrayList
                    java.util.ArrayList<z6.d> r1 = r8.f5249f
                    r0.<init>(r1)
                    r1 = r3
                L_0x0090:
                    java.util.ArrayList<z6.d> r4 = r8.f5249f
                    int r4 = r4.size()
                    if (r1 >= r4) goto L_0x00b1
                    com.google.android.exoplayer2.offline.b$b r4 = new com.google.android.exoplayer2.offline.b$b
                    java.util.ArrayList<z6.d> r5 = r8.f5249f
                    java.lang.Object r5 = r5.get(r1)
                    z6.d r5 = (z6.d) r5
                    r4.<init>(r5, r3, r0)
                    android.os.Handler r5 = r8.f5248e
                    android.os.Message r4 = r5.obtainMessage(r2, r4)
                    r4.sendToTarget()
                    int r1 = r1 + 1
                    goto L_0x0090
                L_0x00b1:
                    r8.B()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.offline.b.c.p():void");
            }

            public final void q(String str) {
                z6.d f10 = f(str, true);
                if (f10 == null) {
                    p.d(b.I, "Failed to remove nonexistent download: " + str);
                    return;
                }
                n(f10, 5);
                B();
            }

            public final void r(boolean z10) {
                this.f5252i = z10;
                B();
            }

            public final void s(int i10) {
                this.f5253j = i10;
                B();
            }

            public final void t(int i10) {
                this.f5254k = i10;
            }

            public final void u(int i10) {
                this.f5251h = i10;
                B();
            }

            public final void v(@o0 String str, int i10) {
                if (str == null) {
                    for (int i11 = 0; i11 < this.f5249f.size(); i11++) {
                        w(this.f5249f.get(i11), i10);
                    }
                    try {
                        this.f5246c.h(i10);
                    } catch (IOException e10) {
                        p.e(b.I, "Failed to set manual stop reason", e10);
                    }
                } else {
                    z6.d f10 = f(str, false);
                    if (f10 != null) {
                        w(f10, i10);
                    } else {
                        try {
                            this.f5246c.d(str, i10);
                        } catch (IOException e11) {
                            p.e(b.I, "Failed to set manual stop reason: " + str, e11);
                        }
                    }
                }
                B();
            }

            public final void w(z6.d dVar, int i10) {
                z6.d dVar2 = dVar;
                int i11 = i10;
                if (i11 == 0) {
                    if (dVar2.f15945b == 1) {
                        n(dVar, 0);
                    }
                } else if (i11 != dVar2.f15949f) {
                    int i12 = dVar2.f15945b;
                    if (i12 == 0 || i12 == 2) {
                        i12 = 1;
                    }
                    m(new z6.d(dVar2.f15944a, i12, dVar2.f15946c, System.currentTimeMillis(), dVar2.f15948e, i10, 0, dVar2.f15951h));
                }
            }

            public final void x(e eVar, z6.d dVar, int i10) {
                w7.a.i(!eVar.R);
                if (!c() || i10 >= this.f5253j) {
                    n(dVar, 0);
                    eVar.g(false);
                }
            }

            @j
            @o0
            public final e y(@o0 e eVar, z6.d dVar) {
                if (eVar != null) {
                    w7.a.i(!eVar.R);
                    eVar.g(false);
                    return eVar;
                } else if (!c() || this.f5255l >= this.f5253j) {
                    return null;
                } else {
                    z6.d n10 = n(dVar, 2);
                    e eVar2 = new e(n10.f15944a, this.f5247d.a(n10.f15944a), n10.f15951h, false, this.f5254k, this);
                    this.f5250g.put(n10.f15944a.O, eVar2);
                    int i10 = this.f5255l;
                    this.f5255l = i10 + 1;
                    if (i10 == 0) {
                        sendEmptyMessageDelayed(11, h.f4357h);
                    }
                    eVar2.start();
                    return eVar2;
                }
            }

            public final void z(@o0 e eVar, z6.d dVar) {
                if (eVar == null) {
                    e eVar2 = new e(dVar.f15944a, this.f5247d.a(dVar.f15944a), dVar.f15951h, true, this.f5254k, this);
                    this.f5250g.put(dVar.f15944a.O, eVar2);
                    eVar2.start();
                } else if (!eVar.R) {
                    eVar.g(false);
                }
            }
        }

        public interface d {
            void a(b bVar, z6.d dVar);

            void b(b bVar, Requirements requirements, int i10);

            void c(b bVar);

            void d(b bVar);

            void e(b bVar, z6.d dVar);
        }

        public static class e extends Thread implements c.a {
            public final DownloadRequest O;
            public final c P;
            public final s Q;
            public final boolean R;
            public final int S;
            public volatile c T;
            public volatile boolean U;
            @o0
            public Throwable V;
            public long W;

            public e(DownloadRequest downloadRequest, c cVar, s sVar, boolean z10, int i10, c cVar2) {
                this.O = downloadRequest;
                this.P = cVar;
                this.Q = sVar;
                this.R = z10;
                this.S = i10;
                this.T = cVar2;
                this.W = -1;
            }

            public static int h(int i10) {
                return Math.min((i10 - 1) * 1000, 5000);
            }

            public void a(long j10, long j11, float f10) {
                s sVar = this.Q;
                sVar.f15980a = j11;
                sVar.f15981b = f10;
                if (j10 != this.W) {
                    this.W = j10;
                    c cVar = this.T;
                    if (cVar != null) {
                        cVar.obtainMessage(10, this).sendToTarget();
                    }
                }
            }

            public void g(boolean z10) {
                if (z10) {
                    this.T = null;
                }
                if (!this.U) {
                    this.U = true;
                    this.P.cancel();
                    interrupt();
                }
            }

            public void run() {
                long j10;
                int i10;
                try {
                    if (this.R) {
                        this.P.remove();
                    } else {
                        j10 = -1;
                        i10 = 0;
                        while (!this.U) {
                            this.P.a(this);
                        }
                    }
                } catch (IOException e10) {
                    if (!this.U) {
                        long j11 = this.Q.f15980a;
                        if (j11 != j10) {
                            i10 = 0;
                            j10 = j11;
                        }
                        i10++;
                        if (i10 <= this.S) {
                            Thread.sleep((long) h(i10));
                        } else {
                            throw e10;
                        }
                    }
                } catch (Throwable th2) {
                    this.V = th2;
                }
                c cVar = this.T;
                if (cVar != null) {
                    cVar.obtainMessage(9, this).sendToTarget();
                }
            }
        }

        public b(Context context, f6.b bVar, u7.a aVar, l.a aVar2) {
            this(context, new z6.b(bVar), new z6.c(new u(aVar, aVar2)));
        }

        public b(Context context, y yVar, v vVar) {
            this.f5225a = context.getApplicationContext();
            this.f5226b = yVar;
            this.f5235k = 3;
            this.f5236l = 5;
            this.f5234j = true;
            this.f5238n = Collections.emptyList();
            this.f5230f = new CopyOnWriteArraySet<>();
            Handler y10 = q0.y(new o(this));
            this.f5227c = y10;
            HandlerThread handlerThread = new HandlerThread("DownloadManager file i/o");
            handlerThread.start();
            c cVar = new c(handlerThread, yVar, vVar, y10, this.f5235k, this.f5236l, this.f5234j);
            this.f5228d = cVar;
            z6.p pVar = new z6.p(this);
            this.f5229e = pVar;
            a7.a aVar = new a7.a(context, pVar, f5216r);
            this.f5239o = aVar;
            int g10 = aVar.g();
            this.f5237m = g10;
            this.f5231g = 1;
            cVar.obtainMessage(0, g10, 0).sendToTarget();
        }

        public static z6.d q(z6.d dVar, DownloadRequest downloadRequest, int i10, long j10) {
            int i11;
            z6.d dVar2 = dVar;
            int i12 = dVar2.f15945b;
            long j11 = (i12 == 5 || dVar.c()) ? j10 : dVar2.f15946c;
            if (i12 == 5 || i12 == 7) {
                i11 = 7;
            } else {
                i11 = i10 != 0 ? 1 : 0;
            }
            return new z6.d(dVar2.f15944a.b(downloadRequest), i11, j11, j10, -1, i10, 0);
        }

        public void A() {
            if (this.f5234j) {
                this.f5234j = false;
                this.f5231g++;
                this.f5228d.obtainMessage(1, 0, 0).sendToTarget();
            }
        }

        public void B(int i10) {
            w7.a.a(i10 > 0);
            if (this.f5235k != i10) {
                this.f5235k = i10;
                this.f5231g++;
                this.f5228d.obtainMessage(4, i10, 0).sendToTarget();
            }
        }

        public void C(int i10) {
            w7.a.a(i10 >= 0);
            if (this.f5236l != i10) {
                this.f5236l = i10;
                this.f5231g++;
                this.f5228d.obtainMessage(5, i10, 0).sendToTarget();
            }
        }

        public void D(Requirements requirements) {
            if (!requirements.equals(this.f5239o.e())) {
                this.f5239o.h();
                a7.a aVar = new a7.a(this.f5225a, this.f5229e, requirements);
                this.f5239o = aVar;
                u(this.f5239o, aVar.g());
            }
        }

        public void E(@o0 String str, int i10) {
            this.f5231g++;
            this.f5228d.obtainMessage(3, i10, 0, str).sendToTarget();
        }

        public void c(DownloadRequest downloadRequest) {
            d(downloadRequest, 0);
        }

        public void d(DownloadRequest downloadRequest, int i10) {
            this.f5231g++;
            this.f5228d.obtainMessage(6, i10, 0, downloadRequest).sendToTarget();
        }

        public void e(d dVar) {
            this.f5230f.add(dVar);
        }

        public List<z6.d> f() {
            return this.f5238n;
        }

        public n g() {
            return this.f5226b;
        }

        public boolean h() {
            return this.f5234j;
        }

        public int i() {
            return this.f5235k;
        }

        public int j() {
            return this.f5236l;
        }

        public int k() {
            return l().c(this.f5225a);
        }

        public Requirements l() {
            return this.f5239o.e();
        }

        public final boolean m(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                s((List) message.obj);
            } else if (i10 == 1) {
                t(message.arg1, message.arg2);
            } else if (i10 == 2) {
                r((C0087b) message.obj);
            } else {
                throw new IllegalStateException();
            }
            return true;
        }

        public boolean n() {
            return this.f5232h == 0 && this.f5231g == 0;
        }

        public boolean o() {
            return this.f5233i;
        }

        public boolean p() {
            if (!this.f5234j && this.f5237m != 0) {
                for (int i10 = 0; i10 < this.f5238n.size(); i10++) {
                    if (this.f5238n.get(i10).f15945b == 0) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final void r(C0087b bVar) {
            this.f5238n = Collections.unmodifiableList(bVar.f5242c);
            z6.d dVar = bVar.f5240a;
            if (bVar.f5241b) {
                Iterator<d> it = this.f5230f.iterator();
                while (it.hasNext()) {
                    it.next().a(this, dVar);
                }
                return;
            }
            Iterator<d> it2 = this.f5230f.iterator();
            while (it2.hasNext()) {
                it2.next().e(this, dVar);
            }
        }

        public final void s(List<z6.d> list) {
            this.f5233i = true;
            this.f5238n = Collections.unmodifiableList(list);
            Iterator<d> it = this.f5230f.iterator();
            while (it.hasNext()) {
                it.next().d(this);
            }
        }

        public final void t(int i10, int i11) {
            this.f5231g -= i10;
            this.f5232h = i11;
            if (n()) {
                Iterator<d> it = this.f5230f.iterator();
                while (it.hasNext()) {
                    it.next().c(this);
                }
            }
        }

        public final void u(a7.a aVar, int i10) {
            Requirements e10 = aVar.e();
            Iterator<d> it = this.f5230f.iterator();
            while (it.hasNext()) {
                it.next().b(this, e10, i10);
            }
            if (this.f5237m != i10) {
                this.f5237m = i10;
                this.f5231g++;
                this.f5228d.obtainMessage(2, i10, 0).sendToTarget();
            }
        }

        public void v() {
            if (!this.f5234j) {
                this.f5234j = true;
                this.f5231g++;
                this.f5228d.obtainMessage(1, 1, 0).sendToTarget();
            }
        }

        public void w() {
            synchronized (this.f5228d) {
                c cVar = this.f5228d;
                if (!cVar.f5244a) {
                    cVar.sendEmptyMessage(12);
                    boolean z10 = false;
                    while (true) {
                        c cVar2 = this.f5228d;
                        if (cVar2.f5244a) {
                            break;
                        }
                        try {
                            cVar2.wait();
                        } catch (InterruptedException unused) {
                            z10 = true;
                        }
                    }
                    if (z10) {
                        Thread.currentThread().interrupt();
                    }
                    this.f5227c.removeCallbacksAndMessages((Object) null);
                    this.f5238n = Collections.emptyList();
                    this.f5231g = 0;
                    this.f5232h = 0;
                    this.f5233i = false;
                }
            }
        }

        public void x() {
            this.f5231g++;
            this.f5228d.obtainMessage(8).sendToTarget();
        }

        public void y(String str) {
            this.f5231g++;
            this.f5228d.obtainMessage(7, str).sendToTarget();
        }

        public void z(d dVar) {
            this.f5230f.remove(dVar);
        }
    }
