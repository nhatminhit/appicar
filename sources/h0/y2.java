package h0;

import android.app.Activity;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Html;
import android.text.Spanned;
import android.view.ActionProvider;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ShareActionProvider;
import d.a1;
import d.b0;
import d.m0;
import d.o0;
import d.t0;
import e1.n;
import i0.l;
import java.util.ArrayList;
import p7.f;

public final class y2 {

    /* renamed from: a  reason: collision with root package name */
    public static final String f8795a = "androidx.core.app.EXTRA_CALLING_PACKAGE";

    /* renamed from: b  reason: collision with root package name */
    public static final String f8796b = "android.support.v4.app.EXTRA_CALLING_PACKAGE";

    /* renamed from: c  reason: collision with root package name */
    public static final String f8797c = "androidx.core.app.EXTRA_CALLING_ACTIVITY";

    /* renamed from: d  reason: collision with root package name */
    public static final String f8798d = "android.support.v4.app.EXTRA_CALLING_ACTIVITY";

    /* renamed from: e  reason: collision with root package name */
    public static final String f8799e = ".sharecompat_";

    @t0(16)
    public static class a {
        public static void a(@m0 Intent intent, @m0 ArrayList<Uri> arrayList) {
            ClipData clipData = new ClipData((CharSequence) null, new String[]{intent.getType()}, new ClipData.Item(intent.getCharSequenceExtra("android.intent.extra.TEXT"), intent.getStringExtra(l.f8973b), (Intent) null, arrayList.get(0)));
            int size = arrayList.size();
            for (int i10 = 1; i10 < size; i10++) {
                clipData.addItem(new ClipData.Item(arrayList.get(i10)));
            }
            intent.setClipData(clipData);
            intent.addFlags(1);
        }

        public static void b(@m0 Intent intent) {
            intent.setClipData((ClipData) null);
            intent.setFlags(intent.getFlags() & -2);
        }
    }

    public static class b {
        @m0

        /* renamed from: a  reason: collision with root package name */
        public final Context f8800a;
        @m0

        /* renamed from: b  reason: collision with root package name */
        public final Intent f8801b;
        @o0

        /* renamed from: c  reason: collision with root package name */
        public CharSequence f8802c;
        @o0

        /* renamed from: d  reason: collision with root package name */
        public ArrayList<String> f8803d;
        @o0

        /* renamed from: e  reason: collision with root package name */
        public ArrayList<String> f8804e;
        @o0

        /* renamed from: f  reason: collision with root package name */
        public ArrayList<String> f8805f;
        @o0

        /* renamed from: g  reason: collision with root package name */
        public ArrayList<Uri> f8806g;

        public b(@m0 Context context) {
            Activity activity;
            this.f8800a = (Context) n.g(context);
            Intent action = new Intent().setAction("android.intent.action.SEND");
            this.f8801b = action;
            action.putExtra(y2.f8795a, context.getPackageName());
            action.putExtra(y2.f8796b, context.getPackageName());
            action.addFlags(524288);
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                } else if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (activity != null) {
                ComponentName componentName = activity.getComponentName();
                this.f8801b.putExtra(y2.f8797c, componentName);
                this.f8801b.putExtra(y2.f8798d, componentName);
            }
        }

        @Deprecated
        @m0
        public static b k(@m0 Activity activity) {
            return new b(activity);
        }

        @m0
        public b a(@m0 String str) {
            if (this.f8805f == null) {
                this.f8805f = new ArrayList<>();
            }
            this.f8805f.add(str);
            return this;
        }

        @m0
        public b b(@m0 String[] strArr) {
            i("android.intent.extra.BCC", strArr);
            return this;
        }

        @m0
        public b c(@m0 String str) {
            if (this.f8804e == null) {
                this.f8804e = new ArrayList<>();
            }
            this.f8804e.add(str);
            return this;
        }

        @m0
        public b d(@m0 String[] strArr) {
            i("android.intent.extra.CC", strArr);
            return this;
        }

