package todolist.youtube.com.codetutor.bean;

/**
 * Created by anildeshpande on 4/3/17.
 */

public class ToDo {
    /**
     * Created by anildeshpande on 4/3/17.
     */

    private long id;
    private String toDo;

    public ToDo(){
        super();
    }

    public ToDo(long id, String toDo){
        this.id=id;
        this.toDo=toDo;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getToDo() {
        return toDo;
    }

    public void setToDo(String toDo) {
        this.toDo = toDo;
    }
}
