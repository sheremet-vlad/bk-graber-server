package beer.fun.bet.facade.impl;

import beer.fun.bet.converter.BetTypeConverter;
import beer.fun.bet.data.BetTypeData;
import beer.fun.bet.data.TeamData;
import beer.fun.bet.facade.BetTypeFacade;
import beer.fun.bet.facade.TeamFacade;
import beer.fun.bet.form.BetTypeForm;
import beer.fun.bet.form.TeamForm;
import beer.fun.bet.model.BetType;
import beer.fun.bet.model.Team;
import beer.fun.bet.service.BetTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BetTypeFacadeImpl implements BetTypeFacade
{
   @Resource
   private BetTypeService betTypeService;

   @Resource
   private BetTypeConverter betTypeConverter;

   @Override
   public List<BetTypeData> getAll()
   {
      return betTypeService.getAll().stream()
               .map(team -> betTypeConverter.convert(team))
               .collect(Collectors.toList());
   }

   @Override
   public BetTypeData create(final BetTypeForm form)
   {
      final BetType betType =  betTypeService.create(form);

      return betType == null ? null : betTypeConverter.convert(betType);
   }
}
