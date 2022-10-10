package day40_abstractClasses;

public class EKepekliEkmek extends CAbstractEkmek{


    @Override
    public void un() {
        System.out.println("kepekli ekmekte %30 kepek iceren un kullanilir");
    }

    @Override
    public void maya() {
        System.out.println("Kepekli ekmekte binde 1 oraninda maya kullanilir");
    }

    @Override
    public void bicim() {
        System.out.println("Kepekli ekmek farkli bicimlerde olabilir");
    }

    @Override
    public void gramaj() {
        System.out.println("Kepekli ekmek farkli gramajlarda olabilir");
    }

    public static void main(String[] args) {

        EKepekliEkmek obj=new EKepekliEkmek();
        obj.un();
        obj.maya();
        obj.bicim();
        obj.gramaj();

        DChildOfAbstractEkmek ekmek1= new DChildOfAbstractEkmek();

        ekmek1.un();
        ekmek1.maya();
        ekmek1.bicim();
        ekmek1.gramaj();

        EKepekliEkmek ekmek2= new EKepekliEkmek();

        ekmek2.un();
        ekmek2.maya();
        ekmek2.bicim();
        ekmek2.gramaj();
    }
}
