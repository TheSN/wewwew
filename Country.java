public class Country
{
    private int population=0;
    private int militarystr=0;
    private int ideology=0; //0=neutral, 1=pact, 2=nato
    private String leader="";
    
    public Country(String leaderset, int popset, int militaryset, int ideologyset)
    {
        leader=leaderset;
        population=popset;
        militarystr=militaryset;
        ideology=ideologyset;
    }
    
    public int getPopulation()
    {
        return population;
    }
    
    public int getStrength()
    {
        return militarystr;
    }
    
    public String getLeader()
    {
        return leader;
    }
    
    public int getIdeology()   
    {
        return ideology;
    }
    
}
