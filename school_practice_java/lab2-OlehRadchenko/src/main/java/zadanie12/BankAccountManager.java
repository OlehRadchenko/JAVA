package zadanie12;

import java.util.ArrayList;
import java.util.HashMap;

public class BankAccountManager {
    private HashMap<String, BankAccount> accounts = new HashMap<>();
    private HashMap<BankOperationType, ArrayList<BankAccountOperation>> operations = new HashMap<>();
    private ArrayList<BankAccountOperation> op = new ArrayList<>();
    private boolean transaction;
    public boolean getTransaction(){
        return transaction;
    }

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
                    transaction=true;
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
                if(bankAccountOperations.get(i).getSourceBankAccount() == account && bankAccountOperations.get(i).getType()== BankOperationType.WITHDRAWAL){
                    if(account.getCurrentMoney()>bankAccountOperations.get(i).getMoney()) {
                        transaction=true;
                        account.subtractMoney(bankAccountOperations.get(i).getMoney());
                    }else{
                        transaction=false;
                    }
                }
            }
        }
    }
    public void performTransfers(){ //-$ na koncie 1 +$ na koncie 2
        for (String key : accounts.keySet()){
            BankAccount account = accounts.get(key);
            ArrayList<BankAccountOperation> bankAccountOperations = operations.get(BankOperationType.TRANSFER);
            for(int i=0; i<bankAccountOperations.size(); i++){
                if(bankAccountOperations.get(i).getSourceBankAccount() == account && bankAccountOperations.get(i).getType()== BankOperationType.TRANSFER){
                    if(account.getCurrentMoney()>bankAccountOperations.get(i).getMoney()) {
                        transaction=true;
                        BankAccount account2 = bankAccountOperations.get(i).getTargetBankAccount();

                        account.subtractMoney(bankAccountOperations.get(i).getMoney());
                        account2.addMoney(bankAccountOperations.get(i).getMoney());
                    }else{
                        System.out.println("Za malo pieniazkow. Musisz popracowac jeszcze ;c I dlatego przelew zostal odrzucony");
                        transaction=false;
                    }
                }
            }
        }
    }
}

