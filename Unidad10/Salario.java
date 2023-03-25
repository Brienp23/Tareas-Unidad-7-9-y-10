package Unidad10;

public class Salario extends ejercicio1012 {
	
	private double salarioSemanal;
	
	//constructor
	public Salario(String nombre, String apellidoPaterno, String numeroSocial, double salarioSemanal)
	{
		super(nombre, apellidoPaterno, numeroSocial);

		if(salarioSemanal<0.0)
		{
			throw new IllegalArgumentException("El salario semanal debe res  mayor o igual a 0.0");
		}
		
		this.salarioSemanal=salarioSemanal;

	}
	

	public void EstablecerSalarioSemanal(double salarioSemanal)
	{
		if(salarioSemanal<0.0)
		{
			throw new IllegalArgumentException("El salario semanal debe res  mayor o igual a 0.0");
		}
		
		this.salarioSemanal=salarioSemanal;
	}
	

	public double obtenerSalarioSemanal()
	{
		return salarioSemanal;
	}
	
	
	public double ingresos()
	{
		return obtenerSalarioSemanal();
	}
	
	
	public String toString()
	{
	return String.format("empleado asalariado: %s%n%s: $%,.2f",super.toString(), "Salario semanal", obtenerSalarioSemanal());
	}

	
	
	

}