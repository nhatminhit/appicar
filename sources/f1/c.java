package f1;

import android.content.ClipData;
import android.content.ClipDescription;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import d.m0;
import d.o0;
import d.x0;
import e1.n;
import e1.o;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

public final class c {

    /* renamed from: f  reason: collision with root package name */
    public static final int f7040f = 0;

    /* renamed from: g  reason: collision with root package name */
    public static final int f7041g = 1;

    /* renamed from: h  reason: collision with root package name */
    public static final int f7042h = 2;

    /* renamed from: i  reason: collision with root package name */
    public static final int f7043i = 3;

    /* renamed from: j  reason: collision with root package name */
    public static final int f7044j = 1;
    @m0

    /* renamed from: a  reason: collision with root package name */
    public final ClipData f7045a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7046b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7047c;
    @o0

    /* renamed from: d  reason: collision with root package name */
    public final Uri f7048d;
    @o0

    /* renamed from: e  reason: collision with root package name */
    public final Bundle f7049e;

    public static final class a {
        @m0

        /* renamed from: a  reason: collision with root package name */
        public ClipData f7050a;

        /* renamed from: b  reason: collision with root package name */
        public int f7051b;

        /* renamed from: c  reason: collision with root package name */
        public int f7052c;
        @o0

        /* renamed from: d  reason: collision with root package name */
        public Uri f7053d;
        @o0

        /* renamed from: e  reason: collision with root package name */
        public Bundle f7054e;

        public a(@m0 ClipData clipData, int i10) {
            this.f7050a = clipData;
            this.f7051b = i10;
        }

        public a(@m0 c cVar) {
            this.f7050a = cVar.f7045a;
            this.f7051b = cVar.f7046b;
            this.f7052c = cVar.f7047c;
            this.f7053d = cVar.f7048d;
            this.f7054e = cVar.f7049e;
        }

        @m0
        public c a() {
            return new c(this);
        }

        @m0
        public a b(@m0 ClipData clipData) {
            this.f7050a = clipData;
            return this;
        }

        @m0
        public a c(@o0 Bundle bundle) {
            this.f7054e = bundle;
            return this;
        }

        @m0
        public a d(int i10) {
            this.f7052c = i10;
            return this;
        }

        @m0
        public a e(@o0 Uri uri) {
            this.f7053d = uri;
            return this;
        }

        @m0
        public a f(int i10) {
            this.f7051b = i10;
            return this;
        }
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: f1.c$c  reason: collision with other inner class name */
    public @interface C0120c {
    }

    public c(a aVar) {
        this.f7045a = (ClipData) n.g(aVar.f7050a);
        this.f7046b = n.c(aVar.f7051b, 0, 3, b4.a.P);
        this.f7047c = n.f(aVar.f7052c, 1);
        this.f7048d = aVar.f7053d;
        this.f7049e = aVar.f7054e;
    }

    public static ClipData a(ClipDescription clipDescription, List<ClipData.Item> list) {
        ClipData clipData = new ClipData(new ClipDescription(clipDescription), list.get(0));
        for (int i10 = 1; i10 < list.size(); i10++) {
            clipData.addItem(list.get(i10));
        }
        return clipData;
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    @m0
    public static String b(int i10) {
        return (i10 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i10);
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    @m0
    public static String i(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? String.valueOf(i10) : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    @m0
    public ClipData c() {
        return this.f7045a;
    }

    @o0
    public Bundle d() {
        return this.f7049e;
    }

    public int e() {
        return this.f7047c;
    }

    @o0
    public Uri f() {
        return this.f7048d;
    }

    public int g() {
        return this.f7046b;
    }

    @m0
    public Pair<c, c> h(@m0 o<ClipData.Item> oVar) {
        c cVar = null;
        if (this.f7045a.getItemCount() == 1) {
            boolean test = oVar.test(this.f7045a.getItemAt(0));
            c cVar2 = test ? this : null;
            if (!test) {
                cVar = this;
            }
            return Pair.create(cVar2, cVar);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < this.f7045a.getItemCount(); i10++) {
            ClipData.Item itemAt = this.f7045a.getItemAt(i10);
            if (oVar.test(itemAt)) {
                arrayList.add(itemAt);
            } else {
                arrayList2.add(itemAt);
            }
        }
        return arrayList.isEmpty() ? Pair.create((Object) null, this) : arrayList2.isEmpty() ? Pair.create(this, (Object) null) : Pair.create(new a(this).b(a(this.f7045a.getDescription(), arrayList)).a(), new a(this).b(a(this.f7045a.getDescription(), arrayList2)).a());
    }

    @m0
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ContentInfoCompat{clip=");
        sb2.append(this.f7045a.getDescription());
        sb2.append(", source=");
        sb2.append(i(this.f7046b));
        sb2.append(", flags=");
        sb2.append(b(this.f7047c));
        String str2 = "";
        if (this.f7048d == null) {
            str = str2;
        } else {
            str = ", hasLinkUri(" + this.f7048d.toString().length() + ")";
        }
        sb2.append(str);
        if (this.f7049e != null) {
            str2 = ", hasExtras";
        }
        sb2.append(str2);
        sb2.append(p7.a.f11639j);
        return sb2.toString();
    }
}
