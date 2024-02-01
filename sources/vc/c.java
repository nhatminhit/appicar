package vc;

import ad.d;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.provider.Settings;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class c {

    /* renamed from: e  reason: collision with root package name */
    public static final String f23621e = "DeviceUtils";

    /* renamed from: f  reason: collision with root package name */
    public static c f23622f;

    /* renamed from: a  reason: collision with root package name */
    public Context f23623a;

    /* renamed from: b  reason: collision with root package name */
    public final List<a> f23624b;

    /* renamed from: c  reason: collision with root package name */
    public File f23625c;

    /* renamed from: d  reason: collision with root package name */
    public File f23626d;

    public c() {
        ArrayList arrayList = new ArrayList();
        this.f23624b = arrayList;
        arrayList.addAll(h());
    }

    public static c g() {
        if (f23622f == null) {
            f23622f = new c();
        }
        return f23622f;
    }

    @SuppressLint({"HardwareIds"})
    public String a() {
        return Settings.Secure.getString(this.f23623a.getContentResolver(), "android_id");
    }

    public String b() {
        long time = new Date().getTime();
        Random random = new Random();
        int nextInt = random.nextInt(26);
        int nextInt2 = random.nextInt(999999999);
        char[] charArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        return "" + charArray[nextInt] + nextInt + nextInt2 + time;
    }

    public String c(String str) {
        long time = new Date().getTime();
        Random random = new Random();
        int nextInt = random.nextInt(26);
        int nextInt2 = random.nextInt(999999999);
        char[] charArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        return str + charArray[nextInt] + nextInt + nextInt2 + time;
    }

    public a d() {
        List<a> e10 = e();
        if (e10.size() <= 0) {
            return null;
        }
        for (int i10 = 0; i10 < e10.size(); i10++) {
            if (e10.get(i10).c()) {
                return e10.get(i10);
            }
        }
        return null;
    }

    public List<a> e() {
        String str;
        if (l()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(f())));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    } else if (readLine.length() > 0) {
                        String[] split = readLine.split(",");
                        if (split.length == 3) {
                            try {
                                a aVar = new a(Integer.parseInt(split[0]), split[1], Boolean.parseBoolean(split[2]));
                                for (int i10 = 0; i10 < this.f23624b.size(); i10++) {
                                    if (this.f23624b.get(i10).a() == aVar.a()) {
                                        this.f23624b.get(i10).f(aVar.c());
                                    }
                                }
                            } catch (Exception e10) {
                                d.c(f23621e, "getDevices: " + e10.getMessage());
                            }
                        }
                    }
                }
            } catch (IOException e11) {
                str = "getDevices: " + e11.getMessage();
            }
        } else {
            str = "getDevices: permission denied";
            d.c(f23621e, str);
        }
        return this.f23624b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x003f A[SYNTHETIC, Splitter:B:9:0x003f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.File f() {
        /*
            r7 = this;
            java.io.File r0 = r7.j()
            java.io.File r1 = r7.f23626d
            java.lang.String r2 = ".device.icv"
            r3 = 1
            r4 = 0
            r5 = 2
            java.lang.String r6 = "%s/%s"
            if (r1 != 0) goto L_0x0021
            java.io.File r1 = new java.io.File
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r4] = r0
            r5[r3] = r2
            java.lang.String r0 = java.lang.String.format(r6, r5)
            r1.<init>(r0)
        L_0x001e:
            r7.f23626d = r1
            goto L_0x0037
        L_0x0021:
            boolean r1 = r1.exists()
            if (r1 != 0) goto L_0x0037
            java.io.File r1 = new java.io.File
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r4] = r0
            r5[r3] = r2
            java.lang.String r0 = java.lang.String.format(r6, r5)
            r1.<init>(r0)
            goto L_0x001e
        L_0x0037:
            java.io.File r0 = r7.f23626d
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x0049
            java.io.File r0 = r7.f23626d     // Catch:{ IOException -> 0x0045 }
            r0.createNewFile()     // Catch:{ IOException -> 0x0045 }
            goto L_0x0049
        L_0x0045:
            r0 = move-exception
            r0.getMessage()
        L_0x0049:
            java.io.File r0 = r7.f23626d
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vc.c.f():java.io.File");
    }

    public final List<a> h() {
        return Arrays.asList(new a[]{new a(0, "OWNICE C970", false), new a(1, "OWNICE C970 (+360)", false), new a(2, "OWNICE C960", false), new a(3, "OWNICE C800", false), new a(4, "OWNICE C500+", false), new a(5, "ELLIVIEW S4", true), new a(6, "ELLIVIEW U4", false), new a(7, "ELLIVIEW S3", false), new a(8, "ELLIVIEW U3", false), new a(9, "ELLIVIEW D4", false), new a(10, "ANDROID BOX", false), new a(11, "MOBILE PHONE", false), new a(12, "ELLIVIEW D5", false), new a(13, "ELLIVIEW DE", false)});
    }

    public String i() {
        return Build.MODEL;
    }

    public final File j() {
        if (this.f23625c == null) {
            this.f23625c = new File(String.format("%s/%s/", new Object[]{Environment.getExternalStorageDirectory().getAbsolutePath(), ".icar"}));
        }
        if (!this.f23625c.exists()) {
            this.f23625c.mkdirs();
        }
        return this.f23625c;
    }

    public void k(Context context) {
        this.f23623a = context;
    }

    public final boolean l() {
        Context context = this.f23623a;
        if (context != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                if (Environment.isExternalStorageManager()) {
                    return true;
                }
            } else if (i0.d.a(context, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                return true;
            }
        }
        return false;
    }

    public void m(int i10) {
        if (l()) {
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(f(), false));
                int i11 = 0;
                while (i11 < this.f23624b.size()) {
                    this.f23624b.get(i11).f(i11 == i10);
                    bufferedWriter.append(String.format("%s,%s,%s", new Object[]{Integer.valueOf(this.f23624b.get(i11).a()), this.f23624b.get(i11).b(), Boolean.valueOf(this.f23624b.get(i11).c())}));
                    bufferedWriter.newLine();
                    i11++;
                }
                bufferedWriter.close();
            } catch (IOException e10) {
                e10.getMessage();
            }
        }
    }

    public void n(String str) {
        if (l()) {
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(f(), false));
                for (int i10 = 0; i10 < this.f23624b.size(); i10++) {
                    this.f23624b.get(i10).f(this.f23624b.get(i10).b().equals(str));
                    bufferedWriter.append(String.format("%s,%s,%s", new Object[]{Integer.valueOf(this.f23624b.get(i10).a()), this.f23624b.get(i10).b(), Boolean.valueOf(this.f23624b.get(i10).c())}));
                    bufferedWriter.newLine();
                }
                bufferedWriter.close();
            } catch (IOException e10) {
                e10.getMessage();
            }
        }
    }
}
