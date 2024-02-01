package androidx.appcompat.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.reflect.Method;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static final String f820a = "ActionBarDrawerToggleHC";

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f821b = {16843531};

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public Method f822a;

        /* renamed from: b  reason: collision with root package name */
        public Method f823b;

        /* renamed from: c  reason: collision with root package name */
        public ImageView f824c;

        public a(Activity activity) {
            try {
                this.f822a = ActionBar.class.getDeclaredMethod("setHomeAsUpIndicator", new Class[]{Drawable.class});
                this.f823b = ActionBar.class.getDeclaredMethod("setHomeActionContentDescription", new Class[]{Integer.TYPE});
            } catch (NoSuchMethodException unused) {
                View findViewById = activity.findViewById(a2.a.f102p);
                if (findViewById != null) {
                    ViewGroup viewGroup = (ViewGroup) findViewById.getParent();
                    if (viewGroup.getChildCount() == 2) {
                        View childAt = viewGroup.getChildAt(0);
                        childAt = childAt.getId() == 16908332 ? viewGroup.getChildAt(1) : childAt;
                        if (childAt instanceof ImageView) {
                            this.f824c = (ImageView) childAt;
                        }
                    }
                }
            }
        }
    }

    public static Drawable a(Activity activity) {
        TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(f821b);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        return drawable;
    }

    public static a b(a aVar, Activity activity, int i10) {
        if (aVar == null) {
            aVar = new a(activity);
        }
        if (aVar.f822a != null) {
            try {
                ActionBar actionBar = activity.getActionBar();
                aVar.f823b.invoke(actionBar, new Object[]{Integer.valueOf(i10)});
            } catch (Exception unused) {
            }
        }
        return aVar;
    }

    public static a c(Activity activity, Drawable drawable, int i10) {
        a aVar = new a(activity);
        if (aVar.f822a != null) {
            try {
                ActionBar actionBar = activity.getActionBar();
                aVar.f822a.invoke(actionBar, new Object[]{drawable});
                aVar.f823b.invoke(actionBar, new Object[]{Integer.valueOf(i10)});
            } catch (Exception unused) {
            }
        } else {
            ImageView imageView = aVar.f824c;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
            }
        }
        return aVar;
    }
}
