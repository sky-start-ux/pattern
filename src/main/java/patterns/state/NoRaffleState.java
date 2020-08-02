package patterns.state;

/**
 * 不能抽奖的状态
 */
public class NoRaffleState implements State {
    private RaffleActivity activity;

    public NoRaffleState(RaffleActivity raffleActivity) {
        this.activity = raffleActivity;
    }

    //当前状态可以扣积分，扣除后，将状态设置成可以抽奖状态
    @Override
    public void deductMoney() {
        System.out.println("扣除50积分成功，您可以抽奖了");
        activity.setState(activity.getCanRaffleState());
    }

    //当前状态不能抽奖
    @Override
    public boolean raffle() {
        System.out.println("扣了积分才能抽奖");
        return false;
    }

    //当前状态不能发奖品
    @Override
    public void dispensePrize() {
        System.out.println("不能发奖品");
    }
}
