import java.util.Scanner;

public class StringsComuns {
    public static void main(String[] args) {
        StringBuilder frase1 = new StringBuilder();
        frase1.append("Milagres só acontecem com as pessoas que não desistem. ");

        StringBuilder frase2 = new StringBuilder();
        frase2.append("lagresim Ó ascotceemm cno as pssaos euqe ãno diesstem. ");

        System.out.println("Frase 1: " +frase1);
        System.out.println("Frase 2: " +frase2);
        System.out.println("#################");

        if (frase1.length() != frase2.length()) {
            System.out.println("Frases Diferentes");
        } else {
            int charFrase = 0;
            while (charFrase != frase2.length()) {

                if (frase2.toString().toUpperCase().charAt(charFrase) == frase1.toString().toUpperCase().charAt(0)) {
                    frase1.deleteCharAt(0);
                    frase2.deleteCharAt(charFrase);
                    charFrase = 0;
                } else {
                    charFrase++;
                }
            }

            if (frase1.length() == 0) {
                System.out.println("Frases Iguais!");
            } else {
                System.out.println("Frases Diferentes!");
            }
        }
    }
}

