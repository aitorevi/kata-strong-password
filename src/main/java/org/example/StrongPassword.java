package org.example;

import com.sun.source.tree.IfTree;

public class StrongPassword {

    public static void main(String[] args) {
        System.out.println(strongPassword("Password5"));
    }

    public static boolean strongPassword(String password) {
        var regex = "12151515";
        if (!(password.length() > 6) ||
            !(password.matches(".*\\d.*")) ||
            !(password.matches(".*[A-Z].*"))) {
            return false;
        }
        return true;
    }
}
