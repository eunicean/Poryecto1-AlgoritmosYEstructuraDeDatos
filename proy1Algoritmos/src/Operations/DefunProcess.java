package Operations;

public class DefunProcess implements IOperationsfile{
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
		return "La función dada" + key + " se da con el valor : " + result;

	}
	
	@Override
	public void Results(String key, String result) {
		this.key = key;
		this.result = result;
	}
}
