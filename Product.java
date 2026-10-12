package question4;

public class Product {
    private String number;
    private String name;
    private double price;
    private static int totalProductCount;    //ai验收时表示字段一般声明在方法上方，因此该声明没有按题目出现的顺序放在下面
    public String getNumber(){
        return number;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public void setNumber(String number){
        this.number = number;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public Product(){
        this("0000","无",0.0);
    }
    public Product(String number,String name,double price){
        totalProductCount++;
        this.number = number;
        this.name = name;
        this.price = price;
    }
    public static int getTotalProductCount(){
        return totalProductCount;
    }
    public static void main(String[] args) {
        Product p1 = new Product("p001","机械键盘",450.0);
        Product p2 = new Product("p002","蓝牙耳机",299.0);
        System.out.println("商品信息：[" + p1.getNumber() + "]" + p1.getName() + ",价格：" + p1.getPrice() + "元");
        System.out.println("商品信息：[" + p2.getNumber() + "]" + p2.getName() + ",价格：" + p2.getPrice() + "元");
        System.out.println("系统当前共创建了" + Product.getTotalProductCount() + "个商品实例");
    }
}
