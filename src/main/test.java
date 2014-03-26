package main;

public class test
{
   public static void main(String[] args)
   {
       Country test = new Country("Tropico","El Presidente",1000,5,0, 0);
       System.out.println(test.getName());
       System.out.println(test.getLeader());
       System.out.println(test.getPopulation());
       System.out.println(test.getStrength()+"%");
       System.out.println(test.getAlliance());
       System.out.println(test.getStability());
       
       Country UnitedStates = new Country("United States","Richard Nixon",160184192,100, 2, 3);
       System.out.println(UnitedStates.getName());
       System.out.println(UnitedStates.getLeader());
       System.out.println(UnitedStates.getPopulation());
       System.out.println(UnitedStates.getStrength()+"%");
       System.out.println(UnitedStates.getAlliance());
       System.out.println(UnitedStates.getStability());
       
       test.setName("asdf");
       UnitedStates.setName("NSA");
       System.out.println(UnitedStates.getName());
       System.out.println(test.getName());
   }
}
