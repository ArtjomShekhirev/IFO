/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifo;

import java.util.Scanner;

/**
 *
 * @author xsayars
 */
public class IFO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = in.nextLine();
        System.out.println("Введите фамилию: ");
        String surname = in.nextLine();
        System.out.println("Введите день рождения: ");
        int day = in.nextInt();
        System.out.println("Введите месяц рождения: ");
        int month = in.nextInt();
        System.out.println("Введите год рождения: ");
        int year = in.nextInt();
        
        System.out.println("Имя: ");
        String result = name;
        System.out.println(result);
        String result2 = surname;
        System.out.println("Фамилия: ");
        System.out.println(result2);
        int result3 = day;
        System.out.println("День рождения: ");
        System.out.println(result3);
        int result4 = month;
        System.out.println("Месяц рождения: ");
        System.out.println(result4);
        int result5 = year;
        System.out.println("Год рождения: ");
        System.out.println(result5);
    }    
}        

        
    
    

