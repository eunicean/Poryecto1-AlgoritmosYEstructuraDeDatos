/**
 * contenedor de operaciones predicate
 *
 *@author Eunice Mata,Samantha Bhor
 */
package Operations;

public class AssigmentProcess implements IOperationsfile{
	private String key;
	private String result;
	
	@Override
	public String getKey() {
		return this.key;
	}
	
	@Override
	public String getResult() {
		return this.result;
	}
	
	@Override
	public String maketheoperations() {
		return  "La Variable dada : " + key + " está asignada al valor " + result;

	}
	
	@Override
	public void Results(String key, String result) {
		this.key = key;
		this.result = result;
	}
}
