
public class Ej06 {

    public static void main(String[] args) {
        int count;
        int num = 0;
        int num1=1;
        int suma=1;
        /* secuencia de fibonacci (0+1=1 / 1+1=2 / 1+2=3 / 2+3=5 / 3+5=8 / 5+8=13 / 8+13=21 / 13+21=34...)*/
        for (count = 10; count >= 0; count--) { //hacemos una cuenta regresiva partiendo de 10 hasta llegar a 0
            if(count!=10){
            suma=num +num1; //1=0+1 ---- 2=1+1---3=1+2 
            System.out.println(num1); //importante poner la impresion de resultados antes del cambio de valores...
            //... porque sino el uno solo se nos imprimiría una vez
            num = num1;//0=1 --- 1=1---1=2
            num1=suma;//1=1 ---1=2 ---2=3
                     
// para hacer la secuencia estamos cambiando todo el rato los valores de los números. La suma, compuesta por num + num1, pasa a ser num1 y num 1 pasa a ser num.
//siento la explicación, me ha costado muchisimo llegar a entenderlo y me cuesta aún más explicarlo
           }
        }}

}
