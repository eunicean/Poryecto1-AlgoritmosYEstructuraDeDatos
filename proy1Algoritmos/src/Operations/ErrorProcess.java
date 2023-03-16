package Operations;

public class ErrorProcess implements IOperationsfile{
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
		return "Attention\n"+Type+"ERROR: "+result;
	}

	@Override
	public void Results(String Type, String result) {
		this.Type = Type;
		this.result = result;		
	}

}
