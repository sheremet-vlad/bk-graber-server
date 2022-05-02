package beer.fun.bet.service.impl;

import beer.fun.bet.dao.TeamDao;
import beer.fun.bet.model.Team;
import beer.fun.bet.service.TeamService;
import beer.fun.bet.util.HibernateUtilities;

import java.util.Collections;

import com.mchange.v2.lang.StringUtils;
import org.hibernate.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TeamServiceImpl implements TeamService
{
   private static final Logger LOG = LoggerFactory.getLogger(TeamServiceImpl.class);

   @Resource
   private TeamDao teamDao;

   @Override
   public List<Team> getTeams()
   {
      try (final Session session = HibernateUtilities.openSession())
      {
         return teamDao.findAllTeams(session);
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }

      return Collections.emptyList();
   }

   @Override
   public Team createTeam(final String name)
   {
      if (!StringUtils.nonEmptyString(name))
      {
         LOG.info("Team can not be created as name null or empty");
         return null;
      }

      try (final Session session = HibernateUtilities.openSessionWithTransaction())
      {
         final Team team = new Team();
         team.setName(name);
         teamDao.saveOrUpdate(session, team);

         session.getTransaction().commit();

         return team;
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }

      return null;
   }
}
