
package sprint_3;

import java.util.*;

public class getSetInformation {
    
    private String id;
    private String password;
    private String name;
    private int count;
    
    public getSetInformation(int count)
    {
        this.count = count;
    }
    
    
    public void setID(String id)
    {
        this.id = id;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setPassword(String password)
    {
        this.password = password;
    }
    
     public int getCount()
     {
         return (++count);
     }
    
    public String getID()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public String toString()
    {
        return String.format("%s   %s",id,name);
    }
     
}

