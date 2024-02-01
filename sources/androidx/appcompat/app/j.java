package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.a;

public class j implements AdapterView.OnItemSelectedListener {
    public final a.e O;

    public j(a.e eVar) {
        this.O = eVar;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
        a.e eVar = this.O;
        if (eVar != null) {
            eVar.onNavigationItemSelected(i10, j10);
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }
}
