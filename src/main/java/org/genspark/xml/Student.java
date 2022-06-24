package org.genspark.xml;

import java.util.List;

public class Student
{
    private int id;
    private String name;
    private List<Phone> ph;
    private Address add;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Phone> getPh() {
        return ph;
    }

    public void setPh(List<Phone> ph) {
        this.ph = ph;
    }

    public Address getAdd() {
        return add;
    }

    public void setAdd(Address add) {
        this.add = add;
    }


    public void show() {
        System.out.println("id = "+ id +"\n"+"name = "+name+"\n"+"address = "+add.getCity()+","+add.getState()+","+add.getCountry()+","+add.getZipcode());
        if(ph != null){
            System.out.print("Phone = ");
            for (Phone phone:ph){
                System.out.print(phone.getMob()+ ",");
            }
        }

    }
}
