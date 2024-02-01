package pl.droidsonroids.gif;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import d.m0;
import d.s0;
import d.u;
import h0.u0;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import pl.droidsonroids.gif.r;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final String f22135a = "http://schemas.android.com/apk/res/android";

    /* renamed from: b  reason: collision with root package name */
    public static final List<String> f22136b = Arrays.asList(new String[]{"raw", "drawable", "mipmap"});

    public static class a extends b {

        /* renamed from: c  reason: collision with root package name */
        public final int f22137c;

        /* renamed from: d  reason: collision with root package name */
        public final int f22138d;

        public a() {
            this.f22137c = 0;
            this.f22138d = 0;
        }

        public a(ImageView imageView, AttributeSet attributeSet, int i10, int i11) {
            super(imageView, attributeSet, i10, i11);
            this.f22137c = a(imageView, attributeSet, true);
            this.f22138d = a(imageView, attributeSet, false);
        }

        public static int a(ImageView imageView, AttributeSet attributeSet, boolean z10) {
            int attributeResourceValue = attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", z10 ? "src" : u0.q.C, 0);
            if (attributeResourceValue > 0) {
                if (!l.f22136b.contains(imageView.getResources().getResourceTypeName(attributeResourceValue)) || l.e(imageView, z10, attributeResourceValue)) {
                    return 0;
                }
                return attributeResourceValue;
            }
            return 0;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public boolean f22139a;

        /* renamed from: b  reason: collision with root package name */
        public final int f22140b;

        public b() {
            this.f22139a = false;
            this.f22140b = -1;
        }

        public b(View view, AttributeSet attributeSet, int i10, int i11) {
            TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, r.b.GifView, i10, i11);
            this.f22139a = obtainStyledAttributes.getBoolean(r.b.GifView_freezesAnimation, false);
            this.f22140b = obtainStyledAttributes.getInt(r.b.GifView_loopCount, -1);
            obtainStyledAttributes.recycle();
        }
    }

    public static void a(int i10, Drawable drawable) {
        if (drawable instanceof e) {
            ((e) drawable).H(i10);
        }
    }

    public static float b(@m0 Resources resources, @s0 @u int i10) {
        TypedValue typedValue = new TypedValue();
        resources.getValue(i10, typedValue, true);
        int i11 = typedValue.density;
        if (i11 == 0) {
            i11 = 160;
        } else if (i11 == 65535) {
            i11 = 0;
        }
        int i12 = resources.getDisplayMetrics().densityDpi;
        if (i11 <= 0 || i12 <= 0) {
            return 1.0f;
        }
        return ((float) i12) / ((float) i11);
    }

    public static a c(ImageView imageView, AttributeSet attributeSet, int i10, int i11) {
        if (attributeSet == null || imageView.isInEditMode()) {
            return new a();
        }
        a aVar = new a(imageView, attributeSet, i10, i11);
        int i12 = aVar.f22140b;
        if (i12 >= 0) {
            a(i12, imageView.getDrawable());
            a(i12, imageView.getBackground());
        }
        return aVar;
    }

    public static boolean d(ImageView imageView, Uri uri) {
        if (uri == null) {
            return false;
        }
        try {
            imageView.setImageDrawable(new e(imageView.getContext().getContentResolver(), uri));
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean e(ImageView imageView, boolean z10, int i10) {
        Resources resources = imageView.getResources();
        if (resources != null) {
            try {
                if (!f22136b.contains(resources.getResourceTypeName(i10))) {
                    return false;
                }
                e eVar = new e(resources, i10);
                if (z10) {
                    imageView.setImageDrawable(eVar);
                    return true;
                }
                imageView.setBackground(eVar);
                return true;
            } catch (Resources.NotFoundException | IOException unused) {
            }
        }
        return false;
    }
}
