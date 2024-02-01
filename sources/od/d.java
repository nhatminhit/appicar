package od;

import pd.a;

public class d {

    public static class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ pd.a f21422a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f21423b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ a.C0385a f21424c;

        public a(pd.a aVar, String str, a.C0385a aVar2) {
            this.f21422a = aVar;
            this.f21423b = str;
            this.f21424c = aVar2;
        }

        public void destroy() {
            this.f21422a.f(this.f21423b, this.f21424c);
        }
    }

    public interface b {
        void destroy();
    }

    public static b a(pd.a aVar, String str, a.C0385a aVar2) {
        aVar.g(str, aVar2);
        return new a(aVar, str, aVar2);
    }
}
