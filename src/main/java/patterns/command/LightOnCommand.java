package patterns.command;

public class LightOnCommand implements Command{
    private LightReceiver lightReceiver;
    public LightOnCommand(LightReceiver light){
        this.lightReceiver = light;
    }

    @Override
    public void execute() {
        //调用接收者的方法
        lightReceiver.on();
    }

    @Override
    public void undo() {
        lightReceiver.off();
    }


}
