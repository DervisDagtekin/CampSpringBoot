package kodlama.io.rentACar.core.utilities.exceptions;

import java.util.Map;

public class ValidationProblemDetails extends ProblemDetails{
		public Map<String, String> getValidationErrors() {
		return validationErrors;
	}

	public void setValidationErrors(Map<String, String> validationErrors) {
		this.validationErrors = validationErrors;
	}

		private Map<String, String> validationErrors;
}
