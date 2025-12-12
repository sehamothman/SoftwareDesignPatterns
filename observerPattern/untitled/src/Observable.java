public interface Observable {
    Observer observer = null;
    //Observable which is obsereved by observers!
     void add(Observer o);
     void remove(Observer o);
     void broadcast();

}
