package z6;

import android.net.Uri;
import com.google.android.exoplayer2.offline.StreamKey;
import d.o0;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import t7.j0;
import z6.w;

public final class x<T extends w<T>> implements j0.a<T> {

    /* renamed from: a  reason: collision with root package name */
    public final j0.a<? extends T> f15987a;
    @o0

    /* renamed from: b  reason: collision with root package name */
    public final List<StreamKey> f15988b;

    public x(j0.a<? extends T> aVar, @o0 List<StreamKey> list) {
        this.f15987a = aVar;
        this.f15988b = list;
    }

    /* renamed from: b */
    public T a(Uri uri, InputStream inputStream) throws IOException {
        T t10 = (w) this.f15987a.a(uri, inputStream);
        List<StreamKey> list = this.f15988b;
        return (list == null || list.isEmpty()) ? t10 : (w) t10.a(this.f15988b);
    }
}
