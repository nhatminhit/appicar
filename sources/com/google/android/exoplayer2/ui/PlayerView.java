package com.google.android.exoplayer2.ui;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import b6.i;
import b6.l0;
import b6.m0;
import b6.n0;
import b6.x0;
import c7.b;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.f;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import com.google.android.exoplayer2.ui.PlayerControlView;
import com.google.android.exoplayer2.ui.d;
import com.google.android.exoplayer2.ui.spherical.SphericalSurfaceView;
import d.o0;
import h7.k;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import q7.m;
import s7.g;
import w7.h;
import w7.q0;

public class PlayerView extends FrameLayout implements b.a {

    /* renamed from: q0  reason: collision with root package name */
    public static final int f5499q0 = 0;

    /* renamed from: r0  reason: collision with root package name */
    public static final int f5500r0 = 1;

    /* renamed from: s0  reason: collision with root package name */
    public static final int f5501s0 = 2;

    /* renamed from: t0  reason: collision with root package name */
    public static final int f5502t0 = 0;

    /* renamed from: u0  reason: collision with root package name */
    public static final int f5503u0 = 1;

    /* renamed from: v0  reason: collision with root package name */
    public static final int f5504v0 = 2;

    /* renamed from: w0  reason: collision with root package name */
    public static final int f5505w0 = 3;

    /* renamed from: x0  reason: collision with root package name */
    public static final int f5506x0 = 3;

    /* renamed from: y0  reason: collision with root package name */
    public static final int f5507y0 = -1;
    @o0
    public final AspectRatioFrameLayout O;
    public final View P;
    @o0
    public final View Q;
    public final ImageView R;
    public final SubtitleView S;
    @o0
    public final View T;
    @o0
    public final TextView U;
    @o0
    public final PlayerControlView V;
    public final b W;
    @o0

    /* renamed from: a0  reason: collision with root package name */
    public final FrameLayout f5508a0;
    @o0

    /* renamed from: b0  reason: collision with root package name */
    public final FrameLayout f5509b0;

    /* renamed from: c0  reason: collision with root package name */
    public n0 f5510c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f5511d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f5512e0;
    @o0

    /* renamed from: f0  reason: collision with root package name */
    public Drawable f5513f0;

    /* renamed from: g0  reason: collision with root package name */
    public int f5514g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f5515h0;
    @o0

    /* renamed from: i0  reason: collision with root package name */
    public h<? super i> f5516i0;
    @o0

    /* renamed from: j0  reason: collision with root package name */
    public CharSequence f5517j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f5518k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f5519l0;

    /* renamed from: m0  reason: collision with root package name */
    public boolean f5520m0;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f5521n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f5522o0;

    /* renamed from: p0  reason: collision with root package name */
    public boolean f5523p0;

    public final class b implements n0.d, k, x7.h, View.OnLayoutChangeListener, g {
        public b() {
        }

        public void A(boolean z10, int i10) {
            PlayerView.this.L();
            PlayerView.this.M();
            if (!PlayerView.this.x() || !PlayerView.this.f5520m0) {
                PlayerView.this.y(false);
            } else {
                PlayerView.this.u();
            }
        }

        public /* synthetic */ void C(int i10) {
            b6.o0.f(this, i10);
        }

        public void F() {
            if (PlayerView.this.P != null) {
                PlayerView.this.P.setVisibility(4);
            }
        }

        public void K(TrackGroupArray trackGroupArray, m mVar) {
            PlayerView.this.N(false);
        }

        public /* synthetic */ void N(i iVar) {
            b6.o0.c(this, iVar);
        }

        public /* synthetic */ void O(int i10, int i11) {
            x7.g.b(this, i10, i11);
        }

        public /* synthetic */ void b(l0 l0Var) {
            b6.o0.b(this, l0Var);
        }

