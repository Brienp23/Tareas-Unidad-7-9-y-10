package Unidad9;

public class ejercicio99 {

	public static void main(String[] args) {
		 System.out.println(" RESPUESTA BASADA EN LA FIGURA 9.11 DEL LIBRO DE  COMO PROGRAMAR EDICION 10 \n");
	System.out.println("A) Suponga que la siguiente llamada a método se encuentra en un método ingresos sobrescrito en una\r\n"
			+ "subclase:\r\n"
			+ "super.ingresos()\n");
	
	System.out.println("Es una  sintaxis utilizada en la FIGURA 9.11 para\r\n"
			+ "invocar un método sobrescrito de la superclase desde una\r\n"
			+ "subclase,(se coloca la palabra clave super y un separador punto (.) antes del nombre del método de la superclase).\r\n"
			+ "Esta forma de invocar métodos es una\r\n"
			+ "buena práctica de ingeniería de software, ya que si un método realiza todas o algunas de las acciones \r\n"
			+ "que necesita otro método, se hace una llamada a éste en vez de duplicar su código. Al hacer que el método \r\n"
			+ "ingresos de EmpleadoBaseMasComision invoque al método ingresos de EmpleadoPorComision para\r\n"
			+ "calcular parte de los ingresos del objeto EmpleadoBaseMasComision,evitamos duplicar el código y sereducen\r\n"
			+ "los problemas de mantenimiento del mismo.\n");
	
	
	System.out.println("B) Suponga que la siguiente línea de código aparece antes de la declaración de un método:\r\n"
			+ "@Override\n");
	
	 System.out.println("simplemente se utiliza, para forzar al compilador a comprobar en \r\n"
	 		+ "tiempo de compilación que se esta sobrescribiendo correctamente el método, \r\n"
	 		+ "y de este modo evitar errores en tiempo de ejecución, \r\n"
	 		+ "los cuales serían mucho más difíciles de detectar.\n");
	 
	 System.out.println("C) Suponga que aparece la siguiente línea de código como la primera instrucción en el cuerpo de un constructor:\r\n"
	 		+ "super(primerArgumento, segundoArgumento)\n");
	 System.out.println("Es simple, el primer argumento es el valor del primer parámetro en la definición de la función.\r\n"
	 		+ "El segundo argumento es el valor del segundo parámetro en la definición de la función, y así sucesivamente\n");
	}
}
