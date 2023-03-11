package com.knoldus.Question13;

//the subclass is able to call the protected method of the superclass,
// because the protected method is accessible to subclasses.
// If the protected method had been defined as private, it would not have been accessible from the subclass.

class SuperClass {
    protected void myProtectedMethod() {
        System.out.println("Protected method!");
    }
}
class SubClass extends SuperClass {
    public void callProtectedMethod() {
        myProtectedMethod();
    }
}


public class privateMumberAccess {
    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        subClass.callProtectedMethod();
    }
}


