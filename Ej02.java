
public class Ej02 {

    public static void main(String[] args) {
        int x;
        int y;
        int piedra = 1;
        int papel = 2;
        int tijera = 3;//inicializamos las tres variables
        boolean exit = false; //con el valor de boolean hacemos lo que sera una salida de los bucles.
        // no queremos salir del bucle a menos que exit=true
        //con la funcion math.random le damos un valor aleatorio entre 1 y 3
        do {
            //la función math.random siempre nos da los valores en double asi que los promocionamos a int
            double a = Math.random();
            x = (int) (a * 2 + 1);
            System.out.println("The first number is: " + x);

            double b = Math.random();
            y = (int) (b * 2 + 1);
            System.out.println("The second number is: " + y);
            System.out.println("-----------------------------");
            // con un switch asignamos el valor de x a piedra, papel o tijera
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
                        // con un switch asignamos el valor de x a piedra, papel o tijera

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
            //comparamos que valor es mayor a cual con un if AIXO ESTA MALAMENT
           
            if(x==y){
                System.out.println("-----------------------------");

                System.out.println("Draw! Try again");
                System.out.println("-----------------------------");
            }else if ((x==1 && y==3 || x==2 &&y==1||x==3&&y==2)){
                System.out.println("-----------------------------");

                System.out.println("The first number win");
                exit = true;// como hemos conseguido un ganador y queremos salir del bucle, cambiamos el valor del exit a true
            }else{
                System.out.println("-----------------------------");

                System.out.println("The second number win");
                exit = true;// como hemos conseguido un ganador y queremos salir del bucle, cambiamos el valor del exit a true
            
            }
        } while (!exit);

    }

}
