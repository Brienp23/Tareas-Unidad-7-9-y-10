package Unidad9;


public class pruebaempleadoporcomision914 {

	public static void main(String[] args) 
	{

		empleadoporcomision914 empleado1=new empleadoporcomision914("Brien", "Luis", "032022", 5, 10);
		
		System.out.print("Empleado por comision.\n"
        		+          "Nombre:                    "+empleado1.obtenerPrimerNombre()+"\n"
        				 + "Primer apellido:           "+empleado1.obtenerApellidoPaterno()+"\n"
        				 + "Numero Socuial:            "+empleado1.obtenerNumeroSeguroSocial()+"\n"
                         + "Sueldo Mas Comision:       "+empleado1.ingresos());

	}

}