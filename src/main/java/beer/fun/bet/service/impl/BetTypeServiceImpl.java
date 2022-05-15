package beer.fun.bet.service.impl;

import beer.fun.bet.dao.BetTypeDao;
import beer.fun.bet.dao.TeamDao;
import beer.fun.bet.form.BetTypeForm;
import beer.fun.bet.form.TeamForm;
import beer.fun.bet.model.BetType;
import beer.fun.bet.model.Team;
import beer.fun.bet.service.BetTypeService;
import beer.fun.bet.service.TeamService;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BetTypeServiceImpl implements BetTypeService
{
   private static final Logger LOG = LogManager.getLogger(BetTypeServiceImpl.class);

   @Resource
   private BetTypeDao betTypeDao;

   @Override
   public List<BetType> getAll()
   {
      final List<BetType> betTypes = betTypeDao.findAll();
      LOG.debug("bet types: " + betTypes);
      return betTypes;
   }

   @Override
   public BetType create(final BetTypeForm form)
   {
      if (!StringUtils.isNotEmpty(form.getName()))
      {
         LOG.info("Bet type can not be created as name null or empty");
         return null;
      }

      final BetType betType = new BetType();
      betType.setName(form.getName());
      betTypeDao.save(betType);

      return betType;
   }
}
