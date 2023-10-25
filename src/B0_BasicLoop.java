public class B0_BasicLoop extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        plane.isTrail=true;
        plane.pausetime=0;

       gridOfSmallSquares();
    }

    public void fives() {
        for (int x = 5; x < 36;x=x+5) {
            System.out.println(x);
        }
    }
    public void negatives() {
        for (int x = 5; x > -13;x=x-1) {
            System.out.println(x);
        }
    }

    //homework starts here:

    public void rowOfSmallSquares(){
        //in this method, create a long row of 10 pixel by 10 pixel squares
        plane.trailWidth=5;
        plane.teleport(15,259);
        //put your loop here
        for(int x=0;x<85;x=x+1) {
            System.out.println(x);
            plane.startingAngle(0);
            plane.square(10);
            plane.move(10);
        }

    }
    public void columnOfSmallSquares(){
        //in this method, create a long column of 10 pixel by 10 pixel squares
        plane.trailWidth=5;
        plane.teleport(114,17);
        plane.setColor(247,69,158);
        //put your loop here
        for(int x=0;x<70;x=x+1) {
            System.out.println(x);
            plane.startingAngle(90);
            plane.square(10);
            plane.move(10);
        }
    }
    public void gridOfSmallSquares() {
        //in this method, loop one of your previous two methods
        //your goal is to create a grid of squares
        //OPTIONAL EXTRA CHALLENGE can you make the squares fade from one color to another?

        plane.trailWidth = 5;
        plane.teleport(306, 409);

        //put your loop here
        for (int x = 0; x < 20; x = x + 1) {
            plane.setColor(x * 10, 65, 104);
            for (int y = 0; y < 20; y = y + 1) {
                plane.teleport((y+25)*12, (x+30)*12);
                plane.square(10);
                plane.teleport((x+25)*12, (y+30)*12);
                plane.square(10);
            }

        }


    }

}
