package g1;

import android.os.Bundle;
import android.view.View;
import d.m0;
import d.o0;
import d.x0;

public interface c0 {

    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public Bundle f7556a;

        @x0({x0.a.LIBRARY_GROUP_PREFIX})
        public void a(Bundle bundle) {
            this.f7556a = bundle;
        }
    }

    public static final class b extends a {
        public boolean b() {
            return this.f7556a.getBoolean(z.Q);
        }

        public int c() {
            return this.f7556a.getInt(z.O);
        }
    }

    public static final class c extends a {
        public String b() {
            return this.f7556a.getString(z.P);
        }
    }

    public static final class d extends a {
        public int b() {
            return this.f7556a.getInt(z.X);
        }

        public int c() {
            return this.f7556a.getInt(z.Y);
        }
    }

    public static final class e extends a {
        public int b() {
            return this.f7556a.getInt(z.V);
        }

        public int c() {
            return this.f7556a.getInt(z.U);
        }
    }

    public static final class f extends a {
        public float b() {
            return this.f7556a.getFloat(z.W);
        }
    }

    public static final class g extends a {
        public int b() {
            return this.f7556a.getInt(z.S);
        }

        public int c() {
            return this.f7556a.getInt(z.R);
        }
    }

    public static final class h extends a {
        public CharSequence b() {
            return this.f7556a.getCharSequence(z.T);
        }
    }

    boolean a(@m0 View view, @o0 a aVar);
}
