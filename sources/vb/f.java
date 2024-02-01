package vb;

public enum f {
    L(1),
    M(0),
    Q(3),
    H(2);
    
    public static final f[] T = null;
    public final int O;

    /* access modifiers changed from: public */
    static {
        f fVar;
        f fVar2;
        f fVar3;
        f fVar4;
        T = new f[]{fVar2, fVar, fVar4, fVar3};
    }

    /* access modifiers changed from: public */
    f(int i10) {
        this.O = i10;
    }

    public static f a(int i10) {
        if (i10 >= 0) {
            f[] fVarArr = T;
            if (i10 < fVarArr.length) {
                return fVarArr[i10];
            }
        }
        throw new IllegalArgumentException();
    }

    public int b() {
        return this.O;
    }
}
