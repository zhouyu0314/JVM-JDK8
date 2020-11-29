package com.zy.secondPart.secondChapter;

public class JavaVMStackSOF1 {
    private int stackLength = 1;

public void stackLeak(){
    stackLength++;
    this.stackLeak();
}

    public static void main(String[] args) {
        JavaVMStackSOF1 oom = new JavaVMStackSOF1();
        try {
            oom.stackLeak();
        } catch (Throwable e) {
            System.out.println("stack length:" + oom.stackLength);
            throw e;
        }
    }
}
