public class Actividad3_3 {
	public static void main(String[] args) {
        //imprimir hola		
        String saludo = "Hola";
		System.out.printf("%s \n", saludo);
        //imprimir hola + tu nombre
        String nombre = "Juanma";
        System.out.printf("%s %s \n",saludo,nombre);
        //Imprimir hola + tu nombre + edad
        Integer edad = 20;
        System.out.printf("%s, me llamo %s y tengo %d años\n" ,saludo,nombre, edad);
        //Nombre: edad:
        System.out.printf("Nombre:%s \nedad:%d \n" ,nombre,edad);
        //primero segundo tercero
        System.out.printf("Primero\\segundo\\tercero\\ \n");
        //3/2=1.5
        float operacion = (float) 3/2;
        System.out.printf("%.1f" ,operacion);
	}
}