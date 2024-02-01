package i7;

import java.util.Collections;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f9304a;

    public d(List<byte[]> list) {
        this.f9304a = list.get(0)[0] != 0;
    }

    public static List<byte[]> a(boolean z10) {
        return Collections.singletonList(new byte[]{z10 ? (byte) 1 : 0});
    }

    public static d b(List<byte[]> list) {
        return new d(list);
    }
}
