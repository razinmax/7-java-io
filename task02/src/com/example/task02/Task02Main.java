package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int currentByte;
        int nextByte;
        currentByte = System.in.read();

        while (currentByte != -1) {
            nextByte = System.in.read();

            if (currentByte == 13 && nextByte == 10) {
                currentByte = nextByte;
                continue;
            }
            System.out.write(currentByte);

            currentByte = nextByte;
        }
        System.out.flush();
    }
}
