package beer.fun.bet.facade.impl;

import beer.fun.bet.converter.TeamConverter;
import beer.fun.bet.data.TeamData;
import beer.fun.bet.facade.TeamFacade;
import beer.fun.bet.form.TeamForm;
import beer.fun.bet.model.Team;
import beer.fun.bet.service.TeamService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TeamFacadeImpl implements TeamFacade
{
   @Resource
   private TeamService teamService;

   @Resource
   private TeamConverter teamConverter;

   @Override
   public List<TeamData> getAllTeams()
   {
      return teamService.getTeams().stream()
               .map(team -> teamConverter.convert(team))
               .collect(Collectors.toList());
   }

   @Override
   public TeamData createNewTeam(final TeamForm form)
   {
      final Team team =  teamService.createTeam(form.getName());

      return team == null ? null : teamConverter.convert(team);
   }
}
