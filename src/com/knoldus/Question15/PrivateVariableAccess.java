package com.knoldus.Question15;
import com.knoldus.privateVariable;

//Error: 'EmployeeID' has private access in 'com.knoldus.privateVariable'
//because private members cannot be accessed from other packages.

public class PrivateVariableAccess {
    public void accessEmployeeID(privateVariable Variable) {
        //System.out.println(Variable.EmployeeID);
    }

}
