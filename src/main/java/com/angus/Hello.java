package com.angus;

import java.util.StringTokenizer;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello world");

//        new Person().hello();
//        Person p = new Person();
//        p.hello();
        String s = new String("\n1\n2\n3\n4\n5\n");
//        System.out.println(s);
        StringTokenizer st = new StringTokenizer(s,"\n");
        int n = st.countTokens();
        System.out.println("separate" + n +"number");
        while(st.hasMoreTokens()){

            System.out.print(st.nextToken());

        }

    }
}
