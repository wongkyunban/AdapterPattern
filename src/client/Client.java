package client;

import inter.Target;

public class Client {

    private Target target;

    public Client(Target target){
        this.target = target;
    }

    public void whatIsTitle(){
        System.out.println(target.getTitle());
    }

    public void whoIsAuthor(){
        System.out.println(target.getAuthor());
    }

    public void WhenIsDistributed(){

        System.out.println(target.getDate());
    }
}
