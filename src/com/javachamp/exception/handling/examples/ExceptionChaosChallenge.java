package com.javachamp.exception.handling.examples;

import java.io.FileNotFoundException;

public class ExceptionChaosChallenge {
    static String s = "-";

    public static void main(String... doYouBest) {
        try {
            throw new IllegalArgumentException();
        } catch (Exception e) {
            try {
                try {
                    throw new FileNotFoundException();
                } catch (RuntimeException ex) {
                    s += "run";
                }
                throw new NullPointerException();
            } catch (Exception x) {
                s += "exc";
            } finally {
                s += "fin";
            }
        } finally {
            s += "of";
            try {
                throw new VirtualMachineError("JVMError") {};
            } catch (Error error) {
                s += "error" + error.getMessage();
            }
        }

        System.out.println(s);
    }

}