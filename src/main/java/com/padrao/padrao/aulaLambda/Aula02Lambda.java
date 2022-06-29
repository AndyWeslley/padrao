package com.padrao.padrao.aulaLambda;

import java.util.Arrays;
import java.util.List;

public class Aula02Lambda {
    public static void main(String[] args) {
        
        List<Integer> lista = Arrays.asList(1,5,8,9,1,4,7,6,6,9,9);
       
        lista.stream()
        .filter(e -> e%2 ==0)
        .forEach(e -> System.out.println(e));

    }


}