package o4;

import com.bumptech.glide.load.ImageHeaderParser;
import d.m0;
import java.util.ArrayList;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final List<ImageHeaderParser> f11055a = new ArrayList();

    public synchronized void a(@m0 ImageHeaderParser imageHeaderParser) {
        this.f11055a.add(imageHeaderParser);
    }

    @m0
    public synchronized List<ImageHeaderParser> b() {
        return this.f11055a;
    }
}
