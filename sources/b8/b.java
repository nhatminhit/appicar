package b8;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import d.m0;
import d.o0;
import e8.a;
import j8.s;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import w8.d0;

@a
public class b {

    /* renamed from: c  reason: collision with root package name */
    public static final Lock f4740c = new ReentrantLock();
    @GuardedBy("sLk")
    @o0

    /* renamed from: d  reason: collision with root package name */
    public static b f4741d;

    /* renamed from: a  reason: collision with root package name */
    public final Lock f4742a = new ReentrantLock();
    @GuardedBy("mLk")

    /* renamed from: b  reason: collision with root package name */
    public final SharedPreferences f4743b;

    @d0
    public b(Context context) {
        this.f4743b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    @a
    @m0
    public static b b(@m0 Context context) {
        s.l(context);
        Lock lock = f4740c;
        lock.lock();
        try {
            if (f4741d == null) {
                f4741d = new b(context.getApplicationContext());
            }
            b bVar = f4741d;
            lock.unlock();
            return bVar;
        } catch (Throwable th2) {
            f4740c.unlock();
            throw th2;
        }
    }

    public static final String k(String str, String str2) {
        return str + ":" + str2;
    }

    @a
    public void a() {
        this.f4742a.lock();
        try {
            this.f4743b.edit().clear().apply();
        } finally {
            this.f4742a.unlock();
        }
    }

    @a
    @o0
    public GoogleSignInAccount c() {
        String g10;
        String g11 = g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(g11) || (g10 = g(k("googleSignInAccount", g11))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.R1(g10);
        } catch (JSONException unused) {
            return null;
        }
    }

    @a
    @o0
    public GoogleSignInOptions d() {
        String g10;
        String g11 = g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(g11) || (g10 = g(k("googleSignInOptions", g11))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.F1(g10);
        } catch (JSONException unused) {
            return null;
        }
    }

    @a
    @o0
    public String e() {
        return g("refreshToken");
    }

    @a
    public void f(@m0 GoogleSignInAccount googleSignInAccount, @m0 GoogleSignInOptions googleSignInOptions) {
        s.l(googleSignInAccount);
        s.l(googleSignInOptions);
        j("defaultGoogleSignInAccount", googleSignInAccount.S1());
        s.l(googleSignInAccount);
        s.l(googleSignInOptions);
        String S1 = googleSignInAccount.S1();
        j(k("googleSignInAccount", S1), googleSignInAccount.T1());
        j(k("googleSignInOptions", S1), googleSignInOptions.P1());
    }

    @o0
    public final String g(@m0 String str) {
        this.f4742a.lock();
        try {
            return this.f4743b.getString(str, (String) null);
        } finally {
            this.f4742a.unlock();
        }
    }

    public final void h(@m0 String str) {
        this.f4742a.lock();
        try {
            this.f4743b.edit().remove(str).apply();
        } finally {
            this.f4742a.unlock();
        }
    }

    public final void i() {
        String g10 = g("defaultGoogleSignInAccount");
        h("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(g10)) {
            h(k("googleSignInAccount", g10));
            h(k("googleSignInOptions", g10));
        }
    }

    public final void j(@m0 String str, @m0 String str2) {
        this.f4742a.lock();
        try {
            this.f4743b.edit().putString(str, str2).apply();
        } finally {
            this.f4742a.unlock();
        }
    }
}
