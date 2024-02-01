package ad;

import a6.a0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Environment;
import com.tatv.baseapp.a;
import d.m0;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import jc.f;
import og.e0;
import og.f0;
import og.k0;
import rh.d;
import rh.u;

public class c {

    /* renamed from: j  reason: collision with root package name */
    public static final String f16060j = "LogFile";

    /* renamed from: k  reason: collision with root package name */
    public static SimpleDateFormat f16061k = new SimpleDateFormat(a0.Y, Locale.getDefault());

    /* renamed from: l  reason: collision with root package name */
    public static SimpleDateFormat f16062l = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss", Locale.getDefault());

    /* renamed from: m  reason: collision with root package name */
    public static int f16063m = 7;

    /* renamed from: n  reason: collision with root package name */
    public static c f16064n;

    /* renamed from: a  reason: collision with root package name */
    public final int f16065a = 1000;

    /* renamed from: b  reason: collision with root package name */
    public Context f16066b;

    /* renamed from: c  reason: collision with root package name */
    public mc.a f16067c;

    /* renamed from: d  reason: collision with root package name */
    public String f16068d = "icar";

    /* renamed from: e  reason: collision with root package name */
    public File f16069e;

    /* renamed from: f  reason: collision with root package name */
    public File f16070f;

    /* renamed from: g  reason: collision with root package name */
    public File f16071g;

    /* renamed from: h  reason: collision with root package name */
    public File f16072h;

    /* renamed from: i  reason: collision with root package name */
    public int f16073i = 0;

    public class a implements d<Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ File[] f16074a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ b f16075b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ String f16076c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ String f16077d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ String f16078e;

        public a(File[] fileArr, b bVar, String str, String str2, String str3) {
            this.f16074a = fileArr;
            this.f16075b = bVar;
            this.f16076c = str;
            this.f16077d = str2;
            this.f16078e = str3;
        }

        @SuppressLint({"DefaultLocale"})
        public void a(@m0 rh.b<Object> bVar, @m0 u<Object> uVar) {
            d.a(c.f16060j, "onResponse: " + uVar.b());
            if (uVar.b() == 200) {
                int i10 = c.this.f16073i;
                File[] fileArr = this.f16074a;
                if (i10 == fileArr.length - 1) {
                    this.f16075b.onSuccess();
                    c cVar = c.this;
                    cVar.l(cVar.f16071g);
                    c.this.v();
                    return;
                }
                this.f16075b.b(String.format("Đã gửi thành công: %s", new Object[]{fileArr[i10].getName()}));
                c cVar2 = c.this;
                cVar2.f16073i++;
                cVar2.y(this.f16076c, this.f16077d, this.f16078e, this.f16074a, this.f16075b);
                return;
            }
            this.f16075b.a(String.format("%s (%d)", new Object[]{c.this.f16066b.getString(a.o.text_send_report_failure), Integer.valueOf(uVar.b())}));
        }

