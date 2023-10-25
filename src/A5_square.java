public class A5_square extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        plane.isTrail = true;
        plane.trailWidth = 5;
        plane.pausetime = 0;
        plane.setColor(200, 0, 0);

        plane.startingAngle(90);
        plane.teleport(595, 551);
        XmasTree();
        plane.teleport(781,573);
        XmasPresent();
        plane.teleport(52,687);
        Skyscrapers3();
        plane.teleport(49,69);

    }

    //this is the "recipe" for drawing a square
    public void square() {
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.setColor(200, 0, 0);
        plane.move(111);
        plane.turn(90);
        plane.setColor(0, 200, 0);
        plane.move(111);
        plane.turn(90);
        plane.setColor(0, 0, 200);
        plane.move(111);
        plane.turn(90);
        plane.setColor(77, 66, 55);
        plane.move(111);
        plane.turn(90);
    }

    public void star() {
        for (int x = 0; x < 5; x = x + 1) {
            plane.move(35);
            plane.turn(144);
            plane.move(35);
            plane.turn(72);
        }
    }

    //method for a Christmas Tree drawing
    public void XmasTree() {

        //needles/green part of tree

        //right side of tree
        plane.startingAngle(270);
        plane.setColor(11, 89, 32);
        plane.turn(-120);
        plane.move(75);
        plane.turn(160);
        plane.move(125);
        plane.setColor(11, 89, 32);
        for (int x = 0; x < 4; x = x + 1) {
            plane.turn(200);
            plane.move(75);
            plane.turn(160);
            plane.move(125);
        }

        //moving to prepare for left side of tree
        plane.isTrail = false;
        plane.startingAngle(90);
        plane.move(293);
        plane.startingAngle(180);
        plane.move(76);
        plane.isTrail = true;

        //left side of tree
        plane.startingAngle(270);
        plane.turn(120);
        plane.move(75);
        plane.turn(-160);
        plane.move(125);
        for (int x = 0; x < 4; x = x + 1) {
            plane.turn(-200);
            plane.move(75);
            plane.turn(-160);
            plane.move(125);
        }

        //connects two sides @ bottom of tree
        plane.isTrail = false;
        plane.startingAngle(90);
        plane.move(291);
        plane.startingAngle(180);
        plane.move(76);
        plane.isTrail = true;
        plane.startingAngle(0);
        plane.move(150);

        //trunk
        plane.startingAngle(180);
        plane.move(40);
        plane.startingAngle(90);
        plane.setColor(110, 80, 53);
        plane.move(100);
        plane.turn(-90);
        plane.move(60);
        plane.turn(-90);
        plane.move(100);
        plane.turn(-90);
        plane.move(60);

        //moving to top of tree
        plane.isTrail = false;
        plane.startingAngle(270);
        plane.move(291);
        plane.turn(90);
        plane.move(25);
        plane.isTrail=true;
        plane.setColor(245,221,10);
        star();
        }

    public void XmasPresent() {

        //body of present (no ribbon)
        for (int x=0;x<20;x=x+1) {
            plane.setColor(253, 12, 23);
            plane.startingAngle(0);
            plane.move(100);
            plane.startingAngle(-90);
            plane.move(4);
            plane.startingAngle(180);
            plane.move(100);
        }

        plane.isTrail=false;
        plane.trailWidth=10;
        plane.startingAngle(0);
        plane.move(48);
        plane.isTrail=true;
        plane.setColor(247,201,17);
        plane.turn(270);
        plane.move(95);
        plane.isTrail=false;
        plane.turn(90);
        plane.move(48);
        plane.turn(90);
        plane.move(47);
        plane.turn(90);
        plane.isTrail=true;
        plane.move(100);
        plane.isTrail=false;
        plane.turn(-90);
        plane.move(55);
        plane.turn(-90);
        plane.move(75);
        plane.isTrail=true;
        plane.startingAngle(270);
        plane.move(25);
        plane.turn(90);
        plane.move(20);
        plane.turn(90);
        plane.move(25);
        plane.startingAngle(0);
        plane.move(20);
        plane.isTrail=false;
        plane.startingAngle(180);
        plane.move(25);
        plane.isTrail=true;
        plane.startingAngle(270);
        plane.move(25);
        plane.turn(90);
        plane.move(20);
        plane.turn(90);
        plane.move(25);
        plane.startingAngle(0);
        plane.move(20);
        plane.isTrail=false;
        //plane.move(25);
        plane.trailWidth=5;
        plane.turn(-45);
        plane.isTrail=true;
        plane.move(55);
        plane.isTrail=false;
        plane.turn(180);
        plane.move(50);
        plane.startingAngle(-225);
        plane.isTrail=true;
        plane.move(50);
    }

    public void Skyscrapers3(){

        //building 1
        plane.startingAngle(0);
        plane.setColor(88,103,110);
        plane.move(100);
        plane.turn(90);
        plane.move(275);
        plane.turn(90);
        plane.move(100);
        plane.turn(90);
        plane.move(275);
        plane.isTrail=false;
        plane.turn(90);
        plane.move(100);

        //building 2
        plane.isTrail=true;
        plane.move(100);
        plane.turn(90);
        plane.move(475);
        plane.turn(90);
        plane.move(100);
        plane.turn(90);
        plane.move(475);
        plane.isTrail=false;
        plane.turn(90);
        plane.move(100);

        //building 3
        plane.isTrail=true;
        plane.move(100);
        plane.turn(90);
        plane.move(350);
        plane.turn(90);
        plane.move(100);
        plane.turn(90);
        plane.move(350);
        plane.isTrail=false;
        plane.turn(90);
        plane.move(100);

        //windows on building 3
        plane.turn(90);
        plane.move(15);
        plane.turn(90);
        plane.move(25);
        plane.isTrail=true;
        plane.setColor(195,209,214);
        plane.trailWidth=15;
        for (int x=0;x<7;x=x+1){
            plane.isTrail=true;
            plane.startingAngle(270);
            plane.move(20);
            plane.turn(90);
            plane.move(10);
            plane.turn(90);
            plane.move(20);
            plane.turn(90);
            plane.move(10);
            plane.turn(90);
            plane.isTrail=false;
            plane.move(50);}
        plane.turn(90);
        plane.move(45);
        plane.turn(90);
        plane.move(357);
        for (int x=0;x<7;x=x+1){
            plane.isTrail=true;
            plane.startingAngle(270);
            plane.move(20);
            plane.turn(90);
            plane.move(10);
            plane.turn(90);
            plane.move(20);
            plane.turn(90);
            plane.move(10);
            plane.turn(90);
            plane.isTrail=false;
            plane.move(50);}

        //moving to building 2
        plane.turn(90);
        plane.move(55);
        plane.turn(90);
        plane.move(350);

        //windows for building 2
        for (int x=0;x<9;x=x+1){
            plane.isTrail=true;
            plane.startingAngle(270);
            plane.move(20);
            plane.turn(90);
            plane.move(10);
            plane.turn(90);
            plane.move(20);
            plane.turn(90);
            plane.move(10);
            plane.turn(90);
            plane.isTrail=false;
            plane.move(50);}
        plane.turn(90);
        plane.move(45);
        plane.turn(90);
        plane.move(458);
        for (int x=0;x<9;x=x+1){
            plane.isTrail=true;
            plane.startingAngle(270);
            plane.move(20);
            plane.turn(90);
            plane.move(10);
            plane.turn(90);
            plane.move(20);
            plane.turn(90);
            plane.move(10);
            plane.turn(90);
            plane.isTrail=false;
            plane.move(50);}

        //antenna for building 2
        plane.turn(-90);
        plane.move(20);
        plane.setColor(88,103,110);
        plane.isTrail=true;
        plane.trailWidth=5;
        plane.turn(90);
        plane.move(45);
        plane.turn(180);
        plane.move(5);
        plane.turn(90);
        plane.move(10);
        plane.turn(180);
        plane.move(20);
        plane.turn(180);
        plane.move(9);
        plane.startingAngle(90);
        plane.move(8);
        plane.turn(90);
        plane.move(15);
        plane.turn(180);
        plane.move(30);

        //moving to building 3
        plane.isTrail=false;
        plane.move(30);
        plane.turn(90);
        plane.move(480);
        plane.turn(-90);
        plane.move(29);

        //building 3 windows
        plane.isTrail=true;
        plane.setColor(195,209,214);
        plane.trailWidth=15;
        for (int x=0;x<5;x=x+1){
            plane.isTrail=true;
            plane.startingAngle(270);
            plane.move(20);
            plane.turn(90);
            plane.move(10);
            plane.turn(90);
            plane.move(20);
            plane.turn(90);
            plane.move(10);
            plane.turn(90);
            plane.isTrail=false;
            plane.move(50);}
        plane.turn(90);
        plane.move(45);
        plane.turn(90);
        plane.move(255);
        for (int x=0;x<5;x=x+1){
            plane.isTrail=true;
            plane.startingAngle(270);
            plane.move(20);
            plane.turn(90);
            plane.move(10);
            plane.turn(90);
            plane.move(20);
            plane.turn(90);
            plane.move(10);
            plane.turn(90);
            plane.isTrail=false;
            plane.move(50);}













    }



    }


/*

Methods:
- move(int x)
   move() moves the plane forward by the number of pixels specified in the parameter.
   plane.move(10); moves the plane forward 10 pixels.

- setColor(int r, int g, int b)
   setColor() sets the color of the plane's trail.
   plane.setColor(0, 0, 255); sets the color of the plane's trail to blue.

- startingAngle(int x)
   startingAngle() orients the plane at the angle specified in the parameter.
   plane.startingAngle(0); points the plane to the right.
   
- turn(int x)
   turn() rotates the plane left by the number of degrees specified in the parameter.
   plane.turn(50); will turn the plane left 50 degrees.

Attributes:
- boolean isTrail
   isTrail controls whether or not the plane should leave a trail. It can be true or false.
   plane.isTrail = true; causes the plane to leave a trail.
   
- int trailWidth
   trailWidth controls the width of the trail left by the plane.
   plane.trailWidth = 10; sets the width of the trail to 10.

*/