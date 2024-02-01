package j8;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import androidx.collection.b;
import com.google.android.gms.common.api.Scope;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import d.m0;
import d.o0;
import f8.k;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import w8.d0;

@e8.a
@d0
public final class e {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    public final Account f9736a;

    /* renamed from: b  reason: collision with root package name */
    public final Set f9737b;

    /* renamed from: c  reason: collision with root package name */
    public final Set f9738c;

    /* renamed from: d  reason: collision with root package name */
    public final Map f9739d;

    /* renamed from: e  reason: collision with root package name */
    public final int f9740e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public final View f9741f;

    /* renamed from: g  reason: collision with root package name */
    public final String f9742g;

    /* renamed from: h  reason: collision with root package name */
    public final String f9743h;

    /* renamed from: i  reason: collision with root package name */
    public final f9.a f9744i;

    /* renamed from: j  reason: collision with root package name */
    public Integer f9745j;

    @e8.a
    public static final class a {
        @Nullable

        /* renamed from: a  reason: collision with root package name */
        public Account f9746a;

        /* renamed from: b  reason: collision with root package name */
        public b f9747b;

        /* renamed from: c  reason: collision with root package name */
        public String f9748c;

        /* renamed from: d  reason: collision with root package name */
        public String f9749d;

        /* renamed from: e  reason: collision with root package name */
        public f9.a f9750e = f9.a.X;

        @e8.a
        @m0
        public e a() {
            return new e(this.f9746a, this.f9747b, (Map) null, 0, (View) null, this.f9748c, this.f9749d, this.f9750e, false);
        }

        @e8.a
        @CanIgnoreReturnValue
        @m0
        public a b(@m0 String str) {
            this.f9748c = str;
            return this;
        }

        @CanIgnoreReturnValue
        @m0
        public final a c(@m0 Collection collection) {
            if (this.f9747b == null) {
                this.f9747b = new b();
            }
            this.f9747b.addAll(collection);
            return this;
        }

        @CanIgnoreReturnValue
        @m0
        public final a d(@Nullable Account account) {
            this.f9746a = account;
            return this;
        }

        @CanIgnoreReturnValue
        @m0
        public final a e(@m0 String str) {
            this.f9749d = str;
            return this;
        }
    }

    @e8.a
    public e(@m0 Account account, @m0 Set<Scope> set, @m0 Map<f8.a<?>, g0> map, int i10, @Nullable View view, @m0 String str, @m0 String str2, @Nullable f9.a aVar) {
        this(account, set, map, i10, view, str, str2, aVar, false);
    }

    public e(@Nullable Account account, @m0 Set set, @m0 Map map, int i10, @Nullable View view, @m0 String str, @m0 String str2, @Nullable f9.a aVar, boolean z10) {
        this.f9736a = account;
        Set emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f9737b = emptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.f9739d = map;
        this.f9741f = view;
        this.f9740e = i10;
        this.f9742g = str;
        this.f9743h = str2;
        this.f9744i = aVar == null ? f9.a.X : aVar;
        HashSet hashSet = new HashSet(emptySet);
        for (g0 g0Var : map.values()) {
            hashSet.addAll(g0Var.f9759a);
        }
        this.f9738c = Collections.unmodifiableSet(hashSet);
    }

    @e8.a
    @m0
    public static e a(@m0 Context context) {
        return new k.a(context).p();
    }

    @e8.a
    @o0
    public Account b() {
        return this.f9736a;
    }

    @e8.a
    @o0
    @Deprecated
    public String c() {
        Account account = this.f9736a;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    @e8.a
    @m0
    public Account d() {
        Account account = this.f9736a;
        return account != null ? account : new Account("<<default account>>", a.f9695a);
    }

    @e8.a
    @m0
    public Set<Scope> e() {
        return this.f9738c;
    }

    @e8.a
    @m0
    public Set<Scope> f(@m0 f8.a<?> aVar) {
        g0 g0Var = (g0) this.f9739d.get(aVar);
        if (g0Var == null || g0Var.f9759a.isEmpty()) {
            return this.f9737b;
        }
        HashSet hashSet = new HashSet(this.f9737b);
        hashSet.addAll(g0Var.f9759a);
        return hashSet;
    }

    @e8.a
    public int g() {
        return this.f9740e;
    }

    @e8.a
    @m0
    public String h() {
        return this.f9742g;
    }

    @e8.a
    @m0
    public Set<Scope> i() {
        return this.f9737b;
    }

    @e8.a
    @o0
    public View j() {
        return this.f9741f;
    }

    @m0
    public final f9.a k() {
        return this.f9744i;
    }

    @o0
    public final Integer l() {
        return this.f9745j;
    }

    @o0
    public final String m() {
        return this.f9743h;
    }

    @m0
    public final Map n() {
        return this.f9739d;
    }

    public final void o(@m0 Integer num) {
        this.f9745j = num;
    }
}
