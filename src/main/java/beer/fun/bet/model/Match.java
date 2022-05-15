package beer.fun.bet.model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "match", schema = "graber")
public class Match extends Model
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
   @Column(name = "date")
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

      Match match = (Match) o;

      if (id != match.id)
         return false;
      return Objects.equals(name, match.name);
   }

   @Override
   public int hashCode()
   {
      int result = id;
      result = 31 * result + (name != null ? name.hashCode() : 0);
      return result;
   }
}
