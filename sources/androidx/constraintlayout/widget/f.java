package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class f {

    /* renamed from: h  reason: collision with root package name */
    public static final String f2109h = "ConstraintLayoutStates";

    /* renamed from: i  reason: collision with root package name */
    public static final boolean f2110i = false;

    /* renamed from: a  reason: collision with root package name */
    public int f2111a = -1;

    /* renamed from: b  reason: collision with root package name */
    public d f2112b;

    /* renamed from: c  reason: collision with root package name */
    public int f2113c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f2114d = -1;

    /* renamed from: e  reason: collision with root package name */
    public SparseArray<a> f2115e = new SparseArray<>();

    /* renamed from: f  reason: collision with root package name */
    public SparseArray<d> f2116f = new SparseArray<>();

    /* renamed from: g  reason: collision with root package name */
    public b0.a f2117g = null;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f2118a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<b> f2119b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        public int f2120c = -1;

        /* renamed from: d  reason: collision with root package name */
        public boolean f2121d;

        public a(Context context, XmlPullParser xmlPullParser) {
            this.f2121d = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), e.m.State);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == e.m.State_android_id) {
                    this.f2118a = obtainStyledAttributes.getResourceId(index, this.f2118a);
                } else if (index == e.m.State_constraints) {
                    this.f2120c = obtainStyledAttributes.getResourceId(index, this.f2120c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f2120c);
                    context.getResources().getResourceName(this.f2120c);
                    if (n7.b.f10954v.equals(resourceTypeName)) {
                        this.f2121d = true;
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        public void a(b bVar) {
            this.f2119b.add(bVar);
        }

        public int b(float f10, float f11) {
            for (int i10 = 0; i10 < this.f2119b.size(); i10++) {
                if (this.f2119b.get(i10).a(f10, f11)) {
                    return i10;
                }
            }
            return -1;
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f2122a;

        /* renamed from: b  reason: collision with root package name */
        public float f2123b = Float.NaN;

        /* renamed from: c  reason: collision with root package name */
        public float f2124c = Float.NaN;

        /* renamed from: d  reason: collision with root package name */
        public float f2125d = Float.NaN;

        /* renamed from: e  reason: collision with root package name */
        public float f2126e = Float.NaN;

        /* renamed from: f  reason: collision with root package name */
        public int f2127f = -1;

        /* renamed from: g  reason: collision with root package name */
        public boolean f2128g;

        public b(Context context, XmlPullParser xmlPullParser) {
            this.f2128g = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), e.m.Variant);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == e.m.Variant_constraints) {
                    this.f2127f = obtainStyledAttributes.getResourceId(index, this.f2127f);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f2127f);
                    context.getResources().getResourceName(this.f2127f);
                    if (n7.b.f10954v.equals(resourceTypeName)) {
                        this.f2128g = true;
                    }
                } else if (index == e.m.Variant_region_heightLessThan) {
                    this.f2126e = obtainStyledAttributes.getDimension(index, this.f2126e);
                } else if (index == e.m.Variant_region_heightMoreThan) {
                    this.f2124c = obtainStyledAttributes.getDimension(index, this.f2124c);
                } else if (index == e.m.Variant_region_widthLessThan) {
                    this.f2125d = obtainStyledAttributes.getDimension(index, this.f2125d);
                } else if (index == e.m.Variant_region_widthMoreThan) {
                    this.f2123b = obtainStyledAttributes.getDimension(index, this.f2123b);
                }
            }
            obtainStyledAttributes.recycle();
        }

        public boolean a(float f10, float f11) {
            if (!Float.isNaN(this.f2123b) && f10 < this.f2123b) {
                return false;
            }
            if (!Float.isNaN(this.f2124c) && f11 < this.f2124c) {
                return false;
            }
            if (Float.isNaN(this.f2125d) || f10 <= this.f2125d) {
                return Float.isNaN(this.f2126e) || f11 <= this.f2126e;
            }
            return false;
        }
    }

    public f(Context context, XmlPullParser xmlPullParser) {
        b(context, xmlPullParser);
    }

    public int a(int i10, int i11, float f10, float f11) {
        a aVar = this.f2115e.get(i11);
        if (aVar == null) {
            return i11;
        }
        if (f10 != -1.0f && f11 != -1.0f) {
            b bVar = null;
            Iterator<b> it = aVar.f2119b.iterator();
            while (it.hasNext()) {
                b next = it.next();
                if (next.a(f10, f11)) {
                    if (i10 == next.f2127f) {
                        return i10;
                    }
                    bVar = next;
                }
            }
            return bVar != null ? bVar.f2127f : aVar.f2120c;
        } else if (aVar.f2120c == i10) {
            return i10;
        } else {
            Iterator<b> it2 = aVar.f2119b.iterator();
            while (it2.hasNext()) {
                if (i10 == it2.next().f2127f) {
                    return i10;
                }
            }
            return aVar.f2120c;
        }
    }

    public final void b(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), e.m.StateSet);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            if (index == e.m.StateSet_defaultState) {
                this.f2111a = obtainStyledAttributes.getResourceId(index, this.f2111a);
            }
        }
        obtainStyledAttributes.recycle();
        a aVar = null;
        try {
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                if (eventType == 0) {
                    xmlPullParser.getName();
                } else if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    char c10 = 65535;
                    switch (name.hashCode()) {
                        case 80204913:
                            if (name.equals("State")) {
                                c10 = 2;
                                break;
                            }
                            break;
                        case 1301459538:
                            if (name.equals("LayoutDescription")) {
                                c10 = 0;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c10 = 3;
                                break;
                            }
                            break;
                    }
                    if (!(c10 == 0 || c10 == 1)) {
                        if (c10 == 2) {
                            aVar = new a(context, xmlPullParser);
                            this.f2115e.put(aVar.f2118a, aVar);
                        } else if (c10 != 3) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("unknown tag ");
                            sb2.append(name);
                        } else {
                            b bVar = new b(context, xmlPullParser);
                            if (aVar != null) {
                                aVar.a(bVar);
                            }
                        }
                    }
                } else if (eventType != 3) {
                    continue;
                } else if ("StateSet".equals(xmlPullParser.getName())) {
                    return;
                }
                eventType = xmlPullParser.next();
            }
        } catch (XmlPullParserException e10) {
            e10.printStackTrace();
        } catch (IOException e11) {
            e11.printStackTrace();
        }
    }

    public boolean c(int i10, float f10, float f11) {
        int i11 = this.f2113c;
        if (i11 != i10) {
            return true;
        }
        a aVar = (a) (i10 == -1 ? this.f2115e.valueAt(0) : this.f2115e.get(i11));
        int i12 = this.f2114d;
        return (i12 == -1 || !aVar.f2119b.get(i12).a(f10, f11)) && this.f2114d != aVar.b(f10, f11);
    }

    public void d(b0.a aVar) {
        this.f2117g = aVar;
    }

    public int e(int i10, int i11, int i12) {
        return f(-1, i10, (float) i11, (float) i12);
    }

    public int f(int i10, int i11, float f10, float f11) {
        int b10;
        if (i10 == i11) {
            a aVar = (a) (i11 == -1 ? this.f2115e.valueAt(0) : this.f2115e.get(this.f2113c));
            if (aVar == null) {
                return -1;
            }
            return ((this.f2114d == -1 || !aVar.f2119b.get(i10).a(f10, f11)) && i10 != (b10 = aVar.b(f10, f11))) ? b10 == -1 ? aVar.f2120c : aVar.f2119b.get(b10).f2127f : i10;
        }
        a aVar2 = this.f2115e.get(i11);
        if (aVar2 == null) {
            return -1;
        }
        int b11 = aVar2.b(f10, f11);
        return b11 == -1 ? aVar2.f2120c : aVar2.f2119b.get(b11).f2127f;
    }
}
