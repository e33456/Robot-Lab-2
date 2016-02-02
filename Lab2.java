public class Lab2
{
  public static void testLightCandles1()
  {
    Robot.load("candles1.txt");
    Robot.setDelay(0.05);
    
    Lab2.lightCandles();
  }
  
  public static void testLightCandles2()
  {
    Robot.load("candles2.txt");
    Robot.setDelay(0.05);
    Lab2.lightCandles();
  }
    
  public static void lightCandles()
  {
    //insert instructions below
   Lab2.lightOneCandle ();
   Lab2.lightOneCandle ();
   Lab2.lightOneCandle ();
   Lab2.lightOneCandle ();
   Lab2.lightOneCandle ();
   Lab2.lightOneCandle ();
   Lab2.lightOneCandle ();
   Lab2.lightOneCandle ();
   Lab2.lightOneCandle ();
   Lab2.lightOneCandle ();
  }
  
  public static void lightOneCandle()
  {
     Robot.turnLeft ();
    Robot.move ();
    if (!rightIsClear ())
    {
      Robot.move ();
    }
    
      Lab2.turnRight ();
      Robot.move ();
      Robot.makeDark ();
      Robot.move ();
      Lab2.turnRight ();
      Robot.move ();
    
    if (Robot.frontIsClear ())
    {
      Robot.move ();
      Robot.turnLeft ();
    }
    else
    {
      Robot.turnLeft ();
    }
  }
  
  
  public static boolean rightIsClear ()
  {
   Lab2.turnRight ();
   if (Robot.frontIsClear ())
   {
  Robot.turnLeft ();
     return true ;
   }
   else
   {
     Robot.turnLeft ();
   return false ;
  }
  }
   
  public static void turnRight ()
  {
    Robot.turnLeft ();
  Robot.turnLeft () ;
  Robot.turnLeft ();
  }
    
  //Run this method to test completeRoom on map room1.txt
  public static void testCompleteRoom1()
  {
     Robot.load("room1.txt");
     Robot.setDelay(0.05);
     Lab2.completeRoom();
  }
  
  //Run this method to test completeRoom on map room2.txt
  public static void testCompleteRoom2()
  {
    Robot.load("room2.txt");
    Robot.setDelay(0.05);
    Lab2.completeRoom();
  }
  
  //Complete this method.  You will need to write additional helper methods.
  public static void completeRoom()
  {
    //insert instructions below
  
  if (Lab2.leftIsClear ())
  {
   Robot.turnLeft ();
    Robot.move () ;
    Robot.turnLeft ();
    Robot.turnLeft ();
    Robot.move ();
    Robot.turnLeft ();
    }
    else
    {
      Robot.makeDark ();
    }
  } 

  
  public static boolean leftIsClear ()
  {
    Robot.turnLeft ();
    if (Robot.frontIsClear ())
    {
      Lab2.turnRight ();
      return true;
    }
    else
    {
      Lab2.turnRight ();
      return false;
    }
  }
  
  //Run this method to test swapAll on map swap1.txt
  public static void testSwapAll1()
  {
    Robot.load("swap1.txt");
    Robot.setDelay(0.05);
    Lab2.swapAll();
  }
  
  //Run this method to test swapAll on map swap2.txt
  public static void testSwapAll2()
  {
    Robot.load("swap2.txt");
    Robot.setDelay(0.05);
    Lab2.swapAll();
  }

  //Complete this method.  You will need to write additional helper methods.
  public static void swapAll()
  {
    //insert instructions below
  
  
  
  }
}