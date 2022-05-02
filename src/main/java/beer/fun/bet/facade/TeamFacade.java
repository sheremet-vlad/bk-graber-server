package beer.fun.bet.facade;

import beer.fun.bet.data.TeamData;
import beer.fun.bet.form.TeamForm;

import java.util.List;

public interface TeamFacade
{
   List<TeamData> getAllTeams();

   TeamData createNewTeam(final TeamForm form);
}
