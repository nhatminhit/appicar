package h9;

import android.app.Activity;
import d.m0;
import d.o0;
import java.util.concurrent.Executor;

public abstract class m<TResult> {
    @m0
    public m<TResult> a(@m0 Activity activity, @m0 e eVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    @m0
    public m<TResult> b(@m0 e eVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented.");
    }

    @m0
    public m<TResult> c(@m0 Executor executor, @m0 e eVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    @m0
    public m<TResult> d(@m0 Activity activity, @m0 f<TResult> fVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @m0
    public m<TResult> e(@m0 f<TResult> fVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @m0
    public m<TResult> f(@m0 Executor executor, @m0 f<TResult> fVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    @m0
    public abstract m<TResult> g(@m0 Activity activity, @m0 g gVar);

    @m0
    public abstract m<TResult> h(@m0 g gVar);

    @m0
    public abstract m<TResult> i(@m0 Executor executor, @m0 g gVar);

    @m0
    public abstract m<TResult> j(@m0 Activity activity, @m0 h<? super TResult> hVar);

    @m0
    public abstract m<TResult> k(@m0 h<? super TResult> hVar);

    @m0
    public abstract m<TResult> l(@m0 Executor executor, @m0 h<? super TResult> hVar);

    @m0
    public <TContinuationResult> m<TContinuationResult> m(@m0 c<TResult, TContinuationResult> cVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    @m0
    public <TContinuationResult> m<TContinuationResult> n(@m0 Executor executor, @m0 c<TResult, TContinuationResult> cVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    @m0
    public <TContinuationResult> m<TContinuationResult> o(@m0 c<TResult, m<TContinuationResult>> cVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    @m0
    public <TContinuationResult> m<TContinuationResult> p(@m0 Executor executor, @m0 c<TResult, m<TContinuationResult>> cVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    @o0
    public abstract Exception q();

    public abstract TResult r();

    public abstract <X extends Throwable> TResult s(@m0 Class<X> cls) throws Throwable;

    public abstract boolean t();

    public abstract boolean u();

    public abstract boolean v();

    @m0
    public <TContinuationResult> m<TContinuationResult> w(@m0 l<TResult, TContinuationResult> lVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    @m0
    public <TContinuationResult> m<TContinuationResult> x(@m0 Executor executor, @m0 l<TResult, TContinuationResult> lVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
