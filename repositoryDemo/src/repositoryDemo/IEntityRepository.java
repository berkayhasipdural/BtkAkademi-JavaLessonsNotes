package repositoryDemo;

public interface IEntityRepository<T> extends IEntity {
	void add(T Entity);
	void delete(T Entity);
	void update(T Entity);
	
}
