package beer.fun.bet.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "bet", schema = "graber")
public class Bet extends Model
{
   private int id;

   private int betTypeId;

   private int matchId;

   private int teamId;

   private double coef;

   private String bk1;

   private String bk2;

   private String bk3;

   private String bk4;

   private String bk5;

   private String bk6;

   private String bk7;

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
   @Column(name = "bet_type_id")
   public int getBetTypeId()
   {
      return betTypeId;
   }

   public void setBetTypeId(int betTypeId)
   {
      this.betTypeId = betTypeId;
   }

   @Basic
   @Column(name = "match_id")
   public int getMatchId()
   {
      return matchId;
   }

   public void setMatchId(int matchId)
   {
      this.matchId = matchId;
   }

   @Basic
   @Column(name = "team_id")
   public int getTeamId()
   {
      return teamId;
   }

   public void setTeamId(int teamId)
   {
      this.teamId = teamId;
   }

   @Basic
   @Column(name = "coef")
   public double getCoef()
   {
      return coef;
   }

   public void setCoef(double coef)
   {
      this.coef = coef;
   }

   @Basic
   @Column(name = "bk_1")
   public String getBk1()
   {
      return bk1;
   }

   public void setBk1(String bk1)
   {
      this.bk1 = bk1;
   }

   @Basic
   @Column(name = "bk_2")
   public String getBk2()
   {
      return bk2;
   }

   public void setBk2(String bk2)
   {
      this.bk2 = bk2;
   }

   @Basic
   @Column(name = "bk_3")
   public String getBk3()
   {
      return bk3;
   }

   public void setBk3(String bk3)
   {
      this.bk3 = bk3;
   }

   @Basic
   @Column(name = "bk_4")
   public String getBk4()
   {
      return bk4;
   }

   public void setBk4(String bk4)
   {
      this.bk4 = bk4;
   }

   @Basic
   @Column(name = "bk_5")
   public String getBk5()
   {
      return bk5;
   }

   public void setBk5(String bk5)
   {
      this.bk5 = bk5;
   }

   @Basic
   @Column(name = "bk_6")
   public String getBk6()
   {
      return bk6;
   }

   public void setBk6(String bk6)
   {
      this.bk6 = bk6;
   }

   @Basic
   @Column(name = "bk_7")
   public String getBk7()
   {
      return bk7;
   }

   public void setBk7(String bk7)
   {
      this.bk7 = bk7;
   }

   @Override
   public boolean equals(Object o)
   {
      if (this == o)
         return true;
      if (o == null || getClass() != o.getClass())
         return false;
      Bet bet = (Bet) o;
      return id == bet.id && betTypeId == bet.betTypeId && matchId == bet.matchId &&
               teamId == bet.teamId && Double.compare(bet.coef, coef) == 0 &&
               Objects.equals(bk1, bet.bk1) && Objects.equals(bk2, bet.bk2) &&
               Objects.equals(bk3, bet.bk3) && Objects.equals(bk4, bet.bk4) &&
               Objects.equals(bk5, bet.bk5) && Objects.equals(bk6, bet.bk6) &&
               Objects.equals(bk7, bet.bk7);
   }

   @Override
   public int hashCode()
   {
      return Objects.hash(id, betTypeId, matchId, teamId, coef, bk1, bk2, bk3, bk4, bk5, bk6, bk7);
   }
}
