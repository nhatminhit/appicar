package n1;

import android.widget.TabHost;
import androidx.databinding.d;
import androidx.databinding.n;
import androidx.databinding.o;
import d.x0;

@x0({x0.a.LIBRARY})
public class c0 {

    public class a implements TabHost.OnTabChangeListener {
        public final /* synthetic */ TabHost.OnTabChangeListener O;
        public final /* synthetic */ o P;

        public a(TabHost.OnTabChangeListener onTabChangeListener, o oVar) {
            this.O = onTabChangeListener;
            this.P = oVar;
        }

        public void onTabChanged(String str) {
            TabHost.OnTabChangeListener onTabChangeListener = this.O;
            if (onTabChangeListener != null) {
                onTabChangeListener.onTabChanged(str);
            }
            this.P.a();
        }
    }

    @n(attribute = "android:currentTab")
    public static int a(TabHost tabHost) {
        return tabHost.getCurrentTab();
    }

    @n(attribute = "android:currentTab")
    public static String b(TabHost tabHost) {
        return tabHost.getCurrentTabTag();
    }

    @d({"android:currentTab"})
    public static void c(TabHost tabHost, int i10) {
        if (tabHost.getCurrentTab() != i10) {
            tabHost.setCurrentTab(i10);
        }
    }

    @d({"android:currentTab"})
    public static void d(TabHost tabHost, String str) {
        String currentTabTag = tabHost.getCurrentTabTag();
        if ((currentTabTag != null && !currentTabTag.equals(str)) || (currentTabTag == null && str != null)) {
            tabHost.setCurrentTabByTag(str);
        }
    }

    @d(requireAll = false, value = {"android:onTabChanged", "android:currentTabAttrChanged"})
    public static void e(TabHost tabHost, TabHost.OnTabChangeListener onTabChangeListener, o oVar) {
        if (oVar == null) {
            tabHost.setOnTabChangedListener(onTabChangeListener);
        } else {
            tabHost.setOnTabChangedListener(new a(onTabChangeListener, oVar));
        }
    }
}
