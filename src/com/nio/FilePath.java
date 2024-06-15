package com.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilePath {
    public static void main(String[] args) throws IOException {

        Path p1 = Path.of("./../test/second/..test2.txt");
        Path p2 = Path.of("./../test/..test3.txt");

        System.out.println(p1.normalize().equals(p2.normalize()));

        Path p3 = Path.of("./../../test");

        System.out.println(p3.getRoot());
        System.out.println(p3.getParent());
        System.out.println(p3.getParent().getParent());

        System.out.println(p1.relativize(p2));

        // Files.copy(Path.of("../nio"),Path.of("../nio/copy"));

    }
}
