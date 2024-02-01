package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import d.m0;
import d.o0;
import i8.m;
import i8.n;
import i8.p;
import j8.c;
import j8.s;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import l8.b;

@e8.a
@SafeParcelable.a(creator = "DataHolderCreator", validate = true)
@KeepName
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    @e8.a
    @m0
    public static final Parcelable.Creator<DataHolder> CREATOR = new p();
    public static final a Y = new b(new String[0], (String) null);
    @SafeParcelable.h(id = 1000)
    public final int O;
    @SafeParcelable.c(getter = "getColumns", id = 1)
    public final String[] P;
    public Bundle Q;
    @SafeParcelable.c(getter = "getWindows", id = 2)
    public final CursorWindow[] R;
    @SafeParcelable.c(getter = "getStatusCode", id = 3)
    public final int S;
    @o0
    @SafeParcelable.c(getter = "getMetadata", id = 4)
    public final Bundle T;
    public int[] U;
    public int V;
    public boolean W;
    public boolean X;

    @e8.a
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final String[] f5744a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList f5745b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        public final HashMap f5746c = new HashMap();

        public /* synthetic */ a(String[] strArr, String str, m mVar) {
            this.f5744a = (String[]) s.l(strArr);
        }

        @e8.a
        @m0
        public DataHolder a(int i10) {
            return new DataHolder(this, i10);
        }

        @e8.a
        @m0
        public DataHolder b(int i10, @m0 Bundle bundle) {
            return new DataHolder(this, i10, bundle);
        }

        @e8.a
        @m0
        public a c(@m0 ContentValues contentValues) {
            c.c(contentValues);
            HashMap hashMap = new HashMap(contentValues.size());
            for (Map.Entry next : contentValues.valueSet()) {
                hashMap.put((String) next.getKey(), next.getValue());
            }
            return d(hashMap);
        }

        @CanIgnoreReturnValue
        @m0
        public a d(@m0 HashMap hashMap) {
            c.c(hashMap);
            this.f5745b.add(hashMap);
            return this;
        }
    }

    @SafeParcelable.b
    public DataHolder(@SafeParcelable.e(id = 1000) int i10, @SafeParcelable.e(id = 1) String[] strArr, @SafeParcelable.e(id = 2) CursorWindow[] cursorWindowArr, @SafeParcelable.e(id = 3) int i11, @SafeParcelable.e(id = 4) @o0 Bundle bundle) {
        this.W = false;
        this.X = true;
        this.O = i10;
        this.P = strArr;
        this.R = cursorWindowArr;
        this.S = i11;
        this.T = bundle;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Illegal instructions before constructor call */
    @e8.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DataHolder(@d.m0 android.database.Cursor r8, int r9, @d.o0 android.os.Bundle r10) {
        /*
            r7 = this;
            u8.a r0 = new u8.a
            r0.<init>(r8)
            java.lang.String[] r8 = r0.getColumnNames()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r0.getCount()     // Catch:{ all -> 0x0076 }
            android.database.CursorWindow r3 = r0.getWindow()     // Catch:{ all -> 0x0076 }
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L_0x002e
            int r6 = r3.getStartPosition()     // Catch:{ all -> 0x0076 }
            if (r6 != 0) goto L_0x002e
            r3.acquireReference()     // Catch:{ all -> 0x0076 }
            r0.c(r4)     // Catch:{ all -> 0x0076 }
            r1.add(r3)     // Catch:{ all -> 0x0076 }
            int r3 = r3.getNumRows()     // Catch:{ all -> 0x0076 }
            goto L_0x002f
        L_0x002e:
            r3 = r5
        L_0x002f:
            if (r3 >= r2) goto L_0x0063
            boolean r6 = r0.moveToPosition(r3)     // Catch:{ all -> 0x0076 }
            if (r6 == 0) goto L_0x0063
            android.database.CursorWindow r6 = r0.getWindow()     // Catch:{ all -> 0x0076 }
            if (r6 == 0) goto L_0x0044
            r6.acquireReference()     // Catch:{ all -> 0x0076 }
            r0.c(r4)     // Catch:{ all -> 0x0076 }
            goto L_0x004f
        L_0x0044:
            android.database.CursorWindow r6 = new android.database.CursorWindow     // Catch:{ all -> 0x0076 }
            r6.<init>(r5)     // Catch:{ all -> 0x0076 }
            r6.setStartPosition(r3)     // Catch:{ all -> 0x0076 }
            r0.fillWindow(r3, r6)     // Catch:{ all -> 0x0076 }
        L_0x004f:
            int r3 = r6.getNumRows()     // Catch:{ all -> 0x0076 }
            if (r3 != 0) goto L_0x0056
            goto L_0x0063
        L_0x0056:
            r1.add(r6)     // Catch:{ all -> 0x0076 }
            int r3 = r6.getStartPosition()     // Catch:{ all -> 0x0076 }
            int r6 = r6.getNumRows()     // Catch:{ all -> 0x0076 }
            int r3 = r3 + r6
            goto L_0x002f
        L_0x0063:
            r0.close()
            int r0 = r1.size()
            android.database.CursorWindow[] r0 = new android.database.CursorWindow[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            android.database.CursorWindow[] r0 = (android.database.CursorWindow[]) r0
            r7.<init>((java.lang.String[]) r8, (android.database.CursorWindow[]) r0, (int) r9, (android.os.Bundle) r10)
            return
        L_0x0076:
            r8 = move-exception
            r0.close()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.data.DataHolder.<init>(android.database.Cursor, int, android.os.Bundle):void");
    }

    public DataHolder(a aVar, int i10, @o0 Bundle bundle) {
        this(aVar.f5744a, S1(aVar, -1), i10, (Bundle) null);
    }

    @e8.a
    public DataHolder(@m0 String[] strArr, @m0 CursorWindow[] cursorWindowArr, int i10, @o0 Bundle bundle) {
        this.W = false;
        this.X = true;
        this.O = 1;
        this.P = (String[]) s.l(strArr);
        this.R = (CursorWindow[]) s.l(cursorWindowArr);
        this.S = i10;
        this.T = bundle;
        Q1();
    }

    public static CursorWindow[] S1(a aVar, int i10) {
        long j10;
        if (aVar.f5744a.length == 0) {
            return new CursorWindow[0];
        }
        ArrayList e10 = aVar.f5745b;
        int size = e10.size();
        CursorWindow cursorWindow = new CursorWindow(false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(cursorWindow);
        cursorWindow.setNumColumns(aVar.f5744a.length);
        int i11 = 0;
        boolean z10 = false;
        while (i11 < size) {
            try {
                if (!cursorWindow.allocRow()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Allocating additional cursor window for large data set (row ");
                    sb2.append(i11);
                    sb2.append(")");
                    cursorWindow = new CursorWindow(false);
                    cursorWindow.setStartPosition(i11);
                    cursorWindow.setNumColumns(aVar.f5744a.length);
                    arrayList.add(cursorWindow);
                    if (!cursorWindow.allocRow()) {
                        arrayList.remove(cursorWindow);
                        return (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]);
                    }
                }
                Map map = (Map) e10.get(i11);
                int i12 = 0;
                boolean z11 = true;
                while (true) {
                    if (i12 < aVar.f5744a.length) {
                        if (!z11) {
                            break;
                        }
                        String str = aVar.f5744a[i12];
                        Object obj = map.get(str);
                        if (obj == null) {
                            z11 = cursorWindow.putNull(i11, i12);
                        } else if (obj instanceof String) {
                            z11 = cursorWindow.putString((String) obj, i11, i12);
                        } else {
                            if (obj instanceof Long) {
                                j10 = ((Long) obj).longValue();
                            } else if (obj instanceof Integer) {
                                z11 = cursorWindow.putLong((long) ((Integer) obj).intValue(), i11, i12);
                            } else if (obj instanceof Boolean) {
                                j10 = true != ((Boolean) obj).booleanValue() ? 0 : 1;
                            } else if (obj instanceof byte[]) {
                                z11 = cursorWindow.putBlob((byte[]) obj, i11, i12);
                            } else if (obj instanceof Double) {
                                z11 = cursorWindow.putDouble(((Double) obj).doubleValue(), i11, i12);
                            } else if (obj instanceof Float) {
                                z11 = cursorWindow.putDouble((double) ((Float) obj).floatValue(), i11, i12);
                            } else {
                                throw new IllegalArgumentException("Unsupported object for column " + str + ": " + obj.toString());
                            }
                            z11 = cursorWindow.putLong(j10, i11, i12);
                        }
                        i12++;
                    } else if (z11) {
                        z10 = false;
                    }
                }
                if (!z10) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Couldn't populate window data for row ");
                    sb3.append(i11);
                    sb3.append(" - allocating new window.");
                    cursorWindow.freeLastRow();
                    cursorWindow = new CursorWindow(false);
                    cursorWindow.setStartPosition(i11);
                    cursorWindow.setNumColumns(aVar.f5744a.length);
                    arrayList.add(cursorWindow);
                    i11--;
                    z10 = true;
                    i11++;
                } else {
                    throw new n("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
                }
            } catch (RuntimeException e11) {
                int size2 = arrayList.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    ((CursorWindow) arrayList.get(i13)).close();
                }
                throw e11;
            }
        }
        return (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]);
    }

    @e8.a
    @m0
    public static a X0(@m0 String[] strArr) {
        return new a(strArr, (String) null, (m) null);
    }

    @e8.a
    @m0
    public static DataHolder Z0(int i10) {
        return new DataHolder(Y, i10, (Bundle) null);
    }

    @e8.a
    public int A1(int i10) {
        int length;
        int i11 = 0;
        s.r(i10 >= 0 && i10 < this.V);
        while (true) {
            int[] iArr = this.U;
            length = iArr.length;
            if (i11 >= length) {
                break;
            } else if (i10 < iArr[i11]) {
                i11--;
                break;
            } else {
                i11++;
            }
        }
        return i11 == length ? i11 - 1 : i11;
    }

    @e8.a
    public boolean F1(@m0 String str) {
        return this.Q.containsKey(str);
    }

    @e8.a
    public boolean L1(@m0 String str, int i10, int i11) {
        R1(str, i10);
        return this.R[i11].isNull(i10, this.Q.getInt(str));
    }

    public final double N1(@m0 String str, int i10, int i11) {
        R1(str, i10);
        return this.R[i11].getDouble(i10, this.Q.getInt(str));
    }

    public final float O1(@m0 String str, int i10, int i11) {
        R1(str, i10);
        return this.R[i11].getFloat(i10, this.Q.getInt(str));
    }

    public final void P1(@m0 String str, int i10, int i11, @m0 CharArrayBuffer charArrayBuffer) {
        R1(str, i10);
        this.R[i11].copyStringToBuffer(i10, this.Q.getInt(str), charArrayBuffer);
    }

    public final void Q1() {
        this.Q = new Bundle();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            String[] strArr = this.P;
            if (i11 >= strArr.length) {
                break;
            }
            this.Q.putInt(strArr[i11], i11);
            i11++;
        }
        this.U = new int[this.R.length];
        int i12 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.R;
            if (i10 < cursorWindowArr.length) {
                this.U[i10] = i12;
                i12 += this.R[i10].getNumRows() - (i12 - cursorWindowArr[i10].getStartPosition());
                i10++;
            } else {
                this.V = i12;
                return;
            }
        }
    }

    public final void R1(String str, int i10) {
        Bundle bundle = this.Q;
        if (bundle == null || !bundle.containsKey(str)) {
            throw new IllegalArgumentException("No such column: ".concat(String.valueOf(str)));
        } else if (isClosed()) {
            throw new IllegalArgumentException("Buffer is closed.");
        } else if (i10 < 0 || i10 >= this.V) {
            throw new CursorIndexOutOfBoundsException(i10, this.V);
        }
    }

    @e8.a
    public void close() {
        synchronized (this) {
            if (!this.W) {
                this.W = true;
                int i10 = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.R;
                    if (i10 >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i10].close();
                    i10++;
                }
            }
        }
    }

    @e8.a
    @o0
    public Bundle d() {
        return this.T;
    }

    @e8.a
    public boolean f1(@m0 String str, int i10, int i11) {
        R1(str, i10);
        return Long.valueOf(this.R[i11].getLong(i10, this.Q.getInt(str))).longValue() == 1;
    }

    public final void finalize() throws Throwable {
        try {
            if (this.X && this.R.length > 0 && !isClosed()) {
                close();
                String obj = toString();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                sb2.append(obj);
                sb2.append(")");
            }
        } finally {
            super.finalize();
        }
    }

    @e8.a
    @m0
    public byte[] g1(@m0 String str, int i10, int i11) {
        R1(str, i10);
        return this.R[i11].getBlob(i10, this.Q.getInt(str));
    }

    @e8.a
    public int getCount() {
        return this.V;
    }

    @e8.a
    public int h1(@m0 String str, int i10, int i11) {
        R1(str, i10);
        return this.R[i11].getInt(i10, this.Q.getInt(str));
    }

    @e8.a
    public boolean isClosed() {
        boolean z10;
        synchronized (this) {
            z10 = this.W;
        }
        return z10;
    }

    @e8.a
    public long m1(@m0 String str, int i10, int i11) {
        R1(str, i10);
        return this.R[i11].getLong(i10, this.Q.getInt(str));
    }

    @e8.a
    public int p1() {
        return this.S;
    }

    @e8.a
    @m0
    public String r1(@m0 String str, int i10, int i11) {
        R1(str, i10);
        return this.R[i11].getString(i10, this.Q.getInt(str));
    }

    public final void writeToParcel(@m0 Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.Z(parcel, 1, this.P, false);
        b.c0(parcel, 2, this.R, i10, false);
        b.F(parcel, 3, p1());
        b.k(parcel, 4, d(), false);
        b.F(parcel, 1000, this.O);
        b.b(parcel, a10);
        if ((i10 & 1) != 0) {
            close();
        }
    }
}
