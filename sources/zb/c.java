package zb;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Build;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import og.c0;
import p7.f;
import pf.y0;
import zb.k;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final String f25033a = "CameraConfiguration";

    /* renamed from: b  reason: collision with root package name */
    public static final Pattern f25034b = Pattern.compile(";");

    /* renamed from: c  reason: collision with root package name */
    public static final float f25035c = 1.5f;

    /* renamed from: d  reason: collision with root package name */
    public static final float f25036d = 0.0f;

    /* renamed from: e  reason: collision with root package name */
    public static final int f25037e = 10;

    /* renamed from: f  reason: collision with root package name */
    public static final int f25038f = 20;

    /* renamed from: g  reason: collision with root package name */
    public static final int f25039g = 400;

    @TargetApi(15)
    public static List<Camera.Area> a(int i10) {
        int i11 = -i10;
        return Collections.singletonList(new Camera.Area(new Rect(i11, i11, i10, i10), 1));
    }

    public static String b(Camera.Parameters parameters) {
        return c(parameters.flatten());
    }

    public static String c(CharSequence charSequence) {
        StringBuilder sb2 = new StringBuilder(1000);
        sb2.append("BOARD=");
        sb2.append(Build.BOARD);
        sb2.append(10);
        sb2.append("BRAND=");
        sb2.append(Build.BRAND);
        sb2.append(10);
        sb2.append("CPU_ABI=");
        sb2.append(Build.CPU_ABI);
        sb2.append(10);
        sb2.append("DEVICE=");
        sb2.append(Build.DEVICE);
        sb2.append(10);
        sb2.append("DISPLAY=");
        sb2.append(Build.DISPLAY);
        sb2.append(10);
        sb2.append("FINGERPRINT=");
        sb2.append(Build.FINGERPRINT);
        sb2.append(10);
        sb2.append("HOST=");
        sb2.append(Build.HOST);
        sb2.append(10);
        sb2.append("ID=");
        sb2.append(Build.ID);
        sb2.append(10);
        sb2.append("MANUFACTURER=");
        sb2.append(Build.MANUFACTURER);
        sb2.append(10);
        sb2.append("MODEL=");
        sb2.append(Build.MODEL);
        sb2.append(10);
        sb2.append("PRODUCT=");
        sb2.append(Build.PRODUCT);
        sb2.append(10);
        sb2.append("TAGS=");
        sb2.append(Build.TAGS);
        sb2.append(10);
        sb2.append("TIME=");
        sb2.append(Build.TIME);
        sb2.append(10);
        sb2.append("TYPE=");
        sb2.append(Build.TYPE);
        sb2.append(10);
        sb2.append("USER=");
        sb2.append(Build.USER);
        sb2.append(10);
        sb2.append("VERSION.CODENAME=");
        sb2.append(Build.VERSION.CODENAME);
        sb2.append(10);
        sb2.append("VERSION.INCREMENTAL=");
        sb2.append(Build.VERSION.INCREMENTAL);
        sb2.append(10);
        sb2.append("VERSION.RELEASE=");
        sb2.append(Build.VERSION.RELEASE);
        sb2.append(10);
        sb2.append("VERSION.SDK_INT=");
        sb2.append(Build.VERSION.SDK_INT);
        sb2.append(10);
        if (charSequence != null) {
            String[] split = f25034b.split(charSequence);
            Arrays.sort(split);
            for (String append : split) {
                sb2.append(append);
                sb2.append(10);
            }
        }
        return sb2.toString();
    }

    public static String d(String str, Collection<String> collection, String... strArr) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Requesting ");
        sb2.append(str);
        sb2.append(" value from among: ");
        sb2.append(Arrays.toString(strArr));
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Supported ");
        sb3.append(str);
        sb3.append(" values: ");
        sb3.append(collection);
        if (collection == null) {
            return null;
        }
        for (String str2 : strArr) {
            if (collection.contains(str2)) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Can set ");
                sb4.append(str);
                sb4.append(" to: ");
                sb4.append(str2);
                return str2;
            }
        }
        return null;
    }

    public static Integer e(Camera.Parameters parameters, double d10) {
        List<Integer> zoomRatios = parameters.getZoomRatios();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Zoom ratios: ");
        sb2.append(zoomRatios);
        int maxZoom = parameters.getMaxZoom();
        if (zoomRatios == null || zoomRatios.isEmpty() || zoomRatios.size() != maxZoom + 1) {
            return null;
        }
        double d11 = d10 * 100.0d;
        double d12 = Double.POSITIVE_INFINITY;
        int i10 = 0;
        for (int i11 = 0; i11 < zoomRatios.size(); i11++) {
            double abs = Math.abs(((double) zoomRatios.get(i11).intValue()) - d11);
            if (abs < d12) {
                i10 = i11;
                d12 = abs;
            }
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Chose zoom ratio of ");
        sb3.append(((double) zoomRatios.get(i10).intValue()) / 100.0d);
        return Integer.valueOf(i10);
    }

    public static void f(Camera.Parameters parameters) {
        String d10;
        if (!"barcode".equals(parameters.getSceneMode()) && (d10 = d("scene mode", parameters.getSupportedSceneModes(), "barcode")) != null) {
            parameters.setSceneMode(d10);
        }
    }

    public static void g(Camera.Parameters parameters, boolean z10) {
        int minExposureCompensation = parameters.getMinExposureCompensation();
        int maxExposureCompensation = parameters.getMaxExposureCompensation();
        float exposureCompensationStep = parameters.getExposureCompensationStep();
        if (minExposureCompensation != 0 || maxExposureCompensation != 0) {
            float f10 = 0.0f;
            if (exposureCompensationStep > 0.0f) {
                if (!z10) {
                    f10 = 1.5f;
                }
                int round = Math.round(f10 / exposureCompensationStep);
                float f11 = exposureCompensationStep * ((float) round);
                int max = Math.max(Math.min(round, maxExposureCompensation), minExposureCompensation);
                if (parameters.getExposureCompensation() == max) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Exposure compensation already set to ");
                    sb2.append(max);
                    sb2.append(" / ");
                    sb2.append(f11);
                    return;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Setting exposure compensation to ");
                sb3.append(max);
                sb3.append(" / ");
                sb3.append(f11);
                parameters.setExposureCompensation(max);
            }
        }
    }

    public static void h(Camera.Parameters parameters) {
        i(parameters, 10, 20);
    }

    public static void i(Camera.Parameters parameters, int i10, int i11) {
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Supported FPS ranges: ");
        sb2.append(r(supportedPreviewFpsRange));
        if (supportedPreviewFpsRange != null && !supportedPreviewFpsRange.isEmpty()) {
            int[] iArr = null;
            Iterator<int[]> it = supportedPreviewFpsRange.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int[] next = it.next();
                int i12 = next[0];
                int i13 = next[1];
                if (i12 >= i10 * 1000 && i13 <= i11 * 1000) {
                    iArr = next;
                    break;
                }
            }
            if (iArr != null) {
                int[] iArr2 = new int[2];
                parameters.getPreviewFpsRange(iArr2);
                if (Arrays.equals(iArr2, iArr)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("FPS range already set to ");
                    sb3.append(Arrays.toString(iArr));
                    return;
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Setting FPS range to ");
                sb4.append(Arrays.toString(iArr));
                parameters.setPreviewFpsRange(iArr[0], iArr[1]);
            }
        }
    }

    public static void j(Camera.Parameters parameters, k.a aVar, boolean z10) {
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        String d10 = (z10 || aVar == k.a.AUTO) ? d("focus mode", supportedFocusModes, y0.f22055c) : aVar == k.a.CONTINUOUS ? d("focus mode", supportedFocusModes, "continuous-picture", "continuous-video", y0.f22055c) : aVar == k.a.INFINITY ? d("focus mode", supportedFocusModes, "infinity") : aVar == k.a.MACRO ? d("focus mode", supportedFocusModes, "macro") : null;
        if (!z10 && d10 == null) {
            d10 = d("focus mode", supportedFocusModes, "macro", "edof");
        }
        if (d10 == null) {
            return;
        }
        if (d10.equals(parameters.getFocusMode())) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Focus mode already set to ");
            sb2.append(d10);
            return;
        }
        parameters.setFocusMode(d10);
    }

    @TargetApi(15)
    public static void k(Camera.Parameters parameters) {
        if (parameters.getMaxNumFocusAreas() > 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Old focus areas: ");
            sb2.append(q(parameters.getFocusAreas()));
            List<Camera.Area> a10 = a(400);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Setting focus area to : ");
            sb3.append(q(a10));
            parameters.setFocusAreas(a10);
        }
    }

    public static void l(Camera.Parameters parameters) {
        String d10;
        if (!"negative".equals(parameters.getColorEffect()) && (d10 = d("color effect", parameters.getSupportedColorEffects(), "negative")) != null) {
            parameters.setColorEffect(d10);
        }
    }

    @TargetApi(15)
    public static void m(Camera.Parameters parameters) {
        if (parameters.getMaxNumMeteringAreas() > 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Old metering areas: ");
            sb2.append(parameters.getMeteringAreas());
            List<Camera.Area> a10 = a(400);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Setting metering area to : ");
            sb3.append(q(a10));
            parameters.setMeteringAreas(a10);
        }
    }

    public static void n(Camera.Parameters parameters, boolean z10) {
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        String d10 = z10 ? d("flash mode", supportedFlashModes, "torch", y0.f22056d) : d("flash mode", supportedFlashModes, y0.f22057e);
        if (d10 == null) {
            return;
        }
        if (d10.equals(parameters.getFlashMode())) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Flash mode already set to ");
            sb2.append(d10);
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Setting flash mode to ");
        sb3.append(d10);
        parameters.setFlashMode(d10);
    }

    @TargetApi(15)
    public static void o(Camera.Parameters parameters) {
        if (parameters.isVideoStabilizationSupported() && !parameters.getVideoStabilization()) {
            parameters.setVideoStabilization(true);
        }
    }

    public static void p(Camera.Parameters parameters, double d10) {
        Integer e10;
        if (parameters.isZoomSupported() && (e10 = e(parameters, d10)) != null) {
            if (parameters.getZoom() == e10.intValue()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Zoom is already set to ");
                sb2.append(e10);
                return;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Setting zoom to ");
            sb3.append(e10);
            parameters.setZoom(e10.intValue());
        }
    }

    @TargetApi(15)
    public static String q(Iterable<Camera.Area> iterable) {
        if (iterable == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (Camera.Area next : iterable) {
            sb2.append(next.rect);
            sb2.append(':');
            sb2.append(next.weight);
            sb2.append(f.f11698i);
        }
        return sb2.toString();
    }

    public static String r(Collection<int[]> collection) {
        if (collection == null || collection.isEmpty()) {
            return c0.f21474n;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        Iterator<int[]> it = collection.iterator();
        while (it.hasNext()) {
            sb2.append(Arrays.toString(it.next()));
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(']');
        return sb2.toString();
    }
}
