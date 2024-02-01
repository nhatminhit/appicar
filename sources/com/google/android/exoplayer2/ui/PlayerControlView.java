package com.google.android.exoplayer2.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import b6.b0;
import b6.i;
import b6.l0;
import b6.m0;
import b6.n0;
import b6.x0;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.ui.d;
import com.google.android.exoplayer2.ui.e;
import d.o0;
import java.util.Arrays;
import java.util.Formatter;
import q7.m;
import w7.a0;
import w7.q0;

public class PlayerControlView extends FrameLayout {
    public static final int L0 = 15000;
    public static final int M0 = 5000;
    public static final int N0 = 5000;
    public static final int O0 = 0;
    public static final int P0 = 200;
    public static final int Q0 = 100;
    public static final long R0 = 3000;
    public static final int S0 = 1000;
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public boolean E0;
    public long F0;
    public long[] G0;
    public boolean[] H0;
    public long[] I0;
    public boolean[] J0;
    public long K0;
    public final b O;
    public final View P;
    public final View Q;
    public final View R;
    public final View S;
    public final View T;
    public final View U;
    public final ImageView V;
    public final View W;

    /* renamed from: a0  reason: collision with root package name */
    public final View f5473a0;

    /* renamed from: b0  reason: collision with root package name */
    public final TextView f5474b0;

    /* renamed from: c0  reason: collision with root package name */
    public final TextView f5475c0;

    /* renamed from: d0  reason: collision with root package name */
    public final e f5476d0;

    /* renamed from: e0  reason: collision with root package name */
    public final StringBuilder f5477e0;

    /* renamed from: f0  reason: collision with root package name */
    public final Formatter f5478f0;

    /* renamed from: g0  reason: collision with root package name */
    public final x0.b f5479g0;

    /* renamed from: h0  reason: collision with root package name */
    public final x0.c f5480h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Runnable f5481i0;

    /* renamed from: j0  reason: collision with root package name */
    public final Runnable f5482j0;

    /* renamed from: k0  reason: collision with root package name */
    public final Drawable f5483k0;

    /* renamed from: l0  reason: collision with root package name */
    public final Drawable f5484l0;

    /* renamed from: m0  reason: collision with root package name */
    public final Drawable f5485m0;

    /* renamed from: n0  reason: collision with root package name */
    public final String f5486n0;

    /* renamed from: o0  reason: collision with root package name */
    public final String f5487o0;

    /* renamed from: p0  reason: collision with root package name */
    public final String f5488p0;
    @o0

    /* renamed from: q0  reason: collision with root package name */
    public n0 f5489q0;

    /* renamed from: r0  reason: collision with root package name */
    public b6.d f5490r0;
    @o0

    /* renamed from: s0  reason: collision with root package name */
    public d f5491s0;
    @o0

    /* renamed from: t0  reason: collision with root package name */
    public c f5492t0;
    @o0

    /* renamed from: u0  reason: collision with root package name */
    public m0 f5493u0;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f5494v0;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f5495w0;

    /* renamed from: x0  reason: collision with root package name */
    public boolean f5496x0;

    /* renamed from: y0  reason: collision with root package name */
    public boolean f5497y0;

    /* renamed from: z0  reason: collision with root package name */
    public int f5498z0;

    public final class b implements n0.d, e.a, View.OnClickListener {
        public b() {
        }

        public void A(boolean z10, int i10) {
            PlayerControlView.this.X();
            PlayerControlView.this.Y();
        }

        public void C(int i10) {
            PlayerControlView.this.Z();
            PlayerControlView.this.W();
        }

        public /* synthetic */ void K(TrackGroupArray trackGroupArray, m mVar) {
            b6.o0.j(this, trackGroupArray, mVar);
        }

        public /* synthetic */ void N(i iVar) {
            b6.o0.c(this, iVar);
        }

        public void a(e eVar, long j10) {
            if (PlayerControlView.this.f5475c0 != null) {
                PlayerControlView.this.f5475c0.setText(q0.f0(PlayerControlView.this.f5477e0, PlayerControlView.this.f5478f0, j10));
            }
        }

        public /* synthetic */ void b(l0 l0Var) {
            b6.o0.b(this, l0Var);
        }

        public void c(e eVar, long j10, boolean z10) {
            boolean unused = PlayerControlView.this.f5497y0 = false;
            if (!z10 && PlayerControlView.this.f5489q0 != null) {
                PlayerControlView playerControlView = PlayerControlView.this;
                playerControlView.R(playerControlView.f5489q0, j10);
            }
        }

        public /* synthetic */ void d(boolean z10) {
            b6.o0.a(this, z10);
        }

        public void e(int i10) {
            PlayerControlView.this.W();
            PlayerControlView.this.b0();
        }

