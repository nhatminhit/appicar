package f1;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import d.m0;
import java.lang.reflect.Field;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final String f7218a = "LayoutInflaterCompatHC";

    /* renamed from: b  reason: collision with root package name */
    public static Field f7219b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f7220c;

    public static class a implements LayoutInflater.Factory2 {
        public final n O;

        public a(n nVar) {
            this.O = nVar;
        }

        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            return this.O.onCreateView(view, str, context, attributeSet);
        }

        public View onCreateView(String str, Context context, AttributeSet attributeSet) {
            return this.O.onCreateView((View) null, str, context, attributeSet);
        }

        @m0
        public String toString() {
            return getClass().getName() + p7.a.f11638i + this.O + p7.a.f11639j;
        }
    }

    public static void a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        if (!f7220c) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
                f7219b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("forceSetFactory2 Could not find field 'mFactory2' on class ");
                sb2.append(LayoutInflater.class.getName());
                sb2.append("; inflation may have unexpected results.");
            }
            f7220c = true;
        }
        Field field = f7219b;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException unused2) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("forceSetFactory2 could not set the Factory2 on LayoutInflater ");
                sb3.append(layoutInflater);
                sb3.append("; inflation may have unexpected results.");
            }
        }
    }

    @Deprecated
    public static n b(LayoutInflater layoutInflater) {
        LayoutInflater.Factory factory = layoutInflater.getFactory();
        if (factory instanceof a) {
            return ((a) factory).O;
        }
        return null;
    }

    @Deprecated
    public static void c(@m0 LayoutInflater layoutInflater, @m0 n nVar) {
        layoutInflater.setFactory2(nVar != null ? new a(nVar) : null);
    }

    public static void d(@m0 LayoutInflater layoutInflater, @m0 LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
    }
}
