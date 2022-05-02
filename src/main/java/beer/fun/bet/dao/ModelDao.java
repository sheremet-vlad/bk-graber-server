package beer.fun.bet.dao;

import org.hibernate.Session;

public interface ModelDao<T>
{
   T save(final Session session, final T t);

   void saveOrUpdate(final Session session, final T t);

   void remove(final  Session session, final T t);
}
