
/**
 * Class SavingsAccount untuk menarik dan menabung
 *
 * Kelompok 5
 * @author Bryan Dario Lesmana (1806199940)
 * @author Idham Ramadhito (1806200293)
 * @author Muhammad Miftah Faridh (1806148782)
 * @author Nisrina Athallah (1806148813)
 * @version (02-06-2021)
 */
public class SavingsAccount
{
    private float balance;

    public SavingsAccount(float balance)
    {
        this.balance = balance;
    }
    
    /** 
     * Method withdraw digunakan untuk mengambil 
     * atau mengurangi uang dari balance yang dimiliki
     * @param anAmount Uang yang dikeluarkan
     */
    public void withdraw(float anAmount)
    {
        if (anAmount<0.0){
            throw new IllegalArgumentException("Withdraw amount negative");
        }
        synchronized(this){
            if (anAmount<=balance){
                balance = balance - anAmount;
            }
        }

    }

    
    /** 
     * Method deposit digunakan untuk menambah
     * uang dari balance yang dimiliki
     * @param anAmount uang yang dimasukkan
     */
    public void deposit(float anAmount)
    {
        if (anAmount<0.0){
            throw new IllegalArgumentException("Deposit amount negative");
        }

        synchronized(this){
            balance = balance + anAmount;
        }

    }



    
    /** 
     * Method tostring digunakan untuk melakukan
     * print variabel balance yang dimiliki
     * @return String jumlah balance
     */
    @Override
    public String toString() {
        return String.valueOf(balance);
    }
}
