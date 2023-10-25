public class A1_HowToMove extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        System.out.println("This message will be printed to the window below.");
        System.out.println("That window is called the dos window");
        plane.pausetime=2;
        plane.teleport(150,550);
        plane.isTrail = true;
        plane.trailWidth=20;
        //spine line (original line in pink)
        plane.setColor(240,5,175);
        plane.startingAngle(-90);
        plane.move(450);

        //set-up for coloring in
        plane.startingAngle(0);
        plane.move(15);
        plane.startingAngle(90);
        plane.move(450);
        plane.startingAngle(0);
        plane.move(350);

        //coloring in book
        for(int x=0;x<14;x=x+1)
        {
            plane.startingAngle(-90);
            plane.move(15);
            plane.startingAngle(180);
            plane.move(350);
            plane.startingAngle(-90);
            plane.move(15);
            plane.startingAngle(0);
            plane.move(350);

        }

        //outline to make it look like book
        plane.trailWidth=5;
        plane.setColor(0,0,2);

        //spine
        plane.teleport(150,565);
        plane.startingAngle(-90);
        plane.move(470);
        plane.startingAngle(0);
        plane.move(30);
        plane.startingAngle(90);
        plane.move(470);
        plane.startingAngle(180);
        plane.move(30);

        //outline of cover
        plane.startingAngle(0);
        plane.move(385);
        plane.startingAngle(-90);
        plane.move(465);
        plane.startingAngle(180);
        plane.move(385);

        plane.teleport(0,0);


    }

}

/*

Methods:
- move(int x)
   move() moves the plane forward by the number of pixels specified in the parameter.
   plane.move(10); moves the plane forward 10 pixels.

- startingAngle(int x)
   startingAngle() orients the plane at the angle specified in the parameter.
   plane.startingAngle(0); points the plane to the right.

Attributes:
- boolean isTrail
   isTrail controls whether or not the plane should leave a trail. It can be true or false.
   plane.isTrail = true; causes the plane to leave a trail.

*/