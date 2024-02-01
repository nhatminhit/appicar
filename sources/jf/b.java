package jf;

import be.o;
import fh.g;
import java.util.Iterator;
import java.util.List;
import java.util.PrimitiveIterator;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import p000if.m;
import ve.h;
import xe.l0;
import zd.h1;

@h(name = "StreamsKt")
public final class b {

    public static final class a implements m<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Stream f19936a;

        public a(Stream stream) {
            this.f19936a = stream;
        }

        @g
        public Iterator<T> iterator() {
            Iterator<T> it = this.f19936a.iterator();
            l0.o(it, "iterator()");
            return it;
        }
    }

    /* renamed from: jf.b$b  reason: collision with other inner class name */
    public static final class C0336b implements m<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IntStream f19937a;

        public C0336b(IntStream intStream) {
            this.f19937a = intStream;
        }

        @g
        public Iterator<Integer> iterator() {
            PrimitiveIterator.OfInt it = this.f19937a.iterator();
            l0.o(it, "iterator()");
            return it;
        }
    }

    public static final class c implements m<Long> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LongStream f19938a;

        public c(LongStream longStream) {
            this.f19938a = longStream;
        }

        @g
        public Iterator<Long> iterator() {
            PrimitiveIterator.OfLong it = this.f19938a.iterator();
            l0.o(it, "iterator()");
            return it;
        }
    }

    public static final class d implements m<Double> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ DoubleStream f19939a;

        public d(DoubleStream doubleStream) {
            this.f19939a = doubleStream;
        }

        @g
        public Iterator<Double> iterator() {
            PrimitiveIterator.OfDouble it = this.f19939a.iterator();
            l0.o(it, "iterator()");
            return it;
        }
    }

    @g
    @h1(version = "1.2")
    public static final m<Double> b(@g DoubleStream doubleStream) {
        l0.p(doubleStream, "<this>");
        return new d(doubleStream);
    }

    @g
    @h1(version = "1.2")
    public static final m<Integer> c(@g IntStream intStream) {
        l0.p(intStream, "<this>");
        return new C0336b(intStream);
    }

    @g
    @h1(version = "1.2")
    public static final m<Long> d(@g LongStream longStream) {
        l0.p(longStream, "<this>");
        return new c(longStream);
    }

    @g
    @h1(version = "1.2")
    public static final <T> m<T> e(@g Stream<T> stream) {
        l0.p(stream, "<this>");
        return new a(stream);
    }

    @g
    @h1(version = "1.2")
    public static final <T> Stream<T> f(@g m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        Stream<T> stream = StreamSupport.stream(new a(mVar), 16, false);
        l0.o(stream, "stream({ Spliterators.sp…literator.ORDERED, false)");
        return stream;
    }

    public static final Spliterator g(m mVar) {
        l0.p(mVar, "$this_asStream");
        return Spliterators.spliteratorUnknownSize(mVar.iterator(), 16);
    }

    @g
    @h1(version = "1.2")
    public static final List<Double> h(@g DoubleStream doubleStream) {
        l0.p(doubleStream, "<this>");
        double[] array = doubleStream.toArray();
        l0.o(array, "toArray()");
        return o.p(array);
    }

    @g
    @h1(version = "1.2")
    public static final List<Integer> i(@g IntStream intStream) {
        l0.p(intStream, "<this>");
        int[] array = intStream.toArray();
        l0.o(array, "toArray()");
        return o.r(array);
    }

    @g
    @h1(version = "1.2")
    public static final List<Long> j(@g LongStream longStream) {
        l0.p(longStream, "<this>");
        long[] array = longStream.toArray();
        l0.o(array, "toArray()");
        return o.s(array);
    }

    @g
    @h1(version = "1.2")
    public static final <T> List<T> k(@g Stream<T> stream) {
        l0.p(stream, "<this>");
        Object collect = stream.collect(Collectors.toList());
        l0.o(collect, "collect(Collectors.toList<T>())");
        return (List) collect;
    }
}
