package g3;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.ViewGroup;
import androidx.collection.a;
import d.m0;
import j3.c;
import java.io.IOException;
import java.lang.reflect.Constructor;
import k0.l;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class k0 {

    /* renamed from: b  reason: collision with root package name */
    public static final Class<?>[] f7801b = {Context.class, AttributeSet.class};

    /* renamed from: c  reason: collision with root package name */
    public static final a<String, Constructor<?>> f7802c = new a<>();

    /* renamed from: a  reason: collision with root package name */
    public final Context f7803a;

    public k0(@m0 Context context) {
        this.f7803a = context;
    }

    public static k0 d(Context context) {
        return new k0(context);
    }

    public final Object a(AttributeSet attributeSet, Class<?> cls, String str) {
        Object newInstance;
        Class<? extends U> asSubclass;
        String attributeValue = attributeSet.getAttributeValue((String) null, "class");
        if (attributeValue != null) {
            try {
                a<String, Constructor<?>> aVar = f7802c;
                synchronized (aVar) {
                    Constructor<? extends U> constructor = aVar.get(attributeValue);
                    if (constructor == null && (asSubclass = Class.forName(attributeValue, false, this.f7803a.getClassLoader()).asSubclass(cls)) != null) {
                        constructor = asSubclass.getConstructor(f7801b);
                        constructor.setAccessible(true);
                        aVar.put(attributeValue, constructor);
                    }
                    newInstance = constructor.newInstance(new Object[]{this.f7803a, attributeSet});
                }
                return newInstance;
            } catch (Exception e10) {
                throw new InflateException("Could not instantiate " + cls + " class " + attributeValue, e10);
            }
        } else {
            throw new InflateException(str + " tag must have a 'class' attribute");
        }
    }

    public final j0 b(XmlPullParser xmlPullParser, AttributeSet attributeSet, j0 j0Var) throws XmlPullParserException, IOException {
        j0 j0Var2;
        z b0Var;
        int depth = xmlPullParser.getDepth();
        o0 o0Var = j0Var instanceof o0 ? (o0) j0Var : null;
        loop0:
        while (true) {
            j0Var2 = null;
            while (true) {
                int next = xmlPullParser.next();
                if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                    if (next == 2) {
                        String name = xmlPullParser.getName();
                        if ("fade".equals(name)) {
                            j0Var2 = new n(this.f7803a, attributeSet);
                        } else if ("changeBounds".equals(name)) {
                            j0Var2 = new g(this.f7803a, attributeSet);
                        } else if ("slide".equals(name)) {
                            j0Var2 = new h0(this.f7803a, attributeSet);
                        } else if ("explode".equals(name)) {
                            j0Var2 = new m(this.f7803a, attributeSet);
                        } else if ("changeImageTransform".equals(name)) {
                            j0Var2 = new i(this.f7803a, attributeSet);
                        } else if ("changeTransform".equals(name)) {
                            j0Var2 = new k(this.f7803a, attributeSet);
                        } else if ("changeClipBounds".equals(name)) {
                            j0Var2 = new h(this.f7803a, attributeSet);
                        } else if ("autoTransition".equals(name)) {
                            j0Var2 = new c(this.f7803a, attributeSet);
                        } else if ("changeScroll".equals(name)) {
                            j0Var2 = new j(this.f7803a, attributeSet);
                        } else if ("transitionSet".equals(name)) {
                            j0Var2 = new o0(this.f7803a, attributeSet);
                        } else if (h.a.f8290n0.equals(name)) {
                            j0Var2 = (j0) a(attributeSet, j0.class, h.a.f8290n0);
                        } else if ("targets".equals(name)) {
                            e(xmlPullParser, attributeSet, j0Var);
                        } else {
                            if ("arcMotion".equals(name)) {
                                if (j0Var != null) {
                                    b0Var = new b(this.f7803a, attributeSet);
                                } else {
                                    throw new RuntimeException("Invalid use of arcMotion element");
                                }
                            } else if ("pathMotion".equals(name)) {
                                if (j0Var != null) {
                                    b0Var = (z) a(attributeSet, z.class, "pathMotion");
                                } else {
                                    throw new RuntimeException("Invalid use of pathMotion element");
                                }
                            } else if (!"patternPathMotion".equals(name)) {
                                throw new RuntimeException("Unknown scene name: " + xmlPullParser.getName());
                            } else if (j0Var != null) {
                                b0Var = new b0(this.f7803a, attributeSet);
                            } else {
                                throw new RuntimeException("Invalid use of patternPathMotion element");
                            }
                            j0Var.B0(b0Var);
                        }
                        if (j0Var2 == null) {
                            continue;
                        } else {
                            if (!xmlPullParser.isEmptyElementTag()) {
                                b(xmlPullParser, attributeSet, j0Var2);
                            }
                            if (o0Var != null) {
                                break;
                            } else if (j0Var != null) {
                                throw new InflateException("Could not add transition to another transition.");
                            }
                        }
                    }
                }
            }
            o0Var.M0(j0Var2);
        }
        return j0Var2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final g3.m0 c(org.xmlpull.v1.XmlPullParser r5, android.util.AttributeSet r6, android.view.ViewGroup r7) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r4 = this;
            int r0 = r5.getDepth()
            r1 = 0
        L_0x0005:
            int r2 = r5.next()
            r3 = 3
            if (r2 != r3) goto L_0x0012
            int r3 = r5.getDepth()
            if (r3 <= r0) goto L_0x0054
        L_0x0012:
            r3 = 1
            if (r2 == r3) goto L_0x0054
            r3 = 2
            if (r2 == r3) goto L_0x0019
            goto L_0x0005
        L_0x0019:
            java.lang.String r2 = r5.getName()
            java.lang.String r3 = "transitionManager"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x002b
            g3.m0 r1 = new g3.m0
            r1.<init>()
            goto L_0x0005
        L_0x002b:
            java.lang.String r3 = "transition"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0039
            if (r1 == 0) goto L_0x0039
            r4.h(r6, r5, r7, r1)
            goto L_0x0005
        L_0x0039:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Unknown scene name: "
            r7.append(r0)
            java.lang.String r5 = r5.getName()
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r6.<init>(r5)
            throw r6
        L_0x0054:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.k0.c(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.ViewGroup):g3.m0");
    }

    @SuppressLint({"RestrictedApi"})
    public final void e(XmlPullParser xmlPullParser, AttributeSet attributeSet, j0 j0Var) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                if (xmlPullParser.getName().equals(c.Y)) {
                    TypedArray obtainStyledAttributes = this.f7803a.obtainStyledAttributes(attributeSet, i0.f7709a);
                    int l10 = l.l(obtainStyledAttributes, xmlPullParser, "targetId", 1, 0);
                    if (l10 != 0) {
                        j0Var.d(l10);
                    } else {
                        int l11 = l.l(obtainStyledAttributes, xmlPullParser, "excludeId", 2, 0);
                        if (l11 != 0) {
                            j0Var.F(l11, true);
                        } else {
                            String m10 = l.m(obtainStyledAttributes, xmlPullParser, "targetName", 4);
                            if (m10 != null) {
                                j0Var.j(m10);
                            } else {
                                String m11 = l.m(obtainStyledAttributes, xmlPullParser, "excludeName", 5);
                                if (m11 != null) {
                                    j0Var.I(m11, true);
                                } else {
                                    String m12 = l.m(obtainStyledAttributes, xmlPullParser, "excludeClass", 3);
                                    if (m12 != null) {
                                        try {
                                            j0Var.H(Class.forName(m12), true);
                                        } catch (ClassNotFoundException e10) {
                                            obtainStyledAttributes.recycle();
                                            throw new RuntimeException("Could not create " + m12, e10);
                                        }
                                    } else {
                                        String m13 = l.m(obtainStyledAttributes, xmlPullParser, "targetClass", 0);
                                        if (m13 != null) {
                                            j0Var.i(Class.forName(m13));
                                        }
                                    }
                                }
                            }
                        }
                    }
                    obtainStyledAttributes.recycle();
                } else {
                    throw new RuntimeException("Unknown scene name: " + xmlPullParser.getName());
                }
            }
        }
    }

    public j0 f(int i10) {
        XmlResourceParser xml = this.f7803a.getResources().getXml(i10);
        try {
            j0 b10 = b(xml, Xml.asAttributeSet(xml), (j0) null);
            xml.close();
            return b10;
        } catch (XmlPullParserException e10) {
            throw new InflateException(e10.getMessage(), e10);
        } catch (IOException e11) {
            throw new InflateException(xml.getPositionDescription() + ": " + e11.getMessage(), e11);
        } catch (Throwable th2) {
            xml.close();
            throw th2;
        }
    }

    public m0 g(int i10, ViewGroup viewGroup) {
        XmlResourceParser xml = this.f7803a.getResources().getXml(i10);
        try {
            m0 c10 = c(xml, Xml.asAttributeSet(xml), viewGroup);
            xml.close();
            return c10;
        } catch (XmlPullParserException e10) {
            InflateException inflateException = new InflateException(e10.getMessage());
            inflateException.initCause(e10);
            throw inflateException;
        } catch (IOException e11) {
            InflateException inflateException2 = new InflateException(xml.getPositionDescription() + ": " + e11.getMessage());
            inflateException2.initCause(e11);
            throw inflateException2;
        } catch (Throwable th2) {
            xml.close();
            throw th2;
        }
    }

    @SuppressLint({"RestrictedApi"})
    public final void h(AttributeSet attributeSet, XmlPullParser xmlPullParser, ViewGroup viewGroup, m0 m0Var) throws Resources.NotFoundException {
        j0 f10;
        TypedArray obtainStyledAttributes = this.f7803a.obtainStyledAttributes(attributeSet, i0.f7710b);
        int l10 = l.l(obtainStyledAttributes, xmlPullParser, h.a.f8290n0, 2, -1);
        int l11 = l.l(obtainStyledAttributes, xmlPullParser, "fromScene", 0, -1);
        f0 f0Var = null;
        f0 d10 = l11 < 0 ? null : f0.d(viewGroup, l11, this.f7803a);
        int l12 = l.l(obtainStyledAttributes, xmlPullParser, "toScene", 1, -1);
        if (l12 >= 0) {
            f0Var = f0.d(viewGroup, l12, this.f7803a);
        }
        if (l10 >= 0 && (f10 = f(l10)) != null) {
            if (f0Var == null) {
                throw new RuntimeException("No toScene for transition ID " + l10);
            } else if (d10 == null) {
                m0Var.l(f0Var, f10);
            } else {
                m0Var.k(d10, f0Var, f10);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
