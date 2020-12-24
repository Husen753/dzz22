package com.company;

public class Main {

    public static void main(String[] args) {
        ageTemputare(-10,5);
    }
    public static int ageTemputare(int age, int temp) {
        if (age > 20 && age < 45 && temp < -20 && temp > 30) {
            System.out.println("Можно идти гулять");
        } else if (age < 20 && temp > 0 && temp < 28) {
            System.out.println("Можно идти гулять");
        }else if (age>45&&temp<-10&&temp>25){
            System.out.println("Можно идти гулять");
        }else {
            System.out.println("Оставайтесь дома");
        }
        return age;
    }
}
