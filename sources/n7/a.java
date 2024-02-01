package n7;

import h7.g;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import w7.p;
import w7.q0;
import w7.r0;

public final class a extends h7.c {
    public static final Pattern A = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    public static final Pattern B = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    public static final Pattern C = Pattern.compile("^(\\d+) (\\d+)$");
    public static final int D = 30;
    public static final b E = new b(30.0f, 1, 1);
    public static final C0186a F = new C0186a(32, 15);

    /* renamed from: p  reason: collision with root package name */
    public static final String f10926p = "TtmlDecoder";

    /* renamed from: q  reason: collision with root package name */
    public static final String f10927q = "http://www.w3.org/ns/ttml#parameter";

    /* renamed from: r  reason: collision with root package name */
    public static final String f10928r = "begin";

    /* renamed from: s  reason: collision with root package name */
    public static final String f10929s = "dur";

    /* renamed from: t  reason: collision with root package name */
    public static final String f10930t = "end";

    /* renamed from: u  reason: collision with root package name */
    public static final String f10931u = "style";

    /* renamed from: v  reason: collision with root package name */
    public static final String f10932v = "region";

    /* renamed from: w  reason: collision with root package name */
    public static final String f10933w = "backgroundImage";

    /* renamed from: x  reason: collision with root package name */
    public static final Pattern f10934x = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: y  reason: collision with root package name */
    public static final Pattern f10935y = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: z  reason: collision with root package name */
    public static final Pattern f10936z = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: o  reason: collision with root package name */
    public final XmlPullParserFactory f10937o;

    /* renamed from: n7.a$a  reason: collision with other inner class name */
    public static final class C0186a {

        /* renamed from: a  reason: collision with root package name */
        public final int f10938a;

        /* renamed from: b  reason: collision with root package name */
        public final int f10939b;

        public C0186a(int i10, int i11) {
            this.f10938a = i10;
            this.f10939b = i11;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final float f10940a;

        /* renamed from: b  reason: collision with root package name */
        public final int f10941b;

        /* renamed from: c  reason: collision with root package name */
        public final int f10942c;

        public b(float f10, int i10, int i11) {
            this.f10940a = f10;
            this.f10941b = i10;
            this.f10942c = i11;
        }
    }

    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f10943a;

        /* renamed from: b  reason: collision with root package name */
        public final int f10944b;

        public c(int i10, int i11) {
            this.f10943a = i10;
            this.f10944b = i11;
        }
    }

