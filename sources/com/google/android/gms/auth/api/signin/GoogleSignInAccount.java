package com.google.android.gms.auth.api.signin;

import a8.c;
import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.collection.b;
import androidx.core.content.FileProvider;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import d.m0;
import d.o0;
import e8.a;
import j8.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import w8.d0;
import w8.g;
import w8.k;

@SafeParcelable.a(creator = "GoogleSignInAccountCreator")
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    @m0
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new c();
    @d0
    @m0

    /* renamed from: b0  reason: collision with root package name */
    public static g f5589b0 = k.e();
    @SafeParcelable.h(id = 1)
    public final int O;
    @o0
    @SafeParcelable.c(getter = "getId", id = 2)
    public String P;
    @o0
    @SafeParcelable.c(getter = "getIdToken", id = 3)
    public String Q;
    @o0
    @SafeParcelable.c(getter = "getEmail", id = 4)
    public String R;
    @o0
    @SafeParcelable.c(getter = "getDisplayName", id = 5)
    public String S;
    @o0
    @SafeParcelable.c(getter = "getPhotoUrl", id = 6)
    public Uri T;
    @o0
    @SafeParcelable.c(getter = "getServerAuthCode", id = 7)
    public String U;
    @SafeParcelable.c(getter = "getExpirationTimeSecs", id = 8)
    public long V;
    @SafeParcelable.c(getter = "getObfuscatedIdentifier", id = 9)
    public String W;
    @SafeParcelable.c(id = 10)
    public List X;
    @o0
    @SafeParcelable.c(getter = "getGivenName", id = 11)
    public String Y;
    @o0
    @SafeParcelable.c(getter = "getFamilyName", id = 12)
    public String Z;

    /* renamed from: a0  reason: collision with root package name */
    public Set f5590a0 = new HashSet();

    @SafeParcelable.b
    public GoogleSignInAccount(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) @o0 String str, @SafeParcelable.e(id = 3) @o0 String str2, @SafeParcelable.e(id = 4) @o0 String str3, @SafeParcelable.e(id = 5) @o0 String str4, @SafeParcelable.e(id = 6) @o0 Uri uri, @SafeParcelable.e(id = 7) @o0 String str5, @SafeParcelable.e(id = 8) long j10, @SafeParcelable.e(id = 9) String str6, @SafeParcelable.e(id = 10) List list, @SafeParcelable.e(id = 11) @o0 String str7, @SafeParcelable.e(id = 12) @o0 String str8) {
        this.O = i10;
        this.P = str;
        this.Q = str2;
        this.R = str3;
        this.S = str4;
        this.T = uri;
        this.U = str5;
        this.V = j10;
        this.W = str6;
        this.X = list;
        this.Y = str7;
        this.Z = str8;
    }

    @m0
    public static GoogleSignInAccount Q1(@o0 String str, @o0 String str2, @o0 String str3, @o0 String str4, @o0 String str5, @o0 String str6, @o0 Uri uri, @o0 Long l10, @m0 String str7, @m0 Set set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, (String) null, l10.longValue(), s.h(str7), new ArrayList((Collection) s.l(set)), str5, str6);
    }

    @o0
    public static GoogleSignInAccount R1(@o0 String str) throws JSONException {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(jSONArray.getString(i10)));
        }
        GoogleSignInAccount Q1 = Q1(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has(FileProvider.f2197a0) ? jSONObject.optString(FileProvider.f2197a0) : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        if (jSONObject.has("serverAuthCode")) {
            str2 = jSONObject.optString("serverAuthCode");
        }
        Q1.U = str2;
        return Q1;
    }

    public static GoogleSignInAccount U1(Account account, Set set) {
        return Q1((String) null, (String) null, account.name, (String) null, (String) null, (String) null, (Uri) null, 0L, account.name, set);
    }

    @a
    @m0
    public static GoogleSignInAccount X0() {
        return U1(new Account("<<default account>>", j8.a.f9695a), new HashSet());
    }

    @a
    @m0
    public static GoogleSignInAccount Z0(@m0 Account account) {
        return U1(account, new b());
    }

    @o0
    public String A1() {
        return this.Q;
    }

    @o0
    public Uri F1() {
        return this.T;
    }

    @a
    @m0
    public Set<Scope> L1() {
        HashSet hashSet = new HashSet(this.X);
        hashSet.addAll(this.f5590a0);
        return hashSet;
    }

    @o0
    public String N1() {
        return this.U;
    }

    @a
    public boolean O1() {
        return f5589b0.b() / 1000 >= this.V + -300;
    }

    @a
    @CanIgnoreReturnValue
    @m0
    public GoogleSignInAccount P1(@m0 Scope... scopeArr) {
        if (scopeArr != null) {
            Collections.addAll(this.f5590a0, scopeArr);
        }
        return this;
    }

    @m0
    public final String S1() {
        return this.W;
    }

    @m0
    public final String T1() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (r1() != null) {
                jSONObject.put("id", r1());
            }
            if (A1() != null) {
                jSONObject.put("tokenId", A1());
            }
            if (g1() != null) {
                jSONObject.put("email", g1());
            }
            if (f1() != null) {
                jSONObject.put(FileProvider.f2197a0, f1());
            }
            if (m1() != null) {
                jSONObject.put("givenName", m1());
            }
            if (h1() != null) {
                jSONObject.put("familyName", h1());
            }
            Uri F1 = F1();
            if (F1 != null) {
                jSONObject.put("photoUrl", F1.toString());
            }
            if (N1() != null) {
                jSONObject.put("serverAuthCode", N1());
            }
            jSONObject.put("expirationTime", this.V);
            jSONObject.put("obfuscatedIdentifier", this.W);
            JSONArray jSONArray = new JSONArray();
            List list = this.X;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, a8.b.O);
            for (Scope X0 : scopeArr) {
                jSONArray.put(X0.X0());
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            return jSONObject.toString();
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    @o0
    public Account Y() {
        String str = this.R;
        if (str == null) {
            return null;
        }
        return new Account(str, j8.a.f9695a);
    }

    public boolean equals(@o0 Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.W.equals(this.W) && googleSignInAccount.L1().equals(L1());
    }

    @o0
    public String f1() {
        return this.S;
    }

    @o0
    public String g1() {
        return this.R;
    }

    @o0
    public String h1() {
        return this.Z;
    }

    public int hashCode() {
        return ((this.W.hashCode() + 527) * 31) + L1().hashCode();
    }

    @o0
    public String m1() {
        return this.Y;
    }

    @m0
    public Set<Scope> p1() {
        return new HashSet(this.X);
    }

    @o0
    public String r1() {
        return this.P;
    }

    public void writeToParcel(@m0 Parcel parcel, int i10) {
        int a10 = l8.b.a(parcel);
        l8.b.F(parcel, 1, this.O);
        l8.b.Y(parcel, 2, r1(), false);
        l8.b.Y(parcel, 3, A1(), false);
        l8.b.Y(parcel, 4, g1(), false);
        l8.b.Y(parcel, 5, f1(), false);
        l8.b.S(parcel, 6, F1(), i10, false);
        l8.b.Y(parcel, 7, N1(), false);
        l8.b.K(parcel, 8, this.V);
        l8.b.Y(parcel, 9, this.W, false);
        l8.b.d0(parcel, 10, this.X, false);
        l8.b.Y(parcel, 11, m1(), false);
        l8.b.Y(parcel, 12, h1(), false);
        l8.b.b(parcel, a10);
    }
}
