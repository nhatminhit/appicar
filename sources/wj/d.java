package wj;

import aj.a;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import fh.g;
import java.util.ArrayList;
import ui.a;
import vi.c;
import vn.icar.entertaiment.view.fragment.OfflineFragment;
import vn.icar.entertaiment.view.fragment.TvFragment;
import vn.icar.entertaiment.view.fragment.YoutubeFragment;
import yi.b;

public class d implements RemoteViewsService.RemoteViewsFactory {

    /* renamed from: a  reason: collision with root package name */
    public Context f24348a;

    public d(Context context, @g Intent intent) {
        this.f24348a = context;
    }

    public int getCount() {
        ArrayList arrayList;
        String str = a.b().f23398a.toString();
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1548612125:
                if (str.equals(a.e.f16179k)) {
                    c10 = 0;
                    break;
                }
                break;
            case 2690:
                if (str.equals("TV")) {
                    c10 = 1;
                    break;
                }
                break;
            case 78717915:
                if (str.equals("Radio")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                ArrayList<ti.a> arrayList2 = OfflineFragment.M1;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    arrayList = OfflineFragment.M1;
                    break;
                } else {
                    return 0;
                }
            case 1:
            case 2:
                ArrayList<c.a> arrayList3 = TvFragment.S1;
                if (arrayList3 != null && arrayList3.size() > 0) {
                    arrayList = TvFragment.S1;
                    break;
                } else {
                    return 0;
                }
            default:
                try {
                    ArrayList<b.a> arrayList4 = YoutubeFragment.P1;
                    if (arrayList4 == null || arrayList4.size() <= 0) {
                        return 0;
                    }
                    return YoutubeFragment.P1.size();
                } catch (Exception unused) {
                    return 0;
                }
        }
        return arrayList.size();
    }

    public long getItemId(int i10) {
        return 0;
    }

    public RemoteViews getLoadingView() {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0078, code lost:
        if (vn.icar.entertaiment.view.fragment.YoutubeFragment.P1.get(r7).m() != false) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007a, code lost:
        r0.setImageViewResource(vn.icar.entertaiment.R.id.imgPlayRadio, vn.icar.entertaiment.R.drawable.ic_baseline_pause_24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007e, code lost:
        r0.setImageViewResource(vn.icar.entertaiment.R.id.imgPlayRadio, vn.icar.entertaiment.R.drawable.ic_baseline_play_arrow_24);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00cf, code lost:
        if (vn.icar.entertaiment.view.fragment.OfflineFragment.M1.get(r7).g() != false) goto L_0x007a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.widget.RemoteViews getViewAt(int r7) {
        /*
            r6 = this;
            android.widget.RemoteViews r0 = new android.widget.RemoteViews
            android.content.Context r1 = r6.f24348a
            java.lang.String r1 = r1.getPackageName()
            r2 = 2131492956(0x7f0c005c, float:1.8609379E38)
            r0.<init>(r1, r2)
            ui.a r1 = ui.a.b()
            java.lang.String r1 = r1.f23398a
            java.lang.String r1 = r1.toString()
            r1.hashCode()
            int r2 = r1.hashCode()
            r3 = -1
            switch(r2) {
                case -1548612125: goto L_0x003a;
                case 2690: goto L_0x002f;
                case 78717915: goto L_0x0024;
                default: goto L_0x0023;
            }
        L_0x0023:
            goto L_0x0044
        L_0x0024:
            java.lang.String r2 = "Radio"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x002d
            goto L_0x0044
        L_0x002d:
            r3 = 2
            goto L_0x0044
        L_0x002f:
            java.lang.String r2 = "TV"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0038
            goto L_0x0044
        L_0x0038:
            r3 = 1
            goto L_0x0044
        L_0x003a:
            java.lang.String r2 = "offline"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0043
            goto L_0x0044
        L_0x0043:
            r3 = 0
        L_0x0044:
            r1 = 2131165566(0x7f07017e, float:1.7945353E38)
            r2 = 2131165567(0x7f07017f, float:1.7945355E38)
            r4 = 2131296862(0x7f09025e, float:1.8211653E38)
            r5 = 2131296538(0x7f09011a, float:1.8210996E38)
            switch(r3) {
                case 0: goto L_0x00aa;
                case 1: goto L_0x0082;
                case 2: goto L_0x0082;
                default: goto L_0x0053;
            }
        L_0x0053:
            java.util.ArrayList<yi.b$a> r3 = vn.icar.entertaiment.view.fragment.YoutubeFragment.P1     // Catch:{ Exception -> 0x00d2 }
            if (r3 == 0) goto L_0x00d2
            int r3 = r3.size()     // Catch:{ Exception -> 0x00d2 }
            if (r3 <= 0) goto L_0x00d2
            java.util.ArrayList<yi.b$a> r3 = vn.icar.entertaiment.view.fragment.YoutubeFragment.P1     // Catch:{ Exception -> 0x00d2 }
            java.lang.Object r3 = r3.get(r7)     // Catch:{ Exception -> 0x00d2 }
            yi.b$a r3 = (yi.b.a) r3     // Catch:{ Exception -> 0x00d2 }
            java.lang.String r3 = r3.f()     // Catch:{ Exception -> 0x00d2 }
            r0.setTextViewText(r4, r3)     // Catch:{ Exception -> 0x00d2 }
            java.util.ArrayList<yi.b$a> r3 = vn.icar.entertaiment.view.fragment.YoutubeFragment.P1     // Catch:{ Exception -> 0x00d2 }
            java.lang.Object r3 = r3.get(r7)     // Catch:{ Exception -> 0x00d2 }
            yi.b$a r3 = (yi.b.a) r3     // Catch:{ Exception -> 0x00d2 }
            boolean r3 = r3.m()     // Catch:{ Exception -> 0x00d2 }
            if (r3 == 0) goto L_0x007e
        L_0x007a:
            r0.setImageViewResource(r5, r1)     // Catch:{ Exception -> 0x00d2 }
            goto L_0x00d2
        L_0x007e:
            r0.setImageViewResource(r5, r2)     // Catch:{ Exception -> 0x00d2 }
            goto L_0x00d2
        L_0x0082:
            java.util.ArrayList<vi.c$a> r3 = vn.icar.entertaiment.view.fragment.TvFragment.S1     // Catch:{ Exception -> 0x00d2 }
            if (r3 == 0) goto L_0x00d2
            int r3 = r3.size()     // Catch:{ Exception -> 0x00d2 }
            if (r3 <= 0) goto L_0x00d2
            java.util.ArrayList<vi.c$a> r3 = vn.icar.entertaiment.view.fragment.TvFragment.S1     // Catch:{ Exception -> 0x00d2 }
            java.lang.Object r3 = r3.get(r7)     // Catch:{ Exception -> 0x00d2 }
            vi.c$a r3 = (vi.c.a) r3     // Catch:{ Exception -> 0x00d2 }
            java.lang.String r3 = r3.d()     // Catch:{ Exception -> 0x00d2 }
            r0.setTextViewText(r4, r3)     // Catch:{ Exception -> 0x00d2 }
            java.util.ArrayList<vi.c$a> r3 = vn.icar.entertaiment.view.fragment.TvFragment.S1     // Catch:{ Exception -> 0x00d2 }
            java.lang.Object r3 = r3.get(r7)     // Catch:{ Exception -> 0x00d2 }
            vi.c$a r3 = (vi.c.a) r3     // Catch:{ Exception -> 0x00d2 }
            boolean r3 = r3.i()     // Catch:{ Exception -> 0x00d2 }
            if (r3 == 0) goto L_0x007e
            goto L_0x007a
        L_0x00aa:
            java.util.ArrayList<ti.a> r3 = vn.icar.entertaiment.view.fragment.OfflineFragment.M1     // Catch:{ Exception -> 0x00d2 }
            if (r3 == 0) goto L_0x00d2
            int r3 = r3.size()     // Catch:{ Exception -> 0x00d2 }
            if (r3 <= 0) goto L_0x00d2
            java.util.ArrayList<ti.a> r3 = vn.icar.entertaiment.view.fragment.OfflineFragment.M1     // Catch:{ Exception -> 0x00d2 }
            java.lang.Object r3 = r3.get(r7)     // Catch:{ Exception -> 0x00d2 }
            ti.a r3 = (ti.a) r3     // Catch:{ Exception -> 0x00d2 }
            java.lang.String r3 = r3.e()     // Catch:{ Exception -> 0x00d2 }
            r0.setTextViewText(r4, r3)     // Catch:{ Exception -> 0x00d2 }
            java.util.ArrayList<ti.a> r3 = vn.icar.entertaiment.view.fragment.OfflineFragment.M1     // Catch:{ Exception -> 0x00d2 }
            java.lang.Object r3 = r3.get(r7)     // Catch:{ Exception -> 0x00d2 }
            ti.a r3 = (ti.a) r3     // Catch:{ Exception -> 0x00d2 }
            boolean r3 = r3.g()     // Catch:{ Exception -> 0x00d2 }
            if (r3 == 0) goto L_0x007e
            goto L_0x007a
        L_0x00d2:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r2 = "OPEN"
            r1.putString(r2, r7)
            android.content.Intent r7 = new android.content.Intent
            r7.<init>()
            r7.putExtras(r1)
            r1 = 2131296945(0x7f0902b1, float:1.821182E38)
            r0.setOnClickFillInIntent(r1, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wj.d.getViewAt(int):android.widget.RemoteViews");
    }

    public int getViewTypeCount() {
        return 1;
    }

    public boolean hasStableIds() {
        return true;
    }

    public void onCreate() {
    }

    public void onDataSetChanged() {
    }

    public void onDestroy() {
    }
}
