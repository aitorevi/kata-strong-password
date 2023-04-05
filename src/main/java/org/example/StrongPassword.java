package org.example;

import com.sun.source.tree.IfTree;

public class StrongPassword {

    public static void main(String[] args) {
        System.out.println(strongPassword("password"));
    }

    public static boolean strongPassword(String password) {
        var regex = "12151515";
        if (!(password.length() > 6) || !(password.matches(".*\\d.*"))) {
            return false;
        }
        return true;
    }
}
