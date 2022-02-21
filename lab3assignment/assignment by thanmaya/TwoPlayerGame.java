class Game
{
private String player1;
private String player2;
Game(String player1,String player2)
{
this.player1=player1;	
this.player2=player2;
}
String getPlayer1()
{
return player1;	
}
public String getPlayer2()
{
return player2;	
}
}


class PlayMonitor
{
Game game;
String winningTracking="";
int matchWin(String winningTracking)
{ 
this.winningTracking=winningTracking;
int totalgames=0;
int wins=0;
for(int i=0;i<winningTracking.length();i++)
{
if(winningTracking.charAt(i)==',')
{
totalgames=totalgames+Character.getNumericValue(winningTracking.charAt(i-1));
wins=wins+Character.getNumericValue(winningTracking.charAt(i+1));
}
} 
int percentage=wins*100/totalgames;
return percentage;
}

int playerValidate(Game game) 
{
String player1=game.getPlayer1();
String player2=game.getPlayer2();
boolean v1=validatePlayerName(player1);
boolean v2=validatePlayerName(player2);
if(v1&&v2)
{
return 10;
}		
else if(v1||v2)
{
return 5;
}
else
{
return 0; 
}
}

boolean validatePlayerName(String str)
{
if(str.charAt(0)>='A' && str.charAt(0)<='Z')
{
for(int i=1;i<str.length();i++)
{
if(str.charAt(i)>='a' && str.charAt(i)<='z'||str.charAt(i)=='-' || str.charAt(i)==' ')
{				
continue;
}
else
{
return false;
}
}
return true;
}
else
{
return false;	
}	 
}
}


class TwoPlayerGame
{
public static void main(String[] args)
{
Game game=new Game("Dhoni","Virat");
PlayMonitor play=new PlayMonitor();
System.out.println("players validation result: "+play.playerValidate(game));
System.out.println("percentage of match winning :"+play.matchWin("3,2:5,2:2,0"));
}
}