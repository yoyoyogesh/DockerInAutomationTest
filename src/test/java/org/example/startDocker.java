package org.example;

import org.testng.annotations.Test;

import java.io.IOException;

public class startDocker {
    @Test
    public void startFile() throws IOException {
       Runtime runtime = Runtime.getRuntime();
       runtime.exec("//Users//yk//Desktop//dockerUp.command");
    }
}
