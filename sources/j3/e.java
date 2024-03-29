package j3;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import d.b;
import d.x0;
import java.io.IOException;
import java.util.ArrayList;
import k0.l;
import l6.d;
import n0.n0;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@x0({x0.a.LIBRARY_GROUP_PREFIX})
public class e {

    /* renamed from: a  reason: collision with root package name */
    public static final String f9433a = "AnimatorInflater";

    /* renamed from: b  reason: collision with root package name */
    public static final int f9434b = 0;

    /* renamed from: c  reason: collision with root package name */
    public static final int f9435c = 100;

    /* renamed from: d  reason: collision with root package name */
    public static final int f9436d = 0;

    /* renamed from: e  reason: collision with root package name */
    public static final int f9437e = 1;

    /* renamed from: f  reason: collision with root package name */
    public static final int f9438f = 2;

    /* renamed from: g  reason: collision with root package name */
    public static final int f9439g = 3;

    /* renamed from: h  reason: collision with root package name */
    public static final int f9440h = 4;

    /* renamed from: i  reason: collision with root package name */
    public static final boolean f9441i = false;

    public static class a implements TypeEvaluator<n0.b[]> {

        /* renamed from: a  reason: collision with root package name */
        public n0.b[] f9442a;

        public a() {
        }

        public a(n0.b[] bVarArr) {
            this.f9442a = bVarArr;
        }

