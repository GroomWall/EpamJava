package lesson8.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdvancedScanner {
    private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    double nextDouble() throws IOException {
        return Double.parseDouble(bufferedReader.readLine());
    }

    int nextInt() throws IOException {
        return Integer.parseInt(bufferedReader.readLine());
    }

    String next() throws IOException {
        return bufferedReader.readLine();
    }

}
