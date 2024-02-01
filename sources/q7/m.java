package q7;

import com.google.android.exoplayer2.trackselection.f;
import d.o0;
import java.util.Arrays;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final int f12031a;

    /* renamed from: b  reason: collision with root package name */
    public final f[] f12032b;

    /* renamed from: c  reason: collision with root package name */
    public int f12033c;

    public m(f... fVarArr) {
        this.f12032b = fVarArr;
        this.f12031a = fVarArr.length;
    }

    @o0
    public f a(int i10) {
        return this.f12032b[i10];
    }

    public f[] b() {
        return (f[]) this.f12032b.clone();
    }

    public boolean equals(@o0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f12032b, ((m) obj).f12032b);
    }

    public int hashCode() {
        if (this.f12033c == 0) {
            this.f12033c = 527 + Arrays.hashCode(this.f12032b);
        }
        return this.f12033c;
    }
}
