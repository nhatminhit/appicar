package vn.icar.baseauthentication;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.k;
import androidx.databinding.l;
import hi.d;
import hi.f;
import hi.h;
import hi.j;
import hi.n;
import hi.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import vn.icar.baseauthentication.a;

public class DataBinderMapperImpl extends k {

    /* renamed from: a  reason: collision with root package name */
    public static final int f23762a = 1;

    /* renamed from: b  reason: collision with root package name */
    public static final int f23763b = 2;

    /* renamed from: c  reason: collision with root package name */
    public static final int f23764c = 3;

    /* renamed from: d  reason: collision with root package name */
    public static final int f23765d = 4;

    /* renamed from: e  reason: collision with root package name */
    public static final int f23766e = 5;

    /* renamed from: f  reason: collision with root package name */
    public static final int f23767f = 6;

    /* renamed from: g  reason: collision with root package name */
    public static final int f23768g = 7;

    /* renamed from: h  reason: collision with root package name */
    public static final int f23769h = 8;

    /* renamed from: i  reason: collision with root package name */
    public static final SparseIntArray f23770i;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final SparseArray<String> f23771a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            f23771a = sparseArray;
            sparseArray.put(0, "_all");
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final HashMap<String, Integer> f23772a;

        static {
            HashMap<String, Integer> hashMap = new HashMap<>(8);
            f23772a = hashMap;
            hashMap.put("layout/activity_option_login_0", Integer.valueOf(a.l.activity_option_login));
            hashMap.put("layout/activity_qr_auth_0", Integer.valueOf(a.l.activity_qr_auth));
            hashMap.put("layout/activity_qr_login_auth_0", Integer.valueOf(a.l.activity_qr_login_auth));
            hashMap.put("layout/view_device_limit_0", Integer.valueOf(a.l.view_device_limit));
            hashMap.put("layout/view_forgot_password_0", Integer.valueOf(a.l.view_forgot_password));
            hashMap.put("layout/view_login_0", Integer.valueOf(a.l.view_login));
            hashMap.put("layout/view_option_login_0", Integer.valueOf(a.l.view_option_login));
            hashMap.put("layout/view_sign_up_0", Integer.valueOf(a.l.view_sign_up));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(8);
        f23770i = sparseIntArray;
        sparseIntArray.put(a.l.activity_option_login, 1);
        sparseIntArray.put(a.l.activity_qr_auth, 2);
        sparseIntArray.put(a.l.activity_qr_login_auth, 3);
        sparseIntArray.put(a.l.view_device_limit, 4);
        sparseIntArray.put(a.l.view_forgot_password, 5);
        sparseIntArray.put(a.l.view_login, 6);
        sparseIntArray.put(a.l.view_option_login, 7);
        sparseIntArray.put(a.l.view_sign_up, 8);
    }

    public List<k> a() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.tatv.baseapp.DataBinderMapperImpl());
        return arrayList;
    }

    public String b(int i10) {
        return a.f23771a.get(i10);
    }

    public ViewDataBinding c(l lVar, View view, int i10) {
        int i11 = f23770i.get(i10);
        if (i11 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag != null) {
            switch (i11) {
                case 1:
                    if ("layout/activity_option_login_0".equals(tag)) {
                        return new hi.b(lVar, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_option_login is invalid. Received: " + tag);
                case 2:
                    if ("layout/activity_qr_auth_0".equals(tag)) {
                        return new d(lVar, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_qr_auth is invalid. Received: " + tag);
                case 3:
                    if ("layout/activity_qr_login_auth_0".equals(tag)) {
                        return new f(lVar, view);
                    }
                    throw new IllegalArgumentException("The tag for activity_qr_login_auth is invalid. Received: " + tag);
                case 4:
                    if ("layout/view_device_limit_0".equals(tag)) {
                        return new h(lVar, view);
                    }
                    throw new IllegalArgumentException("The tag for view_device_limit is invalid. Received: " + tag);
                case 5:
                    if ("layout/view_forgot_password_0".equals(tag)) {
                        return new j(lVar, view);
                    }
                    throw new IllegalArgumentException("The tag for view_forgot_password is invalid. Received: " + tag);
                case 6:
                    if ("layout/view_login_0".equals(tag)) {
                        return new hi.l(lVar, view);
                    }
                    throw new IllegalArgumentException("The tag for view_login is invalid. Received: " + tag);
                case 7:
                    if ("layout/view_option_login_0".equals(tag)) {
                        return new n(lVar, view);
                    }
                    throw new IllegalArgumentException("The tag for view_option_login is invalid. Received: " + tag);
                case 8:
                    if ("layout/view_sign_up_0".equals(tag)) {
                        return new p(lVar, view);
                    }
                    throw new IllegalArgumentException("The tag for view_sign_up is invalid. Received: " + tag);
                default:
                    return null;
            }
        } else {
            throw new RuntimeException("view must have a tag");
        }
    }

    public ViewDataBinding d(l lVar, View[] viewArr, int i10) {
        if (viewArr == null || viewArr.length == 0 || f23770i.get(i10) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    public int e(String str) {
        Integer num;
        if (str == null || (num = b.f23772a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }
}
