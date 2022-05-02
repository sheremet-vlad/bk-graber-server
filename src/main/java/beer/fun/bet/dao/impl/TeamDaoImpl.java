package beer.fun.bet.dao.impl;

import beer.fun.bet.dao.TeamDao;
import beer.fun.bet.model.Team;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TeamDaoImpl extends ModelDaoImpl<Team> implements TeamDao
{
   @Override
   public List<Team> findAllTeams(Session session)
   {
      return session.createQuery("from Team", Team.class).list();
   }
}
