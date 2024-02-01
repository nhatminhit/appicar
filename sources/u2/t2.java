package u2;

import a3.d;
import d.m0;
import d.o0;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.Callable;

public class t2 implements d.c {
    @o0

    /* renamed from: a  reason: collision with root package name */
    public final String f13616a;
    @o0

    /* renamed from: b  reason: collision with root package name */
    public final File f13617b;
    @o0

    /* renamed from: c  reason: collision with root package name */
    public final Callable<InputStream> f13618c;
    @m0

    /* renamed from: d  reason: collision with root package name */
    public final d.c f13619d;

    public t2(@o0 String str, @o0 File file, @o0 Callable<InputStream> callable, @m0 d.c cVar) {
        this.f13616a = str;
        this.f13617b = file;
        this.f13618c = callable;
        this.f13619d = cVar;
    }

    @m0
    public d a(d.b bVar) {
        return new s2(bVar.f120a, this.f13616a, this.f13617b, this.f13618c, bVar.f122c.f119a, this.f13619d.a(bVar));
    }
}
