package com.philou;

import java.util.function.BiPredicate;

interface interfaceTraitementString<U,R, T> {
    T testPhilou(U a, R b);
}

public class Main {
    public static void main(String[] args) {
        BiPredicate<String, String> biPredicate =
            (s1,s2) -> s1.equals(s2);

        System.out.println("\nHello Philou. On teste !");
        System.out.println(biPredicate.test("Philou","Philou"));


 /*       A oblInterface = new A() {
            public String testPhilou(String a, String b) {
                return "Concat des 2 String => " + a + b;
            }
        };*/

        String str3 = "Chaine3";
        interfaceTraitementString oblInterface = getInterfaceTraitementString(str3);

        System.out.println(oblInterface.testPhilou("Bonjour ","la Ratiboise"));

        interfaceTraitementString objInterface2 = (a,b) -> "Yes Papa Philou ! ";
        System.out.println(objInterface2.testPhilou("",""));

    }

    private static interfaceTraitementString<String,String, String> getInterfaceTraitementString(String str) {
        return (String a, String b) -> "Concat des 2 String avec la déclaration dans une méthode et Types Génériques => " + a + b + " / Chaine rajoutée en paramètre : " + str;
    }
}