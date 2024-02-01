package u7;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import d.g1;
import d.o0;
import f6.e;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import w7.b0;
import w7.q0;

public class n {

    /* renamed from: g  reason: collision with root package name */
    public static final String f13842g = "cached_content_index.exi";

    /* renamed from: h  reason: collision with root package name */
    public static final int f13843h = 10485760;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, m> f13844a;

    /* renamed from: b  reason: collision with root package name */
    public final SparseArray<String> f13845b;

    /* renamed from: c  reason: collision with root package name */
    public final SparseBooleanArray f13846c;

    /* renamed from: d  reason: collision with root package name */
    public final SparseBooleanArray f13847d;

    /* renamed from: e  reason: collision with root package name */
    public c f13848e;
    @o0

    /* renamed from: f  reason: collision with root package name */
    public c f13849f;

    public static final class a implements c {

        /* renamed from: e  reason: collision with root package name */
        public static final String f13850e = "ExoPlayerCacheIndex";

        /* renamed from: f  reason: collision with root package name */
        public static final int f13851f = 1;

        /* renamed from: g  reason: collision with root package name */
        public static final String f13852g = "id";

        /* renamed from: h  reason: collision with root package name */
        public static final String f13853h = "key";

        /* renamed from: i  reason: collision with root package name */
        public static final String f13854i = "metadata";

        /* renamed from: j  reason: collision with root package name */
        public static final int f13855j = 0;

        /* renamed from: k  reason: collision with root package name */
        public static final int f13856k = 1;

        /* renamed from: l  reason: collision with root package name */
        public static final int f13857l = 2;

        /* renamed from: m  reason: collision with root package name */
        public static final String f13858m = "id = ?";

        /* renamed from: n  reason: collision with root package name */
        public static final String[] f13859n = {"id", "key", "metadata"};

        /* renamed from: o  reason: collision with root package name */
        public static final String f13860o = "(id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)";

        /* renamed from: a  reason: collision with root package name */
        public final f6.b f13861a;

        /* renamed from: b  reason: collision with root package name */
        public final SparseArray<m> f13862b = new SparseArray<>();

        /* renamed from: c  reason: collision with root package name */
        public String f13863c;

        /* renamed from: d  reason: collision with root package name */
        public String f13864d;

        public a(f6.b bVar) {
            this.f13861a = bVar;
        }

        public static void j(f6.b bVar, long j10) throws f6.a {
            k(bVar, Long.toHexString(j10));
        }

        public static void k(f6.b bVar, String str) throws f6.a {
            SQLiteDatabase writableDatabase;
            try {
                String o10 = o(str);
                writableDatabase = bVar.getWritableDatabase();
                writableDatabase.beginTransaction();
                e.c(writableDatabase, 1, str);
                m(writableDatabase, o10);
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (SQLException e10) {
                throw new f6.a(e10);
            } catch (Throwable th2) {
                writableDatabase.endTransaction();
                throw th2;
            }
        }

        public static void m(SQLiteDatabase sQLiteDatabase, String str) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
        }

        public static String o(String str) {
            return f13850e + str;
        }

        public void a(HashMap<String, m> hashMap) throws IOException {
            SQLiteDatabase writableDatabase;
            try {
                writableDatabase = this.f13861a.getWritableDatabase();
                writableDatabase.beginTransaction();
                p(writableDatabase);
                for (m i10 : hashMap.values()) {
                    i(writableDatabase, i10);
                }
                writableDatabase.setTransactionSuccessful();
                this.f13862b.clear();
                writableDatabase.endTransaction();
            } catch (SQLException e10) {
                throw new f6.a(e10);
            } catch (Throwable th2) {
                writableDatabase.endTransaction();
                throw th2;
            }
        }

        public void b(m mVar, boolean z10) {
            if (z10) {
                this.f13862b.delete(mVar.f13837a);
            } else {
                this.f13862b.put(mVar.f13837a, (Object) null);
            }
        }

        public void c(m mVar) {
            this.f13862b.put(mVar.f13837a, mVar);
        }

        public boolean d() throws f6.a {
            return e.b(this.f13861a.getReadableDatabase(), 1, this.f13863c) != -1;
        }

