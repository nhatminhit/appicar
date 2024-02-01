package x0;

import android.os.LocaleList;
import d.m0;
import d.o0;
import d.t0;
import java.util.Locale;

@t0(24)
public final class o implements n {

    /* renamed from: a  reason: collision with root package name */
    public final LocaleList f15016a;

    public o(LocaleList localeList) {
        this.f15016a = localeList;
    }

    public int a(Locale locale) {
        return this.f15016a.indexOf(locale);
    }

    public String b() {
        return this.f15016a.toLanguageTags();
    }

    public Object c() {
        return this.f15016a;
    }

    @o0
    public Locale d(@m0 String[] strArr) {
        return this.f15016a.getFirstMatch(strArr);
    }

    public boolean equals(Object obj) {
        return this.f15016a.equals(((n) obj).c());
    }

    public Locale get(int i10) {
        return this.f15016a.get(i10);
    }

    public int hashCode() {
        return this.f15016a.hashCode();
    }

    public boolean isEmpty() {
        return this.f15016a.isEmpty();
    }

    public int size() {
        return this.f15016a.size();
    }

    public String toString() {
        return this.f15016a.toString();
    }
}
