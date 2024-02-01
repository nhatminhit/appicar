package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.m0;
import d.l;
import d.p;
import d.u;
import d.x0;
import f.a;
import n0.f0;

@x0({x0.a.Q})
public final class f {

    /* renamed from: b  reason: collision with root package name */
    public static final String f1296b = "AppCompatDrawableManag";

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f1297c = false;

    /* renamed from: d  reason: collision with root package name */
    public static final PorterDuff.Mode f1298d = PorterDuff.Mode.SRC_IN;

    /* renamed from: e  reason: collision with root package name */
    public static f f1299e;

    /* renamed from: a  reason: collision with root package name */
    public m0 f1300a;

    public class a implements m0.f {

        /* renamed from: a  reason: collision with root package name */
        public final int[] f1301a = {a.g.abc_textfield_search_default_mtrl_alpha, a.g.abc_textfield_default_mtrl_alpha, a.g.abc_ab_share_pack_mtrl_alpha};

        /* renamed from: b  reason: collision with root package name */
        public final int[] f1302b = {a.g.abc_ic_commit_search_api_mtrl_alpha, a.g.abc_seekbar_tick_mark_material, a.g.abc_ic_menu_share_mtrl_alpha, a.g.abc_ic_menu_copy_mtrl_am_alpha, a.g.abc_ic_menu_cut_mtrl_alpha, a.g.abc_ic_menu_selectall_mtrl_alpha, a.g.abc_ic_menu_paste_mtrl_am_alpha};

        /* renamed from: c  reason: collision with root package name */
        public final int[] f1303c = {a.g.abc_textfield_activated_mtrl_alpha, a.g.abc_textfield_search_activated_mtrl_alpha, a.g.abc_cab_background_top_mtrl_alpha, a.g.abc_text_cursor_material, a.g.abc_text_select_handle_left_mtrl, a.g.abc_text_select_handle_middle_mtrl, a.g.abc_text_select_handle_right_mtrl};

        /* renamed from: d  reason: collision with root package name */
        public final int[] f1304d = {a.g.abc_popup_background_mtrl_mult, a.g.abc_cab_background_internal_bg, a.g.abc_menu_hardkey_panel_mtrl_mult};

        /* renamed from: e  reason: collision with root package name */
        public final int[] f1305e = {a.g.abc_tab_indicator_material, a.g.abc_textfield_search_material};

