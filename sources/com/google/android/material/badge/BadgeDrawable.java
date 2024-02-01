package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.internal.k;
import com.google.android.material.internal.n;
import d.a1;
import d.b1;
import d.c1;
import d.f;
import d.i1;
import d.l;
import d.m0;
import d.o0;
import d.q;
import d.q0;
import d.x0;
import f1.w1;
import i9.a;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import w9.c;
import w9.d;
import z9.j;

public class BadgeDrawable extends Drawable implements k.b {

    /* renamed from: e0  reason: collision with root package name */
    public static final int f16646e0 = 8388661;

    /* renamed from: f0  reason: collision with root package name */
    public static final int f16647f0 = 8388659;

    /* renamed from: g0  reason: collision with root package name */
    public static final int f16648g0 = 8388693;

    /* renamed from: h0  reason: collision with root package name */
    public static final int f16649h0 = 8388691;

    /* renamed from: i0  reason: collision with root package name */
    public static final int f16650i0 = 4;

    /* renamed from: j0  reason: collision with root package name */
    public static final int f16651j0 = -1;

    /* renamed from: k0  reason: collision with root package name */
    public static final int f16652k0 = 9;
    @b1

    /* renamed from: l0  reason: collision with root package name */
    public static final int f16653l0 = a.n.Widget_MaterialComponents_Badge;
    @f

    /* renamed from: m0  reason: collision with root package name */
    public static final int f16654m0 = a.c.badgeStyle;

    /* renamed from: n0  reason: collision with root package name */
    public static final String f16655n0 = "+";
    @m0
    public final WeakReference<Context> O;
    @m0
    public final j P = new j();
    @m0
    public final k Q;
    @m0
    public final Rect R = new Rect();
    public final float S;
    public final float T;
    public final float U;
    @m0
    public final SavedState V;
    public float W;
    public float X;
    public int Y;
    public float Z;

    /* renamed from: a0  reason: collision with root package name */
    public float f16656a0;

    /* renamed from: b0  reason: collision with root package name */
    public float f16657b0;
    @o0

    /* renamed from: c0  reason: collision with root package name */
    public WeakReference<View> f16658c0;
    @o0

    /* renamed from: d0  reason: collision with root package name */
    public WeakReference<FrameLayout> f16659d0;

    @x0({x0.a.LIBRARY_GROUP})
    public static final class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        @l
        public int O;
        @l
        public int P;
        public int Q = 255;
        public int R = -1;
        public int S;
        @o0
        public CharSequence T;
        @q0
        public int U;
        @a1
        public int V;
        public int W;
        public boolean X;
        @q(unit = 1)
        public int Y;
        @q(unit = 1)
        public int Z;

        public static class a implements Parcelable.Creator<SavedState> {
            @m0
            /* renamed from: a */
            public SavedState createFromParcel(@m0 Parcel parcel) {
                return new SavedState(parcel);
            }

            @m0
            /* renamed from: b */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(@m0 Context context) {
            this.P = new d(context, a.n.TextAppearance_MaterialComponents_Badge).f23975a.getDefaultColor();
            this.T = context.getString(a.m.mtrl_badge_numberless_content_description);
            this.U = a.l.mtrl_badge_content_description;
            this.V = a.m.mtrl_exceed_max_badge_number_content_description;
            this.X = true;
        }

        public SavedState(@m0 Parcel parcel) {
            this.O = parcel.readInt();
            this.P = parcel.readInt();
            this.Q = parcel.readInt();
            this.R = parcel.readInt();
            this.S = parcel.readInt();
            this.T = parcel.readString();
            this.U = parcel.readInt();
            this.W = parcel.readInt();
            this.Y = parcel.readInt();
            this.Z = parcel.readInt();
            this.X = parcel.readInt() != 0;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@m0 Parcel parcel, int i10) {
            parcel.writeInt(this.O);
            parcel.writeInt(this.P);
            parcel.writeInt(this.Q);
            parcel.writeInt(this.R);
            parcel.writeInt(this.S);
            parcel.writeString(this.T.toString());
            parcel.writeInt(this.U);
            parcel.writeInt(this.W);
            parcel.writeInt(this.Y);
            parcel.writeInt(this.Z);
            parcel.writeInt(this.X ? 1 : 0);
        }
    }

