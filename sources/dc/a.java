package dc;

import fh.g;
import org.json.JSONException;
import org.json.JSONObject;
import xe.l0;
import xe.w;

public final class a {
    @g

    /* renamed from: b  reason: collision with root package name */
    public static final b f17806b = new b((w) null);
    @g

    /* renamed from: c  reason: collision with root package name */
    public static final a f17807c = new C0292a().f(1).d();
    @g

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f17808a;

    /* renamed from: dc.a$a  reason: collision with other inner class name */
    public static final class C0292a {
        @g

        /* renamed from: b  reason: collision with root package name */
        public static final C0293a f17809b = new C0293a((w) null);
        @g

        /* renamed from: c  reason: collision with root package name */
        public static final String f17810c = "autoplay";
        @g

        /* renamed from: d  reason: collision with root package name */
        public static final String f17811d = "mute";
        @g

        /* renamed from: e  reason: collision with root package name */
        public static final String f17812e = "controls";
        @g

        /* renamed from: f  reason: collision with root package name */
        public static final String f17813f = "enablejsapi";
        @g

        /* renamed from: g  reason: collision with root package name */
        public static final String f17814g = "fs";
        @g

        /* renamed from: h  reason: collision with root package name */
        public static final String f17815h = "origin";
        @g

        /* renamed from: i  reason: collision with root package name */
        public static final String f17816i = "rel";
        @g

        /* renamed from: j  reason: collision with root package name */
        public static final String f17817j = "showinfo";
        @g

        /* renamed from: k  reason: collision with root package name */
        public static final String f17818k = "iv_load_policy";
        @g

        /* renamed from: l  reason: collision with root package name */
        public static final String f17819l = "modestbranding";
        @g

        /* renamed from: m  reason: collision with root package name */
        public static final String f17820m = "cc_load_policy";
        @g

        /* renamed from: n  reason: collision with root package name */
        public static final String f17821n = "cc_lang_pref";
        @g

        /* renamed from: o  reason: collision with root package name */
        public static final String f17822o = "list";
        @g

        /* renamed from: p  reason: collision with root package name */
        public static final String f17823p = "listType";
        @g

        /* renamed from: a  reason: collision with root package name */
        public final JSONObject f17824a = new JSONObject();

        /* renamed from: dc.a$a$a  reason: collision with other inner class name */
        public static final class C0293a {
            public C0293a() {
            }

            public /* synthetic */ C0293a(w wVar) {
                this();
            }
        }

        public C0292a() {
            a(f17810c, 0);
            a(f17811d, 0);
            a(f17812e, 0);
            a(f17813f, 1);
            a(f17814g, 0);
            b("origin", "https://www.youtube.com");
            a(f17816i, 0);
            a(f17817j, 0);
            a(f17818k, 3);
            a(f17819l, 1);
            a(f17820m, 0);
        }

        public final void a(String str, int i10) {
            try {
                this.f17824a.put(str, i10);
            } catch (JSONException unused) {
                throw new RuntimeException("Illegal JSON value " + str + ": " + i10);
            }
        }

        public final void b(String str, String str2) {
            try {
                this.f17824a.put(str, str2);
            } catch (JSONException unused) {
                throw new RuntimeException("Illegal JSON value " + str + ": " + str2);
            }
        }

        @g
        public final C0292a c(int i10) {
            a(f17810c, i10);
            return this;
        }

        @g
        public final a d() {
            return new a(this.f17824a, (w) null);
        }

        @g
        public final C0292a e(int i10) {
            a(f17820m, i10);
            return this;
        }

        @g
        public final C0292a f(int i10) {
            a(f17812e, i10);
            return this;
        }

        @g
        public final C0292a g(int i10) {
            a(f17814g, i10);
            return this;
        }

        @g
        public final C0292a h(int i10) {
            a(f17818k, i10);
            return this;
        }

        @g
        public final C0292a i(@g String str) {
            l0.p(str, "languageCode");
            b(f17821n, str);
            return this;
        }

        @g
        public final C0292a j(@g String str) {
            l0.p(str, f17822o);
            b(f17822o, str);
            return this;
        }

        @g
        public final C0292a k(@g String str) {
            l0.p(str, f17823p);
            b(f17823p, str);
            return this;
        }

        @g
        public final C0292a l(int i10) {
            a(f17819l, i10);
            return this;
        }

        @g
        public final C0292a m(int i10) {
            a(f17811d, i10);
            return this;
        }

        @g
        public final C0292a n(@g String str) {
            l0.p(str, "origin");
            b("origin", str);
            return this;
        }

        @g
        public final C0292a o(int i10) {
            a(f17816i, i10);
            return this;
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(w wVar) {
            this();
        }

        @g
        public final a a() {
            return a.f17807c;
        }
    }

    public a(JSONObject jSONObject) {
        this.f17808a = jSONObject;
    }

    public /* synthetic */ a(JSONObject jSONObject, w wVar) {
        this(jSONObject);
    }

    @g
    public final String b() {
        String string = this.f17808a.getString("origin");
        l0.o(string, "playerOptions.getString(Builder.ORIGIN)");
        return string;
    }

    @g
    public String toString() {
        String jSONObject = this.f17808a.toString();
        l0.o(jSONObject, "playerOptions.toString()");
        return jSONObject;
    }
}
