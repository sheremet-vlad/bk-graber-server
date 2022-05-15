package beer.fun.bet.data;

import java.util.Objects;

public class MatchData extends Data
{
   private int id;
   private String name;

   public int getId()
   {
      return id;
   }

   public void setId(int id)
   {
      this.id = id;
   }

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

      MatchData team = (MatchData) o;

      if (id != team.id)
         return false;
      return Objects.equals(name, team.name);
   }

   @Override
   public int hashCode()
   {
      int result = id;
      result = 31 * result + (name != null ? name.hashCode() : 0);
      return result;
   }
}
