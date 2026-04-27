package Q01;

public class HotelApp {
    static void main(String[] args) {
        StandardRoom sr=new StandardRoom();
        LuxurySuite ls=new LuxurySuite("Alice Green",3,"305",true,true);
        sr.displayRoomDetails();
        System.out.println();
        ls.displayRoomDetails();
    }
}
