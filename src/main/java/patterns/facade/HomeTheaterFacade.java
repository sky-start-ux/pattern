package patterns.facade;

public class HomeTheaterFacade {
    //各种子系统
    private DVDPlayer dvdPlayer = null;
    private Popcorn popcorn = null;

    public HomeTheaterFacade() {
        this.dvdPlayer = DVDPlayer.getInstance();
        this.popcorn = Popcorn.getInstance();
    }

    public void ready(){
        dvdPlayer.on();
        popcorn.on();
    }

    public void play(){
        dvdPlayer.play();
        popcorn.pop();
    }

    public void off(){
        dvdPlayer.off();
        popcorn.off();
    }
}
