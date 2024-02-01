package qd;

import java.util.List;
import java.util.Map;
import og.g;
import og.p0;

public abstract class d extends pd.a {

    /* renamed from: p  reason: collision with root package name */
    public static final String f22338p = "open";

    /* renamed from: q  reason: collision with root package name */
    public static final String f22339q = "close";

    /* renamed from: r  reason: collision with root package name */
    public static final String f22340r = "packet";

    /* renamed from: s  reason: collision with root package name */
    public static final String f22341s = "drain";

    /* renamed from: t  reason: collision with root package name */
    public static final String f22342t = "error";

    /* renamed from: u  reason: collision with root package name */
    public static final String f22343u = "requestHeaders";

    /* renamed from: v  reason: collision with root package name */
    public static final String f22344v = "responseHeaders";

    /* renamed from: b  reason: collision with root package name */
    public boolean f22345b;

    /* renamed from: c  reason: collision with root package name */
    public String f22346c;

    /* renamed from: d  reason: collision with root package name */
    public Map<String, String> f22347d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f22348e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f22349f;

    /* renamed from: g  reason: collision with root package name */
    public int f22350g;

    /* renamed from: h  reason: collision with root package name */
    public String f22351h;

    /* renamed from: i  reason: collision with root package name */
    public String f22352i;

    /* renamed from: j  reason: collision with root package name */
    public String f22353j;

    /* renamed from: k  reason: collision with root package name */
    public c f22354k;

    /* renamed from: l  reason: collision with root package name */
    public e f22355l;

    /* renamed from: m  reason: collision with root package name */
    public p0.a f22356m;

    /* renamed from: n  reason: collision with root package name */
    public g.a f22357n;

    /* renamed from: o  reason: collision with root package name */
    public Map<String, List<String>> f22358o;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            d dVar = d.this;
            e eVar = dVar.f22355l;
            if (eVar == e.CLOSED || eVar == null) {
                dVar.f22355l = e.OPENING;
                dVar.l();
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            d dVar = d.this;
            e eVar = dVar.f22355l;
            if (eVar == e.OPENING || eVar == e.OPEN) {
                dVar.k();
                d.this.m();
            }
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ sd.b[] O;

        public c(sd.b[] bVarArr) {
            this.O = bVarArr;
        }

        public void run() {
            d dVar = d.this;
            if (dVar.f22355l == e.OPEN) {
                dVar.u(this.O);
                return;
            }
            throw new RuntimeException("Transport not open");
        }
    }

    /* renamed from: qd.d$d  reason: collision with other inner class name */
    public static class C0393d {

        /* renamed from: a  reason: collision with root package name */
        public String f22359a;

        /* renamed from: b  reason: collision with root package name */
        public String f22360b;

        /* renamed from: c  reason: collision with root package name */
        public String f22361c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f22362d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f22363e;

        /* renamed from: f  reason: collision with root package name */
        public int f22364f = -1;

        /* renamed from: g  reason: collision with root package name */
        public int f22365g = -1;

        /* renamed from: h  reason: collision with root package name */
        public Map<String, String> f22366h;

        /* renamed from: i  reason: collision with root package name */
        public c f22367i;

        /* renamed from: j  reason: collision with root package name */
        public p0.a f22368j;

        /* renamed from: k  reason: collision with root package name */
        public g.a f22369k;

        /* renamed from: l  reason: collision with root package name */
        public Map<String, List<String>> f22370l;
    }

    public enum e {
        OPENING,
        OPEN,
        CLOSED,
        R;

        public String toString() {
            return super.toString().toLowerCase();
        }
    }

    public d(C0393d dVar) {
        this.f22351h = dVar.f22360b;
        this.f22352i = dVar.f22359a;
        this.f22350g = dVar.f22364f;
        this.f22348e = dVar.f22362d;
        this.f22347d = dVar.f22366h;
        this.f22353j = dVar.f22361c;
        this.f22349f = dVar.f22363e;
        this.f22354k = dVar.f22367i;
        this.f22356m = dVar.f22368j;
        this.f22357n = dVar.f22369k;
        this.f22358o = dVar.f22370l;
    }

    public d j() {
        xd.a.h(new b());
        return this;
    }

    public abstract void k();

    public abstract void l();

    public void m() {
        this.f22355l = e.CLOSED;
        a("close", new Object[0]);
    }

    public void n(String str) {
        r(sd.c.b(str));
    }

    public void o(byte[] bArr) {
        r(sd.c.c(bArr));
    }

    public d p(String str, Exception exc) {
        a("error", new a(str, exc));
        return this;
    }

    public void q() {
        this.f22355l = e.OPEN;
        this.f22345b = true;
        a("open", new Object[0]);
    }

    public void r(sd.b bVar) {
        a("packet", bVar);
    }

    public d s() {
        xd.a.h(new a());
        return this;
    }

    public void t(sd.b[] bVarArr) {
        xd.a.h(new c(bVarArr));
    }

    public abstract void u(sd.b[] bVarArr);
}