        public void e(HashMap<String, m> hashMap) throws IOException {
            SQLiteDatabase writableDatabase;
            if (this.f13862b.size() != 0) {
                try {
                    writableDatabase = this.f13861a.getWritableDatabase();
                    writableDatabase.beginTransaction();
                    for (int i10 = 0; i10 < this.f13862b.size(); i10++) {
                        m valueAt = this.f13862b.valueAt(i10);
                        if (valueAt == null) {
                            l(writableDatabase, this.f13862b.keyAt(i10));
                        } else {
                            i(writableDatabase, valueAt);
                        }
                    }
                    writableDatabase.setTransactionSuccessful();
                    this.f13862b.clear();
                    writableDatabase.endTransaction();
                } catch (SQLException e10) {
                    throw new f6.a(e10);
                } catch (Throwable th2) {
                    writableDatabase.endTransaction();
                    throw th2;
                }
            }
        }

        public void f(long j10) {
            String hexString = Long.toHexString(j10);
            this.f13863c = hexString;
            this.f13864d = o(hexString);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0073, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
            if (r0 != null) goto L_0x0076;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
            r0.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x007e, code lost:
            throw r2;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void g(java.util.HashMap<java.lang.String, u7.m> r8, android.util.SparseArray<java.lang.String> r9) throws java.io.IOException {
            /*
                r7 = this;
                android.util.SparseArray<u7.m> r0 = r7.f13862b
                int r0 = r0.size()
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L_0x000c
                r0 = r2
                goto L_0x000d
            L_0x000c:
                r0 = r1
            L_0x000d:
                w7.a.i(r0)
                f6.b r0 = r7.f13861a     // Catch:{ SQLiteException -> 0x007f }
                android.database.sqlite.SQLiteDatabase r0 = r0.getReadableDatabase()     // Catch:{ SQLiteException -> 0x007f }
                java.lang.String r3 = r7.f13863c     // Catch:{ SQLiteException -> 0x007f }
                int r0 = f6.e.b(r0, r2, r3)     // Catch:{ SQLiteException -> 0x007f }
                if (r0 == r2) goto L_0x0036
                f6.b r0 = r7.f13861a     // Catch:{ SQLiteException -> 0x007f }
                android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()     // Catch:{ SQLiteException -> 0x007f }
                r0.beginTransaction()     // Catch:{ SQLiteException -> 0x007f }
                r7.p(r0)     // Catch:{ all -> 0x0031 }
                r0.setTransactionSuccessful()     // Catch:{ all -> 0x0031 }
                r0.endTransaction()     // Catch:{ SQLiteException -> 0x007f }
                goto L_0x0036
            L_0x0031:
                r1 = move-exception
                r0.endTransaction()     // Catch:{ SQLiteException -> 0x007f }
                throw r1     // Catch:{ SQLiteException -> 0x007f }
            L_0x0036:
                android.database.Cursor r0 = r7.n()     // Catch:{ SQLiteException -> 0x007f }
            L_0x003a:
                boolean r3 = r0.moveToNext()     // Catch:{ all -> 0x0071 }
                if (r3 == 0) goto L_0x006d
                int r3 = r0.getInt(r1)     // Catch:{ all -> 0x0071 }
                java.lang.String r4 = r0.getString(r2)     // Catch:{ all -> 0x0071 }
                r5 = 2
                byte[] r5 = r0.getBlob(r5)     // Catch:{ all -> 0x0071 }
                java.io.ByteArrayInputStream r6 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x0071 }
                r6.<init>(r5)     // Catch:{ all -> 0x0071 }
                java.io.DataInputStream r5 = new java.io.DataInputStream     // Catch:{ all -> 0x0071 }
                r5.<init>(r6)     // Catch:{ all -> 0x0071 }
                u7.s r5 = u7.n.s(r5)     // Catch:{ all -> 0x0071 }
                u7.m r6 = new u7.m     // Catch:{ all -> 0x0071 }
                r6.<init>(r3, r4, r5)     // Catch:{ all -> 0x0071 }
                java.lang.String r3 = r6.f13838b     // Catch:{ all -> 0x0071 }
                r8.put(r3, r6)     // Catch:{ all -> 0x0071 }
                int r3 = r6.f13837a     // Catch:{ all -> 0x0071 }
                java.lang.String r4 = r6.f13838b     // Catch:{ all -> 0x0071 }
                r9.put(r3, r4)     // Catch:{ all -> 0x0071 }
                goto L_0x003a
            L_0x006d:
                r0.close()     // Catch:{ SQLiteException -> 0x007f }
                return
            L_0x0071:
                r1 = move-exception
                throw r1     // Catch:{ all -> 0x0073 }
            L_0x0073:
                r2 = move-exception
                if (r0 == 0) goto L_0x007e
                r0.close()     // Catch:{ all -> 0x007a }
                goto L_0x007e
            L_0x007a:
                r0 = move-exception
                r1.addSuppressed(r0)     // Catch:{ SQLiteException -> 0x007f }
            L_0x007e:
                throw r2     // Catch:{ SQLiteException -> 0x007f }
            L_0x007f:
                r0 = move-exception
                r8.clear()
                r9.clear()
                f6.a r8 = new f6.a
                r8.<init>(r0)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: u7.n.a.g(java.util.HashMap, android.util.SparseArray):void");
        }

        public void h() throws f6.a {
            k(this.f13861a, this.f13863c);
        }

        public final void i(SQLiteDatabase sQLiteDatabase, m mVar) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            n.v(mVar.d(), new DataOutputStream(byteArrayOutputStream));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Integer.valueOf(mVar.f13837a));
            contentValues.put("key", mVar.f13838b);
            contentValues.put("metadata", byteArray);
            sQLiteDatabase.replaceOrThrow(this.f13864d, (String) null, contentValues);
        }

        public final void l(SQLiteDatabase sQLiteDatabase, int i10) {
            sQLiteDatabase.delete(this.f13864d, "id = ?", new String[]{Integer.toString(i10)});
        }

        public final Cursor n() {
            return this.f13861a.getReadableDatabase().query(this.f13864d, f13859n, (String) null, (String[]) null, (String) null, (String) null, (String) null);
        }

        public final void p(SQLiteDatabase sQLiteDatabase) throws f6.a {
            e.d(sQLiteDatabase, 1, this.f13863c, 1);
            m(sQLiteDatabase, this.f13864d);
            sQLiteDatabase.execSQL("CREATE TABLE " + this.f13864d + " " + f13860o);
        }
    }

    public static class b implements c {

        /* renamed from: h  reason: collision with root package name */
        public static final int f13865h = 2;

        /* renamed from: i  reason: collision with root package name */
        public static final int f13866i = 2;

        /* renamed from: j  reason: collision with root package name */
        public static final int f13867j = 1;

        /* renamed from: a  reason: collision with root package name */
        public final boolean f13868a;
        @o0

        /* renamed from: b  reason: collision with root package name */
        public final Cipher f13869b;
        @o0

        /* renamed from: c  reason: collision with root package name */
        public final SecretKeySpec f13870c;
        @o0

        /* renamed from: d  reason: collision with root package name */
        public final Random f13871d;

        /* renamed from: e  reason: collision with root package name */
        public final w7.b f13872e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f13873f;
        @o0

        /* renamed from: g  reason: collision with root package name */
        public b0 f13874g;

        public b(File file, @o0 byte[] bArr, boolean z10) {
            SecretKeySpec secretKeySpec;
            Cipher cipher;
            Random random = null;
            if (bArr != null) {
                w7.a.a(bArr.length == 16);
                try {
                    cipher = n.j();
                    secretKeySpec = new SecretKeySpec(bArr, "AES");
                } catch (NoSuchAlgorithmException | NoSuchPaddingException e10) {
                    throw new IllegalStateException(e10);
                }
            } else {
                w7.a.a(!z10);
                cipher = null;
                secretKeySpec = null;
            }
            this.f13868a = z10;
            this.f13869b = cipher;
            this.f13870c = secretKeySpec;
            this.f13871d = z10 ? new Random() : random;
            this.f13872e = new w7.b(file);
        }

        public void a(HashMap<String, m> hashMap) throws IOException {
            m(hashMap);
            this.f13873f = false;
        }

        public void b(m mVar, boolean z10) {
            this.f13873f = true;
        }

        public void c(m mVar) {
            this.f13873f = true;
        }

        public boolean d() {
            return this.f13872e.c();
        }

        public void e(HashMap<String, m> hashMap) throws IOException {
            if (this.f13873f) {
                a(hashMap);
            }
        }

        public void f(long j10) {
        }

        public void g(HashMap<String, m> hashMap, SparseArray<String> sparseArray) {
            w7.a.i(!this.f13873f);
            if (!k(hashMap, sparseArray)) {
                hashMap.clear();
                sparseArray.clear();
                this.f13872e.a();
            }
        }

        public void h() {
            this.f13872e.a();
        }

        public final int i(m mVar, int i10) {
            int i11;
            int i12;
            int hashCode = (mVar.f13837a * 31) + mVar.f13838b.hashCode();
            if (i10 < 2) {
                long a10 = p.a(mVar.d());
                i12 = hashCode * 31;
                i11 = (int) (a10 ^ (a10 >>> 32));
            } else {
                i12 = hashCode * 31;
                i11 = mVar.d().hashCode();
            }
            return i12 + i11;
        }

        public final m j(int i10, DataInputStream dataInputStream) throws IOException {
            s sVar;
            int readInt = dataInputStream.readInt();
            String readUTF = dataInputStream.readUTF();
            if (i10 < 2) {
                long readLong = dataInputStream.readLong();
                r rVar = new r();
                r.h(rVar, readLong);
                sVar = s.f13880f.f(rVar);
            } else {
                sVar = n.s(dataInputStream);
            }
            return new m(readInt, readUTF, sVar);
        }

        /* JADX WARNING: Removed duplicated region for block: B:55:0x00ad  */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x00b3  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean k(java.util.HashMap<java.lang.String, u7.m> r11, android.util.SparseArray<java.lang.String> r12) {
            /*
                r10 = this;
                w7.b r0 = r10.f13872e
                boolean r0 = r0.c()
                r1 = 1
                if (r0 != 0) goto L_0x000a
                return r1
            L_0x000a:
                r0 = 0
                r2 = 0
                java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x00b1, all -> 0x00aa }
                w7.b r4 = r10.f13872e     // Catch:{ IOException -> 0x00b1, all -> 0x00aa }
                java.io.InputStream r4 = r4.d()     // Catch:{ IOException -> 0x00b1, all -> 0x00aa }
                r3.<init>(r4)     // Catch:{ IOException -> 0x00b1, all -> 0x00aa }
                java.io.DataInputStream r4 = new java.io.DataInputStream     // Catch:{ IOException -> 0x00b1, all -> 0x00aa }
                r4.<init>(r3)     // Catch:{ IOException -> 0x00b1, all -> 0x00aa }
                int r0 = r4.readInt()     // Catch:{ IOException -> 0x00a8, all -> 0x00a5 }
                if (r0 < 0) goto L_0x00a1
                r5 = 2
                if (r0 <= r5) goto L_0x0027
                goto L_0x00a1
            L_0x0027:
                int r6 = r4.readInt()     // Catch:{ IOException -> 0x00a8, all -> 0x00a5 }
                r6 = r6 & r1
                if (r6 == 0) goto L_0x0060
                javax.crypto.Cipher r6 = r10.f13869b     // Catch:{ IOException -> 0x00a8, all -> 0x00a5 }
                if (r6 != 0) goto L_0x0036
                w7.q0.q(r4)
                return r2
            L_0x0036:
                r6 = 16
                byte[] r6 = new byte[r6]     // Catch:{ IOException -> 0x00a8, all -> 0x00a5 }
                r4.readFully(r6)     // Catch:{ IOException -> 0x00a8, all -> 0x00a5 }
                javax.crypto.spec.IvParameterSpec r7 = new javax.crypto.spec.IvParameterSpec     // Catch:{ IOException -> 0x00a8, all -> 0x00a5 }
                r7.<init>(r6)     // Catch:{ IOException -> 0x00a8, all -> 0x00a5 }
                javax.crypto.Cipher r6 = r10.f13869b     // Catch:{ InvalidKeyException -> 0x0059, InvalidAlgorithmParameterException -> 0x0057 }
                javax.crypto.spec.SecretKeySpec r8 = r10.f13870c     // Catch:{ InvalidKeyException -> 0x0059, InvalidAlgorithmParameterException -> 0x0057 }
                r6.init(r5, r8, r7)     // Catch:{ InvalidKeyException -> 0x0059, InvalidAlgorithmParameterException -> 0x0057 }
                java.io.DataInputStream r5 = new java.io.DataInputStream     // Catch:{ IOException -> 0x00a8, all -> 0x00a5 }
                javax.crypto.CipherInputStream r6 = new javax.crypto.CipherInputStream     // Catch:{ IOException -> 0x00a8, all -> 0x00a5 }
                javax.crypto.Cipher r7 = r10.f13869b     // Catch:{ IOException -> 0x00a8, all -> 0x00a5 }
                r6.<init>(r3, r7)     // Catch:{ IOException -> 0x00a8, all -> 0x00a5 }
                r5.<init>(r6)     // Catch:{ IOException -> 0x00a8, all -> 0x00a5 }
                r4 = r5
                goto L_0x0066
            L_0x0057:
                r11 = move-exception
                goto L_0x005a
            L_0x0059:
                r11 = move-exception
            L_0x005a:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x00a8, all -> 0x00a5 }
                r12.<init>(r11)     // Catch:{ IOException -> 0x00a8, all -> 0x00a5 }
                throw r12     // Catch:{ IOException -> 0x00a8, all -> 0x00a5 }
            L_0x0060:
                boolean r3 = r10.f13868a     // Catch:{ IOException -> 0x00a8, all -> 0x00a5 }
                if (r3 == 0) goto L_0x0066
                r10.f13873f = r1     // Catch:{ IOException -> 0x00a8, all -> 0x00a5 }
            L_0x0066:
                int r3 = r4.readInt()     // Catch:{ IOException -> 0x00a8, all -> 0x00a5 }
                r5 = r2
                r6 = r5
            L_0x006c:
                if (r5 >= r3) goto L_0x0086
                u7.m r7 = r10.j(r0, r4)     // Catch:{ IOException -> 0x00a8, all -> 0x00a5 }
                java.lang.String r8 = r7.f13838b     // Catch:{ IOException -> 0x00a8, all -> 0x00a5 }
                r11.put(r8, r7)     // Catch:{ IOException -> 0x00a8, all -> 0x00a5 }
                int r8 = r7.f13837a     // Catch:{ IOException -> 0x00a8, all -> 0x00a5 }
                java.lang.String r9 = r7.f13838b     // Catch:{ IOException -> 0x00a8, all -> 0x00a5 }
                r12.put(r8, r9)     // Catch:{ IOException -> 0x00a8, all -> 0x00a5 }
                int r7 = r10.i(r7, r0)     // Catch:{ IOException -> 0x00a8, all -> 0x00a5 }
                int r6 = r6 + r7
                int r5 = r5 + 1
                goto L_0x006c
            L_0x0086:
                int r11 = r4.readInt()     // Catch:{ IOException -> 0x00a8, all -> 0x00a5 }
                int r12 = r4.read()     // Catch:{ IOException -> 0x00a8, all -> 0x00a5 }
                r0 = -1
                if (r12 != r0) goto L_0x0093
                r12 = r1
                goto L_0x0094
            L_0x0093:
                r12 = r2
            L_0x0094:
                if (r11 != r6) goto L_0x009d
                if (r12 != 0) goto L_0x0099
                goto L_0x009d
            L_0x0099:
                w7.q0.q(r4)
                return r1
            L_0x009d:
                w7.q0.q(r4)
                return r2
            L_0x00a1:
                w7.q0.q(r4)
                return r2
            L_0x00a5:
                r11 = move-exception
                r0 = r4
                goto L_0x00ab
            L_0x00a8:
                r0 = r4
                goto L_0x00b1
            L_0x00aa:
                r11 = move-exception
            L_0x00ab:
                if (r0 == 0) goto L_0x00b0
                w7.q0.q(r0)
            L_0x00b0:
                throw r11
            L_0x00b1:
                if (r0 == 0) goto L_0x00b6
                w7.q0.q(r0)
            L_0x00b6:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: u7.n.b.k(java.util.HashMap, android.util.SparseArray):boolean");
        }

        public final void l(m mVar, DataOutputStream dataOutputStream) throws IOException {
            dataOutputStream.writeInt(mVar.f13837a);
            dataOutputStream.writeUTF(mVar.f13838b);
            n.v(mVar.d(), dataOutputStream);
        }

        public final void m(HashMap<String, m> hashMap) throws IOException {
            DataOutputStream dataOutputStream = null;
            try {
                OutputStream f10 = this.f13872e.f();
                b0 b0Var = this.f13874g;
                if (b0Var == null) {
                    this.f13874g = new b0(f10);
                } else {
                    b0Var.c(f10);
                }
                DataOutputStream dataOutputStream2 = new DataOutputStream(this.f13874g);
                try {
                    dataOutputStream2.writeInt(2);
                    int i10 = 0;
                    dataOutputStream2.writeInt(this.f13868a ? 1 : 0);
                    if (this.f13868a) {
                        byte[] bArr = new byte[16];
                        this.f13871d.nextBytes(bArr);
                        dataOutputStream2.write(bArr);
                        this.f13869b.init(1, this.f13870c, new IvParameterSpec(bArr));
                        dataOutputStream2.flush();
                        dataOutputStream2 = new DataOutputStream(new CipherOutputStream(this.f13874g, this.f13869b));
                    }
                    dataOutputStream2.writeInt(hashMap.size());
                    for (m next : hashMap.values()) {
                        l(next, dataOutputStream2);
                        i10 += i(next, 2);
                    }
                    dataOutputStream2.writeInt(i10);
                    this.f13872e.b(dataOutputStream2);
                    q0.q((Closeable) null);
                } catch (InvalidKeyException e10) {
                    e = e10;
                    throw new IllegalStateException(e);
                } catch (InvalidAlgorithmParameterException e11) {
                    e = e11;
                    throw new IllegalStateException(e);
                } catch (Throwable th2) {
                    th = th2;
                    dataOutputStream = dataOutputStream2;
                    q0.q(dataOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                q0.q(dataOutputStream);
                throw th;
            }
        }
    }

    public interface c {
        void a(HashMap<String, m> hashMap) throws IOException;

        void b(m mVar, boolean z10);

        void c(m mVar);

        boolean d() throws IOException;

        void e(HashMap<String, m> hashMap) throws IOException;

        void f(long j10);

        void g(HashMap<String, m> hashMap, SparseArray<String> sparseArray) throws IOException;

        void h() throws IOException;
    }

    public n(f6.b bVar) {
        this(bVar, (File) null, (byte[]) null, false, false);
    }

    public n(@o0 f6.b bVar, @o0 File file, @o0 byte[] bArr, boolean z10, boolean z11) {
        w7.a.i((bVar == null && file == null) ? false : true);
        this.f13844a = new HashMap<>();
        this.f13845b = new SparseArray<>();
        this.f13846c = new SparseBooleanArray();
        this.f13847d = new SparseBooleanArray();
        b bVar2 = null;
        a aVar = bVar != null ? new a(bVar) : null;
        bVar2 = file != null ? new b(new File(file, f13842g), bArr, z10) : bVar2;
        if (aVar == null || (bVar2 != null && z11)) {
            this.f13848e = bVar2;
            this.f13849f = aVar;
            return;
        }
        this.f13848e = aVar;
        this.f13849f = bVar2;
    }

    public static void g(f6.b bVar, long j10) throws f6.a {
        a.j(bVar, j10);
    }

    @SuppressLint({"GetInstance"})
    public static Cipher j() throws NoSuchPaddingException, NoSuchAlgorithmException {
        if (q0.f14786a == 18) {
            try {
                return Cipher.getInstance("AES/CBC/PKCS5PADDING", "BC");
            } catch (Throwable unused) {
            }
        }
        return Cipher.getInstance("AES/CBC/PKCS5PADDING");
    }

    @g1
    public static int n(SparseArray<String> sparseArray) {
        int size = sparseArray.size();
        int i10 = 0;
        int keyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (keyAt >= 0) {
            return keyAt;
        }
        while (i10 < size && i10 == sparseArray.keyAt(i10)) {
            i10++;
        }
        return i10;
    }

    public static final boolean q(String str) {
        return str.startsWith(f13842g);
    }

    public static s s(DataInputStream dataInputStream) throws IOException {
        int readInt = dataInputStream.readInt();
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (i10 < readInt) {
            String readUTF = dataInputStream.readUTF();
            int readInt2 = dataInputStream.readInt();
            if (readInt2 >= 0) {
                int min = Math.min(readInt2, f13843h);
                byte[] bArr = q0.f14791f;
                int i11 = 0;
                while (i11 != readInt2) {
                    int i12 = i11 + min;
                    bArr = Arrays.copyOf(bArr, i12);
                    dataInputStream.readFully(bArr, i11, min);
                    min = Math.min(readInt2 - i12, f13843h);
                    i11 = i12;
                }
                hashMap.put(readUTF, bArr);
                i10++;
            } else {
                throw new IOException("Invalid value size: " + readInt2);
            }
        }
        return new s(hashMap);
    }

    public static void v(s sVar, DataOutputStream dataOutputStream) throws IOException {
        Set<Map.Entry<String, byte[]>> g10 = sVar.g();
        dataOutputStream.writeInt(g10.size());
        for (Map.Entry next : g10) {
            dataOutputStream.writeUTF((String) next.getKey());
            byte[] bArr = (byte[]) next.getValue();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
    }

    public final m d(String str) {
        int n10 = n(this.f13845b);
        m mVar = new m(n10, str);
        this.f13844a.put(str, mVar);
        this.f13845b.put(n10, str);
        this.f13847d.put(n10, true);
        this.f13848e.c(mVar);
        return mVar;
    }

    public void e(String str, r rVar) {
        m o10 = o(str);
        if (o10.b(rVar)) {
            this.f13848e.c(o10);
        }
    }

    public int f(String str) {
        return o(str).f13837a;
    }

    public m h(String str) {
        return this.f13844a.get(str);
    }

    public Collection<m> i() {
        return this.f13844a.values();
    }

    public q k(String str) {
        m h10 = h(str);
        return h10 != null ? h10.d() : s.f13880f;
    }

    public String l(int i10) {
        return this.f13845b.get(i10);
    }

    public Set<String> m() {
        return this.f13844a.keySet();
    }

    public m o(String str) {
        m mVar = this.f13844a.get(str);
        return mVar == null ? d(str) : mVar;
    }

    public void p(long j10) throws IOException {
        c cVar;
        this.f13848e.f(j10);
        c cVar2 = this.f13849f;
        if (cVar2 != null) {
            cVar2.f(j10);
        }
        if (this.f13848e.d() || (cVar = this.f13849f) == null || !cVar.d()) {
            this.f13848e.g(this.f13844a, this.f13845b);
        } else {
            this.f13849f.g(this.f13844a, this.f13845b);
            this.f13848e.a(this.f13844a);
        }
        c cVar3 = this.f13849f;
        if (cVar3 != null) {
            cVar3.h();
            this.f13849f = null;
        }
    }

    public void r(String str) {
        m mVar = this.f13844a.get(str);
        if (mVar != null && mVar.g() && !mVar.h()) {
            this.f13844a.remove(str);
            int i10 = mVar.f13837a;
            boolean z10 = this.f13847d.get(i10);
            this.f13848e.b(mVar, z10);
            SparseArray<String> sparseArray = this.f13845b;
            if (z10) {
                sparseArray.remove(i10);
                this.f13847d.delete(i10);
                return;
            }
            sparseArray.put(i10, (Object) null);
            this.f13846c.put(i10, true);
        }
    }

    public void t() {
        int size = this.f13844a.size();
        String[] strArr = new String[size];
        this.f13844a.keySet().toArray(strArr);
        for (int i10 = 0; i10 < size; i10++) {
            r(strArr[i10]);
        }
    }

    public void u() throws IOException {
        this.f13848e.e(this.f13844a);
        int size = this.f13846c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f13845b.remove(this.f13846c.keyAt(i10));
        }
        this.f13846c.clear();
        this.f13847d.clear();
    }
}
