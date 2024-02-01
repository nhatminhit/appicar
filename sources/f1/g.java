package f1;

import android.app.Activity;
import android.os.Build;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;
import d.o0;
import d.x0;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public Object f7118a;

    public g(Object obj) {
        this.f7118a = obj;
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    @o0
    public static g b(Activity activity, DragEvent dragEvent) {
        DragAndDropPermissions a10;
        if (Build.VERSION.SDK_INT < 24 || (a10 = activity.requestDragAndDropPermissions(dragEvent)) == null) {
            return null;
        }
        return new g(a10);
    }

    public void a() {
        if (Build.VERSION.SDK_INT >= 24) {
            ((DragAndDropPermissions) this.f7118a).release();
        }
    }
}
