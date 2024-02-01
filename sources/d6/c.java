package d6;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import d.o0;

public final class c {

    /* renamed from: e  reason: collision with root package name */
    public static final c f6271e = new b().a();

    /* renamed from: a  reason: collision with root package name */
    public final int f6272a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6273b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6274c;
    @o0

    /* renamed from: d  reason: collision with root package name */
    public AudioAttributes f6275d;

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public int f6276a = 0;

        /* renamed from: b  reason: collision with root package name */
        public int f6277b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f6278c = 1;

        public c a() {
            return new c(this.f6276a, this.f6277b, this.f6278c);
        }

        public b b(int i10) {
            this.f6276a = i10;
            return this;
        }

        public b c(int i10) {
            this.f6277b = i10;
            return this;
        }

        public b d(int i10) {
            this.f6278c = i10;
            return this;
        }
    }

    public c(int i10, int i11, int i12) {
        this.f6272a = i10;
        this.f6273b = i11;
        this.f6274c = i12;
    }

    @TargetApi(21)
    public AudioAttributes a() {
        if (this.f6275d == null) {
            this.f6275d = new AudioAttributes.Builder().setContentType(this.f6272a).setFlags(this.f6273b).setUsage(this.f6274c).build();
        }
        return this.f6275d;
    }

    public boolean equals(@o0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f6272a == cVar.f6272a && this.f6273b == cVar.f6273b && this.f6274c == cVar.f6274c;
    }

    public int hashCode() {
        return ((((527 + this.f6272a) * 31) + this.f6273b) * 31) + this.f6274c;
    }
}
