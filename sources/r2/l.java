package r2;

import d.m0;
import d.o0;
import d.t0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Map;
import java.util.TreeMap;

@t0(19)
public class l {

    /* renamed from: a  reason: collision with root package name */
    public static final int f12077a = 1;

    /* renamed from: b  reason: collision with root package name */
    public static final int f12078b = 2;

    /* renamed from: c  reason: collision with root package name */
    public static final int f12079c = 4;

    /* renamed from: d  reason: collision with root package name */
    public static final int f12080d = 6;

    /* renamed from: e  reason: collision with root package name */
    public static final int f12081e = 7;

    /* renamed from: f  reason: collision with root package name */
    public static final byte[] f12082f = {112, 114, 111, 0};

    /* renamed from: g  reason: collision with root package name */
    public static final byte[] f12083g = {112, 114, 109, 0};

    public static void A(@m0 InputStream inputStream) throws IOException {
        c.h(inputStream);
        int j10 = c.j(inputStream);
        if (j10 != 6 && j10 != 7) {
            while (j10 > 0) {
                c.j(inputStream);
                for (int j11 = c.j(inputStream); j11 > 0; j11--) {
                    c.h(inputStream);
                }
                j10--;
            }
        }
    }

    public static boolean B(@m0 OutputStream outputStream, @m0 byte[] bArr, @m0 b[] bVarArr) throws IOException {
        if (Arrays.equals(bArr, m.f12084a)) {
            N(outputStream, bVarArr);
            return true;
        } else if (Arrays.equals(bArr, m.f12085b)) {
            M(outputStream, bVarArr);
            return true;
        } else if (Arrays.equals(bArr, m.f12087d)) {
            K(outputStream, bVarArr);
            return true;
        } else if (Arrays.equals(bArr, m.f12086c)) {
            L(outputStream, bVarArr);
            return true;
        } else if (!Arrays.equals(bArr, m.f12088e)) {
            return false;
        } else {
            J(outputStream, bVarArr);
            return true;
        }
    }

    public static void C(@m0 OutputStream outputStream, @m0 b bVar) throws IOException {
        int i10 = 0;
        for (int valueOf : bVar.f12071h) {
            Integer valueOf2 = Integer.valueOf(valueOf);
            c.p(outputStream, valueOf2.intValue() - i10);
            i10 = valueOf2.intValue();
        }
    }

