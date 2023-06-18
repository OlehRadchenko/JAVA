package zadanie11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class BankAccountManager {
    /* Product productWithCode002 = productsByCode.get("002");

        System.out.println("Product z kodem 002 to " + productWithCode002.name);

        System.out.println("\n========== Wszystkie produkty ============\n");
        for (String key : productsByCode.keySet()){
            Product p = productsByCode.get(key);
            System.out.println("Product z kodem " + key + " to " + p.name);
        }*/
    private HashMap<String, BankAccount> accounts = new HashMap<>();
    private HashMap<BankOperationType, ArrayList<BankAccountOperation>> operations = new HashMap<>();
    private ArrayList<BankAccountOperation> op = new ArrayList<>();

    public void addAccount(BankAccount account) {
        accounts.put(account.getAccountNumber(), account);
    }

    public void registerOperation(BankAccountOperation operation) {
        op.add(operation);
        operations.put(operation.getType(), op);
    }
    public void performDeposits(){ //+$
        for (String key : accounts.keySet()){
            BankAccount account = accounts.get(key);
            ArrayList<BankAccountOperation> bankAccountOperations = operations.get(BankOperationType.DEPOSIT);
            for(int i=0; i<bankAccountOperations.size(); i++){
                if(bankAccountOperations.get(i).getSourceBankAccount() == account){
                    account.addMoney(bankAccountOperations.get(i).getMoney());
                }
            }
            //System.out.println(bankAccountOperations);
            //BankAccountOperation operation = operations.get(account.getAccountNumber());
            /*if(operation.getSourceBankAccount() == account) {
                account.addMoney(operation.getMoney()); NIE PATRZ W TE KOMENTARZE, SĄ BEZNADZIEJNI
            }*/
        }
    }
    public void performWithdrawals(){ //-$
        for (String key : accounts.keySet()){
            BankAccount account = accounts.get(key);
            ArrayList<BankAccountOperation> bankAccountOperations = operations.get(BankOperationType.WITHDRAWAL);
            for(int i=0; i<bankAccountOperations.size(); i++){
                if(bankAccountOperations.get(i).getSourceBankAccount() == account && bankAccountOperations.get(i).getType()==BankOperationType.WITHDRAWAL){
                    account.subtractMoney(bankAccountOperations.get(i).getMoney());
                }
            }
        }
    }
    public void performTransfers(){ //-$ na koncie 1 +$ na koncie 2
        for (String key : accounts.keySet()){
            BankAccount account = accounts.get(key);
            ArrayList<BankAccountOperation> bankAccountOperations = operations.get(BankOperationType.TRANSFER);
            for(int i=0; i<bankAccountOperations.size(); i++){
                if(bankAccountOperations.get(i).getSourceBankAccount() == account && bankAccountOperations.get(i).getType()==BankOperationType.TRANSFER){
                    BankAccount account2 = bankAccountOperations.get(i).getTargetBankAccount();

                    account.subtractMoney(bankAccountOperations.get(i).getMoney());
                    account2.addMoney(bankAccountOperations.get(i).getMoney());
                }
            }
        }
    }
}

