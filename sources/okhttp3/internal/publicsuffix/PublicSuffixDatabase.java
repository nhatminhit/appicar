package okhttp3.internal.publicsuffix;

import i7.a;
import java.net.IDN;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

public final class PublicSuffixDatabase {

    /* renamed from: e  reason: collision with root package name */
    public static final String f21825e = "publicsuffixes.gz";

    /* renamed from: f  reason: collision with root package name */
    public static final byte[] f21826f = {42};

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f21827g = new String[0];

    /* renamed from: h  reason: collision with root package name */
    public static final String[] f21828h = {"*"};

    /* renamed from: i  reason: collision with root package name */
    public static final byte f21829i = 33;

    /* renamed from: j  reason: collision with root package name */
    public static final PublicSuffixDatabase f21830j = new PublicSuffixDatabase();

    /* renamed from: a  reason: collision with root package name */
    public final AtomicBoolean f21831a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public final CountDownLatch f21832b = new CountDownLatch(1);

    /* renamed from: c  reason: collision with root package name */
    public byte[] f21833c;

    /* renamed from: d  reason: collision with root package name */
    public byte[] f21834d;

    public static String a(byte[] bArr, byte[][] bArr2, int i10) {
        int i11;
        boolean z10;
        byte b10;
        int i12;
        byte[] bArr3 = bArr;
        byte[][] bArr4 = bArr2;
        int length = bArr3.length;
        int i13 = 0;
        while (i13 < length) {
            int i14 = (i13 + length) / 2;
            while (i14 > -1 && bArr3[i14] != 10) {
                i14--;
            }
            int i15 = i14 + 1;
            int i16 = 1;
            while (true) {
                i11 = i15 + i16;
                if (bArr3[i11] == 10) {
                    break;
                }
                i16++;
            }
            int i17 = i11 - i15;
            int i18 = i10;
            boolean z11 = false;
            int i19 = 0;
            int i20 = 0;
            while (true) {
                if (z11) {
                    b10 = a.f9187c0;
                    z10 = false;
                } else {
                    z10 = z11;
                    b10 = bArr4[i18][i19] & 255;
                }
                i12 = b10 - (bArr3[i15 + i20] & 255);
                if (i12 == 0) {
                    i20++;
                    i19++;
                    if (i20 == i17) {
                        break;
                    } else if (bArr4[i18].length != i19) {
                        z11 = z10;
                    } else if (i18 == bArr4.length - 1) {
                        break;
                    } else {
                        i18++;
                        i19 = -1;
                        z11 = true;
                    }
                } else {
                    break;
                }
            }
            if (i12 >= 0) {
                if (i12 <= 0) {
                    int i21 = i17 - i20;
                    int length2 = bArr4[i18].length - i19;
                    while (true) {
                        i18++;
                        if (i18 >= bArr4.length) {
                            break;
                        }
                        length2 += bArr4[i18].length;
                    }
                    if (length2 >= i21) {
                        if (length2 <= i21) {
                            return new String(bArr3, i15, i17, StandardCharsets.UTF_8);
                        }
                    }
                }
                i13 = i11 + 1;
            }
            length = i15 - 1;
        }
        return null;
    }

    public static PublicSuffixDatabase c() {
        return f21830j;
    }

