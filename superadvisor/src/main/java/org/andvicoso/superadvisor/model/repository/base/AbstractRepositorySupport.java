package org.andvicoso.superadvisor.model.repository.base;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.andvicoso.superadvisor.infra.dao.GenericDAO;
import org.andvicoso.superadvisor.infra.validation.ValidationHelper;

public abstract class AbstractRepositorySupport<T> implements SimpleRepository<T>, ListRepository<T> {

	protected GenericDAO		genericDAO;
	protected ValidationHelper	validationHelper;

	protected Class<T>			entityClass;

	@SuppressWarnings("unchecked")
	public AbstractRepositorySupport() {
		Class<?> clazz = this.getClass();
		while (clazz != null) {
			Type type = clazz.getGenericSuperclass();
			if (ParameterizedType.class.isAssignableFrom(type.getClass())) {
				this.entityClass = (Class<T>) ((ParameterizedType) type).getActualTypeArguments()[0];
				return;
			}
			clazz = clazz.getSuperclass();
		}
		throw new IllegalStateException("EntityClass not Found");
	}

	public int count() {
		return genericDAO.count(entityClass);
	}

	public T get(Long id) {
		return genericDAO.getById(id, entityClass);
	}

	public List<T> list() {
		return genericDAO.list(entityClass);
	}

	protected void validate(T entity) {
		validationHelper.validateBean(entity);
	}

	public void put(T entity) {
		validate(entity);
		genericDAO.saveOrUpdate(entity);
	}

	public void setGenericDAO(GenericDAO genericDAO) {
		this.genericDAO = genericDAO;
	}

	public void setValidationHelper(ValidationHelper validationHelper) {
		this.validationHelper = validationHelper;
	}

}
