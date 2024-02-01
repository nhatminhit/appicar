package o6;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.mp4.MdtaMetadataEntry;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import d.o0;
import j6.m;
import java.nio.ByteBuffer;
import w7.p;
import w7.q0;
import w7.w;

public final class g {
    public static final int A = q0.T("pgap");
    public static final int B = q0.T("sosn");
    public static final int C = q0.T("tvsh");
    public static final int D = q0.T(InternalFrame.S);
    public static final int E = 3;
    public static final String[] F = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};
    public static final String G = "und";
    public static final int H = 169;
    public static final int I = 253;
    public static final String J = "com.android.capture.fps";
    public static final int K = 23;

    /* renamed from: a  reason: collision with root package name */
    public static final String f11222a = "MetadataUtil";

    /* renamed from: b  reason: collision with root package name */
    public static final int f11223b = q0.T("nam");

    /* renamed from: c  reason: collision with root package name */
    public static final int f11224c = q0.T("trk");

    /* renamed from: d  reason: collision with root package name */
    public static final int f11225d = q0.T("cmt");

    /* renamed from: e  reason: collision with root package name */
    public static final int f11226e = q0.T("day");

    /* renamed from: f  reason: collision with root package name */
    public static final int f11227f = q0.T("ART");

    /* renamed from: g  reason: collision with root package name */
    public static final int f11228g = q0.T("too");

    /* renamed from: h  reason: collision with root package name */
    public static final int f11229h = q0.T("alb");

    /* renamed from: i  reason: collision with root package name */
    public static final int f11230i = q0.T("com");

    /* renamed from: j  reason: collision with root package name */
    public static final int f11231j = q0.T("wrt");

    /* renamed from: k  reason: collision with root package name */
    public static final int f11232k = q0.T("lyr");

    /* renamed from: l  reason: collision with root package name */
    public static final int f11233l = q0.T("gen");

    /* renamed from: m  reason: collision with root package name */
    public static final int f11234m = q0.T("covr");

    /* renamed from: n  reason: collision with root package name */
    public static final int f11235n = q0.T("gnre");

    /* renamed from: o  reason: collision with root package name */
    public static final int f11236o = q0.T("grp");

    /* renamed from: p  reason: collision with root package name */
    public static final int f11237p = q0.T("disk");

    /* renamed from: q  reason: collision with root package name */
    public static final int f11238q = q0.T("trkn");

    /* renamed from: r  reason: collision with root package name */
    public static final int f11239r = q0.T("tmpo");

    /* renamed from: s  reason: collision with root package name */
    public static final int f11240s = q0.T("cpil");

    /* renamed from: t  reason: collision with root package name */
    public static final int f11241t = q0.T("aART");

    /* renamed from: u  reason: collision with root package name */
    public static final int f11242u = q0.T("sonm");

    /* renamed from: v  reason: collision with root package name */
    public static final int f11243v = q0.T("soal");

    /* renamed from: w  reason: collision with root package name */
    public static final int f11244w = q0.T("soar");

    /* renamed from: x  reason: collision with root package name */
    public static final int f11245x = q0.T("soaa");

    /* renamed from: y  reason: collision with root package name */
    public static final int f11246y = q0.T("soco");

    /* renamed from: z  reason: collision with root package name */
    public static final int f11247z = q0.T("rtng");

    public static Format a(int i10, Format format, @o0 Metadata metadata, @o0 Metadata metadata2, m mVar) {
        if (i10 == 1) {
            if (mVar.a()) {
                format = format.e(mVar.f9592a, mVar.f9593b);
            }
            return metadata != null ? format.h(metadata) : format;
        } else if (i10 != 2 || metadata2 == null) {
            return format;
        } else {
            for (int i11 = 0; i11 < metadata2.d(); i11++) {
                Metadata.Entry c10 = metadata2.c(i11);
                if (c10 instanceof MdtaMetadataEntry) {
                    MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) c10;
                    if (J.equals(mdtaMetadataEntry.O) && mdtaMetadataEntry.R == 23) {
                        try {
                            format = format.d(ByteBuffer.wrap(mdtaMetadataEntry.P).asFloatBuffer().get()).h(new Metadata(mdtaMetadataEntry));
                        } catch (NumberFormatException unused) {
                            p.l(f11222a, "Ignoring invalid framerate");
                        }
                    }
                }
            }
            return format;
        }
    }

    @o0
    public static CommentFrame b(int i10, w wVar) {
        int l10 = wVar.l();
        if (wVar.l() == a.Z0) {
            wVar.R(8);
            String y10 = wVar.y(l10 - 16);
            return new CommentFrame("und", y10, y10);
        }
        p.l(f11222a, "Failed to parse comment attribute: " + a.a(i10));
        return null;
    }

    @o0
    public static ApicFrame c(w wVar) {
        String str;
        int l10 = wVar.l();
        if (wVar.l() == a.Z0) {
            int b10 = a.b(wVar.l());
            String str2 = b10 == 13 ? "image/jpeg" : b10 == 14 ? "image/png" : null;
            if (str2 == null) {
                str = "Unrecognized cover art flags: " + b10;
            } else {
                wVar.R(4);
                int i10 = l10 - 16;
                byte[] bArr = new byte[i10];
                wVar.i(bArr, 0, i10);
                return new ApicFrame(str2, (String) null, 3, bArr);
            }
        } else {
            str = "Failed to parse cover art attribute";
        }
        p.l(f11222a, str);
        return null;
    }

    @o0
    public static Metadata.Entry d(w wVar) {
        int c10 = wVar.c() + wVar.l();
        int l10 = wVar.l();
        int i10 = (l10 >> 24) & 255;
        if (i10 == 169 || i10 == 253) {
            int i11 = 16777215 & l10;
            if (i11 == f11225d) {
                CommentFrame b10 = b(l10, wVar);
                wVar.Q(c10);
                return b10;
            }
            if (i11 != f11223b) {
                if (i11 != f11224c) {
                    if (i11 != f11230i) {
                        if (i11 != f11231j) {
                            if (i11 == f11226e) {
                                TextInformationFrame i12 = i(l10, "TDRC", wVar);
                                wVar.Q(c10);
                                return i12;
                            } else if (i11 == f11227f) {
                                TextInformationFrame i13 = i(l10, "TPE1", wVar);
                                wVar.Q(c10);
                                return i13;
                            } else if (i11 == f11228g) {
                                TextInformationFrame i14 = i(l10, "TSSE", wVar);
                                wVar.Q(c10);
                                return i14;
                            } else if (i11 == f11229h) {
                                TextInformationFrame i15 = i(l10, "TALB", wVar);
                                wVar.Q(c10);
                                return i15;
                            } else if (i11 == f11232k) {
                                TextInformationFrame i16 = i(l10, "USLT", wVar);
                                wVar.Q(c10);
                                return i16;
                            } else if (i11 == f11233l) {
                                TextInformationFrame i17 = i(l10, "TCON", wVar);
                                wVar.Q(c10);
                                return i17;
                            } else if (i11 == f11236o) {
                                TextInformationFrame i18 = i(l10, "TIT1", wVar);
                                wVar.Q(c10);
                                return i18;
                            }
                        }
                    }
                    TextInformationFrame i19 = i(l10, "TCOM", wVar);
                    wVar.Q(c10);
                    return i19;
                }
            }
            TextInformationFrame i20 = i(l10, "TIT2", wVar);
            wVar.Q(c10);
            return i20;
        }
        try {
            if (l10 == f11235n) {
                return h(wVar);
            }
            if (l10 == f11237p) {
                TextInformationFrame e10 = e(l10, "TPOS", wVar);
                wVar.Q(c10);
                return e10;
            } else if (l10 == f11238q) {
                TextInformationFrame e11 = e(l10, "TRCK", wVar);
                wVar.Q(c10);
                return e11;
            } else if (l10 == f11239r) {
                Id3Frame j10 = j(l10, "TBPM", wVar, true, false);
                wVar.Q(c10);
                return j10;
            } else if (l10 == f11240s) {
                Id3Frame j11 = j(l10, "TCMP", wVar, true, true);
                wVar.Q(c10);
                return j11;
            } else if (l10 == f11234m) {
                ApicFrame c11 = c(wVar);
                wVar.Q(c10);
                return c11;
            } else if (l10 == f11241t) {
                TextInformationFrame i21 = i(l10, "TPE2", wVar);
                wVar.Q(c10);
                return i21;
            } else if (l10 == f11242u) {
                TextInformationFrame i22 = i(l10, "TSOT", wVar);
                wVar.Q(c10);
                return i22;
            } else if (l10 == f11243v) {
                TextInformationFrame i23 = i(l10, "TSO2", wVar);
                wVar.Q(c10);
                return i23;
            } else if (l10 == f11244w) {
                TextInformationFrame i24 = i(l10, "TSOA", wVar);
                wVar.Q(c10);
                return i24;
            } else if (l10 == f11245x) {
                TextInformationFrame i25 = i(l10, "TSOP", wVar);
                wVar.Q(c10);
                return i25;
            } else if (l10 == f11246y) {
                TextInformationFrame i26 = i(l10, "TSOC", wVar);
                wVar.Q(c10);
                return i26;
            } else if (l10 == f11247z) {
                Id3Frame j12 = j(l10, "ITUNESADVISORY", wVar, false, false);
                wVar.Q(c10);
                return j12;
            } else if (l10 == A) {
                Id3Frame j13 = j(l10, "ITUNESGAPLESS", wVar, false, true);
                wVar.Q(c10);
                return j13;
            } else if (l10 == B) {
                TextInformationFrame i27 = i(l10, "TVSHOWSORT", wVar);
                wVar.Q(c10);
                return i27;
            } else if (l10 == C) {
                TextInformationFrame i28 = i(l10, "TVSHOW", wVar);
                wVar.Q(c10);
                return i28;
            } else if (l10 == D) {
                Id3Frame f10 = f(wVar, c10);
                wVar.Q(c10);
                return f10;
            }
        } finally {
            wVar.Q(c10);
        }
        p.b(f11222a, "Skipped unknown metadata entry: " + a.a(l10));
        wVar.Q(c10);
        return null;
    }

    @o0
    public static TextInformationFrame e(int i10, String str, w wVar) {
        int l10 = wVar.l();
        if (wVar.l() == a.Z0 && l10 >= 22) {
            wVar.R(10);
            int J2 = wVar.J();
            if (J2 > 0) {
                String str2 = "" + J2;
                int J3 = wVar.J();
                if (J3 > 0) {
                    str2 = str2 + "/" + J3;
                }
                return new TextInformationFrame(str, (String) null, str2);
            }
        }
        p.l(f11222a, "Failed to parse index/count attribute: " + a.a(i10));
        return null;
    }

    @o0
    public static Id3Frame f(w wVar, int i10) {
        int i11 = -1;
        int i12 = -1;
        String str = null;
        String str2 = null;
        while (wVar.c() < i10) {
            int c10 = wVar.c();
            int l10 = wVar.l();
            int l11 = wVar.l();
            wVar.R(4);
            if (l11 == a.X0) {
                str = wVar.y(l10 - 12);
            } else if (l11 == a.Y0) {
                str2 = wVar.y(l10 - 12);
            } else {
                if (l11 == a.Z0) {
                    i11 = c10;
                    i12 = l10;
                }
                wVar.R(l10 - 12);
            }
        }
        if (str == null || str2 == null || i11 == -1) {
            return null;
        }
        wVar.Q(i11);
        wVar.R(16);
        return new InternalFrame(str, str2, wVar.y(i12 - 16));
    }

    @o0
    public static MdtaMetadataEntry g(w wVar, int i10, String str) {
        while (true) {
            int c10 = wVar.c();
            if (c10 >= i10) {
                return null;
            }
            int l10 = wVar.l();
            if (wVar.l() == a.Z0) {
                int l11 = wVar.l();
                int l12 = wVar.l();
                int i11 = l10 - 16;
                byte[] bArr = new byte[i11];
                wVar.i(bArr, 0, i11);
                return new MdtaMetadataEntry(str, bArr, l12, l11);
            }
            wVar.Q(c10 + l10);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001c  */
    @d.o0
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.exoplayer2.metadata.id3.TextInformationFrame h(w7.w r3) {
        /*
            int r3 = k(r3)
            r0 = 0
            if (r3 <= 0) goto L_0x0011
            java.lang.String[] r1 = F
            int r2 = r1.length
            if (r3 > r2) goto L_0x0011
            int r3 = r3 + -1
            r3 = r1[r3]
            goto L_0x0012
        L_0x0011:
            r3 = r0
        L_0x0012:
            if (r3 == 0) goto L_0x001c
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r1 = new com.google.android.exoplayer2.metadata.id3.TextInformationFrame
            java.lang.String r2 = "TCON"
            r1.<init>(r2, r0, r3)
            return r1
        L_0x001c:
            java.lang.String r3 = "MetadataUtil"
            java.lang.String r1 = "Failed to parse standard genre code"
            w7.p.l(r3, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.g.h(w7.w):com.google.android.exoplayer2.metadata.id3.TextInformationFrame");
    }

    @o0
    public static TextInformationFrame i(int i10, String str, w wVar) {
        int l10 = wVar.l();
        if (wVar.l() == a.Z0) {
            wVar.R(8);
            return new TextInformationFrame(str, (String) null, wVar.y(l10 - 16));
        }
        p.l(f11222a, "Failed to parse text attribute: " + a.a(i10));
        return null;
    }

    @o0
    public static Id3Frame j(int i10, String str, w wVar, boolean z10, boolean z11) {
        int k10 = k(wVar);
        if (z11) {
            k10 = Math.min(1, k10);
        }
        if (k10 >= 0) {
            return z10 ? new TextInformationFrame(str, (String) null, Integer.toString(k10)) : new CommentFrame("und", str, Integer.toString(k10));
        }
        p.l(f11222a, "Failed to parse uint8 attribute: " + a.a(i10));
        return null;
    }

    public static int k(w wVar) {
        wVar.R(4);
        if (wVar.l() == a.Z0) {
            wVar.R(8);
            return wVar.D();
        }
        p.l(f11222a, "Failed to parse uint8 attribute value");
        return -1;
    }
}
