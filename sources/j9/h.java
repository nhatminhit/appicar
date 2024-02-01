package j9;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Property;
import androidx.collection.i;
import d.b;
import d.c1;
import d.m0;
import d.o0;
import java.util.ArrayList;
import java.util.List;

public class h {

    /* renamed from: c  reason: collision with root package name */
    public static final String f19841c = "MotionSpec";

    /* renamed from: a  reason: collision with root package name */
    public final i<String, i> f19842a = new i<>();

    /* renamed from: b  reason: collision with root package name */
    public final i<String, PropertyValuesHolder[]> f19843b = new i<>();

    public static void a(@m0 h hVar, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            hVar.l(objectAnimator.getPropertyName(), objectAnimator.getValues());
            hVar.m(objectAnimator.getPropertyName(), i.b(objectAnimator));
            return;
        }
        throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
    }

    @o0
    public static h c(@m0 Context context, @m0 TypedArray typedArray, @c1 int i10) {
        int resourceId;
        if (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return d(context, resourceId);
    }

    @o0
    public static h d(@m0 Context context, @b int i10) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i10);
            if (loadAnimator instanceof AnimatorSet) {
                return e(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return e(arrayList);
        } catch (Exception unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Can't load animation resource ID #0x");
            sb2.append(Integer.toHexString(i10));
            return null;
        }
    }

    @m0
    public static h e(@m0 List<Animator> list) {
        h hVar = new h();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            a(hVar, list.get(i10));
        }
        return hVar;
    }

    @m0
    public final PropertyValuesHolder[] b(@m0 PropertyValuesHolder[] propertyValuesHolderArr) {
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
        for (int i10 = 0; i10 < propertyValuesHolderArr.length; i10++) {
            propertyValuesHolderArr2[i10] = propertyValuesHolderArr[i10].clone();
        }
        return propertyValuesHolderArr2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        return this.f19842a.equals(((h) obj).f19842a);
    }

    @m0
    public <T> ObjectAnimator f(@m0 String str, @m0 T t10, @m0 Property<T, ?> property) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(t10, g(str));
        ofPropertyValuesHolder.setProperty(property);
        h(str).a(ofPropertyValuesHolder);
        return ofPropertyValuesHolder;
    }

    @m0
    public PropertyValuesHolder[] g(String str) {
        if (j(str)) {
            return b(this.f19843b.get(str));
        }
        throw new IllegalArgumentException();
    }

    public i h(String str) {
        if (k(str)) {
            return this.f19842a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public int hashCode() {
        return this.f19842a.hashCode();
    }

    public long i() {
        int size = this.f19842a.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            i q10 = this.f19842a.q(i10);
            j10 = Math.max(j10, q10.c() + q10.d());
        }
        return j10;
    }

    public boolean j(String str) {
        return this.f19843b.get(str) != null;
    }

    public boolean k(String str) {
        return this.f19842a.get(str) != null;
    }

    public void l(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f19843b.put(str, propertyValuesHolderArr);
    }

    public void m(String str, @o0 i iVar) {
        this.f19842a.put(str, iVar);
    }

    @m0
    public String toString() {
        return 10 + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f19842a + "}\n";
    }
}
