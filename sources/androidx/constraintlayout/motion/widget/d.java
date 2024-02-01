package androidx.constraintlayout.motion.widget;

import androidx.constraintlayout.motion.widget.a;

public class d {

    /* renamed from: a  reason: collision with root package name */
    public static final String f1737a = "TransitionBuilder";

    public static a.b a(a aVar, int i10, int i11, androidx.constraintlayout.widget.d dVar, int i12, androidx.constraintlayout.widget.d dVar2) {
        a.b bVar = new a.b(i10, aVar, i11, i12);
        b(aVar, bVar, dVar, dVar2);
        return bVar;
    }

    public static void b(a aVar, a.b bVar, androidx.constraintlayout.widget.d dVar, androidx.constraintlayout.widget.d dVar2) {
        int G = bVar.G();
        int z10 = bVar.z();
        aVar.W(G, dVar);
        aVar.W(z10, dVar2);
    }

    public static void c(MotionLayout motionLayout) {
        a aVar = motionLayout.f1607x0;
        if (aVar == null) {
            throw new RuntimeException("Invalid motion layout. Layout missing Motion Scene.");
        } else if (!aVar.f0(motionLayout)) {
            throw new RuntimeException("MotionLayout doesn't have the right motion scene.");
        } else if (aVar.f1666c == null || aVar.o().isEmpty()) {
            throw new RuntimeException("Invalid motion layout. Motion Scene doesn't have any transition.");
        }
    }
}
