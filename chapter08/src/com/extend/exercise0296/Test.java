package com.extend.exercise0296;

public class Test {
    public static void main(String[] args) {
        PC pc = new PC("intel", 16, 500, "IBM");
        pc.printInfo();
        NotePad notePad = new NotePad("A1", 8, 64, "gray");
        notePad.printInfo();
    }
}
