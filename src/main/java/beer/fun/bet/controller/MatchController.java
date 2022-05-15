package beer.fun.bet.controller;

import beer.fun.bet.data.MatchData;
import beer.fun.bet.data.TeamData;
import beer.fun.bet.facade.MatchFacade;
import beer.fun.bet.form.MatchForm;
import beer.fun.bet.form.TeamForm;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/matches")
public class MatchController
{
    @Resource
    private MatchFacade matchFacade;

    @GetMapping
    public List<MatchData> getMatches() {
        return matchFacade.getAll();
    }

    @PostMapping(value = "/add")
    public ResponseEntity<MatchData> createMatch(@RequestBody final MatchForm matchForm) {
        final MatchData matchData = matchFacade.create(matchForm);

        return matchData != null ?
                 new ResponseEntity<>(matchData, HttpStatus.CREATED) :
                 new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}
