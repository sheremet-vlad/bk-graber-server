package beer.fun.bet.form;

import java.util.Objects;

public class BetTypeForm extends Form
{
   private String name;

   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   @Override
   public boolean equals(Object o)
   {
      if (this == o)
         return true;
      if (o == null || getClass() != o.getClass())
         return false;
      BetTypeForm teamForm = (BetTypeForm) o;
      return Objects.equals(name, teamForm.name);
   }

   @Override
   public int hashCode()
   {
      return Objects.hash(name);
   }
}
