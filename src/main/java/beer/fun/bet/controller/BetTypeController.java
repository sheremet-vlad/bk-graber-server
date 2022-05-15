package beer.fun.bet.controller;

import beer.fun.bet.data.BetTypeData;
import beer.fun.bet.facade.BetTypeFacade;
import beer.fun.bet.form.BetTypeForm;
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
@RequestMapping(value = "/betTypes")
public class BetTypeController
{
    @Resource
    private BetTypeFacade betTypeFacade;

    @GetMapping
    public List<BetTypeData> getTeams() {
        return betTypeFacade.getAll();
    }

    @PostMapping(value = "/add")
    public ResponseEntity<BetTypeData> createBetType(@RequestBody final BetTypeForm betTypeForm) {
        final BetTypeData data = betTypeFacade.create(betTypeForm);

        return data == null ? new ResponseEntity<>(HttpStatus.BAD_REQUEST) :
                 new ResponseEntity<>(data, HttpStatus.CREATED);
    }
}
