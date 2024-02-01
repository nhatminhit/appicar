package va;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import p7.f;
import qa.e;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final String f23541a = "h";

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f23542b = Pattern.compile(",");

    public static Map<e, Object> a(Intent intent) {
        Object obj;
        Bundle extras = intent.getExtras();
        if (extras == null || extras.isEmpty()) {
            return null;
        }
        EnumMap enumMap = new EnumMap(e.class);
        for (e eVar : e.values()) {
            if (!(eVar == e.CHARACTER_SET || eVar == e.NEED_RESULT_POINT_CALLBACK || eVar == e.POSSIBLE_FORMATS)) {
                String name = eVar.name();
                if (extras.containsKey(name)) {
                    if (eVar.a().equals(Void.class)) {
                        obj = Boolean.TRUE;
                    } else {
                        obj = extras.get(name);
                        if (!eVar.a().isInstance(obj)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Ignoring hint ");
                            sb2.append(eVar);
                            sb2.append(" because it is not assignable from ");
                            sb2.append(obj);
                        }
                    }
                    enumMap.put(eVar, obj);
                }
            }
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Hints from the Intent: ");
        sb3.append(enumMap);
        return enumMap;
    }

    public static Map<e, ?> b(Uri uri) {
        String str;
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null || encodedQuery.isEmpty()) {
            return null;
        }
        Map<String, String> c10 = c(encodedQuery);
        EnumMap enumMap = new EnumMap(e.class);
        for (e eVar : e.values()) {
            if (!(eVar == e.CHARACTER_SET || eVar == e.NEED_RESULT_POINT_CALLBACK || eVar == e.POSSIBLE_FORMATS || (str = c10.get(eVar.name())) == null)) {
                Object obj = str;
                if (!eVar.a().equals(Object.class)) {
                    if (!eVar.a().equals(Void.class)) {
                        obj = str;
                        if (!eVar.a().equals(String.class)) {
                            if (eVar.a().equals(Boolean.class)) {
                                if (!str.isEmpty() && ("0".equals(str) || "false".equalsIgnoreCase(str) || "no".equalsIgnoreCase(str))) {
                                    obj = Boolean.FALSE;
                                }
                            } else if (eVar.a().equals(int[].class)) {
                                boolean isEmpty = str.isEmpty();
                                String str2 = str;
                                if (!isEmpty) {
                                    char charAt = str.charAt(str.length() - 1);
                                    str2 = str;
                                    if (charAt == ',') {
                                        str2 = str.substring(0, str.length() - 1);
                                    }
                                }
                                String[] split = f23542b.split(str2);
                                int[] iArr = new int[split.length];
                                int i10 = 0;
                                while (i10 < split.length) {
                                    try {
                                        iArr[i10] = Integer.parseInt(split[i10]);
                                        i10++;
                                    } catch (NumberFormatException unused) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("Skipping array of integers hint ");
                                        sb2.append(eVar);
                                        sb2.append(" due to invalid numeric value: '");
                                        sb2.append(split[i10]);
                                        sb2.append('\'');
                                        iArr = null;
                                    }
                                }
                                if (iArr != null) {
                                    enumMap.put(eVar, iArr);
                                }
                            } else {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("Unsupported hint type '");
                                sb3.append(eVar);
                                sb3.append("' of type ");
                                sb3.append(eVar.a());
                            }
                        }
                    }
                    obj = Boolean.TRUE;
                }
                enumMap.put(eVar, obj);
            }
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Hints from the URI: ");
        sb4.append(enumMap);
        return enumMap;
    }

    public static Map<String, String> c(String str) {
        String str2;
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (true) {
            if (i10 >= str.length()) {
                break;
            } else if (str.charAt(i10) == '&') {
                i10++;
            } else {
                int indexOf = str.indexOf(38, i10);
                int indexOf2 = str.indexOf(61, i10);
                String str3 = "";
                if (indexOf < 0) {
                    if (indexOf2 < 0) {
                        str2 = Uri.decode(str.substring(i10).replace('+', f.f11698i));
                    } else {
                        String decode = Uri.decode(str.substring(i10, indexOf2).replace('+', f.f11698i));
                        str3 = Uri.decode(str.substring(indexOf2 + 1).replace('+', f.f11698i));
                        str2 = decode;
                    }
                    if (!hashMap.containsKey(str2)) {
                        hashMap.put(str2, str3);
                    }
                } else {
                    if (indexOf2 < 0 || indexOf2 > indexOf) {
                        String decode2 = Uri.decode(str.substring(i10, indexOf).replace('+', f.f11698i));
                        if (!hashMap.containsKey(decode2)) {
                            hashMap.put(decode2, str3);
                        }
                    } else {
                        String decode3 = Uri.decode(str.substring(i10, indexOf2).replace('+', f.f11698i));
                        String decode4 = Uri.decode(str.substring(indexOf2 + 1, indexOf).replace('+', f.f11698i));
                        if (!hashMap.containsKey(decode3)) {
                            hashMap.put(decode3, decode4);
                        }
                    }
                    i10 = indexOf + 1;
                }
            }
        }
        return hashMap;
    }
}
