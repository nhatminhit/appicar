package hh;

import b6.c;
import gh.e;
import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.util.Iterator;
import java.util.Locale;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jh.d;
import jh.f;
import jh.h;
import jh.m;
import jh.q;
import kh.g;
import t7.t;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f19562a = Pattern.compile("(?i)\\bcharset=\\s*(?:[\"'])?([^\\s,;\"']*)");

    /* renamed from: b  reason: collision with root package name */
    public static final String f19563b = "UTF-8";

    /* renamed from: c  reason: collision with root package name */
    public static final int f19564c = 5120;

    /* renamed from: d  reason: collision with root package name */
    public static final int f19565d = 32768;

    /* renamed from: e  reason: collision with root package name */
    public static final char[] f19566e = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    /* renamed from: f  reason: collision with root package name */
    public static final int f19567f = 32;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f19568a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f19569b;

        public a(String str, boolean z10) {
            this.f19568a = str;
            this.f19569b = z10;
        }
    }

    public static void a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[32768];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public static a b(ByteBuffer byteBuffer) {
        byteBuffer.mark();
        byte[] bArr = new byte[4];
        if (byteBuffer.remaining() >= 4) {
            byteBuffer.get(bArr);
            byteBuffer.rewind();
        }
        byte b10 = bArr[0];
        if ((b10 == 0 && bArr[1] == 0 && bArr[2] == -2 && bArr[3] == -1) || (b10 == -1 && bArr[1] == -2 && bArr[2] == 0 && bArr[3] == 0)) {
            return new a("UTF-32", false);
        }
        if ((b10 == -2 && bArr[1] == -1) || (b10 == -1 && bArr[1] == -2)) {
            return new a(c.f4245m, false);
        }
        if (b10 == -17 && bArr[1] == -69 && bArr[2] == -65) {
            return new a("UTF-8", true);
        }
        return null;
    }

    public static ByteBuffer c() {
        return ByteBuffer.allocate(0);
    }

    public static String d(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = f19562a.matcher(str);
        if (matcher.find()) {
            return k(matcher.group(1).trim().replace("charset=", ""));
        }
        return null;
    }

    public static f e(File file, String str, String str2) throws IOException {
        return i(new FileInputStream(file), str, str2, g.c());
    }

    public static f f(InputStream inputStream, String str, String str2) throws IOException {
        return i(inputStream, str, str2, g.c());
    }

    public static f g(InputStream inputStream, String str, String str2, g gVar) throws IOException {
        return i(inputStream, str, str2, gVar);
    }

    public static String h() {
        StringBuilder b10 = ih.c.b();
        Random random = new Random();
        for (int i10 = 0; i10 < 32; i10++) {
            char[] cArr = f19566e;
            b10.append(cArr[random.nextInt(cArr.length)]);
        }
        return ih.c.o(b10);
    }

    public static f i(InputStream inputStream, String str, String str2, g gVar) throws IOException {
        q qVar;
        InputStream inputStream2 = inputStream;
        String str3 = str2;
        g gVar2 = gVar;
        if (inputStream2 == null) {
            return new f(str3);
        }
        boolean z10 = false;
        ih.a h10 = ih.a.h(inputStream2, 32768, 0);
        h10.mark(32768);
        ByteBuffer j10 = j(h10, 5119);
        boolean z11 = h10.read() == -1;
        h10.reset();
        a b10 = b(j10);
        String a10 = b10 != null ? b10.f19568a : str;
        f fVar = null;
        if (a10 == null) {
            try {
                CharBuffer decode = Charset.forName("UTF-8").decode(j10);
                f j11 = decode.hasArray() ? gVar2.j(new CharArrayReader(decode.array()), str3) : gVar2.k(decode.toString(), str3);
                Iterator it = j11.c2("meta[http-equiv=content-type], meta[charset]").iterator();
                String str4 = null;
                while (it.hasNext()) {
                    h hVar = (h) it.next();
                    if (hVar.G("http-equiv")) {
                        str4 = d(hVar.m(t.f13205o));
                    }
                    if (str4 == null && hVar.G("charset")) {
                        str4 = hVar.m("charset");
                        continue;
                    }
                    if (str4 != null) {
                        break;
                    }
                }
                if (str4 == null && j11.u() > 0) {
                    m t10 = j11.t(0);
                    if (t10 instanceof q) {
                        qVar = (q) t10;
                    } else {
                        if (t10 instanceof d) {
                            d dVar = (d) t10;
                            if (dVar.v0()) {
                                qVar = dVar.s0();
                            }
                        }
                        qVar = null;
                    }
                    if (qVar != null && qVar.v0().equalsIgnoreCase("xml")) {
                        str4 = qVar.m(wg.g.f24244n);
                    }
                }
                String k10 = k(str4);
                if (k10 != null && !k10.equalsIgnoreCase("UTF-8")) {
                    a10 = k10.trim().replaceAll("[\"']", "");
                } else if (z11) {
                    fVar = j11;
                }
            } catch (e e10) {
                throw e10.a();
            }
        } else {
            d.i(a10, "Must set charset arg to character set of file to parse. Set to null to attempt to detect from HTML");
        }
        if (fVar == null) {
            if (a10 == null) {
                a10 = "UTF-8";
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(h10, a10), 32768);
            if (b10 != null && b10.f19569b) {
                if (bufferedReader.skip(1) == 1) {
                    z10 = true;
                }
                d.d(z10);
            }
            try {
                fVar = gVar2.j(bufferedReader, str3);
                Charset forName = Charset.forName(a10);
                fVar.I2().g(forName);
                if (!forName.canEncode()) {
                    fVar.w2(Charset.forName("UTF-8"));
                }
            } catch (e e11) {
                throw e11.a();
            }
        }
        h10.close();
        return fVar;
    }

    public static ByteBuffer j(InputStream inputStream, int i10) throws IOException {
        d.e(i10 >= 0, "maxSize must be 0 (unlimited) or larger");
        return ih.a.h(inputStream, 32768, i10).f(i10);
    }

    public static String k(String str) {
        if (!(str == null || str.length() == 0)) {
            String replaceAll = str.trim().replaceAll("[\"']", "");
            try {
                if (Charset.isSupported(replaceAll)) {
                    return replaceAll;
                }
                String upperCase = replaceAll.toUpperCase(Locale.ENGLISH);
                if (Charset.isSupported(upperCase)) {
                    return upperCase;
                }
            } catch (IllegalCharsetNameException unused) {
            }
        }
        return null;
    }
}
