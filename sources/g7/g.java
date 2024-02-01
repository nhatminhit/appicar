package g7;

import java.util.Collections;
import java.util.List;
import z6.w;

public abstract class g implements w<g> {

    /* renamed from: a  reason: collision with root package name */
    public final String f8129a;

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f8130b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f8131c;

    public g(String str, List<String> list, boolean z10) {
        this.f8129a = str;
        this.f8130b = Collections.unmodifiableList(list);
        this.f8131c = z10;
    }
}
