package g5;

import w4.p;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public Object f8039a;

    /* renamed from: b  reason: collision with root package name */
    public Class<?> f8040b;

    /* renamed from: c  reason: collision with root package name */
    public Object f8041c;

    /* renamed from: d  reason: collision with root package name */
    public String f8042d;

    /* renamed from: e  reason: collision with root package name */
    public a f8043e;

    /* renamed from: f  reason: collision with root package name */
    public p f8044f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f8045g;

    /* renamed from: h  reason: collision with root package name */
    public Object f8046h;

    public enum a {
        WRAPPER_ARRAY,
        WRAPPER_OBJECT,
        METADATA_PROPERTY,
        PAYLOAD_PROPERTY,
        PARENT_PROPERTY;

        public boolean a() {
            return this == METADATA_PROPERTY || this == PAYLOAD_PROPERTY;
        }
    }

    public c() {
    }

    public c(Object obj, Class<?> cls, p pVar) {
        this(obj, pVar, (Object) null);
        this.f8040b = cls;
    }

    public c(Object obj, p pVar) {
        this(obj, pVar, (Object) null);
    }

    public c(Object obj, p pVar, Object obj2) {
        this.f8039a = obj;
        this.f8041c = obj2;
        this.f8044f = pVar;
    }
}
