package beer.fun.bet.model;

import javax.persistence.*;

@Entity
@Table(name = "bet_type", schema = "graber", catalog = "")
public class BetType
{
   private int id;

   private String name;

   @Id
   @Column(name = "id")
   public int getId()
   {
      return id;
   }

   public void setId(int id)
   {
      this.id = id;
   }

   @Basic
   @Column(name = "name")
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

      BetType betType = (BetType) o;

      if (id != betType.id)
         return false;
      if (name != null ? !name.equals(betType.name) : betType.name != null)
         return false;

      return true;
   }

   @Override
   public int hashCode()
   {
      int result = id;
      result = 31 * result + (name != null ? name.hashCode() : 0);
      return result;
   }
}
