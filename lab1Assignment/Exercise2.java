class Exercise2
{
static String colorOfLight(String color)
{
  if(color.equals("red"))
  {
    return "stop";
  }
else if(color.equals("yellow"))
{
return "ready";
}
else if(color.equals("green"))
{
return "go";
}

return "inappropriate color";
}
public static void main(String[] args)
{
System.out.println(colorOfLight("red"));
}
}
