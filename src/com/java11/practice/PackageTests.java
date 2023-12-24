package com.java11.practice;

import static com.java11.practice.StaticImportTest.*;
/**
 * Out of ordinary concepts!!! Imprt & packages
 */
public class PackageTests {
    public static void main(String[] args) {
        System.out.println("Package Tests");
        FQCN.main(args);
        StaticImportTest.main(args);
        String a = APP_NAME;
        System.out.println(a);

    }
}
