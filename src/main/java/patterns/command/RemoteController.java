package patterns.command;

public class RemoteController {
    //开关按钮的命令数组
    Command[] onCommands;
    Command[] offCommands;
    //执行撤销的命令
    Command undoCommand;

    //构造器，完成初始化
    public RemoteController(){
        onCommands = new Command[5];
        offCommands = new Command[5];
        for (int i = 0; i < 5; i++) {
            offCommands[i] = new NoCommand();
            onCommands[i] = new NoCommand();
        }
    }

    //给按钮设置命令
    public void setCommand(int num,Command onCommand,Command offCommand){
        onCommands[num] = onCommand;
        offCommands[num] = offCommand;
    }

    //按下开按钮
    public void onButtonWasPushed(int num){
        onCommands[num].execute();
        //记录这次操作，用于撤销
        undoCommand = onCommands[num];
    }

    //按下关按钮
    public void offButtonWasPushed(int num){
        offCommands[num].execute();
        //记录这次操作，用于撤销
        undoCommand = offCommands[num];
    }

    //按下撤销按钮
    public void undoButtonWashPushed(){
        undoCommand.undo();
    }


}
