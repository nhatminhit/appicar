package u2;

import a3.c;
import a3.d;
import android.content.Context;
import d.m0;
import d.o0;
import d.t0;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;

public class s2 implements d, p0 {
    @m0
    public final Context O;
    @o0
    public final String P;
    @o0
    public final File Q;
    @o0
    public final Callable<InputStream> R;
    public final int S;
    @m0
    public final d T;
    @o0
    public n0 U;
    public boolean V;

    public class a extends d.a {
        public a(int i10) {
            super(i10);
        }

        public void d(@m0 c cVar) {
        }

        public void g(@m0 c cVar, int i10, int i11) {
        }
    }

    public s2(@m0 Context context, @o0 String str, @o0 File file, @o0 Callable<InputStream> callable, int i10, @m0 d dVar) {
        this.O = context;
        this.P = str;
        this.Q = file;
        this.R = callable;
        this.S = i10;
        this.T = dVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(java.io.File r5, boolean r6) throws java.io.IOException {
        /*
            r4 = this;
            java.lang.String r0 = r4.P
            if (r0 == 0) goto L_0x0015
            android.content.Context r0 = r4.O
            android.content.res.AssetManager r0 = r0.getAssets()
            java.lang.String r1 = r4.P
            java.io.InputStream r0 = r0.open(r1)
        L_0x0010:
            java.nio.channels.ReadableByteChannel r0 = java.nio.channels.Channels.newChannel(r0)
            goto L_0x0030
        L_0x0015:
            java.io.File r0 = r4.Q
            if (r0 == 0) goto L_0x0025
            java.io.FileInputStream r0 = new java.io.FileInputStream
            java.io.File r1 = r4.Q
            r0.<init>(r1)
            java.nio.channels.FileChannel r0 = r0.getChannel()
            goto L_0x0030
        L_0x0025:
            java.util.concurrent.Callable<java.io.InputStream> r0 = r4.R
            if (r0 == 0) goto L_0x00ba
            java.lang.Object r0 = r0.call()     // Catch:{ Exception -> 0x00b1 }
            java.io.InputStream r0 = (java.io.InputStream) r0     // Catch:{ Exception -> 0x00b1 }
            goto L_0x0010
        L_0x0030:
            android.content.Context r1 = r4.O
            java.io.File r1 = r1.getCacheDir()
            java.lang.String r2 = "room-copy-helper"
            java.lang.String r3 = ".tmp"
            java.io.File r1 = java.io.File.createTempFile(r2, r3, r1)
            r1.deleteOnExit()
            java.io.FileOutputStream r2 = new java.io.FileOutputStream
            r2.<init>(r1)
            java.nio.channels.FileChannel r2 = r2.getChannel()
            x2.d.a(r0, r2)
            java.io.File r0 = r5.getParentFile()
            if (r0 == 0) goto L_0x007b
            boolean r2 = r0.exists()
            if (r2 != 0) goto L_0x007b
            boolean r0 = r0.mkdirs()
            if (r0 == 0) goto L_0x0060
            goto L_0x007b
        L_0x0060:
            java.io.IOException r6 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to create directories for "
            r0.append(r1)
            java.lang.String r5 = r5.getAbsolutePath()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
        L_0x007b:
            r4.g(r1, r6)
            boolean r6 = r1.renameTo(r5)
            if (r6 == 0) goto L_0x0085
            return
        L_0x0085:
            java.io.IOException r6 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Failed to move intermediate file ("
            r0.append(r2)
            java.lang.String r1 = r1.getAbsolutePath()
            r0.append(r1)
            java.lang.String r1 = ") to destination ("
            r0.append(r1)
            java.lang.String r5 = r5.getAbsolutePath()
            r0.append(r5)
            java.lang.String r5 = ")."
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
        L_0x00b1:
            r5 = move-exception
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r0 = "inputStreamCallable exception on call"
            r6.<init>(r0, r5)
            throw r6
        L_0x00ba:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "copyFromAssetPath, copyFromFile and copyFromInputStream are all null!"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.s2.c(java.io.File, boolean):void");
    }

    public synchronized void close() {
        this.T.close();
        this.V = false;
    }

    public final d f(File file) {
        try {
            return new b3.c().a(d.b.a(this.O).c(file.getName()).b(new a(x2.c.e(file))).a());
        } catch (IOException e10) {
            throw new RuntimeException("Malformed database file, unable to read version.", e10);
        }
    }

    public final void g(File file, boolean z10) {
        c cVar;
        n0 n0Var = this.U;
        if (n0Var != null && n0Var.f13525f != null) {
            d f10 = f(file);
            if (z10) {
                try {
                    cVar = f10.getWritableDatabase();
                } catch (Throwable th2) {
                    f10.close();
                    throw th2;
                }
            } else {
                cVar = f10.getReadableDatabase();
            }
            this.U.f13525f.a(cVar);
            f10.close();
        }
    }

    public String getDatabaseName() {
        return this.T.getDatabaseName();
    }

    public synchronized c getReadableDatabase() {
        if (!this.V) {
            k(false);
            this.V = true;
        }
        return this.T.getReadableDatabase();
    }

    public synchronized c getWritableDatabase() {
        if (!this.V) {
            k(true);
            this.V = true;
        }
        return this.T.getWritableDatabase();
    }

    public void h(@o0 n0 n0Var) {
        this.U = n0Var;
    }

    @m0
    public d i() {
        return this.T;
    }

    public final void k(boolean z10) {
        String databaseName = getDatabaseName();
        File databasePath = this.O.getDatabasePath(databaseName);
        n0 n0Var = this.U;
        x2.a aVar = new x2.a(databaseName, this.O.getFilesDir(), n0Var == null || n0Var.f13531l);
        try {
            aVar.b();
            if (!databasePath.exists()) {
                c(databasePath, z10);
                aVar.c();
            } else if (this.U == null) {
                aVar.c();
            } else {
                try {
                    int e10 = x2.c.e(databasePath);
                    int i10 = this.S;
                    if (e10 == i10) {
                        aVar.c();
                    } else if (this.U.a(e10, i10)) {
                        aVar.c();
                    } else {
                        if (this.O.deleteDatabase(databaseName)) {
                            try {
                                c(databasePath, z10);
                            } catch (IOException unused) {
                            }
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Failed to delete database file (");
                            sb2.append(databaseName);
                            sb2.append(") for a copy destructive migration.");
                        }
                        aVar.c();
                    }
                } catch (IOException unused2) {
                    aVar.c();
                }
            }
        } catch (IOException e11) {
            throw new RuntimeException("Unable to copy database file.", e11);
        } catch (Throwable th2) {
            aVar.c();
            throw th2;
        }
    }

    @t0(api = 16)
    public void setWriteAheadLoggingEnabled(boolean z10) {
        this.T.setWriteAheadLoggingEnabled(z10);
    }
}
