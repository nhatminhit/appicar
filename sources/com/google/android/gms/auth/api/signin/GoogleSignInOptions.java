package com.google.android.gms.auth.api.signin;

import a8.d;
import a8.e;
import a8.f;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import d.m0;
import d.o0;
import d8.r;
import f8.a;
import j8.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l8.b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w8.d0;

@SafeParcelable.a(creator = "GoogleSignInOptionsCreator")
public class GoogleSignInOptions extends AbstractSafeParcelable implements a.d.f, ReflectedParcelable {
    @m0
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR = new f();
    @m0
    public static final GoogleSignInOptions Z;
    @m0

    /* renamed from: a0  reason: collision with root package name */
    public static final GoogleSignInOptions f5591a0;
    @d0
    @m0

    /* renamed from: b0  reason: collision with root package name */
    public static final Scope f5592b0 = new Scope(r.f6637a);
    @d0
    @m0

    /* renamed from: c0  reason: collision with root package name */
    public static final Scope f5593c0 = new Scope("email");
    @d0
    @m0

    /* renamed from: d0  reason: collision with root package name */
    public static final Scope f5594d0 = new Scope(r.f6639c);
    @d0
    @m0

    /* renamed from: e0  reason: collision with root package name */
    public static final Scope f5595e0;
    @d0
    @m0

    /* renamed from: f0  reason: collision with root package name */
    public static final Scope f5596f0 = new Scope(r.f6644h);

    /* renamed from: g0  reason: collision with root package name */
    public static Comparator f5597g0 = new d();
    @SafeParcelable.h(id = 1)
    public final int O;
    @SafeParcelable.c(getter = "getScopes", id = 2)
    public final ArrayList P;
    @o0
    @SafeParcelable.c(getter = "getAccount", id = 3)
    public Account Q;
    @SafeParcelable.c(getter = "isIdTokenRequested", id = 4)
    public boolean R;
    @SafeParcelable.c(getter = "isServerAuthCodeRequested", id = 5)
    public final boolean S;
    @SafeParcelable.c(getter = "isForceCodeForRefreshToken", id = 6)
    public final boolean T;
    @o0
    @SafeParcelable.c(getter = "getServerClientId", id = 7)
    public String U;
    @o0
    @SafeParcelable.c(getter = "getHostedDomain", id = 8)
    public String V;
    @SafeParcelable.c(getter = "getExtensions", id = 9)
    public ArrayList W;
    @o0
    @SafeParcelable.c(getter = "getLogSessionId", id = 10)
    public String X;
    public Map Y;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public Set f5598a = new HashSet();

        /* renamed from: b  reason: collision with root package name */
        public boolean f5599b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f5600c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f5601d;
        @o0

        /* renamed from: e  reason: collision with root package name */
        public String f5602e;
        @o0

        /* renamed from: f  reason: collision with root package name */
        public Account f5603f;
        @o0

        /* renamed from: g  reason: collision with root package name */
        public String f5604g;

        /* renamed from: h  reason: collision with root package name */
        public Map f5605h = new HashMap();
        @o0

        /* renamed from: i  reason: collision with root package name */
        public String f5606i;

        public a() {
        }

        public a(@m0 GoogleSignInOptions googleSignInOptions) {
            s.l(googleSignInOptions);
            this.f5598a = new HashSet(googleSignInOptions.P);
            this.f5599b = googleSignInOptions.S;
            this.f5600c = googleSignInOptions.T;
            this.f5601d = googleSignInOptions.R;
            this.f5602e = googleSignInOptions.U;
            this.f5603f = googleSignInOptions.Q;
            this.f5604g = googleSignInOptions.V;
            this.f5605h = GoogleSignInOptions.W1(googleSignInOptions.W);
            this.f5606i = googleSignInOptions.X;
        }

        @CanIgnoreReturnValue
        @m0
        public a a(@m0 a8.a aVar) {
            if (!this.f5605h.containsKey(Integer.valueOf(aVar.b()))) {
                List<Scope> c10 = aVar.c();
                if (c10 != null) {
                    this.f5598a.addAll(c10);
                }
                this.f5605h.put(Integer.valueOf(aVar.b()), new GoogleSignInOptionsExtensionParcelable(aVar));
                return this;
            }
            throw new IllegalStateException("Only one extension per type may be added");
        }

        @m0
        public GoogleSignInOptions b() {
            if (this.f5598a.contains(GoogleSignInOptions.f5596f0)) {
                Set set = this.f5598a;
                Scope scope = GoogleSignInOptions.f5595e0;
                if (set.contains(scope)) {
                    this.f5598a.remove(scope);
                }
            }
            if (this.f5601d && (this.f5603f == null || !this.f5598a.isEmpty())) {
                d();
            }
            return new GoogleSignInOptions(3, new ArrayList(this.f5598a), this.f5603f, this.f5601d, this.f5599b, this.f5600c, this.f5602e, this.f5604g, this.f5605h, this.f5606i, (e) null);
        }

