package g7;

import android.net.Uri;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.offline.StreamKey;
import d.o0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import w7.s;

public final class e extends g {

    /* renamed from: n  reason: collision with root package name */
    public static final e f8089n = new e("", Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), (Format) null, Collections.emptyList(), false, Collections.emptyMap(), Collections.emptyList());

    /* renamed from: o  reason: collision with root package name */
    public static final int f8090o = 0;

    /* renamed from: p  reason: collision with root package name */
    public static final int f8091p = 1;

    /* renamed from: q  reason: collision with root package name */
    public static final int f8092q = 2;

    /* renamed from: d  reason: collision with root package name */
    public final List<Uri> f8093d;

    /* renamed from: e  reason: collision with root package name */
    public final List<b> f8094e;

    /* renamed from: f  reason: collision with root package name */
    public final List<a> f8095f;

    /* renamed from: g  reason: collision with root package name */
    public final List<a> f8096g;

    /* renamed from: h  reason: collision with root package name */
    public final List<a> f8097h;

    /* renamed from: i  reason: collision with root package name */
    public final List<a> f8098i;

    /* renamed from: j  reason: collision with root package name */
    public final Format f8099j;

    /* renamed from: k  reason: collision with root package name */
    public final List<Format> f8100k;

    /* renamed from: l  reason: collision with root package name */
    public final Map<String, String> f8101l;

    /* renamed from: m  reason: collision with root package name */
    public final List<DrmInitData> f8102m;

    public static final class a {
        @o0

        /* renamed from: a  reason: collision with root package name */
        public final Uri f8103a;

        /* renamed from: b  reason: collision with root package name */
        public final Format f8104b;

        /* renamed from: c  reason: collision with root package name */
        public final String f8105c;

        /* renamed from: d  reason: collision with root package name */
        public final String f8106d;

        public a(@o0 Uri uri, Format format, String str, String str2) {
            this.f8103a = uri;
            this.f8104b = format;
            this.f8105c = str;
            this.f8106d = str2;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f8107a;

        /* renamed from: b  reason: collision with root package name */
        public final Format f8108b;
        @o0

        /* renamed from: c  reason: collision with root package name */
        public final String f8109c;
        @o0

        /* renamed from: d  reason: collision with root package name */
        public final String f8110d;
        @o0

        /* renamed from: e  reason: collision with root package name */
        public final String f8111e;
        @o0

        /* renamed from: f  reason: collision with root package name */
        public final String f8112f;

        public b(Uri uri, Format format, @o0 String str, @o0 String str2, @o0 String str3, @o0 String str4) {
            this.f8107a = uri;
            this.f8108b = format;
            this.f8109c = str;
            this.f8110d = str2;
            this.f8111e = str3;
            this.f8112f = str4;
        }

        public static b b(Uri uri) {
            return new b(uri, Format.t("0", (String) null, s.X, (String) null, (String) null, -1, 0, 0, (String) null), (String) null, (String) null, (String) null, (String) null);
        }

        public b a(Format format) {
            return new b(this.f8107a, format, this.f8109c, this.f8110d, this.f8111e, this.f8112f);
        }
    }

    public e(String str, List<String> list, List<b> list2, List<a> list3, List<a> list4, List<a> list5, List<a> list6, Format format, List<Format> list7, boolean z10, Map<String, String> map, List<DrmInitData> list8) {
        super(str, list, z10);
        this.f8093d = Collections.unmodifiableList(f(list2, list3, list4, list5, list6));
        this.f8094e = Collections.unmodifiableList(list2);
        this.f8095f = Collections.unmodifiableList(list3);
        this.f8096g = Collections.unmodifiableList(list4);
        this.f8097h = Collections.unmodifiableList(list5);
        this.f8098i = Collections.unmodifiableList(list6);
        this.f8099j = format;
        this.f8100k = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f8101l = Collections.unmodifiableMap(map);
        this.f8102m = Collections.unmodifiableList(list8);
    }

    public static void b(List<a> list, List<Uri> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = list.get(i10).f8103a;
            if (uri != null && !list2.contains(uri)) {
                list2.add(uri);
            }
        }
    }

    public static <T> List<T> d(List<T> list, int i10, List<StreamKey> list2) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            T t10 = list.get(i11);
            int i12 = 0;
            while (true) {
                if (i12 >= list2.size()) {
                    break;
                }
                StreamKey streamKey = list2.get(i12);
                if (streamKey.P == i10 && streamKey.Q == i11) {
                    arrayList.add(t10);
                    break;
                }
                i12++;
            }
        }
        return arrayList;
    }

    public static e e(String str) {
        return new e((String) null, Collections.emptyList(), Collections.singletonList(b.b(Uri.parse(str))), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), Collections.emptyList(), (Format) null, (List<Format>) null, false, Collections.emptyMap(), Collections.emptyList());
    }

    public static List<Uri> f(List<b> list, List<a> list2, List<a> list3, List<a> list4, List<a> list5) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = list.get(i10).f8107a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        b(list2, arrayList);
        b(list3, arrayList);
        b(list4, arrayList);
        b(list5, arrayList);
        return arrayList;
    }

    /* renamed from: c */
    public e a(List<StreamKey> list) {
        return new e(this.f8129a, this.f8130b, d(this.f8094e, 0, list), Collections.emptyList(), d(this.f8096g, 1, list), d(this.f8097h, 2, list), Collections.emptyList(), this.f8099j, this.f8100k, this.f8131c, this.f8101l, this.f8102m);
    }
}
