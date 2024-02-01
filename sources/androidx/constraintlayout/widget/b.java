package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import androidx.constraintlayout.widget.e;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class b {

    /* renamed from: h  reason: collision with root package name */
    public static final String f1896h = "ConstraintLayoutStates";

    /* renamed from: i  reason: collision with root package name */
    public static final boolean f1897i = false;

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f1898a;

    /* renamed from: b  reason: collision with root package name */
    public d f1899b;

    /* renamed from: c  reason: collision with root package name */
    public int f1900c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f1901d = -1;

    /* renamed from: e  reason: collision with root package name */
    public SparseArray<a> f1902e = new SparseArray<>();

    /* renamed from: f  reason: collision with root package name */
    public SparseArray<d> f1903f = new SparseArray<>();

    /* renamed from: g  reason: collision with root package name */
    public b0.a f1904g = null;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f1905a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<C0029b> f1906b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        public int f1907c = -1;

        /* renamed from: d  reason: collision with root package name */
        public d f1908d;

        public a(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), e.m.State);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == e.m.State_android_id) {
                    this.f1905a = obtainStyledAttributes.getResourceId(index, this.f1905a);
                } else if (index == e.m.State_constraints) {
                    this.f1907c = obtainStyledAttributes.getResourceId(index, this.f1907c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f1907c);
                    context.getResources().getResourceName(this.f1907c);
                    if (n7.b.f10954v.equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f1908d = dVar;
                        dVar.z(context, this.f1907c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        public void a(C0029b bVar) {
            this.f1906b.add(bVar);
        }

        public int b(float f10, float f11) {
            for (int i10 = 0; i10 < this.f1906b.size(); i10++) {
                if (this.f1906b.get(i10).a(f10, f11)) {
                    return i10;
                }
            }
            return -1;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.b$b  reason: collision with other inner class name */
    public static class C0029b {

        /* renamed from: a  reason: collision with root package name */
        public int f1909a;

        /* renamed from: b  reason: collision with root package name */
        public float f1910b = Float.NaN;

        /* renamed from: c  reason: collision with root package name */
        public float f1911c = Float.NaN;

        /* renamed from: d  reason: collision with root package name */
        public float f1912d = Float.NaN;

        /* renamed from: e  reason: collision with root package name */
        public float f1913e = Float.NaN;

        /* renamed from: f  reason: collision with root package name */
        public int f1914f = -1;

        /* renamed from: g  reason: collision with root package name */
        public d f1915g;

        public C0029b(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), e.m.Variant);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == e.m.Variant_constraints) {
                    this.f1914f = obtainStyledAttributes.getResourceId(index, this.f1914f);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f1914f);
                    context.getResources().getResourceName(this.f1914f);
                    if (n7.b.f10954v.equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f1915g = dVar;
                        dVar.z(context, this.f1914f);
                    }
                } else if (index == e.m.Variant_region_heightLessThan) {
                    this.f1913e = obtainStyledAttributes.getDimension(index, this.f1913e);
                } else if (index == e.m.Variant_region_heightMoreThan) {
                    this.f1911c = obtainStyledAttributes.getDimension(index, this.f1911c);
                } else if (index == e.m.Variant_region_widthLessThan) {
                    this.f1912d = obtainStyledAttributes.getDimension(index, this.f1912d);
                } else if (index == e.m.Variant_region_widthMoreThan) {
                    this.f1910b = obtainStyledAttributes.getDimension(index, this.f1910b);
                }
            }
            obtainStyledAttributes.recycle();
        }

        public boolean a(float f10, float f11) {
            if (!Float.isNaN(this.f1910b) && f10 < this.f1910b) {
                return false;
            }
            if (!Float.isNaN(this.f1911c) && f11 < this.f1911c) {
                return false;
            }
            if (Float.isNaN(this.f1912d) || f10 <= this.f1912d) {
                return Float.isNaN(this.f1913e) || f11 <= this.f1913e;
            }
            return false;
        }
    }

    public b(Context context, ConstraintLayout constraintLayout, int i10) {
        this.f1898a = constraintLayout;
        a(context, i10);
    }

    public final void a(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        a aVar = null;
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    char c10 = 65535;
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals(d.f1939e)) {
                                c10 = 4;
                                break;
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c10 = 2;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c10 = 1;
                                break;
                            }
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c10 = 0;
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
                            aVar = new a(context, xml);
                            this.f1902e.put(aVar.f1905a, aVar);
                        } else if (c10 == 3) {
                            C0029b bVar = new C0029b(context, xml);
                            if (aVar != null) {
                                aVar.a(bVar);
                            }
                        } else if (c10 != 4) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("unknown tag ");
                            sb2.append(name);
                        } else {
                            c(context, xml);
                        }
                    }
                }
            }
        } catch (XmlPullParserException e10) {
            e10.printStackTrace();
        } catch (IOException e11) {
            e11.printStackTrace();
        }
    }

    public boolean b(int i10, float f10, float f11) {
        int i11 = this.f1900c;
        if (i11 != i10) {
            return true;
        }
        a aVar = (a) (i10 == -1 ? this.f1902e.valueAt(0) : this.f1902e.get(i11));
        int i12 = this.f1901d;
        return (i12 == -1 || !aVar.f1906b.get(i12).a(f10, f11)) && this.f1901d != aVar.b(f10, f11);
    }

    public final void c(Context context, XmlPullParser xmlPullParser) {
        int i10;
        d dVar = new d();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i11 = 0; i11 < attributeCount; i11++) {
            if ("id".equals(xmlPullParser.getAttributeName(i11))) {
                String attributeValue = xmlPullParser.getAttributeValue(i11);
                if (attributeValue.contains("/")) {
                    i10 = context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName());
                } else {
                    i10 = -1;
                }
                if (i10 == -1 && attributeValue.length() > 1) {
                    i10 = Integer.parseInt(attributeValue.substring(1));
                }
                dVar.o0(context, xmlPullParser);
                this.f1903f.put(i10, dVar);
                return;
            }
        }
    }

    public void d(b0.a aVar) {
        this.f1904g = aVar;
    }

    public void e(int i10, float f10, float f11) {
        int b10;
        int i11 = this.f1900c;
        if (i11 == i10) {
            a aVar = (a) (i10 == -1 ? this.f1902e.valueAt(0) : this.f1902e.get(i11));
            int i12 = this.f1901d;
            if ((i12 == -1 || !aVar.f1906b.get(i12).a(f10, f11)) && this.f1901d != (b10 = aVar.b(f10, f11))) {
                d dVar = b10 == -1 ? this.f1899b : aVar.f1906b.get(b10).f1915g;
                int i13 = b10 == -1 ? aVar.f1907c : aVar.f1906b.get(b10).f1914f;
                if (dVar != null) {
                    this.f1901d = b10;
                    b0.a aVar2 = this.f1904g;
                    if (aVar2 != null) {
                        aVar2.b(-1, i13);
                    }
                    dVar.l(this.f1898a);
                    b0.a aVar3 = this.f1904g;
                    if (aVar3 != null) {
                        aVar3.a(-1, i13);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        this.f1900c = i10;
        a aVar4 = this.f1902e.get(i10);
        int b11 = aVar4.b(f10, f11);
        d dVar2 = b11 == -1 ? aVar4.f1908d : aVar4.f1906b.get(b11).f1915g;
        int i14 = b11 == -1 ? aVar4.f1907c : aVar4.f1906b.get(b11).f1914f;
        if (dVar2 == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("NO Constraint set found ! id=");
            sb2.append(i10);
            sb2.append(", dim =");
            sb2.append(f10);
            sb2.append(", ");
            sb2.append(f11);
            return;
        }
        this.f1901d = b11;
        b0.a aVar5 = this.f1904g;
        if (aVar5 != null) {
            aVar5.b(i10, i14);
        }
        dVar2.l(this.f1898a);
        b0.a aVar6 = this.f1904g;
        if (aVar6 != null) {
            aVar6.a(i10, i14);
        }
    }
}
