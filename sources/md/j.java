package md;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import d.m0;
import d.o0;
import d.t0;

@t0(31)
public class j implements a {

    /* renamed from: a  reason: collision with root package name */
    public final RenderNode f21066a = new RenderNode("BlurViewNode");

    /* renamed from: b  reason: collision with root package name */
    public int f21067b;

    /* renamed from: c  reason: collision with root package name */
    public int f21068c;

    /* renamed from: d  reason: collision with root package name */
    public float f21069d = 1.0f;
    @o0

    /* renamed from: e  reason: collision with root package name */
    public a f21070e;

    /* renamed from: f  reason: collision with root package name */
    public Context f21071f;

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
        if (canvas.isHardwareAccelerated()) {
            canvas.drawRenderNode(this.f21066a);
            return;
        }
        if (this.f21070e == null) {
            this.f21070e = new k(this.f21071f);
        }
        this.f21070e.e(bitmap, this.f21069d);
        this.f21070e.d(canvas, bitmap);
    }

    public void destroy() {
        this.f21066a.discardDisplayList();
        a aVar = this.f21070e;
        if (aVar != null) {
            aVar.destroy();
        }
    }

    public Bitmap e(@m0 Bitmap bitmap, float f10) {
        this.f21069d = f10;
        if (!(bitmap.getHeight() == this.f21067b && bitmap.getWidth() == this.f21068c)) {
            this.f21067b = bitmap.getHeight();
            int width = bitmap.getWidth();
            this.f21068c = width;
            this.f21066a.setPosition(0, 0, width, this.f21067b);
        }
        this.f21066a.beginRecording().drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        this.f21066a.endRecording();
        boolean unused = this.f21066a.setRenderEffect(RenderEffect.createBlurEffect(f10, f10, Shader.TileMode.MIRROR));
        return bitmap;
    }

    public void f(@m0 Context context) {
        this.f21071f = context;
    }
}
