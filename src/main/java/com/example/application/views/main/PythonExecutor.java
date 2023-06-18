package com.example.application.views.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class PythonExecutor {
    public static String executePythonScript(String scriptPath) throws IOException {
        String command = "python " + scriptPath;

        Process process = Runtime.getRuntime().exec(command);

        InputStream inputStream = process.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

        StringBuilder output = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            output.append(line).append("\n");
        }

        reader.close();

        return output.toString();
    }
}
