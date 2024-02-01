package com.google.android.exoplayer2.trackselection;

import android.content.Context;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import b6.i;
import b6.t0;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.exoplayer2.trackselection.a;
import com.google.android.exoplayer2.trackselection.d;
import com.google.android.exoplayer2.trackselection.f;
import d.m0;
import d.o0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import w7.q0;

public class DefaultTrackSelector extends d {

    /* renamed from: g  reason: collision with root package name */
    public static final float f5300g = 0.98f;

    /* renamed from: h  reason: collision with root package name */
    public static final int[] f5301h = new int[0];

    /* renamed from: i  reason: collision with root package name */
    public static final int f5302i = 1000;

    /* renamed from: d  reason: collision with root package name */
    public final f.b f5303d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicReference<Parameters> f5304e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f5305f;

    public static final class Parameters extends TrackSelectionParameters {
        public static final Parcelable.Creator<Parameters> CREATOR = new a();

        /* renamed from: q0  reason: collision with root package name */
        public static final Parameters f5306q0 = new Parameters();
        public final int T;
        public final int U;
        public final int V;
        public final int W;
        public final boolean X;
        public final boolean Y;
        public final boolean Z;

        /* renamed from: a0  reason: collision with root package name */
        public final int f5307a0;

        /* renamed from: b0  reason: collision with root package name */
        public final int f5308b0;

        /* renamed from: c0  reason: collision with root package name */
        public final boolean f5309c0;

        /* renamed from: d0  reason: collision with root package name */
        public final int f5310d0;

        /* renamed from: e0  reason: collision with root package name */
        public final int f5311e0;

        /* renamed from: f0  reason: collision with root package name */
        public final boolean f5312f0;

        /* renamed from: g0  reason: collision with root package name */
        public final boolean f5313g0;

        /* renamed from: h0  reason: collision with root package name */
        public final boolean f5314h0;

        /* renamed from: i0  reason: collision with root package name */
        public final boolean f5315i0;

        /* renamed from: j0  reason: collision with root package name */
        public final boolean f5316j0;
        @Deprecated

        /* renamed from: k0  reason: collision with root package name */
        public final boolean f5317k0;
        @Deprecated

        /* renamed from: l0  reason: collision with root package name */
        public final boolean f5318l0;

        /* renamed from: m0  reason: collision with root package name */
        public final boolean f5319m0;

        /* renamed from: n0  reason: collision with root package name */
        public final int f5320n0;

        /* renamed from: o0  reason: collision with root package name */
        public final SparseArray<Map<TrackGroupArray, SelectionOverride>> f5321o0;

        /* renamed from: p0  reason: collision with root package name */
        public final SparseBooleanArray f5322p0;

        public static class a implements Parcelable.Creator<Parameters> {
            /* renamed from: a */
            public Parameters createFromParcel(Parcel parcel) {
                return new Parameters(parcel);
            }

