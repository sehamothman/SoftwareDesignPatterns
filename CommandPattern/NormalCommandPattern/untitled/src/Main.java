//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Invoker remote = new Invoker();
        Light light = new Light();
        TurnLightOnCommand turnLightOnCommand = new TurnLightOnCommand(light);

        remote.setCommand(turnLightOnCommand);
        remote.buttonPressed();

        turnLightOnCommand.undo();


    }
}