        @m0
        public b e(@m0 String str) {
            if (this.f8803d == null) {
                this.f8803d = new ArrayList<>();
            }
            this.f8803d.add(str);
            return this;
        }

        @m0
        public b f(@m0 String[] strArr) {
            i("android.intent.extra.EMAIL", strArr);
            return this;
        }

        @m0
        public b g(@m0 Uri uri) {
            if (this.f8806g == null) {
                this.f8806g = new ArrayList<>();
            }
            this.f8806g.add(uri);
            return this;
        }

        public final void h(String str, ArrayList<String> arrayList) {
            String[] stringArrayExtra = this.f8801b.getStringArrayExtra(str);
            int length = stringArrayExtra != null ? stringArrayExtra.length : 0;
            String[] strArr = new String[(arrayList.size() + length)];
            arrayList.toArray(strArr);
            if (stringArrayExtra != null) {
                System.arraycopy(stringArrayExtra, 0, strArr, arrayList.size(), length);
            }
            this.f8801b.putExtra(str, strArr);
        }

        public final void i(@o0 String str, @m0 String[] strArr) {
            Intent m10 = m();
            String[] stringArrayExtra = m10.getStringArrayExtra(str);
            int length = stringArrayExtra != null ? stringArrayExtra.length : 0;
            String[] strArr2 = new String[(strArr.length + length)];
            if (stringArrayExtra != null) {
                System.arraycopy(stringArrayExtra, 0, strArr2, 0, length);
            }
            System.arraycopy(strArr, 0, strArr2, length, strArr.length);
            m10.putExtra(str, strArr2);
        }

        @m0
        public Intent j() {
            return Intent.createChooser(m(), this.f8802c);
        }

        @m0
        public Context l() {
            return this.f8800a;
        }

        @m0
        public Intent m() {
            ArrayList<String> arrayList = this.f8803d;
            if (arrayList != null) {
                h("android.intent.extra.EMAIL", arrayList);
                this.f8803d = null;
            }
            ArrayList<String> arrayList2 = this.f8804e;
            if (arrayList2 != null) {
                h("android.intent.extra.CC", arrayList2);
                this.f8804e = null;
            }
            ArrayList<String> arrayList3 = this.f8805f;
            if (arrayList3 != null) {
                h("android.intent.extra.BCC", arrayList3);
                this.f8805f = null;
            }
            ArrayList<Uri> arrayList4 = this.f8806g;
            boolean z10 = true;
            if (arrayList4 == null || arrayList4.size() <= 1) {
                z10 = false;
            }
            if (!z10) {
                this.f8801b.setAction("android.intent.action.SEND");
                ArrayList<Uri> arrayList5 = this.f8806g;
                if (arrayList5 == null || arrayList5.isEmpty()) {
                    this.f8801b.removeExtra("android.intent.extra.STREAM");
                    a.b(this.f8801b);
                    return this.f8801b;
                }
                this.f8801b.putExtra("android.intent.extra.STREAM", this.f8806g.get(0));
            } else {
                this.f8801b.setAction("android.intent.action.SEND_MULTIPLE");
                this.f8801b.putParcelableArrayListExtra("android.intent.extra.STREAM", this.f8806g);
            }
            a.a(this.f8801b, this.f8806g);
            return this.f8801b;
        }

        @m0
        public b n(@a1 int i10) {
            return o(this.f8800a.getText(i10));
        }

        @m0
        public b o(@o0 CharSequence charSequence) {
            this.f8802c = charSequence;
            return this;
        }

        @m0
        public b p(@o0 String[] strArr) {
            this.f8801b.putExtra("android.intent.extra.BCC", strArr);
            return this;
        }

        @m0
        public b q(@o0 String[] strArr) {
            this.f8801b.putExtra("android.intent.extra.CC", strArr);
            return this;
        }

        @m0
        public b r(@o0 String[] strArr) {
            if (this.f8803d != null) {
                this.f8803d = null;
            }
            this.f8801b.putExtra("android.intent.extra.EMAIL", strArr);
            return this;
        }

