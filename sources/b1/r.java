package b1;

import java.nio.CharBuffer;
import java.util.Locale;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static final q f4089a = new e((c) null, false);

    /* renamed from: b  reason: collision with root package name */
    public static final q f4090b = new e((c) null, true);

    /* renamed from: c  reason: collision with root package name */
    public static final q f4091c;

    /* renamed from: d  reason: collision with root package name */
    public static final q f4092d;

    /* renamed from: e  reason: collision with root package name */
    public static final q f4093e = new e(a.f4098b, false);

    /* renamed from: f  reason: collision with root package name */
    public static final q f4094f = f.f4103b;

    /* renamed from: g  reason: collision with root package name */
    public static final int f4095g = 0;

    /* renamed from: h  reason: collision with root package name */
    public static final int f4096h = 1;

    /* renamed from: i  reason: collision with root package name */
    public static final int f4097i = 2;

    public static class a implements c {

        /* renamed from: b  reason: collision with root package name */
        public static final a f4098b = new a(true);

        /* renamed from: a  reason: collision with root package name */
        public final boolean f4099a;

        public a(boolean z10) {
            this.f4099a = z10;
        }

        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            boolean z10 = false;
            while (i10 < i12) {
                int a10 = r.a(Character.getDirectionality(charSequence.charAt(i10)));
                if (a10 != 0) {
                    if (a10 != 1) {
                        continue;
                        i10++;
                    } else if (!this.f4099a) {
                        return 1;
                    }
                } else if (this.f4099a) {
                    return 0;
                }
                z10 = true;
                i10++;
            }
            if (z10) {
                return this.f4099a ? 1 : 0;
            }
            return 2;
        }
    }

    public static class b implements c {

        /* renamed from: a  reason: collision with root package name */
        public static final b f4100a = new b();

        public int a(CharSequence charSequence, int i10, int i11) {
            int i12 = i11 + i10;
            int i13 = 2;
            while (i10 < i12 && i13 == 2) {
                i13 = r.b(Character.getDirectionality(charSequence.charAt(i10)));
                i10++;
            }
            return i13;
        }
    }

    public interface c {
        int a(CharSequence charSequence, int i10, int i11);
    }

    public static abstract class d implements q {

        /* renamed from: a  reason: collision with root package name */
        public final c f4101a;

        public d(c cVar) {
            this.f4101a = cVar;
        }

        public abstract boolean a();

        public final boolean b(CharSequence charSequence, int i10, int i11) {
            int a10 = this.f4101a.a(charSequence, i10, i11);
            if (a10 == 0) {
                return true;
            }
            if (a10 != 1) {
                return a();
            }
            return false;
        }

        public boolean isRtl(CharSequence charSequence, int i10, int i11) {
            if (charSequence != null && i10 >= 0 && i11 >= 0 && charSequence.length() - i11 >= i10) {
                return this.f4101a == null ? a() : b(charSequence, i10, i11);
            }
            throw new IllegalArgumentException();
        }

        public boolean isRtl(char[] cArr, int i10, int i11) {
            return isRtl((CharSequence) CharBuffer.wrap(cArr), i10, i11);
        }
    }

    public static class e extends d {

        /* renamed from: b  reason: collision with root package name */
        public final boolean f4102b;

        public e(c cVar, boolean z10) {
            super(cVar);
            this.f4102b = z10;
        }

        public boolean a() {
            return this.f4102b;
        }
    }

    public static class f extends d {

        /* renamed from: b  reason: collision with root package name */
        public static final f f4103b = new f();

        public f() {
            super((c) null);
        }

        public boolean a() {
            return s.b(Locale.getDefault()) == 1;
        }
    }

    static {
        b bVar = b.f4100a;
        f4091c = new e(bVar, false);
        f4092d = new e(bVar, true);
    }

    public static int a(int i10) {
        if (i10 != 0) {
            return (i10 == 1 || i10 == 2) ? 0 : 2;
        }
        return 1;
    }

    public static int b(int i10) {
        if (i10 != 0) {
            if (i10 == 1 || i10 == 2) {
                return 0;
            }
            switch (i10) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
