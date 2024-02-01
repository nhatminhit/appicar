package se;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import we.p;
import zd.h1;

@h1(version = "1.7")
@f
public interface g {
    void a(@fh.g p<? super Path, ? super IOException, ? extends FileVisitResult> pVar);

    void b(@fh.g p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> pVar);

    void c(@fh.g p<? super Path, ? super IOException, ? extends FileVisitResult> pVar);

    void d(@fh.g p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> pVar);
}
