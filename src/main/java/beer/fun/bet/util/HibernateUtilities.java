package beer.fun.bet.util;

import beer.fun.bet.model.Bet;
import beer.fun.bet.model.BetType;
import beer.fun.bet.model.Match;
import beer.fun.bet.model.Team;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Service;

@Service
public class HibernateUtilities
{

   private static SessionFactory sessionFactory;

   public static synchronized SessionFactory getInstance()
   {
      if (sessionFactory == null)
      {
         Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
         StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                  .applySettings(configuration.getProperties());
         sessionFactory = configuration
                  .addAnnotatedClass(Bet.class)
                  .addAnnotatedClass(BetType.class)
                  .addAnnotatedClass(Match.class)
                  .addAnnotatedClass(Team.class)
                  .buildSessionFactory(builder.build());
      }
      return sessionFactory;
   }

   public static Session openSessionWithTransaction()
   {
      SessionFactory sessionFactory = getInstance();
      Session session = sessionFactory.openSession();
      session.beginTransaction();
      session.setDefaultReadOnly(true);

      return session;
   }

   public static void closeSessionAndRollbackTransaction(Session session)
   {
      session.getTransaction().rollback();
      session.close();
   }

   public static Session openSession()
   {
      SessionFactory sessionFactory = getInstance();
      Session session = sessionFactory.openSession();

      return session;
   }

   public static void closeSession(Session session)
   {
      session.close();
   }
}

