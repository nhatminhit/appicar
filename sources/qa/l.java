package qa;

import java.util.Map;
import lb.b0;
import lb.d;
import lb.f;
import lb.h;
import lb.j;
import lb.o;
import lb.u;
import ra.c;
import ya.b;

public final class l implements v {

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f22177a;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|(3:25|26|28)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                qa.a[] r0 = qa.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f22177a = r0
                qa.a r1 = qa.a.EAN_8     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f22177a     // Catch:{ NoSuchFieldError -> 0x001d }
                qa.a r1 = qa.a.UPC_E     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f22177a     // Catch:{ NoSuchFieldError -> 0x0028 }
                qa.a r1 = qa.a.EAN_13     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f22177a     // Catch:{ NoSuchFieldError -> 0x0033 }
                qa.a r1 = qa.a.UPC_A     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f22177a     // Catch:{ NoSuchFieldError -> 0x003e }
                qa.a r1 = qa.a.QR_CODE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f22177a     // Catch:{ NoSuchFieldError -> 0x0049 }
                qa.a r1 = qa.a.CODE_39     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f22177a     // Catch:{ NoSuchFieldError -> 0x0054 }
                qa.a r1 = qa.a.CODE_93     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f22177a     // Catch:{ NoSuchFieldError -> 0x0060 }
                qa.a r1 = qa.a.CODE_128     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f22177a     // Catch:{ NoSuchFieldError -> 0x006c }
                qa.a r1 = qa.a.ITF     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f22177a     // Catch:{ NoSuchFieldError -> 0x0078 }
                qa.a r1 = qa.a.PDF_417     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f22177a     // Catch:{ NoSuchFieldError -> 0x0084 }
                qa.a r1 = qa.a.CODABAR     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f22177a     // Catch:{ NoSuchFieldError -> 0x0090 }
                qa.a r1 = qa.a.DATA_MATRIX     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f22177a     // Catch:{ NoSuchFieldError -> 0x009c }
                qa.a r1 = qa.a.AZTEC     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qa.l.a.<clinit>():void");
        }
    }

    public b a(String str, a aVar, int i10, int i11) throws w {
        return b(str, aVar, i10, i11, (Map<g, ?>) null);
    }

    public b b(String str, a aVar, int i10, int i11, Map<g, ?> map) throws w {
        v vVar;
        switch (a.f22177a[aVar.ordinal()]) {
            case 1:
                vVar = new lb.l();
                break;
            case 2:
                vVar = new b0();
                break;
            case 3:
                vVar = new j();
                break;
            case 4:
                vVar = new u();
                break;
            case 5:
                vVar = new ub.b();
                break;
            case 6:
                vVar = new f();
                break;
            case 7:
                vVar = new h();
                break;
            case 8:
                vVar = new d();
                break;
            case 9:
                vVar = new o();
                break;
            case 10:
                vVar = new pb.d();
                break;
            case 11:
                vVar = new lb.b();
                break;
            case 12:
                vVar = new bb.b();
                break;
            case 13:
                vVar = new c();
                break;
            default:
                throw new IllegalArgumentException("No encoder available for format ".concat(String.valueOf(aVar)));
        }
        return vVar.b(str, aVar, i10, i11, map);
    }
}
