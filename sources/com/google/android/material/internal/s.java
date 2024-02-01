package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import d.m0;
import d.x0;
import f1.w1;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class s implements u {

    /* renamed from: a  reason: collision with root package name */
    public a f17261a;

    @SuppressLint({"ViewConstructor", "PrivateApi"})
    public static class a extends ViewGroup {
        public static Method T;
        public ViewGroup O;
        public View P;
        public ArrayList<Drawable> Q = null;
        public s R;
        public boolean S;

        static {
            Class<ViewGroup> cls = ViewGroup.class;
            try {
                Class cls2 = Integer.TYPE;
                T = cls.getDeclaredMethod("invalidateChildInParentFast", new Class[]{cls2, cls2, Rect.class});
            } catch (NoSuchMethodException unused) {
            }
        }

        public a(Context context, ViewGroup viewGroup, View view, s sVar) {
            super(context);
            this.O = viewGroup;
            this.P = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.R = sVar;
        }

        public void a(Drawable drawable) {
            c();
            if (this.Q == null) {
                this.Q = new ArrayList<>();
            }
            if (!this.Q.contains(drawable)) {
                this.Q.add(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(this);
            }
        }

        public void b(View view) {
            c();
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (!(viewGroup == this.O || viewGroup.getParent() == null || !w1.N0(viewGroup))) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.O.getLocationOnScreen(iArr2);
                    w1.c1(view, iArr[0] - iArr2[0]);
                    w1.d1(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view);
        }

        public final void c() {
            if (this.S) {
                throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
            }
        }

        public final void d() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.Q;
                if (arrayList == null || arrayList.size() == 0) {
                    this.S = true;
                    this.O.removeView(this);
                }
            }
        }

        public void dispatchDraw(Canvas canvas) {
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            this.O.getLocationOnScreen(iArr);
            this.P.getLocationOnScreen(iArr2);
            canvas.translate((float) (iArr2[0] - iArr[0]), (float) (iArr2[1] - iArr[1]));
            canvas.clipRect(new Rect(0, 0, this.P.getWidth(), this.P.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.Q;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.Q.get(i10).draw(canvas);
            }
        }

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        public final void e(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.O.getLocationOnScreen(iArr2);
            this.P.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        @x0({x0.a.LIBRARY_GROUP_PREFIX})
        public ViewParent f(int i10, int i11, Rect rect) {
            if (this.O == null || T == null) {
                return null;
            }
            try {
                e(new int[2]);
                T.invoke(this.O, new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), rect});
                return null;
            } catch (IllegalAccessException | InvocationTargetException e10) {
                e10.printStackTrace();
                return null;
            }
        }

        public void g(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.Q;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback((Drawable.Callback) null);
                d();
            }
        }

        public void h(View view) {
            super.removeView(view);
            d();
        }

        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.O == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            if (this.O != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                int[] iArr2 = new int[2];
                e(iArr2);
                rect.offset(iArr2[0], iArr2[1]);
                return super.invalidateChildInParent(iArr, rect);
            }
            invalidate(rect);
            return null;
        }

        public void invalidateDrawable(@m0 Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r0 = r1.Q;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean verifyDrawable(@d.m0 android.graphics.drawable.Drawable r2) {
            /*
                r1 = this;
                boolean r0 = super.verifyDrawable(r2)
                if (r0 != 0) goto L_0x0013
                java.util.ArrayList<android.graphics.drawable.Drawable> r0 = r1.Q
                if (r0 == 0) goto L_0x0011
                boolean r2 = r0.contains(r2)
                if (r2 == 0) goto L_0x0011
                goto L_0x0013
            L_0x0011:
                r2 = 0
                goto L_0x0014
            L_0x0013:
                r2 = 1
            L_0x0014:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.s.a.verifyDrawable(android.graphics.drawable.Drawable):boolean");
        }
    }

    public s(Context context, ViewGroup viewGroup, View view) {
        this.f17261a = new a(context, viewGroup, view, this);
    }

    public static s e(View view) {
        ViewGroup f10 = v.f(view);
        if (f10 == null) {
            return null;
        }
        int childCount = f10.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = f10.getChildAt(i10);
            if (childAt instanceof a) {
                return ((a) childAt).R;
            }
        }
        return new p(f10.getContext(), f10, view);
    }

    public void a(@m0 Drawable drawable) {
        this.f17261a.a(drawable);
    }

    public void b(@m0 Drawable drawable) {
        this.f17261a.g(drawable);
    }
}
