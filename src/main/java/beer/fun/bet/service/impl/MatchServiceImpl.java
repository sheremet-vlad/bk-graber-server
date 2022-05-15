package beer.fun.bet.service.impl;

import beer.fun.bet.dao.MatchDao;
import beer.fun.bet.form.MatchForm;
import beer.fun.bet.model.Match;
import beer.fun.bet.service.MatchService;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class MatchServiceImpl implements MatchService
{
   private static final Logger LOG = LogManager.getLogger(MatchServiceImpl.class);

   @Resource
   private MatchDao matchDao;

   @Override
   public List<Match> getAll()
   {
      final List<Match> matches = matchDao.findAll();
      LOG.debug("matches: " + matches);
      return matches;
   }

   @Override
   public Match create(final MatchForm form)
   {
      if (!StringUtils.isNotEmpty(form.getName()))
      {
         LOG.info("Match can not be created as name null or empty");
         return null;
      }

      final Match match = new Match();
      match.setName(form.getName());
      matchDao.save(match);

      return match;
   }
}
