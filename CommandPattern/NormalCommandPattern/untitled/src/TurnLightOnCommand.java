public class TurnLightOnCommand implements Command {
    Light light;
    public TurnLightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.On();

    }


    @Override
    public void undo() {
        light.Off();

    }
}
