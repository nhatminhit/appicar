package lf;

import be.z0;
import fh.g;
import gf.v;
import java.util.LinkedHashMap;
import java.util.Map;
import xe.n0;
import xe.w;
import zd.d0;
import zd.f0;

public enum b {
    UNDEFINED(-1),
    LEFT_TO_RIGHT(0),
    RIGHT_TO_LEFT(1),
    RIGHT_TO_LEFT_ARABIC(2),
    EUROPEAN_NUMBER(3),
    EUROPEAN_NUMBER_SEPARATOR(4),
    EUROPEAN_NUMBER_TERMINATOR(5),
    ARABIC_NUMBER(6),
    COMMON_NUMBER_SEPARATOR(7),
    NONSPACING_MARK(8),
    BOUNDARY_NEUTRAL(9),
    PARAGRAPH_SEPARATOR(10),
    SEGMENT_SEPARATOR(11),
    WHITESPACE(12),
    OTHER_NEUTRALS(13),
    LEFT_TO_RIGHT_EMBEDDING(14),
    LEFT_TO_RIGHT_OVERRIDE(15),
    RIGHT_TO_LEFT_EMBEDDING(16),
    RIGHT_TO_LEFT_OVERRIDE(17),
    POP_DIRECTIONAL_FORMAT(18);
    
    @g
    public static final C0359b P = null;
    @g
    public static final d0<Map<Integer, b>> Q = null;
    public final int O;

    public static final class a extends n0 implements we.a<Map<Integer, ? extends b>> {
        public static final a P = null;

        static {
            P = new a();
        }

        public a() {
            super(0);
        }

        @g
        /* renamed from: c */
        public final Map<Integer, b> n() {
            b[] values = b.values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(v.u(z0.j(values.length), 16));
            for (b bVar : values) {
                linkedHashMap.put(Integer.valueOf(bVar.d()), bVar);
            }
            return linkedHashMap;
        }
    }

    /* renamed from: lf.b$b  reason: collision with other inner class name */
    public static final class C0359b {
        public C0359b() {
        }

        public /* synthetic */ C0359b(w wVar) {
            this();
        }

        public final Map<Integer, b> a() {
            return (Map) b.Q.getValue();
        }

        @g
        public final b b(int i10) {
            b bVar = a().get(Integer.valueOf(i10));
            if (bVar != null) {
                return bVar;
            }
            throw new IllegalArgumentException("Directionality #" + i10 + " is not defined.");
        }
    }

    /* access modifiers changed from: public */
    static {
        P = new C0359b((w) null);
        Q = f0.b(a.P);
    }

    /* access modifiers changed from: public */
    b(int i10) {
        this.O = i10;
    }

    public final int d() {
        return this.O;
    }
}
