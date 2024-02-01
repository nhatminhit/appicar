package y8;

import android.content.Context;
import d.m0;
import d.o0;
import e8.a;
import w8.d0;

@a
public class e {

    /* renamed from: b  reason: collision with root package name */
    public static e f15580b = new e();
    @o0

    /* renamed from: a  reason: collision with root package name */
    public d f15581a = null;

    @a
    @m0
    public static d a(@m0 Context context) {
        return f15580b.b(context);
    }

    @d0
    @m0
    public final synchronized d b(@m0 Context context) {
        if (this.f15581a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f15581a = new d(context);
        }
        return this.f15581a;
    }
}
