package org.brijframework.college.service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.brijframework.college.model.PO;

public interface CRUDService<I extends Serializable, T extends PO<I>> {

	@SuppressWarnings("hiding")
	public <T> List<T> findAll(Class<T> persistentClass);

	@SuppressWarnings("hiding")
	public <T> List<T> findAllByIsDeletedTrue(Class<T> persistentClass);

	@SuppressWarnings("hiding")
	public <T> List<T> findAllById(Class<T> persistentClass, I id);

	public T create(T po);

	public T createOrUpdate(T po);

	public void isDelete(I id, String entity);

	public T read(I id);

	public T getActive(Class<T> persistentClass, I id);

	public T update(T po);

	public void delete(T po);

	public int deleteById(I id);

	public <C extends Collection<T>> C create(C pos);

	public <C extends Collection<T>> C update(C pos);

	public <C extends Collection<T>> void delete(C pos);

	public <C extends Collection<I>> void deleteByIds(C ids);


}
