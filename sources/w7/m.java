package w7;

import android.opengl.GLES20;
import android.opengl.GLU;
import android.text.TextUtils;
import eg.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final String f14770a = "GlUtil";

    public static void a(int i10, String str, int i11) {
        int glCreateShader = GLES20.glCreateShader(i10);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            h(GLES20.glGetShaderInfoLog(glCreateShader) + ", source: " + str);
        }
        GLES20.glAttachShader(i11, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        b();
    }

    public static void b() {
        int i10 = 0;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError != 0) {
                p.d(f14770a, "glError " + GLU.gluErrorString(i10));
                i10 = glGetError;
            } else {
                return;
            }
        }
    }

    public static int c(String str, String str2) {
        int glCreateProgram = GLES20.glCreateProgram();
        b();
        a(35633, str, glCreateProgram);
        a(35632, str2, glCreateProgram);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            h("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(glCreateProgram));
        }
        b();
        return glCreateProgram;
    }

    public static int d(String[] strArr, String[] strArr2) {
        return c(TextUtils.join("\n", strArr), TextUtils.join("\n", strArr2));
    }

    public static FloatBuffer e(int i10) {
        return ByteBuffer.allocateDirect(i10 * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    public static FloatBuffer f(float[] fArr) {
        return (FloatBuffer) e(fArr.length).put(fArr).flip();
    }

    public static int g() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, IntBuffer.wrap(iArr));
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, a.G0, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        b();
        return iArr[0];
    }

    public static void h(String str) {
        p.d(f14770a, str);
    }
}
