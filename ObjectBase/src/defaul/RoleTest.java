package defaul;

public class RoleTest{

    public static void main(String[] args){

        Role role1 = new Role();//栈空间放role1，Role()实例化在堆空间
        role1.name = "劳拉";
        role1.level = 25;
        role1.job = "摸金校尉";
        role1.dosKill();

        Role role2;
        role2 = new Role();//heap 空间
        role2.job = "神仙";
        role2.name = "孙悟空";
         role2.dosKill();
    }
}