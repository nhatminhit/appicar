package f8;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import d.m0;
import java.util.ArrayList;
import java.util.List;

public final class d extends BasePendingResult<e> {

    /* renamed from: r  reason: collision with root package name */
    public int f7428r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f7429s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f7430t;

    /* renamed from: u  reason: collision with root package name */
    public final o[] f7431u;

    /* renamed from: v  reason: collision with root package name */
    public final Object f7432v = new Object();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public List f7433a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public k f7434b;

        public a(@m0 k kVar) {
            this.f7434b = kVar;
        }

        @m0
        public <R extends u> f<R> a(@m0 o<R> oVar) {
            f<R> fVar = new f<>(this.f7433a.size());
            this.f7433a.add(oVar);
            return fVar;
        }

        @m0
        public d b() {
            return new d(this.f7433a, this.f7434b, (c0) null);
        }
    }

    public /* synthetic */ d(List list, k kVar, c0 c0Var) {
        super(kVar);
        int size = list.size();
        this.f7428r = size;
        o[] oVarArr = new o[size];
        this.f7431u = oVarArr;
        if (!list.isEmpty()) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                o oVar = (o) list.get(i10);
                this.f7431u[i10] = oVar;
                oVar.c(new b0(this));
            }
            return;
        }
        o(new e(Status.U, oVarArr));
    }

    public void f() {
        super.f();
        for (o f10 : this.f7431u) {
            f10.f();
        }
    }

    @m0
    /* renamed from: w */
    public e k(@m0 Status status) {
        return new e(status, this.f7431u);
    }
}