    public class a implements Runnable {
        public final /* synthetic */ View O;
        public final /* synthetic */ FrameLayout P;

        public a(View view, FrameLayout frameLayout) {
            this.O = view;
            this.P = frameLayout;
        }

        public void run() {
            BadgeDrawable.this.O(this.O, this.P);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public BadgeDrawable(@m0 Context context) {
        this.O = new WeakReference<>(context);
        n.c(context);
        Resources resources = context.getResources();
        this.S = (float) resources.getDimensionPixelSize(a.f.mtrl_badge_radius);
        this.U = (float) resources.getDimensionPixelSize(a.f.mtrl_badge_long_text_horizontal_padding);
        this.T = (float) resources.getDimensionPixelSize(a.f.mtrl_badge_with_text_radius);
        k kVar = new k(this);
        this.Q = kVar;
        kVar.e().setTextAlign(Paint.Align.CENTER);
        this.V = new SavedState(context);
        H(a.n.TextAppearance_MaterialComponents_Badge);
    }

    public static void L(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
    }

    @m0
    public static BadgeDrawable d(@m0 Context context) {
        return e(context, (AttributeSet) null, f16654m0, f16653l0);
    }

    @m0
    public static BadgeDrawable e(@m0 Context context, AttributeSet attributeSet, @f int i10, @b1 int i11) {
        BadgeDrawable badgeDrawable = new BadgeDrawable(context);
        badgeDrawable.u(context, attributeSet, i10, i11);
        return badgeDrawable;
    }

    @m0
    public static BadgeDrawable f(@m0 Context context, @i1 int i10) {
        AttributeSet a10 = q9.a.a(context, i10, "badge");
        int styleAttribute = a10.getStyleAttribute();
        if (styleAttribute == 0) {
            styleAttribute = f16653l0;
        }
        return e(context, a10, f16654m0, styleAttribute);
    }

    @m0
    public static BadgeDrawable g(@m0 Context context, @m0 SavedState savedState) {
        BadgeDrawable badgeDrawable = new BadgeDrawable(context);
        badgeDrawable.w(savedState);
        return badgeDrawable;
    }

    public static int v(Context context, @m0 TypedArray typedArray, @c1 int i10) {
        return c.a(context, typedArray, i10).getDefaultColor();
    }

    public void A(@a1 int i10) {
        int unused = this.V.V = i10;
    }

    public void B(CharSequence charSequence) {
        CharSequence unused = this.V.T = charSequence;
    }

    public void C(@q0 int i10) {
        int unused = this.V.U = i10;
    }

    public void D(int i10) {
        int unused = this.V.Y = i10;
        P();
    }

    public void E(int i10) {
        if (this.V.S != i10) {
            int unused = this.V.S = i10;
            Q();
            this.Q.j(true);
            P();
            invalidateSelf();
        }
    }

    public void F(int i10) {
        int max = Math.max(0, i10);
        if (this.V.R != max) {
            int unused = this.V.R = max;
            this.Q.j(true);
            P();
            invalidateSelf();
        }
    }

    public final void G(@o0 d dVar) {
        Context context;
        if (this.Q.d() != dVar && (context = this.O.get()) != null) {
            this.Q.i(dVar, context);
            P();
        }
    }

    public final void H(@b1 int i10) {
        Context context = this.O.get();
        if (context != null) {
            G(new d(context, i10));
        }
    }

    public void I(int i10) {
        int unused = this.V.Z = i10;
        P();
    }

    public void J(boolean z10) {
        setVisible(z10, false);
        boolean unused = this.V.X = z10;
        if (a.f16660a && n() != null && !z10) {
            ((ViewGroup) n().getParent()).invalidate();
        }
    }

    public final void K(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup == null || viewGroup.getId() != a.h.mtrl_anchor_parent) {
            WeakReference<FrameLayout> weakReference = this.f16659d0;
            if (weakReference == null || weakReference.get() != viewGroup) {
                L(view);
                FrameLayout frameLayout = new FrameLayout(view.getContext());
                frameLayout.setId(a.h.mtrl_anchor_parent);
                frameLayout.setClipChildren(false);
                frameLayout.setClipToPadding(false);
                frameLayout.setLayoutParams(view.getLayoutParams());
                frameLayout.setMinimumWidth(view.getWidth());
                frameLayout.setMinimumHeight(view.getHeight());
                int indexOfChild = viewGroup.indexOfChild(view);
                viewGroup.removeViewAt(indexOfChild);
                view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.addView(view);
                viewGroup.addView(frameLayout, indexOfChild);
                this.f16659d0 = new WeakReference<>(frameLayout);
                frameLayout.post(new a(view, frameLayout));
            }
        }
    }

