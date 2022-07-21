package Pizza;

public abstract class Pizza {
    // these classes should be changd : show the varible propertese
    abstract void getName();

    // concrete methods which cannot be changed in the inherited classes
    // show the contant propetese
    final public void bake (){
        System.out.println("bake");
    }
    final public void pack(){
        System.out.println("pack");
    }
    final public void deliver(){
        System.out.println("deliver");
    }

    final public void cutPizza(){
        System.out.println("cut pizza");
    }
}
