public class EjProgramacionPractica2 {
    //Declaramos el numero maximo como constante, ya que este no cambiara nunca durante la ejecucion del programa
    public static final int Max = 100;
    public static void main (String [] args){
        /*Declaramos las variables que usara el programa en su ejecucion, usando el metodo math.random para conseguir un numero aleatorio entre 0 y 1 y
        multiplicando este por 100 para tener un numero aleatorio entre 0 y 100 */
        Integer randomNumber = (int)(Math.random()*Max);
        //Variable auxiliar para dividir el numero aleatorio y saber su resto, adicionalmente usada para la condición del bucle
        int res = 1;
        //Bucle para 
        for (int i = 2; res !=0 ; i++){
            res = randomNumber%i;
            //Si el resultado es = a 0 y la variable i es diferente del numero aleatorio escribira en pantalla 'randomNumber "no es primo"'
            if(res == 0 && i != randomNumber){
                System.out.println(randomNumber + " No es primo");
            //Si el resultado es = a 0 y la variable i es igual al numero aleatorio escribira en pantalla 'randomNumber " es primo"'
            } else if (res==0 && i==randomNumber){
                System.out.println(randomNumber + " es primo");
            }
        }
    }
}