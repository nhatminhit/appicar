package rh;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import javax.annotation.Nullable;
import og.m0;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import rh.f;

@IgnoreJRERequirement
public final class o extends f.a {

    /* renamed from: a  reason: collision with root package name */
    public static final f.a f22631a = new o();

    @IgnoreJRERequirement
    public static final class a<T> implements f<m0, Optional<T>> {

        /* renamed from: a  reason: collision with root package name */
        public final f<m0, T> f22632a;

        public a(f<m0, T> fVar) {
            this.f22632a = fVar;
        }

        /* renamed from: b */
        public Optional<T> a(m0 m0Var) throws IOException {
            return Optional.ofNullable(this.f22632a.a(m0Var));
        }
    }

    @Nullable
    public f<m0, ?> d(Type type, Annotation[] annotationArr, v vVar) {
        if (f.a.b(type) != Optional.class) {
            return null;
        }
        return new a(vVar.n(f.a.a(0, (ParameterizedType) type), annotationArr));
    }
}
