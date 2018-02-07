package ooplab9;

public class personApp {
    public static void main(String[] args) {
        Person person = new Person("086","rungaroon","59/1 M.1 T.NongHong A.ThungSong");
        System.out.println(person.toString());

        Address address =new Address("16","Nakhon Si Thamrat","80110");
        System.out.println(address.toString());

        job job = new job("sales",15000);
        System.out.println(job.toString());

        person.getJob().setSalary(30000);
               System.out.println("Name: "+person.getName()+
                       " Salary: "+person.getJob().getSalary());

    }//main
}//class
