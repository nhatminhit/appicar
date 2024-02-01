package a3;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import d.m0;
import d.o0;
import d.t0;
import java.io.Closeable;
import java.io.File;

public interface d extends Closeable {

    public static abstract class a {

        /* renamed from: b  reason: collision with root package name */
        public static final String f118b = "SupportSQLite";

        /* renamed from: a  reason: collision with root package name */
        public final int f119a;

        public a(int i10) {
            this.f119a = i10;
        }

        public final void a(String str) {
            if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("deleting the database file: ");
                sb2.append(str);
                try {
                    SQLiteDatabase.deleteDatabase(new File(str));
                } catch (Exception unused) {
                }
            }
        }

        public void b(@m0 c cVar) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
            if (r0 != null) goto L_0x002d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
            r3 = r0.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
            if (r3.hasNext() != false) goto L_0x0037;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0037, code lost:
            a((java.lang.String) r3.next().second);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0045, code lost:
            a(r3.j1());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0027 */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x004f  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0067  */
        /* JADX WARNING: Removed duplicated region for block: B:7:0x0025 A[ExcHandler: all (r1v2 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r0 
          PHI: (r0v9 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) = (r0v2 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r0v3 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r0v3 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) binds: [B:5:0x0020, B:8:0x0027, B:9:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:5:0x0020] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void c(@d.m0 a3.c r3) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Corruption reported by sqlite on database: "
                r0.append(r1)
                java.lang.String r1 = r3.j1()
                r0.append(r1)
                boolean r0 = r3.isOpen()
                if (r0 != 0) goto L_0x001f
                java.lang.String r3 = r3.j1()
                r2.a(r3)
                return
            L_0x001f:
                r0 = 0
                java.util.List r0 = r3.z()     // Catch:{ SQLiteException -> 0x0027, all -> 0x0025 }
                goto L_0x0027
            L_0x0025:
                r1 = move-exception
                goto L_0x002b
            L_0x0027:
                r3.close()     // Catch:{ IOException -> 0x004d, all -> 0x0025 }
                goto L_0x004d
            L_0x002b:
                if (r0 == 0) goto L_0x0045
                java.util.Iterator r3 = r0.iterator()
            L_0x0031:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x004c
                java.lang.Object r0 = r3.next()
                android.util.Pair r0 = (android.util.Pair) r0
                java.lang.Object r0 = r0.second
                java.lang.String r0 = (java.lang.String) r0
                r2.a(r0)
                goto L_0x0031
            L_0x0045:
                java.lang.String r3 = r3.j1()
                r2.a(r3)
            L_0x004c:
                throw r1
            L_0x004d:
                if (r0 == 0) goto L_0x0067
                java.util.Iterator r3 = r0.iterator()
            L_0x0053:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x006e
                java.lang.Object r0 = r3.next()
                android.util.Pair r0 = (android.util.Pair) r0
                java.lang.Object r0 = r0.second
                java.lang.String r0 = (java.lang.String) r0
                r2.a(r0)
                goto L_0x0053
            L_0x0067:
                java.lang.String r3 = r3.j1()
                r2.a(r3)
            L_0x006e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: a3.d.a.c(a3.c):void");
        }

        public abstract void d(@m0 c cVar);

        public void e(@m0 c cVar, int i10, int i11) {
            throw new SQLiteException("Can't downgrade database from version " + i10 + " to " + i11);
        }

        public void f(@m0 c cVar) {
        }

        public abstract void g(@m0 c cVar, int i10, int i11);
    }

    public static class b {
        @m0

        /* renamed from: a  reason: collision with root package name */
        public final Context f120a;
        @o0

        /* renamed from: b  reason: collision with root package name */
        public final String f121b;
        @m0

        /* renamed from: c  reason: collision with root package name */
        public final a f122c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f123d;

        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public Context f124a;

            /* renamed from: b  reason: collision with root package name */
            public String f125b;

            /* renamed from: c  reason: collision with root package name */
            public a f126c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f127d;

            public a(@m0 Context context) {
                this.f124a = context;
            }

            @m0
            public b a() {
                if (this.f126c == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                } else if (this.f124a == null) {
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                } else if (!this.f127d || !TextUtils.isEmpty(this.f125b)) {
                    return new b(this.f124a, this.f125b, this.f126c, this.f127d);
                } else {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
            }

            @m0
            public a b(@m0 a aVar) {
                this.f126c = aVar;
                return this;
            }

            @m0
            public a c(@o0 String str) {
                this.f125b = str;
                return this;
            }

            @m0
            public a d(boolean z10) {
                this.f127d = z10;
                return this;
            }
        }

        public b(@m0 Context context, @o0 String str, @m0 a aVar) {
            this(context, str, aVar, false);
        }

        public b(@m0 Context context, @o0 String str, @m0 a aVar, boolean z10) {
            this.f120a = context;
            this.f121b = str;
            this.f122c = aVar;
            this.f123d = z10;
        }

        @m0
        public static a a(@m0 Context context) {
            return new a(context);
        }
    }

    public interface c {
        @m0
        d a(@m0 b bVar);
    }

    void close();

    @o0
    String getDatabaseName();

    c getReadableDatabase();

    c getWritableDatabase();

    @t0(api = 16)
    void setWriteAheadLoggingEnabled(boolean z10);
}
