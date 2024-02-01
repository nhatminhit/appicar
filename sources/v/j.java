package v;

import android.content.Context;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.a;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class j {

    /* renamed from: b  reason: collision with root package name */
    public static final int f14008b = -1;

    /* renamed from: c  reason: collision with root package name */
    public static HashMap<String, Constructor<? extends e>> f14009c = null;

    /* renamed from: d  reason: collision with root package name */
    public static final String f14010d = "KeyFrames";

    /* renamed from: a  reason: collision with root package name */
    public HashMap<Integer, ArrayList<e>> f14011a = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends e>> hashMap = new HashMap<>();
        f14009c = hashMap;
        try {
            hashMap.put("KeyAttribute", f.class.getConstructor(new Class[0]));
            f14009c.put("KeyPosition", k.class.getConstructor(new Class[0]));
            f14009c.put("KeyCycle", h.class.getConstructor(new Class[0]));
            f14009c.put("KeyTimeCycle", m.class.getConstructor(new Class[0]));
            f14009c.put("KeyTrigger", n.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException unused) {
        }
    }

    public j(Context context, XmlPullParser xmlPullParser) {
        HashMap<String, a> hashMap;
        e eVar = null;
        try {
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (f14009c.containsKey(name)) {
                        try {
                            e eVar2 = (e) f14009c.get(name).newInstance(new Object[0]);
                            try {
                                eVar2.c(context, Xml.asAttributeSet(xmlPullParser));
                                b(eVar2);
                            } catch (Exception unused) {
                            }
                            eVar = eVar2;
                        } catch (Exception unused2) {
                        }
                    } else if (!(!name.equalsIgnoreCase("CustomAttribute") || eVar == null || (hashMap = eVar.f13933e) == null)) {
                        a.h(context, xmlPullParser, hashMap);
                    }
                } else if (eventType == 3) {
                    if ("KeyFrameSet".equals(xmlPullParser.getName())) {
                        return;
                    }
                }
                eventType = xmlPullParser.next();
            }
        } catch (XmlPullParserException e10) {
            e10.printStackTrace();
        } catch (IOException e11) {
            e11.printStackTrace();
        }
    }

    public static String e(int i10, Context context) {
        return context.getResources().getResourceEntryName(i10);
    }

    public void a(p pVar) {
        ArrayList arrayList = this.f14011a.get(Integer.valueOf(pVar.f14084b));
        if (arrayList != null) {
            pVar.b(arrayList);
        }
        ArrayList arrayList2 = this.f14011a.get(-1);
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                if (eVar.d(((ConstraintLayout.b) pVar.f14083a.getLayoutParams()).V)) {
                    pVar.a(eVar);
                }
            }
        }
    }

    public final void b(e eVar) {
        if (!this.f14011a.containsKey(Integer.valueOf(eVar.f13930b))) {
            this.f14011a.put(Integer.valueOf(eVar.f13930b), new ArrayList());
        }
        this.f14011a.get(Integer.valueOf(eVar.f13930b)).add(eVar);
    }

    public ArrayList<e> c(int i10) {
        return this.f14011a.get(Integer.valueOf(i10));
    }

    public Set<Integer> d() {
        return this.f14011a.keySet();
    }
}
