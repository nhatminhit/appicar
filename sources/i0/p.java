package i0;

import android.content.SharedPreferences;
import d.m0;

@Deprecated
public final class p {

    @Deprecated
    public static final class a {

        /* renamed from: b  reason: collision with root package name */
        public static a f8982b;

        /* renamed from: a  reason: collision with root package name */
        public final C0150a f8983a = new C0150a();

        /* renamed from: i0.p$a$a  reason: collision with other inner class name */
        public static class C0150a {
            public void a(@m0 SharedPreferences.Editor editor) {
                try {
                    editor.apply();
                } catch (AbstractMethodError unused) {
                    editor.commit();
                }
            }
        }

        @Deprecated
        public static a b() {
            if (f8982b == null) {
                f8982b = new a();
            }
            return f8982b;
        }

        @Deprecated
        public void a(@m0 SharedPreferences.Editor editor) {
            this.f8983a.a(editor);
        }
    }
}
