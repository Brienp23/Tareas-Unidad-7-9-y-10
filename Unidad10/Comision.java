package Unidad10;

public class Comision extends empleadocomision
{
 private double salarioBase; // salario base por semana

// constructor
 public Comision(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double ventasBrutas,double tarifaComision, double salarioBase)
 {
     super(primerNombre, apellidoPaterno, numeroSeguroSocial, ventasBrutas, tarifaComision);
 
     if (salarioBase < 0.0) // valida el salarioBase
   	  {
   	  	throw new IllegalArgumentException("El salario base debe ser >= 0.0");
   	  }

     this.salarioBase = salarioBase;
 }

  public void establecerSalarioBase(double salarioBase)
  {	
	   if (salarioBase < 0.0) // valida el salarioBase
	   {
		   
		   throw new IllegalArgumentException("El salario base debe ser >= 0.0");
	   }
		   this.salarioBase = salarioBase;
  }
		 
  // devuelve el salario base
	public double obtenerSalarioBase()
	 {
		    return salarioBase;
	 }
		   

	public double ingresos()
	 {
		    return obtenerSalarioBase() + super.ingresos();
	 }
	
 // devuelve representación String de un objeto EmpleadoBaseMasComision
	 @Override
	public String toString()
	 {
		    return String.format("%s %s; %s: $%,.2f","con salario base", super.toString(),"salario base", obtenerSalarioBase());
	 }
}