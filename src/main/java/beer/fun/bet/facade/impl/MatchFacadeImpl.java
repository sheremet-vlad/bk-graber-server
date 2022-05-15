package beer.fun.bet.facade.impl;

import beer.fun.bet.converter.MatchConverter;
import beer.fun.bet.data.BetTypeData;
import beer.fun.bet.data.MatchData;
import beer.fun.bet.facade.MatchFacade;
import beer.fun.bet.form.BetTypeForm;
import beer.fun.bet.form.MatchForm;
import beer.fun.bet.model.BetType;
import beer.fun.bet.model.Match;
import beer.fun.bet.service.MatchService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MatchFacadeImpl implements MatchFacade
{
   @Resource
   private MatchService matchService;

   @Resource
   private MatchConverter matchConverter;

   @Override
   public List<MatchData> getAll()
   {
      return matchService.getAll().stream()
               .map(team -> matchConverter.convert(team))
               .collect(Collectors.toList());
   }

   @Override
   public MatchData create(final MatchForm form)
   {
      final Match match =  matchService.create(form);

      return match == null ? null : matchConverter.convert(match);
   }
}
