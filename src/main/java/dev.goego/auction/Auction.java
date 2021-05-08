package dev.goego.auction;

public class Auction {
    private Long id;
    private String name;
    private boolean isExpired = false;
    private int remainingTime = 60;
    private int currentBid = 0;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isExpired() {
        return isExpired;
    }

    public void setExpired(boolean expired) {
        isExpired = expired;
    }

    public int getRemainingTime() {
        return remainingTime;
    }

    public void setRemainingTime(int remainingTime) {
        this.remainingTime = remainingTime;
    }

    public int getCurrentBid() {
        return currentBid;
    }

    public void setCurrentBid(int currentBid) {
        this.currentBid = currentBid;
    }

    @Override
    public String toString() {
        return "Auction{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isExpired=" + isExpired +
                ", remainingTime=" + remainingTime +
                ", currentBid=" + currentBid +
                '}';
    }
}
