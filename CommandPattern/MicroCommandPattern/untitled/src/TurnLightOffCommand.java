public class TurnLightOffCommand implements Command {
    Light light;
    public TurnLightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.Off();

    }


    @Override
    public void undo() {
        light.On();

    }
}
