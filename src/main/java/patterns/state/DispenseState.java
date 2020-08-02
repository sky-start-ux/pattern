package patterns.state;

/**
 * 发放奖品的状态
 */
public class DispenseState implements State {
    //初始化时传入活动引用，发放奖品后，改其状态
    private RaffleActivity activity;

    public DispenseState(RaffleActivity activity) {
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("不能扣除积分");
    }

    @Override
    public boolean raffle() {
        System.out.println("不能抽奖");
        return false;
    }

    @Override
    public void dispensePrize() {
        if (activity.getCount() > 0){
            System.out.println("恭喜中奖了");
            activity.setState(activity.getNoRaffleState());
        }
        System.out.println("很遗憾，奖品发送完了");
        //改变状态为奖品发送完毕
        activity.setState(activity.getDispenseOutState());
    }
}
