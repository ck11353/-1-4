package question4;

public class LogisticsOrder {
    private String orderNumber;
    private String sender;
    private String receiver;
    private boolean isFragile;
    private double insuredAmount;
    static class Builder {
        private String orderNumber;
        private String sender;
        private String receiver;
        private boolean isFragile;
        private double insuredAmount;
        Builder (String orderNumber) {
            this.orderNumber = orderNumber;
        }
        Builder setSender(String sender) {
            this.sender = sender;
            return this;
        }
        Builder setReceiver(String receiver) {
            this.receiver = receiver;
            return this;
        }
        Builder setIsFragile(boolean isFragile) {
            this.isFragile = isFragile;
            return this;
        }
        Builder setInsuredAmount(double insuredAmount) {
            this.insuredAmount = insuredAmount;
            return this;
        }
        LogisticsOrder build() {
            return new LogisticsOrder(this);
        }
    }
    private LogisticsOrder(Builder builder) {
        this.orderNumber = builder.orderNumber;
        this.sender = builder.sender;
        this.receiver = builder.receiver;
        this.isFragile = builder.isFragile;
        this.insuredAmount = builder.insuredAmount;
    }
    public String getOrderNumber() {
        return orderNumber;
    }
    public String getSender() {
        return sender;
    }
    public String getReceiver() {
        return receiver;
    }
    public boolean isFragile() {
        return isFragile;
    }
    public double getInsuredAmount() {
        return insuredAmount;
    }
}


