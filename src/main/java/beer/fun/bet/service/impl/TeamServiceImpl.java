package beer.fun.bet.service.impl;

import beer.fun.bet.dao.TeamDao;
import beer.fun.bet.data.TeamData;
import beer.fun.bet.form.TeamForm;
import beer.fun.bet.model.Team;
import beer.fun.bet.service.TeamService;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TeamServiceImpl implements TeamService
{
   private static final Logger LOG = LogManager.getLogger(TeamServiceImpl.class);

   @Resource
   private TeamDao teamDao;

   @Override
   public List<Team> getAll()
   {
      final List<Team> teams = teamDao.findAll();
      LOG.debug("teams: " + teams);
      return teams;
   }

   @Override
   public Team create(final TeamForm form)
   {
      if (!StringUtils.isNotEmpty(form.getName()))
      {
         LOG.info("Team can not be created as name null or empty");
         return null;
      }

      final Team team = new Team();
      team.setName(form.getName());
      teamDao.save(team);

      return team;
   }
}
