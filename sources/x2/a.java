package x2;

import d.m0;
import d.x0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@x0({x0.a.LIBRARY_GROUP_PREFIX})
public class a {

    /* renamed from: e  reason: collision with root package name */
    public static final Map<String, Lock> f15026e = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final File f15027a;

    /* renamed from: b  reason: collision with root package name */
    public final Lock f15028b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f15029c;

    /* renamed from: d  reason: collision with root package name */
    public FileChannel f15030d;

    public a(@m0 String str, @m0 File file, boolean z10) {
        File file2 = new File(file, str + ".lck");
        this.f15027a = file2;
        this.f15028b = a(file2.getAbsolutePath());
        this.f15029c = z10;
    }

    public static Lock a(String str) {
        Lock lock;
        Map<String, Lock> map = f15026e;
        synchronized (map) {
            lock = map.get(str);
            if (lock == null) {
                lock = new ReentrantLock();
                map.put(str, lock);
            }
        }
        return lock;
    }

    public void b() {
        this.f15028b.lock();
        if (this.f15029c) {
            try {
                FileChannel channel = new FileOutputStream(this.f15027a).getChannel();
                this.f15030d = channel;
                channel.lock();
            } catch (IOException e10) {
                throw new IllegalStateException("Unable to grab copy lock.", e10);
            }
        }
    }

    public void c() {
        FileChannel fileChannel = this.f15030d;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f15028b.unlock();
    }
}
