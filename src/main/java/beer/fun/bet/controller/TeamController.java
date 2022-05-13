package beer.fun.bet.controller;

import beer.fun.bet.data.TeamData;
import beer.fun.bet.facade.TeamFacade;
import beer.fun.bet.form.TeamForm;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/teams1")
public class TeamController
{
    @Resource
    private TeamFacade teamFacade;

    @GetMapping
    public List<TeamData> getTeams() {
        return teamFacade.getAllTeams();
    }

    @PostMapping(value = "/add")
    public ResponseEntity<TeamData> createTeam(@RequestBody final TeamForm teamForm) {
        final TeamData teamData = teamFacade.createNewTeam(teamForm);

        return teamData != null ?
                 new ResponseEntity<>(teamData, HttpStatus.CREATED) :
                 new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}
