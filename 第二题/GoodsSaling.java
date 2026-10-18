package question2;

public class GoodsSaling {
    private String name = "机械键盘";
    private double price = 150.0;
    private int quantity = 10;
    private boolean isOnSale = false;
    private int buyQuantity = 2;
    private double totalPrice = price * buyQuantity;
    private boolean isFreeShipping = totalPrice >= 100 || isOnSale;
    public String show(){
        return "商品：" + name + "，" + "单价：" + price + "元，" + "促销中：" + isOnSale + "，" + "购买数量：" + buyQuantity + "件" + "，" + "总价：" + totalPrice + "元";
    }
    public static void main(String[] args){
        GoodsSaling goods = new GoodsSaling();
        System.out.println(goods.show());
        System.out.println("是否享受包邮：" + goods.isFreeShipping);
        int a = 10;    int b = 20;
        System.out.println("交换前a=" + a + "," + "b=" + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("交换后a=" + a + "," + "b=" + b);
    }
}

