package com.padrao.padrao.aulaLambda;

import javax.swing.JButton;
import java.util.Arrays;
import java.util.List;

public class Aula01Lambda {
    public static void main(String[] args) {
        
        new Thread(()->System.out.println("Olá Mundo")).run();


        JButton jButton = new JButton();    
        jButton.addActionListener(e -> System.out.println("Olá Mundo"));


        List<Integer> asList = Arrays.asList(1,2,3,4);
        asList.stream()
        .filter(e -> e%2 ==0)
        .forEach(e -> System.out.println(e));

    }


}