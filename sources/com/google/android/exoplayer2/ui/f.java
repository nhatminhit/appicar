package com.google.android.exoplayer2.ui;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.d;
import com.google.android.exoplayer2.trackselection.g;
import com.google.android.exoplayer2.ui.TrackSelectionView;
import com.google.android.exoplayer2.ui.d;
import d.o0;
import java.util.Collections;
import java.util.List;
import r7.k;
import r7.l;
import r7.m;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final Context f5565a;

    /* renamed from: b  reason: collision with root package name */
    public final CharSequence f5566b;

    /* renamed from: c  reason: collision with root package name */
    public final d.a f5567c;

    /* renamed from: d  reason: collision with root package name */
    public final int f5568d;

    /* renamed from: e  reason: collision with root package name */
    public final a f5569e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f5570f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f5571g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f5572h;
    @o0

    /* renamed from: i  reason: collision with root package name */
    public k f5573i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f5574j;

    /* renamed from: k  reason: collision with root package name */
    public List<DefaultTrackSelector.SelectionOverride> f5575k;

    public interface a {
        void a(boolean z10, List<DefaultTrackSelector.SelectionOverride> list);
    }

    public f(Context context, CharSequence charSequence, DefaultTrackSelector defaultTrackSelector, int i10) {
        this.f5565a = context;
        this.f5566b = charSequence;
        d.a aVar = (d.a) w7.a.g(defaultTrackSelector.g());
        this.f5567c = aVar;
        this.f5568d = i10;
        TrackGroupArray g10 = aVar.g(i10);
        DefaultTrackSelector.Parameters B = defaultTrackSelector.B();
        this.f5574j = B.h(i10);
        DefaultTrackSelector.SelectionOverride j10 = B.j(i10, g10);
        this.f5575k = j10 == null ? Collections.emptyList() : Collections.singletonList(j10);
        this.f5569e = new m(defaultTrackSelector, B, i10, g10);
    }

    public f(Context context, CharSequence charSequence, d.a aVar, int i10, a aVar2) {
        this.f5565a = context;
        this.f5566b = charSequence;
        this.f5567c = aVar;
        this.f5568d = i10;
        this.f5569e = aVar2;
        this.f5575k = Collections.emptyList();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(TrackSelectionView trackSelectionView, DialogInterface dialogInterface, int i10) {
        this.f5569e.a(trackSelectionView.getIsDisabled(), trackSelectionView.getOverrides());
    }

    public static /* synthetic */ void e(DefaultTrackSelector defaultTrackSelector, DefaultTrackSelector.Parameters parameters, int i10, TrackGroupArray trackGroupArray, boolean z10, List list) {
        defaultTrackSelector.S(g.k(parameters, i10, trackGroupArray, z10, list.isEmpty() ? null : (DefaultTrackSelector.SelectionOverride) list.get(0)));
    }

    public AlertDialog c() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.f5565a);
        View inflate = LayoutInflater.from(builder.getContext()).inflate(d.g.exo_track_selection_dialog, (ViewGroup) null);
        TrackSelectionView trackSelectionView = (TrackSelectionView) inflate.findViewById(d.e.exo_track_selection_view);
        trackSelectionView.setAllowMultipleOverrides(this.f5571g);
        trackSelectionView.setAllowAdaptiveSelections(this.f5570f);
        trackSelectionView.setShowDisableOption(this.f5572h);
        k kVar = this.f5573i;
        if (kVar != null) {
            trackSelectionView.setTrackNameProvider(kVar);
        }
        trackSelectionView.d(this.f5567c, this.f5568d, this.f5574j, this.f5575k, (TrackSelectionView.c) null);
        return builder.setTitle(this.f5566b).setView(inflate).setPositiveButton(17039370, new l(this, trackSelectionView)).setNegativeButton(17039360, (DialogInterface.OnClickListener) null).create();
    }

    public f f(boolean z10) {
        this.f5570f = z10;
        return this;
    }

    public f g(boolean z10) {
        this.f5571g = z10;
        return this;
    }

    public f h(boolean z10) {
        this.f5574j = z10;
        return this;
    }

    public f i(@o0 DefaultTrackSelector.SelectionOverride selectionOverride) {
        return j(selectionOverride == null ? Collections.emptyList() : Collections.singletonList(selectionOverride));
    }

    public f j(List<DefaultTrackSelector.SelectionOverride> list) {
        this.f5575k = list;
        return this;
    }

    public f k(boolean z10) {
        this.f5572h = z10;
        return this;
    }

    public f l(@o0 k kVar) {
        this.f5573i = kVar;
        return this;
    }
}