        @m0
        public b s(@o0 String str) {
            this.f8801b.putExtra(l.f8973b, str);
            if (!this.f8801b.hasExtra("android.intent.extra.TEXT")) {
                v(Html.fromHtml(str));
            }
            return this;
        }

        @m0
        public b t(@o0 Uri uri) {
            this.f8806g = null;
            if (uri != null) {
                g(uri);
            }
            return this;
        }

        @m0
        public b u(@o0 String str) {
            this.f8801b.putExtra("android.intent.extra.SUBJECT", str);
            return this;
        }

        @m0
        public b v(@o0 CharSequence charSequence) {
            this.f8801b.putExtra("android.intent.extra.TEXT", charSequence);
            return this;
        }

        @m0
        public b w(@o0 String str) {
            this.f8801b.setType(str);
            return this;
        }

        public void x() {
            this.f8800a.startActivity(j());
        }
    }

    public static class c {

        /* renamed from: f  reason: collision with root package name */
        public static final String f8807f = "IntentReader";
        @m0

        /* renamed from: a  reason: collision with root package name */
        public final Context f8808a;
        @m0

        /* renamed from: b  reason: collision with root package name */
        public final Intent f8809b;
        @o0

        /* renamed from: c  reason: collision with root package name */
        public final String f8810c;
        @o0

        /* renamed from: d  reason: collision with root package name */
        public final ComponentName f8811d;
        @o0

        /* renamed from: e  reason: collision with root package name */
        public ArrayList<Uri> f8812e;

        public c(@m0 Activity activity) {
            this((Context) n.g(activity), activity.getIntent());
        }

        public c(@m0 Context context, @m0 Intent intent) {
            this.f8808a = (Context) n.g(context);
            this.f8809b = (Intent) n.g(intent);
            this.f8810c = y2.f(intent);
            this.f8811d = y2.d(intent);
        }

        @Deprecated
        @m0
        public static c a(@m0 Activity activity) {
            return new c(activity);
        }

        public static void t(StringBuilder sb2, CharSequence charSequence, int i10, int i11) {
            String str;
            while (i10 < i11) {
                char charAt = charSequence.charAt(i10);
                if (charAt == '<') {
                    str = "&lt;";
                } else if (charAt == '>') {
                    str = "&gt;";
                } else if (charAt == '&') {
                    str = "&amp;";
                } else if (charAt > '~' || charAt < ' ') {
                    sb2.append("&#");
                    sb2.append(charAt);
                    str = ";";
                } else {
                    if (charAt == ' ') {
                        while (true) {
                            int i12 = i10 + 1;
                            if (i12 >= i11 || charSequence.charAt(i12) != ' ') {
                                sb2.append(f.f11698i);
                            } else {
                                sb2.append("&nbsp;");
                                i10 = i12;
                            }
                        }
                        sb2.append(f.f11698i);
                    } else {
                        sb2.append(charAt);
                    }
                    i10++;
                }
                sb2.append(str);
                i10++;
            }
        }

        @o0
        public ComponentName b() {
            return this.f8811d;
        }

        @o0
        public Drawable c() {
            if (this.f8811d == null) {
                return null;
            }
            try {
                return this.f8808a.getPackageManager().getActivityIcon(this.f8811d);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        @o0
        public Drawable d() {
            if (this.f8810c == null) {
                return null;
            }
            try {
                return this.f8808a.getPackageManager().getApplicationIcon(this.f8810c);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        @o0
        public CharSequence e() {
            if (this.f8810c == null) {
                return null;
            }
            PackageManager packageManager = this.f8808a.getPackageManager();
            try {
                return packageManager.getApplicationLabel(packageManager.getApplicationInfo(this.f8810c, 0));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        @o0
        public String f() {
            return this.f8810c;
        }

        @o0
        public String[] g() {
            return this.f8809b.getStringArrayExtra("android.intent.extra.BCC");
        }

        @o0
        public String[] h() {
            return this.f8809b.getStringArrayExtra("android.intent.extra.CC");
        }

        @o0
        public String[] i() {
            return this.f8809b.getStringArrayExtra("android.intent.extra.EMAIL");
        }

        @o0
        public String j() {
            String stringExtra = this.f8809b.getStringExtra(l.f8973b);
            if (stringExtra != null) {
                return stringExtra;
            }
            CharSequence o10 = o();
            return o10 instanceof Spanned ? Html.toHtml((Spanned) o10) : o10 != null ? Html.escapeHtml(o10) : stringExtra;
        }

        @o0
        public Uri k() {
            return (Uri) this.f8809b.getParcelableExtra("android.intent.extra.STREAM");
        }

        @o0
        public Uri l(int i10) {
            Object parcelableExtra;
            if (this.f8812e == null && q()) {
                this.f8812e = this.f8809b.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            ArrayList arrayList = this.f8812e;
            if (arrayList != null) {
                parcelableExtra = arrayList.get(i10);
            } else if (i10 == 0) {
                parcelableExtra = this.f8809b.getParcelableExtra("android.intent.extra.STREAM");
            } else {
                throw new IndexOutOfBoundsException("Stream items available: " + m() + " index requested: " + i10);
            }
            return (Uri) parcelableExtra;
        }

        public int m() {
            if (this.f8812e == null && q()) {
                this.f8812e = this.f8809b.getParcelableArrayListExtra("android.intent.extra.STREAM");
            }
            ArrayList<Uri> arrayList = this.f8812e;
            return arrayList != null ? arrayList.size() : this.f8809b.hasExtra("android.intent.extra.STREAM") ? 1 : 0;
        }

        @o0
        public String n() {
            return this.f8809b.getStringExtra("android.intent.extra.SUBJECT");
        }

        @o0
        public CharSequence o() {
            return this.f8809b.getCharSequenceExtra("android.intent.extra.TEXT");
        }

        @o0
        public String p() {
            return this.f8809b.getType();
        }

        public boolean q() {
            return "android.intent.action.SEND_MULTIPLE".equals(this.f8809b.getAction());
        }

        public boolean r() {
            String action = this.f8809b.getAction();
            return "android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action);
        }

        public boolean s() {
            return "android.intent.action.SEND".equals(this.f8809b.getAction());
        }
    }

    @Deprecated
    public static void a(@m0 Menu menu, @b0 int i10, @m0 b bVar) {
        MenuItem findItem = menu.findItem(i10);
        if (findItem != null) {
            b(findItem, bVar);
            return;
        }
        throw new IllegalArgumentException("Could not find menu item with id " + i10 + " in the supplied menu");
    }

    @Deprecated
    public static void b(@m0 MenuItem menuItem, @m0 b bVar) {
        ActionProvider actionProvider = menuItem.getActionProvider();
        ShareActionProvider shareActionProvider = !(actionProvider instanceof ShareActionProvider) ? new ShareActionProvider(bVar.l()) : (ShareActionProvider) actionProvider;
        shareActionProvider.setShareHistoryFileName(f8799e + bVar.l().getClass().getName());
        shareActionProvider.setShareIntent(bVar.m());
        menuItem.setActionProvider(shareActionProvider);
    }

    @o0
    public static ComponentName c(@m0 Activity activity) {
        Intent intent = activity.getIntent();
        ComponentName callingActivity = activity.getCallingActivity();
        return callingActivity == null ? d(intent) : callingActivity;
    }

    @o0
    public static ComponentName d(@m0 Intent intent) {
        ComponentName componentName = (ComponentName) intent.getParcelableExtra(f8797c);
        return componentName == null ? (ComponentName) intent.getParcelableExtra(f8798d) : componentName;
    }

    @o0
    public static String e(@m0 Activity activity) {
        Intent intent = activity.getIntent();
        String callingPackage = activity.getCallingPackage();
        return (callingPackage != null || intent == null) ? callingPackage : f(intent);
    }

    @o0
    public static String f(@m0 Intent intent) {
        String stringExtra = intent.getStringExtra(f8795a);
        return stringExtra == null ? intent.getStringExtra(f8796b) : stringExtra;
    }
}
