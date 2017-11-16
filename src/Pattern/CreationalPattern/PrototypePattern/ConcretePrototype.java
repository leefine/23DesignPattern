package Pattern.CreationalPattern.PrototypePattern;


import java.util.ArrayList;
import java.util.List;

public class ConcretePrototype extends Prototype {


    public void show() {
        System.out.println("My Age is" + this.getAge());
        System.out.println("My favorite Song is");
        for (String s : this.getLikeSong()) {
            if (s != null)
                System.out.println(s);
        }
    }


    public static void main(String[] args) {

        System.out.println("------------ Clone-------------------");
        {//clone
            ConcretePrototype cp = new ConcretePrototype();
            cp.setAge(18);
            List<String> lis = new ArrayList<>();
            lis.add("english");
            cp.setLikeSong(lis);

            System.out.println("原始");
            cp.show();

            ConcretePrototype clonecp1 = (ConcretePrototype) cp.clone();
            lis.add("chinese");
            System.out.println("浅拷贝后");
            clonecp1.show();
        }

        System.out.println("-----------------Deep Clone--------------");

        {//deep clone
            ConcretePrototype cp = new ConcretePrototype();
            cp.setAge(18);
            List<String> lis = new ArrayList<>();
            lis.add("english");
            cp.setLikeSong(lis);

            System.out.println("原始");
            cp.show();


            ConcretePrototype clonecp1 = (ConcretePrototype) cp.deepClone();
            lis.add("chinese");
            System.out.println("深拷贝后");
            clonecp1.show();
        }
    }
}  