package s7;

import android.opengl.GLES20;
import java.nio.FloatBuffer;
import w7.m;
import y7.d;

public final class d {

    /* renamed from: j  reason: collision with root package name */
    public static final String[] f12694j = {"uniform mat4 uMvpMatrix;", "uniform mat3 uTexMatrix;", "attribute vec4 aPosition;", "attribute vec2 aTexCoords;", "varying vec2 vTexCoords;", "void main() {", "  gl_Position = uMvpMatrix * aPosition;", "  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;", p7.a.f11639j};

    /* renamed from: k  reason: collision with root package name */
    public static final String[] f12695k = {"#extension GL_OES_EGL_image_external : require", "precision mediump float;", "uniform samplerExternalOES uTexture;", "varying vec2 vTexCoords;", "void main() {", "  gl_FragColor = texture2D(uTexture, vTexCoords);", p7.a.f11639j};

    /* renamed from: l  reason: collision with root package name */
    public static final float[] f12696l = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: m  reason: collision with root package name */
    public static final float[] f12697m = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: n  reason: collision with root package name */
    public static final float[] f12698n = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: o  reason: collision with root package name */
    public static final float[] f12699o = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: p  reason: collision with root package name */
    public static final float[] f12700p = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    public int f12701a;

    /* renamed from: b  reason: collision with root package name */
    public a f12702b;

    /* renamed from: c  reason: collision with root package name */
    public a f12703c;

    /* renamed from: d  reason: collision with root package name */
    public int f12704d;

    /* renamed from: e  reason: collision with root package name */
    public int f12705e;

    /* renamed from: f  reason: collision with root package name */
    public int f12706f;

    /* renamed from: g  reason: collision with root package name */
    public int f12707g;

    /* renamed from: h  reason: collision with root package name */
    public int f12708h;

    /* renamed from: i  reason: collision with root package name */
    public int f12709i;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f12710a;

        /* renamed from: b  reason: collision with root package name */
        public final FloatBuffer f12711b;

        /* renamed from: c  reason: collision with root package name */
        public final FloatBuffer f12712c;

        /* renamed from: d  reason: collision with root package name */
        public final int f12713d;

        public a(d.c cVar) {
            this.f12710a = cVar.a();
            this.f12711b = m.f(cVar.f15566c);
            this.f12712c = m.f(cVar.f15567d);
            int i10 = cVar.f15565b;
            this.f12713d = i10 != 1 ? i10 != 2 ? 4 : 6 : 5;
        }
    }

    public static boolean c(y7.d dVar) {
        d.b bVar = dVar.f15558a;
        d.b bVar2 = dVar.f15559b;
        return bVar.b() == 1 && bVar.a(0).f15564a == 0 && bVar2.b() == 1 && bVar2.a(0).f15564a == 0;
    }

    public void a(int i10, float[] fArr, boolean z10) {
        a aVar = z10 ? this.f12703c : this.f12702b;
        if (aVar != null) {
            GLES20.glUseProgram(this.f12704d);
            m.b();
            GLES20.glEnableVertexAttribArray(this.f12707g);
            GLES20.glEnableVertexAttribArray(this.f12708h);
            m.b();
            int i11 = this.f12701a;
            GLES20.glUniformMatrix3fv(this.f12706f, 1, false, i11 == 1 ? z10 ? f12698n : f12697m : i11 == 2 ? z10 ? f12700p : f12699o : f12696l, 0);
            GLES20.glUniformMatrix4fv(this.f12705e, 1, false, fArr, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i10);
            GLES20.glUniform1i(this.f12709i, 0);
            m.b();
            GLES20.glVertexAttribPointer(this.f12707g, 3, 5126, false, 12, aVar.f12711b);
            m.b();
            GLES20.glVertexAttribPointer(this.f12708h, 2, 5126, false, 8, aVar.f12712c);
            m.b();
            GLES20.glDrawArrays(aVar.f12713d, 0, aVar.f12710a);
            m.b();
            GLES20.glDisableVertexAttribArray(this.f12707g);
            GLES20.glDisableVertexAttribArray(this.f12708h);
        }
    }

    public void b() {
        int d10 = m.d(f12694j, f12695k);
        this.f12704d = d10;
        this.f12705e = GLES20.glGetUniformLocation(d10, "uMvpMatrix");
        this.f12706f = GLES20.glGetUniformLocation(this.f12704d, "uTexMatrix");
        this.f12707g = GLES20.glGetAttribLocation(this.f12704d, "aPosition");
        this.f12708h = GLES20.glGetAttribLocation(this.f12704d, "aTexCoords");
        this.f12709i = GLES20.glGetUniformLocation(this.f12704d, "uTexture");
    }

    public void d(y7.d dVar) {
        if (c(dVar)) {
            this.f12701a = dVar.f15560c;
            a aVar = new a(dVar.f15558a.a(0));
            this.f12702b = aVar;
            if (!dVar.f15561d) {
                aVar = new a(dVar.f15559b.a(0));
            }
            this.f12703c = aVar;
        }
    }

    public void e() {
        int i10 = this.f12704d;
        if (i10 != 0) {
            GLES20.glDeleteProgram(i10);
        }
    }
}
