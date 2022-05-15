package beer.fun.bet.dao;

import beer.fun.bet.model.BetType;
import beer.fun.bet.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BetTypeDao extends JpaRepository<BetType, Integer>
{

}
