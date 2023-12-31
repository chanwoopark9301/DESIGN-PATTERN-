public interface Subject {
    public void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}