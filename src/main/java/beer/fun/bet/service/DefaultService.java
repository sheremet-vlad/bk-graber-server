package beer.fun.bet.service;

import beer.fun.bet.form.Form;
import beer.fun.bet.model.Model;

import java.util.List;

public interface DefaultService<T extends Model, D extends Form>
{
   List<T> getAll();

   T create(final D form);
}