        public void c(int i10, int i11, int i12, float f10) {
            float f11 = (i11 == 0 || i10 == 0) ? 1.0f : (((float) i10) * f10) / ((float) i11);
            if (PlayerView.this.Q instanceof TextureView) {
                if (i12 == 90 || i12 == 270) {
                    f11 = 1.0f / f11;
                }
                if (PlayerView.this.f5522o0 != 0) {
                    PlayerView.this.Q.removeOnLayoutChangeListener(this);
                }
                int unused = PlayerView.this.f5522o0 = i12;
                if (PlayerView.this.f5522o0 != 0) {
                    PlayerView.this.Q.addOnLayoutChangeListener(this);
                }
                PlayerView.o((TextureView) PlayerView.this.Q, PlayerView.this.f5522o0);
            }
            PlayerView playerView = PlayerView.this;
            playerView.z(f11, playerView.O, PlayerView.this.Q);
        }

        public /* synthetic */ void d(boolean z10) {
            b6.o0.a(this, z10);
        }

        public void e(int i10) {
            if (PlayerView.this.x() && PlayerView.this.f5520m0) {
                PlayerView.this.u();
            }
        }

        public /* synthetic */ void i() {
            b6.o0.g(this);
        }

        public void j(List<h7.b> list) {
            if (PlayerView.this.S != null) {
                PlayerView.this.S.j(list);
            }
        }

        public /* synthetic */ void k(x0 x0Var, Object obj, int i10) {
            b6.o0.i(this, x0Var, obj, i10);
        }

        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            PlayerView.o((TextureView) view, PlayerView.this.f5522o0);
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            return PlayerView.this.K();
        }

