package yb;

import android.content.Context;
import android.view.OrientationEventListener;
import android.view.WindowManager;

public class t {

    /* renamed from: a  reason: collision with root package name */
    public int f24727a;

    /* renamed from: b  reason: collision with root package name */
    public WindowManager f24728b;

    /* renamed from: c  reason: collision with root package name */
    public OrientationEventListener f24729c;

    /* renamed from: d  reason: collision with root package name */
    public s f24730d;

    public class a extends OrientationEventListener {
        public a(Context context, int i10) {
            super(context, i10);
        }

        public void onOrientationChanged(int i10) {
            int rotation;
            WindowManager a10 = t.this.f24728b;
            s b10 = t.this.f24730d;
            if (t.this.f24728b != null && b10 != null && (rotation = a10.getDefaultDisplay().getRotation()) != t.this.f24727a) {
                int unused = t.this.f24727a = rotation;
                b10.a(rotation);
            }
        }
    }

    public void e(Context context, s sVar) {
        f();
        Context applicationContext = context.getApplicationContext();
        this.f24730d = sVar;
        this.f24728b = (WindowManager) applicationContext.getSystemService("window");
        a aVar = new a(applicationContext, 3);
        this.f24729c = aVar;
        aVar.enable();
        this.f24727a = this.f24728b.getDefaultDisplay().getRotation();
    }

    public void f() {
        OrientationEventListener orientationEventListener = this.f24729c;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
        this.f24729c = null;
        this.f24728b = null;
        this.f24730d = null;
    }
}
