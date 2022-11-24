package ArraysExercises;

import java.util.Objects;

public class Friend {
    private String name;
    private boolean family;
    private int yearsKnow;
    private int friendShipLevel;

    public Friend(String name, boolean family, int yearsKnow, int friendShipLevel) {
        this.name = name;
        this.family = family;
        this.yearsKnow = yearsKnow;
        this.friendShipLevel = friendShipLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFamily() {
        return family;
    }

    public void setFamily(boolean family) {
        this.family = family;
    }

    public int getYearsKnow() {
        return yearsKnow;
    }

    public void setYearsKnow(int yearsKnow) {
        this.yearsKnow = yearsKnow;
    }

    public int getFriendShipLevel() {
        return friendShipLevel;
    }

    public void setFriendShipLevel(int friendShipLevel) {
        this.friendShipLevel = friendShipLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Friend)) return false;
        Friend friend = (Friend) o;
        return family == friend.family && yearsKnow == friend.yearsKnow && friendShipLevel == friend.friendShipLevel && Objects.equals(name, friend.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, family, yearsKnow, friendShipLevel);
    }

    @Override
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                ", family=" + family +
                ", yearsKnow=" + yearsKnow +
                ", friendShipLevel=" + friendShipLevel +
                '}';
    }
}
