package patterns.state;

import jdk.nashorn.internal.ir.CallNode;

//抽奖活动
public class RaffleActivity {
    private State state = null; //表示活动当前的状态
    int count = 0; //奖品数量

    public RaffleActivity(int count) {
        this.state = getNoRaffleState();
        this.count = count;
    }

    State noRaffleState = new NoRaffleState(this);
    State canRaffleState = new CanRaffleState(this);
    State dispenseState = new DispenseState(this);
    State dispenseOutState = new DispenseOutState(this);

    //扣分，调用当前状态的deductMoney
    public void deductMoney(){
        state.deductMoney();
    }

    //抽奖
    public void raffle(){
        //如果当前的状态是抽奖成功
        if (state.raffle())
            state.dispensePrize();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        int curCount = count;
        count --;
        return curCount;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public State getNoRaffleState() {
        return noRaffleState;
    }

    public void setNoRaffleState(State noRaffleState) {
        this.noRaffleState = noRaffleState;
    }

    public State getCanRaffleState() {
        return canRaffleState;
    }

    public void setCanRaffleState(State canRaffleState) {
        this.canRaffleState = canRaffleState;
    }

    public State getDispenseState() {
        return dispenseState;
    }

    public void setDispenseState(State dispenseState) {
        this.dispenseState = dispenseState;
    }

    public State getDispenseOutState() {
        return dispenseOutState;
    }

    public void setDispenseOutState(State dispenseOutState) {
        this.dispenseOutState = dispenseOutState;
    }
}