    public final String[] b(String[] strArr) {
        String str;
        String str2;
        String str3;
        int i10 = 0;
        if (this.f21831a.get() || !this.f21831a.compareAndSet(false, true)) {
            try {
                this.f21832b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            f();
        }
        synchronized (this) {
            if (this.f21833c == null) {
                throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
            }
        }
        int length = strArr.length;
        byte[][] bArr = new byte[length][];
        for (int i11 = 0; i11 < strArr.length; i11++) {
            bArr[i11] = strArr[i11].getBytes(StandardCharsets.UTF_8);
        }
        int i12 = 0;
        while (true) {
            str = null;
            if (i12 >= length) {
                str2 = null;
                break;
            }
            str2 = a(this.f21833c, bArr, i12);
            if (str2 != null) {
                break;
            }
            i12++;
        }
        if (length > 1) {
            byte[][] bArr2 = (byte[][]) bArr.clone();
            int i13 = 0;
            while (true) {
                if (i13 >= bArr2.length - 1) {
                    break;
                }
                bArr2[i13] = f21826f;
                str3 = a(this.f21833c, bArr2, i13);
                if (str3 != null) {
                    break;
                }
                i13++;
            }
        }
        str3 = null;
        if (str3 != null) {
            while (true) {
                if (i10 >= length - 1) {
                    break;
                }
                String a10 = a(this.f21834d, bArr, i10);
                if (a10 != null) {
                    str = a10;
                    break;
                }
                i10++;
            }
        }
        if (str != null) {
            return ("!" + str).split("\\.");
        } else if (str2 == null && str3 == null) {
            return f21828h;
        } else {
            String[] split = str2 != null ? str2.split("\\.") : f21827g;
            String[] split2 = str3 != null ? str3.split("\\.") : f21827g;
            return split.length > split2.length ? split : split2;
        }
    }

    public String d(String str) {
        if (str != null) {
            String[] split = IDN.toUnicode(str).split("\\.");
            String[] b10 = b(split);
            if (split.length == b10.length && b10[0].charAt(0) != '!') {
                return null;
            }
            char charAt = b10[0].charAt(0);
            int length = split.length;
            int length2 = b10.length;
            if (charAt != '!') {
                length2++;
            }
            StringBuilder sb2 = new StringBuilder();
            String[] split2 = str.split("\\.");
            for (int i10 = length - length2; i10 < split2.length; i10++) {
                sb2.append(split2[i10]);
                sb2.append('.');
            }
            sb2.deleteCharAt(sb2.length() - 1);
            return sb2.toString();
        }
        throw new NullPointerException("domain == null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003e, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        if (r0 != null) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0045, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0046, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0049, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e() throws java.io.IOException {
        /*
            r3 = this;
            java.lang.Class<okhttp3.internal.publicsuffix.PublicSuffixDatabase> r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.class
            java.lang.String r1 = "publicsuffixes.gz"
            java.io.InputStream r0 = r0.getResourceAsStream(r1)
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            ch.l r1 = new ch.l
            ch.a0 r0 = ch.p.l(r0)
            r1.<init>(r0)
            ch.e r0 = ch.p.d(r1)
            int r1 = r0.readInt()     // Catch:{ all -> 0x003c }
            byte[] r1 = new byte[r1]     // Catch:{ all -> 0x003c }
            r0.readFully(r1)     // Catch:{ all -> 0x003c }
            int r2 = r0.readInt()     // Catch:{ all -> 0x003c }
            byte[] r2 = new byte[r2]     // Catch:{ all -> 0x003c }
            r0.readFully(r2)     // Catch:{ all -> 0x003c }
            r0.close()
            monitor-enter(r3)
            r3.f21833c = r1     // Catch:{ all -> 0x0039 }
            r3.f21834d = r2     // Catch:{ all -> 0x0039 }
            monitor-exit(r3)     // Catch:{ all -> 0x0039 }
            java.util.concurrent.CountDownLatch r0 = r3.f21832b
            r0.countDown()
            return
        L_0x0039:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0039 }
            throw r0
        L_0x003c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003e }
        L_0x003e:
            r2 = move-exception
            if (r0 == 0) goto L_0x0049
            r0.close()     // Catch:{ all -> 0x0045 }
            goto L_0x0049
        L_0x0045:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x0049:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.e():void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0025 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f() {
        /*
            r5 = this;
            r0 = 0
        L_0x0001:
            r5.e()     // Catch:{ InterruptedIOException -> 0x0025, IOException -> 0x0010 }
            if (r0 == 0) goto L_0x000d
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x000d:
            return
        L_0x000e:
            r1 = move-exception
            goto L_0x002a
        L_0x0010:
            r1 = move-exception
            yg.h r2 = yg.h.m()     // Catch:{ all -> 0x000e }
            r3 = 5
            java.lang.String r4 = "Failed to read public suffix list"
            r2.u(r3, r4, r1)     // Catch:{ all -> 0x000e }
            if (r0 == 0) goto L_0x0024
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0024:
            return
        L_0x0025:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x000e }
            r0 = 1
            goto L_0x0001
        L_0x002a:
            if (r0 == 0) goto L_0x0033
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0033:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.f():void");
    }

    public void g(byte[] bArr, byte[] bArr2) {
        this.f21833c = bArr;
        this.f21834d = bArr2;
        this.f21831a.set(true);
        this.f21832b.countDown();
    }
}
