package com.comarch.szkolenia.enkapsulacja;

public class App {
    public static void main(String[] args) {
        Square square = new Square(5);

        System.out.println(square.getSide());
        System.out.println(square.getField());
        System.out.println(square.getCircle());

        square.setSide(7);

        System.out.println(square.getSide());
        System.out.println(square.getField());
        System.out.println(square.getCircle());

        Client client = new Client();

        /*String potentialName = "Janusz";
        if(potentialName.length() > 3 &&
                potentialName.charAt(0) == potentialName.toUpperCase().charAt(0)) {
            client.name = "Janusz";
        }



        client.name = "Wiesiek";*/

        client.setName("Janusz");
        client.setName("Wiesiek");

        client.getName();

        Client client2 = new Client();
    }
}
