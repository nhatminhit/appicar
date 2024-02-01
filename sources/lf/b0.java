package lf;

import be.c;
import be.o;
import be.s0;
import fh.g;
import gf.m;
import gf.v;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import oe.f;
import oe.h;
import xe.l0;
import xe.t1;
import zd.b1;
import zd.h1;
import zd.k;
import zd.l;
import zd.r;
import zd.y2;

public class b0 extends a0 {
    @f
    public static final boolean A1(String str, StringBuffer stringBuffer) {
        l0.p(str, "<this>");
        l0.p(stringBuffer, "stringBuilder");
        return str.contentEquals(stringBuffer);
    }

    @f
    public static final char[] A2(String str) {
        l0.p(str, "<this>");
        char[] charArray = str.toCharArray();
        l0.o(charArray, "this as java.lang.String).toCharArray()");
        return charArray;
    }

    @g
    @l(warningSince = "1.5")
    @k(message = "Use replaceFirstChar instead.", replaceWith = @b1(expression = "replaceFirstChar { it.lowercase(Locale.getDefault()) }", imports = {"java.util.Locale"}))
    public static final String B1(@g String str) {
        l0.p(str, "<this>");
        if (!(str.length() > 0) || Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        String substring = str.substring(0, 1);
        l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        l0.n(substring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = substring.toLowerCase();
        l0.o(lowerCase, "this as java.lang.String).toLowerCase()");
        sb2.append(lowerCase);
        String substring2 = str.substring(1);
        l0.o(substring2, "this as java.lang.String).substring(startIndex)");
        sb2.append(substring2);
        return sb2.toString();
    }

    @g
    @h1(version = "1.4")
    @y2(markerClass = {r.class})
    public static final char[] B2(@g String str, int i10, int i11) {
        l0.p(str, "<this>");
        c.O.a(i10, i11, str.length());
        char[] cArr = new char[(i11 - i10)];
        str.getChars(i10, i11, cArr, 0);
        return cArr;
    }

    @h1(version = "1.4")
    @l(warningSince = "1.5")
    @y2(markerClass = {r.class})
    @h
    @g
    @k(message = "Use replaceFirstChar instead.", replaceWith = @b1(expression = "replaceFirstChar { it.lowercase(locale) }", imports = {}))
    public static final String C1(@g String str, @g Locale locale) {
        l0.p(str, "<this>");
        l0.p(locale, "locale");
        if (!(str.length() > 0) || Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        String substring = str.substring(0, 1);
        l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        l0.n(substring, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = substring.toLowerCase(locale);
        l0.o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        sb2.append(lowerCase);
        String substring2 = str.substring(1);
        l0.o(substring2, "this as java.lang.String).substring(startIndex)");
        sb2.append(substring2);
        return sb2.toString();
    }

    @f
    public static final char[] C2(String str, char[] cArr, int i10, int i11, int i12) {
        l0.p(str, "<this>");
        l0.p(cArr, "destination");
        str.getChars(i11, i12, cArr, i10);
        return cArr;
    }

    @g
    @h1(version = "1.4")
    @y2(markerClass = {r.class})
    public static final String D1(@g byte[] bArr) {
        l0.p(bArr, "<this>");
        return new String(bArr, f.f20792b);
    }

    public static /* synthetic */ char[] D2(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return B2(str, i10, i11);
    }

    @g
    @h1(version = "1.4")
    @y2(markerClass = {r.class})
    public static final String E1(@g byte[] bArr, int i10, int i11, boolean z10) {
        l0.p(bArr, "<this>");
        c.O.a(i10, i11, bArr.length);
        if (!z10) {
            return new String(bArr, i10, i11 - i10, f.f20792b);
        }
        String charBuffer = f.f20792b.newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT).decode(ByteBuffer.wrap(bArr, i10, i11 - i10)).toString();
        l0.o(charBuffer, "decoder.decode(ByteBuffe…- startIndex)).toString()");
        return charBuffer;
    }

    public static /* synthetic */ char[] E2(String str, char[] cArr, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = str.length();
        }
        l0.p(str, "<this>");
        l0.p(cArr, "destination");
        str.getChars(i11, i12, cArr, i10);
        return cArr;
    }

    public static /* synthetic */ String F1(byte[] bArr, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = bArr.length;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return E1(bArr, i10, i11, z10);
    }

    @l(warningSince = "1.5")
    @f
    @k(message = "Use lowercase() instead.", replaceWith = @b1(expression = "lowercase(Locale.getDefault())", imports = {"java.util.Locale"}))
    public static final String F2(String str) {
        l0.p(str, "<this>");
        String lowerCase = str.toLowerCase();
        l0.o(lowerCase, "this as java.lang.String).toLowerCase()");
        return lowerCase;
    }

    @g
    @h1(version = "1.4")
    @y2(markerClass = {r.class})
    public static final byte[] G1(@g String str) {
        l0.p(str, "<this>");
        byte[] bytes = str.getBytes(f.f20792b);
        l0.o(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @l(warningSince = "1.5")
    @f
    @k(message = "Use lowercase() instead.", replaceWith = @b1(expression = "lowercase(locale)", imports = {}))
    public static final String G2(String str, Locale locale) {
        l0.p(str, "<this>");
        l0.p(locale, "locale");
        String lowerCase = str.toLowerCase(locale);
        l0.o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    @g
    @h1(version = "1.4")
    @y2(markerClass = {r.class})
    public static final byte[] H1(@g String str, int i10, int i11, boolean z10) {
        l0.p(str, "<this>");
        c.O.a(i10, i11, str.length());
        if (!z10) {
            String substring = str.substring(i10, i11);
            l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            Charset charset = f.f20792b;
            l0.n(substring, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes = substring.getBytes(charset);
            l0.o(bytes, "this as java.lang.String).getBytes(charset)");
            return bytes;
        }
        ByteBuffer encode = f.f20792b.newEncoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT).encode(CharBuffer.wrap(str, i10, i11));
        if (encode.hasArray() && encode.arrayOffset() == 0) {
            int remaining = encode.remaining();
            byte[] array = encode.array();
            l0.m(array);
            if (remaining == array.length) {
                byte[] array2 = encode.array();
                l0.o(array2, "{\n        byteBuffer.array()\n    }");
                return array2;
            }
        }
        byte[] bArr = new byte[encode.remaining()];
        encode.get(bArr);
        return bArr;
    }

    @f
    public static final Pattern H2(String str, int i10) {
        l0.p(str, "<this>");
        Pattern compile = Pattern.compile(str, i10);
        l0.o(compile, "compile(this, flags)");
        return compile;
    }

    public static /* synthetic */ byte[] I1(String str, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return H1(str, i10, i11, z10);
    }

    public static /* synthetic */ Pattern I2(String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        l0.p(str, "<this>");
        Pattern compile = Pattern.compile(str, i10);
        l0.o(compile, "compile(this, flags)");
        return compile;
    }

    public static final boolean J1(@g String str, @g String str2, boolean z10) {
        l0.p(str, "<this>");
        l0.p(str2, "suffix");
        if (!z10) {
            return str.endsWith(str2);
        }
        return e2(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    @l(warningSince = "1.5")
    @f
    @k(message = "Use uppercase() instead.", replaceWith = @b1(expression = "uppercase(Locale.getDefault())", imports = {"java.util.Locale"}))
    public static final String J2(String str) {
        l0.p(str, "<this>");
        String upperCase = str.toUpperCase();
        l0.o(upperCase, "this as java.lang.String).toUpperCase()");
        return upperCase;
    }

    public static /* synthetic */ boolean K1(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return J1(str, str2, z10);
    }

    @l(warningSince = "1.5")
    @f
    @k(message = "Use uppercase() instead.", replaceWith = @b1(expression = "uppercase(locale)", imports = {}))
    public static final String K2(String str, Locale locale) {
        l0.p(str, "<this>");
        l0.p(locale, "locale");
        String upperCase = str.toUpperCase(locale);
        l0.o(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }

    public static final boolean L1(@fh.h String str, @fh.h String str2, boolean z10) {
        return str == null ? str2 == null : !z10 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    @h1(version = "1.5")
    @y2(markerClass = {r.class})
    @f
    public static final String L2(String str) {
        l0.p(str, "<this>");
        String upperCase = str.toUpperCase(Locale.ROOT);
        l0.o(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase;
    }

    public static /* synthetic */ boolean M1(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return L1(str, str2, z10);
    }

    @h1(version = "1.5")
    @y2(markerClass = {r.class})
    @f
    public static final String M2(String str, Locale locale) {
        l0.p(str, "<this>");
        l0.p(locale, "locale");
        String upperCase = str.toUpperCase(locale);
        l0.o(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }

    @l(hiddenSince = "1.4")
    @f
    @k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    public static final /* synthetic */ String N1(String str, Locale locale, Object... objArr) {
        l0.p(str, "<this>");
        l0.p(locale, "locale");
        l0.p(objArr, "args");
        String format = String.format(locale, str, Arrays.copyOf(objArr, objArr.length));
        l0.o(format, "format(locale, this, *args)");
        return format;
    }

    @f
    public static final String O1(String str, Object... objArr) {
        l0.p(str, "<this>");
        l0.p(objArr, "args");
        String format = String.format(str, Arrays.copyOf(objArr, objArr.length));
        l0.o(format, "format(this, *args)");
        return format;
    }

    @f
    public static final String P1(t1 t1Var, String str, Object... objArr) {
        l0.p(t1Var, "<this>");
        l0.p(str, "format");
        l0.p(objArr, "args");
        String format = String.format(str, Arrays.copyOf(objArr, objArr.length));
        l0.o(format, "format(format, *args)");
        return format;
    }

    @l(hiddenSince = "1.4")
    @f
    @k(message = "Use Kotlin compiler 1.4 to avoid deprecation warning.")
    public static final /* synthetic */ String Q1(t1 t1Var, Locale locale, String str, Object... objArr) {
        l0.p(t1Var, "<this>");
        l0.p(locale, "locale");
        l0.p(str, "format");
        l0.p(objArr, "args");
        String format = String.format(locale, str, Arrays.copyOf(objArr, objArr.length));
        l0.o(format, "format(locale, format, *args)");
        return format;
    }

    @h1(version = "1.4")
    @f
    @ve.h(name = "formatNullable")
    public static final String R1(String str, Locale locale, Object... objArr) {
        l0.p(str, "<this>");
        l0.p(objArr, "args");
        String format = String.format(locale, str, Arrays.copyOf(objArr, objArr.length));
        l0.o(format, "format(locale, this, *args)");
        return format;
    }

    @h1(version = "1.4")
    @f
    @ve.h(name = "formatNullable")
    public static final String S1(t1 t1Var, Locale locale, String str, Object... objArr) {
        l0.p(t1Var, "<this>");
        l0.p(str, "format");
        l0.p(objArr, "args");
        String format = String.format(locale, str, Arrays.copyOf(objArr, objArr.length));
        l0.o(format, "format(locale, format, *args)");
        return format;
    }

    @g
    public static final Comparator<String> T1(@g t1 t1Var) {
        l0.p(t1Var, "<this>");
        Comparator<String> comparator = String.CASE_INSENSITIVE_ORDER;
        l0.o(comparator, "CASE_INSENSITIVE_ORDER");
        return comparator;
    }

    @f
    public static final String U1(String str) {
        l0.p(str, "<this>");
        String intern = str.intern();
        l0.o(intern, "this as java.lang.String).intern()");
        return intern;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean V1(@fh.g java.lang.CharSequence r4) {
        /*
            java.lang.String r0 = "<this>"
            xe.l0.p(r4, r0)
            int r0 = r4.length()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x003e
            gf.m r0 = lf.c0.i3(r4)
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0020
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0020
        L_0x001e:
            r4 = r2
            goto L_0x003c
        L_0x0020:
            java.util.Iterator r0 = r0.iterator()
        L_0x0024:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x001e
            r3 = r0
            be.s0 r3 = (be.s0) r3
            int r3 = r3.nextInt()
            char r3 = r4.charAt(r3)
            boolean r3 = lf.d.r(r3)
            if (r3 != 0) goto L_0x0024
            r4 = r1
        L_0x003c:
            if (r4 == 0) goto L_0x003f
        L_0x003e:
            r1 = r2
        L_0x003f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: lf.b0.V1(java.lang.CharSequence):boolean");
    }

    @h1(version = "1.5")
    @y2(markerClass = {r.class})
    @f
    public static final String W1(String str) {
        l0.p(str, "<this>");
        String lowerCase = str.toLowerCase(Locale.ROOT);
        l0.o(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    @h1(version = "1.5")
    @y2(markerClass = {r.class})
    @f
    public static final String X1(String str, Locale locale) {
        l0.p(str, "<this>");
        l0.p(locale, "locale");
        String lowerCase = str.toLowerCase(locale);
        l0.o(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    @f
    public static final int Y1(String str, char c10, int i10) {
        l0.p(str, "<this>");
        return str.indexOf(c10, i10);
    }

    @f
    public static final int Z1(String str, String str2, int i10) {
        l0.p(str, "<this>");
        l0.p(str2, "str");
        return str.indexOf(str2, i10);
    }

    @f
    public static final int a2(String str, char c10, int i10) {
        l0.p(str, "<this>");
        return str.lastIndexOf(c10, i10);
    }

    @f
    public static final int b2(String str, String str2, int i10) {
        l0.p(str, "<this>");
        l0.p(str2, "str");
        return str.lastIndexOf(str2, i10);
    }

    @f
    public static final int c2(String str, int i10, int i11) {
        l0.p(str, "<this>");
        return str.offsetByCodePoints(i10, i11);
    }

    public static final boolean d2(@g CharSequence charSequence, int i10, @g CharSequence charSequence2, int i11, int i12, boolean z10) {
        l0.p(charSequence, "<this>");
        l0.p(charSequence2, "other");
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            return c0.b4(charSequence, i10, charSequence2, i11, i12, z10);
        }
        return e2((String) charSequence, i10, (String) charSequence2, i11, i12, z10);
    }

    @f
    public static final String e1(StringBuffer stringBuffer) {
        l0.p(stringBuffer, "stringBuffer");
        return new String(stringBuffer);
    }

    public static final boolean e2(@g String str, int i10, @g String str2, int i11, int i12, boolean z10) {
        l0.p(str, "<this>");
        l0.p(str2, "other");
        return !z10 ? str.regionMatches(i10, str2, i11, i12) : str.regionMatches(z10, i10, str2, i11, i12);
    }

    @f
    public static final String f1(StringBuilder sb2) {
        l0.p(sb2, "stringBuilder");
        return new String(sb2);
    }

    public static /* synthetic */ boolean f2(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12, boolean z10, int i13, Object obj) {
        if ((i13 & 16) != 0) {
            z10 = false;
        }
        return d2(charSequence, i10, charSequence2, i11, i12, z10);
    }

    @f
    public static final String g1(byte[] bArr) {
        l0.p(bArr, "bytes");
        return new String(bArr, f.f20792b);
    }

    public static /* synthetic */ boolean g2(String str, int i10, String str2, int i11, int i12, boolean z10, int i13, Object obj) {
        if ((i13 & 16) != 0) {
            z10 = false;
        }
        return e2(str, i10, str2, i11, i12, z10);
    }

    @f
    public static final String h1(byte[] bArr, int i10, int i11) {
        l0.p(bArr, "bytes");
        return new String(bArr, i10, i11, f.f20792b);
    }

    @g
    public static final String h2(@g CharSequence charSequence, int i10) {
        l0.p(charSequence, "<this>");
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i10 + '.').toString());
        } else if (i10 == 0) {
            return "";
        } else {
            if (i10 == 1) {
                return charSequence.toString();
            }
            int length = charSequence.length();
            if (length == 0) {
                return "";
            }
            if (length != 1) {
                StringBuilder sb2 = new StringBuilder(charSequence.length() * i10);
                s0 o10 = new m(1, i10).iterator();
                while (o10.hasNext()) {
                    o10.nextInt();
                    sb2.append(charSequence);
                }
                String sb3 = sb2.toString();
                l0.o(sb3, "{\n                    va…tring()\n                }");
                return sb3;
            }
            char charAt = charSequence.charAt(0);
            char[] cArr = new char[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                cArr[i11] = charAt;
            }
            return new String(cArr);
        }
    }

    @f
    public static final String i1(byte[] bArr, int i10, int i11, Charset charset) {
        l0.p(bArr, "bytes");
        l0.p(charset, "charset");
        return new String(bArr, i10, i11, charset);
    }

    @g
    public static final String i2(@g String str, char c10, char c11, boolean z10) {
        String sb2;
        String str2;
        l0.p(str, "<this>");
        if (!z10) {
            sb2 = str.replace(c10, c11);
            str2 = "this as java.lang.String…replace(oldChar, newChar)";
        } else {
            StringBuilder sb3 = new StringBuilder(str.length());
            for (int i10 = 0; i10 < str.length(); i10++) {
                char charAt = str.charAt(i10);
                if (e.J(charAt, c10, z10)) {
                    charAt = c11;
                }
                sb3.append(charAt);
            }
            sb2 = sb3.toString();
            str2 = "StringBuilder(capacity).…builderAction).toString()";
        }
        l0.o(sb2, str2);
        return sb2;
    }

    @f
    public static final String j1(byte[] bArr, Charset charset) {
        l0.p(bArr, "bytes");
        l0.p(charset, "charset");
        return new String(bArr, charset);
    }

    @g
    public static final String j2(@g String str, @g String str2, @g String str3, boolean z10) {
        l0.p(str, "<this>");
        l0.p(str2, "oldValue");
        l0.p(str3, "newValue");
        int i10 = 0;
        int o32 = c0.o3(str, str2, 0, z10);
        if (o32 < 0) {
            return str;
        }
        int length = str2.length();
        int u10 = v.u(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 >= 0) {
            StringBuilder sb2 = new StringBuilder(length2);
            do {
                sb2.append(str, i10, o32);
                sb2.append(str3);
                i10 = o32 + length;
                if (o32 >= str.length() || (o32 = c0.o3(str, str2, o32 + u10, z10)) <= 0) {
                    sb2.append(str, i10, str.length());
                    String sb3 = sb2.toString();
                    l0.o(sb3, "stringBuilder.append(this, i, length).toString()");
                }
                sb2.append(str, i10, o32);
                sb2.append(str3);
                i10 = o32 + length;
                break;
            } while ((o32 = c0.o3(str, str2, o32 + u10, z10)) <= 0);
            sb2.append(str, i10, str.length());
            String sb32 = sb2.toString();
            l0.o(sb32, "stringBuilder.append(this, i, length).toString()");
            return sb32;
        }
        throw new OutOfMemoryError();
    }

    @f
    public static final String k1(char[] cArr) {
        l0.p(cArr, "chars");
        return new String(cArr);
    }

    public static /* synthetic */ String k2(String str, char c10, char c11, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return i2(str, c10, c11, z10);
    }

    @f
    public static final String l1(char[] cArr, int i10, int i11) {
        l0.p(cArr, "chars");
        return new String(cArr, i10, i11);
    }

    public static /* synthetic */ String l2(String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return j2(str, str2, str3, z10);
    }

    @f
    public static final String m1(int[] iArr, int i10, int i11) {
        l0.p(iArr, "codePoints");
        return new String(iArr, i10, i11);
    }

    @g
    public static final String m2(@g String str, char c10, char c11, boolean z10) {
        l0.p(str, "<this>");
        int r32 = c0.r3(str, c10, 0, z10, 2, (Object) null);
        return r32 < 0 ? str : c0.J4(str, r32, r32 + 1, String.valueOf(c11)).toString();
    }

    @g
    @l(warningSince = "1.5")
    @k(message = "Use replaceFirstChar instead.", replaceWith = @b1(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }", imports = {"java.util.Locale"}))
    public static final String n1(@g String str) {
        l0.p(str, "<this>");
        Locale locale = Locale.getDefault();
        l0.o(locale, "getDefault()");
        return o1(str, locale);
    }

    @g
    public static final String n2(@g String str, @g String str2, @g String str3, boolean z10) {
        l0.p(str, "<this>");
        l0.p(str2, "oldValue");
        l0.p(str3, "newValue");
        int s32 = c0.s3(str, str2, 0, z10, 2, (Object) null);
        return s32 < 0 ? str : c0.J4(str, s32, str2.length() + s32, str3).toString();
    }

    @h1(version = "1.4")
    @l(warningSince = "1.5")
    @y2(markerClass = {r.class})
    @h
    @g
    @k(message = "Use replaceFirstChar instead.", replaceWith = @b1(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(locale) else it.toString() }", imports = {}))
    public static final String o1(@g String str, @g Locale locale) {
        l0.p(str, "<this>");
        l0.p(locale, "locale");
        if (!(str.length() > 0)) {
            return str;
        }
        char charAt = str.charAt(0);
        if (!Character.isLowerCase(charAt)) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        char titleCase = Character.toTitleCase(charAt);
        if (titleCase != Character.toUpperCase(charAt)) {
            sb2.append(titleCase);
        } else {
            String substring = str.substring(0, 1);
            l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            l0.n(substring, "null cannot be cast to non-null type java.lang.String");
            String upperCase = substring.toUpperCase(locale);
            l0.o(upperCase, "this as java.lang.String).toUpperCase(locale)");
            sb2.append(upperCase);
        }
        String substring2 = str.substring(1);
        l0.o(substring2, "this as java.lang.String).substring(startIndex)");
        sb2.append(substring2);
        String sb3 = sb2.toString();
        l0.o(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public static /* synthetic */ String o2(String str, char c10, char c11, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return m2(str, c10, c11, z10);
    }

    @f
    public static final int p1(String str, int i10) {
        l0.p(str, "<this>");
        return str.codePointAt(i10);
    }

    public static /* synthetic */ String p2(String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return n2(str, str2, str3, z10);
    }

    @f
    public static final int q1(String str, int i10) {
        l0.p(str, "<this>");
        return str.codePointBefore(i10);
    }

    @g
    public static final List<String> q2(@g CharSequence charSequence, @g Pattern pattern, int i10) {
        l0.p(charSequence, "<this>");
        l0.p(pattern, "regex");
        c0.N4(i10);
        if (i10 == 0) {
            i10 = -1;
        }
        String[] split = pattern.split(charSequence, i10);
        l0.o(split, "regex.split(this, if (limit == 0) -1 else limit)");
        return o.t(split);
    }

    @f
    public static final int r1(String str, int i10, int i11) {
        l0.p(str, "<this>");
        return str.codePointCount(i10, i11);
    }

    public static /* synthetic */ List r2(CharSequence charSequence, Pattern pattern, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return q2(charSequence, pattern, i10);
    }

    public static final int s1(@g String str, @g String str2, boolean z10) {
        l0.p(str, "<this>");
        l0.p(str2, "other");
        return z10 ? str.compareToIgnoreCase(str2) : str.compareTo(str2);
    }

    public static final boolean s2(@g String str, @g String str2, int i10, boolean z10) {
        l0.p(str, "<this>");
        l0.p(str2, "prefix");
        if (!z10) {
            return str.startsWith(str2, i10);
        }
        return e2(str, i10, str2, 0, str2.length(), z10);
    }

    public static /* synthetic */ int t1(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return s1(str, str2, z10);
    }

    public static final boolean t2(@g String str, @g String str2, boolean z10) {
        l0.p(str, "<this>");
        l0.p(str2, "prefix");
        if (!z10) {
            return str.startsWith(str2);
        }
        return e2(str, 0, str2, 0, str2.length(), z10);
    }

    @g
    @h1(version = "1.4")
    @y2(markerClass = {r.class})
    public static final String u1(@g char[] cArr) {
        l0.p(cArr, "<this>");
        return new String(cArr);
    }

    public static /* synthetic */ boolean u2(String str, String str2, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return s2(str, str2, i10, z10);
    }

    @g
    @h1(version = "1.4")
    @y2(markerClass = {r.class})
    public static final String v1(@g char[] cArr, int i10, int i11) {
        l0.p(cArr, "<this>");
        c.O.a(i10, i11, cArr.length);
        return new String(cArr, i10, i11 - i10);
    }

    public static /* synthetic */ boolean v2(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return t2(str, str2, z10);
    }

    public static /* synthetic */ String w1(char[] cArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = cArr.length;
        }
        return v1(cArr, i10, i11);
    }

    @f
    public static final String w2(String str, int i10) {
        l0.p(str, "<this>");
        String substring = str.substring(i10);
        l0.o(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    @h1(version = "1.5")
    public static final boolean x1(@fh.h CharSequence charSequence, @fh.h CharSequence charSequence2) {
        return (!(charSequence instanceof String) || charSequence2 == null) ? c0.Y2(charSequence, charSequence2) : ((String) charSequence).contentEquals(charSequence2);
    }

    @f
    public static final String x2(String str, int i10, int i11) {
        l0.p(str, "<this>");
        String substring = str.substring(i10, i11);
        l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    @h1(version = "1.5")
    public static final boolean y1(@fh.h CharSequence charSequence, @fh.h CharSequence charSequence2, boolean z10) {
        return z10 ? c0.X2(charSequence, charSequence2) : x1(charSequence, charSequence2);
    }

    @f
    public static final byte[] y2(String str, Charset charset) {
        l0.p(str, "<this>");
        l0.p(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        l0.o(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @f
    public static final boolean z1(String str, CharSequence charSequence) {
        l0.p(str, "<this>");
        l0.p(charSequence, "charSequence");
        return str.contentEquals(charSequence);
    }

    public static /* synthetic */ byte[] z2(String str, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = f.f20792b;
        }
        l0.p(str, "<this>");
        l0.p(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        l0.o(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }
}