    public void M(@m0 View view) {
        O(view, (FrameLayout) null);
    }

    @Deprecated
    public void N(@m0 View view, @o0 ViewGroup viewGroup) {
        if (viewGroup instanceof FrameLayout) {
            O(view, (FrameLayout) viewGroup);
            return;
        }
        throw new IllegalArgumentException("customBadgeParent must be a FrameLayout");
    }

    public void O(@m0 View view, @o0 FrameLayout frameLayout) {
        this.f16658c0 = new WeakReference<>(view);
        boolean z10 = a.f16660a;
        if (!z10 || frameLayout != null) {
            this.f16659d0 = new WeakReference<>(frameLayout);
        } else {
            K(view);
        }
        if (!z10) {
            L(view);
        }
        P();
        invalidateSelf();
    }

    public final void P() {
        Context context = this.O.get();
        WeakReference<View> weakReference = this.f16658c0;
        ViewGroup viewGroup = null;
        View view = weakReference != null ? weakReference.get() : null;
        if (context != null && view != null) {
            Rect rect = new Rect();
            rect.set(this.R);
            Rect rect2 = new Rect();
            view.getDrawingRect(rect2);
            WeakReference<FrameLayout> weakReference2 = this.f16659d0;
            if (weakReference2 != null) {
                viewGroup = weakReference2.get();
            }
            if (viewGroup != null || a.f16660a) {
                if (viewGroup == null) {
                    viewGroup = (ViewGroup) view.getParent();
                }
                viewGroup.offsetDescendantRectToMyCoords(view, rect2);
            }
            b(context, rect2, view);
            a.j(this.R, this.W, this.X, this.f16656a0, this.f16657b0);
            this.P.j0(this.Z);
            if (!rect.equals(this.R)) {
                this.P.setBounds(this.R);
            }
        }
    }

    public final void Q() {
        this.Y = ((int) Math.pow(10.0d, ((double) p()) - 1.0d)) - 1;
    }

    @x0({x0.a.LIBRARY_GROUP})
    public void a() {
        invalidateSelf();
    }

    public final void b(@m0 Context context, @m0 Rect rect, @m0 View view) {
        float f10;
        int r10 = this.V.W;
        this.X = (float) ((r10 == 8388691 || r10 == 8388693) ? rect.bottom - this.V.Z : rect.top + this.V.Z);
        if (q() <= 9) {
            f10 = !t() ? this.S : this.T;
            this.Z = f10;
            this.f16657b0 = f10;
        } else {
            float f11 = this.T;
            this.Z = f11;
            this.f16657b0 = f11;
            f10 = (this.Q.f(k()) / 2.0f) + this.U;
        }
        this.f16656a0 = f10;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(t() ? a.f.mtrl_badge_text_horizontal_edge_offset : a.f.mtrl_badge_horizontal_edge_offset);
        int r11 = this.V.W;
        this.W = (r11 == 8388659 || r11 == 8388691 ? w1.X(view) != 0 : w1.X(view) == 0) ? ((((float) rect.right) + this.f16656a0) - ((float) dimensionPixelSize)) - ((float) this.V.Y) : (((float) rect.left) - this.f16656a0) + ((float) dimensionPixelSize) + ((float) this.V.Y);
    }

    public void c() {
        int unused = this.V.R = -1;
        invalidateSelf();
    }

    public void draw(@m0 Canvas canvas) {
        if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
            this.P.draw(canvas);
            if (t()) {
                h(canvas);
            }
        }
    }

    public int getAlpha() {
        return this.V.Q;
    }

    public int getIntrinsicHeight() {
        return this.R.height();
    }

