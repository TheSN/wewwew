public class Country
{
    private int population;
    private int militarystr;
    private int ideology;
    private String leader;
    
    public Country(String leaderset, int popset, int militaryset, int ideologyset)
    {
        leader=leaderset;
        population=popset;
        militarystr=militaryset;
        ideology=ideologyset;
    }
    
    public int getPopulation()
    {
        return 5;
    }
    
    public int getStrength()
    {
        int mltrystrength;
        return 2;
    }
    
    public String getLeader()
    {
    }
    
    public int getIdeology()   
    {
        return 2;
    }
    
}
