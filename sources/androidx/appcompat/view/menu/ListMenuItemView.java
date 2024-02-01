package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.w0;
import d.x0;
import f.a;
import f1.w1;

@x0({x0.a.Q})
public class ListMenuItemView extends LinearLayout implements k.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: i0  reason: collision with root package name */
    public static final String f918i0 = "ListMenuItemView";
    public h O;
    public ImageView P;
    public RadioButton Q;
    public TextView R;
    public CheckBox S;
    public TextView T;
    public ImageView U;
    public ImageView V;
    public LinearLayout W;

    /* renamed from: a0  reason: collision with root package name */
    public Drawable f919a0;

    /* renamed from: b0  reason: collision with root package name */
    public int f920b0;

    /* renamed from: c0  reason: collision with root package name */
    public Context f921c0;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f922d0;

    /* renamed from: e0  reason: collision with root package name */
    public Drawable f923e0;

    /* renamed from: f0  reason: collision with root package name */
    public boolean f924f0;

    /* renamed from: g0  reason: collision with root package name */
    public LayoutInflater f925g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f926h0;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.c.listMenuViewStyle);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        w0 G = w0.G(getContext(), attributeSet, a.n.MenuView, i10, 0);
        this.f919a0 = G.h(a.n.MenuView_android_itemBackground);
        this.f920b0 = G.u(a.n.MenuView_android_itemTextAppearance, -1);
        this.f922d0 = G.a(a.n.MenuView_preserveIconSpacing, false);
        this.f921c0 = context;
        this.f923e0 = G.h(a.n.MenuView_subMenuArrow);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet) null, new int[]{16843049}, a.c.dropDownListViewStyle, 0);
        this.f924f0 = obtainStyledAttributes.hasValue(0);
        G.I();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f925g0 == null) {
            this.f925g0 = LayoutInflater.from(getContext());
        }
        return this.f925g0;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.U;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    public final void a(View view) {
        c(view, -1);
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.V;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.V.getLayoutParams();
            rect.top += this.V.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    public void b(boolean z10, char c10) {
        int i10 = (!z10 || !this.O.D()) ? 8 : 0;
        if (i10 == 0) {
            this.T.setText(this.O.k());
        }
        if (this.T.getVisibility() != i10) {
            this.T.setVisibility(i10);
        }
    }

    public final void c(View view, int i10) {
        LinearLayout linearLayout = this.W;
        if (linearLayout != null) {
            linearLayout.addView(view, i10);
        } else {
            addView(view, i10);
        }
    }

    public boolean d() {
        return false;
    }

    public final void e() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(a.k.abc_list_menu_item_checkbox, this, false);
        this.S = checkBox;
        a(checkBox);
    }

    public boolean f() {
        return this.f926h0;
    }

    public void g(h hVar, int i10) {
        this.O = hVar;
        setVisibility(hVar.isVisible() ? 0 : 8);
        setTitle(hVar.l(this));
        setCheckable(hVar.isCheckable());
        b(hVar.D(), hVar.j());
        setIcon(hVar.getIcon());
        setEnabled(hVar.isEnabled());
        setSubMenuArrowVisible(hVar.hasSubMenu());
        setContentDescription(hVar.getContentDescription());
    }

    public h getItemData() {
        return this.O;
    }

    public final void h() {
        ImageView imageView = (ImageView) getInflater().inflate(a.k.abc_list_menu_item_icon, this, false);
        this.P = imageView;
        c(imageView, 0);
    }

    public final void i() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(a.k.abc_list_menu_item_radio, this, false);
        this.Q = radioButton;
        a(radioButton);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        w1.G1(this, this.f919a0);
        TextView textView = (TextView) findViewById(a.h.title);
        this.R = textView;
        int i10 = this.f920b0;
        if (i10 != -1) {
            textView.setTextAppearance(this.f921c0, i10);
        }
        this.T = (TextView) findViewById(a.h.shortcut);
        ImageView imageView = (ImageView) findViewById(a.h.submenuarrow);
        this.U = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f923e0);
        }
        this.V = (ImageView) findViewById(a.h.group_divider);
        this.W = (LinearLayout) findViewById(a.h.content);
    }

    public void onMeasure(int i10, int i11) {
        if (this.P != null && this.f922d0) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.P.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z10) {
        View view;
        CompoundButton compoundButton;
        if (z10 || this.Q != null || this.S != null) {
            if (this.O.p()) {
                if (this.Q == null) {
                    i();
                }
                compoundButton = this.Q;
                view = this.S;
            } else {
                if (this.S == null) {
                    e();
                }
                compoundButton = this.S;
                view = this.Q;
            }
            if (z10) {
                compoundButton.setChecked(this.O.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (view != null && view.getVisibility() != 8) {
                    view.setVisibility(8);
                    return;
                }
                return;
            }
            CheckBox checkBox = this.S;
            if (checkBox != null) {
                checkBox.setVisibility(8);
            }
            RadioButton radioButton = this.Q;
            if (radioButton != null) {
                radioButton.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if (this.O.p()) {
            if (this.Q == null) {
                i();
            }
            compoundButton = this.Q;
        } else {
            if (this.S == null) {
                e();
            }
            compoundButton = this.S;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.f926h0 = z10;
        this.f922d0 = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.V;
        if (imageView != null) {
            imageView.setVisibility((this.f924f0 || !z10) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z10 = this.O.C() || this.f926h0;
        if (z10 || this.f922d0) {
            ImageView imageView = this.P;
            if (imageView != null || drawable != null || this.f922d0) {
                if (imageView == null) {
                    h();
                }
                if (drawable != null || this.f922d0) {
                    ImageView imageView2 = this.P;
                    if (!z10) {
                        drawable = null;
                    }
                    imageView2.setImageDrawable(drawable);
                    if (this.P.getVisibility() != 0) {
                        this.P.setVisibility(0);
                        return;
                    }
                    return;
                }
                this.P.setVisibility(8);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView;
        int i10;
        if (charSequence != null) {
            this.R.setText(charSequence);
            if (this.R.getVisibility() != 0) {
                textView = this.R;
                i10 = 0;
            } else {
                return;
            }
        } else {
            i10 = 8;
            if (this.R.getVisibility() != 8) {
                textView = this.R;
            } else {
                return;
            }
        }
        textView.setVisibility(i10);
    }
}