        @CanIgnoreReturnValue
        @m0
        public a c() {
            this.f5598a.add(GoogleSignInOptions.f5593c0);
            return this;
        }

        @CanIgnoreReturnValue
        @m0
        public a d() {
            this.f5598a.add(GoogleSignInOptions.f5594d0);
            return this;
        }

        @CanIgnoreReturnValue
        @m0
        public a e(@m0 String str) {
            this.f5601d = true;
            m(str);
            this.f5602e = str;
            return this;
        }

        @CanIgnoreReturnValue
        @m0
        public a f() {
            this.f5598a.add(GoogleSignInOptions.f5592b0);
            return this;
        }

        @CanIgnoreReturnValue
        @m0
        public a g(@m0 Scope scope, @m0 Scope... scopeArr) {
            this.f5598a.add(scope);
            this.f5598a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        @m0
        public a h(@m0 String str) {
            i(str, false);
            return this;
        }

        @CanIgnoreReturnValue
        @m0
        public a i(@m0 String str, boolean z10) {
            this.f5599b = true;
            m(str);
            this.f5602e = str;
            this.f5600c = z10;
            return this;
        }

        @CanIgnoreReturnValue
        @m0
        public a j(@m0 String str) {
            this.f5603f = new Account(s.h(str), j8.a.f9695a);
            return this;
        }

        @CanIgnoreReturnValue
        @m0
        public a k(@m0 String str) {
            this.f5604g = s.h(str);
            return this;
        }

        @e8.a
        @CanIgnoreReturnValue
        @m0
        public a l(@m0 String str) {
            this.f5606i = str;
            return this;
        }

        public final String m(String str) {
            s.h(str);
            String str2 = this.f5602e;
            boolean z10 = true;
            if (str2 != null && !str2.equals(str)) {
                z10 = false;
            }
            s.b(z10, "two different server client ids provided");
            return str;
        }
    }

    static {
        Scope scope = new Scope(r.f6645i);
        f5595e0 = scope;
        a aVar = new a();
        aVar.d();
        aVar.f();
        Z = aVar.b();
        a aVar2 = new a();
        aVar2.g(scope, new Scope[0]);
        f5591a0 = aVar2.b();
    }

