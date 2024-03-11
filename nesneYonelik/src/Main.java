//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
       creditManager creditManager=new creditManager();
       creditManager.add();
       creditManager.calculate();
       MortgageManager mortgageManager=new MortgageManager();
       mortgageManager.add();
       OfficerManager officerManager=new OfficerManager();
       officerManager.calculate();


       creditManager[] credits=new creditManager[2];
       credits[0]=new MortgageManager();
       credits[1]=new VechileManager();
      for (int i=0;i<credits.length;i++){
          credits[i].calculate();
      }

    }
}