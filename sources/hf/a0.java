package hf;

import be.x;
import fh.g;
import fh.h;
import java.lang.annotation.Annotation;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import xe.l0;
import zd.k0;
import zd.r;

@r
public final class a0 implements TypeVariable<GenericDeclaration>, y {
    @g
    public final t O;

    public a0(@g t tVar) {
        l0.p(tVar, "typeParameter");
        this.O = tVar;
    }

    @h
    public final <T extends Annotation> T a(@g Class<T> cls) {
        l0.p(cls, "annotationClass");
        return null;
    }

    @g
    public final Annotation[] b() {
        return new Annotation[0];
    }

    @g
    public final Annotation[] c() {
        return new Annotation[0];
    }

    public boolean equals(@h Object obj) {
        if (obj instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) obj;
            return l0.g(getName(), typeVariable.getName()) && l0.g(getGenericDeclaration(), typeVariable.getGenericDeclaration());
        }
    }

    @g
    public Type[] getBounds() {
        List<s> upperBounds = this.O.getUpperBounds();
        ArrayList arrayList = new ArrayList(x.Y(upperBounds, 10));
        for (s a10 : upperBounds) {
            arrayList.add(b0.c(a10, true));
        }
        return (Type[]) arrayList.toArray(new Type[0]);
    }

    @g
    public GenericDeclaration getGenericDeclaration() {
        throw new k0("An operation is not implemented: " + ("getGenericDeclaration() is not yet supported for type variables created from KType: " + this.O));
    }

    @g
    public String getName() {
        return this.O.getName();
    }

    @g
    public String getTypeName() {
        return getName();
    }

    public int hashCode() {
        return getName().hashCode() ^ getGenericDeclaration().hashCode();
    }

    @g
    public String toString() {
        return getTypeName();
    }
}
