package vn.icar.entertaiment.view.widget;

import android.content.Intent;
import android.widget.RemoteViewsService;
import wj.e;

public class ListTabWidgetRemoteViewService extends RemoteViewsService {
    public RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        return new e(getApplicationContext(), intent);
    }
}
