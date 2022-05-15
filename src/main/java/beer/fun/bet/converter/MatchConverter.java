package beer.fun.bet.converter;

import beer.fun.bet.data.MatchData;
import beer.fun.bet.model.Match;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

@Service
public class MatchConverter implements Converter<Match, MatchData>
{
   @Override
   public MatchData convert(Match source)
   {
      final MatchData matchData = new MatchData();

      matchData.setId(source.getId());
      matchData.setName(source.getName());

      return matchData;
   }
}
