package defaul;

public class Role{
    public String name;
    public int level;
    public String job;

    public void dosKill(){
        if(name.equals("劳拉")){
            System.out.println("技能：双枪老太婆");
        }else if(name.equals("孙悟空")){
            System.out.println("吃我一棒");
        }
    }
}