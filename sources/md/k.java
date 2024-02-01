package md;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import d.m0;
import d.t0;

@Deprecated
public class k implements a {

    /* renamed from: a  reason: collision with root package name */
    public final Paint f21072a = new Paint(2);

    /* renamed from: b  reason: collision with root package name */
    public final RenderScript f21073b;

    /* renamed from: c  reason: collision with root package name */
    public final ScriptIntrinsicBlur f21074c;

    /* renamed from: d  reason: collision with root package name */
    public Allocation f21075d;

    /* renamed from: e  reason: collision with root package name */
    public int f21076e = -1;

    /* renamed from: f  reason: collision with root package name */
    public int f21077f = -1;

    @t0(api = 17)
    public k(@m0 Context context) {
        RenderScript create = RenderScript.create(context);
        this.f21073b = create;
        this.f21074c = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
    }

    public float a() {
        return 6.0f;
    }

    @m0
    public Bitmap.Config b() {
        return Bitmap.Config.ARGB_8888;
    }

    public boolean c() {
        return true;
    }

    public void d(@m0 Canvas canvas, @m0 Bitmap bitmap) {
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f21072a);
    }

    public final void destroy() {
        this.f21074c.destroy();
        this.f21073b.destroy();
        Allocation allocation = this.f21075d;
        if (allocation != null) {
            allocation.destroy();
        }
    }

    @t0(api = 17)
    public Bitmap e(@m0 Bitmap bitmap, float f10) {
        Allocation createFromBitmap = Allocation.createFromBitmap(this.f21073b, bitmap);
        if (!f(bitmap)) {
            Allocation allocation = this.f21075d;
            if (allocation != null) {
                allocation.destroy();
            }
            this.f21075d = Allocation.createTyped(this.f21073b, createFromBitmap.getType());
            this.f21076e = bitmap.getWidth();
            this.f21077f = bitmap.getHeight();
        }
        this.f21074c.setRadius(f10);
        this.f21074c.setInput(createFromBitmap);
        this.f21074c.forEach(this.f21075d);
        this.f21075d.copyTo(bitmap);
        createFromBitmap.destroy();
        return bitmap;
    }

    public final boolean f(@m0 Bitmap bitmap) {
        return bitmap.getHeight() == this.f21077f && bitmap.getWidth() == this.f21076e;
    }
}