        /* renamed from: f  reason: collision with root package name */
        public final int[] f1306f = {a.g.abc_btn_check_material, a.g.abc_btn_radio_material, a.g.abc_btn_check_material_anim, a.g.abc_btn_radio_material_anim};

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0061 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean a(@d.m0 android.content.Context r7, int r8, @d.m0 android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.f.f1298d
                int[] r1 = r6.f1301a
                boolean r1 = r6.f(r1, r8)
                r2 = 16842801(0x1010031, float:2.3693695E-38)
                r3 = -1
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L_0x0017
                int r2 = f.a.c.colorControlNormal
            L_0x0014:
                r8 = r3
            L_0x0015:
                r1 = r5
                goto L_0x0044
            L_0x0017:
                int[] r1 = r6.f1303c
                boolean r1 = r6.f(r1, r8)
                if (r1 == 0) goto L_0x0022
                int r2 = f.a.c.colorControlActivated
                goto L_0x0014
            L_0x0022:
                int[] r1 = r6.f1304d
                boolean r1 = r6.f(r1, r8)
                if (r1 == 0) goto L_0x002d
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                goto L_0x0014
            L_0x002d:
                int r1 = f.a.g.abc_list_divider_mtrl_alpha
                if (r8 != r1) goto L_0x003c
                r2 = 16842800(0x1010030, float:2.3693693E-38)
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                goto L_0x0015
            L_0x003c:
                int r1 = f.a.g.abc_dialog_material_background
                if (r8 != r1) goto L_0x0041
                goto L_0x0014
            L_0x0041:
                r8 = r3
                r1 = r4
                r2 = r1
            L_0x0044:
                if (r1 == 0) goto L_0x0061
                boolean r1 = androidx.appcompat.widget.b0.a(r9)
                if (r1 == 0) goto L_0x0050
                android.graphics.drawable.Drawable r9 = r9.mutate()
            L_0x0050:
                int r7 = androidx.appcompat.widget.r0.d(r7, r2)
                android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.f.e(r7, r0)
                r9.setColorFilter(r7)
                if (r8 == r3) goto L_0x0060
                r9.setAlpha(r8)
            L_0x0060:
                return r5
            L_0x0061:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.f.a.a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        public PorterDuff.Mode b(int i10) {
            if (i10 == a.g.abc_switch_thumb_material) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        public Drawable c(@d.m0 m0 m0Var, @d.m0 Context context, int i10) {
            int i11;
            if (i10 == a.g.abc_cab_background_top_material) {
                return new LayerDrawable(new Drawable[]{m0Var.j(context, a.g.abc_cab_background_internal_bg), m0Var.j(context, a.g.abc_cab_background_top_mtrl_alpha)});
            }
            if (i10 == a.g.abc_ratingbar_material) {
                i11 = a.f.abc_star_big;
            } else if (i10 == a.g.abc_ratingbar_indicator_material) {
                i11 = a.f.abc_star_medium;
            } else if (i10 != a.g.abc_ratingbar_small_material) {
                return null;
            } else {
                i11 = a.f.abc_star_small;
            }
            return l(m0Var, context, i11);
        }

        public ColorStateList d(@d.m0 Context context, int i10) {
            if (i10 == a.g.abc_edit_text_material) {
                return g.a.c(context, a.e.abc_tint_edittext);
            }
            if (i10 == a.g.abc_switch_track_mtrl_alpha) {
                return g.a.c(context, a.e.abc_tint_switch_track);
            }
            if (i10 == a.g.abc_switch_thumb_material) {
                return k(context);
            }
            if (i10 == a.g.abc_btn_default_mtrl_shape) {
                return j(context);
            }
            if (i10 == a.g.abc_btn_borderless_material) {
                return g(context);
            }
            if (i10 == a.g.abc_btn_colored_material) {
                return i(context);
            }
            if (i10 == a.g.abc_spinner_mtrl_am_alpha || i10 == a.g.abc_spinner_textfield_background_material) {
                return g.a.c(context, a.e.abc_tint_spinner);
            }
            if (f(this.f1302b, i10)) {
                return r0.f(context, a.c.colorControlNormal);
            }
            if (f(this.f1305e, i10)) {
                return g.a.c(context, a.e.abc_tint_default);
            }
            if (f(this.f1306f, i10)) {
                return g.a.c(context, a.e.abc_tint_btn_checkable);
            }
            if (i10 == a.g.abc_seekbar_thumb_material) {
                return g.a.c(context, a.e.abc_tint_seek_thumb);
            }
            return null;
        }

        public boolean e(@d.m0 Context context, int i10, @d.m0 Drawable drawable) {
            Drawable findDrawableByLayerId;
            int d10;
            if (i10 == a.g.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(16908288);
                int i11 = a.c.colorControlNormal;
                m(findDrawableByLayerId2, r0.d(context, i11), f.f1298d);
                m(layerDrawable.findDrawableByLayerId(16908303), r0.d(context, i11), f.f1298d);
                findDrawableByLayerId = layerDrawable.findDrawableByLayerId(16908301);
                d10 = r0.d(context, a.c.colorControlActivated);
            } else if (i10 != a.g.abc_ratingbar_material && i10 != a.g.abc_ratingbar_indicator_material && i10 != a.g.abc_ratingbar_small_material) {
                return false;
            } else {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                m(layerDrawable2.findDrawableByLayerId(16908288), r0.c(context, a.c.colorControlNormal), f.f1298d);
                Drawable findDrawableByLayerId3 = layerDrawable2.findDrawableByLayerId(16908303);
                int i12 = a.c.colorControlActivated;
                m(findDrawableByLayerId3, r0.d(context, i12), f.f1298d);
                findDrawableByLayerId = layerDrawable2.findDrawableByLayerId(16908301);
                d10 = r0.d(context, i12);
            }
            m(findDrawableByLayerId, d10, f.f1298d);
            return true;
        }

        public final boolean f(int[] iArr, int i10) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        public final ColorStateList g(@d.m0 Context context) {
            return h(context, 0);
        }

        public final ColorStateList h(@d.m0 Context context, @l int i10) {
            int d10 = r0.d(context, a.c.colorControlHighlight);
            int c10 = r0.c(context, a.c.colorButtonNormal);
            return new ColorStateList(new int[][]{r0.f1424c, r0.f1427f, r0.f1425d, r0.f1431j}, new int[]{c10, f0.t(d10, i10), f0.t(d10, i10), i10});
        }

        public final ColorStateList i(@d.m0 Context context) {
            return h(context, r0.d(context, a.c.colorAccent));
        }

        public final ColorStateList j(@d.m0 Context context) {
            return h(context, r0.d(context, a.c.colorButtonNormal));
        }

        public final ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            int i10 = a.c.colorSwitchThumbNormal;
            ColorStateList f10 = r0.f(context, i10);
            if (f10 == null || !f10.isStateful()) {
                iArr[0] = r0.f1424c;
                iArr2[0] = r0.c(context, i10);
                iArr[1] = r0.f1428g;
                iArr2[1] = r0.d(context, a.c.colorControlActivated);
                iArr[2] = r0.f1431j;
                iArr2[2] = r0.d(context, i10);
            } else {
                int[] iArr3 = r0.f1424c;
                iArr[0] = iArr3;
                iArr2[0] = f10.getColorForState(iArr3, 0);
                iArr[1] = r0.f1428g;
                iArr2[1] = r0.d(context, a.c.colorControlActivated);
                iArr[2] = r0.f1431j;
                iArr2[2] = f10.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        public final LayerDrawable l(@d.m0 m0 m0Var, @d.m0 Context context, @p int i10) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
            Drawable j10 = m0Var.j(context, a.g.abc_star_black_48dp);
            Drawable j11 = m0Var.j(context, a.g.abc_star_half_black_48dp);
            if ((j10 instanceof BitmapDrawable) && j10.getIntrinsicWidth() == dimensionPixelSize && j10.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable2 = (BitmapDrawable) j10;
                bitmapDrawable = new BitmapDrawable(bitmapDrawable2.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                j10.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j10.draw(canvas);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
                bitmapDrawable = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable.setTileModeX(Shader.TileMode.REPEAT);
            if ((j11 instanceof BitmapDrawable) && j11.getIntrinsicWidth() == dimensionPixelSize && j11.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) j11;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                j11.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j11.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable2, bitmapDrawable3, bitmapDrawable});
            layerDrawable.setId(0, 16908288);
            layerDrawable.setId(1, 16908303);
            layerDrawable.setId(2, 16908301);
            return layerDrawable;
        }

        public final void m(Drawable drawable, int i10, PorterDuff.Mode mode) {
            if (b0.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = f.f1298d;
            }
            drawable.setColorFilter(f.e(i10, mode));
        }
    }

    public static synchronized f b() {
        f fVar;
        synchronized (f.class) {
            if (f1299e == null) {
                i();
            }
            fVar = f1299e;
        }
        return fVar;
    }

    public static synchronized PorterDuffColorFilter e(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter l10;
        synchronized (f.class) {
            l10 = m0.l(i10, mode);
        }
        return l10;
    }

    public static synchronized void i() {
        synchronized (f.class) {
            if (f1299e == null) {
                f fVar = new f();
                f1299e = fVar;
                fVar.f1300a = m0.h();
                f1299e.f1300a.u(new a());
            }
        }
    }

    public static void j(Drawable drawable, u0 u0Var, int[] iArr) {
        m0.w(drawable, u0Var, iArr);
    }

    public synchronized Drawable c(@d.m0 Context context, @u int i10) {
        return this.f1300a.j(context, i10);
    }

    public synchronized Drawable d(@d.m0 Context context, @u int i10, boolean z10) {
        return this.f1300a.k(context, i10, z10);
    }

    public synchronized ColorStateList f(@d.m0 Context context, @u int i10) {
        return this.f1300a.m(context, i10);
    }

    public synchronized void g(@d.m0 Context context) {
        this.f1300a.s(context);
    }

    public synchronized Drawable h(@d.m0 Context context, @d.m0 c1 c1Var, @u int i10) {
        return this.f1300a.t(context, c1Var, i10);
    }

    public boolean k(@d.m0 Context context, @u int i10, @d.m0 Drawable drawable) {
        return this.f1300a.x(context, i10, drawable);
    }
}