        public void b(@m0 rh.b<Object> bVar, @m0 Throwable th2) {
            d.c(c.f16060j, "onFailure: " + th2.getMessage());
            this.f16075b.a(c.this.f16066b.getString(a.o.text_send_report_failure));
        }
    }

    public interface b {
        void a(String str);

        void b(String str);

        void onSuccess();
    }

    public static c n() {
        if (f16064n == null) {
            f16064n = new c();
        }
        return f16064n;
    }

    public void f(String str) {
        if (t()) {
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(m(), true));
                bufferedWriter.append(str);
                bufferedWriter.newLine();
                bufferedWriter.close();
            } catch (IOException e10) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("addLog: ");
                sb2.append(e10.getMessage());
            }
        }
    }

    public <T> void g(T t10) {
        if (u()) {
            if (this.f16072h == null) {
                this.f16072h = new File(String.format("%s/%s_data.json", new Object[]{q(), f16062l.format(new Date())}));
            }
            if (!this.f16072h.exists()) {
                try {
                    this.f16072h.createNewFile();
                } catch (IOException e10) {
                    e10.getMessage();
                }
            }
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(this.f16072h, true));
                bufferedWriter.append(xc.a.a(t10));
                bufferedWriter.append(",");
                bufferedWriter.newLine();
                bufferedWriter.close();
            } catch (IOException e11) {
                e11.getMessage();
            }
        }
    }

    public final void h() {
        File[] listFiles;
        if (u() && (listFiles = q().listFiles()) != null && listFiles.length > 0) {
            x(listFiles);
            for (File file : listFiles) {
                String name = file.getName();
                if ((name.endsWith("_logcat.log") || name.endsWith(".json")) && (System.currentTimeMillis() - file.lastModified()) / 86400000 > ((long) f16063m)) {
                    try {
                        file.delete();
                        if (file.exists()) {
                            file.getCanonicalFile().delete();
                            if (file.exists()) {
                                this.f16066b.deleteFile(file.getName());
                            }
                        }
                    } catch (IOException e10) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("clearFilesPeriodically: ");
                        sb2.append(e10.getMessage());
                    }
                }
            }
        }
    }

    public final void i() {
        for (File file : q().listFiles()) {
            if (file.getName().endsWith("_logcat.log") && file.exists()) {
                file.delete();
            }
        }
    }

    public final boolean j() {
        if (fd.d.b() > 5120.0d) {
            try {
                if (!this.f16071g.exists()) {
                    this.f16071g.mkdir();
                }
                File[] listFiles = q().listFiles();
                if (listFiles != null) {
                    for (File file : listFiles) {
                        if (file.getName().endsWith("_logcat.log") && !file.getName().startsWith(".")) {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            ZipOutputStream zipOutputStream = new ZipOutputStream(byteArrayOutputStream);
                            byte[] bArr = new byte[2048];
                            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file), 2048);
                            zipOutputStream.putNextEntry(new ZipEntry(file.getName()));
                            while (true) {
                                int read = bufferedInputStream.read(bArr, 0, 2048);
                                if (read == -1) {
                                    break;
                                }
                                zipOutputStream.write(bArr, 0, read);
                            }
                            bufferedInputStream.close();
                            zipOutputStream.closeEntry();
                            zipOutputStream.close();
                            FileOutputStream fileOutputStream = new FileOutputStream(new File(String.format("%s/%s/report/%s.zip", new Object[]{Environment.getExternalStorageDirectory().getAbsolutePath(), this.f16068d, Long.valueOf(System.currentTimeMillis())})));
                            byteArrayOutputStream.writeTo(fileOutputStream);
                            fileOutputStream.flush();
                            fileOutputStream.close();
                        }
                    }
                    return true;
                }
            } catch (IOException e10) {
                e10.toString();
            }
        }
        return false;
    }

    public final boolean k() {
        File[] listFiles;
        if (u() && (listFiles = q().listFiles()) != null && listFiles.length > 0) {
            x(listFiles);
            for (File file : listFiles) {
                if (file.getName().endsWith("_logcat.log")) {
                    file.delete();
                    return true;
                }
            }
        }
        return false;
    }

    public final void l(File file) {
        if (file.isDirectory()) {
            for (File l10 : file.listFiles()) {
                l(l10);
            }
        }
        file.delete();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0053 A[SYNTHETIC, Splitter:B:9:0x0053] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.File m() {
        /*
            r8 = this;
            java.io.File r0 = r8.q()
            java.io.File r1 = r8.f16069e
            r2 = 1
            r3 = 0
            r4 = 2
            java.lang.String r5 = "%s/%s_logcat.log"
            if (r1 != 0) goto L_0x002a
            java.io.File r1 = new java.io.File
            java.lang.Object[] r6 = new java.lang.Object[r4]
            r6[r3] = r0
            java.text.SimpleDateFormat r0 = f16062l
            java.util.Date r7 = new java.util.Date
            r7.<init>()
            java.lang.String r0 = r0.format(r7)
            r6[r2] = r0
            java.lang.String r0 = java.lang.String.format(r5, r6)
            r1.<init>(r0)
        L_0x0027:
            r8.f16069e = r1
            goto L_0x004b
        L_0x002a:
            boolean r1 = r1.exists()
            if (r1 != 0) goto L_0x004b
            java.io.File r1 = new java.io.File
            java.lang.Object[] r6 = new java.lang.Object[r4]
            r6[r3] = r0
            java.text.SimpleDateFormat r0 = f16062l
            java.util.Date r7 = new java.util.Date
            r7.<init>()
            java.lang.String r0 = r0.format(r7)
            r6[r2] = r0
            java.lang.String r0 = java.lang.String.format(r5, r6)
            r1.<init>(r0)
            goto L_0x0027
        L_0x004b:
            java.io.File r0 = r8.f16069e
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x005d
            java.io.File r0 = r8.f16069e     // Catch:{ IOException -> 0x0059 }
            r0.createNewFile()     // Catch:{ IOException -> 0x0059 }
            goto L_0x005d
        L_0x0059:
            r0 = move-exception
            r0.getMessage()
        L_0x005d:
            java.io.File r0 = r8.f16069e
            double r0 = fd.d.a(r0)
            r6 = 4652007308841189376(0x408f400000000000, double:1000.0)
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x008c
            java.io.File r0 = new java.io.File
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.io.File r4 = r8.q()
            r1[r3] = r4
            java.text.SimpleDateFormat r3 = f16062l
            java.util.Date r4 = new java.util.Date
            r4.<init>()
            java.lang.String r3 = r3.format(r4)
            r1[r2] = r3
            java.lang.String r1 = java.lang.String.format(r5, r1)
            r0.<init>(r1)
            r8.f16069e = r0
        L_0x008c:
            java.io.File r0 = r8.f16069e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ad.c.m():java.io.File");
    }

    public <T> List<T> o(String str, Class<T> cls) {
        ArrayList arrayList = new ArrayList();
        if (u()) {
            File file = new File(String.format("%s/%s", new Object[]{q(), str}));
            if (file.exists()) {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        if (readLine.length() > 0) {
                            while (readLine.endsWith(",")) {
                                readLine = readLine.substring(0, readLine.length() - 1);
                            }
                        }
                        arrayList.add(xc.a.c(readLine, cls));
                    }
                } catch (IOException e10) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("getLogJson: ");
                    sb2.append(e10.getMessage());
                }
            }
        }
        return arrayList;
    }

    public final int p() {
        File[] listFiles;
        if (!u() || (listFiles = q().listFiles()) == null) {
            return -1;
        }
        return listFiles.length;
    }

    public final File q() {
        if (this.f16070f == null) {
            this.f16070f = new File(String.format("%s/%s/", new Object[]{Environment.getExternalStorageDirectory().getAbsolutePath(), this.f16068d}));
        }
        if (!this.f16070f.exists()) {
            this.f16070f.mkdirs();
        }
        return this.f16070f;
    }

    public void r(Context context) {
        this.f16066b = context;
        this.f16067c = new mc.a(context);
        this.f16071g = new File(String.format("%s/%s/%s", new Object[]{Environment.getExternalStorageDirectory().getAbsolutePath(), this.f16068d, "/report"}));
        h();
        q();
    }

    public void s(Context context, String str) {
        this.f16068d = str;
        r(context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:2:0x0007 A[LOOP:0: B:2:0x0007->B:7:0x001c, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean t() {
        /*
            r6 = this;
            boolean r0 = r6.u()
            r1 = 0
            if (r0 == 0) goto L_0x0028
        L_0x0007:
            double r2 = fd.d.b()
            r4 = 4652218415073722368(0x4090000000000000, double:1024.0)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x001e
            int r0 = r6.p()
            r2 = 3
            if (r0 < r2) goto L_0x001e
            boolean r0 = r6.k()
            if (r0 != 0) goto L_0x0007
        L_0x001e:
            double r2 = fd.d.b()
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0028
            r0 = 1
            return r0
        L_0x0028:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ad.c.t():boolean");
    }

    public final boolean u() {
        Context context = this.f16066b;
        return context != null && i0.d.a(context, "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    public final void v() {
        for (File file : q().listFiles()) {
            if (file.getName().endsWith("_logcat.log") && !file.getName().startsWith(".")) {
                file.renameTo(new File(q(), "." + file.getName()));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a4, code lost:
        return;
     */
    @android.annotation.SuppressLint({"DefaultLocale"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void w(java.lang.String r10, java.lang.String r11, java.lang.String r12, ad.c.b r13) {
        /*
            r9 = this;
            monitor-enter(r9)
            boolean r0 = r9.u()     // Catch:{ all -> 0x00a5 }
            if (r0 == 0) goto L_0x009a
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00a5 }
            mc.a r2 = r9.f16067c     // Catch:{ all -> 0x00a5 }
            long r2 = r2.d()     // Catch:{ all -> 0x00a5 }
            long r0 = r0 - r2
            r2 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            r2 = 0
            if (r0 >= 0) goto L_0x0046
            android.content.Context r10 = r9.f16066b     // Catch:{ all -> 0x00a5 }
            int r11 = com.tatv.baseapp.a.o.text_duplicate_report     // Catch:{ all -> 0x00a5 }
            java.lang.String r10 = r10.getString(r11)     // Catch:{ all -> 0x00a5 }
            java.lang.Object[] r11 = new java.lang.Object[r1]     // Catch:{ all -> 0x00a5 }
            r0 = 60
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00a5 }
            mc.a r12 = r9.f16067c     // Catch:{ all -> 0x00a5 }
            long r5 = r12.d()     // Catch:{ all -> 0x00a5 }
            long r3 = r3 - r5
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r5
            long r0 = r0 - r3
            int r12 = (int) r0     // Catch:{ all -> 0x00a5 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x00a5 }
            r11[r2] = r12     // Catch:{ all -> 0x00a5 }
            java.lang.String r10 = java.lang.String.format(r10, r11)     // Catch:{ all -> 0x00a5 }
            r13.a(r10)     // Catch:{ all -> 0x00a5 }
            monitor-exit(r9)
            return
        L_0x0046:
            android.content.Context r0 = r9.f16066b     // Catch:{ all -> 0x00a5 }
            int r3 = com.tatv.baseapp.a.o.text_compressing_data     // Catch:{ all -> 0x00a5 }
            java.lang.String r0 = r0.getString(r3)     // Catch:{ all -> 0x00a5 }
            r13.b(r0)     // Catch:{ all -> 0x00a5 }
            boolean r0 = r9.j()     // Catch:{ all -> 0x00a5 }
            if (r0 == 0) goto L_0x0087
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x00a5 }
            java.lang.String r3 = "%s/%s/%s"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x00a5 }
            java.io.File r5 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ all -> 0x00a5 }
            java.lang.String r5 = r5.getAbsolutePath()     // Catch:{ all -> 0x00a5 }
            r4[r2] = r5     // Catch:{ all -> 0x00a5 }
            java.lang.String r5 = r9.f16068d     // Catch:{ all -> 0x00a5 }
            r4[r1] = r5     // Catch:{ all -> 0x00a5 }
            r1 = 2
            java.lang.String r5 = "/report"
            r4[r1] = r5     // Catch:{ all -> 0x00a5 }
            java.lang.String r1 = java.lang.String.format(r3, r4)     // Catch:{ all -> 0x00a5 }
            r0.<init>(r1)     // Catch:{ all -> 0x00a5 }
            java.io.File[] r7 = r0.listFiles()     // Catch:{ all -> 0x00a5 }
            r9.f16073i = r2     // Catch:{ all -> 0x00a5 }
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r8 = r13
            r3.y(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x00a5 }
            goto L_0x00a3
        L_0x0087:
            java.lang.String r10 = "LogFile"
            java.lang.String r11 = "Không tạo được file zip report"
            ad.d.c(r10, r11)     // Catch:{ all -> 0x00a5 }
            android.content.Context r10 = r9.f16066b     // Catch:{ all -> 0x00a5 }
            int r11 = com.tatv.baseapp.a.o.text_create_report_error     // Catch:{ all -> 0x00a5 }
            java.lang.String r10 = r10.getString(r11)     // Catch:{ all -> 0x00a5 }
        L_0x0096:
            r13.a(r10)     // Catch:{ all -> 0x00a5 }
            goto L_0x00a3
        L_0x009a:
            android.content.Context r10 = r9.f16066b     // Catch:{ all -> 0x00a5 }
            int r11 = com.tatv.baseapp.a.o.text_create_report_error     // Catch:{ all -> 0x00a5 }
            java.lang.String r10 = r10.getString(r11)     // Catch:{ all -> 0x00a5 }
            goto L_0x0096
        L_0x00a3:
            monitor-exit(r9)
            return
        L_0x00a5:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ad.c.w(java.lang.String, java.lang.String, java.lang.String, ad.c$b):void");
    }

    public final void x(File[] fileArr) {
        int i10 = 0;
        while (i10 < fileArr.length - 1) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < fileArr.length; i12++) {
                if (fileArr[i10].lastModified() < fileArr[i12].lastModified()) {
                    File file = fileArr[i12];
                    fileArr[i12] = fileArr[i10];
                    fileArr[i10] = file;
                }
            }
            i10 = i11;
        }
    }

    public final void y(String str, String str2, String str3, File[] fileArr, b bVar) {
        if (fileArr.length > 0) {
            ((jc.d) jc.b.b(this.f16066b, f.f19922a, jc.d.class)).e(str, str2, str3, f0.b.e("file", fileArr[this.f16073i].getName(), k0.d(e0.d(hh.c.f19574g), fileArr[this.f16073i]))).l(new a(fileArr, bVar, str, str2, str3));
            return;
        }
        bVar.a(this.f16066b.getString(a.o.text_report_file_empty));
    }
}
