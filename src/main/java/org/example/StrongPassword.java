package org.example;

import com.sun.source.tree.IfTree;

public class StrongPassword {

    public static void main(String[] args) {

    }

    public static boolean strongPassword(String password) {
        if (password.length()<6) {
            return false;
        }
        return true;
    }
}
