package Unidad9;

public class pruebaempleadobasemascomision914 {

	public static void main(String[] args)
	{
		
    empleadobasemascomision914 empleado1=new empleadobasemascomision914("Brien", "Luis", "032022", 5, 10, 200);
    		
  
        System.out.print("Empleado por comision.\n"
        		+          "Nombre:                    "+empleado1.obtenerPrimerNombre()+"\n"
        				 + "Primer apellido:           "+empleado1.obtenerApellidoPaterno()+"\n"
        				 + "Numero Socuial:            "+empleado1.obtenerNumeroSeguroSocial()+"\n"
                         + "Sueldo Base Mas Comision:  "+empleado1.ingresos());
	
	}

}
