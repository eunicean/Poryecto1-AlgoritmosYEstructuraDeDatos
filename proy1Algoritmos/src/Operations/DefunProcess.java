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
		return this.Type;
	}
	
	@Override
	public String getResult() {
		return this.result;
	}
	
	@Override
	public String maketheoperations() {
		return "La función dada" + Type + " se da con el valor : " + result;

	}
	
	@Override
	public void Results(String Type, String result) {
		this.Type = Type;
		this.result = result;
	}
}
