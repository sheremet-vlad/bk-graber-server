package beer.fun.bet.dao.impl;

import beer.fun.bet.dao.ModelDao;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

@Repository
public class ModelDaoImpl<T> implements ModelDao<T>
{
   @Override
   public T save(Session session, T t)
   {
      return (T) session.save(t);
   }

   @Override
   public void saveOrUpdate(Session session, T t)
   {
      session.saveOrUpdate(t);
   }

   @Override
   public void remove(Session session, T t)
   {
      session.delete(t);
   }
}
