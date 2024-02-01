package a0;

import java.util.ArrayList;
import java.util.List;

public class f implements d {

    /* renamed from: a  reason: collision with root package name */
    public d f38a = null;

    /* renamed from: b  reason: collision with root package name */
    public boolean f39b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f40c = false;

    /* renamed from: d  reason: collision with root package name */
    public p f41d;

    /* renamed from: e  reason: collision with root package name */
    public a f42e = a.UNKNOWN;

    /* renamed from: f  reason: collision with root package name */
    public int f43f;

    /* renamed from: g  reason: collision with root package name */
    public int f44g;

    /* renamed from: h  reason: collision with root package name */
    public int f45h = 1;

    /* renamed from: i  reason: collision with root package name */
    public g f46i = null;

    /* renamed from: j  reason: collision with root package name */
    public boolean f47j = false;

    /* renamed from: k  reason: collision with root package name */
    public List<d> f48k = new ArrayList();

    /* renamed from: l  reason: collision with root package name */
    public List<f> f49l = new ArrayList();

    public enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(p pVar) {
        this.f41d = pVar;
    }

    public void a(d dVar) {
        for (f fVar : this.f49l) {
            if (!fVar.f47j) {
                return;
            }
        }
        this.f40c = true;
        d dVar2 = this.f38a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f39b) {
            this.f41d.a(this);
            return;
        }
        f fVar2 = null;
        int i10 = 0;
        for (f next : this.f49l) {
            if (!(next instanceof g)) {
                i10++;
                fVar2 = next;
            }
        }
        if (fVar2 != null && i10 == 1 && fVar2.f47j) {
            g gVar = this.f46i;
            if (gVar != null) {
                if (gVar.f47j) {
                    this.f43f = this.f45h * gVar.f44g;
                } else {
                    return;
                }
            }
            e(fVar2.f44g + this.f43f);
        }
        d dVar3 = this.f38a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b(d dVar) {
        this.f48k.add(dVar);
        if (this.f47j) {
            dVar.a(dVar);
        }
    }

    public void c() {
        this.f49l.clear();
        this.f48k.clear();
        this.f47j = false;
        this.f44g = 0;
        this.f40c = false;
        this.f39b = false;
    }

    public String d() {
        StringBuilder sb2;
        String str;
        String y10 = this.f41d.f89b.y();
        a aVar = this.f42e;
        if (aVar == a.LEFT || aVar == a.RIGHT) {
            sb2 = new StringBuilder();
            sb2.append(y10);
            str = "_HORIZONTAL";
        } else {
            sb2 = new StringBuilder();
            sb2.append(y10);
            str = "_VERTICAL";
        }
        sb2.append(str);
        String sb3 = sb2.toString();
        return sb3 + ":" + this.f42e.name();
    }

    public void e(int i10) {
        if (!this.f47j) {
            this.f47j = true;
            this.f44g = i10;
            for (d next : this.f48k) {
                next.a(next);
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f41d.f89b.y());
        sb2.append(":");
        sb2.append(this.f42e);
        sb2.append("(");
        sb2.append(this.f47j ? Integer.valueOf(this.f44g) : "unresolved");
        sb2.append(") <t=");
        sb2.append(this.f49l.size());
        sb2.append(":d=");
        sb2.append(this.f48k.size());
        sb2.append(">");
        return sb2.toString();
    }
}
