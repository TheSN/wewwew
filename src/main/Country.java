package main;

public class Country
{
    private int pop=0;
    private int milstr=0;
    private int alliance=0; //0=neutral, 1=pact, 2=nato
    private int stability=0; //goes from -3 to +3
    private String leader="";
    private String name="";
    
    public Country(String nameset, String leaderset, int popset, int milset, int allianceset, int stabilityset)
    {
        this.name=nameset;
        this.leader=leaderset; //what "this" means is that it is referring to the particular instance of Country that is calling this method
        this.pop=popset;
        this.milstr=milset;
        this.alliance=allianceset;
        this.stability=stabilityset;
    }
    
    public int getPopulation()
    {
        return pop;
    }
    
    public void setPopulation(int popset) 
    {
        this.pop=popset;
    }
    
    public int getStrength()
    {
        return this.milstr;
    }
    
    public void setStrength(int strset) 
    {
        this.milstr=strset;
    }
    
    public String getLeader()
    {
        return leader;
    }
    
    public void setLeader(String leaderset)
    {
        this.leader=leaderset;
    }
    
    public int getStability() 
    {
        return stability;
    }
    
    public void setStability(int stabilityset) 
    {
        this.stability=stabilityset; 
    }

    public int getAlliance() 
    {
        return alliance;
    }

    public void setAlliance(int allianceset) 
    {
        this.alliance = allianceset;
    }
    

    public String getName() 
    {
        return name;
    }
    

    public void setName(String nameset) 
    {
        this.name = nameset;
    }
    

}
