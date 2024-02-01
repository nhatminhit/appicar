package y3;

import a4.a;
import d.m0;
import java.io.File;
import v3.d;
import v3.i;

public class e<DataType> implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public final d<DataType> f15334a;

    /* renamed from: b  reason: collision with root package name */
    public final DataType f15335b;

    /* renamed from: c  reason: collision with root package name */
    public final i f15336c;

    public e(d<DataType> dVar, DataType datatype, i iVar) {
        this.f15334a = dVar;
        this.f15335b = datatype;
        this.f15336c = iVar;
    }

    public boolean a(@m0 File file) {
        return this.f15334a.b(this.f15335b, file, this.f15336c);
    }
}
