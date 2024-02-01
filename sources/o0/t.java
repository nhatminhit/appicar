package o0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import d.m0;
import d.o0;

public final class t extends Drawable.ConstantState {

    /* renamed from: a  reason: collision with root package name */
    public int f11028a;

    /* renamed from: b  reason: collision with root package name */
    public Drawable.ConstantState f11029b;

    /* renamed from: c  reason: collision with root package name */
    public ColorStateList f11030c = null;

    /* renamed from: d  reason: collision with root package name */
    public PorterDuff.Mode f11031d = r.U;

    public t(@o0 t tVar) {
        if (tVar != null) {
            this.f11028a = tVar.f11028a;
            this.f11029b = tVar.f11029b;
            this.f11030c = tVar.f11030c;
            this.f11031d = tVar.f11031d;
        }
    }

    public boolean a() {
        return this.f11029b != null;
    }

    public int getChangingConfigurations() {
        int i10 = this.f11028a;
        Drawable.ConstantState constantState = this.f11029b;
        return i10 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @m0
    public Drawable newDrawable() {
        return newDrawable((Resources) null);
    }

    @m0
    public Drawable newDrawable(@o0 Resources resources) {
        return new s(this, resources);
    }
}