        public void f(e eVar, long j10) {
            boolean unused = PlayerControlView.this.f5497y0 = true;
            if (PlayerControlView.this.f5475c0 != null) {
                PlayerControlView.this.f5475c0.setText(q0.f0(PlayerControlView.this.f5477e0, PlayerControlView.this.f5478f0, j10));
            }
        }

        public /* synthetic */ void i() {
            b6.o0.g(this);
        }

        public void k(x0 x0Var, @o0 Object obj, int i10) {
            PlayerControlView.this.W();
            PlayerControlView.this.b0();
        }

        public void onClick(View view) {
            n0 x10 = PlayerControlView.this.f5489q0;
            if (x10 != null) {
                if (PlayerControlView.this.Q == view) {
                    PlayerControlView.this.L(x10);
                } else if (PlayerControlView.this.P == view) {
                    PlayerControlView.this.M(x10);
                } else if (PlayerControlView.this.T == view) {
                    PlayerControlView.this.E(x10);
                } else if (PlayerControlView.this.U == view) {
                    PlayerControlView.this.O(x10);
                } else if (PlayerControlView.this.R == view) {
                    if (x10.e() == 1) {
                        if (PlayerControlView.this.f5493u0 != null) {
                            PlayerControlView.this.f5493u0.a();
                        }
                    } else if (x10.e() == 4) {
                        PlayerControlView.this.f5490r0.b(x10, x10.Q(), b6.c.f4201b);
                    }
                    PlayerControlView.this.f5490r0.a(x10, true);
                } else if (PlayerControlView.this.S == view) {
                    PlayerControlView.this.f5490r0.a(x10, false);
                } else if (PlayerControlView.this.V == view) {
                    PlayerControlView.this.f5490r0.d(x10, a0.a(x10.k(), PlayerControlView.this.D0));
                } else if (PlayerControlView.this.W == view) {
                    PlayerControlView.this.f5490r0.c(x10, !x10.z0());
                }
            }
        }

        public void t(boolean z10) {
            PlayerControlView.this.a0();
            PlayerControlView.this.W();
        }
    }

    public interface c {
        void a(long j10, long j11);
    }

    public interface d {
        void a(int i10);
    }

    static {
        b0.a("goog.exo.ui");
    }

    public PlayerControlView(Context context) {
        this(context, (AttributeSet) null);
    }

