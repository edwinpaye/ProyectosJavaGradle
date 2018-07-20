package Ventana;

public class Usuario {

    private String name = "";
    private String lastName = "";
    private String age = "";
    private String Ocupation = "";
    private String numReg = "";

    public Usuario(String name, String lastName, String age, String Ocupation, String numReg){
        this.name = name;
        this.lastName  = lastName;
        this.age = age;
        this.Ocupation = Ocupation;
        this.numReg = numReg;
    }
   
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the age
     */
    public String getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * @return the Ocupation
     */
    public String getOcupation() {
        return Ocupation;
    }

    /**
     * @param Ocupation the Ocupation to set
     */
    public void setOcupation(String Ocupation) {
        this.Ocupation = Ocupation;
    }

    /**
     * @return the numReg
     */
    public String getNumReg() {
        return numReg;
    }

    /**
     * @param numReg the numReg to set
     */
    public void setNumReg(String numReg) {
        this.numReg = numReg;
    }
    
 
}
