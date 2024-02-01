package j9;

import android.util.Property;
import android.view.ViewGroup;
import d.m0;
import i9.a;

public class d extends Property<ViewGroup, Float> {

    /* renamed from: a  reason: collision with root package name */
    public static final Property<ViewGroup, Float> f19834a = new d("childrenAlpha");

    public d(String str) {
        super(Float.class, str);
    }

    @m0
    /* renamed from: a */
    public Float get(@m0 ViewGroup viewGroup) {
        Float f10 = (Float) viewGroup.getTag(a.h.mtrl_internal_children_alpha_tag);
        return f10 != null ? f10 : Float.valueOf(1.0f);
    }

    /* renamed from: b */
    public void set(@m0 ViewGroup viewGroup, @m0 Float f10) {
        float floatValue = f10.floatValue();
        viewGroup.setTag(a.h.mtrl_internal_children_alpha_tag, Float.valueOf(floatValue));
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            viewGroup.getChildAt(i10).setAlpha(floatValue);
        }
    }
}
