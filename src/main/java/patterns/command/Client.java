package patterns.command;

public class Client {
    public static void main(String[] args) {
        //创建电灯对象
        LightReceiver receiver = new LightReceiver();
        //创建电灯相关的开关命令
        LightOffCommand lightOffCommand = new LightOffCommand(receiver);
        LightOnCommand lightOnCommand = new LightOnCommand(receiver);
        //创建遥控器
        RemoteController controller = new RemoteController();
        //设置命令
        controller.setCommand(0,lightOnCommand,lightOffCommand);

        //电灯打开
        controller.onButtonWasPushed(0);
        //电灯关闭
        controller.offButtonWasPushed(0);
        //撤销
        controller.undoButtonWashPushed();
    }
}
