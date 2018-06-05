package com.zys.spring.di;


import java.io.PrintStream;

public class SplayDragQuest implements Quest {

    private PrintStream stream;

    public SplayDragQuest(PrintStream stream) {
        this.stream = stream;
    }

    public void embark() {
        stream.println("Embarking on quest to splay the dragon");
    }
}
