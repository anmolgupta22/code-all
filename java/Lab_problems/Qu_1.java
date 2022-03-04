package Lab_problems;
class FootballTeam{
    private
   String Name_of_the_team;
    int number_of_wins;
    int number_of_losses;
   FootballTeam(String name_of_the_team,int number_of_wins,int number_of_losses) {
       this.Name_of_the_team = name_of_the_team;
       this.number_of_wins = number_of_wins;
       this.number_of_losses = number_of_losses;
   }
     FootballTeam(String name_of_the_team)
     {
this(name_of_the_team,0,0);
     }
     String getName_of_the_team()
     {
         return Name_of_the_team;

 }
 int getNumber_of_wins()
 {
     return number_of_wins;

 }
 int getNumber_of_losses()
 {
     return number_of_losses;
 }
void incrementWins()

{
number_of_wins++;
}
void incrementlosses()
{
number_of_losses++;
}
boolean goodrecod()
{
    if (number_of_wins>number_of_losses)
    {
        return true;
    }
    else
        return false;
}
}

public class Qu_1 {
    public static void main(String[] args) {

    }

}
