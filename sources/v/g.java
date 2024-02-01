package v;

import java.util.Arrays;
import java.util.HashMap;

public class g {

    /* renamed from: a  reason: collision with root package name */
    public HashMap<Object, HashMap<String, float[]>> f13955a = new HashMap<>();

    public float a(Object obj, String str, int i10) {
        if (!this.f13955a.containsKey(obj)) {
            return Float.NaN;
        }
        HashMap hashMap = this.f13955a.get(obj);
        if (!hashMap.containsKey(str)) {
            return Float.NaN;
        }
        float[] fArr = (float[]) hashMap.get(str);
        if (fArr.length > i10) {
            return fArr[i10];
        }
        return Float.NaN;
    }

    public void b(Object obj, String str, int i10, float f10) {
        HashMap hashMap;
        if (!this.f13955a.containsKey(obj)) {
            hashMap = new HashMap();
            float[] fArr = new float[(i10 + 1)];
            fArr[i10] = f10;
            hashMap.put(str, fArr);
        } else {
            hashMap = this.f13955a.get(obj);
            if (!hashMap.containsKey(str)) {
                float[] fArr2 = new float[(i10 + 1)];
                fArr2[i10] = f10;
                hashMap.put(str, fArr2);
            } else {
                float[] fArr3 = (float[]) hashMap.get(str);
                if (fArr3.length <= i10) {
                    fArr3 = Arrays.copyOf(fArr3, i10 + 1);
                }
                fArr3[i10] = f10;
                hashMap.put(str, fArr3);
                return;
            }
        }
        this.f13955a.put(obj, hashMap);
    }
}
