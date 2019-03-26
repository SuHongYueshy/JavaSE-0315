/*
package interview;

import java.util.*;
import java.util.stream.Collector;

public class Record {
    private int id;
    private String name;
    private String phone;

    public Record(){

    }
public Record (String name,String phone){
        this.name = name;
        this.phone = phone;
}
public int getId(){
        return id;
    }
public void setId(int id){
    this.id = id;
}
public String getName(){
        return name;
}
public void setName(String name){
        this.name = name;
}
public String getPhone(){
        return phone;
}
public void setPhone(String phone){
        this.phone = phone;
}
@Override
    public String toString(){
        return name +":" + phone + "";
    }

    public int compareTo(Record o) {
        return Collector.getInstance(Locale.CHINESE).compare(this.name,o.getName());
    }
    }
    public class CommunicationRecord{
    private int size = 0;
    private List<Record> list = new ArrayList<Record>();
    public CommunicationRecord(){

    }
    public int getSize(){
        return size;
    }
    public void add(Record r ){
        if (r != null){
            list.add(r);
           Collections.sort(list);
        }
    }
    @Override
        public String toString(){
        return list.toString();
    }

        public static void main(String[] args) {
            CommunicationRecord c = new CommunicationRecord();
            c.add(new Record("A","aaa"));
            c.add(new Record("B","bbb"));
            c.add(new Record("C","ccc"));
            System.out.println(c);
        }
    }
*/
