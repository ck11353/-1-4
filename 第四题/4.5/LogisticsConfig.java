package question4;

public class LogisticsConfig {
    private String systemName = "顺风智能仓储系统";
    private LogisticsConfig() {
    }
    private static LogisticsConfig instance = new LogisticsConfig();
    public static LogisticsConfig getInstance(){
        return instance;
    }
    public static void main(String[] args) {
        LogisticsConfig A = LogisticsConfig.getInstance();
        LogisticsConfig B = LogisticsConfig.getInstance();
        System.out.println("单例测试：配置类实例A与实例B是否相同？ -> " + (A == B));
        //task2
        TransportVehicle drone1 = VehicleFactory.createVehicle("Drone");
        drone1.calculateCost(10);
        System.out.println("工厂调度：工厂成功分配 -> \uD83D\uDE81" + drone1.toString() + "，计费启动...");
        //task3
        LogisticsOrder order = new LogisticsOrder.Builder("OD-999").setSender("Alice").setReceiver("Bob").setIsFragile(true).setInsuredAmount(1000.0).build();
        System.out.println("运单生成：订单号[" + order.getOrderNumber() + "]，寄件人[" + order.getSender() + "]，收件人[" + order.getReceiver() + "]，易碎品[" + order.isFragile() + "]，保价[" + order.getInsuredAmount() + "元]");
    }
}
