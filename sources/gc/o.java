package gc;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class o implements d {

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashMap<String, Bitmap> f19101b;

    /* renamed from: c  reason: collision with root package name */
    public final int f19102c;

    /* renamed from: d  reason: collision with root package name */
    public int f19103d;

    /* renamed from: e  reason: collision with root package name */
    public int f19104e;

    /* renamed from: f  reason: collision with root package name */
    public int f19105f;

    /* renamed from: g  reason: collision with root package name */
    public int f19106g;

    /* renamed from: h  reason: collision with root package name */
    public int f19107h;

    public o(int i10) {
        if (i10 > 0) {
            this.f19102c = i10;
            this.f19101b = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("Max size must be positive.");
    }

    public o(Context context) {
        this(j0.b(context));
    }

    public final void a() {
        f(-1);
    }

    public final synchronized int b() {
        return this.f19105f;
    }

    public final synchronized int c() {
        return this.f19106g;
    }

    public final synchronized void clear() {
        a();
    }

    public final synchronized int d() {
        return this.f19107h;
    }

    public final synchronized int e() {
        return this.f19104e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0070, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(int r4) {
        /*
            r3 = this;
        L_0x0000:
            monitor-enter(r3)
            int r0 = r3.f19103d     // Catch:{ all -> 0x0071 }
            if (r0 < 0) goto L_0x0052
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r3.f19101b     // Catch:{ all -> 0x0071 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x0011
            int r0 = r3.f19103d     // Catch:{ all -> 0x0071 }
            if (r0 != 0) goto L_0x0052
        L_0x0011:
            int r0 = r3.f19103d     // Catch:{ all -> 0x0071 }
            if (r0 <= r4) goto L_0x0050
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r3.f19101b     // Catch:{ all -> 0x0071 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x001e
            goto L_0x0050
        L_0x001e:
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r0 = r3.f19101b     // Catch:{ all -> 0x0071 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0071 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0071 }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x0071 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0071 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0071 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0071 }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ all -> 0x0071 }
            java.util.LinkedHashMap<java.lang.String, android.graphics.Bitmap> r2 = r3.f19101b     // Catch:{ all -> 0x0071 }
            r2.remove(r1)     // Catch:{ all -> 0x0071 }
            int r1 = r3.f19103d     // Catch:{ all -> 0x0071 }
            int r0 = gc.j0.l(r0)     // Catch:{ all -> 0x0071 }
            int r1 = r1 - r0
            r3.f19103d = r1     // Catch:{ all -> 0x0071 }
            int r0 = r3.f19105f     // Catch:{ all -> 0x0071 }
            int r0 = r0 + 1
            r3.f19105f = r0     // Catch:{ all -> 0x0071 }
            monitor-exit(r3)     // Catch:{ all -> 0x0071 }
            goto L_0x0000
        L_0x0050:
            monitor-exit(r3)     // Catch:{ all -> 0x0071 }
            return
        L_0x0052:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0071 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0071 }
            r0.<init>()     // Catch:{ all -> 0x0071 }
            java.lang.Class r1 = r3.getClass()     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0071 }
            r0.append(r1)     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch:{ all -> 0x0071 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0071 }
            r4.<init>(r0)     // Catch:{ all -> 0x0071 }
            throw r4     // Catch:{ all -> 0x0071 }
        L_0x0071:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0071 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: gc.o.f(int):void");
    }

    public Bitmap g(String str) {
        if (str != null) {
            synchronized (this) {
                Bitmap bitmap = this.f19101b.get(str);
                if (bitmap != null) {
                    this.f19106g++;
                    return bitmap;
                }
                this.f19107h++;
                return null;
            }
        }
        throw new NullPointerException("key == null");
    }

    public final synchronized int h() {
        return this.f19102c;
    }

    public void i(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            throw new NullPointerException("key == null || bitmap == null");
        }
        synchronized (this) {
            this.f19104e++;
            this.f19103d += j0.l(bitmap);
            Bitmap put = this.f19101b.put(str, bitmap);
            if (put != null) {
                this.f19103d -= j0.l(put);
            }
        }
        f(this.f19102c);
    }

    public final synchronized void j(String str) {
        int length = str.length();
        Iterator<Map.Entry<String, Bitmap>> it = this.f19101b.entrySet().iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Map.Entry next = it.next();
            String str2 = (String) next.getKey();
            Bitmap bitmap = (Bitmap) next.getValue();
            int indexOf = str2.indexOf(10);
            if (indexOf == length && str2.substring(0, indexOf).equals(str)) {
                it.remove();
                this.f19103d -= j0.l(bitmap);
                z10 = true;
            }
        }
        if (z10) {
            f(this.f19102c);
        }
    }

    public final synchronized int size() {
        return this.f19103d;
    }
}
