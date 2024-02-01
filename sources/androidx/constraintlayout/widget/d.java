package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import androidx.constraintlayout.widget.a;
import androidx.constraintlayout.widget.e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.xmlpull.v1.XmlPullParserException;
import w7.l;
import z.j;

public class d {
    public static final int A = 0;
    public static final int A0 = 44;
    public static final int B = 1;
    public static final int B0 = 45;
    public static final int C = 0;
    public static final int C0 = 46;
    public static final int D = 1;
    public static final int D0 = 47;
    public static final int E = 2;
    public static final int E0 = 48;
    public static final boolean F = false;
    public static final int F0 = 49;
    public static final int[] G = {0, 4, 8};
    public static final int G0 = 50;
    public static final int H = 1;
    public static final int H0 = 51;
    public static SparseIntArray I = null;
    public static final int I0 = 52;
    public static final int J = 1;
    public static final int J0 = 53;
    public static final int K = 2;
    public static final int K0 = 54;
    public static final int L = 3;
    public static final int L0 = 55;
    public static final int M = 4;
    public static final int M0 = 56;
    public static final int N = 5;
    public static final int N0 = 57;
    public static final int O = 6;
    public static final int O0 = 58;
    public static final int P = 7;
    public static final int P0 = 59;
    public static final int Q = 8;
    public static final int Q0 = 60;
    public static final int R = 9;
    public static final int R0 = 61;
    public static final int S = 10;
    public static final int S0 = 62;
    public static final int T = 11;
    public static final int T0 = 63;
    public static final int U = 12;
    public static final int U0 = 64;
    public static final int V = 13;
    public static final int V0 = 65;
    public static final int W = 14;
    public static final int W0 = 66;
    public static final int X = 15;
    public static final int X0 = 67;
    public static final int Y = 16;
    public static final int Y0 = 68;
    public static final int Z = 17;
    public static final int Z0 = 69;

    /* renamed from: a0  reason: collision with root package name */
    public static final int f1931a0 = 18;

    /* renamed from: a1  reason: collision with root package name */
    public static final int f1932a1 = 70;

    /* renamed from: b0  reason: collision with root package name */
    public static final int f1933b0 = 19;

    /* renamed from: b1  reason: collision with root package name */
    public static final int f1934b1 = 71;

    /* renamed from: c0  reason: collision with root package name */
    public static final int f1935c0 = 20;

    /* renamed from: c1  reason: collision with root package name */
    public static final int f1936c1 = 72;

    /* renamed from: d0  reason: collision with root package name */
    public static final int f1937d0 = 21;

    /* renamed from: d1  reason: collision with root package name */
    public static final int f1938d1 = 73;

    /* renamed from: e  reason: collision with root package name */
    public static final String f1939e = "ConstraintSet";

    /* renamed from: e0  reason: collision with root package name */
    public static final int f1940e0 = 22;

    /* renamed from: e1  reason: collision with root package name */
    public static final int f1941e1 = 74;

    /* renamed from: f  reason: collision with root package name */
    public static final String f1942f = "XML parser error must be within a Constraint ";

    /* renamed from: f0  reason: collision with root package name */
    public static final int f1943f0 = 23;

    /* renamed from: f1  reason: collision with root package name */
    public static final int f1944f1 = 75;

    /* renamed from: g  reason: collision with root package name */
    public static final int f1945g = -1;

    /* renamed from: g0  reason: collision with root package name */
    public static final int f1946g0 = 24;

    /* renamed from: g1  reason: collision with root package name */
    public static final int f1947g1 = 76;

    /* renamed from: h  reason: collision with root package name */
    public static final int f1948h = 0;

    /* renamed from: h0  reason: collision with root package name */
    public static final int f1949h0 = 25;

    /* renamed from: h1  reason: collision with root package name */
    public static final int f1950h1 = 77;

    /* renamed from: i  reason: collision with root package name */
    public static final int f1951i = -2;

    /* renamed from: i0  reason: collision with root package name */
    public static final int f1952i0 = 26;

    /* renamed from: i1  reason: collision with root package name */
    public static final int f1953i1 = 78;

    /* renamed from: j  reason: collision with root package name */
    public static final int f1954j = 1;

    /* renamed from: j0  reason: collision with root package name */
    public static final int f1955j0 = 27;

    /* renamed from: j1  reason: collision with root package name */
    public static final int f1956j1 = 79;

    /* renamed from: k  reason: collision with root package name */
    public static final int f1957k = 0;

    /* renamed from: k0  reason: collision with root package name */
    public static final int f1958k0 = 28;

    /* renamed from: k1  reason: collision with root package name */
    public static final int f1959k1 = 80;

    /* renamed from: l  reason: collision with root package name */
    public static final int f1960l = 0;

    /* renamed from: l0  reason: collision with root package name */
    public static final int f1961l0 = 29;

    /* renamed from: l1  reason: collision with root package name */
    public static final int f1962l1 = 81;

    /* renamed from: m  reason: collision with root package name */
    public static final int f1963m = 0;

    /* renamed from: m0  reason: collision with root package name */
    public static final int f1964m0 = 30;

    /* renamed from: m1  reason: collision with root package name */
    public static final int f1965m1 = 82;

    /* renamed from: n  reason: collision with root package name */
    public static final int f1966n = 1;

    /* renamed from: n0  reason: collision with root package name */
    public static final int f1967n0 = 31;

    /* renamed from: o  reason: collision with root package name */
    public static final int f1968o = 0;

    /* renamed from: o0  reason: collision with root package name */
    public static final int f1969o0 = 32;

    /* renamed from: p  reason: collision with root package name */
    public static final int f1970p = 1;

    /* renamed from: p0  reason: collision with root package name */
    public static final int f1971p0 = 33;

    /* renamed from: q  reason: collision with root package name */
    public static final int f1972q = 0;

    /* renamed from: q0  reason: collision with root package name */
    public static final int f1973q0 = 34;

    /* renamed from: r  reason: collision with root package name */
    public static final int f1974r = 4;

    /* renamed from: r0  reason: collision with root package name */
    public static final int f1975r0 = 35;

    /* renamed from: s  reason: collision with root package name */
    public static final int f1976s = 8;

    /* renamed from: s0  reason: collision with root package name */
    public static final int f1977s0 = 36;

    /* renamed from: t  reason: collision with root package name */
    public static final int f1978t = 1;

    /* renamed from: t0  reason: collision with root package name */
    public static final int f1979t0 = 37;

    /* renamed from: u  reason: collision with root package name */
    public static final int f1980u = 2;

    /* renamed from: u0  reason: collision with root package name */
    public static final int f1981u0 = 38;

    /* renamed from: v  reason: collision with root package name */
    public static final int f1982v = 3;

    /* renamed from: v0  reason: collision with root package name */
    public static final int f1983v0 = 39;

    /* renamed from: w  reason: collision with root package name */
    public static final int f1984w = 4;

    /* renamed from: w0  reason: collision with root package name */
    public static final int f1985w0 = 40;

    /* renamed from: x  reason: collision with root package name */
    public static final int f1986x = 5;

    /* renamed from: x0  reason: collision with root package name */
    public static final int f1987x0 = 41;

    /* renamed from: y  reason: collision with root package name */
    public static final int f1988y = 6;

    /* renamed from: y0  reason: collision with root package name */
    public static final int f1989y0 = 42;

    /* renamed from: z  reason: collision with root package name */
    public static final int f1990z = 7;

    /* renamed from: z0  reason: collision with root package name */
    public static final int f1991z0 = 43;

    /* renamed from: a  reason: collision with root package name */
    public boolean f1992a;

    /* renamed from: b  reason: collision with root package name */
    public HashMap<String, a> f1993b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public boolean f1994c = true;

    /* renamed from: d  reason: collision with root package name */
    public HashMap<Integer, a> f1995d = new HashMap<>();

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f1996a;

        /* renamed from: b  reason: collision with root package name */
        public final C0030d f1997b = new C0030d();

        /* renamed from: c  reason: collision with root package name */
        public final c f1998c = new c();

        /* renamed from: d  reason: collision with root package name */
        public final b f1999d = new b();

        /* renamed from: e  reason: collision with root package name */
        public final e f2000e = new e();

        /* renamed from: f  reason: collision with root package name */
        public HashMap<String, a> f2001f = new HashMap<>();

        public void h(ConstraintLayout.b bVar) {
            b bVar2 = this.f1999d;
            bVar.f1815d = bVar2.f2043h;
            bVar.f1817e = bVar2.f2045i;
            bVar.f1819f = bVar2.f2047j;
            bVar.f1821g = bVar2.f2049k;
            bVar.f1823h = bVar2.f2050l;
            bVar.f1825i = bVar2.f2051m;
            bVar.f1827j = bVar2.f2052n;
            bVar.f1829k = bVar2.f2053o;
            bVar.f1831l = bVar2.f2054p;
            bVar.f1839p = bVar2.f2055q;
            bVar.f1840q = bVar2.f2056r;
            bVar.f1841r = bVar2.f2057s;
            bVar.f1842s = bVar2.f2058t;
            bVar.leftMargin = bVar2.D;
            bVar.rightMargin = bVar2.E;
            bVar.topMargin = bVar2.F;
            bVar.bottomMargin = bVar2.G;
            bVar.f1847x = bVar2.O;
            bVar.f1848y = bVar2.N;
            bVar.f1844u = bVar2.K;
            bVar.f1846w = bVar2.M;
            bVar.f1849z = bVar2.f2059u;
            bVar.A = bVar2.f2060v;
            bVar.f1833m = bVar2.f2062x;
            bVar.f1835n = bVar2.f2063y;
            bVar.f1837o = bVar2.f2064z;
            bVar.B = bVar2.f2061w;
            bVar.Q = bVar2.A;
            bVar.R = bVar2.B;
            bVar.F = bVar2.P;
            bVar.E = bVar2.Q;
            bVar.H = bVar2.S;
            bVar.G = bVar2.R;
            bVar.T = bVar2.f2044h0;
            bVar.U = bVar2.f2046i0;
            bVar.I = bVar2.T;
            bVar.J = bVar2.U;
            bVar.M = bVar2.V;
            bVar.N = bVar2.W;
            bVar.K = bVar2.X;
            bVar.L = bVar2.Y;
            bVar.O = bVar2.Z;
            bVar.P = bVar2.f2030a0;
            bVar.S = bVar2.C;
            bVar.f1813c = bVar2.f2041g;
            bVar.f1809a = bVar2.f2037e;
            bVar.f1811b = bVar2.f2039f;
            bVar.width = bVar2.f2033c;
            bVar.height = bVar2.f2035d;
            String str = bVar2.f2042g0;
            if (str != null) {
                bVar.V = str;
            }
            bVar.setMarginStart(bVar2.I);
            bVar.setMarginEnd(this.f1999d.H);
            bVar.e();
        }

        /* renamed from: i */
        public a clone() {
            a aVar = new a();
            aVar.f1999d.a(this.f1999d);
            aVar.f1998c.a(this.f1998c);
            aVar.f1997b.a(this.f1997b);
            aVar.f2000e.a(this.f2000e);
            aVar.f1996a = this.f1996a;
            return aVar;
        }

        public final void j(int i10, ConstraintLayout.b bVar) {
            this.f1996a = i10;
            b bVar2 = this.f1999d;
            bVar2.f2043h = bVar.f1815d;
            bVar2.f2045i = bVar.f1817e;
            bVar2.f2047j = bVar.f1819f;
            bVar2.f2049k = bVar.f1821g;
            bVar2.f2050l = bVar.f1823h;
            bVar2.f2051m = bVar.f1825i;
            bVar2.f2052n = bVar.f1827j;
            bVar2.f2053o = bVar.f1829k;
            bVar2.f2054p = bVar.f1831l;
            bVar2.f2055q = bVar.f1839p;
            bVar2.f2056r = bVar.f1840q;
            bVar2.f2057s = bVar.f1841r;
            bVar2.f2058t = bVar.f1842s;
            bVar2.f2059u = bVar.f1849z;
            bVar2.f2060v = bVar.A;
            bVar2.f2061w = bVar.B;
            bVar2.f2062x = bVar.f1833m;
            bVar2.f2063y = bVar.f1835n;
            bVar2.f2064z = bVar.f1837o;
            bVar2.A = bVar.Q;
            bVar2.B = bVar.R;
            bVar2.C = bVar.S;
            bVar2.f2041g = bVar.f1813c;
            bVar2.f2037e = bVar.f1809a;
            bVar2.f2039f = bVar.f1811b;
            bVar2.f2033c = bVar.width;
            bVar2.f2035d = bVar.height;
            bVar2.D = bVar.leftMargin;
            bVar2.E = bVar.rightMargin;
            bVar2.F = bVar.topMargin;
            bVar2.G = bVar.bottomMargin;
            bVar2.P = bVar.F;
            bVar2.Q = bVar.E;
            bVar2.S = bVar.H;
            bVar2.R = bVar.G;
            bVar2.f2044h0 = bVar.T;
            bVar2.f2046i0 = bVar.U;
            bVar2.T = bVar.I;
            bVar2.U = bVar.J;
            bVar2.V = bVar.M;
            bVar2.W = bVar.N;
            bVar2.X = bVar.K;
            bVar2.Y = bVar.L;
            bVar2.Z = bVar.O;
            bVar2.f2030a0 = bVar.P;
            bVar2.f2042g0 = bVar.V;
            bVar2.K = bVar.f1844u;
            bVar2.M = bVar.f1846w;
            bVar2.J = bVar.f1843t;
            bVar2.L = bVar.f1845v;
            bVar2.O = bVar.f1847x;
            bVar2.N = bVar.f1848y;
            bVar2.H = bVar.getMarginEnd();
            this.f1999d.I = bVar.getMarginStart();
        }

        public final void k(int i10, Constraints.a aVar) {
            j(i10, aVar);
            this.f1997b.f2082d = aVar.H0;
            e eVar = this.f2000e;
            eVar.f2097b = aVar.K0;
            eVar.f2098c = aVar.L0;
            eVar.f2099d = aVar.M0;
            eVar.f2100e = aVar.N0;
            eVar.f2101f = aVar.O0;
            eVar.f2102g = aVar.P0;
            eVar.f2103h = aVar.Q0;
            eVar.f2104i = aVar.R0;
            eVar.f2105j = aVar.S0;
            eVar.f2106k = aVar.T0;
            eVar.f2108m = aVar.J0;
            eVar.f2107l = aVar.I0;
        }

        public final void l(ConstraintHelper constraintHelper, int i10, Constraints.a aVar) {
            k(i10, aVar);
            if (constraintHelper instanceof Barrier) {
                b bVar = this.f1999d;
                bVar.f2036d0 = 1;
                Barrier barrier = (Barrier) constraintHelper;
                bVar.f2032b0 = barrier.getType();
                this.f1999d.f2038e0 = barrier.getReferencedIds();
                this.f1999d.f2034c0 = barrier.getMargin();
            }
        }

