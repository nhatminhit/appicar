package cj;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.os.Environment;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import qc.c;
import rj.g0;
import rj.j0;
import rj.m;
import rj.p;
import sj.i;

public class a {

    /* renamed from: y  reason: collision with root package name */
    public static final String f16540y = "DataDeviceController";

    /* renamed from: z  reason: collision with root package name */
    public static a f16541z;

    /* renamed from: a  reason: collision with root package name */
    public String f16542a = e7.d.f6880h;

    /* renamed from: b  reason: collision with root package name */
    public String f16543b = ".flac";

    /* renamed from: c  reason: collision with root package name */
    public String f16544c = ".wav";

    /* renamed from: d  reason: collision with root package name */
    public String f16545d = ".mp4";

    /* renamed from: e  reason: collision with root package name */
    public List<String> f16546e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public Context f16547f;

    /* renamed from: g  reason: collision with root package name */
    public String f16548g = "";

    /* renamed from: h  reason: collision with root package name */
    public String f16549h = "";

    /* renamed from: i  reason: collision with root package name */
    public int f16550i = 0;

    /* renamed from: j  reason: collision with root package name */
    public ArrayList<ti.a> f16551j = new ArrayList<>();

    /* renamed from: k  reason: collision with root package name */
    public ArrayList<m> f16552k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    public ArrayList<g0> f16553l = new ArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    public ArrayList<ti.a> f16554m = new ArrayList<>();

    /* renamed from: n  reason: collision with root package name */
    public ArrayList<ti.a> f16555n = new ArrayList<>();

    /* renamed from: o  reason: collision with root package name */
    public c f16556o;

    /* renamed from: p  reason: collision with root package name */
    public d f16557p;

    /* renamed from: q  reason: collision with root package name */
    public String f16558q = "";

    /* renamed from: r  reason: collision with root package name */
    public String f16559r = "";

    /* renamed from: s  reason: collision with root package name */
    public boolean f16560s = false;

    /* renamed from: t  reason: collision with root package name */
    public boolean f16561t = false;

    /* renamed from: u  reason: collision with root package name */
    public boolean f16562u = false;

    /* renamed from: v  reason: collision with root package name */
    public qc.c f16563v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f16564w = false;

    /* renamed from: x  reason: collision with root package name */
    public MediaPlayer f16565x;

    /* renamed from: cj.a$a  reason: collision with other inner class name */
    public class C0273a implements Callable<Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f16566a;

        public C0273a(String str) {
            this.f16566a = str;
        }

