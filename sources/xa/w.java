package xa;

public final class w extends q {

    /* renamed from: b  reason: collision with root package name */
    public final String[] f24477b;

    /* renamed from: c  reason: collision with root package name */
    public final String[] f24478c;

    /* renamed from: d  reason: collision with root package name */
    public final String f24479d;

    /* renamed from: e  reason: collision with root package name */
    public final String f24480e;

    public w(String str, String str2, String str3, String str4) {
        super(r.SMS);
        this.f24477b = new String[]{str};
        this.f24478c = new String[]{str2};
        this.f24479d = str3;
        this.f24480e = str4;
    }

    public w(String[] strArr, String[] strArr2, String str, String str2) {
        super(r.SMS);
        this.f24477b = strArr;
        this.f24478c = strArr2;
        this.f24479d = str;
        this.f24480e = str2;
    }

    public String a() {
        StringBuilder sb2 = new StringBuilder(100);
        q.d(this.f24477b, sb2);
        q.c(this.f24479d, sb2);
        q.c(this.f24480e, sb2);
        return sb2.toString();
    }

    public String e() {
        return this.f24480e;
    }

    public String[] f() {
        return this.f24477b;
    }

    public String g() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("sms:");
        boolean z10 = false;
        boolean z11 = true;
        for (int i10 = 0; i10 < this.f24477b.length; i10++) {
            if (z11) {
                z11 = false;
            } else {
                sb2.append(',');
            }
            sb2.append(this.f24477b[i10]);
            String[] strArr = this.f24478c;
            if (!(strArr == null || strArr[i10] == null)) {
                sb2.append(";via=");
                sb2.append(this.f24478c[i10]);
            }
        }
        boolean z12 = this.f24480e != null;
        if (this.f24479d != null) {
            z10 = true;
        }
        if (z12 || z10) {
            sb2.append('?');
            if (z12) {
                sb2.append("body=");
                sb2.append(this.f24480e);
            }
            if (z10) {
                if (z12) {
                    sb2.append('&');
                }
                sb2.append("subject=");
                sb2.append(this.f24479d);
            }
        }
        return sb2.toString();
    }

    public String h() {
        return this.f24479d;
    }

    public String[] i() {
        return this.f24478c;
    }
}
