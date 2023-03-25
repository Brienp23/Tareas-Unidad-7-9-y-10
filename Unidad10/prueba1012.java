package Unidad10;

public class prueba1012 {
    public static void main(String[] args) {
        // crea objetos de las subclases
        Salario empleadoAsalariado = new Salario("Brien", "Luis", "18530630", 550.00);
        empleadoxhoras empleadoPorHoras = new empleadoxhoras("Brien", "Luis", "18530630", 18.50, 40);
        empleadocomision empleadoPorComision = new empleadocomision("Peña", "Montejo", "18531631", 910, .80);
        Comision empleadoBaseMasComision = new Comision("Juan", "Perez", "123-456-789", 2500, .07, 400);

        System.out.println("Empleados procesados por separado:");

        System.out.printf("%n%s%n%s: $%,.2f%n%n", empleadoAsalariado, "ingresos", empleadoAsalariado.ingresos());

        System.out.printf("%s%n%s: $%,.2f%n%n", empleadoPorHoras, "ingresos", empleadoPorHoras.ingresos());

        System.out.printf("%s%n%s: $%,.2f%n%n", empleadoPorComision, "ingresos", empleadoPorComision.ingresos());

        System.out.printf("%s%n%s: $%,.2f%n%n", empleadoBaseMasComision, "ingresos", empleadoBaseMasComision.ingresos());


        ejercicio1012[] empleados = new ejercicio1012[4];

     
        empleados[0] = empleadoAsalariado;
        empleados[1] = empleadoPorHoras;
        empleados[2] = empleadoPorComision;
        empleados[3] = empleadoBaseMasComision;

        System.out.println("Empleados procesados en forma polimorfica:\n");

      
        for (ejercicio1012 empleadoActual : empleados) {
            System.out.println(empleadoActual); 

  
            if (empleadoActual instanceof Comision) {
              
                Comision empleado = (Comision) empleadoActual;
                empleado.establecerSalarioBase(1.10 * empleado.obtenerSalarioBase());

                System.out.printf("el nuevo salario base con 10%% de aumento es: $%,.2f%n", empleado.obtenerSalarioBase());
            }

            System.out.printf("ingresos $%,.2f%n%n", empleadoActual.ingresos());
        } 

 
        for (int j = 0; j < empleados.length; j++) {
            System.out.printf("El empleado %d es un %s%n", j, empleados[j].getClass().getName());
        } 
    }
}
