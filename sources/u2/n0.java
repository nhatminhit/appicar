package u2;

import a3.d;
import android.annotation.SuppressLint;
import android.content.Context;
import d.m0;
import d.o0;
import d.x0;
import java.io.File;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import u2.n2;

public class n0 {
    @m0

    /* renamed from: a  reason: collision with root package name */
    public final d.c f13520a;
    @m0

    /* renamed from: b  reason: collision with root package name */
    public final Context f13521b;
    @o0

    /* renamed from: c  reason: collision with root package name */
    public final String f13522c;
    @m0

    /* renamed from: d  reason: collision with root package name */
    public final n2.d f13523d;
    @o0

    /* renamed from: e  reason: collision with root package name */
    public final List<n2.b> f13524e;
    @o0

    /* renamed from: f  reason: collision with root package name */
    public final n2.e f13525f;
    @m0

    /* renamed from: g  reason: collision with root package name */
    public final List<Object> f13526g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f13527h;

    /* renamed from: i  reason: collision with root package name */
    public final n2.c f13528i;
    @m0

    /* renamed from: j  reason: collision with root package name */
    public final Executor f13529j;
    @m0

    /* renamed from: k  reason: collision with root package name */
    public final Executor f13530k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f13531l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f13532m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f13533n;

    /* renamed from: o  reason: collision with root package name */
    public final Set<Integer> f13534o;
    @o0

    /* renamed from: p  reason: collision with root package name */
    public final String f13535p;
    @o0

    /* renamed from: q  reason: collision with root package name */
    public final File f13536q;
    @o0

    /* renamed from: r  reason: collision with root package name */
    public final Callable<InputStream> f13537r;

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public n0(@m0 Context context, @o0 String str, @m0 d.c cVar, @m0 n2.d dVar, @o0 List<n2.b> list, boolean z10, n2.c cVar2, @m0 Executor executor, @m0 Executor executor2, boolean z11, boolean z12, boolean z13, @o0 Set<Integer> set) {
        this(context, str, cVar, dVar, list, z10, cVar2, executor, executor2, z11, z12, z13, set, (String) null, (File) null, (Callable<InputStream>) null, (n2.e) null, (List<Object>) null);
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public n0(@m0 Context context, @o0 String str, @m0 d.c cVar, @m0 n2.d dVar, @o0 List<n2.b> list, boolean z10, n2.c cVar2, @m0 Executor executor, @m0 Executor executor2, boolean z11, boolean z12, boolean z13, @o0 Set<Integer> set, @o0 String str2, @o0 File file) {
        this(context, str, cVar, dVar, list, z10, cVar2, executor, executor2, z11, z12, z13, set, str2, file, (Callable<InputStream>) null, (n2.e) null, (List<Object>) null);
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public n0(@m0 Context context, @o0 String str, @m0 d.c cVar, @m0 n2.d dVar, @o0 List<n2.b> list, boolean z10, @m0 n2.c cVar2, @m0 Executor executor, @m0 Executor executor2, boolean z11, boolean z12, boolean z13, @o0 Set<Integer> set, @o0 String str2, @o0 File file, @o0 Callable<InputStream> callable) {
        this(context, str, cVar, dVar, list, z10, cVar2, executor, executor2, z11, z12, z13, set, str2, file, callable, (n2.e) null, (List<Object>) null);
    }

    @SuppressLint({"LambdaLast"})
    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public n0(@m0 Context context, @o0 String str, @m0 d.c cVar, @m0 n2.d dVar, @o0 List<n2.b> list, boolean z10, @m0 n2.c cVar2, @m0 Executor executor, @m0 Executor executor2, boolean z11, boolean z12, boolean z13, @o0 Set<Integer> set, @o0 String str2, @o0 File file, @o0 Callable<InputStream> callable, @o0 n2.e eVar) {
        this(context, str, cVar, dVar, list, z10, cVar2, executor, executor2, z11, z12, z13, set, str2, file, callable, eVar, (List<Object>) null);
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    @SuppressLint({"LambdaLast"})
    public n0(@m0 Context context, @o0 String str, @m0 d.c cVar, @m0 n2.d dVar, @o0 List<n2.b> list, boolean z10, @m0 n2.c cVar2, @m0 Executor executor, @m0 Executor executor2, boolean z11, boolean z12, boolean z13, @o0 Set<Integer> set, @o0 String str2, @o0 File file, @o0 Callable<InputStream> callable, @o0 n2.e eVar, @o0 List<Object> list2) {
        this.f13520a = cVar;
        this.f13521b = context;
        this.f13522c = str;
        this.f13523d = dVar;
        this.f13524e = list;
        this.f13527h = z10;
        this.f13528i = cVar2;
        this.f13529j = executor;
        this.f13530k = executor2;
        this.f13531l = z11;
        this.f13532m = z12;
        this.f13533n = z13;
        this.f13534o = set;
        this.f13535p = str2;
        this.f13536q = file;
        this.f13537r = callable;
        this.f13525f = eVar;
        this.f13526g = list2 == null ? Collections.emptyList() : list2;
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public n0(@m0 Context context, @o0 String str, @m0 d.c cVar, @m0 n2.d dVar, @o0 List<n2.b> list, boolean z10, n2.c cVar2, @m0 Executor executor, boolean z11, @o0 Set<Integer> set) {
        this(context, str, cVar, dVar, list, z10, cVar2, executor, executor, false, z11, false, set, (String) null, (File) null, (Callable<InputStream>) null, (n2.e) null, (List<Object>) null);
    }

    public boolean a(int i10, int i11) {
        Set<Integer> set;
        if (!(i10 > i11) || !this.f13533n) {
            return this.f13532m && ((set = this.f13534o) == null || !set.contains(Integer.valueOf(i10)));
        }
        return false;
    }

    @Deprecated
    public boolean b(int i10) {
        return a(i10, i10 + 1);
    }
}
