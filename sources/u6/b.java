package u6;

import com.google.android.exoplayer2.Format;
import w7.s;

public interface b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f13754a = new a();

    public static class a implements b {
        public a a(Format format) {
            String str = format.W;
            str.hashCode();
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1348231605:
                    if (str.equals(s.f14830p0)) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1248341703:
                    if (str.equals(s.Z)) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 1154383568:
                    if (str.equals(s.f14824m0)) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 1652648887:
                    if (str.equals(s.f14820k0)) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    return new w6.a();
                case 1:
                    return new x6.b();
                case 2:
                    return new v6.a();
                case 3:
                    return new y6.a();
                default:
                    throw new IllegalArgumentException("Attempted to create decoder for unsupported format");
            }
        }

        public boolean b(Format format) {
            String str = format.W;
            return s.Z.equals(str) || s.f14824m0.equals(str) || s.f14820k0.equals(str) || s.f14830p0.equals(str);
        }
    }

    a a(Format format);

    boolean b(Format format);
}
