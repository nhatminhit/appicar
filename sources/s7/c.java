package s7;

import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.FloatBuffer;
import p7.a;
import w7.m;

public final class c {

    /* renamed from: g  reason: collision with root package name */
    public static final float f12682g = 0.01f;

    /* renamed from: h  reason: collision with root package name */
    public static final float f12683h = 1.0f;

    /* renamed from: i  reason: collision with root package name */
    public static final String[] f12684i = {"uniform mat4 uMvpMatrix;", "attribute vec3 aPosition;", "varying vec2 vCoords;", "void main() {", "  gl_Position = uMvpMatrix * vec4(aPosition, 1);", "  vCoords = aPosition.xy / vec2(0.01, 0.01);", a.f11639j};

    /* renamed from: j  reason: collision with root package name */
    public static final String[] f12685j = {"precision mediump float;", "varying vec2 vCoords;", "void main() {", "  float r = length(vCoords);", "  float alpha = smoothstep(0.5, 0.6, r) * (1.0 - smoothstep(0.8, 0.9, r));", "  if (alpha == 0.0) {", "    discard;", "  } else {", "    gl_FragColor = vec4(alpha);", "  }", a.f11639j};

    /* renamed from: k  reason: collision with root package name */
    public static final int f12686k = 3;

    /* renamed from: l  reason: collision with root package name */
    public static final float[] f12687l = {-0.01f, -0.01f, -1.0f, 0.01f, -0.01f, -1.0f, -0.01f, 0.01f, -1.0f, 0.01f, 0.01f, -1.0f};

    /* renamed from: a  reason: collision with root package name */
    public final FloatBuffer f12688a = m.f(f12687l);

    /* renamed from: b  reason: collision with root package name */
    public final float[] f12689b = new float[16];

    /* renamed from: c  reason: collision with root package name */
    public final float[] f12690c;

    /* renamed from: d  reason: collision with root package name */
    public int f12691d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f12692e;

    /* renamed from: f  reason: collision with root package name */
    public int f12693f;

    public c() {
        float[] fArr = new float[16];
        this.f12690c = fArr;
        Matrix.setIdentityM(fArr, 0);
    }

    public void a(float[] fArr) {
        GLES20.glUseProgram(this.f12691d);
        m.b();
        synchronized (this.f12690c) {
            Matrix.multiplyMM(this.f12689b, 0, fArr, 0, this.f12690c, 0);
        }
        GLES20.glUniformMatrix4fv(this.f12692e, 1, false, this.f12689b, 0);
        m.b();
        GLES20.glEnableVertexAttribArray(this.f12693f);
        m.b();
        GLES20.glVertexAttribPointer(this.f12693f, 3, 5126, false, 0, this.f12688a);
        m.b();
        GLES20.glDrawArrays(5, 0, f12687l.length / 3);
        m.b();
        GLES20.glDisableVertexAttribArray(this.f12693f);
    }

    public void b() {
        if (this.f12691d == 0) {
            int d10 = m.d(f12684i, f12685j);
            this.f12691d = d10;
            this.f12692e = GLES20.glGetUniformLocation(d10, "uMvpMatrix");
            this.f12693f = GLES20.glGetAttribLocation(this.f12691d, "aPosition");
            m.b();
        }
    }

    public void c(float[] fArr) {
        synchronized (this.f12690c) {
            System.arraycopy(fArr, 0, this.f12690c, 0, fArr.length);
        }
    }

    public void d() {
        int i10 = this.f12691d;
        if (i10 != 0) {
            GLES20.glDeleteProgram(i10);
        }
    }
}
