package i4;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import d.o0;
import d.u;
import i0.d;
import k0.g;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f9022a = true;

    public static Drawable a(Context context, @u int i10, @o0 Resources.Theme theme) {
        return c(context, context, i10, theme);
    }

    public static Drawable b(Context context, Context context2, @u int i10) {
        return c(context, context2, i10, (Resources.Theme) null);
    }

    public static Drawable c(Context context, Context context2, @u int i10, @o0 Resources.Theme theme) {
        try {
            if (f9022a) {
                return e(context2, i10, theme);
            }
        } catch (NoClassDefFoundError unused) {
            f9022a = false;
        } catch (IllegalStateException e10) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return d.i(context2, i10);
            }
            throw e10;
        } catch (Resources.NotFoundException unused2) {
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return d(context2, i10, theme);
    }

    public static Drawable d(Context context, @u int i10, @o0 Resources.Theme theme) {
        return g.f(context.getResources(), i10, theme);
    }

    public static Drawable e(Context context, @u int i10, @o0 Resources.Theme theme) {
        if (theme != null) {
            context = new k.d(context, theme);
        }
        return g.a.d(context, i10);
    }
}
