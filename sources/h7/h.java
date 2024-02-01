package h7;

import com.google.android.exoplayer2.Format;
import i7.c;
import p7.b;
import p7.g;
import w7.s;

public interface h {

    /* renamed from: a  reason: collision with root package name */
    public static final h f8897a = new a();

    public static class a implements h {
        public f a(Format format) {
            String str = format.W;
            str.hashCode();
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals(s.f14826n0)) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1248334819:
                    if (str.equals(s.f14818j0)) {
                        c10 = 1;
                        break;
                    }
                    break;
                case -1026075066:
                    if (str.equals(s.f14810f0)) {
                        c10 = 2;
                        break;
                    }
                    break;
                case -1004728940:
                    if (str.equals(s.S)) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 691401887:
                    if (str.equals(s.f14808e0)) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 822864842:
                    if (str.equals(s.T)) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 930165504:
                    if (str.equals(s.f14812g0)) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 1566015601:
                    if (str.equals(s.f14800a0)) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 1566016562:
                    if (str.equals(s.f14802b0)) {
                        c10 = 8;
                        break;
                    }
                    break;
                case 1668750253:
                    if (str.equals(s.f14804c0)) {
                        c10 = 9;
                        break;
                    }
                    break;
                case 1693976202:
                    if (str.equals(s.f14806d0)) {
                        c10 = 10;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    return new j7.a(format.Y);
                case 1:
                    return new k7.a();
                case 2:
                    return new b();
                case 3:
                    return new g();
                case 4:
                    return new o7.a(format.Y);
                case 5:
                    return new l7.a(format.Y);
                case 6:
                case 7:
                    return new i7.a(format.W, format.f5083p0);
                case 8:
                    return new c(format.f5083p0, format.Y);
                case 9:
                    return new m7.a();
                case 10:
                    return new n7.a();
                default:
                    throw new IllegalArgumentException("Attempted to create decoder for unsupported format");
            }
        }

        public boolean b(Format format) {
            String str = format.W;
            return s.S.equals(str) || s.T.equals(str) || s.f14806d0.equals(str) || s.f14810f0.equals(str) || s.f14804c0.equals(str) || s.f14808e0.equals(str) || s.f14800a0.equals(str) || s.f14812g0.equals(str) || s.f14802b0.equals(str) || s.f14826n0.equals(str) || s.f14818j0.equals(str);
        }
    }

    f a(Format format);

    boolean b(Format format);
}