        public Object call() throws Exception {
            try {
                File[] listFiles = new File(this.f16566a).listFiles();
                if (listFiles == null || listFiles.length <= 0) {
                    return null;
                }
                int length = listFiles.length;
                int i10 = 0;
                while (i10 < length) {
                    File file = listFiles[i10];
                    if (a.this.f16562u) {
                        if (file.isDirectory()) {
                            String unused = a.this.f16558q = file.getName();
                            a.this.u(file);
                        } else {
                            a.this.m(file);
                        }
                        i10++;
                    } else {
                        boolean unused2 = a.this.f16564w = true;
                        return null;
                    }
                }
                return null;
            } catch (Exception e10) {
                ad.d.c(a.f16540y, "Lỗi đọc file: " + e10.getMessage());
                return null;
            }
        }
    }

    public class b implements c.a<Object> {
        public b() {
        }

        public void a(Object obj) {
            if (a.this.f16562u) {
                if (a.this.f16550i < a.this.f16546e.size() - 1) {
                    a.i(a.this);
                } else if (a.this.f16556o != null) {
                    a.this.f16556o.a();
                    return;
                } else {
                    return;
                }
            } else if (a.this.f16564w) {
                boolean unused = a.this.f16564w = false;
                boolean unused2 = a.this.f16562u = true;
            } else {
                return;
            }
            a aVar = a.this;
            aVar.q((String) aVar.f16546e.get(a.this.f16550i));
        }
    }

    public interface c {
        void a();

        void b(ArrayList<ti.a> arrayList);
    }

    public interface d {
        void j(ArrayList<ti.a> arrayList);
    }

    public class e extends AsyncTask<Void, Void, Void> {
        public e() {
        }

        @SuppressLint({"UseRequireInsteadOfGet"})
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            return null;
        }

        @SuppressLint({"UseRequireInsteadOfGet"})
        /* renamed from: b */
        public void onPostExecute(Void voidR) {
        }
    }

    public a(Context context) {
        this.f16547f = context;
    }

    public static /* synthetic */ int i(a aVar) {
        int i10 = aVar.f16550i;
        aVar.f16550i = i10 + 1;
        return i10;
    }

    public static a r(Context context) {
        if (f16541z == null) {
            f16541z = new a(context.getApplicationContext());
        }
        return f16541z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c8 A[Catch:{ Exception -> 0x0153 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c9 A[Catch:{ Exception -> 0x0153 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m(java.io.File r13) {
        /*
            r12 = this;
            java.lang.String r0 = "//"
            boolean r1 = r12.f16562u     // Catch:{ Exception -> 0x0153 }
            if (r1 == 0) goto L_0x016e
            int r1 = r12.f16550i     // Catch:{ Exception -> 0x0153 }
            java.util.List<java.lang.String> r2 = r12.f16546e     // Catch:{ Exception -> 0x0153 }
            int r2 = r2.size()     // Catch:{ Exception -> 0x0153 }
            r3 = 1
            int r2 = r2 - r3
            if (r1 != r2) goto L_0x0017
            java.lang.String r1 = "Bộ nhớ trong"
        L_0x0014:
            r12.f16559r = r1     // Catch:{ Exception -> 0x0153 }
            goto L_0x002e
        L_0x0017:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0153 }
            r1.<init>()     // Catch:{ Exception -> 0x0153 }
            java.lang.String r2 = "Usb "
            r1.append(r2)     // Catch:{ Exception -> 0x0153 }
            int r2 = r12.f16550i     // Catch:{ Exception -> 0x0153 }
            r1.append(r2)     // Catch:{ Exception -> 0x0153 }
            r1.append(r3)     // Catch:{ Exception -> 0x0153 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0153 }
            goto L_0x0014
        L_0x002e:
            java.lang.String r1 = r13.getPath()     // Catch:{ Exception -> 0x0153 }
            java.lang.String r2 = ""
            boolean r1 = r1.equals(r2)     // Catch:{ Exception -> 0x0153 }
            if (r1 != 0) goto L_0x0152
            java.lang.String r1 = r13.getPath()     // Catch:{ Exception -> 0x0153 }
            android.net.Uri r1 = android.net.Uri.parse(r1)     // Catch:{ Exception -> 0x0153 }
            if (r1 != 0) goto L_0x0046
            goto L_0x0152
        L_0x0046:
            java.lang.String r1 = r13.getName()     // Catch:{ Exception -> 0x0153 }
            java.lang.String r2 = r12.f16542a     // Catch:{ Exception -> 0x0153 }
            boolean r1 = r1.endsWith(r2)     // Catch:{ Exception -> 0x0153 }
            r2 = 0
            if (r1 != 0) goto L_0x007a
            java.lang.String r1 = r13.getName()     // Catch:{ Exception -> 0x0153 }
            java.lang.String r3 = r12.f16543b     // Catch:{ Exception -> 0x0153 }
            boolean r1 = r1.endsWith(r3)     // Catch:{ Exception -> 0x0153 }
            if (r1 != 0) goto L_0x007a
            java.lang.String r1 = r13.getName()     // Catch:{ Exception -> 0x0153 }
            java.lang.String r3 = r12.f16544c     // Catch:{ Exception -> 0x0153 }
            boolean r1 = r1.endsWith(r3)     // Catch:{ Exception -> 0x0153 }
            if (r1 != 0) goto L_0x007a
            java.lang.String r1 = r13.getName()     // Catch:{ Exception -> 0x0153 }
            java.lang.String r3 = r12.f16545d     // Catch:{ Exception -> 0x0153 }
            boolean r1 = r1.endsWith(r3)     // Catch:{ Exception -> 0x0153 }
            if (r1 == 0) goto L_0x0078
            goto L_0x007a
        L_0x0078:
            r0 = r2
            goto L_0x00a4
        L_0x007a:
            android.media.MediaPlayer r1 = r12.f16565x     // Catch:{ Exception -> 0x0153 }
            if (r1 != 0) goto L_0x0085
            android.media.MediaPlayer r1 = new android.media.MediaPlayer     // Catch:{ Exception -> 0x0153 }
            r1.<init>()     // Catch:{ Exception -> 0x0153 }
            r12.f16565x = r1     // Catch:{ Exception -> 0x0153 }
        L_0x0085:
            android.media.MediaPlayer r1 = r12.f16565x     // Catch:{ Exception -> 0x0153 }
            r1.reset()     // Catch:{ Exception -> 0x0153 }
            android.media.MediaPlayer r1 = r12.f16565x     // Catch:{ Exception -> 0x0131 }
            android.content.Context r3 = r12.f16547f     // Catch:{ Exception -> 0x0131 }
            java.lang.String r4 = r13.getPath()     // Catch:{ Exception -> 0x0131 }
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch:{ Exception -> 0x0131 }
            r1.setDataSource(r3, r4)     // Catch:{ Exception -> 0x0131 }
            android.media.MediaPlayer r1 = r12.f16565x     // Catch:{ Exception -> 0x0131 }
            r1.prepare()     // Catch:{ Exception -> 0x0131 }
            android.media.MediaPlayer r1 = r12.f16565x     // Catch:{ Exception -> 0x0131 }
            int r0 = r1.getDuration()     // Catch:{ Exception -> 0x0131 }
        L_0x00a4:
            java.lang.String r1 = r13.getName()     // Catch:{ Exception -> 0x0153 }
            java.lang.String r3 = r12.f16542a     // Catch:{ Exception -> 0x0153 }
            boolean r1 = r1.endsWith(r3)     // Catch:{ Exception -> 0x0153 }
            if (r1 != 0) goto L_0x0104
            java.lang.String r1 = r13.getName()     // Catch:{ Exception -> 0x0153 }
            java.lang.String r3 = r12.f16543b     // Catch:{ Exception -> 0x0153 }
            boolean r1 = r1.endsWith(r3)     // Catch:{ Exception -> 0x0153 }
            if (r1 != 0) goto L_0x0104
            java.lang.String r1 = r13.getName()     // Catch:{ Exception -> 0x0153 }
            java.lang.String r3 = r12.f16544c     // Catch:{ Exception -> 0x0153 }
            boolean r1 = r1.endsWith(r3)     // Catch:{ Exception -> 0x0153 }
            if (r1 == 0) goto L_0x00c9
            goto L_0x0104
        L_0x00c9:
            java.lang.String r1 = r13.getName()     // Catch:{ Exception -> 0x0153 }
            java.lang.String r3 = r12.f16545d     // Catch:{ Exception -> 0x0153 }
            boolean r1 = r1.endsWith(r3)     // Catch:{ Exception -> 0x0153 }
            if (r1 == 0) goto L_0x016e
            java.util.ArrayList<ti.a> r1 = r12.f16551j     // Catch:{ Exception -> 0x016e }
            ti.a r11 = new ti.a     // Catch:{ Exception -> 0x016e }
            java.lang.String r3 = r13.getName()     // Catch:{ Exception -> 0x016e }
            java.lang.String r4 = r13.getName()     // Catch:{ Exception -> 0x016e }
            int r4 = r4.length()     // Catch:{ Exception -> 0x016e }
            int r4 = r4 + -4
            java.lang.String r4 = r3.substring(r2, r4)     // Catch:{ Exception -> 0x016e }
            java.lang.String r5 = r13.getPath()     // Catch:{ Exception -> 0x016e }
            java.lang.String r6 = r12.f16545d     // Catch:{ Exception -> 0x016e }
            long r7 = (long) r0     // Catch:{ Exception -> 0x016e }
            java.lang.String r9 = r12.f16558q     // Catch:{ Exception -> 0x016e }
            java.lang.String r10 = r12.f16559r     // Catch:{ Exception -> 0x016e }
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r9, r10)     // Catch:{ Exception -> 0x016e }
            r1.add(r11)     // Catch:{ Exception -> 0x016e }
        L_0x00fd:
            r12.w()     // Catch:{ Exception -> 0x016e }
            r12.v()     // Catch:{ Exception -> 0x016e }
            goto L_0x016e
        L_0x0104:
            r1 = 5000(0x1388, float:7.006E-42)
            if (r0 <= r1) goto L_0x016e
            java.util.ArrayList<ti.a> r1 = r12.f16551j     // Catch:{ Exception -> 0x016e }
            ti.a r11 = new ti.a     // Catch:{ Exception -> 0x016e }
            java.lang.String r3 = r13.getName()     // Catch:{ Exception -> 0x016e }
            java.lang.String r4 = r13.getName()     // Catch:{ Exception -> 0x016e }
            int r4 = r4.length()     // Catch:{ Exception -> 0x016e }
            int r4 = r4 + -4
            java.lang.String r4 = r3.substring(r2, r4)     // Catch:{ Exception -> 0x016e }
            java.lang.String r5 = r13.getPath()     // Catch:{ Exception -> 0x016e }
            java.lang.String r6 = r12.f16542a     // Catch:{ Exception -> 0x016e }
            long r7 = (long) r0     // Catch:{ Exception -> 0x016e }
            java.lang.String r9 = r12.f16558q     // Catch:{ Exception -> 0x016e }
            java.lang.String r10 = r12.f16559r     // Catch:{ Exception -> 0x016e }
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r9, r10)     // Catch:{ Exception -> 0x016e }
            r1.add(r11)     // Catch:{ Exception -> 0x016e }
            goto L_0x00fd
        L_0x0131:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0153 }
            r2.<init>()     // Catch:{ Exception -> 0x0153 }
            java.lang.String r1 = r1.getMessage()     // Catch:{ Exception -> 0x0153 }
            r2.append(r1)     // Catch:{ Exception -> 0x0153 }
            r2.append(r0)     // Catch:{ Exception -> 0x0153 }
            java.lang.String r1 = r13.getPath()     // Catch:{ Exception -> 0x0153 }
            r2.append(r1)     // Catch:{ Exception -> 0x0153 }
            r2.append(r0)     // Catch:{ Exception -> 0x0153 }
            boolean r13 = r13.exists()     // Catch:{ Exception -> 0x0153 }
            r2.append(r13)     // Catch:{ Exception -> 0x0153 }
        L_0x0152:
            return
        L_0x0153:
            r13 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Lỗi đọc dữ liệu chi tiết của file cần tìm: "
            r0.append(r1)
            java.lang.String r13 = r13.getMessage()
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            java.lang.String r0 = "DataDeviceController"
            ad.d.c(r0, r13)
        L_0x016e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cj.a.m(java.io.File):void");
    }

    public final void n(ti.a aVar) {
        if (!this.f16549h.equals("Music")) {
            if (this.f16549h.equals("Video")) {
                if (aVar.f().equals(this.f16545d)) {
                    if (this.f16553l.size() > 0) {
                        Iterator<g0> it = this.f16553l.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            g0 next = it.next();
                            if (aVar.a().equals(next.b()) && aVar.c().equals(next.c())) {
                                break;
                            }
                        }
                    } else {
                        new j0().d(new g0(aVar.a(), aVar.c()), this.f16547f);
                    }
                    aVar.m(true);
                } else {
                    return;
                }
            } else if (this.f16552k.size() == 0 && this.f16553l.size() == 0) {
                aVar.m(true);
                if (aVar.f().equals(this.f16542a)) {
                    new p().d(new m(aVar.a(), aVar.c()), this.f16547f);
                } else {
                    new j0().d(new g0(aVar.a(), aVar.c()), this.f16547f);
                }
                this.f16561t = true;
            } else {
                if (aVar.f().equals(this.f16542a)) {
                    if (this.f16552k.size() > 0) {
                        Iterator<m> it2 = this.f16552k.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            m next2 = it2.next();
                            if (aVar.a().equals(next2.b()) && aVar.c().equals(next2.c())) {
                                break;
                            }
                        }
                    }
                } else if (this.f16553l.size() > 0) {
                    Iterator<g0> it3 = this.f16553l.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        g0 next3 = it3.next();
                        if (aVar.a().equals(next3.b()) && aVar.c().equals(next3.c())) {
                            aVar.m(true);
                            break;
                        }
                    }
                }
                this.f16554m.add(aVar);
            }
            this.f16560s = true;
            this.f16554m.add(aVar);
        } else if (!aVar.f().equals(this.f16542a)) {
            return;
        } else {
            if (this.f16552k.size() > 0) {
                Iterator<m> it4 = this.f16552k.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    m next4 = it4.next();
                    if (aVar.a().equals(next4.b()) && aVar.c().equals(next4.c())) {
                        break;
                    }
                }
            } else {
                new p().d(new m(aVar.a(), aVar.c()), this.f16547f);
            }
        }
        aVar.m(true);
        this.f16561t = true;
        this.f16554m.add(aVar);
    }

    public final void o() {
        try {
            this.f16552k.clear();
            this.f16553l.clear();
            this.f16552k.addAll(new p().c(this.f16547f));
            this.f16553l.addAll(new j0().c(this.f16547f));
        } catch (Exception e10) {
            ad.d.c(f16540y, "Lỗi dọc dữ liệu nhạc và video trong cache: " + e10.getMessage());
        }
    }

    public ArrayList<ti.a> p() {
        return this.f16554m;
    }

    public final void q(String str) {
        this.f16548g = str;
        if (this.f16563v != null) {
            this.f16563v = null;
        } else {
            this.f16562u = true;
        }
        qc.c cVar = new qc.c();
        this.f16563v = cVar;
        cVar.c(new C0273a(str), new b());
    }

    public void s() {
        this.f16562u = false;
        this.f16551j.clear();
        this.f16546e.clear();
        this.f16550i = 0;
        this.f16549h = i.r(this.f16547f).d0();
        o();
        try {
            File[] k10 = i0.d.k(this.f16547f, (String) null);
            Pattern compile = Pattern.compile("\\/storage\\/[\\d\\w-]+\\/");
            if (k10 != null) {
                if (k10.length > 1) {
                    for (int i10 = 1; i10 < k10.length; i10++) {
                        File file = k10[i10];
                        if (file != null) {
                            Matcher matcher = compile.matcher(file.getAbsolutePath());
                            if (matcher.find()) {
                                this.f16546e.add(matcher.group());
                            }
                        }
                    }
                }
            }
        } catch (Exception e10) {
            ad.d.c(f16540y, "Lỗi lấy đường  dẫn usb: " + e10.getMessage());
        }
        try {
            List<String> list = this.f16546e;
            list.add(Environment.getExternalStorageDirectory().getPath() + "/");
            q(this.f16546e.get(this.f16550i));
        } catch (Exception e11) {
            ad.d.c(f16540y, "Lỗi lấy được được dẫn bộ nhớ trong: " + e11.getMessage());
        }
    }

    public ArrayList<ti.a> t() {
        return this.f16555n;
    }

    public final void u(File file) {
        if (file != null) {
            try {
                File[] listFiles = file.listFiles();
                if (listFiles != null && listFiles.length > 0) {
                    int length = listFiles.length;
                    int i10 = 0;
                    while (i10 < length) {
                        File file2 = listFiles[i10];
                        if (this.f16562u) {
                            if (file2.isDirectory()) {
                                this.f16558q = file2.getName();
                                u(file2);
                            } else {
                                m(file2);
                            }
                            i10++;
                        } else {
                            return;
                        }
                    }
                }
            } catch (Exception e10) {
                ad.d.c(f16540y, "Lỗi đọc cá file rỗng: " + e10.getMessage());
            }
        }
    }

    public void v() {
        this.f16555n.clear();
        if (this.f16547f != null) {
            o();
        }
        Iterator<ti.a> it = this.f16551j.iterator();
        while (it.hasNext()) {
            ti.a next = it.next();
            if (this.f16562u) {
                if (this.f16549h.equals("Music")) {
                    if (!next.f().equals(this.f16542a)) {
                        continue;
                    } else if (this.f16552k.size() > 0) {
                        Iterator<m> it2 = this.f16552k.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                continue;
                                break;
                            }
                            m next2 = it2.next();
                            if (this.f16562u) {
                                if (next.a().equals(next2.b()) && next.c().equals(next2.c())) {
                                    break;
                                }
                            } else {
                                return;
                            }
                        }
                    }
                } else if (this.f16549h.equals("Video")) {
                    if (!next.f().equals(this.f16545d)) {
                        continue;
                    } else if (this.f16553l.size() > 0) {
                        Iterator<g0> it3 = this.f16553l.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                continue;
                                break;
                            }
                            g0 next3 = it3.next();
                            if (this.f16562u) {
                                if (next.a().equals(next3.b()) && next.c().equals(next3.c())) {
                                    break;
                                }
                            } else {
                                return;
                            }
                        }
                    }
                } else if (this.f16552k.size() != 0 || this.f16553l.size() != 0) {
                    if (!next.f().equals(this.f16542a)) {
                        Iterator<g0> it4 = this.f16553l.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                continue;
                                break;
                            }
                            g0 next4 = it4.next();
                            if (this.f16562u) {
                                if (next.a().equals(next4.b()) && next.c().equals(next4.c())) {
                                    break;
                                }
                            } else {
                                return;
                            }
                        }
                    } else {
                        Iterator<m> it5 = this.f16552k.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                continue;
                                break;
                            }
                            m next5 = it5.next();
                            if (this.f16562u) {
                                if (next.a().equals(next5.b()) && next.c().equals(next5.c())) {
                                    break;
                                }
                            } else {
                                return;
                            }
                        }
                    }
                }
                this.f16555n.add(next);
            } else {
                return;
            }
        }
        c cVar = this.f16556o;
        if (cVar != null) {
            cVar.b(this.f16555n);
        }
    }

    public void w() {
        this.f16561t = false;
        this.f16560s = false;
        Context context = this.f16547f;
        if (context != null) {
            this.f16549h = i.r(context).d0();
            o();
        }
        this.f16554m.clear();
        if (this.f16551j.size() > 0) {
            Iterator<ti.a> it = this.f16551j.iterator();
            String str = "";
            String str2 = str;
            while (it.hasNext()) {
                ti.a next = it.next();
                if (this.f16562u) {
                    if (!next.a().equals(str)) {
                        str = next.a();
                    } else if (next.c().equals(str2)) {
                    }
                    str2 = next.c();
                    n(next);
                } else {
                    return;
                }
            }
        }
        d dVar = this.f16557p;
        if (dVar != null) {
            dVar.j(this.f16554m);
        }
        if (!this.f16561t) {
            new p().a(this.f16547f);
        }
        if (!this.f16560s) {
            new j0().a(this.f16547f);
        }
    }

    public void x(c cVar) {
        this.f16556o = cVar;
    }

    public void y(d dVar) {
        this.f16557p = dVar;
    }
}
