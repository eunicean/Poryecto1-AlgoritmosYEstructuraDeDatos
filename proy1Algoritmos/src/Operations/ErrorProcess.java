package Operations;

public class ErrorProcess implements IOperationsfile{
	private String Type;
	private String result;
	
	@Override
	public String maketheoperations() {
		return "Attention\n"+Type+": "+result;
	}

	@Override
	public void Results(String Type, String result) {
		this.Type = Type;
		this.result = result;		
	}

}
