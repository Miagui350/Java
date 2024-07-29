//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Task{
    private final String descripition;
    private boolean completed;

    public Task(String descripition) {
        this.descripition = descripition;
        this.completed = false; //o por que do false  e quando criar uma tarefa ela vai  ja começar incompleta ate ser realizada


    }
    // usando gatters e setters
    public String getDescripition(){
        return descripition;
    }
    public boolean isCompleted(){
        return completed;
    }

    public void setCompleted(boolean completed){
        this.completed = completed;

    }

}