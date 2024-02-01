package j3;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import d.m0;
import d.t0;
import d.x0;
import f1.w1;
import java.io.IOException;
import java.util.ArrayList;
import k0.l;
import n0.n0;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class i extends h {
    public static final String Y = "VectorDrawableCompat";
    public static final PorterDuff.Mode Z = PorterDuff.Mode.SRC_IN;

    /* renamed from: a0  reason: collision with root package name */
    public static final String f9449a0 = "clip-path";

    /* renamed from: b0  reason: collision with root package name */
    public static final String f9450b0 = "group";

    /* renamed from: c0  reason: collision with root package name */
    public static final String f9451c0 = "path";

    /* renamed from: d0  reason: collision with root package name */
    public static final String f9452d0 = "vector";

    /* renamed from: e0  reason: collision with root package name */
    public static final int f9453e0 = 0;

    /* renamed from: f0  reason: collision with root package name */
    public static final int f9454f0 = 1;

    /* renamed from: g0  reason: collision with root package name */
    public static final int f9455g0 = 2;

    /* renamed from: h0  reason: collision with root package name */
    public static final int f9456h0 = 0;

    /* renamed from: i0  reason: collision with root package name */
    public static final int f9457i0 = 1;

    /* renamed from: j0  reason: collision with root package name */
    public static final int f9458j0 = 2;

    /* renamed from: k0  reason: collision with root package name */
    public static final int f9459k0 = 2048;

    /* renamed from: l0  reason: collision with root package name */
    public static final boolean f9460l0 = false;
    public h P;
    public PorterDuffColorFilter Q;
    public ColorFilter R;
    public boolean S;
    public boolean T;
    public Drawable.ConstantState U;
    public final float[] V;
    public final Matrix W;
    public final Rect X;

    public static class b extends f {
        public b() {
        }

        public b(b bVar) {
            super(bVar);
        }

        public boolean e() {
            return true;
        }

        public void i(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (l.r(xmlPullParser, "pathData")) {
                TypedArray s10 = l.s(resources, theme, attributeSet, a.I);
                j(s10, xmlPullParser);
                s10.recycle();
            }
        }

        public final void j(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f9488b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f9487a = n0.d(string2);
            }
            this.f9489c = l.k(typedArray, xmlPullParser, "fillType", 2, 0);
        }
    }

    public static class c extends f {

        /* renamed from: f  reason: collision with root package name */
        public int[] f9461f;

        /* renamed from: g  reason: collision with root package name */
        public k0.b f9462g;

        /* renamed from: h  reason: collision with root package name */
        public float f9463h = 0.0f;

        /* renamed from: i  reason: collision with root package name */
        public k0.b f9464i;

        /* renamed from: j  reason: collision with root package name */
        public float f9465j = 1.0f;

        /* renamed from: k  reason: collision with root package name */
        public float f9466k = 1.0f;

        /* renamed from: l  reason: collision with root package name */
        public float f9467l = 0.0f;

        /* renamed from: m  reason: collision with root package name */
        public float f9468m = 1.0f;

        /* renamed from: n  reason: collision with root package name */
        public float f9469n = 0.0f;

        /* renamed from: o  reason: collision with root package name */
        public Paint.Cap f9470o = Paint.Cap.BUTT;

        /* renamed from: p  reason: collision with root package name */
        public Paint.Join f9471p = Paint.Join.MITER;

        /* renamed from: q  reason: collision with root package name */
        public float f9472q = 4.0f;

        public c() {
        }

        public c(c cVar) {
            super(cVar);
            this.f9461f = cVar.f9461f;
            this.f9462g = cVar.f9462g;
            this.f9463h = cVar.f9463h;
            this.f9465j = cVar.f9465j;
            this.f9464i = cVar.f9464i;
            this.f9489c = cVar.f9489c;
            this.f9466k = cVar.f9466k;
            this.f9467l = cVar.f9467l;
            this.f9468m = cVar.f9468m;
            this.f9469n = cVar.f9469n;
            this.f9470o = cVar.f9470o;
            this.f9471p = cVar.f9471p;
            this.f9472q = cVar.f9472q;
        }

        public boolean a() {
            return this.f9464i.i() || this.f9462g.i();
        }

        public boolean b(int[] iArr) {
            return this.f9462g.j(iArr) | this.f9464i.j(iArr);
        }

        public void c(Resources.Theme theme) {
        }

        public boolean d() {
            return this.f9461f != null;
        }

        public float getFillAlpha() {
            return this.f9466k;
        }

        @d.l
        public int getFillColor() {
            return this.f9464i.e();
        }

        public float getStrokeAlpha() {
            return this.f9465j;
        }

        @d.l
        public int getStrokeColor() {
            return this.f9462g.e();
        }

        public float getStrokeWidth() {
            return this.f9463h;
        }

        public float getTrimPathEnd() {
            return this.f9468m;
        }

        public float getTrimPathOffset() {
            return this.f9469n;
        }

        public float getTrimPathStart() {
            return this.f9467l;
        }

        public final Paint.Cap i(int i10, Paint.Cap cap) {
            return i10 != 0 ? i10 != 1 ? i10 != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        public final Paint.Join j(int i10, Paint.Join join) {
            return i10 != 0 ? i10 != 1 ? i10 != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        public void k(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray s10 = l.s(resources, theme, attributeSet, a.f9410t);
            l(s10, xmlPullParser, theme);
            s10.recycle();
        }

        public final void l(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f9461f = null;
            if (l.r(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f9488b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f9487a = n0.d(string2);
                }
                Resources.Theme theme2 = theme;
                this.f9464i = l.i(typedArray, xmlPullParser, theme2, "fillColor", 1, 0);
                this.f9466k = l.j(typedArray, xmlPullParser, "fillAlpha", 12, this.f9466k);
                this.f9470o = i(l.k(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f9470o);
                this.f9471p = j(l.k(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f9471p);
                this.f9472q = l.j(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f9472q);
                this.f9462g = l.i(typedArray, xmlPullParser, theme2, "strokeColor", 3, 0);
                this.f9465j = l.j(typedArray, xmlPullParser, "strokeAlpha", 11, this.f9465j);
                this.f9463h = l.j(typedArray, xmlPullParser, "strokeWidth", 4, this.f9463h);
                this.f9468m = l.j(typedArray, xmlPullParser, "trimPathEnd", 6, this.f9468m);
                this.f9469n = l.j(typedArray, xmlPullParser, "trimPathOffset", 7, this.f9469n);
                this.f9467l = l.j(typedArray, xmlPullParser, "trimPathStart", 5, this.f9467l);
                this.f9489c = l.k(typedArray, xmlPullParser, "fillType", 13, this.f9489c);
            }
        }

        public void setFillAlpha(float f10) {
            this.f9466k = f10;
        }

        public void setFillColor(int i10) {
            this.f9464i.k(i10);
        }

        public void setStrokeAlpha(float f10) {
            this.f9465j = f10;
        }

        public void setStrokeColor(int i10) {
            this.f9462g.k(i10);
        }

        public void setStrokeWidth(float f10) {
            this.f9463h = f10;
        }

        public void setTrimPathEnd(float f10) {
            this.f9468m = f10;
        }

        public void setTrimPathOffset(float f10) {
            this.f9469n = f10;
        }

        public void setTrimPathStart(float f10) {
            this.f9467l = f10;
        }
    }

    public static class d extends e {

        /* renamed from: a  reason: collision with root package name */
        public final Matrix f9473a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<e> f9474b;

        /* renamed from: c  reason: collision with root package name */
        public float f9475c;

        /* renamed from: d  reason: collision with root package name */
        public float f9476d;

        /* renamed from: e  reason: collision with root package name */
        public float f9477e;

        /* renamed from: f  reason: collision with root package name */
        public float f9478f;

        /* renamed from: g  reason: collision with root package name */
        public float f9479g;

        /* renamed from: h  reason: collision with root package name */
        public float f9480h;

        /* renamed from: i  reason: collision with root package name */
        public float f9481i;

        /* renamed from: j  reason: collision with root package name */
        public final Matrix f9482j;

        /* renamed from: k  reason: collision with root package name */
        public int f9483k;

        /* renamed from: l  reason: collision with root package name */
        public int[] f9484l;

        /* renamed from: m  reason: collision with root package name */
        public String f9485m;

        public d() {
            super();
            this.f9473a = new Matrix();
            this.f9474b = new ArrayList<>();
            this.f9475c = 0.0f;
            this.f9476d = 0.0f;
            this.f9477e = 0.0f;
            this.f9478f = 1.0f;
            this.f9479g = 1.0f;
            this.f9480h = 0.0f;
            this.f9481i = 0.0f;
            this.f9482j = new Matrix();
            this.f9485m = null;
        }

        public d(d dVar, androidx.collection.a<String, Object> aVar) {
            super();
            f fVar;
            this.f9473a = new Matrix();
            this.f9474b = new ArrayList<>();
            this.f9475c = 0.0f;
            this.f9476d = 0.0f;
            this.f9477e = 0.0f;
            this.f9478f = 1.0f;
            this.f9479g = 1.0f;
            this.f9480h = 0.0f;
            this.f9481i = 0.0f;
            Matrix matrix = new Matrix();
            this.f9482j = matrix;
            this.f9485m = null;
            this.f9475c = dVar.f9475c;
            this.f9476d = dVar.f9476d;
            this.f9477e = dVar.f9477e;
            this.f9478f = dVar.f9478f;
            this.f9479g = dVar.f9479g;
            this.f9480h = dVar.f9480h;
            this.f9481i = dVar.f9481i;
            this.f9484l = dVar.f9484l;
            String str = dVar.f9485m;
            this.f9485m = str;
            this.f9483k = dVar.f9483k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f9482j);
            ArrayList<e> arrayList = dVar.f9474b;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                e eVar = arrayList.get(i10);
                if (eVar instanceof d) {
                    this.f9474b.add(new d((d) eVar, aVar));
                } else {
                    if (eVar instanceof c) {
                        fVar = new c((c) eVar);
                    } else if (eVar instanceof b) {
                        fVar = new b((b) eVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f9474b.add(fVar);
                    String str2 = fVar.f9488b;
                    if (str2 != null) {
                        aVar.put(str2, fVar);
                    }
                }
            }
        }

        public boolean a() {
            for (int i10 = 0; i10 < this.f9474b.size(); i10++) {
                if (this.f9474b.get(i10).a()) {
                    return true;
                }
            }
            return false;
        }

        public boolean b(int[] iArr) {
            boolean z10 = false;
            for (int i10 = 0; i10 < this.f9474b.size(); i10++) {
                z10 |= this.f9474b.get(i10).b(iArr);
            }
            return z10;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray s10 = l.s(resources, theme, attributeSet, a.f9392k);
            e(s10, xmlPullParser);
            s10.recycle();
        }

        public final void d() {
            this.f9482j.reset();
            this.f9482j.postTranslate(-this.f9476d, -this.f9477e);
            this.f9482j.postScale(this.f9478f, this.f9479g);
            this.f9482j.postRotate(this.f9475c, 0.0f, 0.0f);
            this.f9482j.postTranslate(this.f9480h + this.f9476d, this.f9481i + this.f9477e);
        }

        public final void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f9484l = null;
            this.f9475c = l.j(typedArray, xmlPullParser, v.e.f13913i, 5, this.f9475c);
            this.f9476d = typedArray.getFloat(1, this.f9476d);
            this.f9477e = typedArray.getFloat(2, this.f9477e);
            this.f9478f = l.j(typedArray, xmlPullParser, v.e.f13919o, 3, this.f9478f);
            this.f9479g = l.j(typedArray, xmlPullParser, v.e.f13920p, 4, this.f9479g);
            this.f9480h = l.j(typedArray, xmlPullParser, "translateX", 6, this.f9480h);
            this.f9481i = l.j(typedArray, xmlPullParser, "translateY", 7, this.f9481i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f9485m = string;
            }
            d();
        }

        public String getGroupName() {
            return this.f9485m;
        }

        public Matrix getLocalMatrix() {
            return this.f9482j;
        }

        public float getPivotX() {
            return this.f9476d;
        }

        public float getPivotY() {
            return this.f9477e;
        }

        public float getRotation() {
            return this.f9475c;
        }

        public float getScaleX() {
            return this.f9478f;
        }

        public float getScaleY() {
            return this.f9479g;
        }

        public float getTranslateX() {
            return this.f9480h;
        }

        public float getTranslateY() {
            return this.f9481i;
        }

        public void setPivotX(float f10) {
            if (f10 != this.f9476d) {
                this.f9476d = f10;
                d();
            }
        }

        public void setPivotY(float f10) {
            if (f10 != this.f9477e) {
                this.f9477e = f10;
                d();
            }
        }

        public void setRotation(float f10) {
            if (f10 != this.f9475c) {
                this.f9475c = f10;
                d();
            }
        }

        public void setScaleX(float f10) {
            if (f10 != this.f9478f) {
                this.f9478f = f10;
                d();
            }
        }

        public void setScaleY(float f10) {
            if (f10 != this.f9479g) {
                this.f9479g = f10;
                d();
            }
        }

        public void setTranslateX(float f10) {
            if (f10 != this.f9480h) {
                this.f9480h = f10;
                d();
            }
        }

        public void setTranslateY(float f10) {
            if (f10 != this.f9481i) {
                this.f9481i = f10;
                d();
            }
        }
    }

    public static abstract class e {
        public e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    public static abstract class f extends e {

        /* renamed from: e  reason: collision with root package name */
        public static final int f9486e = 0;

        /* renamed from: a  reason: collision with root package name */
        public n0.b[] f9487a = null;

        /* renamed from: b  reason: collision with root package name */
        public String f9488b;

        /* renamed from: c  reason: collision with root package name */
        public int f9489c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f9490d;

        public f() {
            super();
        }

        public f(f fVar) {
            super();
            this.f9488b = fVar.f9488b;
            this.f9490d = fVar.f9490d;
            this.f9487a = n0.f(fVar.f9487a);
        }

        public void c(Resources.Theme theme) {
        }

        public boolean d() {
            return false;
        }

        public boolean e() {
            return false;
        }

        public String f(n0.b[] bVarArr) {
            String str = " ";
            for (int i10 = 0; i10 < bVarArr.length; i10++) {
                str = str + bVarArr[i10].f10732a + ":";
                float[] fArr = bVarArr[i10].f10733b;
                for (int i11 = 0; i11 < fArr.length; i11++) {
                    str = str + fArr[i11] + ",";
                }
            }
            return str;
        }

        public void g(int i10) {
            String str = "";
            for (int i11 = 0; i11 < i10; i11++) {
                str = str + "    ";
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("current path is :");
            sb2.append(this.f9488b);
            sb2.append(" pathData is ");
            sb2.append(f(this.f9487a));
        }

        public n0.b[] getPathData() {
            return this.f9487a;
        }

        public String getPathName() {
            return this.f9488b;
        }

        public void h(Path path) {
            path.reset();
            n0.b[] bVarArr = this.f9487a;
            if (bVarArr != null) {
                n0.b.e(bVarArr, path);
            }
        }

        public void setPathData(n0.b[] bVarArr) {
            if (!n0.b(this.f9487a, bVarArr)) {
                this.f9487a = n0.f(bVarArr);
            } else {
                n0.k(this.f9487a, bVarArr);
            }
        }
    }

    public static class g {

        /* renamed from: q  reason: collision with root package name */
        public static final Matrix f9491q = new Matrix();

        /* renamed from: a  reason: collision with root package name */
        public final Path f9492a;

        /* renamed from: b  reason: collision with root package name */
        public final Path f9493b;

        /* renamed from: c  reason: collision with root package name */
        public final Matrix f9494c;

        /* renamed from: d  reason: collision with root package name */
        public Paint f9495d;

        /* renamed from: e  reason: collision with root package name */
        public Paint f9496e;

        /* renamed from: f  reason: collision with root package name */
        public PathMeasure f9497f;

        /* renamed from: g  reason: collision with root package name */
        public int f9498g;

        /* renamed from: h  reason: collision with root package name */
        public final d f9499h;

        /* renamed from: i  reason: collision with root package name */
        public float f9500i;

        /* renamed from: j  reason: collision with root package name */
        public float f9501j;

        /* renamed from: k  reason: collision with root package name */
        public float f9502k;

        /* renamed from: l  reason: collision with root package name */
        public float f9503l;

        /* renamed from: m  reason: collision with root package name */
        public int f9504m;

        /* renamed from: n  reason: collision with root package name */
        public String f9505n;

        /* renamed from: o  reason: collision with root package name */
        public Boolean f9506o;

        /* renamed from: p  reason: collision with root package name */
        public final androidx.collection.a<String, Object> f9507p;

        public g() {
            this.f9494c = new Matrix();
            this.f9500i = 0.0f;
            this.f9501j = 0.0f;
            this.f9502k = 0.0f;
            this.f9503l = 0.0f;
            this.f9504m = 255;
            this.f9505n = null;
            this.f9506o = null;
            this.f9507p = new androidx.collection.a<>();
            this.f9499h = new d();
            this.f9492a = new Path();
            this.f9493b = new Path();
        }

        public g(g gVar) {
            this.f9494c = new Matrix();
            this.f9500i = 0.0f;
            this.f9501j = 0.0f;
            this.f9502k = 0.0f;
            this.f9503l = 0.0f;
            this.f9504m = 255;
            this.f9505n = null;
            this.f9506o = null;
            androidx.collection.a<String, Object> aVar = new androidx.collection.a<>();
            this.f9507p = aVar;
            this.f9499h = new d(gVar.f9499h, aVar);
            this.f9492a = new Path(gVar.f9492a);
            this.f9493b = new Path(gVar.f9493b);
            this.f9500i = gVar.f9500i;
            this.f9501j = gVar.f9501j;
            this.f9502k = gVar.f9502k;
            this.f9503l = gVar.f9503l;
            this.f9498g = gVar.f9498g;
            this.f9504m = gVar.f9504m;
            this.f9505n = gVar.f9505n;
            String str = gVar.f9505n;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f9506o = gVar.f9506o;
        }

        public static float a(float f10, float f11, float f12, float f13) {
            return (f10 * f13) - (f11 * f12);
        }

        public void b(Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            c(this.f9499h, f9491q, canvas, i10, i11, colorFilter);
        }

        public final void c(d dVar, Matrix matrix, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            dVar.f9473a.set(matrix);
            dVar.f9473a.preConcat(dVar.f9482j);
            canvas.save();
            for (int i12 = 0; i12 < dVar.f9474b.size(); i12++) {
                e eVar = dVar.f9474b.get(i12);
                if (eVar instanceof d) {
                    c((d) eVar, dVar.f9473a, canvas, i10, i11, colorFilter);
                } else if (eVar instanceof f) {
                    d(dVar, (f) eVar, canvas, i10, i11, colorFilter);
                }
            }
            canvas.restore();
        }

        public final void d(d dVar, f fVar, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            float f10 = ((float) i10) / this.f9502k;
            float f11 = ((float) i11) / this.f9503l;
            float min = Math.min(f10, f11);
            Matrix matrix = dVar.f9473a;
            this.f9494c.set(matrix);
            this.f9494c.postScale(f10, f11);
            float e10 = e(matrix);
            if (e10 != 0.0f) {
                fVar.h(this.f9492a);
                Path path = this.f9492a;
                this.f9493b.reset();
                if (fVar.e()) {
                    this.f9493b.setFillType(fVar.f9489c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    this.f9493b.addPath(path, this.f9494c);
                    canvas.clipPath(this.f9493b);
                    return;
                }
                c cVar = (c) fVar;
                float f12 = cVar.f9467l;
                if (!(f12 == 0.0f && cVar.f9468m == 1.0f)) {
                    float f13 = cVar.f9469n;
                    float f14 = (f12 + f13) % 1.0f;
                    float f15 = (cVar.f9468m + f13) % 1.0f;
                    if (this.f9497f == null) {
                        this.f9497f = new PathMeasure();
                    }
                    this.f9497f.setPath(this.f9492a, false);
                    float length = this.f9497f.getLength();
                    float f16 = f14 * length;
                    float f17 = f15 * length;
                    path.reset();
                    if (f16 > f17) {
                        this.f9497f.getSegment(f16, length, path, true);
                        this.f9497f.getSegment(0.0f, f17, path, true);
                    } else {
                        this.f9497f.getSegment(f16, f17, path, true);
                    }
                    path.rLineTo(0.0f, 0.0f);
                }
                this.f9493b.addPath(path, this.f9494c);
                if (cVar.f9464i.l()) {
                    k0.b bVar = cVar.f9464i;
                    if (this.f9496e == null) {
                        Paint paint = new Paint(1);
                        this.f9496e = paint;
                        paint.setStyle(Paint.Style.FILL);
                    }
                    Paint paint2 = this.f9496e;
                    if (bVar.h()) {
                        Shader f18 = bVar.f();
                        f18.setLocalMatrix(this.f9494c);
                        paint2.setShader(f18);
                        paint2.setAlpha(Math.round(cVar.f9466k * 255.0f));
                    } else {
                        paint2.setShader((Shader) null);
                        paint2.setAlpha(255);
                        paint2.setColor(i.a(bVar.e(), cVar.f9466k));
                    }
                    paint2.setColorFilter(colorFilter);
                    this.f9493b.setFillType(cVar.f9489c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                    canvas.drawPath(this.f9493b, paint2);
                }
                if (cVar.f9462g.l()) {
                    k0.b bVar2 = cVar.f9462g;
                    if (this.f9495d == null) {
                        Paint paint3 = new Paint(1);
                        this.f9495d = paint3;
                        paint3.setStyle(Paint.Style.STROKE);
                    }
                    Paint paint4 = this.f9495d;
                    Paint.Join join = cVar.f9471p;
                    if (join != null) {
                        paint4.setStrokeJoin(join);
                    }
                    Paint.Cap cap = cVar.f9470o;
                    if (cap != null) {
                        paint4.setStrokeCap(cap);
                    }
                    paint4.setStrokeMiter(cVar.f9472q);
                    if (bVar2.h()) {
                        Shader f19 = bVar2.f();
                        f19.setLocalMatrix(this.f9494c);
                        paint4.setShader(f19);
                        paint4.setAlpha(Math.round(cVar.f9465j * 255.0f));
                    } else {
                        paint4.setShader((Shader) null);
                        paint4.setAlpha(255);
                        paint4.setColor(i.a(bVar2.e(), cVar.f9465j));
                    }
                    paint4.setColorFilter(colorFilter);
                    paint4.setStrokeWidth(cVar.f9463h * min * e10);
                    canvas.drawPath(this.f9493b, paint4);
                }
            }
        }

        public final float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float a10 = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot((double) fArr[0], (double) fArr[1]), (float) Math.hypot((double) fArr[2], (double) fArr[3]));
            if (max > 0.0f) {
                return Math.abs(a10) / max;
            }
            return 0.0f;
        }

        public boolean f() {
            if (this.f9506o == null) {
                this.f9506o = Boolean.valueOf(this.f9499h.a());
            }
            return this.f9506o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f9499h.b(iArr);
        }

        public float getAlpha() {
            return ((float) getRootAlpha()) / 255.0f;
        }

        public int getRootAlpha() {
            return this.f9504m;
        }

        public void setAlpha(float f10) {
            setRootAlpha((int) (f10 * 255.0f));
        }

        public void setRootAlpha(int i10) {
            this.f9504m = i10;
        }
    }

    public static class h extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public int f9508a;

        /* renamed from: b  reason: collision with root package name */
        public g f9509b;

        /* renamed from: c  reason: collision with root package name */
        public ColorStateList f9510c;

        /* renamed from: d  reason: collision with root package name */
        public PorterDuff.Mode f9511d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f9512e;

        /* renamed from: f  reason: collision with root package name */
        public Bitmap f9513f;

        /* renamed from: g  reason: collision with root package name */
        public int[] f9514g;

        /* renamed from: h  reason: collision with root package name */
        public ColorStateList f9515h;

        /* renamed from: i  reason: collision with root package name */
        public PorterDuff.Mode f9516i;

        /* renamed from: j  reason: collision with root package name */
        public int f9517j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f9518k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f9519l;

        /* renamed from: m  reason: collision with root package name */
        public Paint f9520m;

        public h() {
            this.f9510c = null;
            this.f9511d = i.Z;
            this.f9509b = new g();
        }

        public h(h hVar) {
            this.f9510c = null;
            this.f9511d = i.Z;
            if (hVar != null) {
                this.f9508a = hVar.f9508a;
                g gVar = new g(hVar.f9509b);
                this.f9509b = gVar;
                if (hVar.f9509b.f9496e != null) {
                    gVar.f9496e = new Paint(hVar.f9509b.f9496e);
                }
                if (hVar.f9509b.f9495d != null) {
                    this.f9509b.f9495d = new Paint(hVar.f9509b.f9495d);
                }
                this.f9510c = hVar.f9510c;
                this.f9511d = hVar.f9511d;
                this.f9512e = hVar.f9512e;
            }
        }

        public boolean a(int i10, int i11) {
            return i10 == this.f9513f.getWidth() && i11 == this.f9513f.getHeight();
        }

        public boolean b() {
            return !this.f9519l && this.f9515h == this.f9510c && this.f9516i == this.f9511d && this.f9518k == this.f9512e && this.f9517j == this.f9509b.getRootAlpha();
        }

        public void c(int i10, int i11) {
            if (this.f9513f == null || !a(i10, i11)) {
                this.f9513f = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                this.f9519l = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f9513f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.f9520m == null) {
                Paint paint = new Paint();
                this.f9520m = paint;
                paint.setFilterBitmap(true);
            }
            this.f9520m.setAlpha(this.f9509b.getRootAlpha());
            this.f9520m.setColorFilter(colorFilter);
            return this.f9520m;
        }

        public boolean f() {
            return this.f9509b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.f9509b.f();
        }

        public int getChangingConfigurations() {
            return this.f9508a;
        }

        public boolean h(int[] iArr) {
            boolean g10 = this.f9509b.g(iArr);
            this.f9519l |= g10;
            return g10;
        }

        public void i() {
            this.f9515h = this.f9510c;
            this.f9516i = this.f9511d;
            this.f9517j = this.f9509b.getRootAlpha();
            this.f9518k = this.f9512e;
            this.f9519l = false;
        }

        public void j(int i10, int i11) {
            this.f9513f.eraseColor(0);
            this.f9509b.b(new Canvas(this.f9513f), i10, i11, (ColorFilter) null);
        }

        @m0
        public Drawable newDrawable() {
            return new i(this);
        }

        @m0
        public Drawable newDrawable(Resources resources) {
            return new i(this);
        }
    }

    @t0(24)
    /* renamed from: j3.i$i  reason: collision with other inner class name */
    public static class C0160i extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public final Drawable.ConstantState f9521a;

        public C0160i(Drawable.ConstantState constantState) {
            this.f9521a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f9521a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f9521a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            i iVar = new i();
            iVar.O = (VectorDrawable) this.f9521a.newDrawable();
            return iVar;
        }

        public Drawable newDrawable(Resources resources) {
            i iVar = new i();
            iVar.O = (VectorDrawable) this.f9521a.newDrawable(resources);
            return iVar;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            i iVar = new i();
            iVar.O = (VectorDrawable) this.f9521a.newDrawable(resources, theme);
            return iVar;
        }
    }

    public i() {
        this.T = true;
        this.V = new float[9];
        this.W = new Matrix();
        this.X = new Rect();
        this.P = new h();
    }

    public i(@m0 h hVar) {
        this.T = true;
        this.V = new float[9];
        this.W = new Matrix();
        this.X = new Rect();
        this.P = hVar;
        this.Q = n(this.Q, hVar.f9510c, hVar.f9511d);
    }

    public static int a(int i10, float f10) {
        return (i10 & w1.f7299s) | (((int) (((float) Color.alpha(i10)) * f10)) << 24);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034 A[Catch:{ IOException | XmlPullParserException -> 0x0041 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039 A[Catch:{ IOException | XmlPullParserException -> 0x0041 }] */
    @d.o0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static j3.i d(@d.m0 android.content.res.Resources r4, @d.u int r5, @d.o0 android.content.res.Resources.Theme r6) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L_0x001f
            j3.i r0 = new j3.i
            r0.<init>()
            android.graphics.drawable.Drawable r4 = k0.g.f(r4, r5, r6)
            r0.O = r4
            j3.i$i r4 = new j3.i$i
            android.graphics.drawable.Drawable r5 = r0.O
            android.graphics.drawable.Drawable$ConstantState r5 = r5.getConstantState()
            r4.<init>(r5)
            r0.U = r4
            return r0
        L_0x001f:
            android.content.res.XmlResourceParser r5 = r4.getXml(r5)     // Catch:{ IOException | XmlPullParserException -> 0x0041 }
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)     // Catch:{ IOException | XmlPullParserException -> 0x0041 }
        L_0x0027:
            int r1 = r5.next()     // Catch:{ IOException | XmlPullParserException -> 0x0041 }
            r2 = 2
            if (r1 == r2) goto L_0x0032
            r3 = 1
            if (r1 == r3) goto L_0x0032
            goto L_0x0027
        L_0x0032:
            if (r1 != r2) goto L_0x0039
            j3.i r4 = e(r4, r5, r0, r6)     // Catch:{ IOException | XmlPullParserException -> 0x0041 }
            return r4
        L_0x0039:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ IOException | XmlPullParserException -> 0x0041 }
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)     // Catch:{ IOException | XmlPullParserException -> 0x0041 }
            throw r4     // Catch:{ IOException | XmlPullParserException -> 0x0041 }
        L_0x0041:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.i.d(android.content.res.Resources, int, android.content.res.Resources$Theme):j3.i");
    }

    public static i e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        i iVar = new i();
        iVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return iVar;
    }

    public static PorterDuff.Mode j(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.O;
        if (drawable == null) {
            return false;
        }
        o0.d.b(drawable);
        return false;
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.O;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.X);
        if (this.X.width() > 0 && this.X.height() > 0) {
            ColorFilter colorFilter = this.R;
            if (colorFilter == null) {
                colorFilter = this.Q;
            }
            canvas.getMatrix(this.W);
            this.W.getValues(this.V);
            float abs = Math.abs(this.V[0]);
            float abs2 = Math.abs(this.V[4]);
            float abs3 = Math.abs(this.V[1]);
            float abs4 = Math.abs(this.V[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min(2048, (int) (((float) this.X.width()) * abs));
            int min2 = Math.min(2048, (int) (((float) this.X.height()) * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                Rect rect = this.X;
                canvas.translate((float) rect.left, (float) rect.top);
                if (i()) {
                    canvas.translate((float) this.X.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.X.offsetTo(0, 0);
                this.P.c(min, min2);
                if (!this.T) {
                    this.P.j(min, min2);
                } else if (!this.P.b()) {
                    this.P.j(min, min2);
                    this.P.i();
                }
                this.P.d(canvas, colorFilter, this.X);
                canvas.restoreToCount(save);
            }
        }
    }

    @x0({x0.a.LIBRARY_GROUP_PREFIX})
    public float f() {
        g gVar;
        h hVar = this.P;
        if (hVar == null || (gVar = hVar.f9509b) == null) {
            return 1.0f;
        }
        float f10 = gVar.f9500i;
        if (f10 == 0.0f) {
            return 1.0f;
        }
        float f11 = gVar.f9501j;
        if (f11 == 0.0f) {
            return 1.0f;
        }
        float f12 = gVar.f9503l;
        if (f12 == 0.0f) {
            return 1.0f;
        }
        float f13 = gVar.f9502k;
        if (f13 == 0.0f) {
            return 1.0f;
        }
        return Math.min(f13 / f10, f12 / f11);
    }

    public Object g(String str) {
        return this.P.f9509b.f9507p.get(str);
    }

    public int getAlpha() {
        Drawable drawable = this.O;
        return drawable != null ? o0.d.d(drawable) : this.P.f9509b.getRootAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.O;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.P.getChangingConfigurations();
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.O;
        return drawable != null ? o0.d.e(drawable) : this.R;
    }

    public Drawable.ConstantState getConstantState() {
        if (this.O != null && Build.VERSION.SDK_INT >= 24) {
            return new C0160i(this.O.getConstantState());
        }
        this.P.f9508a = getChangingConfigurations();
        return this.P;
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.O;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.P.f9509b.f9501j;
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.O;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.P.f9509b.f9500i;
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.O;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: j3.i$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: j3.i$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: j3.i$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: j3.i$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: j3.i$b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(android.content.res.Resources r11, org.xmlpull.v1.XmlPullParser r12, android.util.AttributeSet r13, android.content.res.Resources.Theme r14) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r10 = this;
            j3.i$h r0 = r10.P
            j3.i$g r1 = r0.f9509b
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
            j3.i$d r3 = r1.f9499h
            r2.push(r3)
            int r3 = r12.getEventType()
            int r4 = r12.getDepth()
            r5 = 1
            int r4 = r4 + r5
            r6 = r5
        L_0x0019:
            if (r3 == r5) goto L_0x00c4
            int r7 = r12.getDepth()
            r8 = 3
            if (r7 >= r4) goto L_0x0024
            if (r3 == r8) goto L_0x00c4
        L_0x0024:
            r7 = 2
            java.lang.String r9 = "group"
            if (r3 != r7) goto L_0x00af
            java.lang.String r3 = r12.getName()
            java.lang.Object r7 = r2.peek()
            j3.i$d r7 = (j3.i.d) r7
            java.lang.String r8 = "path"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L_0x0059
            j3.i$c r3 = new j3.i$c
            r3.<init>()
            r3.k(r11, r13, r14, r12)
            java.util.ArrayList<j3.i$e> r6 = r7.f9474b
            r6.add(r3)
            java.lang.String r6 = r3.getPathName()
            if (r6 == 0) goto L_0x0057
            androidx.collection.a<java.lang.String, java.lang.Object> r6 = r1.f9507p
            java.lang.String r7 = r3.getPathName()
            r6.put(r7, r3)
        L_0x0057:
            r6 = 0
            goto L_0x007d
        L_0x0059:
            java.lang.String r8 = "clip-path"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L_0x0085
            j3.i$b r3 = new j3.i$b
            r3.<init>()
            r3.i(r11, r13, r14, r12)
            java.util.ArrayList<j3.i$e> r7 = r7.f9474b
            r7.add(r3)
            java.lang.String r7 = r3.getPathName()
            if (r7 == 0) goto L_0x007d
            androidx.collection.a<java.lang.String, java.lang.Object> r7 = r1.f9507p
            java.lang.String r8 = r3.getPathName()
            r7.put(r8, r3)
        L_0x007d:
            int r7 = r0.f9508a
            int r3 = r3.f9490d
        L_0x0081:
            r3 = r3 | r7
            r0.f9508a = r3
            goto L_0x00be
        L_0x0085:
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x00be
            j3.i$d r3 = new j3.i$d
            r3.<init>()
            r3.c(r11, r13, r14, r12)
            java.util.ArrayList<j3.i$e> r7 = r7.f9474b
            r7.add(r3)
            r2.push(r3)
            java.lang.String r7 = r3.getGroupName()
            if (r7 == 0) goto L_0x00aa
            androidx.collection.a<java.lang.String, java.lang.Object> r7 = r1.f9507p
            java.lang.String r8 = r3.getGroupName()
            r7.put(r8, r3)
        L_0x00aa:
            int r7 = r0.f9508a
            int r3 = r3.f9483k
            goto L_0x0081
        L_0x00af:
            if (r3 != r8) goto L_0x00be
            java.lang.String r3 = r12.getName()
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x00be
            r2.pop()
        L_0x00be:
            int r3 = r12.next()
            goto L_0x0019
        L_0x00c4:
            if (r6 != 0) goto L_0x00c7
            return
        L_0x00c7:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r12 = "no path defined"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.i.h(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    public final boolean i() {
        return isAutoMirrored() && o0.d.f(this) == 1;
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.O;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.O;
        if (drawable != null) {
            o0.d.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.P;
        hVar.f9509b = new g();
        TypedArray s10 = l.s(resources, theme, attributeSet, a.f9372a);
        m(s10, xmlPullParser, theme);
        s10.recycle();
        hVar.f9508a = getChangingConfigurations();
        hVar.f9519l = true;
        h(resources, xmlPullParser, attributeSet, theme);
        this.Q = n(this.Q, hVar.f9510c, hVar.f9511d);
    }

    public void invalidateSelf() {
        Drawable drawable = this.O;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.O;
        return drawable != null ? o0.d.h(drawable) : this.P.f9512e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        r0 = r1.P.f9510c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r0 = r1.P;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.O
            if (r0 == 0) goto L_0x0009
            boolean r0 = r0.isStateful()
            return r0
        L_0x0009:
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L_0x0028
            j3.i$h r0 = r1.P
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.g()
            if (r0 != 0) goto L_0x0028
            j3.i$h r0 = r1.P
            android.content.res.ColorStateList r0 = r0.f9510c
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r0 = 0
            goto L_0x0029
        L_0x0028:
            r0 = 1
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.i.isStateful():boolean");
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public final void k(d dVar, int i10) {
        String str = "";
        for (int i11 = 0; i11 < i10; i11++) {
            str = str + "    ";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("current group is :");
        sb2.append(dVar.getGroupName());
        sb2.append(" rotation is ");
        sb2.append(dVar.f9475c);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append("matrix is :");
        sb3.append(dVar.getLocalMatrix().toString());
        for (int i12 = 0; i12 < dVar.f9474b.size(); i12++) {
            e eVar = dVar.f9474b.get(i12);
            if (eVar instanceof d) {
                k((d) eVar, i10 + 1);
            } else {
                ((f) eVar).g(i10 + 1);
            }
        }
    }

    public void l(boolean z10) {
        this.T = z10;
    }

    public final void m(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        h hVar = this.P;
        g gVar = hVar.f9509b;
        hVar.f9511d = j(l.k(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList g10 = l.g(typedArray, xmlPullParser, theme, "tint", 1);
        if (g10 != null) {
            hVar.f9510c = g10;
        }
        hVar.f9512e = l.e(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f9512e);
        gVar.f9502k = l.j(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f9502k);
        float j10 = l.j(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f9503l);
        gVar.f9503l = j10;
        if (gVar.f9502k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (j10 > 0.0f) {
            gVar.f9500i = typedArray.getDimension(3, gVar.f9500i);
            float dimension = typedArray.getDimension(2, gVar.f9501j);
            gVar.f9501j = dimension;
            if (gVar.f9500i <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > 0.0f) {
                gVar.setAlpha(l.j(typedArray, xmlPullParser, v.e.f13911g, 4, gVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    gVar.f9505n = string;
                    gVar.f9507p.put(string, gVar);
                }
            } else {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    public Drawable mutate() {
        Drawable drawable = this.O;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.S && super.mutate() == this) {
            this.P = new h(this.P);
            this.S = true;
        }
        return this;
    }

    public PorterDuffColorFilter n(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.O;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.O;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z10 = false;
        h hVar = this.P;
        ColorStateList colorStateList = hVar.f9510c;
        if (!(colorStateList == null || (mode = hVar.f9511d) == null)) {
            this.Q = n(this.Q, colorStateList, mode);
            invalidateSelf();
            z10 = true;
        }
        if (!hVar.g() || !hVar.h(iArr)) {
            return z10;
        }
        invalidateSelf();
        return true;
    }

    public void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = this.O;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    public void setAlpha(int i10) {
        Drawable drawable = this.O;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.P.f9509b.getRootAlpha() != i10) {
            this.P.f9509b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.O;
        if (drawable != null) {
            o0.d.j(drawable, z10);
        } else {
            this.P.f9512e = z10;
        }
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i10) {
        super.setChangingConfigurations(i10);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i10, PorterDuff.Mode mode) {
        super.setColorFilter(i10, mode);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.O;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.R = colorFilter;
        invalidateSelf();
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z10) {
        super.setFilterBitmap(z10);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    public void setTint(int i10) {
        Drawable drawable = this.O;
        if (drawable != null) {
            o0.d.n(drawable, i10);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.O;
        if (drawable != null) {
            o0.d.o(drawable, colorStateList);
            return;
        }
        h hVar = this.P;
        if (hVar.f9510c != colorStateList) {
            hVar.f9510c = colorStateList;
            this.Q = n(this.Q, colorStateList, hVar.f9511d);
            invalidateSelf();
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.O;
        if (drawable != null) {
            o0.d.p(drawable, mode);
            return;
        }
        h hVar = this.P;
        if (hVar.f9511d != mode) {
            hVar.f9511d = mode;
            this.Q = n(this.Q, hVar.f9510c, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.O;
        return drawable != null ? drawable.setVisible(z10, z11) : super.setVisible(z10, z11);
    }

    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.O;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
