package beer.fun.bet.dao;

import beer.fun.bet.model.Team;
import org.hibernate.Session;

import java.util.List;

public interface TeamDao extends ModelDao<Team>
{
   List<Team> findAllTeams(final Session session);
}
