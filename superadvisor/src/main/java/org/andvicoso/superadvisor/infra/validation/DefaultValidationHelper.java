package org.andvicoso.superadvisor.infra.validation;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

public class DefaultValidationHelper implements ValidationHelper {

	private ValidatorFactory validationFactory = Validation
			.buildDefaultValidatorFactory();

	@Override
	public Validator getValidator() {
		return validationFactory.getValidator();
	}

	@Override
	public <T> Set<ConstraintViolation<T>> validate(T bean) {
		return getValidator().validate(bean);
	}

	@Override
	public void validateBean(Object bean) throws ValidationException {
		Set<ConstraintViolation<Object>> constraintViolations = validate(bean);

		if (!constraintViolations.isEmpty()) {
			throw transformToException(constraintViolations);
		}
	}

	private <T> ValidationException transformToException(
			Set<ConstraintViolation<T>> constraintViolations) {
		List<String> messages = new ArrayList<String>();

		for (ConstraintViolation<?> constraintViolation : constraintViolations) {
			messages.add(constraintViolation.getMessage());
		}

		return new ValidationException(messages);
	}
}
