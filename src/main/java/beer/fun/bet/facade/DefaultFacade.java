package beer.fun.bet.facade;

import beer.fun.bet.data.Data;
import beer.fun.bet.form.Form;

import java.util.List;

public interface DefaultFacade<T extends Form, D extends Data>
{
   List<D> getAll();

   D create(final T form);
}
