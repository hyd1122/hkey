package summarize.dao;

public class PeopleImple implements People{
    @Override
    public String eat(String food) {
        System.out.println("吃"+food+"呀");
        return food;
    }
}
