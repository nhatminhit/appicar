package z8;

import android.content.Context;
import android.os.IBinder;
import d.m0;
import d8.j;
import j8.s;

@e8.a
public abstract class h<T> {

    /* renamed from: a  reason: collision with root package name */
    public final String f16013a;

    /* renamed from: b  reason: collision with root package name */
    public Object f16014b;

    @e8.a
    public static class a extends Exception {
        @e8.a
        public a(@m0 String str) {
            super(str);
        }

        @e8.a
        public a(@m0 String str, @m0 Throwable th2) {
            super(str, th2);
        }
    }

    @e8.a
    public h(@m0 String str) {
        this.f16013a = str;
    }

    @e8.a
    @m0
    public abstract T a(@m0 IBinder iBinder);

    @e8.a
    @m0
    public final T b(@m0 Context context) throws a {
        if (this.f16014b == null) {
            s.l(context);
            Context i10 = j.i(context);
            if (i10 != null) {
                try {
                    this.f16014b = a((IBinder) i10.getClassLoader().loadClass(this.f16013a).newInstance());
                } catch (ClassNotFoundException e10) {
                    throw new a("Could not load creator class.", e10);
                } catch (InstantiationException e11) {
                    throw new a("Could not instantiate creator.", e11);
                } catch (IllegalAccessException e12) {
                    throw new a("Could not access creator.", e12);
                }
            } else {
                throw new a("Could not get remote context.");
            }
        }
        return this.f16014b;
    }
}