    @SafeParcelable.b
    public GoogleSignInOptions(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) ArrayList arrayList, @SafeParcelable.e(id = 3) @o0 Account account, @SafeParcelable.e(id = 4) boolean z10, @SafeParcelable.e(id = 5) boolean z11, @SafeParcelable.e(id = 6) boolean z12, @SafeParcelable.e(id = 7) @o0 String str, @SafeParcelable.e(id = 8) @o0 String str2, @SafeParcelable.e(id = 9) ArrayList arrayList2, @SafeParcelable.e(id = 10) @o0 String str3) {
        this(i10, arrayList, account, z10, z11, z12, str, str2, W1(arrayList2), str3);
    }

    public GoogleSignInOptions(int i10, ArrayList arrayList, @o0 Account account, boolean z10, boolean z11, boolean z12, @o0 String str, @o0 String str2, Map map, @o0 String str3) {
        this.O = i10;
        this.P = arrayList;
        this.Q = account;
        this.R = z10;
        this.S = z11;
        this.T = z12;
        this.U = str;
        this.V = str2;
        this.W = new ArrayList(map.values());
        this.Y = map;
        this.X = str3;
    }

    public /* synthetic */ GoogleSignInOptions(int i10, ArrayList arrayList, Account account, boolean z10, boolean z11, boolean z12, String str, String str2, Map map, String str3, e eVar) {
        this(3, arrayList, account, z10, z11, z12, str, str2, map, str3);
    }

    @o0
    public static GoogleSignInOptions F1(@o0 String str) throws JSONException {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(jSONArray.getString(i10)));
        }
        String optString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        Account account = !TextUtils.isEmpty(optString) ? new Account(optString, j8.a.f9695a) : null;
        ArrayList arrayList = new ArrayList(hashSet);
        boolean z10 = jSONObject.getBoolean("idTokenRequested");
        boolean z11 = jSONObject.getBoolean("serverAuthRequested");
        boolean z12 = jSONObject.getBoolean("forceCodeForRefreshToken");
        String optString2 = jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null;
        if (jSONObject.has("hostedDomain")) {
            str2 = jSONObject.optString("hostedDomain");
        }
        return new GoogleSignInOptions(3, arrayList, account, z10, z11, z12, optString2, str2, (Map) new HashMap(), (String) null);
    }

    public static Map W1(@o0 List list) {
        HashMap hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable = (GoogleSignInOptionsExtensionParcelable) it.next();
            hashMap.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.X0()), googleSignInOptionsExtensionParcelable);
        }
        return hashMap;
    }

    @m0
    public final String P1() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.P, f5597g0);
            Iterator it = this.P.iterator();
            while (it.hasNext()) {
                jSONArray.put(((Scope) it.next()).X0());
            }
            jSONObject.put("scopes", jSONArray);
            Account account = this.Q;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.R);
            jSONObject.put("forceCodeForRefreshToken", this.T);
            jSONObject.put("serverAuthRequested", this.S);
            if (!TextUtils.isEmpty(this.U)) {
                jSONObject.put("serverClientId", this.U);
            }
            if (!TextUtils.isEmpty(this.V)) {
                jSONObject.put("hostedDomain", this.V);
            }
            return jSONObject.toString();
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    @e8.a
    @m0
    public ArrayList<GoogleSignInOptionsExtensionParcelable> X0() {
        return this.W;
    }

    @e8.a
    @o0
    public Account Y() {
        return this.Q;
    }

    @e8.a
    @o0
    public String Z0() {
        return this.X;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        if (r1.equals(r4.Y()) != false) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(@d.o0 java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch:{ ClassCastException -> 0x0090 }
            java.util.ArrayList r1 = r3.W     // Catch:{ ClassCastException -> 0x0090 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 > 0) goto L_0x0090
            java.util.ArrayList r1 = r4.W     // Catch:{ ClassCastException -> 0x0090 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 <= 0) goto L_0x0018
            goto L_0x0090
        L_0x0018:
            java.util.ArrayList r1 = r3.P     // Catch:{ ClassCastException -> 0x0090 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0090 }
            java.util.ArrayList r2 = r4.g1()     // Catch:{ ClassCastException -> 0x0090 }
            int r2 = r2.size()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            java.util.ArrayList r1 = r3.P     // Catch:{ ClassCastException -> 0x0090 }
            java.util.ArrayList r2 = r4.g1()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = r1.containsAll(r2)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x0035
            goto L_0x0090
        L_0x0035:
            android.accounts.Account r1 = r3.Q     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x0040
            android.accounts.Account r1 = r4.Y()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x0090
            goto L_0x004a
        L_0x0040:
            android.accounts.Account r2 = r4.Y()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 == 0) goto L_0x0090
        L_0x004a:
            java.lang.String r1 = r3.U     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 == 0) goto L_0x005d
            java.lang.String r1 = r4.h1()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 == 0) goto L_0x0090
            goto L_0x006a
        L_0x005d:
            java.lang.String r1 = r3.U     // Catch:{ ClassCastException -> 0x0090 }
            java.lang.String r2 = r4.h1()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x006a
            goto L_0x0090
        L_0x006a:
            boolean r1 = r3.T     // Catch:{ ClassCastException -> 0x0090 }
            boolean r2 = r4.m1()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            boolean r1 = r3.R     // Catch:{ ClassCastException -> 0x0090 }
            boolean r2 = r4.p1()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            boolean r1 = r3.S     // Catch:{ ClassCastException -> 0x0090 }
            boolean r2 = r4.r1()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            java.lang.String r1 = r3.X     // Catch:{ ClassCastException -> 0x0090 }
            java.lang.String r4 = r4.Z0()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r4 = android.text.TextUtils.equals(r1, r4)     // Catch:{ ClassCastException -> 0x0090 }
            if (r4 == 0) goto L_0x0090
            r4 = 1
            return r4
        L_0x0090:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    @m0
    public Scope[] f1() {
        ArrayList arrayList = this.P;
        return (Scope[]) arrayList.toArray(new Scope[arrayList.size()]);
    }

    @e8.a
    @m0
    public ArrayList<Scope> g1() {
        return new ArrayList<>(this.P);
    }

    @e8.a
    @o0
    public String h1() {
        return this.U;
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.P;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((Scope) arrayList2.get(i10)).X0());
        }
        Collections.sort(arrayList);
        b8.a aVar = new b8.a();
        aVar.a(arrayList);
        aVar.a(this.Q);
        aVar.a(this.U);
        aVar.c(this.T);
        aVar.c(this.R);
        aVar.c(this.S);
        aVar.a(this.X);
        return aVar.b();
    }

    @e8.a
    public boolean m1() {
        return this.T;
    }

    @e8.a
    public boolean p1() {
        return this.R;
    }

    @e8.a
    public boolean r1() {
        return this.S;
    }

    public void writeToParcel(@m0 Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.F(parcel, 1, this.O);
        b.d0(parcel, 2, g1(), false);
        b.S(parcel, 3, Y(), i10, false);
        b.g(parcel, 4, p1());
        b.g(parcel, 5, r1());
        b.g(parcel, 6, m1());
        b.Y(parcel, 7, h1(), false);
        b.Y(parcel, 8, this.V, false);
        b.d0(parcel, 9, X0(), false);
        b.Y(parcel, 10, Z0(), false);
        b.b(parcel, a10);
    }
}
