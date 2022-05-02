package beer.fun.bet.model;

import javax.persistence.*;

@Entity
@Table(name = "team", schema = "graber")
public class Team
{
   private int id;

   private String name;

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
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

      Team team = (Team) o;

      if (id != team.id)
         return false;
      if (name != null ? !name.equals(team.name) : team.name != null)
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