        public final a m(String str, a.b bVar) {
            if (this.f2001f.containsKey(str)) {
                a aVar = this.f2001f.get(str);
                if (aVar.d() == bVar) {
                    return aVar;
                }
                throw new IllegalArgumentException("ConstraintAttribute is already a " + aVar.d().name());
            }
            a aVar2 = new a(str, bVar);
            this.f2001f.put(str, aVar2);
            return aVar2;
        }

        public final void n(String str, int i10) {
            m(str, a.b.COLOR_TYPE).j(i10);
        }

        public final void o(String str, float f10) {
            m(str, a.b.FLOAT_TYPE).k(f10);
        }

        public final void p(String str, int i10) {
            m(str, a.b.INT_TYPE).l(i10);
        }

        public final void q(String str, String str2) {
            m(str, a.b.STRING_TYPE).n(str2);
        }
    }

    public static class b {
        public static final int A0 = 15;
        public static final int B0 = 16;
        public static final int C0 = 17;
        public static final int D0 = 18;
        public static final int E0 = 19;
        public static final int F0 = 20;
        public static final int G0 = 21;
        public static final int H0 = 22;
        public static final int I0 = 23;
        public static final int J0 = 24;
        public static final int K0 = 25;
        public static final int L0 = 26;
        public static final int M0 = 27;
        public static final int N0 = 28;
        public static final int O0 = 29;
        public static final int P0 = 30;
        public static final int Q0 = 31;
        public static final int R0 = 32;
        public static final int S0 = 33;
        public static final int T0 = 34;
        public static final int U0 = 35;
        public static final int V0 = 36;
        public static final int W0 = 37;
        public static final int X0 = 38;
        public static final int Y0 = 39;
        public static final int Z0 = 40;

        /* renamed from: a1  reason: collision with root package name */
        public static final int f2002a1 = 61;

        /* renamed from: b1  reason: collision with root package name */
        public static final int f2003b1 = 62;

        /* renamed from: c1  reason: collision with root package name */
        public static final int f2004c1 = 63;

        /* renamed from: d1  reason: collision with root package name */
        public static final int f2005d1 = 69;

        /* renamed from: e1  reason: collision with root package name */
        public static final int f2006e1 = 70;

        /* renamed from: f1  reason: collision with root package name */
        public static final int f2007f1 = 71;

        /* renamed from: g1  reason: collision with root package name */
        public static final int f2008g1 = 72;

        /* renamed from: h1  reason: collision with root package name */
        public static final int f2009h1 = 73;

        /* renamed from: i1  reason: collision with root package name */
        public static final int f2010i1 = 74;

        /* renamed from: j1  reason: collision with root package name */
        public static final int f2011j1 = 75;

        /* renamed from: k0  reason: collision with root package name */
        public static final int f2012k0 = -1;

        /* renamed from: k1  reason: collision with root package name */
        public static final int f2013k1 = 76;

        /* renamed from: l0  reason: collision with root package name */
        public static SparseIntArray f2014l0 = null;

        /* renamed from: m0  reason: collision with root package name */
        public static final int f2015m0 = 1;

        /* renamed from: n0  reason: collision with root package name */
        public static final int f2016n0 = 2;

        /* renamed from: o0  reason: collision with root package name */
        public static final int f2017o0 = 3;

        /* renamed from: p0  reason: collision with root package name */
        public static final int f2018p0 = 4;

        /* renamed from: q0  reason: collision with root package name */
        public static final int f2019q0 = 5;

        /* renamed from: r0  reason: collision with root package name */
        public static final int f2020r0 = 6;

        /* renamed from: s0  reason: collision with root package name */
        public static final int f2021s0 = 7;

        /* renamed from: t0  reason: collision with root package name */
        public static final int f2022t0 = 8;

        /* renamed from: u0  reason: collision with root package name */
        public static final int f2023u0 = 9;

        /* renamed from: v0  reason: collision with root package name */
        public static final int f2024v0 = 10;

        /* renamed from: w0  reason: collision with root package name */
        public static final int f2025w0 = 11;

        /* renamed from: x0  reason: collision with root package name */
        public static final int f2026x0 = 12;

        /* renamed from: y0  reason: collision with root package name */
        public static final int f2027y0 = 13;

        /* renamed from: z0  reason: collision with root package name */
        public static final int f2028z0 = 14;
        public int A = -1;
        public int B = -1;
        public int C = -1;
        public int D = -1;
        public int E = -1;
        public int F = -1;
        public int G = -1;
        public int H = -1;
        public int I = -1;
        public int J = -1;
        public int K = -1;
        public int L = -1;
        public int M = -1;
        public int N = -1;
        public int O = -1;
        public float P = -1.0f;
        public float Q = -1.0f;
        public int R = 0;
        public int S = 0;
        public int T = 0;
        public int U = 0;
        public int V = -1;
        public int W = -1;
        public int X = -1;
        public int Y = -1;
        public float Z = 1.0f;

        /* renamed from: a  reason: collision with root package name */
        public boolean f2029a = false;

        /* renamed from: a0  reason: collision with root package name */
        public float f2030a0 = 1.0f;

        /* renamed from: b  reason: collision with root package name */
        public boolean f2031b = false;

        /* renamed from: b0  reason: collision with root package name */
        public int f2032b0 = -1;

        /* renamed from: c  reason: collision with root package name */
        public int f2033c;

        /* renamed from: c0  reason: collision with root package name */
        public int f2034c0 = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f2035d;

        /* renamed from: d0  reason: collision with root package name */
        public int f2036d0 = -1;

        /* renamed from: e  reason: collision with root package name */
        public int f2037e = -1;

        /* renamed from: e0  reason: collision with root package name */
        public int[] f2038e0;

        /* renamed from: f  reason: collision with root package name */
        public int f2039f = -1;

        /* renamed from: f0  reason: collision with root package name */
        public String f2040f0;

        /* renamed from: g  reason: collision with root package name */
        public float f2041g = -1.0f;

        /* renamed from: g0  reason: collision with root package name */
        public String f2042g0;

        /* renamed from: h  reason: collision with root package name */
        public int f2043h = -1;

        /* renamed from: h0  reason: collision with root package name */
        public boolean f2044h0 = false;

        /* renamed from: i  reason: collision with root package name */
        public int f2045i = -1;

        /* renamed from: i0  reason: collision with root package name */
        public boolean f2046i0 = false;

        /* renamed from: j  reason: collision with root package name */
        public int f2047j = -1;

        /* renamed from: j0  reason: collision with root package name */
        public boolean f2048j0 = true;

        /* renamed from: k  reason: collision with root package name */
        public int f2049k = -1;

        /* renamed from: l  reason: collision with root package name */
        public int f2050l = -1;

        /* renamed from: m  reason: collision with root package name */
        public int f2051m = -1;

        /* renamed from: n  reason: collision with root package name */
        public int f2052n = -1;

        /* renamed from: o  reason: collision with root package name */
        public int f2053o = -1;

        /* renamed from: p  reason: collision with root package name */
        public int f2054p = -1;

        /* renamed from: q  reason: collision with root package name */
        public int f2055q = -1;

        /* renamed from: r  reason: collision with root package name */
        public int f2056r = -1;

        /* renamed from: s  reason: collision with root package name */
        public int f2057s = -1;

        /* renamed from: t  reason: collision with root package name */
        public int f2058t = -1;

        /* renamed from: u  reason: collision with root package name */
        public float f2059u = 0.5f;

        /* renamed from: v  reason: collision with root package name */
        public float f2060v = 0.5f;

        /* renamed from: w  reason: collision with root package name */
        public String f2061w = null;

        /* renamed from: x  reason: collision with root package name */
        public int f2062x = -1;

        /* renamed from: y  reason: collision with root package name */
        public int f2063y = 0;

        /* renamed from: z  reason: collision with root package name */
        public float f2064z = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2014l0 = sparseIntArray;
            sparseIntArray.append(e.m.Layout_layout_constraintLeft_toLeftOf, 24);
            f2014l0.append(e.m.Layout_layout_constraintLeft_toRightOf, 25);
            f2014l0.append(e.m.Layout_layout_constraintRight_toLeftOf, 28);
            f2014l0.append(e.m.Layout_layout_constraintRight_toRightOf, 29);
            f2014l0.append(e.m.Layout_layout_constraintTop_toTopOf, 35);
            f2014l0.append(e.m.Layout_layout_constraintTop_toBottomOf, 34);
            f2014l0.append(e.m.Layout_layout_constraintBottom_toTopOf, 4);
            f2014l0.append(e.m.Layout_layout_constraintBottom_toBottomOf, 3);
            f2014l0.append(e.m.Layout_layout_constraintBaseline_toBaselineOf, 1);
            f2014l0.append(e.m.Layout_layout_editor_absoluteX, 6);
            f2014l0.append(e.m.Layout_layout_editor_absoluteY, 7);
            f2014l0.append(e.m.Layout_layout_constraintGuide_begin, 17);
            f2014l0.append(e.m.Layout_layout_constraintGuide_end, 18);
            f2014l0.append(e.m.Layout_layout_constraintGuide_percent, 19);
            f2014l0.append(e.m.Layout_android_orientation, 26);
            f2014l0.append(e.m.Layout_layout_constraintStart_toEndOf, 31);
            f2014l0.append(e.m.Layout_layout_constraintStart_toStartOf, 32);
            f2014l0.append(e.m.Layout_layout_constraintEnd_toStartOf, 10);
            f2014l0.append(e.m.Layout_layout_constraintEnd_toEndOf, 9);
            f2014l0.append(e.m.Layout_layout_goneMarginLeft, 13);
            f2014l0.append(e.m.Layout_layout_goneMarginTop, 16);
            f2014l0.append(e.m.Layout_layout_goneMarginRight, 14);
            f2014l0.append(e.m.Layout_layout_goneMarginBottom, 11);
            f2014l0.append(e.m.Layout_layout_goneMarginStart, 15);
            f2014l0.append(e.m.Layout_layout_goneMarginEnd, 12);
            f2014l0.append(e.m.Layout_layout_constraintVertical_weight, 38);
            f2014l0.append(e.m.Layout_layout_constraintHorizontal_weight, 37);
            f2014l0.append(e.m.Layout_layout_constraintHorizontal_chainStyle, 39);
            f2014l0.append(e.m.Layout_layout_constraintVertical_chainStyle, 40);
            f2014l0.append(e.m.Layout_layout_constraintHorizontal_bias, 20);
            f2014l0.append(e.m.Layout_layout_constraintVertical_bias, 36);
            f2014l0.append(e.m.Layout_layout_constraintDimensionRatio, 5);
            f2014l0.append(e.m.Layout_layout_constraintLeft_creator, 76);
            f2014l0.append(e.m.Layout_layout_constraintTop_creator, 76);
            f2014l0.append(e.m.Layout_layout_constraintRight_creator, 76);
            f2014l0.append(e.m.Layout_layout_constraintBottom_creator, 76);
            f2014l0.append(e.m.Layout_layout_constraintBaseline_creator, 76);
            f2014l0.append(e.m.Layout_android_layout_marginLeft, 23);
            f2014l0.append(e.m.Layout_android_layout_marginRight, 27);
            f2014l0.append(e.m.Layout_android_layout_marginStart, 30);
            f2014l0.append(e.m.Layout_android_layout_marginEnd, 8);
            f2014l0.append(e.m.Layout_android_layout_marginTop, 33);
            f2014l0.append(e.m.Layout_android_layout_marginBottom, 2);
            f2014l0.append(e.m.Layout_android_layout_width, 22);
            f2014l0.append(e.m.Layout_android_layout_height, 21);
            f2014l0.append(e.m.Layout_layout_constraintCircle, 61);
            f2014l0.append(e.m.Layout_layout_constraintCircleRadius, 62);
            f2014l0.append(e.m.Layout_layout_constraintCircleAngle, 63);
            f2014l0.append(e.m.Layout_layout_constraintWidth_percent, 69);
            f2014l0.append(e.m.Layout_layout_constraintHeight_percent, 70);
            f2014l0.append(e.m.Layout_chainUseRtl, 71);
            f2014l0.append(e.m.Layout_barrierDirection, 72);
            f2014l0.append(e.m.Layout_barrierMargin, 73);
            f2014l0.append(e.m.Layout_constraint_referenced_ids, 74);
            f2014l0.append(e.m.Layout_barrierAllowsGoneWidgets, 75);
        }

        public void a(b bVar) {
            this.f2029a = bVar.f2029a;
            this.f2033c = bVar.f2033c;
            this.f2031b = bVar.f2031b;
            this.f2035d = bVar.f2035d;
            this.f2037e = bVar.f2037e;
            this.f2039f = bVar.f2039f;
            this.f2041g = bVar.f2041g;
            this.f2043h = bVar.f2043h;
            this.f2045i = bVar.f2045i;
            this.f2047j = bVar.f2047j;
            this.f2049k = bVar.f2049k;
            this.f2050l = bVar.f2050l;
            this.f2051m = bVar.f2051m;
            this.f2052n = bVar.f2052n;
            this.f2053o = bVar.f2053o;
            this.f2054p = bVar.f2054p;
            this.f2055q = bVar.f2055q;
            this.f2056r = bVar.f2056r;
            this.f2057s = bVar.f2057s;
            this.f2058t = bVar.f2058t;
            this.f2059u = bVar.f2059u;
            this.f2060v = bVar.f2060v;
            this.f2061w = bVar.f2061w;
            this.f2062x = bVar.f2062x;
            this.f2063y = bVar.f2063y;
            this.f2064z = bVar.f2064z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            this.H = bVar.H;
            this.I = bVar.I;
            this.J = bVar.J;
            this.K = bVar.K;
            this.L = bVar.L;
            this.M = bVar.M;
            this.N = bVar.N;
            this.O = bVar.O;
            this.P = bVar.P;
            this.Q = bVar.Q;
            this.R = bVar.R;
            this.S = bVar.S;
            this.T = bVar.T;
            this.U = bVar.U;
            this.V = bVar.V;
            this.W = bVar.W;
            this.X = bVar.X;
            this.Y = bVar.Y;
            this.Z = bVar.Z;
            this.f2030a0 = bVar.f2030a0;
            this.f2032b0 = bVar.f2032b0;
            this.f2034c0 = bVar.f2034c0;
            this.f2036d0 = bVar.f2036d0;
            this.f2042g0 = bVar.f2042g0;
            int[] iArr = bVar.f2038e0;
            if (iArr != null) {
                this.f2038e0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.f2038e0 = null;
            }
            this.f2040f0 = bVar.f2040f0;
            this.f2044h0 = bVar.f2044h0;
            this.f2046i0 = bVar.f2046i0;
            this.f2048j0 = bVar.f2048j0;
        }

        /* JADX WARNING: type inference failed for: r2v8, types: [java.lang.String] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void b(androidx.constraintlayout.motion.widget.a r10, java.lang.StringBuilder r11) {
            /*
                r9 = this;
                java.lang.Class r0 = r9.getClass()
                java.lang.reflect.Field[] r0 = r0.getDeclaredFields()
                java.lang.String r1 = "\n"
                r11.append(r1)
                r1 = 0
            L_0x000e:
                int r2 = r0.length
                if (r1 >= r2) goto L_0x007d
                r2 = r0[r1]
                java.lang.String r3 = r2.getName()
                int r4 = r2.getModifiers()
                boolean r4 = java.lang.reflect.Modifier.isStatic(r4)
                if (r4 == 0) goto L_0x0022
                goto L_0x007a
            L_0x0022:
                java.lang.Object r4 = r2.get(r9)     // Catch:{ IllegalAccessException -> 0x0076 }
                java.lang.Class r2 = r2.getType()     // Catch:{ IllegalAccessException -> 0x0076 }
                java.lang.Class r5 = java.lang.Integer.TYPE     // Catch:{ IllegalAccessException -> 0x0076 }
                java.lang.String r6 = "\"\n"
                java.lang.String r7 = " = \""
                java.lang.String r8 = "    "
                if (r2 != r5) goto L_0x0059
                java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ IllegalAccessException -> 0x0076 }
                int r2 = r4.intValue()     // Catch:{ IllegalAccessException -> 0x0076 }
                r5 = -1
                if (r2 == r5) goto L_0x007a
                int r2 = r4.intValue()     // Catch:{ IllegalAccessException -> 0x0076 }
                java.lang.String r2 = r10.M(r2)     // Catch:{ IllegalAccessException -> 0x0076 }
                r11.append(r8)     // Catch:{ IllegalAccessException -> 0x0076 }
                r11.append(r3)     // Catch:{ IllegalAccessException -> 0x0076 }
                r11.append(r7)     // Catch:{ IllegalAccessException -> 0x0076 }
                if (r2 != 0) goto L_0x0051
                goto L_0x0052
            L_0x0051:
                r4 = r2
            L_0x0052:
                r11.append(r4)     // Catch:{ IllegalAccessException -> 0x0076 }
            L_0x0055:
                r11.append(r6)     // Catch:{ IllegalAccessException -> 0x0076 }
                goto L_0x007a
            L_0x0059:
                java.lang.Class r5 = java.lang.Float.TYPE     // Catch:{ IllegalAccessException -> 0x0076 }
                if (r2 != r5) goto L_0x007a
                java.lang.Float r4 = (java.lang.Float) r4     // Catch:{ IllegalAccessException -> 0x0076 }
                float r2 = r4.floatValue()     // Catch:{ IllegalAccessException -> 0x0076 }
                r5 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                if (r2 == 0) goto L_0x007a
                r11.append(r8)     // Catch:{ IllegalAccessException -> 0x0076 }
                r11.append(r3)     // Catch:{ IllegalAccessException -> 0x0076 }
                r11.append(r7)     // Catch:{ IllegalAccessException -> 0x0076 }
                r11.append(r4)     // Catch:{ IllegalAccessException -> 0x0076 }
                goto L_0x0055
            L_0x0076:
                r2 = move-exception
                r2.printStackTrace()
            L_0x007a:
                int r1 = r1 + 1
                goto L_0x000e
            L_0x007d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.d.b.b(androidx.constraintlayout.motion.widget.a, java.lang.StringBuilder):void");
        }

        public void c(Context context, AttributeSet attributeSet) {
            StringBuilder sb2;
            String str;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.m.Layout);
            this.f2031b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                int i11 = f2014l0.get(index);
                if (i11 == 80) {
                    this.f2044h0 = obtainStyledAttributes.getBoolean(index, this.f2044h0);
                } else if (i11 != 81) {
                    switch (i11) {
                        case 1:
                            this.f2054p = d.p0(obtainStyledAttributes, index, this.f2054p);
                            break;
                        case 2:
                            this.G = obtainStyledAttributes.getDimensionPixelSize(index, this.G);
                            break;
                        case 3:
                            this.f2053o = d.p0(obtainStyledAttributes, index, this.f2053o);
                            break;
                        case 4:
                            this.f2052n = d.p0(obtainStyledAttributes, index, this.f2052n);
                            break;
                        case 5:
                            this.f2061w = obtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.A = obtainStyledAttributes.getDimensionPixelOffset(index, this.A);
                            break;
                        case 7:
                            this.B = obtainStyledAttributes.getDimensionPixelOffset(index, this.B);
                            break;
                        case 8:
                            this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                            break;
                        case 9:
                            this.f2058t = d.p0(obtainStyledAttributes, index, this.f2058t);
                            break;
                        case 10:
                            this.f2057s = d.p0(obtainStyledAttributes, index, this.f2057s);
                            break;
                        case 11:
                            this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                            break;
                        case 12:
                            this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                            break;
                        case 13:
                            this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                            break;
                        case 14:
                            this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                            break;
                        case 15:
                            this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                            break;
                        case 16:
                            this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                            break;
                        case 17:
                            this.f2037e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2037e);
                            break;
                        case 18:
                            this.f2039f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2039f);
                            break;
                        case 19:
                            this.f2041g = obtainStyledAttributes.getFloat(index, this.f2041g);
                            break;
                        case 20:
                            this.f2059u = obtainStyledAttributes.getFloat(index, this.f2059u);
                            break;
                        case 21:
                            this.f2035d = obtainStyledAttributes.getLayoutDimension(index, this.f2035d);
                            break;
                        case 22:
                            this.f2033c = obtainStyledAttributes.getLayoutDimension(index, this.f2033c);
                            break;
                        case 23:
                            this.D = obtainStyledAttributes.getDimensionPixelSize(index, this.D);
                            break;
                        case 24:
                            this.f2043h = d.p0(obtainStyledAttributes, index, this.f2043h);
                            break;
                        case 25:
                            this.f2045i = d.p0(obtainStyledAttributes, index, this.f2045i);
                            break;
                        case 26:
                            this.C = obtainStyledAttributes.getInt(index, this.C);
                            break;
                        case 27:
                            this.E = obtainStyledAttributes.getDimensionPixelSize(index, this.E);
                            break;
                        case 28:
                            this.f2047j = d.p0(obtainStyledAttributes, index, this.f2047j);
                            break;
                        case 29:
                            this.f2049k = d.p0(obtainStyledAttributes, index, this.f2049k);
                            break;
                        case 30:
                            this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                            break;
                        case 31:
                            this.f2055q = d.p0(obtainStyledAttributes, index, this.f2055q);
                            break;
                        case 32:
                            this.f2056r = d.p0(obtainStyledAttributes, index, this.f2056r);
                            break;
                        case 33:
                            this.F = obtainStyledAttributes.getDimensionPixelSize(index, this.F);
                            break;
                        case 34:
                            this.f2051m = d.p0(obtainStyledAttributes, index, this.f2051m);
                            break;
                        case 35:
                            this.f2050l = d.p0(obtainStyledAttributes, index, this.f2050l);
                            break;
                        case 36:
                            this.f2060v = obtainStyledAttributes.getFloat(index, this.f2060v);
                            break;
                        case 37:
                            this.Q = obtainStyledAttributes.getFloat(index, this.Q);
                            break;
                        case 38:
                            this.P = obtainStyledAttributes.getFloat(index, this.P);
                            break;
                        case 39:
                            this.R = obtainStyledAttributes.getInt(index, this.R);
                            break;
                        case 40:
                            this.S = obtainStyledAttributes.getInt(index, this.S);
                            break;
                        default:
                            switch (i11) {
                                case 54:
                                    this.T = obtainStyledAttributes.getInt(index, this.T);
                                    break;
                                case 55:
                                    this.U = obtainStyledAttributes.getInt(index, this.U);
                                    break;
                                case 56:
                                    this.V = obtainStyledAttributes.getDimensionPixelSize(index, this.V);
                                    break;
                                case 57:
                                    this.W = obtainStyledAttributes.getDimensionPixelSize(index, this.W);
                                    break;
                                case 58:
                                    this.X = obtainStyledAttributes.getDimensionPixelSize(index, this.X);
                                    break;
                                case 59:
                                    this.Y = obtainStyledAttributes.getDimensionPixelSize(index, this.Y);
                                    break;
                                default:
                                    switch (i11) {
                                        case 61:
                                            this.f2062x = d.p0(obtainStyledAttributes, index, this.f2062x);
                                            break;
                                        case 62:
                                            this.f2063y = obtainStyledAttributes.getDimensionPixelSize(index, this.f2063y);
                                            break;
                                        case 63:
                                            this.f2064z = obtainStyledAttributes.getFloat(index, this.f2064z);
                                            break;
                                        default:
                                            switch (i11) {
                                                case 69:
                                                    this.Z = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    continue;
                                                case 70:
                                                    this.f2030a0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                    continue;
                                                case 71:
                                                    break;
                                                case 72:
                                                    this.f2032b0 = obtainStyledAttributes.getInt(index, this.f2032b0);
                                                    continue;
                                                case 73:
                                                    this.f2034c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f2034c0);
                                                    continue;
                                                case 74:
                                                    this.f2040f0 = obtainStyledAttributes.getString(index);
                                                    continue;
                                                case 75:
                                                    this.f2048j0 = obtainStyledAttributes.getBoolean(index, this.f2048j0);
                                                    continue;
                                                case 76:
                                                    sb2 = new StringBuilder();
                                                    str = "unused attribute 0x";
                                                    break;
                                                case 77:
                                                    this.f2042g0 = obtainStyledAttributes.getString(index);
                                                    continue;
                                                default:
                                                    sb2 = new StringBuilder();
                                                    str = "Unknown attribute 0x";
                                                    break;
                                            }
                                            sb2.append(str);
                                            sb2.append(Integer.toHexString(index));
                                            sb2.append("   ");
                                            sb2.append(f2014l0.get(index));
                                            break;
                                    }
                            }
                    }
                } else {
                    this.f2046i0 = obtainStyledAttributes.getBoolean(index, this.f2046i0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class c {

        /* renamed from: h  reason: collision with root package name */
        public static SparseIntArray f2065h = null;

        /* renamed from: i  reason: collision with root package name */
        public static final int f2066i = 1;

        /* renamed from: j  reason: collision with root package name */
        public static final int f2067j = 2;

        /* renamed from: k  reason: collision with root package name */
        public static final int f2068k = 3;

        /* renamed from: l  reason: collision with root package name */
        public static final int f2069l = 4;

        /* renamed from: m  reason: collision with root package name */
        public static final int f2070m = 5;

        /* renamed from: n  reason: collision with root package name */
        public static final int f2071n = 6;

        /* renamed from: a  reason: collision with root package name */
        public boolean f2072a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f2073b = -1;

        /* renamed from: c  reason: collision with root package name */
        public String f2074c = null;

        /* renamed from: d  reason: collision with root package name */
        public int f2075d = -1;

        /* renamed from: e  reason: collision with root package name */
        public int f2076e = 0;

        /* renamed from: f  reason: collision with root package name */
        public float f2077f = Float.NaN;

        /* renamed from: g  reason: collision with root package name */
        public float f2078g = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2065h = sparseIntArray;
            sparseIntArray.append(e.m.Motion_motionPathRotate, 1);
            f2065h.append(e.m.Motion_pathMotionArc, 2);
            f2065h.append(e.m.Motion_transitionEasing, 3);
            f2065h.append(e.m.Motion_drawPath, 4);
            f2065h.append(e.m.Motion_animate_relativeTo, 5);
            f2065h.append(e.m.Motion_motionStagger, 6);
        }

        public void a(c cVar) {
            this.f2072a = cVar.f2072a;
            this.f2073b = cVar.f2073b;
            this.f2074c = cVar.f2074c;
            this.f2075d = cVar.f2075d;
            this.f2076e = cVar.f2076e;
            this.f2078g = cVar.f2078g;
            this.f2077f = cVar.f2077f;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.m.Motion);
            this.f2072a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                switch (f2065h.get(index)) {
                    case 1:
                        this.f2078g = obtainStyledAttributes.getFloat(index, this.f2078g);
                        break;
                    case 2:
                        this.f2075d = obtainStyledAttributes.getInt(index, this.f2075d);
                        break;
                    case 3:
                        this.f2074c = obtainStyledAttributes.peekValue(index).type == 3 ? obtainStyledAttributes.getString(index) : u.c.f13300k[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    case 4:
                        this.f2076e = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f2073b = d.p0(obtainStyledAttributes, index, this.f2073b);
                        break;
                    case 6:
                        this.f2077f = obtainStyledAttributes.getFloat(index, this.f2077f);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.d$d  reason: collision with other inner class name */
    public static class C0030d {

        /* renamed from: a  reason: collision with root package name */
        public boolean f2079a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f2080b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f2081c = 0;

        /* renamed from: d  reason: collision with root package name */
        public float f2082d = 1.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f2083e = Float.NaN;

        public void a(C0030d dVar) {
            this.f2079a = dVar.f2079a;
            this.f2080b = dVar.f2080b;
            this.f2082d = dVar.f2082d;
            this.f2083e = dVar.f2083e;
            this.f2081c = dVar.f2081c;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.m.PropertySet);
            this.f2079a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == e.m.PropertySet_android_alpha) {
                    this.f2082d = obtainStyledAttributes.getFloat(index, this.f2082d);
                } else if (index == e.m.PropertySet_android_visibility) {
                    this.f2080b = obtainStyledAttributes.getInt(index, this.f2080b);
                    this.f2080b = d.G[this.f2080b];
                } else if (index == e.m.PropertySet_visibilityMode) {
                    this.f2081c = obtainStyledAttributes.getInt(index, this.f2081c);
                } else if (index == e.m.PropertySet_motionProgress) {
                    this.f2083e = obtainStyledAttributes.getFloat(index, this.f2083e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public static class e {

        /* renamed from: n  reason: collision with root package name */
        public static SparseIntArray f2084n = null;

        /* renamed from: o  reason: collision with root package name */
        public static final int f2085o = 1;

        /* renamed from: p  reason: collision with root package name */
        public static final int f2086p = 2;

        /* renamed from: q  reason: collision with root package name */
        public static final int f2087q = 3;

        /* renamed from: r  reason: collision with root package name */
        public static final int f2088r = 4;

        /* renamed from: s  reason: collision with root package name */
        public static final int f2089s = 5;

        /* renamed from: t  reason: collision with root package name */
        public static final int f2090t = 6;

        /* renamed from: u  reason: collision with root package name */
        public static final int f2091u = 7;

        /* renamed from: v  reason: collision with root package name */
        public static final int f2092v = 8;

        /* renamed from: w  reason: collision with root package name */
        public static final int f2093w = 9;

        /* renamed from: x  reason: collision with root package name */
        public static final int f2094x = 10;

        /* renamed from: y  reason: collision with root package name */
        public static final int f2095y = 11;

        /* renamed from: a  reason: collision with root package name */
        public boolean f2096a = false;

        /* renamed from: b  reason: collision with root package name */
        public float f2097b = 0.0f;

        /* renamed from: c  reason: collision with root package name */
        public float f2098c = 0.0f;

        /* renamed from: d  reason: collision with root package name */
        public float f2099d = 0.0f;

        /* renamed from: e  reason: collision with root package name */
        public float f2100e = 1.0f;

        /* renamed from: f  reason: collision with root package name */
        public float f2101f = 1.0f;

        /* renamed from: g  reason: collision with root package name */
        public float f2102g = Float.NaN;

        /* renamed from: h  reason: collision with root package name */
        public float f2103h = Float.NaN;

        /* renamed from: i  reason: collision with root package name */
        public float f2104i = 0.0f;

        /* renamed from: j  reason: collision with root package name */
        public float f2105j = 0.0f;

        /* renamed from: k  reason: collision with root package name */
        public float f2106k = 0.0f;

        /* renamed from: l  reason: collision with root package name */
        public boolean f2107l = false;

        /* renamed from: m  reason: collision with root package name */
        public float f2108m = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f2084n = sparseIntArray;
            sparseIntArray.append(e.m.Transform_android_rotation, 1);
            f2084n.append(e.m.Transform_android_rotationX, 2);
            f2084n.append(e.m.Transform_android_rotationY, 3);
            f2084n.append(e.m.Transform_android_scaleX, 4);
            f2084n.append(e.m.Transform_android_scaleY, 5);
            f2084n.append(e.m.Transform_android_transformPivotX, 6);
            f2084n.append(e.m.Transform_android_transformPivotY, 7);
            f2084n.append(e.m.Transform_android_translationX, 8);
            f2084n.append(e.m.Transform_android_translationY, 9);
            f2084n.append(e.m.Transform_android_translationZ, 10);
            f2084n.append(e.m.Transform_android_elevation, 11);
        }

        public void a(e eVar) {
            this.f2096a = eVar.f2096a;
            this.f2097b = eVar.f2097b;
            this.f2098c = eVar.f2098c;
            this.f2099d = eVar.f2099d;
            this.f2100e = eVar.f2100e;
            this.f2101f = eVar.f2101f;
            this.f2102g = eVar.f2102g;
            this.f2103h = eVar.f2103h;
            this.f2104i = eVar.f2104i;
            this.f2105j = eVar.f2105j;
            this.f2106k = eVar.f2106k;
            this.f2107l = eVar.f2107l;
            this.f2108m = eVar.f2108m;
        }

        public void b(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.m.Transform);
            this.f2096a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                switch (f2084n.get(index)) {
                    case 1:
                        this.f2097b = obtainStyledAttributes.getFloat(index, this.f2097b);
                        break;
                    case 2:
                        this.f2098c = obtainStyledAttributes.getFloat(index, this.f2098c);
                        break;
                    case 3:
                        this.f2099d = obtainStyledAttributes.getFloat(index, this.f2099d);
                        break;
                    case 4:
                        this.f2100e = obtainStyledAttributes.getFloat(index, this.f2100e);
                        break;
                    case 5:
                        this.f2101f = obtainStyledAttributes.getFloat(index, this.f2101f);
                        break;
                    case 6:
                        this.f2102g = obtainStyledAttributes.getDimension(index, this.f2102g);
                        break;
                    case 7:
                        this.f2103h = obtainStyledAttributes.getDimension(index, this.f2103h);
                        break;
                    case 8:
                        this.f2104i = obtainStyledAttributes.getDimension(index, this.f2104i);
                        break;
                    case 9:
                        this.f2105j = obtainStyledAttributes.getDimension(index, this.f2105j);
                        break;
                    case 10:
                        this.f2106k = obtainStyledAttributes.getDimension(index, this.f2106k);
                        break;
                    case 11:
                        this.f2107l = true;
                        this.f2108m = obtainStyledAttributes.getDimension(index, this.f2108m);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.append(e.m.Constraint_layout_constraintLeft_toLeftOf, 25);
        I.append(e.m.Constraint_layout_constraintLeft_toRightOf, 26);
        I.append(e.m.Constraint_layout_constraintRight_toLeftOf, 29);
        I.append(e.m.Constraint_layout_constraintRight_toRightOf, 30);
        I.append(e.m.Constraint_layout_constraintTop_toTopOf, 36);
        I.append(e.m.Constraint_layout_constraintTop_toBottomOf, 35);
        I.append(e.m.Constraint_layout_constraintBottom_toTopOf, 4);
        I.append(e.m.Constraint_layout_constraintBottom_toBottomOf, 3);
        I.append(e.m.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        I.append(e.m.Constraint_layout_editor_absoluteX, 6);
        I.append(e.m.Constraint_layout_editor_absoluteY, 7);
        I.append(e.m.Constraint_layout_constraintGuide_begin, 17);
        I.append(e.m.Constraint_layout_constraintGuide_end, 18);
        I.append(e.m.Constraint_layout_constraintGuide_percent, 19);
        I.append(e.m.Constraint_android_orientation, 27);
        I.append(e.m.Constraint_layout_constraintStart_toEndOf, 32);
        I.append(e.m.Constraint_layout_constraintStart_toStartOf, 33);
        I.append(e.m.Constraint_layout_constraintEnd_toStartOf, 10);
        I.append(e.m.Constraint_layout_constraintEnd_toEndOf, 9);
        I.append(e.m.Constraint_layout_goneMarginLeft, 13);
        I.append(e.m.Constraint_layout_goneMarginTop, 16);
        I.append(e.m.Constraint_layout_goneMarginRight, 14);
        I.append(e.m.Constraint_layout_goneMarginBottom, 11);
        I.append(e.m.Constraint_layout_goneMarginStart, 15);
        I.append(e.m.Constraint_layout_goneMarginEnd, 12);
        I.append(e.m.Constraint_layout_constraintVertical_weight, 40);
        I.append(e.m.Constraint_layout_constraintHorizontal_weight, 39);
        I.append(e.m.Constraint_layout_constraintHorizontal_chainStyle, 41);
        I.append(e.m.Constraint_layout_constraintVertical_chainStyle, 42);
        I.append(e.m.Constraint_layout_constraintHorizontal_bias, 20);
        I.append(e.m.Constraint_layout_constraintVertical_bias, 37);
        I.append(e.m.Constraint_layout_constraintDimensionRatio, 5);
        I.append(e.m.Constraint_layout_constraintLeft_creator, 82);
        I.append(e.m.Constraint_layout_constraintTop_creator, 82);
        I.append(e.m.Constraint_layout_constraintRight_creator, 82);
        I.append(e.m.Constraint_layout_constraintBottom_creator, 82);
        I.append(e.m.Constraint_layout_constraintBaseline_creator, 82);
        I.append(e.m.Constraint_android_layout_marginLeft, 24);
        I.append(e.m.Constraint_android_layout_marginRight, 28);
        I.append(e.m.Constraint_android_layout_marginStart, 31);
        I.append(e.m.Constraint_android_layout_marginEnd, 8);
        I.append(e.m.Constraint_android_layout_marginTop, 34);
        I.append(e.m.Constraint_android_layout_marginBottom, 2);
        I.append(e.m.Constraint_android_layout_width, 23);
        I.append(e.m.Constraint_android_layout_height, 21);
        I.append(e.m.Constraint_android_visibility, 22);
        I.append(e.m.Constraint_android_alpha, 43);
        I.append(e.m.Constraint_android_elevation, 44);
        I.append(e.m.Constraint_android_rotationX, 45);
        I.append(e.m.Constraint_android_rotationY, 46);
        I.append(e.m.Constraint_android_rotation, 60);
        I.append(e.m.Constraint_android_scaleX, 47);
        I.append(e.m.Constraint_android_scaleY, 48);
        I.append(e.m.Constraint_android_transformPivotX, 49);
        I.append(e.m.Constraint_android_transformPivotY, 50);
        I.append(e.m.Constraint_android_translationX, 51);
        I.append(e.m.Constraint_android_translationY, 52);
        I.append(e.m.Constraint_android_translationZ, 53);
        I.append(e.m.Constraint_layout_constraintWidth_default, 54);
        I.append(e.m.Constraint_layout_constraintHeight_default, 55);
        I.append(e.m.Constraint_layout_constraintWidth_max, 56);
        I.append(e.m.Constraint_layout_constraintHeight_max, 57);
        I.append(e.m.Constraint_layout_constraintWidth_min, 58);
        I.append(e.m.Constraint_layout_constraintHeight_min, 59);
        I.append(e.m.Constraint_layout_constraintCircle, 61);
        I.append(e.m.Constraint_layout_constraintCircleRadius, 62);
        I.append(e.m.Constraint_layout_constraintCircleAngle, 63);
        I.append(e.m.Constraint_animate_relativeTo, 64);
        I.append(e.m.Constraint_transitionEasing, 65);
        I.append(e.m.Constraint_drawPath, 66);
        I.append(e.m.Constraint_transitionPathRotate, 67);
        I.append(e.m.Constraint_motionStagger, 79);
        I.append(e.m.Constraint_android_id, 38);
        I.append(e.m.Constraint_motionProgress, 68);
        I.append(e.m.Constraint_layout_constraintWidth_percent, 69);
        I.append(e.m.Constraint_layout_constraintHeight_percent, 70);
        I.append(e.m.Constraint_chainUseRtl, 71);
        I.append(e.m.Constraint_barrierDirection, 72);
        I.append(e.m.Constraint_barrierMargin, 73);
        I.append(e.m.Constraint_constraint_referenced_ids, 74);
        I.append(e.m.Constraint_barrierAllowsGoneWidgets, 75);
        I.append(e.m.Constraint_pathMotionArc, 76);
        I.append(e.m.Constraint_layout_constraintTag, 77);
        I.append(e.m.Constraint_visibilityMode, 78);
        I.append(e.m.Constraint_layout_constrainedWidth, 80);
        I.append(e.m.Constraint_layout_constrainedHeight, 81);
    }

    public static String[] o1(String str) {
        char[] charArray = str.toCharArray();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        boolean z10 = false;
        for (int i11 = 0; i11 < charArray.length; i11++) {
            char c10 = charArray[i11];
            if (c10 == ',' && !z10) {
                arrayList.add(new String(charArray, i10, i11 - i10));
                i10 = i11 + 1;
            } else if (c10 == '\"') {
                z10 = !z10;
            }
        }
        arrayList.add(new String(charArray, i10, charArray.length - i10));
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static int p0(TypedArray typedArray, int i10, int i11) {
        int resourceId = typedArray.getResourceId(i10, i11);
        return resourceId == -1 ? typedArray.getInt(i10, -1) : resourceId;
    }

    public void A(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f1995d.clear();
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = constraintLayout.getChildAt(i10);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (!this.f1994c || id2 != -1) {
                if (!this.f1995d.containsKey(Integer.valueOf(id2))) {
                    this.f1995d.put(Integer.valueOf(id2), new a());
                }
                a aVar = this.f1995d.get(Integer.valueOf(id2));
                aVar.f2001f = a.c(this.f1993b, childAt);
                aVar.j(id2, bVar);
                aVar.f1997b.f2080b = childAt.getVisibility();
                aVar.f1997b.f2082d = childAt.getAlpha();
                aVar.f2000e.f2097b = childAt.getRotation();
                aVar.f2000e.f2098c = childAt.getRotationX();
                aVar.f2000e.f2099d = childAt.getRotationY();
                aVar.f2000e.f2100e = childAt.getScaleX();
                aVar.f2000e.f2101f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                    e eVar = aVar.f2000e;
                    eVar.f2102g = pivotX;
                    eVar.f2103h = pivotY;
                }
                aVar.f2000e.f2104i = childAt.getTranslationX();
                aVar.f2000e.f2105j = childAt.getTranslationY();
                aVar.f2000e.f2106k = childAt.getTranslationZ();
                e eVar2 = aVar.f2000e;
                if (eVar2.f2107l) {
                    eVar2.f2108m = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    aVar.f1999d.f2048j0 = barrier.z();
                    aVar.f1999d.f2038e0 = barrier.getReferencedIds();
                    aVar.f1999d.f2032b0 = barrier.getType();
                    aVar.f1999d.f2034c0 = barrier.getMargin();
                }
                i10++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public void A0(int i10, float f10) {
        b0(i10).f1997b.f2082d = f10;
    }

    public void B(d dVar) {
        this.f1995d.clear();
        for (Integer next : dVar.f1995d.keySet()) {
            this.f1995d.put(next, dVar.f1995d.get(next).clone());
        }
    }

    public void B0(int i10, boolean z10) {
        b0(i10).f2000e.f2107l = z10;
    }

    public void C(Constraints constraints) {
        int childCount = constraints.getChildCount();
        this.f1995d.clear();
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = constraints.getChildAt(i10);
            Constraints.a aVar = (Constraints.a) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (!this.f1994c || id2 != -1) {
                if (!this.f1995d.containsKey(Integer.valueOf(id2))) {
                    this.f1995d.put(Integer.valueOf(id2), new a());
                }
                a aVar2 = this.f1995d.get(Integer.valueOf(id2));
                if (childAt instanceof ConstraintHelper) {
                    aVar2.l((ConstraintHelper) childAt, id2, aVar);
                }
                aVar2.k(id2, aVar);
                i10++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public void C0(int i10, int i11) {
        b0(i10).f1999d.f2036d0 = i11;
    }

    public void D(int i10, int i11, int i12, int i13) {
        b bVar;
        if (!this.f1995d.containsKey(Integer.valueOf(i10))) {
            this.f1995d.put(Integer.valueOf(i10), new a());
        }
        a aVar = this.f1995d.get(Integer.valueOf(i10));
        switch (i11) {
            case 1:
                if (i13 == 1) {
                    b bVar2 = aVar.f1999d;
                    bVar2.f2043h = i12;
                    bVar2.f2045i = -1;
                    return;
                } else if (i13 == 2) {
                    b bVar3 = aVar.f1999d;
                    bVar3.f2045i = i12;
                    bVar3.f2043h = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("left to " + n1(i13) + " undefined");
                }
            case 2:
                if (i13 == 1) {
                    b bVar4 = aVar.f1999d;
                    bVar4.f2047j = i12;
                    bVar4.f2049k = -1;
                    return;
                } else if (i13 == 2) {
                    b bVar5 = aVar.f1999d;
                    bVar5.f2049k = i12;
                    bVar5.f2047j = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + n1(i13) + " undefined");
                }
            case 3:
                if (i13 == 3) {
                    bVar = aVar.f1999d;
                    bVar.f2050l = i12;
                    bVar.f2051m = -1;
                    break;
                } else if (i13 == 4) {
                    bVar = aVar.f1999d;
                    bVar.f2051m = i12;
                    bVar.f2050l = -1;
                    break;
                } else {
                    throw new IllegalArgumentException("right to " + n1(i13) + " undefined");
                }
            case 4:
                if (i13 == 4) {
                    bVar = aVar.f1999d;
                    bVar.f2053o = i12;
                    bVar.f2052n = -1;
                    break;
                } else if (i13 == 3) {
                    bVar = aVar.f1999d;
                    bVar.f2052n = i12;
                    bVar.f2053o = -1;
                    break;
                } else {
                    throw new IllegalArgumentException("right to " + n1(i13) + " undefined");
                }
            case 5:
                if (i13 == 5) {
                    b bVar6 = aVar.f1999d;
                    bVar6.f2054p = i12;
                    bVar6.f2053o = -1;
                    bVar6.f2052n = -1;
                    bVar6.f2050l = -1;
                    bVar6.f2051m = -1;
                    return;
                }
                throw new IllegalArgumentException("right to " + n1(i13) + " undefined");
            case 6:
                if (i13 == 6) {
                    b bVar7 = aVar.f1999d;
                    bVar7.f2056r = i12;
                    bVar7.f2055q = -1;
                    return;
                } else if (i13 == 7) {
                    b bVar8 = aVar.f1999d;
                    bVar8.f2055q = i12;
                    bVar8.f2056r = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + n1(i13) + " undefined");
                }
            case 7:
                if (i13 == 7) {
                    b bVar9 = aVar.f1999d;
                    bVar9.f2058t = i12;
                    bVar9.f2057s = -1;
                    return;
                } else if (i13 == 6) {
                    b bVar10 = aVar.f1999d;
                    bVar10.f2057s = i12;
                    bVar10.f2058t = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + n1(i13) + " undefined");
                }
            default:
                throw new IllegalArgumentException(n1(i11) + " to " + n1(i13) + " unknown");
        }
        bVar.f2054p = -1;
    }

    public void D0(int i10, String str, int i11) {
        b0(i10).n(str, i11);
    }

    public void E(int i10, int i11, int i12, int i13, int i14) {
        b bVar;
        b bVar2;
        if (!this.f1995d.containsKey(Integer.valueOf(i10))) {
            this.f1995d.put(Integer.valueOf(i10), new a());
        }
        a aVar = this.f1995d.get(Integer.valueOf(i10));
        switch (i11) {
            case 1:
                if (i13 == 1) {
                    b bVar3 = aVar.f1999d;
                    bVar3.f2043h = i12;
                    bVar3.f2045i = -1;
                } else if (i13 == 2) {
                    b bVar4 = aVar.f1999d;
                    bVar4.f2045i = i12;
                    bVar4.f2043h = -1;
                } else {
                    throw new IllegalArgumentException("Left to " + n1(i13) + " undefined");
                }
                aVar.f1999d.D = i14;
                return;
            case 2:
                if (i13 == 1) {
                    b bVar5 = aVar.f1999d;
                    bVar5.f2047j = i12;
                    bVar5.f2049k = -1;
                } else if (i13 == 2) {
                    b bVar6 = aVar.f1999d;
                    bVar6.f2049k = i12;
                    bVar6.f2047j = -1;
                } else {
                    throw new IllegalArgumentException("right to " + n1(i13) + " undefined");
                }
                aVar.f1999d.E = i14;
                return;
            case 3:
                if (i13 == 3) {
                    bVar = aVar.f1999d;
                    bVar.f2050l = i12;
                    bVar.f2051m = -1;
                } else if (i13 == 4) {
                    bVar = aVar.f1999d;
                    bVar.f2051m = i12;
                    bVar.f2050l = -1;
                } else {
                    throw new IllegalArgumentException("right to " + n1(i13) + " undefined");
                }
                bVar.f2054p = -1;
                aVar.f1999d.F = i14;
                return;
            case 4:
                if (i13 == 4) {
                    bVar2 = aVar.f1999d;
                    bVar2.f2053o = i12;
                    bVar2.f2052n = -1;
                } else if (i13 == 3) {
                    bVar2 = aVar.f1999d;
                    bVar2.f2052n = i12;
                    bVar2.f2053o = -1;
                } else {
                    throw new IllegalArgumentException("right to " + n1(i13) + " undefined");
                }
                bVar2.f2054p = -1;
                aVar.f1999d.G = i14;
                return;
            case 5:
                if (i13 == 5) {
                    b bVar7 = aVar.f1999d;
                    bVar7.f2054p = i12;
                    bVar7.f2053o = -1;
                    bVar7.f2052n = -1;
                    bVar7.f2050l = -1;
                    bVar7.f2051m = -1;
                    return;
                }
                throw new IllegalArgumentException("right to " + n1(i13) + " undefined");
            case 6:
                if (i13 == 6) {
                    b bVar8 = aVar.f1999d;
                    bVar8.f2056r = i12;
                    bVar8.f2055q = -1;
                } else if (i13 == 7) {
                    b bVar9 = aVar.f1999d;
                    bVar9.f2055q = i12;
                    bVar9.f2056r = -1;
                } else {
                    throw new IllegalArgumentException("right to " + n1(i13) + " undefined");
                }
                aVar.f1999d.I = i14;
                return;
            case 7:
                if (i13 == 7) {
                    b bVar10 = aVar.f1999d;
                    bVar10.f2058t = i12;
                    bVar10.f2057s = -1;
                } else if (i13 == 6) {
                    b bVar11 = aVar.f1999d;
                    bVar11.f2057s = i12;
                    bVar11.f2058t = -1;
                } else {
                    throw new IllegalArgumentException("right to " + n1(i13) + " undefined");
                }
                aVar.f1999d.H = i14;
                return;
            default:
                throw new IllegalArgumentException(n1(i11) + " to " + n1(i13) + " unknown");
        }
    }

    public void E0(int i10, String str) {
        b0(i10).f1999d.f2061w = str;
    }

    public void F(int i10, int i11, int i12, float f10) {
        b bVar = b0(i10).f1999d;
        bVar.f2062x = i11;
        bVar.f2063y = i12;
        bVar.f2064z = f10;
    }

    public void F0(int i10, int i11) {
        b0(i10).f1999d.A = i11;
    }

    public void G(int i10, int i11) {
        b0(i10).f1999d.U = i11;
    }

    public void G0(int i10, int i11) {
        b0(i10).f1999d.B = i11;
    }

    public void H(int i10, int i11) {
        b0(i10).f1999d.T = i11;
    }

    public void H0(int i10, float f10) {
        b0(i10).f2000e.f2108m = f10;
        b0(i10).f2000e.f2107l = true;
    }

    public void I(int i10, int i11) {
        b0(i10).f1999d.f2035d = i11;
    }

    public void I0(int i10, String str, float f10) {
        b0(i10).o(str, f10);
    }

    public void J(int i10, int i11) {
        b0(i10).f1999d.W = i11;
    }

    public void J0(boolean z10) {
        this.f1994c = z10;
    }

    public void K(int i10, int i11) {
        b0(i10).f1999d.V = i11;
    }

    public void K0(int i10, int i11, int i12) {
        a b02 = b0(i10);
        switch (i11) {
            case 1:
                b02.f1999d.J = i12;
                return;
            case 2:
                b02.f1999d.L = i12;
                return;
            case 3:
                b02.f1999d.K = i12;
                return;
            case 4:
                b02.f1999d.M = i12;
                return;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                b02.f1999d.O = i12;
                return;
            case 7:
                b02.f1999d.N = i12;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void L(int i10, int i11) {
        b0(i10).f1999d.Y = i11;
    }

    public void L0(int i10, int i11) {
        b0(i10).f1999d.f2037e = i11;
        b0(i10).f1999d.f2039f = -1;
        b0(i10).f1999d.f2041g = -1.0f;
    }

    public void M(int i10, int i11) {
        b0(i10).f1999d.X = i11;
    }

    public void M0(int i10, int i11) {
        b0(i10).f1999d.f2039f = i11;
        b0(i10).f1999d.f2037e = -1;
        b0(i10).f1999d.f2041g = -1.0f;
    }

    public void N(int i10, float f10) {
        b0(i10).f1999d.f2030a0 = f10;
    }

    public void N0(int i10, float f10) {
        b0(i10).f1999d.f2041g = f10;
        b0(i10).f1999d.f2039f = -1;
        b0(i10).f1999d.f2037e = -1;
    }

    public void O(int i10, float f10) {
        b0(i10).f1999d.Z = f10;
    }

    public void O0(int i10, float f10) {
        b0(i10).f1999d.f2059u = f10;
    }

    public void P(int i10, int i11) {
        b0(i10).f1999d.f2033c = i11;
    }

    public void P0(int i10, int i11) {
        b0(i10).f1999d.R = i11;
    }

    public void Q(int i10, boolean z10) {
        b0(i10).f1999d.f2046i0 = z10;
    }

    public void Q0(int i10, float f10) {
        b0(i10).f1999d.Q = f10;
    }

    public void R(int i10, boolean z10) {
        b0(i10).f1999d.f2044h0 = z10;
    }

    public void R0(int i10, String str, int i11) {
        b0(i10).p(str, i11);
    }

    public final int[] S(View view, String str) {
        int i10;
        Object m10;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i11 = 0;
        int i12 = 0;
        while (i11 < split.length) {
            String trim = split[i11].trim();
            try {
                i10 = e.g.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i10 = 0;
            }
            if (i10 == 0) {
                i10 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i10 == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (m10 = ((ConstraintLayout) view.getParent()).m(0, trim)) != null && (m10 instanceof Integer)) {
                i10 = ((Integer) m10).intValue();
            }
            iArr[i12] = i10;
            i11++;
            i12++;
        }
        return i12 != split.length ? Arrays.copyOf(iArr, i12) : iArr;
    }

    public void S0(int i10, int i11, int i12) {
        a b02 = b0(i10);
        switch (i11) {
            case 1:
                b02.f1999d.D = i12;
                return;
            case 2:
                b02.f1999d.E = i12;
                return;
            case 3:
                b02.f1999d.F = i12;
                return;
            case 4:
                b02.f1999d.G = i12;
                return;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                b02.f1999d.I = i12;
                return;
            case 7:
                b02.f1999d.H = i12;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void T(int i10, int i11) {
        b bVar = b0(i10).f1999d;
        bVar.f2029a = true;
        bVar.C = i11;
    }

    public void T0(int i10, int... iArr) {
        b0(i10).f1999d.f2038e0 = iArr;
    }

    public void U(int i10, int i11, int i12, int... iArr) {
        b bVar = b0(i10).f1999d;
        bVar.f2036d0 = 1;
        bVar.f2032b0 = i11;
        bVar.f2034c0 = i12;
        bVar.f2029a = false;
        bVar.f2038e0 = iArr;
    }

    public void U0(int i10, float f10) {
        b0(i10).f2000e.f2097b = f10;
    }

    public void V(int i10, int i11, int i12, int i13, int[] iArr, float[] fArr, int i14) {
        W(i10, i11, i12, i13, iArr, fArr, i14, 1, 2);
    }

    public void V0(int i10, float f10) {
        b0(i10).f2000e.f2098c = f10;
    }

    public final void W(int i10, int i11, int i12, int i13, int[] iArr, float[] fArr, int i14, int i15, int i16) {
        int[] iArr2 = iArr;
        float[] fArr2 = fArr;
        if (iArr2.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        } else if (fArr2 == null || fArr2.length == iArr2.length) {
            if (fArr2 != null) {
                b0(iArr2[0]).f1999d.Q = fArr2[0];
            }
            b0(iArr2[0]).f1999d.R = i14;
            E(iArr2[0], i15, i10, i11, -1);
            for (int i17 = 1; i17 < iArr2.length; i17++) {
                int i18 = i17 - 1;
                E(iArr2[i17], i15, iArr2[i18], i16, -1);
                E(iArr2[i18], i16, iArr2[i17], i15, -1);
                if (fArr2 != null) {
                    b0(iArr2[i17]).f1999d.Q = fArr2[i17];
                }
            }
            E(iArr2[iArr2.length - 1], i16, i12, i13, -1);
        } else {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
    }

    public void W0(int i10, float f10) {
        b0(i10).f2000e.f2099d = f10;
    }

    public void X(int i10, int i11, int i12, int i13, int[] iArr, float[] fArr, int i14) {
        W(i10, i11, i12, i13, iArr, fArr, i14, 6, 7);
    }

    public void X0(int i10, float f10) {
        b0(i10).f2000e.f2100e = f10;
    }

    public void Y(int i10, int i11, int i12, int i13, int[] iArr, float[] fArr, int i14) {
        int[] iArr2 = iArr;
        float[] fArr2 = fArr;
        if (iArr2.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        } else if (fArr2 == null || fArr2.length == iArr2.length) {
            if (fArr2 != null) {
                b0(iArr2[0]).f1999d.P = fArr2[0];
            }
            b0(iArr2[0]).f1999d.S = i14;
            E(iArr2[0], 3, i10, i11, 0);
            for (int i15 = 1; i15 < iArr2.length; i15++) {
                int i16 = i15 - 1;
                E(iArr2[i15], 3, iArr2[i16], 4, 0);
                E(iArr2[i16], 4, iArr2[i15], 3, 0);
                if (fArr2 != null) {
                    b0(iArr2[i15]).f1999d.P = fArr2[i15];
                }
            }
            E(iArr2[iArr2.length - 1], 4, i12, i13, 0);
        } else {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
    }

    public void Y0(int i10, float f10) {
        b0(i10).f2000e.f2101f = f10;
    }

    public void Z(androidx.constraintlayout.motion.widget.a aVar, int... iArr) {
        HashSet hashSet;
        Set<Integer> keySet = this.f1995d.keySet();
        if (iArr.length != 0) {
            hashSet = new HashSet();
            for (int valueOf : iArr) {
                hashSet.add(Integer.valueOf(valueOf));
            }
        } else {
            hashSet = new HashSet(keySet);
        }
        System.out.println(hashSet.size() + " constraints");
        StringBuilder sb2 = new StringBuilder();
        for (Integer num : (Integer[]) hashSet.toArray(new Integer[0])) {
            sb2.append("<Constraint id=");
            sb2.append(num);
            sb2.append(" \n");
            this.f1995d.get(num).f1999d.b(aVar, sb2);
            sb2.append("/>\n");
        }
        System.out.println(sb2.toString());
    }

    public void Z0(int i10, String str, String str2) {
        b0(i10).q(str, str2);
    }

    public final a a0(Context context, AttributeSet attributeSet) {
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.m.Constraint);
        u0(context, aVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    public void a1(int i10, float f10, float f11) {
        e eVar = b0(i10).f2000e;
        eVar.f2103h = f11;
        eVar.f2102g = f10;
    }

    public final a b0(int i10) {
        if (!this.f1995d.containsKey(Integer.valueOf(i10))) {
            this.f1995d.put(Integer.valueOf(i10), new a());
        }
        return this.f1995d.get(Integer.valueOf(i10));
    }

    public void b1(int i10, float f10) {
        b0(i10).f2000e.f2102g = f10;
    }

    public final void c(a.b bVar, String... strArr) {
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (this.f1993b.containsKey(strArr[i10])) {
                a aVar = this.f1993b.get(strArr[i10]);
                if (aVar.d() != bVar) {
                    throw new IllegalArgumentException("ConstraintAttribute is already a " + aVar.d().name());
                }
            } else {
                this.f1993b.put(strArr[i10], new a(strArr[i10], bVar));
            }
        }
    }

    public boolean c0(int i10) {
        return b0(i10).f2000e.f2107l;
    }

    public void c1(int i10, float f10) {
        b0(i10).f2000e.f2103h = f10;
    }

    public void d(String... strArr) {
        c(a.b.COLOR_TYPE, strArr);
    }

    public a d0(int i10) {
        if (this.f1995d.containsKey(Integer.valueOf(i10))) {
            return this.f1995d.get(Integer.valueOf(i10));
        }
        return null;
    }

    public void d1(int i10, float f10, float f11) {
        e eVar = b0(i10).f2000e;
        eVar.f2104i = f10;
        eVar.f2105j = f11;
    }

    public void e(String... strArr) {
        c(a.b.FLOAT_TYPE, strArr);
    }

    public HashMap<String, a> e0() {
        return this.f1993b;
    }

    public void e1(int i10, float f10) {
        b0(i10).f2000e.f2104i = f10;
    }

    public void f(String... strArr) {
        c(a.b.INT_TYPE, strArr);
    }

    public int f0(int i10) {
        return b0(i10).f1999d.f2035d;
    }

    public void f1(int i10, float f10) {
        b0(i10).f2000e.f2105j = f10;
    }

    public void g(String... strArr) {
        c(a.b.STRING_TYPE, strArr);
    }

    public int[] g0() {
        Integer[] numArr = (Integer[]) this.f1995d.keySet().toArray(new Integer[0]);
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = numArr[i10].intValue();
        }
        return iArr;
    }

    public void g1(int i10, float f10) {
        b0(i10).f2000e.f2106k = f10;
    }

    public void h(int i10, int i11, int i12) {
        E(i10, 1, i11, i11 == 0 ? 1 : 2, 0);
        E(i10, 2, i12, i12 == 0 ? 2 : 1, 0);
        if (i11 != 0) {
            E(i11, 2, i10, 1, 0);
        }
        if (i12 != 0) {
            E(i12, 1, i10, 2, 0);
        }
    }

    public a h0(int i10) {
        return b0(i10);
    }

    public void h1(boolean z10) {
        this.f1992a = z10;
    }

    public void i(int i10, int i11, int i12) {
        E(i10, 6, i11, i11 == 0 ? 6 : 7, 0);
        E(i10, 7, i12, i12 == 0 ? 7 : 6, 0);
        if (i11 != 0) {
            E(i11, 7, i10, 6, 0);
        }
        if (i12 != 0) {
            E(i12, 6, i10, 7, 0);
        }
    }

    public int[] i0(int i10) {
        int[] iArr = b0(i10).f1999d.f2038e0;
        return iArr == null ? new int[0] : Arrays.copyOf(iArr, iArr.length);
    }

    public void i1(int i10, float f10) {
        b0(i10).f1999d.f2060v = f10;
    }

    public void j(int i10, int i11, int i12) {
        E(i10, 3, i11, i11 == 0 ? 3 : 4, 0);
        E(i10, 4, i12, i12 == 0 ? 4 : 3, 0);
        if (i11 != 0) {
            E(i11, 4, i10, 3, 0);
        }
        if (i12 != 0) {
            E(i12, 3, i10, 4, 0);
        }
    }

    public int j0(int i10) {
        return b0(i10).f1997b.f2080b;
    }

    public void j1(int i10, int i11) {
        b0(i10).f1999d.S = i11;
    }

    public void k(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id2 = childAt.getId();
            if (!this.f1995d.containsKey(Integer.valueOf(id2))) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("id unknown ");
                sb2.append(v.c.k(childAt));
            } else if (this.f1994c && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (this.f1995d.containsKey(Integer.valueOf(id2))) {
                a.i(childAt, this.f1995d.get(Integer.valueOf(id2)).f2001f);
            }
        }
    }

    public int k0(int i10) {
        return b0(i10).f1997b.f2081c;
    }

    public void k1(int i10, float f10) {
        b0(i10).f1999d.P = f10;
    }

    public void l(ConstraintLayout constraintLayout) {
        n(constraintLayout, true);
        constraintLayout.setConstraintSet((d) null);
        constraintLayout.requestLayout();
    }

    public int l0(int i10) {
        return b0(i10).f1999d.f2033c;
    }

    public void l1(int i10, int i11) {
        b0(i10).f1997b.f2080b = i11;
    }

    public void m(ConstraintHelper constraintHelper, z.e eVar, ConstraintLayout.b bVar, SparseArray<z.e> sparseArray) {
        int id2 = constraintHelper.getId();
        if (this.f1995d.containsKey(Integer.valueOf(id2))) {
            a aVar = this.f1995d.get(Integer.valueOf(id2));
            if (eVar instanceof j) {
                constraintHelper.p(aVar, (j) eVar, bVar, sparseArray);
            }
        }
    }

    public boolean m0() {
        return this.f1994c;
    }

    public void m1(int i10, int i11) {
        b0(i10).f1997b.f2081c = i11;
    }

    public void n(ConstraintLayout constraintLayout, boolean z10) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f1995d.keySet());
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id2 = childAt.getId();
            if (!this.f1995d.containsKey(Integer.valueOf(id2))) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("id unknown ");
                sb2.append(v.c.k(childAt));
            } else if (this.f1994c && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (id2 != -1) {
                if (this.f1995d.containsKey(Integer.valueOf(id2))) {
                    hashSet.remove(Integer.valueOf(id2));
                    a aVar = this.f1995d.get(Integer.valueOf(id2));
                    if (childAt instanceof Barrier) {
                        aVar.f1999d.f2036d0 = 1;
                    }
                    int i11 = aVar.f1999d.f2036d0;
                    if (i11 != -1 && i11 == 1) {
                        Barrier barrier = (Barrier) childAt;
                        barrier.setId(id2);
                        barrier.setType(aVar.f1999d.f2032b0);
                        barrier.setMargin(aVar.f1999d.f2034c0);
                        barrier.setAllowsGoneWidget(aVar.f1999d.f2048j0);
                        b bVar = aVar.f1999d;
                        int[] iArr = bVar.f2038e0;
                        if (iArr != null) {
                            barrier.setReferencedIds(iArr);
                        } else {
                            String str = bVar.f2040f0;
                            if (str != null) {
                                bVar.f2038e0 = S(barrier, str);
                                barrier.setReferencedIds(aVar.f1999d.f2038e0);
                            }
                        }
                    }
                    ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                    bVar2.e();
                    aVar.h(bVar2);
                    if (z10) {
                        a.i(childAt, aVar.f2001f);
                    }
                    childAt.setLayoutParams(bVar2);
                    C0030d dVar = aVar.f1997b;
                    if (dVar.f2081c == 0) {
                        childAt.setVisibility(dVar.f2080b);
                    }
                    childAt.setAlpha(aVar.f1997b.f2082d);
                    childAt.setRotation(aVar.f2000e.f2097b);
                    childAt.setRotationX(aVar.f2000e.f2098c);
                    childAt.setRotationY(aVar.f2000e.f2099d);
                    childAt.setScaleX(aVar.f2000e.f2100e);
                    childAt.setScaleY(aVar.f2000e.f2101f);
                    if (!Float.isNaN(aVar.f2000e.f2102g)) {
                        childAt.setPivotX(aVar.f2000e.f2102g);
                    }
                    if (!Float.isNaN(aVar.f2000e.f2103h)) {
                        childAt.setPivotY(aVar.f2000e.f2103h);
                    }
                    childAt.setTranslationX(aVar.f2000e.f2104i);
                    childAt.setTranslationY(aVar.f2000e.f2105j);
                    childAt.setTranslationZ(aVar.f2000e.f2106k);
                    e eVar = aVar.f2000e;
                    if (eVar.f2107l) {
                        childAt.setElevation(eVar.f2108m);
                    }
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("WARNING NO CONSTRAINTS for view ");
                    sb3.append(id2);
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar2 = this.f1995d.get(num);
            int i12 = aVar2.f1999d.f2036d0;
            if (i12 != -1 && i12 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                b bVar3 = aVar2.f1999d;
                int[] iArr2 = bVar3.f2038e0;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str2 = bVar3.f2040f0;
                    if (str2 != null) {
                        bVar3.f2038e0 = S(barrier2, str2);
                        barrier2.setReferencedIds(aVar2.f1999d.f2038e0);
                    }
                }
                barrier2.setType(aVar2.f1999d.f2032b0);
                barrier2.setMargin(aVar2.f1999d.f2034c0);
                ConstraintLayout.b k10 = constraintLayout.generateDefaultLayoutParams();
                barrier2.y();
                aVar2.h(k10);
                constraintLayout.addView(barrier2, k10);
            }
            if (aVar2.f1999d.f2029a) {
                Guideline guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                ConstraintLayout.b k11 = constraintLayout.generateDefaultLayoutParams();
                aVar2.h(k11);
                constraintLayout.addView(guideline, k11);
            }
        }
    }

    public void n0(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a a02 = a0(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        a02.f1999d.f2029a = true;
                    }
                    this.f1995d.put(Integer.valueOf(a02.f1996a), a02);
                }
            }
        } catch (XmlPullParserException e10) {
            e10.printStackTrace();
        } catch (IOException e11) {
            e11.printStackTrace();
        }
    }

    public final String n1(int i10) {
        switch (i10) {
            case 1:
                return n7.b.U;
            case 2:
                return n7.b.W;
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return n7.b.X;
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    public void o(int i10, ConstraintLayout.b bVar) {
        if (this.f1995d.containsKey(Integer.valueOf(i10))) {
            this.f1995d.get(Integer.valueOf(i10)).h(bVar);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0179, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void o0(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            r9 = this;
            int r0 = r11.getEventType()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1 = 0
            r2 = r1
        L_0x0006:
            r3 = 1
            if (r0 == r3) goto L_0x0188
            if (r0 == 0) goto L_0x0176
            java.lang.String r4 = "Constraint"
            r5 = 3
            r6 = 2
            if (r0 == r6) goto L_0x0036
            if (r0 == r5) goto L_0x0015
            goto L_0x0179
        L_0x0015:
            java.lang.String r0 = r11.getName()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.String r3 = "ConstraintSet"
            boolean r3 = r3.equals(r0)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            if (r3 == 0) goto L_0x0022
            return
        L_0x0022:
            boolean r0 = r0.equalsIgnoreCase(r4)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            if (r0 == 0) goto L_0x0179
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.d$a> r0 = r9.f1995d     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            int r3 = r2.f1996a     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r0.put(r3, r2)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r2 = r1
            goto L_0x0179
        L_0x0036:
            java.lang.String r0 = r11.getName()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r7 = -1
            int r8 = r0.hashCode()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            switch(r8) {
                case -2025855158: goto L_0x0086;
                case -1984451626: goto L_0x007c;
                case -1269513683: goto L_0x0073;
                case -1238332596: goto L_0x0069;
                case -71750448: goto L_0x005f;
                case 1331510167: goto L_0x0055;
                case 1791837707: goto L_0x004b;
                case 1803088381: goto L_0x0043;
                default: goto L_0x0042;
            }     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
        L_0x0042:
            goto L_0x0090
        L_0x0043:
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            if (r0 == 0) goto L_0x0090
            r5 = 0
            goto L_0x0091
        L_0x004b:
            java.lang.String r4 = "CustomAttribute"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            if (r0 == 0) goto L_0x0090
            r5 = 7
            goto L_0x0091
        L_0x0055:
            java.lang.String r4 = "Barrier"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            if (r0 == 0) goto L_0x0090
            r5 = r6
            goto L_0x0091
        L_0x005f:
            java.lang.String r4 = "Guideline"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            if (r0 == 0) goto L_0x0090
            r5 = r3
            goto L_0x0091
        L_0x0069:
            java.lang.String r4 = "Transform"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            if (r0 == 0) goto L_0x0090
            r5 = 4
            goto L_0x0091
        L_0x0073:
            java.lang.String r4 = "PropertySet"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            if (r0 == 0) goto L_0x0090
            goto L_0x0091
        L_0x007c:
            java.lang.String r4 = "Motion"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            if (r0 == 0) goto L_0x0090
            r5 = 6
            goto L_0x0091
        L_0x0086:
            java.lang.String r4 = "Layout"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            if (r0 == 0) goto L_0x0090
            r5 = 5
            goto L_0x0091
        L_0x0090:
            r5 = r7
        L_0x0091:
            java.lang.String r0 = "XML parser error must be within a Constraint "
            switch(r5) {
                case 0: goto L_0x016c;
                case 1: goto L_0x015d;
                case 2: goto L_0x0150;
                case 3: goto L_0x012b;
                case 4: goto L_0x0106;
                case 5: goto L_0x00e0;
                case 6: goto L_0x00ba;
                case 7: goto L_0x0098;
                default: goto L_0x0096;
            }
        L_0x0096:
            goto L_0x0179
        L_0x0098:
            if (r2 == 0) goto L_0x00a1
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.a> r0 = r2.f2001f     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            androidx.constraintlayout.widget.a.h(r10, r11, r0)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            goto L_0x0179
        L_0x00a1:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            throw r10     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
        L_0x00ba:
            if (r2 == 0) goto L_0x00c7
            androidx.constraintlayout.widget.d$c r0 = r2.f1998c     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r0.b(r10, r3)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            goto L_0x0179
        L_0x00c7:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            throw r10     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
        L_0x00e0:
            if (r2 == 0) goto L_0x00ed
            androidx.constraintlayout.widget.d$b r0 = r2.f1999d     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r0.c(r10, r3)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            goto L_0x0179
        L_0x00ed:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            throw r10     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
        L_0x0106:
            if (r2 == 0) goto L_0x0112
            androidx.constraintlayout.widget.d$e r0 = r2.f2000e     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r0.b(r10, r3)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            goto L_0x0179
        L_0x0112:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            throw r10     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
        L_0x012b:
            if (r2 == 0) goto L_0x0137
            androidx.constraintlayout.widget.d$d r0 = r2.f1997b     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r0.b(r10, r3)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            goto L_0x0179
        L_0x0137:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.<init>()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.append(r0)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r1.append(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            java.lang.String r11 = r1.toString()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            throw r10     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
        L_0x0150:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            androidx.constraintlayout.widget.d$a r0 = r9.a0(r10, r0)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            androidx.constraintlayout.widget.d$b r2 = r0.f1999d     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r2.f2036d0 = r3     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            goto L_0x0174
        L_0x015d:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            androidx.constraintlayout.widget.d$a r0 = r9.a0(r10, r0)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            androidx.constraintlayout.widget.d$b r2 = r0.f1999d     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r2.f2029a = r3     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            r2.f2031b = r3     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            goto L_0x0174
        L_0x016c:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            androidx.constraintlayout.widget.d$a r0 = r9.a0(r10, r0)     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
        L_0x0174:
            r2 = r0
            goto L_0x0179
        L_0x0176:
            r11.getName()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
        L_0x0179:
            int r0 = r11.next()     // Catch:{ XmlPullParserException -> 0x0184, IOException -> 0x017f }
            goto L_0x0006
        L_0x017f:
            r10 = move-exception
            r10.printStackTrace()
            goto L_0x0188
        L_0x0184:
            r10 = move-exception
            r10.printStackTrace()
        L_0x0188:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.d.o0(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    public void p(ConstraintLayout constraintLayout) {
        n(constraintLayout, false);
        constraintLayout.setConstraintSet((d) null);
    }

    public void q(int i10, int i11, int i12, int i13, int i14, int i15, int i16, float f10) {
        int i17;
        int i18;
        d dVar;
        int i19 = i12;
        float f11 = f10;
        if (i13 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        } else if (i16 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        } else if (f11 <= 0.0f || f11 > 1.0f) {
            throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
        } else {
            if (i19 == 1 || i19 == 2) {
                dVar = this;
                i18 = i10;
                dVar.E(i18, 1, i11, i12, i13);
                i17 = 2;
            } else if (i19 == 6 || i19 == 7) {
                dVar = this;
                i18 = i10;
                dVar.E(i18, 6, i11, i12, i13);
                i17 = 7;
            } else {
                int i20 = i10;
                E(i20, 3, i11, i12, i13);
                E(i20, 4, i14, i15, i16);
                this.f1995d.get(Integer.valueOf(i10)).f1999d.f2060v = f11;
                return;
            }
            dVar.E(i18, i17, i14, i15, i16);
            this.f1995d.get(Integer.valueOf(i10)).f1999d.f2059u = f11;
        }
    }

    public void q0(a aVar, String str) {
        String[] split = str.split(",");
        for (int i10 = 0; i10 < split.length; i10++) {
            String[] split2 = split[i10].split(l.f14755k);
            if (split2.length != 2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(" Unable to parse ");
                sb2.append(split[i10]);
            } else {
                aVar.n(split2[0], Color.parseColor(split2[1]));
            }
        }
    }

    public void r(int i10, int i11) {
        float f10;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        d dVar;
        if (i11 == 0) {
            i17 = 0;
            i16 = 1;
            i15 = 0;
            i14 = 0;
            i13 = 2;
            i12 = 0;
            f10 = 0.5f;
            dVar = this;
            i18 = i10;
        } else {
            i16 = 2;
            i15 = 0;
            i13 = 1;
            i12 = 0;
            f10 = 0.5f;
            dVar = this;
            i18 = i10;
            i17 = i11;
            i14 = i11;
        }
        dVar.q(i18, i17, i16, i15, i14, i13, i12, f10);
    }

    public void r0(a aVar, String str) {
        String[] split = str.split(",");
        for (int i10 = 0; i10 < split.length; i10++) {
            String[] split2 = split[i10].split(l.f14755k);
            if (split2.length != 2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(" Unable to parse ");
                sb2.append(split[i10]);
            } else {
                aVar.o(split2[0], Float.parseFloat(split2[1]));
            }
        }
    }

    public void s(int i10, int i11, int i12, int i13, int i14, int i15, int i16, float f10) {
        E(i10, 1, i11, i12, i13);
        E(i10, 2, i14, i15, i16);
        this.f1995d.get(Integer.valueOf(i10)).f1999d.f2059u = f10;
    }

    public void s0(a aVar, String str) {
        String[] split = str.split(",");
        for (int i10 = 0; i10 < split.length; i10++) {
            String[] split2 = split[i10].split(l.f14755k);
            if (split2.length != 2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(" Unable to parse ");
                sb2.append(split[i10]);
            } else {
                aVar.o(split2[0], (float) Integer.decode(split2[1]).intValue());
            }
        }
    }

    public void t(int i10, int i11) {
        float f10;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        d dVar;
        if (i11 == 0) {
            i17 = 0;
            i16 = 6;
            i15 = 0;
            i14 = 0;
            i13 = 7;
            i12 = 0;
            f10 = 0.5f;
            dVar = this;
            i18 = i10;
        } else {
            i16 = 7;
            i15 = 0;
            i13 = 6;
            i12 = 0;
            f10 = 0.5f;
            dVar = this;
            i18 = i10;
            i17 = i11;
            i14 = i11;
        }
        dVar.q(i18, i17, i16, i15, i14, i13, i12, f10);
    }

    public void t0(a aVar, String str) {
        String[] o12 = o1(str);
        for (int i10 = 0; i10 < o12.length; i10++) {
            String[] split = o12[i10].split(l.f14755k);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" Unable to parse ");
            sb2.append(o12[i10]);
            aVar.q(split[0], split[1]);
        }
    }

    public void u(int i10, int i11, int i12, int i13, int i14, int i15, int i16, float f10) {
        E(i10, 6, i11, i12, i13);
        E(i10, 7, i14, i15, i16);
        this.f1995d.get(Integer.valueOf(i10)).f1999d.f2059u = f10;
    }

    public final void u0(Context context, a aVar, TypedArray typedArray) {
        c cVar;
        String str;
        String str2;
        StringBuilder sb2;
        int indexCount = typedArray.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            if (!(index == e.m.Constraint_android_id || e.m.Constraint_android_layout_marginStart == index || e.m.Constraint_android_layout_marginEnd == index)) {
                aVar.f1998c.f2072a = true;
                aVar.f1999d.f2031b = true;
                aVar.f1997b.f2079a = true;
                aVar.f2000e.f2096a = true;
            }
            switch (I.get(index)) {
                case 1:
                    b bVar = aVar.f1999d;
                    bVar.f2054p = p0(typedArray, index, bVar.f2054p);
                    continue;
                case 2:
                    b bVar2 = aVar.f1999d;
                    bVar2.G = typedArray.getDimensionPixelSize(index, bVar2.G);
                    continue;
                case 3:
                    b bVar3 = aVar.f1999d;
                    bVar3.f2053o = p0(typedArray, index, bVar3.f2053o);
                    continue;
                case 4:
                    b bVar4 = aVar.f1999d;
                    bVar4.f2052n = p0(typedArray, index, bVar4.f2052n);
                    continue;
                case 5:
                    aVar.f1999d.f2061w = typedArray.getString(index);
                    continue;
                case 6:
                    b bVar5 = aVar.f1999d;
                    bVar5.A = typedArray.getDimensionPixelOffset(index, bVar5.A);
                    continue;
                case 7:
                    b bVar6 = aVar.f1999d;
                    bVar6.B = typedArray.getDimensionPixelOffset(index, bVar6.B);
                    continue;
                case 8:
                    b bVar7 = aVar.f1999d;
                    bVar7.H = typedArray.getDimensionPixelSize(index, bVar7.H);
                    continue;
                case 9:
                    b bVar8 = aVar.f1999d;
                    bVar8.f2058t = p0(typedArray, index, bVar8.f2058t);
                    continue;
                case 10:
                    b bVar9 = aVar.f1999d;
                    bVar9.f2057s = p0(typedArray, index, bVar9.f2057s);
                    continue;
                case 11:
                    b bVar10 = aVar.f1999d;
                    bVar10.M = typedArray.getDimensionPixelSize(index, bVar10.M);
                    continue;
                case 12:
                    b bVar11 = aVar.f1999d;
                    bVar11.N = typedArray.getDimensionPixelSize(index, bVar11.N);
                    continue;
                case 13:
                    b bVar12 = aVar.f1999d;
                    bVar12.J = typedArray.getDimensionPixelSize(index, bVar12.J);
                    continue;
                case 14:
                    b bVar13 = aVar.f1999d;
                    bVar13.L = typedArray.getDimensionPixelSize(index, bVar13.L);
                    continue;
                case 15:
                    b bVar14 = aVar.f1999d;
                    bVar14.O = typedArray.getDimensionPixelSize(index, bVar14.O);
                    continue;
                case 16:
                    b bVar15 = aVar.f1999d;
                    bVar15.K = typedArray.getDimensionPixelSize(index, bVar15.K);
                    continue;
                case 17:
                    b bVar16 = aVar.f1999d;
                    bVar16.f2037e = typedArray.getDimensionPixelOffset(index, bVar16.f2037e);
                    continue;
                case 18:
                    b bVar17 = aVar.f1999d;
                    bVar17.f2039f = typedArray.getDimensionPixelOffset(index, bVar17.f2039f);
                    continue;
                case 19:
                    b bVar18 = aVar.f1999d;
                    bVar18.f2041g = typedArray.getFloat(index, bVar18.f2041g);
                    continue;
                case 20:
                    b bVar19 = aVar.f1999d;
                    bVar19.f2059u = typedArray.getFloat(index, bVar19.f2059u);
                    continue;
                case 21:
                    b bVar20 = aVar.f1999d;
                    bVar20.f2035d = typedArray.getLayoutDimension(index, bVar20.f2035d);
                    continue;
                case 22:
                    C0030d dVar = aVar.f1997b;
                    dVar.f2080b = typedArray.getInt(index, dVar.f2080b);
                    C0030d dVar2 = aVar.f1997b;
                    dVar2.f2080b = G[dVar2.f2080b];
                    continue;
                case 23:
                    b bVar21 = aVar.f1999d;
                    bVar21.f2033c = typedArray.getLayoutDimension(index, bVar21.f2033c);
                    continue;
                case 24:
                    b bVar22 = aVar.f1999d;
                    bVar22.D = typedArray.getDimensionPixelSize(index, bVar22.D);
                    continue;
                case 25:
                    b bVar23 = aVar.f1999d;
                    bVar23.f2043h = p0(typedArray, index, bVar23.f2043h);
                    continue;
                case 26:
                    b bVar24 = aVar.f1999d;
                    bVar24.f2045i = p0(typedArray, index, bVar24.f2045i);
                    continue;
                case 27:
                    b bVar25 = aVar.f1999d;
                    bVar25.C = typedArray.getInt(index, bVar25.C);
                    continue;
                case 28:
                    b bVar26 = aVar.f1999d;
                    bVar26.E = typedArray.getDimensionPixelSize(index, bVar26.E);
                    continue;
                case 29:
                    b bVar27 = aVar.f1999d;
                    bVar27.f2047j = p0(typedArray, index, bVar27.f2047j);
                    continue;
                case 30:
                    b bVar28 = aVar.f1999d;
                    bVar28.f2049k = p0(typedArray, index, bVar28.f2049k);
                    continue;
                case 31:
                    b bVar29 = aVar.f1999d;
                    bVar29.I = typedArray.getDimensionPixelSize(index, bVar29.I);
                    continue;
                case 32:
                    b bVar30 = aVar.f1999d;
                    bVar30.f2055q = p0(typedArray, index, bVar30.f2055q);
                    continue;
                case 33:
                    b bVar31 = aVar.f1999d;
                    bVar31.f2056r = p0(typedArray, index, bVar31.f2056r);
                    continue;
                case 34:
                    b bVar32 = aVar.f1999d;
                    bVar32.F = typedArray.getDimensionPixelSize(index, bVar32.F);
                    continue;
                case 35:
                    b bVar33 = aVar.f1999d;
                    bVar33.f2051m = p0(typedArray, index, bVar33.f2051m);
                    continue;
                case 36:
                    b bVar34 = aVar.f1999d;
                    bVar34.f2050l = p0(typedArray, index, bVar34.f2050l);
                    continue;
                case 37:
                    b bVar35 = aVar.f1999d;
                    bVar35.f2060v = typedArray.getFloat(index, bVar35.f2060v);
                    continue;
                case 38:
                    aVar.f1996a = typedArray.getResourceId(index, aVar.f1996a);
                    continue;
                case 39:
                    b bVar36 = aVar.f1999d;
                    bVar36.Q = typedArray.getFloat(index, bVar36.Q);
                    continue;
                case 40:
                    b bVar37 = aVar.f1999d;
                    bVar37.P = typedArray.getFloat(index, bVar37.P);
                    continue;
                case 41:
                    b bVar38 = aVar.f1999d;
                    bVar38.R = typedArray.getInt(index, bVar38.R);
                    continue;
                case 42:
                    b bVar39 = aVar.f1999d;
                    bVar39.S = typedArray.getInt(index, bVar39.S);
                    continue;
                case 43:
                    C0030d dVar3 = aVar.f1997b;
                    dVar3.f2082d = typedArray.getFloat(index, dVar3.f2082d);
                    continue;
                case 44:
                    e eVar = aVar.f2000e;
                    eVar.f2107l = true;
                    eVar.f2108m = typedArray.getDimension(index, eVar.f2108m);
                    continue;
                case 45:
                    e eVar2 = aVar.f2000e;
                    eVar2.f2098c = typedArray.getFloat(index, eVar2.f2098c);
                    continue;
                case 46:
                    e eVar3 = aVar.f2000e;
                    eVar3.f2099d = typedArray.getFloat(index, eVar3.f2099d);
                    continue;
                case 47:
                    e eVar4 = aVar.f2000e;
                    eVar4.f2100e = typedArray.getFloat(index, eVar4.f2100e);
                    continue;
                case 48:
                    e eVar5 = aVar.f2000e;
                    eVar5.f2101f = typedArray.getFloat(index, eVar5.f2101f);
                    continue;
                case 49:
                    e eVar6 = aVar.f2000e;
                    eVar6.f2102g = typedArray.getDimension(index, eVar6.f2102g);
                    continue;
                case 50:
                    e eVar7 = aVar.f2000e;
                    eVar7.f2103h = typedArray.getDimension(index, eVar7.f2103h);
                    continue;
                case 51:
                    e eVar8 = aVar.f2000e;
                    eVar8.f2104i = typedArray.getDimension(index, eVar8.f2104i);
                    continue;
                case 52:
                    e eVar9 = aVar.f2000e;
                    eVar9.f2105j = typedArray.getDimension(index, eVar9.f2105j);
                    continue;
                case 53:
                    e eVar10 = aVar.f2000e;
                    eVar10.f2106k = typedArray.getDimension(index, eVar10.f2106k);
                    continue;
                case 54:
                    b bVar40 = aVar.f1999d;
                    bVar40.T = typedArray.getInt(index, bVar40.T);
                    continue;
                case 55:
                    b bVar41 = aVar.f1999d;
                    bVar41.U = typedArray.getInt(index, bVar41.U);
                    continue;
                case 56:
                    b bVar42 = aVar.f1999d;
                    bVar42.V = typedArray.getDimensionPixelSize(index, bVar42.V);
                    continue;
                case 57:
                    b bVar43 = aVar.f1999d;
                    bVar43.W = typedArray.getDimensionPixelSize(index, bVar43.W);
                    continue;
                case 58:
                    b bVar44 = aVar.f1999d;
                    bVar44.X = typedArray.getDimensionPixelSize(index, bVar44.X);
                    continue;
                case 59:
                    b bVar45 = aVar.f1999d;
                    bVar45.Y = typedArray.getDimensionPixelSize(index, bVar45.Y);
                    continue;
                case 60:
                    e eVar11 = aVar.f2000e;
                    eVar11.f2097b = typedArray.getFloat(index, eVar11.f2097b);
                    continue;
                case 61:
                    b bVar46 = aVar.f1999d;
                    bVar46.f2062x = p0(typedArray, index, bVar46.f2062x);
                    continue;
                case 62:
                    b bVar47 = aVar.f1999d;
                    bVar47.f2063y = typedArray.getDimensionPixelSize(index, bVar47.f2063y);
                    continue;
                case 63:
                    b bVar48 = aVar.f1999d;
                    bVar48.f2064z = typedArray.getFloat(index, bVar48.f2064z);
                    continue;
                case 64:
                    c cVar2 = aVar.f1998c;
                    cVar2.f2073b = p0(typedArray, index, cVar2.f2073b);
                    continue;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        cVar = aVar.f1998c;
                        str = typedArray.getString(index);
                    } else {
                        cVar = aVar.f1998c;
                        str = u.c.f13300k[typedArray.getInteger(index, 0)];
                    }
                    cVar.f2074c = str;
                    continue;
                case 66:
                    aVar.f1998c.f2076e = typedArray.getInt(index, 0);
                    continue;
                case 67:
                    c cVar3 = aVar.f1998c;
                    cVar3.f2078g = typedArray.getFloat(index, cVar3.f2078g);
                    continue;
                case 68:
                    C0030d dVar4 = aVar.f1997b;
                    dVar4.f2083e = typedArray.getFloat(index, dVar4.f2083e);
                    continue;
                case 69:
                    aVar.f1999d.Z = typedArray.getFloat(index, 1.0f);
                    continue;
                case 70:
                    aVar.f1999d.f2030a0 = typedArray.getFloat(index, 1.0f);
                    continue;
                case 71:
                    break;
                case 72:
                    b bVar49 = aVar.f1999d;
                    bVar49.f2032b0 = typedArray.getInt(index, bVar49.f2032b0);
                    continue;
                case 73:
                    b bVar50 = aVar.f1999d;
                    bVar50.f2034c0 = typedArray.getDimensionPixelSize(index, bVar50.f2034c0);
                    continue;
                case 74:
                    aVar.f1999d.f2040f0 = typedArray.getString(index);
                    continue;
                case 75:
                    b bVar51 = aVar.f1999d;
                    bVar51.f2048j0 = typedArray.getBoolean(index, bVar51.f2048j0);
                    continue;
                case 76:
                    c cVar4 = aVar.f1998c;
                    cVar4.f2075d = typedArray.getInt(index, cVar4.f2075d);
                    continue;
                case 77:
                    aVar.f1999d.f2042g0 = typedArray.getString(index);
                    continue;
                case 78:
                    C0030d dVar5 = aVar.f1997b;
                    dVar5.f2081c = typedArray.getInt(index, dVar5.f2081c);
                    continue;
                case 79:
                    c cVar5 = aVar.f1998c;
                    cVar5.f2077f = typedArray.getFloat(index, cVar5.f2077f);
                    continue;
                case 80:
                    b bVar52 = aVar.f1999d;
                    bVar52.f2044h0 = typedArray.getBoolean(index, bVar52.f2044h0);
                    continue;
                case 81:
                    b bVar53 = aVar.f1999d;
                    bVar53.f2046i0 = typedArray.getBoolean(index, bVar53.f2046i0);
                    continue;
                case 82:
                    sb2 = new StringBuilder();
                    str2 = "unused attribute 0x";
                    break;
                default:
                    sb2 = new StringBuilder();
                    str2 = "Unknown attribute 0x";
                    break;
            }
            sb2.append(str2);
            sb2.append(Integer.toHexString(index));
            sb2.append("   ");
            sb2.append(I.get(index));
        }
    }

    public void v(int i10, int i11) {
        float f10;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        d dVar;
        if (i11 == 0) {
            i17 = 0;
            i16 = 3;
            i15 = 0;
            i14 = 0;
            i13 = 4;
            i12 = 0;
            f10 = 0.5f;
            dVar = this;
            i18 = i10;
        } else {
            i16 = 4;
            i15 = 0;
            i13 = 3;
            i12 = 0;
            f10 = 0.5f;
            dVar = this;
            i18 = i10;
            i17 = i11;
            i14 = i11;
        }
        dVar.q(i18, i17, i16, i15, i14, i13, i12, f10);
    }

    public void v0(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = constraintLayout.getChildAt(i10);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (!this.f1994c || id2 != -1) {
                if (!this.f1995d.containsKey(Integer.valueOf(id2))) {
                    this.f1995d.put(Integer.valueOf(id2), new a());
                }
                a aVar = this.f1995d.get(Integer.valueOf(id2));
                if (!aVar.f1999d.f2031b) {
                    aVar.j(id2, bVar);
                    if (childAt instanceof ConstraintHelper) {
                        aVar.f1999d.f2038e0 = ((ConstraintHelper) childAt).getReferencedIds();
                        if (childAt instanceof Barrier) {
                            Barrier barrier = (Barrier) childAt;
                            aVar.f1999d.f2048j0 = barrier.z();
                            aVar.f1999d.f2032b0 = barrier.getType();
                            aVar.f1999d.f2034c0 = barrier.getMargin();
                        }
                    }
                    aVar.f1999d.f2031b = true;
                }
                C0030d dVar = aVar.f1997b;
                if (!dVar.f2079a) {
                    dVar.f2080b = childAt.getVisibility();
                    aVar.f1997b.f2082d = childAt.getAlpha();
                    aVar.f1997b.f2079a = true;
                }
                e eVar = aVar.f2000e;
                if (!eVar.f2096a) {
                    eVar.f2096a = true;
                    eVar.f2097b = childAt.getRotation();
                    aVar.f2000e.f2098c = childAt.getRotationX();
                    aVar.f2000e.f2099d = childAt.getRotationY();
                    aVar.f2000e.f2100e = childAt.getScaleX();
                    aVar.f2000e.f2101f = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                        e eVar2 = aVar.f2000e;
                        eVar2.f2102g = pivotX;
                        eVar2.f2103h = pivotY;
                    }
                    aVar.f2000e.f2104i = childAt.getTranslationX();
                    aVar.f2000e.f2105j = childAt.getTranslationY();
                    aVar.f2000e.f2106k = childAt.getTranslationZ();
                    e eVar3 = aVar.f2000e;
                    if (eVar3.f2107l) {
                        eVar3.f2108m = childAt.getElevation();
                    }
                }
                i10++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public void w(int i10, int i11, int i12, int i13, int i14, int i15, int i16, float f10) {
        E(i10, 3, i11, i12, i13);
        E(i10, 4, i14, i15, i16);
        this.f1995d.get(Integer.valueOf(i10)).f1999d.f2060v = f10;
    }

    public void w0(d dVar) {
        for (Integer next : dVar.f1995d.keySet()) {
            int intValue = next.intValue();
            a aVar = dVar.f1995d.get(next);
            if (!this.f1995d.containsKey(Integer.valueOf(intValue))) {
                this.f1995d.put(Integer.valueOf(intValue), new a());
            }
            a aVar2 = this.f1995d.get(Integer.valueOf(intValue));
            b bVar = aVar2.f1999d;
            if (!bVar.f2031b) {
                bVar.a(aVar.f1999d);
            }
            C0030d dVar2 = aVar2.f1997b;
            if (!dVar2.f2079a) {
                dVar2.a(aVar.f1997b);
            }
            e eVar = aVar2.f2000e;
            if (!eVar.f2096a) {
                eVar.a(aVar.f2000e);
            }
            c cVar = aVar2.f1998c;
            if (!cVar.f2072a) {
                cVar.a(aVar.f1998c);
            }
            for (String next2 : aVar.f2001f.keySet()) {
                if (!aVar2.f2001f.containsKey(next2)) {
                    aVar2.f2001f.put(next2, aVar.f2001f.get(next2));
                }
            }
        }
    }

    public void x(int i10) {
        this.f1995d.remove(Integer.valueOf(i10));
    }

    public void x0(String str) {
        this.f1993b.remove(str);
    }

    public void y(int i10, int i11) {
        if (this.f1995d.containsKey(Integer.valueOf(i10))) {
            a aVar = this.f1995d.get(Integer.valueOf(i10));
            switch (i11) {
                case 1:
                    b bVar = aVar.f1999d;
                    bVar.f2045i = -1;
                    bVar.f2043h = -1;
                    bVar.D = -1;
                    bVar.J = -1;
                    return;
                case 2:
                    b bVar2 = aVar.f1999d;
                    bVar2.f2049k = -1;
                    bVar2.f2047j = -1;
                    bVar2.E = -1;
                    bVar2.L = -1;
                    return;
                case 3:
                    b bVar3 = aVar.f1999d;
                    bVar3.f2051m = -1;
                    bVar3.f2050l = -1;
                    bVar3.F = -1;
                    bVar3.K = -1;
                    return;
                case 4:
                    b bVar4 = aVar.f1999d;
                    bVar4.f2052n = -1;
                    bVar4.f2053o = -1;
                    bVar4.G = -1;
                    bVar4.M = -1;
                    return;
                case 5:
                    aVar.f1999d.f2054p = -1;
                    return;
                case 6:
                    b bVar5 = aVar.f1999d;
                    bVar5.f2055q = -1;
                    bVar5.f2056r = -1;
                    bVar5.I = -1;
                    bVar5.O = -1;
                    return;
                case 7:
                    b bVar6 = aVar.f1999d;
                    bVar6.f2057s = -1;
                    bVar6.f2058t = -1;
                    bVar6.H = -1;
                    bVar6.N = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    public void y0(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        d dVar;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        d dVar2;
        int i21;
        if (this.f1995d.containsKey(Integer.valueOf(i10))) {
            b bVar = this.f1995d.get(Integer.valueOf(i10)).f1999d;
            int i22 = bVar.f2045i;
            int i23 = bVar.f2047j;
            if (i22 == -1 && i23 == -1) {
                int i24 = bVar.f2055q;
                int i25 = bVar.f2057s;
                if (!(i24 == -1 && i25 == -1)) {
                    if (i24 != -1 && i25 != -1) {
                        i20 = 0;
                        dVar2 = this;
                        dVar2.E(i24, 7, i25, 6, 0);
                        i18 = 6;
                        i19 = 7;
                        i21 = i25;
                        i17 = i22;
                    } else if (!(i22 == -1 && i25 == -1)) {
                        i17 = bVar.f2049k;
                        if (i17 != -1) {
                            i18 = 7;
                            i19 = 7;
                            i20 = 0;
                            dVar2 = this;
                            i21 = i22;
                        } else {
                            i17 = bVar.f2043h;
                            if (i17 != -1) {
                                i18 = 6;
                                i19 = 6;
                                i20 = 0;
                                dVar2 = this;
                                i21 = i25;
                            }
                        }
                    }
                    dVar2.E(i21, i18, i17, i19, i20);
                }
                y(i10, 6);
                i11 = 7;
            } else {
                if (i22 == -1 || i23 == -1) {
                    if (!(i22 == -1 && i23 == -1)) {
                        i12 = bVar.f2049k;
                        if (i12 != -1) {
                            i13 = 2;
                            i14 = 2;
                            i15 = 0;
                            dVar = this;
                            i16 = i22;
                        } else {
                            i12 = bVar.f2043h;
                            if (i12 != -1) {
                                i13 = 1;
                                i14 = 1;
                                i15 = 0;
                                dVar = this;
                                i16 = i23;
                            }
                        }
                    }
                    y(i10, 1);
                    i11 = 2;
                } else {
                    i15 = 0;
                    dVar = this;
                    dVar.E(i22, 2, i23, 1, 0);
                    i13 = 1;
                    i14 = 2;
                    i16 = i23;
                    i12 = i22;
                }
                dVar.E(i16, i13, i12, i14, i15);
                y(i10, 1);
                i11 = 2;
            }
            y(i10, i11);
        }
    }

    public void z(Context context, int i10) {
        A((ConstraintLayout) LayoutInflater.from(context).inflate(i10, (ViewGroup) null));
    }

    public void z0(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        d dVar;
        int i15;
        if (this.f1995d.containsKey(Integer.valueOf(i10))) {
            b bVar = this.f1995d.get(Integer.valueOf(i10)).f1999d;
            int i16 = bVar.f2051m;
            int i17 = bVar.f2052n;
            if (!(i16 == -1 && i17 == -1)) {
                if (i16 != -1 && i17 != -1) {
                    i14 = 0;
                    dVar = this;
                    dVar.E(i16, 4, i17, 3, 0);
                    i12 = 3;
                    i13 = 4;
                    i15 = i17;
                    i11 = i16;
                } else if (!(i16 == -1 && i17 == -1)) {
                    i11 = bVar.f2053o;
                    if (i11 != -1) {
                        i12 = 4;
                        i13 = 4;
                        i14 = 0;
                        dVar = this;
                        i15 = i16;
                    } else {
                        i11 = bVar.f2050l;
                        if (i11 != -1) {
                            i12 = 3;
                            i13 = 3;
                            i14 = 0;
                            dVar = this;
                            i15 = i17;
                        }
                    }
                }
                dVar.E(i15, i12, i11, i13, i14);
            }
        }
        y(i10, 3);
        y(i10, 4);
    }
}