    public PlayerControlView(Context context, @o0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayerControlView(Context context, @o0 AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, attributeSet);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0187  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PlayerControlView(android.content.Context r5, @d.o0 android.util.AttributeSet r6, int r7, @d.o0 android.util.AttributeSet r8) {
        /*
            r4 = this;
            r4.<init>(r5, r6, r7)
            int r6 = com.google.android.exoplayer2.ui.d.g.exo_player_control_view
            r7 = 5000(0x1388, float:7.006E-42)
            r4.f5498z0 = r7
            r0 = 15000(0x3a98, float:2.102E-41)
            r4.A0 = r0
            r4.B0 = r7
            r7 = 0
            r4.D0 = r7
            r0 = 200(0xc8, float:2.8E-43)
            r4.C0 = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4.F0 = r0
            r4.E0 = r7
            if (r8 == 0) goto L_0x0075
            android.content.res.Resources$Theme r0 = r5.getTheme()
            int[] r1 = com.google.android.exoplayer2.ui.d.j.PlayerControlView
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r8, r1, r7, r7)
            int r1 = com.google.android.exoplayer2.ui.d.j.PlayerControlView_rewind_increment     // Catch:{ all -> 0x0070 }
            int r2 = r4.f5498z0     // Catch:{ all -> 0x0070 }
            int r1 = r0.getInt(r1, r2)     // Catch:{ all -> 0x0070 }
            r4.f5498z0 = r1     // Catch:{ all -> 0x0070 }
            int r1 = com.google.android.exoplayer2.ui.d.j.PlayerControlView_fastforward_increment     // Catch:{ all -> 0x0070 }
            int r2 = r4.A0     // Catch:{ all -> 0x0070 }
            int r1 = r0.getInt(r1, r2)     // Catch:{ all -> 0x0070 }
            r4.A0 = r1     // Catch:{ all -> 0x0070 }
            int r1 = com.google.android.exoplayer2.ui.d.j.PlayerControlView_show_timeout     // Catch:{ all -> 0x0070 }
            int r2 = r4.B0     // Catch:{ all -> 0x0070 }
            int r1 = r0.getInt(r1, r2)     // Catch:{ all -> 0x0070 }
            r4.B0 = r1     // Catch:{ all -> 0x0070 }
            int r1 = com.google.android.exoplayer2.ui.d.j.PlayerControlView_controller_layout_id     // Catch:{ all -> 0x0070 }
            int r6 = r0.getResourceId(r1, r6)     // Catch:{ all -> 0x0070 }
            int r1 = r4.D0     // Catch:{ all -> 0x0070 }
            int r1 = F(r0, r1)     // Catch:{ all -> 0x0070 }
            r4.D0 = r1     // Catch:{ all -> 0x0070 }
            int r1 = com.google.android.exoplayer2.ui.d.j.PlayerControlView_show_shuffle_button     // Catch:{ all -> 0x0070 }
            boolean r2 = r4.E0     // Catch:{ all -> 0x0070 }
            boolean r1 = r0.getBoolean(r1, r2)     // Catch:{ all -> 0x0070 }
            r4.E0 = r1     // Catch:{ all -> 0x0070 }
            int r1 = com.google.android.exoplayer2.ui.d.j.PlayerControlView_time_bar_min_update_interval     // Catch:{ all -> 0x0070 }
            int r2 = r4.C0     // Catch:{ all -> 0x0070 }
            int r1 = r0.getInt(r1, r2)     // Catch:{ all -> 0x0070 }
            r4.setTimeBarMinUpdateInterval(r1)     // Catch:{ all -> 0x0070 }
            r0.recycle()
            goto L_0x0075
        L_0x0070:
            r5 = move-exception
            r0.recycle()
            throw r5
        L_0x0075:
            b6.x0$b r0 = new b6.x0$b
            r0.<init>()
            r4.f5479g0 = r0
            b6.x0$c r0 = new b6.x0$c
            r0.<init>()
            r4.f5480h0 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r4.f5477e0 = r0
            java.util.Formatter r1 = new java.util.Formatter
            java.util.Locale r2 = java.util.Locale.getDefault()
            r1.<init>(r0, r2)
            r4.f5478f0 = r1
            long[] r0 = new long[r7]
            r4.G0 = r0
            boolean[] r0 = new boolean[r7]
            r4.H0 = r0
            long[] r0 = new long[r7]
            r4.I0 = r0
            boolean[] r0 = new boolean[r7]
            r4.J0 = r0
            com.google.android.exoplayer2.ui.PlayerControlView$b r0 = new com.google.android.exoplayer2.ui.PlayerControlView$b
            r1 = 0
            r0.<init>()
            r4.O = r0
            b6.e r2 = new b6.e
            r2.<init>()
            r4.f5490r0 = r2
            r7.e r2 = new r7.e
            r2.<init>(r4)
            r4.f5481i0 = r2
            r7.f r2 = new r7.f
            r2.<init>(r4)
            r4.f5482j0 = r2
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r5)
            r2.inflate(r6, r4)
            r6 = 262144(0x40000, float:3.67342E-40)
            r4.setDescendantFocusability(r6)
            int r6 = com.google.android.exoplayer2.ui.d.e.exo_progress
            android.view.View r2 = r4.findViewById(r6)
            com.google.android.exoplayer2.ui.e r2 = (com.google.android.exoplayer2.ui.e) r2
            int r3 = com.google.android.exoplayer2.ui.d.e.exo_progress_placeholder
            android.view.View r3 = r4.findViewById(r3)
            if (r2 == 0) goto L_0x00e1
        L_0x00de:
            r4.f5476d0 = r2
            goto L_0x0105
        L_0x00e1:
            if (r3 == 0) goto L_0x0103
            com.google.android.exoplayer2.ui.DefaultTimeBar r2 = new com.google.android.exoplayer2.ui.DefaultTimeBar
            r2.<init>(r5, r1, r7, r8)
            r2.setId(r6)
            android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
            r2.setLayoutParams(r6)
            android.view.ViewParent r6 = r3.getParent()
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            int r8 = r6.indexOfChild(r3)
            r6.removeView(r3)
            r6.addView(r2, r8)
            goto L_0x00de
        L_0x0103:
            r4.f5476d0 = r1
        L_0x0105:
            int r6 = com.google.android.exoplayer2.ui.d.e.exo_duration
            android.view.View r6 = r4.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r4.f5474b0 = r6
            int r6 = com.google.android.exoplayer2.ui.d.e.exo_position
            android.view.View r6 = r4.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r4.f5475c0 = r6
            com.google.android.exoplayer2.ui.e r6 = r4.f5476d0
            if (r6 == 0) goto L_0x0120
            r6.c(r0)
        L_0x0120:
            int r6 = com.google.android.exoplayer2.ui.d.e.exo_play
            android.view.View r6 = r4.findViewById(r6)
            r4.R = r6
            if (r6 == 0) goto L_0x012d
            r6.setOnClickListener(r0)
        L_0x012d:
            int r6 = com.google.android.exoplayer2.ui.d.e.exo_pause
            android.view.View r6 = r4.findViewById(r6)
            r4.S = r6
            if (r6 == 0) goto L_0x013a
            r6.setOnClickListener(r0)
        L_0x013a:
            int r6 = com.google.android.exoplayer2.ui.d.e.exo_prev
            android.view.View r6 = r4.findViewById(r6)
            r4.P = r6
            if (r6 == 0) goto L_0x0147
            r6.setOnClickListener(r0)
        L_0x0147:
            int r6 = com.google.android.exoplayer2.ui.d.e.exo_next
            android.view.View r6 = r4.findViewById(r6)
            r4.Q = r6
            if (r6 == 0) goto L_0x0154
            r6.setOnClickListener(r0)
        L_0x0154:
            int r6 = com.google.android.exoplayer2.ui.d.e.exo_rew
            android.view.View r6 = r4.findViewById(r6)
            r4.U = r6
            if (r6 == 0) goto L_0x0161
            r6.setOnClickListener(r0)
        L_0x0161:
            int r6 = com.google.android.exoplayer2.ui.d.e.exo_ffwd
            android.view.View r6 = r4.findViewById(r6)
            r4.T = r6
            if (r6 == 0) goto L_0x016e
            r6.setOnClickListener(r0)
        L_0x016e:
            int r6 = com.google.android.exoplayer2.ui.d.e.exo_repeat_toggle
            android.view.View r6 = r4.findViewById(r6)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r4.V = r6
            if (r6 == 0) goto L_0x017d
            r6.setOnClickListener(r0)
        L_0x017d:
            int r6 = com.google.android.exoplayer2.ui.d.e.exo_shuffle
            android.view.View r6 = r4.findViewById(r6)
            r4.W = r6
            if (r6 == 0) goto L_0x018a
            r6.setOnClickListener(r0)
        L_0x018a:
            int r6 = com.google.android.exoplayer2.ui.d.e.exo_vr
            android.view.View r6 = r4.findViewById(r6)
            r4.f5473a0 = r6
            r4.setShowVrButton(r7)
            android.content.res.Resources r5 = r5.getResources()
            int r6 = com.google.android.exoplayer2.ui.d.C0091d.exo_controls_repeat_off
            android.graphics.drawable.Drawable r6 = r5.getDrawable(r6)
            r4.f5483k0 = r6
            int r6 = com.google.android.exoplayer2.ui.d.C0091d.exo_controls_repeat_one
            android.graphics.drawable.Drawable r6 = r5.getDrawable(r6)
            r4.f5484l0 = r6
            int r6 = com.google.android.exoplayer2.ui.d.C0091d.exo_controls_repeat_all
            android.graphics.drawable.Drawable r6 = r5.getDrawable(r6)
            r4.f5485m0 = r6
            int r6 = com.google.android.exoplayer2.ui.d.h.exo_controls_repeat_off_description
            java.lang.String r6 = r5.getString(r6)
            r4.f5486n0 = r6
            int r6 = com.google.android.exoplayer2.ui.d.h.exo_controls_repeat_one_description
            java.lang.String r6 = r5.getString(r6)
            r4.f5487o0 = r6
            int r6 = com.google.android.exoplayer2.ui.d.h.exo_controls_repeat_all_description
            java.lang.String r5 = r5.getString(r6)
            r4.f5488p0 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.PlayerControlView.<init>(android.content.Context, android.util.AttributeSet, int, android.util.AttributeSet):void");
    }

    public static boolean C(x0 x0Var, x0.c cVar) {
        if (x0Var.q() > 100) {
            return false;
        }
        int q10 = x0Var.q();
        for (int i10 = 0; i10 < q10; i10++) {
            if (x0Var.n(i10, cVar).f4506i == b6.c.f4201b) {
                return false;
            }
        }
        return true;
    }

    public static int F(TypedArray typedArray, int i10) {
        return typedArray.getInt(d.j.PlayerControlView_repeat_toggle_modes, i10);
    }

    @SuppressLint({"InlinedApi"})
    public static boolean I(int i10) {
        return i10 == 90 || i10 == 89 || i10 == 85 || i10 == 126 || i10 == 127 || i10 == 87 || i10 == 88;
    }

    public boolean D(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (this.f5489q0 == null || !I(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() == 0) {
            if (keyCode == 90) {
                E(this.f5489q0);
            } else if (keyCode == 89) {
                O(this.f5489q0);
            } else if (keyEvent.getRepeatCount() == 0) {
                if (keyCode == 85) {
                    b6.d dVar = this.f5490r0;
                    n0 n0Var = this.f5489q0;
                    dVar.a(n0Var, !n0Var.q());
                } else if (keyCode == 87) {
                    L(this.f5489q0);
                } else if (keyCode == 88) {
                    M(this.f5489q0);
                } else if (keyCode == 126) {
                    this.f5490r0.a(this.f5489q0, true);
                } else if (keyCode == 127) {
                    this.f5490r0.a(this.f5489q0, false);
                }
            }
        }
        return true;
    }

    public final void E(n0 n0Var) {
        if (n0Var.C() && this.A0 > 0) {
            P(n0Var, n0Var.getCurrentPosition() + ((long) this.A0));
        }
    }

    public void G() {
        if (K()) {
            setVisibility(8);
            d dVar = this.f5491s0;
            if (dVar != null) {
                dVar.a(getVisibility());
            }
            removeCallbacks(this.f5481i0);
            removeCallbacks(this.f5482j0);
            this.F0 = b6.c.f4201b;
        }
    }

    public final void H() {
        removeCallbacks(this.f5482j0);
        if (this.B0 > 0) {
            long uptimeMillis = SystemClock.uptimeMillis();
            int i10 = this.B0;
            this.F0 = uptimeMillis + ((long) i10);
            if (this.f5494v0) {
                postDelayed(this.f5482j0, (long) i10);
                return;
            }
            return;
        }
        this.F0 = b6.c.f4201b;
    }

    public final boolean J() {
        n0 n0Var = this.f5489q0;
        return (n0Var == null || n0Var.e() == 4 || this.f5489q0.e() == 1 || !this.f5489q0.q()) ? false : true;
    }

    public boolean K() {
        return getVisibility() == 0;
    }

    public final void L(n0 n0Var) {
        x0 t02 = n0Var.t0();
        if (!t02.r() && !n0Var.m()) {
            int Q2 = n0Var.Q();
            int n02 = n0Var.n0();
            if (n02 != -1) {
                Q(n0Var, n02, b6.c.f4201b);
            } else if (t02.n(Q2, this.f5480h0).f4502e) {
                Q(n0Var, Q2, b6.c.f4201b);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        if (r1.f4501d == false) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void M(b6.n0 r6) {
        /*
            r5 = this;
            b6.x0 r0 = r6.t0()
            boolean r1 = r0.r()
            if (r1 != 0) goto L_0x0043
            boolean r1 = r6.m()
            if (r1 == 0) goto L_0x0011
            goto L_0x0043
        L_0x0011:
            int r1 = r6.Q()
            b6.x0$c r2 = r5.f5480h0
            r0.n(r1, r2)
            int r0 = r6.c0()
            r1 = -1
            if (r0 == r1) goto L_0x003e
            long r1 = r6.getCurrentPosition()
            r3 = 3000(0xbb8, double:1.482E-320)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0035
            b6.x0$c r1 = r5.f5480h0
            boolean r2 = r1.f4502e
            if (r2 == 0) goto L_0x003e
            boolean r1 = r1.f4501d
            if (r1 != 0) goto L_0x003e
        L_0x0035:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.Q(r6, r0, r1)
            goto L_0x0043
        L_0x003e:
            r0 = 0
            r5.P(r6, r0)
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.PlayerControlView.M(b6.n0):void");
    }

    public final void N() {
        View view;
        View view2;
        boolean J = J();
        if (!J && (view2 = this.R) != null) {
            view2.requestFocus();
        } else if (J && (view = this.S) != null) {
            view.requestFocus();
        }
    }

    public final void O(n0 n0Var) {
        if (n0Var.C() && this.f5498z0 > 0) {
            P(n0Var, n0Var.getCurrentPosition() - ((long) this.f5498z0));
        }
    }

    public final void P(n0 n0Var, long j10) {
        Q(n0Var, n0Var.Q(), j10);
    }

    public final boolean Q(n0 n0Var, int i10, long j10) {
        long duration = n0Var.getDuration();
        if (duration != b6.c.f4201b) {
            j10 = Math.min(j10, duration);
        }
        return this.f5490r0.b(n0Var, i10, Math.max(j10, 0));
    }

    public final void R(n0 n0Var, long j10) {
        int i10;
        x0 t02 = n0Var.t0();
        if (this.f5496x0 && !t02.r()) {
            int q10 = t02.q();
            i10 = 0;
            while (true) {
                long c10 = t02.n(i10, this.f5480h0).c();
                if (j10 < c10) {
                    break;
                } else if (i10 == q10 - 1) {
                    j10 = c10;
                    break;
                } else {
                    j10 -= c10;
                    i10++;
                }
            }
        } else {
            i10 = n0Var.Q();
        }
        if (!Q(n0Var, i10, j10)) {
            Y();
        }
    }

    public final void S(boolean z10, View view) {
        if (view != null) {
            view.setEnabled(z10);
            view.setAlpha(z10 ? 1.0f : 0.3f);
            view.setVisibility(0);
        }
    }

    public void T(@o0 long[] jArr, @o0 boolean[] zArr) {
        boolean z10 = false;
        if (jArr == null) {
            this.I0 = new long[0];
            this.J0 = new boolean[0];
        } else {
            boolean[] zArr2 = (boolean[]) w7.a.g(zArr);
            if (jArr.length == zArr2.length) {
                z10 = true;
            }
            w7.a.a(z10);
            this.I0 = jArr;
            this.J0 = zArr2;
        }
        b0();
    }

    public void U() {
        if (!K()) {
            setVisibility(0);
            d dVar = this.f5491s0;
            if (dVar != null) {
                dVar.a(getVisibility());
            }
            V();
            N();
        }
        H();
    }

    public final void V() {
        X();
        W();
        Z();
        a0();
        b0();
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void W() {
        /*
            r8 = this;
            boolean r0 = r8.K()
            if (r0 == 0) goto L_0x0089
            boolean r0 = r8.f5494v0
            if (r0 != 0) goto L_0x000c
            goto L_0x0089
        L_0x000c:
            b6.n0 r0 = r8.f5489q0
            r1 = 0
            if (r0 == 0) goto L_0x006a
            b6.x0 r0 = r0.t0()
            boolean r2 = r0.r()
            if (r2 != 0) goto L_0x006a
            b6.n0 r2 = r8.f5489q0
            boolean r2 = r2.m()
            if (r2 != 0) goto L_0x006a
            b6.n0 r2 = r8.f5489q0
            int r2 = r2.Q()
            b6.x0$c r3 = r8.f5480h0
            r0.n(r2, r3)
            b6.x0$c r0 = r8.f5480h0
            boolean r2 = r0.f4501d
            r3 = 1
            if (r2 != 0) goto L_0x0044
            boolean r0 = r0.f4502e
            if (r0 == 0) goto L_0x0044
            b6.n0 r0 = r8.f5489q0
            boolean r0 = r0.hasPrevious()
            if (r0 == 0) goto L_0x0042
            goto L_0x0044
        L_0x0042:
            r0 = r1
            goto L_0x0045
        L_0x0044:
            r0 = r3
        L_0x0045:
            if (r2 == 0) goto L_0x004d
            int r4 = r8.f5498z0
            if (r4 <= 0) goto L_0x004d
            r4 = r3
            goto L_0x004e
        L_0x004d:
            r4 = r1
        L_0x004e:
            if (r2 == 0) goto L_0x0056
            int r5 = r8.A0
            if (r5 <= 0) goto L_0x0056
            r5 = r3
            goto L_0x0057
        L_0x0056:
            r5 = r1
        L_0x0057:
            b6.x0$c r6 = r8.f5480h0
            boolean r6 = r6.f4502e
            if (r6 != 0) goto L_0x0065
            b6.n0 r6 = r8.f5489q0
            boolean r6 = r6.hasNext()
            if (r6 == 0) goto L_0x0066
        L_0x0065:
            r1 = r3
        L_0x0066:
            r7 = r1
            r1 = r0
            r0 = r7
            goto L_0x006e
        L_0x006a:
            r0 = r1
            r2 = r0
            r4 = r2
            r5 = r4
        L_0x006e:
            android.view.View r3 = r8.P
            r8.S(r1, r3)
            android.view.View r1 = r8.U
            r8.S(r4, r1)
            android.view.View r1 = r8.T
            r8.S(r5, r1)
            android.view.View r1 = r8.Q
            r8.S(r0, r1)
            com.google.android.exoplayer2.ui.e r0 = r8.f5476d0
            if (r0 == 0) goto L_0x0089
            r0.setEnabled(r2)
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.PlayerControlView.W():void");
    }

    public final void X() {
        boolean z10;
        if (K() && this.f5494v0) {
            boolean J = J();
            View view = this.R;
            int i10 = 8;
            boolean z11 = true;
            if (view != null) {
                z10 = (J && view.isFocused()) | false;
                this.R.setVisibility(J ? 8 : 0);
            } else {
                z10 = false;
            }
            View view2 = this.S;
            if (view2 != null) {
                if (J || !view2.isFocused()) {
                    z11 = false;
                }
                z10 |= z11;
                View view3 = this.S;
                if (J) {
                    i10 = 0;
                }
                view3.setVisibility(i10);
            }
            if (z10) {
                N();
            }
        }
    }

    public final void Y() {
        long j10;
        if (K() && this.f5494v0) {
            n0 n0Var = this.f5489q0;
            long j11 = 0;
            if (n0Var != null) {
                j11 = this.K0 + n0Var.a0();
                j10 = this.K0 + this.f5489q0.A0();
            } else {
                j10 = 0;
            }
            TextView textView = this.f5475c0;
            if (textView != null && !this.f5497y0) {
                textView.setText(q0.f0(this.f5477e0, this.f5478f0, j11));
            }
            e eVar = this.f5476d0;
            if (eVar != null) {
                eVar.setPosition(j11);
                this.f5476d0.setBufferedPosition(j10);
            }
            c cVar = this.f5492t0;
            if (cVar != null) {
                cVar.a(j11, j10);
            }
            removeCallbacks(this.f5481i0);
            n0 n0Var2 = this.f5489q0;
            int e10 = n0Var2 == null ? 1 : n0Var2.e();
            long j12 = 1000;
            if (e10 == 3 && this.f5489q0.q()) {
                e eVar2 = this.f5476d0;
                long min = Math.min(eVar2 != null ? eVar2.getPreferredUpdateDelay() : 1000, 1000 - (j11 % 1000));
                float f10 = this.f5489q0.d().f4402a;
                if (f10 > 0.0f) {
                    j12 = (long) (((float) min) / f10);
                }
                postDelayed(this.f5481i0, q0.v(j12, (long) this.C0, 1000));
            } else if (e10 != 4 && e10 != 1) {
                postDelayed(this.f5481i0, 1000);
            }
        }
    }

    public final void Z() {
        ImageView imageView;
        String str;
        ImageView imageView2;
        if (K() && this.f5494v0 && (imageView = this.V) != null) {
            if (this.D0 == 0) {
                imageView.setVisibility(8);
            } else if (this.f5489q0 == null) {
                S(false, imageView);
            } else {
                S(true, imageView);
                int k10 = this.f5489q0.k();
                if (k10 == 0) {
                    this.V.setImageDrawable(this.f5483k0);
                    imageView2 = this.V;
                    str = this.f5486n0;
                } else if (k10 != 1) {
                    if (k10 == 2) {
                        this.V.setImageDrawable(this.f5485m0);
                        imageView2 = this.V;
                        str = this.f5488p0;
                    }
                    this.V.setVisibility(0);
                } else {
                    this.V.setImageDrawable(this.f5484l0);
                    imageView2 = this.V;
                    str = this.f5487o0;
                }
                imageView2.setContentDescription(str);
                this.V.setVisibility(0);
            }
        }
    }

    public final void a0() {
        View view;
        if (K() && this.f5494v0 && (view = this.W) != null) {
            if (!this.E0) {
                view.setVisibility(8);
                return;
            }
            n0 n0Var = this.f5489q0;
            if (n0Var == null) {
                S(false, view);
                return;
            }
            view.setAlpha(n0Var.z0() ? 1.0f : 0.3f);
            this.W.setEnabled(true);
            this.W.setVisibility(0);
        }
    }

    public final void b0() {
        int i10;
        x0.c cVar;
        n0 n0Var = this.f5489q0;
        if (n0Var != null) {
            boolean z10 = true;
            this.f5496x0 = this.f5495w0 && C(n0Var.t0(), this.f5480h0);
            long j10 = 0;
            this.K0 = 0;
            x0 t02 = this.f5489q0.t0();
            if (!t02.r()) {
                int Q2 = this.f5489q0.Q();
                boolean z11 = this.f5496x0;
                int i11 = z11 ? 0 : Q2;
                int q10 = z11 ? t02.q() - 1 : Q2;
                long j11 = 0;
                i10 = 0;
                while (true) {
                    if (i11 > q10) {
                        break;
                    }
                    if (i11 == Q2) {
                        this.K0 = b6.c.c(j11);
                    }
                    t02.n(i11, this.f5480h0);
                    x0.c cVar2 = this.f5480h0;
                    if (cVar2.f4506i == b6.c.f4201b) {
                        w7.a.i(this.f5496x0 ^ z10);
                        break;
                    }
                    int i12 = cVar2.f4503f;
                    while (true) {
                        cVar = this.f5480h0;
                        if (i12 > cVar.f4504g) {
                            break;
                        }
                        t02.f(i12, this.f5479g0);
                        int c10 = this.f5479g0.c();
                        for (int i13 = 0; i13 < c10; i13++) {
                            long f10 = this.f5479g0.f(i13);
                            if (f10 == Long.MIN_VALUE) {
                                long j12 = this.f5479g0.f4495d;
                                if (j12 == b6.c.f4201b) {
                                } else {
                                    f10 = j12;
                                }
                            }
                            long m10 = f10 + this.f5479g0.m();
                            if (m10 >= 0 && m10 <= this.f5480h0.f4506i) {
                                long[] jArr = this.G0;
                                if (i10 == jArr.length) {
                                    int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                    this.G0 = Arrays.copyOf(jArr, length);
                                    this.H0 = Arrays.copyOf(this.H0, length);
                                }
                                this.G0[i10] = b6.c.c(j11 + m10);
                                this.H0[i10] = this.f5479g0.n(i13);
                                i10++;
                            }
                        }
                        i12++;
                    }
                    j11 += cVar.f4506i;
                    i11++;
                    z10 = true;
                }
                j10 = j11;
            } else {
                i10 = 0;
            }
            long c11 = b6.c.c(j10);
            TextView textView = this.f5474b0;
            if (textView != null) {
                textView.setText(q0.f0(this.f5477e0, this.f5478f0, c11));
            }
            e eVar = this.f5476d0;
            if (eVar != null) {
                eVar.setDuration(c11);
                int length2 = this.I0.length;
                int i14 = i10 + length2;
                long[] jArr2 = this.G0;
                if (i14 > jArr2.length) {
                    this.G0 = Arrays.copyOf(jArr2, i14);
                    this.H0 = Arrays.copyOf(this.H0, i14);
                }
                System.arraycopy(this.I0, 0, this.G0, i10, length2);
                System.arraycopy(this.J0, 0, this.H0, i10, length2);
                this.f5476d0.a(this.G0, this.H0, i14);
            }
            Y();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return D(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.f5482j0);
        } else if (motionEvent.getAction() == 1) {
            H();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @o0
    public n0 getPlayer() {
        return this.f5489q0;
    }

    public int getRepeatToggleModes() {
        return this.D0;
    }

    public boolean getShowShuffleButton() {
        return this.E0;
    }

    public int getShowTimeoutMs() {
        return this.B0;
    }

    public boolean getShowVrButton() {
        View view = this.f5473a0;
        return view != null && view.getVisibility() == 0;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f5494v0 = true;
        long j10 = this.F0;
        if (j10 != b6.c.f4201b) {
            long uptimeMillis = j10 - SystemClock.uptimeMillis();
            if (uptimeMillis <= 0) {
                G();
            } else {
                postDelayed(this.f5482j0, uptimeMillis);
            }
        } else if (K()) {
            H();
        }
        V();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f5494v0 = false;
        removeCallbacks(this.f5481i0);
        removeCallbacks(this.f5482j0);
    }

    public void setControlDispatcher(@o0 b6.d dVar) {
        if (dVar == null) {
            dVar = new b6.e();
        }
        this.f5490r0 = dVar;
    }

    public void setFastForwardIncrementMs(int i10) {
        this.A0 = i10;
        W();
    }

    public void setPlaybackPreparer(@o0 m0 m0Var) {
        this.f5493u0 = m0Var;
    }

    public void setPlayer(@o0 n0 n0Var) {
        boolean z10 = true;
        w7.a.i(Looper.myLooper() == Looper.getMainLooper());
        if (!(n0Var == null || n0Var.u0() == Looper.getMainLooper())) {
            z10 = false;
        }
        w7.a.a(z10);
        n0 n0Var2 = this.f5489q0;
        if (n0Var2 != n0Var) {
            if (n0Var2 != null) {
                n0Var2.J(this.O);
            }
            this.f5489q0 = n0Var;
            if (n0Var != null) {
                n0Var.P(this.O);
            }
            V();
        }
    }

    public void setProgressUpdateListener(@o0 c cVar) {
        this.f5492t0 = cVar;
    }

    public void setRepeatToggleModes(int i10) {
        int i11;
        b6.d dVar;
        n0 n0Var;
        this.D0 = i10;
        n0 n0Var2 = this.f5489q0;
        if (n0Var2 != null) {
            int k10 = n0Var2.k();
            if (i10 != 0 || k10 == 0) {
                i11 = 2;
                if (i10 == 1 && k10 == 2) {
                    this.f5490r0.d(this.f5489q0, 1);
                } else if (i10 == 2 && k10 == 1) {
                    dVar = this.f5490r0;
                    n0Var = this.f5489q0;
                }
            } else {
                dVar = this.f5490r0;
                n0Var = this.f5489q0;
                i11 = 0;
            }
            dVar.d(n0Var, i11);
        }
        Z();
    }

    public void setRewindIncrementMs(int i10) {
        this.f5498z0 = i10;
        W();
    }

    public void setShowMultiWindowTimeBar(boolean z10) {
        this.f5495w0 = z10;
        b0();
    }

    public void setShowShuffleButton(boolean z10) {
        this.E0 = z10;
        a0();
    }

    public void setShowTimeoutMs(int i10) {
        this.B0 = i10;
        if (K()) {
            H();
        }
    }

    public void setShowVrButton(boolean z10) {
        View view = this.f5473a0;
        if (view != null) {
            view.setVisibility(z10 ? 0 : 8);
        }
    }

    public void setTimeBarMinUpdateInterval(int i10) {
        this.C0 = q0.u(i10, 16, 1000);
    }

    public void setVisibilityListener(d dVar) {
        this.f5491s0 = dVar;
    }

    public void setVrButtonListener(@o0 View.OnClickListener onClickListener) {
        View view = this.f5473a0;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }
}
