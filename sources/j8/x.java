package j8;

import android.content.Context;
import android.content.res.Resources;
import d.m0;
import d.o0;
import d8.q;
import e8.a;

@a
public class x {

    /* renamed from: a  reason: collision with root package name */
    public final Resources f9813a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9814b;

    public x(@m0 Context context) {
        s.l(context);
        Resources resources = context.getResources();
        this.f9813a = resources;
        this.f9814b = resources.getResourcePackageName(q.b.common_google_play_services_unknown_issue);
    }

    @a
    @o0
    public String a(@m0 String str) {
        int identifier = this.f9813a.getIdentifier(str, "string", this.f9814b);
        if (identifier == 0) {
            return null;
        }
        return this.f9813a.getString(identifier);
    }
}