        /* renamed from: a */
        public n0.b[] evaluate(float f10, n0.b[] bVarArr, n0.b[] bVarArr2) {
            if (n0.b(bVarArr, bVarArr2)) {
                if (!n0.b(this.f9442a, bVarArr)) {
                    this.f9442a = n0.f(bVarArr);
                }
                for (int i10 = 0; i10 < bVarArr.length; i10++) {
                    this.f9442a[i10].d(bVarArr[i10], bVarArr2[i10], f10);
                }
                return this.f9442a;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    public static Animator a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f10) throws XmlPullParserException, IOException {
        return b(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), (AnimatorSet) null, 0, f10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.animation.Animator b(android.content.Context r18, android.content.res.Resources r19, android.content.res.Resources.Theme r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.animation.AnimatorSet r23, int r24, float r25) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r23
            int r12 = r21.getDepth()
            r0 = 0
            r13 = r0
        L_0x000e:
            int r1 = r21.next()
            r2 = 3
            r14 = 0
            if (r1 != r2) goto L_0x001c
            int r2 = r21.getDepth()
            if (r2 <= r12) goto L_0x00dd
        L_0x001c:
            r2 = 1
            if (r1 == r2) goto L_0x00dd
            r3 = 2
            if (r1 == r3) goto L_0x0023
            goto L_0x000e
        L_0x0023:
            java.lang.String r1 = r21.getName()
            java.lang.String r3 = "objectAnimator"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0043
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r22
            r4 = r25
            r5 = r21
            android.animation.ObjectAnimator r0 = o(r0, r1, r2, r3, r4, r5)
        L_0x003f:
            r3 = r18
            goto L_0x00b2
        L_0x0043:
            java.lang.String r3 = "animator"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x005d
            r4 = 0
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r22
            r5 = r25
            r6 = r21
            android.animation.ValueAnimator r0 = m(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x003f
        L_0x005d:
            java.lang.String r3 = "set"
            boolean r3 = r1.equals(r3)
            if (r3 == 0) goto L_0x0093
            android.animation.AnimatorSet r15 = new android.animation.AnimatorSet
            r15.<init>()
            int[] r0 = j3.a.f9373a0
            r7 = r22
            android.content.res.TypedArray r6 = k0.l.s(r8, r9, r7, r0)
            java.lang.String r0 = "ordering"
            int r16 = k0.l.k(r6, r10, r0, r14, r14)
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r15
            r17 = r6
            r6 = r16
            r7 = r25
            b(r0, r1, r2, r3, r4, r5, r6, r7)
            r17.recycle()
            r3 = r18
            r0 = r15
            goto L_0x00b2
        L_0x0093:
            java.lang.String r3 = "propertyValuesHolder"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c2
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r21)
            r3 = r18
            android.animation.PropertyValuesHolder[] r1 = q(r3, r8, r9, r10, r1)
            if (r1 == 0) goto L_0x00b1
            boolean r4 = r0 instanceof android.animation.ValueAnimator
            if (r4 == 0) goto L_0x00b1
            r4 = r0
            android.animation.ValueAnimator r4 = (android.animation.ValueAnimator) r4
            r4.setValues(r1)
        L_0x00b1:
            r14 = r2
        L_0x00b2:
            if (r11 == 0) goto L_0x000e
            if (r14 != 0) goto L_0x000e
            if (r13 != 0) goto L_0x00bd
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
        L_0x00bd:
            r13.add(r0)
            goto L_0x000e
        L_0x00c2:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown animator name: "
            r1.append(r2)
            java.lang.String r2 = r21.getName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00dd:
            if (r11 == 0) goto L_0x0106
            if (r13 == 0) goto L_0x0106
            int r1 = r13.size()
            android.animation.Animator[] r1 = new android.animation.Animator[r1]
            java.util.Iterator r2 = r13.iterator()
        L_0x00eb:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00fd
            java.lang.Object r3 = r2.next()
            android.animation.Animator r3 = (android.animation.Animator) r3
            int r4 = r14 + 1
            r1[r14] = r3
            r14 = r4
            goto L_0x00eb
        L_0x00fd:
            if (r24 != 0) goto L_0x0103
            r11.playTogether(r1)
            goto L_0x0106
        L_0x0103:
            r11.playSequentially(r1)
        L_0x0106:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.e.b(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    public static Keyframe c(Keyframe keyframe, float f10) {
        return keyframe.getType() == Float.TYPE ? Keyframe.ofFloat(f10) : keyframe.getType() == Integer.TYPE ? Keyframe.ofInt(f10) : Keyframe.ofObject(f10);
    }

    public static void d(Keyframe[] keyframeArr, float f10, int i10, int i11) {
        float f11 = f10 / ((float) ((i11 - i10) + 2));
        while (i10 <= i11) {
            keyframeArr[i10].setFraction(keyframeArr[i10 - 1].getFraction() + f11);
            i10++;
        }
    }

    public static void e(Object[] objArr, String str) {
        if (objArr != null && objArr.length != 0) {
            int length = objArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                Keyframe keyframe = objArr[i10];
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Keyframe ");
                sb2.append(i10);
                sb2.append(": fraction ");
                Object obj = "null";
                sb2.append(keyframe.getFraction() < 0.0f ? obj : Float.valueOf(keyframe.getFraction()));
                sb2.append(", , value : ");
                if (keyframe.hasValue()) {
                    obj = keyframe.getValue();
                }
                sb2.append(obj);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v26, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v29, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.animation.PropertyValuesHolder f(android.content.res.TypedArray r11, int r12, int r13, int r14, java.lang.String r15) {
        /*
            android.util.TypedValue r0 = r11.peekValue(r13)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x000a
            r3 = r1
            goto L_0x000b
        L_0x000a:
            r3 = r2
        L_0x000b:
            if (r3 == 0) goto L_0x0010
            int r0 = r0.type
            goto L_0x0011
        L_0x0010:
            r0 = r2
        L_0x0011:
            android.util.TypedValue r4 = r11.peekValue(r14)
            if (r4 == 0) goto L_0x0019
            r5 = r1
            goto L_0x001a
        L_0x0019:
            r5 = r2
        L_0x001a:
            if (r5 == 0) goto L_0x001f
            int r4 = r4.type
            goto L_0x0020
        L_0x001f:
            r4 = r2
        L_0x0020:
            r6 = 4
            r7 = 3
            if (r12 != r6) goto L_0x0037
            if (r3 == 0) goto L_0x002c
            boolean r12 = i(r0)
            if (r12 != 0) goto L_0x0034
        L_0x002c:
            if (r5 == 0) goto L_0x0036
            boolean r12 = i(r4)
            if (r12 == 0) goto L_0x0036
        L_0x0034:
            r12 = r7
            goto L_0x0037
        L_0x0036:
            r12 = r2
        L_0x0037:
            if (r12 != 0) goto L_0x003b
            r6 = r1
            goto L_0x003c
        L_0x003b:
            r6 = r2
        L_0x003c:
            r8 = 0
            r9 = 2
            if (r12 != r9) goto L_0x00a9
            java.lang.String r12 = r11.getString(r13)
            java.lang.String r11 = r11.getString(r14)
            n0.n0$b[] r13 = n0.n0.d(r12)
            n0.n0$b[] r14 = n0.n0.d(r11)
            if (r13 != 0) goto L_0x0054
            if (r14 == 0) goto L_0x0167
        L_0x0054:
            if (r13 == 0) goto L_0x0098
            j3.e$a r0 = new j3.e$a
            r0.<init>()
            if (r14 == 0) goto L_0x008d
            boolean r3 = n0.n0.b(r13, r14)
            if (r3 == 0) goto L_0x006e
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r2] = r13
            r11[r1] = r14
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofObject(r15, r0, r11)
            goto L_0x0095
        L_0x006e:
            android.view.InflateException r13 = new android.view.InflateException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = " Can't morph from "
            r14.append(r15)
            r14.append(r12)
            java.lang.String r12 = " to "
            r14.append(r12)
            r14.append(r11)
            java.lang.String r11 = r14.toString()
            r13.<init>(r11)
            throw r13
        L_0x008d:
            java.lang.Object[] r11 = new java.lang.Object[r1]
            r11[r2] = r13
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofObject(r15, r0, r11)
        L_0x0095:
            r8 = r11
            goto L_0x0167
        L_0x0098:
            if (r14 == 0) goto L_0x0167
            j3.e$a r11 = new j3.e$a
            r11.<init>()
            java.lang.Object[] r12 = new java.lang.Object[r1]
            r12[r2] = r14
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofObject(r15, r11, r12)
            goto L_0x0167
        L_0x00a9:
            if (r12 != r7) goto L_0x00b0
            j3.f r12 = j3.f.a()
            goto L_0x00b1
        L_0x00b0:
            r12 = r8
        L_0x00b1:
            r7 = 5
            r10 = 0
            if (r6 == 0) goto L_0x00f9
            if (r3 == 0) goto L_0x00e3
            if (r0 != r7) goto L_0x00be
            float r13 = r11.getDimension(r13, r10)
            goto L_0x00c2
        L_0x00be:
            float r13 = r11.getFloat(r13, r10)
        L_0x00c2:
            if (r5 == 0) goto L_0x00da
            if (r4 != r7) goto L_0x00cb
            float r11 = r11.getDimension(r14, r10)
            goto L_0x00cf
        L_0x00cb:
            float r11 = r11.getFloat(r14, r10)
        L_0x00cf:
            float[] r14 = new float[r9]
            r14[r2] = r13
            r14[r1] = r11
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofFloat(r15, r14)
            goto L_0x00f6
        L_0x00da:
            float[] r11 = new float[r1]
            r11[r2] = r13
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofFloat(r15, r11)
            goto L_0x00f6
        L_0x00e3:
            if (r4 != r7) goto L_0x00ea
            float r11 = r11.getDimension(r14, r10)
            goto L_0x00ee
        L_0x00ea:
            float r11 = r11.getFloat(r14, r10)
        L_0x00ee:
            float[] r13 = new float[r1]
            r13[r2] = r11
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofFloat(r15, r13)
        L_0x00f6:
            r8 = r11
            goto L_0x0160
        L_0x00f9:
            if (r3 == 0) goto L_0x013f
            if (r0 != r7) goto L_0x0103
            float r13 = r11.getDimension(r13, r10)
            int r13 = (int) r13
            goto L_0x0112
        L_0x0103:
            boolean r0 = i(r0)
            if (r0 == 0) goto L_0x010e
            int r13 = r11.getColor(r13, r2)
            goto L_0x0112
        L_0x010e:
            int r13 = r11.getInt(r13, r2)
        L_0x0112:
            if (r5 == 0) goto L_0x0136
            if (r4 != r7) goto L_0x011c
            float r11 = r11.getDimension(r14, r10)
            int r11 = (int) r11
            goto L_0x012b
        L_0x011c:
            boolean r0 = i(r4)
            if (r0 == 0) goto L_0x0127
            int r11 = r11.getColor(r14, r2)
            goto L_0x012b
        L_0x0127:
            int r11 = r11.getInt(r14, r2)
        L_0x012b:
            int[] r14 = new int[r9]
            r14[r2] = r13
            r14[r1] = r11
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofInt(r15, r14)
            goto L_0x0160
        L_0x0136:
            int[] r11 = new int[r1]
            r11[r2] = r13
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofInt(r15, r11)
            goto L_0x0160
        L_0x013f:
            if (r5 == 0) goto L_0x0160
            if (r4 != r7) goto L_0x0149
            float r11 = r11.getDimension(r14, r10)
            int r11 = (int) r11
            goto L_0x0158
        L_0x0149:
            boolean r13 = i(r4)
            if (r13 == 0) goto L_0x0154
            int r11 = r11.getColor(r14, r2)
            goto L_0x0158
        L_0x0154:
            int r11 = r11.getInt(r14, r2)
        L_0x0158:
            int[] r13 = new int[r1]
            r13[r2] = r11
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofInt(r15, r13)
        L_0x0160:
            if (r8 == 0) goto L_0x0167
            if (r12 == 0) goto L_0x0167
            r8.setEvaluator(r12)
        L_0x0167:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.e.f(android.content.res.TypedArray, int, int, int, java.lang.String):android.animation.PropertyValuesHolder");
    }

    public static int g(TypedArray typedArray, int i10, int i11) {
        TypedValue peekValue = typedArray.peekValue(i10);
        boolean z10 = true;
        boolean z11 = peekValue != null;
        int i12 = z11 ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i11);
        if (peekValue2 == null) {
            z10 = false;
        }
        return ((!z11 || !i(i12)) && (!z10 || !i(z10 ? peekValue2.type : 0))) ? 0 : 3;
    }

    public static int h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray s10 = l.s(resources, theme, attributeSet, a.f9387h0);
        int i10 = 0;
        TypedValue t10 = l.t(s10, xmlPullParser, "value", 0);
        if ((t10 != null) && i(t10.type)) {
            i10 = 3;
        }
        s10.recycle();
        return i10;
    }

    public static boolean i(int i10) {
        return i10 >= 28 && i10 <= 31;
    }

    public static Animator j(Context context, @b int i10) throws Resources.NotFoundException {
        return Build.VERSION.SDK_INT >= 24 ? AnimatorInflater.loadAnimator(context, i10) : k(context, context.getResources(), context.getTheme(), i10);
    }

    public static Animator k(Context context, Resources resources, Resources.Theme theme, @b int i10) throws Resources.NotFoundException {
        return l(context, resources, theme, i10, 1.0f);
    }

    public static Animator l(Context context, Resources resources, Resources.Theme theme, @b int i10, float f10) throws Resources.NotFoundException {
        XmlResourceParser xmlResourceParser = null;
        try {
            XmlResourceParser animation = resources.getAnimation(i10);
            Animator a10 = a(context, resources, theme, animation, f10);
            if (animation != null) {
                animation.close();
            }
            return a10;
        } catch (XmlPullParserException e10) {
            Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i10));
            notFoundException.initCause(e10);
            throw notFoundException;
        } catch (IOException e11) {
            Resources.NotFoundException notFoundException2 = new Resources.NotFoundException("Can't load animation resource ID #0x" + Integer.toHexString(i10));
            notFoundException2.initCause(e11);
            throw notFoundException2;
        } catch (Throwable th2) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th2;
        }
    }

    public static ValueAnimator m(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f10, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        TypedArray s10 = l.s(resources, theme, attributeSet, a.R);
        TypedArray s11 = l.s(resources, theme, attributeSet, a.f9397m0);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        r(valueAnimator, s10, s11, f10, xmlPullParser);
        int l10 = l.l(s10, xmlPullParser, "interpolator", 0, 0);
        if (l10 > 0) {
            valueAnimator.setInterpolator(d.b(context, l10));
        }
        s10.recycle();
        if (s11 != null) {
            s11.recycle();
        }
        return valueAnimator;
    }

    public static Keyframe n(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i10, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        TypedArray s10 = l.s(resources, theme, attributeSet, a.f9387h0);
        float j10 = l.j(s10, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue t10 = l.t(s10, xmlPullParser, "value", 0);
        boolean z10 = t10 != null;
        if (i10 == 4) {
            i10 = (!z10 || !i(t10.type)) ? 0 : 3;
        }
        Keyframe ofInt = z10 ? i10 != 0 ? (i10 == 1 || i10 == 3) ? Keyframe.ofInt(j10, l.k(s10, xmlPullParser, "value", 0, 0)) : null : Keyframe.ofFloat(j10, l.j(s10, xmlPullParser, "value", 0, 0.0f)) : i10 == 0 ? Keyframe.ofFloat(j10) : Keyframe.ofInt(j10);
        int l10 = l.l(s10, xmlPullParser, "interpolator", 1, 0);
        if (l10 > 0) {
            ofInt.setInterpolator(d.b(context, l10));
        }
        s10.recycle();
        return ofInt;
    }

    public static ObjectAnimator o(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f10, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        m(context, resources, theme, attributeSet, objectAnimator, f10, xmlPullParser);
        return objectAnimator;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.animation.PropertyValuesHolder p(android.content.Context r9, android.content.res.Resources r10, android.content.res.Resources.Theme r11, org.xmlpull.v1.XmlPullParser r12, java.lang.String r13, int r14) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r0 = 0
            r1 = r0
        L_0x0002:
            int r2 = r12.next()
            r3 = 3
            if (r2 == r3) goto L_0x0040
            r4 = 1
            if (r2 == r4) goto L_0x0040
            java.lang.String r2 = r12.getName()
            java.lang.String r3 = "keyframe"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0002
            r2 = 4
            if (r14 != r2) goto L_0x0023
            android.util.AttributeSet r14 = android.util.Xml.asAttributeSet(r12)
            int r14 = h(r10, r11, r14, r12)
        L_0x0023:
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r12)
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r14
            r7 = r12
            android.animation.Keyframe r2 = n(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto L_0x003c
            if (r1 != 0) goto L_0x0039
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x0039:
            r1.add(r2)
        L_0x003c:
            r12.next()
            goto L_0x0002
        L_0x0040:
            if (r1 == 0) goto L_0x00e9
            int r9 = r1.size()
            if (r9 <= 0) goto L_0x00e9
            r10 = 0
            java.lang.Object r11 = r1.get(r10)
            android.animation.Keyframe r11 = (android.animation.Keyframe) r11
            int r12 = r9 + -1
            java.lang.Object r12 = r1.get(r12)
            android.animation.Keyframe r12 = (android.animation.Keyframe) r12
            float r0 = r12.getFraction()
            r2 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            if (r4 >= 0) goto L_0x0077
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x006a
            r12.setFraction(r2)
            goto L_0x0077
        L_0x006a:
            int r0 = r1.size()
            android.animation.Keyframe r12 = c(r12, r2)
            r1.add(r0, r12)
            int r9 = r9 + 1
        L_0x0077:
            float r12 = r11.getFraction()
            int r0 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0090
            int r12 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r12 >= 0) goto L_0x0087
            r11.setFraction(r5)
            goto L_0x0090
        L_0x0087:
            android.animation.Keyframe r11 = c(r11, r5)
            r1.add(r10, r11)
            int r9 = r9 + 1
        L_0x0090:
            android.animation.Keyframe[] r11 = new android.animation.Keyframe[r9]
            r1.toArray(r11)
        L_0x0095:
            if (r10 >= r9) goto L_0x00dc
            r12 = r11[r10]
            float r0 = r12.getFraction()
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d9
            if (r10 != 0) goto L_0x00a7
            r12.setFraction(r5)
            goto L_0x00d9
        L_0x00a7:
            int r0 = r9 + -1
            if (r10 != r0) goto L_0x00af
            r12.setFraction(r2)
            goto L_0x00d9
        L_0x00af:
            int r12 = r10 + 1
            r1 = r10
        L_0x00b2:
            if (r12 >= r0) goto L_0x00c5
            r4 = r11[r12]
            float r4 = r4.getFraction()
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 < 0) goto L_0x00bf
            goto L_0x00c5
        L_0x00bf:
            int r1 = r12 + 1
            r8 = r1
            r1 = r12
            r12 = r8
            goto L_0x00b2
        L_0x00c5:
            int r12 = r1 + 1
            r12 = r11[r12]
            float r12 = r12.getFraction()
            int r0 = r10 + -1
            r0 = r11[r0]
            float r0 = r0.getFraction()
            float r12 = r12 - r0
            d(r11, r12, r10, r1)
        L_0x00d9:
            int r10 = r10 + 1
            goto L_0x0095
        L_0x00dc:
            android.animation.PropertyValuesHolder r0 = android.animation.PropertyValuesHolder.ofKeyframe(r13, r11)
            if (r14 != r3) goto L_0x00e9
            j3.f r9 = j3.f.a()
            r0.setEvaluator(r9)
        L_0x00e9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.e.p(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, java.lang.String, int):android.animation.PropertyValuesHolder");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.animation.PropertyValuesHolder[] q(android.content.Context r17, android.content.res.Resources r18, android.content.res.Resources.Theme r19, org.xmlpull.v1.XmlPullParser r20, android.util.AttributeSet r21) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r6 = r20
            r7 = 0
            r8 = r7
        L_0x0004:
            int r0 = r20.getEventType()
            r9 = 0
            r1 = 3
            if (r0 == r1) goto L_0x006a
            r10 = 1
            if (r0 == r10) goto L_0x006a
            r2 = 2
            if (r0 == r2) goto L_0x0016
        L_0x0012:
            r20.next()
            goto L_0x0004
        L_0x0016:
            java.lang.String r0 = r20.getName()
            java.lang.String r3 = "propertyValuesHolder"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0063
            int[] r0 = j3.a.f9377c0
            r11 = r18
            r12 = r19
            r13 = r21
            android.content.res.TypedArray r14 = k0.l.s(r11, r12, r13, r0)
            java.lang.String r0 = "propertyName"
            java.lang.String r15 = k0.l.m(r14, r6, r0, r1)
            r0 = 4
            java.lang.String r1 = "valueType"
            int r5 = k0.l.k(r14, r6, r1, r2, r0)
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r15
            r16 = r5
            android.animation.PropertyValuesHolder r0 = p(r0, r1, r2, r3, r4, r5)
            if (r0 != 0) goto L_0x0052
            r1 = r16
            android.animation.PropertyValuesHolder r0 = f(r14, r1, r9, r10, r15)
        L_0x0052:
            if (r0 == 0) goto L_0x005f
            if (r8 != 0) goto L_0x005c
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r8 = r1
        L_0x005c:
            r8.add(r0)
        L_0x005f:
            r14.recycle()
            goto L_0x0012
        L_0x0063:
            r11 = r18
            r12 = r19
            r13 = r21
            goto L_0x0012
        L_0x006a:
            if (r8 == 0) goto L_0x007f
            int r0 = r8.size()
            android.animation.PropertyValuesHolder[] r7 = new android.animation.PropertyValuesHolder[r0]
        L_0x0072:
            if (r9 >= r0) goto L_0x007f
            java.lang.Object r1 = r8.get(r9)
            android.animation.PropertyValuesHolder r1 = (android.animation.PropertyValuesHolder) r1
            r7[r9] = r1
            int r9 = r9 + 1
            goto L_0x0072
        L_0x007f:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.e.q(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet):android.animation.PropertyValuesHolder[]");
    }

    public static void r(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f10, XmlPullParser xmlPullParser) {
        long k10 = (long) l.k(typedArray, xmlPullParser, d.f10232d, 1, 300);
        long k11 = (long) l.k(typedArray, xmlPullParser, "startOffset", 2, 0);
        int k12 = l.k(typedArray, xmlPullParser, "valueType", 7, 4);
        if (l.r(xmlPullParser, "valueFrom") && l.r(xmlPullParser, "valueTo")) {
            if (k12 == 4) {
                k12 = g(typedArray, 5, 6);
            }
            PropertyValuesHolder f11 = f(typedArray, k12, 5, 6, "");
            if (f11 != null) {
                valueAnimator.setValues(new PropertyValuesHolder[]{f11});
            }
        }
        valueAnimator.setDuration(k10);
        valueAnimator.setStartDelay(k11);
        valueAnimator.setRepeatCount(l.k(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(l.k(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            s(valueAnimator, typedArray2, k12, f10, xmlPullParser);
        }
    }

    public static void s(ValueAnimator valueAnimator, TypedArray typedArray, int i10, float f10, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String m10 = l.m(typedArray, xmlPullParser, "pathData", 1);
        if (m10 != null) {
            String m11 = l.m(typedArray, xmlPullParser, "propertyXName", 2);
            String m12 = l.m(typedArray, xmlPullParser, "propertyYName", 3);
            if (i10 != 2) {
            }
            if (m11 == null && m12 == null) {
                throw new InflateException(typedArray.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
            }
            t(n0.e(m10), objectAnimator, f10 * 0.5f, m11, m12);
            return;
        }
        objectAnimator.setPropertyName(l.m(typedArray, xmlPullParser, "propertyName", 0));
    }

    public static void t(Path path, ObjectAnimator objectAnimator, float f10, String str, String str2) {
        PropertyValuesHolder propertyValuesHolder;
        Path path2 = path;
        ObjectAnimator objectAnimator2 = objectAnimator;
        String str3 = str;
        String str4 = str2;
        PathMeasure pathMeasure = new PathMeasure(path2, false);
        ArrayList arrayList = new ArrayList();
        float f11 = 0.0f;
        arrayList.add(Float.valueOf(0.0f));
        float f12 = 0.0f;
        do {
            f12 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f12));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path2, false);
        int min = Math.min(100, ((int) (f12 / f10)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f13 = f12 / ((float) (min - 1));
        int i10 = 0;
        int i11 = 0;
        while (true) {
            propertyValuesHolder = null;
            if (i10 >= min) {
                break;
            }
            pathMeasure2.getPosTan(f11 - ((Float) arrayList.get(i11)).floatValue(), fArr3, (float[]) null);
            fArr[i10] = fArr3[0];
            fArr2[i10] = fArr3[1];
            f11 += f13;
            int i12 = i11 + 1;
            if (i12 < arrayList.size() && f11 > ((Float) arrayList.get(i12)).floatValue()) {
                pathMeasure2.nextContour();
                i11 = i12;
            }
            i10++;
        }
        PropertyValuesHolder ofFloat = str3 != null ? PropertyValuesHolder.ofFloat(str3, fArr) : null;
        if (str4 != null) {
            propertyValuesHolder = PropertyValuesHolder.ofFloat(str4, fArr2);
        }
        if (ofFloat == null) {
            objectAnimator2.setValues(new PropertyValuesHolder[]{propertyValuesHolder});
        } else if (propertyValuesHolder == null) {
            objectAnimator2.setValues(new PropertyValuesHolder[]{ofFloat});
        } else {
            objectAnimator2.setValues(new PropertyValuesHolder[]{ofFloat, propertyValuesHolder});
        }
    }
}
