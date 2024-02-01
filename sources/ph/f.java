package ph;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import ph.e;

public class f {

    /* renamed from: g  reason: collision with root package name */
    public static final String f22087g = "lib";

    /* renamed from: a  reason: collision with root package name */
    public final Set<String> f22088a;

    /* renamed from: b  reason: collision with root package name */
    public final e.b f22089b;

    /* renamed from: c  reason: collision with root package name */
    public final e.a f22090c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f22091d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f22092e;

    /* renamed from: f  reason: collision with root package name */
    public e.d f22093f;

    public class a implements Runnable {
        public final /* synthetic */ Context O;
        public final /* synthetic */ String P;
        public final /* synthetic */ String Q;
        public final /* synthetic */ e.c R;

        public a(Context context, String str, String str2, e.c cVar) {
            this.O = context;
            this.P = str;
            this.Q = str2;
            this.R = cVar;
        }

        public void run() {
            try {
                f.this.j(this.O, this.P, this.Q);
                this.R.a();
            } catch (UnsatisfiedLinkError | c e10) {
                this.R.b(e10);
            }
        }
    }

    public class b implements FilenameFilter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f22094a;

        public b(String str) {
            this.f22094a = str;
        }

        public boolean accept(File file, String str) {
            return str.startsWith(this.f22094a);
        }
    }

    public f() {
        this(new g(), new a());
    }

    public f(e.b bVar, e.a aVar) {
        this.f22088a = new HashSet();
        if (bVar == null) {
            throw new IllegalArgumentException("Cannot pass null library loader");
        } else if (aVar != null) {
            this.f22089b = bVar;
            this.f22090c = aVar;
        } else {
            throw new IllegalArgumentException("Cannot pass null library installer");
        }
    }

    public void b(Context context, String str, String str2) {
        File d10 = d(context);
        File e10 = e(context, str, str2);
        File[] listFiles = d10.listFiles(new b(this.f22089b.a(str)));
        if (listFiles != null) {
            for (File file : listFiles) {
                if (this.f22091d || !file.getAbsolutePath().equals(e10.getAbsolutePath())) {
                    file.delete();
                }
            }
        }
    }

    public f c() {
        this.f22091d = true;
        return this;
    }

    public File d(Context context) {
        return context.getDir(f22087g, 0);
    }

    public File e(Context context, String str, String str2) {
        String a10 = this.f22089b.a(str);
        if (h.a(str2)) {
            return new File(d(context), a10);
        }
        File d10 = d(context);
        return new File(d10, a10 + "." + str2);
    }

    public void f(Context context, String str) {
        h(context, str, (String) null, (e.c) null);
    }

    public void g(Context context, String str, String str2) {
        h(context, str, str2, (e.c) null);
    }

    public void h(Context context, String str, String str2, e.c cVar) {
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        } else if (!h.a(str)) {
            m("Beginning load of %s...", str);
            if (cVar == null) {
                j(context, str, str2);
            } else {
                new Thread(new a(context, str, str2, cVar)).start();
            }
        } else {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
    }

    public void i(Context context, String str, e.c cVar) {
        h(context, str, (String) null, cVar);
    }

    public final void j(Context context, String str, String str2) {
        qh.f fVar;
        qh.f fVar2;
        if (!this.f22088a.contains(str) || this.f22091d) {
            try {
                this.f22089b.b(str);
                this.f22088a.add(str);
                m("%s (%s) was loaded normally!", str, str2);
            } catch (UnsatisfiedLinkError e10) {
                m("Loading the library normally failed: %s", Log.getStackTraceString(e10));
                m("%s (%s) was not loaded normally, re-linking...", str, str2);
                File e11 = e(context, str, str2);
                if (!e11.exists() || this.f22091d) {
                    if (this.f22091d) {
                        m("Forcing a re-link of %s (%s)...", str, str2);
                    }
                    b(context, str, str2);
                    this.f22090c.a(context, this.f22089b.d(), this.f22089b.a(str), e11, this);
                }
                try {
                    if (this.f22092e) {
                        fVar = null;
                        fVar2 = new qh.f(e11);
                        List<String> g10 = fVar2.g();
                        fVar2.close();
                        for (String c10 : g10) {
                            f(context, this.f22089b.c(c10));
                        }
                    }
                } catch (IOException unused) {
                }
                this.f22089b.e(e11.getAbsolutePath());
                this.f22088a.add(str);
                m("%s (%s) was re-linked!", str, str2);
            } catch (Throwable th2) {
                th = th2;
                fVar = fVar2;
                fVar.close();
                throw th;
            }
        } else {
            m("%s already loaded previously!", str);
        }
    }

    public f k(e.d dVar) {
        this.f22093f = dVar;
        return this;
    }

    public void l(String str) {
        e.d dVar = this.f22093f;
        if (dVar != null) {
            dVar.a(str);
        }
    }

    public void m(String str, Object... objArr) {
        l(String.format(Locale.US, str, objArr));
    }

    public f n() {
        this.f22092e = true;
        return this;
    }
}
