package wj;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import fh.g;
import java.util.ArrayList;
import java.util.Locale;
import sj.i;
import vn.icar.entertaiment.R;

public class e implements RemoteViewsService.RemoteViewsFactory {

    /* renamed from: a  reason: collision with root package name */
    public Context f24349a;

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<String> f24350b = new ArrayList<>();

    public e(Context context, @g Intent intent) {
        this.f24349a = context;
    }

    public final void a() {
        b(i.r(this.f24349a).s().equals("vi-VN") ? "vi" : i.r(this.f24349a).s().equals("km-KH") ? "km" : "en");
    }

    public void b(String str) {
        Locale locale = new Locale(str);
        Resources resources = this.f24349a.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        Configuration configuration = resources.getConfiguration();
        configuration.locale = locale;
        resources.updateConfiguration(configuration, displayMetrics);
    }

    public int getCount() {
        return this.f24350b.size();
    }

    public long getItemId(int i10) {
        return 0;
    }

    public RemoteViews getLoadingView() {
        return null;
    }

    public RemoteViews getViewAt(int i10) {
        RemoteViews remoteViews = new RemoteViews(this.f24349a.getPackageName(), R.layout.item_list_tab_widget);
        remoteViews.setTextViewText(R.id.txtTabName, this.f24350b.get(i10));
        Bundle bundle = new Bundle();
        bundle.putString("OPEN", this.f24350b.get(i10));
        Intent intent = new Intent();
        intent.putExtras(bundle);
        remoteViews.setOnClickFillInIntent(R.id.viewIteamTab, intent);
        return remoteViews;
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
        a();
        this.f24350b.clear();
        this.f24350b.add(this.f24349a.getResources().getString(R.string.youtube));
        this.f24350b.add(this.f24349a.getResources().getString(R.string.tv_online));
        this.f24350b.add(this.f24349a.getResources().getString(R.string.radio_online));
        this.f24350b.add(this.f24349a.getResources().getString(R.string.offline));
        this.f24350b.add(this.f24349a.getResources().getString(R.string.review));
        this.f24350b.add(this.f24349a.getResources().getString(R.string.short_story));
        this.f24350b.add(this.f24349a.getResources().getString(R.string.knowledge));
        this.f24350b.add(this.f24349a.getResources().getString(R.string.news));
        this.f24350b.add(this.f24349a.getResources().getString(R.string.children));
        this.f24350b.add(this.f24349a.getResources().getString(R.string.love_car));
    }

    public void onDestroy() {
    }
}
