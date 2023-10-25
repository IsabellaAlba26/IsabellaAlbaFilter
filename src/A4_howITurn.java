

public class A4_howITurn extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        plane.startingAngle(0);
        plane.isTrail = true;
        plane.trailWidth = 7;
        plane.setColor(255,171,203);

        //pentagon
        for(int x=0;x<5;x=x+1)
        {
            plane.move(100);
            plane.turn(72);
        }

        plane.teleport(269,626);
        plane.startingAngle(0);
        plane.setColor(252,142,172);

        //hexagon
        for(int x=0;x<6;x=x+1)
        {
            plane.move(100);
            plane.turn(60);
        }

        plane.teleport(540,332);
        plane.startingAngle(105);
        plane.setColor(252,28,89);

        //star

        for(int x=0;x<5;x=x+1)
        {
            plane.move(100);
            plane.turn(144);
            plane.move(100);
            plane.turn(72);
        }

        plane.teleport(663,539);

    }


}
