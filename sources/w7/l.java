package w7;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.flac.PictureFrame;
import com.google.android.exoplayer2.metadata.flac.VorbisComment;
import d.o0;
import java.util.ArrayList;
import java.util.List;

public final class l {

    /* renamed from: j  reason: collision with root package name */
    public static final String f14754j = "FlacStreamMetadata";

    /* renamed from: k  reason: collision with root package name */
    public static final String f14755k = "=";

    /* renamed from: a  reason: collision with root package name */
    public final int f14756a;

    /* renamed from: b  reason: collision with root package name */
    public final int f14757b;

    /* renamed from: c  reason: collision with root package name */
    public final int f14758c;

    /* renamed from: d  reason: collision with root package name */
    public final int f14759d;

    /* renamed from: e  reason: collision with root package name */
    public final int f14760e;

    /* renamed from: f  reason: collision with root package name */
    public final int f14761f;

    /* renamed from: g  reason: collision with root package name */
    public final int f14762g;

    /* renamed from: h  reason: collision with root package name */
    public final long f14763h;
    @o0

    /* renamed from: i  reason: collision with root package name */
    public final Metadata f14764i;

    public l(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, List<String> list, List<PictureFrame> list2) {
        this.f14756a = i10;
        this.f14757b = i11;
        this.f14758c = i12;
        this.f14759d = i13;
        this.f14760e = i14;
        this.f14761f = i15;
        this.f14762g = i16;
        this.f14763h = j10;
        this.f14764i = b(list, list2);
    }

    public l(byte[] bArr, int i10) {
        v vVar = new v(bArr);
        vVar.n(i10 * 8);
        this.f14756a = vVar.h(16);
        this.f14757b = vVar.h(16);
        this.f14758c = vVar.h(24);
        this.f14759d = vVar.h(24);
        this.f14760e = vVar.h(20);
        this.f14761f = vVar.h(3) + 1;
        this.f14762g = vVar.h(5) + 1;
        this.f14763h = ((((long) vVar.h(4)) & 15) << 32) | (((long) vVar.h(32)) & 4294967295L);
        this.f14764i = null;
    }

    @o0
    public static Metadata b(List<String> list, List<PictureFrame> list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10);
            String[] S0 = q0.S0(str, f14755k);
            if (S0.length != 2) {
                p.l(f14754j, "Failed to parse vorbis comment: " + str);
            } else {
                arrayList.add(new VorbisComment(S0[0], S0[1]));
            }
        }
        arrayList.addAll(list2);
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata((List<? extends Metadata.Entry>) arrayList);
    }

    public int a() {
        return this.f14762g * this.f14760e;
    }

    public long c() {
        return (this.f14763h * 1000000) / ((long) this.f14760e);
    }

    public long d() {
        long j10;
        long j11;
        int i10 = this.f14759d;
        if (i10 > 0) {
            j10 = (((long) i10) + ((long) this.f14758c)) / 2;
            j11 = 1;
        } else {
            int i11 = this.f14756a;
            j10 = ((((i11 != this.f14757b || i11 <= 0) ? PlaybackStateCompat.f556m0 : (long) i11) * ((long) this.f14761f)) * ((long) this.f14762g)) / 8;
            j11 = 64;
        }
        return j10 + j11;
    }

    public long e(long j10) {
        return q0.v((j10 * ((long) this.f14760e)) / 1000000, 0, this.f14763h - 1);
    }

    public int f() {
        return this.f14757b * this.f14761f * (this.f14762g / 8);
    }
}
