package h0;

import android.app.Person;
import android.os.Bundle;
import android.os.PersistableBundle;
import androidx.core.graphics.drawable.IconCompat;
import d.m0;
import d.o0;
import d.t0;
import d.x0;

public class l2 {

    /* renamed from: g  reason: collision with root package name */
    public static final String f8444g = "name";

    /* renamed from: h  reason: collision with root package name */
    public static final String f8445h = "icon";

    /* renamed from: i  reason: collision with root package name */
    public static final String f8446i = "uri";

    /* renamed from: j  reason: collision with root package name */
    public static final String f8447j = "key";

    /* renamed from: k  reason: collision with root package name */
    public static final String f8448k = "isBot";

    /* renamed from: l  reason: collision with root package name */
    public static final String f8449l = "isImportant";
    @o0

    /* renamed from: a  reason: collision with root package name */
    public CharSequence f8450a;
    @o0

    /* renamed from: b  reason: collision with root package name */
    public IconCompat f8451b;
    @o0

    /* renamed from: c  reason: collision with root package name */
    public String f8452c;
    @o0

    /* renamed from: d  reason: collision with root package name */
    public String f8453d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f8454e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f8455f;

    public static class a {
        @o0

        /* renamed from: a  reason: collision with root package name */
        public CharSequence f8456a;
        @o0

        /* renamed from: b  reason: collision with root package name */
        public IconCompat f8457b;
        @o0

        /* renamed from: c  reason: collision with root package name */
        public String f8458c;
        @o0

        /* renamed from: d  reason: collision with root package name */
        public String f8459d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f8460e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f8461f;

        public a() {
        }

        public a(l2 l2Var) {
            this.f8456a = l2Var.f8450a;
            this.f8457b = l2Var.f8451b;
            this.f8458c = l2Var.f8452c;
            this.f8459d = l2Var.f8453d;
            this.f8460e = l2Var.f8454e;
            this.f8461f = l2Var.f8455f;
        }

        @m0
        public l2 a() {
            return new l2(this);
        }

        @m0
        public a b(boolean z10) {
            this.f8460e = z10;
            return this;
        }

        @m0
        public a c(@o0 IconCompat iconCompat) {
            this.f8457b = iconCompat;
            return this;
        }

        @m0
        public a d(boolean z10) {
            this.f8461f = z10;
            return this;
        }

        @m0
        public a e(@o0 String str) {
            this.f8459d = str;
            return this;
        }

        @m0
        public a f(@o0 CharSequence charSequence) {
            this.f8456a = charSequence;
            return this;
        }

        @m0
        public a g(@o0 String str) {
            this.f8458c = str;
            return this;
        }
    }

    public l2(a aVar) {
        this.f8450a = aVar.f8456a;
        this.f8451b = aVar.f8457b;
        this.f8452c = aVar.f8458c;
        this.f8453d = aVar.f8459d;
        this.f8454e = aVar.f8460e;
        this.f8455f = aVar.f8461f;
    }

    @t0(28)
    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    @m0
    public static l2 a(@m0 Person person) {
        return new a().f(person.getName()).c(person.getIcon() != null ? IconCompat.o(person.getIcon()) : null).g(person.getUri()).e(person.getKey()).b(person.isBot()).d(person.isImportant()).a();
    }

    @m0
    public static l2 b(@m0 Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("icon");
        return new a().f(bundle.getCharSequence("name")).c(bundle2 != null ? IconCompat.m(bundle2) : null).g(bundle.getString("uri")).e(bundle.getString("key")).b(bundle.getBoolean(f8448k)).d(bundle.getBoolean(f8449l)).a();
    }

    @t0(22)
    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    @m0
    public static l2 c(@m0 PersistableBundle persistableBundle) {
        return new a().f(persistableBundle.getString("name")).g(persistableBundle.getString("uri")).e(persistableBundle.getString("key")).b(persistableBundle.getBoolean(f8448k)).d(persistableBundle.getBoolean(f8449l)).a();
    }

    @o0
    public IconCompat d() {
        return this.f8451b;
    }

    @o0
    public String e() {
        return this.f8453d;
    }

    @o0
    public CharSequence f() {
        return this.f8450a;
    }

    @o0
    public String g() {
        return this.f8452c;
    }

    public boolean h() {
        return this.f8454e;
    }

    public boolean i() {
        return this.f8455f;
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    @m0
    public String j() {
        String str = this.f8452c;
        if (str != null) {
            return str;
        }
        if (this.f8450a == null) {
            return "";
        }
        return "name:" + this.f8450a;
    }

    @t0(28)
    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    @m0
    public Person k() {
        return new Person.Builder().setName(f()).setIcon(d() != null ? d().Q() : null).setUri(g()).setKey(e()).setBot(h()).setImportant(i()).build();
    }

    @m0
    public a l() {
        return new a(this);
    }

    @m0
    public Bundle m() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.f8450a);
        IconCompat iconCompat = this.f8451b;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.a() : null);
        bundle.putString("uri", this.f8452c);
        bundle.putString("key", this.f8453d);
        bundle.putBoolean(f8448k, this.f8454e);
        bundle.putBoolean(f8449l, this.f8455f);
        return bundle;
    }

    @t0(22)
    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    @m0
    public PersistableBundle n() {
        PersistableBundle persistableBundle = new PersistableBundle();
        CharSequence charSequence = this.f8450a;
        persistableBundle.putString("name", charSequence != null ? charSequence.toString() : null);
        persistableBundle.putString("uri", this.f8452c);
        persistableBundle.putString("key", this.f8453d);
        persistableBundle.putBoolean(f8448k, this.f8454e);
        persistableBundle.putBoolean(f8449l, this.f8455f);
        return persistableBundle;
    }
}
