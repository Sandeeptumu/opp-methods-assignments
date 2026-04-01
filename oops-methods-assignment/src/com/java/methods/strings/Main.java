package com.java.methods.strings;

import com.java.methods.arrays.Customer;

public class Main {
    static String name;

    public static void main(String[] args) {
        String str1 = new String();
        System.out.println(str1);
        System.out.println(str1);
        System.out.println(name);

        char[] chars = {'a', 'b', 'c', 'd'};
        String str2 = new String(chars);
        System.out.println(str2);

        String str3 = new String("Hello");
        System.out.println(str3);
        System.out.println(str2 == str3);

        System.out.println(str3.charAt(1));

        String username = "Sandeep123";
        String password = "Sandy";

        System.out.println(username.compareToIgnoreCase("Sandeep123"));

        if (username.length() > 4 && password.length() > 2) {
            System.out.println("Valid Username and Password Length");
        }else {
            System.out.println("Invalid Username and Password Length");
        }

        if (username.equals("Sandeep123") && password.equals("Sandy")) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }

        String greeting = "Hello ";
        greeting = greeting.concat(username);
        System.out.println(greeting);

        String regex = "^[a-zA-Z0-9_]+$";
        if (username.matches(regex)){
            System.out.println("User Name Valid");
        }else {
            System.out.println("User Name Invalid");
        }

        String customerData = "100,Sandy,sandeep123@gmail.com,8008835533,Ecil,21,M";

        String[] split = customerData.split(",");

        Customer customer = new Customer(
                Integer.parseInt(split[0].trim()),
                split[1].trim(),
                split[2].trim(),
                split[3].trim(),
                split[4].trim(),
                Byte.parseByte(split[5].trim()),
                split[6].trim().charAt(0)
        );

        System.out.println("ID: " +customer.id);
        System.out.println("Name: " +customer.name);
        System.out.println("Email: " +customer.email);
        System.out.println("Phone Number: " +customer.phoneNumber);
        System.out.println("Address: " +customer.address );
        System.out.println("Gender: " +customer.gender);

    }
}