    public a() {
        super(f10926p);
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f10937o = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e10) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e10);
        }
    }

    public static boolean E(String str) {
        return str.equals(b.f10945m) || str.equals(b.f10946n) || str.equals("body") || str.equals(b.f10948p) || str.equals("p") || str.equals(b.f10950r) || str.equals(b.f10951s) || str.equals("style") || str.equals(b.f10953u) || str.equals(b.f10954v) || str.equals("region") || str.equals("metadata") || str.equals(b.f10957y) || str.equals("data") || str.equals(b.A);
    }

    public static void G(String str, e eVar) throws g {
        Matcher matcher;
        String[] R0 = q0.R0(str, "\\s+");
        if (R0.length == 1) {
            matcher = f10936z.matcher(str);
        } else if (R0.length == 2) {
            matcher = f10936z.matcher(R0[1]);
            p.l(f10926p, "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new g("Invalid number of entries for fontSize: " + R0.length + ".");
        }
        if (matcher.matches()) {
            String group = matcher.group(3);
            group.hashCode();
            char c10 = 65535;
            switch (group.hashCode()) {
                case 37:
                    if (group.equals("%")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 3240:
                    if (group.equals("em")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3592:
                    if (group.equals("px")) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    eVar.u(3);
                    break;
                case 1:
                    eVar.u(2);
                    break;
                case 2:
                    eVar.u(1);
                    break;
                default:
                    throw new g("Invalid unit for fontSize: '" + group + "'.");
            }
            eVar.t(Float.valueOf(matcher.group(1)).floatValue());
            return;
        }
        throw new g("Invalid expression for fontSize: '" + str + "'.");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x009e, code lost:
        if (r13.equals("ms") == false) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d5, code lost:
        r8 = r8 / r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e3, code lost:
        r8 = r8 * r13;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long O(java.lang.String r13, n7.a.b r14) throws h7.g {
        /*
            java.util.regex.Pattern r0 = f10934x
            java.util.regex.Matcher r0 = r0.matcher(r13)
            boolean r1 = r0.matches()
            r2 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L_0x0073
            java.lang.String r13 = r0.group(r7)
            long r7 = java.lang.Long.parseLong(r13)
            r9 = 3600(0xe10, double:1.7786E-320)
            long r7 = r7 * r9
            double r7 = (double) r7
            java.lang.String r13 = r0.group(r6)
            long r9 = java.lang.Long.parseLong(r13)
            r11 = 60
            long r9 = r9 * r11
            double r9 = (double) r9
            double r7 = r7 + r9
            java.lang.String r13 = r0.group(r5)
            long r5 = java.lang.Long.parseLong(r13)
            double r5 = (double) r5
            double r7 = r7 + r5
            java.lang.String r13 = r0.group(r4)
            r4 = 0
            if (r13 == 0) goto L_0x0045
            double r9 = java.lang.Double.parseDouble(r13)
            goto L_0x0046
        L_0x0045:
            r9 = r4
        L_0x0046:
            double r7 = r7 + r9
            r13 = 5
            java.lang.String r13 = r0.group(r13)
            if (r13 == 0) goto L_0x0058
            long r9 = java.lang.Long.parseLong(r13)
            float r13 = (float) r9
            float r1 = r14.f10940a
            float r13 = r13 / r1
            double r9 = (double) r13
            goto L_0x0059
        L_0x0058:
            r9 = r4
        L_0x0059:
            double r7 = r7 + r9
            r13 = 6
            java.lang.String r13 = r0.group(r13)
            if (r13 == 0) goto L_0x006f
            long r0 = java.lang.Long.parseLong(r13)
            double r0 = (double) r0
            int r13 = r14.f10941b
            double r4 = (double) r13
            double r0 = r0 / r4
            float r13 = r14.f10940a
            double r13 = (double) r13
            double r4 = r0 / r13
        L_0x006f:
            double r7 = r7 + r4
            double r7 = r7 * r2
            long r13 = (long) r7
            return r13
        L_0x0073:
            java.util.regex.Pattern r0 = f10935y
            java.util.regex.Matcher r0 = r0.matcher(r13)
            boolean r1 = r0.matches()
            if (r1 == 0) goto L_0x00ec
            java.lang.String r13 = r0.group(r7)
            double r8 = java.lang.Double.parseDouble(r13)
            java.lang.String r13 = r0.group(r6)
            r13.hashCode()
            r0 = -1
            int r1 = r13.hashCode()
            switch(r1) {
                case 102: goto L_0x00c2;
                case 104: goto L_0x00b7;
                case 109: goto L_0x00ac;
                case 116: goto L_0x00a1;
                case 3494: goto L_0x0098;
                default: goto L_0x0096;
            }
        L_0x0096:
            r4 = r0
            goto L_0x00cc
        L_0x0098:
            java.lang.String r1 = "ms"
            boolean r13 = r13.equals(r1)
            if (r13 != 0) goto L_0x00cc
            goto L_0x0096
        L_0x00a1:
            java.lang.String r1 = "t"
            boolean r13 = r13.equals(r1)
            if (r13 != 0) goto L_0x00aa
            goto L_0x0096
        L_0x00aa:
            r4 = r5
            goto L_0x00cc
        L_0x00ac:
            java.lang.String r1 = "m"
            boolean r13 = r13.equals(r1)
            if (r13 != 0) goto L_0x00b5
            goto L_0x0096
        L_0x00b5:
            r4 = r6
            goto L_0x00cc
        L_0x00b7:
            java.lang.String r1 = "h"
            boolean r13 = r13.equals(r1)
            if (r13 != 0) goto L_0x00c0
            goto L_0x0096
        L_0x00c0:
            r4 = r7
            goto L_0x00cc
        L_0x00c2:
            java.lang.String r1 = "f"
            boolean r13 = r13.equals(r1)
            if (r13 != 0) goto L_0x00cb
            goto L_0x0096
        L_0x00cb:
            r4 = 0
        L_0x00cc:
            switch(r4) {
                case 0: goto L_0x00e5;
                case 1: goto L_0x00de;
                case 2: goto L_0x00db;
                case 3: goto L_0x00d7;
                case 4: goto L_0x00d0;
                default: goto L_0x00cf;
            }
        L_0x00cf:
            goto L_0x00e9
        L_0x00d0:
            r13 = 4652007308841189376(0x408f400000000000, double:1000.0)
        L_0x00d5:
            double r8 = r8 / r13
            goto L_0x00e9
        L_0x00d7:
            int r13 = r14.f10942c
            double r13 = (double) r13
            goto L_0x00d5
        L_0x00db:
            r13 = 4633641066610819072(0x404e000000000000, double:60.0)
            goto L_0x00e3
        L_0x00de:
            r13 = 4660134898793709568(0x40ac200000000000, double:3600.0)
        L_0x00e3:
            double r8 = r8 * r13
            goto L_0x00e9
        L_0x00e5:
            float r13 = r14.f10940a
            double r13 = (double) r13
            goto L_0x00d5
        L_0x00e9:
            double r8 = r8 * r2
            long r13 = (long) r8
            return r13
        L_0x00ec:
            h7.g r14 = new h7.g
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Malformed time expression: "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r14.<init>((java.lang.String) r13)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: n7.a.O(java.lang.String, n7.a$b):long");
    }

    public final e C(e eVar) {
        return eVar == null ? new e() : eVar;
    }

    /* renamed from: D */
    public f z(byte[] bArr, int i10, boolean z10) throws g {
        f fVar;
        b bVar;
        try {
            XmlPullParser newPullParser = this.f10937o.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            c cVar = null;
            hashMap2.put("", new c((String) null));
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i10), (String) null);
            ArrayDeque arrayDeque = new ArrayDeque();
            b bVar2 = E;
            C0186a aVar = F;
            int i11 = 0;
            f fVar2 = null;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                b bVar3 = (b) arrayDeque.peek();
                if (i11 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if (b.f10945m.equals(name)) {
                            bVar2 = H(newPullParser);
                            aVar = F(newPullParser, F);
                            cVar = P(newPullParser);
                        }
                        c cVar2 = cVar;
                        b bVar4 = bVar2;
                        C0186a aVar2 = aVar;
                        if (!E(name)) {
                            p.h(f10926p, "Ignoring unsupported tag: " + newPullParser.getName());
                            i11++;
                            bVar2 = bVar4;
                            cVar = cVar2;
                            aVar = aVar2;
                            newPullParser.next();
                        } else {
                            if (b.f10946n.equals(name)) {
                                fVar = fVar2;
                                bVar = bVar4;
                                I(newPullParser, hashMap, aVar2, cVar2, hashMap2, hashMap3);
                            } else {
                                fVar = fVar2;
                                bVar = bVar4;
                                try {
                                    b K = K(newPullParser, bVar3, hashMap2, bVar);
                                    arrayDeque.push(K);
                                    if (bVar3 != null) {
                                        bVar3.a(K);
                                    }
                                } catch (g e10) {
                                    p.m(f10926p, "Suppressing parser error", e10);
                                    i11++;
                                }
                            }
                            bVar2 = bVar;
                            cVar = cVar2;
                            aVar = aVar2;
                        }
                    } else {
                        fVar = fVar2;
                        if (eventType == 4) {
                            bVar3.a(b.d(newPullParser.getText()));
                        } else if (eventType == 3) {
                            fVar2 = newPullParser.getName().equals(b.f10945m) ? new f((b) arrayDeque.peek(), hashMap, hashMap2, hashMap3) : fVar;
                            arrayDeque.pop();
                            newPullParser.next();
                        }
                    }
                } else {
                    fVar = fVar2;
                    if (eventType == 2) {
                        i11++;
                    } else if (eventType == 3) {
                        i11--;
                    }
                }
                fVar2 = fVar;
                newPullParser.next();
            }
            return fVar2;
        } catch (XmlPullParserException e11) {
            throw new g("Unable to decode source", e11);
        } catch (IOException e12) {
            throw new IllegalStateException("Unexpected error when reading input.", e12);
        }
    }

    public final C0186a F(XmlPullParser xmlPullParser, C0186a aVar) throws g {
        StringBuilder sb2;
        String attributeValue = xmlPullParser.getAttributeValue(f10927q, "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = C.matcher(attributeValue);
        if (!matcher.matches()) {
            sb2 = new StringBuilder();
        } else {
            try {
                int parseInt = Integer.parseInt(matcher.group(1));
                int parseInt2 = Integer.parseInt(matcher.group(2));
                if (parseInt != 0 && parseInt2 != 0) {
                    return new C0186a(parseInt, parseInt2);
                }
                throw new g("Invalid cell resolution " + parseInt + " " + parseInt2);
            } catch (NumberFormatException unused) {
                sb2 = new StringBuilder();
            }
        }
        sb2.append("Ignoring malformed cell resolution: ");
        sb2.append(attributeValue);
        p.l(f10926p, sb2.toString());
        return aVar;
    }

    public final b H(XmlPullParser xmlPullParser) throws g {
        String attributeValue = xmlPullParser.getAttributeValue(f10927q, "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        float f10 = 1.0f;
        String attributeValue2 = xmlPullParser.getAttributeValue(f10927q, "frameRateMultiplier");
        if (attributeValue2 != null) {
            String[] R0 = q0.R0(attributeValue2, " ");
            if (R0.length == 2) {
                f10 = ((float) Integer.parseInt(R0[0])) / ((float) Integer.parseInt(R0[1]));
            } else {
                throw new g("frameRateMultiplier doesn't have 2 parts");
            }
        }
        b bVar = E;
        int i10 = bVar.f10941b;
        String attributeValue3 = xmlPullParser.getAttributeValue(f10927q, "subFrameRate");
        if (attributeValue3 != null) {
            i10 = Integer.parseInt(attributeValue3);
        }
        int i11 = bVar.f10942c;
        String attributeValue4 = xmlPullParser.getAttributeValue(f10927q, "tickRate");
        if (attributeValue4 != null) {
            i11 = Integer.parseInt(attributeValue4);
        }
        return new b(((float) parseInt) * f10, i10, i11);
    }

    public final Map<String, e> I(XmlPullParser xmlPullParser, Map<String, e> map, C0186a aVar, c cVar, Map<String, c> map2, Map<String, String> map3) throws IOException, XmlPullParserException {
        do {
            xmlPullParser.next();
            if (r0.f(xmlPullParser, "style")) {
                String a10 = r0.a(xmlPullParser, "style");
                e M = M(xmlPullParser, new e());
                if (a10 != null) {
                    for (String str : N(a10)) {
                        M.a(map.get(str));
                    }
                }
                if (M.g() != null) {
                    map.put(M.g(), M);
                }
            } else if (r0.f(xmlPullParser, "region")) {
                c L = L(xmlPullParser, aVar, cVar);
                if (L != null) {
                    map2.put(L.f10971a, L);
                }
            } else if (r0.f(xmlPullParser, "metadata")) {
                J(xmlPullParser, map3);
            }
        } while (!r0.d(xmlPullParser, b.f10946n));
        return map;
    }

    public final void J(XmlPullParser xmlPullParser, Map<String, String> map) throws IOException, XmlPullParserException {
        String a10;
        do {
            xmlPullParser.next();
            if (r0.f(xmlPullParser, b.f10957y) && (a10 = r0.a(xmlPullParser, "id")) != null) {
                map.put(a10, xmlPullParser.nextText());
            }
        } while (!r0.d(xmlPullParser, "metadata"));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final n7.b K(org.xmlpull.v1.XmlPullParser r21, n7.b r22, java.util.Map<java.lang.String, n7.c> r23, n7.a.b r24) throws h7.g {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r24
            int r4 = r21.getAttributeCount()
            r5 = 0
            n7.e r11 = r0.M(r1, r5)
            java.lang.String r9 = ""
            r12 = r5
            r14 = r12
            r13 = r9
            r5 = 0
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r15 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r17 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0026:
            if (r5 >= r4) goto L_0x00b7
            java.lang.String r6 = r1.getAttributeName(r5)
            java.lang.String r7 = r1.getAttributeValue(r5)
            r6.hashCode()
            int r19 = r6.hashCode()
            switch(r19) {
                case -934795532: goto L_0x0073;
                case 99841: goto L_0x0068;
                case 100571: goto L_0x005d;
                case 93616297: goto L_0x0052;
                case 109780401: goto L_0x0047;
                case 1292595405: goto L_0x003c;
                default: goto L_0x003a;
            }
        L_0x003a:
            r8 = -1
            goto L_0x007d
        L_0x003c:
            java.lang.String r8 = "backgroundImage"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x0045
            goto L_0x003a
        L_0x0045:
            r8 = 5
            goto L_0x007d
        L_0x0047:
            java.lang.String r8 = "style"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x0050
            goto L_0x003a
        L_0x0050:
            r8 = 4
            goto L_0x007d
        L_0x0052:
            java.lang.String r8 = "begin"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x005b
            goto L_0x003a
        L_0x005b:
            r8 = 3
            goto L_0x007d
        L_0x005d:
            java.lang.String r8 = "end"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x0066
            goto L_0x003a
        L_0x0066:
            r8 = 2
            goto L_0x007d
        L_0x0068:
            java.lang.String r8 = "dur"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x0071
            goto L_0x003a
        L_0x0071:
            r8 = 1
            goto L_0x007d
        L_0x0073:
            java.lang.String r8 = "region"
            boolean r6 = r6.equals(r8)
            if (r6 != 0) goto L_0x007c
            goto L_0x003a
        L_0x007c:
            r8 = 0
        L_0x007d:
            switch(r8) {
                case 0: goto L_0x00aa;
                case 1: goto L_0x00a5;
                case 2: goto L_0x00a0;
                case 3: goto L_0x0099;
                case 4: goto L_0x0090;
                case 5: goto L_0x0081;
                default: goto L_0x0080;
            }
        L_0x0080:
            goto L_0x009d
        L_0x0081:
            java.lang.String r6 = "#"
            boolean r6 = r7.startsWith(r6)
            if (r6 == 0) goto L_0x009d
            r6 = 1
            java.lang.String r6 = r7.substring(r6)
            r14 = r6
            goto L_0x009d
        L_0x0090:
            java.lang.String[] r6 = r0.N(r7)
            int r7 = r6.length
            if (r7 <= 0) goto L_0x009d
            r12 = r6
            goto L_0x009d
        L_0x0099:
            long r9 = O(r7, r3)
        L_0x009d:
            r6 = r23
            goto L_0x00b3
        L_0x00a0:
            long r15 = O(r7, r3)
            goto L_0x009d
        L_0x00a5:
            long r17 = O(r7, r3)
            goto L_0x009d
        L_0x00aa:
            r6 = r23
            boolean r8 = r6.containsKey(r7)
            if (r8 == 0) goto L_0x00b3
            r13 = r7
        L_0x00b3:
            int r5 = r5 + 1
            goto L_0x0026
        L_0x00b7:
            if (r2 == 0) goto L_0x00cf
            long r3 = r2.f10962d
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x00d4
            int r7 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x00c9
            long r9 = r9 + r3
        L_0x00c9:
            int r7 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x00d4
            long r15 = r15 + r3
            goto L_0x00d4
        L_0x00cf:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x00d4:
            r7 = r9
            int r3 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x00ec
            int r3 = (r17 > r5 ? 1 : (r17 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x00e2
            long r17 = r7 + r17
            r9 = r17
            goto L_0x00ed
        L_0x00e2:
            if (r2 == 0) goto L_0x00ec
            long r2 = r2.f10963e
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x00ec
            r9 = r2
            goto L_0x00ed
        L_0x00ec:
            r9 = r15
        L_0x00ed:
            java.lang.String r6 = r21.getName()
            n7.b r1 = n7.b.c(r6, r7, r9, r11, r12, r13, r14)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n7.a.K(org.xmlpull.v1.XmlPullParser, n7.b, java.util.Map, n7.a$b):n7.b");
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x013b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final n7.c L(org.xmlpull.v1.XmlPullParser r18, n7.a.C0186a r19, n7.a.c r20) {
        /*
            r17 = this;
            r0 = r18
            r1 = r20
            java.lang.String r2 = "id"
            java.lang.String r4 = w7.r0.a(r0, r2)
            r2 = 0
            if (r4 != 0) goto L_0x000e
            return r2
        L_0x000e:
            java.lang.String r3 = "origin"
            java.lang.String r3 = w7.r0.a(r0, r3)
            java.lang.String r5 = "TtmlDecoder"
            if (r3 == 0) goto L_0x014e
            java.util.regex.Pattern r6 = A
            java.util.regex.Matcher r7 = r6.matcher(r3)
            java.util.regex.Pattern r8 = B
            java.util.regex.Matcher r9 = r8.matcher(r3)
            boolean r10 = r7.matches()
            java.lang.String r11 = "Ignoring region with malformed origin: "
            java.lang.String r12 = "Ignoring region with missing tts:extent: "
            r13 = 1120403456(0x42c80000, float:100.0)
            r14 = 2
            r15 = 1
            if (r10 == 0) goto L_0x005d
            java.lang.String r9 = r7.group(r15)     // Catch:{ NumberFormatException -> 0x004a }
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x004a }
            float r9 = r9 / r13
            java.lang.String r7 = r7.group(r14)     // Catch:{ NumberFormatException -> 0x004a }
            float r7 = java.lang.Float.parseFloat(r7)     // Catch:{ NumberFormatException -> 0x004a }
            float r7 = r7 / r13
            r16 = r9
            r9 = r7
            r7 = r16
            goto L_0x0088
        L_0x004a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L_0x004f:
            r0.append(r11)
        L_0x0052:
            r0.append(r3)
            java.lang.String r0 = r0.toString()
        L_0x0059:
            w7.p.l(r5, r0)
            return r2
        L_0x005d:
            boolean r7 = r9.matches()
            if (r7 == 0) goto L_0x0146
            if (r1 != 0) goto L_0x006e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L_0x006a:
            r0.append(r12)
            goto L_0x0052
        L_0x006e:
            java.lang.String r7 = r9.group(r15)     // Catch:{ NumberFormatException -> 0x013f }
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x013f }
            java.lang.String r9 = r9.group(r14)     // Catch:{ NumberFormatException -> 0x013f }
            int r9 = java.lang.Integer.parseInt(r9)     // Catch:{ NumberFormatException -> 0x013f }
            float r7 = (float) r7     // Catch:{ NumberFormatException -> 0x013f }
            int r10 = r1.f10943a     // Catch:{ NumberFormatException -> 0x013f }
            float r10 = (float) r10     // Catch:{ NumberFormatException -> 0x013f }
            float r7 = r7 / r10
            float r9 = (float) r9     // Catch:{ NumberFormatException -> 0x013f }
            int r10 = r1.f10944b     // Catch:{ NumberFormatException -> 0x013f }
            float r10 = (float) r10
            float r9 = r9 / r10
        L_0x0088:
            java.lang.String r10 = "extent"
            java.lang.String r10 = w7.r0.a(r0, r10)
            if (r10 == 0) goto L_0x013b
            java.util.regex.Matcher r6 = r6.matcher(r10)
            java.util.regex.Matcher r8 = r8.matcher(r10)
            boolean r10 = r6.matches()
            java.lang.String r11 = "Ignoring region with malformed extent: "
            if (r10 == 0) goto L_0x00ba
            java.lang.String r1 = r6.group(r15)     // Catch:{ NumberFormatException -> 0x00b4 }
            float r1 = java.lang.Float.parseFloat(r1)     // Catch:{ NumberFormatException -> 0x00b4 }
            float r1 = r1 / r13
            java.lang.String r6 = r6.group(r14)     // Catch:{ NumberFormatException -> 0x00b4 }
            float r2 = java.lang.Float.parseFloat(r6)     // Catch:{ NumberFormatException -> 0x00b4 }
            float r2 = r2 / r13
            r10 = r2
            goto L_0x00e4
        L_0x00b4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            goto L_0x004f
        L_0x00ba:
            boolean r6 = r8.matches()
            if (r6 == 0) goto L_0x012f
            if (r1 != 0) goto L_0x00c8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            goto L_0x006a
        L_0x00c8:
            java.lang.String r6 = r8.group(r15)     // Catch:{ NumberFormatException -> 0x0128 }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x0128 }
            java.lang.String r8 = r8.group(r14)     // Catch:{ NumberFormatException -> 0x0128 }
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x0128 }
            float r6 = (float) r6     // Catch:{ NumberFormatException -> 0x0128 }
            int r10 = r1.f10943a     // Catch:{ NumberFormatException -> 0x0128 }
            float r10 = (float) r10     // Catch:{ NumberFormatException -> 0x0128 }
            float r6 = r6 / r10
            float r8 = (float) r8     // Catch:{ NumberFormatException -> 0x0128 }
            int r1 = r1.f10944b     // Catch:{ NumberFormatException -> 0x0128 }
            float r1 = (float) r1
            float r8 = r8 / r1
            r1 = r6
            r10 = r8
        L_0x00e4:
            r2 = 0
            java.lang.String r3 = "displayAlign"
            java.lang.String r0 = w7.r0.a(r0, r3)
            if (r0 == 0) goto L_0x0111
            java.lang.String r0 = w7.q0.Y0(r0)
            r0.hashCode()
            java.lang.String r3 = "center"
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L_0x0109
            java.lang.String r3 = "after"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0105
            goto L_0x0111
        L_0x0105:
            float r9 = r9 + r10
            r6 = r9
            r8 = r14
            goto L_0x0113
        L_0x0109:
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = r10 / r0
            float r9 = r9 + r0
            r6 = r9
            r8 = r15
            goto L_0x0113
        L_0x0111:
            r8 = r2
            r6 = r9
        L_0x0113:
            r0 = 1065353216(0x3f800000, float:1.0)
            r2 = r19
            int r2 = r2.f10939b
            float r2 = (float) r2
            float r12 = r0 / r2
            n7.c r0 = new n7.c
            r2 = 0
            r11 = 1
            r3 = r0
            r5 = r7
            r7 = r2
            r9 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
        L_0x0128:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            goto L_0x004f
        L_0x012f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Ignoring region with unsupported extent: "
        L_0x0136:
            r0.append(r1)
            goto L_0x0052
        L_0x013b:
            java.lang.String r0 = "Ignoring region without an extent"
            goto L_0x0059
        L_0x013f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            goto L_0x004f
        L_0x0146:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Ignoring region with unsupported origin: "
            goto L_0x0136
        L_0x014e:
            java.lang.String r0 = "Ignoring region without an origin"
            goto L_0x0059
        */
        throw new UnsupportedOperationException("Method not decompiled: n7.a.L(org.xmlpull.v1.XmlPullParser, n7.a$a, n7.a$c):n7.c");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0112, code lost:
        if (r3.equals(n7.b.O) == false) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0178, code lost:
        if (r3.equals(n7.b.X) == false) goto L_0x0170;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final n7.e M(org.xmlpull.v1.XmlPullParser r12, n7.e r13) {
        /*
            r11 = this;
            int r0 = r12.getAttributeCount()
            r1 = 0
            r2 = r1
        L_0x0006:
            if (r2 >= r0) goto L_0x01de
            java.lang.String r3 = r12.getAttributeValue(r2)
            java.lang.String r4 = r12.getAttributeName(r2)
            r4.hashCode()
            int r5 = r4.hashCode()
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = -1
            r10 = 1
            switch(r5) {
                case -1550943582: goto L_0x007c;
                case -1224696685: goto L_0x0071;
                case -1065511464: goto L_0x0066;
                case -879295043: goto L_0x005b;
                case -734428249: goto L_0x0050;
                case 3355: goto L_0x0045;
                case 94842723: goto L_0x003a;
                case 365601008: goto L_0x002f;
                case 1287124693: goto L_0x0022;
                default: goto L_0x001f;
            }
        L_0x001f:
            r4 = r9
            goto L_0x0086
        L_0x0022:
            java.lang.String r5 = "backgroundColor"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x002b
            goto L_0x001f
        L_0x002b:
            r4 = 8
            goto L_0x0086
        L_0x002f:
            java.lang.String r5 = "fontSize"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0038
            goto L_0x001f
        L_0x0038:
            r4 = 7
            goto L_0x0086
        L_0x003a:
            java.lang.String r5 = "color"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0043
            goto L_0x001f
        L_0x0043:
            r4 = 6
            goto L_0x0086
        L_0x0045:
            java.lang.String r5 = "id"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x004e
            goto L_0x001f
        L_0x004e:
            r4 = 5
            goto L_0x0086
        L_0x0050:
            java.lang.String r5 = "fontWeight"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0059
            goto L_0x001f
        L_0x0059:
            r4 = r6
            goto L_0x0086
        L_0x005b:
            java.lang.String r5 = "textDecoration"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0064
            goto L_0x001f
        L_0x0064:
            r4 = r7
            goto L_0x0086
        L_0x0066:
            java.lang.String r5 = "textAlign"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x006f
            goto L_0x001f
        L_0x006f:
            r4 = r8
            goto L_0x0086
        L_0x0071:
            java.lang.String r5 = "fontFamily"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x007a
            goto L_0x001f
        L_0x007a:
            r4 = r10
            goto L_0x0086
        L_0x007c:
            java.lang.String r5 = "fontStyle"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0085
            goto L_0x001f
        L_0x0085:
            r4 = r1
        L_0x0086:
            java.lang.String r5 = "TtmlDecoder"
            switch(r4) {
                case 0: goto L_0x01cc;
                case 1: goto L_0x01c3;
                case 2: goto L_0x0162;
                case 3: goto L_0x00fc;
                case 4: goto L_0x00ec;
                case 5: goto L_0x00d6;
                case 6: goto L_0x00c1;
                case 7: goto L_0x00a2;
                case 8: goto L_0x008d;
                default: goto L_0x008b;
            }
        L_0x008b:
            goto L_0x01da
        L_0x008d:
            n7.e r13 = r11.C(r13)
            int r4 = w7.e.d(r3)     // Catch:{ IllegalArgumentException -> 0x009a }
            r13.p(r4)     // Catch:{ IllegalArgumentException -> 0x009a }
            goto L_0x01da
        L_0x009a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Failed parsing background value: "
            goto L_0x00b2
        L_0x00a2:
            n7.e r13 = r11.C(r13)     // Catch:{ g -> 0x00ab }
            G(r3, r13)     // Catch:{ g -> 0x00ab }
            goto L_0x01da
        L_0x00ab:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Failed parsing fontSize value: "
        L_0x00b2:
            r4.append(r6)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            w7.p.l(r5, r3)
            goto L_0x01da
        L_0x00c1:
            n7.e r13 = r11.C(r13)
            int r4 = w7.e.d(r3)     // Catch:{ IllegalArgumentException -> 0x00ce }
            r13.r(r4)     // Catch:{ IllegalArgumentException -> 0x00ce }
            goto L_0x01da
        L_0x00ce:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Failed parsing color value: "
            goto L_0x00b2
        L_0x00d6:
            java.lang.String r4 = r12.getName()
            java.lang.String r5 = "style"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x01da
            n7.e r13 = r11.C(r13)
            n7.e r13 = r13.v(r3)
            goto L_0x01da
        L_0x00ec:
            n7.e r13 = r11.C(r13)
            java.lang.String r4 = "bold"
            boolean r3 = r4.equalsIgnoreCase(r3)
            n7.e r13 = r13.q(r3)
            goto L_0x01da
        L_0x00fc:
            java.lang.String r3 = w7.q0.Y0(r3)
            r3.hashCode()
            int r4 = r3.hashCode()
            switch(r4) {
                case -1461280213: goto L_0x012b;
                case -1026963764: goto L_0x0120;
                case 913457136: goto L_0x0115;
                case 1679736913: goto L_0x010c;
                default: goto L_0x010a;
            }
        L_0x010a:
            r7 = r9
            goto L_0x0135
        L_0x010c:
            java.lang.String r4 = "linethrough"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0135
            goto L_0x010a
        L_0x0115:
            java.lang.String r4 = "nolinethrough"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x011e
            goto L_0x010a
        L_0x011e:
            r7 = r8
            goto L_0x0135
        L_0x0120:
            java.lang.String r4 = "underline"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0129
            goto L_0x010a
        L_0x0129:
            r7 = r10
            goto L_0x0135
        L_0x012b:
            java.lang.String r4 = "nounderline"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0134
            goto L_0x010a
        L_0x0134:
            r7 = r1
        L_0x0135:
            switch(r7) {
                case 0: goto L_0x0158;
                case 1: goto L_0x014e;
                case 2: goto L_0x0144;
                case 3: goto L_0x013a;
                default: goto L_0x0138;
            }
        L_0x0138:
            goto L_0x01da
        L_0x013a:
            n7.e r13 = r11.C(r13)
            n7.e r13 = r13.x(r10)
            goto L_0x01da
        L_0x0144:
            n7.e r13 = r11.C(r13)
            n7.e r13 = r13.x(r1)
            goto L_0x01da
        L_0x014e:
            n7.e r13 = r11.C(r13)
            n7.e r13 = r13.z(r10)
            goto L_0x01da
        L_0x0158:
            n7.e r13 = r11.C(r13)
            n7.e r13 = r13.z(r1)
            goto L_0x01da
        L_0x0162:
            java.lang.String r3 = w7.q0.Y0(r3)
            r3.hashCode()
            int r4 = r3.hashCode()
            switch(r4) {
                case -1364013995: goto L_0x019c;
                case 100571: goto L_0x0191;
                case 3317767: goto L_0x0186;
                case 108511772: goto L_0x017b;
                case 109757538: goto L_0x0172;
                default: goto L_0x0170;
            }
        L_0x0170:
            r6 = r9
            goto L_0x01a6
        L_0x0172:
            java.lang.String r4 = "start"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x01a6
            goto L_0x0170
        L_0x017b:
            java.lang.String r4 = "right"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0184
            goto L_0x0170
        L_0x0184:
            r6 = r7
            goto L_0x01a6
        L_0x0186:
            java.lang.String r4 = "left"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x018f
            goto L_0x0170
        L_0x018f:
            r6 = r8
            goto L_0x01a6
        L_0x0191:
            java.lang.String r4 = "end"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x019a
            goto L_0x0170
        L_0x019a:
            r6 = r10
            goto L_0x01a6
        L_0x019c:
            java.lang.String r4 = "center"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x01a5
            goto L_0x0170
        L_0x01a5:
            r6 = r1
        L_0x01a6:
            switch(r6) {
                case 0: goto L_0x01bc;
                case 1: goto L_0x01aa;
                case 2: goto L_0x01b1;
                case 3: goto L_0x01aa;
                case 4: goto L_0x01b1;
                default: goto L_0x01a9;
            }
        L_0x01a9:
            goto L_0x01da
        L_0x01aa:
            n7.e r13 = r11.C(r13)
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            goto L_0x01b7
        L_0x01b1:
            n7.e r13 = r11.C(r13)
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_NORMAL
        L_0x01b7:
            n7.e r13 = r13.y(r3)
            goto L_0x01da
        L_0x01bc:
            n7.e r13 = r11.C(r13)
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_CENTER
            goto L_0x01b7
        L_0x01c3:
            n7.e r13 = r11.C(r13)
            n7.e r13 = r13.s(r3)
            goto L_0x01da
        L_0x01cc:
            n7.e r13 = r11.C(r13)
            java.lang.String r4 = "italic"
            boolean r3 = r4.equalsIgnoreCase(r3)
            n7.e r13 = r13.w(r3)
        L_0x01da:
            int r2 = r2 + 1
            goto L_0x0006
        L_0x01de:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: n7.a.M(org.xmlpull.v1.XmlPullParser, n7.e):n7.e");
    }

    public final String[] N(String str) {
        String trim = str.trim();
        return trim.isEmpty() ? new String[0] : q0.R0(trim, "\\s+");
    }

    public final c P(XmlPullParser xmlPullParser) {
        StringBuilder sb2;
        String str;
        String a10 = r0.a(xmlPullParser, b.E);
        if (a10 == null) {
            return null;
        }
        Matcher matcher = B.matcher(a10);
        if (!matcher.matches()) {
            sb2 = new StringBuilder();
            str = "Ignoring non-pixel tts extent: ";
        } else {
            try {
                return new c(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)));
            } catch (NumberFormatException unused) {
                sb2 = new StringBuilder();
                str = "Ignoring malformed tts extent: ";
            }
        }
        sb2.append(str);
        sb2.append(a10);
        p.l(f10926p, sb2.toString());
        return null;
    }
}
