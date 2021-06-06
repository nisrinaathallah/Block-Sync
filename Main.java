/**
 * Class Main untuk menjalankan program
 *
 * Kelompok 5
 * @author Bryan Dario Lesmana (1806199940)
 * @author Idham Ramadhito (1806200293)
 * @author Muhammad Miftah Faridh (1806148782)
 * @author Nisrina Athallah (1806148813)
 * @version (02-06-2021)
 */
public class Main 
{
    /**
     * Main method dari program
     * @param args Arguments
     */
    public static void main(String[] args) 
    {
        SavingsAccount savingsAccount = new SavingsAccount(5000);
        Thread t1 = new Thread(new Runnable() {
        public void run() {

        //looping digunakan sehingga program menjadi unpredictable
        for (int i = 0; i < 10; i++) {
        savingsAccount.deposit(3000);
        System.out.println("Balance after deposit : "  + savingsAccount.toString() + "\n");
        }
        }
        });
    
        Thread t2 = new Thread(new Runnable(){
        public void run() {
        for (int i = 0; i < 10; i++) {
        
        savingsAccount.withdraw(5000);
        System.out.println("Balance after withdraw : " + savingsAccount.toString() + "\n");

        }
        }
        });
        t1.start();
        t2.start();
    }
}
