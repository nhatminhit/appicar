package rf;

import be.p0;
import java.util.Collection;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import pf.e2;
import pf.m1;
import pf.w0;
import xe.n0;
import zd.a1;
import zd.e1;
import zd.r1;
import zd.u0;
import zd.u2;

@Metadata(bv = {}, d1 = {"\u0000\u0001\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001aL\u0010\n\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003j\u0002`\t2\u001a\u0010\u0002\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\u0000\"\u0006\u0012\u0002\b\u00030\u0001H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a+\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000e\u001a\u00020\rH@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a-\u0010\u0011\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000e\u001a\u00020\rH@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0010\u001a#\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a%\u0010\u0014\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0013\u001a+\u0010\u0016\u001a\u00020\r\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0015\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a#\u0010\u0018\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0013\u001a+\u0010\u0019\u001a\u00020\r\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0015\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0017\u001a%\u0010\u001a\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0013\u001a#\u0010\u001b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0013\u001a%\u0010\u001c\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u0013\u001a0\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001d\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0007\u001aV\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\"\u0010%\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"\u0012\u0006\u0012\u0004\u0018\u00010$0!H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001aV\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\"\u0010%\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"\u0012\u0006\u0012\u0004\u0018\u00010$0!H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010'\u001ak\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e27\u0010%\u001a3\b\u0001\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"\u0012\u0006\u0012\u0004\u0018\u00010$0(H\u0007ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001aV\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\"\u0010%\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"\u0012\u0006\u0012\u0004\u0018\u00010$0!H\u0007ø\u0001\u0000¢\u0006\u0004\b+\u0010'\u001a$\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\f*\u00020$*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001H\u0001\u001aC\u0010/\u001a\u00028\u0001\"\b\b\u0000\u0010\f*\u00020$\"\u0010\b\u0001\u0010\u0019*\n\u0012\u0006\b\u0000\u0012\u00028\u00000-*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00012\u0006\u0010.\u001a\u00028\u0001H@ø\u0001\u0000¢\u0006\u0004\b/\u00100\u001aA\u00102\u001a\u00028\u0001\"\b\b\u0000\u0010\f*\u00020$\"\u000e\b\u0001\u0010\u0019*\b\u0012\u0004\u0012\u00028\u000001*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00012\u0006\u0010.\u001a\u00028\u0001H@ø\u0001\u0000¢\u0006\u0004\b2\u00103\u001a0\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001d\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0007\u001aV\u00105\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\"\u0010%\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\"\u0012\u0006\u0012\u0004\u0018\u00010$0!H\u0007ø\u0001\u0000¢\u0006\u0004\b5\u0010'\u001a;\u00106\u001a\u00028\u0001\"\u0004\b\u0000\u0010\f\"\u000e\b\u0001\u0010\u0019*\b\u0012\u0004\u0012\u00028\u000001*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010.\u001a\u00028\u0001H@ø\u0001\u0000¢\u0006\u0004\b6\u00103\u001a=\u00107\u001a\u00028\u0001\"\u0004\b\u0000\u0010\f\"\u0010\b\u0001\u0010\u0019*\n\u0012\u0006\b\u0000\u0012\u00028\u00000-*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010.\u001a\u00028\u0001H@ø\u0001\u0000¢\u0006\u0004\b7\u00100\u001aA\u0010<\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010;\"\u0004\b\u0000\u00108\"\u0004\b\u0001\u00109*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010:0\u0001H@ø\u0001\u0000¢\u0006\u0004\b<\u0010\u0013\u001aW\u0010?\u001a\u00028\u0002\"\u0004\b\u0000\u00108\"\u0004\b\u0001\u00109\"\u0018\b\u0002\u0010>*\u0012\u0012\u0006\b\u0000\u0012\u00028\u0000\u0012\u0006\b\u0000\u0012\u00028\u00010=*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010:0\u00012\u0006\u0010.\u001a\u00028\u0002H@ø\u0001\u0000¢\u0006\u0004\b?\u0010@\u001a)\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000A\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H@ø\u0001\u0000¢\u0006\u0004\bB\u0010\u0013\u001a)\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00000C\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H@ø\u0001\u0000¢\u0006\u0004\bD\u0010\u0013\u001ab\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\u001c*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e2(\u0010E\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00010\"\u0012\u0006\u0012\u0004\u0018\u00010$0!H\u0007ø\u0001\u0000¢\u0006\u0004\bF\u0010'\u001a\\\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\u001c*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\"\u0010E\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\"\u0012\u0006\u0012\u0004\u0018\u00010$0!H\u0001ø\u0001\u0000¢\u0006\u0004\b\f\u0010'\u001aq\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\u001c*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e27\u0010E\u001a3\b\u0001\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\"\u0012\u0006\u0012\u0004\u0018\u00010$0(H\u0001ø\u0001\u0000¢\u0006\u0004\bG\u0010*\u001aw\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\f\"\b\b\u0001\u0010\u001c*\u00020$*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e29\u0010E\u001a5\b\u0001\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\"\u0012\u0006\u0012\u0004\u0018\u00010$0(H\u0007ø\u0001\u0000¢\u0006\u0004\bH\u0010*\u001ab\u00108\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001\"\u0004\b\u0000\u0010\f\"\b\b\u0001\u0010\u001c*\u00020$*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e2$\u0010E\u001a \b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\"\u0012\u0006\u0012\u0004\u0018\u00010$0!H\u0007ø\u0001\u0000¢\u0006\u0004\b8\u0010'\u001a.\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000I0\u0001\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0007\u001a\u001e\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007\u001a\\\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u00108*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\"\u0010L\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\"\u0012\u0006\u0012\u0004\u0018\u00010$0!H\u0001ø\u0001\u0000¢\u0006\u0004\bM\u0010'\u001a)\u0010O\u001a\b\u0012\u0004\u0012\u00028\u00000N\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H@ø\u0001\u0000¢\u0006\u0004\bO\u0010\u0013\u001a#\u0010P\u001a\u00020#\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H@ø\u0001\u0000¢\u0006\u0004\bP\u0010\u0013\u001a#\u0010Q\u001a\u00020\r\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H@ø\u0001\u0000¢\u0006\u0004\bQ\u0010\u0013\u001aA\u0010>\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0010T\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000Rj\n\u0012\u0006\b\u0000\u0012\u00028\u0000`SH@ø\u0001\u0000¢\u0006\u0004\b>\u0010U\u001aA\u0010V\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u0010T\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000Rj\n\u0012\u0006\b\u0000\u0012\u00028\u0000`SH@ø\u0001\u0000¢\u0006\u0004\bV\u0010U\u001a#\u0010W\u001a\u00020#\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\u0001H@ø\u0001\u0000¢\u0006\u0004\bW\u0010\u0013\u001a$\u0010X\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\f*\u00020$*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001H\u0007\u001a?\u0010Z\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010:0\u0001\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\u001c*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001H\u0004\u001az\u0010\\\u001a\b\u0012\u0004\u0012\u00028\u00020\u0001\"\u0004\b\u0000\u0010\f\"\u0004\b\u0001\u0010\u001c\"\u0004\b\u0002\u00109*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010Y\u001a\b\u0012\u0004\u0012\u00028\u00010\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u001e26\u0010E\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(P\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b([\u0012\u0004\u0012\u00028\u00020!H\u0001\u001a1\u0010[\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0003j\u0002`\t*\u0006\u0012\u0002\b\u00030\u0001H\u0001\u0002\u0004\n\u0002\b\u0019¨\u0006]"}, d2 = {"", "Lrf/i0;", "channels", "Lkotlin/Function1;", "", "Lzd/v0;", "name", "cause", "Lzd/u2;", "Lkotlinx/coroutines/CompletionHandler;", "c", "([Lrf/i0;)Lwe/l;", "E", "", "index", "l", "(Lrf/i0;ILie/d;)Ljava/lang/Object;", "m", "w", "(Lrf/i0;Lie/d;)Ljava/lang/Object;", "x", "element", "A", "(Lrf/i0;Ljava/lang/Object;Lie/d;)Ljava/lang/Object;", "B", "C", "D", "Q", "R", "n", "Lie/g;", "context", "h", "Lkotlin/Function2;", "Lie/d;", "", "", "predicate", "j", "(Lrf/i0;Lie/g;Lwe/p;)Lrf/i0;", "Lkotlin/Function3;", "p", "(Lrf/i0;Lie/g;Lwe/q;)Lrf/i0;", "r", "t", "", "destination", "u", "(Lrf/i0;Ljava/util/Collection;Lie/d;)Ljava/lang/Object;", "Lrf/m0;", "v", "(Lrf/i0;Lrf/m0;Lie/d;)Ljava/lang/Object;", "S", "U", "W", "X", "K", "V", "Lzd/u0;", "", "Y", "", "M", "Z", "(Lrf/i0;Ljava/util/Map;Lie/d;)Ljava/lang/Object;", "", "a0", "", "c0", "transform", "y", "G", "I", "Lbe/p0;", "d0", "e", "selector", "f", "", "b0", "a", "d", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "(Lrf/i0;Ljava/util/Comparator;Lie/d;)Ljava/lang/Object;", "N", "O", "P", "other", "f0", "b", "g0", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xs = "kotlinx/coroutines/channels/ChannelsKt")
public final /* synthetic */ class v {

    @le.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0}, l = {404}, m = "any", n = {"$this$consume$iv"}, s = {"L$0"})
    @zd.i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a<E> extends le.d {
        public Object R;
        public /* synthetic */ Object S;
        public int T;

        public a(ie.d<? super a> dVar) {
            super(dVar);
        }

        @fh.h
        public final Object K(@fh.g Object obj) {
            this.S = obj;
            this.T |= Integer.MIN_VALUE;
            return v.a((i0) null, this);
        }
    }

    @le.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {434, 436}, m = "minWith", n = {"comparator", "$this$consume$iv", "iterator", "comparator", "$this$consume$iv", "iterator", "min"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
    @zd.i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class a0<E> extends le.d {
        public Object R;
        public Object S;
        public Object T;
        public Object U;
        public /* synthetic */ Object V;
        public int W;

        public a0(ie.d<? super a0> dVar) {
            super(dVar);
        }

        @fh.h
        public final Object K(@fh.g Object obj) {
            this.V = obj;
            this.W |= Integer.MIN_VALUE;
            return v.N((i0) null, (Comparator) null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "cause", "Lzd/u2;", "c", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 6, 0})
    public static final class b extends n0 implements we.l<Throwable, u2> {
        public final /* synthetic */ i0<?> P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(i0<?> i0Var) {
            super(1);
            this.P = i0Var;
        }

        public /* bridge */ /* synthetic */ Object A(Object obj) {
            c((Throwable) obj);
            return u2.f25116a;
        }

        public final void c(@fh.h Throwable th2) {
            s.b(this.P, th2);
        }
    }

    @le.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0}, l = {447}, m = "none", n = {"$this$consume$iv"}, s = {"L$0"})
    @zd.i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class b0<E> extends le.d {
        public Object R;
        public /* synthetic */ Object S;
        public int T;

        public b0(ie.d<? super b0> dVar) {
            super(dVar);
        }

        @fh.h
        public final Object K(@fh.g Object obj) {
            this.S = obj;
            this.T |= Integer.MIN_VALUE;
            return v.O((i0) null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "cause", "Lzd/u2;", "c", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 6, 0})
    public static final class c extends n0 implements we.l<Throwable, u2> {
        public final /* synthetic */ i0<?>[] P;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(i0<?>[] i0VarArr) {
            super(1);
            this.P = i0VarArr;
        }

        public /* bridge */ /* synthetic */ Object A(Object obj) {
            c((Throwable) obj);
            return u2.f25116a;
        }

        public final void c(@fh.h Throwable th2) {
            Throwable th3 = null;
            for (i0<?> b10 : this.P) {
                try {
                    s.b(b10, th2);
                } catch (Throwable th4) {
                    if (th3 == null) {
                        th3 = th4;
                    } else {
                        zd.p.a(th3, th4);
                    }
                }
            }
            if (th3 != null) {
                throw th3;
            }
        }
    }

    @le.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$requireNoNulls$1", f = "Deprecated.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00018\u0000H@"}, d2 = {"", "E", "it", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class c0 extends le.o implements we.p<Object, ie.d<Object>, Object> {
        public int S;
        public /* synthetic */ Object T;
        public final /* synthetic */ i0<Object> U;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c0(i0<Object> i0Var, ie.d<? super c0> dVar) {
            super(2, dVar);
            this.U = i0Var;
        }

        @fh.g
        public final ie.d<u2> H(@fh.h Object obj, @fh.g ie.d<?> dVar) {
            c0 c0Var = new c0(this.U, dVar);
            c0Var.T = obj;
            return c0Var;
        }

        @fh.h
        public final Object K(@fh.g Object obj) {
            ke.d.h();
            if (this.S == 0) {
                e1.n(obj);
                Object obj2 = this.T;
                if (obj2 != null) {
                    return obj2;
                }
                throw new IllegalArgumentException("null element found in " + this.U + '.');
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @fh.h
        /* renamed from: P */
        public final Object g0(@fh.h Object obj, @fh.h ie.d<Object> dVar) {
            return ((c0) H(obj, dVar)).K(u2.f25116a);
        }
    }

    @le.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {487}, m = "count", n = {"count", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    @zd.i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class d<E> extends le.d {
        public Object R;
        public Object S;
        public Object T;
        public /* synthetic */ Object U;
        public int V;

        public d(ie.d<? super d> dVar) {
            super(dVar);
        }

        @fh.h
        public final Object K(@fh.g Object obj) {
            this.U = obj;
            this.V |= Integer.MIN_VALUE;
            return v.d((i0) null, this);
        }
    }

    @le.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {136, 139}, m = "single", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "single"}, s = {"L$0", "L$1", "L$0", "L$1"})
    @zd.i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class d0<E> extends le.d {
        public Object R;
        public Object S;
        public /* synthetic */ Object T;
        public int U;

        public d0(ie.d<? super d0> dVar) {
            super(dVar);
        }

        @fh.h
        public final Object K(@fh.g Object obj) {
            this.T = obj;
            this.U |= Integer.MIN_VALUE;
            return v.Q((i0) null, this);
        }
    }

    @le.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinct$1", f = "Deprecated.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(bv = {}, d1 = {"\u0000\u0004\n\u0002\b\u0003\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H@"}, d2 = {"E", "it", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class e extends le.o implements we.p<Object, ie.d<Object>, Object> {
        public int S;
        public /* synthetic */ Object T;

        public e(ie.d<? super e> dVar) {
            super(2, dVar);
        }

        @fh.g
        public final ie.d<u2> H(@fh.h Object obj, @fh.g ie.d<?> dVar) {
            e eVar = new e(dVar);
            eVar.T = obj;
            return eVar;
        }

        @fh.h
        public final Object K(@fh.g Object obj) {
            ke.d.h();
            if (this.S == 0) {
                e1.n(obj);
                return this.T;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @fh.h
        /* renamed from: P */
        public final Object g0(Object obj, @fh.h ie.d<Object> dVar) {
            return ((e) H(obj, dVar)).K(u2.f25116a);
        }
    }

    @le.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {149, 152}, m = "singleOrNull", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "single"}, s = {"L$0", "L$1", "L$0", "L$1"})
    @zd.i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class e0<E> extends le.d {
        public Object R;
        public Object S;
        public /* synthetic */ Object T;
        public int U;

        public e0(ie.d<? super e0> dVar) {
            super(dVar);
        }

        @fh.h
        public final Object K(@fh.g Object obj) {
            this.T = obj;
            this.U |= Integer.MIN_VALUE;
            return v.R((i0) null, this);
        }
    }

    @le.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$distinctBy$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 1, 2, 2, 2}, l = {387, 388, 390}, m = "invokeSuspend", n = {"$this$produce", "keys", "$this$produce", "keys", "e", "$this$produce", "keys", "k"}, s = {"L$0", "L$1", "L$0", "L$1", "L$3", "L$0", "L$1", "L$3"})
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u0002H@"}, d2 = {"E", "K", "Lrf/g0;", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class f extends le.o implements we.p<g0<? super E>, ie.d<? super u2>, Object> {
        public Object S;
        public Object T;
        public Object U;
        public int V;
        public /* synthetic */ Object W;
        public final /* synthetic */ i0<E> X;
        public final /* synthetic */ we.p<E, ie.d<? super K>, Object> Y;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(i0<? extends E> i0Var, we.p<? super E, ? super ie.d<? super K>, ? extends Object> pVar, ie.d<? super f> dVar) {
            super(2, dVar);
            this.X = i0Var;
            this.Y = pVar;
        }

        @fh.g
        public final ie.d<u2> H(@fh.h Object obj, @fh.g ie.d<?> dVar) {
            f fVar = new f(this.X, this.Y, dVar);
            fVar.W = obj;
            return fVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0092  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x00c5  */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object K(@fh.g java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = ke.d.h()
                int r1 = r11.V
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x005a
                if (r1 == r4) goto L_0x0045
                if (r1 == r3) goto L_0x002d
                if (r1 != r2) goto L_0x0025
                java.lang.Object r1 = r11.U
                java.lang.Object r5 = r11.T
                rf.p r5 = (rf.p) r5
                java.lang.Object r6 = r11.S
                java.util.HashSet r6 = (java.util.HashSet) r6
                java.lang.Object r7 = r11.W
                rf.g0 r7 = (rf.g0) r7
                zd.e1.n(r12)
                r12 = r11
                goto L_0x00cb
            L_0x0025:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L_0x002d:
                java.lang.Object r1 = r11.U
                java.lang.Object r5 = r11.T
                rf.p r5 = (rf.p) r5
                java.lang.Object r6 = r11.S
                java.util.HashSet r6 = (java.util.HashSet) r6
                java.lang.Object r7 = r11.W
                rf.g0 r7 = (rf.g0) r7
                zd.e1.n(r12)
                r8 = r7
                r7 = r6
                r6 = r1
                r1 = r0
                r0 = r11
                goto L_0x00ae
            L_0x0045:
                java.lang.Object r1 = r11.T
                rf.p r1 = (rf.p) r1
                java.lang.Object r5 = r11.S
                java.util.HashSet r5 = (java.util.HashSet) r5
                java.lang.Object r6 = r11.W
                rf.g0 r6 = (rf.g0) r6
                zd.e1.n(r12)
                r7 = r6
                r6 = r5
                r5 = r1
                r1 = r0
                r0 = r11
                goto L_0x008a
            L_0x005a:
                zd.e1.n(r12)
                java.lang.Object r12 = r11.W
                rf.g0 r12 = (rf.g0) r12
                java.util.HashSet r1 = new java.util.HashSet
                r1.<init>()
                rf.i0<E> r5 = r11.X
                rf.p r5 = r5.iterator()
                r6 = r12
                r12 = r11
                r10 = r5
                r5 = r1
                r1 = r10
            L_0x0071:
                r12.W = r6
                r12.S = r5
                r12.T = r1
                r7 = 0
                r12.U = r7
                r12.V = r4
                java.lang.Object r7 = r1.b(r12)
                if (r7 != r0) goto L_0x0083
                return r0
            L_0x0083:
                r10 = r0
                r0 = r12
                r12 = r7
                r7 = r6
                r6 = r5
                r5 = r1
                r1 = r10
            L_0x008a:
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                if (r12 == 0) goto L_0x00d8
                java.lang.Object r12 = r5.next()
                we.p<E, ie.d<? super K>, java.lang.Object> r8 = r0.Y
                r0.W = r7
                r0.S = r6
                r0.T = r5
                r0.U = r12
                r0.V = r3
                java.lang.Object r8 = r8.g0(r12, r0)
                if (r8 != r1) goto L_0x00a9
                return r1
            L_0x00a9:
                r10 = r6
                r6 = r12
                r12 = r8
                r8 = r7
                r7 = r10
            L_0x00ae:
                boolean r9 = r7.contains(r12)
                if (r9 != 0) goto L_0x00d2
                r0.W = r8
                r0.S = r7
                r0.T = r5
                r0.U = r12
                r0.V = r2
                java.lang.Object r6 = r8.C(r6, r0)
                if (r6 != r1) goto L_0x00c5
                return r1
            L_0x00c5:
                r6 = r7
                r7 = r8
                r10 = r1
                r1 = r12
                r12 = r0
                r0 = r10
            L_0x00cb:
                r6.add(r1)
                r1 = r5
                r5 = r6
                r6 = r7
                goto L_0x0071
            L_0x00d2:
                r12 = r0
                r0 = r1
                r1 = r5
                r5 = r7
                r6 = r8
                goto L_0x0071
            L_0x00d8:
                zd.u2 r12 = zd.u2.f25116a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: rf.v.f.K(java.lang.Object):java.lang.Object");
        }

        @fh.h
        /* renamed from: P */
        public final Object g0(@fh.g g0<? super E> g0Var, @fh.h ie.d<? super u2> dVar) {
            return ((f) H(g0Var, dVar)).K(u2.f25116a);
        }
    }

    @le.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$take$1", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {254, 255}, m = "invokeSuspend", n = {"$this$produce", "remaining", "$this$produce", "remaining"}, s = {"L$0", "I$0", "L$0", "I$0"})
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H@"}, d2 = {"E", "Lrf/g0;", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class f0 extends le.o implements we.p<g0<Object>, ie.d<? super u2>, Object> {
        public Object S;
        public int T;
        public int U;
        public /* synthetic */ Object V;
        public final /* synthetic */ int W;
        public final /* synthetic */ i0<Object> X;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f0(int i10, i0<Object> i0Var, ie.d<? super f0> dVar) {
            super(2, dVar);
            this.W = i10;
            this.X = i0Var;
        }

        @fh.g
        public final ie.d<u2> H(@fh.h Object obj, @fh.g ie.d<?> dVar) {
            f0 f0Var = new f0(this.W, this.X, dVar);
            f0Var.V = obj;
            return f0Var;
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x006d  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0086  */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object K(@fh.g java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = ke.d.h()
                int r1 = r8.U
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0036
                if (r1 == r3) goto L_0x0027
                if (r1 != r2) goto L_0x001f
                int r1 = r8.T
                java.lang.Object r4 = r8.S
                rf.p r4 = (rf.p) r4
                java.lang.Object r5 = r8.V
                rf.g0 r5 = (rf.g0) r5
                zd.e1.n(r9)
                r9 = r5
                r5 = r8
                goto L_0x0082
            L_0x001f:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L_0x0027:
                int r1 = r8.T
                java.lang.Object r4 = r8.S
                rf.p r4 = (rf.p) r4
                java.lang.Object r5 = r8.V
                rf.g0 r5 = (rf.g0) r5
                zd.e1.n(r9)
                r6 = r8
                goto L_0x0065
            L_0x0036:
                zd.e1.n(r9)
                java.lang.Object r9 = r8.V
                rf.g0 r9 = (rf.g0) r9
                int r1 = r8.W
                if (r1 != 0) goto L_0x0044
                zd.u2 r9 = zd.u2.f25116a
                return r9
            L_0x0044:
                if (r1 < 0) goto L_0x0048
                r4 = r3
                goto L_0x0049
            L_0x0048:
                r4 = 0
            L_0x0049:
                if (r4 == 0) goto L_0x008c
                rf.i0<java.lang.Object> r4 = r8.X
                rf.p r4 = r4.iterator()
                r5 = r8
            L_0x0052:
                r5.V = r9
                r5.S = r4
                r5.T = r1
                r5.U = r3
                java.lang.Object r6 = r4.b(r5)
                if (r6 != r0) goto L_0x0061
                return r0
            L_0x0061:
                r7 = r5
                r5 = r9
                r9 = r6
                r6 = r7
            L_0x0065:
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r9 = r9.booleanValue()
                if (r9 == 0) goto L_0x0089
                java.lang.Object r9 = r4.next()
                r6.V = r5
                r6.S = r4
                r6.T = r1
                r6.U = r2
                java.lang.Object r9 = r5.C(r9, r6)
                if (r9 != r0) goto L_0x0080
                return r0
            L_0x0080:
                r9 = r5
                r5 = r6
            L_0x0082:
                int r1 = r1 + -1
                if (r1 != 0) goto L_0x0052
                zd.u2 r9 = zd.u2.f25116a
                return r9
            L_0x0089:
                zd.u2 r9 = zd.u2.f25116a
                return r9
            L_0x008c:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r0 = "Requested element count "
                r9.append(r0)
                r9.append(r1)
                java.lang.String r0 = " is less than zero."
                r9.append(r0)
                java.lang.String r9 = r9.toString()
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r9 = r9.toString()
                r0.<init>(r9)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: rf.v.f0.K(java.lang.Object):java.lang.Object");
        }

        @fh.h
        /* renamed from: P */
        public final Object g0(@fh.g g0<Object> g0Var, @fh.h ie.d<? super u2> dVar) {
            return ((f0) H(g0Var, dVar)).K(u2.f25116a);
        }
    }

    @le.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$drop$1", f = "Deprecated.kt", i = {0, 0, 1, 2}, l = {164, 169, 170}, m = "invokeSuspend", n = {"$this$produce", "remaining", "$this$produce", "$this$produce"}, s = {"L$0", "I$0", "L$0", "L$0"})
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H@"}, d2 = {"E", "Lrf/g0;", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class g extends le.o implements we.p<g0<Object>, ie.d<? super u2>, Object> {
        public Object S;
        public int T;
        public int U;
        public /* synthetic */ Object V;
        public final /* synthetic */ int W;
        public final /* synthetic */ i0<Object> X;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(int i10, i0<Object> i0Var, ie.d<? super g> dVar) {
            super(2, dVar);
            this.W = i10;
            this.X = i0Var;
        }

        @fh.g
        public final ie.d<u2> H(@fh.h Object obj, @fh.g ie.d<?> dVar) {
            g gVar = new g(this.W, this.X, dVar);
            gVar.V = obj;
            return gVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x0086  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00ab A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00ac  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00b7  */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object K(@fh.g java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = ke.d.h()
                int r1 = r9.U
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x004e
                if (r1 == r4) goto L_0x003b
                if (r1 == r3) goto L_0x002a
                if (r1 != r2) goto L_0x0022
                java.lang.Object r1 = r9.S
                rf.p r1 = (rf.p) r1
                java.lang.Object r4 = r9.V
                rf.g0 r4 = (rf.g0) r4
                zd.e1.n(r10)
                r10 = r4
                r4 = r1
                r1 = r0
                r0 = r9
                goto L_0x009f
            L_0x0022:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L_0x002a:
                java.lang.Object r1 = r9.S
                rf.p r1 = (rf.p) r1
                java.lang.Object r4 = r9.V
                rf.g0 r4 = (rf.g0) r4
                zd.e1.n(r10)
                r5 = r4
                r4 = r1
                r1 = r0
                r0 = r9
                goto L_0x00af
            L_0x003b:
                int r1 = r9.T
                java.lang.Object r5 = r9.S
                rf.p r5 = (rf.p) r5
                java.lang.Object r6 = r9.V
                rf.g0 r6 = (rf.g0) r6
                zd.e1.n(r10)
                r7 = r6
                r6 = r5
                r5 = r1
                r1 = r0
                r0 = r9
                goto L_0x007e
            L_0x004e:
                zd.e1.n(r10)
                java.lang.Object r10 = r9.V
                rf.g0 r10 = (rf.g0) r10
                int r1 = r9.W
                if (r1 < 0) goto L_0x005b
                r5 = r4
                goto L_0x005c
            L_0x005b:
                r5 = 0
            L_0x005c:
                if (r5 == 0) goto L_0x00cd
                if (r1 <= 0) goto L_0x0097
                rf.i0<java.lang.Object> r5 = r9.X
                rf.p r5 = r5.iterator()
                r6 = r10
                r10 = r9
            L_0x0068:
                r10.V = r6
                r10.S = r5
                r10.T = r1
                r10.U = r4
                java.lang.Object r7 = r5.b(r10)
                if (r7 != r0) goto L_0x0077
                return r0
            L_0x0077:
                r8 = r0
                r0 = r10
                r10 = r7
                r7 = r6
                r6 = r5
                r5 = r1
                r1 = r8
            L_0x007e:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 == 0) goto L_0x0095
                r6.next()
                int r10 = r5 + -1
                if (r10 != 0) goto L_0x008e
                goto L_0x0095
            L_0x008e:
                r5 = r6
                r6 = r7
                r8 = r1
                r1 = r10
                r10 = r0
                r0 = r8
                goto L_0x0068
            L_0x0095:
                r10 = r7
                goto L_0x0099
            L_0x0097:
                r1 = r0
                r0 = r9
            L_0x0099:
                rf.i0<java.lang.Object> r4 = r0.X
                rf.p r4 = r4.iterator()
            L_0x009f:
                r0.V = r10
                r0.S = r4
                r0.U = r3
                java.lang.Object r5 = r4.b(r0)
                if (r5 != r1) goto L_0x00ac
                return r1
            L_0x00ac:
                r8 = r5
                r5 = r10
                r10 = r8
            L_0x00af:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 == 0) goto L_0x00ca
                java.lang.Object r10 = r4.next()
                r0.V = r5
                r0.S = r4
                r0.U = r2
                java.lang.Object r10 = r5.C(r10, r0)
                if (r10 != r1) goto L_0x00c8
                return r1
            L_0x00c8:
                r10 = r5
                goto L_0x009f
            L_0x00ca:
                zd.u2 r10 = zd.u2.f25116a
                return r10
            L_0x00cd:
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r0 = "Requested element count "
                r10.append(r0)
                r10.append(r1)
                java.lang.String r0 = " is less than zero."
                r10.append(r0)
                java.lang.String r10 = r10.toString()
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r10 = r10.toString()
                r0.<init>(r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: rf.v.g.K(java.lang.Object):java.lang.Object");
        }

        @fh.h
        /* renamed from: P */
        public final Object g0(@fh.g g0<Object> g0Var, @fh.h ie.d<? super u2> dVar) {
            return ((g) H(g0Var, dVar)).K(u2.f25116a);
        }
    }

    @le.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$takeWhile$1", f = "Deprecated.kt", i = {0, 1, 1, 2}, l = {269, 270, 271}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "e", "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0"})
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H@"}, d2 = {"E", "Lrf/g0;", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class g0 extends le.o implements we.p<g0<Object>, ie.d<? super u2>, Object> {
        public Object S;
        public Object T;
        public int U;
        public /* synthetic */ Object V;
        public final /* synthetic */ i0<Object> W;
        public final /* synthetic */ we.p<Object, ie.d<? super Boolean>, Object> X;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g0(i0<Object> i0Var, we.p<Object, ? super ie.d<? super Boolean>, ? extends Object> pVar, ie.d<? super g0> dVar) {
            super(2, dVar);
            this.W = i0Var;
            this.X = pVar;
        }

        @fh.g
        public final ie.d<u2> H(@fh.h Object obj, @fh.g ie.d<?> dVar) {
            g0 g0Var = new g0(this.W, this.X, dVar);
            g0Var.V = obj;
            return g0Var;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0064  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0072  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0097  */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object K(@fh.g java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = ke.d.h()
                int r1 = r9.U
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x0048
                if (r1 == r4) goto L_0x0038
                if (r1 == r3) goto L_0x0025
                if (r1 != r2) goto L_0x001d
                java.lang.Object r1 = r9.S
                rf.p r1 = (rf.p) r1
                java.lang.Object r5 = r9.V
                rf.g0 r5 = (rf.g0) r5
                zd.e1.n(r10)
                goto L_0x0056
            L_0x001d:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L_0x0025:
                java.lang.Object r1 = r9.T
                java.lang.Object r5 = r9.S
                rf.p r5 = (rf.p) r5
                java.lang.Object r6 = r9.V
                rf.g0 r6 = (rf.g0) r6
                zd.e1.n(r10)
                r7 = r6
                r6 = r5
                r5 = r1
                r1 = r0
                r0 = r9
                goto L_0x008c
            L_0x0038:
                java.lang.Object r1 = r9.S
                rf.p r1 = (rf.p) r1
                java.lang.Object r5 = r9.V
                rf.g0 r5 = (rf.g0) r5
                zd.e1.n(r10)
                r6 = r5
                r5 = r1
                r1 = r0
                r0 = r9
                goto L_0x006a
            L_0x0048:
                zd.e1.n(r10)
                java.lang.Object r10 = r9.V
                rf.g0 r10 = (rf.g0) r10
                rf.i0<java.lang.Object> r1 = r9.W
                rf.p r1 = r1.iterator()
                r5 = r10
            L_0x0056:
                r10 = r9
            L_0x0057:
                r10.V = r5
                r10.S = r1
                r10.U = r4
                java.lang.Object r6 = r1.b(r10)
                if (r6 != r0) goto L_0x0064
                return r0
            L_0x0064:
                r8 = r0
                r0 = r10
                r10 = r6
                r6 = r5
                r5 = r1
                r1 = r8
            L_0x006a:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 == 0) goto L_0x00ac
                java.lang.Object r10 = r5.next()
                we.p<java.lang.Object, ie.d<? super java.lang.Boolean>, java.lang.Object> r7 = r0.X
                r0.V = r6
                r0.S = r5
                r0.T = r10
                r0.U = r3
                java.lang.Object r7 = r7.g0(r10, r0)
                if (r7 != r1) goto L_0x0087
                return r1
            L_0x0087:
                r8 = r5
                r5 = r10
                r10 = r7
                r7 = r6
                r6 = r8
            L_0x008c:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 != 0) goto L_0x0097
                zd.u2 r10 = zd.u2.f25116a
                return r10
            L_0x0097:
                r0.V = r7
                r0.S = r6
                r10 = 0
                r0.T = r10
                r0.U = r2
                java.lang.Object r10 = r7.C(r5, r0)
                if (r10 != r1) goto L_0x00a7
                return r1
            L_0x00a7:
                r10 = r0
                r0 = r1
                r1 = r6
                r5 = r7
                goto L_0x0057
            L_0x00ac:
                zd.u2 r10 = zd.u2.f25116a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: rf.v.g0.K(java.lang.Object):java.lang.Object");
        }

        @fh.h
        /* renamed from: P */
        public final Object g0(@fh.g g0<Object> g0Var, @fh.h ie.d<? super u2> dVar) {
            return ((g0) H(g0Var, dVar)).K(u2.f25116a);
        }
    }

    @le.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$dropWhile$1", f = "Deprecated.kt", i = {0, 1, 1, 2, 3, 4}, l = {181, 182, 183, 187, 188}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "e", "$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0", "L$0", "L$0"})
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H@"}, d2 = {"E", "Lrf/g0;", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class h extends le.o implements we.p<g0<Object>, ie.d<? super u2>, Object> {
        public Object S;
        public Object T;
        public int U;
        public /* synthetic */ Object V;
        public final /* synthetic */ i0<Object> W;
        public final /* synthetic */ we.p<Object, ie.d<? super Boolean>, Object> X;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(i0<Object> i0Var, we.p<Object, ? super ie.d<? super Boolean>, ? extends Object> pVar, ie.d<? super h> dVar) {
            super(2, dVar);
            this.W = i0Var;
            this.X = pVar;
        }

        @fh.g
        public final ie.d<u2> H(@fh.h Object obj, @fh.g ie.d<?> dVar) {
            h hVar = new h(this.W, this.X, dVar);
            hVar.V = obj;
            return hVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x009c  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00cb A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00ce  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00e5 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00e6  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00f1  */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object K(@fh.g java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = ke.d.h()
                int r1 = r12.U
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                r7 = 0
                if (r1 == 0) goto L_0x0070
                if (r1 == r6) goto L_0x0060
                if (r1 == r5) goto L_0x004e
                if (r1 == r4) goto L_0x0042
                if (r1 == r3) goto L_0x0031
                if (r1 != r2) goto L_0x0029
                java.lang.Object r1 = r12.S
                rf.p r1 = (rf.p) r1
                java.lang.Object r4 = r12.V
                rf.g0 r4 = (rf.g0) r4
                zd.e1.n(r13)
                r13 = r1
                r9 = r4
                r1 = r0
                r0 = r12
                goto L_0x00d9
            L_0x0029:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L_0x0031:
                java.lang.Object r1 = r12.S
                rf.p r1 = (rf.p) r1
                java.lang.Object r4 = r12.V
                rf.g0 r4 = (rf.g0) r4
                zd.e1.n(r13)
                r9 = r4
                r4 = r1
                r1 = r0
                r0 = r12
                goto L_0x00e9
            L_0x0042:
                java.lang.Object r1 = r12.V
                rf.g0 r1 = (rf.g0) r1
                zd.e1.n(r13)
                r10 = r1
                r1 = r0
                r0 = r12
                goto L_0x00cc
            L_0x004e:
                java.lang.Object r1 = r12.T
                java.lang.Object r8 = r12.S
                rf.p r8 = (rf.p) r8
                java.lang.Object r9 = r12.V
                rf.g0 r9 = (rf.g0) r9
                zd.e1.n(r13)
                r10 = r9
                r9 = r1
                r1 = r0
                r0 = r12
                goto L_0x00b5
            L_0x0060:
                java.lang.Object r1 = r12.S
                rf.p r1 = (rf.p) r1
                java.lang.Object r8 = r12.V
                rf.g0 r8 = (rf.g0) r8
                zd.e1.n(r13)
                r9 = r8
                r8 = r1
                r1 = r0
                r0 = r12
                goto L_0x0094
            L_0x0070:
                zd.e1.n(r13)
                java.lang.Object r13 = r12.V
                rf.g0 r13 = (rf.g0) r13
                rf.i0<java.lang.Object> r1 = r12.W
                rf.p r1 = r1.iterator()
                r8 = r13
                r13 = r12
            L_0x007f:
                r13.V = r8
                r13.S = r1
                r13.T = r7
                r13.U = r6
                java.lang.Object r9 = r1.b(r13)
                if (r9 != r0) goto L_0x008e
                return r0
            L_0x008e:
                r11 = r0
                r0 = r13
                r13 = r9
                r9 = r8
                r8 = r1
                r1 = r11
            L_0x0094:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                if (r13 == 0) goto L_0x00d3
                java.lang.Object r13 = r8.next()
                we.p<java.lang.Object, ie.d<? super java.lang.Boolean>, java.lang.Object> r10 = r0.X
                r0.V = r9
                r0.S = r8
                r0.T = r13
                r0.U = r5
                java.lang.Object r10 = r10.g0(r13, r0)
                if (r10 != r1) goto L_0x00b1
                return r1
            L_0x00b1:
                r11 = r9
                r9 = r13
                r13 = r10
                r10 = r11
            L_0x00b5:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                if (r13 != 0) goto L_0x00ce
                r0.V = r10
                r0.S = r7
                r0.T = r7
                r0.U = r4
                java.lang.Object r13 = r10.C(r9, r0)
                if (r13 != r1) goto L_0x00cc
                return r1
            L_0x00cc:
                r9 = r10
                goto L_0x00d3
            L_0x00ce:
                r13 = r0
                r0 = r1
                r1 = r8
                r8 = r10
                goto L_0x007f
            L_0x00d3:
                rf.i0<java.lang.Object> r13 = r0.W
                rf.p r13 = r13.iterator()
            L_0x00d9:
                r0.V = r9
                r0.S = r13
                r0.U = r3
                java.lang.Object r4 = r13.b(r0)
                if (r4 != r1) goto L_0x00e6
                return r1
            L_0x00e6:
                r11 = r4
                r4 = r13
                r13 = r11
            L_0x00e9:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                if (r13 == 0) goto L_0x0104
                java.lang.Object r13 = r4.next()
                r0.V = r9
                r0.S = r4
                r0.U = r2
                java.lang.Object r13 = r9.C(r13, r0)
                if (r13 != r1) goto L_0x0102
                return r1
            L_0x0102:
                r13 = r4
                goto L_0x00d9
            L_0x0104:
                zd.u2 r13 = zd.u2.f25116a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: rf.v.h.K(java.lang.Object):java.lang.Object");
        }

        @fh.h
        /* renamed from: P */
        public final Object g0(@fh.g g0<Object> g0Var, @fh.h ie.d<? super u2> dVar) {
            return ((h) H(g0Var, dVar)).K(u2.f25116a);
        }
    }

    @le.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {487, 278}, m = "toChannel", n = {"destination", "$this$consume$iv$iv", "destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    @zd.i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class h0<E, C extends m0<? super E>> extends le.d {
        public Object R;
        public Object S;
        public Object T;
        public /* synthetic */ Object U;
        public int V;

        public h0(ie.d<? super h0> dVar) {
            super(dVar);
        }

        @fh.h
        public final Object K(@fh.g Object obj) {
            this.U = obj;
            this.V |= Integer.MIN_VALUE;
            return s.e0((i0) null, null, this);
        }
    }

    @le.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0}, l = {38}, m = "elementAt", n = {"$this$consume$iv", "index", "count"}, s = {"L$0", "I$0", "I$1"})
    @zd.i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class i<E> extends le.d {
        public int R;
        public int S;
        public Object T;
        public Object U;
        public /* synthetic */ Object V;
        public int W;

        public i(ie.d<? super i> dVar) {
            super(dVar);
        }

        @fh.h
        public final Object K(@fh.g Object obj) {
            this.V = obj;
            this.W |= Integer.MIN_VALUE;
            return v.l((i0) null, 0, this);
        }
    }

    @le.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {487}, m = "toCollection", n = {"destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    @zd.i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class i0<E, C extends Collection<? super E>> extends le.d {
        public Object R;
        public Object S;
        public Object T;
        public /* synthetic */ Object U;
        public int V;

        public i0(ie.d<? super i0> dVar) {
            super(dVar);
        }

        @fh.h
        public final Object K(@fh.g Object obj) {
            this.U = obj;
            this.V |= Integer.MIN_VALUE;
            return s.f0((i0) null, null, this);
        }
    }

    @le.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0}, l = {53}, m = "elementAtOrNull", n = {"$this$consume$iv", "index", "count"}, s = {"L$0", "I$0", "I$1"})
    @zd.i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class j<E> extends le.d {
        public int R;
        public int S;
        public Object T;
        public Object U;
        public /* synthetic */ Object V;
        public int W;

        public j(ie.d<? super j> dVar) {
            super(dVar);
        }

        @fh.h
        public final Object K(@fh.g Object obj) {
            this.V = obj;
            this.W |= Integer.MIN_VALUE;
            return v.m((i0) null, 0, this);
        }
    }

    @le.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {487}, m = "toMap", n = {"destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    @zd.i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class j0<K, V, M extends Map<? super K, ? super V>> extends le.d {
        public Object R;
        public Object S;
        public Object T;
        public /* synthetic */ Object U;
        public int V;

        public j0(ie.d<? super j0> dVar) {
            super(dVar);
        }

        @fh.h
        public final Object K(@fh.g Object obj) {
            this.U = obj;
            this.V |= Integer.MIN_VALUE;
            return s.i0((i0) null, null, this);
        }
    }

    @le.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filter$1", f = "Deprecated.kt", i = {0, 1, 1, 2}, l = {198, 199, 199}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "e", "$this$produce"}, s = {"L$0", "L$0", "L$2", "L$0"})
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H@"}, d2 = {"E", "Lrf/g0;", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class k extends le.o implements we.p<g0<? super E>, ie.d<? super u2>, Object> {
        public Object S;
        public Object T;
        public int U;
        public /* synthetic */ Object V;
        public final /* synthetic */ i0<E> W;
        public final /* synthetic */ we.p<E, ie.d<? super Boolean>, Object> X;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(i0<? extends E> i0Var, we.p<? super E, ? super ie.d<? super Boolean>, ? extends Object> pVar, ie.d<? super k> dVar) {
            super(2, dVar);
            this.W = i0Var;
            this.X = pVar;
        }

        @fh.g
        public final ie.d<u2> H(@fh.h Object obj, @fh.g ie.d<?> dVar) {
            k kVar = new k(this.W, this.X, dVar);
            kVar.V = obj;
            return kVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0065 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0074  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0095  */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object K(@fh.g java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = ke.d.h()
                int r1 = r10.U
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L_0x0048
                if (r1 == r5) goto L_0x0038
                if (r1 == r4) goto L_0x0026
                if (r1 != r3) goto L_0x001e
                java.lang.Object r1 = r10.S
                rf.p r1 = (rf.p) r1
                java.lang.Object r6 = r10.V
                rf.g0 r6 = (rf.g0) r6
                zd.e1.n(r11)
                goto L_0x0056
            L_0x001e:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L_0x0026:
                java.lang.Object r1 = r10.T
                java.lang.Object r6 = r10.S
                rf.p r6 = (rf.p) r6
                java.lang.Object r7 = r10.V
                rf.g0 r7 = (rf.g0) r7
                zd.e1.n(r11)
                r8 = r7
                r7 = r1
                r1 = r0
                r0 = r10
                goto L_0x008d
            L_0x0038:
                java.lang.Object r1 = r10.S
                rf.p r1 = (rf.p) r1
                java.lang.Object r6 = r10.V
                rf.g0 r6 = (rf.g0) r6
                zd.e1.n(r11)
                r7 = r6
                r6 = r1
                r1 = r0
                r0 = r10
                goto L_0x006c
            L_0x0048:
                zd.e1.n(r11)
                java.lang.Object r11 = r10.V
                rf.g0 r11 = (rf.g0) r11
                rf.i0<E> r1 = r10.W
                rf.p r1 = r1.iterator()
                r6 = r11
            L_0x0056:
                r11 = r10
            L_0x0057:
                r11.V = r6
                r11.S = r1
                r11.T = r2
                r11.U = r5
                java.lang.Object r7 = r1.b(r11)
                if (r7 != r0) goto L_0x0066
                return r0
            L_0x0066:
                r9 = r0
                r0 = r11
                r11 = r7
                r7 = r6
                r6 = r1
                r1 = r9
            L_0x006c:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto L_0x00a9
                java.lang.Object r11 = r6.next()
                we.p<E, ie.d<? super java.lang.Boolean>, java.lang.Object> r8 = r0.X
                r0.V = r7
                r0.S = r6
                r0.T = r11
                r0.U = r4
                java.lang.Object r8 = r8.g0(r11, r0)
                if (r8 != r1) goto L_0x0089
                return r1
            L_0x0089:
                r9 = r7
                r7 = r11
                r11 = r8
                r8 = r9
            L_0x008d:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto L_0x00a4
                r0.V = r8
                r0.S = r6
                r0.T = r2
                r0.U = r3
                java.lang.Object r11 = r8.C(r7, r0)
                if (r11 != r1) goto L_0x00a4
                return r1
            L_0x00a4:
                r11 = r0
                r0 = r1
                r1 = r6
                r6 = r8
                goto L_0x0057
            L_0x00a9:
                zd.u2 r11 = zd.u2.f25116a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: rf.v.k.K(java.lang.Object):java.lang.Object");
        }

        @fh.h
        /* renamed from: P */
        public final Object g0(@fh.g g0<? super E> g0Var, @fh.h ie.d<? super u2> dVar) {
            return ((k) H(g0Var, dVar)).K(u2.f25116a);
        }
    }

    @le.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {370, 371}, m = "invokeSuspend", n = {"$this$produce", "index", "$this$produce", "index"}, s = {"L$0", "I$0", "L$0", "I$0"})
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H@"}, d2 = {"E", "Lrf/g0;", "Lbe/p0;", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class k0 extends le.o implements we.p<g0<? super p0<Object>>, ie.d<? super u2>, Object> {
        public Object S;
        public int T;
        public int U;
        public /* synthetic */ Object V;
        public final /* synthetic */ i0<Object> W;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k0(i0<Object> i0Var, ie.d<? super k0> dVar) {
            super(2, dVar);
            this.W = i0Var;
        }

        @fh.g
        public final ie.d<u2> H(@fh.h Object obj, @fh.g ie.d<?> dVar) {
            k0 k0Var = new k0(this.W, dVar);
            k0Var.V = obj;
            return k0Var;
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0052  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x005e  */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object K(@fh.g java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = ke.d.h()
                int r1 = r10.U
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0034
                if (r1 == r3) goto L_0x0025
                if (r1 != r2) goto L_0x001d
                int r1 = r10.T
                java.lang.Object r4 = r10.S
                rf.p r4 = (rf.p) r4
                java.lang.Object r5 = r10.V
                rf.g0 r5 = (rf.g0) r5
                zd.e1.n(r11)
                r11 = r5
                goto L_0x0042
            L_0x001d:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L_0x0025:
                int r1 = r10.T
                java.lang.Object r4 = r10.S
                rf.p r4 = (rf.p) r4
                java.lang.Object r5 = r10.V
                rf.g0 r5 = (rf.g0) r5
                zd.e1.n(r11)
                r6 = r10
                goto L_0x0056
            L_0x0034:
                zd.e1.n(r11)
                java.lang.Object r11 = r10.V
                rf.g0 r11 = (rf.g0) r11
                r1 = 0
                rf.i0<java.lang.Object> r4 = r10.W
                rf.p r4 = r4.iterator()
            L_0x0042:
                r5 = r10
            L_0x0043:
                r5.V = r11
                r5.S = r4
                r5.T = r1
                r5.U = r3
                java.lang.Object r6 = r4.b(r5)
                if (r6 != r0) goto L_0x0052
                return r0
            L_0x0052:
                r9 = r5
                r5 = r11
                r11 = r6
                r6 = r9
            L_0x0056:
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                if (r11 == 0) goto L_0x007c
                java.lang.Object r11 = r4.next()
                be.p0 r7 = new be.p0
                int r8 = r1 + 1
                r7.<init>(r1, r11)
                r6.V = r5
                r6.S = r4
                r6.T = r8
                r6.U = r2
                java.lang.Object r11 = r5.C(r7, r6)
                if (r11 != r0) goto L_0x0078
                return r0
            L_0x0078:
                r11 = r5
                r5 = r6
                r1 = r8
                goto L_0x0043
            L_0x007c:
                zd.u2 r11 = zd.u2.f25116a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: rf.v.k0.K(java.lang.Object):java.lang.Object");
        }

        @fh.h
        /* renamed from: P */
        public final Object g0(@fh.g g0<? super p0<Object>> g0Var, @fh.h ie.d<? super u2> dVar) {
            return ((k0) H(g0Var, dVar)).K(u2.f25116a);
        }
    }

    @le.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterIndexed$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 1, 2, 2}, l = {211, 212, 212}, m = "invokeSuspend", n = {"$this$produce", "index", "$this$produce", "e", "index", "$this$produce", "index"}, s = {"L$0", "I$0", "L$0", "L$2", "I$0", "L$0", "I$0"})
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H@"}, d2 = {"E", "Lrf/g0;", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class l extends le.o implements we.p<g0<Object>, ie.d<? super u2>, Object> {
        public Object S;
        public Object T;
        public int U;
        public int V;
        public /* synthetic */ Object W;
        public final /* synthetic */ i0<Object> X;
        public final /* synthetic */ we.q<Integer, Object, ie.d<? super Boolean>, Object> Y;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public l(i0<Object> i0Var, we.q<? super Integer, Object, ? super ie.d<? super Boolean>, ? extends Object> qVar, ie.d<? super l> dVar) {
            super(2, dVar);
            this.X = i0Var;
            this.Y = qVar;
        }

        @fh.g
        public final ie.d<u2> H(@fh.h Object obj, @fh.g ie.d<?> dVar) {
            l lVar = new l(this.X, this.Y, dVar);
            lVar.W = obj;
            return lVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0072 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0073  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0082  */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object K(@fh.g java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = ke.d.h()
                int r1 = r12.V
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L_0x0052
                if (r1 == r5) goto L_0x003f
                if (r1 == r4) goto L_0x0028
                if (r1 != r3) goto L_0x0020
                int r1 = r12.U
                java.lang.Object r6 = r12.S
                rf.p r6 = (rf.p) r6
                java.lang.Object r7 = r12.W
                rf.g0 r7 = (rf.g0) r7
                zd.e1.n(r13)
                goto L_0x0061
            L_0x0020:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L_0x0028:
                int r1 = r12.U
                java.lang.Object r6 = r12.T
                java.lang.Object r7 = r12.S
                rf.p r7 = (rf.p) r7
                java.lang.Object r8 = r12.W
                rf.g0 r8 = (rf.g0) r8
                zd.e1.n(r13)
                r10 = r1
                r1 = r0
                r0 = r12
                r11 = r7
                r7 = r6
            L_0x003c:
                r6 = r11
                goto L_0x00a3
            L_0x003f:
                int r1 = r12.U
                java.lang.Object r6 = r12.S
                rf.p r6 = (rf.p) r6
                java.lang.Object r7 = r12.W
                rf.g0 r7 = (rf.g0) r7
                zd.e1.n(r13)
                r8 = r7
                r7 = r6
                r6 = r1
                r1 = r0
                r0 = r12
                goto L_0x007a
            L_0x0052:
                zd.e1.n(r13)
                java.lang.Object r13 = r12.W
                rf.g0 r13 = (rf.g0) r13
                r1 = 0
                rf.i0<java.lang.Object> r6 = r12.X
                rf.p r6 = r6.iterator()
                r7 = r13
            L_0x0061:
                r13 = r12
            L_0x0062:
                r13.W = r7
                r13.S = r6
                r13.T = r2
                r13.U = r1
                r13.V = r5
                java.lang.Object r8 = r6.b(r13)
                if (r8 != r0) goto L_0x0073
                return r0
            L_0x0073:
                r11 = r0
                r0 = r13
                r13 = r8
                r8 = r7
                r7 = r6
                r6 = r1
                r1 = r11
            L_0x007a:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                if (r13 == 0) goto L_0x00c1
                java.lang.Object r13 = r7.next()
                we.q<java.lang.Integer, java.lang.Object, ie.d<? super java.lang.Boolean>, java.lang.Object> r9 = r0.Y
                int r10 = r6 + 1
                java.lang.Integer r6 = le.b.f(r6)
                r0.W = r8
                r0.S = r7
                r0.T = r13
                r0.U = r10
                r0.V = r4
                java.lang.Object r6 = r9.y(r6, r13, r0)
                if (r6 != r1) goto L_0x009f
                return r1
            L_0x009f:
                r11 = r7
                r7 = r13
                r13 = r6
                goto L_0x003c
            L_0x00a3:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                if (r13 == 0) goto L_0x00bc
                r0.W = r8
                r0.S = r6
                r0.T = r2
                r0.U = r10
                r0.V = r3
                java.lang.Object r13 = r8.C(r7, r0)
                if (r13 != r1) goto L_0x00bc
                return r1
            L_0x00bc:
                r13 = r0
                r0 = r1
                r7 = r8
                r1 = r10
                goto L_0x0062
            L_0x00c1:
                zd.u2 r13 = zd.u2.f25116a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: rf.v.l.K(java.lang.Object):java.lang.Object");
        }

        @fh.h
        /* renamed from: P */
        public final Object g0(@fh.g g0<Object> g0Var, @fh.h ie.d<? super u2> dVar) {
            return ((l) H(g0Var, dVar)).K(u2.f25116a);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"E", "R", "t1", "t2", "Lzd/u0;", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Lzd/u0;"}, k = 3, mv = {1, 6, 0})
    public static final class l0 extends n0 implements we.p<Object, Object, u0<Object, Object>> {
        public static final l0 P = new l0();

        public l0() {
            super(2);
        }

        @fh.g
        /* renamed from: c */
        public final u0<Object, Object> g0(Object obj, Object obj2) {
            return r1.a(obj, obj2);
        }
    }

    @le.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNot$1", f = "Deprecated.kt", i = {}, l = {222}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H@"}, d2 = {"E", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class m extends le.o implements we.p<Object, ie.d<? super Boolean>, Object> {
        public int S;
        public /* synthetic */ Object T;
        public final /* synthetic */ we.p<Object, ie.d<? super Boolean>, Object> U;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public m(we.p<Object, ? super ie.d<? super Boolean>, ? extends Object> pVar, ie.d<? super m> dVar) {
            super(2, dVar);
            this.U = pVar;
        }

        @fh.g
        public final ie.d<u2> H(@fh.h Object obj, @fh.g ie.d<?> dVar) {
            m mVar = new m(this.U, dVar);
            mVar.T = obj;
            return mVar;
        }

        @fh.h
        public final Object K(@fh.g Object obj) {
            Object h10 = ke.d.h();
            int i10 = this.S;
            if (i10 == 0) {
                e1.n(obj);
                Object obj2 = this.T;
                we.p<Object, ie.d<? super Boolean>, Object> pVar = this.U;
                this.S = 1;
                obj = pVar.g0(obj2, this);
                if (obj == h10) {
                    return h10;
                }
            } else if (i10 == 1) {
                e1.n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return le.b.a(!((Boolean) obj).booleanValue());
        }

        @fh.h
        /* renamed from: P */
        public final Object g0(Object obj, @fh.h ie.d<? super Boolean> dVar) {
            return ((m) H(obj, dVar)).K(u2.f25116a);
        }
    }

    @le.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2", f = "Deprecated.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2}, l = {487, 469, 471}, m = "invokeSuspend", n = {"$this$produce", "otherIterator", "$this$consume$iv$iv", "$this$produce", "otherIterator", "$this$consume$iv$iv", "element1", "$this$produce", "otherIterator", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$3", "L$0", "L$1", "L$3", "L$5", "L$0", "L$1", "L$3"})
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00020\u0003H@"}, d2 = {"E", "R", "V", "Lrf/g0;", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class m0 extends le.o implements we.p<g0<? super V>, ie.d<? super u2>, Object> {
        public Object S;
        public Object T;
        public Object U;
        public Object V;
        public Object W;
        public int X;
        public /* synthetic */ Object Y;
        public final /* synthetic */ i0<R> Z;

        /* renamed from: a0  reason: collision with root package name */
        public final /* synthetic */ i0<E> f22545a0;

        /* renamed from: b0  reason: collision with root package name */
        public final /* synthetic */ we.p<E, R, V> f22546b0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public m0(i0<? extends R> i0Var, i0<? extends E> i0Var2, we.p<? super E, ? super R, ? extends V> pVar, ie.d<? super m0> dVar) {
            super(2, dVar);
            this.Z = i0Var;
            this.f22545a0 = i0Var2;
            this.f22546b0 = pVar;
        }

        @fh.g
        public final ie.d<u2> H(@fh.h Object obj, @fh.g ie.d<?> dVar) {
            m0 m0Var = new m0(this.Z, this.f22545a0, this.f22546b0, dVar);
            m0Var.Y = obj;
            return m0Var;
        }

        /* JADX WARNING: Removed duplicated region for block: B:31:0x00b9 A[Catch:{ all -> 0x0056 }] */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00e1 A[Catch:{ all -> 0x0106 }] */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object K(@fh.g java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = ke.d.h()
                int r1 = r13.X
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L_0x0079
                if (r1 == r4) goto L_0x005a
                if (r1 == r3) goto L_0x0034
                if (r1 != r2) goto L_0x002c
                java.lang.Object r1 = r13.V
                rf.p r1 = (rf.p) r1
                java.lang.Object r6 = r13.U
                rf.i0 r6 = (rf.i0) r6
                java.lang.Object r7 = r13.T
                we.p r7 = (we.p) r7
                java.lang.Object r8 = r13.S
                rf.p r8 = (rf.p) r8
                java.lang.Object r9 = r13.Y
                rf.g0 r9 = (rf.g0) r9
                zd.e1.n(r14)     // Catch:{ all -> 0x010f }
                r14 = r13
                goto L_0x0093
            L_0x002c:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L_0x0034:
                java.lang.Object r1 = r13.W
                java.lang.Object r6 = r13.V
                rf.p r6 = (rf.p) r6
                java.lang.Object r7 = r13.U
                rf.i0 r7 = (rf.i0) r7
                java.lang.Object r8 = r13.T
                we.p r8 = (we.p) r8
                java.lang.Object r9 = r13.S
                rf.p r9 = (rf.p) r9
                java.lang.Object r10 = r13.Y
                rf.g0 r10 = (rf.g0) r10
                zd.e1.n(r14)     // Catch:{ all -> 0x0056 }
                r11 = r10
                r10 = r9
                r9 = r8
                r8 = r7
                r7 = r1
                r1 = r0
                r0 = r13
                goto L_0x00d9
            L_0x0056:
                r14 = move-exception
                r6 = r7
                goto L_0x0110
            L_0x005a:
                java.lang.Object r1 = r13.V
                rf.p r1 = (rf.p) r1
                java.lang.Object r6 = r13.U
                rf.i0 r6 = (rf.i0) r6
                java.lang.Object r7 = r13.T
                we.p r7 = (we.p) r7
                java.lang.Object r8 = r13.S
                rf.p r8 = (rf.p) r8
                java.lang.Object r9 = r13.Y
                rf.g0 r9 = (rf.g0) r9
                zd.e1.n(r14)     // Catch:{ all -> 0x010f }
                r10 = r9
                r9 = r8
                r8 = r7
                r7 = r6
                r6 = r1
                r1 = r0
                r0 = r13
                goto L_0x00b1
            L_0x0079:
                zd.e1.n(r14)
                java.lang.Object r14 = r13.Y
                rf.g0 r14 = (rf.g0) r14
                rf.i0<R> r1 = r13.Z
                rf.p r1 = r1.iterator()
                rf.i0<E> r6 = r13.f22545a0
                we.p<E, R, V> r7 = r13.f22546b0
                rf.p r8 = r6.iterator()     // Catch:{ all -> 0x010f }
                r9 = r14
                r14 = r13
                r12 = r8
                r8 = r1
                r1 = r12
            L_0x0093:
                r14.Y = r9     // Catch:{ all -> 0x010f }
                r14.S = r8     // Catch:{ all -> 0x010f }
                r14.T = r7     // Catch:{ all -> 0x010f }
                r14.U = r6     // Catch:{ all -> 0x010f }
                r14.V = r1     // Catch:{ all -> 0x010f }
                r14.W = r5     // Catch:{ all -> 0x010f }
                r14.X = r4     // Catch:{ all -> 0x010f }
                java.lang.Object r10 = r1.b(r14)     // Catch:{ all -> 0x010f }
                if (r10 != r0) goto L_0x00a8
                return r0
            L_0x00a8:
                r12 = r0
                r0 = r14
                r14 = r10
                r10 = r9
                r9 = r8
                r8 = r7
                r7 = r6
                r6 = r1
                r1 = r12
            L_0x00b1:
                java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch:{ all -> 0x0056 }
                boolean r14 = r14.booleanValue()     // Catch:{ all -> 0x0056 }
                if (r14 == 0) goto L_0x0109
                java.lang.Object r14 = r6.next()     // Catch:{ all -> 0x0056 }
                r0.Y = r10     // Catch:{ all -> 0x0056 }
                r0.S = r9     // Catch:{ all -> 0x0056 }
                r0.T = r8     // Catch:{ all -> 0x0056 }
                r0.U = r7     // Catch:{ all -> 0x0056 }
                r0.V = r6     // Catch:{ all -> 0x0056 }
                r0.W = r14     // Catch:{ all -> 0x0056 }
                r0.X = r3     // Catch:{ all -> 0x0056 }
                java.lang.Object r11 = r9.b(r0)     // Catch:{ all -> 0x0056 }
                if (r11 != r1) goto L_0x00d2
                return r1
            L_0x00d2:
                r12 = r7
                r7 = r14
                r14 = r11
                r11 = r10
                r10 = r9
                r9 = r8
                r8 = r12
            L_0x00d9:
                java.lang.Boolean r14 = (java.lang.Boolean) r14     // Catch:{ all -> 0x0106 }
                boolean r14 = r14.booleanValue()     // Catch:{ all -> 0x0106 }
                if (r14 == 0) goto L_0x00fe
                java.lang.Object r14 = r10.next()     // Catch:{ all -> 0x0106 }
                java.lang.Object r14 = r9.g0(r7, r14)     // Catch:{ all -> 0x0106 }
                r0.Y = r11     // Catch:{ all -> 0x0106 }
                r0.S = r10     // Catch:{ all -> 0x0106 }
                r0.T = r9     // Catch:{ all -> 0x0106 }
                r0.U = r8     // Catch:{ all -> 0x0106 }
                r0.V = r6     // Catch:{ all -> 0x0106 }
                r0.W = r5     // Catch:{ all -> 0x0106 }
                r0.X = r2     // Catch:{ all -> 0x0106 }
                java.lang.Object r14 = r11.C(r14, r0)     // Catch:{ all -> 0x0106 }
                if (r14 != r1) goto L_0x00fe
                return r1
            L_0x00fe:
                r14 = r0
                r0 = r1
                r1 = r6
                r6 = r8
                r7 = r9
                r8 = r10
                r9 = r11
                goto L_0x0093
            L_0x0106:
                r14 = move-exception
                r6 = r8
                goto L_0x0110
            L_0x0109:
                zd.u2 r14 = zd.u2.f25116a     // Catch:{ all -> 0x0056 }
                rf.s.b(r7, r5)
                return r14
            L_0x010f:
                r14 = move-exception
            L_0x0110:
                throw r14     // Catch:{ all -> 0x0111 }
            L_0x0111:
                r0 = move-exception
                rf.s.b(r6, r14)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: rf.v.m0.K(java.lang.Object):java.lang.Object");
        }

        @fh.h
        /* renamed from: P */
        public final Object g0(@fh.g g0<? super V> g0Var, @fh.h ie.d<? super u2> dVar) {
            return ((m0) H(g0Var, dVar)).K(u2.f25116a);
        }
    }

    @le.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNull$1", f = "Deprecated.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00018\u0000H@"}, d2 = {"", "E", "it", "", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class n extends le.o implements we.p<E, ie.d<? super Boolean>, Object> {
        public int S;
        public /* synthetic */ Object T;

        public n(ie.d<? super n> dVar) {
            super(2, dVar);
        }

        @fh.g
        public final ie.d<u2> H(@fh.h Object obj, @fh.g ie.d<?> dVar) {
            n nVar = new n(dVar);
            nVar.T = obj;
            return nVar;
        }

        @fh.h
        public final Object K(@fh.g Object obj) {
            ke.d.h();
            if (this.S == 0) {
                e1.n(obj);
                return le.b.a(this.T != null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @fh.h
        /* renamed from: P */
        public final Object g0(@fh.h E e10, @fh.h ie.d<? super Boolean> dVar) {
            return ((n) H(e10, dVar)).K(u2.f25116a);
        }
    }

    @le.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {487}, m = "filterNotNullTo", n = {"destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
    @zd.i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class o<E, C extends Collection<? super E>> extends le.d {
        public Object R;
        public Object S;
        public Object T;
        public /* synthetic */ Object U;
        public int V;

        public o(ie.d<? super o> dVar) {
            super(dVar);
        }

        @fh.h
        public final Object K(@fh.g Object obj) {
            this.U = obj;
            this.V |= Integer.MIN_VALUE;
            return v.u((i0) null, (Collection) null, this);
        }
    }

    @le.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {487, 242}, m = "filterNotNullTo", n = {"destination", "$this$consume$iv$iv", "destination", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    @zd.i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class p<E, C extends m0<? super E>> extends le.d {
        public Object R;
        public Object S;
        public Object T;
        public /* synthetic */ Object U;
        public int V;

        public p(ie.d<? super p> dVar) {
            super(dVar);
        }

        @fh.h
        public final Object K(@fh.g Object obj) {
            this.U = obj;
            this.V |= Integer.MIN_VALUE;
            return v.v((i0) null, (m0) null, this);
        }
    }

    @le.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {65}, m = "first", n = {"$this$consume$iv", "iterator"}, s = {"L$0", "L$1"})
    @zd.i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class q<E> extends le.d {
        public Object R;
        public Object S;
        public /* synthetic */ Object T;
        public int U;

        public q(ie.d<? super q> dVar) {
            super(dVar);
        }

        @fh.h
        public final Object K(@fh.g Object obj) {
            this.T = obj;
            this.U |= Integer.MIN_VALUE;
            return v.w((i0) null, this);
        }
    }

    @le.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {75}, m = "firstOrNull", n = {"$this$consume$iv", "iterator"}, s = {"L$0", "L$1"})
    @zd.i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class r<E> extends le.d {
        public Object R;
        public Object S;
        public /* synthetic */ Object T;
        public int U;

        public r(ie.d<? super r> dVar) {
            super(dVar);
        }

        @fh.h
        public final Object K(@fh.g Object obj) {
            this.T = obj;
            this.U |= Integer.MIN_VALUE;
            return v.x((i0) null, this);
        }
    }

    @le.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1", f = "Deprecated.kt", i = {0, 1, 2}, l = {321, 322, 322}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$0"})
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H@"}, d2 = {"E", "R", "Lrf/g0;", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class s extends le.o implements we.p<g0<Object>, ie.d<? super u2>, Object> {
        public Object S;
        public int T;
        public /* synthetic */ Object U;
        public final /* synthetic */ i0<Object> V;
        public final /* synthetic */ we.p<Object, ie.d<? super i0<Object>>, Object> W;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public s(i0<Object> i0Var, we.p<Object, ? super ie.d<? super i0<Object>>, ? extends Object> pVar, ie.d<? super s> dVar) {
            super(2, dVar);
            this.V = i0Var;
            this.W = pVar;
        }

        @fh.g
        public final ie.d<u2> H(@fh.h Object obj, @fh.g ie.d<?> dVar) {
            s sVar = new s(this.V, this.W, dVar);
            sVar.U = obj;
            return sVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0061  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x006f  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0091  */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object K(@fh.g java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = ke.d.h()
                int r1 = r9.T
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x0045
                if (r1 == r4) goto L_0x0035
                if (r1 == r3) goto L_0x0025
                if (r1 != r2) goto L_0x001d
                java.lang.Object r1 = r9.S
                rf.p r1 = (rf.p) r1
                java.lang.Object r5 = r9.U
                rf.g0 r5 = (rf.g0) r5
                zd.e1.n(r10)
                goto L_0x0053
            L_0x001d:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L_0x0025:
                java.lang.Object r1 = r9.S
                rf.p r1 = (rf.p) r1
                java.lang.Object r5 = r9.U
                rf.g0 r5 = (rf.g0) r5
                zd.e1.n(r10)
                r6 = r5
                r5 = r1
                r1 = r0
                r0 = r9
                goto L_0x0082
            L_0x0035:
                java.lang.Object r1 = r9.S
                rf.p r1 = (rf.p) r1
                java.lang.Object r5 = r9.U
                rf.g0 r5 = (rf.g0) r5
                zd.e1.n(r10)
                r6 = r5
                r5 = r1
                r1 = r0
                r0 = r9
                goto L_0x0067
            L_0x0045:
                zd.e1.n(r10)
                java.lang.Object r10 = r9.U
                rf.g0 r10 = (rf.g0) r10
                rf.i0<java.lang.Object> r1 = r9.V
                rf.p r1 = r1.iterator()
                r5 = r10
            L_0x0053:
                r10 = r9
            L_0x0054:
                r10.U = r5
                r10.S = r1
                r10.T = r4
                java.lang.Object r6 = r1.b(r10)
                if (r6 != r0) goto L_0x0061
                return r0
            L_0x0061:
                r8 = r0
                r0 = r10
                r10 = r6
                r6 = r5
                r5 = r1
                r1 = r8
            L_0x0067:
                java.lang.Boolean r10 = (java.lang.Boolean) r10
                boolean r10 = r10.booleanValue()
                if (r10 == 0) goto L_0x0096
                java.lang.Object r10 = r5.next()
                we.p<java.lang.Object, ie.d<? super rf.i0<java.lang.Object>>, java.lang.Object> r7 = r0.W
                r0.U = r6
                r0.S = r5
                r0.T = r3
                java.lang.Object r10 = r7.g0(r10, r0)
                if (r10 != r1) goto L_0x0082
                return r1
            L_0x0082:
                rf.i0 r10 = (rf.i0) r10
                r0.U = r6
                r0.S = r5
                r0.T = r2
                java.lang.Object r10 = rf.s.e0(r10, r6, r0)
                if (r10 != r1) goto L_0x0091
                return r1
            L_0x0091:
                r10 = r0
                r0 = r1
                r1 = r5
                r5 = r6
                goto L_0x0054
            L_0x0096:
                zd.u2 r10 = zd.u2.f25116a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: rf.v.s.K(java.lang.Object):java.lang.Object");
        }

        @fh.h
        /* renamed from: P */
        public final Object g0(@fh.g g0<Object> g0Var, @fh.h ie.d<? super u2> dVar) {
            return ((s) H(g0Var, dVar)).K(u2.f25116a);
        }
    }

    @le.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0}, l = {487}, m = "indexOf", n = {"element", "index", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$2"})
    @zd.i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class t<E> extends le.d {
        public Object R;
        public Object S;
        public Object T;
        public Object U;
        public /* synthetic */ Object V;
        public int W;

        public t(ie.d<? super t> dVar) {
            super(dVar);
        }

        @fh.h
        public final Object K(@fh.g Object obj) {
            this.V = obj;
            this.W |= Integer.MIN_VALUE;
            return v.A((i0) null, (Object) null, this);
        }
    }

    @le.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1, 1}, l = {97, 100}, m = "last", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "iterator", "last"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    @zd.i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class u<E> extends le.d {
        public Object R;
        public Object S;
        public Object T;
        public /* synthetic */ Object U;
        public int V;

        public u(ie.d<? super u> dVar) {
            super(dVar);
        }

        @fh.h
        public final Object K(@fh.g Object obj) {
            this.U = obj;
            this.V |= Integer.MIN_VALUE;
            return v.B((i0) null, this);
        }
    }

    @le.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0, 0}, l = {487}, m = "lastIndexOf", n = {"element", "lastIndex", "index", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$3"})
    @zd.i0(k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: rf.v$v  reason: collision with other inner class name */
    public static final class C0411v<E> extends le.d {
        public Object R;
        public Object S;
        public Object T;
        public Object U;
        public Object V;
        public /* synthetic */ Object W;
        public int X;

        public C0411v(ie.d<? super C0411v> dVar) {
            super(dVar);
        }

        @fh.h
        public final Object K(@fh.g Object obj) {
            this.W = obj;
            this.X |= Integer.MIN_VALUE;
            return v.C((i0) null, (Object) null, this);
        }
    }

    @le.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 1, 1, 1}, l = {123, 126}, m = "lastOrNull", n = {"$this$consume$iv", "iterator", "$this$consume$iv", "iterator", "last"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    @zd.i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class w<E> extends le.d {
        public Object R;
        public Object S;
        public Object T;
        public /* synthetic */ Object U;
        public int V;

        public w(ie.d<? super w> dVar) {
            super(dVar);
        }

        @fh.h
        public final Object K(@fh.g Object obj) {
            this.U = obj;
            this.V |= Integer.MIN_VALUE;
            return v.D((i0) null, this);
        }
    }

    @le.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 2, 2}, l = {487, 333, 333}, m = "invokeSuspend", n = {"$this$produce", "$this$consume$iv$iv", "$this$produce", "$this$consume$iv$iv", "$this$produce", "$this$consume$iv$iv"}, s = {"L$0", "L$2", "L$0", "L$2", "L$0", "L$2"})
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H@"}, d2 = {"E", "R", "Lrf/g0;", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class x extends le.o implements we.p<g0<? super R>, ie.d<? super u2>, Object> {
        public Object S;
        public Object T;
        public Object U;
        public Object V;
        public int W;
        public /* synthetic */ Object X;
        public final /* synthetic */ i0<E> Y;
        public final /* synthetic */ we.p<E, ie.d<? super R>, Object> Z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public x(i0<? extends E> i0Var, we.p<? super E, ? super ie.d<? super R>, ? extends Object> pVar, ie.d<? super x> dVar) {
            super(2, dVar);
            this.Y = i0Var;
            this.Z = pVar;
        }

        @fh.g
        public final ie.d<u2> H(@fh.h Object obj, @fh.g ie.d<?> dVar) {
            x xVar = new x(this.Y, this.Z, dVar);
            xVar.X = obj;
            return xVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:30:0x0093 A[Catch:{ all -> 0x00cf }] */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00c3  */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object K(@fh.g java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = ke.d.h()
                int r1 = r12.W
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L_0x0063
                if (r1 == r5) goto L_0x004e
                if (r1 == r4) goto L_0x0030
                if (r1 != r3) goto L_0x0028
                java.lang.Object r1 = r12.U
                rf.p r1 = (rf.p) r1
                java.lang.Object r6 = r12.T
                rf.i0 r6 = (rf.i0) r6
                java.lang.Object r7 = r12.S
                we.p r7 = (we.p) r7
                java.lang.Object r8 = r12.X
                rf.g0 r8 = (rf.g0) r8
                zd.e1.n(r13)     // Catch:{ all -> 0x00cf }
                r13 = r8
                r8 = r12
                goto L_0x0076
            L_0x0028:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L_0x0030:
                java.lang.Object r1 = r12.V
                rf.g0 r1 = (rf.g0) r1
                java.lang.Object r6 = r12.U
                rf.p r6 = (rf.p) r6
                java.lang.Object r7 = r12.T
                rf.i0 r7 = (rf.i0) r7
                java.lang.Object r8 = r12.S
                we.p r8 = (we.p) r8
                java.lang.Object r9 = r12.X
                rf.g0 r9 = (rf.g0) r9
                zd.e1.n(r13)     // Catch:{ all -> 0x004a }
                r10 = r12
                goto L_0x00b0
            L_0x004a:
                r13 = move-exception
                r6 = r7
                goto L_0x00d0
            L_0x004e:
                java.lang.Object r1 = r12.U
                rf.p r1 = (rf.p) r1
                java.lang.Object r6 = r12.T
                rf.i0 r6 = (rf.i0) r6
                java.lang.Object r7 = r12.S
                we.p r7 = (we.p) r7
                java.lang.Object r8 = r12.X
                rf.g0 r8 = (rf.g0) r8
                zd.e1.n(r13)     // Catch:{ all -> 0x00cf }
                r9 = r12
                goto L_0x008b
            L_0x0063:
                zd.e1.n(r13)
                java.lang.Object r13 = r12.X
                rf.g0 r13 = (rf.g0) r13
                rf.i0<E> r6 = r12.Y
                we.p<E, ie.d<? super R>, java.lang.Object> r1 = r12.Z
                rf.p r7 = r6.iterator()     // Catch:{ all -> 0x00cf }
                r8 = r12
                r11 = r7
                r7 = r1
                r1 = r11
            L_0x0076:
                r8.X = r13     // Catch:{ all -> 0x00cf }
                r8.S = r7     // Catch:{ all -> 0x00cf }
                r8.T = r6     // Catch:{ all -> 0x00cf }
                r8.U = r1     // Catch:{ all -> 0x00cf }
                r8.W = r5     // Catch:{ all -> 0x00cf }
                java.lang.Object r9 = r1.b(r8)     // Catch:{ all -> 0x00cf }
                if (r9 != r0) goto L_0x0087
                return r0
            L_0x0087:
                r11 = r8
                r8 = r13
                r13 = r9
                r9 = r11
            L_0x008b:
                java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch:{ all -> 0x00cf }
                boolean r13 = r13.booleanValue()     // Catch:{ all -> 0x00cf }
                if (r13 == 0) goto L_0x00c9
                java.lang.Object r13 = r1.next()     // Catch:{ all -> 0x00cf }
                r9.X = r8     // Catch:{ all -> 0x00cf }
                r9.S = r7     // Catch:{ all -> 0x00cf }
                r9.T = r6     // Catch:{ all -> 0x00cf }
                r9.U = r1     // Catch:{ all -> 0x00cf }
                r9.V = r8     // Catch:{ all -> 0x00cf }
                r9.W = r4     // Catch:{ all -> 0x00cf }
                java.lang.Object r13 = r7.g0(r13, r9)     // Catch:{ all -> 0x00cf }
                if (r13 != r0) goto L_0x00aa
                return r0
            L_0x00aa:
                r10 = r9
                r9 = r8
                r8 = r7
                r7 = r6
                r6 = r1
                r1 = r9
            L_0x00b0:
                r10.X = r9     // Catch:{ all -> 0x004a }
                r10.S = r8     // Catch:{ all -> 0x004a }
                r10.T = r7     // Catch:{ all -> 0x004a }
                r10.U = r6     // Catch:{ all -> 0x004a }
                r10.V = r2     // Catch:{ all -> 0x004a }
                r10.W = r3     // Catch:{ all -> 0x004a }
                java.lang.Object r13 = r1.C(r13, r10)     // Catch:{ all -> 0x004a }
                if (r13 != r0) goto L_0x00c3
                return r0
            L_0x00c3:
                r1 = r6
                r6 = r7
                r7 = r8
                r13 = r9
                r8 = r10
                goto L_0x0076
            L_0x00c9:
                zd.u2 r13 = zd.u2.f25116a     // Catch:{ all -> 0x00cf }
                rf.s.b(r6, r2)
                return r13
            L_0x00cf:
                r13 = move-exception
            L_0x00d0:
                throw r13     // Catch:{ all -> 0x00d1 }
            L_0x00d1:
                r0 = move-exception
                rf.s.b(r6, r13)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: rf.v.x.K(java.lang.Object):java.lang.Object");
        }

        @fh.h
        /* renamed from: P */
        public final Object g0(@fh.g g0<? super R> g0Var, @fh.h ie.d<? super u2> dVar) {
            return ((x) H(g0Var, dVar)).K(u2.f25116a);
        }
    }

    @le.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 2, 2}, l = {344, 345, 345}, m = "invokeSuspend", n = {"$this$produce", "index", "$this$produce", "index", "$this$produce", "index"}, s = {"L$0", "I$0", "L$0", "I$0", "L$0", "I$0"})
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H@"}, d2 = {"E", "R", "Lrf/g0;", "Lzd/u2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class y extends le.o implements we.p<g0<? super R>, ie.d<? super u2>, Object> {
        public Object S;
        public Object T;
        public int U;
        public int V;
        public /* synthetic */ Object W;
        public final /* synthetic */ i0<E> X;
        public final /* synthetic */ we.q<Integer, E, ie.d<? super R>, Object> Y;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public y(i0<? extends E> i0Var, we.q<? super Integer, ? super E, ? super ie.d<? super R>, ? extends Object> qVar, ie.d<? super y> dVar) {
            super(2, dVar);
            this.X = i0Var;
            this.Y = qVar;
        }

        @fh.g
        public final ie.d<u2> H(@fh.h Object obj, @fh.g ie.d<?> dVar) {
            y yVar = new y(this.X, this.Y, dVar);
            yVar.W = obj;
            return yVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0068  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0074  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x00a8  */
        @fh.h
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object K(@fh.g java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = ke.d.h()
                int r1 = r11.V
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x004a
                if (r1 == r4) goto L_0x003b
                if (r1 == r3) goto L_0x0028
                if (r1 != r2) goto L_0x0020
                int r1 = r11.U
                java.lang.Object r5 = r11.S
                rf.p r5 = (rf.p) r5
                java.lang.Object r6 = r11.W
                rf.g0 r6 = (rf.g0) r6
                zd.e1.n(r12)
                r12 = r6
                goto L_0x0058
            L_0x0020:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L_0x0028:
                int r1 = r11.U
                java.lang.Object r5 = r11.T
                rf.g0 r5 = (rf.g0) r5
                java.lang.Object r6 = r11.S
                rf.p r6 = (rf.p) r6
                java.lang.Object r7 = r11.W
                rf.g0 r7 = (rf.g0) r7
                zd.e1.n(r12)
                r8 = r11
                goto L_0x0096
            L_0x003b:
                int r1 = r11.U
                java.lang.Object r5 = r11.S
                rf.p r5 = (rf.p) r5
                java.lang.Object r6 = r11.W
                rf.g0 r6 = (rf.g0) r6
                zd.e1.n(r12)
                r7 = r11
                goto L_0x006c
            L_0x004a:
                zd.e1.n(r12)
                java.lang.Object r12 = r11.W
                rf.g0 r12 = (rf.g0) r12
                r1 = 0
                rf.i0<E> r5 = r11.X
                rf.p r5 = r5.iterator()
            L_0x0058:
                r6 = r11
            L_0x0059:
                r6.W = r12
                r6.S = r5
                r6.U = r1
                r6.V = r4
                java.lang.Object r7 = r5.b(r6)
                if (r7 != r0) goto L_0x0068
                return r0
            L_0x0068:
                r10 = r6
                r6 = r12
                r12 = r7
                r7 = r10
            L_0x006c:
                java.lang.Boolean r12 = (java.lang.Boolean) r12
                boolean r12 = r12.booleanValue()
                if (r12 == 0) goto L_0x00ac
                java.lang.Object r12 = r5.next()
                we.q<java.lang.Integer, E, ie.d<? super R>, java.lang.Object> r8 = r7.Y
                int r9 = r1 + 1
                java.lang.Integer r1 = le.b.f(r1)
                r7.W = r6
                r7.S = r5
                r7.T = r6
                r7.U = r9
                r7.V = r3
                java.lang.Object r12 = r8.y(r1, r12, r7)
                if (r12 != r0) goto L_0x0091
                return r0
            L_0x0091:
                r8 = r7
                r1 = r9
                r7 = r6
                r6 = r5
                r5 = r7
            L_0x0096:
                r8.W = r7
                r8.S = r6
                r9 = 0
                r8.T = r9
                r8.U = r1
                r8.V = r2
                java.lang.Object r12 = r5.C(r12, r8)
                if (r12 != r0) goto L_0x00a8
                return r0
            L_0x00a8:
                r5 = r6
                r12 = r7
                r6 = r8
                goto L_0x0059
            L_0x00ac:
                zd.u2 r12 = zd.u2.f25116a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: rf.v.y.K(java.lang.Object):java.lang.Object");
        }

        @fh.h
        /* renamed from: P */
        public final Object g0(@fh.g g0<? super R> g0Var, @fh.h ie.d<? super u2> dVar) {
            return ((y) H(g0Var, dVar)).K(u2.f25116a);
        }
    }

    @le.f(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0, 1, 1, 1, 1}, l = {420, 422}, m = "maxWith", n = {"comparator", "$this$consume$iv", "iterator", "comparator", "$this$consume$iv", "iterator", "max"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3"})
    @zd.i0(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class z<E> extends le.d {
        public Object R;
        public Object S;
        public Object T;
        public Object U;
        public /* synthetic */ Object V;
        public int W;

        public z(ie.d<? super z> dVar) {
            super(dVar);
        }

        @fh.h
        public final Object K(@fh.g Object obj) {
            this.V = obj;
            this.W |= Integer.MIN_VALUE;
            return v.M((i0) null, (Comparator) null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0064 A[Catch:{ all -> 0x0037 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0070 A[Catch:{ all -> 0x0037 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008b A[Catch:{ all -> 0x0037 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @zd.k(level = zd.m.Q, message = "Binary compatibility")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ java.lang.Object A(rf.i0 r7, java.lang.Object r8, ie.d r9) {
        /*
            boolean r0 = r9 instanceof rf.v.t
            if (r0 == 0) goto L_0x0013
            r0 = r9
            rf.v$t r0 = (rf.v.t) r0
            int r1 = r0.W
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.W = r1
            goto L_0x0018
        L_0x0013:
            rf.v$t r0 = new rf.v$t
            r0.<init>(r9)
        L_0x0018:
            java.lang.Object r9 = r0.V
            java.lang.Object r1 = ke.d.h()
            int r2 = r0.W
            r3 = 1
            if (r2 == 0) goto L_0x0042
            if (r2 != r3) goto L_0x003a
            java.lang.Object r7 = r0.U
            rf.p r7 = (rf.p) r7
            java.lang.Object r8 = r0.T
            rf.i0 r8 = (rf.i0) r8
            java.lang.Object r2 = r0.S
            xe.k1$f r2 = (xe.k1.f) r2
            java.lang.Object r4 = r0.R
            zd.e1.n(r9)     // Catch:{ all -> 0x0037 }
            goto L_0x0067
        L_0x0037:
            r7 = move-exception
            goto L_0x009a
        L_0x003a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0042:
            zd.e1.n(r9)
            xe.k1$f r9 = new xe.k1$f
            r9.<init>()
            rf.p r2 = r7.iterator()     // Catch:{ all -> 0x0096 }
            r6 = r8
            r8 = r7
            r7 = r2
            r2 = r9
            r9 = r6
        L_0x0053:
            r0.R = r9     // Catch:{ all -> 0x0037 }
            r0.S = r2     // Catch:{ all -> 0x0037 }
            r0.T = r8     // Catch:{ all -> 0x0037 }
            r0.U = r7     // Catch:{ all -> 0x0037 }
            r0.W = r3     // Catch:{ all -> 0x0037 }
            java.lang.Object r4 = r7.b(r0)     // Catch:{ all -> 0x0037 }
            if (r4 != r1) goto L_0x0064
            return r1
        L_0x0064:
            r6 = r4
            r4 = r9
            r9 = r6
        L_0x0067:
            r5 = 0
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ all -> 0x0037 }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x0037 }
            if (r9 == 0) goto L_0x008b
            java.lang.Object r9 = r7.next()     // Catch:{ all -> 0x0037 }
            boolean r9 = xe.l0.g(r4, r9)     // Catch:{ all -> 0x0037 }
            if (r9 == 0) goto L_0x0084
            int r7 = r2.O     // Catch:{ all -> 0x0037 }
            java.lang.Integer r7 = le.b.f(r7)     // Catch:{ all -> 0x0037 }
            rf.s.b(r8, r5)
            return r7
        L_0x0084:
            int r9 = r2.O     // Catch:{ all -> 0x0037 }
            int r9 = r9 + r3
            r2.O = r9     // Catch:{ all -> 0x0037 }
            r9 = r4
            goto L_0x0053
        L_0x008b:
            zd.u2 r7 = zd.u2.f25116a     // Catch:{ all -> 0x0037 }
            rf.s.b(r8, r5)
            r7 = -1
            java.lang.Integer r7 = le.b.f(r7)
            return r7
        L_0x0096:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L_0x009a:
            throw r7     // Catch:{ all -> 0x009b }
        L_0x009b:
            r9 = move-exception
            rf.s.b(r8, r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: rf.v.A(rf.i0, java.lang.Object, ie.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0070 A[Catch:{ all -> 0x004e }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0093 A[Catch:{ all -> 0x0036 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x009d A[SYNTHETIC, Splitter:B:45:0x009d] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @zd.k(level = zd.m.Q, message = "Binary compatibility")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ java.lang.Object B(rf.i0 r7, ie.d r8) {
        /*
            boolean r0 = r8 instanceof rf.v.u
            if (r0 == 0) goto L_0x0013
            r0 = r8
            rf.v$u r0 = (rf.v.u) r0
            int r1 = r0.V
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.V = r1
            goto L_0x0018
        L_0x0013:
            rf.v$u r0 = new rf.v$u
            r0.<init>(r8)
        L_0x0018:
            java.lang.Object r8 = r0.U
            java.lang.Object r1 = ke.d.h()
            int r2 = r0.V
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0050
            if (r2 == r4) goto L_0x0042
            if (r2 != r3) goto L_0x003a
            java.lang.Object r7 = r0.T
            java.lang.Object r2 = r0.S
            rf.p r2 = (rf.p) r2
            java.lang.Object r4 = r0.R
            rf.i0 r4 = (rf.i0) r4
            zd.e1.n(r8)     // Catch:{ all -> 0x0036 }
            goto L_0x008a
        L_0x0036:
            r7 = move-exception
            r2 = r4
            goto L_0x00a8
        L_0x003a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0042:
            java.lang.Object r7 = r0.S
            rf.p r7 = (rf.p) r7
            java.lang.Object r2 = r0.R
            rf.i0 r2 = (rf.i0) r2
            zd.e1.n(r8)     // Catch:{ all -> 0x004e }
            goto L_0x0068
        L_0x004e:
            r7 = move-exception
            goto L_0x00a8
        L_0x0050:
            zd.e1.n(r8)
            rf.p r8 = r7.iterator()     // Catch:{ all -> 0x00a5 }
            r0.R = r7     // Catch:{ all -> 0x00a5 }
            r0.S = r8     // Catch:{ all -> 0x00a5 }
            r0.V = r4     // Catch:{ all -> 0x00a5 }
            java.lang.Object r2 = r8.b(r0)     // Catch:{ all -> 0x00a5 }
            if (r2 != r1) goto L_0x0064
            return r1
        L_0x0064:
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L_0x0068:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x004e }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x004e }
            if (r8 == 0) goto L_0x009d
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x004e }
            r6 = r2
            r2 = r7
            r7 = r6
        L_0x0077:
            r0.R = r7     // Catch:{ all -> 0x00a5 }
            r0.S = r2     // Catch:{ all -> 0x00a5 }
            r0.T = r8     // Catch:{ all -> 0x00a5 }
            r0.V = r3     // Catch:{ all -> 0x00a5 }
            java.lang.Object r4 = r2.b(r0)     // Catch:{ all -> 0x00a5 }
            if (r4 != r1) goto L_0x0086
            return r1
        L_0x0086:
            r6 = r4
            r4 = r7
            r7 = r8
            r8 = r6
        L_0x008a:
            r5 = 0
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x0036 }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x0036 }
            if (r8 == 0) goto L_0x0099
            java.lang.Object r8 = r2.next()     // Catch:{ all -> 0x0036 }
            r7 = r4
            goto L_0x0077
        L_0x0099:
            rf.s.b(r4, r5)
            return r7
        L_0x009d:
            java.util.NoSuchElementException r7 = new java.util.NoSuchElementException     // Catch:{ all -> 0x004e }
            java.lang.String r8 = "ReceiveChannel is empty."
            r7.<init>(r8)     // Catch:{ all -> 0x004e }
            throw r7     // Catch:{ all -> 0x004e }
        L_0x00a5:
            r8 = move-exception
            r2 = r7
            r7 = r8
        L_0x00a8:
            throw r7     // Catch:{ all -> 0x00a9 }
        L_0x00a9:
            r8 = move-exception
            rf.s.b(r2, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: rf.v.B(rf.i0, ie.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0072 A[Catch:{ all -> 0x003b }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007e A[Catch:{ all -> 0x003b }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0093 A[Catch:{ all -> 0x003b }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @zd.k(level = zd.m.Q, message = "Binary compatibility")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ java.lang.Object C(rf.i0 r8, java.lang.Object r9, ie.d r10) {
        /*
            boolean r0 = r10 instanceof rf.v.C0411v
            if (r0 == 0) goto L_0x0013
            r0 = r10
            rf.v$v r0 = (rf.v.C0411v) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.X = r1
            goto L_0x0018
        L_0x0013:
            rf.v$v r0 = new rf.v$v
            r0.<init>(r10)
        L_0x0018:
            java.lang.Object r10 = r0.W
            java.lang.Object r1 = ke.d.h()
            int r2 = r0.X
            r3 = 1
            if (r2 == 0) goto L_0x0046
            if (r2 != r3) goto L_0x003e
            java.lang.Object r8 = r0.V
            rf.p r8 = (rf.p) r8
            java.lang.Object r9 = r0.U
            rf.i0 r9 = (rf.i0) r9
            java.lang.Object r2 = r0.T
            xe.k1$f r2 = (xe.k1.f) r2
            java.lang.Object r4 = r0.S
            xe.k1$f r4 = (xe.k1.f) r4
            java.lang.Object r5 = r0.R
            zd.e1.n(r10)     // Catch:{ all -> 0x003b }
            goto L_0x0075
        L_0x003b:
            r8 = move-exception
            goto L_0x00a3
        L_0x003e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0046:
            zd.e1.n(r10)
            xe.k1$f r10 = new xe.k1$f
            r10.<init>()
            r2 = -1
            r10.O = r2
            xe.k1$f r2 = new xe.k1$f
            r2.<init>()
            rf.p r4 = r8.iterator()     // Catch:{ all -> 0x009f }
            r7 = r9
            r9 = r8
            r8 = r4
            r4 = r10
            r10 = r7
        L_0x005f:
            r0.R = r10     // Catch:{ all -> 0x003b }
            r0.S = r4     // Catch:{ all -> 0x003b }
            r0.T = r2     // Catch:{ all -> 0x003b }
            r0.U = r9     // Catch:{ all -> 0x003b }
            r0.V = r8     // Catch:{ all -> 0x003b }
            r0.X = r3     // Catch:{ all -> 0x003b }
            java.lang.Object r5 = r8.b(r0)     // Catch:{ all -> 0x003b }
            if (r5 != r1) goto L_0x0072
            return r1
        L_0x0072:
            r7 = r5
            r5 = r10
            r10 = r7
        L_0x0075:
            r6 = 0
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x003b }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x003b }
            if (r10 == 0) goto L_0x0093
            java.lang.Object r10 = r8.next()     // Catch:{ all -> 0x003b }
            boolean r10 = xe.l0.g(r5, r10)     // Catch:{ all -> 0x003b }
            if (r10 == 0) goto L_0x008c
            int r10 = r2.O     // Catch:{ all -> 0x003b }
            r4.O = r10     // Catch:{ all -> 0x003b }
        L_0x008c:
            int r10 = r2.O     // Catch:{ all -> 0x003b }
            int r10 = r10 + r3
            r2.O = r10     // Catch:{ all -> 0x003b }
            r10 = r5
            goto L_0x005f
        L_0x0093:
            zd.u2 r8 = zd.u2.f25116a     // Catch:{ all -> 0x003b }
            rf.s.b(r9, r6)
            int r8 = r4.O
            java.lang.Integer r8 = le.b.f(r8)
            return r8
        L_0x009f:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
        L_0x00a3:
            throw r8     // Catch:{ all -> 0x00a4 }
        L_0x00a4:
            r10 = move-exception
            rf.s.b(r9, r8)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: rf.v.C(rf.i0, java.lang.Object, ie.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0075 A[SYNTHETIC, Splitter:B:32:0x0075] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0097 A[Catch:{ all -> 0x0037 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @zd.k(level = zd.m.Q, message = "Binary compatibility")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ java.lang.Object D(rf.i0 r7, ie.d r8) {
        /*
            boolean r0 = r8 instanceof rf.v.w
            if (r0 == 0) goto L_0x0013
            r0 = r8
            rf.v$w r0 = (rf.v.w) r0
            int r1 = r0.V
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.V = r1
            goto L_0x0018
        L_0x0013:
            rf.v$w r0 = new rf.v$w
            r0.<init>(r8)
        L_0x0018:
            java.lang.Object r8 = r0.U
            java.lang.Object r1 = ke.d.h()
            int r2 = r0.V
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0051
            if (r2 == r4) goto L_0x0043
            if (r2 != r3) goto L_0x003b
            java.lang.Object r7 = r0.T
            java.lang.Object r2 = r0.S
            rf.p r2 = (rf.p) r2
            java.lang.Object r4 = r0.R
            rf.i0 r4 = (rf.i0) r4
            zd.e1.n(r8)     // Catch:{ all -> 0x0037 }
            goto L_0x008f
        L_0x0037:
            r7 = move-exception
            r2 = r4
            goto L_0x00a4
        L_0x003b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0043:
            java.lang.Object r7 = r0.S
            rf.p r7 = (rf.p) r7
            java.lang.Object r2 = r0.R
            rf.i0 r2 = (rf.i0) r2
            zd.e1.n(r8)     // Catch:{ all -> 0x004f }
            goto L_0x0069
        L_0x004f:
            r7 = move-exception
            goto L_0x00a4
        L_0x0051:
            zd.e1.n(r8)
            rf.p r8 = r7.iterator()     // Catch:{ all -> 0x00a1 }
            r0.R = r7     // Catch:{ all -> 0x00a1 }
            r0.S = r8     // Catch:{ all -> 0x00a1 }
            r0.V = r4     // Catch:{ all -> 0x00a1 }
            java.lang.Object r2 = r8.b(r0)     // Catch:{ all -> 0x00a1 }
            if (r2 != r1) goto L_0x0065
            return r1
        L_0x0065:
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L_0x0069:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x004f }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x004f }
            if (r8 != 0) goto L_0x0075
            rf.s.b(r2, r5)
            return r5
        L_0x0075:
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x004f }
            r6 = r2
            r2 = r7
            r7 = r6
        L_0x007c:
            r0.R = r7     // Catch:{ all -> 0x00a1 }
            r0.S = r2     // Catch:{ all -> 0x00a1 }
            r0.T = r8     // Catch:{ all -> 0x00a1 }
            r0.V = r3     // Catch:{ all -> 0x00a1 }
            java.lang.Object r4 = r2.b(r0)     // Catch:{ all -> 0x00a1 }
            if (r4 != r1) goto L_0x008b
            return r1
        L_0x008b:
            r6 = r4
            r4 = r7
            r7 = r8
            r8 = r6
        L_0x008f:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x0037 }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x0037 }
            if (r8 == 0) goto L_0x009d
            java.lang.Object r8 = r2.next()     // Catch:{ all -> 0x0037 }
            r7 = r4
            goto L_0x007c
        L_0x009d:
            rf.s.b(r4, r5)
            return r7
        L_0x00a1:
            r8 = move-exception
            r2 = r7
            r7 = r8
        L_0x00a4:
            throw r7     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            r8 = move-exception
            rf.s.b(r2, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: rf.v.D(rf.i0, ie.d):java.lang.Object");
    }

    @fh.g
    @a1
    public static final <E, R> i0<R> E(@fh.g i0<? extends E> i0Var, @fh.g ie.g gVar, @fh.g we.p<? super E, ? super ie.d<? super R>, ? extends Object> pVar) {
        return e0.f(e2.O, gVar, 0, (w0) null, s.g(i0Var), new x(i0Var, pVar, (ie.d<? super x>) null), 6, (Object) null);
    }

    public static /* synthetic */ i0 F(i0 i0Var, ie.g gVar, we.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = m1.g();
        }
        return s.J(i0Var, gVar, pVar);
    }

    @fh.g
    @a1
    public static final <E, R> i0<R> G(@fh.g i0<? extends E> i0Var, @fh.g ie.g gVar, @fh.g we.q<? super Integer, ? super E, ? super ie.d<? super R>, ? extends Object> qVar) {
        return e0.f(e2.O, gVar, 0, (w0) null, s.g(i0Var), new y(i0Var, qVar, (ie.d<? super y>) null), 6, (Object) null);
    }

    public static /* synthetic */ i0 H(i0 i0Var, ie.g gVar, we.q qVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = m1.g();
        }
        return s.L(i0Var, gVar, qVar);
    }

    public static /* synthetic */ i0 J(i0 i0Var, ie.g gVar, we.q qVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = m1.g();
        }
        return s.y(s.L(i0Var, gVar, qVar));
    }

    public static /* synthetic */ i0 L(i0 i0Var, ie.g gVar, we.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = m1.g();
        }
        return s.y(s.J(i0Var, gVar, pVar));
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0087 A[SYNTHETIC, Splitter:B:34:0x0087] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a0 A[Catch:{ all -> 0x00bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ac A[Catch:{ all -> 0x00bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @zd.k(level = zd.m.Q, message = "Binary compatibility")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ java.lang.Object M(rf.i0 r8, java.util.Comparator r9, ie.d r10) {
        /*
            boolean r0 = r10 instanceof rf.v.z
            if (r0 == 0) goto L_0x0013
            r0 = r10
            rf.v$z r0 = (rf.v.z) r0
            int r1 = r0.W
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.W = r1
            goto L_0x0018
        L_0x0013:
            rf.v$z r0 = new rf.v$z
            r0.<init>(r10)
        L_0x0018:
            java.lang.Object r10 = r0.V
            java.lang.Object r1 = ke.d.h()
            int r2 = r0.W
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0060
            if (r2 == r4) goto L_0x004d
            if (r2 != r3) goto L_0x0045
            java.lang.Object r8 = r0.U
            java.lang.Object r9 = r0.T
            rf.p r9 = (rf.p) r9
            java.lang.Object r2 = r0.S
            rf.i0 r2 = (rf.i0) r2
            java.lang.Object r4 = r0.R
            java.util.Comparator r4 = (java.util.Comparator) r4
            zd.e1.n(r10)     // Catch:{ all -> 0x0041 }
            r7 = r0
            r0 = r8
            r8 = r2
        L_0x003d:
            r2 = r1
            r1 = r7
            goto L_0x00a4
        L_0x0041:
            r8 = move-exception
            r9 = r2
            goto L_0x00c3
        L_0x0045:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x004d:
            java.lang.Object r8 = r0.T
            rf.p r8 = (rf.p) r8
            java.lang.Object r9 = r0.S
            rf.i0 r9 = (rf.i0) r9
            java.lang.Object r2 = r0.R
            java.util.Comparator r2 = (java.util.Comparator) r2
            zd.e1.n(r10)     // Catch:{ all -> 0x005d }
            goto L_0x007b
        L_0x005d:
            r8 = move-exception
            goto L_0x00c3
        L_0x0060:
            zd.e1.n(r10)
            rf.p r10 = r8.iterator()     // Catch:{ all -> 0x00bf }
            r0.R = r9     // Catch:{ all -> 0x00bf }
            r0.S = r8     // Catch:{ all -> 0x00bf }
            r0.T = r10     // Catch:{ all -> 0x00bf }
            r0.W = r4     // Catch:{ all -> 0x00bf }
            java.lang.Object r2 = r10.b(r0)     // Catch:{ all -> 0x00bf }
            if (r2 != r1) goto L_0x0076
            return r1
        L_0x0076:
            r7 = r9
            r9 = r8
            r8 = r10
            r10 = r2
            r2 = r7
        L_0x007b:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x005d }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x005d }
            if (r10 != 0) goto L_0x0087
            rf.s.b(r9, r5)
            return r5
        L_0x0087:
            java.lang.Object r10 = r8.next()     // Catch:{ all -> 0x005d }
            r4 = r2
            r7 = r9
            r9 = r8
            r8 = r7
        L_0x008f:
            r0.R = r4     // Catch:{ all -> 0x00bf }
            r0.S = r8     // Catch:{ all -> 0x00bf }
            r0.T = r9     // Catch:{ all -> 0x00bf }
            r0.U = r10     // Catch:{ all -> 0x00bf }
            r0.W = r3     // Catch:{ all -> 0x00bf }
            java.lang.Object r2 = r9.b(r0)     // Catch:{ all -> 0x00bf }
            if (r2 != r1) goto L_0x00a0
            return r1
        L_0x00a0:
            r7 = r0
            r0 = r10
            r10 = r2
            goto L_0x003d
        L_0x00a4:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x00bf }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x00bf }
            if (r10 == 0) goto L_0x00bb
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x00bf }
            int r6 = r4.compare(r0, r10)     // Catch:{ all -> 0x00bf }
            if (r6 >= 0) goto L_0x00b7
            goto L_0x00b8
        L_0x00b7:
            r10 = r0
        L_0x00b8:
            r0 = r1
            r1 = r2
            goto L_0x008f
        L_0x00bb:
            rf.s.b(r8, r5)
            return r0
        L_0x00bf:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
        L_0x00c3:
            throw r8     // Catch:{ all -> 0x00c4 }
        L_0x00c4:
            r10 = move-exception
            rf.s.b(r9, r8)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: rf.v.M(rf.i0, java.util.Comparator, ie.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0087 A[SYNTHETIC, Splitter:B:34:0x0087] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a0 A[Catch:{ all -> 0x00bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ac A[Catch:{ all -> 0x00bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @zd.k(level = zd.m.Q, message = "Binary compatibility")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ java.lang.Object N(rf.i0 r8, java.util.Comparator r9, ie.d r10) {
        /*
            boolean r0 = r10 instanceof rf.v.a0
            if (r0 == 0) goto L_0x0013
            r0 = r10
            rf.v$a0 r0 = (rf.v.a0) r0
            int r1 = r0.W
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.W = r1
            goto L_0x0018
        L_0x0013:
            rf.v$a0 r0 = new rf.v$a0
            r0.<init>(r10)
        L_0x0018:
            java.lang.Object r10 = r0.V
            java.lang.Object r1 = ke.d.h()
            int r2 = r0.W
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0060
            if (r2 == r4) goto L_0x004d
            if (r2 != r3) goto L_0x0045
            java.lang.Object r8 = r0.U
            java.lang.Object r9 = r0.T
            rf.p r9 = (rf.p) r9
            java.lang.Object r2 = r0.S
            rf.i0 r2 = (rf.i0) r2
            java.lang.Object r4 = r0.R
            java.util.Comparator r4 = (java.util.Comparator) r4
            zd.e1.n(r10)     // Catch:{ all -> 0x0041 }
            r7 = r0
            r0 = r8
            r8 = r2
        L_0x003d:
            r2 = r1
            r1 = r7
            goto L_0x00a4
        L_0x0041:
            r8 = move-exception
            r9 = r2
            goto L_0x00c3
        L_0x0045:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x004d:
            java.lang.Object r8 = r0.T
            rf.p r8 = (rf.p) r8
            java.lang.Object r9 = r0.S
            rf.i0 r9 = (rf.i0) r9
            java.lang.Object r2 = r0.R
            java.util.Comparator r2 = (java.util.Comparator) r2
            zd.e1.n(r10)     // Catch:{ all -> 0x005d }
            goto L_0x007b
        L_0x005d:
            r8 = move-exception
            goto L_0x00c3
        L_0x0060:
            zd.e1.n(r10)
            rf.p r10 = r8.iterator()     // Catch:{ all -> 0x00bf }
            r0.R = r9     // Catch:{ all -> 0x00bf }
            r0.S = r8     // Catch:{ all -> 0x00bf }
            r0.T = r10     // Catch:{ all -> 0x00bf }
            r0.W = r4     // Catch:{ all -> 0x00bf }
            java.lang.Object r2 = r10.b(r0)     // Catch:{ all -> 0x00bf }
            if (r2 != r1) goto L_0x0076
            return r1
        L_0x0076:
            r7 = r9
            r9 = r8
            r8 = r10
            r10 = r2
            r2 = r7
        L_0x007b:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x005d }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x005d }
            if (r10 != 0) goto L_0x0087
            rf.s.b(r9, r5)
            return r5
        L_0x0087:
            java.lang.Object r10 = r8.next()     // Catch:{ all -> 0x005d }
            r4 = r2
            r7 = r9
            r9 = r8
            r8 = r7
        L_0x008f:
            r0.R = r4     // Catch:{ all -> 0x00bf }
            r0.S = r8     // Catch:{ all -> 0x00bf }
            r0.T = r9     // Catch:{ all -> 0x00bf }
            r0.U = r10     // Catch:{ all -> 0x00bf }
            r0.W = r3     // Catch:{ all -> 0x00bf }
            java.lang.Object r2 = r9.b(r0)     // Catch:{ all -> 0x00bf }
            if (r2 != r1) goto L_0x00a0
            return r1
        L_0x00a0:
            r7 = r0
            r0 = r10
            r10 = r2
            goto L_0x003d
        L_0x00a4:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x00bf }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x00bf }
            if (r10 == 0) goto L_0x00bb
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x00bf }
            int r6 = r4.compare(r0, r10)     // Catch:{ all -> 0x00bf }
            if (r6 <= 0) goto L_0x00b7
            goto L_0x00b8
        L_0x00b7:
            r10 = r0
        L_0x00b8:
            r0 = r1
            r1 = r2
            goto L_0x008f
        L_0x00bb:
            rf.s.b(r8, r5)
            return r0
        L_0x00bf:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
        L_0x00c3:
            throw r8     // Catch:{ all -> 0x00c4 }
        L_0x00c4:
            r10 = move-exception
            rf.s.b(r9, r8)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: rf.v.N(rf.i0, java.util.Comparator, ie.d):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005d, code lost:
        rf.s.b(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0060, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0050 A[Catch:{ all -> 0x005c }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0051 A[Catch:{ all -> 0x005c }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @zd.k(level = zd.m.Q, message = "Binary compatibility")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ java.lang.Object O(rf.i0 r4, ie.d r5) {
        /*
            boolean r0 = r5 instanceof rf.v.b0
            if (r0 == 0) goto L_0x0013
            r0 = r5
            rf.v$b0 r0 = (rf.v.b0) r0
            int r1 = r0.T
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.T = r1
            goto L_0x0018
        L_0x0013:
            rf.v$b0 r0 = new rf.v$b0
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.S
            java.lang.Object r1 = ke.d.h()
            int r2 = r0.T
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r4 = r0.R
            rf.i0 r4 = (rf.i0) r4
            zd.e1.n(r5)     // Catch:{ all -> 0x005a }
            goto L_0x0047
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            zd.e1.n(r5)
            rf.p r5 = r4.iterator()     // Catch:{ all -> 0x005a }
            r0.R = r4     // Catch:{ all -> 0x005a }
            r0.T = r3     // Catch:{ all -> 0x005a }
            java.lang.Object r5 = r5.b(r0)     // Catch:{ all -> 0x005a }
            if (r5 != r1) goto L_0x0047
            return r1
        L_0x0047:
            r0 = 0
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x005a }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x005a }
            if (r5 != 0) goto L_0x0051
            goto L_0x0052
        L_0x0051:
            r3 = 0
        L_0x0052:
            java.lang.Boolean r5 = le.b.a(r3)     // Catch:{ all -> 0x005a }
            rf.s.b(r4, r0)
            return r5
        L_0x005a:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x005c }
        L_0x005c:
            r0 = move-exception
            rf.s.b(r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rf.v.O(rf.i0, ie.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006c A[Catch:{ all -> 0x004a }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008e A[SYNTHETIC, Splitter:B:40:0x008e] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0096 A[SYNTHETIC, Splitter:B:43:0x0096] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @zd.k(level = zd.m.Q, message = "Binary compatibility")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ java.lang.Object Q(rf.i0 r6, ie.d r7) {
        /*
            boolean r0 = r7 instanceof rf.v.d0
            if (r0 == 0) goto L_0x0013
            r0 = r7
            rf.v$d0 r0 = (rf.v.d0) r0
            int r1 = r0.U
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.U = r1
            goto L_0x0018
        L_0x0013:
            rf.v$d0 r0 = new rf.v$d0
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.T
            java.lang.Object r1 = ke.d.h()
            int r2 = r0.U
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x004c
            if (r2 == r4) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            java.lang.Object r6 = r0.S
            java.lang.Object r0 = r0.R
            rf.i0 r0 = (rf.i0) r0
            zd.e1.n(r7)     // Catch:{ all -> 0x0032 }
            goto L_0x0081
        L_0x0032:
            r6 = move-exception
            r2 = r0
            goto L_0x00a1
        L_0x0036:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003e:
            java.lang.Object r6 = r0.S
            rf.p r6 = (rf.p) r6
            java.lang.Object r2 = r0.R
            rf.i0 r2 = (rf.i0) r2
            zd.e1.n(r7)     // Catch:{ all -> 0x004a }
            goto L_0x0064
        L_0x004a:
            r6 = move-exception
            goto L_0x00a1
        L_0x004c:
            zd.e1.n(r7)
            rf.p r7 = r6.iterator()     // Catch:{ all -> 0x009e }
            r0.R = r6     // Catch:{ all -> 0x009e }
            r0.S = r7     // Catch:{ all -> 0x009e }
            r0.U = r4     // Catch:{ all -> 0x009e }
            java.lang.Object r2 = r7.b(r0)     // Catch:{ all -> 0x009e }
            if (r2 != r1) goto L_0x0060
            return r1
        L_0x0060:
            r5 = r2
            r2 = r6
            r6 = r7
            r7 = r5
        L_0x0064:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x004a }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x004a }
            if (r7 == 0) goto L_0x0096
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x004a }
            r0.R = r2     // Catch:{ all -> 0x004a }
            r0.S = r7     // Catch:{ all -> 0x004a }
            r0.U = r3     // Catch:{ all -> 0x004a }
            java.lang.Object r6 = r6.b(r0)     // Catch:{ all -> 0x004a }
            if (r6 != r1) goto L_0x007d
            return r1
        L_0x007d:
            r0 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L_0x0081:
            r1 = 0
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x0032 }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x0032 }
            if (r7 != 0) goto L_0x008e
            rf.s.b(r0, r1)
            return r6
        L_0x008e:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0032 }
            java.lang.String r7 = "ReceiveChannel has more than one element."
            r6.<init>(r7)     // Catch:{ all -> 0x0032 }
            throw r6     // Catch:{ all -> 0x0032 }
        L_0x0096:
            java.util.NoSuchElementException r6 = new java.util.NoSuchElementException     // Catch:{ all -> 0x004a }
            java.lang.String r7 = "ReceiveChannel is empty."
            r6.<init>(r7)     // Catch:{ all -> 0x004a }
            throw r6     // Catch:{ all -> 0x004a }
        L_0x009e:
            r7 = move-exception
            r2 = r6
            r6 = r7
        L_0x00a1:
            throw r6     // Catch:{ all -> 0x00a2 }
        L_0x00a2:
            r7 = move-exception
            rf.s.b(r2, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: rf.v.Q(rf.i0, ie.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0070 A[SYNTHETIC, Splitter:B:32:0x0070] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0090 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0091 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    @zd.k(level = zd.m.Q, message = "Binary compatibility")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ java.lang.Object R(rf.i0 r7, ie.d r8) {
        /*
            boolean r0 = r8 instanceof rf.v.e0
            if (r0 == 0) goto L_0x0013
            r0 = r8
            rf.v$e0 r0 = (rf.v.e0) r0
            int r1 = r0.U
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.U = r1
            goto L_0x0018
        L_0x0013:
            rf.v$e0 r0 = new rf.v$e0
            r0.<init>(r8)
        L_0x0018:
            java.lang.Object r8 = r0.T
            java.lang.Object r1 = ke.d.h()
            int r2 = r0.U
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x004c
            if (r2 == r4) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            java.lang.Object r7 = r0.S
            java.lang.Object r0 = r0.R
            rf.i0 r0 = (rf.i0) r0
            zd.e1.n(r8)     // Catch:{ all -> 0x0033 }
            goto L_0x0085
        L_0x0033:
            r7 = move-exception
            r2 = r0
            goto L_0x0095
        L_0x0036:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003e:
            java.lang.Object r7 = r0.S
            rf.p r7 = (rf.p) r7
            java.lang.Object r2 = r0.R
            rf.i0 r2 = (rf.i0) r2
            zd.e1.n(r8)     // Catch:{ all -> 0x004a }
            goto L_0x0064
        L_0x004a:
            r7 = move-exception
            goto L_0x0095
        L_0x004c:
            zd.e1.n(r8)
            rf.p r8 = r7.iterator()     // Catch:{ all -> 0x0092 }
            r0.R = r7     // Catch:{ all -> 0x0092 }
            r0.S = r8     // Catch:{ all -> 0x0092 }
            r0.U = r4     // Catch:{ all -> 0x0092 }
            java.lang.Object r2 = r8.b(r0)     // Catch:{ all -> 0x0092 }
            if (r2 != r1) goto L_0x0060
            return r1
        L_0x0060:
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L_0x0064:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x004a }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x004a }
            if (r8 != 0) goto L_0x0070
            rf.s.b(r2, r5)
            return r5
        L_0x0070:
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x004a }
            r0.R = r2     // Catch:{ all -> 0x004a }
            r0.S = r8     // Catch:{ all -> 0x004a }
            r0.U = r3     // Catch:{ all -> 0x004a }
            java.lang.Object r7 = r7.b(r0)     // Catch:{ all -> 0x004a }
            if (r7 != r1) goto L_0x0081
            return r1
        L_0x0081:
            r0 = r2
            r6 = r8
            r8 = r7
            r7 = r6
        L_0x0085:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x0033 }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x0033 }
            rf.s.b(r0, r5)
            if (r8 == 0) goto L_0x0091
            return r5
        L_0x0091:
            return r7
        L_0x0092:
            r8 = move-exception
            r2 = r7
            r7 = r8
        L_0x0095:
            throw r7     // Catch:{ all -> 0x0096 }
        L_0x0096:
            r8 = move-exception
            rf.s.b(r2, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: rf.v.R(rf.i0, ie.d):java.lang.Object");
    }

    public static /* synthetic */ i0 T(i0 i0Var, int i10, ie.g gVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            gVar = m1.g();
        }
        return e0.f(e2.O, gVar, 0, (w0) null, s.g(i0Var), new f0(i10, i0Var, (ie.d<? super f0>) null), 6, (Object) null);
    }

    public static /* synthetic */ i0 V(i0 i0Var, ie.g gVar, we.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = m1.g();
        }
        return e0.f(e2.O, gVar, 0, (w0) null, s.g(i0Var), new g0(i0Var, pVar, (ie.d<? super g0>) null), 6, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0079 A[Catch:{ all -> 0x0053 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @zd.a1
    @fh.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, C extends rf.m0<? super E>> java.lang.Object W(@fh.g rf.i0<? extends E> r7, @fh.g C r8, @fh.g ie.d<? super C> r9) {
        /*
            boolean r0 = r9 instanceof rf.v.h0
            if (r0 == 0) goto L_0x0013
            r0 = r9
            rf.v$h0 r0 = (rf.v.h0) r0
            int r1 = r0.V
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.V = r1
            goto L_0x0018
        L_0x0013:
            rf.v$h0 r0 = new rf.v$h0
            r0.<init>(r9)
        L_0x0018:
            java.lang.Object r9 = r0.U
            java.lang.Object r1 = ke.d.h()
            int r2 = r0.V
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0055
            if (r2 == r4) goto L_0x0043
            if (r2 != r3) goto L_0x003b
            java.lang.Object r7 = r0.T
            rf.p r7 = (rf.p) r7
            java.lang.Object r8 = r0.S
            rf.i0 r8 = (rf.i0) r8
            java.lang.Object r2 = r0.R
            rf.m0 r2 = (rf.m0) r2
            zd.e1.n(r9)     // Catch:{ all -> 0x0053 }
        L_0x0037:
            r9 = r7
            r7 = r8
            r8 = r2
            goto L_0x005c
        L_0x003b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0043:
            java.lang.Object r7 = r0.T
            rf.p r7 = (rf.p) r7
            java.lang.Object r8 = r0.S
            rf.i0 r8 = (rf.i0) r8
            java.lang.Object r2 = r0.R
            rf.m0 r2 = (rf.m0) r2
            zd.e1.n(r9)     // Catch:{ all -> 0x0053 }
            goto L_0x0070
        L_0x0053:
            r7 = move-exception
            goto L_0x0096
        L_0x0055:
            zd.e1.n(r9)
            rf.p r9 = r7.iterator()     // Catch:{ all -> 0x0092 }
        L_0x005c:
            r0.R = r8     // Catch:{ all -> 0x0092 }
            r0.S = r7     // Catch:{ all -> 0x0092 }
            r0.T = r9     // Catch:{ all -> 0x0092 }
            r0.V = r4     // Catch:{ all -> 0x0092 }
            java.lang.Object r2 = r9.b(r0)     // Catch:{ all -> 0x0092 }
            if (r2 != r1) goto L_0x006b
            return r1
        L_0x006b:
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r2
            r2 = r6
        L_0x0070:
            r5 = 0
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ all -> 0x0053 }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x0053 }
            if (r9 == 0) goto L_0x008c
            java.lang.Object r9 = r7.next()     // Catch:{ all -> 0x0053 }
            r0.R = r2     // Catch:{ all -> 0x0053 }
            r0.S = r8     // Catch:{ all -> 0x0053 }
            r0.T = r7     // Catch:{ all -> 0x0053 }
            r0.V = r3     // Catch:{ all -> 0x0053 }
            java.lang.Object r9 = r2.C(r9, r0)     // Catch:{ all -> 0x0053 }
            if (r9 != r1) goto L_0x0037
            return r1
        L_0x008c:
            zd.u2 r7 = zd.u2.f25116a     // Catch:{ all -> 0x0053 }
            rf.s.b(r8, r5)
            return r2
        L_0x0092:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L_0x0096:
            throw r7     // Catch:{ all -> 0x0097 }
        L_0x0097:
            r9 = move-exception
            rf.s.b(r8, r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: rf.v.W(rf.i0, rf.m0, ie.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0059 A[Catch:{ all -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065 A[Catch:{ all -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @zd.a1
    @fh.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <E, C extends java.util.Collection<? super E>> java.lang.Object X(@fh.g rf.i0<? extends E> r6, @fh.g C r7, @fh.g ie.d<? super C> r8) {
        /*
            boolean r0 = r8 instanceof rf.v.i0
            if (r0 == 0) goto L_0x0013
            r0 = r8
            rf.v$i0 r0 = (rf.v.i0) r0
            int r1 = r0.V
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.V = r1
            goto L_0x0018
        L_0x0013:
            rf.v$i0 r0 = new rf.v$i0
            r0.<init>(r8)
        L_0x0018:
            java.lang.Object r8 = r0.U
            java.lang.Object r1 = ke.d.h()
            int r2 = r0.V
            r3 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r6 = r0.T
            rf.p r6 = (rf.p) r6
            java.lang.Object r7 = r0.S
            rf.i0 r7 = (rf.i0) r7
            java.lang.Object r2 = r0.R
            java.util.Collection r2 = (java.util.Collection) r2
            zd.e1.n(r8)     // Catch:{ all -> 0x0035 }
            goto L_0x005c
        L_0x0035:
            r6 = move-exception
            goto L_0x0078
        L_0x0037:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003f:
            zd.e1.n(r8)
            rf.p r8 = r6.iterator()     // Catch:{ all -> 0x0074 }
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L_0x004a:
            r0.R = r8     // Catch:{ all -> 0x0035 }
            r0.S = r7     // Catch:{ all -> 0x0035 }
            r0.T = r6     // Catch:{ all -> 0x0035 }
            r0.V = r3     // Catch:{ all -> 0x0035 }
            java.lang.Object r2 = r6.b(r0)     // Catch:{ all -> 0x0035 }
            if (r2 != r1) goto L_0x0059
            return r1
        L_0x0059:
            r5 = r2
            r2 = r8
            r8 = r5
        L_0x005c:
            r4 = 0
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x0035 }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x0035 }
            if (r8 == 0) goto L_0x006e
            java.lang.Object r8 = r6.next()     // Catch:{ all -> 0x0035 }
            r2.add(r8)     // Catch:{ all -> 0x0035 }
            r8 = r2
            goto L_0x004a
        L_0x006e:
            zd.u2 r6 = zd.u2.f25116a     // Catch:{ all -> 0x0035 }
            rf.s.b(r7, r4)
            return r2
        L_0x0074:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L_0x0078:
            throw r6     // Catch:{ all -> 0x0079 }
        L_0x0079:
            r8 = move-exception
            rf.s.b(r7, r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: rf.v.X(rf.i0, java.util.Collection, ie.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0059 A[Catch:{ all -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065 A[Catch:{ all -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @zd.a1
    @fh.h
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <K, V, M extends java.util.Map<? super K, ? super V>> java.lang.Object Z(@fh.g rf.i0<? extends zd.u0<? extends K, ? extends V>> r6, @fh.g M r7, @fh.g ie.d<? super M> r8) {
        /*
            boolean r0 = r8 instanceof rf.v.j0
            if (r0 == 0) goto L_0x0013
            r0 = r8
            rf.v$j0 r0 = (rf.v.j0) r0
            int r1 = r0.V
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.V = r1
            goto L_0x0018
        L_0x0013:
            rf.v$j0 r0 = new rf.v$j0
            r0.<init>(r8)
        L_0x0018:
            java.lang.Object r8 = r0.U
            java.lang.Object r1 = ke.d.h()
            int r2 = r0.V
            r3 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r6 = r0.T
            rf.p r6 = (rf.p) r6
            java.lang.Object r7 = r0.S
            rf.i0 r7 = (rf.i0) r7
            java.lang.Object r2 = r0.R
            java.util.Map r2 = (java.util.Map) r2
            zd.e1.n(r8)     // Catch:{ all -> 0x0035 }
            goto L_0x005c
        L_0x0035:
            r6 = move-exception
            goto L_0x0082
        L_0x0037:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003f:
            zd.e1.n(r8)
            rf.p r8 = r6.iterator()     // Catch:{ all -> 0x007e }
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L_0x004a:
            r0.R = r8     // Catch:{ all -> 0x0035 }
            r0.S = r7     // Catch:{ all -> 0x0035 }
            r0.T = r6     // Catch:{ all -> 0x0035 }
            r0.V = r3     // Catch:{ all -> 0x0035 }
            java.lang.Object r2 = r6.b(r0)     // Catch:{ all -> 0x0035 }
            if (r2 != r1) goto L_0x0059
            return r1
        L_0x0059:
            r5 = r2
            r2 = r8
            r8 = r5
        L_0x005c:
            r4 = 0
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x0035 }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x0035 }
            if (r8 == 0) goto L_0x0078
            java.lang.Object r8 = r6.next()     // Catch:{ all -> 0x0035 }
            zd.u0 r8 = (zd.u0) r8     // Catch:{ all -> 0x0035 }
            java.lang.Object r4 = r8.e()     // Catch:{ all -> 0x0035 }
            java.lang.Object r8 = r8.f()     // Catch:{ all -> 0x0035 }
            r2.put(r4, r8)     // Catch:{ all -> 0x0035 }
            r8 = r2
            goto L_0x004a
        L_0x0078:
            zd.u2 r6 = zd.u2.f25116a     // Catch:{ all -> 0x0035 }
            rf.s.b(r7, r4)
            return r2
        L_0x007e:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L_0x0082:
            throw r6     // Catch:{ all -> 0x0083 }
        L_0x0083:
            r8 = move-exception
            rf.s.b(r7, r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: rf.v.Z(rf.i0, java.util.Map, ie.d):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004f, code lost:
        rf.s.b(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0052, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @zd.k(level = zd.m.Q, message = "Binary compatibility")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ java.lang.Object a(rf.i0 r4, ie.d r5) {
        /*
            boolean r0 = r5 instanceof rf.v.a
            if (r0 == 0) goto L_0x0013
            r0 = r5
            rf.v$a r0 = (rf.v.a) r0
            int r1 = r0.T
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.T = r1
            goto L_0x0018
        L_0x0013:
            rf.v$a r0 = new rf.v$a
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.S
            java.lang.Object r1 = ke.d.h()
            int r2 = r0.T
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r4 = r0.R
            rf.i0 r4 = (rf.i0) r4
            zd.e1.n(r5)     // Catch:{ all -> 0x004c }
            goto L_0x0047
        L_0x002d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0035:
            zd.e1.n(r5)
            rf.p r5 = r4.iterator()     // Catch:{ all -> 0x004c }
            r0.R = r4     // Catch:{ all -> 0x004c }
            r0.T = r3     // Catch:{ all -> 0x004c }
            java.lang.Object r5 = r5.b(r0)     // Catch:{ all -> 0x004c }
            if (r5 != r1) goto L_0x0047
            return r1
        L_0x0047:
            r0 = 0
            rf.s.b(r4, r0)
            return r5
        L_0x004c:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x004e }
        L_0x004e:
            r0 = move-exception
            rf.s.b(r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rf.v.a(rf.i0, ie.d):java.lang.Object");
    }

    @fh.g
    @a1
    public static final we.l<Throwable, u2> b(@fh.g i0<?> i0Var) {
        return new b(i0Var);
    }

    @a1
    @fh.h
    public static final <E> Object b0(@fh.g i0<? extends E> i0Var, @fh.g ie.d<? super Set<E>> dVar) {
        return s.f0(i0Var, new LinkedHashSet(), dVar);
    }

    @fh.g
    @a1
    public static final we.l<Throwable, u2> c(@fh.g i0<?>... i0VarArr) {
        return new c(i0VarArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0069 A[Catch:{ all -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @zd.k(level = zd.m.Q, message = "Binary compatibility")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ java.lang.Object d(rf.i0 r7, ie.d r8) {
        /*
            boolean r0 = r8 instanceof rf.v.d
            if (r0 == 0) goto L_0x0013
            r0 = r8
            rf.v$d r0 = (rf.v.d) r0
            int r1 = r0.V
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.V = r1
            goto L_0x0018
        L_0x0013:
            rf.v$d r0 = new rf.v$d
            r0.<init>(r8)
        L_0x0018:
            java.lang.Object r8 = r0.U
            java.lang.Object r1 = ke.d.h()
            int r2 = r0.V
            r3 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r7 = r0.T
            rf.p r7 = (rf.p) r7
            java.lang.Object r2 = r0.S
            rf.i0 r2 = (rf.i0) r2
            java.lang.Object r4 = r0.R
            xe.k1$f r4 = (xe.k1.f) r4
            zd.e1.n(r8)     // Catch:{ all -> 0x0035 }
            goto L_0x0060
        L_0x0035:
            r7 = move-exception
            goto L_0x0085
        L_0x0037:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003f:
            zd.e1.n(r8)
            xe.k1$f r8 = new xe.k1$f
            r8.<init>()
            rf.p r2 = r7.iterator()     // Catch:{ all -> 0x0082 }
            r4 = r8
            r8 = r7
            r7 = r2
        L_0x004e:
            r0.R = r4     // Catch:{ all -> 0x007f }
            r0.S = r8     // Catch:{ all -> 0x007f }
            r0.T = r7     // Catch:{ all -> 0x007f }
            r0.V = r3     // Catch:{ all -> 0x007f }
            java.lang.Object r2 = r7.b(r0)     // Catch:{ all -> 0x007f }
            if (r2 != r1) goto L_0x005d
            return r1
        L_0x005d:
            r6 = r2
            r2 = r8
            r8 = r6
        L_0x0060:
            r5 = 0
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x0035 }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x0035 }
            if (r8 == 0) goto L_0x0073
            r7.next()     // Catch:{ all -> 0x0035 }
            int r8 = r4.O     // Catch:{ all -> 0x0035 }
            int r8 = r8 + r3
            r4.O = r8     // Catch:{ all -> 0x0035 }
            r8 = r2
            goto L_0x004e
        L_0x0073:
            zd.u2 r7 = zd.u2.f25116a     // Catch:{ all -> 0x0035 }
            rf.s.b(r2, r5)
            int r7 = r4.O
            java.lang.Integer r7 = le.b.f(r7)
            return r7
        L_0x007f:
            r7 = move-exception
            r2 = r8
            goto L_0x0085
        L_0x0082:
            r8 = move-exception
            r2 = r7
            r7 = r8
        L_0x0085:
            throw r7     // Catch:{ all -> 0x0086 }
        L_0x0086:
            r8 = move-exception
            rf.s.b(r2, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: rf.v.d(rf.i0, ie.d):java.lang.Object");
    }

    public static /* synthetic */ i0 e0(i0 i0Var, ie.g gVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = m1.g();
        }
        return e0.f(e2.O, gVar, 0, (w0) null, s.g(i0Var), new k0(i0Var, (ie.d<? super k0>) null), 6, (Object) null);
    }

    @fh.g
    @a1
    public static final <E, K> i0<E> f(@fh.g i0<? extends E> i0Var, @fh.g ie.g gVar, @fh.g we.p<? super E, ? super ie.d<? super K>, ? extends Object> pVar) {
        return e0.f(e2.O, gVar, 0, (w0) null, s.g(i0Var), new f(i0Var, pVar, (ie.d<? super f>) null), 6, (Object) null);
    }

    public static /* synthetic */ i0 g(i0 i0Var, ie.g gVar, we.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = m1.g();
        }
        return s.k(i0Var, gVar, pVar);
    }

    @fh.g
    @a1
    public static final <E, R, V> i0<V> g0(@fh.g i0<? extends E> i0Var, @fh.g i0<? extends R> i0Var2, @fh.g ie.g gVar, @fh.g we.p<? super E, ? super R, ? extends V> pVar) {
        return e0.f(e2.O, gVar, 0, (w0) null, s.h(i0Var, i0Var2), new m0(i0Var2, i0Var, pVar, (ie.d<? super m0>) null), 6, (Object) null);
    }

    public static /* synthetic */ i0 h0(i0 i0Var, i0 i0Var2, ie.g gVar, we.p pVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            gVar = m1.g();
        }
        return s.q0(i0Var, i0Var2, gVar, pVar);
    }

    public static /* synthetic */ i0 i(i0 i0Var, int i10, ie.g gVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            gVar = m1.g();
        }
        return e0.f(e2.O, gVar, 0, (w0) null, s.g(i0Var), new g(i10, i0Var, (ie.d<? super g>) null), 6, (Object) null);
    }

    public static /* synthetic */ i0 k(i0 i0Var, ie.g gVar, we.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = m1.g();
        }
        return e0.f(e2.O, gVar, 0, (w0) null, s.g(i0Var), new h(i0Var, pVar, (ie.d<? super h>) null), 6, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006c A[Catch:{ all -> 0x0039 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    @zd.k(level = zd.m.Q, message = "Binary compatibility")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ java.lang.Object l(rf.i0 r10, int r11, ie.d r12) {
        /*
            boolean r0 = r12 instanceof rf.v.i
            if (r0 == 0) goto L_0x0013
            r0 = r12
            rf.v$i r0 = (rf.v.i) r0
            int r1 = r0.W
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.W = r1
            goto L_0x0018
        L_0x0013:
            rf.v$i r0 = new rf.v$i
            r0.<init>(r12)
        L_0x0018:
            java.lang.Object r12 = r0.V
            java.lang.Object r1 = ke.d.h()
            int r2 = r0.W
            r3 = 46
            java.lang.String r4 = "ReceiveChannel doesn't contain element at index "
            r5 = 1
            if (r2 == 0) goto L_0x0044
            if (r2 != r5) goto L_0x003c
            int r10 = r0.S
            int r11 = r0.R
            java.lang.Object r2 = r0.U
            rf.p r2 = (rf.p) r2
            java.lang.Object r6 = r0.T
            rf.i0 r6 = (rf.i0) r6
            zd.e1.n(r12)     // Catch:{ all -> 0x0039 }
            goto L_0x0063
        L_0x0039:
            r10 = move-exception
            goto L_0x00af
        L_0x003c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0044:
            zd.e1.n(r12)
            if (r11 < 0) goto L_0x0097
            r12 = 0
            rf.p r2 = r10.iterator()     // Catch:{ all -> 0x0093 }
        L_0x004e:
            r0.T = r10     // Catch:{ all -> 0x0093 }
            r0.U = r2     // Catch:{ all -> 0x0093 }
            r0.R = r11     // Catch:{ all -> 0x0093 }
            r0.S = r12     // Catch:{ all -> 0x0093 }
            r0.W = r5     // Catch:{ all -> 0x0093 }
            java.lang.Object r6 = r2.b(r0)     // Catch:{ all -> 0x0093 }
            if (r6 != r1) goto L_0x005f
            return r1
        L_0x005f:
            r9 = r6
            r6 = r10
            r10 = r12
            r12 = r9
        L_0x0063:
            r7 = 0
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch:{ all -> 0x0039 }
            boolean r12 = r12.booleanValue()     // Catch:{ all -> 0x0039 }
            if (r12 == 0) goto L_0x007b
            java.lang.Object r12 = r2.next()     // Catch:{ all -> 0x0039 }
            int r8 = r10 + 1
            if (r11 != r10) goto L_0x0078
            rf.s.b(r6, r7)
            return r12
        L_0x0078:
            r10 = r6
            r12 = r8
            goto L_0x004e
        L_0x007b:
            java.lang.IndexOutOfBoundsException r10 = new java.lang.IndexOutOfBoundsException     // Catch:{ all -> 0x0039 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0039 }
            r12.<init>()     // Catch:{ all -> 0x0039 }
            r12.append(r4)     // Catch:{ all -> 0x0039 }
            r12.append(r11)     // Catch:{ all -> 0x0039 }
            r12.append(r3)     // Catch:{ all -> 0x0039 }
            java.lang.String r11 = r12.toString()     // Catch:{ all -> 0x0039 }
            r10.<init>(r11)     // Catch:{ all -> 0x0039 }
            throw r10     // Catch:{ all -> 0x0039 }
        L_0x0093:
            r11 = move-exception
            r6 = r10
            r10 = r11
            goto L_0x00af
        L_0x0097:
            java.lang.IndexOutOfBoundsException r12 = new java.lang.IndexOutOfBoundsException     // Catch:{ all -> 0x0093 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0093 }
            r0.<init>()     // Catch:{ all -> 0x0093 }
            r0.append(r4)     // Catch:{ all -> 0x0093 }
            r0.append(r11)     // Catch:{ all -> 0x0093 }
            r0.append(r3)     // Catch:{ all -> 0x0093 }
            java.lang.String r11 = r0.toString()     // Catch:{ all -> 0x0093 }
            r12.<init>(r11)     // Catch:{ all -> 0x0093 }
            throw r12     // Catch:{ all -> 0x0093 }
        L_0x00af:
            throw r10     // Catch:{ all -> 0x00b0 }
        L_0x00b0:
            r11 = move-exception
            rf.s.b(r6, r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: rf.v.l(rf.i0, int, ie.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0062 A[Catch:{ all -> 0x007d }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006b A[Catch:{ all -> 0x007d }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @zd.k(level = zd.m.Q, message = "Binary compatibility")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ java.lang.Object m(rf.i0 r8, int r9, ie.d r10) {
        /*
            boolean r0 = r10 instanceof rf.v.j
            if (r0 == 0) goto L_0x0013
            r0 = r10
            rf.v$j r0 = (rf.v.j) r0
            int r1 = r0.W
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.W = r1
            goto L_0x0018
        L_0x0013:
            rf.v$j r0 = new rf.v$j
            r0.<init>(r10)
        L_0x0018:
            java.lang.Object r10 = r0.V
            java.lang.Object r1 = ke.d.h()
            int r2 = r0.W
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0044
            if (r2 != r3) goto L_0x003c
            int r8 = r0.S
            int r9 = r0.R
            java.lang.Object r2 = r0.U
            rf.p r2 = (rf.p) r2
            java.lang.Object r5 = r0.T
            rf.i0 r5 = (rf.i0) r5
            zd.e1.n(r10)     // Catch:{ all -> 0x003a }
            r7 = r10
            r10 = r8
            r8 = r5
            r5 = r7
            goto L_0x0063
        L_0x003a:
            r8 = move-exception
            goto L_0x0080
        L_0x003c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0044:
            zd.e1.n(r10)
            if (r9 >= 0) goto L_0x004d
            rf.s.b(r8, r4)
            return r4
        L_0x004d:
            r10 = 0
            rf.p r2 = r8.iterator()     // Catch:{ all -> 0x007d }
        L_0x0052:
            r0.T = r8     // Catch:{ all -> 0x007d }
            r0.U = r2     // Catch:{ all -> 0x007d }
            r0.R = r9     // Catch:{ all -> 0x007d }
            r0.S = r10     // Catch:{ all -> 0x007d }
            r0.W = r3     // Catch:{ all -> 0x007d }
            java.lang.Object r5 = r2.b(r0)     // Catch:{ all -> 0x007d }
            if (r5 != r1) goto L_0x0063
            return r1
        L_0x0063:
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ all -> 0x007d }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x007d }
            if (r5 == 0) goto L_0x0079
            java.lang.Object r5 = r2.next()     // Catch:{ all -> 0x007d }
            int r6 = r10 + 1
            if (r9 != r10) goto L_0x0077
            rf.s.b(r8, r4)
            return r5
        L_0x0077:
            r10 = r6
            goto L_0x0052
        L_0x0079:
            rf.s.b(r8, r4)
            return r4
        L_0x007d:
            r9 = move-exception
            r5 = r8
            r8 = r9
        L_0x0080:
            throw r8     // Catch:{ all -> 0x0081 }
        L_0x0081:
            r9 = move-exception
            rf.s.b(r5, r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: rf.v.m(rf.i0, int, ie.d):java.lang.Object");
    }

    @fh.g
    @a1
    public static final <E> i0<E> n(@fh.g i0<? extends E> i0Var, @fh.g ie.g gVar, @fh.g we.p<? super E, ? super ie.d<? super Boolean>, ? extends Object> pVar) {
        return e0.f(e2.O, gVar, 0, (w0) null, s.g(i0Var), new k(i0Var, pVar, (ie.d<? super k>) null), 6, (Object) null);
    }

    public static /* synthetic */ i0 o(i0 i0Var, ie.g gVar, we.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = m1.g();
        }
        return s.s(i0Var, gVar, pVar);
    }

    public static /* synthetic */ i0 q(i0 i0Var, ie.g gVar, we.q qVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = m1.g();
        }
        return e0.f(e2.O, gVar, 0, (w0) null, s.g(i0Var), new l(i0Var, qVar, (ie.d<? super l>) null), 6, (Object) null);
    }

    public static /* synthetic */ i0 s(i0 i0Var, ie.g gVar, we.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = m1.g();
        }
        return s.s(i0Var, gVar, new m(pVar, (ie.d<? super m>) null));
    }

    @fh.g
    @a1
    public static final <E> i0<E> t(@fh.g i0<? extends E> i0Var) {
        return o(i0Var, (ie.g) null, new n((ie.d<? super n>) null), 1, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0059 A[Catch:{ all -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065 A[Catch:{ all -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0070 A[Catch:{ all -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @zd.k(level = zd.m.Q, message = "Binary compatibility")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ java.lang.Object u(rf.i0 r6, java.util.Collection r7, ie.d r8) {
        /*
            boolean r0 = r8 instanceof rf.v.o
            if (r0 == 0) goto L_0x0013
            r0 = r8
            rf.v$o r0 = (rf.v.o) r0
            int r1 = r0.V
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.V = r1
            goto L_0x0018
        L_0x0013:
            rf.v$o r0 = new rf.v$o
            r0.<init>(r8)
        L_0x0018:
            java.lang.Object r8 = r0.U
            java.lang.Object r1 = ke.d.h()
            int r2 = r0.V
            r3 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 != r3) goto L_0x0037
            java.lang.Object r6 = r0.T
            rf.p r6 = (rf.p) r6
            java.lang.Object r7 = r0.S
            rf.i0 r7 = (rf.i0) r7
            java.lang.Object r2 = r0.R
            java.util.Collection r2 = (java.util.Collection) r2
            zd.e1.n(r8)     // Catch:{ all -> 0x0035 }
            goto L_0x005c
        L_0x0035:
            r6 = move-exception
            goto L_0x007a
        L_0x0037:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003f:
            zd.e1.n(r8)
            rf.p r8 = r6.iterator()     // Catch:{ all -> 0x0076 }
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L_0x004a:
            r0.R = r8     // Catch:{ all -> 0x0035 }
            r0.S = r7     // Catch:{ all -> 0x0035 }
            r0.T = r6     // Catch:{ all -> 0x0035 }
            r0.V = r3     // Catch:{ all -> 0x0035 }
            java.lang.Object r2 = r6.b(r0)     // Catch:{ all -> 0x0035 }
            if (r2 != r1) goto L_0x0059
            return r1
        L_0x0059:
            r5 = r2
            r2 = r8
            r8 = r5
        L_0x005c:
            r4 = 0
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x0035 }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x0035 }
            if (r8 == 0) goto L_0x0070
            java.lang.Object r8 = r6.next()     // Catch:{ all -> 0x0035 }
            if (r8 == 0) goto L_0x006e
            r2.add(r8)     // Catch:{ all -> 0x0035 }
        L_0x006e:
            r8 = r2
            goto L_0x004a
        L_0x0070:
            zd.u2 r6 = zd.u2.f25116a     // Catch:{ all -> 0x0035 }
            rf.s.b(r7, r4)
            return r2
        L_0x0076:
            r7 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L_0x007a:
            throw r6     // Catch:{ all -> 0x007b }
        L_0x007b:
            r8 = move-exception
            rf.s.b(r7, r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: rf.v.u(rf.i0, java.util.Collection, ie.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0070 A[Catch:{ all -> 0x009d }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0071 A[Catch:{ all -> 0x009d }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007e A[Catch:{ all -> 0x009d }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0097 A[Catch:{ all -> 0x009d }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @zd.k(level = zd.m.Q, message = "Binary compatibility")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ java.lang.Object v(rf.i0 r7, rf.m0 r8, ie.d r9) {
        /*
            boolean r0 = r9 instanceof rf.v.p
            if (r0 == 0) goto L_0x0013
            r0 = r9
            rf.v$p r0 = (rf.v.p) r0
            int r1 = r0.V
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.V = r1
            goto L_0x0018
        L_0x0013:
            rf.v$p r0 = new rf.v$p
            r0.<init>(r9)
        L_0x0018:
            java.lang.Object r9 = r0.U
            java.lang.Object r1 = ke.d.h()
            int r2 = r0.V
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x005b
            if (r2 == r4) goto L_0x0043
            if (r2 != r3) goto L_0x003b
            java.lang.Object r7 = r0.T
            rf.p r7 = (rf.p) r7
            java.lang.Object r8 = r0.S
            rf.i0 r8 = (rf.i0) r8
            java.lang.Object r2 = r0.R
            rf.m0 r2 = (rf.m0) r2
            zd.e1.n(r9)     // Catch:{ all -> 0x0059 }
            r9 = r7
            r7 = r8
            r8 = r2
            goto L_0x0062
        L_0x003b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0043:
            java.lang.Object r7 = r0.T
            rf.p r7 = (rf.p) r7
            java.lang.Object r8 = r0.S
            rf.i0 r8 = (rf.i0) r8
            java.lang.Object r2 = r0.R
            rf.m0 r2 = (rf.m0) r2
            zd.e1.n(r9)     // Catch:{ all -> 0x0059 }
            r6 = r0
            r0 = r7
            r7 = r8
            r8 = r2
        L_0x0056:
            r2 = r1
            r1 = r6
            goto L_0x0075
        L_0x0059:
            r7 = move-exception
            goto L_0x00a1
        L_0x005b:
            zd.e1.n(r9)
            rf.p r9 = r7.iterator()     // Catch:{ all -> 0x009d }
        L_0x0062:
            r0.R = r8     // Catch:{ all -> 0x009d }
            r0.S = r7     // Catch:{ all -> 0x009d }
            r0.T = r9     // Catch:{ all -> 0x009d }
            r0.V = r4     // Catch:{ all -> 0x009d }
            java.lang.Object r2 = r9.b(r0)     // Catch:{ all -> 0x009d }
            if (r2 != r1) goto L_0x0071
            return r1
        L_0x0071:
            r6 = r0
            r0 = r9
            r9 = r2
            goto L_0x0056
        L_0x0075:
            r5 = 0
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ all -> 0x009d }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x009d }
            if (r9 == 0) goto L_0x0097
            java.lang.Object r9 = r0.next()     // Catch:{ all -> 0x009d }
            if (r9 == 0) goto L_0x0093
            r1.R = r8     // Catch:{ all -> 0x009d }
            r1.S = r7     // Catch:{ all -> 0x009d }
            r1.T = r0     // Catch:{ all -> 0x009d }
            r1.V = r3     // Catch:{ all -> 0x009d }
            java.lang.Object r9 = r8.C(r9, r1)     // Catch:{ all -> 0x009d }
            if (r9 != r2) goto L_0x0093
            return r2
        L_0x0093:
            r9 = r0
            r0 = r1
            r1 = r2
            goto L_0x0062
        L_0x0097:
            zd.u2 r9 = zd.u2.f25116a     // Catch:{ all -> 0x009d }
            rf.s.b(r7, r5)
            return r8
        L_0x009d:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L_0x00a1:
            throw r7     // Catch:{ all -> 0x00a2 }
        L_0x00a2:
            r9 = move-exception
            rf.s.b(r8, r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: rf.v.v(rf.i0, rf.m0, ie.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005c A[Catch:{ all -> 0x0031 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0064 A[SYNTHETIC, Splitter:B:28:0x0064] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @zd.k(level = zd.m.Q, message = "Binary compatibility")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ java.lang.Object w(rf.i0 r5, ie.d r6) {
        /*
            boolean r0 = r6 instanceof rf.v.q
            if (r0 == 0) goto L_0x0013
            r0 = r6
            rf.v$q r0 = (rf.v.q) r0
            int r1 = r0.U
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.U = r1
            goto L_0x0018
        L_0x0013:
            rf.v$q r0 = new rf.v$q
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.T
            java.lang.Object r1 = ke.d.h()
            int r2 = r0.U
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r5 = r0.S
            rf.p r5 = (rf.p) r5
            java.lang.Object r0 = r0.R
            rf.i0 r0 = (rf.i0) r0
            zd.e1.n(r6)     // Catch:{ all -> 0x0031 }
            goto L_0x0053
        L_0x0031:
            r5 = move-exception
            goto L_0x006f
        L_0x0033:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003b:
            zd.e1.n(r6)
            rf.p r6 = r5.iterator()     // Catch:{ all -> 0x006c }
            r0.R = r5     // Catch:{ all -> 0x006c }
            r0.S = r6     // Catch:{ all -> 0x006c }
            r0.U = r3     // Catch:{ all -> 0x006c }
            java.lang.Object r0 = r6.b(r0)     // Catch:{ all -> 0x006c }
            if (r0 != r1) goto L_0x004f
            return r1
        L_0x004f:
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L_0x0053:
            r1 = 0
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ all -> 0x0031 }
            boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x0031 }
            if (r6 == 0) goto L_0x0064
            java.lang.Object r5 = r5.next()     // Catch:{ all -> 0x0031 }
            rf.s.b(r0, r1)
            return r5
        L_0x0064:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException     // Catch:{ all -> 0x0031 }
            java.lang.String r6 = "ReceiveChannel is empty."
            r5.<init>(r6)     // Catch:{ all -> 0x0031 }
            throw r5     // Catch:{ all -> 0x0031 }
        L_0x006c:
            r6 = move-exception
            r0 = r5
            r5 = r6
        L_0x006f:
            throw r5     // Catch:{ all -> 0x0070 }
        L_0x0070:
            r6 = move-exception
            rf.s.b(r0, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: rf.v.w(rf.i0, ie.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0060 A[SYNTHETIC, Splitter:B:27:0x0060] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    @zd.k(level = zd.m.Q, message = "Binary compatibility")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ java.lang.Object x(rf.i0 r5, ie.d r6) {
        /*
            boolean r0 = r6 instanceof rf.v.r
            if (r0 == 0) goto L_0x0013
            r0 = r6
            rf.v$r r0 = (rf.v.r) r0
            int r1 = r0.U
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.U = r1
            goto L_0x0018
        L_0x0013:
            rf.v$r r0 = new rf.v$r
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.T
            java.lang.Object r1 = ke.d.h()
            int r2 = r0.U
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r5 = r0.S
            rf.p r5 = (rf.p) r5
            java.lang.Object r0 = r0.R
            rf.i0 r0 = (rf.i0) r0
            zd.e1.n(r6)     // Catch:{ all -> 0x0031 }
            goto L_0x0053
        L_0x0031:
            r5 = move-exception
            goto L_0x006b
        L_0x0033:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x003b:
            zd.e1.n(r6)
            rf.p r6 = r5.iterator()     // Catch:{ all -> 0x0068 }
            r0.R = r5     // Catch:{ all -> 0x0068 }
            r0.S = r6     // Catch:{ all -> 0x0068 }
            r0.U = r3     // Catch:{ all -> 0x0068 }
            java.lang.Object r0 = r6.b(r0)     // Catch:{ all -> 0x0068 }
            if (r0 != r1) goto L_0x004f
            return r1
        L_0x004f:
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L_0x0053:
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ all -> 0x0031 }
            boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x0031 }
            r1 = 0
            if (r6 != 0) goto L_0x0060
            rf.s.b(r0, r1)
            return r1
        L_0x0060:
            java.lang.Object r5 = r5.next()     // Catch:{ all -> 0x0031 }
            rf.s.b(r0, r1)
            return r5
        L_0x0068:
            r6 = move-exception
            r0 = r5
            r5 = r6
        L_0x006b:
            throw r5     // Catch:{ all -> 0x006c }
        L_0x006c:
            r6 = move-exception
            rf.s.b(r0, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: rf.v.x(rf.i0, ie.d):java.lang.Object");
    }

    public static /* synthetic */ i0 z(i0 i0Var, ie.g gVar, we.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = m1.g();
        }
        return e0.f(e2.O, gVar, 0, (w0) null, s.g(i0Var), new s(i0Var, pVar, (ie.d<? super s>) null), 6, (Object) null);
    }
}
