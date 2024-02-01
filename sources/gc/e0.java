package gc;

import java.io.PrintWriter;
import java.io.StringWriter;

public class e0 {

    /* renamed from: a  reason: collision with root package name */
    public final int f19012a;

    /* renamed from: b  reason: collision with root package name */
    public final int f19013b;

    /* renamed from: c  reason: collision with root package name */
    public final long f19014c;

    /* renamed from: d  reason: collision with root package name */
    public final long f19015d;

    /* renamed from: e  reason: collision with root package name */
    public final long f19016e;

    /* renamed from: f  reason: collision with root package name */
    public final long f19017f;

    /* renamed from: g  reason: collision with root package name */
    public final long f19018g;

    /* renamed from: h  reason: collision with root package name */
    public final long f19019h;

    /* renamed from: i  reason: collision with root package name */
    public final long f19020i;

    /* renamed from: j  reason: collision with root package name */
    public final long f19021j;

    /* renamed from: k  reason: collision with root package name */
    public final int f19022k;

    /* renamed from: l  reason: collision with root package name */
    public final int f19023l;

    /* renamed from: m  reason: collision with root package name */
    public final int f19024m;

    /* renamed from: n  reason: collision with root package name */
    public final long f19025n;

    public e0(int i10, int i11, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, int i12, int i13, int i14, long j18) {
        this.f19012a = i10;
        this.f19013b = i11;
        this.f19014c = j10;
        this.f19015d = j11;
        this.f19016e = j12;
        this.f19017f = j13;
        this.f19018g = j14;
        this.f19019h = j15;
        this.f19020i = j16;
        this.f19021j = j17;
        this.f19022k = i12;
        this.f19023l = i13;
        this.f19024m = i14;
        this.f19025n = j18;
    }

    public void a() {
        StringWriter stringWriter = new StringWriter();
        b(new PrintWriter(stringWriter));
        stringWriter.toString();
    }

    public void b(PrintWriter printWriter) {
        printWriter.println("===============BEGIN PICASSO STATS ===============");
        printWriter.println("Memory Cache Stats");
        printWriter.print("  Max Cache Size: ");
        printWriter.println(this.f19012a);
        printWriter.print("  Cache Size: ");
        printWriter.println(this.f19013b);
        printWriter.print("  Cache % Full: ");
        printWriter.println((int) Math.ceil((double) ((((float) this.f19013b) / ((float) this.f19012a)) * 100.0f)));
        printWriter.print("  Cache Hits: ");
        printWriter.println(this.f19014c);
        printWriter.print("  Cache Misses: ");
        printWriter.println(this.f19015d);
        printWriter.println("Network Stats");
        printWriter.print("  Download Count: ");
        printWriter.println(this.f19022k);
        printWriter.print("  Total Download Size: ");
        printWriter.println(this.f19016e);
        printWriter.print("  Average Download Size: ");
        printWriter.println(this.f19019h);
        printWriter.println("Bitmap Stats");
        printWriter.print("  Total Bitmaps Decoded: ");
        printWriter.println(this.f19023l);
        printWriter.print("  Total Bitmap Size: ");
        printWriter.println(this.f19017f);
        printWriter.print("  Total Transformed Bitmaps: ");
        printWriter.println(this.f19024m);
        printWriter.print("  Total Transformed Bitmap Size: ");
        printWriter.println(this.f19018g);
        printWriter.print("  Average Bitmap Size: ");
        printWriter.println(this.f19020i);
        printWriter.print("  Average Transformed Bitmap Size: ");
        printWriter.println(this.f19021j);
        printWriter.println("===============END PICASSO STATS ===============");
        printWriter.flush();
    }

    public String toString() {
        return "StatsSnapshot{maxSize=" + this.f19012a + ", size=" + this.f19013b + ", cacheHits=" + this.f19014c + ", cacheMisses=" + this.f19015d + ", downloadCount=" + this.f19022k + ", totalDownloadSize=" + this.f19016e + ", averageDownloadSize=" + this.f19019h + ", totalOriginalBitmapSize=" + this.f19017f + ", totalTransformedBitmapSize=" + this.f19018g + ", averageOriginalBitmapSize=" + this.f19020i + ", averageTransformedBitmapSize=" + this.f19021j + ", originalBitmapCount=" + this.f19023l + ", transformedBitmapCount=" + this.f19024m + ", timeStamp=" + this.f19025n + '}';
    }
}