            /* renamed from: b */
            public Parameters[] newArray(int i10) {
                return new Parameters[i10];
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public Parameters() {
            /*
                r26 = this;
                r0 = r26
                com.google.android.exoplayer2.trackselection.TrackSelectionParameters r1 = com.google.android.exoplayer2.trackselection.TrackSelectionParameters.S
                java.lang.String r11 = r1.O
                java.lang.String r2 = r1.P
                r17 = r2
                boolean r2 = r1.Q
                r18 = r2
                int r1 = r1.R
                r19 = r1
                android.util.SparseArray r1 = new android.util.SparseArray
                r24 = r1
                r1.<init>()
                android.util.SparseBooleanArray r1 = new android.util.SparseBooleanArray
                r25 = r1
                r1.<init>()
                r1 = 2147483647(0x7fffffff, float:NaN)
                r2 = 2147483647(0x7fffffff, float:NaN)
                r3 = 2147483647(0x7fffffff, float:NaN)
                r4 = 2147483647(0x7fffffff, float:NaN)
                r5 = 1
                r6 = 0
                r7 = 1
                r8 = 2147483647(0x7fffffff, float:NaN)
                r9 = 2147483647(0x7fffffff, float:NaN)
                r10 = 1
                r12 = 2147483647(0x7fffffff, float:NaN)
                r13 = 2147483647(0x7fffffff, float:NaN)
                r14 = 1
                r15 = 0
                r16 = 0
                r20 = 0
                r21 = 0
                r22 = 1
                r23 = 0
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.<init>():void");
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Parameters(int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, int i14, int i15, boolean z13, @o0 String str, int i16, int i17, boolean z14, boolean z15, boolean z16, @o0 String str2, boolean z17, int i18, boolean z18, boolean z19, boolean z20, int i19, SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray, SparseBooleanArray sparseBooleanArray) {
            super(str, str2, z17, i18);
            boolean z21 = z11;
            boolean z22 = z12;
            this.T = i10;
            this.U = i11;
            this.V = i12;
            this.W = i13;
            this.X = z10;
            this.Y = z21;
            this.Z = z22;
            this.f5307a0 = i14;
            this.f5308b0 = i15;
            this.f5309c0 = z13;
            this.f5310d0 = i16;
            this.f5311e0 = i17;
            this.f5312f0 = z14;
            this.f5313g0 = z15;
            this.f5314h0 = z16;
            this.f5315i0 = z18;
            this.f5316j0 = z19;
            this.f5319m0 = z20;
            this.f5320n0 = i19;
            this.f5317k0 = z21;
            this.f5318l0 = z22;
            this.f5321o0 = sparseArray;
            this.f5322p0 = sparseBooleanArray;
        }

        public Parameters(Parcel parcel) {
            super(parcel);
            this.T = parcel.readInt();
            this.U = parcel.readInt();
            this.V = parcel.readInt();
            this.W = parcel.readInt();
            this.X = q0.H0(parcel);
            boolean H0 = q0.H0(parcel);
            this.Y = H0;
            boolean H02 = q0.H0(parcel);
            this.Z = H02;
            this.f5307a0 = parcel.readInt();
            this.f5308b0 = parcel.readInt();
            this.f5309c0 = q0.H0(parcel);
            this.f5310d0 = parcel.readInt();
            this.f5311e0 = parcel.readInt();
            this.f5312f0 = q0.H0(parcel);
            this.f5313g0 = q0.H0(parcel);
            this.f5314h0 = q0.H0(parcel);
            this.f5315i0 = q0.H0(parcel);
            this.f5316j0 = q0.H0(parcel);
            this.f5319m0 = q0.H0(parcel);
            this.f5320n0 = parcel.readInt();
            this.f5321o0 = n(parcel);
            this.f5322p0 = (SparseBooleanArray) q0.l(parcel.readSparseBooleanArray());
            this.f5317k0 = H0;
            this.f5318l0 = H02;
        }

        public static boolean d(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i10)) < 0) {
                    return false;
                }
            }
            return true;
        }

        public static boolean e(SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray, SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i10 = 0; i10 < size; i10++) {
                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i10));
                if (indexOfKey < 0 || !f(sparseArray.valueAt(i10), sparseArray2.valueAt(indexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        /* JADX WARNING: Removed duplicated region for block: B:6:0x001a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static boolean f(java.util.Map<com.google.android.exoplayer2.source.TrackGroupArray, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride> r4, java.util.Map<com.google.android.exoplayer2.source.TrackGroupArray, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride> r5) {
            /*
                int r0 = r4.size()
                int r1 = r5.size()
                r2 = 0
                if (r1 == r0) goto L_0x000c
                return r2
            L_0x000c:
                java.util.Set r4 = r4.entrySet()
                java.util.Iterator r4 = r4.iterator()
            L_0x0014:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L_0x003b
                java.lang.Object r0 = r4.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r1 = r0.getKey()
                com.google.android.exoplayer2.source.TrackGroupArray r1 = (com.google.android.exoplayer2.source.TrackGroupArray) r1
                boolean r3 = r5.containsKey(r1)
                if (r3 == 0) goto L_0x003a
                java.lang.Object r0 = r0.getValue()
                java.lang.Object r1 = r5.get(r1)
                boolean r0 = w7.q0.e(r0, r1)
                if (r0 != 0) goto L_0x0014
            L_0x003a:
                return r2
            L_0x003b:
                r4 = 1
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters.f(java.util.Map, java.util.Map):boolean");
        }

        public static SparseArray<Map<TrackGroupArray, SelectionOverride>> n(Parcel parcel) {
            int readInt = parcel.readInt();
            SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray = new SparseArray<>(readInt);
            for (int i10 = 0; i10 < readInt; i10++) {
                int readInt2 = parcel.readInt();
                int readInt3 = parcel.readInt();
                HashMap hashMap = new HashMap(readInt3);
                for (int i11 = 0; i11 < readInt3; i11++) {
                    hashMap.put((TrackGroupArray) parcel.readParcelable(TrackGroupArray.class.getClassLoader()), (SelectionOverride) parcel.readParcelable(SelectionOverride.class.getClassLoader()));
                }
                sparseArray.put(readInt2, hashMap);
            }
            return sparseArray;
        }

        public static void o(Parcel parcel, SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray) {
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i10 = 0; i10 < size; i10++) {
                int keyAt = sparseArray.keyAt(i10);
                Map valueAt = sparseArray.valueAt(i10);
                int size2 = valueAt.size();
                parcel.writeInt(keyAt);
                parcel.writeInt(size2);
                for (Map.Entry entry : valueAt.entrySet()) {
                    parcel.writeParcelable((Parcelable) entry.getKey(), 0);
                    parcel.writeParcelable((Parcelable) entry.getValue(), 0);
                }
            }
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(@o0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Parameters.class != obj.getClass()) {
                return false;
            }
            Parameters parameters = (Parameters) obj;
            return super.equals(obj) && this.T == parameters.T && this.U == parameters.U && this.V == parameters.V && this.W == parameters.W && this.X == parameters.X && this.Y == parameters.Y && this.Z == parameters.Z && this.f5309c0 == parameters.f5309c0 && this.f5307a0 == parameters.f5307a0 && this.f5308b0 == parameters.f5308b0 && this.f5310d0 == parameters.f5310d0 && this.f5311e0 == parameters.f5311e0 && this.f5312f0 == parameters.f5312f0 && this.f5313g0 == parameters.f5313g0 && this.f5314h0 == parameters.f5314h0 && this.f5315i0 == parameters.f5315i0 && this.f5316j0 == parameters.f5316j0 && this.f5319m0 == parameters.f5319m0 && this.f5320n0 == parameters.f5320n0 && d(this.f5322p0, parameters.f5322p0) && e(this.f5321o0, parameters.f5321o0);
        }

        /* renamed from: g */
        public d a() {
            return new d(this);
        }

        public final boolean h(int i10) {
            return this.f5322p0.get(i10);
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((((((((((super.hashCode() * 31) + this.T) * 31) + this.U) * 31) + this.V) * 31) + this.W) * 31) + (this.X ? 1 : 0)) * 31) + (this.Y ? 1 : 0)) * 31) + (this.Z ? 1 : 0)) * 31) + (this.f5309c0 ? 1 : 0)) * 31) + this.f5307a0) * 31) + this.f5308b0) * 31) + this.f5310d0) * 31) + this.f5311e0) * 31) + (this.f5312f0 ? 1 : 0)) * 31) + (this.f5313g0 ? 1 : 0)) * 31) + (this.f5314h0 ? 1 : 0)) * 31) + (this.f5315i0 ? 1 : 0)) * 31) + (this.f5316j0 ? 1 : 0)) * 31) + (this.f5319m0 ? 1 : 0)) * 31) + this.f5320n0;
        }

        @o0
        public final SelectionOverride j(int i10, TrackGroupArray trackGroupArray) {
            Map map = this.f5321o0.get(i10);
            if (map != null) {
                return (SelectionOverride) map.get(trackGroupArray);
            }
            return null;
        }

        public final boolean l(int i10, TrackGroupArray trackGroupArray) {
            Map map = this.f5321o0.get(i10);
            return map != null && map.containsKey(trackGroupArray);
        }

        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.T);
            parcel.writeInt(this.U);
            parcel.writeInt(this.V);
            parcel.writeInt(this.W);
            q0.b1(parcel, this.X);
            q0.b1(parcel, this.Y);
            q0.b1(parcel, this.Z);
            parcel.writeInt(this.f5307a0);
            parcel.writeInt(this.f5308b0);
            q0.b1(parcel, this.f5309c0);
            parcel.writeInt(this.f5310d0);
            parcel.writeInt(this.f5311e0);
            q0.b1(parcel, this.f5312f0);
            q0.b1(parcel, this.f5313g0);
            q0.b1(parcel, this.f5314h0);
            q0.b1(parcel, this.f5315i0);
            q0.b1(parcel, this.f5316j0);
            q0.b1(parcel, this.f5319m0);
            parcel.writeInt(this.f5320n0);
            o(parcel, this.f5321o0);
            parcel.writeSparseBooleanArray(this.f5322p0);
        }
    }

    public static final class SelectionOverride implements Parcelable {
        public static final Parcelable.Creator<SelectionOverride> CREATOR = new a();
        public final int O;
        public final int[] P;
        public final int Q;
        public final int R;
        public final int S;

        public static class a implements Parcelable.Creator<SelectionOverride> {
            /* renamed from: a */
            public SelectionOverride createFromParcel(Parcel parcel) {
                return new SelectionOverride(parcel);
            }

            /* renamed from: b */
            public SelectionOverride[] newArray(int i10) {
                return new SelectionOverride[i10];
            }
        }

        public SelectionOverride(int i10, int... iArr) {
            this(i10, iArr, 2, 0);
        }

        public SelectionOverride(int i10, int[] iArr, int i11, int i12) {
            this.O = i10;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.P = copyOf;
            this.Q = iArr.length;
            this.R = i11;
            this.S = i12;
            Arrays.sort(copyOf);
        }

        public SelectionOverride(Parcel parcel) {
            this.O = parcel.readInt();
            int readByte = parcel.readByte();
            this.Q = readByte;
            int[] iArr = new int[readByte];
            this.P = iArr;
            parcel.readIntArray(iArr);
            this.R = parcel.readInt();
            this.S = parcel.readInt();
        }

        public boolean a(int i10) {
            for (int i11 : this.P) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(@o0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || SelectionOverride.class != obj.getClass()) {
                return false;
            }
            SelectionOverride selectionOverride = (SelectionOverride) obj;
            return this.O == selectionOverride.O && Arrays.equals(this.P, selectionOverride.P) && this.R == selectionOverride.R && this.S == selectionOverride.S;
        }

        public int hashCode() {
            return (((((this.O * 31) + Arrays.hashCode(this.P)) * 31) + this.R) * 31) + this.S;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.O);
            parcel.writeInt(this.P.length);
            parcel.writeIntArray(this.P);
            parcel.writeInt(this.R);
            parcel.writeInt(this.S);
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f5323a;

        /* renamed from: b  reason: collision with root package name */
        public final int f5324b;
        @o0

        /* renamed from: c  reason: collision with root package name */
        public final String f5325c;

        public b(int i10, int i11, @o0 String str) {
            this.f5323a = i10;
            this.f5324b = i11;
            this.f5325c = str;
        }

        public boolean equals(@o0 Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return this.f5323a == bVar.f5323a && this.f5324b == bVar.f5324b && TextUtils.equals(this.f5325c, bVar.f5325c);
        }

        public int hashCode() {
            int i10 = ((this.f5323a * 31) + this.f5324b) * 31;
            String str = this.f5325c;
            return i10 + (str != null ? str.hashCode() : 0);
        }
    }

    public static final class c implements Comparable<c> {
        public final boolean O;
        public final Parameters P;
        public final boolean Q;
        public final int R;
        public final int S;
        public final int T;
        public final boolean U;
        public final int V;
        public final int W;
        public final int X;

        public c(Format format, Parameters parameters, int i10) {
            this.P = parameters;
            int i11 = 0;
            this.Q = DefaultTrackSelector.G(i10, false);
            this.R = DefaultTrackSelector.z(format, parameters.O);
            boolean z10 = true;
            this.U = (format.Q & 1) != 0;
            int i12 = format.f5077j0;
            this.V = i12;
            this.W = format.f5078k0;
            int i13 = format.S;
            this.X = i13;
            if ((i13 != -1 && i13 > parameters.f5311e0) || (i12 != -1 && i12 > parameters.f5310d0)) {
                z10 = false;
            }
            this.O = z10;
            String[] g02 = q0.g0();
            int i14 = Integer.MAX_VALUE;
            int i15 = 0;
            while (true) {
                if (i15 >= g02.length) {
                    break;
                }
                int z11 = DefaultTrackSelector.z(format, g02[i15]);
                if (z11 > 0) {
                    i14 = i15;
                    i11 = z11;
                    break;
                }
                i15++;
            }
            this.S = i14;
            this.T = i11;
        }

        /* renamed from: a */
        public int compareTo(@m0 c cVar) {
            int l10;
            boolean z10 = this.Q;
            int i10 = 1;
            if (z10 != cVar.Q) {
                return z10 ? 1 : -1;
            }
            int i11 = this.R;
            int i12 = cVar.R;
            if (i11 != i12) {
                return DefaultTrackSelector.r(i11, i12);
            }
            boolean z11 = this.O;
            if (z11 != cVar.O) {
                return z11 ? 1 : -1;
            }
            if (this.P.f5315i0 && (l10 = DefaultTrackSelector.q(this.X, cVar.X)) != 0) {
                return l10 > 0 ? -1 : 1;
            }
            boolean z12 = this.U;
            if (z12 != cVar.U) {
                return z12 ? 1 : -1;
            }
            int i13 = this.S;
            int i14 = cVar.S;
            if (i13 != i14) {
                return -DefaultTrackSelector.r(i13, i14);
            }
            int i15 = this.T;
            int i16 = cVar.T;
            if (i15 != i16) {
                return DefaultTrackSelector.r(i15, i16);
            }
            if (!this.O || !this.Q) {
                i10 = -1;
            }
            int i17 = this.V;
            int i18 = cVar.V;
            return i10 * ((i17 == i18 && (i17 = this.W) == (i18 = cVar.W)) ? DefaultTrackSelector.r(this.X, cVar.X) : DefaultTrackSelector.r(i17, i18));
        }
    }

    public static final class d extends TrackSelectionParameters.b {

        /* renamed from: e  reason: collision with root package name */
        public int f5326e;

        /* renamed from: f  reason: collision with root package name */
        public int f5327f;

        /* renamed from: g  reason: collision with root package name */
        public int f5328g;

        /* renamed from: h  reason: collision with root package name */
        public int f5329h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f5330i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f5331j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f5332k;

        /* renamed from: l  reason: collision with root package name */
        public int f5333l;

        /* renamed from: m  reason: collision with root package name */
        public int f5334m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f5335n;

        /* renamed from: o  reason: collision with root package name */
        public int f5336o;

        /* renamed from: p  reason: collision with root package name */
        public int f5337p;

        /* renamed from: q  reason: collision with root package name */
        public boolean f5338q;

        /* renamed from: r  reason: collision with root package name */
        public boolean f5339r;

        /* renamed from: s  reason: collision with root package name */
        public boolean f5340s;

        /* renamed from: t  reason: collision with root package name */
        public boolean f5341t;

        /* renamed from: u  reason: collision with root package name */
        public boolean f5342u;

        /* renamed from: v  reason: collision with root package name */
        public boolean f5343v;

        /* renamed from: w  reason: collision with root package name */
        public int f5344w;

        /* renamed from: x  reason: collision with root package name */
        public final SparseArray<Map<TrackGroupArray, SelectionOverride>> f5345x;

        /* renamed from: y  reason: collision with root package name */
        public final SparseBooleanArray f5346y;

        public d() {
            this(Parameters.f5306q0);
        }

        public d(Parameters parameters) {
            super(parameters);
            this.f5326e = parameters.T;
            this.f5327f = parameters.U;
            this.f5328g = parameters.V;
            this.f5329h = parameters.W;
            this.f5330i = parameters.X;
            this.f5331j = parameters.Y;
            this.f5332k = parameters.Z;
            this.f5333l = parameters.f5307a0;
            this.f5334m = parameters.f5308b0;
            this.f5335n = parameters.f5309c0;
            this.f5336o = parameters.f5310d0;
            this.f5337p = parameters.f5311e0;
            this.f5338q = parameters.f5312f0;
            this.f5339r = parameters.f5313g0;
            this.f5340s = parameters.f5314h0;
            this.f5341t = parameters.f5315i0;
            this.f5342u = parameters.f5316j0;
            this.f5343v = parameters.f5319m0;
            this.f5344w = parameters.f5320n0;
            this.f5345x = l(parameters.f5321o0);
            this.f5346y = parameters.f5322p0.clone();
        }

        public static SparseArray<Map<TrackGroupArray, SelectionOverride>> l(SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray) {
            SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray2 = new SparseArray<>();
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                sparseArray2.put(sparseArray.keyAt(i10), new HashMap(sparseArray.valueAt(i10)));
            }
            return sparseArray2;
        }

        public d A(int i10) {
            this.f5329h = i10;
            return this;
        }

        public d B(int i10) {
            this.f5328g = i10;
            return this;
        }

        public d C(int i10, int i11) {
            this.f5326e = i10;
            this.f5327f = i11;
            return this;
        }

        public d D() {
            return C(1279, 719);
        }

        /* renamed from: E */
        public d c(@o0 String str) {
            super.c(str);
            return this;
        }

        /* renamed from: F */
        public d d(@o0 String str) {
            super.d(str);
            return this;
        }

        public final d G(int i10, boolean z10) {
            if (this.f5346y.get(i10) == z10) {
                return this;
            }
            if (z10) {
                this.f5346y.put(i10, true);
            } else {
                this.f5346y.delete(i10);
            }
            return this;
        }

        /* renamed from: H */
        public d e(boolean z10) {
            super.e(z10);
            return this;
        }

        public final d I(int i10, TrackGroupArray trackGroupArray, SelectionOverride selectionOverride) {
            Map map = this.f5345x.get(i10);
            if (map == null) {
                map = new HashMap();
                this.f5345x.put(i10, map);
            }
            if (map.containsKey(trackGroupArray) && q0.e(map.get(trackGroupArray), selectionOverride)) {
                return this;
            }
            map.put(trackGroupArray, selectionOverride);
            return this;
        }

        public d J(int i10) {
            this.f5344w = i10;
            return this;
        }

        public d K(int i10, int i11, boolean z10) {
            this.f5333l = i10;
            this.f5334m = i11;
            this.f5335n = z10;
            return this;
        }

        public d L(Context context, boolean z10) {
            Point a02 = q0.a0(context);
            return K(a02.x, a02.y, z10);
        }

        /* renamed from: f */
        public Parameters a() {
            return new Parameters(this.f5326e, this.f5327f, this.f5328g, this.f5329h, this.f5330i, this.f5331j, this.f5332k, this.f5333l, this.f5334m, this.f5335n, this.f5347a, this.f5336o, this.f5337p, this.f5338q, this.f5339r, this.f5340s, this.f5348b, this.f5349c, this.f5350d, this.f5341t, this.f5342u, this.f5343v, this.f5344w, this.f5345x, this.f5346y);
        }

        public final d g(int i10, TrackGroupArray trackGroupArray) {
            Map map = this.f5345x.get(i10);
            if (map != null && map.containsKey(trackGroupArray)) {
                map.remove(trackGroupArray);
                if (map.isEmpty()) {
                    this.f5345x.remove(i10);
                }
            }
            return this;
        }

        public final d h() {
            if (this.f5345x.size() == 0) {
                return this;
            }
            this.f5345x.clear();
            return this;
        }

        public final d i(int i10) {
            Map map = this.f5345x.get(i10);
            if (map != null && !map.isEmpty()) {
                this.f5345x.remove(i10);
            }
            return this;
        }

        public d j() {
            return C(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }

        public d k() {
            return K(Integer.MAX_VALUE, Integer.MAX_VALUE, true);
        }

        public d m(boolean z10) {
            this.f5339r = z10;
            return this;
        }

        public d n(boolean z10) {
            this.f5340s = z10;
            return this;
        }

        @Deprecated
        public d o(boolean z10) {
            m(z10);
            q(z10);
            return this;
        }

        @Deprecated
        public d p(boolean z10) {
            return r(z10);
        }

        public d q(boolean z10) {
            this.f5331j = z10;
            return this;
        }

        public d r(boolean z10) {
            this.f5332k = z10;
            return this;
        }

        /* renamed from: s */
        public d b(int i10) {
            super.b(i10);
            return this;
        }

        public d t(boolean z10) {
            this.f5338q = z10;
            return this;
        }

        public d u(boolean z10) {
            this.f5343v = z10;
            return this;
        }

        public d v(boolean z10) {
            this.f5330i = z10;
            return this;
        }

        public d w(boolean z10) {
            this.f5342u = z10;
            return this;
        }

        public d x(boolean z10) {
            this.f5341t = z10;
            return this;
        }

        public d y(int i10) {
            this.f5337p = i10;
            return this;
        }

        public d z(int i10) {
            this.f5336o = i10;
            return this;
        }
    }

    public DefaultTrackSelector() {
        this((f.b) new a.d());
    }

    public DefaultTrackSelector(f.b bVar) {
        this.f5303d = bVar;
        this.f5304e = new AtomicReference<>(Parameters.f5306q0);
    }

    @Deprecated
    public DefaultTrackSelector(t7.d dVar) {
        this((f.b) new a.d(dVar));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000d, code lost:
        if (r1 != r3) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Point A(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto L_0x0010
            r3 = 1
            r0 = 0
            if (r6 <= r7) goto L_0x0008
            r1 = r3
            goto L_0x0009
        L_0x0008:
            r1 = r0
        L_0x0009:
            if (r4 <= r5) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r3 = r0
        L_0x000d:
            if (r1 == r3) goto L_0x0010
            goto L_0x0013
        L_0x0010:
            r2 = r5
            r5 = r4
            r4 = r2
        L_0x0013:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L_0x0023
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = w7.q0.n(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L_0x0023:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = w7.q0.n(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.trackselection.DefaultTrackSelector.A(boolean, int, int, int, int):android.graphics.Point");
    }

    public static List<Integer> E(TrackGroup trackGroup, int i10, int i11, boolean z10) {
        int i12;
        ArrayList arrayList = new ArrayList(trackGroup.O);
        for (int i13 = 0; i13 < trackGroup.O; i13++) {
            arrayList.add(Integer.valueOf(i13));
        }
        if (!(i10 == Integer.MAX_VALUE || i11 == Integer.MAX_VALUE)) {
            int i14 = Integer.MAX_VALUE;
            for (int i15 = 0; i15 < trackGroup.O; i15++) {
                Format a10 = trackGroup.a(i15);
                int i16 = a10.f5069b0;
                if (i16 > 0 && (i12 = a10.f5070c0) > 0) {
                    Point A = A(z10, i10, i11, i16, i12);
                    int i17 = a10.f5069b0;
                    int i18 = a10.f5070c0;
                    int i19 = i17 * i18;
                    if (i17 >= ((int) (((float) A.x) * 0.98f)) && i18 >= ((int) (((float) A.y) * 0.98f)) && i19 < i14) {
                        i14 = i19;
                    }
                }
            }
            if (i14 != Integer.MAX_VALUE) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    int J = trackGroup.a(((Integer) arrayList.get(size)).intValue()).J();
                    if (J == -1 || J > i14) {
                        arrayList.remove(size);
                    }
                }
            }
        }
        return arrayList;
    }

    public static boolean G(int i10, boolean z10) {
        int i11 = i10 & 7;
        return i11 == 4 || (z10 && i11 == 3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
        r2 = r2.f5078k0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean H(com.google.android.exoplayer2.Format r2, int r3, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.b r4, int r5, boolean r6, boolean r7) {
        /*
            r0 = 0
            boolean r3 = G(r3, r0)
            if (r3 == 0) goto L_0x002f
            int r3 = r2.S
            r1 = -1
            if (r3 == r1) goto L_0x000e
            if (r3 > r5) goto L_0x002f
        L_0x000e:
            int r3 = r2.f5077j0
            if (r3 == r1) goto L_0x002f
            int r5 = r4.f5323a
            if (r3 != r5) goto L_0x002f
            if (r6 != 0) goto L_0x0024
            java.lang.String r3 = r2.W
            if (r3 == 0) goto L_0x002f
            java.lang.String r5 = r4.f5325c
            boolean r3 = android.text.TextUtils.equals(r3, r5)
            if (r3 == 0) goto L_0x002f
        L_0x0024:
            if (r7 != 0) goto L_0x002e
            int r2 = r2.f5078k0
            if (r2 == r1) goto L_0x002f
            int r3 = r4.f5324b
            if (r2 != r3) goto L_0x002f
        L_0x002e:
            r0 = 1
        L_0x002f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.trackselection.DefaultTrackSelector.H(com.google.android.exoplayer2.Format, int, com.google.android.exoplayer2.trackselection.DefaultTrackSelector$b, int, boolean, boolean):boolean");
    }

    public static boolean I(Format format, @o0 String str, int i10, int i11, int i12, int i13, int i14, int i15) {
        if (!G(i10, false) || (i10 & i11) == 0) {
            return false;
        }
        if (str != null && !q0.e(format.W, str)) {
            return false;
        }
        int i16 = format.f5069b0;
        if (i16 != -1 && i16 > i12) {
            return false;
        }
        int i17 = format.f5070c0;
        if (i17 != -1 && i17 > i13) {
            return false;
        }
        float f10 = format.f5071d0;
        if (f10 != -1.0f && f10 > ((float) i14)) {
            return false;
        }
        int i18 = format.S;
        return i18 == -1 || i18 <= i15;
    }

    public static void J(d.a aVar, int[][][] iArr, t0[] t0VarArr, f[] fVarArr, int i10) {
        boolean z10;
        if (i10 != 0) {
            boolean z11 = false;
            int i11 = 0;
            int i12 = -1;
            int i13 = -1;
            while (true) {
                if (i11 >= aVar.c()) {
                    z10 = true;
                    break;
                }
                int e10 = aVar.e(i11);
                f fVar = fVarArr[i11];
                if ((e10 == 1 || e10 == 2) && fVar != null && K(iArr[i11], aVar.g(i11), fVar)) {
                    if (e10 == 1) {
                        if (i13 != -1) {
                            break;
                        }
                        i13 = i11;
                    } else if (i12 != -1) {
                        break;
                    } else {
                        i12 = i11;
                    }
                }
                i11++;
            }
            z10 = false;
            if (!(i13 == -1 || i12 == -1)) {
                z11 = true;
            }
            if (z10 && z11) {
                t0 t0Var = new t0(i10);
                t0VarArr[i13] = t0Var;
                t0VarArr[i12] = t0Var;
            }
        }
    }

    public static boolean K(int[][] iArr, TrackGroupArray trackGroupArray, f fVar) {
        if (fVar == null) {
            return false;
        }
        int b10 = trackGroupArray.b(fVar.a());
        for (int i10 = 0; i10 < fVar.length(); i10++) {
            if ((iArr[b10][fVar.h(i10)] & 32) != 32) {
                return false;
            }
        }
        return true;
    }

    @o0
    public static f.a L(TrackGroupArray trackGroupArray, int[][] iArr, int i10, Parameters parameters) {
        TrackGroupArray trackGroupArray2 = trackGroupArray;
        Parameters parameters2 = parameters;
        int i11 = parameters2.Z ? 24 : 16;
        boolean z10 = parameters2.Y && (i10 & i11) != 0;
        int i12 = 0;
        while (i12 < trackGroupArray2.O) {
            TrackGroup a10 = trackGroupArray2.a(i12);
            TrackGroup trackGroup = a10;
            int[] y10 = y(a10, iArr[i12], z10, i11, parameters2.T, parameters2.U, parameters2.V, parameters2.W, parameters2.f5307a0, parameters2.f5308b0, parameters2.f5309c0);
            if (y10.length > 0) {
                return new f.a(trackGroup, y10);
            }
            i12++;
            trackGroupArray2 = trackGroupArray;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0093, code lost:
        if (r0 < 0) goto L_0x0095;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b8  */
    @d.o0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.exoplayer2.trackselection.f.a O(com.google.android.exoplayer2.source.TrackGroupArray r17, int[][] r18, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters r19) {
        /*
            r0 = r17
            r1 = r19
            r3 = -1
            r9 = r3
            r10 = r9
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x000b:
            int r11 = r0.O
            if (r5 >= r11) goto L_0x00d8
            com.google.android.exoplayer2.source.TrackGroup r11 = r0.a(r5)
            int r13 = r1.f5307a0
            int r14 = r1.f5308b0
            boolean r15 = r1.f5309c0
            java.util.List r13 = E(r11, r13, r14, r15)
            r14 = r18[r5]
            r15 = 0
        L_0x0020:
            int r2 = r11.O
            if (r15 >= r2) goto L_0x00cf
            r2 = r14[r15]
            boolean r12 = r1.f5319m0
            boolean r2 = G(r2, r12)
            if (r2 == 0) goto L_0x00c4
            com.google.android.exoplayer2.Format r2 = r11.a(r15)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r15)
            boolean r12 = r13.contains(r12)
            if (r12 == 0) goto L_0x0065
            int r12 = r2.f5069b0
            if (r12 == r3) goto L_0x0044
            int r4 = r1.T
            if (r12 > r4) goto L_0x0065
        L_0x0044:
            int r4 = r2.f5070c0
            if (r4 == r3) goto L_0x004c
            int r12 = r1.U
            if (r4 > r12) goto L_0x0065
        L_0x004c:
            float r4 = r2.f5071d0
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r12 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r12 == 0) goto L_0x005b
            int r12 = r1.V
            float r12 = (float) r12
            int r4 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r4 > 0) goto L_0x0065
        L_0x005b:
            int r4 = r2.S
            if (r4 == r3) goto L_0x0063
            int r12 = r1.W
            if (r4 > r12) goto L_0x0065
        L_0x0063:
            r4 = 1
            goto L_0x0066
        L_0x0065:
            r4 = 0
        L_0x0066:
            if (r4 != 0) goto L_0x006e
            boolean r12 = r1.X
            if (r12 != 0) goto L_0x006e
            goto L_0x00c4
        L_0x006e:
            if (r4 == 0) goto L_0x0072
            r12 = 2
            goto L_0x0073
        L_0x0072:
            r12 = 1
        L_0x0073:
            r3 = r14[r15]
            r0 = 0
            boolean r3 = G(r3, r0)
            if (r3 == 0) goto L_0x007e
            int r12 = r12 + 1000
        L_0x007e:
            if (r12 <= r8) goto L_0x0082
            r0 = 1
            goto L_0x0083
        L_0x0082:
            r0 = 0
        L_0x0083:
            if (r12 != r8) goto L_0x00b4
            int r0 = r2.S
            int r0 = q(r0, r9)
            r16 = r6
            boolean r6 = r1.f5315i0
            if (r6 == 0) goto L_0x0099
            if (r0 == 0) goto L_0x0099
            if (r0 >= 0) goto L_0x0097
        L_0x0095:
            r0 = 1
            goto L_0x00b6
        L_0x0097:
            r0 = 0
            goto L_0x00b6
        L_0x0099:
            int r0 = r2.J()
            if (r0 == r10) goto L_0x00a4
            int r0 = q(r0, r10)
            goto L_0x00aa
        L_0x00a4:
            int r0 = r2.S
            int r0 = q(r0, r9)
        L_0x00aa:
            if (r3 == 0) goto L_0x00b1
            if (r4 == 0) goto L_0x00b1
            if (r0 <= 0) goto L_0x0097
            goto L_0x0095
        L_0x00b1:
            if (r0 >= 0) goto L_0x0097
            goto L_0x0095
        L_0x00b4:
            r16 = r6
        L_0x00b6:
            if (r0 == 0) goto L_0x00c6
            int r0 = r2.S
            int r2 = r2.J()
            r9 = r0
            r10 = r2
            r6 = r11
            r8 = r12
            r7 = r15
            goto L_0x00c8
        L_0x00c4:
            r16 = r6
        L_0x00c6:
            r6 = r16
        L_0x00c8:
            int r15 = r15 + 1
            r0 = r17
            r3 = -1
            goto L_0x0020
        L_0x00cf:
            r16 = r6
            int r5 = r5 + 1
            r0 = r17
            r3 = -1
            goto L_0x000b
        L_0x00d8:
            if (r6 != 0) goto L_0x00dc
            r2 = 0
            goto L_0x00e7
        L_0x00dc:
            com.google.android.exoplayer2.trackselection.f$a r2 = new com.google.android.exoplayer2.trackselection.f$a
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r0[r1] = r7
            r2.<init>(r6, r0)
        L_0x00e7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.trackselection.DefaultTrackSelector.O(com.google.android.exoplayer2.source.TrackGroupArray, int[][], com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters):com.google.android.exoplayer2.trackselection.f$a");
    }

    public static boolean X(@o0 String str) {
        return TextUtils.isEmpty(str) || TextUtils.equals(str, "und");
    }

    public static int q(int i10, int i11) {
        if (i10 == -1) {
            return i11 == -1 ? 0 : -1;
        }
        if (i11 == -1) {
            return 1;
        }
        return i10 - i11;
    }

    public static int r(int i10, int i11) {
        if (i10 > i11) {
            return 1;
        }
        return i11 > i10 ? -1 : 0;
    }

    public static void t(TrackGroup trackGroup, int[] iArr, int i10, @o0 String str, int i11, int i12, int i13, int i14, List<Integer> list) {
        List<Integer> list2 = list;
        for (int size = list.size() - 1; size >= 0; size--) {
            int intValue = list2.get(size).intValue();
            TrackGroup trackGroup2 = trackGroup;
            if (!I(trackGroup.a(intValue), str, iArr[intValue], i10, i11, i12, i13, i14)) {
                list2.remove(size);
            }
        }
    }

    public static boolean u(Format format) {
        return X(format.f5082o0);
    }

    public static int v(TrackGroup trackGroup, int[] iArr, b bVar, int i10, boolean z10, boolean z11) {
        int i11 = 0;
        for (int i12 = 0; i12 < trackGroup.O; i12++) {
            if (H(trackGroup.a(i12), iArr[i12], bVar, i10, z10, z11)) {
                i11++;
            }
        }
        return i11;
    }

    public static int[] w(TrackGroup trackGroup, int[] iArr, int i10, boolean z10, boolean z11) {
        int v10;
        TrackGroup trackGroup2 = trackGroup;
        HashSet hashSet = new HashSet();
        b bVar = null;
        int i11 = 0;
        for (int i12 = 0; i12 < trackGroup2.O; i12++) {
            Format a10 = trackGroup2.a(i12);
            b bVar2 = new b(a10.f5077j0, a10.f5078k0, a10.W);
            if (hashSet.add(bVar2) && (v10 = v(trackGroup, iArr, bVar2, i10, z10, z11)) > i11) {
                i11 = v10;
                bVar = bVar2;
            }
        }
        if (i11 <= 1) {
            return f5301h;
        }
        w7.a.g(bVar);
        int[] iArr2 = new int[i11];
        int i13 = 0;
        for (int i14 = 0; i14 < trackGroup2.O; i14++) {
            if (H(trackGroup2.a(i14), iArr[i14], bVar, i10, z10, z11)) {
                iArr2[i13] = i14;
                i13++;
            }
        }
        return iArr2;
    }

    public static int x(TrackGroup trackGroup, int[] iArr, int i10, @o0 String str, int i11, int i12, int i13, int i14, List<Integer> list) {
        int i15 = 0;
        for (int i16 = 0; i16 < list.size(); i16++) {
            int intValue = list.get(i16).intValue();
            TrackGroup trackGroup2 = trackGroup;
            if (I(trackGroup.a(intValue), str, iArr[intValue], i10, i11, i12, i13, i14)) {
                i15++;
            }
        }
        return i15;
    }

    public static int[] y(TrackGroup trackGroup, int[] iArr, boolean z10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z11) {
        String str;
        TrackGroup trackGroup2 = trackGroup;
        if (trackGroup2.O < 2) {
            return f5301h;
        }
        List<Integer> E = E(trackGroup2, i15, i16, z11);
        if (E.size() < 2) {
            return f5301h;
        }
        if (!z10) {
            HashSet hashSet = new HashSet();
            String str2 = null;
            int i17 = 0;
            for (int i18 = 0; i18 < E.size(); i18++) {
                String str3 = trackGroup2.a(E.get(i18).intValue()).W;
                if (hashSet.add(str3)) {
                    String str4 = str3;
                    int x10 = x(trackGroup, iArr, i10, str3, i11, i12, i13, i14, E);
                    if (x10 > i17) {
                        i17 = x10;
                        str2 = str4;
                    }
                }
            }
            str = str2;
        } else {
            str = null;
        }
        t(trackGroup, iArr, i10, str, i11, i12, i13, i14, E);
        return E.size() < 2 ? f5301h : q0.W0(E);
    }

    public static int z(Format format, @o0 String str) {
        String str2 = format.f5082o0;
        if (str2 == null || str == null) {
            return 0;
        }
        if (TextUtils.equals(str2, str)) {
            return 3;
        }
        if (format.f5082o0.startsWith(str) || str.startsWith(format.f5082o0)) {
            return 2;
        }
        return q0.S0(format.f5082o0, "-")[0].equals(q0.S0(str, "-")[0]) ? 1 : 0;
    }

    public Parameters B() {
        return this.f5304e.get();
    }

    @Deprecated
    public final boolean C(int i10) {
        return B().h(i10);
    }

    @o0
    @Deprecated
    public final SelectionOverride D(int i10, TrackGroupArray trackGroupArray) {
        return B().j(i10, trackGroupArray);
    }

    @Deprecated
    public final boolean F(int i10, TrackGroupArray trackGroupArray) {
        return B().l(i10, trackGroupArray);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: com.google.android.exoplayer2.trackselection.DefaultTrackSelector$c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.exoplayer2.trackselection.f.a[] M(com.google.android.exoplayer2.trackselection.d.a r22, int[][][] r23, int[] r24, com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters r25) throws b6.i {
        /*
            r21 = this;
            r6 = r21
            r7 = r22
            r8 = r25
            int r9 = r22.c()
            com.google.android.exoplayer2.trackselection.f$a[] r10 = new com.google.android.exoplayer2.trackselection.f.a[r9]
            r11 = 0
            r0 = r11
            r12 = r0
            r13 = r12
        L_0x0010:
            r14 = 2
            r15 = 1
            if (r12 >= r9) goto L_0x0042
            int r1 = r7.e(r12)
            if (r14 != r1) goto L_0x003f
            if (r0 != 0) goto L_0x0034
            com.google.android.exoplayer2.source.TrackGroupArray r1 = r7.g(r12)
            r2 = r23[r12]
            r3 = r24[r12]
            r5 = 1
            r0 = r21
            r4 = r25
            com.google.android.exoplayer2.trackselection.f$a r0 = r0.R(r1, r2, r3, r4, r5)
            r10[r12] = r0
            if (r0 == 0) goto L_0x0033
            r0 = r15
            goto L_0x0034
        L_0x0033:
            r0 = r11
        L_0x0034:
            com.google.android.exoplayer2.source.TrackGroupArray r1 = r7.g(r12)
            int r1 = r1.O
            if (r1 <= 0) goto L_0x003d
            goto L_0x003e
        L_0x003d:
            r15 = r11
        L_0x003e:
            r13 = r13 | r15
        L_0x003f:
            int r12 = r12 + 1
            goto L_0x0010
        L_0x0042:
            r12 = -1
            r16 = 0
            r5 = r11
            r2 = r12
            r3 = r16
            r4 = r3
        L_0x004a:
            if (r5 >= r9) goto L_0x00b5
            int r0 = r7.e(r5)
            if (r15 != r0) goto L_0x00a6
            boolean r0 = r6.f5305f
            if (r0 != 0) goto L_0x005c
            if (r13 != 0) goto L_0x0059
            goto L_0x005c
        L_0x0059:
            r17 = r11
            goto L_0x005e
        L_0x005c:
            r17 = r15
        L_0x005e:
            com.google.android.exoplayer2.source.TrackGroupArray r1 = r7.g(r5)
            r18 = r23[r5]
            r19 = r24[r5]
            r0 = r21
            r14 = r2
            r2 = r18
            r15 = r3
            r3 = r19
            r20 = r4
            r4 = r25
            r19 = r5
            r5 = r17
            android.util.Pair r0 = r0.N(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x00ac
            if (r15 == 0) goto L_0x0088
            java.lang.Object r1 = r0.second
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$c r1 = (com.google.android.exoplayer2.trackselection.DefaultTrackSelector.c) r1
            int r1 = r1.compareTo(r15)
            if (r1 <= 0) goto L_0x00ac
        L_0x0088:
            if (r14 == r12) goto L_0x008c
            r10[r14] = r16
        L_0x008c:
            java.lang.Object r1 = r0.first
            com.google.android.exoplayer2.trackselection.f$a r1 = (com.google.android.exoplayer2.trackselection.f.a) r1
            r10[r19] = r1
            com.google.android.exoplayer2.source.TrackGroup r2 = r1.f5442a
            int[] r1 = r1.f5443b
            r1 = r1[r11]
            com.google.android.exoplayer2.Format r1 = r2.a(r1)
            java.lang.String r4 = r1.f5082o0
            java.lang.Object r0 = r0.second
            r3 = r0
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$c r3 = (com.google.android.exoplayer2.trackselection.DefaultTrackSelector.c) r3
            r2 = r19
            goto L_0x00b0
        L_0x00a6:
            r14 = r2
            r15 = r3
            r20 = r4
            r19 = r5
        L_0x00ac:
            r2 = r14
            r3 = r15
            r4 = r20
        L_0x00b0:
            int r5 = r19 + 1
            r14 = 2
            r15 = 1
            goto L_0x004a
        L_0x00b5:
            r20 = r4
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r12
        L_0x00ba:
            if (r11 >= r9) goto L_0x010d
            int r2 = r7.e(r11)
            r3 = 1
            if (r2 == r3) goto L_0x0105
            r4 = 2
            if (r2 == r4) goto L_0x0102
            r5 = 3
            if (r2 == r5) goto L_0x00d6
            com.google.android.exoplayer2.source.TrackGroupArray r5 = r7.g(r11)
            r13 = r23[r11]
            com.google.android.exoplayer2.trackselection.f$a r2 = r6.P(r2, r5, r13, r8)
            r10[r11] = r2
            goto L_0x0102
        L_0x00d6:
            com.google.android.exoplayer2.source.TrackGroupArray r2 = r7.g(r11)
            r5 = r23[r11]
            r13 = r20
            android.util.Pair r2 = r6.Q(r2, r5, r8, r13)
            if (r2 == 0) goto L_0x0108
            java.lang.Object r5 = r2.second
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            if (r5 <= r0) goto L_0x0108
            if (r1 == r12) goto L_0x00f2
            r10[r1] = r16
        L_0x00f2:
            java.lang.Object r0 = r2.first
            com.google.android.exoplayer2.trackselection.f$a r0 = (com.google.android.exoplayer2.trackselection.f.a) r0
            r10[r11] = r0
            java.lang.Object r0 = r2.second
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1 = r11
            goto L_0x0108
        L_0x0102:
            r13 = r20
            goto L_0x0108
        L_0x0105:
            r13 = r20
            r4 = 2
        L_0x0108:
            int r11 = r11 + 1
            r20 = r13
            goto L_0x00ba
        L_0x010d:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.trackselection.DefaultTrackSelector.M(com.google.android.exoplayer2.trackselection.d$a, int[][][], int[], com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters):com.google.android.exoplayer2.trackselection.f$a[]");
    }

    @o0
    public Pair<f.a, c> N(TrackGroupArray trackGroupArray, int[][] iArr, int i10, Parameters parameters, boolean z10) throws i {
        TrackGroupArray trackGroupArray2 = trackGroupArray;
        Parameters parameters2 = parameters;
        f.a aVar = null;
        c cVar = null;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < trackGroupArray2.O; i13++) {
            TrackGroup a10 = trackGroupArray2.a(i13);
            int[] iArr2 = iArr[i13];
            for (int i14 = 0; i14 < a10.O; i14++) {
                if (G(iArr2[i14], parameters2.f5319m0)) {
                    c cVar2 = new c(a10.a(i14), parameters2, iArr2[i14]);
                    if ((cVar2.O || parameters2.f5312f0) && (cVar == null || cVar2.compareTo(cVar) > 0)) {
                        i11 = i13;
                        i12 = i14;
                        cVar = cVar2;
                    }
                }
            }
        }
        if (i11 == -1) {
            return null;
        }
        TrackGroup a11 = trackGroupArray2.a(i11);
        if (!parameters2.f5316j0 && !parameters2.f5315i0 && z10) {
            int[] w10 = w(a11, iArr[i11], parameters2.f5311e0, parameters2.f5313g0, parameters2.f5314h0);
            if (w10.length > 0) {
                aVar = new f.a(a11, w10);
            }
        }
        if (aVar == null) {
            aVar = new f.a(a11, i12);
        }
        return Pair.create(aVar, w7.a.g(cVar));
    }

    @o0
    public f.a P(int i10, TrackGroupArray trackGroupArray, int[][] iArr, Parameters parameters) throws i {
        TrackGroup trackGroup = null;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < trackGroupArray.O; i13++) {
            TrackGroup a10 = trackGroupArray.a(i13);
            int[] iArr2 = iArr[i13];
            for (int i14 = 0; i14 < a10.O; i14++) {
                if (G(iArr2[i14], parameters.f5319m0)) {
                    int i15 = (a10.a(i14).Q & 1) != 0 ? 2 : 1;
                    if (G(iArr2[i14], false)) {
                        i15 += 1000;
                    }
                    if (i15 > i12) {
                        trackGroup = a10;
                        i11 = i14;
                        i12 = i15;
                    }
                }
            }
        }
        if (trackGroup == null) {
            return null;
        }
        return new f.a(trackGroup, i11);
    }

    @o0
    public Pair<f.a, Integer> Q(TrackGroupArray trackGroupArray, int[][] iArr, Parameters parameters, @o0 String str) throws i {
        int i10;
        TrackGroupArray trackGroupArray2 = trackGroupArray;
        Parameters parameters2 = parameters;
        int i11 = 0;
        int i12 = 0;
        TrackGroup trackGroup = null;
        for (int i13 = 0; i13 < trackGroupArray2.O; i13++) {
            TrackGroup a10 = trackGroupArray2.a(i13);
            int[] iArr2 = iArr[i13];
            for (int i14 = 0; i14 < a10.O; i14++) {
                if (G(iArr2[i14], parameters2.f5319m0)) {
                    Format a11 = a10.a(i14);
                    int i15 = a11.Q & (~parameters2.R);
                    boolean z10 = (i15 & 1) != 0;
                    boolean z11 = (i15 & 2) != 0;
                    int z12 = z(a11, parameters2.P);
                    boolean u10 = u(a11);
                    if (z12 > 0 || (parameters2.Q && u10)) {
                        String str2 = str;
                        i10 = (z10 ? 11 : !z11 ? 7 : 3) + z12;
                    } else if (z10) {
                        i10 = 2;
                        String str3 = str;
                    } else if (z11) {
                        if (z(a11, str) > 0 || (u10 && X(str))) {
                            i10 = 1;
                        }
                    }
                    if (G(iArr2[i14], false)) {
                        i10 += 1000;
                    }
                    if (i10 > i12) {
                        trackGroup = a10;
                        i11 = i14;
                        i12 = i10;
                    }
                }
                String str4 = str;
            }
            String str5 = str;
        }
        if (trackGroup == null) {
            return null;
        }
        return Pair.create(new f.a(trackGroup, i11), Integer.valueOf(i12));
    }

    @o0
    public f.a R(TrackGroupArray trackGroupArray, int[][] iArr, int i10, Parameters parameters, boolean z10) throws i {
        f.a L = (parameters.f5316j0 || parameters.f5315i0 || !z10) ? null : L(trackGroupArray, iArr, i10, parameters);
        return L == null ? O(trackGroupArray, iArr, parameters) : L;
    }

    public void S(Parameters parameters) {
        w7.a.g(parameters);
        if (!this.f5304e.getAndSet(parameters).equals(parameters)) {
            c();
        }
    }

    public void T(d dVar) {
        S(dVar.a());
    }

    @Deprecated
    public final void U(int i10, boolean z10) {
        T(m().G(i10, z10));
    }

    @Deprecated
    public final void V(int i10, TrackGroupArray trackGroupArray, SelectionOverride selectionOverride) {
        T(m().I(i10, trackGroupArray, selectionOverride));
    }

    @Deprecated
    public void W(int i10) {
        T(m().J(i10));
    }

    public final Pair<t0[], f[]> j(d.a aVar, int[][][] iArr, int[] iArr2) throws i {
        Parameters parameters = this.f5304e.get();
        int c10 = aVar.c();
        f.a[] M = M(aVar, iArr, iArr2, parameters);
        int i10 = 0;
        while (true) {
            f.a aVar2 = null;
            if (i10 >= c10) {
                break;
            }
            if (parameters.h(i10)) {
                M[i10] = null;
            } else {
                TrackGroupArray g10 = aVar.g(i10);
                if (parameters.l(i10, g10)) {
                    SelectionOverride j10 = parameters.j(i10, g10);
                    if (j10 != null) {
                        aVar2 = new f.a(g10.a(j10.O), j10.P, j10.R, Integer.valueOf(j10.S));
                    }
                    M[i10] = aVar2;
                }
            }
            i10++;
        }
        f[] a10 = this.f5303d.a(M, a());
        t0[] t0VarArr = new t0[c10];
        for (int i11 = 0; i11 < c10; i11++) {
            t0VarArr[i11] = !parameters.h(i11) && (aVar.e(i11) == 6 || a10[i11] != null) ? t0.f4468b : null;
        }
        J(aVar, iArr, t0VarArr, a10, parameters.f5320n0);
        return Pair.create(t0VarArr, a10);
    }

    public d m() {
        return B().a();
    }

    @Deprecated
    public final void n(int i10, TrackGroupArray trackGroupArray) {
        T(m().g(i10, trackGroupArray));
    }

    @Deprecated
    public final void o() {
        T(m().h());
    }

    @Deprecated
    public final void p(int i10) {
        T(m().i(i10));
    }

    public void s() {
        this.f5305f = true;
    }
}
