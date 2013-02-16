package org.andvicoso.superadvisor.infra.validation;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

public interface ValidationHelper {

	Validator getValidator();

	<T> Set<ConstraintViolation<T>> validate(T bean);

	void validateBean(Object bean) throws ValidationException;

}