        public /* synthetic */ void t(boolean z10) {
            b6.o0.h(this, z10);
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    public PlayerView(Context context) {
        this(context, (AttributeSet) null);
    }

    public PlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: finally extract failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlayerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        boolean z13;
        int i13;
        boolean z14;
        boolean z15;
        int i14;
        boolean z16;
        int i15;
        boolean z17;
        View view;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        if (isInEditMode()) {
            this.O = null;
            this.P = null;
            this.Q = null;
            this.R = null;
            this.S = null;
            this.T = null;
            this.U = null;
            this.V = null;
            this.W = null;
            this.f5508a0 = null;
            this.f5509b0 = null;
            ImageView imageView = new ImageView(context2);
            if (q0.f14786a >= 23) {
                r(getResources(), imageView);
            } else {
                q(getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        int i16 = d.g.exo_player_view;
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, d.j.PlayerView, 0, 0);
            try {
                int i17 = d.j.PlayerView_shutter_background_color;
                boolean hasValue = obtainStyledAttributes.hasValue(i17);
                int color = obtainStyledAttributes.getColor(i17, 0);
                int resourceId = obtainStyledAttributes.getResourceId(d.j.PlayerView_player_layout_id, i16);
                boolean z18 = obtainStyledAttributes.getBoolean(d.j.PlayerView_use_artwork, true);
                int resourceId2 = obtainStyledAttributes.getResourceId(d.j.PlayerView_default_artwork, 0);
                boolean z19 = obtainStyledAttributes.getBoolean(d.j.PlayerView_use_controller, true);
                int i18 = obtainStyledAttributes.getInt(d.j.PlayerView_surface_type, 1);
                int i19 = obtainStyledAttributes.getInt(d.j.PlayerView_resize_mode, 0);
                int i20 = obtainStyledAttributes.getInt(d.j.PlayerView_show_timeout, 5000);
                boolean z20 = obtainStyledAttributes.getBoolean(d.j.PlayerView_hide_on_touch, true);
                boolean z21 = obtainStyledAttributes.getBoolean(d.j.PlayerView_auto_show, true);
                int i21 = resourceId;
                i14 = obtainStyledAttributes.getInteger(d.j.PlayerView_show_buffering, 0);
                boolean z22 = z20;
                this.f5515h0 = obtainStyledAttributes.getBoolean(d.j.PlayerView_keep_content_on_player_reset, this.f5515h0);
                boolean z23 = obtainStyledAttributes.getBoolean(d.j.PlayerView_hide_during_ads, true);
                obtainStyledAttributes.recycle();
                i15 = i19;
                i11 = i18;
                z11 = z19;
                i12 = resourceId2;
                z12 = z18;
                z13 = hasValue;
                i13 = color;
                z14 = z21;
                z15 = z22;
                int i22 = i20;
                z16 = z23;
                i16 = i21;
                z10 = i22;
            } catch (Throwable th2) {
                obtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            z15 = true;
            z14 = true;
            z12 = true;
            z11 = true;
            i11 = 1;
            z10 = true;
            i14 = 0;
            i13 = 0;
            z13 = false;
            i12 = 0;
            z16 = true;
            i15 = 0;
        }
        LayoutInflater.from(context).inflate(i16, this);
        b bVar = new b();
        this.W = bVar;
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(d.e.exo_content_frame);
        this.O = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            F(aspectRatioFrameLayout, i15);
        }
        View findViewById = findViewById(d.e.exo_shutter);
        this.P = findViewById;
        if (findViewById != null && z13) {
            findViewById.setBackgroundColor(i13);
        }
        if (aspectRatioFrameLayout == null || i11 == 0) {
            this.Q = null;
        } else {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i11 == 2) {
                view = new TextureView(context2);
            } else if (i11 != 3) {
                view = new SurfaceView(context2);
            } else {
                SphericalSurfaceView sphericalSurfaceView = new SphericalSurfaceView(context2);
                sphericalSurfaceView.setSingleTapListener(bVar);
                this.Q = sphericalSurfaceView;
                this.Q.setLayoutParams(layoutParams);
                aspectRatioFrameLayout.addView(this.Q, 0);
            }
            this.Q = view;
            this.Q.setLayoutParams(layoutParams);
            aspectRatioFrameLayout.addView(this.Q, 0);
        }
        this.f5508a0 = (FrameLayout) findViewById(d.e.exo_ad_overlay);
        this.f5509b0 = (FrameLayout) findViewById(d.e.exo_overlay);
        ImageView imageView2 = (ImageView) findViewById(d.e.exo_artwork);
        this.R = imageView2;
        this.f5512e0 = z12 && imageView2 != null;
        if (i12 != 0) {
            this.f5513f0 = i0.d.i(getContext(), i12);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(d.e.exo_subtitles);
        this.S = subtitleView;
        if (subtitleView != null) {
            subtitleView.g();
            subtitleView.h();
        }
        View findViewById2 = findViewById(d.e.exo_buffering);
        this.T = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
        this.f5514g0 = i14;
        TextView textView = (TextView) findViewById(d.e.exo_error_message);
        this.U = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        int i23 = d.e.exo_controller;
        PlayerControlView playerControlView = (PlayerControlView) findViewById(i23);
        View findViewById3 = findViewById(d.e.exo_controller_placeholder);
        if (playerControlView != null) {
            this.V = playerControlView;
            z17 = false;
        } else if (findViewById3 != null) {
            z17 = false;
            PlayerControlView playerControlView2 = new PlayerControlView(context2, (AttributeSet) null, 0, attributeSet2);
            this.V = playerControlView2;
            playerControlView2.setId(i23);
            playerControlView2.setLayoutParams(findViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) findViewById3.getParent();
            int indexOfChild = viewGroup.indexOfChild(findViewById3);
            viewGroup.removeView(findViewById3);
            viewGroup.addView(playerControlView2, indexOfChild);
        } else {
            z17 = false;
            this.V = null;
        }
        PlayerControlView playerControlView3 = this.V;
        this.f5518k0 = playerControlView3 != null ? z10 : z17 ? 1 : 0;
        this.f5521n0 = z15;
        this.f5519l0 = z14;
        this.f5520m0 = z16;
        this.f5511d0 = (!z11 || playerControlView3 == null) ? z17 : true;
        u();
    }

    public static void F(AspectRatioFrameLayout aspectRatioFrameLayout, int i10) {
        aspectRatioFrameLayout.setResizeMode(i10);
    }

    public static void J(n0 n0Var, @o0 PlayerView playerView, @o0 PlayerView playerView2) {
        if (playerView != playerView2) {
            if (playerView2 != null) {
                playerView2.setPlayer(n0Var);
            }
            if (playerView != null) {
                playerView.setPlayer((n0) null);
            }
        }
    }

    public static void o(TextureView textureView, int i10) {
        float width = (float) textureView.getWidth();
        float height = (float) textureView.getHeight();
        if (width == 0.0f || height == 0.0f || i10 == 0) {
            textureView.setTransform((Matrix) null);
            return;
        }
        Matrix matrix = new Matrix();
        float f10 = width / 2.0f;
        float f11 = height / 2.0f;
        matrix.postRotate((float) i10, f10, f11);
        RectF rectF = new RectF(0.0f, 0.0f, width, height);
        RectF rectF2 = new RectF();
        matrix.mapRect(rectF2, rectF);
        matrix.postScale(width / rectF2.width(), height / rectF2.height(), f10, f11);
        textureView.setTransform(matrix);
    }

    public static void q(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(d.C0091d.exo_edit_mode_logo));
        imageView.setBackgroundColor(resources.getColor(d.b.exo_edit_mode_background_color));
    }

