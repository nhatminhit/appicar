package j6;

import d.o0;

public interface q {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final r f9611a;

        /* renamed from: b  reason: collision with root package name */
        public final r f9612b;

        public a(r rVar) {
            this(rVar, rVar);
        }

        public a(r rVar, r rVar2) {
            this.f9611a = (r) w7.a.g(rVar);
            this.f9612b = (r) w7.a.g(rVar2);
        }

        public boolean equals(@o0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f9611a.equals(aVar.f9611a) && this.f9612b.equals(aVar.f9612b);
        }

        public int hashCode() {
            return (this.f9611a.hashCode() * 31) + this.f9612b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[");
            sb2.append(this.f9611a);
            if (this.f9611a.equals(this.f9612b)) {
                str = "";
            } else {
                str = ", " + this.f9612b;
            }
            sb2.append(str);
            sb2.append("]");
            return sb2.toString();
        }
    }

    public static final class b implements q {

        /* renamed from: d  reason: collision with root package name */
        public final long f9613d;

        /* renamed from: e  reason: collision with root package name */
        public final a f9614e;

        public b(long j10) {
            this(j10, 0);
        }

        public b(long j10, long j11) {
            this.f9613d = j10;
            this.f9614e = new a(j11 == 0 ? r.f9615c : new r(0, j11));
        }

        public boolean d() {
            return false;
        }

        public a i(long j10) {
            return this.f9614e;
        }

        public long j() {
            return this.f9613d;
        }
    }

    boolean d();

    a i(long j10);

    long j();
}
