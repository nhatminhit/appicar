package vn.icar.entertaiment.view.widget;

import android.content.Intent;
import android.widget.RemoteViewsService;
import wj.d;

public class EventWidgetRemoteViewsService extends RemoteViewsService {
    public RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        return new d(getApplicationContext(), intent);
    }
}
