package y6;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.scte35.PrivateCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceNullCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand;
import com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand;
import java.nio.ByteBuffer;
import u6.c;
import w7.j0;
import w7.v;
import w7.w;

public final class a implements u6.a {

    /* renamed from: d  reason: collision with root package name */
    public static final int f15537d = 0;

    /* renamed from: e  reason: collision with root package name */
    public static final int f15538e = 4;

    /* renamed from: f  reason: collision with root package name */
    public static final int f15539f = 5;

    /* renamed from: g  reason: collision with root package name */
    public static final int f15540g = 6;

    /* renamed from: h  reason: collision with root package name */
    public static final int f15541h = 255;

    /* renamed from: a  reason: collision with root package name */
    public final w f15542a = new w();

    /* renamed from: b  reason: collision with root package name */
    public final v f15543b = new v();

    /* renamed from: c  reason: collision with root package name */
    public j0 f15544c;

    public Metadata a(c cVar) {
        j0 j0Var = this.f15544c;
        if (j0Var == null || cVar.W != j0Var.e()) {
            j0 j0Var2 = new j0(cVar.R);
            this.f15544c = j0Var2;
            j0Var2.a(cVar.R - cVar.W);
        }
        ByteBuffer byteBuffer = cVar.Q;
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.f15542a.O(array, limit);
        this.f15543b.m(array, limit);
        this.f15543b.p(39);
        long h10 = (((long) this.f15543b.h(1)) << 32) | ((long) this.f15543b.h(32));
        this.f15543b.p(20);
        int h11 = this.f15543b.h(12);
        int h12 = this.f15543b.h(8);
        Metadata.Entry entry = null;
        this.f15542a.R(14);
        if (h12 == 0) {
            entry = new SpliceNullCommand();
        } else if (h12 == 255) {
            entry = PrivateCommand.a(this.f15542a, h11, h10);
        } else if (h12 == 4) {
            entry = SpliceScheduleCommand.a(this.f15542a);
        } else if (h12 == 5) {
            entry = SpliceInsertCommand.a(this.f15542a, h10, this.f15544c);
        } else if (h12 == 6) {
            entry = TimeSignalCommand.a(this.f15542a, h10, this.f15544c);
        }
        if (entry == null) {
            return new Metadata(new Metadata.Entry[0]);
        }
        return new Metadata(entry);
    }
}
