import java.util.*;
interface  Student
{
int score=25;
void displayScore();
}
interface Sports
{
int score=10;
void displaySportsScore();
}
 
class Result implements Student,Sports
{
public void displayScore()
{
System.out.println("Academic Score:"+Student.score);
}
public void displaySportsScore()
{
System.out.println("Sports Score:"+Sports.score);
}
}
class SportStudents
{
public static void main(String[]args)
{
Result r=new Result();
r.displayScore();
r.displaySportsScore();
}
}