    public int getIntrinsicWidth() {
        return this.R.width();
    }

    public int getOpacity() {
        return -3;
    }

    public final void h(Canvas canvas) {
        Rect rect = new Rect();
        String k10 = k();
        this.Q.e().getTextBounds(k10, 0, k10.length(), rect);
        canvas.drawText(k10, this.W, this.X + ((float) (rect.height() / 2)), this.Q.e());
    }

    @l
    public int i() {
        return this.P.y().getDefaultColor();
    }

    public boolean isStateful() {
        return false;
    }

    public int j() {
        return this.V.W;
    }

    @m0
    public final String k() {
        if (q() <= this.Y) {
            return NumberFormat.getInstance().format((long) q());
        }
        Context context = this.O.get();
        if (context == null) {
            return "";
        }
        return context.getString(a.m.mtrl_exceed_max_badge_number_suffix, new Object[]{Integer.valueOf(this.Y), f16655n0});
    }

    @l
    public int l() {
        return this.Q.e().getColor();
    }

    @o0
    public CharSequence m() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        if (!t()) {
            return this.V.T;
        }
        if (this.V.U <= 0 || (context = this.O.get()) == null) {
            return null;
        }
        if (q() <= this.Y) {
            return context.getResources().getQuantityString(this.V.U, q(), new Object[]{Integer.valueOf(q())});
        }
        return context.getString(this.V.V, new Object[]{Integer.valueOf(this.Y)});
    }

    @o0
    public FrameLayout n() {
        WeakReference<FrameLayout> weakReference = this.f16659d0;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int o() {
        return this.V.Y;
    }

    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public int p() {
        return this.V.S;
    }

    public int q() {
        if (!t()) {
            return 0;
        }
        return this.V.R;
    }

    @m0
    public SavedState r() {
        return this.V;
    }

    public int s() {
        return this.V.Z;
    }

    public void setAlpha(int i10) {
        int unused = this.V.Q = i10;
        this.Q.e().setAlpha(i10);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public boolean t() {
        return this.V.R != -1;
    }

    public final void u(Context context, AttributeSet attributeSet, @f int i10, @b1 int i11) {
        TypedArray j10 = n.j(context, attributeSet, a.o.Badge, i10, i11, new int[0]);
        E(j10.getInt(a.o.Badge_maxCharacterCount, 4));
        int i12 = a.o.Badge_number;
        if (j10.hasValue(i12)) {
            F(j10.getInt(i12, 0));
        }
        x(v(context, j10, a.o.Badge_backgroundColor));
        int i13 = a.o.Badge_badgeTextColor;
        if (j10.hasValue(i13)) {
            z(v(context, j10, i13));
        }
        y(j10.getInt(a.o.Badge_badgeGravity, f16646e0));
        D(j10.getDimensionPixelOffset(a.o.Badge_horizontalOffset, 0));
        I(j10.getDimensionPixelOffset(a.o.Badge_verticalOffset, 0));
        j10.recycle();
    }

    public final void w(@m0 SavedState savedState) {
        E(savedState.S);
        if (savedState.R != -1) {
            F(savedState.R);
        }
        x(savedState.O);
        z(savedState.P);
        y(savedState.W);
        D(savedState.Y);
        I(savedState.Z);
        J(savedState.X);
    }

    public void x(@l int i10) {
        int unused = this.V.O = i10;
        ColorStateList valueOf = ColorStateList.valueOf(i10);
        if (this.P.y() != valueOf) {
            this.P.n0(valueOf);
            invalidateSelf();
        }
    }

    public void y(int i10) {
        if (this.V.W != i10) {
            int unused = this.V.W = i10;
            WeakReference<View> weakReference = this.f16658c0;
            if (weakReference != null && weakReference.get() != null) {
                View view = this.f16658c0.get();
                WeakReference<FrameLayout> weakReference2 = this.f16659d0;
                O(view, weakReference2 != null ? weakReference2.get() : null);
            }
        }
    }

    public void z(@l int i10) {
        int unused = this.V.P = i10;
        if (this.Q.e().getColor() != i10) {
            this.Q.e().setColor(i10);
            invalidateSelf();
        }
    }
}
