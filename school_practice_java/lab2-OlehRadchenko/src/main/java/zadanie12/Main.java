package zadanie12;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        String accountNumber1 = "PL 19 1240 6957 6648 5356 2227 1000"; //ALE TO DŁUGIE ZADANIE, NIE ZDĄŻYŁEM ZROBIĆ TEJ HISTORII ;c
        String accountNumber2 = "PL 96 1030 1090 1009 2214 7993 1993";
        String accountNumber3 = "PL 95 9279 0007 4775 7001 9528 9787";

        BankAccount kontoJanusza = new BankAccount(accountNumber1);
        BankAccount kontoZdzislawa = new BankAccount(accountNumber2);
        BankAccount kontoGrazyny = new BankAccount(accountNumber3);

        BankAccountManager bankAccountManager = new BankAccountManager();

        bankAccountManager.addAccount(kontoGrazyny);
        bankAccountManager.addAccount(kontoJanusza);
        bankAccountManager.addAccount(kontoZdzislawa);

        BankAccountOperation depositJanusza = new BankAccountOperation(BankOperationType.DEPOSIT);
        depositJanusza.setSourceBankAccount(kontoJanusza);
        depositJanusza.setMoney(1000.00);
        depositJanusza.setDate(LocalDateTime.now());

        BankAccountOperation depositGrazyny = new BankAccountOperation(BankOperationType.DEPOSIT);
        depositGrazyny.setSourceBankAccount(kontoGrazyny);
        depositGrazyny.setMoney(1300);
        depositGrazyny.setDate(LocalDateTime.now());

        BankAccountOperation depositZdzislawa = new BankAccountOperation(BankOperationType.DEPOSIT);
        depositZdzislawa.setSourceBankAccount(kontoZdzislawa);
        depositZdzislawa.setMoney(900);
        depositZdzislawa.setDate(LocalDateTime.now());


        bankAccountManager.registerOperation(depositGrazyny);
        bankAccountManager.registerOperation(depositJanusza);
        bankAccountManager.registerOperation(depositZdzislawa);

        bankAccountManager.performDeposits();
        System.out.println("======== Wplaty ========");
        System.out.println("Stan konta  Janusza: " +  kontoJanusza.getCurrentMoney());
        System.out.println("Stan konta  Grazyny: " +  kontoGrazyny.getCurrentMoney());
        System.out.println("Stan konta  Zdzislawa: " +  kontoZdzislawa.getCurrentMoney());


        BankAccountOperation wyplataSrodkowJanusza = new BankAccountOperation(BankOperationType.WITHDRAWAL);
        wyplataSrodkowJanusza.setMoney(1000); //DANE ZMIENIONE DLA TESTU
        wyplataSrodkowJanusza.setDate(LocalDateTime.now());
        wyplataSrodkowJanusza.setSourceBankAccount(kontoJanusza);

        bankAccountManager.registerOperation(wyplataSrodkowJanusza);

        bankAccountManager.performWithdrawals();
        System.out.println("======== Wyplaty ========");
        if(bankAccountManager.getTransaction()) {
            System.out.println("Stan konta  Janusza: " + kontoJanusza.getCurrentMoney());
        }else{
            System.out.println("Za malo pieniazkow. Musisz popracowac jeszcze ;c");
        }


        BankAccountOperation transferOdJanuszadoGrazyny = new BankAccountOperation(BankOperationType.TRANSFER);
        transferOdJanuszadoGrazyny.setSourceBankAccount(kontoJanusza);
        transferOdJanuszadoGrazyny.setTargetBankAccount(kontoGrazyny);
        transferOdJanuszadoGrazyny.setDate(LocalDateTime.now());
        transferOdJanuszadoGrazyny.setMoney(120);

        BankAccountOperation transferOdGrazynyDoZdzislawa = new BankAccountOperation(BankOperationType.TRANSFER);
        transferOdGrazynyDoZdzislawa.setSourceBankAccount(kontoGrazyny);
        transferOdGrazynyDoZdzislawa.setTargetBankAccount(kontoZdzislawa);
        transferOdGrazynyDoZdzislawa.setDate(LocalDateTime.now().plusDays(1));
        transferOdGrazynyDoZdzislawa.setMoney(200);

        BankAccountOperation transferOdZdzislawaDoJanusza = new BankAccountOperation(BankOperationType.TRANSFER);
        transferOdZdzislawaDoJanusza.setSourceBankAccount(kontoZdzislawa);
        transferOdZdzislawaDoJanusza.setTargetBankAccount(kontoJanusza);
        transferOdZdzislawaDoJanusza.setDate(LocalDateTime.now().minusDays(1));
        transferOdZdzislawaDoJanusza.setMoney(100);

        bankAccountManager.registerOperation(transferOdJanuszadoGrazyny);
        bankAccountManager.registerOperation(transferOdGrazynyDoZdzislawa);
        bankAccountManager.registerOperation(transferOdZdzislawaDoJanusza);

        System.out.println("======== Transfery ========");
        bankAccountManager.performTransfers();

        System.out.println("Stan konta  Janusza: " +  kontoJanusza.getCurrentMoney());
        System.out.println("Stan konta  Grazyny: " +  kontoGrazyny.getCurrentMoney());
        System.out.println("Stan konta  Zdzislawa: " +  kontoZdzislawa.getCurrentMoney());

    }
}