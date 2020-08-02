package patterns.state;

/**
 * 状态接口
 */
public interface State {
    void deductMoney();//扣除积分 -50
    boolean raffle(); //是否抽中奖品
    void dispensePrize(); //发放奖品

}
