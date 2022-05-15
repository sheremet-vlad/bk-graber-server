package beer.fun.bet.dao;

import beer.fun.bet.model.Match;
import beer.fun.bet.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchDao extends JpaRepository<Match, Integer>
{

}
