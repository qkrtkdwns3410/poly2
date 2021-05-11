public class MainClass {
    public static void main(String[] args) {
        Actress actress = new Actress();
        actress.canCatch();
        actress.canCook();
    
        PoliceMan actressP = new Actress();
        actressP.canCatch();
    
        Chef actressC = new Actress();
        actressC.canCook();
    
        FireFighter actressF = new Actress();
        actressF.outFire();
    }
    
}
