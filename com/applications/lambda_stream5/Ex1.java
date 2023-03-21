package com.applications.lambda_stream5;

interface Func1 {
    public abstract boolean call(int n);
}

interface Func2 {
    public abstract String call(boolean male, String name);
}

class Utils {
    public static boolean isOdd(int n) {
        return n % 2 == 1;
    }
    
    public static String addNamePrefix(boolean male, String name) {
        if (male == true) {
            return "Mr." + name;
        }
        return "Ms." + name;
    }
}

public class Ex1 {
    public static void main(String[] args) {
        Func1 func = Utils::isOdd;
        Func2 func2 = Utils::addNamePrefix;
        
        System.out.println(func.call(5));
        System.out.println(func2.call(true, "호빵맨"));
        
        
        // 람다식 표현
        Func1 lamfunc = n -> n % 2 == 1;
        Func2 lamfunc2 = (boolean male, String name) -> {
            if (male == true) {
                return "Mr." + name;
            }
            return "Ms." + name;
        };
        
        System.out.println(lamfunc.call(5));
        System.out.println(lamfunc2.call(true, "호빵맨"));
    
    }
}
