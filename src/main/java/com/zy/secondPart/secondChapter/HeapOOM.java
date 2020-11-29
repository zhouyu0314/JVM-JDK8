package com.zy.secondPart.secondChapter;

import java.util.ArrayList;

public class HeapOOM {
    public static void main(String[] args) {
        ArrayList<OOMObject> list = new ArrayList<>();

        while (true) {
            list.add(new OOMObject());
        }
    }

    static class OOMObject{

    }
}