    @TargetApi(23)
    public static void r(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(d.C0091d.exo_edit_mode_logo, (Resources.Theme) null));
        imageView.setBackgroundColor(resources.getColor(d.b.exo_edit_mode_background_color, (Resources.Theme) null));
    }

    public void A() {
        View view = this.Q;
        if (view instanceof SphericalSurfaceView) {
            ((SphericalSurfaceView) view).onPause();
        }
    }

    public void B() {
        View view = this.Q;
        if (view instanceof SphericalSurfaceView) {
            ((SphericalSurfaceView) view).onResume();
        }
    }

    public final boolean C(Metadata metadata) {
        byte[] bArr;
        int i10;
        int i11 = -1;
        int i12 = 0;
        boolean z10 = false;
        while (i12 < metadata.d()) {
            Metadata.Entry c10 = metadata.c(i12);
            if (c10 instanceof ApicFrame) {
                ApicFrame apicFrame = (ApicFrame) c10;
                bArr = apicFrame.S;
                i10 = apicFrame.R;
            } else if (c10 instanceof PictureFrame) {
                PictureFrame pictureFrame = (PictureFrame) c10;
                bArr = pictureFrame.V;
                i10 = pictureFrame.O;
            } else {
                continue;
                i12++;
            }
            if (i11 == -1 || i10 == 3) {
                z10 = D(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
                if (i10 == 3) {
                    break;
                }
                i11 = i10;
                i12++;
            } else {
                i12++;
            }
        }
        return z10;
    }

    public final boolean D(@o0 Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                z(((float) intrinsicWidth) / ((float) intrinsicHeight), this.O, this.R);
                this.R.setImageDrawable(drawable);
                this.R.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    public void E(@o0 long[] jArr, @o0 boolean[] zArr) {
        w7.a.i(this.V != null);
        this.V.T(jArr, zArr);
    }

    public final boolean G() {
        n0 n0Var = this.f5510c0;
        if (n0Var == null) {
            return true;
        }
        int e10 = n0Var.e();
        return this.f5519l0 && (e10 == 1 || e10 == 4 || !this.f5510c0.q());
    }

    public void H() {
        I(G());
    }

    public final void I(boolean z10) {
        if (this.f5511d0) {
            this.V.setShowTimeoutMs(z10 ? 0 : this.f5518k0);
            this.V.U();
        }
    }

    public final boolean K() {
        if (!this.f5511d0 || this.f5510c0 == null) {
            return false;
        }
        if (!this.V.K()) {
            y(true);
        } else if (this.f5521n0) {
            this.V.G();
        }
        return true;
    }

    public final void L() {
        int i10;
        if (this.T != null) {
            n0 n0Var = this.f5510c0;
            boolean z10 = true;
            int i11 = 0;
            if (n0Var == null || n0Var.e() != 2 || ((i10 = this.f5514g0) != 2 && (i10 != 1 || !this.f5510c0.q()))) {
                z10 = false;
            }
            View view = this.T;
            if (!z10) {
                i11 = 8;
            }
            view.setVisibility(i11);
        }
    }

    public final void M() {
        TextView textView = this.U;
        if (textView != null) {
            CharSequence charSequence = this.f5517j0;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.U.setVisibility(0);
                return;
            }
            i iVar = null;
            n0 n0Var = this.f5510c0;
            if (!(n0Var == null || n0Var.e() != 1 || this.f5516i0 == null)) {
                iVar = this.f5510c0.y();
            }
            if (iVar != null) {
                this.U.setText((CharSequence) this.f5516i0.a(iVar).second);
                this.U.setVisibility(0);
                return;
            }
            this.U.setVisibility(8);
        }
    }

    public final void N(boolean z10) {
        n0 n0Var = this.f5510c0;
        if (n0Var != null && !n0Var.s0().c()) {
            if (z10 && !this.f5515h0) {
                p();
            }
            m C0 = this.f5510c0.C0();
            int i10 = 0;
            while (i10 < C0.f12031a) {
                if (this.f5510c0.D0(i10) != 2 || C0.a(i10) == null) {
                    i10++;
                } else {
                    t();
                    return;
                }
            }
            p();
            if (this.f5512e0) {
                for (int i11 = 0; i11 < C0.f12031a; i11++) {
                    f a10 = C0.a(i11);
                    if (a10 != null) {
                        int i12 = 0;
                        while (i12 < a10.length()) {
                            Metadata metadata = a10.f(i12).U;
                            if (metadata == null || !C(metadata)) {
                                i12++;
                            } else {
                                return;
                            }
                        }
                        continue;
                    }
                }
                if (D(this.f5513f0)) {
                    return;
                }
            }
            t();
        } else if (!this.f5515h0) {
            t();
            p();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        n0 n0Var = this.f5510c0;
        if (n0Var != null && n0Var.m()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean z10 = w(keyEvent.getKeyCode()) && this.f5511d0;
        if ((z10 && !this.V.K()) || s(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            y(true);
            return true;
        } else if (!z10) {
            return false;
        } else {
            y(true);
            return false;
        }
    }

    public View[] getAdOverlayViews() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f5509b0;
        if (frameLayout != null) {
            arrayList.add(frameLayout);
        }
        PlayerControlView playerControlView = this.V;
        if (playerControlView != null) {
            arrayList.add(playerControlView);
        }
        return (View[]) arrayList.toArray(new View[0]);
    }

    public ViewGroup getAdViewGroup() {
        return (ViewGroup) w7.a.h(this.f5508a0, "exo_ad_overlay must be present for ad playback");
    }

    public boolean getControllerAutoShow() {
        return this.f5519l0;
    }

    public boolean getControllerHideOnTouch() {
        return this.f5521n0;
    }

    public int getControllerShowTimeoutMs() {
        return this.f5518k0;
    }

    @o0
    public Drawable getDefaultArtwork() {
        return this.f5513f0;
    }

    @o0
    public FrameLayout getOverlayFrameLayout() {
        return this.f5509b0;
    }

    public n0 getPlayer() {
        return this.f5510c0;
    }

    public int getResizeMode() {
        w7.a.i(this.O != null);
        return this.O.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.S;
    }

    public boolean getUseArtwork() {
        return this.f5512e0;
    }

    public boolean getUseController() {
        return this.f5511d0;
    }

    public View getVideoSurfaceView() {
        return this.Q;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f5511d0 || this.f5510c0 == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f5523p0 = true;
            return true;
        } else if (action != 1 || !this.f5523p0) {
            return false;
        } else {
            this.f5523p0 = false;
            performClick();
            return true;
        }
    }

    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!this.f5511d0 || this.f5510c0 == null) {
            return false;
        }
        y(true);
        return true;
    }

    public final void p() {
        View view = this.P;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public boolean performClick() {
        super.performClick();
        return K();
    }

    public boolean s(KeyEvent keyEvent) {
        return this.f5511d0 && this.V.D(keyEvent);
    }

    public void setAspectRatioListener(AspectRatioFrameLayout.b bVar) {
        w7.a.i(this.O != null);
        this.O.setAspectRatioListener(bVar);
    }

    public void setControlDispatcher(@o0 b6.d dVar) {
        w7.a.i(this.V != null);
        this.V.setControlDispatcher(dVar);
    }

    public void setControllerAutoShow(boolean z10) {
        this.f5519l0 = z10;
    }

    public void setControllerHideDuringAds(boolean z10) {
        this.f5520m0 = z10;
    }

    public void setControllerHideOnTouch(boolean z10) {
        w7.a.i(this.V != null);
        this.f5521n0 = z10;
    }

    public void setControllerShowTimeoutMs(int i10) {
        w7.a.i(this.V != null);
        this.f5518k0 = i10;
        if (this.V.K()) {
            H();
        }
    }

    public void setControllerVisibilityListener(PlayerControlView.d dVar) {
        w7.a.i(this.V != null);
        this.V.setVisibilityListener(dVar);
    }

    public void setCustomErrorMessage(@o0 CharSequence charSequence) {
        w7.a.i(this.U != null);
        this.f5517j0 = charSequence;
        M();
    }

    @Deprecated
    public void setDefaultArtwork(@o0 Bitmap bitmap) {
        setDefaultArtwork((Drawable) bitmap == null ? null : new BitmapDrawable(getResources(), bitmap));
    }

    public void setDefaultArtwork(@o0 Drawable drawable) {
        if (this.f5513f0 != drawable) {
            this.f5513f0 = drawable;
            N(false);
        }
    }

    public void setErrorMessageProvider(@o0 h<? super i> hVar) {
        if (this.f5516i0 != hVar) {
            this.f5516i0 = hVar;
            M();
        }
    }

    public void setFastForwardIncrementMs(int i10) {
        w7.a.i(this.V != null);
        this.V.setFastForwardIncrementMs(i10);
    }

    public void setKeepContentOnPlayerReset(boolean z10) {
        if (this.f5515h0 != z10) {
            this.f5515h0 = z10;
            N(false);
        }
    }

    public void setPlaybackPreparer(@o0 m0 m0Var) {
        w7.a.i(this.V != null);
        this.V.setPlaybackPreparer(m0Var);
    }

    public void setPlayer(@o0 n0 n0Var) {
        w7.a.i(Looper.myLooper() == Looper.getMainLooper());
        w7.a.a(n0Var == null || n0Var.u0() == Looper.getMainLooper());
        n0 n0Var2 = this.f5510c0;
        if (n0Var2 != n0Var) {
            if (n0Var2 != null) {
                n0Var2.J(this.W);
                n0.i W2 = this.f5510c0.W();
                if (W2 != null) {
                    W2.f0(this.W);
                    View view = this.Q;
                    if (view instanceof TextureView) {
                        W2.D((TextureView) view);
                    } else if (view instanceof SphericalSurfaceView) {
                        ((SphericalSurfaceView) view).setVideoComponent((n0.i) null);
                    } else if (view instanceof SurfaceView) {
                        W2.p0((SurfaceView) view);
                    }
                }
                n0.g G0 = this.f5510c0.G0();
                if (G0 != null) {
                    G0.v0(this.W);
                }
            }
            this.f5510c0 = n0Var;
            if (this.f5511d0) {
                this.V.setPlayer(n0Var);
            }
            SubtitleView subtitleView = this.S;
            if (subtitleView != null) {
                subtitleView.setCues((List<h7.b>) null);
            }
            L();
            M();
            N(true);
            if (n0Var != null) {
                n0.i W3 = n0Var.W();
                if (W3 != null) {
                    View view2 = this.Q;
                    if (view2 instanceof TextureView) {
                        W3.B0((TextureView) view2);
                    } else if (view2 instanceof SphericalSurfaceView) {
                        ((SphericalSurfaceView) view2).setVideoComponent(W3);
                    } else if (view2 instanceof SurfaceView) {
                        W3.H((SurfaceView) view2);
                    }
                    W3.Z(this.W);
                }
                n0.g G02 = n0Var.G0();
                if (G02 != null) {
                    G02.K(this.W);
                }
                n0Var.P(this.W);
                y(false);
                return;
            }
            u();
        }
    }

    public void setRepeatToggleModes(int i10) {
        w7.a.i(this.V != null);
        this.V.setRepeatToggleModes(i10);
    }

    public void setResizeMode(int i10) {
        w7.a.i(this.O != null);
        this.O.setResizeMode(i10);
    }

    public void setRewindIncrementMs(int i10) {
        w7.a.i(this.V != null);
        this.V.setRewindIncrementMs(i10);
    }

    public void setShowBuffering(int i10) {
        if (this.f5514g0 != i10) {
            this.f5514g0 = i10;
            L();
        }
    }

    @Deprecated
    public void setShowBuffering(boolean z10) {
        setShowBuffering(z10 ? 1 : 0);
    }

    public void setShowMultiWindowTimeBar(boolean z10) {
        w7.a.i(this.V != null);
        this.V.setShowMultiWindowTimeBar(z10);
    }

    public void setShowShuffleButton(boolean z10) {
        w7.a.i(this.V != null);
        this.V.setShowShuffleButton(z10);
    }

    public void setShutterBackgroundColor(int i10) {
        View view = this.P;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    public void setUseArtwork(boolean z10) {
        w7.a.i(!z10 || this.R != null);
        if (this.f5512e0 != z10) {
            this.f5512e0 = z10;
            N(false);
        }
    }

    public void setUseController(boolean z10) {
        PlayerControlView playerControlView;
        n0 n0Var;
        w7.a.i(!z10 || this.V != null);
        if (this.f5511d0 != z10) {
            this.f5511d0 = z10;
            if (z10) {
                playerControlView = this.V;
                n0Var = this.f5510c0;
            } else {
                PlayerControlView playerControlView2 = this.V;
                if (playerControlView2 != null) {
                    playerControlView2.G();
                    playerControlView = this.V;
                    n0Var = null;
                } else {
                    return;
                }
            }
            playerControlView.setPlayer(n0Var);
        }
    }

    public void setVisibility(int i10) {
        super.setVisibility(i10);
        View view = this.Q;
        if (view instanceof SurfaceView) {
            view.setVisibility(i10);
        }
    }

    public final void t() {
        ImageView imageView = this.R;
        if (imageView != null) {
            imageView.setImageResource(17170445);
            this.R.setVisibility(4);
        }
    }

    public void u() {
        PlayerControlView playerControlView = this.V;
        if (playerControlView != null) {
            playerControlView.G();
        }
    }

    public boolean v() {
        PlayerControlView playerControlView = this.V;
        return playerControlView != null && playerControlView.K();
    }

    @SuppressLint({"InlinedApi"})
    public final boolean w(int i10) {
        return i10 == 19 || i10 == 270 || i10 == 22 || i10 == 271 || i10 == 20 || i10 == 269 || i10 == 21 || i10 == 268 || i10 == 23;
    }

    public final boolean x() {
        n0 n0Var = this.f5510c0;
        return n0Var != null && n0Var.m() && this.f5510c0.q();
    }

    public final void y(boolean z10) {
        if ((!x() || !this.f5520m0) && this.f5511d0) {
            boolean z11 = this.V.K() && this.V.getShowTimeoutMs() <= 0;
            boolean G = G();
            if (z10 || z11 || G) {
                I(G);
            }
        }
    }

    public void z(float f10, @o0 AspectRatioFrameLayout aspectRatioFrameLayout, @o0 View view) {
        if (aspectRatioFrameLayout != null) {
            if (view instanceof SphericalSurfaceView) {
                f10 = 0.0f;
            }
            aspectRatioFrameLayout.setAspectRatio(f10);
        }
    }
}
