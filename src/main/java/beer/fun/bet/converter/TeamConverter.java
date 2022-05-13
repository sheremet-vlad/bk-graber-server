package beer.fun.bet.converter;

import beer.fun.bet.data.TeamData;
import beer.fun.bet.model.Team;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

@Service
public class TeamConverter implements Converter<Team, TeamData>
{
   @Override
   public TeamData convert(final Team team)
   {
      final TeamData teamData = new TeamData();

      teamData.setId(team.getId());
      teamData.setName(team.getName());

      return teamData;
   }
}
