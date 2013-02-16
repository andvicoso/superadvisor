package org.andvicoso.superadvisor.model.repository.base;

import java.util.List;

public interface ListRepository<T> {

	int count();

	List<T> list();

}
