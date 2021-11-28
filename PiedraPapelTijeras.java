
public class Ej02 {

    public static void main(String[] args) {

        int piedra = 1;
        int papel = 2;
        int tijera = 3;//inicializamos las tres variables
        boolean exit = false;
        //con la funcion math.random le damos un valor aleatorio entre 1 y 3
        do {
            double x = Math.random();
            x = (int) (x * 2 + 1);
            System.out.println("The first number is: " + x);

            double y = Math.random();
            y = (int) (y * 2 + 1);
            System.out.println("The second number is: " + y);
            System.out.println("-----------------------------");
            switch ((int) x) {
                case 1:
                    x = piedra;
                    System.out.println(x + " is rock");
                    break;
                case 2:
                    x = papel;
                    System.out.println(x + " is paper");
                    break;
                case 3:
                    x = tijera;
                    System.out.println(x + " is scissors");
                    break;
                default:
                    break;
            }
            switch ((int) y) {
                case 1:
                    y = piedra;
                    System.out.println(y + " is rock");
                    break;
                case 2:
                    y = papel;
                    System.out.println(y + " is paper");
                    break;
                case 3:
                    y = tijera;
                    System.out.println(y + " is scissors");
                    break;
                default:
                    break;
            }
            if (x < y) {
                System.out.println("-----------------------------");

                System.out.println("The first number win");
                exit = true;
            } else if (x > y) {
                System.out.println("-----------------------------");

                System.out.println("The second number win");
                exit = true;
            } else {
                System.out.println("-----------------------------");

                System.out.println("Draw! Try again");
                System.out.println("-----------------------------");

            }
        } while (!exit);

    }

}
