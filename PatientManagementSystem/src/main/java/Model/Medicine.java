/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author wmasters
 */
public class Medicine {
    
    private String name;
    private String description;
    
    /**
     *
     * @param name
     * @param description
     */
    public Medicine(String name, String description) { 
        this.name = name;
        this.description = description;
    }
    
    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }
    
    /**
     *
     * @return
     */
    public String getDescription() {
        return description;
    }
    
    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
