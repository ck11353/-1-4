package question4;

public class Product {
    private String number;
    private String name;
    private double price;
    private static int totalProductCount;
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
        //4.2
        Truck truck = new Truck("T-998");
        Drone drone = new Drone("D-007");
        TransportVehicle tv = truck;
        GPSLocatable tgp = truck;
        TransportVehicle dv = drone;
        GPSLocatable dgp = drone;
        System.out.println("卡车[" + tv.getVehicleId() + "] 当前位置：" + tgp.getLocation() + " | 配送10kg货物费用：" + truck.calculateCost(10) + "元");
        System.out.println("无人机[" + dv.getVehicleId() + "] 当前位置：" + dgp.getLocation() + " | 配送10kg货物费用：" + drone.calculateCost(10) + "元");
        //4.3
        StorageBox<Product> storageBox = new StorageBox<Product>();
        StorageBox<TransportVehicle> storageBox2 = new StorageBox<TransportVehicle>();
        storageBox.storeItem(p1);
        storageBox2.storeItem(drone);
        Product j = storageBox.retrieveItem();
        TransportVehicle k = storageBox2.retrieveItem();
        System.out.println("\uD83D\uDCE6商品储物箱存取测试：成功取出商品 ->" + j.getName());
        System.out.println("\uD83D\uDCE6商品储物箱存取测试：成功取出设备 ->" + k.toString());
    }

}
