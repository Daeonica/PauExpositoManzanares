
import java.util.Scanner;

public class Ej01_b {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day, month;
        System.out.println("Enter the day: ");
        day = input.nextInt();

        System.out.println("Enter the month: ");
        month = input.nextInt();
        System.out.println("The selected day is: " + day);
        System.out.println("The selected month is: " + month);

//hacemos un bucle con condicionales vara verificar que la fecha sea correcta teniendo en cuenta cuantos días tiene cada mes
        if (day >= 1 && day <= 31) {
            if (month != 2 || month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                System.out.println("The date is correct");
                System.out.println("--------------------------------");
            } else if (day >= 1 && day <= 30) {
                if (month != 2 || month == 4 || month == 6 || month == 9 || month == 11) {
                    System.out.println("The date is correct");
                    System.out.println("--------------------------------");
                } else if (day >= 1 && day <= 28) {
                    if (month == 2) {
                        System.out.println("The date is correct");
                        System.out.println("--------------------------------");
                    } else {
                        System.out.println("The date is incorrect");
                    }
                } else {
                    System.out.println("The date is incorrect");
                }
            } else {
                System.out.println("The date is incorrect");
            }
        } else {
            System.out.println("The date is incorrect");

        }
        //hacemos un bucle switch teniendo como índice los meses. Dentro de cada caso podemos los dos zodiacos que tiene cada mes dependiendo del día elegido
        //con los break; hacemos que si el bucle no continue.
        switch (month) {
            case 1:
                if (day <= 21) {
                    System.out.println("The sign is capricorn");
                } else {
                    System.out.println("The sign is aquarius");
                }
                break;
            case 2:
                if (day <= 18) {
                    System.out.println("The sign is aquarius");
                } else {
                    System.out.println("The sign is pisces");
                }
                break;
            case 3:
                if (day <= 19) {
                    System.out.println("The sign is pisces");
                } else {
                    System.out.println("The sign is aries");
                }
                break;
            case 4:
                if (day <= 21) {
                    System.out.println("The sign is aries");
                } else {
                    System.out.println("The sign is taurus");
                }
                break;
            case 5:
                if (day <= 20) {
                    System.out.println("The sign is taurus");
                } else {
                    System.out.println("The sign is gemini");
                }
                break;
            case 6:
                if (day <= 21) {
                    System.out.println("The sign is gemini");
                } else {
                    System.out.println("The sign is cancer");
                }
                break;
            case 7:
                if (day <= 22) {
                    System.out.println("The sign is cancer");
                } else {
                    System.out.println("The sign is virgo");
                }
                break;
            case 8:
                if (day <= 23) {
                    System.out.println("The sign is virgo");
                } else {
                    System.out.println("The sign is leo");
                }
                break;
            case 9:
                if (day <= 23) {
                    System.out.println("The sign is leo");
                } else {
                    System.out.println("The sign is libra");
                }
                break;
            case 10:
                if (day <= 23) {
                    System.out.println("The sign is libra");
                } else {
                    System.out.println("The sign is scorpius");
                }
                break;
            case 11:
                if (day <= 24) {
                    System.out.println("The sign is scorpius");
                } else {
                    System.out.println("The sign is sagitarius");
                }
                break;
            case 12:
                if (day <= 22) {
                    System.out.println("The sign is sagitarius");
                } else {
                    System.out.println("The sign is capricorn");
                }
                break;
        }
    }
}
