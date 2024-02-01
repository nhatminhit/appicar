package k1;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class c extends a {
    public int Z;

    /* renamed from: a0  reason: collision with root package name */
    public int f9925a0;

    /* renamed from: b0  reason: collision with root package name */
    public LayoutInflater f9926b0;

    @Deprecated
    public c(Context context, int i10, Cursor cursor) {
        super(context, cursor);
        this.f9925a0 = i10;
        this.Z = i10;
        this.f9926b0 = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public c(Context context, int i10, Cursor cursor, int i11) {
        super(context, cursor, i11);
        this.f9925a0 = i10;
        this.Z = i10;
        this.f9926b0 = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Deprecated
    public c(Context context, int i10, Cursor cursor, boolean z10) {
        super(context, cursor, z10);
        this.f9925a0 = i10;
        this.Z = i10;
        this.f9926b0 = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f9926b0.inflate(this.f9925a0, viewGroup, false);
    }

    public View i(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f9926b0.inflate(this.Z, viewGroup, false);
    }

    public void m(int i10) {
        this.f9925a0 = i10;
    }

    public void n(int i10) {
        this.Z = i10;
    }
}
