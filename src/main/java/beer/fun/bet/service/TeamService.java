package beer.fun.bet.service;

import beer.fun.bet.model.Team;

import java.util.List;

public interface TeamService
{
   List<Team> getTeams();

   Team createTeam(final String name);
}
