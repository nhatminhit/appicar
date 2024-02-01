package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.view.menu.j;
import d.m0;
import f.a;

public class f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, j.a {
    public e O;
    public AlertDialog P;
    public c Q;
    public j.a R;

    public f(e eVar) {
        this.O = eVar;
    }

    public void a() {
        AlertDialog alertDialog = this.P;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    public void b(@m0 e eVar, boolean z10) {
        if (z10 || eVar == this.O) {
            a();
        }
        j.a aVar = this.R;
        if (aVar != null) {
            aVar.b(eVar, z10);
        }
    }

    public boolean c(@m0 e eVar) {
        j.a aVar = this.R;
        if (aVar != null) {
            return aVar.c(eVar);
        }
        return false;
    }

    public void d(j.a aVar) {
        this.R = aVar;
    }

    public void e(IBinder iBinder) {
        e eVar = this.O;
        AlertDialog.a aVar = new AlertDialog.a(eVar.x());
        c cVar = new c(aVar.b(), a.k.abc_list_menu_item_layout);
        this.Q = cVar;
        cVar.h(this);
        this.O.b(this.Q);
        aVar.c(this.Q.a(), this);
        View B = eVar.B();
        if (B != null) {
            aVar.f(B);
        } else {
            aVar.h(eVar.z()).K(eVar.A());
        }
        aVar.A(this);
        AlertDialog a10 = aVar.a();
        this.P = a10;
        a10.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.P.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.P.show();
    }

    public void onClick(DialogInterface dialogInterface, int i10) {
        this.O.O((h) this.Q.a().getItem(i10), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.Q.b(this.O, true);
    }

    public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.P.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.P.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.O.f(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.O.performShortcut(i10, keyEvent, 0);
    }
}
