package Pattern.CreationalPattern.PrototypePattern;

import java.io.*;
import java.util.List;


/***
 * 原型模式实现克隆接口
 * 1.调用父类Object中的clone方法完成浅克隆，值类型克隆，引用类型不变
 * 2.使用序列化、反序列化进行深度克隆
 */
public class Prototype implements Cloneable, Serializable {

    private int age;
    private List<String> likeSong;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getLikeSong() {
        return likeSong;
    }

    public void setLikeSong(List<String> likeSong) {
        this.likeSong = likeSong;
    }


    public Prototype clone() {
        Prototype prototype = null;
        try {
            prototype = (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototype;
    }

    public Prototype deepClone() {
        try {
            ByteArrayOutputStream bo = new ByteArrayOutputStream();
            ObjectOutputStream oo = new ObjectOutputStream(bo);
            oo.writeObject(this);

            ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
            ObjectInputStream oi = new ObjectInputStream(bi);
            return (Prototype) oi.readObject();
        } catch (IOException | ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
    }


}