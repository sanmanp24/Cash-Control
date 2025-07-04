
package cashcontrolfx.model;



public class Accounts {
    
    String accountNumber;
    String owner;

    /**
     * Init a Account object with all of its data
     * @param accountNumber
     * @param owner 
     */
    public Accounts( 
        String accountNumber,
        String owner 
    ){
        
        this.accountNumber = accountNumber;
        this.owner = owner;
        
    }
    
    /**
     * Save a new account number in Account object
     * @param newAccountNumber 
     */
    public void setAccountNumber( String newAccountNumber ){ this.accountNumber = newAccountNumber; }
    
    /**
     * Get the account number from Account object
     * @return String
     */
    
    public String getAccountNumber() { return this.accountNumber; } 
    
    /**
     * Save a new owner in Account object
     * @param newOwner 
     */
    
    public void setOwner( String newOwner ){ this.owner = newOwner; }
    
    /**
     * Get the owner from Account object
     * @return String
     */
    
    public String getOwner() { return this.owner; }
    
    @Override
    public String toString(){ 
                    
       return this.accountNumber + 
               ";" + 
               this.owner;
       
    }
    
}
