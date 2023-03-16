/**
 * contenedor de operaciones predicate
 *
 *@author Eunice Mata,Samantha Bhor
 */
package Operations;

public class AssigmentProcess implements IOperationsfile{
	private String Type;
	private String result;
	
	
	@Override
	public String maketheoperations() {
		return Type + " : " + result;

	}
	
	@Override
	public void Results(String Type, String result) {
		this.Type = Type;
		this.result = result;
	}
	@Override
	public String getType() {
		return Type;
	}

	@Override
	public String getResult() {
		return result;
	}
}
