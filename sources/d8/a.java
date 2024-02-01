package d8;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import d.m0;
import d.o0;
import j8.s;
import java.util.ArrayList;
import java.util.List;

public final class a {

    /* renamed from: d8.a$a  reason: collision with other inner class name */
    public static class C0107a {
        @o0

        /* renamed from: a  reason: collision with root package name */
        public Account f6565a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f6566b;
        @o0

        /* renamed from: c  reason: collision with root package name */
        public ArrayList f6567c;
        @o0

        /* renamed from: d  reason: collision with root package name */
        public ArrayList f6568d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f6569e;
        @o0

        /* renamed from: f  reason: collision with root package name */
        public String f6570f;
        @o0

        /* renamed from: g  reason: collision with root package name */
        public Bundle f6571g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f6572h;

        /* renamed from: i  reason: collision with root package name */
        public int f6573i;
        @o0

        /* renamed from: j  reason: collision with root package name */
        public String f6574j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f6575k;
        @o0

        /* renamed from: l  reason: collision with root package name */
        public w f6576l;
        @o0

        /* renamed from: m  reason: collision with root package name */
        public String f6577m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f6578n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f6579o;

        /* renamed from: d8.a$a$a  reason: collision with other inner class name */
        public static class C0108a {
            @o0

            /* renamed from: a  reason: collision with root package name */
            public Account f6580a;
            @o0

            /* renamed from: b  reason: collision with root package name */
            public ArrayList f6581b;
            @o0

            /* renamed from: c  reason: collision with root package name */
            public ArrayList f6582c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f6583d = false;
            @o0

            /* renamed from: e  reason: collision with root package name */
            public String f6584e;
            @o0

            /* renamed from: f  reason: collision with root package name */
            public Bundle f6585f;

            @m0
            public C0107a a() {
                s.b(true, "We only support hostedDomain filter for account chip styled account picker");
                s.b(true, "Consent is only valid for account chip styled account picker");
                C0107a aVar = new C0107a();
                aVar.f6568d = this.f6582c;
                aVar.f6567c = this.f6581b;
                aVar.f6569e = this.f6583d;
                aVar.f6576l = null;
                aVar.f6574j = null;
                aVar.f6571g = this.f6585f;
                aVar.f6565a = this.f6580a;
                aVar.f6566b = false;
                aVar.f6572h = false;
                aVar.f6577m = null;
                aVar.f6573i = 0;
                aVar.f6570f = this.f6584e;
                aVar.f6575k = false;
                aVar.f6578n = false;
                aVar.f6579o = false;
                return aVar;
            }

            @CanIgnoreReturnValue
            @m0
            public C0108a b(@o0 List<Account> list) {
                this.f6581b = list == null ? null : new ArrayList(list);
                return this;
            }

            @CanIgnoreReturnValue
            @m0
            public C0108a c(@o0 List<String> list) {
                this.f6582c = list == null ? null : new ArrayList(list);
                return this;
            }

            @CanIgnoreReturnValue
            @m0
            public C0108a d(boolean z10) {
                this.f6583d = z10;
                return this;
            }

            @CanIgnoreReturnValue
            @m0
            public C0108a e(@o0 Bundle bundle) {
                this.f6585f = bundle;
                return this;
            }

            @CanIgnoreReturnValue
            @m0
            public C0108a f(@o0 Account account) {
                this.f6580a = account;
                return this;
            }

            @CanIgnoreReturnValue
            @m0
            public C0108a g(@o0 String str) {
                this.f6584e = str;
                return this;
            }
        }
    }

    @Deprecated
    @m0
    public static Intent a(@o0 Account account, @o0 ArrayList<Account> arrayList, @o0 String[] strArr, boolean z10, @o0 String str, @o0 String str2, @o0 String[] strArr2, @o0 Bundle bundle) {
        Intent intent = new Intent();
        s.b(true, "We only support hostedDomain filter for account chip styled account picker");
        intent.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("allowableAccounts", arrayList);
        intent.putExtra("allowableAccountTypes", strArr);
        intent.putExtra("addAccountOptions", bundle);
        intent.putExtra("selectedAccount", account);
        intent.putExtra("alwaysPromptForAccount", z10);
        intent.putExtra("descriptionTextOverride", str);
        intent.putExtra("authTokenType", str2);
        intent.putExtra("addAccountRequiredFeatures", strArr2);
        intent.putExtra("setGmsCoreAccount", false);
        intent.putExtra("overrideTheme", 0);
        intent.putExtra("overrideCustomTheme", 0);
        intent.putExtra("hostedDomainFilter", (String) null);
        return intent;
    }

    @m0
    public static Intent b(@m0 C0107a aVar) {
        Intent intent = new Intent();
        boolean unused = aVar.f6575k;
        String unused2 = aVar.f6574j;
        s.b(true, "We only support hostedDomain filter for account chip styled account picker");
        w unused3 = aVar.f6576l;
        s.b(true, "Consent is only valid for account chip styled account picker");
        boolean unused4 = aVar.f6566b;
        s.b(true, "Making the selected account non-clickable is only supported for the theme THEME_DAY_NIGHT_GOOGLE_MATERIAL2");
        boolean unused5 = aVar.f6575k;
        intent.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("allowableAccounts", aVar.f6567c);
        if (aVar.f6568d != null) {
            intent.putExtra("allowableAccountTypes", (String[]) aVar.f6568d.toArray(new String[0]));
        }
        intent.putExtra("addAccountOptions", aVar.f6571g);
        intent.putExtra("selectedAccount", aVar.f6565a);
        boolean unused6 = aVar.f6566b;
        intent.putExtra("selectedAccountIsNotClickable", false);
        intent.putExtra("alwaysPromptForAccount", aVar.f6569e);
        intent.putExtra("descriptionTextOverride", aVar.f6570f);
        boolean unused7 = aVar.f6572h;
        intent.putExtra("setGmsCoreAccount", false);
        String unused8 = aVar.f6577m;
        intent.putExtra("realClientPackage", (String) null);
        int unused9 = aVar.f6573i;
        intent.putExtra("overrideTheme", 0);
        boolean unused10 = aVar.f6575k;
        intent.putExtra("overrideCustomTheme", 0);
        String unused11 = aVar.f6574j;
        intent.putExtra("hostedDomainFilter", (String) null);
        Bundle bundle = new Bundle();
        boolean unused12 = aVar.f6575k;
        w unused13 = aVar.f6576l;
        boolean unused14 = aVar.f6578n;
        boolean unused15 = aVar.f6579o;
        if (!bundle.isEmpty()) {
            intent.putExtra("first_party_options_bundle", bundle);
        }
        return intent;
    }
}
