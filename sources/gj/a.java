package gj;

import ad.d;
import java.util.concurrent.Callable;
import jh.f;
import qc.c;

public class a {

    /* renamed from: h  reason: collision with root package name */
    public static final String f19451h = "GetHtmlYoutubeController";

    /* renamed from: i  reason: collision with root package name */
    public static a f19452i;

    /* renamed from: a  reason: collision with root package name */
    public f f19453a;

    /* renamed from: b  reason: collision with root package name */
    public String f19454b = "";

    /* renamed from: c  reason: collision with root package name */
    public String f19455c = "";

    /* renamed from: d  reason: collision with root package name */
    public String f19456d = "";

    /* renamed from: e  reason: collision with root package name */
    public c f19457e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f19458f = true;

    /* renamed from: g  reason: collision with root package name */
    public qc.c f19459g;

    /* renamed from: gj.a$a  reason: collision with other inner class name */
    public class C0317a implements Callable<Object> {
        public C0317a() {
        }

        public Object call() throws Exception {
            a.this.c();
            return null;
        }
    }

    public class b implements c.a<Object> {
        public b() {
        }

        public void a(Object obj) {
        }
    }

    public interface c {
        void l(boolean z10, String str, boolean z11);
    }

    public static a e() {
        if (f19452i == null) {
            f19452i = new a();
        }
        return f19452i;
    }

    public void b() {
        d.e("GetHtmlYoutubeController", "caneGetHtml ");
        if (this.f19459g != null) {
            this.f19459g = null;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:13|14|(1:16)(1:30)) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r3 = r7.f19457e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0065, code lost:
        if (r3 != null) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0067, code lost:
        r4 = r7.f19458f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0063 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r7 = this;
            java.lang.String r0 = "GetHtmlYoutubeController"
            java.lang.String r1 = "{}"
            r2 = 0
            java.lang.String r3 = "doInBackground "
            ad.d.e(r0, r3)     // Catch:{ IOException -> 0x0074 }
            java.lang.String r3 = r7.f19454b     // Catch:{ IOException -> 0x0074 }
            gh.a r3 = gh.c.d(r3)     // Catch:{ IOException -> 0x0074 }
            java.lang.String r4 = r7.f19456d     // Catch:{ IOException -> 0x0074 }
            gh.a r3 = r3.s(r4)     // Catch:{ IOException -> 0x0074 }
            java.lang.String r4 = "http://www.google.com"
            gh.a r3 = r3.B(r4)     // Catch:{ IOException -> 0x0074 }
            r4 = 5000(0x1388, float:7.006E-42)
            gh.a r3 = r3.k(r4)     // Catch:{ IOException -> 0x0074 }
            r4 = 1
            gh.a r3 = r3.f(r4)     // Catch:{ IOException -> 0x0074 }
            jh.f r3 = r3.get()     // Catch:{ IOException -> 0x0074 }
            r7.f19453a = r3     // Catch:{ IOException -> 0x0074 }
            if (r3 == 0) goto L_0x006d
            java.lang.String r3 = r7.f19455c     // Catch:{ Exception -> 0x0063 }
            r5 = 72
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3, r5)     // Catch:{ Exception -> 0x0063 }
            jh.f r5 = r7.f19453a     // Catch:{ Exception -> 0x0063 }
            mh.c r5 = r5.Z0()     // Catch:{ Exception -> 0x0063 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0063 }
            java.util.regex.Matcher r3 = r3.matcher(r5)     // Catch:{ Exception -> 0x0063 }
            boolean r5 = r3.find()     // Catch:{ Exception -> 0x0063 }
            if (r5 == 0) goto L_0x0059
            gj.a$c r5 = r7.f19457e     // Catch:{ Exception -> 0x0063 }
            if (r5 == 0) goto L_0x0099
            java.lang.String r3 = r3.group()     // Catch:{ Exception -> 0x0063 }
            boolean r6 = r7.f19458f     // Catch:{ Exception -> 0x0063 }
            r5.l(r4, r3, r6)     // Catch:{ Exception -> 0x0063 }
            goto L_0x0099
        L_0x0059:
            gj.a$c r3 = r7.f19457e     // Catch:{ Exception -> 0x0063 }
            if (r3 == 0) goto L_0x0099
            boolean r4 = r7.f19458f     // Catch:{ Exception -> 0x0063 }
            r3.l(r2, r1, r4)     // Catch:{ Exception -> 0x0063 }
            goto L_0x0099
        L_0x0063:
            gj.a$c r3 = r7.f19457e     // Catch:{ IOException -> 0x0074 }
            if (r3 == 0) goto L_0x0099
            boolean r4 = r7.f19458f     // Catch:{ IOException -> 0x0074 }
        L_0x0069:
            r3.l(r2, r1, r4)     // Catch:{ IOException -> 0x0074 }
            goto L_0x0099
        L_0x006d:
            gj.a$c r3 = r7.f19457e     // Catch:{ IOException -> 0x0074 }
            if (r3 == 0) goto L_0x0099
            boolean r4 = r7.f19458f     // Catch:{ IOException -> 0x0074 }
            goto L_0x0069
        L_0x0074:
            r3 = move-exception
            gj.a$c r4 = r7.f19457e
            if (r4 == 0) goto L_0x007e
            boolean r5 = r7.f19458f
            r4.l(r2, r1, r5)
        L_0x007e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "doInBackground error:  "
            r1.append(r2)
            java.lang.String r2 = r3.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            ad.d.e(r0, r1)
            r3.printStackTrace()
        L_0x0099:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gj.a.c():void");
    }

    public void d(c cVar, String str, String str2, String str3, boolean z10) {
        d.e("GetHtmlYoutubeController", "getHtmlYoutube: " + str + "//" + str2 + "//" + str3 + "//" + z10);
        if (this.f19459g != null) {
            this.f19459g = null;
        }
        this.f19458f = z10;
        this.f19454b = str;
        this.f19455c = str2;
        this.f19456d = str3;
        this.f19457e = cVar;
        qc.c cVar2 = new qc.c();
        this.f19459g = cVar2;
        cVar2.c(new C0317a(), new b());
    }
}
