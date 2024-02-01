package vn.icar.entertaiment;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.k;
import androidx.databinding.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import zi.b0;
import zi.d;
import zi.f;
import zi.r;
import zi.t;
import zi.t0;
import zi.v;
import zi.x;
import zi.z;

public class DataBinderMapperImpl extends k {

    /* renamed from: a  reason: collision with root package name */
    public static final int f23792a = 1;

    /* renamed from: b  reason: collision with root package name */
    public static final int f23793b = 2;

    /* renamed from: c  reason: collision with root package name */
    public static final int f23794c = 3;

    /* renamed from: d  reason: collision with root package name */
    public static final int f23795d = 4;

    /* renamed from: e  reason: collision with root package name */
    public static final int f23796e = 5;

    /* renamed from: f  reason: collision with root package name */
    public static final int f23797f = 6;

    /* renamed from: g  reason: collision with root package name */
    public static final int f23798g = 7;

    /* renamed from: h  reason: collision with root package name */
    public static final int f23799h = 8;

    /* renamed from: i  reason: collision with root package name */
    public static final int f23800i = 9;

    /* renamed from: j  reason: collision with root package name */
    public static final int f23801j = 10;

    /* renamed from: k  reason: collision with root package name */
    public static final SparseIntArray f23802k;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final SparseArray<String> f23803a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            f23803a = sparseArray;
            sparseArray.put(0, "_all");
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final HashMap<String, Integer> f23804a;

        static {
            HashMap<String, Integer> hashMap = new HashMap<>(10);
            f23804a = hashMap;
            hashMap.put("layout/activity_home_0", Integer.valueOf(R.layout.activity_home));
            hashMap.put("layout/activity_logo_0", Integer.valueOf(R.layout.activity_logo));
            hashMap.put("layout/activity_type_device_0", Integer.valueOf(R.layout.activity_type_device));
            hashMap.put("layout/fragment_music_and_video_offline_0", Integer.valueOf(R.layout.fragment_music_and_video_offline));
            hashMap.put("layout/fragment_music_and_video_offline_square_screen_0", Integer.valueOf(R.layout.fragment_music_and_video_offline_square_screen));
            hashMap.put("layout/fragment_tv_0", Integer.valueOf(R.layout.fragment_tv));
            hashMap.put("layout/fragment_tv_square_screen_0", Integer.valueOf(R.layout.fragment_tv_square_screen));
            hashMap.put("layout/fragment_youtobe_0", Integer.valueOf(R.layout.fragment_youtobe));
            hashMap.put("layout/fragment_youtobe_square_screen_0", Integer.valueOf(R.layout.fragment_youtobe_square_screen));
            hashMap.put("layout/setting_0", Integer.valueOf(R.layout.setting));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(10);
        f23802k = sparseIntArray;
        sparseIntArray.put(R.layout.activity_home, 1);
        sparseIntArray.put(R.layout.activity_logo, 2);
        sparseIntArray.put(R.layout.activity_type_device, 3);
        sparseIntArray.put(R.layout.fragment_music_and_video_offline, 4);
        sparseIntArray.put(R.layout.fragment_music_and_video_offline_square_screen, 5);
        sparseIntArray.put(R.layout.fragment_tv, 6);
        sparseIntArray.put(R.layout.fragment_tv_square_screen, 7);
        sparseIntArray.put(R.layout.fragment_youtobe, 8);
        sparseIntArray.put(R.layout.fragment_youtobe_square_screen, 9);
        sparseIntArray.put(R.layout.setting, 10);
    }

    public List<k> a() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.tatv.baseapp.DataBinderMapperImpl());
        arrayList.add(new vn.icar.baseauthentication.DataBinderMapperImpl());
        return arrayList;
    }

    public String b(int i10) {
        return a.f23803a.get(i10);
    }

    public ViewDataBinding c(l lVar, View view, int i10) {
        int i11 = f23802k.get(i10);
        if (i11 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag != null) {
            switch (i11) {
                case 1:
                    if ("layout/activity_home_0".equals(tag)) {
                        return new zi.b(lVar, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_home is invalid. Received: " + tag);
                case 2:
                    if ("layout/activity_logo_0".equals(tag)) {
                        return new d(lVar, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_logo is invalid. Received: " + tag);
                case 3:
                    if ("layout/activity_type_device_0".equals(tag)) {
                        return new f(lVar, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_type_device is invalid. Received: " + tag);
                case 4:
                    if ("layout/fragment_music_and_video_offline_0".equals(tag)) {
                        return new r(lVar, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_music_and_video_offline is invalid. Received: " + tag);
                case 5:
                    if ("layout/fragment_music_and_video_offline_square_screen_0".equals(tag)) {
                        return new t(lVar, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_music_and_video_offline_square_screen is invalid. Received: " + tag);
                case 6:
                    if ("layout/fragment_tv_0".equals(tag)) {
                        return new v(lVar, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_tv is invalid. Received: " + tag);
                case 7:
                    if ("layout/fragment_tv_square_screen_0".equals(tag)) {
                        return new x(lVar, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_tv_square_screen is invalid. Received: " + tag);
                case 8:
                    if ("layout/fragment_youtobe_0".equals(tag)) {
                        return new z(lVar, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_youtobe is invalid. Received: " + tag);
                case 9:
                    if ("layout/fragment_youtobe_square_screen_0".equals(tag)) {
                        return new b0(lVar, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_youtobe_square_screen is invalid. Received: " + tag);
                case 10:
                    if ("layout/setting_0".equals(tag)) {
                        return new t0(lVar, view);
                    }
                    throw new IllegalArgumentException("The tag for setting is invalid. Received: " + tag);
                default:
                    return null;
            }
        } else {
            throw new RuntimeException("view must have a tag");
        }
    }

    public ViewDataBinding d(l lVar, View[] viewArr, int i10) {
        if (viewArr == null || viewArr.length == 0 || f23802k.get(i10) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    public int e(String str) {
        Integer num;
        if (str == null || (num = b.f23804a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }
}
