package wd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONObject;
import wd.a;
import wd.e;

public final class c implements e {

    /* renamed from: j  reason: collision with root package name */
    public static final Logger f24033j = Logger.getLogger(c.class.getName());

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public d f24034a;

        /* renamed from: b  reason: collision with root package name */
        public List<byte[]> f24035b = new ArrayList();

        public a(d dVar) {
            this.f24034a = dVar;
        }

        public void a() {
            this.f24034a = null;
            this.f24035b = new ArrayList();
        }

        public d b(byte[] bArr) {
            this.f24035b.add(bArr);
            int size = this.f24035b.size();
            d dVar = this.f24034a;
            if (size != dVar.f24042e) {
                return null;
            }
            List<byte[]> list = this.f24035b;
            d d10 = a.d(dVar, (byte[][]) list.toArray(new byte[list.size()][]));
            a();
            return d10;
        }
    }

    public static final class b implements e.a {

        /* renamed from: a  reason: collision with root package name */
        public a f24036a = null;

        /* renamed from: b  reason: collision with root package name */
        public e.a.C0479a f24037b;

        /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
            r1.f24039b = java.lang.Integer.parseInt(r3.toString());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00bf, code lost:
            throw new wd.b("invalid payload");
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static wd.d d(java.lang.String r9) {
            /*
                int r0 = r9.length()
                wd.d r1 = new wd.d
                r2 = 0
                char r3 = r9.charAt(r2)
                int r3 = java.lang.Character.getNumericValue(r3)
                r1.<init>(r3)
                int r3 = r1.f24038a
                if (r3 < 0) goto L_0x011f
                java.lang.String[] r4 = wd.e.f24051i
                int r4 = r4.length
                r5 = 1
                int r4 = r4 - r5
                if (r3 > r4) goto L_0x011f
                r4 = 5
                if (r4 == r3) goto L_0x0026
                r4 = 6
                if (r4 != r3) goto L_0x0024
                goto L_0x0026
            L_0x0024:
                r4 = r2
                goto L_0x0051
            L_0x0026:
                java.lang.String r3 = "-"
                boolean r3 = r9.contains(r3)
                if (r3 == 0) goto L_0x0117
                if (r0 <= r5) goto L_0x0117
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r4 = r2
            L_0x0036:
                int r4 = r4 + r5
                char r6 = r9.charAt(r4)
                r7 = 45
                if (r6 == r7) goto L_0x0047
                char r6 = r9.charAt(r4)
                r3.append(r6)
                goto L_0x0036
            L_0x0047:
                java.lang.String r3 = r3.toString()
                int r3 = java.lang.Integer.parseInt(r3)
                r1.f24042e = r3
            L_0x0051:
                int r3 = r4 + 1
                if (r0 <= r3) goto L_0x0078
                r6 = 47
                char r3 = r9.charAt(r3)
                if (r6 != r3) goto L_0x0078
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
            L_0x0062:
                int r4 = r4 + r5
                char r6 = r9.charAt(r4)
                r7 = 44
                if (r7 != r6) goto L_0x006c
                goto L_0x0073
            L_0x006c:
                r3.append(r6)
                int r6 = r4 + 1
                if (r6 != r0) goto L_0x0062
            L_0x0073:
                java.lang.String r3 = r3.toString()
                goto L_0x007a
            L_0x0078:
                java.lang.String r3 = "/"
            L_0x007a:
                r1.f24040c = r3
                int r3 = r4 + 1
                java.lang.String r6 = "invalid payload"
                if (r0 <= r3) goto L_0x00c0
                char r3 = r9.charAt(r3)
                java.lang.Character r3 = java.lang.Character.valueOf(r3)
                char r3 = r3.charValue()
                int r3 = java.lang.Character.getNumericValue(r3)
                r7 = -1
                if (r3 <= r7) goto L_0x00c0
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
            L_0x009a:
                int r4 = r4 + r5
                char r7 = r9.charAt(r4)
                int r8 = java.lang.Character.getNumericValue(r7)
                if (r8 >= 0) goto L_0x00a8
                int r4 = r4 + -1
                goto L_0x00af
            L_0x00a8:
                r3.append(r7)
                int r7 = r4 + 1
                if (r7 != r0) goto L_0x009a
            L_0x00af:
                java.lang.String r3 = r3.toString()     // Catch:{ NumberFormatException -> 0x00ba }
                int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x00ba }
                r1.f24039b = r3     // Catch:{ NumberFormatException -> 0x00ba }
                goto L_0x00c0
            L_0x00ba:
                wd.b r9 = new wd.b
                r9.<init>(r6)
                throw r9
            L_0x00c0:
                int r4 = r4 + r5
                if (r0 <= r4) goto L_0x00f6
                r9.charAt(r4)     // Catch:{ JSONException -> 0x00e4 }
                org.json.JSONTokener r0 = new org.json.JSONTokener     // Catch:{ JSONException -> 0x00e4 }
                java.lang.String r3 = r9.substring(r4)     // Catch:{ JSONException -> 0x00e4 }
                r0.<init>(r3)     // Catch:{ JSONException -> 0x00e4 }
                java.lang.Object r0 = r0.nextValue()     // Catch:{ JSONException -> 0x00e4 }
                r1.f24041d = r0     // Catch:{ JSONException -> 0x00e4 }
                int r3 = r1.f24038a
                boolean r0 = e(r3, r0)
                if (r0 == 0) goto L_0x00de
                goto L_0x00f6
            L_0x00de:
                wd.b r9 = new wd.b
                r9.<init>(r6)
                throw r9
            L_0x00e4:
                r9 = move-exception
                java.util.logging.Logger r0 = wd.c.f24033j
                java.util.logging.Level r1 = java.util.logging.Level.WARNING
                java.lang.String r2 = "An error occured while retrieving data from JSONTokener"
                r0.log(r1, r2, r9)
                wd.b r9 = new wd.b
                r9.<init>(r6)
                throw r9
            L_0x00f6:
                java.util.logging.Logger r0 = wd.c.f24033j
                java.util.logging.Level r3 = java.util.logging.Level.FINE
                boolean r0 = r0.isLoggable(r3)
                if (r0 == 0) goto L_0x0116
                java.util.logging.Logger r0 = wd.c.f24033j
                r3 = 2
                java.lang.Object[] r3 = new java.lang.Object[r3]
                r3[r2] = r9
                r3[r5] = r1
                java.lang.String r9 = "decoded %s as %s"
                java.lang.String r9 = java.lang.String.format(r9, r3)
                r0.fine(r9)
            L_0x0116:
                return r1
            L_0x0117:
                wd.b r9 = new wd.b
                java.lang.String r0 = "illegal attachments"
                r9.<init>(r0)
                throw r9
            L_0x011f:
                wd.b r9 = new wd.b
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "unknown packet type "
                r0.append(r2)
                int r1 = r1.f24038a
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r9.<init>(r0)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: wd.c.b.d(java.lang.String):wd.d");
        }

        public static boolean e(int i10, Object obj) {
            switch (i10) {
                case 0:
                case 4:
                    return obj instanceof JSONObject;
                case 1:
                    return obj == null;
                case 2:
                case 5:
                    if (obj instanceof JSONArray) {
                        JSONArray jSONArray = (JSONArray) obj;
                        if (jSONArray.length() > 0 && !jSONArray.isNull(0)) {
                            return true;
                        }
                    }
                    return false;
                case 3:
                case 6:
                    return obj instanceof JSONArray;
                default:
                    return false;
            }
        }

        public void a(e.a.C0479a aVar) {
            this.f24037b = aVar;
        }

        public void b(byte[] bArr) {
            a aVar = this.f24036a;
            if (aVar != null) {
                d b10 = aVar.b(bArr);
                if (b10 != null) {
                    this.f24036a = null;
                    e.a.C0479a aVar2 = this.f24037b;
                    if (aVar2 != null) {
                        aVar2.a(b10);
                        return;
                    }
                    return;
                }
                return;
            }
            throw new RuntimeException("got binary data when not reconstructing a packet");
        }

        public void c(String str) {
            e.a.C0479a aVar;
            d d10 = d(str);
            int i10 = d10.f24038a;
            if (5 == i10 || 6 == i10) {
                a aVar2 = new a(d10);
                this.f24036a = aVar2;
                if (aVar2.f24034a.f24042e != 0 || (aVar = this.f24037b) == null) {
                    return;
                }
            } else {
                aVar = this.f24037b;
                if (aVar == null) {
                    return;
                }
            }
            aVar.a(d10);
        }

        public void destroy() {
            a aVar = this.f24036a;
            if (aVar != null) {
                aVar.a();
            }
            this.f24037b = null;
        }
    }

    /* renamed from: wd.c$c  reason: collision with other inner class name */
    public static final class C0478c implements e.b {
        public void a(d dVar, e.b.a aVar) {
            int i10 = dVar.f24038a;
            if ((i10 == 2 || i10 == 3) && ud.a.b(dVar.f24041d)) {
                dVar.f24038a = dVar.f24038a == 2 ? 5 : 6;
            }
            if (c.f24033j.isLoggable(Level.FINE)) {
                c.f24033j.fine(String.format("encoding packet %s", new Object[]{dVar}));
            }
            int i11 = dVar.f24038a;
            if (5 == i11 || 6 == i11) {
                b(dVar, aVar);
            } else {
                aVar.c(new String[]{c(dVar)});
            }
        }

        public final void b(d dVar, e.b.a aVar) {
            a.C0477a c10 = a.c(dVar);
            String c11 = c(c10.f24031a);
            ArrayList arrayList = new ArrayList(Arrays.asList(c10.f24032b));
            arrayList.add(0, c11);
            aVar.c(arrayList.toArray());
        }

        public final String c(d dVar) {
            StringBuilder sb2 = new StringBuilder("" + dVar.f24038a);
            int i10 = dVar.f24038a;
            if (5 == i10 || 6 == i10) {
                sb2.append(dVar.f24042e);
                sb2.append("-");
            }
            String str = dVar.f24040c;
            if (!(str == null || str.length() == 0 || "/".equals(dVar.f24040c))) {
                sb2.append(dVar.f24040c);
                sb2.append(",");
            }
            int i11 = dVar.f24039b;
            if (i11 >= 0) {
                sb2.append(i11);
            }
            T t10 = dVar.f24041d;
            if (t10 != null) {
                sb2.append(t10);
            }
            if (c.f24033j.isLoggable(Level.FINE)) {
                c.f24033j.fine(String.format("encoded %s as %s", new Object[]{dVar, sb2}));
            }
            return sb2.toString();
        }
    }
}
