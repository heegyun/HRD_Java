package my.day05.exam9;

import java.util.Scanner;

public class Teacher extends Person {

    private String tId; // 교번
    private String subject; // 과목

    @Override
    public String getId() {
        return tId;
    }

    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void setId(String id) {
        tId = id;
    }

    public String personInfo() {
        String info=super.personInfo() +"\n교번: "+tId +"\n담당과목: "+subject;
        return info;
    }
    @Override
    public void inputInfo() {
        super.inputInfo();
        //이름, 주소
        Scanner sc=new Scanner(System.in);
        System.out.println("교번을 입력하세요=>");
        String i=sc.nextLine();
        setId(i);
        System.out.println("담당과목을 입력하세요=>");
        String d=sc.nextLine();
        setSubject(d);
    }
    @Override
    public void printAll() {
        System.out.println(this.personInfo());
    }
}