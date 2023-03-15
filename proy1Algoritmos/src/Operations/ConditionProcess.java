package Operations;

public class ConditionProcess implements IOperationsfile{
		private String key;
		private String result;
		
		///
		
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
			return "El resultado de la condicion dada es " + key + " es: " + result;

		}
		@Override
		public void Results(String key, String result) {
			this.key = key;
			this.result = result;
		}
}
