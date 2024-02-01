package d4;

import com.bumptech.glide.h;
import d.m0;
import d4.n;
import s4.e;
import v3.i;
import w3.d;

public class v<Model> implements n<Model, Model> {

    /* renamed from: a  reason: collision with root package name */
    public static final v<?> f6080a = new v<>();

    public static class a<Model> implements o<Model, Model> {

        /* renamed from: a  reason: collision with root package name */
        public static final a<?> f6081a = new a<>();

        public static <T> a<T> c() {
            return f6081a;
        }

        @m0
        public n<Model, Model> a(r rVar) {
            return v.c();
        }

        public void b() {
        }
    }

    public static class b<Model> implements d<Model> {
        public final Model O;

        public b(Model model) {
            this.O = model;
        }

        @m0
        public Class<Model> a() {
            return this.O.getClass();
        }

        public void b() {
        }

        public void cancel() {
        }

        @m0
        public v3.a d() {
            return v3.a.LOCAL;
        }

        public void f(@m0 h hVar, @m0 d.a<? super Model> aVar) {
            aVar.e(this.O);
        }
    }

    public static <T> v<T> c() {
        return f6080a;
    }

    public boolean a(@m0 Model model) {
        return true;
    }

    public n.a<Model> b(@m0 Model model, int i10, int i11, @m0 i iVar) {
        return new n.a<>(new e(model), new b(model));
    }
}
