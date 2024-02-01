package z6;

public final /* synthetic */ class e {
    public static boolean a(f fVar) {
        return fVar.getCount() == 0 || fVar.getPosition() == fVar.getCount();
    }

    public static boolean b(f fVar) {
        return fVar.getCount() == 0 || fVar.getPosition() == -1;
    }

    public static boolean c(f fVar) {
        return fVar.getPosition() == 0 && fVar.getCount() != 0;
    }

    public static boolean d(f fVar) {
        int count = fVar.getCount();
        return fVar.getPosition() == count + -1 && count != 0;
    }

    public static boolean e(f fVar) {
        return fVar.moveToPosition(0);
    }

    public static boolean f(f fVar) {
        return fVar.moveToPosition(fVar.getCount() - 1);
    }

    public static boolean g(f fVar) {
        return fVar.moveToPosition(fVar.getPosition() + 1);
    }

    public static boolean h(f fVar) {
        return fVar.moveToPosition(fVar.getPosition() - 1);
    }
}