    public static o D(@m0 b[] bVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            c.p(byteArrayOutputStream, bVarArr.length);
            int i10 = 2;
            for (b bVar : bVarArr) {
                c.q(byteArrayOutputStream, bVar.f12066c);
                c.q(byteArrayOutputStream, bVar.f12067d);
                c.q(byteArrayOutputStream, (long) bVar.f12070g);
                String j10 = j(bVar.f12064a, bVar.f12065b, m.f12084a);
                int k10 = c.k(j10);
                c.p(byteArrayOutputStream, k10);
                i10 = i10 + 4 + 4 + 4 + 2 + (k10 * 1);
                c.n(byteArrayOutputStream, j10);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i10 == byteArray.length) {
                o oVar = new o(d.DEX_FILES, i10, byteArray, false);
                byteArrayOutputStream.close();
                return oVar;
            }
            throw c.c("Expected size " + i10 + ", does not match actual size " + byteArray.length);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    public static void E(@m0 OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(f12082f);
        outputStream.write(bArr);
    }

    public static void F(@m0 OutputStream outputStream, @m0 b bVar) throws IOException {
        I(outputStream, bVar);
        C(outputStream, bVar);
        H(outputStream, bVar);
    }

    public static void G(@m0 OutputStream outputStream, @m0 b bVar, @m0 String str) throws IOException {
        c.p(outputStream, c.k(str));
        c.p(outputStream, bVar.f12068e);
        c.q(outputStream, (long) bVar.f12069f);
        c.q(outputStream, bVar.f12066c);
        c.q(outputStream, (long) bVar.f12070g);
        c.n(outputStream, str);
    }

    public static void H(@m0 OutputStream outputStream, @m0 b bVar) throws IOException {
        byte[] bArr = new byte[k(bVar.f12070g)];
        for (Map.Entry next : bVar.f12072i.entrySet()) {
            int intValue = ((Integer) next.getKey()).intValue();
            int intValue2 = ((Integer) next.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                z(bArr, 2, intValue, bVar);
            }
            if ((intValue2 & 4) != 0) {
                z(bArr, 4, intValue, bVar);
            }
        }
        outputStream.write(bArr);
    }

    public static void I(@m0 OutputStream outputStream, @m0 b bVar) throws IOException {
        int i10 = 0;
        for (Map.Entry next : bVar.f12072i.entrySet()) {
            int intValue = ((Integer) next.getKey()).intValue();
            if ((((Integer) next.getValue()).intValue() & 1) != 0) {
                c.p(outputStream, intValue - i10);
                c.p(outputStream, 0);
                i10 = intValue;
            }
        }
    }

    public static void J(@m0 OutputStream outputStream, @m0 b[] bVarArr) throws IOException {
        c.p(outputStream, bVarArr.length);
        for (b bVar : bVarArr) {
            String j10 = j(bVar.f12064a, bVar.f12065b, m.f12088e);
            c.p(outputStream, c.k(j10));
            c.p(outputStream, bVar.f12072i.size());
            c.p(outputStream, bVar.f12071h.length);
            c.q(outputStream, bVar.f12066c);
            c.n(outputStream, j10);
            for (Integer intValue : bVar.f12072i.keySet()) {
                c.p(outputStream, intValue.intValue());
            }
            for (int p10 : bVar.f12071h) {
                c.p(outputStream, p10);
            }
        }
    }

    public static void K(@m0 OutputStream outputStream, @m0 b[] bVarArr) throws IOException {
        c.r(outputStream, bVarArr.length);
        for (b bVar : bVarArr) {
            String j10 = j(bVar.f12064a, bVar.f12065b, m.f12087d);
            c.p(outputStream, c.k(j10));
            c.p(outputStream, bVar.f12071h.length);
            c.q(outputStream, (long) (bVar.f12072i.size() * 4));
            c.q(outputStream, bVar.f12066c);
            c.n(outputStream, j10);
            for (Integer intValue : bVar.f12072i.keySet()) {
                c.p(outputStream, intValue.intValue());
                c.p(outputStream, 0);
            }
            for (int p10 : bVar.f12071h) {
                c.p(outputStream, p10);
            }
        }
    }

    public static void L(@m0 OutputStream outputStream, @m0 b[] bVarArr) throws IOException {
        byte[] b10 = b(bVarArr, m.f12086c);
        c.r(outputStream, bVarArr.length);
        c.m(outputStream, b10);
    }

    public static void M(@m0 OutputStream outputStream, @m0 b[] bVarArr) throws IOException {
        byte[] b10 = b(bVarArr, m.f12085b);
        c.r(outputStream, bVarArr.length);
        c.m(outputStream, b10);
    }

    public static void N(@m0 OutputStream outputStream, @m0 b[] bVarArr) throws IOException {
        O(outputStream, bVarArr);
    }

    public static void O(@m0 OutputStream outputStream, @m0 b[] bVarArr) throws IOException {
        int i10;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(D(bVarArr));
        arrayList.add(c(bVarArr));
        arrayList.add(d(bVarArr));
        long length = ((long) m.f12084a.length) + ((long) f12082f.length) + 4 + ((long) (arrayList.size() * 16));
        c.q(outputStream, (long) arrayList.size());
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            o oVar = (o) arrayList.get(i11);
            c.q(outputStream, oVar.f12092a.b());
            c.q(outputStream, length);
            if (oVar.f12095d) {
                byte[] bArr = oVar.f12094c;
                byte[] b10 = c.b(bArr);
                arrayList2.add(b10);
                c.q(outputStream, (long) b10.length);
                c.q(outputStream, (long) bArr.length);
                i10 = b10.length;
            } else {
                arrayList2.add(oVar.f12094c);
                c.q(outputStream, (long) oVar.f12094c.length);
                c.q(outputStream, 0);
                i10 = oVar.f12094c.length;
            }
            length += (long) i10;
        }
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            outputStream.write((byte[]) arrayList2.get(i12));
        }
    }

    public static int a(@m0 b bVar) {
        int i10 = 0;
        for (Map.Entry<Integer, Integer> value : bVar.f12072i.entrySet()) {
            i10 |= ((Integer) value.getValue()).intValue();
        }
        return i10;
    }

    @m0
    public static byte[] b(@m0 b[] bVarArr, @m0 byte[] bArr) throws IOException {
        int i10 = 0;
        int i11 = 0;
        for (b bVar : bVarArr) {
            i11 += c.k(j(bVar.f12064a, bVar.f12065b, bArr)) + 16 + (bVar.f12068e * 2) + bVar.f12069f + k(bVar.f12070g);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i11);
        if (Arrays.equals(bArr, m.f12086c)) {
            int length = bVarArr.length;
            while (i10 < length) {
                b bVar2 = bVarArr[i10];
                G(byteArrayOutputStream, bVar2, j(bVar2.f12064a, bVar2.f12065b, bArr));
                F(byteArrayOutputStream, bVar2);
                i10++;
            }
        } else {
            for (b bVar3 : bVarArr) {
                G(byteArrayOutputStream, bVar3, j(bVar3.f12064a, bVar3.f12065b, bArr));
            }
            int length2 = bVarArr.length;
            while (i10 < length2) {
                F(byteArrayOutputStream, bVarArr[i10]);
                i10++;
            }
        }
        if (byteArrayOutputStream.size() == i11) {
            return byteArrayOutputStream.toByteArray();
        }
        throw c.c("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i11);
    }

    public static o c(@m0 b[] bVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        int i11 = 0;
        while (i10 < bVarArr.length) {
            try {
                b bVar = bVarArr[i10];
                c.p(byteArrayOutputStream, i10);
                c.p(byteArrayOutputStream, bVar.f12068e);
                i11 = i11 + 2 + 2 + (bVar.f12068e * 2);
                C(byteArrayOutputStream, bVar);
                i10++;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i11 == byteArray.length) {
            o oVar = new o(d.CLASSES, i11, byteArray, true);
            byteArrayOutputStream.close();
            return oVar;
        }
        throw c.c("Expected size " + i11 + ", does not match actual size " + byteArray.length);
        throw th;
    }

    public static o d(@m0 b[] bVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        int i11 = 0;
        while (i10 < bVarArr.length) {
            try {
                b bVar = bVarArr[i10];
                int a10 = a(bVar);
                byte[] e10 = e(bVar);
                byte[] f10 = f(bVar);
                c.p(byteArrayOutputStream, i10);
                int length = e10.length + 2 + f10.length;
                c.q(byteArrayOutputStream, (long) length);
                c.p(byteArrayOutputStream, a10);
                byteArrayOutputStream.write(e10);
                byteArrayOutputStream.write(f10);
                i11 = i11 + 2 + 4 + length;
                i10++;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i11 == byteArray.length) {
            o oVar = new o(d.METHODS, i11, byteArray, true);
            byteArrayOutputStream.close();
            return oVar;
        }
        throw c.c("Expected size " + i11 + ", does not match actual size " + byteArray.length);
        throw th;
    }

    public static byte[] e(@m0 b bVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            H(byteArrayOutputStream, bVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    public static byte[] f(@m0 b bVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            I(byteArrayOutputStream, bVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    @m0
    public static String g(@m0 String str, @m0 String str2) {
        return "!".equals(str2) ? str.replace(":", "!") : ":".equals(str2) ? str.replace("!", ":") : str;
    }

    @m0
    public static String h(@m0 String str) {
        int indexOf = str.indexOf("!");
        if (indexOf < 0) {
            indexOf = str.indexOf(":");
        }
        return indexOf > 0 ? str.substring(indexOf + 1) : str;
    }

    @o0
    public static b i(@m0 b[] bVarArr, @m0 String str) {
        if (bVarArr.length <= 0) {
            return null;
        }
        String h10 = h(str);
        for (int i10 = 0; i10 < bVarArr.length; i10++) {
            if (bVarArr[i10].f12065b.equals(h10)) {
                return bVarArr[i10];
            }
        }
        return null;
    }

    @m0
    public static String j(@m0 String str, @m0 String str2, @m0 byte[] bArr) {
        String a10 = m.a(bArr);
        if (str.length() <= 0) {
            return g(str2, a10);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return g(str2, a10);
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return str + m.a(bArr) + str2;
    }

    public static int k(int i10) {
        return y(i10 * 2) / 8;
    }

    public static int l(int i10, int i11, int i12) {
        if (i10 == 1) {
            throw c.c("HOT methods are not stored in the bitmap");
        } else if (i10 == 2) {
            return i11;
        } else {
            if (i10 == 4) {
                return i11 + i12;
            }
            throw c.c("Unexpected flag: " + i10);
        }
    }

    public static int[] m(@m0 InputStream inputStream, int i10) throws IOException {
        int[] iArr = new int[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += c.h(inputStream);
            iArr[i12] = i11;
        }
        return iArr;
    }

    public static int n(@m0 BitSet bitSet, int i10, int i11) {
        int i12 = 2;
        if (!bitSet.get(l(2, i10, i11))) {
            i12 = 0;
        }
        return bitSet.get(l(4, i10, i11)) ? i12 | 4 : i12;
    }

    public static byte[] o(@m0 InputStream inputStream, @m0 byte[] bArr) throws IOException {
        if (Arrays.equals(bArr, c.d(inputStream, bArr.length))) {
            return c.d(inputStream, m.f12085b.length);
        }
        throw c.c("Invalid magic");
    }

    public static void p(@m0 InputStream inputStream, @m0 b bVar) throws IOException {
        int available = inputStream.available() - bVar.f12069f;
        int i10 = 0;
        while (inputStream.available() > available) {
            i10 += c.h(inputStream);
            bVar.f12072i.put(Integer.valueOf(i10), 1);
            for (int h10 = c.h(inputStream); h10 > 0; h10--) {
                A(inputStream);
            }
        }
        if (inputStream.available() != available) {
            throw c.c("Read too much data during profile line parse");
        }
    }

    @m0
    public static b[] q(@m0 InputStream inputStream, @m0 byte[] bArr, @m0 byte[] bArr2, b[] bVarArr) throws IOException {
        if (Arrays.equals(bArr, m.f12089f)) {
            if (!Arrays.equals(m.f12084a, bArr2)) {
                return r(inputStream, bArr, bVarArr);
            }
            throw c.c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        } else if (Arrays.equals(bArr, m.f12090g)) {
            return t(inputStream, bArr2, bVarArr);
        } else {
            throw c.c("Unsupported meta version");
        }
    }

    @m0
    public static b[] r(@m0 InputStream inputStream, @m0 byte[] bArr, b[] bVarArr) throws IOException {
        if (Arrays.equals(bArr, m.f12089f)) {
            int j10 = c.j(inputStream);
            byte[] e10 = c.e(inputStream, (int) c.i(inputStream), (int) c.i(inputStream));
            if (inputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e10);
                try {
                    b[] s10 = s(byteArrayInputStream, j10, bVarArr);
                    byteArrayInputStream.close();
                    return s10;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            } else {
                throw c.c("Content found after the end of file");
            }
        } else {
            throw c.c("Unsupported meta version");
        }
        throw th;
    }

    @m0
    public static b[] s(@m0 InputStream inputStream, int i10, b[] bVarArr) throws IOException {
        int i11 = 0;
        if (inputStream.available() == 0) {
            return new b[0];
        }
        if (i10 == bVarArr.length) {
            String[] strArr = new String[i10];
            int[] iArr = new int[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                int h10 = c.h(inputStream);
                iArr[i12] = c.h(inputStream);
                strArr[i12] = c.f(inputStream, h10);
            }
            while (i11 < i10) {
                b bVar = bVarArr[i11];
                if (bVar.f12065b.equals(strArr[i11])) {
                    int i13 = iArr[i11];
                    bVar.f12068e = i13;
                    bVar.f12071h = m(inputStream, i13);
                    i11++;
                } else {
                    throw c.c("Order of dexfiles in metadata did not match baseline");
                }
            }
            return bVarArr;
        }
        throw c.c("Mismatched number of dex files found in metadata");
    }

    @m0
    public static b[] t(@m0 InputStream inputStream, @m0 byte[] bArr, b[] bVarArr) throws IOException {
        int h10 = c.h(inputStream);
        byte[] e10 = c.e(inputStream, (int) c.i(inputStream), (int) c.i(inputStream));
        if (inputStream.read() <= 0) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e10);
            try {
                b[] u10 = u(byteArrayInputStream, bArr, h10, bVarArr);
                byteArrayInputStream.close();
                return u10;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else {
            throw c.c("Content found after the end of file");
        }
        throw th;
    }

    @m0
    public static b[] u(@m0 InputStream inputStream, @m0 byte[] bArr, int i10, b[] bVarArr) throws IOException {
        int i11 = 0;
        if (inputStream.available() == 0) {
            return new b[0];
        }
        if (i10 == bVarArr.length) {
            while (i11 < i10) {
                c.h(inputStream);
                String f10 = c.f(inputStream, c.h(inputStream));
                long i12 = c.i(inputStream);
                int h10 = c.h(inputStream);
                b i13 = i(bVarArr, f10);
                if (i13 != null) {
                    i13.f12067d = i12;
                    int[] m10 = m(inputStream, h10);
                    if (Arrays.equals(bArr, m.f12088e)) {
                        i13.f12068e = h10;
                        i13.f12071h = m10;
                    }
                    i11++;
                } else {
                    throw c.c("Missing profile key: " + f10);
                }
            }
            return bVarArr;
        }
        throw c.c("Mismatched number of dex files found in metadata");
    }

    public static void v(@m0 InputStream inputStream, @m0 b bVar) throws IOException {
        BitSet valueOf = BitSet.valueOf(c.d(inputStream, c.a(bVar.f12070g * 2)));
        int i10 = 0;
        while (true) {
            int i11 = bVar.f12070g;
            if (i10 < i11) {
                int n10 = n(valueOf, i10, i11);
                if (n10 != 0) {
                    Integer num = bVar.f12072i.get(Integer.valueOf(i10));
                    if (num == null) {
                        num = 0;
                    }
                    bVar.f12072i.put(Integer.valueOf(i10), Integer.valueOf(n10 | num.intValue()));
                }
                i10++;
            } else {
                return;
            }
        }
    }

    @m0
    public static b[] w(@m0 InputStream inputStream, @m0 byte[] bArr, @m0 String str) throws IOException {
        if (Arrays.equals(bArr, m.f12085b)) {
            int j10 = c.j(inputStream);
            byte[] e10 = c.e(inputStream, (int) c.i(inputStream), (int) c.i(inputStream));
            if (inputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(e10);
                try {
                    b[] x10 = x(byteArrayInputStream, str, j10);
                    byteArrayInputStream.close();
                    return x10;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            } else {
                throw c.c("Content found after the end of file");
            }
        } else {
            throw c.c("Unsupported version");
        }
        throw th;
    }

    @m0
    public static b[] x(@m0 InputStream inputStream, @m0 String str, int i10) throws IOException {
        InputStream inputStream2 = inputStream;
        int i11 = i10;
        if (inputStream.available() == 0) {
            return new b[0];
        }
        b[] bVarArr = new b[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int h10 = c.h(inputStream);
            int h11 = c.h(inputStream);
            long i13 = c.i(inputStream);
            String str2 = str;
            bVarArr[i12] = new b(str2, c.f(inputStream2, h10), c.i(inputStream), 0, h11, (int) i13, (int) c.i(inputStream), new int[h11], new TreeMap());
        }
        for (int i14 = 0; i14 < i11; i14++) {
            b bVar = bVarArr[i14];
            p(inputStream2, bVar);
            bVar.f12071h = m(inputStream2, bVar.f12068e);
            v(inputStream2, bVar);
        }
        return bVarArr;
    }

    public static int y(int i10) {
        return ((i10 + 8) - 1) & -8;
    }

    public static void z(@m0 byte[] bArr, int i10, int i11, @m0 b bVar) {
        int l10 = l(i10, i11, bVar.f12070g);
        int i12 = l10 / 8;
        bArr[i12] = (byte) ((1 << (l10 % 8)) | bArr[i12]);
    }
}
