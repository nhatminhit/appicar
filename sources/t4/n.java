package t4;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.bumptech.glide.e;
import d.m0;
import d.o0;
import java.util.Arrays;
import q4.f;
import q4.o;

public class n<T> implements e.b<T>, o {

    /* renamed from: a  reason: collision with root package name */
    public int[] f12959a;

    /* renamed from: b  reason: collision with root package name */
    public a f12960b;

    public static final class a extends f<View, Object> {
        public a(@m0 View view) {
            super(view);
        }

        public void f(@o0 Drawable drawable) {
        }

        public void k(@o0 Drawable drawable) {
        }

        public void s(@m0 Object obj, @o0 r4.f<? super Object> fVar) {
        }
    }

    public n() {
    }

    public n(@m0 View view) {
        a aVar = new a(view);
        this.f12960b = aVar;
        aVar.o(this);
    }

    @o0
    public int[] a(@m0 T t10, int i10, int i11) {
        int[] iArr = this.f12959a;
        if (iArr == null) {
            return null;
        }
        return Arrays.copyOf(iArr, iArr.length);
    }

    public void b(@m0 View view) {
        if (this.f12959a == null && this.f12960b == null) {
            a aVar = new a(view);
            this.f12960b = aVar;
            aVar.o(this);
        }
    }

    public void d(int i10, int i11) {
        this.f12959a = new int[]{i10, i11};
        this.f12960b = null;
    }
}
