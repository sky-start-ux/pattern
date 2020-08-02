package patterns.command;
//创建命令接口
public interface Command {
    //执行命令
    public void execute();
    //撤销命令
    void undo();
}
