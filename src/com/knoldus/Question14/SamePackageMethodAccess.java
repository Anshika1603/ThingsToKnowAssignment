package com.knoldus.Question14;

class publicMethodAccess {
    public void publicMethod() {
        System.out.println("Public method!");
    }
}

public class SamePackageMethodAccess {
    public static void main(String[] args) {
        publicMethodAccess obj = new publicMethodAccess();
        obj.publicMethod();
    }
}



