package com.tatv.baseapp;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.k;
import androidx.databinding.l;
import com.tatv.baseapp.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import nc.d;
import nc.f;
import nc.h;

public class DataBinderMapperImpl extends k {

    /* renamed from: a  reason: collision with root package name */
    public static final int f17773a = 1;

    /* renamed from: b  reason: collision with root package name */
    public static final int f17774b = 2;

    /* renamed from: c  reason: collision with root package name */
    public static final int f17775c = 3;

    /* renamed from: d  reason: collision with root package name */
    public static final int f17776d = 4;

    /* renamed from: e  reason: collision with root package name */
    public static final SparseIntArray f17777e;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final SparseArray<String> f17778a;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(1);
            f17778a = sparseArray;
            sparseArray.put(0, "_all");
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final HashMap<String, Integer> f17779a;

        static {
            HashMap<String, Integer> hashMap = new HashMap<>(4);
            f17779a = hashMap;
            hashMap.put("layout/dialog_confirm_0", Integer.valueOf(a.l.dialog_confirm));
            hashMap.put("layout/dialog_error_message_0", Integer.valueOf(a.l.dialog_error_message));
            hashMap.put("layout/dialog_permission_0", Integer.valueOf(a.l.dialog_permission));
            hashMap.put("layout/dialog_report_0", Integer.valueOf(a.l.dialog_report));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(4);
        f17777e = sparseIntArray;
        sparseIntArray.put(a.l.dialog_confirm, 1);
        sparseIntArray.put(a.l.dialog_error_message, 2);
        sparseIntArray.put(a.l.dialog_permission, 3);
        sparseIntArray.put(a.l.dialog_report, 4);
    }

    public List<k> a() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    public String b(int i10) {
        return a.f17778a.get(i10);
    }

    public ViewDataBinding c(l lVar, View view, int i10) {
        int i11 = f17777e.get(i10);
        if (i11 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        } else if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        return null;
                    }
                    if ("layout/dialog_report_0".equals(tag)) {
                        return new h(lVar, view);
                    }
                    throw new IllegalArgumentException("The tag for dialog_report is invalid. Received: " + tag);
                } else if ("layout/dialog_permission_0".equals(tag)) {
                    return new f(lVar, view);
                } else {
                    throw new IllegalArgumentException("The tag for dialog_permission is invalid. Received: " + tag);
                }
            } else if ("layout/dialog_error_message_0".equals(tag)) {
                return new d(lVar, view);
            } else {
                throw new IllegalArgumentException("The tag for dialog_error_message is invalid. Received: " + tag);
            }
        } else if ("layout/dialog_confirm_0".equals(tag)) {
            return new nc.b(lVar, view);
        } else {
            throw new IllegalArgumentException("The tag for dialog_confirm is invalid. Received: " + tag);
        }
    }

    public ViewDataBinding d(l lVar, View[] viewArr, int i10) {
        if (viewArr == null || viewArr.length == 0 || f17777e.get(i10) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    public int e(String str) {
        Integer num;
        if (str == null || (num = b.f17779a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }
}
