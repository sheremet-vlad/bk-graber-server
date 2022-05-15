package beer.fun.bet.controller;

import beer.fun.bet.form.TeamForm;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/betTypes")
public class BetTypeController
{
    @GetMapping
    public List getTeams() {
        return new ArrayList<>();
    }

    @PostMapping(value = "/add")
    public ResponseEntity createBetType(@RequestBody final TeamForm teamForm) {
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
