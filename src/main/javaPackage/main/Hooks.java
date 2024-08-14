package javaPackage.main;


import io.cucumber.java.After;

public class Hooks extends DriverClass {

    @After
    public static void tearDown() throws Throwable {
     launchBrowser().quit();
     System.gc();
    }
}
