public class Actress implements PoliceMan, FireFighter, Chef {
    @Override
    public void canCook() {
        System.out.println("요리가능");
    }
    
    @Override
    public void makeSpa() {
        System.out.println("스파게티만듬");
    }
    
    @Override
    public void outFire() {
        System.out.println("불끈다");
    }
    
    @Override
    public void saveMan() {
        System.out.println("사람살림");
    }
    
    @Override
    public void canCatch() {
        System.out.println("도둑을 잡습니다.");
    }
    
    @Override
    public void canSearch() {
        System.out.println("수색합닏.");
    }
}
