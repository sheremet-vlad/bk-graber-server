package beer.fun.bet.converter;

import beer.fun.bet.data.BetTypeData;
import beer.fun.bet.data.TeamData;
import beer.fun.bet.model.BetType;
import beer.fun.bet.model.Team;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

@Service
public class BetTypeConverter implements Converter<BetType, BetTypeData>
{
   @Override
   public BetTypeData convert(BetType source)
   {
      final BetTypeData betTypeData = new BetTypeData();

      betTypeData.setId(source.getId());
      betTypeData.setName(source.getName());

      return betTypeData;
   }
}
