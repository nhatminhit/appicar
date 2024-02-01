package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.e0;
import androidx.appcompat.widget.z0;
import d.x0;
import f.a;
import l.f;

@x0({x0.a.Q})
public class ActionMenuItemView extends AppCompatTextView implements k.a, View.OnClickListener, ActionMenuView.a {

    /* renamed from: h0  reason: collision with root package name */
    public static final String f909h0 = "ActionMenuItemView";

    /* renamed from: i0  reason: collision with root package name */
    public static final int f910i0 = 32;
    public h T;
    public CharSequence U;
    public Drawable V;
    public e.b W;

    /* renamed from: a0  reason: collision with root package name */
    public e0 f911a0;

    /* renamed from: b0  reason: collision with root package name */
    public b f912b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f913c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f914d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f915e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f916f0;

    /* renamed from: g0  reason: collision with root package name */
    public int f917g0;

    public class a extends e0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        public f b() {
            b bVar = ActionMenuItemView.this.f912b0;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
            r0 = b();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean c() {
            /*
                r3 = this;
                androidx.appcompat.view.menu.ActionMenuItemView r0 = androidx.appcompat.view.menu.ActionMenuItemView.this
                androidx.appcompat.view.menu.e$b r1 = r0.W
                r2 = 0
                if (r1 == 0) goto L_0x001c
                androidx.appcompat.view.menu.h r0 = r0.T
                boolean r0 = r1.a(r0)
                if (r0 == 0) goto L_0x001c
                l.f r0 = r3.b()
                if (r0 == 0) goto L_0x001c
                boolean r0 = r0.c()
                if (r0 == 0) goto L_0x001c
                r2 = 1
            L_0x001c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ActionMenuItemView.a.c():boolean");
        }
    }

    public static abstract class b {
        public abstract f a();
    }

    public ActionMenuItemView(Context context) {
        this(context, (AttributeSet) null);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Resources resources = context.getResources();
        this.f913c0 = i();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.n.ActionMenuItemView, i10, 0);
        this.f915e0 = obtainStyledAttributes.getDimensionPixelSize(a.n.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.f917g0 = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f916f0 = -1;
        setSaveEnabled(false);
    }

    public boolean a() {
        return h();
    }

    public void b(boolean z10, char c10) {
    }

    public boolean c() {
        return h() && this.T.getIcon() == null;
    }

    public boolean d() {
        return true;
    }

    public boolean f() {
        return true;
    }

    public void g(h hVar, int i10) {
        this.T = hVar;
        setIcon(hVar.getIcon());
        setTitle(hVar.l(this));
        setId(hVar.getItemId());
        setVisibility(hVar.isVisible() ? 0 : 8);
        setEnabled(hVar.isEnabled());
        if (hVar.hasSubMenu() && this.f911a0 == null) {
            this.f911a0 = new a();
        }
    }

    public h getItemData() {
        return this.T;
    }

    public boolean h() {
        return !TextUtils.isEmpty(getText());
    }

    public final boolean i() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        return i10 >= 480 || (i10 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void j() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.U);
        if (this.V != null && (!this.T.E() || (!this.f913c0 && !this.f914d0))) {
            z10 = false;
        }
        boolean z12 = z11 & z10;
        CharSequence charSequence = null;
        setText(z12 ? this.U : null);
        CharSequence contentDescription = this.T.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            contentDescription = z12 ? null : this.T.getTitle();
        }
        setContentDescription(contentDescription);
        CharSequence tooltipText = this.T.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            if (!z12) {
                charSequence = this.T.getTitle();
            }
            z0.a(this, charSequence);
            return;
        }
        z0.a(this, tooltipText);
    }

    public void onClick(View view) {
        e.b bVar = this.W;
        if (bVar != null) {
            bVar.a(this.T);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f913c0 = i();
        j();
    }

    public void onMeasure(int i10, int i11) {
        int i12;
        boolean h10 = h();
        if (h10 && (i12 = this.f916f0) >= 0) {
            super.setPadding(i12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f915e0) : this.f915e0;
        if (mode != 1073741824 && this.f915e0 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i11);
        }
        if (!h10 && this.V != null) {
            super.setPadding((getMeasuredWidth() - this.V.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        e0 e0Var;
        if (!this.T.hasSubMenu() || (e0Var = this.f911a0) == null || !e0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }

    public void setExpandedFormat(boolean z10) {
        if (this.f914d0 != z10) {
            this.f914d0 = z10;
            h hVar = this.T;
            if (hVar != null) {
                hVar.e();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.V = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.f917g0;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i10) / ((float) intrinsicWidth)));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i10) / ((float) intrinsicHeight)));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        j();
    }

    public void setItemInvoker(e.b bVar) {
        this.W = bVar;
    }

    public void setPadding(int i10, int i11, int i12, int i13) {
        this.f916f0 = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(b bVar) {
        this.f912b0 = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.U = charSequence;
        j();
    }
}
