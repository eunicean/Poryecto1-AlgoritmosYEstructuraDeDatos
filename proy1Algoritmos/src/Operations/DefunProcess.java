/**
 * contenedor de operaciones aritmeticas
 *
 *@author Eunice Mata,Samantha Bhor
 */
package Operations;

public class DefunProcess implements IOperationsfile{
	private String Type;
	private String result;
	
	@Override
	public String getType() {
		return Type;
	}

	@Override
	public String getResult() {
		return result;
	}
	@Override
	public String maketheoperations() {
		return "La función dada de " + Type + " tiene asignado el valor " + result;

	}
	
	@Override
	public void Results(String Type, String result) {
		this.Type = Type;
		this.result = result;
	}
}
