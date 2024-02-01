package a4;

import a4.a;
import java.io.File;

public class d implements a.C0004a {

    /* renamed from: c  reason: collision with root package name */
    public final long f146c;

    /* renamed from: d  reason: collision with root package name */
    public final c f147d;

    public class a implements c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f148a;

        public a(String str) {
            this.f148a = str;
        }

        public File a() {
            return new File(this.f148a);
        }
    }

    public class b implements c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f149a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f150b;

        public b(String str, String str2) {
            this.f149a = str;
            this.f150b = str2;
        }

        public File a() {
            return new File(this.f149a, this.f150b);
        }
    }

    public interface c {
        File a();
    }

    public d(c cVar, long j10) {
        this.f146c = j10;
        this.f147d = cVar;
    }

    public d(String str, long j10) {
        this((c) new a(str), j10);
    }

    public d(String str, String str2, long j10) {
        this((c) new b(str, str2), j10);
    }

    public a build() {
        File a10 = this.f147d.a();
        if (a10 == null) {
            return null;
        }
        if (a10.mkdirs() || (a10.exists() && a10.isDirectory())) {
            return e.d(a10, this.f146c);
        }
        return null;
    }
}
