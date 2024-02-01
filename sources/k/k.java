package k;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import d.t0;
import d.x0;
import java.util.List;

@x0({x0.a.LIBRARY_GROUP_PREFIX})
public class k implements Window.Callback {
    public final Window.Callback O;

    public k(Window.Callback callback) {
        if (callback != null) {
            this.O = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    public final Window.Callback a() {
        return this.O;
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.O.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.O.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.O.dispatchKeyShortcutEvent(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.O.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.O.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.O.dispatchTrackballEvent(motionEvent);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.O.onActionModeFinished(actionMode);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.O.onActionModeStarted(actionMode);
    }

    public void onAttachedToWindow() {
        this.O.onAttachedToWindow();
    }

    public void onContentChanged() {
        this.O.onContentChanged();
    }

    public boolean onCreatePanelMenu(int i10, Menu menu) {
        return this.O.onCreatePanelMenu(i10, menu);
    }

    public View onCreatePanelView(int i10) {
        return this.O.onCreatePanelView(i10);
    }

    public void onDetachedFromWindow() {
        this.O.onDetachedFromWindow();
    }

    public boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        return this.O.onMenuItemSelected(i10, menuItem);
    }

    public boolean onMenuOpened(int i10, Menu menu) {
        return this.O.onMenuOpened(i10, menu);
    }

    public void onPanelClosed(int i10, Menu menu) {
        this.O.onPanelClosed(i10, menu);
    }

    @t0(26)
    public void onPointerCaptureChanged(boolean z10) {
        this.O.onPointerCaptureChanged(z10);
    }

    public boolean onPreparePanel(int i10, View view, Menu menu) {
        return this.O.onPreparePanel(i10, view, menu);
    }

    @t0(24)
    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i10) {
        this.O.onProvideKeyboardShortcuts(list, menu, i10);
    }

    public boolean onSearchRequested() {
        return this.O.onSearchRequested();
    }

    @t0(23)
    public boolean onSearchRequested(SearchEvent searchEvent) {
        return this.O.onSearchRequested(searchEvent);
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.O.onWindowAttributesChanged(layoutParams);
    }

    public void onWindowFocusChanged(boolean z10) {
        this.O.onWindowFocusChanged(z10);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return this.O.onWindowStartingActionMode(callback);
    }

    @t0(23)
    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
        return this.O.onWindowStartingActionMode(callback, i10);
    }
}
