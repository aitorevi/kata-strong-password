package org.example;

import com.sun.source.tree.IfTree;

public class StrongPassword {

    public static void main(String[] args) {
        System.out.println(strongPassword("Pass_123456"));
    }

    public static boolean strongPassword(String password) {
        return password.length() > 6 && password.matches(".*[A-Za-z\\d]_.*");
    }
}
