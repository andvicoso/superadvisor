package org.andvicoso.superadvisor.infra.dao;

import java.io.Serializable;
import java.util.List;

public interface GenericDAO {

	void execute(final String hql, final Object[] pParameters);

	<Entity> int count(Class<Entity> clazz);

	void delete(Object entity);

	<Entity> Entity getByExample(Entity example);

	<Entity> Entity getById(Serializable id, Class<Entity> clazz);

	<Entity> Entity getByQuery(Class<Entity> clazz, String query);

	<Entity> Entity getByQuery(Class<Entity> clazz, String query,
			Object... params);

	<Entity> List<Entity> list(Class<Entity> clazz);

	<Entity> List<Entity> list(Class<Entity> clazz, int firstResult,
			int maxResults);

	<Entity> List<Entity> listByExample(Entity example);

	<Entity> List<Entity> listByExample(Entity example, int firstResult,
			int maxResults);

	<Entity> List<Entity> listByQuery(Class<Entity> clazz, int firstResult,
			int maxResults, String query, Object... parans);

	<Entity> List<Entity> listByQuery(Class<Entity> clazz, String query,
			Object... parans);

	void save(Object entity);

	void saveOrUpdate(Object entity);

	void update(Object entity);

}
