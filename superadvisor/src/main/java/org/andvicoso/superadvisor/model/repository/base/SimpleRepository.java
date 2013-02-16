package org.andvicoso.superadvisor.model.repository.base;

public interface SimpleRepository<T> {

	void put(T entity);

	T get(Long id);

}
